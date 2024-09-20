/*     */ package com.install4j.api.screens;
/*     */ 
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerEventListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractInstallerOrUninstallerScreen
/*     */   extends AbstractBean
/*     */   implements InstallerScreen, UninstallerScreen, InstallerEventListener
/*     */ {
/*     */   private InstallerContext installerContext;
/*     */   private UninstallerContext uninstallerContext;
/*     */   
/*     */   public void setInstallerContext(InstallerContext context) {
/*  23 */     this.installerContext = context;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUninstallerContext(UninstallerContext context) {
/*  28 */     this.uninstallerContext = context;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isNextVisible() {
/*  33 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPreviousVisible() {
/*  38 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCancelVisible() {
/*  43 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForNext() {
/*  48 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForPrevious() {
/*  53 */     return false;
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
/*     */   
/*     */   public void installerEvent(InstallerEvent event) {}
/*     */ 
/*     */   
/*     */   public boolean next() {
/*  70 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean previous() {
/*  75 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cancel() {
/*  80 */     return true;
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
/*  95 */     return Anchor.NORTHWEST;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHidden() {
/* 100 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 105 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 110 */     console.printHeader(getTitle());
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface(ProgressInterface defaultProgressInterface) {
/* 116 */     return defaultProgressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCreateLazily() {
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InstallerContext getInstallerContext() {
/* 131 */     return this.installerContext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UninstallerContext getUninstallerContext() {
/* 141 */     return this.uninstallerContext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Context getContext() {
/* 151 */     return (this.installerContext != null) ? (Context)this.installerContext : (Context)this.uninstallerContext;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\screens\AbstractInstallerOrUninstallerScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */