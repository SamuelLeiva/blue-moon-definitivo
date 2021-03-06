/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluemoon.vistas;

import java.awt.Container;

/**
 *
 * @author LENOVO
 */
public class MainAlmacenero extends javax.swing.JFrame {

    Inventario inventario = new Inventario();
    PedidosCompra pedidos = new PedidosCompra();
    
    
    public MainAlmacenero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabInventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabPedidos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tabGuiasSalida = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tabGuiasEntrada = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tabProductos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 63, 159));

        tabInventario.setBackground(new java.awt.Color(255, 207, 38));
        tabInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabInventarioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Inventario");

        javax.swing.GroupLayout tabInventarioLayout = new javax.swing.GroupLayout(tabInventario);
        tabInventario.setLayout(tabInventarioLayout);
        tabInventarioLayout.setHorizontalGroup(
            tabInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInventarioLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabInventarioLayout.setVerticalGroup(
            tabInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPedidos.setBackground(new java.awt.Color(48, 63, 159));
        tabPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPedidosMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pedidos");

        javax.swing.GroupLayout tabPedidosLayout = new javax.swing.GroupLayout(tabPedidos);
        tabPedidos.setLayout(tabPedidosLayout);
        tabPedidosLayout.setHorizontalGroup(
            tabPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(tabPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabPedidosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabPedidosLayout.setVerticalGroup(
            tabPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(tabPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabPedidosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabGuiasSalida.setBackground(new java.awt.Color(48, 63, 159));
        tabGuiasSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabGuiasSalidaMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Guías de Salida");

        javax.swing.GroupLayout tabGuiasSalidaLayout = new javax.swing.GroupLayout(tabGuiasSalida);
        tabGuiasSalida.setLayout(tabGuiasSalidaLayout);
        tabGuiasSalidaLayout.setHorizontalGroup(
            tabGuiasSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(tabGuiasSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabGuiasSalidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabGuiasSalidaLayout.setVerticalGroup(
            tabGuiasSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(tabGuiasSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabGuiasSalidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabGuiasEntrada.setBackground(new java.awt.Color(48, 63, 159));
        tabGuiasEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabGuiasEntradaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Guías de Entrada");

        javax.swing.GroupLayout tabGuiasEntradaLayout = new javax.swing.GroupLayout(tabGuiasEntrada);
        tabGuiasEntrada.setLayout(tabGuiasEntradaLayout);
        tabGuiasEntradaLayout.setHorizontalGroup(
            tabGuiasEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(tabGuiasEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabGuiasEntradaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabGuiasEntradaLayout.setVerticalGroup(
            tabGuiasEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(tabGuiasEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabGuiasEntradaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabProductos.setBackground(new java.awt.Color(48, 63, 159));
        tabProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProductosMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Productos");

        javax.swing.GroupLayout tabProductosLayout = new javax.swing.GroupLayout(tabProductos);
        tabProductos.setLayout(tabProductosLayout);
        tabProductosLayout.setHorizontalGroup(
            tabProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(tabProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        tabProductosLayout.setVerticalGroup(
            tabProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(tabProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tabProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cerrar Sesión");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Bienvenido, ");
        labelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabGuiasSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabGuiasEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(labelUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(labelUsuario)
                .addGap(30, 30, 30)
                .addComponent(tabInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabGuiasEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabGuiasSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel15)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUsuarioMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void tabProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductosMouseClicked
        
        /*panelInventario.setVisible(false); tabInventario.setBackground(Color.decode("#303F9F"));
        panelPedidos.setVisible(false); tabPedidos.setBackground(Color.decode("#303F9F"));
        panelGuiasEntrada.setVisible(false); tabGuiasEntrada.setBackground(Color.decode("#303F9F"));
        panelGuiasSalida.setVisible(false); tabGuiasSalida.setBackground(Color.decode("#303F9F"));
        panelProductos.setVisible(true); tabProductos.setBackground(Color.decode("#FFCF26"));*/
    }//GEN-LAST:event_tabProductosMouseClicked

    private void tabGuiasEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGuiasEntradaMouseClicked
        /*panelInventario.setVisible(false); tabInventario.setBackground(Color.decode("#303F9F"));
        panelPedidos.setVisible(false); tabPedidos.setBackground(Color.decode("#303F9F"));
        panelGuiasEntrada.setVisible(true); tabGuiasEntrada.setBackground(Color.decode("#FFCF26"));
        panelGuiasSalida.setVisible(false); tabGuiasSalida.setBackground(Color.decode("#303F9F"));
        panelProductos.setVisible(false); tabProductos.setBackground(Color.decode("#303F9F"));*/
    }//GEN-LAST:event_tabGuiasEntradaMouseClicked

    private void tabGuiasSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabGuiasSalidaMouseClicked
        /*panelInventario.setVisible(false); tabInventario.setBackground(Color.decode("#303F9F"));
        panelPedidos.setVisible(false); tabPedidos.setBackground(Color.decode("#303F9F"));
        panelGuiasEntrada.setVisible(false); tabGuiasEntrada.setBackground(Color.decode("#303F9F"));
        panelGuiasSalida.setVisible(true); tabGuiasSalida.setBackground(Color.decode("#FFCF26"));
        panelProductos.setVisible(false); tabProductos.setBackground(Color.decode("#303F9F"));*/
    }//GEN-LAST:event_tabGuiasSalidaMouseClicked

    private void tabPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPedidosMouseClicked
        
        scrollPanel.setViewportView(pedidos);
        
        /*panelInventario.setVisible(false); tabInventario.setBackground(Color.decode("#303F9F"));
        panelPedidos.setVisible(true); tabPedidos.setBackground(Color.decode("#FFCF26"));
        panelGuiasEntrada.setVisible(false); tabGuiasEntrada.setBackground(Color.decode("#303F9F"));
        panelGuiasSalida.setVisible(false); tabGuiasSalida.setBackground(Color.decode("#303F9F"));
        panelProductos.setVisible(false); tabProductos.setBackground(Color.decode("#303F9F"));*/
    }//GEN-LAST:event_tabPedidosMouseClicked

    private void tabInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInventarioMouseClicked
        
        scrollPanel.setViewportView(inventario);
        /*InventarioForm inv = new InventarioForm();
        this.add(inv);
        inv.setVisible(true);*/
        /*panelInventario.setVisible(true); tabInventario.setBackground(Color.decode("#FFCF26"));
        panelPedidos.setVisible(false); tabPedidos.setBackground(Color.decode("#303F9F"));
        panelGuiasEntrada.setVisible(false); tabGuiasEntrada.setBackground(Color.decode("#303F9F"));
        panelGuiasSalida.setVisible(false); tabGuiasSalida.setBackground(Color.decode("#303F9F"));
        panelProductos.setVisible(false); tabProductos.setBackground(Color.decode("#303F9F"));*/

    }//GEN-LAST:event_tabInventarioMouseClicked

 
    
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
            java.util.logging.Logger.getLogger(MainAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAlmacenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainAlmacenero().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JPanel tabGuiasEntrada;
    private javax.swing.JPanel tabGuiasSalida;
    private javax.swing.JPanel tabInventario;
    private javax.swing.JPanel tabPedidos;
    private javax.swing.JPanel tabProductos;
    // End of variables declaration//GEN-END:variables
}
