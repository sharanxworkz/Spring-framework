package manojhj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2, urlPatterns = "/m")
public class Manoj extends HttpServlet {
	
public Manoj() {
	System.out.println("Manoj object created");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("method");
resp.setContentType("text/html");
PrintWriter writer = resp.getWriter();
writer.append("<html>").append("<body>").append("<h1>")
.append("response is invoked").append("</h1>").append("</body>").append("</html>");
}
}
