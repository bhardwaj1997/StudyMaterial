package AutomateJavaThings;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSend {

  public static void send(String from , String password , String to , String sub,String msg){
    Properties properties = new Properties();
    properties.put("mail.smtp.host","smtp.gmail.com");
    properties.put("mail.smtp.socketFactory.port" , "465");
    properties.put("mail.smtp.socketFactory.class" , "javax.net.ssl.SSLSocketFactory");
    properties.put("mail.smtp.auth","true");
    properties.put("mail.smtp.port" , "475");

    Session session = Session.getDefaultInstance(properties,
        new Authenticator() {
          @Override
          protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("kuldeepbhardwaj755@gmail.com", "0921@Kuldeep");
          }
        });
    //compose message

    try{
      MimeMessage message = new MimeMessage(session);
      message.addRecipients(RecipientType.TO, String.valueOf(new InternetAddress(to)));
      message.setSubject(sub);
      message.setText(msg);

      //send msg
      Transport.send(message);
      System.out.println("Message Send");
    } catch (AddressException e) {
      e.printStackTrace();
    } catch (MessagingException e) {
      e.printStackTrace();
    }
  }
  public static void main(String[] args) {

    //EmailSend.send("kuldeepbhardwaj755@gmail.com","")
  }
}
