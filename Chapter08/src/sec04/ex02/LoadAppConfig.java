package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
																// loadOnStartup 속성 추가.
																// 우선 순위 1로 설정.
@WebServlet(name = "loadConfig", urlPatterns = { "/loadConfig" }, loadOnStartup=1)
public class LoadAppConfig extends HttpServlet {
	// 변수 context를 멤버 변수로 선언.
	private ServletContext context;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoadAppConfig의 init 메서드 호출");
		
		// init() 메서드에서 ServletContext 객체 얻음.
		context = config.getServletContext();
		
		// getInitParameter() 메서드로 web.xml의 메뉴 정보를 읽어 옴.
		String menu_member = context.getInitParameter("menu_member");
		String menu_order = context.getInitParameter("menu_order");
		String menu_goods = context.getInitParameter("menu_goods");
		
		// 메뉴 정보를 ServletContext 객체에 바인딩 함.
		context.setAttribute("menu_member", menu_member);
		context.setAttribute("menu_order", menu_order);
		context.setAttribute("menu_goods", menu_goods);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 브라우저에서 요청 시 ServletContext 객체의 바인딩된 메뉴 항목을 가져 옴.
		String menu_member = (String)context.getAttribute("menu_member");
		String menu_order = (String)context.getAttribute("menu_order");
		String menu_goods = (String)context.getAttribute("menu_goods");

		out.print("<html><body>");
		out.print("<table border=1 cellspacing=0><tr>메뉴 이름</tr>");
		out.print("<tr><td>" + menu_member + "</td></tr>");
		out.print("<tr><td>" + menu_order + "</td></tr>");
		out.print("<tr><td>" + menu_goods + "</td></tr>");
		out.print("</tr></table></body></html>");
	}
}
