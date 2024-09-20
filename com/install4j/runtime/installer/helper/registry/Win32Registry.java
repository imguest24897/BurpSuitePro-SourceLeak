/*    */ package com.install4j.runtime.installer.helper.registry;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.windows.RegistryRoot;
/*    */ import com.install4j.api.windows.RegistryView;
/*    */ import com.install4j.api.windows.WinRegistry;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ 
/*    */ public class Win32Registry
/*    */   implements RegistryInterface {
/*    */   private static final String REGKEY_INSTALLATIONS = "SOFTWARE\\ej-technologies\\install4j\\installations";
/*    */   
/*    */   public void setValue(String name, String val) {
/* 14 */     WinRegistry.createKey(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\install4j\\installations");
/* 15 */     WinRegistry.setValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\install4j\\installations", name, val);
/* 16 */     WinRegistry.createKey(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\install4j\\installations");
/* 17 */     WinRegistry.setValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\install4j\\installations", name, val);
/*    */   }
/*    */ 
/*    */   
/*    */   public void deleteValue(String valueName) {
/* 22 */     WinRegistry.deleteValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\install4j\\installations", valueName);
/* 23 */     WinRegistry.deleteValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\install4j\\installations", valueName);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getValue(String valueName) {
/* 28 */     Object ret = WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\install4j\\installations", valueName);
/* 29 */     if (ret instanceof String) {
/* 30 */       return (String)ret;
/*    */     }
/*    */     
/* 33 */     ret = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\install4j\\installations", valueName);
/* 34 */     if (ret instanceof String) {
/* 35 */       return (String)ret;
/*    */     }
/* 37 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOtherBitnessValue(String valueName) {
/* 42 */     if (Util.is64BitWindows()) {
/* 43 */       RegistryView otherView = InstallerUtil.is32BitJVM() ? RegistryView.BIT64 : RegistryView.BIT32;
/*    */ 
/*    */       
/* 46 */       Object ret = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\install4j\\installations", valueName, otherView);
/* 47 */       if (ret instanceof String) {
/* 48 */         return (String)ret;
/*    */       }
/*    */     } 
/* 51 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\registry\Win32Registry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */