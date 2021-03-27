

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SendMail")
public class SendMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SendMail() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String to= "";
        String sub = req.getParameter("subject");
        String msg = req.getParameter("msg");			
					
        Mailer.send(to, sub, msg);
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("E-mail has been sent successfully!");
        
	}

}
