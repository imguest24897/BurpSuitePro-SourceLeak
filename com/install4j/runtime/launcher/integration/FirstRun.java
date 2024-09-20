/*    */ package com.install4j.runtime.launcher.integration;
/*    */ 
/*    */ import com.exe4j.runtime.util.FileUtil;
/*    */ import com.exe4j.runtime.util.ResourceHelper;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ import java.security.MessageDigest;
/*    */ import java.util.Objects;
/*    */ import java.util.prefs.BackingStoreException;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FirstRun
/*    */ {
/* 20 */   private static final boolean DEBUG = Boolean.getBoolean("install4j.debugFirstRun");
/*    */   
/*    */   private static final String FIRST_RUN_NODE_INTERNAL = "/com/install4j/firstrun/internal";
/*    */   
/*    */   private static final String FIRST_RUN_NODE_USER = "/com/install4j/firstrun/user";
/* 25 */   private static boolean[] firstRunCache = new boolean[2];
/*    */   
/*    */   public static synchronized boolean isFirstRun(boolean internal) {
/* 28 */     int cacheIndex = internal ? 0 : 1;
/* 29 */     if (firstRunCache[cacheIndex]) {
/* 30 */       return true;
/*    */     }
/*    */     
/* 33 */     File runtimeDir = ResourceHelper.getRuntimeDir();
/* 34 */     if (runtimeDir == null) {
/* 35 */       return false;
/*    */     }
/* 37 */     File uuidFile = new File(runtimeDir, "build.uuid");
/* 38 */     if (uuidFile.isFile()) {
/* 39 */       String uuid = readUUID(uuidFile);
/* 40 */       if (uuid != null) {
/*    */         try {
/* 42 */           String pathHash = encodeSha1(MessageDigest.getInstance("SHA-1").digest(FileUtil.getCanonicalPath(runtimeDir).getBytes(StandardCharsets.UTF_8)));
/*    */           
/* 44 */           InstallerUtil.disablePreferencesLogging();
/* 45 */           Preferences root = Preferences.userRoot();
/* 46 */           root.sync();
/* 47 */           Preferences firstRunNode = root.node(internal ? "/com/install4j/firstrun/internal" : "/com/install4j/firstrun/user");
/* 48 */           if (!Objects.equals(firstRunNode.get(pathHash, ""), uuid)) {
/* 49 */             firstRunNode.put(pathHash, uuid);
/* 50 */             root.flush();
/* 51 */             firstRunCache[cacheIndex] = true;
/* 52 */             return true;
/*    */           } 
/* 54 */         } catch (BackingStoreException|java.security.NoSuchAlgorithmException e) {
/* 55 */           if (DEBUG) {
/* 56 */             e.printStackTrace();
/*    */           }
/*    */         } 
/*    */       }
/*    */     } 
/* 61 */     return false;
/*    */   }
/*    */   
/*    */   private static String encodeSha1(byte[] digest) {
/* 65 */     StringBuilder builder = new StringBuilder();
/* 66 */     for (byte b : digest) {
/* 67 */       String str = Integer.toString(b & 0xFF, 16);
/* 68 */       if (str.length() == 1) {
/* 69 */         builder.append('0');
/*    */       }
/* 71 */       builder.append(str);
/*    */     } 
/*    */     
/* 74 */     return builder.toString();
/*    */   }
/*    */   
/*    */   private static String readUUID(File uuidFile) {
/*    */     try {
/* 79 */       BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(uuidFile), StandardCharsets.UTF_8)); 
/* 80 */       try { String str = reader.readLine();
/* 81 */         reader.close(); return str; } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 82 */     } catch (Throwable t) {
/* 83 */       if (DEBUG) {
/* 84 */         t.printStackTrace();
/*    */       }
/*    */       
/* 87 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\FirstRun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */