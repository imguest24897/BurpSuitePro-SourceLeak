/*    */ package com.ejt.internal;
/*    */ 
/*    */ import java.awt.Image;
/*    */ import java.awt.Window;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public abstract class CommonApplicationServices
/*    */ {
/*    */   @Nullable
/*    */   private static CommonApplicationServices instance;
/*    */   private static UnshadedWrapper unshadedWrapper;
/*    */   private static boolean unshadedWrapperChecked;
/*    */   
/*    */   @Nullable
/*    */   public static CommonApplicationServices getInstance() {
/* 18 */     if (unshadedWrapper != null && !unshadedWrapper.isAlive()) {
/* 19 */       unshadedWrapper = null;
/* 20 */       unshadedWrapperChecked = false;
/*    */     } 
/* 22 */     if (!unshadedWrapperChecked) {
/* 23 */       unshadedWrapper = getUnshadedWrapper();
/* 24 */       unshadedWrapperChecked = true;
/*    */     } 
/* 26 */     return (unshadedWrapper != null) ? unshadedWrapper : instance;
/*    */   }
/*    */   
/*    */   public static void clearInstance() {
/* 30 */     instance = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void setInstance(CommonApplicationServices instance) {
/* 35 */     if (CommonApplicationServices.instance == null) {
/* 36 */       CommonApplicationServices.instance = instance;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private static UnshadedWrapper getUnshadedWrapper() {
/* 42 */     if (CommonApplicationServices.class.getName().startsWith("com.ejt.internal")) {
/*    */       try {
/* 44 */         Class<?> unshadedClass = Class.forName("xyz.ejt.framework.CommonApplicationServices".replace("xyz", "com"));
/* 45 */         if (unshadedClass != null) {
/* 46 */           Object unshadedInstance = unshadedClass.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
/* 47 */           if (unshadedInstance != null) {
/* 48 */             return new UnshadedWrapper(unshadedClass, unshadedInstance);
/*    */           }
/*    */         } 
/* 51 */       } catch (Throwable throwable) {}
/*    */     }
/*    */     
/* 54 */     return null;
/*    */   }
/*    */   
/*    */   public abstract List<? extends Image> getWindowImageIcons();
/*    */   
/*    */   public abstract boolean isFrameworkWindow(Window paramWindow);
/*    */   
/*    */   public abstract void beforeAlertOn(Window paramWindow);
/*    */   
/*    */   public abstract String getApplicationName();
/*    */   
/*    */   public abstract boolean confirmOverwrite(Window paramWindow, File paramFile);
/*    */   
/*    */   public abstract boolean isLocalized();
/*    */   
/*    */   public abstract String getPreferenceRootPath();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\CommonApplicationServices.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */