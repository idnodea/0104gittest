package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;

import java.util.HashMap;
import java.util.Map;
import java.net.URLEncoder; 
import java.net.URLDecoder; 
import java.io.IOException; 

public class Cookies {
	
	 // 쿠키를 이름을 기준으로 매핑하기 위한 Map 객체
    private Map<String, Cookie> cookieMap =
    		new HashMap<>();
    
//    private Map<String, Cookie> cookieMap =new java.util.HashMap<String, Cookie>();
   
    // 생성자: HttpServletRequest를 받아서 쿠키를 추출하여 Map에 저장
    public Cookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
//            for (int i = 0 ; i < cookies.length ; i++) {
        	for(Cookie ck : cookies) {       		
//                cookieMap.put(cookies[i].getName(), cookies[i]);
        		cookieMap.put(ck.getName(), ck);
        	}
        }
    }

    // 지정된 이름의 쿠키를 반환
    public Cookie getCookie(String name) {
        return cookieMap.get(name);
    }
	
	public String getValue(String name) throws IOException {
		Cookie cookie = cookieMap.get(name);
		if (cookie == null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(), "utf-8");
	}

	public boolean exists(String name) {
		return cookieMap.get(name) != null;
	}

	public static Cookie createCookie(String name, String value)
	throws IOException {
		return new Cookie(name, URLEncoder.encode(value, "utf-8"));
	}

	public static Cookie createCookie(String name, String value, String path, 
		int maxAge) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
	
	public static Cookie createCookie(String name, String value, String domain,
			String path, int maxAge) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		cookie.setDomain(domain);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}

}
