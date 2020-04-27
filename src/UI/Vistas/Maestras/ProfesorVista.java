package UI.Vistas.Maestras;
import Core.Dominio.Interfaces.Controlador.IControlador;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ProfesorVista extends javax.swing.JFrame{

    // Configuracion de la tabla:
    public DefaultTableModel tabla = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    String titulos[] = {"Id", "Nombre", "Tipo",  "Documento", "Telefono", "Especialidad", "Genero"};
    
    public ProfesorVista() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        tabla.setColumnIdentifiers(titulos);
        tbl_Profesores.setModel(tabla);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGeneros = new javax.swing.ButtonGroup();
        groupGeneros1 = new javax.swing.ButtonGroup();
        tabbedPane = new javax.swing.JTabbedPane();
        pnl_Creacion = new javax.swing.JPanel();
        btn_Crear = new javax.swing.JButton();
        panel_Info2 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        lbl_Nombre2 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        lbl_Telefono2 = new javax.swing.JLabel();
        lbl_Doc2 = new javax.swing.JLabel();
        txt_Documento = new javax.swing.JTextField();
        cb_TipoDoc = new javax.swing.JComboBox<>();
        lbl_TipoDoc2 = new javax.swing.JLabel();
        lbl_Apellidos2 = new javax.swing.JLabel();
        txt_Apellidos = new javax.swing.JTextField();
        lbl_Espe = new javax.swing.JLabel();
        txt_Espe = new javax.swing.JTextField();
        lbl_Genero2 = new javax.swing.JLabel();
        rb_Masculino = new javax.swing.JRadioButton();
        rb_Femenino = new javax.swing.JRadioButton();
        lbl_Titulo = new javax.swing.JLabel();
        btn_Limpiar = new javax.swing.JButton();
        pnl_Actualizacion = new javax.swing.JPanel();
        panel_Editar = new javax.swing.JPanel();
        lbl_Programa = new javax.swing.JLabel();
        cb_TipoDoc2 = new javax.swing.JComboBox<>();
        lbl_TipoDoc3 = new javax.swing.JLabel();
        txt_Nombre2 = new javax.swing.JTextField();
        lbl_Nombre3 = new javax.swing.JLabel();
        lbl_Doc3 = new javax.swing.JLabel();
        txt_Doc2 = new javax.swing.JTextField();
        txt_Espe2 = new javax.swing.JTextField();
        lbl_Espe2 = new javax.swing.JLabel();
        txt_Telefono2 = new javax.swing.JTextField();
        lbl_Telefono3 = new javax.swing.JLabel();
        rb_Masculino2 = new javax.swing.JRadioButton();
        lbl_Genero3 = new javax.swing.JLabel();
        rb_Femenino2 = new javax.swing.JRadioButton();
        lbl_Titulo1 = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();
        panel_Info3 = new javax.swing.JPanel();
        txt_Documento2 = new javax.swing.JTextField();
        lbl_Documento = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        btn_Limpiar2 = new javax.swing.JButton();
        pnl_Lista = new javax.swing.JPanel();
        lbl_Titulo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Profesores = new javax.swing.JTable();
        btn_Refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        tabbedPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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

        txt_Telefono.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TelefonoKeyTyped(evt);
            }
        });

        lbl_Telefono2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono2.setText("Telefono:");

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
        lbl_Espe.setText("Especialidad:");

        txt_Espe.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Espe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_EspeKeyTyped(evt);
            }
        });

        lbl_Genero2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Genero2.setText("Genero:");

        rb_Masculino.setSelected(true);
        rb_Masculino.setText("M");

        rb_Femenino.setText("F");

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
                        .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addComponent(lbl_Nombre2)
                                .addGap(142, 142, 142))
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_Info2Layout.createSequentialGroup()
                                        .addComponent(lbl_Telefono2)
                                        .addGap(84, 84, 84)
                                        .addComponent(lbl_Espe)
                                        .addGap(0, 25, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Apellidos2)
                            .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Doc2)
                            .addGroup(panel_Info2Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(lbl_Genero2)))
                        .addContainerGap())
                    .addGroup(panel_Info2Layout.createSequentialGroup()
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Espe)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Masculino)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Femenino)
                        .addGap(25, 25, 25))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telefono2)
                    .addComponent(lbl_Espe)
                    .addComponent(lbl_Genero2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Info2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Espe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_Masculino)
                    .addComponent(rb_Femenino))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lbl_Titulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/add2.png"))); // NOI18N
        lbl_Titulo.setText("AGREGAR PROFESOR:");

        btn_Limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/refresh1.png"))); // NOI18N
        btn_Limpiar.setText("LIMPIAR");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_CreacionLayout = new javax.swing.GroupLayout(pnl_Creacion);
        pnl_Creacion.setLayout(pnl_CreacionLayout);
        pnl_CreacionLayout.setHorizontalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_CreacionLayout.createSequentialGroup()
                        .addGroup(pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_Info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnl_CreacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnl_CreacionLayout.setVerticalGroup(
            pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_Info2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tabbedPane.addTab("CREACION", pnl_Creacion);

        panel_Editar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        lbl_Programa.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lbl_Programa.setText(".");

        cb_TipoDoc2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cb_TipoDoc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_TipoDoc3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_TipoDoc3.setText("Tipo Identificacion:");

        txt_Nombre2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        lbl_Nombre3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Nombre3.setText("Nombre:");

        lbl_Doc3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Doc3.setText("Documento:");

        txt_Doc2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Doc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Doc2ActionPerformed(evt);
            }
        });
        txt_Doc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Doc2KeyTyped(evt);
            }
        });

        txt_Espe2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Espe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Espe2KeyTyped(evt);
            }
        });

        lbl_Espe2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Espe2.setText("Especialidad");

        txt_Telefono2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Telefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Telefono2KeyTyped(evt);
            }
        });

        lbl_Telefono3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Telefono3.setText("Telefono:");

        groupGeneros1.add(rb_Masculino2);
        rb_Masculino2.setSelected(true);
        rb_Masculino2.setText("M");

        lbl_Genero3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Genero3.setText("Genero:");

        groupGeneros1.add(rb_Femenino2);
        rb_Femenino2.setText("F");

        javax.swing.GroupLayout panel_EditarLayout = new javax.swing.GroupLayout(panel_Editar);
        panel_Editar.setLayout(panel_EditarLayout);
        panel_EditarLayout.setHorizontalGroup(
            panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EditarLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lbl_Espe2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EditarLayout.createSequentialGroup()
                        .addComponent(rb_Masculino2)
                        .addGap(30, 30, 30)
                        .addComponent(rb_Femenino2))
                    .addComponent(lbl_Genero3))
                .addGap(21, 21, 21))
            .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_EditarLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_Nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                        .addGroup(panel_EditarLayout.createSequentialGroup()
                            .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_TipoDoc3)
                                .addComponent(cb_TipoDoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Doc3)
                                .addComponent(txt_Doc2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(panel_EditarLayout.createSequentialGroup()
                            .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_EditarLayout.createSequentialGroup()
                                    .addComponent(txt_Telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_Espe2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbl_Nombre3)
                                .addComponent(lbl_Telefono3))
                            .addGap(0, 129, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        panel_EditarLayout.setVerticalGroup(
            panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EditarLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbl_Programa)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EditarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Espe2)
                    .addComponent(lbl_Genero3))
                .addGap(1, 1, 1)
                .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Femenino2)
                    .addComponent(rb_Masculino2))
                .addGap(23, 23, 23))
            .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_EditarLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lbl_Nombre3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_TipoDoc3)
                        .addComponent(lbl_Doc3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_TipoDoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Doc2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(lbl_Telefono3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Espe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        lbl_Titulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/mod2.png"))); // NOI18N
        lbl_Titulo1.setText("MODIFICAR PROFESOR:");

        btn_Actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/update1.png"))); // NOI18N
        btn_Actualizar.setText("ACTUALIZAR");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        panel_Info3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_Documento2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txt_Documento2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Documento2KeyTyped(evt);
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
                        .addComponent(txt_Documento2)
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
                    .addComponent(txt_Documento2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btn_Limpiar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Limpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/refresh1.png"))); // NOI18N
        btn_Limpiar2.setText("LIMPIAR");
        btn_Limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Limpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ActualizacionLayout = new javax.swing.GroupLayout(pnl_Actualizacion);
        pnl_Actualizacion.setLayout(pnl_ActualizacionLayout);
        pnl_ActualizacionLayout.setHorizontalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Info3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ActualizacionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_ActualizacionLayout.setVerticalGroup(
            pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ActualizacionLayout.createSequentialGroup()
                .addComponent(lbl_Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Info3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pnl_ActualizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Limpiar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("ACTUALIZACION", pnl_Actualizacion);

        lbl_Titulo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/user2.png"))); // NOI18N
        lbl_Titulo2.setText("LISTADO DE PROFESORES:");

        tbl_Profesores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbl_Profesores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_Profesores);

        btn_Refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Refrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/refresh1.png"))); // NOI18N
        btn_Refrescar.setText("REFRESH");
        btn_Refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ListaLayout = new javax.swing.GroupLayout(pnl_Lista);
        pnl_Lista.setLayout(pnl_ListaLayout);
        pnl_ListaLayout.setHorizontalGroup(
            pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(pnl_ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ListaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_ListaLayout.setVerticalGroup(
            pnl_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ListaLayout.createSequentialGroup()
                .addComponent(lbl_Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Refrescar)
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
            .addComponent(tabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void txt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TelefonoKeyTyped
    
    }//GEN-LAST:event_txt_TelefonoKeyTyped

    private void txt_DocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DocumentoActionPerformed
 
    }//GEN-LAST:event_txt_DocumentoActionPerformed

    private void txt_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DocumentoKeyTyped

    }//GEN-LAST:event_txt_DocumentoKeyTyped

    private void txt_EspeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_EspeKeyTyped
  
    }//GEN-LAST:event_txt_EspeKeyTyped

    private void txt_Doc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Doc2ActionPerformed
  
    }//GEN-LAST:event_txt_Doc2ActionPerformed

    private void txt_Doc2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Doc2KeyTyped

    }//GEN-LAST:event_txt_Doc2KeyTyped

    private void txt_Espe2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Espe2KeyTyped

    }//GEN-LAST:event_txt_Espe2KeyTyped

    private void txt_Telefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Telefono2KeyTyped
   
    }//GEN-LAST:event_txt_Telefono2KeyTyped

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void txt_Documento2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Documento2KeyTyped
       
    }//GEN-LAST:event_txt_Documento2KeyTyped

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
      
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_RefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefrescarActionPerformed

    }//GEN-LAST:event_btn_RefrescarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed

    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_Limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Limpiar2ActionPerformed
    
    }//GEN-LAST:event_btn_Limpiar2ActionPerformed

    public void conectaControlador(IControlador c) {
        btn_Limpiar.addActionListener(c);
        btn_Limpiar.setActionCommand("LIMPIAR_CREACION");
        
        btn_Limpiar2.addActionListener(c);
        btn_Limpiar2.setActionCommand("LIMPIAR_ACTUALIZACION");
        
        btn_Crear.addActionListener(c);
        btn_Crear.setActionCommand("CREAR");
        
        btn_Buscar.addActionListener(c);
        btn_Buscar.setActionCommand("BUSCAR");
        
        btn_Actualizar.addActionListener(c);
        btn_Actualizar.setActionCommand("ACTUALIZAR");
        
        btn_Refrescar.addActionListener(c);
        btn_Refrescar.setActionCommand("REFRESCAR");
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Limpiar;
    public javax.swing.JButton btn_Limpiar2;
    private javax.swing.JButton btn_Refrescar;
    public javax.swing.JComboBox<String> cb_TipoDoc;
    public javax.swing.JComboBox<String> cb_TipoDoc2;
    private javax.swing.ButtonGroup groupGeneros;
    private javax.swing.ButtonGroup groupGeneros1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Apellidos2;
    private javax.swing.JLabel lbl_Doc2;
    private javax.swing.JLabel lbl_Doc3;
    private javax.swing.JLabel lbl_Documento;
    private javax.swing.JLabel lbl_Espe;
    private javax.swing.JLabel lbl_Espe2;
    private javax.swing.JLabel lbl_Genero2;
    private javax.swing.JLabel lbl_Genero3;
    private javax.swing.JLabel lbl_Nombre2;
    private javax.swing.JLabel lbl_Nombre3;
    private javax.swing.JLabel lbl_Programa;
    private javax.swing.JLabel lbl_Telefono2;
    private javax.swing.JLabel lbl_Telefono3;
    private javax.swing.JLabel lbl_TipoDoc2;
    private javax.swing.JLabel lbl_TipoDoc3;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_Titulo1;
    private javax.swing.JLabel lbl_Titulo2;
    public javax.swing.JPanel panel_Editar;
    private javax.swing.JPanel panel_Info2;
    private javax.swing.JPanel panel_Info3;
    private javax.swing.JPanel pnl_Actualizacion;
    private javax.swing.JPanel pnl_Creacion;
    private javax.swing.JPanel pnl_Lista;
    private javax.swing.JRadioButton rb_Femenino;
    public javax.swing.JRadioButton rb_Femenino2;
    public javax.swing.JRadioButton rb_Masculino;
    public javax.swing.JRadioButton rb_Masculino2;
    private javax.swing.JTabbedPane tabbedPane;
    public javax.swing.JTable tbl_Profesores;
    public javax.swing.JTextField txt_Apellidos;
    public javax.swing.JTextField txt_Doc2;
    public javax.swing.JTextField txt_Documento;
    public javax.swing.JTextField txt_Documento2;
    public javax.swing.JTextField txt_Espe;
    public javax.swing.JTextField txt_Espe2;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_Nombre2;
    public javax.swing.JTextField txt_Telefono;
    public javax.swing.JTextField txt_Telefono2;
    // End of variables declaration//GEN-END:variables

}
