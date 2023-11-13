/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalms.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class UpdateStatusDoctor {
    public static void updateStatusDoctor() {
        System.out.print("Start update status doctor");
        while (true) {
            Connection Con = null;
            Statement St = null;
            ResultSet rs;
            try {
                // Update status free doctor
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
                St = Con.createStatement();
                Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
                String query = "SELECT * FROM User1.DIAGNOSISTBL WHERE " + 
                        "TIMESTAMP(DAIGEND) < '" + currentTimestamp + "'";
                System.out.println("QueryUpdateStatusFreeDoctor: " + query);
                rs = St.executeQuery(query);
                while (rs.next()) {
                    int docterId = rs.getInt("DOCID");
                    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
                    St = Con.createStatement();
                    St.executeUpdate("UPDATE DOCTORTBL SET DOCSTT = 'Free' WHERE DOCID = " + docterId);
                }
                
                // Update status busy doctor
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
                St = Con.createStatement();
                query = "SELECT * FROM User1.DIAGNOSISTBL WHERE " + 
                        "TIMESTAMP(DAIGSTART) <= '" + currentTimestamp + "' AND " + 
                        "TIMESTAMP(DAIGEND) >= '" + currentTimestamp + "'";
                System.out.println("QueryUpdateStatusBusyDoctor: " + query);
                rs = St.executeQuery(query);
                while (rs.next()) {
                    int docterId = rs.getInt("DOCID");
                    Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
                    St = Con.createStatement();
                    St.executeUpdate("UPDATE DOCTORTBL SET DOCSTT = 'Busy' WHERE DOCID = " + docterId);
                }
                Thread.sleep(15000);
            } catch (Exception ex) {
                Logger.getLogger(UpdateStatusDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    Con.close();
                    St.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UpdateStatusDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
