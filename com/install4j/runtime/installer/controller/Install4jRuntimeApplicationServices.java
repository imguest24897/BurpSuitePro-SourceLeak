/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ import com.ejt.internal.CommonApplicationServices;
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.util.IconHelper;
/*    */ import java.awt.Image;
/*    */ import java.awt.Window;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Install4jRuntimeApplicationServices
/*    */   extends CommonApplicationServices
/*    */ {
/*    */   public List<? extends Image> getWindowImageIcons() {
/* 21 */     return IconHelper.getFrameIconImages();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isLocalized() {
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getPreferenceRootPath() {
/* 31 */     return "com/install4j/runtime";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFrameworkWindow(Window window) {
/* 36 */     return (window instanceof com.install4j.runtime.util.CustomDialog || window instanceof com.install4j.runtime.wizard.CustomFrame || window instanceof com.install4j.runtime.alert.AlertOptionPane.TempFrame);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void beforeAlertOn(Window parentWindow) {}
/*    */ 
/*    */   
/*    */   public String getApplicationName() {
/* 45 */     return Messages.getString(".SetupAppTitle");
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean confirmOverwrite(Window parent, File selectedFile) {
/*    */     try {
/* 51 */       return (Util.showOptionDialog(
/* 52 */           Messages.getString(".FileExists"), new String[] {
/* 53 */             Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, 3) == 0);
/*    */     }
/* 55 */     catch (UserCanceledException e) {
/* 56 */       return false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\Install4jRuntimeApplicationServices.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */