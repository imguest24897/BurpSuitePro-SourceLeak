/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public class PreferencesUtil
/*    */ {
/*    */   private static boolean disableSystemRoot = false;
/*    */   
/*    */   public static void setDisableSystemRoot(boolean disableSystemRoot) {
/* 11 */     PreferencesUtil.disableSystemRoot = disableSystemRoot;
/*    */   }
/*    */   
/*    */   public static boolean isDisableSystemRoot() {
/* 15 */     return disableSystemRoot;
/*    */   }
/*    */   
/*    */   public static Preferences getPackageNode(String name, boolean userSpecific) {
/* 19 */     return getRootNode(userSpecific).node(sanitizePackageName(name));
/*    */   }
/*    */   
/*    */   public static Preferences getPackageNodeNoCreation(String name, boolean userSpecific) throws BackingStoreException {
/* 23 */     Preferences rootNode = getRootNode(userSpecific);
/* 24 */     String sanitizedPackageName = sanitizePackageName(name);
/* 25 */     if (rootNode.nodeExists(sanitizedPackageName)) {
/* 26 */       return rootNode.node(sanitizedPackageName);
/*    */     }
/* 28 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   private static String sanitizePackageName(String name) {
/* 33 */     name = replaceUnescaped(name, ".", "/");
/* 34 */     name = replaceUnescaped(name, "_", "-");
/* 35 */     if (!name.startsWith("/")) {
/* 36 */       name = "/" + name;
/*    */     }
/* 38 */     return name;
/*    */   }
/*    */   
/*    */   private static String replaceUnescaped(String name, String search, String replace) {
/* 42 */     return name.replaceAll(getSearchRegex(search), replace).replaceAll("\\\\" + search, search);
/*    */   }
/*    */   
/*    */   private static String getSearchRegex(String search) {
/* 46 */     return "(?<!\\\\)\\" + search;
/*    */   }
/*    */   
/*    */   public static Preferences getRootNode(boolean userSpecific) {
/* 50 */     return (userSpecific || isDisableSystemRoot()) ? Preferences.userRoot() : Preferences.systemRoot();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\PreferencesUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */