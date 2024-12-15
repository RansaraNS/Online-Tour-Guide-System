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

@WebServlet("/addGuide")
public class addGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addGuide() {
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
		
		guideService gdS = new guideService();
		gdS.regGuide(gd);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("guideregister.jsp");
		dispatcher.forward(request, response);
	}

}
