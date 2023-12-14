package sample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>POST Servlet Response</title></head><body>");
        out.println("<h2>POST Servlet Response</h2>");

        String username = request.getParameter("username");
        out.println("<p>Hello, " + username + "!</p>");

        out.println("<p>This is the POST request servlet response.</p>");
        out.println("</body></html>");
    }
}
