package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿이 되기 위한 몇가지(추후 정리)
// URL 이 필요합니다.
//@Webservlet(urlPatterns= {"/first.cc"}, name="/first.cc")
public class FirstServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public FirstServlet() {
		super();
	}
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doGet(req, resp);
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
