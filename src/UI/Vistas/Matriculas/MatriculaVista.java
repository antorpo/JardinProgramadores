package UI.Vistas.Matriculas;

import Core.Dominio.Interfaces.Controlador.IControlador;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class MatriculaVista extends javax.swing.JFrame {

    public DefaultListModel lista = new DefaultListModel();
    public DefaultListModel lista2 = new DefaultListModel();
   
    public MatriculaVista() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        list_LogrosDisponibles.setModel(lista);
        list_LogrosMatriculados.setModel(lista2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGeneros = new javax.swing.ButtonGroup();
        groupEdad = new javax.swing.ButtonGroup();
        tabbedPane = new javax.swing.JTabbedPane();
        pnl_Creacion = new javax.swing.JPanel();
        panel_Info2 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        lbl_Nombre2 = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JTextField();
        lbl_Telefono2 = new javax.swing.JLabel();
        lbl_Doc2 = new javax.swing.JLabel();
        txt_Documento = new javax.swing.JTextField();
        cb_TipoDoc = new javax.swing.JComboBox<>();
        lbl_TipoDoc2 = new javax.swing.JLabel();
        lbl_Apellidos2 = new javax.swing.JLabel();
        txt_Apellidos = new javax.swing.JTextField();
        lbl_Espe = new javax.swing.JLabel();
        lbl_Genero2 = new javax.swing.JLabel();
        rb_Masculino = new javax.swing.JRadioButton();
        rb_Femenino = new javax.swing.JRadioButton();
        rb_Meses = new javax.swing.JRadioButton();
        rb_Anos = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Observaciones = new javax.swing.JTextArea();
        lbl_Telefono4 = new javax.swing.JLabel();
        txt_Estatura = new javax.swing.JTextField();
        lbl_Telefono5 = new javax.swing.JLabel();
        txt_Peso = new javax.swing.JTextField();
        lbl_TipoDoc5 = new javax.swing.JLabel();
        cb_Grupo = new javax.swing.JComboBox<>();
        lbl_Titulo = new javax.swing.JLabel();
        pnl_Actualizacion = new javax.swing.JPanel();
        lbl_Titulo1 = new javax.swing.JLabel();
        panel_Info3 = new javax.swing.JPanel();
        txt_Nombre1 = new javax.swing.JTextField();
        lbl_Nombre3 = new javax.swing.JLabel();
        txt_Telefono1 = new javax.swing.JTextField();
        lbl_Telefono3 = new javax.swing.JLabel();
        lbl_Doc3 = new javax.swing.JLabel();
        txt_Documento1 = new javax.swing.JTextField();
        cb_TipoDoc1 = new javax.swing.JComboBox<>();
        lbl_TipoDoc3 = new javax.swing.JLabel();
        lbl_Apellidos3 = new javax.swing.JLabel();
        txt_Apellidos1 = new javax.swing.JTextField();
        lbl_Espe1 = new javax.swing.JLabel();
        txt_Direccion1 = new javax.swing.JTextField();
        txt_Celular1 = new javax.swing.JTextField();
        lbl_Telefono6 = new javax.swing.JLabel();
        cb_Calidad1 = new javax.swing.JComboBox<>();
        lbl_TipoDoc4 = new javax.swing.JLabel();
        pnl_Lista = new javax.swing.JPanel();
        lbl_Titulo3 = new javax.swing.JLabel();
        panel_Info4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_LogrosDisponibles = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_Nombre4 = new javax.swing.JLabel();
        btn_Adicionar = new javax.swing.JButton();
        lbl_Nombre5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_LogrosMatriculados = new javax.swing.JList<>();
        btn_Remover = new javax.swing.JButton();
        lbl_Nombre6 = new javax.swing.JLabel();
        lbl_Tiempo = new javax.swing.JLabel();
        btn_Matricular = new javax.swing.JButton();
        btn_Info = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tabbedPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        panel_Info2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Nombre2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre2.setText("Nombre:");

        txt_Edad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EdadKeyTyped(evt);
            }
        });

        lbl_Telefono2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono2.setText("Edad:");

        lbl_Doc2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Doc2.setText("Documento:");

        txt_Documento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DocumentoActionPerformed(evt);
            }
        });
        txt_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DocumentoKeyTyped(evt);
            }
        });

        cb_TipoDoc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_TipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_TipoDoc2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc2.setText("Tipo Identificacion:");

        lbl_Apellidos2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Apellidos2.setText("Apellidos:");

        txt_Apellidos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Espe.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Espe.setText("Observaciones:");

        lbl_Genero2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Genero2.setText("Genero:");

        groupGeneros.add(rb_Masculino);
        rb_Masculino.setSelected(true);
        rb_Masculino.setText("M");

        groupGeneros.add(rb_Femenino);
        rb_Femenino.setText("F");

        groupEdad.add(rb_Meses);
        rb_Meses.setSelected(true);
        rb_Meses.setText("Meses");

        groupEdad.add(rb_Anos);
        rb_Anos.setText("Años");

        txt_Observaciones.setColumns(20);
        txt_Observaciones.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Observaciones.setRows(5);
        jScrollPane2.setViewportView(txt_Observaciones);

        lbl_Telefono4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono4.setText("Estatura (cm):");

        txt_Estatura.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Estatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EstaturaKeyTyped(evt);
            }
        });

        lbl_Telefono5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono5.setText("Peso (kg):");

        txt_Peso.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PesoKeyTyped(evt);
            }
        });

        lbl_TipoDoc5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc5.setText("Grupo:");

        cb_Grupo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_Grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panel_Info2Layout = new javax.swing.GroupLayout(panel_Info2);
        panel_Info2.setLayout(panel_Info2Layout);
        panel_Info2Layout.setHorizontalGroup(
            panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addComponent(lbl_TipoDoc2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cb_TipoDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Telefono2)
                            .addComponent(lbl_Nombre2)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info2Layout.createSequentialGroup()
                                        .addComponent(rb_Meses)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rb_Anos)))
                                .addGap(18, 18, 18)
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Genero2)
                                    .addGroup(panel_Info2Layout.createSequentialGroup()
                                        .addComponent(rb_Masculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb_Femenino))))
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Telefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Telefono5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Apellidos2)
                                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(lbl_Doc2)
                                    .addComponent(lbl_Espe)
                                    .addComponent(jScrollPane2)))
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_Grupo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel_Info2Layout.createSequentialGroup()
                                        .addComponent(lbl_TipoDoc5)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        panel_Info2Layout.setVerticalGroup(
            panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre2)
                    .addComponent(lbl_Apellidos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TipoDoc2)
                    .addComponent(lbl_Doc2))
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info2Layout.createSequentialGroup()
                        .addComponent(lbl_TipoDoc5)
                        .addGap(0, 0, 0)
                        .addComponent(cb_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Espe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lbl_Genero2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rb_Masculino)
                                    .addComponent(rb_Femenino)))
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addComponent(lbl_Telefono2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rb_Anos)
                                    .addComponent(rb_Meses))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addComponent(lbl_Telefono4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addComponent(lbl_Telefono5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );

        lbl_Titulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/add2.png"))); // NOI18N
        lbl_Titulo.setText("AGREGAR ESTUDIANTE:");

        javax.swing.GroupLayout pnl_CreacionLayout = new javax.swing.GroupLayout(pnl_Creacion);
        pnl_Creacion.setLayout(pnl_CreacionLayout);
        pnl_CreacionLayout.setHorizontalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_CreacionLayout.setVerticalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Info2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("ESTUDIANTE", pnl_Creacion);

        lbl_Titulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/add2.png"))); // NOI18N
        lbl_Titulo1.setText("AGREGAR ACUDIENTE:");

        panel_Info3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Nombre1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Nombre3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre3.setText("Nombre:");

        txt_Telefono1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Telefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Telefono1KeyTyped(evt);
            }
        });

        lbl_Telefono3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono3.setText("Telefono:");

        lbl_Doc3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Doc3.setText("Documento:");

        txt_Documento1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Documento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Documento1ActionPerformed(evt);
            }
        });
        txt_Documento1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Documento1KeyTyped(evt);
            }
        });

        cb_TipoDoc1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_TipoDoc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_TipoDoc3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc3.setText("Tipo Identificacion:");

        lbl_Apellidos3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Apellidos3.setText("Apellidos:");

        txt_Apellidos1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Espe1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Espe1.setText("Celular:");

        txt_Direccion1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Direccion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Direccion1KeyTyped(evt);
            }
        });

        txt_Celular1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Celular1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Celular1KeyTyped(evt);
            }
        });

        lbl_Telefono6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono6.setText("Direccion:");

        cb_Calidad1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_Calidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_TipoDoc4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc4.setText("Calidad:");

        javax.swing.GroupLayout panel_Info3Layout = new javax.swing.GroupLayout(panel_Info3);
        panel_Info3.setLayout(panel_Info3Layout);
        panel_Info3Layout.setHorizontalGroup(
            panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Espe1)
                            .addComponent(txt_Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_TipoDoc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_Calidad1, 0, 103, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info3Layout.createSequentialGroup()
                                .addComponent(lbl_TipoDoc3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cb_TipoDoc1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Documento1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info3Layout.createSequentialGroup()
                                .addComponent(lbl_Nombre3)
                                .addGap(142, 142, 142))
                            .addGroup(panel_Info3Layout.createSequentialGroup()
                                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_Info3Layout.createSequentialGroup()
                                        .addComponent(lbl_Telefono3)
                                        .addGap(84, 84, 84)
                                        .addComponent(lbl_Telefono6)
                                        .addGap(0, 56, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Apellidos3)
                            .addComponent(txt_Apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Doc3)))
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addComponent(txt_Telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Direccion1)))
                .addContainerGap())
        );
        panel_Info3Layout.setVerticalGroup(
            panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nombre3)
                    .addComponent(lbl_Apellidos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TipoDoc3)
                    .addComponent(lbl_Doc3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_TipoDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Documento1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telefono3)
                    .addComponent(lbl_Telefono6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Info3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addComponent(lbl_Espe1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Celular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_Info3Layout.createSequentialGroup()
                        .addComponent(lbl_TipoDoc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Calidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_ActualizacionLayout = new javax.swing.GroupLayout(pnl_Actualizacion);
        pnl_Actualizacion.setLayout(pnl_ActualizacionLayout);
        pnl_ActualizacionLayout.setHorizontalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_ActualizacionLayout.setVerticalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("ACUDIENTE", pnl_Actualizacion);

        lbl_Titulo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/add2.png"))); // NOI18N
        lbl_Titulo3.setText("AGREGAR LOGROS:");

        panel_Info4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        list_LogrosDisponibles.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        list_LogrosDisponibles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(list_LogrosDisponibles);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_Nombre4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre4.setText("Logros Disponibles:");

        btn_Adicionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/suma1.png"))); // NOI18N
        btn_Adicionar.setText("Adicionar");
        btn_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdicionarActionPerformed(evt);
            }
        });

        lbl_Nombre5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre5.setText("Logros Matriculados:");

        list_LogrosMatriculados.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        list_LogrosMatriculados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(list_LogrosMatriculados);

        btn_Remover.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/del1.png"))); // NOI18N
        btn_Remover.setText("Remover");
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });

        lbl_Nombre6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre6.setText("Tiempo formacion (meses):");

        lbl_Tiempo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Tiempo.setText("0");

        javax.swing.GroupLayout panel_Info4Layout = new javax.swing.GroupLayout(panel_Info4);
        panel_Info4.setLayout(panel_Info4Layout);
        panel_Info4Layout.setHorizontalGroup(
            panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Nombre4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Adicionar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Info4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Nombre5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_Info4Layout.createSequentialGroup()
                                .addComponent(lbl_Nombre6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Remover)))
                .addContainerGap())
        );
        panel_Info4Layout.setVerticalGroup(
            panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Info4Layout.createSequentialGroup()
                        .addGroup(panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(panel_Info4Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addComponent(lbl_Nombre4)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Adicionar)
                                .addGap(25, 25, 25)))
                        .addContainerGap())
                    .addGroup(panel_Info4Layout.createSequentialGroup()
                        .addComponent(lbl_Nombre5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_Info4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nombre6)
                            .addComponent(lbl_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        btn_Matricular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Matricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/save2.png"))); // NOI18N
        btn_Matricular.setText("MATRICULAR");
        btn_Matricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MatricularActionPerformed(evt);
            }
        });

        btn_Info.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/info1.png"))); // NOI18N
        btn_Info.setText("INFO");
        btn_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ListaLayout = new javax.swing.GroupLayout(pnl_Lista);
        pnl_Lista.setLayout(pnl_ListaLayout);
        pnl_ListaLayout.setHorizontalGroup(
            pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(panel_Info4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ListaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Info)))
                .addContainerGap())
        );
        pnl_ListaLayout.setVerticalGroup(
            pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Info4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Matricular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Info))
                .addContainerGap())
        );

        tabbedPane.addTab("LOGROS", pnl_Lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void conectaControlador(IControlador c) {
       btn_Adicionar.addActionListener(c);
       btn_Adicionar.setActionCommand("ADICIONAR");
       
       btn_Remover.addActionListener(c);
       btn_Remover.setActionCommand("REMOVER");
       
       btn_Info.addActionListener(c);
       btn_Info.setActionCommand("INFORMACION");
       
       btn_Matricular.addActionListener(c);
       btn_Matricular.setActionCommand("MATRICULAR");        
       
    }
    
    private void btn_MatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MatricularActionPerformed

    }//GEN-LAST:event_btn_MatricularActionPerformed

    private void txt_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DocumentoActionPerformed

    }//GEN-LAST:event_txt_DocumentoActionPerformed

    private void txt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DocumentoKeyTyped

    }//GEN-LAST:event_txt_DocumentoKeyTyped

    private void txt_Telefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Telefono1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Telefono1KeyTyped

    private void txt_Documento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Documento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Documento1ActionPerformed

    private void txt_Documento1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Documento1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Documento1KeyTyped

    private void txt_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EdadKeyTyped

    }//GEN-LAST:event_txt_EdadKeyTyped

    private void txt_EstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EstaturaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EstaturaKeyTyped

    private void txt_PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PesoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PesoKeyTyped

    private void txt_Celular1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Celular1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Celular1KeyTyped

    private void txt_Direccion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Direccion1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Direccion1KeyTyped

    private void btn_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AdicionarActionPerformed

    private void btn_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InfoActionPerformed

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Adicionar;
    private javax.swing.JButton btn_Info;
    private javax.swing.JButton btn_Matricular;
    private javax.swing.JButton btn_Remover;
    public javax.swing.JComboBox<String> cb_Calidad1;
    public javax.swing.JComboBox<String> cb_Grupo;
    public javax.swing.JComboBox<String> cb_TipoDoc;
    public javax.swing.JComboBox<String> cb_TipoDoc1;
    private javax.swing.ButtonGroup groupEdad;
    private javax.swing.ButtonGroup groupGeneros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_Apellidos2;
    private javax.swing.JLabel lbl_Apellidos3;
    private javax.swing.JLabel lbl_Doc2;
    private javax.swing.JLabel lbl_Doc3;
    private javax.swing.JLabel lbl_Espe;
    private javax.swing.JLabel lbl_Espe1;
    private javax.swing.JLabel lbl_Genero2;
    private javax.swing.JLabel lbl_Nombre2;
    private javax.swing.JLabel lbl_Nombre3;
    private javax.swing.JLabel lbl_Nombre4;
    private javax.swing.JLabel lbl_Nombre5;
    private javax.swing.JLabel lbl_Nombre6;
    private javax.swing.JLabel lbl_Telefono2;
    private javax.swing.JLabel lbl_Telefono3;
    private javax.swing.JLabel lbl_Telefono4;
    private javax.swing.JLabel lbl_Telefono5;
    private javax.swing.JLabel lbl_Telefono6;
    public javax.swing.JLabel lbl_Tiempo;
    private javax.swing.JLabel lbl_TipoDoc2;
    private javax.swing.JLabel lbl_TipoDoc3;
    private javax.swing.JLabel lbl_TipoDoc4;
    private javax.swing.JLabel lbl_TipoDoc5;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_Titulo1;
    private javax.swing.JLabel lbl_Titulo3;
    public javax.swing.JList<String> list_LogrosDisponibles;
    public javax.swing.JList<String> list_LogrosMatriculados;
    private javax.swing.JPanel panel_Info2;
    private javax.swing.JPanel panel_Info3;
    private javax.swing.JPanel panel_Info4;
    private javax.swing.JPanel pnl_Actualizacion;
    private javax.swing.JPanel pnl_Creacion;
    private javax.swing.JPanel pnl_Lista;
    private javax.swing.JRadioButton rb_Anos;
    private javax.swing.JRadioButton rb_Femenino;
    public javax.swing.JRadioButton rb_Masculino;
    public javax.swing.JRadioButton rb_Meses;
    private javax.swing.JTabbedPane tabbedPane;
    public javax.swing.JTextField txt_Apellidos;
    public javax.swing.JTextField txt_Apellidos1;
    public javax.swing.JTextField txt_Celular1;
    public javax.swing.JTextField txt_Direccion1;
    public javax.swing.JTextField txt_Documento;
    public javax.swing.JTextField txt_Documento1;
    public javax.swing.JTextField txt_Edad;
    public javax.swing.JTextField txt_Estatura;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_Nombre1;
    public javax.swing.JTextArea txt_Observaciones;
    public javax.swing.JTextField txt_Peso;
    public javax.swing.JTextField txt_Telefono1;
    // End of variables declaration//GEN-END:variables
}
