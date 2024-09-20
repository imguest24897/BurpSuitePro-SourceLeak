/*     */ package com.exe4j.runtime.gui;
/*     */ import java.awt.Container;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class InternalErrorFrame extends JFrame implements ActionListener {
/*     */   private static final int FRAME_HEIGHT = 300;
/*     */   
/*     */   public InternalErrorFrame(Throwable t) {
/*  25 */     init(t);
/*     */   }
/*     */   private static final int FRANE_WIDTH = 400; private Throwable throwable; private DisplayTextArea dtxa; private JTextArea txaStackTrace; private JScrollPane scpStackTrace;
/*     */   private JButton btnOk;
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/*  31 */     Object source = event.getSource();
/*  32 */     if (source == this.btnOk) {
/*  33 */       System.exit(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public Rectangle getFrameBounds() {
/*  38 */     Rectangle bounds = new Rectangle(new Point(0, 0), Toolkit.getDefaultToolkit().getScreenSize());
/*  39 */     float factor = 1.0F;
/*  40 */     int width = (int)(factor * 400.0F);
/*  41 */     int height = (int)(factor * 300.0F);
/*     */     
/*  43 */     int deltaX = bounds.width - ((width == -1) ? getWidth() : width);
/*  44 */     int deltaY = bounds.height - ((height == -1) ? getHeight() : height);
/*  45 */     bounds.x += deltaX / 2;
/*  46 */     bounds.width -= deltaX;
/*  47 */     bounds.y += deltaY / 2;
/*  48 */     bounds.height -= deltaY;
/*     */     
/*  50 */     if (bounds.x < 0) {
/*  51 */       bounds.translate(-bounds.x, 0);
/*     */     }
/*     */     
/*  54 */     if (bounds.y < 0) {
/*  55 */       bounds.translate(0, -bounds.y);
/*     */     }
/*     */     
/*  58 */     return bounds;
/*     */   }
/*     */   
/*     */   private void init(Throwable t) {
/*  62 */     this.throwable = t;
/*     */     
/*  64 */     setBackground(UIManager.getColor("control"));
/*  65 */     setupControls();
/*  66 */     setupComponent();
/*  67 */     setupEventHandlers();
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupControls() {
/*  72 */     this.btnOk = new JButton("OK");
/*     */     
/*  74 */     this.dtxa = new DisplayTextArea();
/*  75 */     this.dtxa.setText("An error has occurred during startup:");
/*     */     
/*  77 */     this.txaStackTrace = new JTextArea();
/*  78 */     StringWriter stringWriter = new StringWriter();
/*  79 */     PrintWriter pw = new PrintWriter(stringWriter);
/*  80 */     this.throwable.printStackTrace(pw);
/*  81 */     this.txaStackTrace.setEditable(false);
/*     */     
/*  83 */     this.txaStackTrace.setText(stringWriter.getBuffer().toString());
/*  84 */     this.scpStackTrace = new JScrollPane(this.txaStackTrace);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupComponent() {
/*  89 */     setTitle("Startup Error");
/*  90 */     setBounds(getFrameBounds());
/*     */     
/*  92 */     Container contentPane = getContentPane();
/*     */     
/*  94 */     contentPane.setLayout(new GridBagLayout());
/*  95 */     GridBagConstraints gc = new GridBagConstraints();
/*  96 */     gc.gridx = 0;
/*  97 */     gc.gridy = 0;
/*  98 */     gc.anchor = 10;
/*  99 */     gc.insets = new Insets(7, 7, 7, 7);
/*     */     
/* 101 */     ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(InternalErrorFrame.class.getResource("error_32.png")));
/* 102 */     contentPane.add(new JLabel(icon), gc);
/*     */     
/* 104 */     gc.gridx = 1;
/* 105 */     gc.weightx = 1.0D;
/* 106 */     gc.fill = 2;
/* 107 */     contentPane.add(this.dtxa, gc);
/*     */     
/* 109 */     gc.gridx = 0;
/* 110 */     gc.gridwidth = 2;
/* 111 */     gc.gridy = 1;
/* 112 */     gc.weighty = 1.0D;
/* 113 */     gc.fill = 1;
/*     */     
/* 115 */     gc.insets = new Insets(3, 3, 3, 3);
/* 116 */     contentPane.add(this.scpStackTrace, gc);
/*     */     
/* 118 */     gc.weighty = 0.0D;
/* 119 */     gc.fill = 0;
/*     */     
/* 121 */     gc.gridy = 2;
/* 122 */     contentPane.add(this.btnOk, gc);
/*     */     
/* 124 */     setDefaultCloseOperation(0);
/*     */   }
/*     */   
/*     */   private void setupEventHandlers() {
/* 128 */     this.btnOk.addActionListener(this);
/*     */     
/* 130 */     addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowOpened(WindowEvent e)
/*     */           {
/* 134 */             InternalErrorFrame.this.txaStackTrace.scrollRectToVisible(new Rectangle(0, 0, 0, 0));
/*     */           }
/*     */ 
/*     */           
/*     */           public void windowClosed(WindowEvent e) {
/* 139 */             System.exit(1);
/*     */           }
/*     */ 
/*     */           
/*     */           public void windowClosing(WindowEvent e) {
/* 144 */             System.exit(1);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static class Invoker
/*     */   {
/*     */     public static boolean showLaterIfNotHeadless(final Throwable t) {
/* 152 */       if (!GraphicsEnvironment.isHeadless()) {
/* 153 */         EventQueue.invokeLater(new Runnable()
/*     */             {
/*     */               public void run() {
/* 156 */                 (new InternalErrorFrame(t)).setVisible(true);
/*     */               }
/*     */             });
/* 159 */         return true;
/*     */       } 
/* 161 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\gui\InternalErrorFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */