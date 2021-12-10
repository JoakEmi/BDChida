//Interfaz Secundaria

package Clases;

import Conexiones.Conexion;
import Productos.*;
import Clientes.*;
import Proveedores.*;
import Cajeros.*;
import Ventas.*;
import DetalleVenta.*;
import Compras.*;
//import DetalleCompra.*;
import Categoria.*;
import Marca.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InterfazSecundaria extends javax.swing.JFrame {
    
    String tabla;
    
    public InterfazSecundaria(String tabla) {
        this.tabla = tabla;
        initComponents();
        jLabel2.setText(tabla);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Altas = new javax.swing.JButton();
        Bajas = new javax.swing.JButton();
        Cambios = new javax.swing.JButton();
        Consultas = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);

        Altas.setText("ALTAS");
        Altas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasActionPerformed(evt);
            }
        });

        Bajas.setText("BAJAS");
        Bajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajasActionPerformed(evt);
            }
        });

        Cambios.setText("CAMBIOS");
        Cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiosActionPerformed(evt);
            }
        });

        Consultas.setText("CONSULTAS");
        Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasActionPerformed(evt);
            }
        });

        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENÚ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Consultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Altas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bajas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cambios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Altas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bajas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cambios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Consultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiosActionPerformed
        if(tabla.equals("Productos")){
            CambiosProductos cambiosproductos = new CambiosProductos();
            cambiosproductos.setVisible(true);
        }else if(tabla.equals("Clientes")){
            CambiosClientes cambiosclientes = new CambiosClientes();
            cambiosclientes.setVisible(true);
        }else if(tabla.equals("Proveedores")){
            CambiosProveedores cambiosproveedores = new CambiosProveedores();
            cambiosproveedores.setVisible(true);
        }else if(tabla.equals("Cajeros")){
            CambiosCajeros cambioscajeros = new CambiosCajeros();
            cambioscajeros.setVisible(true);
        }else if(tabla.equals("Ventas")){
            CambiosVentas cambiosVentas = new CambiosVentas();
            cambiosVentas.setVisible(true);
        }else if(tabla.equals("DetalleVenta")){
            CambiosDetalleVenta cambiosDetalleVenta = new CambiosDetalleVenta();
            cambiosDetalleVenta.setVisible(true);
        }else if(tabla.equals("Compras")){
            CambiosCompras cambiosCompras = new CambiosCompras();
            cambiosCompras.setVisible(true);
        }else if(tabla.equals("DetalleCompra")){
            //CambiosDetalleCompra cambiosDetalleCompra = new CambiosDetalleCompra();
            //cambiosDetalleCompra.setVisible(true);
        }else if(tabla.equals("Categoria")){
            CambiosCategoria cambiosCategoria = new CambiosCategoria();
            cambiosCategoria.setVisible(true);
        }else if(tabla.equals("Marca")){
            CambiosMarca cambiosMarca = new CambiosMarca();
            cambiosMarca.setVisible(true);
        }
        
    }//GEN-LAST:event_CambiosActionPerformed

    private void AltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasActionPerformed
        if(tabla.equals("Productos")){
            AltasProductos altasproductos = new AltasProductos();
            altasproductos.setVisible(true);
        }else if(tabla.equals("Clientes")){
            AltasClientes altasclientes = new AltasClientes();
            altasclientes.setVisible(true);
        }else if(tabla.equals("Proveedores")){
            AltasProveedores altasproveedores = new AltasProveedores();
            altasproveedores.setVisible(true);
        }else if(tabla.equals("Cajeros")){
            AltasCajeros altasCajeros = new AltasCajeros();
            altasCajeros.setVisible(true);
        }else if(tabla.equals("Ventas")){
            AltasVentas altasVentas = new AltasVentas();
            altasVentas.setVisible(true);
        }else if(tabla.equals("DetalleVenta")){
            AltasDetalleVenta altasDetalleVenta = new AltasDetalleVenta();
            altasDetalleVenta.setVisible(true);
        }else if(tabla.equals("Compras")){
            AltasCompras altasCompras = new AltasCompras();
            altasCompras.setVisible(true);
        }else if(tabla.equals("DetalleCompra")){
            //AltasDetalleCompra altasDetalleCompra = new AltasDetalleCompra();
            //altasDetalleCompra.setVisible(true);
        }else if(tabla.equals("Categoria")){
            AltasCategoria altasCategoria = new AltasCategoria();
            altasCategoria.setVisible(true);
        }else if(tabla.equals("Marca")){
            AltasMarca altasMarca = new AltasMarca();
            altasMarca.setVisible(true);
        }
        
    }//GEN-LAST:event_AltasActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void BajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajasActionPerformed
        if(tabla.equals("Productos")){
            BajasProductos bajasproductos = new BajasProductos();
            bajasproductos.setVisible(true);
        }else if(tabla.equals("Clientes")){
            BajasClientes bajasclientes = new BajasClientes();
            bajasclientes.setVisible(true);
        }else if(tabla.equals("Proveedores")){
            BajasProveedores bajasproveedores = new BajasProveedores();
            bajasproveedores.setVisible(true);
        }else if(tabla.equals("Cajeros")){
            BajasCajeros bajasCajeros = new BajasCajeros();
            bajasCajeros.setVisible(true);
        }else if(tabla.equals("Ventas")){
            BajasVentas bajasVentas = new BajasVentas();
            bajasVentas.setVisible(true);
        }else if(tabla.equals("DetalleVenta")){
            BajasDetalleVenta bajasDetalleVenta = new BajasDetalleVenta();
            bajasDetalleVenta.setVisible(true);
        }else if(tabla.equals("Compras")){
            BajasCompras bajasCompras = new BajasCompras();
            bajasCompras.setVisible(true);
        }else if(tabla.equals("DetalleCompra")){
            //BajasDetalleCompra bajasDetalleCompra = new BajasDetalleCompra();
            //bajasDetalleCompra.setVisible(true);
        }else if(tabla.equals("Categoria")){
            BajasCategoria bajasCategoria = new BajasCategoria();
            bajasCategoria.setVisible(true);        
        }else if(tabla.equals("Marca")){
            BajasMarca bajasMarca = new BajasMarca();
            bajasMarca.setVisible(true);
        }
        
        
    }//GEN-LAST:event_BajasActionPerformed

    private void ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasActionPerformed
        if(tabla.equals("Productos")){
            ConsultasProductos Cosnultasproductos = new ConsultasProductos();
            Cosnultasproductos.setVisible(true);
        }else if(tabla.equals("Clientes")){
            ConsultasClientes consultasclientes = new ConsultasClientes();
            consultasclientes.setVisible(true);
        }else if(tabla.equals("Proveedores")){
            ConsultasProveedores consultasproveedores = new ConsultasProveedores();
            consultasproveedores.setVisible(true);
        }else if(tabla.equals("Cajeros")){
            ConsultasCajeros consultasCajeros = new ConsultasCajeros();
            consultasCajeros.setVisible(true);
        }else if(tabla.equals("Ventas")){
            ConsultasVentas consultasVentas = new ConsultasVentas();
            consultasVentas.setVisible(true);
        }else if(tabla.equals("DetalleVenta")){
            ConsultasDetalleVenta consultasDetalleVenta = new ConsultasDetalleVenta();
            consultasDetalleVenta.setVisible(true);
        }else if(tabla.equals("Compras")){
            ConsultasCompras consultasCompras = new ConsultasCompras();
            consultasCompras.setVisible(true);
        }else if(tabla.equals("DetalleCompra")){
            //ConsultasDetalleCompra consultasDetalleCompra = new ConsultasDetalleCompra();
            //consultasDetalleCompra.setVisible(true);
        }else if(tabla.equals("Categoria")){
            ConsultasCategoria consultasCategoria = new ConsultasCategoria();
            consultasCategoria.setVisible(true);            
        }else if(tabla.equals("Marca")){
            ConsultasMarca consultasMarca = new ConsultasMarca();
            consultasMarca.setVisible(true);
        }                                    
    }//GEN-LAST:event_ConsultasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Altas;
    private javax.swing.JButton Bajas;
    private javax.swing.JButton Cambios;
    private javax.swing.JButton Consultas;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
