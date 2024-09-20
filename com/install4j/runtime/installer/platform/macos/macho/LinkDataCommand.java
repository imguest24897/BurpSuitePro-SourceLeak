/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public class LinkDataCommand
/*    */   extends OpaqueContent
/*    */ {
/*    */   public static final int COMMAND_SIZE = 16;
/*    */   private int offset;
/*    */   private int size;
/*    */   
/*    */   public LinkDataCommand(int offset, int size) {
/* 14 */     super(LoadCommand.getContentLength(16));
/* 15 */     this.offset = offset;
/* 16 */     this.size = size;
/*    */   }
/*    */   
/*    */   public LinkDataCommand(int contentLength) {
/* 20 */     super(contentLength);
/*    */   }
/*    */ 
/*    */   
/*    */   public void readData(ByteBuffer buf, boolean bit64) throws IOException {
/* 25 */     this.offset = buf.getInt();
/* 26 */     this.size = buf.getInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void writeData(ByteBuffer buf, boolean bit64) throws IOException {
/* 31 */     buf.putInt(this.offset);
/* 32 */     buf.putInt(this.size);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getOffset() {
/* 37 */     return this.offset;
/*    */   }
/*    */   
/*    */   public int getSize() {
/* 41 */     return this.size;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     return "LinkDataCommand{offset=" + this.offset + ", size=" + this.size + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\LinkDataCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */