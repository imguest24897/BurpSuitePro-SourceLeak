/*     */ package com.exe4j;
/*     */ 
/*     */ import com.exe4j.runtime.WinLauncher;
/*     */ import com.exe4j.runtime.splash.SplashEngine;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.Deque;
/*     */ import java.util.EventListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Controller
/*     */ {
/*  24 */   private static final int MAX_STORED_STARTUPS = Integer.getInteger("install4j.maxStoredStartups", 50000).intValue();
/*     */   
/*     */   private static volatile StartupListener startupListener;
/*     */   private static boolean startupThreadStarted = false;
/*  28 */   private static final Deque<String> performedStartups = new ArrayDeque<String>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void writeMessage(String message) throws ConnectionException {
/*     */     try {
/*  38 */       SplashEngine.writeMessage(message);
/*  39 */     } catch (Exception e) {
/*  40 */       throw new ConnectionException(e);
/*  41 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void hide() throws ConnectionException {
/*     */     try {
/*  53 */       SplashEngine.hide();
/*  54 */     } catch (Exception e) {
/*  55 */       throw new ConnectionException(e);
/*  56 */     } catch (Throwable throwable) {}
/*     */   }
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
/*     */   public static synchronized void registerStartupListener(StartupListener startupListener) {
/*  69 */     Controller.startupListener = startupListener;
/*  70 */     if (!startupThreadStarted && WinLauncher.LEGACY_PROCESS_COMM_FILE_NAME != null) {
/*  71 */       startupThreadStarted = true;
/*  72 */       (new LegacyStartupThread()).start();
/*     */     } 
/*  74 */     if (startupListener != null) {
/*  75 */       while (!performedStartups.isEmpty()) {
/*  76 */         startupListener.startupPerformed(performedStartups.removeFirst());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static synchronized void startupPerformed(String str) {
/*     */     try {
/*  87 */       Thread currentThread = Thread.currentThread();
/*  88 */       if (currentThread.getContextClassLoader() == null) {
/*  89 */         currentThread.setContextClassLoader(ClassLoader.getSystemClassLoader());
/*     */       }
/*  91 */     } catch (Throwable t) {
/*  92 */       t.printStackTrace();
/*     */     } 
/*     */     
/*  95 */     if (str == null) {
/*  96 */       str = "";
/*     */     }
/*  98 */     if (startupListener != null) {
/*  99 */       startupListener.startupPerformed(str);
/* 100 */     } else if (str.length() > 0 && performedStartups.size() < MAX_STORED_STARTUPS) {
/* 101 */       performedStartups.add(str);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static synchronized void addLegacyStartup(String str) {
/* 106 */     performedStartups.add(str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ConnectionException
/*     */     extends Exception
/*     */   {
/*     */     private ConnectionException(Exception e) {
/* 118 */       super(e.getMessage());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface StartupListener
/*     */     extends EventListener
/*     */   {
/*     */     void startupPerformed(String param1String);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static class LegacyStartupThread
/*     */     extends Thread
/*     */   {
/* 144 */     private File processCommFile = new File(WinLauncher.LEGACY_PROCESS_COMM_FILE_NAME);
/*     */     
/*     */     public LegacyStartupThread() {
/* 147 */       super("Exe4JStartupThread");
/* 148 */       setDaemon(true);
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 153 */       long lastModified = 0L;
/* 154 */       int shortWaitCount = 0;
/*     */       
/*     */       while (true) {
/* 157 */         if (this.processCommFile.exists() && lastModified != this.processCommFile.lastModified()) {
/* 158 */           lastModified = this.processCommFile.lastModified();
/*     */           try {
/*     */             String parameters;
/*     */             while (true) {
/*     */               try {
/* 163 */                 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.processCommFile), "UTF-16LE"));
/* 164 */                 parameters = reader.readLine();
/* 165 */                 reader.close();
/*     */                 break;
/* 167 */               } catch (IOException iOException) {}
/*     */             } 
/*     */ 
/*     */             
/* 171 */             if (Controller.startupListener != null) {
/* 172 */               final String parametersFinal = parameters;
/* 173 */               (new Thread()
/*     */                 {
/*     */                   public void run() {
/* 176 */                     Controller.startupListener.startupPerformed(parametersFinal);
/*     */                   }
/* 178 */                 }).start();
/* 179 */               shortWaitCount = 15;
/* 180 */             } else if (parameters != null) {
/* 181 */               Controller.addLegacyStartup(parameters);
/*     */             } 
/* 183 */             while (this.processCommFile.exists() && !this.processCommFile.delete()) {
/*     */               try {
/* 185 */                 sleep(100L);
/* 186 */               } catch (InterruptedException interruptedException) {}
/*     */             }
/*     */           
/* 189 */           } catch (Throwable t) {
/* 190 */             String parameters; parameters.printStackTrace();
/*     */           } 
/*     */         } 
/*     */         try {
/* 194 */           if (shortWaitCount > 0) {
/* 195 */             sleep(30L);
/* 196 */             shortWaitCount--; continue;
/* 197 */           }  if (Controller.startupListener != null) {
/* 198 */             sleep(300L); continue;
/*     */           } 
/* 200 */           sleep(3000L);
/*     */         }
/* 202 */         catch (InterruptedException interruptedException) {}
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\Controller.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */