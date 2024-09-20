/*    */ package com.sun.javafx.property;
/*    */ 
/*    */ import com.sun.javafx.reflect.MethodUtil;
/*    */ import com.sun.javafx.reflect.ReflectUtil;
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import java.security.AccessController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MethodHelper
/*    */ {
/* 41 */   private static final boolean logAccessErrors = ((Boolean)AccessController.<Boolean>doPrivileged(() -> Boolean.valueOf(Boolean.getBoolean("sun.reflect.debugModuleAccessChecks")))).booleanValue();
/*    */ 
/*    */   
/* 44 */   private static final Module trampolineModule = MethodUtil.getTrampolineModule();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Object invoke(Method paramMethod, Object paramObject, Object[] paramArrayOfObject) throws InvocationTargetException, IllegalAccessException {
/* 54 */     Class<?> clazz = paramMethod.getDeclaringClass();
/* 55 */     String str = clazz.getPackage().getName();
/* 56 */     Module module1 = clazz.getModule();
/* 57 */     Module module2 = MethodHelper.class.getModule();
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 62 */       if (!module1.isExported(str)) {
/* 63 */         if (!module1.isOpen(str, module2)) {
/* 64 */           throw new IllegalAccessException("module " + module2
/* 65 */               .getName() + " cannot access class " + clazz
/* 66 */               .getName() + " (in module " + module1
/* 67 */               .getName() + ") because module " + module1
/* 68 */               .getName() + " does not open " + str + " to " + module2
/*    */               
/* 70 */               .getName());
/*    */         }
/* 72 */         if (!module1.isOpen(str, trampolineModule)) {
/* 73 */           ReflectUtil.checkPackageAccess(str);
/* 74 */           module1.addOpens(str, trampolineModule);
/*    */         } 
/*    */       } 
/* 77 */     } catch (IllegalAccessException illegalAccessException) {
/* 78 */       if (logAccessErrors) {
/* 79 */         illegalAccessException.printStackTrace(System.err);
/*    */       }
/* 81 */       throw illegalAccessException;
/*    */     } 
/*    */     
/* 84 */     return MethodUtil.invoke(paramMethod, paramObject, paramArrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\MethodHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */