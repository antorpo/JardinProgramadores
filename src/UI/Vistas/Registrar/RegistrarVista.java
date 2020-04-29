package UI.Vistas.Registrar;

import Core.Dominio.Interfaces.Controlador.IControlador;
import javax.swing.JFrame;

public class RegistrarVista extends javax.swing.JFrame {

    public RegistrarVista() {
        initComponents();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    @SuppressWarnings("unchecked")

    /**
    * Este metodo nos ayuda a conectar las acciones con su controlador (listener).
    * @param c Controlador
    */
    public void conectaControlador(IControlador c) {
        btn_Registrar.addActionListener(c);
        btn_Registrar.setActionCommand("REGISTRAR");

        btn_Buscar.addActionListener(c);
        btn_Buscar.setActionCommand("BUSCAR");
        
        btn_Guardar.addActionListener(c);
        btn_Guardar.setActionCommand("GUARDAR");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        pnl_Creacion = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        panel_Info2 = new javax.swing.JPanel();
        txt_Documento = new javax.swing.JTextField();
        lbl_Nombre2 = new javax.swing.JLabel();
        cb_Logros = new javax.swing.JComboBox<>();
        lbl_TipoDoc2 = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        lbl_Titulo = new javax.swing.JLabel();
        pnl_Actualizacion = new javax.swing.JPanel();
        panel_Info3 = new javax.swing.JPanel();
        lbl_Nombre3 = new javax.swing.JLabel();
        lbl_LogroNombre = new javax.swing.JLabel();
        lbl_Nombre5 = new javax.swing.JLabel();
        lbl_Nombre6 = new javax.swing.JLabel();
        lbl_TipoDoc3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Comentario = new javax.swing.JTextArea();
        date_Primer = new com.toedter.calendar.JDateChooser();
        date_Segundo = new com.toedter.calendar.JDateChooser();
        btn_Guardar = new javax.swing.JButton();
        lbl_TipoDoc4 = new javax.swing.JLabel();
        cb_Nota1 = new javax.swing.JComboBox<>();
        lbl_TipoDoc6 = new javax.swing.JLabel();
        cb_Nota2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tabbedPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_Registrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/mod1.png"))); // NOI18N
        btn_Registrar.setText("REGISTRAR");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        panel_Info2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Documento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Nombre2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre2.setText("Documento Estudiante:");

        cb_Logros.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_TipoDoc2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc2.setText("Logro:");

        btn_Buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/search1.png"))); // NOI18N
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_Info2Layout = new javax.swing.GroupLayout(panel_Info2);
        panel_Info2.setLayout(panel_Info2Layout);
        panel_Info2Layout.setHorizontalGroup(
            panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Logros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Nombre2)
                            .addComponent(lbl_TipoDoc2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addComponent(txt_Documento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Buscar)))
                .addContainerGap())
        );
        panel_Info2Layout.setVerticalGroup(
            panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_TipoDoc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_Logros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        lbl_Titulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/school2.png"))); // NOI18N
        lbl_Titulo.setText("REGISTRO LOGROS:");

        javax.swing.GroupLayout pnl_CreacionLayout = new javax.swing.GroupLayout(pnl_Creacion);
        pnl_Creacion.setLayout(pnl_CreacionLayout);
        pnl_CreacionLayout.setHorizontalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CreacionLayout.createSequentialGroup()
                        .addGap(0, 326, Short.MAX_VALUE)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_CreacionLayout.setVerticalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Info2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("REGISTRO", pnl_Creacion);

        panel_Info3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_Nombre3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Nombre3.setText("Logro:");

        lbl_LogroNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbl_Nombre5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/calendar1.png"))); // NOI18N
        lbl_Nombre5.setText("Primer Corte:");

        lbl_Nombre6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/calendar1.png"))); // NOI18N
        lbl_Nombre6.setText("Segundo Corte:");

        lbl_TipoDoc3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc3.setText("Comentario:");

        txt_Comentario.setColumns(20);
        txt_Comentario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Comentario.setRows(5);
        jScrollPane1.setViewportView(txt_Comentario);

        btn_Guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/about1.png"))); // NOI18N
        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        lbl_TipoDoc4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/nota1.png"))); // NOI18N
        lbl_TipoDoc4.setText(":");

        cb_Nota1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_TipoDoc6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/nota1.png"))); // NOI18N
        lbl_TipoDoc6.setText(":");

        cb_Nota2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout panel_Info3Layout = new javax.swing.GroupLayout(panel_Info3);
        panel_Info3.setLayout(panel_Info3Layout);
        panel_Info3Layout.setHorizontalGroup(
            panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info3Layout.createSequentialGroup()
                        .addComponent(lbl_Nombre3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_LogroNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_TipoDoc3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_Info3Layout.createSequentialGroup()
                                .addComponent(lbl_Nombre5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_Primer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_Info3Layout.createSequentialGroup()
                                .addComponent(lbl_Nombre6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date_Segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_TipoDoc4)
                            .addComponent(lbl_TipoDoc6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_Nota2, 0, 162, Short.MAX_VALUE)
                            .addComponent(cb_Nota1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panel_Info3Layout.setVerticalGroup(
            panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_Info3Layout.createSequentialGroup()
                                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_Nombre3)
                                    .addComponent(lbl_LogroNombre))
                                .addGap(23, 23, 23)
                                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Nombre5)
                                    .addComponent(date_Primer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_TipoDoc4)
                                .addComponent(cb_Nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lbl_Nombre6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_TipoDoc6)
                                    .addComponent(cb_Nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(date_Segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lbl_TipoDoc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_ActualizacionLayout = new javax.swing.GroupLayout(pnl_Actualizacion);
        pnl_Actualizacion.setLayout(pnl_ActualizacionLayout);
        pnl_ActualizacionLayout.setHorizontalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_Info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnl_ActualizacionLayout.setVerticalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
            .addGroup(pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_Info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tabbedPane.addTab("AVANCE", pnl_Actualizacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    public javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Registrar;
    public javax.swing.JComboBox<String> cb_Logros;
    public javax.swing.JComboBox<String> cb_Nota1;
    public javax.swing.JComboBox<String> cb_Nota2;
    public com.toedter.calendar.JDateChooser date_Primer;
    public com.toedter.calendar.JDateChooser date_Segundo;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_LogroNombre;
    private javax.swing.JLabel lbl_Nombre2;
    private javax.swing.JLabel lbl_Nombre3;
    private javax.swing.JLabel lbl_Nombre5;
    private javax.swing.JLabel lbl_Nombre6;
    private javax.swing.JLabel lbl_TipoDoc2;
    private javax.swing.JLabel lbl_TipoDoc3;
    private javax.swing.JLabel lbl_TipoDoc4;
    private javax.swing.JLabel lbl_TipoDoc6;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JPanel panel_Info2;
    private javax.swing.JPanel panel_Info3;
    private javax.swing.JPanel pnl_Actualizacion;
    private javax.swing.JPanel pnl_Creacion;
    private javax.swing.JTabbedPane tabbedPane;
    public javax.swing.JTextArea txt_Comentario;
    public javax.swing.JTextField txt_Documento;
    // End of variables declaration//GEN-END:variables
}
