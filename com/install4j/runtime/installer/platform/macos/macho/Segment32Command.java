/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ class Segment32Command
/*    */   extends SegmentCommand {
/*    */   private int vmaddr;
/*    */   private int vmsize;
/*    */   private int fileoff;
/*    */   private int filesize;
/*    */   private int maxprot;
/*    */   private int initprot;
/*    */   private int nsects;
/*    */   private int flags;
/*    */   
/*    */   public Segment32Command(int length) {
/* 18 */     super(length);
/*    */   }
/*    */ 
/*    */   
/*    */   public void readData(ByteBuffer buf, boolean bit64) throws IOException {
/* 23 */     buf.get(this.segmentName);
/* 24 */     this.vmaddr = buf.getInt();
/* 25 */     this.vmsize = buf.getInt();
/* 26 */     this.fileoff = buf.getInt();
/* 27 */     this.filesize = buf.getInt();
/* 28 */     this.maxprot = buf.getInt();
/* 29 */     this.initprot = buf.getInt();
/* 30 */     this.nsects = buf.getInt();
/* 31 */     this.flags = buf.getInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void writeData(ByteBuffer buf, boolean bit64) throws IOException {
/* 36 */     buf.put(this.segmentName);
/* 37 */     buf.putInt(this.vmaddr);
/* 38 */     buf.putInt(this.vmsize);
/* 39 */     buf.putInt(this.fileoff);
/* 40 */     buf.putInt(this.filesize);
/* 41 */     buf.putInt(this.maxprot);
/* 42 */     buf.putInt(this.initprot);
/* 43 */     buf.putInt(this.nsects);
/* 44 */     buf.putInt(this.flags);
/*    */   }
/*    */ 
/*    */   
/*    */   public long getVmsize() {
/* 49 */     return this.vmsize;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setVmsize(long vmsize) {
/* 54 */     this.vmsize = (int)vmsize;
/*    */   }
/*    */ 
/*    */   
/*    */   public long getFilesize() {
/* 59 */     return this.filesize;
/*    */   }
/*    */ 
/*    */   
/*    */   public long getFileoff() {
/* 64 */     return this.fileoff;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFilesize(long filesize) {
/* 69 */     this.filesize = (int)filesize;
/*    */   }
/*    */   
/*    */   public int getFlags() {
/* 73 */     return this.flags;
/*    */   }
/*    */   
/*    */   public void setFlags(int flags) {
/* 77 */     this.flags = flags;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 82 */     return "Segment32Command{segmentName=" + 
/* 83 */       getSegmentName() + ", vmaddr=" + this.vmaddr + ", vmsize=" + this.vmsize + ", fileoff=" + this.fileoff + ", filesize=" + this.filesize + ", maxprot=" + this.maxprot + ", initprot=" + this.initprot + ", nsects=" + this.nsects + ", flags=" + this.flags + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\Segment32Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */