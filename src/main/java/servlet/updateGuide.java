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


@WebServlet("/updateGuide")
public class updateGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public updateGuide() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		guide gd = new guide();
		gd.setGuideName(request.getParameter("guideName"));
		gd.setGuideContact(Integer.parseInt(request.getParameter("guideContact")));
		gd.setGuideEmail(request.getParameter("guideEmail"));
		gd.setGuidePass(request.getParameter("guidePass"));
		guideService gs = new guideService();
		gs.updateGuide(gd);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("editGuide");
		dispatcher.forward(request, response);
	}

}
