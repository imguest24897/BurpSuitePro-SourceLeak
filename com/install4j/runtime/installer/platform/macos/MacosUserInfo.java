/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import com.install4j.runtime.installer.platform.unix.UnixUserInfo;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ 
/*    */ public class MacosUserInfo
/*    */ {
/*    */   public static boolean isAdminUser() {
/*    */     try {
/* 12 */       if (UnixUserInfo.ROOT_USER) {
/* 13 */         return true;
/*    */       }
/*    */       
/* 16 */       Process process = Runtime.getRuntime().exec("groups");
/*    */ 
/*    */       
/* 19 */       BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
/*    */ 
/*    */       
/* 22 */       boolean containsAdmin = false;
/*    */       String line;
/* 24 */       while ((line = br.readLine()) != null) {
/* 25 */         if (line.contains("admin")) {
/* 26 */           containsAdmin = true;
/*    */         }
/*    */       } 
/* 29 */       return containsAdmin;
/* 30 */     } catch (IOException e) {
/* 31 */       e.printStackTrace();
/* 32 */       return true;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static final String SETUID_EXECUTABLE = "install4j";
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacosUserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */