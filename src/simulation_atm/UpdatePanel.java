/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation_atm;

import DB.DbOperation;
import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudarsan
 */
public class UpdatePanel extends javax.swing.JDialog {

    String ID;

    /**
     * Creates new form UpdatePanel
     */
    public UpdatePanel(ArrayList a) {
        ID = (String) a.get(7);
        initComponents();
        firstNametxt.setText(a.get(0).toString());
        lastNametxt.setText(a.get(1).toString());
        if (a.get(2).toString() .equals("male")) {
            rMale.setSelected(true);
        } else if (a.get(2).toString() .equals("female") ) {
            rFemale.setSelected(true);
        } else {
            rOther.setSelected(true);
        }
        addresstxt.setText(a.get(3).toString());
        phonetxt.setText(a.get(4).toString());
        emailtxt.setText(a.get(5).toString());
        if (a.get(6).toString() == "A") {
            jComboBox1.setSelectedIndex(1);
        } else {
            jComboBox1.setSelectedIndex(1);
        }

        bg.add(rFemale);
        bg.add(rMale);
        bg.add(rOther);

        clearWarnings();
        this.setLocationRelativeTo(null);
        this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
    }

    public void clearWarnings() {
        lbl.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        firstNametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        rMale = new javax.swing.JRadioButton();
        lbl2 = new javax.swing.JLabel();
        rFemale = new javax.swing.JRadioButton();
        lbl3 = new javax.swing.JLabel();
        rOther = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        lastNametxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("First Name:");

        firstNametxt.setToolTipText("First Name");

        jLabel6.setText("Last Name:");

        jLabel10.setText("Phone Number:");

        phonetxt.setToolTipText("Home phone no.");
        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });

        jLabel14.setText("Email:");

        lbl.setForeground(new java.awt.Color(204, 0, 0));
        lbl.setText("Invalid Firstname!!");

        jLabel12.setText("Gender:");

        lbl1.setForeground(new java.awt.Color(204, 0, 0));
        lbl1.setText("Invalid Lastname!");

        rMale.setText("Male");
        rMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMaleActionPerformed(evt);
            }
        });

        lbl2.setForeground(new java.awt.Color(204, 0, 0));
        lbl2.setText("*Enter Gender");

        rFemale.setText("Female");
        rFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemaleActionPerformed(evt);
            }
        });

        lbl3.setForeground(new java.awt.Color(204, 0, 0));
        lbl3.setText("Enter address!");

        rOther.setText("Other");
        rOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rOtherActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "A", "B" }));

        lastNametxt.setToolTipText("Last Name");
        lastNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNametxtActionPerformed(evt);
            }
        });

        jLabel1.setText("Category:");

        lbl4.setForeground(new java.awt.Color(204, 0, 0));
        lbl4.setText("Invalid Phone Number!!");

        lbl6.setForeground(new java.awt.Color(204, 0, 0));
        lbl6.setText("*Select category");

        jLabel7.setText("Address :");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lbl5.setForeground(new java.awt.Color(204, 0, 0));
        lbl5.setText("Invalid Email!!");

        addresstxt.setToolTipText("Address 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl5))
                            .addComponent(jLabel14)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rMale)
                                .addGap(18, 18, 18)
                                .addComponent(rFemale)
                                .addGap(18, 18, 18)
                                .addComponent(rOther)
                                .addGap(42, 42, 42)
                                .addComponent(lbl2))
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl6)
                                    .addComponent(lbl4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(282, 282, 282)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl3))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl)
                    .addComponent(lastNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rMale)
                    .addComponent(rFemale)
                    .addComponent(rOther)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5))
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    private void rMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMaleActionPerformed

    private void rFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rFemaleActionPerformed

    private void rOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rOtherActionPerformed

    private void lastNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNametxtActionPerformed
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public boolean isNumeric(String a) {
        return a.matches("-?\\d+(\\.\\d+)?");
    }

    public boolean isAlphabet(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public boolean isValidInput() {
        clearWarnings();
        boolean result = true;
        if (firstNametxt.getText().isEmpty()) {
            lbl.setText("*Enter Firstname");
            lbl.setVisible(true);
            result = false;
        } else if (!isAlphabet(firstNametxt.getText())) {
            lbl.setText("Invalid Firstname!");
            lbl.setVisible(true);
            result = false;
        }
        if (lastNametxt.getText().isEmpty()) {
            lbl1.setText("*Enter Lastname");
            lbl1.setVisible(true);
            result = false;
        } else if (!isAlphabet(lastNametxt.getText())) {
            lbl1.setText("Invalid Lastname!");
            lbl1.setVisible(true);
            result = false;
        }
        if (bg.isSelected(null)) {
            lbl2.setVisible(true);
            result = false;
        }
        if (addresstxt.getText().isEmpty()) {
            lbl3.setText("*Enter address");
            lbl3.setVisible(true);
            result = false;
        } else if (!isAlphabet(addresstxt.getText())) {
            lbl3.setText("Invalid Address!");
            lbl3.setVisible(true);
            result = false;
        }

        if (phonetxt.getText().isEmpty()) {
            lbl4.setText("*Enter Phone");
            lbl4.setVisible(true);
            result = false;
        } else if (!isNumeric(phonetxt.getText())) {
            lbl4.setText("Invalid Phone!");
            lbl4.setVisible(true);
            result = false;
        }
        if (emailtxt.getText().isEmpty()) {
            lbl5.setText("*Enter Email");
            lbl5.setVisible(true);
            result = false;
        } else if (!isValidEmailAddress(emailtxt.getText())) {
            lbl5.setText("Invalid Email!");
            lbl5.setVisible(true);
            result = false;
        }
        if (jComboBox1.getSelectedIndex() == 0) {
            lbl6.setVisible(true);
            result = false;
        }

        return result;

    }

    public ArrayList getDataToSave() {
        ArrayList data = new ArrayList();
        data.add(firstNametxt.getText());
        data.add(lastNametxt.getText());
        String g;
        if (rMale.isSelected()) {
            g = "male";
        } else if (rFemale.isSelected()) {
            g = "female";
        } else {
            g = "other";
        }
        data.add(g);
        data.add(addresstxt.getText());
        data.add(phonetxt.getText());
        data.add(emailtxt.getText());
        data.add(jComboBox1.getSelectedItem().toString());
        data.add(ID);

        return data;
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isValidInput()) {    // TODO add your handling code here:
            DbOperation d = new DbOperation();
            d.updateCustomer(getDataToSave());
            JOptionPane.showMessageDialog(this, "Customer successfully updated"); 
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    ButtonGroup bg = new ButtonGroup();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField firstNametxt;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNametxt;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JRadioButton rFemale;
    private javax.swing.JRadioButton rMale;
    private javax.swing.JRadioButton rOther;
    // End of variables declaration//GEN-END:variables
}
