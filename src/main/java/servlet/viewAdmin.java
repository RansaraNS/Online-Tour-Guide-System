package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.admin;
import services.adminService;

@WebServlet("/viewAdmin")
public class viewAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public viewAdmin() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adminService as = new adminService();
		ArrayList<admin> listAdd = as.getAllAdmin();
		request.setAttribute("adminTable", listAdd);
		doGet(request, response);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("admintable.jsp");
		dispatcher.forward(request, response);
	}

}
