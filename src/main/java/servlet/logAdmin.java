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

@WebServlet("/logAdmin")
public class logAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public logAdmin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		admin ad = new admin();
		
		ad.setAdminEmail(request.getParameter("adminEmail"));
		ad.setAdminPass(request.getParameter("adminPass"));
		
		adminService adS = new adminService();
		boolean status = adS.validate(ad);
		
		if(status) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminpanel.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminlogin.jsp");
			dispatcher.forward(request, response);
		}
	}

}
