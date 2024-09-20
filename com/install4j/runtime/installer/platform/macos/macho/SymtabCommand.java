/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public class SymtabCommand
/*    */   extends OpaqueContent
/*    */ {
/*    */   public static final int COMMAND_SIZE = 24;
/*    */   private int symoff;
/*    */   private int nsyms;
/*    */   private int stroff;
/*    */   private int strsize;
/*    */   
/*    */   public SymtabCommand(int contentLength) {
/* 16 */     super(contentLength);
/*    */   }
/*    */ 
/*    */   
/*    */   public void readData(ByteBuffer buf, boolean bit64) throws IOException {
/* 21 */     this.symoff = buf.getInt();
/* 22 */     this.nsyms = buf.getInt();
/* 23 */     this.stroff = buf.getInt();
/* 24 */     this.strsize = buf.getInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void writeData(ByteBuffer buf, boolean bit64) throws IOException {
/* 29 */     buf.putInt(this.symoff);
/* 30 */     buf.putInt(this.nsyms);
/* 31 */     buf.putInt(this.stroff);
/* 32 */     buf.putInt(this.strsize);
/*    */   }
/*    */   
/*    */   public int getSymoff() {
/* 36 */     return this.symoff;
/*    */   }
/*    */   
/*    */   public int getNsyms() {
/* 40 */     return this.nsyms;
/*    */   }
/*    */   
/*    */   public int getStroff() {
/* 44 */     return this.stroff;
/*    */   }
/*    */   
/*    */   public int getStrsize() {
/* 48 */     return this.strsize;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return "SymtabCommand{symoff=" + this.symoff + ", nsyms=" + this.nsyms + ", stroff=" + this.stroff + ", strsize=" + this.strsize + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\SymtabCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */