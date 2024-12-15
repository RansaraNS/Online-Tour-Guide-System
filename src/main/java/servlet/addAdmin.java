package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.admin;
import services.adminService;

@WebServlet("/addAdmin")
public class addAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public addAdmin() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		admin ad = new admin();
		

		ad.setAdminName(request.getParameter("adminName"));
		ad.setAdminContact(Integer.parseInt(request.getParameter("adminContact")));
		ad.setAdminEmail(request.getParameter("adminEmail"));
		ad.setAdminPass(request.getParameter("adminPass"));
		
		
		adminService adS = new adminService();
		adS.regAdmin(ad);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminregister.jsp");
		dispatcher.forward(request, response);
	}

}
