
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import rojerusan.RSPanelsSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 57302
 */
public class vista extends javax.swing.JFrame {

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
        this.setTitle("Domino");
        this.setIconImage(new ImageIcon (getClass().getResource("/img/fondos/domino.png")).getImage());
        this.setSize(800, 429); 
        this.setLocationRelativeTo(null);
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

        slider = new rojerusan.RSPanelsSlider();
        panelLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        labelRegistro = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        user1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        labelSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setName("panelLogin"); // NOI18N
        panelLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelLoginMouseMoved(evt);
            }
        });
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/img-fondo2.jpg"))); // NOI18N
        panelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-login-off.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-login-on.png"))); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 100, 40));
        panelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 200, 10));
        panelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 200, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 69, 89));
        jLabel4.setText("Iniciar sesión");
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 160, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/padlock.png"))); // NOI18N
        panelLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 25, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/user-profile.png"))); // NOI18N
        panelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 25, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/icono-domino.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 69, 89));
        jLabel2.setText("User");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user.setBorder(null);
        panelLogin.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 215, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 73, 94));
        jLabel3.setText("Password");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        password.setBorder(null);
        panelLogin.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 295, 170, 20));

        labelRegistro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(255, 51, 51));
        labelRegistro.setText("Registrarse");
        labelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelRegistroMouseMoved(evt);
            }
        });
        labelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistroMouseClicked(evt);
            }
        });
        panelLogin.add(labelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 80, -1));

        slider.add(panelLogin, "card2");

        panelRegistro.setName("panelRegistro"); // NOI18N

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setName("panelLogin"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(800, 400));
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelMouseMoved(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/img-fondo.jpg"))); // NOI18N
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-registro-off.png"))); // NOI18N
        btnRegistro.setBorder(null);
        btnRegistro.setBorderPainted(false);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-registro-on.png"))); // NOI18N
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panel.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 120, 40));
        panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 200, 10));
        panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 200, 10));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(50, 69, 89));
        jLabel9.setText("Registrarse");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/padlock.png"))); // NOI18N
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 25, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/user-profile.png"))); // NOI18N
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 25, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/icono-domino.png"))); // NOI18N
        jLabel12.setText("jLabel1");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 200, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(50, 69, 89));
        jLabel13.setText("User");
        panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        user1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user1.setBorder(null);
        panel.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 215, 170, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(50, 69, 89));
        jLabel14.setText("Password");
        panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        password1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        password1.setBorder(null);
        panel.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 295, 170, 20));

        labelSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSesion.setForeground(new java.awt.Color(255, 51, 51));
        labelSesion.setText("Iniciar sesión");
        labelSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSesion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelSesionMouseMoved(evt);
            }
        });
        labelSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSesionMouseClicked(evt);
            }
        });
        panel.add(labelSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 350, 80, -1));

        javax.swing.GroupLayout panelRegistroLayout = new javax.swing.GroupLayout(panelRegistro);
        panelRegistro.setLayout(panelRegistroLayout);
        panelRegistroLayout.setHorizontalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelRegistroLayout.setVerticalGroup(
            panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(panelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRegistroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        slider.add(panelRegistro, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void labelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroMouseClicked
        slider.setPanelSlider(30, panelRegistro, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_labelRegistroMouseClicked

    private void labelRegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroMouseMoved
        labelRegistro.setForeground(new Color(251, 79, 112));
    }//GEN-LAST:event_labelRegistroMouseMoved

    private void labelSesionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseMoved
        labelSesion.setForeground(new Color(251, 79, 112));
    }//GEN-LAST:event_labelSesionMouseMoved

    private void labelSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseClicked
        slider.setPanelSlider(30, panelLogin, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_labelSesionMouseClicked

    private void panelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseMoved
        labelRegistro.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_panelMouseMoved

    private void panelLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLoginMouseMoved
        labelSesion.setForeground(new Color(255, 51, 51));
    }//GEN-LAST:event_panelLoginMouseMoved

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelSesion;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private rojerusan.RSPanelsSlider slider;
    private javax.swing.JTextField user;
    private javax.swing.JTextField user1;
    // End of variables declaration//GEN-END:variables
}
