package com.temperature.alert.api.notification;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    private static String USER_NAME = "gamagepeshaladush";
    //  GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "dush123@"; // GMail password
    private static String RECIPIENT = "pdushyanthika@gmail.com"; //receiver password

    public static void sentMail( String bodyData) {
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = { RECIPIENT }; // list of recipient email addresses
        String subject = "Wether app threshold alert warning";  //Put the email subject
        String body = bodyData; //Put email body
        sendFromGMail(from, pass, to, subject, body);


        System.out.println("\t"+subject);
        System.out.println("----");
        System.out.println("\t"+bodyData);
    }

    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.smtp.ssl.trust", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {

            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            for( int i = 0; i < to.length; i++   ) {
                toAddress[i] = new InternetAddress(to[i]);
            }
            for (InternetAddress address : toAddress) {
                message.addRecipient(Message.RecipientType.TO, address);
            }

            message.setSubject(subject);
            message.setText(body);

            Transport transport = session.getTransport("smtp");

            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

        }
        catch (MessagingException ae) {
            ae.printStackTrace();
        }








    }
}
