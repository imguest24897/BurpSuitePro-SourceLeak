/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.ejt.internal.util.JavaVersionUtil;
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ public class Unpacker
/*    */ {
/*    */   private static boolean isPacked(File tempFile) {
/*    */     try {
/* 15 */       DataInputStream in = new DataInputStream(new FileInputStream(tempFile));
/* 16 */       int firstInt = in.readInt();
/* 17 */       in.close();
/* 18 */       return (firstInt == -889270259);
/* 19 */     } catch (IOException e) {
/* 20 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static boolean unpack(File tempFile, File destFile, ProgressAdapter progressAdapter) throws IOException {
/* 25 */     if (!isPacked(tempFile)) {
/* 26 */       return false;
/*    */     }
/* 28 */     if (JavaVersionUtil.JAVA_MAJOR_VERSION >= 14) {
/* 29 */       Logger.getInstance().error(null, "Cannot not unpack " + destFile + " on Java " + JavaVersionUtil.JAVA_MAJOR_VERSION);
/* 30 */       return false;
/*    */     } 
/* 32 */     return UnpackerImpl.unpack(tempFile, destFile, progressAdapter);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\Unpacker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */