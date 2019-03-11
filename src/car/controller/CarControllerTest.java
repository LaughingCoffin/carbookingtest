/**
 * 
 */
package car.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author abcd
 *
 */
public class CarControllerTest extends Mockito{
	
	 

	@Test
	public void testCarControllerLoginMethod() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
	     HttpServletResponse response = mock(HttpServletResponse.class);    

	     when(request.getParameter("name")).thenReturn("admin");
	     when(request.getParameter("password")).thenReturn("password");
	     StringWriter stringWriter = new StringWriter();
	        PrintWriter writer = new PrintWriter(stringWriter);
	        when(response.getWriter()).thenReturn(writer);
	        
	        new CarController().doPost(request, response);
	        //Test case 1 : verifying username was at least getting called once in actual function 
	        verify(request, atLeast(1)).getParameter("name");
	      //Test Case 2 : verifying password was at least getting called once in actual function
	        verify(request, atLeast(1)).getParameter("password");
	     
		//doThrow(IOException.class).when(response).sendRedirect("Error.jsp");
	        
	    //verifying that doPost method returned Booking.jsp with name=admin and password=password    
		verify(response).sendRedirect("Booking.jsp");
		
		//now setting wring password , then doPost method should return 
		when(request.getParameter("password")).thenReturn("passssssword");
		new CarController().doPost(request, response);
		verify(response).sendRedirect("Error.jsp");
		
	}

	
	@Test
	public void testCarControllerSignUpMethod() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);       
	     HttpServletResponse response = mock(HttpServletResponse.class);    

	     when(request.getParameter("name")).thenReturn("admin");
	     when(request.getParameter("email")).thenReturn("a@b.com");
	     when(request.getParameter("password")).thenReturn("password");
	     StringWriter stringWriter = new StringWriter();
	        PrintWriter writer = new PrintWriter(stringWriter);
	        when(response.getWriter()).thenReturn(writer);
	        
	        new CarController().doGet(request, response);
	        //Test case 1 : verifying username was at least getting called once in actual function 
	        verify(request, atLeast(1)).getParameter("name");
	      //Test case 2 : verifying email was at least getting called once in actual function 
	        verify(request, atLeast(1)).getParameter("email");
	      //Test Case 3 : verifying password was at least getting called once in actual function
	        verify(request, atLeast(1)).getParameter("password");
	     
		//doThrow(IOException.class).when(response).sendRedirect("Error.jsp");
	        
	    //verifying that doPost method returned Booking.jsp with name=admin and password=password    
		verify(response).sendRedirect("SignUpSuccess.jsp");
		
		//now setting  password to null, then doPost method should return , since all field are mandatory 
		when(request.getParameter("password")).thenReturn(null);
		new CarController().doGet(request, response);
		verify(response).sendRedirect("Error.jsp");
		
		
	}
	
	
}
