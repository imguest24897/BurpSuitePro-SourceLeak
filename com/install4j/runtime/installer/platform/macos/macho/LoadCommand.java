/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LoadCommand
/*    */ {
/*    */   public static final int LC_REQ_DYLD = -2147483648;
/*    */   public static final int LC_SEGMENT = 1;
/*    */   public static final int LC_SYMTAB = 2;
/*    */   public static final int LC_DYSYMTAB = 11;
/*    */   public static final int LC_LOAD_DYLIB = 12;
/*    */   public static final int LC_ID_DYLIB = 13;
/*    */   public static final int LC_SEGMENT_64 = 25;
/*    */   public static final int LC_UUID = 27;
/*    */   public static final int LC_CODE_SIGNATURE = 29;
/*    */   public static final int LC_SEGMENT_SPLIT_INFO = 30;
/*    */   public static final int LC_REEXPORT_DYLIB = -2147483617;
/*    */   public static final int LC_DYLD_INFO = 34;
/*    */   public static final int LC_DYLD_INFO_ONLY = -2147483614;
/*    */   public static final int LC_BUILD_VERSION = 50;
/*    */   public static final int LC_VERSION_MIN_MACOSX = 36;
/*    */   private int cmd;
/*    */   private int size;
/*    */   private Part content;
/*    */   
/*    */   public LoadCommand() {}
/*    */   
/*    */   public LoadCommand(int cmd, int size, Part content) {
/* 36 */     this.cmd = cmd;
/* 37 */     this.size = size;
/* 38 */     this.content = content;
/*    */   }
/*    */   
/*    */   static int getContentLength(int loadCommandSize) {
/* 42 */     return loadCommandSize - 8;
/*    */   }
/*    */   
/*    */   public void read(ByteBuffer buf, boolean bit64) throws IOException {
/* 46 */     this.cmd = buf.getInt();
/* 47 */     this.size = buf.getInt();
/*    */     
/* 49 */     initContent();
/* 50 */     this.content.read(buf, bit64);
/*    */   }
/*    */   
/*    */   public void write(ByteBuffer buf, boolean bit64) throws IOException {
/* 54 */     buf.putInt(this.cmd);
/* 55 */     buf.putInt(this.size);
/* 56 */     this.content.write(buf, bit64);
/*    */   }
/*    */   
/*    */   public int getSize() {
/* 60 */     return this.size;
/*    */   }
/*    */   
/*    */   private void initContent() {
/* 64 */     int contentLength = getContentLength(this.size);
/* 65 */     if (this.cmd == 29) {
/* 66 */       this.content = new LinkDataCommand(contentLength);
/* 67 */     } else if (this.cmd == 25) {
/* 68 */       this.content = new Segment64Command(contentLength);
/* 69 */     } else if (this.cmd == 1) {
/* 70 */       this.content = new Segment32Command(contentLength);
/* 71 */     } else if (this.cmd == 50) {
/* 72 */       this.content = new BuildVersionCommand(contentLength);
/* 73 */     } else if (this.cmd == 36) {
/* 74 */       this.content = new VersionMinCommand(contentLength);
/* 75 */     } else if (this.cmd == 2) {
/* 76 */       this.content = new SymtabCommand(contentLength);
/*    */     } else {
/* 78 */       this.content = new OpaqueContent(contentLength);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 84 */     return "LoadCommand{cmd=" + this.cmd + ", size=" + this.size + ", content=" + this.content + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Part getContent() {
/* 92 */     return this.content;
/*    */   }
/*    */   
/*    */   public int getCmd() {
/* 96 */     return this.cmd;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\LoadCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */