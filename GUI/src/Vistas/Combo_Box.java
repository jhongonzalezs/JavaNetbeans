/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus X505B
 */
public class Combo_Box extends javax.swing.JFrame {

    /**
     * Creates new form Combo_Box
     */
    public Combo_Box() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Portada = new javax.swing.JLabel();
        Ventada2Name = new javax.swing.JLabel();
        Ventana2Direccion = new javax.swing.JLabel();
        Ventana2Sexo = new javax.swing.JLabel();
        Elegir = new javax.swing.JComboBox<>();
        Rprograma = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        POP = new javax.swing.JLabel();
        Regeton = new javax.swing.JLabel();
        bolero = new javax.swing.JLabel();
        baladas = new javax.swing.JLabel();
        cumbia = new javax.swing.JLabel();
        rock = new javax.swing.JLabel();
        champeta = new javax.swing.JLabel();
        rap = new javax.swing.JLabel();
        ranchera = new javax.swing.JLabel();
        hiphop = new javax.swing.JLabel();
        jazz = new javax.swing.JLabel();
        vallenato = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        User = new javax.swing.JMenu();
        Inicio = new javax.swing.JCheckBoxMenuItem();
        Perfil = new javax.swing.JCheckBoxMenuItem();
        close = new javax.swing.JCheckBoxMenuItem();
        Inf = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        Novedad = new javax.swing.JMenu();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Portada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user_person_people_6100.png"))); // NOI18N
        getContentPane().add(Portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 150));

        Ventada2Name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Ventada2Name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Ventada2Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        Ventana2Direccion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Ventana2Direccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Ventana2Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 30));

        Ventana2Sexo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Ventana2Sexo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Ventana2Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, 30));

        Elegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Duda Alguna", "Tal Vez", "No estoy seguro", "Nunca" }));
        getContentPane().add(Elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 180, 40));

        Rprograma.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Rprograma.setText("Recomendaria Nuestro Programa");
        getContentPane().add(Rprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, 60));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gustos Musicales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 150, 30));

        POP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        POP.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(POP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 30));

        Regeton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Regeton.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Regeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 50, 30));

        bolero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bolero.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bolero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 70, 30));

        baladas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        baladas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(baladas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 70, 30));

        cumbia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cumbia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cumbia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 60, 30));

        rock.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rock.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 70, 30));

        champeta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        champeta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(champeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 60, 30));

        rap.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rap.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rap, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 60, 30));

        ranchera.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ranchera.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ranchera, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 50, 30));

        hiphop.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hiphop.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hiphop, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 60, 30));

        jazz.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jazz.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jazz, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 60, 30));

        vallenato.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vallenato.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vallenato, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 50, 30));

        Fondo3.setForeground(new java.awt.Color(255, 255, 255));
        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo3.jpg"))); // NOI18N
        getContentPane().add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 599, 420));

        User.setText("User");

        Inicio.setSelected(true);
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        User.add(Inicio);

        Perfil.setSelected(true);
        Perfil.setText("Perfil");
        Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilActionPerformed(evt);
            }
        });
        User.add(Perfil);

        close.setSelected(true);
        close.setText("Cerrar Sesion");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        User.add(close);

        jMenuBar1.add(User);

        Inf.setText("Informacion");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("¿Quienes Somos?");
        Inf.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("¿Que hacemos?");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        Inf.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("¿Que Buscamos?");
        Inf.add(jCheckBoxMenuItem3);

        jMenuBar1.add(Inf);

        Novedad.setText("Novedades");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Gustos");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        Novedad.add(jCheckBoxMenuItem4);

        jMenuBar1.add(Novedad);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        Scroll_Bar Sig = new Scroll_Bar();
        Sig.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InicioActionPerformed

    private void PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilActionPerformed
        
    }//GEN-LAST:event_PerfilActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       int n = JOptionPane.showConfirmDialog(null, "¿Seguro que decea cerrar sesion?",
        "Confirmación", JOptionPane.YES_NO_OPTION);
     if(n==JOptionPane.YES_OPTION)
      {
       JOptionPane.showMessageDialog(null, "Gracias por elergirnos");
        System.exit(0);
      }
    }//GEN-LAST:event_closeActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
       Check_Box nueva = new Check_Box();
       nueva.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JOptionPane.showMessageDialog(null, "Gracias Por su opinion, seguiremos mejorando");
       Elegir.setVisible(false);
       Rprograma.setVisible(false);
       jButton1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Combo_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combo_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combo_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combo_Box.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combo_Box().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Elegir;
    public static javax.swing.JLabel Fondo3;
    private javax.swing.JMenu Inf;
    private javax.swing.JCheckBoxMenuItem Inicio;
    private javax.swing.JMenu Novedad;
    public static javax.swing.JLabel POP;
    private javax.swing.JCheckBoxMenuItem Perfil;
    private javax.swing.JLabel Portada;
    public static javax.swing.JLabel Regeton;
    private javax.swing.JLabel Rprograma;
    private javax.swing.JMenu User;
    public static javax.swing.JLabel Ventada2Name;
    public static javax.swing.JLabel Ventana2Direccion;
    public static javax.swing.JLabel Ventana2Sexo;
    public static javax.swing.JLabel baladas;
    public static javax.swing.JLabel bolero;
    public static javax.swing.JLabel champeta;
    private javax.swing.JCheckBoxMenuItem close;
    public static javax.swing.JLabel cumbia;
    public static javax.swing.JLabel hiphop;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel jazz;
    public static javax.swing.JLabel ranchera;
    public static javax.swing.JLabel rap;
    public static javax.swing.JLabel rock;
    public static javax.swing.JLabel vallenato;
    // End of variables declaration//GEN-END:variables
}
