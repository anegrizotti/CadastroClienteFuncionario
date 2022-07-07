package com.mycompany.atv.trabeng.apresentação;

import com.mycompany.atv.trabeng.dominio.Cliente;
import com.mycompany.atv.trabeng.dominio.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

   public static ArrayList<Cliente> lista_clientes = new ArrayList<Cliente>();
   public static ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCliente = new javax.swing.JLabel();
        labelFuncionario = new javax.swing.JLabel();
        btnVisualizarFuncionario = new javax.swing.JButton();
        btnCadastrarFuncionario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCadastrarCliente = new javax.swing.JButton();
        btnVisualizarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCliente.setText("Clientes");

        labelFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelFuncionario.setText("Funcionários");

        btnVisualizarFuncionario.setText("Visualizar");
        btnVisualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarFuncionarioActionPerformed(evt);
            }
        });

        btnCadastrarFuncionario.setText("Cadastrar");
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnVisualizarCliente.setText("Visualizar");
        btnVisualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarClienteActionPerformed(evt);
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
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(labelCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVisualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelFuncionario)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelFuncionario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        this.dispose();
        TelaCadastroFuncionario cadastroFuncionario = new TelaCadastroFuncionario();
        cadastroFuncionario.setLocationRelativeTo(null);
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnVisualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarFuncionarioActionPerformed
        if (!lista_funcionarios.isEmpty()) {
            for (int i=0; i<lista_funcionarios.size(); i++) {
                lista_funcionarios.get(i).imprimir();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há nenhum funcionário cadastrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnVisualizarFuncionarioActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        this.dispose();
        TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
        cadastroCliente.setLocationRelativeTo(null);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnVisualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarClienteActionPerformed
        if (!lista_clientes.isEmpty()) {
            for (int i=0; i<lista_clientes.size(); i++) {
                lista_clientes.get(i).imprimir();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há nenhum cliente cadastrado.", "ERRO", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnVisualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnVisualizarCliente;
    private javax.swing.JButton btnVisualizarFuncionario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelFuncionario;
    // End of variables declaration//GEN-END:variables
}
