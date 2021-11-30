package visualizacion;

import conexion.Jugador;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import modelos.Reproductor;

public class VentanaMenuMultijugador extends javax.swing.JFrame {

    public VentanaMenuMultijugador() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("TETRIS 99");
        setResizable(false);
        
        //fondo de pantalla
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/Bender.gif"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        //fondo de los botones
        ImageIcon botonUnirsePartida = new ImageIcon(this.getClass().getResource("/imagenes/botones_multiplayer2.png"));
        jBotonUnirsePartida.setIcon(botonUnirsePartida);
        //cambia forma del puntero
        jBotonUnirsePartida.setCursor(new Cursor(HAND_CURSOR));
    }

    //icono del juego
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/icono.jpeg"));

        return retValue;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBotonUnirsePartida = new javax.swing.JButton();
        jtNombreJugador = new javax.swing.JTextField();
        TEXTO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());

        jBotonUnirsePartida.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBotonUnirsePartida.setForeground(new java.awt.Color(0, 0, 204));
        jBotonUnirsePartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBotonUnirsePartidaMouseEntered(evt);
            }
        });
        jBotonUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonUnirsePartidaActionPerformed(evt);
            }
        });

        TEXTO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TEXTO.setForeground(new java.awt.Color(255, 255, 255));
        TEXTO.setText("INGRESE SU NOMBRE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jBotonUnirsePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXTO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(407, Short.MAX_VALUE)
                .addComponent(TEXTO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBotonUnirsePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonUnirsePartidaActionPerformed
        new JFXPanel();
        Reproductor.obtenerReproductor().reproducirSonido(Reproductor.SONIDO_BOTON_CLICK2);
        Jugador jugador = new Jugador("192.168.1.20", jtNombreJugador.getText(), true, true, null);
        Cargando cargando = new Cargando(this, rootPaneCheckingEnabled);
        cargando.registrarse(jugador);
        
        cargando.setVisible(true);
        
        //VentanaMultijugador multijugador = new VentanaMultijugador();
        //multijugador.setVisible(true);
    }//GEN-LAST:event_jBotonUnirsePartidaActionPerformed

    private void jBotonUnirsePartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonUnirsePartidaMouseEntered
        new JFXPanel();
        Reproductor.obtenerReproductor().reproducirSonido(Reproductor.SONIDO_BOTON_HOVER);
    }//GEN-LAST:event_jBotonUnirsePartidaMouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuMultijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuMultijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuMultijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuMultijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenuMultijugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TEXTO;
    private javax.swing.JButton jBotonUnirsePartida;
    private javax.swing.JTextField jtNombreJugador;
    // End of variables declaration//GEN-END:variables
}
