/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import java.io.File;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FolderInfo
/*     */ {
/*     */   public static final int DRIVE_UNKNOWN = 0;
/*     */   public static final int DRIVE_NO_ROOT_DIR = 1;
/*     */   public static final int DRIVE_REMOVABLE = 2;
/*     */   public static final int DRIVE_FIXED = 3;
/*     */   public static final int DRIVE_REMOTE = 4;
/*     */   public static final int DRIVE_CDROM = 5;
/*     */   public static final int DRIVE_RAMDISK = 6;
/*     */   public static final int FOLDER_DESKTOP = 1;
/*     */   public static final int FOLDER_STARTMENU = 2;
/*     */   public static final int FOLDER_PROGRAMS = 3;
/*     */   public static final int FOLDER_STARTUP = 4;
/*     */   public static final int FOLDER_SENDTO = 5;
/*     */   public static final int FOLDER_FONTS = 6;
/*     */   public static final int FOLDER_APPDATA = 7;
/*     */   public static final int FOLDER_DOCS = 8;
/*     */   public static final int FOLDER_TEMPLATES = 9;
/*     */   public static final int FOLDER_FAVORITES = 10;
/*     */   public static final int FOLDER_LOCAL_APPDATA = 11;
/*     */   private static final int KNOWN_FOLDER = 1000;
/*     */   public static final int KNOWN_FOLDER_DOWNLOAD = 1001;
/*     */   public static final int KNOWN_FOLDER_USER_PROGRAM_FILES = 1002;
/*     */   public static final int KNOWN_FOLDER_USER_PROGRAM_FILES_COMMON = 1003;
/*     */   public static final int KNOWN_FOLDER_LOCAL_APP_DATA_LOW = 1004;
/*     */   private static final String PROGRAM_FILES_DIR_NAME = "ProgramFilesDir";
/*     */   private static final String COMMON_FILES_DIR_NAME = "CommonFilesDir";
/*     */   
/*     */   static {
/*  47 */     Common.init();
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
/*  58 */   private static Map<Integer, File> originalUserFolderCache = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*     */   public static int getDriveType(String rootPathName) {
/*  61 */     if (!Util.isWindows()) return 0;
/*     */     
/*  63 */     return getDriveType0(rootPathName);
/*     */   }
/*     */   
/*     */   public static String getShortPathName(String longPathName) {
/*  67 */     if (!Util.isWindows()) return longPathName;
/*     */     
/*  69 */     return getShortPathName0(longPathName);
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getUniversalPathName(String mappedPathName) {
/*  74 */     if (!Util.isWindows()) return mappedPathName;
/*     */     
/*  76 */     String ret = getUniversalPathName0(mappedPathName);
/*  77 */     if (ret.startsWith(";")) {
/*  78 */       if (Boolean.getBoolean("install4j.debugUNC")) {
/*  79 */         Logger.getInstance().info(null, mappedPathName + " could not be converted to universal: " + ret.substring(1));
/*     */       }
/*  81 */       return mappedPathName;
/*  82 */     }  if (ret == mappedPathName && 
/*  83 */       Boolean.getBoolean("install4j.debugUNC")) {
/*  84 */       Logger.getInstance().info(null, mappedPathName + " could not be converted to universal, function could not be loaded");
/*     */     }
/*     */     
/*  87 */     return ret;
/*     */   }
/*     */   
/*     */   public static File getSpecialFolder(final int folderType, boolean allUsers) {
/*  91 */     if (!Util.isWindows()) return null;
/*     */     
/*  93 */     if (!allUsers && HelperCommunication.getInstance().isElevatedHelper()) {
/*  94 */       File file = originalUserFolderCache.get(Integer.valueOf(folderType));
/*  95 */       if (file == null) {
/*  96 */         file = (File)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*     */             {
/*     */               protected File fetchValue(Context context) throws Exception {
/*  99 */                 return FolderInfo.getSpecialFolder(folderType, false);
/*     */               }
/*     */             });
/* 102 */         originalUserFolderCache.put(Integer.valueOf(folderType), file);
/*     */       } 
/* 104 */       if (file != null) {
/* 105 */         return file;
/*     */       }
/*     */     } 
/*     */     
/* 109 */     if (allUsers) {
/* 110 */       if (folderType == 1002)
/* 111 */         return getProgramFilesDirectory(); 
/* 112 */       if (folderType == 1003) {
/* 113 */         return getCommonFilesDirectory();
/*     */       }
/*     */     } 
/*     */     
/* 117 */     String fileName = getSpecialFolder0(folderType, allUsers);
/* 118 */     if (fileName == null) {
/* 119 */       allUsers = !allUsers;
/* 120 */       if (!Win32UserInfo.isAdminUser()) {
/* 121 */         allUsers = false;
/*     */       }
/* 123 */       fileName = getSpecialFolder0(folderType, allUsers);
/*     */     } 
/* 125 */     return (fileName == null) ? null : new File(fileName);
/*     */   }
/*     */   
/*     */   public static File getProgramFilesDirectory() {
/* 129 */     if (!Util.isWindows()) return null;
/*     */     
/* 131 */     return new File(getPathFromRegistry0("ProgramFilesDir"));
/*     */   }
/*     */   
/*     */   public static File getCommonFilesDirectory() {
/* 135 */     if (!Util.isWindows()) return null;
/*     */     
/* 137 */     return new File(getPathFromRegistry0("CommonFilesDir"));
/*     */   }
/*     */   
/*     */   public static File getWindowsDirectory() {
/* 141 */     if (!Util.isWindows()) return null;
/*     */     
/* 143 */     return new File(getWindowsDirectory0());
/*     */   }
/*     */   
/*     */   public static File getSystemDirectory() {
/* 147 */     if (!Util.isWindows()) return null;
/*     */     
/* 149 */     return new File(getSystemDirectory0());
/*     */   }
/*     */   
/*     */   public static File getProgramDataDirectory() {
/* 153 */     if (!Util.isWindows()) return null;
/*     */     
/* 155 */     return getSpecialFolder(7, true);
/*     */   }
/*     */   
/*     */   public static synchronized File getDownloadsDirectory() {
/* 159 */     if (!Util.isWindows()) return null;
/*     */     
/* 161 */     File dir = getSpecialFolder(1001, false);
/* 162 */     if (dir != null) {
/* 163 */       return dir;
/*     */     }
/* 165 */     File docsDir = getSpecialFolder(8, false);
/* 166 */     if (docsDir != null) {
/* 167 */       return docsDir;
/*     */     }
/* 169 */     return new File(System.getProperty("user.home"));
/*     */   }
/*     */   
/*     */   private static synchronized native String getSpecialFolder0(int paramInt, boolean paramBoolean);
/*     */   
/*     */   private static native String getPathFromRegistry0(String paramString);
/*     */   
/*     */   private static native String getWindowsDirectory0();
/*     */   
/*     */   private static native String getSystemDirectory0();
/*     */   
/*     */   private static native int getDriveType0(String paramString);
/*     */   
/*     */   private static native String getShortPathName0(String paramString);
/*     */   
/*     */   private static synchronized native String getUniversalPathName0(String paramString);
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\FolderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */