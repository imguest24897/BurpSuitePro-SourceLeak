/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.Charset;
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
/*     */ 
/*     */ 
/*     */ public class IOUtils
/*     */ {
/*     */   public static String readInputStreamToString(InputStream stream) throws IOException {
/*  47 */     return readInputStreamToString(stream, StandardCharset.UTF_8);
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
/*     */   public static String readInputStreamToString(InputStream stream, Charset charset) throws IOException {
/*  64 */     int bufferSize = 1024;
/*  65 */     char[] buffer = new char[1024];
/*  66 */     StringBuilder out = new StringBuilder();
/*     */     
/*  68 */     Reader in = new InputStreamReader(stream, charset); try {
/*     */       while (true) {
/*  70 */         int rsz = in.read(buffer, 0, buffer.length);
/*  71 */         if (rsz < 0)
/*     */           break; 
/*  73 */         out.append(buffer, 0, rsz);
/*     */       } 
/*  75 */       String str = out.toString();
/*  76 */       in.close();
/*     */       return str;
/*     */     } catch (Throwable throwable) {
/*     */       try {
/*     */         in.close();
/*     */       } catch (Throwable throwable1) {
/*     */         throwable.addSuppressed(throwable1);
/*     */       } 
/*     */       throw throwable;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String readFileToString(File file) throws IOException {
/*  93 */     return readInputStreamToString(new FileInputStream(file));
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
/*     */   public static String readFileToString(File file, Charset charset) throws IOException {
/* 110 */     return readInputStreamToString(new FileInputStream(file), charset);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\IOUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */