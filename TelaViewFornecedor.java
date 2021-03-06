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
public class TelaViewFornecedor extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    TelaViewTelefone enviatexto;
    TelaViewEmail enviaEmail;
    
    /**
     * Creates new form TelaView
     */
    public TelaViewFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        conecta.conectar();
        nomeFornecedor.requestFocus();
       
    }
    
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
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
        jTextField1 = new javax.swing.JTextField();
        nomeFornecedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        descFornecedor = new javax.swing.JTextField();
        cidFornecedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        endFornecedor = new javax.swing.JTextField();
        bairroFornecedor = new javax.swing.JTextField();
        numFornecedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telFornecedor = new javax.swing.JTextField();
        emailFornecedor = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        dddTelFornecedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnIncEmail = new javax.swing.JButton();
        btnIncTel = new javax.swing.JButton();
        lblIdFornecedor = new javax.swing.JLabel();
        listaEmail = new javax.swing.JLabel();
        listaTel = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        refTel = new javax.swing.JTextField();
        refEmail = new javax.swing.JTextField();
        btnTodosRegistros = new javax.swing.JButton();
        lblTodosRegistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição");

        jLabel4.setText("Cidade:");

        jLabel5.setText("End.:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("Nº:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Cadastro/Consulta FORNECEDOR");

        jLabel9.setText("Último Tel. Cadastrado:");

        jLabel10.setText("Último Email Cadastrado:");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel11.setText("DDD:");

        btnIncEmail.setText("Editar/Incluir Email");
        btnIncEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncEmailActionPerformed(evt);
            }
        });

        btnIncTel.setText("Editar/Incluir Telefone");
        btnIncTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncTelActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnTodosRegistros.setText("Ver Todos os Registros");
        btnTodosRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosRegistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(btnGravar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnTodosRegistros)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsulta)
                                        .addGap(83, 83, 83)
                                        .addComponent(lblIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(btnAtualizar)
                                        .addGap(24, 24, 24)
                                        .addComponent(btnLimpar)
                                        .addGap(136, 136, 136)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(endFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                        .addComponent(cidFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nomeFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bairroFornecedor, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dddTelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(telFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(refTel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnIncTel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(refEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnIncEmail))
                                    .addComponent(lblTodosRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTodosRegistros)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblTodosRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsulta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(endFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(telFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncTel)
                    .addComponent(jLabel11)
                    .addComponent(dddTelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaTel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncEmail)
                    .addComponent(refEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(listaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnAtualizar)
                    .addComponent(jButton3)
                    .addComponent(btnLimpar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        try {
        
            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select * from fornecedor where id = " + jTextField1.getText());
            if(rs.next()){
            nomeFornecedor.setText(rs.getString("nome"));
            descFornecedor.setText(rs.getString("descricao"));
            cidFornecedor.setText(rs.getString("cidade"));
            endFornecedor.setText(rs.getString("endereco"));
            bairroFornecedor.setText(rs.getString("bairro"));
            numFornecedor.setText(rs.getString("numero"));
             nomeFornecedor.setEditable(false);
               descFornecedor.setEditable(false);
               cidFornecedor.setEditable(false);
               endFornecedor.setEditable(false);
               bairroFornecedor.setEditable(false);
                dddTelFornecedor.setEditable(false);
               telFornecedor.setEditable(false);
               refTel.setEditable(false);
               numFornecedor.setEditable(false);
                refEmail.setEditable(false);
               emailFornecedor.setEditable(false);
               btnGravar.setEnabled(false);
               btnAtualizar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Não Cadastrado ou Excluído");
                 nomeFornecedor.setEditable(true);
               descFornecedor.setEditable(true);
               cidFornecedor.setEditable(true);
               endFornecedor.setEditable(true);
               bairroFornecedor.setEditable(true);
               numFornecedor.setEditable(true);
                dddTelFornecedor.setEditable(true);
               telFornecedor.setEditable(true);
               refTel.setEditable(true);
                refEmail.setEditable(true);
               emailFornecedor.setEditable(true);
               btnGravar.setEnabled(true);
               btnAtualizar.setEnabled(true);
               btnConsulta.setEnabled(true);
            }
            
            ResultSet rs1 = st.executeQuery("Select * from email where idFornecedor = " + jTextField1.getText());
            ArrayList email = new ArrayList();
            while(rs1.next()){    
            emailFornecedor.setText(rs1.getString("email"));
            refEmail.setText(rs1.getString("ref"));
            email.add(rs1.getString("email"));
            listaEmail.setText("Emails cadastrados: " + (email).toString().replace("[", "").replace("]", ""));
            }
           
            ResultSet rs2 = st.executeQuery("Select * from telefone where idFornecedorTel = " + jTextField1.getText());
            ArrayList telefones = new ArrayList();
            while(rs2.next()){    
            dddTelFornecedor.setText(rs2.getString("dddTel"));
            telFornecedor.setText(rs2.getString("telTel"));
            refTel.setText(rs2.getString("refTel"));
            telefones.add(("(" + rs2.getString("dddTel") + ") " + rs2.getString("telTel")));                
            listaTel.setText("Telefones cadastrados: " + (telefones).toString().replace("[", "").replace("]", ""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
         
        try {
            
            Statement st = conecta.con.createStatement();
             if(telFornecedor.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Telefone não pode ser vazio");
               }else
             {
            st.executeUpdate("INSERT INTO fornecedor values(null, '"+nomeFornecedor.getText()+"', '"+descFornecedor.getText()+"', '"+cidFornecedor.getText()+"', '"+endFornecedor.getText()+"', '"+bairroFornecedor.getText()+"', '"+numFornecedor.getText()+"')");
            ResultSet rs = (ResultSet) st.executeQuery("SELECT * FROM fornecedor");
            if(rs.last()){
                jTextField1.setText(rs.getString("id"));
            }
            st.executeUpdate("INSERT INTO email values(null, '"+jTextField1.getText()+"', '"+emailFornecedor.getText()+"', '"+refEmail.getText()+"')");
               st.executeUpdate("INSERT INTO telefone values(null, '"+jTextField1.getText()+"', '"+dddTelFornecedor.getText()+"', '"+telFornecedor.getText()+"', '"+refTel.getText()+"')");
               
               nomeFornecedor.setEditable(false);
               descFornecedor.setEditable(false);
               cidFornecedor.setEditable(false);
               endFornecedor.setEditable(false);
               bairroFornecedor.setEditable(false);
               numFornecedor.setEditable(false);
               dddTelFornecedor.setEditable(false);
               telFornecedor.setEditable(false);
               refTel.setEditable(false);
               refEmail.setEditable(false);
               emailFornecedor.setEditable(false);
               btnGravar.setEnabled(false);
               
               JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
             }
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        
      }     
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnIncTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncTelActionPerformed
        if(enviatexto == null){
            enviatexto = new TelaViewTelefone();
            enviatexto.setVisible(true);
            enviatexto.recebeId(jTextField1.getText());
        }else{
             enviatexto.setVisible(true);
            enviatexto.recebeId(jTextField1.getText());
        }
            

    }//GEN-LAST:event_btnIncTelActionPerformed

    private void btnIncEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncEmailActionPerformed
         if(enviaEmail == null){
            enviaEmail = new TelaViewEmail();
            enviaEmail.setVisible(true);
            enviaEmail.recebeEmail(jTextField1.getText());
        }else{
             enviaEmail.setVisible(true);
            enviaEmail.recebeEmail(jTextField1.getText());
            
        }
    }//GEN-LAST:event_btnIncEmailActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            
            Statement st = conecta.con.createStatement();
             if(telFornecedor.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Telefone não pode ser vazio");
               }else
             {
            st.executeUpdate("UPDATE fornecedor set id = '"+jTextField1.getText()+"', nome = '"+nomeFornecedor.getText()+"', descricao = '"+descFornecedor.getText()+"', cidade = '"+cidFornecedor.getText()+"', endereco = '"+endFornecedor.getText()+"', bairro = '"+bairroFornecedor.getText()+"', numero = '"+numFornecedor.getText()+"' WHERE id = " + jTextField1.getText());
             nomeFornecedor.setEditable(false);
               descFornecedor.setEditable(false);
               cidFornecedor.setEditable(false);
               endFornecedor.setEditable(false);
               bairroFornecedor.setEditable(false);
               numFornecedor.setEditable(false);
               dddTelFornecedor.setEditable(false);
               telFornecedor.setEditable(false);
               refTel.setEditable(false);
               refEmail.setEditable(false);
               emailFornecedor.setEditable(false);
            btnGravar.setEnabled(false);
            jTextField1.setEditable(true);
            btnEditar.setEnabled(true);
                    btnAtualizar.setEnabled(false);
                    btnConsulta.setEnabled(true);

                        JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso");

            
             }
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        
      }     
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnGravar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnAtualizar.setEnabled(true);
        jTextField1.setEditable(false);
        nomeFornecedor.setEditable(true);
        descFornecedor.setEditable(true);
        cidFornecedor.setEditable(true);
        endFornecedor.setEditable(true);
        bairroFornecedor.setEditable(true);
        numFornecedor.setEditable(true);
              
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
            nomeFornecedor.setText("");
            descFornecedor.setText("");
            cidFornecedor.setText("");
            endFornecedor.setText("");
            bairroFornecedor.setText("");
            numFornecedor.setText("");
            jTextField1.setText("");
            dddTelFornecedor.setText("");
            telFornecedor.setText("");
            refTel.setText("");
               refEmail.setText("");
            emailFornecedor.setText("");
            listaTel.setText("");
            listaEmail.setText("");
            
            btnEditar.setEnabled(true);
            btnGravar.setEnabled(true);
            btnConsulta.setEnabled(true);
            btnAtualizar.setEnabled(true);
            jTextField1.setEditable(true);
            nomeFornecedor.setEditable(true);
            dddTelFornecedor.setEditable(true);
               telFornecedor.setEditable(true);
               refTel.setEditable(true);
               refEmail.setEditable(true);
               emailFornecedor.setEditable(true);
        descFornecedor.setEditable(true);
        cidFornecedor.setEditable(true);
        endFornecedor.setEditable(true);
        bairroFornecedor.setEditable(true);
        numFornecedor.setEditable(true);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {

            Statement st = conecta.con.createStatement();
            st.executeUpdate("DELETE FROM fornecedor WHERE id = " + jTextField1.getText());
            nomeFornecedor.setText("");
            descFornecedor.setText("");
            cidFornecedor.setText("");
            endFornecedor.setText("");
            bairroFornecedor.setText("");
            numFornecedor.setText("");
           JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        }   
          
           try{
            Statement st1 = conecta.con.createStatement();
            st1.executeUpdate("DELETE FROM email WHERE id = " + jTextField1.getText());
            refEmail.setText("");
            emailFornecedor.setText("");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        }    
           
             try{  
            Statement st2 = conecta.con.createStatement();
            st2.executeUpdate("DELETE FROM telefone WHERE idFornecedorTel = " + jTextField1.getText());
           dddTelFornecedor.setText("");
            telFornecedor.setText("");
            refTel.setText("");
             jTextField1.setText("");
              btnEditar.setEnabled(true);
            btnGravar.setEnabled(true);
            btnConsulta.setEnabled(true);
            btnAtualizar.setEnabled(true);
            jTextField1.setEditable(true);
            nomeFornecedor.setEditable(true);
            dddTelFornecedor.setEditable(true);
               telFornecedor.setEditable(true);
               refTel.setEditable(true);
               refEmail.setEditable(true);
               emailFornecedor.setEditable(true);
        descFornecedor.setEditable(true);
        cidFornecedor.setEditable(true);
        endFornecedor.setEditable(true);
        bairroFornecedor.setEditable(true);
        numFornecedor.setEditable(true);
            } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnTodosRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosRegistrosActionPerformed
         lblTodosRegistros.setText("");
        try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select id from fornecedor");
            ArrayList todosRegistros = new ArrayList();
            while(rs.next()){
                todosRegistros.add(rs.getString("id"));
               lblTodosRegistros.setText("ID: " + (todosRegistros).toString().replace("[", "").replace("]", ""));
            }
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosRegistrosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaViewFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroFornecedor;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnIncEmail;
    private javax.swing.JButton btnIncTel;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnTodosRegistros;
    private javax.swing.JTextField cidFornecedor;
    private javax.swing.JTextField dddTelFornecedor;
    private javax.swing.JTextField descFornecedor;
    private javax.swing.JTextField emailFornecedor;
    private javax.swing.JTextField endFornecedor;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblIdFornecedor;
    private javax.swing.JLabel lblTodosRegistros;
    private javax.swing.JLabel listaEmail;
    private javax.swing.JLabel listaTel;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JTextField numFornecedor;
    private javax.swing.JTextField refEmail;
    private javax.swing.JTextField refTel;
    private javax.swing.JTextField telFornecedor;
    // End of variables declaration//GEN-END:variables
}
