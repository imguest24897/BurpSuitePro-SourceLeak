/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*     */ import com.install4j.runtime.installer.platform.win32.Misc;
/*     */ import com.install4j.runtime.installer.platform.win32.ShellLink;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WinFileSystem
/*     */ {
/*     */   public static File getSpecialFolder(SpecialFolder folderType, boolean allUsers) {
/*  31 */     return FolderInfo.getSpecialFolder(folderType.getIntValue(), allUsers);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getProgramFilesDirectory() {
/*  40 */     return FolderInfo.getProgramFilesDirectory();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getCommonFilesDirectory() {
/*  49 */     return FolderInfo.getCommonFilesDirectory();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getProgramDataDirectory() {
/*  58 */     return FolderInfo.getProgramDataDirectory();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getWindowsDirectory() {
/*  67 */     return FolderInfo.getWindowsDirectory();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getSystemDirectory() {
/*  76 */     return FolderInfo.getSystemDirectory();
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
/*     */   public static boolean createShellLink(File file, File shortcutTo, File iconFile) {
/*  92 */     return createShellLink(file, shortcutTo, iconFile, null, null);
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
/*     */   public static boolean createShellLink(File file, File shortcutTo, File iconFile, String arguments) {
/* 108 */     return createShellLink(file, shortcutTo, iconFile, arguments, null);
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
/*     */   
/*     */   public static boolean createShellLink(File file, File shortcutTo, File iconFile, String arguments, String description) {
/* 125 */     return createShellLink(file, shortcutTo, iconFile, arguments, description, null);
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
/*     */ 
/*     */   
/*     */   public static boolean createShellLink(File file, File shortcutTo, File iconFile, String arguments, String description, File startIn) {
/* 143 */     return createShellLink(file, shortcutTo, iconFile, arguments, description, startIn, ShowCommand.NORMAL);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean createShellLink(File file, File shortcutTo, File iconFile, String arguments, String description, File startIn, ShowCommand showCommand) {
/* 162 */     return ShellLink.create(file, shortcutTo, iconFile, arguments, false, description, startIn, getShowCommandInt(showCommand));
/*     */   }
/*     */   
/*     */   private static int getShowCommandInt(ShowCommand showCommand) {
/* 166 */     if (showCommand != null) {
/* 167 */       switch (showCommand) {
/*     */         case MAXIMIZED:
/* 169 */           return 3;
/*     */         case MINIMIZED:
/* 171 */           return 7;
/*     */       } 
/*     */     }
/* 174 */     return 1;
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
/*     */   public static void createStartMenuEntry(String programGroupName, String entryName, File destination, boolean allUsers, File icon) throws IOException {
/* 190 */     createStartMenuEntry(programGroupName, entryName, destination, allUsers, icon, null);
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
/*     */   public static void createStartMenuEntry(String programGroupName, String entryName, File destination, boolean allUsers, File icon, String arguments) throws IOException {
/* 206 */     createStartMenuEntry(programGroupName, entryName, destination, allUsers, icon, arguments, false);
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static void createStartMenuEntry(String programGroupName, String entryName, File destination, boolean allUsers, File icon, String arguments, boolean runAsAdministrator) throws IOException {
/* 225 */     File groupDir = new File(FolderInfo.getSpecialFolder(3, allUsers), programGroupName);
/* 226 */     File menuFile = new File(groupDir, entryName);
/*     */     try {
/* 228 */       MenuHelper.installWindowsMenu(allUsers ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED, menuFile, destination, icon, arguments, runAsAdministrator, null);
/*     */     }
/* 230 */     catch (UserCanceledException e) {
/* 231 */       e.printStackTrace();
/* 232 */       throw new IOException(e.toString());
/*     */     } 
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
/*     */   public static boolean moveWithDelayUntilReboot(File source, File destination) {
/* 245 */     return Misc.moveWithDelayUntilReboot(source, destination);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DriveType getDriveType(File file) {
/* 255 */     if (Util.isWindows()) {
/* 256 */       String path = file.getAbsolutePath();
/* 257 */       if (path.length() >= 3 && !path.startsWith("\\")) {
/* 258 */         return DriveType.getFromIntValue(FolderInfo.getDriveType(path.substring(0, 3)));
/*     */       }
/*     */     } 
/* 261 */     return DriveType.UNKNOWN;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */