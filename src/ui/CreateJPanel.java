/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.Employeehistory;

/**
 *
 * @author keert
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     *
     */
    Employeehistory history;
    public CreateJPanel(Employeehistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jEmployeeId = new javax.swing.JLabel();
        jAge = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jStartdate = new javax.swing.JLabel();
        jLevel = new javax.swing.JLabel();
        jTeaminfo = new javax.swing.JLabel();
        jposition_title = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtsdate = new javax.swing.JTextField();
        txtlevel = new javax.swing.JTextField();
        txttminfo = new javax.swing.JTextField();
        txtpostit = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jName = new javax.swing.JLabel();
        jButtonsave = new javax.swing.JButton();
        txtgender = new javax.swing.JTextField();
        txtno = new javax.swing.JTextField();
        jNumber = new javax.swing.JLabel();

        jLabel1.setText("employee");

        jEmployeeId.setText("Employee id");

        jAge.setText("Age");

        jGender.setText("Gender");

        jStartdate.setText("Start date");

        jLevel.setText("Level");

        jTeaminfo.setText("Team info");

        jposition_title.setText("Position title");

        jEmail.setText("Email");

        txtpostit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpostitActionPerformed(evt);
            }
        });

        jName.setText("Name");

        jButtonsave.setText("save");

        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });

        jNumber.setText("Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStartdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTeaminfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jposition_title, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addComponent(jName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jNumber))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname)
                    .addComponent(txtage)
                    .addComponent(txtgender)
                    .addComponent(txtlevel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonsave)
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addComponent(txttminfo)
                    .addComponent(txtpostit)
                    .addComponent(txtemail)
                    .addComponent(txtno)
                    .addComponent(txtsdate)
                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEmployeeId)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jName))
                        .addGap(18, 18, 18)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAge)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGender)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStartdate)
                    .addComponent(txtsdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLevel)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeaminfo)
                    .addComponent(txttminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jposition_title)
                    .addComponent(txtpostit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumber))
                .addGap(21, 21, 21)
                .addComponent(jButtonsave)
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtpostitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpostitActionPerformed
        // TODO add your handling code here:
        
        
        String Name = txtname.getText();
        String EmployeeId = txtid.getText();
        String Age = txtage.getText();
        String Gender = txtgender.getText();
        String Startdate = txtsdate.getText();
        String Level = txtlevel.getText();
        String Teaminfo = txttminfo.getText();
        String PositionTitle= txtpostit.getText();
        String Email = txtemail.getText();  
        String Number = txtno.getText();
        
        Employee vs =history.addnewEmp();
        vs.setName(Name);
        vs.setEmployeeId(EmployeeId);
        vs.setAge(Age);
                vs.setGender(Gender);
                vs.setStartdate(Startdate);
                vs.setLevel(Level);
                vs.setTeaminfo(Teaminfo);
                vs.setPositionTitle(PositionTitle);
                vs.setEmail(Email);
                vs.setNumber(Number);
                JOptionPane.showMessageDialog(this,"New employee added.");
                txtname.setText("");
                txtid.setText("");
                txtage.setText("");
                txtgender.setText("");
                txtsdate.setText("");
                txtlevel.setText("");
                txttminfo.setText("");
                txtpostit.setText("");
                txtemail.setText("");
                txtno.setText("");
                
                        
                        
                        
                        
                        
                        
                
        
                
                    
    }//GEN-LAST:event_txtpostitActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAge;
    private javax.swing.JButton jButtonsave;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jEmployeeId;
    private javax.swing.JLabel jGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLevel;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jNumber;
    private javax.swing.JLabel jStartdate;
    private javax.swing.JLabel jTeaminfo;
    private javax.swing.JLabel jposition_title;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtpostit;
    private javax.swing.JTextField txtsdate;
    private javax.swing.JTextField txttminfo;
    // End of variables declaration//GEN-END:variables
}
