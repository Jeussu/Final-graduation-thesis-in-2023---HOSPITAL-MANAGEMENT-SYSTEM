package hospitalms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Diagnosis extends javax.swing.JFrame {

    private int doctorID;
    private String doctorName;
    private HomeForm homeForm;

    public Diagnosis() {
        initComponents();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null, Rs1 = null;
    
    public void initData() {
        GetPatient();
        GetDoctor();
        Selectional();
    }

    private void GetPatient() {
        //get data patient form patientdb
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "select * from User1.PATIENTTBL ";
            if (Login.isDoctor && doctorName != null) {
                query += "WHERE DOCAPT = '" + doctorName + "'";
            }
            Rs = St.executeQuery(query);
            while (Rs.next()) {
                String Mypatid = Rs.getString("PATID");
                PatId.addItem(Mypatid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GetDoctor() {
        //get data doctor form doctorDB
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "select * from User1.DOCTORTBL ";
            if (Login.isDoctor && doctorID > 0) {
                query += "WHERE DOCID = " + doctorID;
            }
            Rs = St.executeQuery(query);
            while (Rs.next()) {
                String Mydocid = Rs.getString("DOCID");
                DocId.addItem(Mydocid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void FetchName() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "select * from User1.PATIENTTBL where PATID=" + PatId.getSelectedItem().toString() + "";
            
            Rs1 = St.executeQuery(query);
            while (Rs1.next()) {
                String Mypatname = Rs1.getString("PATNAME");
                PatName.setText(Mypatname);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//query and get data from PATTBL DB

    private void FetchName2() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "select * from User1.DOCTORTBL where DOCID=" + DocId.getSelectedItem().toString() + "";

            Rs1 = St.executeQuery(query);
            while (Rs1.next()) {
                String Mydocname = Rs1.getString("DOCNAME");//get data from column and row of DOCNAME
                DocName.setText(Mydocname);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//query and get data from DOCTBL DB

    private void Selectional() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from User1.DIAGNOSISTBL WHERE DOCID = " + doctorID);
            DiagnosisTable.setModel(DbUtils.resultSetToTableModel(Rs));// get all data from db put the table
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DiagnosisTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DiagId = new javax.swing.JTextField();
        PatMed = new javax.swing.JTextField();
        PatName = new javax.swing.JTextField();
        PatSymptom = new javax.swing.JTextField();
        PatDiag = new javax.swing.JTextField();
        PatId = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatSummary = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        DocId = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        DocName = new javax.swing.JTextField();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("DIAGNOSIS INFORMATION");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        UpdateBtn.setBackground(new java.awt.Color(0, 51, 51));
        UpdateBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 231, 94, 32));

        jButton4.setBackground(new java.awt.Color(0, 51, 51));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PRINT");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 300, 102, 32));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DIAGNOSIS LIST");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(436, 436, 436))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 339, 980, -1));

        DiagnosisTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DiagnosisTable.setForeground(new java.awt.Color(0, 51, 51));
        DiagnosisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DiagId", "PatientId", "PatientName", "Symptoms", "Diagnosis", "Medicines", "DocId", "DocName"
            }
        ));
        DiagnosisTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DiagnosisTable.setRowHeight(32);
        DiagnosisTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        DiagnosisTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiagnosisTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DiagnosisTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 415, 975, 175));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("HOME");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 596, 104, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("PATID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("PATNAME");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("SYMPTOMS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 49, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("DIAGNOSIS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("MEDICINES");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        DiagId.setEditable(false);
        DiagId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(DiagId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 144, 31));

        PatMed.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 144, 31));

        PatName.setEditable(false);
        PatName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 144, 31));

        PatSymptom.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatSymptom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 144, 31));

        PatDiag.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatDiag, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 144, 31));

        PatId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatIdActionPerformed(evt);
            }
        });
        jPanel2.add(PatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 142, 32));

        PatSummary.setColumns(20);
        PatSummary.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PatSummary.setForeground(new java.awt.Color(255, 0, 51));
        PatSummary.setRows(5);
        PatSummary.setText("          =============PATIENT SUMMARY==============");
        jScrollPane2.setViewportView(PatSummary);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 47, 406, 216));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 629, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("DocID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        DocId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocIdActionPerformed(evt);
            }
        });
        jPanel2.add(DocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 142, 32));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("DOCNAME");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        DocName.setEditable(false);
        DocName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(DocName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 144, 31));
        jPanel2.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, 155, 29));

        searchBtn.setBackground(new java.awt.Color(0, 51, 51));
        searchBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 300, 94, 33));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DOCTOR");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DIAGNOSIS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(238, 238, 238)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(485, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(364, 364, 364)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(13, 13, 13)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatIdActionPerformed
        FetchName();
    }//GEN-LAST:event_PatIdActionPerformed

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if (DiagId.getText().isEmpty() || PatName.getText().isEmpty() || PatSymptom.getText().isEmpty() || PatDiag.getText().isEmpty() || PatMed.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");

            String query = "UPDATE USER1.DIAGNOSISTBL "
                    + "SET PATID = " + PatId.getSelectedItem()
                    + ", PATNAME = '" + PatName.getText()
                    + "', SYMPTOMS = '" + PatSymptom.getText()
                    + "', DIAGNOSIS = '" + PatDiag.getText()
                    + "', MEDICINES = '" + PatMed.getText()
                    + "', DOCID = " + DocId.getSelectedItem()
                    + " , DOCNAME = '" + DocName.getText() + "'"
                    + " WHERE DAIGID = "
                    + DiagId.getText();

            Statement Add = Con.createStatement();
            Add.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Diagnosis update Successfully");
            Con.close();
            Selectional();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DiagnosisTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiagnosisTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) DiagnosisTable.getModel();
        int Myindex = DiagnosisTable.getSelectedRow();
        DiagId.setText(model.getValueAt(Myindex, 0).toString());
        PatId.setSelectedItem(model.getValueAt(Myindex, 1).toString());
        PatName.setText(model.getValueAt(Myindex, 2).toString());
        PatSymptom.setText(model.getValueAt(Myindex, 3).toString());
        PatDiag.setText(model.getValueAt(Myindex, 4).toString());
        PatMed.setText(model.getValueAt(Myindex, 5).toString());
        DocId.setSelectedItem(model.getValueAt(Myindex, 6).toString());
        DocName.setText(model.getValueAt(Myindex, 7).toString());
        //load diagnosis
        String Patname = model.getValueAt(Myindex, 2).toString();
        String Symptoms = model.getValueAt(Myindex, 3).toString();
        String Diagnosis = model.getValueAt(Myindex, 4).toString();
        String medi = model.getValueAt(Myindex, 5).toString();
        PatSummary.setText(PatSummary.getText() + "\n\n" + "        Patient Name:" + Patname + "     " + "Symptoms:" + Symptoms + "\n\n\n\n        Diagnosis:" + Diagnosis + "    Medicines:" + medi + "\n\n\n\tCodeSpaceHospital");

    }//GEN-LAST:event_DiagnosisTableMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            PatSummary.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        homeForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void DocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocIdActionPerformed
        FetchName2();
    }//GEN-LAST:event_DocIdActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        try {
            //search patient by ID
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from User1.DIAGNOSISTBL WHERE PATID = " + searchTxt.getText());
            DiagnosisTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiagId;
    private javax.swing.JTable DiagnosisTable;
    private javax.swing.JComboBox DocId;
    private javax.swing.JTextField DocName;
    private javax.swing.JTextField PatDiag;
    private javax.swing.JComboBox PatId;
    private javax.swing.JTextField PatMed;
    private javax.swing.JTextField PatName;
    private javax.swing.JTextArea PatSummary;
    private javax.swing.JTextField PatSymptom;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables

    void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    void setHomeForm(HomeForm homeForm) {
        this.homeForm = homeForm;
    }
}
