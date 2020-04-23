package UI.Vistas.Maestras;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Vistas.IVista;
import javax.swing.JFrame;

public class LogroVista extends javax.swing.JFrame implements IVista {


    public LogroVista() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        pnl_Creacion = new javax.swing.JPanel();
        btn_Crear = new javax.swing.JButton();
        panel_Info2 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        lbl_Nombre2 = new javax.swing.JLabel();
        lbl_Tipo = new javax.swing.JLabel();
        txt_Tipo = new javax.swing.JTextField();
        lbl_Titulo = new javax.swing.JLabel();
        pnl_Actualizacion = new javax.swing.JPanel();
        panel_Editar = new javax.swing.JPanel();
        lbl_Programa = new javax.swing.JLabel();
        txt_Nombre3 = new javax.swing.JTextField();
        lbl_Nombre3 = new javax.swing.JLabel();
        txt_Tipo2 = new javax.swing.JTextField();
        lbl_Tipo2 = new javax.swing.JLabel();
        lbl_Titulo1 = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();
        panel_Info3 = new javax.swing.JPanel();
        txt_Documento3 = new javax.swing.JTextField();
        lbl_Documento = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        pnl_Lista = new javax.swing.JPanel();
        lbl_Titulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Docentes = new javax.swing.JTable();
        btn_Actualizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabbedPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        pnl_Creacion.setPreferredSize(new java.awt.Dimension(542, 305));

        btn_Crear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/create1.png"))); // NOI18N
        btn_Crear.setText("CREAR");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        panel_Info2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Nombre2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre2.setText("Nombre:");

        lbl_Tipo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Tipo.setText("Tipo:");

        txt_Tipo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout panel_Info2Layout = new javax.swing.GroupLayout(panel_Info2);
        panel_Info2.setLayout(panel_Info2Layout);
        panel_Info2Layout.setHorizontalGroup(
            panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addComponent(lbl_Nombre2)
                        .addGap(142, 142, 142))
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addComponent(txt_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Tipo)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_Info2Layout.setVerticalGroup(
            panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre2)
                    .addComponent(lbl_Tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lbl_Titulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/add2.png"))); // NOI18N
        lbl_Titulo.setText("AGREGAR LOGRO:");

        javax.swing.GroupLayout pnl_CreacionLayout = new javax.swing.GroupLayout(pnl_Creacion);
        pnl_Creacion.setLayout(pnl_CreacionLayout);
        pnl_CreacionLayout.setHorizontalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_CreacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_CreacionLayout.setVerticalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Info2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        tabbedPane.addTab("CREACION", pnl_Creacion);

        panel_Editar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lbl_Programa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbl_Programa.setText(".");

        txt_Nombre3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Nombre3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre3.setText("Nombre:");

        txt_Tipo2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Tipo2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Tipo2.setText("Tipo:");

        javax.swing.GroupLayout panel_EditarLayout = new javax.swing.GroupLayout(panel_Editar);
        panel_Editar.setLayout(panel_EditarLayout);
        panel_EditarLayout.setHorizontalGroup(
            panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EditarLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(lbl_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
            .addGroup(panel_EditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Tipo2)
                    .addComponent(txt_Tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_EditarLayout.setVerticalGroup(
            panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Tipo2)
                    .addComponent(lbl_Nombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(lbl_Programa))
        );

        lbl_Titulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/mod2.png"))); // NOI18N
        lbl_Titulo1.setText("MODIFICAR LOGRO:");

        btn_Actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/update1.png"))); // NOI18N
        btn_Actualizar.setText("ACTUALIZAR");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        panel_Info3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Documento3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Documento3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Documento3KeyTyped(evt);
            }
        });

        lbl_Documento.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Documento.setText("Documento:");

        btn_Buscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/search1.png"))); // NOI18N
        btn_Buscar.setText("BUSCAR");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_Info3Layout = new javax.swing.GroupLayout(panel_Info3);
        panel_Info3.setLayout(panel_Info3Layout);
        panel_Info3Layout.setHorizontalGroup(
            panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addComponent(lbl_Documento)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addComponent(txt_Documento3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_Info3Layout.setVerticalGroup(
            panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Documento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt_Documento3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ActualizacionLayout = new javax.swing.GroupLayout(pnl_Actualizacion);
        pnl_Actualizacion.setLayout(pnl_ActualizacionLayout);
        pnl_ActualizacionLayout.setHorizontalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ActualizacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Actualizar)))
                .addContainerGap())
        );
        pnl_ActualizacionLayout.setVerticalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                .addComponent(lbl_Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Info3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("ACTUALIZACION", pnl_Actualizacion);

        lbl_Titulo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/user2.png"))); // NOI18N
        lbl_Titulo2.setText("LISTADO DE LOGROS:");

        tbl_Docentes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbl_Docentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Docentes);

        btn_Actualizar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Actualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/refresh1.png"))); // NOI18N
        btn_Actualizar1.setText("REFRESH");
        btn_Actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Actualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ListaLayout = new javax.swing.GroupLayout(pnl_Lista);
        pnl_Lista.setLayout(pnl_ListaLayout);
        pnl_ListaLayout.setHorizontalGroup(
            pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(pnl_ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ListaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Actualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_ListaLayout.setVerticalGroup(
            pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ListaLayout.createSequentialGroup()
                .addComponent(lbl_Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Actualizar1)
                .addGap(96, 96, 96))
        );

        tabbedPane.addTab("LISTA", pnl_Lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed

    }//GEN-LAST:event_btn_CrearActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed

    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void txt_Documento3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Documento3KeyTyped

    }//GEN-LAST:event_txt_Documento3KeyTyped

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed

    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_Actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Actualizar1ActionPerformed

    }//GEN-LAST:event_btn_Actualizar1ActionPerformed

    @Override
    public void conectaControlador(IControlador c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Actualizar1;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Documento;
    private javax.swing.JLabel lbl_Nombre2;
    private javax.swing.JLabel lbl_Nombre3;
    private javax.swing.JLabel lbl_Programa;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JLabel lbl_Tipo2;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_Titulo1;
    private javax.swing.JLabel lbl_Titulo2;
    private javax.swing.JPanel panel_Editar;
    private javax.swing.JPanel panel_Info2;
    private javax.swing.JPanel panel_Info3;
    private javax.swing.JPanel pnl_Actualizacion;
    private javax.swing.JPanel pnl_Creacion;
    private javax.swing.JPanel pnl_Lista;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tbl_Docentes;
    private javax.swing.JTextField txt_Documento3;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Nombre3;
    private javax.swing.JTextField txt_Tipo;
    private javax.swing.JTextField txt_Tipo2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
