/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ class OpaqueContent
/*    */   implements Part {
/*    */   private ByteBuffer data;
/*    */   
/*    */   public OpaqueContent(int contentLength) {
/* 11 */     this.data = ByteBuffer.allocate(contentLength);
/*    */   }
/*    */ 
/*    */   
/*    */   public final void read(ByteBuffer buf, boolean bit64) throws IOException {
/* 16 */     this.data.order(buf.order());
/* 17 */     buf.get(this.data.array());
/* 18 */     readData(this.data, bit64);
/*    */   }
/*    */ 
/*    */   
/*    */   public final void write(ByteBuffer buf, boolean bit64) throws IOException {
/* 23 */     this.data.order(buf.order());
/* 24 */     writeData((ByteBuffer)this.data.position(0), bit64);
/* 25 */     buf.put((ByteBuffer)this.data.position(0));
/*    */   }
/*    */   
/*    */   protected void readData(ByteBuffer buf, boolean bit64) throws IOException {}
/*    */   
/*    */   protected void writeData(ByteBuffer buf, boolean bit64) throws IOException {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\OpaqueContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */