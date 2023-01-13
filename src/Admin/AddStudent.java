/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author drewn
 */
public class AddStudent extends javax.swing.JFrame {
    //static String db = "jdbc:mysql://localhost:3306/sis";
    static String db = "jdbc:mysql://localhost:3307/sis";
    
    private String pw;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
       
        initComponents();
        viewData();
    }
    
    public void passData(String str){
        pw = str;
        System.out.println(pw);
                jLabel12.setText(pw);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentInfo = new javax.swing.JTable();
        txtStudentNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtMiddleInitial = new javax.swing.JTextField();
        txtRequirement = new javax.swing.JTextField();
        txtProgramTitle = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtBatchNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbGrade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cbAscDesc = new javax.swing.JComboBox<>();
        cbFieldName = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Number", "First Name", "Middle Inital", "Last Name", "Address", "Requirement Status", "Password", "BatchNo", "ProgramTitle", "Email", "Grade"
            }
        ));
        tblStudentInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentInfo);

        txtRequirement.setText("Passed");
        txtRequirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequirementActionPerformed(evt);
            }
        });

        txtProgramTitle.setText("Java Programming NC3");

        txtPassword.setText("pw");
        txtPassword.setToolTipText("");

        txtBatchNo.setText("7");
        txtBatchNo.setToolTipText("");

        cbGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Training On Going", "Competent", "Incompetent", " ", " " }));
        cbGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGradeActionPerformed(evt);
            }
        });

        jLabel1.setText("StudentNumber:");

        jLabel2.setText("Middle Initial:");

        jLabel3.setText("First Name:");

        jLabel4.setText("Last Name:");

        jLabel5.setText("Address:");

        jLabel6.setText("Password");

        jLabel7.setText("Requirement Status:");

        jLabel8.setText("Batch No.");

        jLabel9.setText("Email");

        jLabel10.setText("Program Title");

        jLabel11.setText("Grade");

        btnAdd.setText("Add Student");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Student");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Student");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cbAscDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASC", "DESC" }));

        cbFieldName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "StudentNumber", "FirstName", "MiddleInitial", "LastName", "Address", "Requirement_Status", "Pass_word", "BatchNo", "ProgramTitle", "Email", "Grade" }));

        btnSort.setText("Sort");
        btnSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortMouseClicked(evt);
            }
        });
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtRequirement, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(38, 38, 38)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(11, 11, 11)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProgramTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 171, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(cbAscDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btnSort))
                            .addComponent(jScrollPane1))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAscDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMiddleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtRequirement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtProgramTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGradeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        addData();
        clearTable();
        viewData();
    }//GEN-LAST:event_btnAddMouseClicked

    //    TODO: make student number uneditable
    private void txtRequirementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequirementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequirementActionPerformed

    private void tblStudentInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentInfoMouseClicked
        // TODO add your handling code here:
        getRow();
    }//GEN-LAST:event_tblStudentInfoMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateData();
        clearTable();
        viewData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        deleteData();
        clearTable();
        viewData();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortMouseClicked
        clearTable();
        sortData();
    }//GEN-LAST:event_btnSortMouseClicked

    void sortData() {

        String fieldName = cbFieldName.getSelectedItem().toString();
        String order = cbAscDesc.getSelectedItem().toString();
        try {
            Connection conn = DriverManager.getConnection(db, "root", null);
            String qry = "SELECT * FROM student_info ORDER BY " + fieldName + " " + order;
            PreparedStatement pstmnt = conn.prepareStatement(qry);

            ResultSet rslt = pstmnt.executeQuery();
            System.out.println("SUCCESS!");
            while (rslt.next()) {
                String studno = rslt.getString("StudentNumber");
                String fname = rslt.getString("FirstName");
                String mi = rslt.getString("MiddleInitial");
                String lname = rslt.getString("LastName");
                String add = rslt.getString("Address");
                String req = rslt.getString("Requirement_Status");
                String pw = rslt.getString("Pass_word");
                String batchno = rslt.getString("BatchNo");
                String prog = rslt.getString("ProgramTitle");
                String email = rslt.getString("Email");
                String grade = rslt.getString("Grade");

                String data[] = {studno, fname, mi, lname, add, req, pw, batchno,
                    prog, email, grade};
                DefaultTableModel tbl = (DefaultTableModel) tblStudentInfo.getModel();

                tbl.addRow(data);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }

    }

    void deleteData() {
        try {
            Connection conn = DriverManager.getConnection(db, "root", null);
            String qry = "DELETE FROM student_info WHERE StudentNumber = ?";
            PreparedStatement pstmnt = conn.prepareStatement(qry);
            pstmnt.setString(1, txtStudentNumber.getText());

            pstmnt.executeUpdate();
            showMessageDialog(this, "Student Removed");

//            cleanUp
//            
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    void updateData() {
        try {
            Connection conn = DriverManager.getConnection(db, "root", null);
            String qry = "UPDATE `student_info` SET `FirstName`= ?,`MiddleInitial`=?,`LastName`=?,`Address`=?,`Requirement_Status`=?,"
                    + "`Pass_word`=?,`BatchNo`=?,`ProgramTitle`=?,`Email`=?,`Grade`=? "
                    + "WHERE StudentNumber = ?";
            PreparedStatement pstmnt = conn.prepareStatement(qry);
//            pstmnt.setString(1, txtStudentNumber.getText());
            pstmnt.setString(1, txtFirstName.getText());
            pstmnt.setString(2, txtMiddleInitial.getText());
            pstmnt.setString(3, txtLastName.getText());
            pstmnt.setString(4, txtAddress.getText());
            pstmnt.setString(5, txtRequirement.getText());
            pstmnt.setString(6, txtPassword.getText());
            pstmnt.setString(7, txtBatchNo.getText());
            pstmnt.setString(8, txtProgramTitle.getText());
            pstmnt.setString(9, txtEmail.getText());
            pstmnt.setString(10, cbGrade.getSelectedItem().toString());
            pstmnt.setString(11, txtStudentNumber.getText());

            pstmnt.executeUpdate();
            showMessageDialog(this, "Data Inserted");

//            cleanUp
//            
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    void viewData() {
        try {
            Connection conn = DriverManager.getConnection(db, "root", null);
            String qry = "SELECT * FROM student_info";
            PreparedStatement pstmnt = conn.prepareStatement(qry);
            ResultSet rslt = pstmnt.executeQuery();
            System.out.println("executed");
          
            while (rslt.next()) {
                String studno = rslt.getString("StudentNumber");
                String fname = rslt.getString("FirstName");
                String mi = rslt.getString("MiddleInitial");
                String lname = rslt.getString("LastName");
                String add = rslt.getString("Address");
                String req = rslt.getString("Requirement_Status");
                String pw = rslt.getString("Pass_word");
                String batchno = rslt.getString("BatchNo");
                String prog = rslt.getString("ProgramTitle");
                String email = rslt.getString("Email");
                String grade = rslt.getString("Grade");

                String data[] = {studno, fname, mi, lname, add, req, pw, batchno,
                    prog, email, grade};
                DefaultTableModel tbl = (DefaultTableModel) tblStudentInfo.getModel();

                tbl.addRow(data);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    void getRow() {
        DefaultTableModel tbl = (DefaultTableModel) tblStudentInfo.getModel();
        int selectedRowIndex = tblStudentInfo.getSelectedRow();

        txtStudentNumber.setText((tbl.getValueAt(selectedRowIndex, 0)).toString());
        txtFirstName.setText((tbl.getValueAt(selectedRowIndex, 1)).toString());
        txtMiddleInitial.setText((tbl.getValueAt(selectedRowIndex, 2)).toString());
        txtLastName.setText((tbl.getValueAt(selectedRowIndex, 3)).toString());
        txtAddress.setText((tbl.getValueAt(selectedRowIndex, 4)).toString());
        txtRequirement.setText((tbl.getValueAt(selectedRowIndex, 5)).toString());
        txtPassword.setText((tbl.getValueAt(selectedRowIndex, 6)).toString());
        txtBatchNo.setText((tbl.getValueAt(selectedRowIndex, 7)).toString());
        txtProgramTitle.setText((tbl.getValueAt(selectedRowIndex, 8)).toString());
        txtEmail.setText((tbl.getValueAt(selectedRowIndex, 9)).toString());
        cbGrade.setSelectedItem((tbl.getValueAt(selectedRowIndex, 10)).toString());
    }

    void addData() {
        try {
            String qry = "INSERT INTO `student_info`(`StudentNumber`, `FirstName`, `MiddleInitial`, `LastName`, "
                    + "`Address`, `Requirement_Status`, `Pass_word`, `BatchNo`, `ProgramTitle`, `Email`, `Grade`) "
                    + "VALUES ( null, ?, ?,?,?,?,?,?,?,?,?);";
            Connection conn = DriverManager.getConnection(db, "root", null);
            PreparedStatement pstmnt = conn.prepareStatement(qry);
//            pstmnt.setString(1, txtStudentNumber.getText());
            pstmnt.setString(1, txtFirstName.getText());
            pstmnt.setString(2, txtMiddleInitial.getText());
            pstmnt.setString(3, txtLastName.getText());
            pstmnt.setString(4, txtAddress.getText());
            pstmnt.setString(5, txtRequirement.getText());
            pstmnt.setString(6, txtPassword.getText());
            pstmnt.setString(7, txtBatchNo.getText());
            pstmnt.setString(8, txtProgramTitle.getText());
            pstmnt.setString(9, txtEmail.getText());
            pstmnt.setString(10, cbGrade.getSelectedItem().toString());

            pstmnt.executeUpdate();
            showMessageDialog(this, "Data Inserted");

//            cleanUp
//            
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();
        model.setRowCount(0);
    }

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbAscDesc;
    private javax.swing.JComboBox<String> cbFieldName;
    private javax.swing.JComboBox<String> cbGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudentInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleInitial;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtProgramTitle;
    private javax.swing.JTextField txtRequirement;
    private javax.swing.JTextField txtStudentNumber;
    // End of variables declaration//GEN-END:variables
}
