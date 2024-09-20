/*    */ package com.exe4j.runtime.jpms;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class ModuleHandler {
/*    */   public static Class findClass(String moduleMain) throws ClassNotFoundException {
/*    */     final String mainClass, moduleName;
/*  7 */     int slashIndex = moduleMain.indexOf('/');
/*    */ 
/*    */     
/* 10 */     if (slashIndex > -1) {
/* 11 */       moduleName = moduleMain.substring(0, slashIndex);
/* 12 */       mainClass = moduleMain.substring(slashIndex + 1);
/*    */     } else {
/* 14 */       moduleName = moduleMain;
/* 15 */       mainClass = null;
/*    */     } 
/* 17 */     Module module = ModuleLayer.boot().findModule(moduleName).<Throwable>orElseThrow((Supplier)new Supplier<RuntimeException>()
/*    */         {
/*    */           public RuntimeException get() {
/* 20 */             return new RuntimeException("did not find module " + moduleName);
/*    */           }
/*    */         });
/* 23 */     ModuleHandler.class.getModule().addReads(module);
/* 24 */     if (mainClass == null) {
/* 25 */       mainClass = module.getDescriptor().mainClass().<Throwable>orElseThrow((Supplier)new Supplier<RuntimeException>()
/*    */           {
/*    */             public RuntimeException get() {
/* 28 */               return new RuntimeException("module " + moduleName + " did not define a main class");
/*    */             }
/*    */           });
/*    */     }
/* 32 */     return Class.forName(mainClass);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtime\jpms\ModuleHandler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */