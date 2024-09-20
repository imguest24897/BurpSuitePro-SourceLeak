/*   */ package com.install4j.runtime.installer.helper.launching;
/*   */ 
/*   */ import java.io.FilterInputStream;
/*   */ import java.io.IOException;
/*   */ import java.io.InputStream;
/*   */ 
/*   */ public class UncloseableInputStream extends FilterInputStream {
/*   */   public UncloseableInputStream(InputStream in) {
/* 9 */     super(in);
/*   */   }
/*   */   
/*   */   public void close() throws IOException {}
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\UncloseableInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */