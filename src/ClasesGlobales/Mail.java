package ClasesGlobales;

import Notificaciones.FrameError;
import Notificaciones.FrameNoWifi;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import puntoventa.FrameInventario;


public class Mail {
    private Properties propiedad;
    private Session session;
    String emailFrom="";
    String password="";
    String emailTo=emailFrom;
    
    //variables del mensaje
    String destinatario, asunto, mensaje;
    FrameInventario JF;
    
    public Mail(FrameInventario JF,String destinatario,String asunto,String mensaje){
        this.destinatario=destinatario;
        this.emailTo=destinatario;
        this.asunto=asunto;
        this.mensaje=mensaje;
    }
    
    public boolean enviar(){
        this.propiedad=new Properties();
        propiedad.put("mail.smtp.host","smtp.gmail.com");
        propiedad.put("mail.smtp.ssl.trust","smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.user", emailFrom);
        propiedad.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        propiedad.setProperty("mail.smtp.auth", "true");
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        session=Session.getDefaultInstance(propiedad);
        
        MimeMessage mail=new MimeMessage(session);
        try{
            mail.setFrom(new InternetAddress(emailFrom));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            mail.setSubject(asunto);
            mail.setText(mensaje,"ISO-8859-1","html");
            
            //hacemos el envio
            Transport transporte=session.getTransport("smtp");
            transporte.connect(emailFrom,password);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            System.out.println("correo enviado");
            return true;
        }catch(AddressException ex){
            System.out.println(ex);
            System.out.println("No es un correo electronico valido");
            new FrameError(JF,"Debes ingresar un correo valido").setVisible(true);
            return false;
        }
        catch(MessagingException ex){
            System.out.println(ex);
            System.out.println("No hay wifi");
            new FrameNoWifi().setVisible(true);
            return false;
        }
        
    }
}
