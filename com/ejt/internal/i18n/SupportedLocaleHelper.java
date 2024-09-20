/*    */ package com.ejt.internal.i18n;
/*    */ 
/*    */ import com.ejt.internal.CommonApplicationServices;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ public class SupportedLocaleHelper
/*    */ {
/*    */   public static void loadAndSet() {
/* 12 */     load().setCurrent(true);
/*    */   }
/*    */   
/*    */   public static SupportedLocale load() {
/* 16 */     Preferences preferencesNode = getPreferencesNode();
/* 17 */     String code = System.getProperty("ejt.forceLocale", (preferencesNode != null) ? preferencesNode.get("locale", null) : null);
/* 18 */     return (code == null || Boolean.getBoolean("ejt.forceAutoLocale")) ? SupportedLocale.AUTO_DETECT : SupportedLocale.getByCode(code);
/*    */   }
/*    */   
/*    */   public static void save(SupportedLocale supportedLocale) {
/* 22 */     Preferences node = getPreferencesNode();
/* 23 */     if (node != null) {
/* 24 */       node.put("locale", supportedLocale.getCode());
/*    */       try {
/* 26 */         node.flush();
/* 27 */       } catch (BackingStoreException e) {
/* 28 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static Preferences getPreferencesNode() {
/* 35 */     CommonApplicationServices applicationServices = CommonApplicationServices.getInstance();
/* 36 */     if (applicationServices != null) {
/* 37 */       return Preferences.userRoot().node(applicationServices.getPreferenceRootPath());
/*    */     }
/* 39 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\i18n\SupportedLocaleHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */