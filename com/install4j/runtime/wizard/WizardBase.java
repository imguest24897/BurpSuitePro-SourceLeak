/*     */ package com.install4j.runtime.wizard;
/*     */ 
/*     */ import com.ejt.internal.gui.KeyboardUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import com.install4j.runtime.util.CustomCardLayout;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.CardLayout;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.Window;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public abstract class WizardBase
/*     */   extends JPanel
/*     */ {
/*     */   private static final int FRAME_WIDTH = 600;
/*     */   private static final int FRAME_HEIGHT = 400;
/*     */   private static final int LAYOUT_GAP_WIDTH = 10;
/*     */   private static final int LAYOUT_GAP_HEIGHT = 0;
/*     */   private String title;
/*     */   private WizardFrame wizardFrame;
/*     */   private WizardDialog wizardDialog;
/*     */   private CardLayout cardLayout;
/*     */   private JPanel cardPanel;
/*  33 */   private List<WizardScreen> screens = new LinkedList<>();
/*     */   private ListIterator<WizardScreen> screenIterator;
/*     */   private boolean completed = false;
/*     */   
/*     */   public WizardBase(String title) {
/*  38 */     this.title = title;
/*  39 */     setupComponent();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void showFrame(JFrame parent) {
/*  45 */     this.wizardFrame = new WizardFrame(this);
/*  46 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public void showDialog(Window parent) {
/*  50 */     this.wizardDialog = new WizardDialog(this, parent);
/*  51 */     setVisible(true);
/*     */   }
/*     */   
/*     */   public Window getWizardWindow() {
/*  55 */     return (this.wizardFrame != null) ? this.wizardFrame : (Window)this.wizardDialog;
/*     */   }
/*     */   
/*     */   public boolean isCompleted() {
/*  59 */     return this.completed;
/*     */   }
/*     */   
/*     */   public String getTitle() {
/*  63 */     return this.title;
/*     */   }
/*     */   
/*     */   public void setTitle(String title) {
/*  67 */     this.title = title;
/*     */   }
/*     */ 
/*     */   
/*     */   public void nextScreen() {
/*     */     WizardScreen screen;
/*     */     do {
/*  74 */       if (!this.screenIterator.hasNext()) {
/*  75 */         finish();
/*     */         return;
/*     */       } 
/*  78 */       screen = this.screenIterator.next();
/*  79 */     } while (!screen.supportsNext());
/*     */     
/*  81 */     screen.activate();
/*     */   }
/*     */   
/*     */   public boolean previousScreen() {
/*     */     WizardScreen screen;
/*  86 */     if (!this.screenIterator.hasPrevious()) {
/*  87 */       return false;
/*     */     }
/*  89 */     this.screenIterator.previous();
/*     */     
/*     */     do {
/*  92 */       if (!this.screenIterator.hasPrevious()) {
/*  93 */         return false;
/*     */       }
/*  95 */       screen = this.screenIterator.previous();
/*  96 */     } while (!screen.supportsPrevious());
/*     */     
/*  98 */     this.screenIterator.next();
/*  99 */     screen.activate();
/* 100 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean isQuitOnWindowClose() {
/* 104 */     return true;
/*     */   }
/*     */   
/*     */   public boolean isFinishOnWindowClose() {
/* 108 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void finishFromCloseButton() {}
/*     */ 
/*     */   
/*     */   protected void setScreen(WizardScreen screen) {
/* 117 */     int index = this.screens.indexOf(screen);
/* 118 */     if (index < 0) {
/*     */       return;
/*     */     }
/* 121 */     this.screenIterator = this.screens.listIterator(index);
/* 122 */     this.screenIterator.next();
/* 123 */     screen.activate();
/*     */   }
/*     */   
/*     */   public List<WizardScreen> getScreens() {
/* 127 */     return this.screens;
/*     */   }
/*     */ 
/*     */   
/*     */   public void finish() {
/* 132 */     this.completed = true;
/* 133 */     if (getWizardWindow() != null) {
/* 134 */       setVisible(false);
/*     */     }
/*     */   }
/*     */   
/*     */   public void activateScreen(WizardScreen screen) {
/* 139 */     this.cardLayout.show(this.cardPanel, screen.getCardName());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/* 145 */     if (visible) {
/* 146 */       initVisible();
/* 147 */       this.completed = false;
/*     */     } 
/* 149 */     Window wizardWindow = getWizardWindow();
/* 150 */     if (wizardWindow != null) {
/* 151 */       if (visible) {
/* 152 */         beforeShow(wizardWindow);
/*     */       } else {
/* 154 */         beforeHide(wizardWindow);
/*     */       } 
/* 156 */       wizardWindow.setVisible(visible);
/* 157 */       if (!visible) {
/* 158 */         afterHide(wizardWindow);
/* 159 */         wizardWindow.dispose();
/*     */       } 
/*     */     } else {
/* 162 */       throw new IllegalStateException();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void initVisible() {
/* 167 */     this.screenIterator = this.screens.listIterator();
/* 168 */     if (needsNextScreenOnVisible()) {
/* 169 */       nextScreen();
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean needsNextScreenOnVisible() {
/* 174 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancel() {
/* 179 */     this.completed = true;
/* 180 */     setVisible(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void beforeShow(Window wizardWindow) {}
/*     */ 
/*     */   
/*     */   protected void beforeHide(Window wizardWindow) {}
/*     */ 
/*     */   
/*     */   protected void afterHide(Window wizardWindow) {}
/*     */   
/*     */   protected void registerScreen(WizardScreen screen) {
/* 193 */     if (screen != null) {
/* 194 */       this.cardPanel.add(screen, screen.getCardName());
/* 195 */       this.screens.add(screen);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected int getFrameWidth() {
/* 200 */     return 600;
/*     */   }
/*     */   
/*     */   protected int getFrameHeight() {
/* 204 */     return 400;
/*     */   }
/*     */   
/*     */   protected void setupComponent() {
/* 208 */     setName("wizardPanel");
/*     */     
/* 210 */     this.cardPanel = new JPanel(this.cardLayout = (CardLayout)new CustomCardLayout());
/*     */     
/* 212 */     setLayout(new BorderLayout(10, 0));
/* 213 */     add(this.cardPanel, "Center");
/*     */     
/* 215 */     KeyboardUtil.addAccelerator(1, this, this, e -> Util.showPath(Util.getLogFile().getPath()), 76, 3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void prepareWindow(final Window window) {
/* 224 */     setTitle(getTitle());
/* 225 */     IconHelper.setIconImages(window);
/*     */     
/* 227 */     window.addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent event) {
/* 230 */             if (WizardBase.this.isQuitOnWindowClose()) {
/* 231 */               WizardBase.this.cancel();
/* 232 */             } else if (WizardBase.this.isFinishOnWindowClose()) {
/* 233 */               WizardBase.this.finishFromCloseButton();
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/*     */           public void windowOpened(WindowEvent event) {
/* 239 */             Toolkit.getDefaultToolkit().sync();
/* 240 */             window.toFront();
/* 241 */             VersionSpecificHelper.requestForeground();
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public abstract boolean isSizeClientArea();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\wizard\WizardBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */