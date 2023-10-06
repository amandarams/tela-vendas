/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaprocessodevendas;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class TelaProcessoVendas extends javax.swing.JFrame {
   private double valorTotalAcumulado = 0.0;
   private StringBuilder informacoesVenda = new StringBuilder();
   private Map<String, Double> produtosValor = new HashMap<>();

    public TelaProcessoVendas() {
{
    initComponents();
    produtosValor.put("Bola de futebol", 30.0);
    produtosValor.put("Bola de basquete", 40.0);
    produtosValor.put("Óculos de natação", 200.0);
    produtosValor.put("Tênis de corrida", 40.0);
    produtosValor.put("Camisa de Time", 400.0);
    produtosValor.put("Chuteira", 250.0);
    produtosValor.put("Luva de goleiro", 200.0);
    produtosValor.put("Luva de goleiro", 200.0);
    produtosValor.put("Cesta de basquete", 100.0);
    produtosValor.put("Suplemento", 150.0);
        
        
    
}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        produtosLabel = new javax.swing.JLabel();
        quantidadeLabel = new javax.swing.JLabel();
        clientesLabel = new javax.swing.JLabel();
        produtosComboBox = new javax.swing.JComboBox<>();
        txtQuantidade = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        clienteComboBox = new javax.swing.JComboBox<>();
        btnCarrinho = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        produtosLabel.setText("Produtos:");

        quantidadeLabel.setText("Quantidade:");

        clientesLabel.setText("Clientes:");

        produtosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bola de futebol", "Chuteira", "Tênis de corrida", "Suplemento", "Bola de basquete", "Óculos de natação", "Camisa de time", "Mochila" }));
        produtosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosComboBoxActionPerformed(evt);
            }
        });

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        jLabel.setText("PROCESSO DE VENDAS - OUTLET STORE");

        clienteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente 1", "Cliente 2", "Cliente 3", "Cliente 4" }));

        btnCarrinho.setText("Adicionar ao Carrinho");
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar Venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        totalLabel.setText("Valor Total R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(clientesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(produtosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45)
                .addComponent(quantidadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtosLabel)
                    .addComponent(produtosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeLabel)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientesLabel)
                    .addComponent(clienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(totalLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarrinho)
                    .addComponent(btnFinalizar))
                .addGap(82, 82, 82))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed

    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void produtosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosComboBoxActionPerformed


    }//GEN-LAST:event_produtosComboBoxActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
  
  String quantidadeText = txtQuantidade.getText();

try {
   int quantidade = Integer.parseInt(quantidadeText);

   if (quantidade >= 1 && quantidade <= 10) {
	String produtoSelecionado = (String) produtosComboBox.getSelectedItem();
        double valorProduto = produtosValor.get(produtoSelecionado);
	
	double valorProdutoAtual = quantidade * valorProduto;

       informacoesVenda.append("Produto: ").append(produtoSelecionado)
       .append(" - Quantidade: ").append(quantidade)
       .append(" - Valor: R$").append(String.format("%.2f", valorProdutoAtual))
       .append("\n");

       valorTotalAcumulado += valorProdutoAtual;
       totalLabel.setText("Valor Total R$: "+ String.format("%.2f", valorTotalAcumulado));
       
       txtQuantidade.setText("");

	JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho!");
   } else {
	JOptionPane.showMessageDialog(null, "Produto possui de 1 a 10 unidades");

   }
} catch (NumberFormatException e ) {
	JOptionPane.showMessageDialog(null,"Digite um número válido");
 }

    }//GEN-LAST:event_btnCarrinhoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       JOptionPane.showMessageDialog(null, "Venda Finalizada com sucesso!");
        
    
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
    
   char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
   
    }
      
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProcessoVendas().setVisible(true);
            }
        });
        
       
    }//GEN-LAST:event_txtQuantidadeKeyTyped


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> clienteComboBox;
    private javax.swing.JLabel clientesLabel;
    private javax.swing.JLabel jLabel;
    private javax.swing.JComboBox<String> produtosComboBox;
    private javax.swing.JLabel produtosLabel;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
