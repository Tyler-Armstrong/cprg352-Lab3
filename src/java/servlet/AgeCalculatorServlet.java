
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            Integer number;
            String date = request.getParameter("your_age");
            request.setAttribute("Date", date);
            
            if (date == null || date.equals("")) {
                request.setAttribute("message", "You must give your current age");
                
            }
            else if (date.matches("[a-zA-Z]+") ) {
                request.setAttribute("message", "You must enter a number");
           
            } else {
                
                number = Integer.parseInt(date);
                number++;
                date = Integer.toString(number);
                date = "Your age next birthday " + date;
                request.setAttribute("message", date);
                
            }
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
            
    }

    

}
