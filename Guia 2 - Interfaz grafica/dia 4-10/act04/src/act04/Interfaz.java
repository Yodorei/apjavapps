/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act04;

import java.util.TreeSet;

/**
 *
 * @author diego
 */
public class Interfaz extends javax.swing.JFrame {

    public static TreeSet<Producto> listaprod = new TreeSet<>();
    
    
    public Interfaz() {
        initComponents();
        cargaProductos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ConsRubro = new javax.swing.JMenuItem();
        ConsNombre = new javax.swing.JMenuItem();
        ConsPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jMenuItem1.setText("Productos");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        ConsRubro.setText("Por rubro");
        ConsRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsRubroActionPerformed(evt);
            }
        });
        jMenu2.add(ConsRubro);

        ConsNombre.setText("Por nombre");
        ConsNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsNombreActionPerformed(evt);
            }
        });
        jMenu2.add(ConsNombre);

        ConsPrecio.setText("Por precio");
        ConsPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(ConsPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsNombreActionPerformed
        jEscritorio.removeAll(); //borrar pantallas abiertas
        jEscritorio.repaint(); //repinta el desktop
        ConsultaNombre cn = new ConsultaNombre(); //inicializo la ventana
        cn.setVisible(true); // hago visible la ventana
        jEscritorio.add(cn); // agrego al escritorio la ventana
        jEscritorio.moveToFront(cn);//manda al frente la ventana
    }//GEN-LAST:event_ConsNombreActionPerformed

    private void ConsRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsRubroActionPerformed
        jEscritorio.removeAll(); //borrar pantallas abiertas
        jEscritorio.repaint(); //repinta el desktop
        ConsultaRubro cr = new ConsultaRubro(); //inicializo la ventana
        cr.setVisible(true); // hago visible la ventana
        jEscritorio.add(cr); // agrego al escritorio la ventana
        jEscritorio.moveToFront(cr);//manda al frente la ventana
    }//GEN-LAST:event_ConsRubroActionPerformed

    private void ConsPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsPrecioActionPerformed
        jEscritorio.removeAll(); //borrar pantallas abiertas
        jEscritorio.repaint(); //repinta el desktop
        ConsultaPrecio cp = new ConsultaPrecio(); //inicializo la ventana
        cp.setVisible(true); // hago visible la ventana
        jEscritorio.add(cp); // agrego al escritorio la ventana
        jEscritorio.moveToFront(cp);//manda al frente la ventana
    }//GEN-LAST:event_ConsPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsNombre;
    private javax.swing.JMenuItem ConsPrecio;
    private javax.swing.JMenuItem ConsRubro;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    public void cargaProductos(){
        listaprod.add(new Producto(12345, "Azucar", 600, 40, Categoria.COMESTIBLE));
        listaprod.add(new Producto(456123, "Lavandina", 200, 10, Categoria.LIMPIEZA));
        listaprod.add(new Producto(159263, "Perfume carito", 52000, 1, Categoria.PERFUMERIA));
        
    }


}