package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import dto.Board;

/**
 * Servlet implementation class DispatcherServlet
 */
//@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		//원래의 기능을 삭제 +프로세스 호출추가
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//원래의 기능을 삭제 +프로세스 호출추가
		process(request, response);
	}
	
	//신규메서드 ,두겟 두포스트의 기능. 매개변수는 동일
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("uri:" +uri);
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println("path: "+path);
		if(path.equals("/view.do")) {
			System.out.println("view 처리");
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDao bDao = BoardDao.getInstance();
			Board board = bDao.selectOne(num, true);
			
			// 글 제목과 내용이 웹 페이지에 올바르게 출력되도록 
		    // 공백과 줄 바꿈 처리
		    String title   = board.getTitle().replace(" ", "&nbsp;");
		    board.setTitle(title);
		    String content = board.getContent().replace(" ", "&nbsp;").replace("\n", "<br>");
			board.setContent(content);
		    //글데이터를 변수에 저장
			
			request.setAttribute("bd", board);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/view.jsp");
			dispatcher.forward(request, response);
			
		}else if(path.equals("/list.do")) {
			System.out.println("list 처리");
		}
	}
	
}
