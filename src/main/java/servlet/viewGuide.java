package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.guide;
import services.guideService;

@WebServlet("/viewGuide")
public class viewGuide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public viewGuide() {
        super();
        
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		guideService gs = new guideService();
		ArrayList<guide> listGud = gs.getAllGuide();
		request.setAttribute("guideTable", listGud);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("guidetable.jsp");
		dispatcher.forward(request, response);
	}

}
