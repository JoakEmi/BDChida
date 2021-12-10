/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DetalleCompra;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AltasDetalleCompra extends javax.swing.JFrame {

    /**
     * Creates new form AltasDetalleCompra
     */
    public AltasDetalleCompra() {
        initComponents();
        try{
            Connection con1;
            Conexion conect1 = new Conexion();
            con1 = conect1.getConnection();
            String sql = "SELECT * FROM Compras WHERE NumeroCompra=(SELECT max(NumeroCompra) FROM Compras);";

            try (Statement st = con1.createStatement(); ResultSet rs = st.executeQuery(sql)) {
                    
                while(rs.next()){
                    txtNumeroCompra.setText(rs.getString("NumeroCompra"));
                }
                    
            }
                conect1.Desconexion();

            }catch(SQLException e){
                
                JOptionPane.showMessageDialog(null, e,
                    "Error", JOptionPane.OK_OPTION);
            }     
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
        txtNumeroCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        BtnAnadirProducto = new javax.swing.JButton();
        BtnFinalizar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Altas DetalleCompra");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Numero de Compra");

        txtNumeroCompra.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Codigo del Producto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad");

        BtnAnadirProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAnadirProducto.setText("Añadir Producto");
        BtnAnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnadirProductoActionPerformed(evt);
            }
        });

        BtnFinalizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoProducto)
                            .addComponent(txtCantidad))))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BtnAnadirProducto)
                .addGap(52, 52, 52)
                .addComponent(BtnFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAnadirProducto)
                    .addComponent(BtnFinalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnadirProductoActionPerformed
        // TODO add your handling code here:
        if(!txtNumeroCompra.getText().equals("") && !txtCodigoProducto.getText().equals("") && !txtCantidad.getText().equals("")){
            try{
                Connection con1;
                Conexion conect1 = new Conexion();
                con1 = conect1.getConnection();
                String sql = "INSERT INTO DetalleCompra (NumeroCompra, CodigoProducto, Cantidad)"
                + "VALUES('" + txtNumeroCompra.getText() + "','" + txtCodigoProducto.getText() + "','" +
                txtCantidad.getText() +"')";

                try (Statement st = con1.createStatement()) {
                    st.executeUpdate(sql);
                }
                txtCodigoProducto.setText("");
                txtCantidad.setText("");
                
                conect1.Desconexion();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e,
                    "Error", JOptionPane.OK_OPTION);
            }
        }else
        JOptionPane.showMessageDialog(null, "Inserta todos los datos",
            "Error", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_BtnAnadirProductoActionPerformed

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        // TODO add your handling code here:
        txtNumeroCompra.setText("");
        txtCodigoProducto.setText("");
        txtCantidad.setText("");
        this.dispose();
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnadirProducto;
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNumeroCompra;
    // End of variables declaration//GEN-END:variables
}
