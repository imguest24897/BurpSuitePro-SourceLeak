/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.nio.charset.Charset;
/*    */ import java.nio.charset.CharsetEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class PropertiesFileParameters {
/*    */   private PropertiesFileEncoding encoding;
/* 13 */   private LineSeparator detectedLineSeparator = null; private Charset charset;
/*    */   
/*    */   public PropertiesFileParameters(PropertiesFileEncoding encoding) {
/* 16 */     this(encoding, null);
/*    */   }
/*    */   
/*    */   public PropertiesFileParameters(PropertiesFileEncoding encoding, String charsetName) {
/* 20 */     this.encoding = encoding;
/*    */     
/* 22 */     charsetName = encoding.getCharsetName(charsetName);
/* 23 */     this.charset = Charset.forName(charsetName);
/*    */   }
/*    */   
/*    */   public Charset getCharset() {
/* 27 */     return this.charset;
/*    */   }
/*    */   
/*    */   public LineSeparator getDetectedLineSeparator() {
/* 31 */     return this.detectedLineSeparator;
/*    */   }
/*    */   
/*    */   public BufferedReader createReader(InputStream inputStream) throws UnsupportedEncodingException {
/* 35 */     return new BufferedReader(new InputStreamReader(inputStream, getCharset())
/*    */         {
/*    */           boolean r = false;
/*    */           
/*    */           public int read(@NotNull char[] buf, int offset, int length) throws IOException {
/* 40 */             int read = super.read(buf, offset, length);
/* 41 */             if (PropertiesFileParameters.this.detectedLineSeparator == null) {
/* 42 */               for (int i = 0; i < read; i++) {
/* 43 */                 char c = buf[offset + i];
/* 44 */                 if (c == '\r')
/* 45 */                 { this.r = true; }
/* 46 */                 else { if (c == '\n') {
/* 47 */                     if (this.r) {
/* 48 */                       PropertiesFileParameters.this.detectedLineSeparator = LineSeparator.WINDOWS; break;
/*    */                     } 
/* 50 */                     PropertiesFileParameters.this.detectedLineSeparator = LineSeparator.UNIX;
/*    */                     
/*    */                     break;
/*    */                   } 
/* 54 */                   this.r = false; }
/*    */               
/*    */               } 
/*    */             }
/* 58 */             return read;
/*    */           }
/*    */         });
/*    */   }
/*    */   
/*    */   public CharsetEncoder createEncoderForEscapingCheck() {
/* 64 */     if (this.encoding == PropertiesFileEncoding.JAVA_PROPERTIES) {
/* 65 */       return null;
/*    */     }
/* 67 */     return this.charset.newEncoder();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\PropertiesFileParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */