/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio09;

import java.awt.event.KeyEvent;

/**
 *
 * @author emers
 */
public class Pantallajuego extends javax.swing.JFrame {

    /**
     * Creates new form Pantallajuego
     */
    public Pantallajuego() {
        initComponents();
        bala.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        tank = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bala = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel4KeyPressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tank.setBackground(new java.awt.Color(204, 204, 255));
        tank.setForeground(new java.awt.Color(255, 204, 0));
        tank.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        tank.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 20, 30));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        tank.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 50));

        jPanel4.add(tank, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 140, 100));

        bala.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout balaLayout = new javax.swing.GroupLayout(bala);
        bala.setLayout(balaLayout);
        balaLayout.setHorizontalGroup(
            balaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        balaLayout.setVerticalGroup(
            balaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel4.add(bala, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 20, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            
            tank.setBounds(tank.getX(), tank.getY()-5,
                    tank.getWidth(), tank.getHeight());
        }else  if(evt.getKeyCode() == KeyEvent.VK_UP){
            
            tank.setBounds(tank.getX(), tank.getY()+5,
                    tank.getWidth(), tank.getHeight());
        }
            
        
        
        
    }//GEN-LAST:event_jPanel4KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_UP){
            
            tank.setBounds(tank.getX(), tank.getY()-5,
                    tank.getWidth(), tank.getHeight());
        }else  if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            
            tank.setBounds(tank.getX(), tank.getY()+5,
                    tank.getWidth(), tank.getHeight());
        }
        else  if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
            
            tank.setBounds(tank.getX()+5, tank.getY(),
                    tank.getWidth(), tank.getHeight());
        }
        else  if(evt.getKeyCode() == KeyEvent.VK_LEFT ){
            
            tank.setBounds(tank.getX()-5, tank.getY()+5,
                    tank.getWidth(), tank.getHeight());
        }
        else  if(evt.getKeyCode() == KeyEvent.VK_SPACE ){
            
           bala.setVisible(true);
        }
              
        
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Pantallajuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantallajuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantallajuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantallajuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantallajuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bala;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel tank;
    // End of variables declaration//GEN-END:variables
}
