/*     */ package com.sun.javafx.logging.jfr;
/*     */ 
/*     */ import com.sun.javafx.logging.Logger;
/*     */ import com.sun.javafx.logging.PulseLogger;
/*     */ import jdk.jfr.FlightRecorder;
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
/*     */ 
/*     */ public final class JFRPulseLogger
/*     */   extends Logger
/*     */ {
/*     */   private final ThreadLocal<JFRPulsePhaseEvent> currentPulsePhaseEvent;
/*     */   private final ThreadLocal<JFRInputEvent> currentInputEvent;
/*     */   private int pulseNumber;
/*     */   private int fxPulseNumber;
/*     */   private int renderPulseNumber;
/*     */   private Thread fxThread;
/*     */   
/*     */   public static Logger createInstance() {
/*  42 */     if (FlightRecorder.isInitialized() || PulseLogger.isPulseLoggingRequested()) {
/*  43 */       return new JFRPulseLogger();
/*     */     }
/*  45 */     return null;
/*     */   }
/*     */   
/*     */   private JFRPulseLogger() {
/*  49 */     FlightRecorder.register((Class)JFRInputEvent.class);
/*  50 */     FlightRecorder.register((Class)JFRPulsePhaseEvent.class);
/*  51 */     this.currentPulsePhaseEvent = new ThreadLocal<JFRPulsePhaseEvent>()
/*     */       {
/*     */         public JFRPulsePhaseEvent initialValue() {
/*  54 */           return new JFRPulsePhaseEvent();
/*     */         }
/*     */       };
/*  57 */     this.currentInputEvent = new ThreadLocal<JFRInputEvent>()
/*     */       {
/*     */         public JFRInputEvent initialValue() {
/*  60 */           return new JFRInputEvent();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void pulseStart() {
/*  68 */     this.fxPulseNumber = ++this.pulseNumber;
/*  69 */     if (this.fxThread == null) {
/*  70 */       this.fxThread = Thread.currentThread();
/*     */     }
/*  72 */     newPhase("Pulse start");
/*     */   }
/*     */ 
/*     */   
/*     */   public void pulseEnd() {
/*  77 */     newPhase(null);
/*  78 */     this.fxPulseNumber = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderStart() {
/*  83 */     this.renderPulseNumber = this.fxPulseNumber;
/*     */   }
/*     */ 
/*     */   
/*     */   public void renderEnd() {
/*  88 */     newPhase(null);
/*  89 */     this.renderPulseNumber = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void newPhase(String paramString) {
/*  99 */     JFRPulsePhaseEvent jFRPulsePhaseEvent = this.currentPulsePhaseEvent.get();
/*     */ 
/*     */     
/* 102 */     if (!jFRPulsePhaseEvent.isEnabled()) {
/* 103 */       jFRPulsePhaseEvent.setPhaseName((String)null);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 108 */     if (jFRPulsePhaseEvent.getPhaseName() != null) {
/* 109 */       jFRPulsePhaseEvent.commit();
/*     */     }
/*     */ 
/*     */     
/* 113 */     if (paramString == null) {
/* 114 */       jFRPulsePhaseEvent.setPhaseName((String)null);
/*     */       
/*     */       return;
/*     */     } 
/* 118 */     jFRPulsePhaseEvent = new JFRPulsePhaseEvent();
/* 119 */     jFRPulsePhaseEvent.begin();
/* 120 */     jFRPulsePhaseEvent.setPhaseName(paramString);
/* 121 */     jFRPulsePhaseEvent.setPulseId((Thread.currentThread() == this.fxThread) ? this.fxPulseNumber : this.renderPulseNumber);
/* 122 */     this.currentPulsePhaseEvent.set(jFRPulsePhaseEvent);
/*     */   }
/*     */ 
/*     */   
/*     */   public void newInput(String paramString) {
/* 127 */     JFRInputEvent jFRInputEvent = this.currentInputEvent.get();
/*     */ 
/*     */     
/* 130 */     if (!jFRInputEvent.isEnabled()) {
/* 131 */       jFRInputEvent.setInput((String)null);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 136 */     if (jFRInputEvent.getInput() != null) {
/* 137 */       jFRInputEvent.commit();
/*     */     }
/*     */ 
/*     */     
/* 141 */     if (paramString == null) {
/* 142 */       jFRInputEvent.setInput((String)null);
/*     */       
/*     */       return;
/*     */     } 
/* 146 */     jFRInputEvent = new JFRInputEvent();
/* 147 */     jFRInputEvent.begin();
/* 148 */     jFRInputEvent.setInput(paramString);
/* 149 */     this.currentInputEvent.set(jFRInputEvent);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\jfr\JFRPulseLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */