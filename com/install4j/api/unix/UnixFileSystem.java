/*     */ package com.install4j.api.unix;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.FileAttributesHelper;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import com.install4j.runtime.installer.platform.unix.LegacyUnixFileSystem;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.FileSystems;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.InvalidPathException;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.nio.file.attribute.GroupPrincipal;
/*     */ import java.nio.file.attribute.PosixFileAttributeView;
/*     */ import java.nio.file.attribute.PosixFileAttributes;
/*     */ import java.nio.file.attribute.PosixFilePermissions;
/*     */ import java.nio.file.attribute.UserPrincipal;
/*     */ import java.nio.file.attribute.UserPrincipalLookupService;
/*     */ 
/*     */ 
/*     */ public class UnixFileSystem
/*     */ {
/*     */   public static boolean setMode(int intMode, File destFile) {
/*  28 */     if (!Util.isWindows()) {
/*     */       try {
/*  30 */         setPosixFilePermissionsInternal(destFile, LegacyUnixFileSystem.toJavaTypeMode(intMode));
/*  31 */       } catch (Exception e) {
/*  32 */         return false;
/*     */       } 
/*     */     }
/*  35 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean setMode(String mode, File destFile) {
/*  45 */     if (!Util.isWindows()) {
/*     */       try {
/*  47 */         if (mode != null && mode.length() > 0) {
/*  48 */           setPosixFilePermissionsInternal(destFile, FileAttributesHelper.translateMode(mode, destFile));
/*     */         }
/*  50 */       } catch (Exception e) {
/*  51 */         Logger.getInstance().log(null, "set permissions: " + e, false);
/*  52 */         return false;
/*     */       } 
/*     */     }
/*  55 */     return true;
/*     */   }
/*     */   
/*     */   private static void setPosixFilePermissionsInternal(File file, String mode) throws IOException {
/*     */     try {
/*  60 */       Path path = file.toPath();
/*     */       try {
/*  62 */         Files.setPosixFilePermissions(path, PosixFilePermissions.fromString(mode));
/*  63 */       } catch (IOException e) {
/*  64 */         if (!Files.isSymbolicLink(path)) {
/*  65 */           throw e;
/*     */         }
/*     */       } 
/*  68 */     } catch (InvalidPathException e) {
/*  69 */       throw new IOException(e);
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
/*     */   public static boolean createLink(String destFileName, File linkFile) {
/*  81 */     if (!Util.isWindows()) {
/*  82 */       linkFile.delete();
/*     */       try {
/*  84 */         Files.createSymbolicLink(linkFile.toPath(), Paths.get(destFileName, new String[0]), (FileAttribute<?>[])new FileAttribute[0]);
/*  85 */         return true;
/*  86 */       } catch (Throwable e) {
/*  87 */         Logger.getInstance().log(null, "could not create symbolic link: " + e.getMessage(), false);
/*     */       } 
/*     */     } 
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean setOwner(String owner, File file) {
/*     */     try {
/*     */       String user;
/* 102 */       int colonPos = owner.indexOf(':');
/*     */       
/* 104 */       String group = "";
/* 105 */       if (colonPos > -1) {
/* 106 */         user = owner.substring(0, colonPos);
/* 107 */         group = owner.substring(colonPos + 1);
/*     */       } else {
/* 109 */         user = owner;
/*     */       } 
/* 111 */       PosixFileAttributeView posixFileAttributeView = Files.<PosixFileAttributeView>getFileAttributeView(file.toPath(), PosixFileAttributeView.class, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });
/*     */       
/* 113 */       UserPrincipalLookupService principalLookupService = FileSystems.getDefault().getUserPrincipalLookupService();
/* 114 */       if (user.length() > 0) {
/* 115 */         UserPrincipal userPrincipal = principalLookupService.lookupPrincipalByName(user);
/* 116 */         posixFileAttributeView.setOwner(userPrincipal);
/*     */       } 
/* 118 */       if (group.length() > 0) {
/* 119 */         GroupPrincipal groupPrincipal = principalLookupService.lookupPrincipalByGroupName(group);
/* 120 */         posixFileAttributeView.setGroup(groupPrincipal);
/*     */       } 
/* 122 */     } catch (Exception e) {
/* 123 */       Logger.getInstance().log(null, "set owner: " + e, false);
/* 124 */       return false;
/*     */     } 
/* 126 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FileInformation getFileInformation(File file) {
/*     */     try {
/* 136 */       PosixFileAttributes attributes = FileAttributesHelper.getFileAttributes(file);
/* 137 */       int mode = LegacyUnixFileSystem.fromJavaTypeMode(PosixFilePermissions.toString(attributes.permissions()));
/* 138 */       String ownerInfo = attributes.owner().getName() + ":" + attributes.group().getName();
/* 139 */       String linkTarget = null;
/* 140 */       if (attributes.isSymbolicLink()) {
/* 141 */         linkTarget = Files.readSymbolicLink(file.toPath()).toString();
/*     */       }
/* 143 */       return (FileInformation)new LegacyUnixFileSystem.FileInformationImpl(mode, ownerInfo, attributes.isSymbolicLink(), linkTarget);
/* 144 */     } catch (Exception e) {
/* 145 */       Logger.getInstance().log(e);
/* 146 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File findExecutableInPath(String executable) {
/* 156 */     StringBuffer output = new StringBuffer();
/*     */     try {
/* 158 */       if (!Execution.executeAndWait(new String[] { getShell(), "-c", "command -v " + executable }, output) || output.length() == 0) {
/* 159 */         return null;
/*     */       }
/* 161 */       return new File(toFirstNewLine(output.toString()));
/*     */     }
/* 163 */     catch (Exception e) {
/* 164 */       Logger.getInstance().log(e);
/* 165 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getShell() {
/* 175 */     String shell = System.getenv("SHELL");
/* 176 */     if (shell != null) {
/* 177 */       return shell;
/*     */     }
/* 179 */     return "/bin/sh";
/*     */   }
/*     */ 
/*     */   
/*     */   private static String toFirstNewLine(String pathname) {
/* 184 */     int newLineIndex = pathname.indexOf('\n');
/* 185 */     if (newLineIndex > -1) {
/* 186 */       return pathname.substring(0, newLineIndex);
/*     */     }
/* 188 */     return pathname;
/*     */   }
/*     */   
/*     */   public static interface FileInformation {
/*     */     int getMode();
/*     */     
/*     */     String getOwnerInfo();
/*     */     
/*     */     boolean isLink();
/*     */     
/*     */     String getLinkTarget();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\unix\UnixFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */