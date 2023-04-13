package sec03.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login3")
public class SessionTest4 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// getSession()을 호출하여 최초 요청 시 세션 객체를 새로 생성하거나 기존 세션을 반환.
		HttpSession session = request.getSession();
		
		// 로그인 창에서 입력한 아이디와 패스워드 가져오기.
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		// 최초 요청 시 수행.
		if (session.isNew()){
			if(user_id != null){   // 로그인 창에서 서블릿으로 요청한 아이디가 null이 아니면 
				session.setAttribute("user_id", user_id);      // 세션에 아이디 값 바인딩.
				out.println("<a href='login3'>로그인 상태 확인</a>");
			}else { // 요청한 아이디가 null 이면 다시 로그인하고, 세션을 삭제한다.
				out.print("<a href='login3.html'>다시 로그인 하세요!!</a>");
				session.invalidate();
			}
		}else{  // 재요청을 하면 세션에서 아이디 값을 가져와 확인한다.(이전에 로그인 한 기록이 있는지)
			user_id = (String) session.getAttribute("user_id");
			if (user_id != null && user_id.length() != 0) {
				out.print("안녕하세요 " + user_id + "님!!!");
			} else {
				out.print("<a href='login3.html'>다시 로그인 하세요!!</a>");
				session.invalidate();   // 세션을 삭제한다.
			}
		}
	}
}
