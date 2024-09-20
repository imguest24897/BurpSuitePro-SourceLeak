/*    */ package com.ejt.internal;
/*    */ 
/*    */ import java.awt.Image;
/*    */ import java.awt.Window;
/*    */ import java.io.File;
/*    */ import java.lang.ref.WeakReference;
/*    */ import java.lang.reflect.Method;
/*    */ import java.util.List;
/*    */ 
/*    */ public class UnshadedWrapper
/*    */   extends CommonApplicationServices {
/*    */   private final WeakReference<Object> unshadedInstanceRef;
/*    */   private final Method getWindowImageIcons;
/*    */   private final Method isFrameworkWindow;
/*    */   private final Method beforeAlertOn;
/*    */   private final Method getApplicationName;
/*    */   private final Method confirmOverwrite;
/*    */   private final Method isLocalized;
/*    */   private final Method getPreferenceRootPath;
/*    */   
/*    */   public UnshadedWrapper(Class<?> unshadedClass, Object unshadedInstance) {
/* 22 */     this.unshadedInstanceRef = new WeakReference(unshadedInstance);
/* 23 */     this.getWindowImageIcons = getDelegateMethod(unshadedClass, "getWindowImageIcons", new Class[0]);
/* 24 */     this.isFrameworkWindow = getDelegateMethod(unshadedClass, "isFrameworkWindow", new Class[] { Window.class });
/* 25 */     this.beforeAlertOn = getDelegateMethod(unshadedClass, "beforeAlertOn", new Class[] { Window.class });
/* 26 */     this.getApplicationName = getDelegateMethod(unshadedClass, "getApplicationName", new Class[0]);
/* 27 */     this.confirmOverwrite = getDelegateMethod(unshadedClass, "confirmOverwrite", new Class[] { Window.class, File.class });
/* 28 */     this.isLocalized = getDelegateMethod(unshadedClass, "isLocalized", new Class[0]);
/* 29 */     this.getPreferenceRootPath = getDelegateMethod(unshadedClass, "getPreferenceRootPath", new Class[0]);
/*    */   }
/*    */   
/*    */   public boolean isAlive() {
/* 33 */     return (this.unshadedInstanceRef.get() != null);
/*    */   }
/*    */   
/*    */   private Method getDelegateMethod(Class<?> unshadedClass, String methodName, Class... argumentClasses) {
/*    */     try {
/* 38 */       return unshadedClass.getDeclaredMethod(methodName, argumentClasses);
/* 39 */     } catch (NoSuchMethodException e) {
/* 40 */       e.printStackTrace();
/* 41 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   private <T> T invokeMethod(Method method, Object... arguments) {
/* 46 */     return invokeMethod(null, method, arguments);
/*    */   }
/*    */ 
/*    */   
/*    */   private <T> T invokeMethod(T defaultValue, Method method, Object... arguments) {
/*    */     try {
/* 52 */       Object instance = this.unshadedInstanceRef.get();
/* 53 */       if (method != null && instance != null) {
/* 54 */         return (T)method.invoke(instance, arguments);
/*    */       }
/* 56 */     } catch (RuntimeException e) {
/* 57 */       throw e;
/* 58 */     } catch (Throwable t) {
/* 59 */       t.printStackTrace();
/*    */     } 
/* 61 */     return defaultValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<? extends Image> getWindowImageIcons() {
/* 66 */     return invokeMethod(this.getWindowImageIcons, new Object[0]);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFrameworkWindow(Window window) {
/* 71 */     return ((Boolean)invokeMethod(Boolean.valueOf(true), this.isFrameworkWindow, new Object[] { window })).booleanValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public void beforeAlertOn(Window parentWindow) {
/* 76 */     invokeMethod(Boolean.valueOf(true), this.beforeAlertOn, new Object[] { parentWindow });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getApplicationName() {
/* 81 */     return invokeMethod("application", this.getApplicationName, new Object[0]);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean confirmOverwrite(Window parent, File selectedFile) {
/* 86 */     return ((Boolean)invokeMethod(Boolean.valueOf(false), this.confirmOverwrite, new Object[] { parent, selectedFile })).booleanValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isLocalized() {
/* 91 */     return ((Boolean)invokeMethod(Boolean.valueOf(false), this.isLocalized, new Object[0])).booleanValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public String getPreferenceRootPath() {
/* 96 */     return invokeMethod(this.getPreferenceRootPath, new Object[0]);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\UnshadedWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */