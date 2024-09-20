/*     */ package com.exe4j.runtime.gui;
/*     */ import java.awt.Button;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dialog;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Frame;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Label;
/*     */ import java.awt.Panel;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.awt.event.WindowEvent;
/*     */ 
/*     */ public class MessageBox implements Runnable, ActionListener, WindowListener, KeyListener {
/*     */   private ActionListener listener;
/*  23 */   private String closeWindowCommand = "CloseRequested"; private Dialog dialog;
/*     */   private String title;
/*     */   private Frame frame;
/*     */   private boolean frameNotProvided;
/*  27 */   private Panel buttonPanel = new Panel();
/*     */ 
/*     */   
/*     */   private Canvas imageCanvas;
/*     */ 
/*     */   
/*     */   private boolean block = false;
/*     */ 
/*     */ 
/*     */   
/*     */   public MessageBox(ActionListener listener) {
/*  38 */     this();
/*  39 */     this.listener = listener;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MessageBox() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void run() {
/*  55 */     this.dialog.setVisible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent evt) {
/*  60 */     String command = evt.getActionCommand();
/*  61 */     this.dialog.setVisible(false);
/*  62 */     this.dialog.dispose();
/*  63 */     if (this.frameNotProvided) this.frame.dispose(); 
/*  64 */     if (this.listener != null) {
/*  65 */       this.listener.actionPerformed(evt);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void windowClosing(WindowEvent evt) {
/*  71 */     fireCloseRequested();
/*     */   }
/*     */ 
/*     */   
/*     */   public void windowClosed(WindowEvent evt) {}
/*     */   
/*     */   public void windowDeiconified(WindowEvent evt) {}
/*     */   
/*     */   public void windowIconified(WindowEvent evt) {}
/*     */   
/*     */   public void windowOpened(WindowEvent evt) {}
/*     */   
/*     */   public void windowActivated(WindowEvent evt) {}
/*     */   
/*     */   public void windowDeactivated(WindowEvent evt) {}
/*     */   
/*     */   public void keyTyped(KeyEvent evt) {}
/*     */   
/*     */   public void keyPressed(KeyEvent evt) {
/*  90 */     if (evt.getKeyCode() == 27) {
/*  91 */       fireCloseRequested();
/*     */     }
/*     */   }
/*     */   
/*     */   public void keyReleased(KeyEvent evt) {}
/*     */   
/*     */   private void fireCloseRequested() {
/*  98 */     ActionEvent event = new ActionEvent(this, 1001, this.closeWindowCommand);
/*     */     
/* 100 */     actionPerformed(event);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActionListener(ActionListener listener) {
/* 108 */     this.listener = listener;
/*     */   }
/*     */   
/*     */   public void setTitle(String title) {
/* 112 */     this.title = title;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrame(Frame frame) {
/* 123 */     this.frame = frame;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBlock(boolean v) {
/* 131 */     this.block = v;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCloseWindowCommand(String command) {
/* 143 */     this.closeWindowCommand = command;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addChoice(String label, String command) {
/* 151 */     Button button = new Button(label);
/* 152 */     button.setActionCommand(command);
/* 153 */     button.addActionListener(this);
/* 154 */     button.addKeyListener(this);
/* 155 */     this.buttonPanel.add(button);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addChoice(String label) {
/* 163 */     addChoice(label, label);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void ask(String message) {
/* 172 */     if (this.frame == null) {
/* 173 */       this.frame = new Frame();
/* 174 */       this.frameNotProvided = true;
/*     */     } else {
/* 176 */       this.frameNotProvided = false;
/*     */     } 
/* 178 */     this.dialog = new Dialog(this.frame, true);
/* 179 */     this.dialog.addWindowListener(this);
/* 180 */     this.dialog.addKeyListener(this);
/* 181 */     this.dialog.setTitle(this.title);
/* 182 */     this.dialog.setLayout(new BorderLayout(5, 5));
/*     */     
/* 184 */     Panel messagePanel = createMultiLinePanel(message);
/* 185 */     if (this.imageCanvas == null) {
/* 186 */       this.dialog.add("Center", messagePanel);
/*     */     } else {
/* 188 */       Panel centerPanel = new Panel();
/* 189 */       centerPanel.add(this.imageCanvas);
/* 190 */       centerPanel.add(messagePanel);
/* 191 */       this.dialog.add("Center", centerPanel);
/*     */     } 
/* 193 */     this.dialog.add("South", this.buttonPanel);
/* 194 */     this.dialog.pack();
/* 195 */     enforceMinimumSize(this.dialog, 200, 100);
/* 196 */     centerWindow(this.dialog);
/* 197 */     Toolkit.getDefaultToolkit().beep();
/*     */     
/* 199 */     if (this.block) {
/* 200 */       run();
/*     */     } else {
/*     */       
/* 203 */       Thread thread = new Thread(this);
/* 204 */       thread.start();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void askOkay(String message) {
/* 212 */     addChoice("Okay");
/* 213 */     ask(message);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void askYesNo(String message) {
/* 221 */     addChoice("Yes");
/* 222 */     addChoice("No");
/* 223 */     ask(message);
/*     */   }
/*     */   
/*     */   private Panel createMultiLinePanel(String message) {
/* 227 */     Panel mainPanel = new Panel();
/* 228 */     GridBagLayout gbLayout = new GridBagLayout();
/* 229 */     mainPanel.setLayout(gbLayout);
/* 230 */     addMultilineString(message, mainPanel);
/* 231 */     return mainPanel;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void addMultilineString(String message, Container container) {
/* 237 */     GridBagConstraints constraints = getDefaultConstraints();
/* 238 */     constraints.gridwidth = 0;
/*     */     
/* 240 */     constraints.insets = new Insets(0, 0, 0, 0);
/* 241 */     GridBagLayout gbLayout = (GridBagLayout)container.getLayout();
/*     */     
/* 243 */     while (message.length() > 0) {
/* 244 */       String line; int newLineIndex = message.indexOf('\n');
/*     */       
/* 246 */       if (newLineIndex >= 0) {
/* 247 */         line = message.substring(0, newLineIndex);
/* 248 */         message = message.substring(newLineIndex + 1);
/*     */       } else {
/* 250 */         line = message;
/* 251 */         message = "";
/*     */       } 
/* 253 */       Label label = new Label(line);
/* 254 */       gbLayout.setConstraints(label, constraints);
/* 255 */       container.add(label);
/*     */     } 
/*     */   }
/*     */   
/*     */   private GridBagConstraints getDefaultConstraints() {
/* 260 */     GridBagConstraints constraints = new GridBagConstraints();
/* 261 */     constraints.weightx = 1.0D;
/* 262 */     constraints.weighty = 1.0D;
/* 263 */     constraints.gridheight = 1;
/*     */     
/* 265 */     constraints.insets = new Insets(4, 4, 4, 4);
/*     */     
/* 267 */     constraints.fill = 0;
/*     */     
/* 269 */     constraints.anchor = 17;
/*     */     
/* 271 */     return constraints;
/*     */   }
/*     */   
/*     */   private void centerWindow(Window win) {
/* 275 */     Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
/*     */     
/* 277 */     if (screenDim.width < (win.getSize()).width) {
/* 278 */       win.setSize(screenDim.width, (win.getSize()).height);
/*     */     }
/* 280 */     if (screenDim.height < (win.getSize()).height) {
/* 281 */       win.setSize((win.getSize()).width, screenDim.height);
/*     */     }
/*     */     
/* 284 */     int x = (screenDim.width - (win.getSize()).width) / 2;
/* 285 */     int y = (screenDim.height - (win.getSize()).height) / 2;
/* 286 */     win.setLocation(x, y);
/*     */   }
/*     */ 
/*     */   
/*     */   private void enforceMinimumSize(Component comp, int minWidth, int minHeight) {
/* 291 */     if ((comp.getSize()).width < minWidth) {
/* 292 */       comp.setSize(minWidth, (comp.getSize()).height);
/*     */     }
/* 294 */     if ((comp.getSize()).height < minHeight) {
/* 295 */       comp.setSize((comp.getSize()).width, minHeight);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class Invoker
/*     */   {
/*     */     public static void showError(String message) {
/* 302 */       MessageBox messageBox = new MessageBox();
/* 303 */       messageBox.setTitle("Error");
/* 304 */       messageBox.addChoice("OK");
/* 305 */       messageBox.setBlock(true);
/* 306 */       messageBox.ask(message);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\gui\MessageBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */