package bag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/b")
public class Bag extends HttpServlet {
	public Bag() {
		System.out.println("bag object is created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("bag service object is created");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>").append("<body>").append("<h1>").append("saran giving response to server")
				.append("</h1>").append("</body>").append("</html>");
	}
}
