package mx.itson.pokemon.presentacion;

import java.awt.Color;
import javax.swing.JOptionPane;
import mx.itson.pokemon.acciones.Accion;
import mx.itson.pokemon.entidades.Pokemon;

public class Main extends javax.swing.JFrame {

    Accion acc;

    public Main() {
        initComponents();
        acc = new Accion(this);
        acc.preCargarInformacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pnlPantalla = new javax.swing.JPanel();
        lblFotoPokemon = new javax.swing.JLabel();
        lblPokemonIcono = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblTipo2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAtaque = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDefensa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSalud = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCaramelos = new javax.swing.JLabel();
        lblPcMax = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(191, 0, 18));

        txtBuscar.setBackground(new java.awt.Color(81, 173, 96));

        btnBuscar.setBackground(new java.awt.Color(41, 170, 253));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(222, 224, 224));

        pnlPantalla.setBackground(new java.awt.Color(36, 36, 36));
        pnlPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFotoPokemon.setText("FOTOPOKEMON");
        lblFotoPokemon.setMaximumSize(new java.awt.Dimension(50, 50));
        lblFotoPokemon.setMinimumSize(new java.awt.Dimension(50, 50));
        pnlPantalla.add(lblFotoPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        lblPokemonIcono.setText("ICONO");
        pnlPantalla.add(lblPokemonIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        lblTipo1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("http://149.56.130.193/proyecto-claudio/tipos/dragon.gif")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        pnlPantalla.add(lblTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        lblTipo2.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("http://149.56.130.193/proyecto-claudio/tipos/fire.gif")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        pnlPantalla.add(lblTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNombre.setText("NOMBRE");
        pnlPantalla.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        pnlPantalla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Ataque");
        pnlPantalla.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 429, -1, -1));

        lblAtaque.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblAtaque.setText("000");
        pnlPantalla.add(lblAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 484, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Defensa");
        pnlPantalla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 429, -1, -1));

        lblDefensa.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblDefensa.setText("000");
        pnlPantalla.add(lblDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 484, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Salud");
        pnlPantalla.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 429, -1, -1));

        lblSalud.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSalud.setText("000");
        pnlPantalla.add(lblSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 484, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Caramelos");
        pnlPantalla.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 429, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("PC Maximo");
        pnlPantalla.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 429, -1, -1));

        lblCaramelos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblCaramelos.setText("000");
        pnlPantalla.add(lblCaramelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 484, -1, -1));

        lblPcMax.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPcMax.setText("0000");
        pnlPantalla.add(lblPcMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 484, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Numero");
        pnlPantalla.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        lblNumero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblNumero.setText("NUMERO");
        pnlPantalla.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(pnlPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(pnlPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        lblTipo2.setVisible(false);
        Pokemon pkmn = acc.buscar(txtBuscar.getText());
        
        if (pkmn != null) {
            acc.setFotoChico(pkmn);
            acc.setFotoGrande(pkmn);
            acc.setFotoTipos(pkmn);
            lblNombre.setText(pkmn.getNombre());
            lblNumero.setText("#" + String.valueOf(pkmn.getId()));
            lblAtaque.setText(String.valueOf(pkmn.getPuntosAtaque()));
            lblDefensa.setText(String.valueOf(pkmn.getPuntosDefensa()));
            lblSalud.setText(String.valueOf(pkmn.getPuntosEnergia()));
            if (pkmn.getCaramelosRequeridos() == 0) {
                
                lblCaramelos.setText("No evo.");
                
                
            }else{
            
                lblCaramelos.setText(String.valueOf(pkmn.getCaramelosRequeridos()));
                
            }
            lblPcMax.setText(String.valueOf(pkmn.getPuntosCombateMaximo()));
            pnlPantalla.setBackground(new Color(81, 173, 96));
            
            
        }else{
        
            JOptionPane.showMessageDialog(this, "No se encontro pokemon");
        
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblAtaque;
    public javax.swing.JLabel lblCaramelos;
    public javax.swing.JLabel lblDefensa;
    public javax.swing.JLabel lblFotoPokemon;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblNumero;
    public javax.swing.JLabel lblPcMax;
    public javax.swing.JLabel lblPokemonIcono;
    public javax.swing.JLabel lblSalud;
    public javax.swing.JLabel lblTipo1;
    public javax.swing.JLabel lblTipo2;
    private javax.swing.JPanel pnlPantalla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
