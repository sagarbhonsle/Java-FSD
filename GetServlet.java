package sample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("GET Servlet Response");
        out.println("<h2>GET Servlet Response</h2>");

        String username = request.getParameter("username");
        out.println("<p>Hello, " + username + "!</p>");

        out.println("<p>This is the GET request servlet response.</p>");
        out.println("</body></html>");
    }
}
