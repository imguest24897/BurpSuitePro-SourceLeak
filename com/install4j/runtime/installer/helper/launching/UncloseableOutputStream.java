/*   */ package com.install4j.runtime.installer.helper.launching;
/*   */ 
/*   */ import java.io.FilterOutputStream;
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ 
/*   */ public class UncloseableOutputStream extends FilterOutputStream {
/*   */   public UncloseableOutputStream(OutputStream out) {
/* 9 */     super(out);
/*   */   }
/*   */   
/*   */   public void close() throws IOException {}
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\UncloseableOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */