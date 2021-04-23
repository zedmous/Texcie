
package pkg911;

import javax.swing.DefaultListModel;

public class Menu extends javax.swing.JFrame {

    private DefaultListModel datos;
    private VPlanilla vplanilla;
   
    public Menu() {
        initComponents();
        datos = new DefaultListModel();
       
        vplanilla= new VPlanilla(datos);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btndenuncia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btndenuncias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Denuncia");

        btndenuncia.setText("Nueva");
        btndenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndenunciaActionPerformed(evt);
            }
        });
        jMenu1.add(btndenuncia);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listado");

        btndenuncias.setText("Lista de Denuncias");
        btndenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndenunciasActionPerformed(evt);
            }
        });
        jMenu2.add(btndenuncias);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndenunciaActionPerformed
        // TODO add your handling code here:
        vplanilla.setVisible(true);
    }//GEN-LAST:event_btndenunciaActionPerformed

    private void btndenunciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndenunciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndenunciasActionPerformed

    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btndenuncia;
    private javax.swing.JMenuItem btndenuncias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
