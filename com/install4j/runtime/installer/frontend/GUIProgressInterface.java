/*     */ package com.install4j.runtime.installer.frontend;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import java.io.File;
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
/*     */ public class GUIProgressInterface
/*     */   implements ProgressInterface
/*     */ {
/*     */   public void setStatusMessage(String message) {}
/*     */   
/*     */   public void setDetailMessage(String message) {}
/*     */   
/*     */   public void setPercentCompleted(int value) {}
/*     */   
/*     */   public int getPercentCompleted() {
/*  28 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(int value) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(boolean indeterminateProgress) {}
/*     */ 
/*     */   
/*     */   public void showFailure(String message) {
/*  41 */     Util.showMessage(message, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int askOverwrite(File file) throws UserCanceledException {
/*  47 */     String message = file.getPath() + "\n\n" + Messages.getString(".FileExists");
/*  48 */     int result = Util.showOptionDialog(message, new String[] {
/*     */           
/*  50 */           Messages.getString(".ButtonYes"), Messages.getString(".ButtonYesToAll"), Messages.getString(".ButtonNo"), Messages.getString(".ButtonNoToAll") }, 3);
/*     */ 
/*     */     
/*  53 */     switch (result) {
/*     */       case 0:
/*  55 */         return 2;
/*     */       case 1:
/*  57 */         return 3;
/*     */       case 2:
/*  59 */         return 1;
/*     */       case 3:
/*  61 */         return 4;
/*     */     } 
/*  63 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int askRetry(File file) throws UserCanceledException {
/*  69 */     String message = Messages.format(Messages.getString(".AskRetryInstallFile"), new Object[] { file.getPath() });
/*  70 */     if (ConsoleImpl.isRetryAllowNo()) {
/*  71 */       int result = Util.showOptionDialog(message, new String[] {
/*  72 */             Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo"), Messages.getString(".ButtonCancel") }, 3);
/*     */ 
/*     */ 
/*     */       
/*  76 */       switch (result) {
/*     */         case 0:
/*  78 */           return 2;
/*     */         case 1:
/*  80 */           return 1;
/*     */         case 2:
/*  82 */           return 3;
/*     */       } 
/*     */     } else {
/*  85 */       int result = Util.showOptionDialog(message, new String[] {
/*  86 */             Messages.getString(".ButtonYes"), Messages.getString(".ButtonCancel") }, 3);
/*     */ 
/*     */       
/*  89 */       switch (result) {
/*     */         case 0:
/*  91 */           return 2;
/*     */         case 1:
/*  93 */           return 3;
/*     */       } 
/*     */     
/*     */     } 
/*  97 */     return 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean askContinue(File file) throws UserCanceledException {
/* 102 */     int result = Util.showOptionDialog(
/* 103 */         Messages.format(Messages.getString(".AskContinue"), new Object[] { file.getPath() }), new String[] {
/* 104 */           Messages.getString(".ButtonOK"), Messages.getString(".ButtonCancel") }, 3);
/*     */ 
/*     */     
/* 107 */     return (result == 0);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\GUIProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */