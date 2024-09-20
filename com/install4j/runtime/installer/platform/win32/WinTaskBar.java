/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import java.awt.Window;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class WinTaskBar
/*     */ {
/*     */   private static boolean initialized;
/*     */   
/*     */   static {
/*  18 */     Common.init();
/*     */   }
/*     */   
/*     */   private static synchronized void initTaskBar() {
/*  22 */     if (!initialized) {
/*  23 */       initialized = true;
/*  24 */       initTaskBar0();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static WinTaskBar getTaskBar(Window window) {
/*  35 */     if (!Util.isWindows() || window == null) {
/*  36 */       return new NoopTaskBar();
/*     */     }
/*     */     
/*  39 */     final long hwnd = WinGuiHelper.getHwnd(window);
/*  40 */     if (hwnd == 0L) {
/*  41 */       return new NoopTaskBar();
/*     */     }
/*     */     
/*  44 */     initTaskBar();
/*     */     
/*  46 */     return new WinTaskBar()
/*     */       {
/*     */         private WinTaskBar.ProgressState lastState;
/*     */         private long lastCompleted;
/*     */         private long lastTotal;
/*     */         
/*     */         public void setProgressState(WinTaskBar.ProgressState progressState) {
/*  53 */           if (progressState != this.lastState) {
/*  54 */             this.lastState = progressState;
/*  55 */             WinTaskBar.setState0(hwnd, progressState.intValue);
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public void setProgress(long completed, long total) {
/*  61 */           if (completed != this.lastCompleted || total != this.lastTotal) {
/*  62 */             this.lastCompleted = completed;
/*  63 */             this.lastTotal = total;
/*  64 */             WinTaskBar.setProgress0(hwnd, completed, total);
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public void setOverlayIcon(byte[] icoData, int iconSize) {
/*  70 */           if (icoData == null) {
/*  71 */             WinTaskBar.setOverlayIcon0(hwnd, 0L);
/*     */           } else {
/*  73 */             long hicon = WinGuiHelper.createHIcon(icoData, iconSize, iconSize);
/*  74 */             if (hicon != 0L) {
/*  75 */               WinTaskBar.setOverlayIcon0(hwnd, hicon);
/*  76 */               WinGuiHelper.destroyHIcon(hicon);
/*     */             } 
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public void flash() {
/*  83 */           WinGuiHelper.flashWindow(hwnd);
/*     */         }
/*     */       };
/*     */   }
/*     */   private static native void initTaskBar0();
/*     */   private static native void setOverlayIcon0(long paramLong1, long paramLong2);
/*     */   private static native void setProgress0(long paramLong1, long paramLong2, long paramLong3);
/*     */   private static native void setState0(long paramLong, int paramInt);
/*     */   public abstract void setProgressState(ProgressState paramProgressState);
/*     */   public abstract void setProgress(long paramLong1, long paramLong2);
/*     */   public abstract void setOverlayIcon(@Nullable byte[] paramArrayOfbyte, int paramInt);
/*     */   public abstract void flash();
/*     */   
/*     */   private static class NoopTaskBar extends WinTaskBar {
/*     */     private NoopTaskBar() {}
/*     */     
/*     */     public void setProgressState(WinTaskBar.ProgressState progressState) {}
/*     */     
/*     */     public void setProgress(long completed, long total) {}
/*     */     
/*     */     public void setOverlayIcon(byte[] icoData, int iconSize) {}
/*     */     
/*     */     public void flash() {} }
/*     */   
/* 107 */   public enum ProgressState { NOPROGRESS(0),
/* 108 */     INDETERMINATE(1),
/* 109 */     NORMAL(2),
/* 110 */     ERROR(4),
/* 111 */     PAUSED(8);
/*     */     
/*     */     final int intValue;
/*     */     
/*     */     ProgressState(int intValue) {
/* 116 */       this.intValue = intValue;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\WinTaskBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */