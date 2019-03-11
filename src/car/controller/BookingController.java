package car.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.util.calendar.BaseCalendar.Date;

/**
 * Servlet implementation class BookingController
 */
@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       //method to book a car
		String carName=request.getParameter("car");
		if(carName == null || carName.isEmpty()){
			response.sendRedirect("Error.jsp");
		}
		else{
			response.sendRedirect("BookingSuccess.jsp");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//method to select booking date
		String startDate =request.getParameter("start");
		String endDate = request.getParameter("end");
		if (startDate == null ||  startDate.isEmpty()) {
			response.sendRedirect("Error.jsp");
		}
		response.sendRedirect("CarSelection.jsp");

	
	}

}
