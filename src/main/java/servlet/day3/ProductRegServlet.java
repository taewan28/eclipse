package servlet.day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import project.dao.TblProductDao;
import project.vo.ProductVo;

@WebServlet(urlPatterns= {"/ProductReg.cc"}, description="상품 등록")
public class ProductRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger Logger = LoggerFactory.getLogger(RegisterServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/day3/ProductReg.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Logger.info("[MyInfo]고객등록 데이터 저장이 요청되었습니다.");
		
		request.setCharacterEncoding("UTF-8");
		String pcode = request.getParameter("pcode");
		String category = request.getParameter("category");
		String pname = request.getParameter("pname");
		String temp = request.getParameter("price");
		int price = 0;
		if(temp.length() !=0) 
			price = Integer.parseInt(temp);
		

		ProductVo vo = new ProductVo(pcode, category, pname, price);
		Logger.info("\t 입력 값 vo : {}",vo);
		

		TblProductDao dao = new TblProductDao();
		int result = dao.insert(vo);
		
		//response.sendRedirect("Products.cc");
		
		String message = "상품 등록이 완료되었습니다.";
		if(result ==0) {
			message = "상품 등록 오류가 생겼습니다.";
		}
			
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('"+ message +"');");
			out.print("location.href='Products.cc';");
			out.print("</script>");
	}
}
