/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetogigalink;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class TelaViewEmail extends javax.swing.JFrame {

            ConectaBanco conecta = new ConectaBanco();

    /** Creates new form TelaViewEmail */
    public TelaViewEmail() {
        initComponents();
        setLocationRelativeTo(null);
        conecta.conectar();
        idEmail.setVisible(false);
        jLabel2.setVisible(false);
        idFornecedorEmail.setEditable(false);
        validaCampo.setVisible(false);
        
    }
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void recebeEmail(String recebeEmail){
        idFornecedorEmail.setText(recebeEmail);
        idEmail.setText("");
        email.setText("");
        refEmail.setText("");
        validaCampo.setText("");
        idEmail.setVisible(true);
        jLabel2.setVisible(true);
        idFornecedorEmail.setEditable(true);
        
        listaEmail.setText("");
          try {

            Statement st = conecta.con.createStatement();
            ArrayList email = new ArrayList();
            ResultSet rs = st.executeQuery("Select * from email where idFornecedor = " + idFornecedorEmail.getText());
            while(rs.next()){
                if(rs.getString("email").isEmpty()){
                email.add(("ID nº ")+(rs.getString("id") + ". Nenhum email Registrado. Se desejar incluir um email, coloque o ID nº " + rs.getString("id") + ", consulte e depois adicione um email."));  
                }else{
                email.add(("ID nº ")+(rs.getString("id")+ " - " + rs.getString("email")));  
                }
                           
            }
            listaEmail.setText("Emails cadastrados: " + (email).toString().replace("[", "").replace("]", ""));
                   

        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idEmail = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        refEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idFornecedorEmail = new javax.swing.JTextField();
        listaEmail = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        validaCampo = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setText("ID:");

        jLabel3.setText("Email:");

        jLabel4.setText("Ref.:");

        idEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idEmailFocusLost(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel7.setText("ID do Fornecedor:");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(332, 332, 332)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(refEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnGravar)
                        .addGap(38, 38, 38)
                        .addComponent(btnAtualizar)
                        .addGap(45, 45, 45)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(306, 306, 306)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(validaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(30, 30, 30)
                                    .addComponent(idEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(idFornecedorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(validaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(idFornecedorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(listaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        validaCampo.setText("");
        try {
     
            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select * from email where id = " + idEmail.getText());
            if(rs.next()){
            email.setText(rs.getString("email"));
            refEmail.setText(rs.getString("ref"));
            validaCampo.setText(rs.getString("idFornecedor"));
            }
           
            if(validaCampo.getText().equals(idFornecedorEmail.getText())){
            email.setEditable(true);
            refEmail.setEditable(true);
            btnGravar.setEnabled(false);
            }else{
                  email.setEditable(false);
            refEmail.setEditable(false);
            JOptionPane.showMessageDialog(null, "Não é possível alterar esse email.");
            btnExcluir.setEnabled(false);
            btnGravar.setEnabled(false);
            btnAtualizar.setEnabled(false);
            btnConsultar.setEnabled(false);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        
        if(email.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum email digitado.");
        }
        if(!idEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Apagar campo ID e apertar em cima do campo email.\nSe os campos estiverem travados, aperte o botão limpar.");
            btnGravar.setEnabled(false);
            
        }
        else {
        try {
            
            Statement st = conecta.con.createStatement();
            st.executeUpdate("INSERT INTO email values('"+0+"', '"+idFornecedorEmail.getText()+"', '"+email.getText()+"', '"+refEmail.getText()+"')");
            JOptionPane.showMessageDialog(null, "Email Cadastrado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      }        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         try {
            
            Statement st = conecta.con.createStatement();
            st.executeUpdate("UPDATE email SET id = '"+idEmail.getText()+"', idFornecedor = '"+idFornecedorEmail.getText()+"', email = '"+email.getText()+"', ref = '"+refEmail.getText()+"' WHERE id = " + idEmail.getText());
            JOptionPane.showMessageDialog(null, "Email Atualizado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        
      }      
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void idEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idEmailFocusLost
         if(idEmail.getText().isEmpty()){
             btnGravar.setEnabled(true);
         }
    }//GEN-LAST:event_idEmailFocusLost

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {

            Statement st = conecta.con.createStatement();
            st.executeUpdate("DELETE FROM email WHERE id = " + idEmail.getText());
            email.setText("");
            refEmail.setText("");
            idEmail.setText("");
            btnGravar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso");

        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
            email.setText("");
            refEmail.setText("");
            idEmail.setText("");
            email.setEditable(true);
            refEmail.setEditable(true);
            btnGravar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnAtualizar.setEnabled(true);
            btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaViewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaViewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaViewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaViewEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaViewEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idEmail;
    private javax.swing.JTextField idFornecedorEmail;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel listaEmail;
    private javax.swing.JTextField refEmail;
    private javax.swing.JTextField validaCampo;
    // End of variables declaration//GEN-END:variables

}
