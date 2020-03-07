import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.VERTICAL;
import rojerusan.RSPanelsSlider;
import static sun.net.www.http.HttpClient.New;

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

    // Inicializar clases
    database db = new database();
    userModel md = new userModel();
    rotarImg rotar = new rotarImg();
    tablero table = new tablero();
    Ficha ficha = new Ficha();
    // Crea las fichas en forma de string
    ArrayList<String> jugadorFichas = new ArrayList<String>();
    ArrayList<String> maquinaFichas = new ArrayList<String>();
    ArrayList<String> maquina2Fichas = new ArrayList<String>();
    ArrayList<String> fichasSobrante = new ArrayList<String>();
    ArrayList<String> fichas;

    // Contiene las posiciones de las fichas y los objetos de las fichas
    ArrayList<Integer> posJugadorFichasX = new ArrayList<Integer>();
    ArrayList<Integer> posFichaSobrantesY = new ArrayList<Integer>();
    ArrayList<JLabel> jugadorFichasObj = new ArrayList<JLabel>();
    ArrayList<JLabel> maquinaFichasObj = new ArrayList<JLabel>();
    ArrayList<JLabel> maquina2FichasObj = new ArrayList<JLabel>();
    ArrayList<JLabel> fichasSobrantesObj = new ArrayList<JLabel>();

    // Informacion del jugador
    String user = "";

    public vista() {
        initComponents();
        this.setTitle("Domino");
        this.setIconImage(new ImageIcon(getClass().getResource("/img/fondos/domino.png")).getImage());
        this.setSize(800, 429);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //Inicializar db
        db.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salaEspera = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        frameTablero = new javax.swing.JFrame();
        tablero = new javax.swing.JPanel();
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
        loginUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginPass = new javax.swing.JPasswordField();
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
        registroUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        registroPass = new javax.swing.JPasswordField();
        labelSesion = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(50, 69, 89));
        jLabel15.setText("Domino");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 20, 140, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(50, 69, 89));
        jLabel16.setText("Configuración");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 200, 150, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(50, 69, 89));
        jLabel17.setText("Jugar 1 vs 2");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 120, 130, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(50, 69, 89));
        jLabel18.setText("Score");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 160, 60, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(50, 69, 89));
        jLabel19.setText("Salir");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 240, 50, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(50, 69, 89));
        jLabel20.setText("Jugar 1 VS 1");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 80, 150, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/domino-icon.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 30, 40, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/domino-icon.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 30, 40, 40));

        javax.swing.GroupLayout salaEsperaLayout = new javax.swing.GroupLayout(salaEspera.getContentPane());
        salaEspera.getContentPane().setLayout(salaEsperaLayout);
        salaEsperaLayout.setHorizontalGroup(
            salaEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        salaEsperaLayout.setVerticalGroup(
            salaEsperaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tablero.setBackground(new java.awt.Color(255, 255, 255));
        tablero.setPreferredSize(new java.awt.Dimension(1120, 655));
        tablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameTableroLayout = new javax.swing.GroupLayout(frameTablero.getContentPane());
        frameTablero.getContentPane().setLayout(frameTableroLayout);
        frameTableroLayout.setHorizontalGroup(
            frameTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
        );
        frameTableroLayout.setVerticalGroup(
            frameTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setName("panelLogin"); // NOI18N
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/img-fondo2.jpg"))); // NOI18N
        panelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/btn-login-off.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusable(false);
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

        loginUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginUser.setBorder(null);
        panelLogin.add(loginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 215, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 73, 94));
        jLabel3.setText("Password");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        loginPass.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        loginPass.setBorder(null);
        panelLogin.add(loginPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 295, 170, 20));

        labelRegistro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(255, 51, 51));
        labelRegistro.setText("Registrarse");
        labelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        registroUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registroUser.setBorder(null);
        panel.add(registroUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 215, 170, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(50, 69, 89));
        jLabel14.setText("Password");
        panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        registroPass.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        registroPass.setBorder(null);
        panel.add(registroPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 295, 170, 20));

        labelSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSesion.setForeground(new java.awt.Color(255, 51, 51));
        labelSesion.setText("Iniciar sesión");
        labelSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

    public void llenarArray() {
        jugadorFichas = ficha.getFichasJugador();
        maquinaFichas = ficha.getFichasMaquina();
        maquina2Fichas = ficha.getFichasMaquina2();
        fichasSobrante = ficha.getFichasSobrantes();
        //Label de las fichas
        jugadorFichasObj = ficha.getFichasJugadorObj();
        maquinaFichasObj = ficha.getFichasMaquinaObj();
        maquina2FichasObj = ficha.getFichasMaquina2Obj();
        fichasSobrantesObj = ficha.getFichasSobrantesObj();
        //Obtiene las posiciones
        posJugadorFichasX = ficha.getFichasJugadorPosX();
        posFichaSobrantesY = ficha.getFichasSobrantesPosY();
    }

    public void limpiarArray() {
        // Limpia el arrayList de los elementos que aun pueden contener
        jugadorFichas.clear();
        maquinaFichas.clear();
        maquina2Fichas.clear();
        fichasSobrante.clear();
        jugadorFichasObj.clear();
        maquinaFichasObj.clear();
        maquina2FichasObj.clear();
        fichasSobrantesObj.clear();
        posJugadorFichasX.clear();
        posFichaSobrantesY.clear();
    }

    public void comenzarJuego() {
        // Busca quien tiene el par mayor entre la maquina y el jugador
        int mayorJugador = mayor(jugadorFichas);
        int mayorMaquina = mayor(maquinaFichas);

        // Si existe un par mayor 
        if (mayorJugador >= 0 && mayorMaquina >= 0) {
            // Verifica quien tiene el par mayor, la maquina o el jugador
            if (mayorJugador > mayorMaquina) {
                // Agrega en el tablero la ficha
                int pos = jugadorFichas.indexOf(mayorJugador + "-" + mayorJugador);
                jugadorFichasObj.get(pos).setLocation(550, 305);
                // Elimina las ficha en el grupo de fichas que le pertenece al jugador
                removeFichas(jugadorFichas, pos);
                removeFichas(jugadorFichasObj, pos);
                removeFichas(posJugadorFichasX, pos);
            } else {
                // Busca la ficha en el arrayList
                int pos = maquinaFichas.indexOf(mayorMaquina + "-" + mayorMaquina);
                // Agrega en el tablero la ficha
                maquinaFichasObj.get(pos).setLocation(550, 305);
                ImageIcon icon = new ImageIcon("src/img/img-domino/" + mayorMaquina + "-" + mayorMaquina + ".png");
                maquinaFichasObj.get(pos).setIcon(icon);
                // Elimina las ficha en el grupo de fichas que le pertenece a la maquina
                removeFichas(maquinaFichas, pos);
                removeFichas(maquinaFichasObj, pos);
            }
        }
    }

    public void removeFichas(ArrayList array, int pos) {
        array.remove(pos);
    }

    public int mayor(ArrayList<String> array) {
        int mayor = -99;
        for (int i = 0; i < array.size(); i++) {
            String v[] = array.get(i).split("-");
            if (v[0].equals(v[1])) {
                if (Integer.parseInt(v[0]) > mayor) {
                    mayor = Integer.parseInt(v[0]);
                }
            }
        }
        return mayor;
    }
    
    // Se encarga de abrir las ventanas
    void abrirVentana(JFrame frame, int w, int h) {
        frame.setSize(w, h);
        frame.setResizable(false);
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon(getClass().getResource("/img/fondos/domino.png")).getImage());
    }

    // Limpia los cuadros de textos del login y del registro
    void limpiar() {
        loginUser.setText("");
        loginPass.setText("");
        registroPass.setText("");
        registroUser.setText("");
    }


    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {
            if (registroUser.getText().trim().equalsIgnoreCase("") || registroPass.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No debe dejar campos vacios");
            } else {
                boolean res = md.guardarUser(registroUser.getText().trim(), registroPass.getText().trim());

                if (res) {
                    JOptionPane.showMessageDialog(null, "Usuario creado !!");
                    limpiar();
                }

            }
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            if (loginUser.getText().trim().equalsIgnoreCase("") || loginPass.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No debe dejar campos vacios");
            } else {
                // Se encarga de verificar que el usuario este registrado
                boolean res = md.buscarUser(loginUser.getText().trim(), loginPass.getText().trim());
                // Si el usuario esta registrado se le llevara a la segunda parte
                if (res) {
                    abrirVentana(salaEspera, 384, 320);
                    this.setVisible(false);
                    user = loginUser.getText();
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void labelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistroMouseClicked
        slider.setPanelSlider(30, panelRegistro, RSPanelsSlider.DIRECT.RIGHT);
        limpiar();
    }//GEN-LAST:event_labelRegistroMouseClicked

    private void labelSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseClicked
        slider.setPanelSlider(30, panelLogin, RSPanelsSlider.DIRECT.DOWN);
        limpiar();
    }//GEN-LAST:event_labelSesionMouseClicked

    // Boton que se encargara de activar el juego 1vs1
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        ficha.tablero(tablero);
        ficha.generarFichas();
        ficha.distribuirFichas(false);
        ficha.mostrarFichas(false, user);
        llenarArray();
        comenzarJuego();
        abrirVentana(frameTablero, 1220, 655);
        limpiar();
    }//GEN-LAST:event_jLabel20MouseClicked

    // Boton que se encargara de activar el juego 2vs1
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        ficha.tablero(tablero);
        ficha.generarFichas();
        ficha.distribuirFichas(true);
        ficha.mostrarFichas(true, user);
        llenarArray();
        abrirVentana(frameTablero, 1220, 655);
        limpiar();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        salaEspera.setVisible(false);
        abrirVentana(this, 800, 420);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void tableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableroMouseClicked
        int pos = -1;
        for (int i = 0; i < posJugadorFichasX.size(); i++) {
            if ((posJugadorFichasX.get(i) <= evt.getX() && evt.getX() <= (posJugadorFichasX.get(i) + 35)) && (550 <= evt.getY() && evt.getY() <= 618)) {
                pos = i;
            }
        }

        if (pos != -1) {
            jugadorFichasObj.get(pos).setLocation(191, 206);
            System.out.println(jugadorFichasObj.get(pos).getName());
        }
    }//GEN-LAST:event_tableroMouseClicked

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
    private javax.swing.JFrame frameTablero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelSesion;
    private javax.swing.JPasswordField loginPass;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPasswordField registroPass;
    private javax.swing.JTextField registroUser;
    private javax.swing.JFrame salaEspera;
    private rojerusan.RSPanelsSlider slider;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
