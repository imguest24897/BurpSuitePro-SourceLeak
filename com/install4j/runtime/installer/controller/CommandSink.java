/*     */ package com.install4j.runtime.installer.controller;
/*     */ 
/*     */ import com.install4j.api.beans.ActionList;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CommandSink
/*     */ {
/*     */   private ControllerCommand command;
/*     */   private ControllerCommand overrideCommand;
/*     */   private boolean allowOverride = false;
/*     */   private boolean store = false;
/*     */   private ControllerCommand storedCommand;
/*     */   private boolean finished = false;
/*     */   private Thread controllerThread;
/*     */   private Controller controller;
/*     */   
/*     */   public CommandSink(Controller controller) {
/*  24 */     this.controller = controller;
/*  25 */     this.controllerThread = Thread.currentThread();
/*     */   }
/*     */   
/*     */   public ControllerCommand getCommand() {
/*  29 */     return this.command;
/*     */   }
/*     */   
/*     */   public synchronized void returnToController(ControllerCommand command) {
/*  33 */     if (Boolean.getBoolean("install4j.debugControllerCommands")) {
/*  34 */       Logger.getInstance().info(null, "Controller command: " + command);
/*  35 */       Logger.getInstance().log(new Exception("Stack trace"));
/*     */     } 
/*  37 */     if (command == null) {
/*  38 */       throw new IllegalArgumentException();
/*     */     }
/*  40 */     if (this.store) {
/*  41 */       this.storedCommand = command;
/*  42 */     } else if (this.command == null) {
/*  43 */       this.command = command;
/*     */       
/*  45 */       if (!this.controllerThread.isAlive() && command == ControllerCommand.CANCEL) {
/*  46 */         this.controller.rollback(this);
/*     */       } else {
/*  48 */         notifyAll();
/*     */       } 
/*  50 */     } else if (this.allowOverride) {
/*  51 */       this.overrideCommand = command;
/*     */     } 
/*     */   }
/*     */   
/*     */   public synchronized void finished() {
/*  56 */     this.finished = true;
/*  57 */     notifyAll();
/*     */   }
/*     */   
/*     */   public synchronized void waitForFinish() {
/*  61 */     while (!this.finished && this.controllerThread.isAlive() && !InstallerUtil.isExiting()) {
/*     */       try {
/*  63 */         wait(100L);
/*  64 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ControllerCommand getOverriddenCommand() {
/*  70 */     return (this.overrideCommand != null) ? this.overrideCommand : this.command;
/*     */   }
/*     */   
/*     */   public synchronized void allowOverride() {
/*  74 */     this.allowOverride = true;
/*     */   }
/*     */   
/*     */   public boolean isFinished() {
/*  78 */     return this.finished;
/*     */   }
/*     */   
/*     */   public synchronized void startStoreCommand() {
/*  82 */     this.store = true;
/*  83 */     this.storedCommand = null;
/*     */   }
/*     */   
/*     */   public synchronized ControllerCommand finishStoreCommand() {
/*  87 */     this.store = false;
/*  88 */     ControllerCommand ret = this.storedCommand;
/*  89 */     this.storedCommand = null;
/*  90 */     return ret;
/*     */   }
/*     */   
/*     */   public boolean executeActionList(ActionList actionList, Object... extraScriptParameters) throws UserCanceledException {
/*  94 */     return this.controller.executeActionList(actionList, extraScriptParameters);
/*     */   }
/*     */   
/*     */   public boolean isExecutingActions() {
/*  98 */     return this.controller.isExecutingActions();
/*     */   }
/*     */   
/*     */   public void rollbackActionList(ActionList actionList) {
/* 102 */     this.controller.rollbackActionList(actionList);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\CommandSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */