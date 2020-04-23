package UI.Vistas.Principal;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Vistas.IVista;
import UI.Controladores.Principal.MainController;
import javax.swing.JFrame;

public class PrincipalVista extends javax.swing.JFrame implements IVista {
    
    public PrincipalVista() {
        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu_Matriculas = new javax.swing.JMenu();
        item_Matricula = new javax.swing.JMenuItem();
        menu_Logros = new javax.swing.JMenu();
        item_RegistrarLogro = new javax.swing.JMenuItem();
        menu_Maestras = new javax.swing.JMenu();
        item_Profesores = new javax.swing.JMenuItem();
        item_Grupos = new javax.swing.JMenuItem();
        item_Logros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/banner.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/titulo.png"))); // NOI18N

        menuBar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        menu_Matriculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/face1.png"))); // NOI18N
        menu_Matriculas.setText("MATRICULAS");
        menu_Matriculas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        item_Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/arrow1.png"))); // NOI18N
        item_Matricula.setText("CREAR");
        menu_Matriculas.add(item_Matricula);

        menuBar.add(menu_Matriculas);

        menu_Logros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/about1.png"))); // NOI18N
        menu_Logros.setText("LOGROS");
        menu_Logros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu_Logros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_LogrosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_LogrosMousePressed(evt);
            }
        });
        menu_Logros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_LogrosActionPerformed(evt);
            }
        });

        item_RegistrarLogro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/arrow1.png"))); // NOI18N
        item_RegistrarLogro.setText("REGISTRAR");
        menu_Logros.add(item_RegistrarLogro);

        menuBar.add(menu_Logros);

        menu_Maestras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/pdf1.png"))); // NOI18N
        menu_Maestras.setText("MAESTRAS");
        menu_Maestras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menu_Maestras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_MaestrasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_MaestrasMouseReleased(evt);
            }
        });
        menu_Maestras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_MaestrasActionPerformed(evt);
            }
        });

        item_Profesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/arrow1.png"))); // NOI18N
        item_Profesores.setText("PROFESORES");
        item_Profesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ProfesoresActionPerformed(evt);
            }
        });
        menu_Maestras.add(item_Profesores);

        item_Grupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/arrow1.png"))); // NOI18N
        item_Grupos.setText("GRUPOS");
        item_Grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_GruposActionPerformed(evt);
            }
        });
        menu_Maestras.add(item_Grupos);

        item_Logros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/arrow1.png"))); // NOI18N
        item_Logros.setText("LOGROS");
        item_Logros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_LogrosActionPerformed(evt);
            }
        });
        menu_Maestras.add(item_Logros);

        menuBar.add(menu_Maestras);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void conectaControlador(IControlador c) {
        item_Profesores.addActionListener(c);
        item_Profesores.setActionCommand("MATRICULAS");
    }

    @Override
    public void mostrarVista() {
        this.setVisible(true);
    }

    private void menu_LogrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_LogrosMouseClicked

    }//GEN-LAST:event_menu_LogrosMouseClicked

    private void menu_LogrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_LogrosMousePressed

    }//GEN-LAST:event_menu_LogrosMousePressed

    private void menu_LogrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_LogrosActionPerformed

    }//GEN-LAST:event_menu_LogrosActionPerformed

    private void item_ProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ProfesoresActionPerformed

    }//GEN-LAST:event_item_ProfesoresActionPerformed

    private void item_GruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_GruposActionPerformed

    }//GEN-LAST:event_item_GruposActionPerformed

    private void item_LogrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_LogrosActionPerformed

    }//GEN-LAST:event_item_LogrosActionPerformed

    private void menu_MaestrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_MaestrasMouseClicked

    }//GEN-LAST:event_menu_MaestrasMouseClicked

    private void menu_MaestrasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_MaestrasMouseReleased

    }//GEN-LAST:event_menu_MaestrasMouseReleased

    private void menu_MaestrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_MaestrasActionPerformed

    }//GEN-LAST:event_menu_MaestrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem item_Grupos;
    private javax.swing.JMenuItem item_Logros;
    private javax.swing.JMenuItem item_Matricula;
    private javax.swing.JMenuItem item_Profesores;
    private javax.swing.JMenuItem item_RegistrarLogro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menu_Logros;
    private javax.swing.JMenu menu_Maestras;
    private javax.swing.JMenu menu_Matriculas;
    // End of variables declaration//GEN-END:variables

}
