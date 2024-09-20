/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class UnixSpecialDirs
/*    */ {
/*    */   public static final String XDG_DESKTOP_DIR = "XDG_DESKTOP_DIR";
/*    */   public static final String XDG_DOCUMENTS_DIR = "XDG_DOCUMENTS_DIR";
/*    */   public static final String XDG_DOWNLOAD_DIR = "XDG_DOWNLOAD_DIR";
/*    */   private static Map<String, File> unixDirectories;
/*    */   
/*    */   public static synchronized File getDirectory(String id) {
/* 22 */     if (unixDirectories == null) {
/* 23 */       unixDirectories = new HashMap<>();
/*    */       try {
/* 25 */         File dirConfigFile = new File(Util.getUserHome(), ".config/user-dirs.dirs");
/* 26 */         if (dirConfigFile.isFile()) {
/* 27 */           BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(dirConfigFile), StandardCharsets.UTF_8));
/* 28 */           String line = reader.readLine();
/* 29 */           while (line != null) {
/* 30 */             line = line.trim();
/* 31 */             if (!line.startsWith("#")) {
/* 32 */               int equalPos = line.indexOf("=");
/* 33 */               if (equalPos > -1) {
/* 34 */                 String name = line.substring(0, equalPos);
/* 35 */                 String value = line.substring(equalPos + 1);
/* 36 */                 if (value.startsWith("\"")) {
/* 37 */                   value = value.substring(1);
/*    */                 }
/* 39 */                 if (value.endsWith("\"")) {
/* 40 */                   value = value.substring(0, value.length() - 1);
/*    */                 }
/* 42 */                 value = value.replaceAll("\\$HOME", Util.getUserHome());
/* 43 */                 unixDirectories.put(name, new File(value));
/*    */               } 
/*    */             } 
/* 46 */             line = reader.readLine();
/*    */           } 
/* 48 */           reader.close();
/*    */         } 
/* 50 */       } catch (Throwable t) {
/* 51 */         Logger.getInstance().log(t);
/*    */       } 
/*    */     } 
/*    */     
/* 55 */     return unixDirectories.get(id);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\UnixSpecialDirs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */