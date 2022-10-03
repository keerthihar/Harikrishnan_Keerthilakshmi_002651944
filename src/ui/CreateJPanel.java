/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.Employeehistory;
import model.Employee;

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
        jButtonsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsaveActionPerformed(evt);
            }
        });

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
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEmployeeId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jStartdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTeaminfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jposition_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jNumber))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname)
                    .addComponent(txtage)
                    .addComponent(txtgender)
                    .addComponent(txtlevel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonsave)
                        .addGap(0, 281, Short.MAX_VALUE))
                    .addComponent(txttminfo)
                    .addComponent(txtpostit)
                    .addComponent(txtemail)
                    .addComponent(txtno)
                    .addComponent(txtsdate)
                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                .addContainerGap(23, Short.MAX_VALUE))
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
        vs.setAge(Integer.parseInt(Age));
                vs.setGender(Gender);
                vs.setStart_date(Startdate);
                vs.setLevel(Level);
                vs.setTeamInfo(Teaminfo);
                vs.setPosition_Title(PositionTitle);
                vs.setEmail(Email);
                vs.setContactNumber(Number);
                JOptionPane.showMessageDialog(this,"New employee added.");
                txtname.setText("name");
                txtid.setText("Employeeid");
                txtage.setText("Age");
                txtgender.setText("Gender");
                txtsdate.setText("Startdate");
                txtlevel.setText("Level");
                txttminfo.setText("jTeaminfo");
                txtpostit.setText("postit");
                txtemail.setText("Email");
                txtno.setText("Number");
                
                        
                        
                        
                        
                        
                        
                
        
                
                    
    }//GEN-LAST:event_txtpostitActionPerformed

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoActionPerformed

    private void jButtonsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsaveActionPerformed
        // TODO add your handling code here:
        Employee empdata = history.addnewEmp();
        empdata.setName(txtname.getText());
        empdata.setEmployeeId(txtid.getText());
        empdata.setAge(Integer.parseInt(txtage.getText()));
        empdata.setGender(txtgender.getText());
        empdata.setStart_date(txtsdate.getText());
        empdata.setLevel(txtlevel.getText());
        empdata.setTeamInfo(txttminfo.getText());
        empdata.setPosition_Title(txtpostit.getText());
        empdata.setContactNumber(txtno.getText());
        empdata.setEmail(txtemail.getText());
        
        JOptionPane.showMessageDialog(this,"hello");
        
        
    }//GEN-LAST:event_jButtonsaveActionPerformed


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
