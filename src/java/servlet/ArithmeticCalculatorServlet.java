package servlet;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Tyler
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("startVar", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String last = request.getParameter("last");
        Integer result = 0;
        String message;
        Integer one;
        Integer two;
        
        request.setAttribute("firstVar", first);
        request.setAttribute("lastVar", last);
        
        if(first == null || first.equals("") || last == null || last.equals("") || first.matches("[a-zA-Z]+") || last.matches("[a-zA-Z]+")) {
   
            request.setAttribute("startVar", "invalid");
           
        }else {
            one = Integer.parseInt(first);
            two = Integer.parseInt(last);
            
            if (request.getParameter("add") != null) {
            result = one + two;
            } else if (request.getParameter("sub") != null) {
            result = one - two;
            } else if (request.getParameter("mult") != null) {
            result = one * two;
            } else if (request.getParameter("mod") != null) {
            result = one % two;
            }
        message = Integer.toString(result);
        request.setAttribute("startVar", message);
        }
        
        
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
        
        
    }

  

}

