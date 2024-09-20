/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Registry
/*     */ {
/*     */   public static final int HKEY_CLASSES_ROOT = 1;
/*     */   public static final int HKEY_CURRENT_USER = 2;
/*     */   public static final int HKEY_LOCAL_MACHINE = 3;
/*     */   public static final int HKEY_USERS = 4;
/*     */   public static final int HKEY_CURRENT_CONFIG = 5;
/*     */   private static final int TYPE_STRING = 1;
/*     */   private static final int TYPE_INTEGER = 2;
/*     */   private static final int TYPE_STRING_ARRAY = 3;
/*     */   private static final int TYPE_BYTE_ARRAY = 4;
/*     */   private static final int TYPE_EXPAND_STRING = 5;
/*     */   private static final int TYPE_QWORD = 6;
/*     */   public static final int WOW64_DEFAULT = 0;
/*     */   public static final int WOW64_32KEY = 512;
/*     */   public static final int WOW64_64KEY = 256;
/*     */   
/*     */   static {
/*  25 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean saveKey(int root, String keyName, String fileName, int view) {
/*  41 */     if (!LauncherUtil.isWindows()) {
/*  42 */       return false;
/*     */     }
/*  44 */     return saveKey0(root, keyName, fileName, view);
/*     */   }
/*     */   
/*     */   public static boolean restoreKey(int root, String keyName, String fileName, int view) {
/*  48 */     if (!LauncherUtil.isWindows()) {
/*  49 */       return false;
/*     */     }
/*  51 */     return restoreKey0(root, keyName, fileName, view);
/*     */   }
/*     */   
/*     */   public static String[] enumSubKeys(int root, String keyName, int view) {
/*  55 */     if (!LauncherUtil.isWindows()) {
/*  56 */       return null;
/*     */     }
/*  58 */     return enumSubKeys0(root, keyName, view);
/*     */   }
/*     */   
/*     */   public static String[] enumValues(int root, String keyName, int view) {
/*  62 */     if (!LauncherUtil.isWindows()) {
/*  63 */       return null;
/*     */     }
/*  65 */     return enumValues0(root, keyName, view);
/*     */   }
/*     */   
/*     */   public static boolean keyExists(int root, String keyName, int view) {
/*  69 */     if (!LauncherUtil.isWindows()) {
/*  70 */       return false;
/*     */     }
/*  72 */     return keyExists0(root, keyName, view);
/*     */   }
/*     */   
/*     */   public static boolean createKey(int root, String keyName, int view) {
/*  76 */     if (!LauncherUtil.isWindows()) {
/*  77 */       return false;
/*     */     }
/*  79 */     return createKey0(root, keyName, view);
/*     */   }
/*     */   
/*     */   public static Object getValue(int root, String keyName, String valueName, int view) {
/*  83 */     if (!LauncherUtil.isWindows()) {
/*  84 */       return null;
/*     */     }
/*  86 */     return getValue0(root, keyName, valueName, view);
/*     */   }
/*     */   public static boolean setValue(int root, String keyName, String valueName, Object value, int view) {
/*     */     int objectType;
/*  90 */     if (!LauncherUtil.isWindows()) {
/*  91 */       return false;
/*     */     }
/*     */     
/*  94 */     if (value instanceof String) {
/*  95 */       objectType = 1;
/*  96 */     } else if (value instanceof Integer) {
/*  97 */       objectType = 2;
/*  98 */     } else if (value instanceof Long) {
/*  99 */       objectType = 6;
/* 100 */     } else if (value instanceof String[]) {
/* 101 */       objectType = 3;
/* 102 */     } else if (value instanceof byte[]) {
/* 103 */       objectType = 4;
/* 104 */     } else if (value instanceof ExpandStringImpl) {
/* 105 */       objectType = 5;
/* 106 */       value = ((ExpandStringImpl)value).value;
/*     */     } else {
/* 108 */       return false;
/*     */     } 
/*     */     
/* 111 */     return setValue0(root, keyName, valueName, value, objectType, view);
/*     */   }
/*     */   
/*     */   public static void deleteValue(int root, String keyName, String valueName, int view) {
/* 115 */     if (!LauncherUtil.isWindows()) {
/*     */       return;
/*     */     }
/* 118 */     deleteValue0(root, keyName, valueName, view);
/*     */   }
/*     */   
/*     */   public static void deleteKey(int root, String keyName, boolean onlyIfEmpty, int view) {
/* 122 */     if (!LauncherUtil.isWindows()) {
/*     */       return;
/*     */     }
/* 125 */     deleteKey0(root, keyName, onlyIfEmpty, view);
/*     */   } private static native boolean keyExists0(int paramInt1, String paramString, int paramInt2); private static native boolean createKey0(int paramInt1, String paramString, int paramInt2); private static native Object getValue0(int paramInt1, String paramString1, String paramString2, int paramInt2); private static native boolean setValue0(int paramInt1, String paramString1, String paramString2, Object paramObject, int paramInt2, int paramInt3); private static native void deleteValue0(int paramInt1, String paramString1, String paramString2, int paramInt2);
/*     */   private static native void deleteKey0(int paramInt1, String paramString, boolean paramBoolean, int paramInt2);
/*     */   public static void changeNotifyAssociations() {
/* 129 */     if (!LauncherUtil.isWindows()) {
/*     */       return;
/*     */     }
/* 132 */     changeNotifyAssociations0();
/*     */   } private static native boolean saveKey0(int paramInt1, String paramString1, String paramString2, int paramInt2);
/*     */   private static native boolean restoreKey0(int paramInt1, String paramString1, String paramString2, int paramInt2);
/*     */   private static native String[] enumSubKeys0(int paramInt1, String paramString, int paramInt2);
/*     */   private static native String[] enumValues0(int paramInt1, String paramString, int paramInt2);
/*     */   private static native void changeNotifyAssociations0();
/*     */   public static class ExpandStringImpl { public ExpandStringImpl(String value) {
/* 139 */       this.value = value;
/*     */     }
/*     */     
/*     */     private final String value; }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Registry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */