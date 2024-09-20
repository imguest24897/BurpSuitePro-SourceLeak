/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.util.StringUtil;
/*    */ import java.util.HashMap;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class EnvironmentUtil
/*    */ {
/*    */   private static Map<String, String> env;
/*    */   
/*    */   private static Map<String, String> getEnv() {
/* 15 */     if (env == null) {
/* 16 */       Map<String, String> rawEnv = System.getenv();
/* 17 */       env = Util.isWindows() ? getUpperCaseVariables(rawEnv) : rawEnv;
/*    */     } 
/* 19 */     return env;
/*    */   }
/*    */   
/*    */   public static Map<String, String> getUpperCaseVariables(Map<String, String> variables) {
/* 23 */     Map<String, String> upperCaseVariables = new HashMap<>(variables.size());
/* 24 */     for (Map.Entry<String, String> entry : variables.entrySet()) {
/* 25 */       upperCaseVariables.put(((String)entry.getKey()).toUpperCase(Locale.ENGLISH), entry.getValue());
/*    */     }
/* 27 */     return upperCaseVariables;
/*    */   }
/*    */   
/*    */   public static String replaceEnvironmentVariables(String value, Map<String, String> variables) {
/* 31 */     return StringUtil.replaceVariable(value, (token, memento, hasFallback) -> (String)variables.get(Util.isWindows() ? token.toUpperCase(Locale.ENGLISH) : token));
/*    */   }
/*    */   
/*    */   public static String replaceEnvironmentVariables(String value) {
/* 35 */     return replaceEnvironmentVariables(value, getEnv());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\EnvironmentUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */