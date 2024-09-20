/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.win32.Misc;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.locks.LockSupport;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WindowInfo
/*     */ {
/*     */   private final long hwnd;
/*     */   private final int style;
/*     */   private final String className;
/*     */   private final String windowTitle;
/*     */   private static final int WS_MAXIMIZEBOX = 65536;
/*     */   
/*     */   private WindowInfo(long hwnd, int style, String className, String windowTitle) {
/*  31 */     this.hwnd = hwnd;
/*  32 */     this.style = style;
/*  33 */     this.className = className;
/*  34 */     this.windowTitle = windowTitle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Collection<WindowInfo> getTopLevelWindows(long processId) {
/*  43 */     return Misc.getTopLevelWindows((int)processId);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isTabletMode() {
/*  51 */     return Misc.isTabletMode();
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
/*     */   public static boolean waitForMaximizableWindow(File executablePath, long timeout, TimeUnit unit) {
/*  63 */     if (!Util.isWindows()) {
/*  64 */       return false;
/*     */     }
/*     */     try {
/*  67 */       long timeoutNanos = unit.toNanos(timeout);
/*  68 */       long startTime = System.nanoTime();
/*  69 */       File canonicalPath = executablePath.getCanonicalFile();
/*  70 */       List<Integer> pids = getPids(canonicalPath, startTime, timeoutNanos);
/*  71 */       if (pids.isEmpty()) {
/*  72 */         return false;
/*     */       }
/*     */       while (true) {
/*  75 */         for (Integer pid : pids) {
/*  76 */           for (WindowInfo windowInfo : getTopLevelWindows(pid.intValue())) {
/*  77 */             if ((windowInfo.getStyle() & 0x10000) > 0) {
/*  78 */               return true;
/*     */             }
/*     */           } 
/*     */         } 
/*  82 */         if (isTimeout(startTime, timeoutNanos)) {
/*  83 */           return false;
/*     */         }
/*  85 */         LockSupport.parkNanos(100000000L);
/*     */       } 
/*  87 */     } catch (IOException e) {
/*  88 */       Logger.getInstance().log(e);
/*  89 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static List<Integer> getPids(File canonicalPath, long startTime, long timeoutNanos) {
/*  94 */     List<Integer> pids = new ArrayList<>();
/*     */     while (true) {
/*  96 */       for (WinProcesses.Info info : WinProcesses.getRunningProcesses()) {
/*     */         try {
/*  98 */           if ((new File(info.getModuleName())).getCanonicalFile().equals(canonicalPath)) {
/*  99 */             pids.add(Integer.valueOf(info.getProcessId()));
/*     */           }
/* 101 */         } catch (IOException iOException) {}
/*     */       } 
/*     */ 
/*     */       
/* 105 */       if (!pids.isEmpty() || isTimeout(startTime, timeoutNanos)) {
/* 106 */         return pids;
/*     */       }
/* 108 */       LockSupport.parkNanos(100000000L);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean isTimeout(long startTime, long timeoutNanos) {
/* 113 */     return (timeoutNanos > 0L && System.nanoTime() - startTime > timeoutNanos);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getHwnd() {
/* 122 */     return this.hwnd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStyle() {
/* 130 */     return this.style;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClassName() {
/* 138 */     return this.className;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWindowTitle() {
/* 146 */     return this.windowTitle;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 151 */     return "WindowInfo{hwnd=" + this.hwnd + ", style=0x" + 
/*     */       
/* 153 */       Integer.toHexString(this.style) + ", className='" + this.className + '\'' + ", windowTitle='" + this.windowTitle + '\'' + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WindowInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */