/*    */ package com.install4j.runtime.installer.helper.content.xz.rangecoder;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.content.xz.CorruptedInputException;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class RangeDecoderFromStream
/*    */   extends RangeDecoder
/*    */ {
/*    */   private final DataInputStream inData;
/*    */   
/*    */   public RangeDecoderFromStream(InputStream in) throws IOException {
/* 23 */     this.inData = new DataInputStream(in);
/*    */     
/* 25 */     if (this.inData.readUnsignedByte() != 0) {
/* 26 */       throw new CorruptedInputException();
/*    */     }
/* 28 */     this.code = this.inData.readInt();
/* 29 */     this.range = -1;
/*    */   }
/*    */   
/*    */   public boolean isFinished() {
/* 33 */     return (this.code == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void normalize() throws IOException {
/* 38 */     if ((this.range & 0xFF000000) == 0) {
/* 39 */       this.code = this.code << 8 | this.inData.readUnsignedByte();
/* 40 */       this.range <<= 8;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\rangecoder\RangeDecoderFromStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */