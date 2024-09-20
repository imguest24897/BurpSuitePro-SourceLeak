/*     */ package com.install4j.runtime.beans.actions.text;
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.runtime.beans.actions.files.AbstractModifyTextFileAction;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ public class ModifyTextFileAction extends AbstractModifyTextFileAction implements PropertyLoggingInterceptor {
/*  13 */   private String searchValue = "";
/*  14 */   private String replaceValue = "";
/*     */   private boolean logReplacement = true;
/*     */   
/*     */   protected boolean modifyFile(File file, Context context) throws IOException {
/*     */     byte[] searchValueBytes, replaceValueBytes;
/*  19 */     String encoding = getEncoding();
/*  20 */     String searchValue = getSearchValue();
/*  21 */     String replaceValue = maybeEscape(getReplaceValue(), false);
/*     */ 
/*     */ 
/*     */     
/*  25 */     if (encoding == null || encoding.trim().length() == 0) {
/*  26 */       searchValueBytes = searchValue.getBytes();
/*  27 */       replaceValueBytes = replaceValue.getBytes();
/*     */     } else {
/*     */       try {
/*  30 */         searchValueBytes = searchValue.getBytes(encoding);
/*  31 */         replaceValueBytes = replaceValue.getBytes(encoding);
/*  32 */       } catch (UnsupportedEncodingException e) {
/*  33 */         Logger.getInstance().log(e);
/*  34 */         searchValueBytes = searchValue.getBytes();
/*  35 */         replaceValueBytes = replaceValue.getBytes();
/*     */       } 
/*     */     } 
/*     */     
/*  39 */     File tempFile = File.createTempFile("j4j-mf", ".dat");
/*  40 */     InputStream in = new BufferedInputStream(new FileInputStream(file));
/*  41 */     OutputStream out = new BufferedOutputStream(new FileOutputStream(tempFile));
/*     */     
/*  43 */     byte[] searchBuffer = new byte[searchValueBytes.length];
/*     */ 
/*     */     
/*  46 */     int searchBufferPos = 0;
/*     */     
/*  48 */     int currentByte = in.read();
/*  49 */     boolean found = false;
/*  50 */     while (currentByte != -1) {
/*     */       
/*  52 */       if ((byte)currentByte == searchValueBytes[searchBufferPos]) {
/*  53 */         searchBuffer[searchBufferPos] = (byte)currentByte;
/*  54 */         searchBufferPos++;
/*     */         
/*  56 */         if (searchBufferPos == searchValueBytes.length) {
/*  57 */           searchBufferPos = 0;
/*  58 */           out.write(replaceValueBytes);
/*  59 */           found = true;
/*     */         } 
/*  61 */         currentByte = in.read(); continue;
/*     */       } 
/*  63 */       if (searchBufferPos > 0) {
/*  64 */         out.write(searchBuffer, 0, searchBufferPos);
/*  65 */         searchBufferPos = 0; continue;
/*     */       } 
/*  67 */       out.write(currentByte);
/*  68 */       currentByte = in.read();
/*     */     } 
/*     */ 
/*     */     
/*  72 */     if (searchBufferPos > 0) {
/*  73 */       out.write(searchBuffer, 0, searchBufferPos);
/*     */     }
/*     */     
/*  76 */     in.close();
/*  77 */     out.close();
/*     */     
/*  79 */     FileUtil.copyFile(tempFile, file);
/*  80 */     tempFile.delete();
/*     */     
/*  82 */     return handleFound(found);
/*     */   }
/*     */   
/*     */   public String getSearchValue() {
/*  86 */     return replaceVariables(replaceVariables(this.searchValue));
/*     */   }
/*     */   
/*     */   public void setSearchValue(String searchValue) {
/*  90 */     this.searchValue = searchValue;
/*     */   }
/*     */   
/*     */   public String getReplaceValue() {
/*  94 */     return replaceVariables(replaceVariables(this.replaceValue));
/*     */   }
/*     */   
/*     */   public void setReplaceValue(String replaceValue) {
/*  98 */     this.replaceValue = replaceValue;
/*     */   }
/*     */   
/*     */   public boolean isLogReplacement() {
/* 102 */     return replaceWithTextOverride("logReplacement", this.logReplacement);
/*     */   }
/*     */   
/*     */   public void setLogReplacement(boolean logReplacement) {
/* 106 */     this.logReplacement = logReplacement;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/* 111 */     return maybeFilterLogReplacement(propertyName, "replaceValue", propertyValue, isLogReplacement());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\ModifyTextFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */