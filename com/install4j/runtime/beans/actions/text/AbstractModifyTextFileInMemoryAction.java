/*    */ package com.install4j.runtime.beans.actions.text;
/*    */ import com.install4j.runtime.beans.actions.files.AbstractModifyTextFileAction;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.OutputStreamWriter;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.io.Writer;
/*    */ 
/*    */ public abstract class AbstractModifyTextFileInMemoryAction extends AbstractModifyTextFileAction {
/*    */   protected boolean modifyFile(File file, Context context) throws IOException {
/*    */     String origin;
/*    */     Writer writer;
/* 16 */     if (file.length() > 104857600L) {
/* 17 */       Logger.getInstance().error(this, "file is to large");
/* 18 */       return false;
/*    */     } 
/*    */     
/* 21 */     DataInputStream in = new DataInputStream(new FileInputStream(file));
/*    */     
/* 23 */     byte[] bytes = new byte[(int)file.length()];
/* 24 */     in.readFully(bytes);
/* 25 */     in.close();
/*    */     
/* 27 */     String encoding = getEncoding();
/*    */     
/* 29 */     if (encoding != null && encoding.trim().length() > 0) {
/*    */       try {
/* 31 */         origin = new String(bytes, encoding);
/* 32 */       } catch (UnsupportedEncodingException e) {
/* 33 */         Logger.getInstance().log(e);
/* 34 */         origin = new String(bytes);
/*    */       } 
/*    */     } else {
/* 37 */       origin = new String(bytes);
/*    */     } 
/*    */     
/* 40 */     bytes = null;
/*    */     
/* 42 */     String result = modifyText(origin, file);
/*    */ 
/*    */     
/* 45 */     if (encoding != null && encoding.trim().length() > 0) {
/*    */       try {
/* 47 */         writer = new OutputStreamWriter(new FileOutputStream(file), encoding);
/* 48 */       } catch (UnsupportedEncodingException e) {
/* 49 */         Logger.getInstance().log(e);
/* 50 */         writer = new OutputStreamWriter(new FileOutputStream(file));
/*    */       } 
/*    */     } else {
/* 53 */       writer = new OutputStreamWriter(new FileOutputStream(file));
/*    */     } 
/*    */     
/* 56 */     writer.write(result);
/* 57 */     writer.close();
/*    */     
/* 59 */     return handleFound(!Objects.equals(result, origin));
/*    */   }
/*    */   
/*    */   protected abstract String modifyText(String paramString, File paramFile);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\AbstractModifyTextFileInMemoryAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */