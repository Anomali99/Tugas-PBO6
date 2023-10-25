/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

/**
 *
 * @author fatiq
 */
public class kirim {
    private static String GMail = "fatiqnur@gmail.com";
    private static String pass = "ubwl qrza mcou bihj";
    private static String penerima = "fahmi.fahmos@gmail.com";
    private static String url = "jdbc:postgresql://localhost:5432/PBO";
    private static String user = "postgres";
    private static String pas = "5127";
    
    static String subjek = "Data Santri";
    static String isian = "Berikut adalah data seluruh santri.";

    public static void main(String[] args) {
        Properties pros = new Properties();
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.enable", "true");
        pros.put("mail.smtp.host", "smtp.gmail.com");
        pros.put("mail.smtp.port", "587");
        
        Session ses = Session.getInstance(pros,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(GMail,pass);
            }
        });
        
        try {
            // Menghasilkan laporan JasperReports
            Date tgl = new Date();
            String reportPath = "src/latihan/cetak.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tgl",tgl);
            
            Connection conn = DriverManager.getConnection(url,user,pas);
                    
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath,parameters,conn);
            
            // Mengirim email
            Message mess = new MimeMessage(ses);
            mess.setFrom(new InternetAddress(GMail));
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(penerima));
            mess.setSubject(subjek);
            mess.setText(isian);

            // Membuat lampiran dari laporan JasperReports
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputStream);
            exporter.exportReport();

            DataSource source = new ByteArrayDataSource(outputStream.toByteArray(), "application/pdf");
            MimeBodyPart attachment = new MimeBodyPart();
            attachment.setDataHandler(new DataHandler(source));
            attachment.setFileName("Data santri.pdf"); // Nama lampiran

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(attachment);

            mess.setContent(multipart);

            // Mengirim email dengan lampiran
            Transport.send(mess);
            System.out.println("Email dengan lampiran berhasil dikirim.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
