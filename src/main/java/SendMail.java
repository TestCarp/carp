import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void getSendEmail(String toUserMessage,String email){
        // Recipient's email ID needs to be mentioned.
        String to = email;

        // Sender's email ID needs to be mentioned
        String from = "groupgroup060@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host",host);
        System.out.println(111111);
        properties.put("mail.smtp.port","465");
        System.out.println(222222);
        properties.put("mail.smtp.ssl.enable","true");
        System.out.println(333333);
        properties.put("mail.smtp.auth","true");
        System.out.println(444444);
        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                // xfkaufcrlbyfjpri
                return new PasswordAuthentication("groupgroup060@gmail.com", "nseewneyladintsu");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try

        {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            System.out.println(555555);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            System.out.println(111111);

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            System.out.println(222222);
            // Set Subject: header field
            message.setSubject("Your Order Status!!");

            // Now set the actual message
            message.setText("Your Order Status is : \n "+toUserMessage);

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch(MessagingException mex)

        {
            mex.printStackTrace();
        }

    }


}
