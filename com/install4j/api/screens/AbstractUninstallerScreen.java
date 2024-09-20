/*     */ package com.install4j.api.screens;
/*     */ 
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerEventListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractUninstallerScreen
/*     */   extends AbstractBean
/*     */   implements UninstallerScreen, InstallerEventListener
/*     */ {
/*     */   private UninstallerContext context;
/*     */   
/*     */   public void setUninstallerContext(UninstallerContext context) {
/*  24 */     this.context = context;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isNextVisible() {
/*  29 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPreviousVisible() {
/*  34 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCancelVisible() {
/*  39 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForNext() {
/*  44 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHiddenForPrevious() {
/*  49 */     return false;
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
/*  66 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean previous() {
/*  71 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cancel() {
/*  76 */     return true;
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
/*  91 */     return Anchor.NORTHWEST;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHidden() {
/*  96 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 101 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 106 */     console.printHeader(getTitle());
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface(ProgressInterface defaultProgressInterface) {
/* 112 */     return defaultProgressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isCreateLazily() {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UninstallerContext getUninstallerContext() {
/* 126 */     return this.context;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\screens\AbstractUninstallerScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */