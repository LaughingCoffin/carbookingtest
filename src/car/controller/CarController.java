package car.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarController
 */
@WebServlet("/CarController")
public class CarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CarController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//method for sign up 
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	
	if(name == null || name.isEmpty()|| email == null || email.isEmpty()|| password == null || password.isEmpty()){
		response.sendRedirect("Error.jsp");
	}
	else{
		response.sendRedirect("SignUpSuccess.jsp");
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//method for log in
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	if(name.equals("admin") && password.equals("password") ){
		
		response.sendRedirect("Booking.jsp");
		return;
	}
	else{
		response.sendRedirect("Error.jsp");
	}
	
	}

}
