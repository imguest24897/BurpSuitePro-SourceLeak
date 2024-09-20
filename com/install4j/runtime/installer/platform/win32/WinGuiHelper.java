/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import java.awt.Component;
/*    */ import java.awt.GraphicsEnvironment;
/*    */ import java.awt.HeadlessException;
/*    */ import java.awt.Window;
/*    */ import java.lang.reflect.Method;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WinGuiHelper
/*    */ {
/*    */   private static Method getHwndMethod;
/*    */   
/*    */   static {
/* 22 */     Common.init();
/*    */   }
/*    */   
/*    */   public static void destroyHIcon(long hicon) {
/* 26 */     if (Util.isWindows() && hicon != 0L) {
/* 27 */       destroyHIcon0(hicon);
/*    */     }
/*    */   }
/*    */   
/*    */   public static long createHIcon(byte[] data, int desiredWidth, int desiredHeight) {
/* 32 */     if (Util.isWindows() && data != null) {
/* 33 */       return createHIcon0(data, desiredWidth, desiredHeight);
/*    */     }
/* 35 */     return 0L;
/*    */   }
/*    */   
/*    */   public static void flashWindow(long hwnd) {
/* 39 */     if (Util.isWindows() && hwnd != 0L) {
/* 40 */       flashWindow0(hwnd, true);
/*    */     }
/*    */   }
/*    */   
/*    */   public static synchronized long getHwnd(Window window) throws HeadlessException {
/* 45 */     if (window != null) {
/* 46 */       if (GraphicsEnvironment.isHeadless()) {
/* 47 */         throw new HeadlessException("No native windows when headless");
/*    */       }
/* 49 */       if (!Util.isWindows()) {
/* 50 */         return 0L;
/*    */       }
/*    */       try {
/* 53 */         Object componentPeer = getPeer0(window, Component.class);
/* 54 */         if (componentPeer != null) {
/* 55 */           if (getHwndMethod == null) {
/* 56 */             getHwndMethod = componentPeer.getClass().getMethod("getHWnd", new Class[0]);
/* 57 */             if (!Objects.equals(getHwndMethod.getReturnType(), long.class)) {
/* 58 */               getHwndMethod = null;
/*    */             }
/*    */           } 
/* 61 */           if (getHwndMethod != null) {
/* 62 */             return getHwnd0(componentPeer, getHwndMethod);
/*    */           }
/*    */         } 
/* 65 */       } catch (Throwable throwable) {}
/*    */     } 
/*    */     
/* 68 */     return 0L;
/*    */   }
/*    */   
/*    */   private static native Object getPeer0(Window paramWindow, Class<?> paramClass);
/*    */   
/*    */   private static native long getHwnd0(Object paramObject, Method paramMethod);
/*    */   
/*    */   private static native void destroyHIcon0(long paramLong);
/*    */   
/*    */   private static native long createHIcon0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
/*    */   
/*    */   private static native void flashWindow0(long paramLong, boolean paramBoolean);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\WinGuiHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */