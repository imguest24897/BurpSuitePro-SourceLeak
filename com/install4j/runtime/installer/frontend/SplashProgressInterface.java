/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*     */ import com.install4j.runtime.installer.frontend.components.ProgressDisplay;
/*     */ import com.install4j.runtime.installer.frontend.headless.UnattendedScreenExecutor;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.CustomDialog;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import com.install4j.runtime.wizard.CustomFrame;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class SplashProgressInterface implements UnattendedProgressInterface {
/*  20 */   private static final int FRAME_WIDTH = Integer.getInteger("install4j.splashWidth", 350).intValue(); private final GUIProgressInterface guiProgressInterface; private ProgressDisplay progressDisplay; private boolean userConfirmations; private boolean quietOverwrite; public SplashProgressInterface(String title, boolean userConfirmations, boolean quietOverwrite, boolean noFileFailures, UnattendedScreenExecutor unattendedScreenExecutor, boolean dialog, Window parentWindow) {
/*     */     JPanel contentPane;
/*  22 */     this.guiProgressInterface = new GUIProgressInterface();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.userConfirmations = userConfirmations;
/*  36 */     this.quietOverwrite = quietOverwrite;
/*  37 */     this.noFileFailures = noFileFailures;
/*  38 */     this.unattendedScreenExecutor = unattendedScreenExecutor;
/*     */     
/*  40 */     this.btnCancel = new JButton(Messages.getString(".ButtonCancel"));
/*  41 */     this.btnCancel.addActionListener(e -> {
/*     */           if (this.btnCancel.isEnabled() && this.btnCancel.isVisible()) {
/*     */             doCancel();
/*     */           }
/*     */         });
/*     */     
/*  47 */     this.progressDisplay = new ProgressDisplay();
/*     */     
/*  49 */     this.cancelButtonPanel = new JPanel(new BorderLayout());
/*  50 */     GUIHelper.setEmptyBorder(this.cancelButtonPanel, 0, 5, 0, 0);
/*  51 */     this.cancelButtonPanel.add(this.btnCancel, "Last");
/*     */ 
/*     */     
/*  54 */     if (dialog) {
/*  55 */       SplashScreenDialog splashScreenDialog = new SplashScreenDialog(parentWindow);
/*  56 */       this.window = (Window)splashScreenDialog;
/*  57 */       contentPane = (JPanel)splashScreenDialog.getContentPane();
/*     */     } else {
/*  59 */       this.window = (Window)new SplashScreenFrame();
/*  60 */       SplashScreenFrame splashScreenFrame = (SplashScreenFrame)this.window;
/*  61 */       contentPane = (JPanel)splashScreenFrame.getContentPane();
/*     */     } 
/*     */     
/*  64 */     contentPane.setLayout(new BorderLayout());
/*  65 */     contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/*  66 */     contentPane.add((Component)this.progressDisplay, "Center");
/*  67 */     if (unattendedScreenExecutor != null) {
/*  68 */       contentPane.add(this.cancelButtonPanel, "After");
/*     */     }
/*     */     
/*  71 */     if (this.window instanceof SplashScreenDialog) {
/*  72 */       ((SplashScreenDialog)this.window).init(title);
/*     */     } else {
/*  74 */       ((SplashScreenFrame)this.window).init(title);
/*     */     } 
/*     */   }
/*     */   private boolean noFileFailures; private UnattendedScreenExecutor unattendedScreenExecutor; private JPanel cancelButtonPanel; private JButton btnCancel; private Window window;
/*     */   private void doCancel() {
/*  79 */     ContextImpl.runWithSuspendedActionsInt(() -> {
/*     */           this.btnCancel.setEnabled(false);
/*     */           ContextImpl.setCancelling();
/*     */           this.unattendedScreenExecutor.getCommandSink().returnToController(ControllerCommand.CANCEL);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatusMessage(String message) {
/*  88 */     this.progressDisplay.setStatusMessage(message);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDetailMessage(String message) {
/*  93 */     this.progressDisplay.setDetailMessage(message);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPercentCompleted(int value) {
/*  98 */     this.progressDisplay.setPercentCompleted(value);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/* 103 */     return this.progressDisplay.getPercentCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int value) {
/* 108 */     this.progressDisplay.setSecondaryPercentCompleted(value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/* 113 */     this.progressDisplay.setIndeterminateProgress(indeterminateProgress);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void showFailure(String message) {
/* 120 */     if (this.userConfirmations) {
/* 121 */       this.guiProgressInterface.showFailure(message);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/* 127 */     if (this.userConfirmations) {
/* 128 */       return this.guiProgressInterface.askOverwrite(file);
/*     */     }
/* 130 */     if (this.quietOverwrite) {
/* 131 */       return 2;
/*     */     }
/* 133 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/* 140 */     if (this.userConfirmations) {
/* 141 */       return this.guiProgressInterface.askRetry(file);
/*     */     }
/* 143 */     if (this.noFileFailures) {
/* 144 */       return 1;
/*     */     }
/* 146 */     return 3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/* 153 */     if (this.userConfirmations) {
/* 154 */       return this.guiProgressInterface.askContinue(file);
/*     */     }
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCancelButtonEnabled(boolean enabled) {
/* 162 */     this.btnCancel.setEnabled(enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCancelButtonVisible(boolean visible) {
/* 167 */     this.cancelButtonPanel.setVisible(visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/* 172 */     this.window.setVisible(visible);
/* 173 */     if (!visible) {
/* 174 */       this.window.dispose();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedProgressDialog() {
/* 180 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isAlertsShown() {
/* 185 */     return InstallerUtil.isUnattendedAlerts();
/*     */   }
/*     */   
/*     */   private static class SplashScreenDialog
/*     */     extends CustomDialog {
/*     */     SplashScreenDialog(Window wizardWindow) {
/* 191 */       super(wizardWindow);
/*     */     }
/*     */ 
/*     */     
/*     */     protected int getFrameHeight() {
/* 196 */       return -1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int getFrameWidth() {
/* 201 */       return SplashProgressInterface.FRAME_WIDTH;
/*     */     }
/*     */     
/*     */     public void init(String title) {
/* 205 */       setTitle(title);
/* 206 */       setDefaultCloseOperation(0);
/* 207 */       setResizable(false);
/* 208 */       pack();
/* 209 */       setBounds(getFrameBounds());
/* 210 */       IconHelper.setIconImages((Window)this);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SplashScreenFrame extends CustomFrame {
/*     */     private SplashScreenFrame() {}
/*     */     
/*     */     protected int getFrameHeight() {
/* 218 */       return -1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int getFrameWidth() {
/* 223 */       return SplashProgressInterface.FRAME_WIDTH;
/*     */     }
/*     */     
/*     */     public void init(String title) {
/* 227 */       setTitle(title);
/* 228 */       setDefaultCloseOperation(0);
/* 229 */       setResizable(false);
/* 230 */       pack();
/* 231 */       setBounds(getNewFrameBounds());
/* 232 */       IconHelper.setIconImages((Window)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\SplashProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */