/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogigalink;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class TelaDeVendas extends javax.swing.JFrame {
    ConectaBanco conecta = new ConectaBanco();
    
    /**
     * Creates new form TelaDeVendas
     */
    public TelaDeVendas() {
        initComponents();
        setLocationRelativeTo(null);
        conecta.conectar();
        idFornecedor.setVisible(false);
        datahoraformatada.setVisible(false);
        datahora.setEditable(false);
       
         nomeProduto.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
           }

           @Override
           public void focusLost(FocusEvent e) {
               if(nomeProduto.getText().isEmpty()){
                   idPedido.requestFocus();
                   qtPedido.setText("0");
                   valorPedido.setText("0.00");
               }else
                {
            Item item = new Item(0, 0);  
            float a  = item.quantidade = Float.parseFloat(qtPedido.getText());
            float b =  item.valor = Float.parseFloat(valorPedido.getText());
            float soma = a * b; 
               lblValorTotal.setText(Float.toString(soma));
               
       Double frete, desconto, valorPedidoFeito, valorTotal;
       
       frete = Double.parseDouble(fretePedido.getText());
       desconto = Double.parseDouble(descPedido.getText());
       valorPedidoFeito = Double.parseDouble(lblValorTotal.getText());
       valorTotal = frete + valorPedidoFeito - desconto;
       valorTotalPedido.setText((valorTotal).toString());
       
            }
           }
       });
        
        qtPedido.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
           }

           @Override
           public void focusLost(FocusEvent e) {
               if(nomeProduto.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Preencher campo do Nome do Produto");
                   nomeProduto.requestFocus();
                   qtPedido.setText("0");
                   valorPedido.setText("0.00");
               }else
                {
            Item item = new Item(0, 0);  
            float a  = item.quantidade = Float.parseFloat(qtPedido.getText());
            float b =  item.valor = Float.parseFloat(valorPedido.getText());
            float soma = a * b; 
            lblValorTotal.setText(Float.toString(soma));
               
       Double frete, desconto, valorPedidoFeito, valorTotal;
       
       frete = Double.parseDouble(fretePedido.getText());
       desconto = Double.parseDouble(descPedido.getText());
       valorPedidoFeito = Double.parseDouble(lblValorTotal.getText());
       valorTotal = frete + valorPedidoFeito - desconto;
       valorTotalPedido.setText((valorTotal).toString());
       
            }
           }
       });
        
         valorPedido.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
           }

           @Override
           public void focusLost(FocusEvent e) {
                if(nomeProduto.getText().isEmpty()){
                   nomeProduto.requestFocus();
                   qtPedido.setText("0");
                   valorPedido.setText("0.00");
               }else
                {
            Item item = new Item(0, 0);  
            float a  = item.quantidade = Float.parseFloat(qtPedido.getText());
            float b =  item.valor = Float.parseFloat(valorPedido.getText());
            float soma = a * b; 
            lblValorTotal.setText(Float.toString(soma));
            
       Double frete, desconto, valorPedidoFeito, valorTotal;
       
       frete = Double.parseDouble(fretePedido.getText());
       desconto = Double.parseDouble(descPedido.getText());
       valorPedidoFeito = Double.parseDouble(lblValorTotal.getText());
       valorTotal = frete + valorPedidoFeito - desconto;
       valorTotalPedido.setText((valorTotal).toString());
       
            }
           }
       });
        
         
          fretePedido.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
           }

           @Override
           public void focusLost(FocusEvent e) {
       Double frete, desconto, valorPedidoFeito, valorTotal;
       
       frete = Double.parseDouble(fretePedido.getText());
       desconto = Double.parseDouble(descPedido.getText());
       valorPedidoFeito = Double.parseDouble(lblValorTotal.getText());
       valorTotal = frete + valorPedidoFeito - desconto;
       valorTotalPedido.setText((valorTotal).toString());
           }
       });
    
    
     descPedido.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
               System.out.println("oi");
           }

           @Override
           public void focusLost(FocusEvent e) {
       Double frete, desconto, valorPedidoFeito, valorTotal;
       
       frete = Double.parseDouble(fretePedido.getText());
       desconto = Double.parseDouble(descPedido.getText());
       valorPedidoFeito = Double.parseDouble(lblValorTotal.getText());
     
       valorTotal = frete + valorPedidoFeito - desconto;
       valorTotalPedido.setText((valorTotal).toString());
           }
       });
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
        jLabel2 = new javax.swing.JLabel();
        idPedido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qtPedido = new javax.swing.JTextField();
        valorPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nomeFornecedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        descFornecedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cidadeFornecedor = new javax.swing.JTextField();
        endFornecedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bairroFornecedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        numFornecedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telFornecedor = new javax.swing.JTextField();
        refTelFornecedor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        emailFornecedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        refEmailFornecedor = new javax.swing.JTextField();
        btnMaisTelefones = new javax.swing.JButton();
        btnMaisEmail = new javax.swing.JButton();
        btnConsultarProduto = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        datahora = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        notaFiscal = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        fretePedido = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        descPedido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        valorTotalPedido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        nomeTransportadora = new javax.swing.JTextField();
        btnFecharPedido = new javax.swing.JButton();
        btnConsultarFornecedor = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        btnConsultarTransportadora = new javax.swing.JButton();
        idFornecedor = new javax.swing.JTextField();
        datahoraformatada = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        lblMaisTelefones = new javax.swing.JLabel();
        lblMaisEmail = new javax.swing.JLabel();
        btnAtualizarPedido = new javax.swing.JButton();
        btnTodosRegistros = new javax.swing.JButton();
        lblTodosRegistros = new javax.swing.JLabel();
        btnTodasTransportadoras = new javax.swing.JButton();
        lblTodasTransportadoras = new javax.swing.JLabel();
        lblTodosFornecedores = new javax.swing.JLabel();
        btnTodosFornecedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("TELA DE VENDAS");

        jLabel2.setText("Código do Pedido:");

        jLabel3.setText("Produto:");

        nomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição:");

        jLabel5.setText("Qt:");

        jLabel6.setText("Valor:");

        qtPedido.setText("0");

        valorPedido.setText("0.00");

        jLabel7.setText("Dados do Produto");

        jLabel8.setText("Dados do Fornecedor");

        jLabel9.setText("Nome:");

        jLabel10.setText("Descrição:");

        jLabel11.setText("Cidade:");

        jLabel12.setText("End:");

        jLabel13.setText("Bairro:");

        jLabel14.setText("Nº:");

        jLabel15.setText("Tel.");

        jLabel16.setText("Email:");

        jLabel17.setText("ref:");

        btnMaisTelefones.setText("Consultar + Telefones");
        btnMaisTelefones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisTelefonesActionPerformed(evt);
            }
        });

        btnMaisEmail.setText("Consultar + Emails");
        btnMaisEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisEmailActionPerformed(evt);
            }
        });

        btnConsultarProduto.setText("Adicionar Produto");
        btnConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProdutoActionPerformed(evt);
            }
        });

        jLabel18.setText("Data/Hora:");

        datahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datahoraActionPerformed(evt);
            }
        });

        jLabel19.setText("Nota Fiscal:");

        jLabel20.setText("Frete:");

        fretePedido.setText("0.00");

        jLabel21.setText("Desconto:");

        descPedido.setText("0.00");

        jLabel22.setText("Valor Total do Pedido:");

        jLabel23.setText("Transportadora:");

        btnFecharPedido.setText("Fechar Pedido");
        btnFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPedidoActionPerformed(evt);
            }
        });

        btnConsultarFornecedor.setText("Consultar Fornecedor");
        btnConsultarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFornecedorActionPerformed(evt);
            }
        });

        jLabel24.setText("Valor Total:");

        btnConsultarTransportadora.setText("Consultar Transportadora");
        btnConsultarTransportadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTransportadoraActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAtualizarPedido.setText("Atualizar Pedido");
        btnAtualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarPedidoActionPerformed(evt);
            }
        });

        btnTodosRegistros.setText("Lista dos Produtos Cadastrados");
        btnTodosRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosRegistrosActionPerformed(evt);
            }
        });

        btnTodasTransportadoras.setText("Todas Transportadoras Cadastradas");
        btnTodasTransportadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasTransportadorasActionPerformed(evt);
            }
        });

        btnTodosFornecedores.setText("Todos Fornecedores");
        btnTodosFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTodosRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTodosRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(idFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(628, 628, 628))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFecharPedido)
                                        .addGap(68, 68, 68)
                                        .addComponent(btnLimpar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(refTelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMaisTelefones))
                                    .addComponent(lblMaisTelefones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMaisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAtualizarPedido)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(emailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(refEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMaisEmail))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datahoraformatada, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(endFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel6))
                                    .addComponent(qtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(valorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nomeTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnConsultarTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnTodasTransportadoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(datahora, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel20)
                                    .addGap(18, 18, 18)
                                    .addComponent(fretePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(descPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(valorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultarFornecedor)
                                .addGap(9, 9, 9)
                                .addComponent(btnTodosFornecedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTodasTransportadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTodosFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datahoraformatada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTodosRegistros)
                    .addComponent(lblTodosRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(descProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(valorPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(qtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(datahora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(fretePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(descPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(nomeTransportadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTodasTransportadoras)
                        .addComponent(jLabel2))
                    .addComponent(btnConsultarTransportadora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTodasTransportadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(idFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(descFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnConsultarFornecedor)
                    .addComponent(btnTodosFornecedores))
                .addGap(2, 2, 2)
                .addComponent(lblTodosFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(endFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(bairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(telFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refTelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaisTelefones)
                    .addComponent(jLabel16)
                    .addComponent(emailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(refEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaisEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaisTelefones, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(lblMaisEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharPedido)
                    .addComponent(btnLimpar)
                    .addComponent(btnAtualizarPedido))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPedidoActionPerformed
             
        if(nomeProduto.getText().isEmpty() || descProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar.");
        }else
        try {   
         
            Statement st = conecta.con.createStatement();
             SimpleDateFormat a1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 SimpleDateFormat a2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                 Date data = new Date();
                 datahoraformatada.setText(a1.format(data));
                 datahora.setText(a2.format(data));     
                 if(nomeTransportadora.getText().isEmpty()){
                     JOptionPane.showMessageDialog(null, "Escolha uma transportadora");
                 }else{
            st.executeUpdate("INSERT INTO pedido values('"+0+"', '"+datahoraformatada.getText()+"', '"+notaFiscal.getText()+"', '"+fretePedido.getText()+"', '"+descPedido.getText()+"', '"+valorTotalPedido.getText()+"')");
            ResultSet rs = (ResultSet) st.executeQuery("SELECT * FROM pedido");
            if(rs.last()){
                idPedido.setText(rs.getString("id"));
            }
          }

        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnFecharPedidoActionPerformed

     @Override
        public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
        
    private void btnConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProdutoActionPerformed
         try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select * from produto where nome LIKE '%" + nomeProduto.getText() + "%'");
            if(nomeProduto.getText().isEmpty()){
                nomeProduto.setText("");
                qtPedido.setText("0");
                valorPedido.setText("0");
                descProduto.setText("");
                lblValorTotal.setText("");
                nomeProduto.requestFocus();
               // JOptionPane.showMessageDialog(null, "Preencher produto");
            }else
            {
            while(rs.next()){
                nomeProduto.setText(rs.getString("nome"));
                descProduto.setText(rs.getString("descricao"));
                valorPedido.setText(rs.getString("valor"));
                idFornecedor.setText(rs.getString("idFornecedor"));
                qtPedido.setText("1");
            }
                
                ResultSet rs3 = st.executeQuery("Select * from fornecedor where id = " + idFornecedor.getText());
            while(rs3.next()){
                nomeFornecedor.setText(rs3.getString("nome"));
                descFornecedor.setText(rs3.getString("descricao"));
                cidadeFornecedor.setText(rs3.getString("cidade"));
                endFornecedor.setText(rs3.getString("endereco"));
                bairroFornecedor.setText(rs3.getString("bairro"));
                numFornecedor.setText(rs3.getString("numero"));
            }
                
                 ResultSet rs4 = st.executeQuery("SELECT * FROM telefone WHERE idFornecedorTel = " + idFornecedor.getText());
             while(rs4.next()){
                telFornecedor.setText("(" + rs4.getString("dddTel") + ") " + rs4.getString("telTel"));
                refTelFornecedor.setText(rs4.getString("refTel"));
             }  
             ResultSet rs5 = st.executeQuery("SELECT * FROM email WHERE idFornecedor = " + idFornecedor.getText());
             while(rs5.next()){
                emailFornecedor.setText(rs5.getString("email"));
                refEmailFornecedor.setText(rs5.getString("ref"));
                                                               
            Item item = new Item(0, 0);  
            float a  = item.quantidade = Float.parseFloat(qtPedido.getText());
            float b =  item.valor = Float.parseFloat(valorPedido.getText());
            float soma = a * b; 
            lblValorTotal.setText(Float.toString(soma));
           
            valorTotalPedido.setText(lblValorTotal.getText());
            
            Double frete, desconto, valorPedidoFeito, valorTotal;
       
       frete = Double.parseDouble(fretePedido.getText());
       desconto = Double.parseDouble(descPedido.getText());
       valorPedidoFeito = Double.parseDouble(lblValorTotal.getText());
       valorTotal = frete + valorPedidoFeito - desconto;
       valorTotalPedido.setText((valorTotal).toString());
       
            }
  
           }//fim else           
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnConsultarProdutoActionPerformed

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed
        if(!nomeProduto.getText().isEmpty()){
            System.out.println("Preencher quantidade do produto");
        }else{
            System.out.println("Escolher Produto");
        }
    }//GEN-LAST:event_nomeProdutoActionPerformed

    private void datahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datahoraActionPerformed
       
    }//GEN-LAST:event_datahoraActionPerformed

    private void btnConsultarTransportadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTransportadoraActionPerformed
            try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select * from transportadora where nome LIKE '%" + nomeTransportadora.getText() + "%'");
                if(rs.next()){
                nomeTransportadora.setText(rs.getString("nome"));
             }   
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarTransportadoraActionPerformed

    private void btnConsultarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFornecedorActionPerformed
            try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select * from fornecedor where nome LIKE '%" + nomeFornecedor.getText() + "%'");
                while(rs.next()){
                idFornecedor.setText(rs.getString("id"));    
                nomeFornecedor.setText(rs.getString("nome"));
                descFornecedor.setText(rs.getString("descricao"));
                cidadeFornecedor.setText(rs.getString("cidade"));
                endFornecedor.setText(rs.getString("endereco"));
                bairroFornecedor.setText(rs.getString("bairro"));
                numFornecedor.setText(rs.getString("numero"));
                
             ResultSet rs1 = st.executeQuery("SELECT * FROM telefone WHERE idFornecedorTel = " + idFornecedor.getText());
             while(rs1.next()){
                telFornecedor.setText("(" + rs1.getString("dddTel") + ") " + rs1.getString("telTel"));
                refTelFornecedor.setText(rs1.getString("refTel"));
                lblMaisTelefones.setText("");
               
             ResultSet rs2 = st.executeQuery("SELECT * FROM email WHERE idFornecedor = " + idFornecedor.getText());
             while(rs2.next()){
                emailFornecedor.setText(rs2.getString("email"));
                refEmailFornecedor.setText(rs2.getString("ref"));
                lblMaisEmail.setText("");
                }
             }
           } 
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarFornecedorActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       nomeProduto.setText("");
       descProduto.setText("");
       qtPedido.setText("0");
       valorPedido.setText("0.00");
       lblValorTotal.setText("");
       valorTotalPedido.setText("0.00");
       datahora.setText("");
       notaFiscal.setText("");
       fretePedido.setText("0.00");
       descPedido.setText("0.00");
       nomeTransportadora.setText("");
       idPedido.setText("");
       idFornecedor.setText("");
       nomeFornecedor.setText("");
       descFornecedor.setText("");
       cidadeFornecedor.setText("");
       endFornecedor.setText("");
       bairroFornecedor.setText("");
       numFornecedor.setText("");
       telFornecedor.setText("");
       refTelFornecedor.setText("");
       emailFornecedor.setText("");
       refEmailFornecedor.setText("");
       lblMaisTelefones.setText("");
       lblTodasTransportadoras.setText("");
       lblTodosRegistros.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnMaisTelefonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisTelefonesActionPerformed
         try {

            Statement st = conecta.con.createStatement();
                       ArrayList arr = new ArrayList();
            ResultSet rs = st.executeQuery("Select * from telefone where idFornecedorTel = " + idFornecedor.getText());
            int linhas = 0;
            while(rs.next()){
                linhas ++;
                System.out.println("Linhas " + linhas);
                arr.add(rs.getString("dddTel") + (" ") + (rs.getString("telTel")));               
            }
                    lblMaisTelefones.setText((arr).toString().replace("[", "").replace("]", ""));
                    System.out.println((arr));

        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMaisTelefonesActionPerformed

    private void btnMaisEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisEmailActionPerformed
         try {

            Statement st = conecta.con.createStatement();
                       ArrayList arr = new ArrayList();
            ResultSet rs = st.executeQuery("Select * from email where idFornecedor = " + idFornecedor.getText());
            while(rs.next()){
                arr.add(rs.getString("email"));               
            }
                    lblMaisEmail.setText((arr).toString().replace("[", "").replace("]", ""));
                    System.out.println((arr));

        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMaisEmailActionPerformed

    private void btnAtualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPedidoActionPerformed
         if(nomeProduto.getText().isEmpty() || descProduto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar.");
        }else
        try {   
         
            Statement st = conecta.con.createStatement();
             SimpleDateFormat a1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 SimpleDateFormat a2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                 Date data = new Date();
                 datahoraformatada.setText(a1.format(data));
                 datahora.setText(a2.format(data));     
            st.executeUpdate("UPDATE pedido SET  id = '"+idPedido.getText()+"', notaFiscalPedido = '"+notaFiscal.getText()+"', fretePedido = '"+fretePedido.getText()+"', descPedido = '"+descPedido.getText()+"', valorTotal = '"+valorTotalPedido.getText()+"' WHERE id = " + idPedido.getText());
    
        } catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_btnAtualizarPedidoActionPerformed

    private void btnTodosRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosRegistrosActionPerformed
        try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select nome from produto");
            ArrayList todosRegistros = new ArrayList();
            while(rs.next()){
                todosRegistros.add(rs.getString("nome"));
               lblTodosRegistros.setText("Produtos Cadastrados: " + (todosRegistros).toString().replace("[", "").replace("]", ""));
            }
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosRegistrosActionPerformed

    private void btnTodasTransportadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasTransportadorasActionPerformed
        try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select nome from transportadora");
            ArrayList todosRegistros = new ArrayList();
            while(rs.next()){
                todosRegistros.add(rs.getString("nome"));
               lblTodasTransportadoras.setText("Transportadoras Cadastradas: " + (todosRegistros).toString().replace("[", "").replace("]", ""));
            }
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodasTransportadorasActionPerformed

    private void btnTodosFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosFornecedoresActionPerformed
        try {

            Statement st = conecta.con.createStatement();
            ResultSet rs = st.executeQuery("Select nome from fornecedor");
            ArrayList todosRegistros = new ArrayList();
            while(rs.next()){
                todosRegistros.add(rs.getString("nome"));
               lblTodosFornecedores.setText("Fornecedores Cadastrados: " + (todosRegistros).toString().replace("[", "").replace("]", ""));
            }
         }
         catch (SQLException ex) {
            Logger.getLogger(TelaViewFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTodosFornecedoresActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroFornecedor;
    private javax.swing.JButton btnAtualizarPedido;
    private javax.swing.JButton btnConsultarFornecedor;
    private javax.swing.JButton btnConsultarProduto;
    private javax.swing.JButton btnConsultarTransportadora;
    private javax.swing.JButton btnFecharPedido;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMaisEmail;
    private javax.swing.JButton btnMaisTelefones;
    private javax.swing.JButton btnTodasTransportadoras;
    private javax.swing.JButton btnTodosFornecedores;
    private javax.swing.JButton btnTodosRegistros;
    private javax.swing.JTextField cidadeFornecedor;
    private javax.swing.JTextField datahora;
    private javax.swing.JTextField datahoraformatada;
    private javax.swing.JTextField descFornecedor;
    private javax.swing.JTextField descPedido;
    private javax.swing.JTextField descProduto;
    private javax.swing.JTextField emailFornecedor;
    private javax.swing.JTextField endFornecedor;
    private javax.swing.JTextField fretePedido;
    private javax.swing.JTextField idFornecedor;
    private javax.swing.JTextField idPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMaisEmail;
    private javax.swing.JLabel lblMaisTelefones;
    private javax.swing.JLabel lblTodasTransportadoras;
    private javax.swing.JLabel lblTodosFornecedores;
    private javax.swing.JLabel lblTodosRegistros;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTextField nomeTransportadora;
    private javax.swing.JTextField notaFiscal;
    private javax.swing.JTextField numFornecedor;
    private javax.swing.JTextField qtPedido;
    private javax.swing.JTextField refEmailFornecedor;
    private javax.swing.JTextField refTelFornecedor;
    private javax.swing.JTextField telFornecedor;
    private javax.swing.JTextField valorPedido;
    private javax.swing.JTextField valorTotalPedido;
    // End of variables declaration//GEN-END:variables
}
