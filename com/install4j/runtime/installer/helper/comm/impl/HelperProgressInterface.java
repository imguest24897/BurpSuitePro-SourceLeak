/*     */ package com.install4j.runtime.installer.helper.comm.impl;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchIntAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchLongAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.util.Objects;
/*     */ 
/*     */ class HelperProgressInterface
/*     */   implements ProgressInterface, Serializable {
/*  20 */   private transient HelperCommunication helperCommunication = HelperCommunication.getInstance();
/*     */   
/*  22 */   private transient int lastPercentCompleted = -1;
/*  23 */   private transient int lastSecondaryPercentCompleted = -1;
/*     */   
/*     */   private transient String lastStatusMessage;
/*     */   private transient String lastDetailMessage;
/*     */   
/*     */   public void setStatusMessage(final String message) {
/*  29 */     if (!Objects.equals(message, this.lastStatusMessage)) {
/*  30 */       this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/*  33 */               context.getProgressInterface().setStatusMessage(message);
/*     */             }
/*     */           });
/*  36 */       this.lastStatusMessage = message;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDetailMessage(final String message) {
/*  42 */     if (!Objects.equals(message, this.lastDetailMessage)) {
/*  43 */       this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/*  46 */               context.getProgressInterface().setDetailMessage(message);
/*     */             }
/*     */           });
/*  49 */       this.lastDetailMessage = message;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPercentCompleted(final int value) {
/*  55 */     if (this.lastPercentCompleted != value) {
/*  56 */       this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/*  59 */               context.getProgressInterface().setPercentCompleted(value);
/*     */             }
/*     */           });
/*  62 */       this.lastPercentCompleted = value;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSecondaryPercentCompleted(final int value) {
/*  68 */     if (this.lastSecondaryPercentCompleted != value) {
/*  69 */       this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/*  72 */               context.getProgressInterface().setSecondaryPercentCompleted(value);
/*     */             }
/*     */           });
/*  75 */       this.lastSecondaryPercentCompleted = value;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPercentCompleted() {
/*  81 */     return this.helperCommunication.fetchInt(ExecutionContext.UNELEVATED, new FetchLongAction()
/*     */         {
/*     */           protected long fetchValue(Context context) {
/*  84 */             return context.getProgressInterface().getPercentCompleted();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndeterminateProgress(final boolean indeterminateProgress) {
/*  91 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  94 */             context.getProgressInterface().setIndeterminateProgress(indeterminateProgress);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void showFailure(final String message) {
/* 101 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 104 */             context.getProgressInterface().showFailure(message);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public int askOverwrite(final File file) throws UserCanceledException {
/*     */     try {
/* 112 */       return this.helperCommunication.fetchIntChecked(ExecutionContext.UNELEVATED, new FetchIntAction()
/*     */           {
/*     */             protected int fetchValue(Context context) throws UserCanceledException {
/* 115 */               return context.getProgressInterface().askOverwrite(file);
/*     */             }
/*     */           });
/* 118 */     } catch (IOException e) {
/* 119 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int askRetry(final File file) throws UserCanceledException {
/*     */     try {
/* 126 */       return this.helperCommunication.fetchIntChecked(ExecutionContext.UNELEVATED, new FetchIntAction()
/*     */           {
/*     */             protected int fetchValue(Context context) throws UserCanceledException {
/* 129 */               return context.getProgressInterface().askRetry(file);
/*     */             }
/*     */           });
/* 132 */     } catch (IOException e) {
/* 133 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean askContinue(final File file) throws UserCanceledException {
/*     */     try {
/* 140 */       return this.helperCommunication.fetchBooleanChecked(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws UserCanceledException {
/* 143 */               return context.getProgressInterface().askContinue(file);
/*     */             }
/*     */           });
/* 146 */     } catch (IOException e) {
/* 147 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\HelperProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */