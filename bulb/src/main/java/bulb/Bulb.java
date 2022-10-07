package bulb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BulbDTO;
@WebServlet(loadOnStartup = 1,urlPatterns = "/sha")
public class Bulb extends HttpServlet {
	private List<BulbDTO> list=new ArrayList<BulbDTO>();
	
	public Bulb() {
		System.out.println("bulb object is created");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("bulb service object created");
		resp.setContentType("text/html");
		
	String name	=req.getParameter("personName");
	String email	=req.getParameter("personEmail");
	
	System.out.println(name);
	System.out.println(email);
	
		
		
		PrintWriter writer = resp.getWriter();
		writer.append("</html>")
		.append("<body>")
		.append("<h1>").
		append("bulb method invoked").
		append("</h1>")
		.append("<br>")
		.append("name").append(name)
		.append("<br>")
		.append("email").append(email)
		.append("</body>")
		.append("</html>");
		
		BulbDTO bulbDTO=new BulbDTO(name, email);
	
		boolean add = list.add(bulbDTO);
		System.out.println(add);
		
	}
	

}
