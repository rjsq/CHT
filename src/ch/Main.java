/*
 * Yin Liu
 */
package ch;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import static java.lang.Math.abs;

/**
 *
 * @author Yin Liu
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
//        manager.addKeyEventDispatcher(new KeyDispatcher());
        try {

            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }
        GlobalMouseListenerExample example = new GlobalMouseListenerExample();
        GlobalScreen.addNativeMouseListener(example);
        GlobalScreen.addNativeMouseMotionListener(example);

        GlobalScreen.addNativeKeyListener(new GlobalKeyListenerExample());

    }

    private int mouseX;
    private int mouseY;
    private int rrr = -1;
    private int ggg = -1;
    public double ascendtimer = 1; //hour

    class GlobalMouseListenerExample implements NativeMouseInputListener {

        @Override
        public void nativeMouseClicked(NativeMouseEvent e) {

            if (rrr == 0) {
                mouseX = e.getX();
                mouseY = e.getY();
                tabX.setText(mouseX + "");
                tabY.setText(mouseY + "");
                rrr = -1;
            } else if (rrr == 1) {
                mouseX = e.getX();
                mouseY = e.getY();
                scrollX.setText(mouseX + "");
                scrollY.setText(mouseY + "");
                rrr = -1;
            }

            if (ggg == 0) {
                mouseX = e.getX();
                mouseY = e.getY();
                x1.setText(mouseX + "");
                y1.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 1) {
                mouseX = e.getX();
                mouseY = e.getY();
                x2.setText(mouseX + "");
                y2.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 2) {
                mouseX = e.getX();
                mouseY = e.getY();
                x3.setText(mouseX + "");
                y3.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 3) {
                mouseX = e.getX();
                mouseY = e.getY();
                x4.setText(mouseX + "");
                y4.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 4) {
                mouseX = e.getX();
                mouseY = e.getY();
                x5.setText(mouseX + "");
                y5.setText(mouseY + "");
                ggg = -1;
            } else if (ggg == 5) {
                mouseX = e.getX();
                mouseY = e.getY();
                x6.setText(mouseX + "");
                y6.setText(mouseY + "");
                ggg = -1;
            }
//            System.out.println("Mouse Clicked: " + e.getClickCount());
        }

        @Override
        public void nativeMousePressed(NativeMouseEvent e) {
//            System.out.println("Mouse Pressed: " + e.getButton());
        }

        @Override
        public void nativeMouseReleased(NativeMouseEvent e) {
//            System.out.println("Mouse Released: " + e.getButton());
        }

        @Override
        public void nativeMouseMoved(NativeMouseEvent e) {
//            System.out.println("Mouse Moved: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void nativeMouseDragged(NativeMouseEvent e) {
//            System.out.println("Mouse Dragged: " + e.getX() + ", " + e.getY());
        }
    }

    class GlobalKeyListenerExample implements NativeKeyListener {

        @Override
        public void nativeKeyPressed(NativeKeyEvent e) {
//            System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
                try {
                    GlobalScreen.unregisterNativeHook();
                } catch (NativeHookException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (e.getKeyCode() == NativeKeyEvent.VC_BACKQUOTE) {
                running = false;
                gilding = false;
            }
        }

        @Override
        public void nativeKeyReleased(NativeKeyEvent e) {
//            System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        }

        @Override
        public void nativeKeyTyped(NativeKeyEvent e) {
//            System.out.println("Key Typed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        tabX = new javax.swing.JLabel();
        levelButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tabButton = new javax.swing.JButton();
        scrollButton = new javax.swing.JButton();
        scrollX = new javax.swing.JLabel();
        tabY = new javax.swing.JLabel();
        scrollY = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        timerTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        reText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        gButton1 = new javax.swing.JButton();
        gButton2 = new javax.swing.JButton();
        gButton3 = new javax.swing.JButton();
        x1 = new javax.swing.JLabel();
        y1 = new javax.swing.JLabel();
        y2 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        y3 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        gildButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        gButton4 = new javax.swing.JButton();
        x4 = new javax.swing.JLabel();
        y4 = new javax.swing.JLabel();
        gButton5 = new javax.swing.JButton();
        x5 = new javax.swing.JLabel();
        y5 = new javax.swing.JLabel();
        gButton6 = new javax.swing.JButton();
        x6 = new javax.swing.JLabel();
        y6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Save Data:");

        jButton3.setText("Read");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Input", jPanel1);

        jButton2.setText("Encode");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Decoded Save Output:");

        jLabel6.setText("Modified Save Input:");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);

        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArea2)))
                .addGap(10, 74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Decode", jPanel2);

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Encode", jPanel4);

        levelButton.setText("start");
        levelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Click ` to stop");

        tabButton.setText("Get Tab Location");
        tabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabButtonActionPerformed(evt);
            }
        });

        scrollButton.setText("Get Scroll Location");
        scrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Set Ascend Timer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        timerTextField.setText("1");

        jLabel2.setText("hours");

        jCheckBox1.setText("hide this window");

        jLabel5.setText("Remaining");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tabButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tabX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scrollX, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tabY, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollY, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(levelButton)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tabButton)
                    .addComponent(tabX, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabY, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(scrollButton, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(scrollX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(timerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(143, 143, 143)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelButton)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(reText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("AutoLevel", jPanel5);

        gButton1.setText("Get 1");
        gButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton1ActionPerformed(evt);
            }
        });

        gButton2.setText("Get 2");
        gButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton2ActionPerformed(evt);
            }
        });

        gButton3.setText("Get 3");
        gButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton3ActionPerformed(evt);
            }
        });

        gildButton.setText("Start");
        gildButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gildButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Click ` to stop");

        gButton4.setText("Get 4");
        gButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton4ActionPerformed(evt);
            }
        });

        gButton5.setText("Get 5");
        gButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton5ActionPerformed(evt);
            }
        });

        gButton6.setText("Get 6");
        gButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14)
                    .addComponent(gildButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(y6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton1)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton2)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton3)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton4)
                    .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton5)
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gButton6)
                    .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(gildButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BuyGilds", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void levelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelButtonActionPerformed
        // TODO add your handling code here:
        running = true;

//        jLabel2.setText(width + " " + height + "");
        int tab[] = {Integer.valueOf(tabX.getText()), Integer.valueOf(tabY.getText())};
        int scroll[] = {Integer.valueOf(scrollX.getText()), Integer.valueOf(scrollY.getText())};
        AL(tab, scroll);
        if(jCheckBox1.isSelected()){
            this.setState(JFrame.ICONIFIED);
        }
       
    }//GEN-LAST:event_levelButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String input = jTextArea2.getText();
        jTextArea3.setText(Save.encryptSave(input));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String savedata = jTextArea4.getText();

        String real = Save.decryptSave(savedata);
        jTextArea1.setText(real);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabButtonActionPerformed
        // TODO add your handling code here:
        rrr = 0;

    }//GEN-LAST:event_tabButtonActionPerformed

    private void scrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollButtonActionPerformed
        // TODO add your handling code here:
        rrr = 1;
    }//GEN-LAST:event_scrollButtonActionPerformed

    private void gildButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gildButtonActionPerformed
        // TODO add your handling code here:
        gilding = true;
        int l1[] = {Integer.valueOf(x1.getText()), Integer.valueOf(y1.getText())};
        int l2[] = {Integer.valueOf(x2.getText()), Integer.valueOf(y2.getText())};
        int l3[] = {Integer.valueOf(x3.getText()), Integer.valueOf(y3.getText())};
        int l4[] = {Integer.valueOf(x4.getText()), Integer.valueOf(y4.getText())};
        int l5[] = {Integer.valueOf(x5.getText()), Integer.valueOf(y5.getText())};
        int l6[] = {Integer.valueOf(x6.getText()), Integer.valueOf(y6.getText())};
        AG(l1, l2, l3, l4, l5, l6);
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_gildButtonActionPerformed

    private void gButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton1ActionPerformed
        // TODO add your handling code here:
        ggg = 0;
    }//GEN-LAST:event_gButton1ActionPerformed

    private void gButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton2ActionPerformed
        // TODO add your handling code here:
        ggg = 1;
    }//GEN-LAST:event_gButton2ActionPerformed

    private void gButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton3ActionPerformed
        // TODO add your handling code here:
        ggg = 2;
    }//GEN-LAST:event_gButton3ActionPerformed

    private void gButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton4ActionPerformed
        // TODO add your handling code here:
        ggg = 3;
    }//GEN-LAST:event_gButton4ActionPerformed

    private void gButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton5ActionPerformed
        // TODO add your handling code here:
        ggg = 4;
    }//GEN-LAST:event_gButton5ActionPerformed

    private void gButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gButton6ActionPerformed
        // TODO add your handling code here:
        ggg = 5;
    }//GEN-LAST:event_gButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ascendtimer = Float.valueOf(timerTextField.getText());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean running = true;

    void AL(int[] tab, int[] scroll) {
        class AutoLevel implements Runnable {

            int[] tab;
            int[] scroll;

            AutoLevel(int[] i, int[] j) {
                tab = i;
                scroll = j;

            }

            @Override
            public void run() {
                try {
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    double width = screenSize.getWidth();
                    double height = screenSize.getHeight();
                    double size = 1;
                    if (abs(width - 3000) < 10 && abs(height - 2000) < 10) {
                        size = 2.0;
                    }

                    int flag = 0;

                    //relic location
                    int[] relic = new int[2];
                    relic[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 0.56);
                    relic[1] = tab[1];

                    //delete location
                    int[] del = new int[2];
                    del[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 0.5);
                    del[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.65);

                    //yes location
                    int[] yes = new int[2];
                    yes[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 0.95);
                    yes[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.58);

                    //yes location
                    int[] ascend = new int[2];
                    ascend[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 2.12);
                    ascend[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.355);

                    //yes location
                    int[] confirm = new int[2];
                    confirm[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 0.95);
                    confirm[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.7);

                    //yes location
                    int[] pro = new int[2];
                    pro[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 2.1);
                    pro[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.3);

                    //yes location
                    int[] fight = new int[2];
                    fight[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 1.8);
                    fight[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.3);

                    int[] hero0 = new int[2];
                    //calculate the hero level button location
                    hero0[0] = (int) (tab[0] * size);
                    hero0[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.8);

                    int[] hero1 = new int[2];
                    //calculate the hero level button location
                    hero1[0] = (int) (tab[0] * size);
                    hero1[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.7);

                    int[] hero2 = new int[2];
                    //calculate the hero level button location
                    hero2[0] = (int) (tab[0] * size);
                    hero2[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.6);

                    int[] hero3 = new int[2];
                    //calculate the hero level button location
                    hero3[0] = (int) (tab[0] * size);
                    hero3[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.5);

                    int[] hero4 = new int[2];
                    //calculate the hero level button location
                    hero4[0] = (int) (tab[0] * size);
                    hero4[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.4);

                    int[] hero5 = new int[2];
                    //calculate the hero level button location
                    hero5[0] = (int) (tab[0] * size);
                    hero5[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.3);

                    int[] hero6 = new int[2];
                    //calculate the hero level button location
                    hero6[0] = (int) (tab[0] * size);
                    hero6[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.2);

                    //calculate the skill level button location
                    int[] skill = new int[2];
                    skill[0] = (int) (tab[0] * size) + (int) ((scroll[0] - tab[0]) * size * 0.7);
                    skill[1] = (int) (tab[1] * size) + (int) ((scroll[1] - tab[1]) * size * 0.85);

                    //Robot
                    Robot robot = new Robot();
                    while (running) {

                        flag++;

                        Thread.sleep(500);
                        robot.mouseMove((int) (scroll[0] * size), (int) (scroll[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(500);
                        robot.mouseMove(skill[0], skill[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.keyPress(KeyEvent.VK_Q);

                        Thread.sleep(50);
                        robot.mouseMove(hero0[0], hero0[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.mouseMove(hero1[0], hero1[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.mouseMove(hero2[0], hero2[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.mouseMove(hero3[0], hero3[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.mouseMove(hero4[0], hero4[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.mouseMove(hero5[0], hero5[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(50);
                        robot.mouseMove(hero6[0], hero6[1]);
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(100);
                        robot.keyRelease(KeyEvent.VK_Q);

//                            Thread.sleep(100);
//                            robot.keyPress(KeyEvent.VK_T);
//                            robot.keyRelease(KeyEvent.VK_T);
                        reText.setText(((int) (ascendtimer * 3600 / 1.5) - (flag % (int) (ascendtimer * 3600 / 1.5))) + "");
                        if (flag % (int) (ascendtimer * 3600 / 1.5) == 0) {
                            Thread.sleep(50);
                            robot.mouseMove(relic[0], relic[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            Thread.sleep(50);
                            robot.mouseMove(del[0], del[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            Thread.sleep(50);
                            robot.mouseMove(yes[0], yes[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            Thread.sleep(50);
                            robot.mouseMove(ascend[0], ascend[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            Thread.sleep(50);
                            robot.mouseMove(confirm[0], confirm[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            Thread.sleep(50);
                            robot.mouseMove(pro[0], pro[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                            Thread.sleep(50);
                            robot.mouseMove(fight[0], fight[1]);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);
                        }

                    }

                    Thread.currentThread().interrupt();

                } catch (AWTException | InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Thread t = new Thread(new AutoLevel(tab, scroll));

        t.start();
    }

    private boolean gilding = true;

    void AG(int[] l1, int[] l2, int[] l3, int[] l4, int[] l5, int[] l6) {
        class AutoGild implements Runnable {

            int[] l1;
            int[] l2;
            int[] l3;
            int[] l4;
            int[] l5;
            int[] l6;

            AutoGild(int[] i, int[] j, int[] k, int[] l, int[] m, int[] n) {
                l1 = i;
                l2 = j;
                l3 = k;
                l4 = l;
                l5 = m;
                l6 = n;
            }

            @Override
            public void run() {
                try {
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    double width = screenSize.getWidth();
                    double height = screenSize.getHeight();
                    double size = 1;
                    if (abs(width - 3000) < 10 && abs(height - 2000) < 10) {
                        size = 2.0;
                    }

                    Robot robot = new Robot();
                    while (gilding) {

                        Thread.sleep(400);
                        robot.mouseMove((int) (l1[0] * size), (int) (l1[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l2[0] * size), (int) (l2[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l3[0] * size), (int) (l3[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l4[0] * size), (int) (l4[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(400);
                        robot.mouseMove((int) (l5[0] * size), (int) (l5[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                        Thread.sleep(1100);
                        robot.mouseMove((int) (l6[0] * size), (int) (l6[1] * size));
                        robot.mousePress(InputEvent.BUTTON1_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_MASK);

                    }
                    Thread.currentThread().interrupt();

                } catch (AWTException | InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        Thread t = new Thread(new AutoGild(l1, l2, l3, l4, l5, l6));

        t.start();
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gButton1;
    private javax.swing.JButton gButton2;
    private javax.swing.JButton gButton3;
    private javax.swing.JButton gButton4;
    private javax.swing.JButton gButton5;
    private javax.swing.JButton gButton6;
    private javax.swing.JButton gildButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton levelButton;
    private javax.swing.JLabel reText;
    private javax.swing.JButton scrollButton;
    private javax.swing.JLabel scrollX;
    private javax.swing.JLabel scrollY;
    private javax.swing.JButton tabButton;
    private javax.swing.JLabel tabX;
    private javax.swing.JLabel tabY;
    private javax.swing.JTextField timerTextField;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel x4;
    private javax.swing.JLabel x5;
    private javax.swing.JLabel x6;
    private javax.swing.JLabel y1;
    private javax.swing.JLabel y2;
    private javax.swing.JLabel y3;
    private javax.swing.JLabel y4;
    private javax.swing.JLabel y5;
    private javax.swing.JLabel y6;
    // End of variables declaration//GEN-END:variables

}
