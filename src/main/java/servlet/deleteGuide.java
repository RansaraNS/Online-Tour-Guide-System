package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.guide;
import services.guideService;


@WebServlet("/deleteGuide")
public class deleteGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteGuide() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		guide gd = new guide();
		gd.setGuideEmail(request.getParameter("guideEmail"));
		guideService gdS = new guideService();
		gdS.deleteGuide(gd);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewGuide");
		dispatcher.forward(request, response);
	}

}
