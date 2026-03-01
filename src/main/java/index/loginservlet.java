package index;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")


    public  class loginservlet extends  HttpServlet{
    @Override
        public  void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {


            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<h2>Login Pages </h2>");
            out.println("<form action='login' method='post'>");
            out.println("Enter Name ;<input type='text' name = 'username' required>" );
            out.println("<input type='submit' value='login'>");
            out.println("</form>");
    }
    protected void doPost(HttpServletRequest request ,HttpServletResponse response)
        throws ServletException,IOException{
        String name = request.getParameter("username");

                HttpSession session = request.getSession();
                session.setAttribute("user",name);

                response.sendRedirect("Welcome");

    }
}
