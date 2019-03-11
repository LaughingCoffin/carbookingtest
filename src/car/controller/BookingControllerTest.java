package car.controller;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

public class BookingControllerTest extends Mockito {

	@Test
	public void testBookingControllerCarSelectionMethod() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
	     HttpServletResponse response = mock(HttpServletResponse.class);    

	     when(request.getParameter("car")).thenReturn("nexa");
	     
	     StringWriter stringWriter = new StringWriter();
	        PrintWriter writer = new PrintWriter(stringWriter);
	        when(response.getWriter()).thenReturn(writer);
	        
	        new BookingController().doGet(request, response);
	        //Test case 1 : verifying get Parameter "car" was at least getting called once in actual function 
	        verify(request, atLeast(1)).getParameter("car");
	     
	     
		//doThrow(IOException.class).when(response).sendRedirect("Error.jsp");
	        
	    //verifying that goGet (CarSelection) method returned BookingSuccess.jsp with car non numm value 
		verify(response).sendRedirect("BookingSuccess.jsp");
		
		//now setting car parameter to null  , then goGet (CarSelection) method should return  Error.jsp
		when(request.getParameter("car")).thenReturn(null);
		new BookingController().doGet(request, response);
		verify(response).sendRedirect("Error.jsp");
		
	}
	
	@Test
	public void testBookingControllerDateSelectionMethod() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
	     HttpServletResponse response = mock(HttpServletResponse.class);    

	     when(request.getParameter("start")).thenReturn("11-02-2019");
	     when(request.getParameter("end")).thenReturn("17-02-2019");
	     StringWriter stringWriter = new StringWriter();
	        PrintWriter writer = new PrintWriter(stringWriter);
	        when(response.getWriter()).thenReturn(writer);
	        
	        new BookingController().doPost(request, response);
	        //Test case 1 : verifying get Parameter "start" was at least getting called once in actual function 
	        
	        verify(request, atLeast(1)).getParameter("start");
	        
	      //Test case 1 : verifying get Parameter "end" was at least getting called once in actual function 
	        verify(request, atLeast(1)).getParameter("end");
	     
	     
		//doThrow(IOException.class).when(response).sendRedirect("Error.jsp");
	        
	    //verifying that goPost (DateSelection) method returned BookingSuccess.jsp with car non null value 
		verify(response).sendRedirect("CarSelection.jsp");
		
		//now setting start parameter to null  , then goPost (DateSelection) method should return Error.jsp , since start is Mandatory
		when(request.getParameter("start")).thenReturn(null);
		new BookingController().doPost(request, response);
		verify(response).sendRedirect("Error.jsp");
		
	
	}
    
	

}
