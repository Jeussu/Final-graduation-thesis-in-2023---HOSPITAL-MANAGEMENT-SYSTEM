/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DoctorModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afwadmin
 */
public class Patient extends javax.swing.JFrame {

    private String doctorName;
    private HomeForm homeForm;

    /**
     * Creates new form Patient
     */
    public Patient() {
        initComponents();
    }
    private int nextIndex = 1;
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    private ArrayList<DoctorModel> doctors = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        startTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PatId = new javax.swing.JTextField();
        PatName = new javax.swing.JTextField();
        PatAd = new javax.swing.JTextField();
        PatPhone = new javax.swing.JTextField();
        PatAge = new javax.swing.JTextField();
        Pathologie = new javax.swing.JTextField();
        PatGen = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GroupCb = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        DocApt = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        endTime = new javax.swing.JLabel();
        jDateEndTime = new com.github.lgooddatepicker.components.DateTimePicker();
        jDateStartTime1 = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NURSE");

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

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MANAGE PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(255, 255, 255)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("RECEPTIONIST PATIENT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 0, -1, -1));

        AddBtn.setBackground(new java.awt.Color(0, 51, 51));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 252, 94, 32));

        UpdateBtn.setBackground(new java.awt.Color(0, 51, 51));
        UpdateBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 252, 104, 32));

        Deletebtn.setBackground(new java.awt.Color(0, 51, 51));
        Deletebtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn.setText("DELETE");
        Deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletebtnMouseClicked(evt);
            }
        });
        jPanel2.add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 252, 102, 32));

        ClearBtn.setBackground(new java.awt.Color(0, 51, 51));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 252, 102, 32));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PATIENTS LIST");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel8)
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1170, -1));

        PatientTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "ADDRESSE", "PHONE", "AGE", "GENDER", "BLOOD GROUP", "Pathologies", "Appointed", "DAIGSTART", "DAIGEND"
            }
        ));
        PatientTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        PatientTable.setRowHeight(32);
        PatientTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        PatientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PatientTable);
        if (PatientTable.getColumnModel().getColumnCount() > 0) {
            PatientTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            PatientTable.getColumnModel().getColumn(4).setPreferredWidth(10);
            PatientTable.getColumnModel().getColumn(9).setPreferredWidth(150);
            PatientTable.getColumnModel().getColumn(10).setPreferredWidth(150);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 349, 1170, 221));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("HOME");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 576, 104, 32));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("NAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, -1, -1));

        startTime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        startTime.setText("START");
        jPanel2.add(startTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("PHONE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 49, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("AGE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 91, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("GENDER");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        PatId.setEditable(false);
        PatId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 144, 31));

        PatName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatNameActionPerformed(evt);
            }
        });
        jPanel2.add(PatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 144, 31));

        PatAd.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 144, 31));

        PatPhone.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 47, 144, 31));

        PatAge.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(PatAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 89, 144, 31));

        Pathologie.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.add(Pathologie, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 144, 31));

        PatGen.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        PatGen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel2.add(PatGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 142, 32));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Pathologies");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("Group");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        GroupCb.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        GroupCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        jPanel2.add(GroupCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 144, 32));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setText("Doctor Appointed");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));
        jPanel2.add(DocApt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 142, 32));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setText("ADDRESSE");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        endTime.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        endTime.setText("END");
        jPanel2.add(endTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));
        jPanel2.add(jDateEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 340, 30));
        jPanel2.add(jDateStartTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void initData() {
        Selectional();
        loadCoboboxDoctor();
    }
    
    private void loadCoboboxDoctor() {
        //choose the doctor with status free
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "select DOCID, DOCNAME from User1.DOCTORTBL ";
            if (Login.isDoctor && !doctorName.isBlank()) {
                query += "WHERE DOCNAME = '" + doctorName + "'";
            }
            Rs = St.executeQuery(query);
            while (Rs.next()) {
                String name = Rs.getString("DOCNAME");
                int id = Rs.getInt("DOCID");
                DoctorModel doctor = new DoctorModel(id, name);
                //OOPs
                DocApt.addItem(name);//add name to combobox
                doctors.add(doctor);//add class doctor to module
            }
            DocApt.setSelectedIndex(0);// auto choose first number
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getNextIndex() {
        //auto-increment id
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("select PATID from User1.PATIENTTBL");

            while (Rs.next()) {
                nextIndex = Rs.getInt("PATID") + 1;// get the final id and +1
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clearFieldData() {
        PatId.setText("");
        PatName.setText("");
        PatAge.setText("");
        PatAd.setText("");
        PatPhone.setText("");
        Pathologie.setText("");
        DocApt.setSelectedIndex(-1);
        jDateStartTime1.clear();
        jDateEndTime.clear();
    }

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        clearFieldData();
    }//GEN-LAST:event_ClearBtnMouseClicked
    private void Selectional() {
        try {
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "select a.*, b.DAIGSTART, b.DAIGEND from User1.PATIENTTBL a INNER JOIN User1.DIAGNOSISTBL b ON a.PATID = b.PATID ";
            if (Login.isDoctor && doctorName != null) {
                query += "WHERE DOCAPT = '" + doctorName + "'";
            }
            Rs = St.executeQuery(query);
            PatientTable.setModel(DbUtils.resultSetToTableModel(Rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        getNextIndex();
    }


    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if (PatName.getText().isEmpty() || PatAd.getText().isEmpty() || PatPhone.getText().isEmpty() 
                || PatAge.getText().isEmpty() || Pathologie.getText().isEmpty() 
                || DocApt.getSelectedIndex() < 0 || jDateStartTime1.getDatePicker() == null || jDateEndTime.getDatePicker() == null) {
            JOptionPane.showMessageDialog(this, "Missing Information");
            return;
        }
        try {
            
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            St = Con.createStatement();
            String query = "SELECT * FROM User1.DIAGNOSISTBL WHERE DOCNAME = '" + DocApt.getItemAt(DocApt.getSelectedIndex()) + 
                    "' AND (TIMESTAMP(DAIGSTART) > '" + Timestamp.valueOf(jDateStartTime1.getDateTimeStrict()) + "' AND TIMESTAMP(DAIGSTART) < '" + 
                    Timestamp.valueOf(jDateEndTime.getDateTimeStrict()) + 
                    "' OR TIMESTAMP(DAIGEND) > '" + Timestamp.valueOf(jDateStartTime1.getDateTimeStrict()) + "' AND TIMESTAMP(DAIGEND) < '" +
                    Timestamp.valueOf(jDateEndTime.getDateTimeStrict()) + "' )";
            System.out.print("Query: " + query);
            Rs = St.executeQuery(query);
            if (Rs.next()) {
                JOptionPane.showMessageDialog(this, "Time working of Doctor is existed");
                return;
            }
            
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
            Con.setAutoCommit(false);
            PreparedStatement Add = Con.prepareStatement("insert into PATIENTTBL values(?,?,?,?,?,?,?,?,?)");
            Add.setInt(1, nextIndex);
            Add.setString(2, PatName.getText());
            Add.setString(3, PatAd.getText());
            Add.setString(4, PatPhone.getText());
            Add.setInt(5, Integer.valueOf(PatAge.getText()));
            Add.setString(6, PatGen.getSelectedItem().toString());
            Add.setString(7, GroupCb.getSelectedItem().toString());
            Add.setString(8, Pathologie.getText());
            Add.setString(9, DocApt.getItemAt(DocApt.getSelectedIndex()));
            int row = Add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Patient Added Successfully");

            Add = Con.prepareStatement("insert into DIAGNOSISTBL values(?,?,?,?,?,?,?,?,?,?)");
            Add.setInt(1, nextIndex);
            Add.setInt(2, nextIndex);
            Add.setString(3, PatName.getText());
            Add.setString(4, "");
            Add.setString(5, Pathologie.getText());
            Add.setString(6, "");
            Add.setInt(7, doctors.get(DocApt.getSelectedIndex()).getDocId());
            Add.setString(8, DocApt.getItemAt(DocApt.getSelectedIndex()));
            Add.setTimestamp(9, Timestamp.valueOf(jDateStartTime1.getDateTimeStrict()));
            Add.setTimestamp(10, Timestamp.valueOf(jDateEndTime.getDateTimeStrict()));
            row = Add.executeUpdate();

            Con.commit();
            Selectional();
            clearFieldData();
        } catch (Exception e) {
            try {
                Con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
            e.printStackTrace();
        } finally {
            try {
                Con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void PatientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();
        int Myindex = PatientTable.getSelectedRow();
        PatId.setText(model.getValueAt(Myindex, 0).toString());
        PatName.setText(model.getValueAt(Myindex, 1).toString());
        PatAd.setText(model.getValueAt(Myindex, 2).toString());
        PatPhone.setText(model.getValueAt(Myindex, 3).toString());
        PatAge.setText(model.getValueAt(Myindex, 4).toString());
        Pathologie.setText(model.getValueAt(Myindex, 7).toString());
        DocApt.setSelectedItem(model.getValueAt(Myindex, 8).toString());
        jDateStartTime1.setDateTimeStrict(((Timestamp) model.getValueAt(Myindex, 9)).toLocalDateTime());
        jDateEndTime.setDateTimeStrict(((Timestamp) model.getValueAt(Myindex, 10)).toLocalDateTime());
    }//GEN-LAST:event_PatientTableMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void DeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMouseClicked
        if (PatId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Patient To Be Deleted");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
                String Id = PatId.getText();
                String Query = "Delete from User1.PATIENTTBL where PATID=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                Selectional();
                JOptionPane.showMessageDialog(this, "Patient Successfully Deleted");
                clearFieldData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeletebtnMouseClicked

    private void updateRowDataDiagosis() {
        try {

            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");

            String Query = "Update User1.DIAGNOSISTBL set PATNAME='"
                    + PatName.getText() + "'"
                    + ",DAIGSTART = '" + Timestamp.valueOf(jDateStartTime1.getDateTimeStrict()) + "'"
                    + ",DAIGEND = '" + Timestamp.valueOf(jDateEndTime.getDateTimeStrict()) + "'"
                    + ",DOCNAME='" + DocApt.getItemAt(DocApt.getSelectedIndex()) + "'" + ",DOCID=" + doctors.get(DocApt.getSelectedIndex()).getDocId() + " where PATID=" + PatId.getText();
            System.out.println("UpdateDiagoisQuery: " + Query);
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            Con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if (PatId.getText().isEmpty() || PatName.getText().isEmpty() || PatAd.getText().isEmpty() || PatPhone.getText().isEmpty() || PatAge.getText().isEmpty() || Pathologie.getText().isEmpty() || DocApt.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/HospitalJavaDb", "User1", "1234");
                String Query = "Update User1.PATIENTTBL "
                        + "set PATNAME='" + PatName.getText() + "'" + 
                        ",PATAD='" + PatAd.getText() + "'" + 
                        ",PATPHONE='" + PatPhone.getText() + "'" + 
                        ",PATAGE=" + PatAge.getText() + "" + ",PATGEN='" + PatGen.getSelectedItem().toString() + "'" + ",PATGRP='" + GroupCb.getSelectedItem().toString() + "'" + ",DOCAPT='" + DocApt.getItemAt(DocApt.getSelectedIndex()) + "'" + ",PATHOLOGIES='" + Pathologie.getText() + "'" + "where PATID=" + PatId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "PATIENT Updated Successfully");
                updateRowDataDiagosis();
                Selectional();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        homeForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void PatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatNameActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JComboBox<String> DocApt;
    private javax.swing.JComboBox GroupCb;
    private javax.swing.JTextField PatAd;
    private javax.swing.JTextField PatAge;
    private javax.swing.JComboBox PatGen;
    private javax.swing.JTextField PatId;
    private javax.swing.JTextField PatName;
    private javax.swing.JTextField PatPhone;
    private javax.swing.JTextField Pathologie;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel endTime;
    private javax.swing.JButton jButton5;
    private com.github.lgooddatepicker.components.DateTimePicker jDateEndTime;
    private com.github.lgooddatepicker.components.DateTimePicker jDateStartTime1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel startTime;
    // End of variables declaration//GEN-END:variables

    void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    void setHomeForm(HomeForm homeForm) {
        this.homeForm = homeForm;
    }
}
