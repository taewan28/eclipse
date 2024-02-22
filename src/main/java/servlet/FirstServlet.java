package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;



//서블릿이 되기 위한 몇가지(추후 정리)
// URL 이 필요합니다.
@WebServlet(urlPatterns= {"/first.cc"}, name="/first.cc")
public class FirstServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private static final Logger Logger = LoggerFactory.getLogger(FirstServlet.class); 
	
	public FirstServlet() {
		super();
	}
	
	//Get 요청을 처리하는 메소드 - 인자 타입 2개 xxxRequest, xxxResponse
	//						요청과 응답에 대한 처리를 할 수 있습니다.
	//사용자 요청을 request 객체에 저장하면서 동시에 응답을 전달할 객체 response 가 만들어집니다.
	
	
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    //사용자 요청에 대한 정보 출력 (request 객체의 속성값) : 로그 출력에서 {}는 결과값 표시
    Logger.info("\n[MyInfo]: request URL : {}, URL : {}, 컨텍스트패스 : {} ",
    		request.getRequestURL(),request.getRequestURI(),request.getContextPath());
    
    
    //테스트 : 서블릿에서 html 출력 응답도 만들어 봅니다.
    // out 은 jsp는 내장객체(선언없이 사용), 서블릿은 직접 생성(response 객체로 생성합니다)
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.print("<html>");
    out.print("<head><title>WELCOME</title></head>");
    out.print("<body><h2>Hello World!!</h2>");
    out.print("현재 날짜와 시간 : " + LocalDateTime.now());
    out.print("</body>");
    out.print("</html>");
    
 }

}

