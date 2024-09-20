/*     */ package com.install4j.runtime.installer.helper.console;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.headless.AbstractHeadlessScreenExecutor;
/*     */ import com.install4j.runtime.util.DaemonThreadFactory;
/*     */ import java.io.Console;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.concurrent.Callable;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import java.util.concurrent.ExecutionException;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.Future;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class Console16Access implements ConsoleAccess {
/*     */   private PrintWriter stdOut;
/*     */   private Console console;
/*  19 */   private ExecutorService readExecutor = Executors.newSingleThreadExecutor((ThreadFactory)new DaemonThreadFactory("i4j-console-")); private volatile boolean cancelled; private volatile Future<String> currentReadFuture;
/*     */   
/*     */   public Console16Access() {
/*  22 */     this.console = System.console();
/*  23 */     this.stdOut = this.console.writer();
/*     */   }
/*     */ 
/*     */   
/*     */   public void print(String text) {
/*  28 */     if (this.cancelled) {
/*  29 */       System.out.print(text);
/*     */     } else {
/*  31 */       this.stdOut.print(text);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void println(String text) {
/*  37 */     if (this.cancelled) {
/*  38 */       System.out.println(text);
/*     */     } else {
/*  40 */       this.stdOut.println(text);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void println() {
/*  46 */     if (this.cancelled) {
/*  47 */       System.out.println();
/*     */     } else {
/*  49 */       this.stdOut.println();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void flush() {
/*  55 */     if (this.cancelled) {
/*  56 */       System.out.flush();
/*     */     } else {
/*  58 */       this.console.flush();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String readLine(String prompt) throws UserCanceledException {
/*  64 */     return doRead(() -> this.console.readLine(prompt, new Object[0]));
/*     */   }
/*     */ 
/*     */   
/*     */   public String readPassword(String prompt) throws UserCanceledException {
/*  69 */     return doRead(() -> {
/*     */           char[] chars = this.console.readPassword(prompt, new Object[0]);
/*     */           return (chars == null) ? null : new String(chars);
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private String doRead(Callable<String> readCallable) throws UserCanceledException {
/*     */     String result;
/*     */     try {
/*  83 */       this.currentReadFuture = this.readExecutor.submit(readCallable);
/*  84 */       result = this.currentReadFuture.get();
/*  85 */     } catch (CancellationException|InterruptedException e) {
/*  86 */       throw new UserCanceledException();
/*  87 */     } catch (ExecutionException e) {
/*  88 */       if (AbstractHeadlessScreenExecutor.isExitCalled()) {
/*  89 */         throw new UserCanceledException();
/*     */       }
/*  91 */       throw new RuntimeException(e.getCause());
/*     */     } finally {
/*  93 */       this.currentReadFuture = null;
/*     */     } 
/*  95 */     if (result == null || AbstractHeadlessScreenExecutor.isExitCalled()) {
/*  96 */       throw new UserCanceledException();
/*     */     }
/*  98 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void cancel() {
/* 104 */     this.cancelled = true;
/* 105 */     this.readExecutor.shutdownNow();
/* 106 */     Future<String> currentReadFuture = this.currentReadFuture;
/* 107 */     if (currentReadFuture != null)
/* 108 */       currentReadFuture.cancel(true); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\console\Console16Access.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */