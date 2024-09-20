/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.windows.RegistryRoot;
/*    */ import com.install4j.api.windows.WinRegistry;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.beans.actions.registry.DeleteRegistryItemAction;
/*    */ import com.install4j.runtime.beans.actions.registry.SetRegistryValueAction;
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.ContextInt;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Win32UrlHandler
/*    */ {
/*    */   public static Collection<SystemInstallOrUninstallAction> create(String scheme, File executable) throws UserCanceledException {
/* 25 */     List<SystemInstallOrUninstallAction> ret = new ArrayList<>();
/*    */     
/* 27 */     if (isInvalidScheme(scheme)) {
/* 28 */       Logger.getInstance().error(null, "invalid scheme: '" + scheme + "'");
/* 29 */       return ret;
/*    */     } 
/*    */     
/* 32 */     RegistryRoot classesRoot = Util.hasFullAdminRights() ? RegistryRoot.HKEY_CLASSES_ROOT : RegistryRoot.HKEY_CURRENT_USER;
/* 33 */     String keyPrefix = FileAssociations.getKeyPrefix(classesRoot);
/*    */     
/* 35 */     ContextInt contextInt = ContextImpl.getSingleContextInt();
/*    */     
/* 37 */     String keyName = keyPrefix + scheme;
/* 38 */     if (WinRegistry.keyExists(classesRoot, keyName)) {
/* 39 */       DeleteRegistryItemAction deleteRegistryItemAction = new DeleteRegistryItemAction(classesRoot, keyName, "", false);
/* 40 */       deleteRegistryItemAction.execute((Context)contextInt);
/* 41 */       ret.add(deleteRegistryItemAction);
/*    */     } 
/*    */     
/* 44 */     SetRegistryValueAction setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyName, "", "URL:" + scheme + " protocol", true);
/* 45 */     boolean success = setRegistryValueAction.execute((Context)contextInt);
/* 46 */     if (!success) {
/* 47 */       Logger.getInstance().error(null, "error setting scheme name");
/*    */     }
/* 49 */     ret.add(setRegistryValueAction);
/*    */     
/* 51 */     setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyName, "URL Protocol", "", true);
/* 52 */     success = setRegistryValueAction.execute((Context)contextInt);
/* 53 */     if (!success) {
/* 54 */       Logger.getInstance().error(null, "error setting url protocol");
/*    */     }
/* 56 */     ret.add(setRegistryValueAction);
/*    */ 
/*    */     
/* 59 */     String executableValue = "\"" + executable.getAbsolutePath() + "\" \"%1\"";
/*    */     
/* 61 */     setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyName + "\\shell\\open\\command", "", executableValue, true);
/* 62 */     success = setRegistryValueAction.execute((Context)contextInt);
/* 63 */     if (!success) {
/* 64 */       Logger.getInstance().error(null, "error setting command key");
/*    */     }
/* 66 */     ret.add(setRegistryValueAction);
/*    */     
/* 68 */     return ret;
/*    */   }
/*    */   
/*    */   private static boolean isInvalidScheme(String scheme) {
/* 72 */     return (scheme == null || scheme.trim().isEmpty() || scheme.contains(" "));
/*    */   }
/*    */   
/*    */   public static String getExecutable(String scheme, RegistryRoot registryRoot) {
/* 76 */     if (FileAssociations.exists(scheme, registryRoot)) {
/* 77 */       return getExecutableInt(scheme, registryRoot, FileAssociations.getKeyPrefix(registryRoot));
/*    */     }
/* 79 */     return null;
/*    */   }
/*    */   
/*    */   private static String getExecutableInt(String scheme, RegistryRoot classesRoot, String keyPrefix) {
/* 83 */     Object command = WinRegistry.getValue(classesRoot, keyPrefix + scheme + "\\shell\\open\\command", "");
/* 84 */     if (command != null) {
/* 85 */       StringTokenizer tok = new StringTokenizer(command.toString(), "\"");
/* 86 */       if (tok.hasMoreTokens()) {
/* 87 */         return tok.nextToken();
/*    */       }
/*    */     } 
/* 90 */     return null;
/*    */   }
/*    */   
/*    */   public static void remove(String scheme, RegistryRoot root) {
/* 94 */     String keyName = FileAssociations.getKeyPrefix(root) + scheme;
/* 95 */     if (WinRegistry.keyExists(root, keyName))
/* 96 */       WinRegistry.deleteKey(root, keyName, false); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32UrlHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */