import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KataPotterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String libros = request.getParameter("libros");
		KataPotter kp = new KataPotter();
		response.getWriter().println(
				kp.CalcularPrecioSinDescuento(Integer.parseInt(libros)));
	}
}
