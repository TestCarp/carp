import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class controlClass {

    public static void main(String[] args){
        // Email Sender Code

        // Recipient's email ID needs to be mentioned.
        String to = "groupgroup060@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "abood.shooli.2016@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("fromaddress@gmail.com", "*******");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setText("This is actual message");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }





        ////////////////////////////////////////////////////////////// End code of Send Email




        Worker w1 = new Worker();
        Admin a = new Admin();
        product p1 = new product(1,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
        product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);

        w1.addProduct(p1);
        Customer c1 = new Customer(1,"Abdullah Ghassan Sholi" , "0592659066" , "Asira-Nablus" , "groupgroup060@gmail.com",200,100);
        Customer c2 = new Customer(2,"Ali Nabeel Hamadneh" , "0568347481" , "Asira-Nablus" , "khaled.sholi2@gmail.com",100,500);
        w1.addCustomer(c1);
        w1.addCustomer(c2);
        w1.generateStatistics();

        /////////////////////////////////////////////

        // System.out.println(w1.getNumberOfProducts());
        // product p2 = new product(2,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
        product p3 = new product(3,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,1);
        product p4 = new product(4,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,2);
        product p5 = new product(5,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,false,3);
        product p6 = new product(6,"Tufted Carpets","https://persiancarpet.com/images/making-a-tufted-rug.jpg","400X300",99.99,true,1);
        w1.addProduct(p2);
        w1.addProduct(p3);
        w1.addProduct(p4);
        w1.addProduct(p5);
        w1.addProduct(p6);
        a.addWorker(w1);
        a.distributeWorkerOnProducts(w1.getNumberOfProducts());


        ////////////////////////////

        // enter id for product to check status
        // product status --- >  1 == complete
        //                       2 == treatment
        //                       3 == waiting
        w1.trackOrder(3);

        //////////////////////////////////
        System.out.println("----------------");
        w1.printDiscount(1);
        System.out.println("----------------");
        w1.generateInvoice(1,1);

        w1.orderStatus(1,2,"khaled.sholi2@gmail.com");




    }
}
