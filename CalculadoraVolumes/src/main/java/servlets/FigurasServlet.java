package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Cubo;
import models.Esfera;

/**
 * Servlet implementation class FigurasServlet
 */
@WebServlet("/FigurasServlet")
public class FigurasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FigurasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double entrada = Double.parseDouble(request.getParameter("entrada"));
		Integer figura = Integer.parseInt(request.getParameter("figura"));
		PrintWriter out = response.getWriter();
		
		if(figura == 1) {
			
			Cubo cubo = new Cubo(entrada);
			out.print("<head><meta charset=\"UTF-8\"></head><div style=\"text-align: center;\"><h1><b> "
					+ "O volume do cubo é " + new DecimalFormat("#.##").format(cubo.calcularVolume()) + " </b></h1></div>");
			
		} else {
			
			Esfera esfera = new Esfera(entrada);
			out.print("<head><meta charset=\"UTF-8\"></head><div style=\"text-align: center;\"><h1><b> "
					+ "O volume da esfera é " + new DecimalFormat("#.##").format(esfera.calcularVolume()) + " </b></h1></div>");
			
		}
		
		
	}

}
