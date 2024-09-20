/*    */ package com.install4j.runtime.installer.frontend;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.frontend.components.ProgressDisplay;
/*    */ import com.install4j.runtime.util.CustomDialog;
/*    */ import java.awt.BorderLayout;
/*    */ import java.awt.Component;
/*    */ import java.awt.Window;
/*    */ import java.io.File;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class RollbackProgressInterface extends CustomDialog implements ProgressInterface {
/* 14 */   private final GUIProgressInterface guiProgressInterface = new GUIProgressInterface();
/*    */   
/*    */   private ProgressDisplay progressDisplay;
/*    */   
/*    */   public RollbackProgressInterface(Window parentWindow) {
/* 19 */     super(parentWindow);
/* 20 */     this.progressDisplay = new ProgressDisplay();
/* 21 */     JPanel contentPane = (JPanel)getContentPane();
/* 22 */     contentPane.setLayout(new BorderLayout());
/* 23 */     contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
/* 24 */     contentPane.add((Component)this.progressDisplay, "Center");
/*    */     
/* 26 */     setTitle(Messages.getString(".RollbackWindowTitle"));
/* 27 */     setModal(false);
/* 28 */     setDefaultCloseOperation(0);
/* 29 */     setResizable(false);
/*    */     
/* 31 */     pack();
/* 32 */     setBounds(getFrameBounds());
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameHeight() {
/* 37 */     return -1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getFrameWidth() {
/* 42 */     return 350;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setStatusMessage(String message) {
/* 47 */     this.progressDisplay.setStatusMessage(message);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setDetailMessage(String message) {
/* 52 */     this.progressDisplay.setDetailMessage(message);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPercentCompleted(int value) {
/* 57 */     this.progressDisplay.setPercentCompleted(value);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getPercentCompleted() {
/* 62 */     return this.progressDisplay.getPercentCompleted();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSecondaryPercentCompleted(int value) {
/* 67 */     this.progressDisplay.setSecondaryPercentCompleted(value);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIndeterminateProgress(boolean indeterminateProgress) {
/* 72 */     this.progressDisplay.setIndeterminateProgress(indeterminateProgress);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void showFailure(String message) {
/* 79 */     this.guiProgressInterface.showFailure(message);
/*    */   }
/*    */ 
/*    */   
/*    */   public int askOverwrite(File file) throws UserCanceledException {
/* 84 */     return this.guiProgressInterface.askOverwrite(file);
/*    */   }
/*    */ 
/*    */   
/*    */   public int askRetry(File file) throws UserCanceledException {
/* 89 */     return this.guiProgressInterface.askRetry(file);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean askContinue(File file) throws UserCanceledException {
/* 94 */     return this.guiProgressInterface.askContinue(file);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\RollbackProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */