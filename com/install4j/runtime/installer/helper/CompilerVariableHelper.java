/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class CompilerVariableHelper {
/*    */   public static final String EXTENSION_VARIABLE_PREFIX = "sys.ext.";
/*    */   
/*    */   public static boolean getCompilerExtensionVariable(@Nullable Context context, String name, boolean defaultValue) {
/* 10 */     String variableValue = getCompilerExtensionVariable(context, name, (String)null);
/* 11 */     if (variableValue != null) {
/* 12 */       return Boolean.parseBoolean(variableValue);
/*    */     }
/* 14 */     return defaultValue;
/*    */   }
/*    */   
/*    */   public static int getCompilerExtensionVariable(@Nullable Context context, String name, int defaultValue) {
/* 18 */     String variableValue = getCompilerExtensionVariable(context, name, (String)null);
/* 19 */     if (variableValue != null) {
/*    */       try {
/* 21 */         return Integer.parseInt(variableValue);
/* 22 */       } catch (NumberFormatException numberFormatException) {}
/*    */     }
/*    */     
/* 25 */     return defaultValue;
/*    */   }
/*    */   
/*    */   public static long getCompilerExtensionVariable(@Nullable Context context, String name, long defaultValue) {
/* 29 */     String variableValue = getCompilerExtensionVariable(context, name, (String)null);
/* 30 */     if (variableValue != null) {
/*    */       try {
/* 32 */         return Long.parseLong(variableValue);
/* 33 */       } catch (NumberFormatException numberFormatException) {}
/*    */     }
/*    */     
/* 36 */     return defaultValue;
/*    */   }
/*    */   
/*    */   public static String getCompilerExtensionVariable(@Nullable Context context, String name, String defaultValue) {
/* 40 */     if (context != null) {
/* 41 */       String variableValue = context.getCompilerVariable("sys.ext." + name);
/* 42 */       if (variableValue != null) {
/* 43 */         return variableValue;
/*    */       }
/*    */     } 
/* 46 */     return defaultValue;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\CompilerVariableHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */