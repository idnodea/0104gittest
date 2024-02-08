package util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;
import java.util.Map;
import java.net.URLEncoder; 
import java.net.URLDecoder; 
import java.io.IOException; 

public class Cookies {
    
    // 쿠키를 이름을 기준으로 매핑하기 위한 Map 객체
    private Map<String, Cookie> cookieMap =
    	
            new java.util.HashMap<String, Cookie>();
   
    // 생성자: HttpServletRequest를 받아서 쿠키를 추출하여 Map에 저장
    public Cookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0 ; i < cookies.length ; i++) {
                cookieMap.put(cookies[i].getName(), cookies[i]);
            }
        }
    }

    // 지정된 이름의 쿠키를 반환
    public Cookie getCookie(String name) {
        return cookieMap.get(name);
    }
    
    // 지정된 이름의 쿠키 값을 디코딩하여 반환
    public String getValue(String name) throws IOException {
        Cookie cookie = cookieMap.get(name);
        if (cookie == null) {
            return null;
        }
        return URLDecoder.decode(cookie.getValue(), "utf-8");
    }

    // 지정된 이름의 쿠키가 존재하는지 여부를 반환
    public boolean exists(String name) {
        return cookieMap.get(name) != null;
    }

    // 주어진 이름과 값으로 새로운 쿠키를 생성하여 반환
    public static Cookie createCookie(String name, String value)
    throws IOException {
        return new Cookie(name, URLEncoder.encode(value, "utf-8"));
    }

    // 경로(path)와 최대 수명(maxAge)을 지정하여 새로운 쿠키를 생성하여 반환
    public static Cookie createCookie(String name, String value, String path, 
        int maxAge) throws IOException {
        Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
        cookie.setPath(path);
        cookie.setMaxAge(maxAge);
        return cookie;
    }
    
    // 도메인(domain), 경로(path), 최대 수명(maxAge)을 지정하여 새로운 쿠키를 생성하여 반환
    public static Cookie createCookie(String name, String value, String domain,
            String path, int maxAge) throws IOException {
        Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
        cookie.setDomain(domain);
        cookie.setPath(path);
        cookie.setMaxAge(maxAge);
        return cookie;
    }

}