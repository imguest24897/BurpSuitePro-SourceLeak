/*     */ package com.install4j.api.screens;
/*     */ 
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractInstallerScreen
/*     */   extends AbstractBean
/*     */   implements InstallerScreen
/*     */ {
/*     */   private InstallerContext context;
/*     */   
/*     */   public void setInstallerContext(InstallerContext context) {
/*  22 */     this.context = context;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isNextVisible() {
/*  27 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPreviousVisible() {
/*  32 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCancelVisible() {
/*  37 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForNext() {
/*  42 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForPrevious() {
/*  47 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void activated() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void deactivated() {}
/*     */ 
/*     */   
/*     */   public boolean next() {
/*  60 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean previous() {
/*  65 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cancel() {
/*  70 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void willActivate() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Anchor getAnchor() {
/*  85 */     return Anchor.NORTHWEST;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHidden() {
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 100 */     console.printHeader(getTitle());
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface(ProgressInterface defaultProgressInterface) {
/* 106 */     return defaultProgressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCreateLazily() {
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InstallerContext getInstallerContext() {
/* 120 */     return this.context;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\screens\AbstractInstallerScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */