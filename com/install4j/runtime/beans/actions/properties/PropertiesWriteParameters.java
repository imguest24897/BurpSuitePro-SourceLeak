/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import java.io.OutputStreamWriter;
/*    */ import java.io.Writer;
/*    */ 
/*    */ public class PropertiesWriteParameters extends PropertiesFileParameters {
/*    */   public PropertiesWriteParameters(PropertiesFileEncoding encoding) {
/* 10 */     this(encoding, null, LineSeparator.SYSTEM);
/*    */   }
/*    */   private LineSeparator lineSeparator;
/*    */   public PropertiesWriteParameters(PropertiesFileEncoding encoding, LineSeparator lineSeparator) {
/* 14 */     this(encoding, null, lineSeparator);
/*    */   }
/*    */   
/*    */   public PropertiesWriteParameters(PropertiesFileEncoding encoding, String explicitEncoding, LineSeparator lineSeparator) {
/* 18 */     super(encoding, explicitEncoding);
/* 19 */     this.lineSeparator = lineSeparator;
/*    */   }
/*    */   
/*    */   public BufferedWriter createWriter(OutputStream outputStream) throws UnsupportedEncodingException {
/* 23 */     return new BufferedWriter(new OutputStreamWriter(outputStream, getCharset()))
/*    */       {
/*    */         public void newLine() throws IOException {
/* 26 */           write(PropertiesWriteParameters.this.lineSeparator.getSeparator());
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\PropertiesWriteParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */