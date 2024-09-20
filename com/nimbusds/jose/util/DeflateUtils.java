/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.zip.Deflater;
/*     */ import java.util.zip.DeflaterOutputStream;
/*     */ import java.util.zip.Inflater;
/*     */ import java.util.zip.InflaterInputStream;
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
/*     */ public class DeflateUtils
/*     */ {
/*     */   private static final boolean NOWRAP = true;
/*     */   
/*     */   public static byte[] compress(byte[] bytes) throws IOException {
/*  60 */     ByteArrayOutputStream out = new ByteArrayOutputStream();
/*     */ 
/*     */     
/*  63 */     Deflater deflater = null;
/*  64 */     DeflaterOutputStream def = null;
/*     */     try {
/*  66 */       deflater = new Deflater(8, true);
/*  67 */       def = new DeflaterOutputStream(out, deflater);
/*  68 */       def.write(bytes);
/*     */     } finally {
/*  70 */       if (def != null) {
/*  71 */         def.close();
/*     */       }
/*  73 */       if (deflater != null) {
/*  74 */         deflater.end();
/*     */       }
/*     */     } 
/*     */     
/*  78 */     return out.toByteArray();
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
/*     */   public static byte[] decompress(byte[] bytes) throws IOException {
/*  95 */     Inflater inflater = null;
/*  96 */     InflaterInputStream inf = null;
/*     */     try {
/*  98 */       inflater = new Inflater(true);
/*  99 */       inf = new InflaterInputStream(new ByteArrayInputStream(bytes), inflater);
/*     */       
/* 101 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/*     */ 
/*     */       
/* 104 */       byte[] buf = new byte[1024];
/*     */       
/*     */       int len;
/*     */       
/* 108 */       while ((len = inf.read(buf)) > 0)
/*     */       {
/* 110 */         out.write(buf, 0, len);
/*     */       }
/*     */       
/* 113 */       return out.toByteArray();
/*     */     } finally {
/* 115 */       if (inf != null) {
/* 116 */         inf.close();
/*     */       }
/* 118 */       if (inflater != null)
/* 119 */         inflater.end(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\DeflateUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */