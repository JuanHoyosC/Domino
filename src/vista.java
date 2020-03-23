import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
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

    //Variables para comenzar la partida
    int turno = 0;
    boolean tomar = false;
    boolean direccion = true;
    boolean gameover = false;
    //Variables para los puntos del jugador
    int puntosJugador = 0;
    int puntosM0 = 0;
    int puntosM1 = 0;
    // para colocar fichas en el lugar de maquina
    int y1 = 10;
    int y2 = 100;
    //1v1 or 2vs1
    boolean cantMaquina = false;
    //Muestra en pantalla el turno
    JLabel labelTurno = new JLabel();

    ArrayList<JLabel> fichasTablero = new ArrayList<JLabel>();

    // Posiciones iniciales de fichas
    int posX[] = {830, 760, 690, 620, 550, 480, 410, 340, 270, 200, 130, 60, 60, 60, 130, 200, 270, 340, 410, 480, 550, 590, 660, 730, 800, 870, 940, 1010, 1040,
        1010, 940, 870, 800, 730, 660, 590, 520, 450, 380, 310, 240};
    int posY[] = {440, 440, 440, 440, 440, 440, 440, 440, 440, 440, 440, 440, 370, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 330, 260,
        220, 220, 220, 220, 220, 220, 220, 220, 220, 220, 220, 220};
    int posDer = 21;
    int posIzq = 19;

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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        frameTablero = new javax.swing.JFrame();
        tablero = new javax.swing.JPanel();
        framePuntos = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        pm2 = new javax.swing.JLabel();
        lblPuntos2 = new javax.swing.JLabel();
        lblPuntos3 = new javax.swing.JLabel();
        pj = new javax.swing.JLabel();
        pm1 = new javax.swing.JLabel();
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

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(50, 69, 89));
        jLabel17.setText("Jugar 1 VS 2");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 120, 140, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(50, 69, 89));
        jLabel18.setText("Score");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
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

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(50, 69, 89));
        jLabel24.setText("Configuración");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 200, 150, -1));

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
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout frameTableroLayout = new javax.swing.GroupLayout(frameTablero.getContentPane());
        frameTablero.getContentPane().setLayout(frameTableroLayout);
        frameTableroLayout.setHorizontalGroup(
            frameTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        frameTableroLayout.setVerticalGroup(
            frameTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondos/domino-icon.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 45, 77));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(50, 69, 89));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 156, -1));

        lblPuntos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuntos.setForeground(new java.awt.Color(50, 69, 89));
        lblPuntos.setText("Puntos Maquina 1: ");
        jPanel2.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 170, -1));

        pm2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pm2.setForeground(new java.awt.Color(50, 69, 89));
        pm2.setText("0");
        jPanel2.add(pm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 50, -1));

        lblPuntos2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuntos2.setForeground(new java.awt.Color(50, 69, 89));
        lblPuntos2.setText("Puntos Maquina 0: ");
        jPanel2.add(lblPuntos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 170, -1));

        lblPuntos3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuntos3.setForeground(new java.awt.Color(50, 69, 89));
        lblPuntos3.setText("Puntos Jugador: ");
        jPanel2.add(lblPuntos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, -1));

        pj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pj.setForeground(new java.awt.Color(50, 69, 89));
        pj.setText("0");
        jPanel2.add(pj, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 50, -1));

        pm1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pm1.setForeground(new java.awt.Color(50, 69, 89));
        pm1.setText("0");
        jPanel2.add(pm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 50, -1));

        javax.swing.GroupLayout framePuntosLayout = new javax.swing.GroupLayout(framePuntos.getContentPane());
        framePuntos.getContentPane().setLayout(framePuntosLayout);
        framePuntosLayout.setHorizontalGroup(
            framePuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        framePuntosLayout.setVerticalGroup(
            framePuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
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

    //Llena los array de las fichas, posiciones y todo lo necesario para comenzar el juego
    public void llenarArray() {
        //Arrays que guardan los numeros de las fichas
        jugadorFichas = ficha.getFichasJugador();
        maquinaFichas = ficha.getFichasMaquina();
        maquina2Fichas = ficha.getFichasMaquina2();
        fichasSobrante = ficha.getFichasSobrantes();
        //Array que guarda las fichas
        jugadorFichasObj = ficha.getFichasJugadorObj();
        maquinaFichasObj = ficha.getFichasMaquinaObj();
        maquina2FichasObj = ficha.getFichasMaquina2Obj();
        fichasSobrantesObj = ficha.getFichasSobrantesObj();
        //Obtiene las posiciones
        posJugadorFichasX = ficha.getFichasJugadorPosX();
        posFichaSobrantesY = ficha.getFichasSobrantesPosY();
    }

    //Vacia los array de partidas anteriores
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
        fichasTablero.clear();
    }

    //Se inicializa el JLabel encargado de mostrar el turno
    public void mostrarTurno() {
        labelTurno.setText("");
        labelTurno.setBounds(20, 200, 230, 35);
        labelTurno.setForeground(new Color(53, 73, 94));
        labelTurno.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        tablero.add(labelTurno);
    }

    // Elimina la ficha de la maquina o jugador
    public void removeFichas(ArrayList array, int pos) {
        array.remove(pos);
    }

    //comenzar el turno
    public void comenzarTurno() {
        turno = 0;
        posDer = 21;
        posIzq = 19;
        gameover = false;
        y1 = 10;
        mostrarTurno();
    }

    // rutina que agrega la primera ficha a la partida
    public void comenzarJuego(boolean maquina2) throws IOException {
        if (!maquina2) {
            primerJugada1vs1();
        } else {
            primerJugada2vs1();
        }
    }

    //Se encarga de escoger quien juega primero cuando es 1vs1
    public void primerJugada1vs1() throws IOException {
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                try {
                    // Busca quien tiene el par mayor entre la maquina y el jugador
                    int mayorJugador = mayor(jugadorFichas);
                    int mayorMaquina = mayor(maquinaFichas);
                    fichasTablero.clear();
                    // Si existe un par mayor 
                    if (mayorJugador >= 0 || mayorMaquina >= 0) {
                        // Verifica quien tiene el par mayor, la maquina o el jugador
                        if (mayorJugador > mayorMaquina) {
                            int pos = jugadorFichas.indexOf(mayorJugador + "-" + mayorJugador);
                            removeFichas(posJugadorFichasX, pos);
                            colocarPrimerFicha(mayorJugador, jugadorFichas, jugadorFichasObj);
                            //Le da el turno a la maquina
                            turno = 1;
                            maquina0();
                            timer.cancel();
                            timer.purge();
                        } else {
                            colocarPrimerFicha(mayorMaquina, maquinaFichas, maquinaFichasObj);
                            turno = 0;
                            labelTurno.setText("TURNO DE " + user);
                            timer.cancel();
                            timer.purge();
                        }
                    } else {
                        // Agrega en el tablero la ficha
                        int pos = (int) (Math.random() * jugadorFichasObj.size());
                        jugadorFichasObj.get(pos).setLocation(552, 305);
                        //Añade a una array las fichas que estan en el tablero
                        fichasTablero.add(jugadorFichasObj.get(pos));
                        // Elimina las ficha en el grupo de fichas que le pertenece al jugador
                        removeFichas(jugadorFichas, pos);
                        removeFichas(jugadorFichasObj, pos);
                        removeFichas(posJugadorFichasX, pos);
                        //Le da el turno a la maquina
                        turno = 1;
                        maquina0();
                        timer.cancel();
                        timer.purge();
                    }
                } catch (Exception e) {
                }
            }
        };
        timer.schedule(tarea, 3500, 10);
    }

    //Se encarga de escoger quien juega primero cuando es 2vs1
    public void primerJugada2vs1() throws IOException {
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                try {
                    // Busca quien tiene el par mayor entre la maquina y el jugador
                    int mayorJugador = mayor(jugadorFichas);
                    int mayorMaquina = mayor(maquinaFichas);
                    int mayorMaquina2 = mayor(maquina2Fichas);
                    fichasTablero.clear();
                    // Si existe un par mayor 
                    if (mayorJugador >= 0 || mayorMaquina >= 0 || mayorMaquina2 >= 0) {
                        // Verifica quien tiene el par mayor, la maquina o el jugador
                        if (mayorJugador > mayorMaquina2 && mayorJugador > mayorMaquina) {
                            int pos = jugadorFichas.indexOf(mayorJugador + "-" + mayorJugador);
                            removeFichas(posJugadorFichasX, pos);
                            colocarPrimerFicha(mayorJugador, jugadorFichas, jugadorFichasObj);
                            turno = 1;
                            maquina0();
                            timer.cancel();
                            timer.purge();
                        }

                        if (mayorMaquina > mayorMaquina2 && mayorMaquina > mayorJugador) {
                            colocarPrimerFicha(mayorMaquina, maquinaFichas, maquinaFichasObj);
                            turno = 2;
                            maquina1();
                            timer.cancel();
                            timer.purge();
                        }

                        if (mayorMaquina2 > mayorMaquina && mayorMaquina2 > mayorJugador) {
                            colocarPrimerFicha(mayorMaquina2, maquina2Fichas, maquina2FichasObj);
                            turno = 0;
                            labelTurno.setText("TURNO DE " + user);
                            timer.cancel();
                            timer.purge();
                        }

                    } else {
                        // Agrega en el tablero la ficha
                        int pos = (int) (Math.random() * jugadorFichasObj.size());
                        jugadorFichasObj.get(pos).setLocation(552, 305);
                        //Añade a una array las fichas que estan en el tablero
                        fichasTablero.add(jugadorFichasObj.get(pos));
                        // Elimina las ficha en el grupo de fichas que le pertenece al jugador
                        removeFichas(jugadorFichas, pos);
                        removeFichas(jugadorFichasObj, pos);
                        removeFichas(posJugadorFichasX, pos);
                        turno = 1;
                        maquina0();
                        timer.cancel();
                        timer.purge();
                    }
                } catch (Exception e) {
                }
            }
        };
        timer.schedule(tarea, 3500, 10);
    }

    // Se encarga de colocar la primera ficha en el tablero
    public void colocarPrimerFicha(int mayor, ArrayList<String> array, ArrayList<JLabel> arrayObj) {
        // Busca la ficha en el arrayList
        int pos = array.indexOf(mayor + "-" + mayor);
        // Agrega en el tablero la ficha
        arrayObj.get(pos).setLocation(552, 305);
        fichasTablero.add(arrayObj.get(pos));
        ImageIcon icon = new ImageIcon("src/img/img-domino/" + mayor + "-" + mayor + ".png");
        arrayObj.get(pos).setIcon(icon);
        // Elimina las ficha en el grupo de fichas que le pertenece a la maquina
        removeFichas(array, pos);
        removeFichas(arrayObj, pos);
    }

    //Escoge la ficha par mayor
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

    //Elige al ganador y cuenta los puntos
    public void gameOver() throws IOException {
        if (!cantMaquina) {
            gameOver1VS1();
        } else {
            gameOver2VS1();
        }
    }

    // Verifica el gameOver cuando se juega 1vs1
    public void gameOver1VS1() throws IOException {
        boolean jugador = true;
        boolean maquina = true;

        //Verifica si la maquina tiene fichas que colocar en el tablero
        for (int i = 0; i < maquinaFichasObj.size(); i++) {
            maquina = comprobar(maquinaFichasObj);
        }

        //Verifica si el jugador tiene ficha que colocar en el tablero
        for (int i = 0; i < jugadorFichasObj.size(); i++) {
            jugador = comprobar(jugadorFichasObj);
        }
        //Si se congela la partida, se cuenta quien tiene menor puntaje y ese es el ganador
        if (!maquina && !jugador && fichasSobrantesObj.size() == 0) {
            int puntosM = puntos(maquinaFichasObj);
            int puntosJ = puntos(jugadorFichasObj);

            if (puntosM < puntosJ) {
                labelTurno.setText("GANO LA MAQUINA 0");
                puntosM0++;
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
            }

            if (puntosM > puntosJ) {
                labelTurno.setText("GANO " + user);
                puntosJugador++;
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
            }

            if (puntosM == puntosJ) {
                labelTurno.setText("HUBO UN EMPATE");
            }

            //Muestra las fichas de la maquina
            verMaquina(maquinaFichasObj);
            gameover = true;
        } else {
            //Si la maquina no tiene fichas gana
            if (ganador(maquinaFichasObj)) {
                labelTurno.setText("GANO LA MAQUINA 0");
                // Aumenta los puntos de la maquina 0
                puntosM0++;
                //Actualiza la base de datos
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
                gameover = true;
            } else {
                // Si el jugador no tiene fichas gana
                if (ganador(jugadorFichasObj)) {
                    //Actualiza los puntos del jugador
                    puntosJugador++;
                    //Actualiza la base de datos
                    md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
                    labelTurno.setText("GANO " + user);
                    //Muestra las fichas de la maquina
                    verMaquina(maquinaFichasObj);
                    gameover = true;
                } else {
                    //Si el jugador se encuentra atascado le da el turno a la maquina 0
                    if (!jugador && fichasSobrantesObj.size() == 0) {
                        turno = 1;
                        maquina0();
                    }
                }
            }

        }
    }

    // Verifica el gameOver cuando se juega 2vs1
    public void gameOver2VS1() throws IOException {
        boolean jugador = true;
        boolean maquina1 = true;
        boolean maquina2 = true;

        //Verifica si la maquina tiene fichas que colocar en el tablero
        for (int i = 0; i < maquinaFichasObj.size(); i++) {
            maquina1 = comprobar(maquinaFichasObj);
        }

        //Verifica si el jugador tiene ficha que colocar en el tablero
        for (int i = 0; i < jugadorFichasObj.size(); i++) {
            jugador = comprobar(jugadorFichasObj);
        }

        //Verifica si el jugador tiene ficha que colocar en el tablero
        for (int i = 0; i < maquina2FichasObj.size(); i++) {
            maquina2 = comprobar(maquina2FichasObj);
        }
        //Si se congela la partida, se cuenta quien tiene menor puntaje y ese es el ganador
        if (!maquina1 && !maquina2 && !jugador && fichasSobrantesObj.size() == 0) {
            int puntosM = puntos(maquinaFichasObj);
            int puntosM3 = puntos(maquina2FichasObj);
            int puntosJ = puntos(jugadorFichasObj);

            if (puntosM < puntosJ && puntosM < puntosM3) {
                labelTurno.setText("GANO LA MAQUINA 0");
                puntosM0++;
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
            }

            if (puntosJ < puntosM && puntosJ < puntosM3) {
                labelTurno.setText("GANO " + user);
                puntosJugador++;
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
            }

            if (puntosM3 < puntosJ && puntosM3 < puntosM) {
                labelTurno.setText("GANO LA MAQUINA 1");
                puntosM1++;
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
            }

            if (puntosM == puntosJ && puntosM == puntosM3) {
                labelTurno.setText("HUBO UN EMPATE");
            }

            //Muestra las fichas de las maquinas
            verMaquina(maquinaFichasObj);
            verMaquina(maquina2FichasObj);
            gameover = true;
        } else {
            //Si la maquina no tiene fichas gana
            if (ganador(maquinaFichasObj)) {
                labelTurno.setText("GANO LA MAQUINA 0");
                puntosM0++;
                md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
                verMaquina(maquina2FichasObj);
                gameover = true;
            } else {
                // Si el jugador no tiene fichas ganas
                if (ganador(jugadorFichasObj)) {
                    puntosJugador++;
                    md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
                    labelTurno.setText("GANO " + user);
                    //Muestra las fichas de las maquinas
                    verMaquina(maquinaFichasObj);
                    verMaquina(maquina2FichasObj);
                    gameover = true;
                } else {
                    // Si el jugador no tiene fichas ganas
                    if (ganador(maquina2FichasObj)) {
                        puntosM1++;
                        md.updatePuntos(user, puntosJugador, puntosM0, puntosM1);
                        labelTurno.setText("GANO LA MAQUINA 1");
                        //Muestra las fichas de las maquinas
                        verMaquina(maquinaFichasObj);
                        gameover = true;
                    } else {
                        //Si el jugador se encuentra atascado le da el turno a la maquina 0
                        if (!jugador && fichasSobrantesObj.size() == 0) {
                            turno = 1;
                            maquina0();
                        }
                    }
                }
            }

        }
    }

    //Verifica si se le acabo las fichas a la maquinas o al jugador
    public boolean ganador(ArrayList<JLabel> array) {
        if (array.size() == 0) {
            return true;
        }

        return false;
    }

    //Rutina que muestra las fichas de la maquina
    public void verMaquina(ArrayList<JLabel> arrayObj) {
        for (int i = 0; i < arrayObj.size(); i++) {
            ImageIcon icon = new ImageIcon("src/img/img-domino/" + arrayObj.get(i).getName() + ".png");
            arrayObj.get(i).setIcon(icon);
        }
    }

    //Se encarga de sumar los puntos
    public int puntos(ArrayList<JLabel> array) {
        int suma = 0;
        for (int i = 0; i < array.size(); i++) {
            String v[] = array.get(i).getName().split("-");
            suma = suma + Integer.parseInt(v[0]) + Integer.parseInt(v[1]);
        }

        return suma;
    }

    //Funcion que se encarga de mandarle los parametros necesario para que la maquina 1 juegue
    public void maquina0() throws IOException {
        if (!gameover) {
            int x;
            turno = 1;
            labelTurno.setText("TURNO DE LA MAQUINA 0");
            //Cuando hay fichas nuevas organiza las fichas en el lugar de la maquina 0
            if ((maquinaFichasObj.get(maquinaFichasObj.size() - 1).getX() + 50) == 510) {
                y1 = 90;
                x = -40;
            } else {
                x = maquinaFichasObj.get(maquinaFichasObj.size() - 1).getX();
            }

            if ((maquinaFichasObj.get(maquinaFichasObj.size() - 1).getX() + 50) != 510 && (maquinaFichasObj.get(maquinaFichasObj.size() - 1).getY()) == 10) {
                y1 = 10;
            }

            maquina(maquinaFichasObj, true, x, y1);
        }
    }

    //Funcion que se encarga de mandarle los parametros necesario para que la maquina 2 juegue
    public void maquina1() throws IOException {
        if (!gameover) {
            labelTurno.setText("TURNO DE LA MAQUINA 1");
            int x;
            turno = 2;
            //Cuando hay fichas nuevas organiza las fichas en el lugar de la maquina 1
            System.out.println(maquina2FichasObj.get(maquina2FichasObj.size() - 1).getX());
            if ((maquina2FichasObj.get(maquina2FichasObj.size() - 1).getX() + 50) == 1080) {
                y2 = 90;
                x = 530;
            } else {
                x = maquina2FichasObj.get(maquina2FichasObj.size() - 1).getX();
            }

            if ((maquina2FichasObj.get(maquina2FichasObj.size() - 1).getX() + 50) != 1080 && (maquina2FichasObj.get(maquina2FichasObj.size() - 1).getY()) == 10) {
                y2 = 10;
            }

            maquina(maquina2FichasObj, false, x, y2);
        }
    }

    // Subrutina encargada del control de la maquina
    public void maquina(ArrayList<JLabel> arrayObj, boolean maquina, int x, int y) throws IOException {
        if (!gameover) {
            Timer timer = new Timer();
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    try {
                        //Verifica si la maquina tiene fichas que poner en el tablero
                        boolean escoger = comprobar(arrayObj);

                        //Si no tiene fichas ni hay fichas entre las sobrantes, la maquina cede el turno
                        if (!escoger && fichasSobrantesObj.size() == 0) {
                            //Si se juega 1vs1 la maquina 0 le da el turno al jugador
                            if (!cantMaquina) {
                                turno = 0;
                                labelTurno.setText("TURNO DE " + user);
                                //Detiene la tarea de poner las fichas cada n segundos
                                timer.cancel();
                                timer.purge();
                                gameOver();
                                //Si se juega 2vs1 se verifica cual de las dos maquinas quedo atascada
                            } else {
                                //Si la maquina 0 quedo atascada le da el turno a la maquina 1
                                if (maquina) {
                                    turno = 2;
                                    ///Detiene la tarea de poner las fichas cada n segundos
                                    timer.cancel();
                                    timer.purge();
                                    //Verifica primero si el juego termino antes de darle el turno a la maquina 1
                                    gameOver();
                                    maquina1();
                                    // Si la maquina 1 quedo atascada le da el turno al jugador
                                } else {
                                    turno = 0;
                                    labelTurno.setText("TURNO DE " + user);
                                    ///Detiene la tarea de poner las fichas cada n segundos
                                    timer.cancel();
                                    timer.purge();
                                    gameOver();
                                }
                            }

                        } else {
                            // Si la maquina tiene fichas para poner el tablero entra en el condicional
                            if (escoger) {
                                //Busca que ficha sirve para colocar en el tablero
                                for (int i = 0; i < arrayObj.size(); i++) {
                                    //Si la ficha se puede colocar tanto en izquierda como derecha se escoge una direccion
                                    if (comprobarLados(arrayObj.get(i))) {
                                        int rnd = (int) (Math.random() * 2);
                                        //Se elige en que direccion en que ira la ficha en el tablero
                                        if (rnd == 0) {
                                            direccion = true;
                                        } else {
                                            direccion = false;
                                        }
                                    }
                                    //Verifica si la ficha sirve y la coloca en el tablero
                                    if (verificarFicha(arrayObj.get(i), comprobarLados(arrayObj.get(i)))) {
                                        arrayObj.remove(i);
                                        //Si se esta jugando 1vs le da el turno al jugador
                                        if (!cantMaquina) {
                                            turno = 0;
                                            labelTurno.setText("TURNO DE " + user);
                                            //Detiene la tarea
                                            timer.cancel();
                                            timer.purge();
                                            gameOver();
                                        } else {
                                            //Si se juega 2vs1 le y el turno es de maquina1 le da el turno a maquina2 si no
                                            if (maquina) {
                                                // Detiene la tarea de poner las fichas
                                                timer.cancel();
                                                timer.purge();
                                                //Verifica  primero si el juego termino antes de darle el turno a la maquina
                                                gameOver();
                                                //Le da el turno a la maquina 1
                                                maquina1();
                                            } else {
                                                turno = 0;
                                                labelTurno.setText("TURNO DE " + user);
                                                // Detiene la tarea de poner las fichas
                                                timer.cancel();
                                                timer.purge();
                                                gameOver();
                                            }
                                        }

                                        break;
                                    }
                                }
                            } else {
                                // Si la partida no se ha acabado y la maquina no tiene fichas que colocar, escoge una de las sobrantes
                                int rnd = (int) (Math.random() * fichasSobrantesObj.size());
                                //Mueve la ficha del lado de las sobrantes a las fichas del jugador
                                fichasSobrantesObj.get(rnd).setLocation(x + 50, y);

                                //Añade la ficha a la fichas del jugador
                                arrayObj.add(fichasSobrantesObj.get(rnd));
                                ImageIcon icon = new ImageIcon("src/img/img-domino/volteada.png");
                                arrayObj.get(arrayObj.size() - 1).setIcon(icon);
                                arrayObj.get(arrayObj.size() - 1).setSize(35, 68);
                                //Borra la ficha de las sobrantes
                                removeFichas(fichasSobrantesObj, rnd);
                                removeFichas(posFichaSobrantesY, rnd);
                                // Detiene la tarea de poner las fichas
                                timer.cancel();
                                timer.purge();
                                gameOver();
                                // Si la maquina1 es la que tiene el turno llama a la maquina1 si no se llama a la funcion de la maquina2
                                if (maquina) {
                                    // Detiene la tarea de poner las fichas
                                    timer.cancel();
                                    timer.purge();
                                    maquina0();
                                } else {
                                    // Detiene la tarea de poner las fichas
                                    timer.cancel();
                                    timer.purge();
                                    maquina1();
                                }

                            }
                        }
                        // Detiene la tarea de poner las fichas
                        timer.cancel();
                        timer.purge();
                    } catch (IOException ex) {
                        Logger.getLogger(vista.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            };

            //Hace que la maquina tarde 2.5 segundos en poner la ficha
            timer.schedule(tarea, 2500, 3000);
        }
    }

    //Llama a la clase rotar y rota la imagen
    public void rotar(JLabel ficha, double grados, int w, int h, String name) throws IOException {
        File img = new File("src/img/img-domino/" + name + ".png");
        BufferedImage bufferedImage = ImageIO.read(img);
        ImageIcon imageIcon = new ImageIcon(rotar.rotate(bufferedImage, grados));
        ficha.setIcon(imageIcon);
        ficha.setSize(w, h);
    }

    // Verifica si el jugador o la maquina tiene una ficha que le sirva
    public boolean comprobar(ArrayList<JLabel> array) {
        //Obtiene las fichas que están en el extremo del tablero
        String fichaIzq = fichasTablero.get(0).getName().split("-")[0];
        String fichaDer = fichasTablero.get(fichasTablero.size() - 1).getName().split("-")[1];

        //Comprueba si el usuario tiene entre sus fichas unas que pueda colocar en el tablero
        for (int i = 0; i < array.size(); i++) {
            String ficha[] = array.get(i).getName().split("-");
            if (ficha[0].equals(fichaIzq) || ficha[0].equals(fichaDer) || ficha[1].equals(fichaIzq) || ficha[1].equals(fichaDer)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si el jugador o la maquina tiene una ficha que le sirva
    public boolean comprobarLados(JLabel ficha) {
        //Obtiene las fichas que están en el extremo del tablero
        String fichaIzq = fichasTablero.get(0).getName().split("-")[0];
        String fichaDer = fichasTablero.get(fichasTablero.size() - 1).getName().split("-")[1];

        //Comprueba si el usuario tiene entre sus fichas unas que pueda colocar en el tablero
        String fichas[] = ficha.getName().split("-");
        if (fichas[0].equals(fichaIzq) && fichas[0].equals(fichaDer)) {
            return true;
        }

        if (fichas[1].equals(fichaIzq) && fichas[1].equals(fichaDer)) {
            return true;
        }

        if (fichas[1].equals(fichaIzq) && fichas[0].equals(fichaDer)) {
            return true;
        }

        if (fichas[0].equals(fichaIzq) && fichas[1].equals(fichaDer)) {
            return true;
        }

        return false;
    }

    // Escoge a que direccion deberá ir la ficha
    public boolean direccion() {
        try {
            String[] direcciones = {
                "Derecha",
                "Izquierda",};

            String resp = (String) JOptionPane.showInputDialog(null, "¿En donde poner la ficha?", "direcciones", JOptionPane.DEFAULT_OPTION, null, direcciones, direcciones[0]);
            //Retornara verdadero si el jugador quiere poner la ficha del lado derecho y falso si la quire colocar del lado izquierdo
            if (resp.equals("Derecha")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
        }
        return true;
    }

    // Aqui se verifica que la ficha pueda ser posicionada y tambien se posiciona en el tablero
    public boolean verificarFicha(JLabel ficha, boolean ladosID) throws IOException {
        String name[] = ficha.getName().split("-");
        JLabel fichaIzq = fichasTablero.get(0);
        JLabel fichaDer = fichasTablero.get(fichasTablero.size() - 1);
        // Obtiene el numero de las fichas que estan en el tablero
        String nameFichaIzq[] = fichaIzq.getName().split("-");
        String nameFichaDer[] = fichaDer.getName().split("-");

        // Si la ficha no se puede colocar en los extremos se verifica primero la parte derecha y luego la izquierda
        if (!ladosID) {
            if (moverFichaDer(name, ficha, nameFichaDer)) {
                return true;
            } else {
                return moverFichaIzq(name, ficha, nameFichaIzq);
            }

        } else {
            //Si la ficha se puede colocar en los extremos, se coloca segun la direccion asignada por la maquina o usuario
            if (direccion) {
                return moverFichaDer(name, ficha, nameFichaDer);
            } else {
                return moverFichaIzq(name, ficha, nameFichaIzq);
            }
        }
    }

    //Le da border de colores a las fichas 
    public void colorearBorder(JLabel ficha) {
        //Le da un color azul a las fichas del jugador
        if (turno == 0) {
            ficha.setBorder(BorderFactory.createLineBorder(new Color(45, 131, 223), 1));
        }

        //Le da un color naranja a la maquina 0
        if (turno == 1) {
            ficha.setBorder(BorderFactory.createLineBorder(new Color(232, 74, 27), 1));
        }

        //Le da un color verde a la maquina 1
        if (turno == 2) {
            ficha.setBorder(BorderFactory.createLineBorder(new Color(23, 165, 137), 1));

        }
    }

    //Funcion encargada de mover la ficha al lado izquierdo del tablero
    public boolean moverFichaIzq(String name[], JLabel ficha, String nameFichaIzq[]) throws IOException {
        // Comprueba si la ficha se puede colocar del lado izquierdo
        if (name[0].equals(nameFichaIzq[0])) {
            colorearBorder(ficha);
            if (posIzq == 12) {
                //Rota las fichas en la direccion debida
                rotar(ficha, 180, 35, 68, ficha.getName());
            } else {
                if (posIzq < 12) {
                    rotar(ficha, 90, 68, 35, ficha.getName());
                } else {
                    rotar(ficha, 270, 68, 35, ficha.getName());
                }
            }
            //Mueve la ficha al tablero
            ficha.setLocation(posX[posIzq], posY[posIzq]);
            ficha.setName(name[1] + "-" + name[0]);
            posIzq--;
            //añade la ficha al tablero
            fichasTablero.add(0, ficha);
            return true;
        }

        // Comprueba si la ficha se puede colocar del lado izquierdo
        if (name[1].equals(nameFichaIzq[0])) {
            //Le da border de colores a las fichas azul si es las del jugador y naranja si es de la maquina
            colorearBorder(ficha);
            if (posIzq == 12) {
                rotar(ficha, 0, 35, 68, ficha.getName());
            } else {
                if (posIzq < 12) {
                    rotar(ficha, 270, 68, 35, ficha.getName());
                } else {
                    rotar(ficha, 90, 68, 35, ficha.getName());
                }
            }
            //Mueve la ficha al tablero
            ficha.setLocation(posX[posIzq], posY[posIzq]);
            posIzq--;
            //añade la ficha al tablero
            fichasTablero.add(0, ficha);
            return true;
        }
        return false;
    }

    //Funcion encargada de mover la ficha al lado derecho del tablero
    public boolean moverFichaDer(String name[], JLabel ficha, String nameFichaDer[]) throws IOException {
        if (name[0].equals(nameFichaDer[1])) {
            colorearBorder(ficha);
            // Comprueba si la ficha se puede colocar del lado derecho
            if (posDer == 28) {
                rotar(ficha, 0, 35, 68, ficha.getName());
            } else {
                if (posDer > 28) {
                    rotar(ficha, 270, 68, 35, ficha.getName());
                } else {
                    rotar(ficha, 90, 68, 35, ficha.getName());
                }
            }
            //Mueve la ficha al tablero
            ficha.setLocation(posX[posDer], posY[posDer]);
            posDer++;
            //añade la ficha al tablero
            fichasTablero.add(ficha);
            return true;
        }

        // Comprueba si la ficha se puede colocar del lado derecho
        if (name[1].equals(nameFichaDer[1])) {
            colorearBorder(ficha);
            if (posDer == 28) {
                rotar(ficha, 180, 35, 68, ficha.getName());
            } else {
                if (posDer > 28) {
                    rotar(ficha, 90, 68, 35, ficha.getName());
                } else {
                    rotar(ficha, 270, 68, 35, ficha.getName());
                }
            }
            //Mueve la ficha al tablero
            ficha.setLocation(posX[posDer], posY[posDer]);
            ficha.setName(name[1] + "-" + name[0]);
            posDer++;
            //añade la ficha al tablero
            fichasTablero.add(ficha);
            return true;
        }
        return false;
    }

    // Se encarga de abrir las ventanas
    void abrirVentana(JFrame frame, int w, int h) {
        frame.setSize(w, h);
        frame.setResizable(false);
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
        frame.setIconImage(new ImageIcon(getClass().getResource("/img/fondos/domino.png")).getImage());
    }

    // Limpia los cuadros de textos del login y de registro
    void limpiar() {
        loginUser.setText("");
        loginPass.setText("");
        registroPass.setText("");
        registroUser.setText("");
    }

    //Obtiene la ficha del jugador seleccionada
    public int obtenerFichaJugadorPos(ArrayList<Integer> array, int posX, int posY) {
        int pos = -1;
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i) <= posX && posX <= (array.get(i) + 35)) && (550 <= posY && posY <= 618)) {
                pos = i;
            }
        }
        return pos;
    }

    //Obtiene la ficha sobrante seleccionada
    public int obtenerFichaSobrantesPos(ArrayList<Integer> array, int posX, int posY) {
        int pos = -1;
        for (int i = 0; i < array.size(); i++) {
            if ((1140 <= posX && posX <= 1208) && (posY >= array.get(i) && posY <= (array.get(i) + 35))) {
                pos = i;
            }
        }
        return pos;
    }

    //Boton encargado de registrar al usuario
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        try {
            //Verifica que el jugador no deje el campos de textos vacios
            if (registroUser.getText().trim().equalsIgnoreCase("") || registroPass.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No debe dejar campos vacios");
            } else {
                //Verifica que el usuario no exista
                if (!md.verificarUser(registroUser.getText().trim())) {
                    boolean res = md.guardarUser(registroUser.getText().trim(), registroPass.getText().trim());
                    //Si no existe el usario se crea
                    if (res) {
                        md.crearPuntos(registroUser.getText().trim(), puntosJugador, puntosM0, puntosM1);
                        JOptionPane.showMessageDialog(null, "Usuario creado !!");
                        limpiar();
                    }
                    //Si el usuario se encuentra registrado se le notificara que el usuario ingresado ya esta en uso
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe intente con otro");
                }

            }
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    //Boton encargado de iniciar sesión
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            //Verifica que el jugador no deje el campos de textos vacios
            if (loginUser.getText().trim().equalsIgnoreCase("") || loginPass.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No debe dejar campos vacios");
            } else {
                // Se encarga de verificar que el usuario este registrado
                boolean res = md.buscarUser(loginUser.getText().trim(), loginPass.getText().trim());
                // Si el usuario esta registrado se le llevara a la segunda parte
                if (res) {
                    abrirVentana(salaEspera, 384, 320);
                    this.setVisible(false);
                    user = loginUser.getText().trim();
                    md.obtenerPuntos(user);
                    puntosJugador = md.puntosJ;
                    puntosM0 = md.puntosM1;
                    puntosM1 = md.puntosM2;

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
        cantMaquina = false;
        //Llena los array
        llenarArray();
        //Hace las configuraciones iniciales del juego
        comenzarTurno();
        try {
            //Hace que la primera ficha del juego se coloque automaticamente
            comenzarJuego(false);

        } catch (IOException ex) {
            Logger.getLogger(vista.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        //Muestra el tablero en pantalla
        abrirVentana(frameTablero, 1220, 655);
        limpiar();
    }//GEN-LAST:event_jLabel20MouseClicked

    // Boton que se encargara de activar el juego 2vs1
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        ficha.tablero(tablero);
        ficha.generarFichas();
        ficha.distribuirFichas(true);
        ficha.mostrarFichas(true, user);
        cantMaquina = true;
        gameover = false;
        //Llena los array
        llenarArray();
        //Hace las configuraciones iniciales del juego
        comenzarTurno();
        try {
            //Hace que la primera ficha del juego se coloque automaticamente
            comenzarJuego(true);

        } catch (IOException ex) {
            Logger.getLogger(vista.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        //Muestra el tablero en pantalla
        abrirVentana(frameTablero, 1220, 655);
        limpiar();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        salaEspera.setVisible(false);
        abrirVentana(this, 800, 420);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void tableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableroMouseClicked
        //Verifica si el juego sigue en curso
        if (!gameover) {
            // Solo entra cuando es el turno del jugador
            if (turno == 0) {
                int posJugador = obtenerFichaJugadorPos(posJugadorFichasX, evt.getX(), evt.getY());
                // Comprueba si el jugador tiene una ficha
                tomar = comprobar(jugadorFichasObj);
                    // detecta si se selecciono una ficha
                    if (posJugador != -1) {
                        //Solo entra si el jugador tiene una ficha que colocar en el tablero
                        if (tomar) {
                            try {
                                // Coloca la ficha en el tablero
                                boolean ladosID = comprobarLados(jugadorFichasObj.get(posJugador));
                                // Si la ficha se puede colocar en ambos extremos, se guarda al direccion deseada
                                if (ladosID) {
                                    direccion = direccion();
                                }
                                if (verificarFicha(jugadorFichasObj.get(posJugador), ladosID)) {

                                    //Remueve las fichas del jugador
                                    removeFichas(jugadorFichasObj, posJugador);
                                    removeFichas(posJugadorFichasX, posJugador);
                                    gameOver();
                                    // Si el juego no ha acabado le da el turno a la maquina
                                    if (!gameover) {
                                        turno = 1;
                                        // Funcion que hace que la maquina juegue
                                        maquina0();
                                    }
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(vista.class
                                        .getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No tiene fichas usables, escoja una ficha entre las sobrantes");
                        }
                    }

                    // Obtiene la ficha sobrante que el jugador seleccione
                    if (!tomar) {
                        //Obtiene la ficha que el jugador selecciono
                        int pos = obtenerFichaSobrantesPos(posFichaSobrantesY, evt.getX(), evt.getY());
                        //Verifica que existe la ficha seleccionada
                        if (pos != -1) {
                            try {
                                //Mueve la ficha del lado de las sobrantes a las fichas del jugador
                                fichasSobrantesObj.get(pos).setLocation(posJugadorFichasX.get(posJugadorFichasX.size() - 1) + 50, 550);
                                //Añade la ficha a la ficha del jugador
                                posJugadorFichasX.add(posJugadorFichasX.get(posJugadorFichasX.size() - 1) + 50);
                                jugadorFichasObj.add(fichasSobrantesObj.get(pos));
                                //Añade la imagen de la ficha y el tamaño
                                ImageIcon icon = new ImageIcon("src/img/img-domino/" + fichasSobrantesObj.get(pos).getName() + ".png");
                                jugadorFichasObj.get(jugadorFichasObj.size() - 1).setIcon(icon);
                                jugadorFichasObj.get(jugadorFichasObj.size() - 1).setSize(35, 68);
                                //Borra la ficha de las sobrantes
                                fichasSobrantesObj.remove(pos);
                                posFichaSobrantesY.remove(pos);
                                gameOver();

                            } catch (IOException ex) {
                                Logger.getLogger(vista.class
                                        .getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
            } else {
                JOptionPane.showMessageDialog(null, "No es su turno");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Game Over");

        }

    }//GEN-LAST:event_tableroMouseClicked

    //Muestra los puntos en la ventana de score
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        pj.setText(puntosJugador + "");
        pm1.setText(puntosM0 + "");
        pm2.setText(puntosM1 + "");
        abrirVentana(framePuntos, 377, 304);
    }//GEN-LAST:event_jLabel18MouseClicked

    //Hace que la ventana de score se cierre
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        framePuntos.setVisible(false);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JFrame framePuntos;
    private javax.swing.JFrame frameTablero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelSesion;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblPuntos2;
    private javax.swing.JLabel lblPuntos3;
    private javax.swing.JPasswordField loginPass;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JLabel pj;
    private javax.swing.JLabel pm1;
    private javax.swing.JLabel pm2;
    private javax.swing.JPasswordField registroPass;
    private javax.swing.JTextField registroUser;
    private javax.swing.JFrame salaEspera;
    private rojerusan.RSPanelsSlider slider;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
