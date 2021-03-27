

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
        
//        String sub = "OTP Verification Code";
//        String msg = "Hello Sir/Madam,\n\n"
//                    + "Thank you for visiting at my OTP based Java App.\n"
//		+ "Now, you can varify with this OTP\n\n\n"
//		+ "Your OTP : "+555+"\n\n\n"
//		+ "---\n"
//		+ "Regards,\n"
//		+ "Shaikh Afrin (1CR19MCA13)\n"
//		+ "OTP based Java App\n"
//		+ "Email: awesome.afri7991@gmail.com\n"
//		+ "---";				
					
        Mailer.send(to, sub, msg);
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("E-mail has been sent successfully!");
        
	}

}
