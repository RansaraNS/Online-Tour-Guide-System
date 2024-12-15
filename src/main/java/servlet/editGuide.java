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


@WebServlet("/editGuide")
public class editGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public editGuide() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		guide gd = new guide();
		gd.setGuideEmail(request.getParameter("guideEmail"));
		guideService gs = new guideService();
		guide gd1 = gs.editGuide(gd);
		RequestDispatcher displatcher = request.getRequestDispatcher("guideprofile.jsp");
		request.setAttribute("guide", gd1);
		
		displatcher.forward(request, response);
	}

}
