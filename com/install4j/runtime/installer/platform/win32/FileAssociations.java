/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.beans.actions.registry.DeleteRegistryItemAction;
/*     */ import com.install4j.runtime.beans.actions.registry.SetRegistryValueAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ 
/*     */ public class FileAssociations
/*     */ {
/*     */   private static final String FILE_EXTS_KEY = "Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\FileExts";
/*     */   private static final String USER_CHOICE_KEY = "UserChoice";
/*     */   private static final String PROGID = "Progid";
/*     */   private static final String ALTERNATIVE_HANDLER = "AlternativeHandler";
/*     */   private static final String CURRENT_USER_PREFIX = "SOFTWARE\\Classes\\";
/*     */   static final String SHELL_OPEN_COMMAND = "\\shell\\open\\command";
/*     */   
/*     */   public static List<SystemInstallOrUninstallAction> create(String extension, String description, File iconFile, File executable, String additionalParameters) throws UserCanceledException {
/*  31 */     RegistryRoot classesRoot = Util.hasFullAdminRights() ? RegistryRoot.HKEY_CLASSES_ROOT : RegistryRoot.HKEY_CURRENT_USER;
/*  32 */     String keyPrefix = getKeyPrefix(classesRoot);
/*     */     
/*  34 */     List<SystemInstallOrUninstallAction> ret = new ArrayList<>();
/*     */     
/*  36 */     ContextInt contextInt = ContextImpl.getSingleContextInt();
/*     */     
/*  38 */     String internalNameBase = executable.getName().substring(0, executable.getName().length() - 4);
/*  39 */     if (additionalParameters == null) {
/*  40 */       additionalParameters = "";
/*     */     }
/*  42 */     if (additionalParameters.length() > 0) {
/*  43 */       additionalParameters = additionalParameters + " ";
/*     */     }
/*  45 */     String executableValue = "\"" + executable.getAbsolutePath() + "\" " + additionalParameters + "\"%1\"";
/*     */     
/*  47 */     int index = 0;
/*  48 */     String internalName = internalNameBase;
/*  49 */     while (WinRegistry.keyExists(classesRoot, keyPrefix + internalName)) {
/*     */       
/*  51 */       String str = internalName + "\\shell\\open\\command";
/*     */       
/*  53 */       Object value = WinRegistry.getValue(classesRoot, keyPrefix + str, "");
/*  54 */       if (value instanceof String && Objects.equals(value, executableValue) && isEqualEntry(description, iconFile, classesRoot, keyPrefix + internalName)) {
/*     */         break;
/*     */       }
/*     */       
/*  58 */       index++;
/*  59 */       internalName = internalNameBase + " " + index;
/*     */     } 
/*     */     
/*  62 */     Logger.getInstance().info(null, "using internal name " + internalName);
/*     */     
/*  64 */     Object previousValue = WinRegistry.getValue(classesRoot, keyPrefix + extension, "");
/*  65 */     if (previousValue != null && !Objects.equals(previousValue.toString(), internalName) && 
/*  66 */       WinRegistry.getValue(classesRoot, keyPrefix + extension, "AlternativeHandler") == null) {
/*     */       
/*  68 */       SetRegistryValueAction action = new SetRegistryValueAction(classesRoot, keyPrefix + extension, "AlternativeHandler", previousValue, true);
/*     */       
/*  70 */       boolean bool = action.execute((Context)contextInt);
/*  71 */       Logger.getInstance().log(null, "setting alternative handler", bool);
/*  72 */       ret.add(action);
/*     */     } 
/*     */     
/*  75 */     SetRegistryValueAction setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyPrefix + extension, "", internalName, true);
/*     */     
/*  77 */     boolean success = setRegistryValueAction.execute((Context)contextInt);
/*  78 */     if (!success) {
/*  79 */       Logger.getInstance().error(null, "error setting internal name");
/*     */     }
/*  81 */     ret.add(setRegistryValueAction);
/*     */     
/*  83 */     setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyPrefix + internalName, "", description, true);
/*     */     
/*  85 */     success = setRegistryValueAction.execute((Context)contextInt);
/*  86 */     if (!success) {
/*  87 */       Logger.getInstance().error(null, "error adding internal name");
/*     */     }
/*  89 */     ret.add(setRegistryValueAction);
/*     */     
/*  91 */     if (iconFile != null) {
/*  92 */       String iconKeyName = internalName + "\\DefaultIcon";
/*     */ 
/*     */       
/*  95 */       setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyPrefix + iconKeyName, "", iconFile.getAbsolutePath(), true);
/*  96 */       setRegistryValueAction.execute((Context)contextInt);
/*  97 */       ret.add(setRegistryValueAction);
/*     */     } 
/*     */     
/* 100 */     String commandKeyName = internalName + "\\shell\\open\\command";
/*     */     
/* 102 */     setRegistryValueAction = new SetRegistryValueAction(classesRoot, keyPrefix + commandKeyName, "", executableValue, true);
/*     */     
/* 104 */     success = setRegistryValueAction.execute((Context)contextInt);
/* 105 */     if (!success) {
/* 106 */       Logger.getInstance().error(null, "error setting command key");
/*     */     }
/* 108 */     ret.add(setRegistryValueAction);
/*     */     
/* 110 */     if (WinRegistry.keyExists(RegistryRoot.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\FileExts")) {
/* 111 */       String keyName = "Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\FileExts\\" + extension;
/* 112 */       setRegistryValueAction = new SetRegistryValueAction(RegistryRoot.HKEY_CURRENT_USER, keyName, "Progid", internalName, true);
/*     */       
/* 114 */       setRegistryValueAction.execute((Context)contextInt);
/* 115 */       ret.add(setRegistryValueAction);
/* 116 */       keyName = keyName + "\\UserChoice";
/* 117 */       DeleteRegistryItemAction deleteRegistryItemAction = new DeleteRegistryItemAction(RegistryRoot.HKEY_CURRENT_USER, keyName, "", false);
/*     */       
/* 119 */       deleteRegistryItemAction.execute((Context)contextInt);
/* 120 */       ret.add(deleteRegistryItemAction);
/*     */     } 
/*     */     
/* 123 */     Registry.changeNotifyAssociations();
/*     */     
/* 125 */     return ret;
/*     */   }
/*     */   
/*     */   private static boolean isEqualEntry(String description, File iconFile, RegistryRoot classesRoot, String keyName) {
/* 129 */     Object value = WinRegistry.getValue(classesRoot, keyName + "\\DefaultIcon", "");
/* 130 */     if (iconFile == null) {
/* 131 */       if (value instanceof String) {
/* 132 */         return false;
/*     */       }
/* 134 */     } else if (!Objects.equals(iconFile.getAbsolutePath(), value)) {
/* 135 */       return false;
/*     */     } 
/*     */     
/* 138 */     value = WinRegistry.getValue(classesRoot, keyName, "");
/* 139 */     if (description == null) {
/* 140 */       if (value instanceof String) {
/* 141 */         return false;
/*     */       }
/* 143 */     } else if (!Objects.equals(description, value)) {
/* 144 */       return false;
/*     */     } 
/*     */     
/* 147 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean exists(String extension, RegistryRoot registryRoot) {
/* 151 */     if (registryRoot == RegistryRoot.HKEY_CLASSES_ROOT) {
/* 152 */       return WinRegistry.keyExists(RegistryRoot.HKEY_CLASSES_ROOT, extension);
/*     */     }
/* 154 */     return WinRegistry.keyExists(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\Classes\\" + extension);
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getExecutable(String extension, RegistryRoot registryRoot) {
/* 159 */     if (exists(extension, registryRoot)) {
/* 160 */       return getExecutableInt(extension, registryRoot, getKeyPrefix(registryRoot));
/*     */     }
/* 162 */     return null;
/*     */   }
/*     */   
/*     */   static String getKeyPrefix(RegistryRoot registryRoot) {
/* 166 */     return (registryRoot == RegistryRoot.HKEY_CURRENT_USER) ? "SOFTWARE\\Classes\\" : "";
/*     */   }
/*     */   
/*     */   private static String getExecutableInt(String extension, RegistryRoot classesRoot, String keyPrefix) {
/* 170 */     Object internalName = WinRegistry.getValue(classesRoot, keyPrefix + extension, "");
/*     */     
/* 172 */     String commandKeyName = internalName + "\\shell\\open\\command";
/*     */     
/* 174 */     if (internalName != null && WinRegistry.keyExists(classesRoot, keyPrefix + commandKeyName)) {
/* 175 */       Object command = WinRegistry.getValue(classesRoot, keyPrefix + commandKeyName, "");
/* 176 */       if (command != null) {
/* 177 */         StringTokenizer tok = new StringTokenizer(command.toString(), "\"");
/* 178 */         if (tok.hasMoreTokens()) {
/* 179 */           return tok.nextToken();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 184 */     return null;
/*     */   }
/*     */   
/*     */   public static void remove(String extension, RegistryRoot classesRoot, boolean completely) throws UserCanceledException {
/*     */     try {
/* 189 */       String keyPrefix = getKeyPrefix(classesRoot);
/* 190 */       String extensionKeyName = keyPrefix + extension;
/*     */       
/* 192 */       ContextInt contextInt = ContextImpl.getSingleContextInt();
/*     */       
/* 194 */       String internalName = (String)WinRegistry.getValue(classesRoot, extensionKeyName, "");
/*     */       
/* 196 */       String previousInternalName = (String)WinRegistry.getValue(classesRoot, extensionKeyName, "AlternativeHandler");
/* 197 */       if (previousInternalName == null) {
/* 198 */         WinRegistry.deleteValue(classesRoot, extensionKeyName, "");
/*     */       } else {
/* 200 */         WinRegistry.setValue(classesRoot, extensionKeyName, "", previousInternalName);
/*     */       } 
/*     */       
/* 203 */       if (completely && internalName != null && internalName.trim().length() > 0) {
/* 204 */         DeleteRegistryItemAction deleteAction = new DeleteRegistryItemAction(classesRoot, keyPrefix + internalName, "", false);
/* 205 */         deleteAction.execute((Context)contextInt);
/*     */         
/* 207 */         if (WinRegistry.getValue(classesRoot, extensionKeyName, "AlternativeHandler") != null) {
/* 208 */           deleteAction = new DeleteRegistryItemAction(classesRoot, extensionKeyName, "AlternativeHandler", false);
/* 209 */           deleteAction.execute((Context)contextInt);
/*     */         } 
/*     */         
/* 212 */         if (previousInternalName == null) {
/* 213 */           WinRegistry.deleteKey(classesRoot, extensionKeyName, true);
/*     */         }
/*     */         
/* 216 */         Object userAssoc = WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\FileExts\\" + extension, "Progid");
/* 217 */         if (userAssoc instanceof String && Objects.equals(userAssoc, internalName)) {
/* 218 */           deleteAction = new DeleteRegistryItemAction(RegistryRoot.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\FileExts\\" + extension, "Progid", true);
/* 219 */           deleteAction.execute((Context)contextInt);
/*     */         } 
/*     */       } 
/*     */       
/* 223 */       Registry.changeNotifyAssociations();
/* 224 */     } catch (ClassCastException e) {
/* 225 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\FileAssociations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */