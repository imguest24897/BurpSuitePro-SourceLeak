/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.List;
/*    */ 
/*    */ class Header
/*    */   implements Part {
/*    */   private int cputype;
/*    */   private int cpusubtype;
/*    */   private int filetype;
/*    */   private int ncmds;
/*    */   private int sizeofcmds;
/*    */   private int flags;
/*    */   
/*    */   public void read(ByteBuffer buf, boolean bit64) throws IOException {
/* 17 */     this.cputype = buf.getInt();
/* 18 */     this.cpusubtype = buf.getInt();
/* 19 */     this.filetype = buf.getInt();
/* 20 */     this.ncmds = buf.getInt();
/* 21 */     this.sizeofcmds = buf.getInt();
/* 22 */     this.flags = buf.getInt();
/*    */     
/* 24 */     if (bit64) {
/* 25 */       buf.getInt();
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean isExecutable() {
/* 30 */     return (this.filetype == 2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(ByteBuffer buf, boolean bit64) throws IOException {
/* 35 */     buf.putInt(this.cputype);
/* 36 */     buf.putInt(this.cpusubtype);
/* 37 */     buf.putInt(this.filetype);
/* 38 */     buf.putInt(this.ncmds);
/* 39 */     buf.putInt(this.sizeofcmds);
/* 40 */     buf.putInt(this.flags);
/*    */     
/* 42 */     if (bit64) {
/* 43 */       buf.putInt(0);
/*    */     }
/*    */   }
/*    */   
/*    */   public int getNcmds() {
/* 48 */     return this.ncmds;
/*    */   }
/*    */   
/*    */   public int getFlags() {
/* 52 */     return this.flags;
/*    */   }
/*    */   
/*    */   public void setFlags(int flags) {
/* 56 */     this.flags = flags;
/*    */   }
/*    */   
/*    */   public void updateHeader(List<LoadCommand> loadCommands) {
/* 60 */     this.ncmds = loadCommands.size();
/* 61 */     this.sizeofcmds = 0;
/* 62 */     for (LoadCommand loadCommand : loadCommands) {
/* 63 */       this.sizeofcmds += loadCommand.getSize();
/*    */     }
/*    */   }
/*    */   
/*    */   public MachoCpuType getMachoCpuType() {
/* 68 */     return MachoCpuType.getCpuType(this.cputype);
/*    */   }
/*    */   
/*    */   public int getCpuType() {
/* 72 */     return this.cputype;
/*    */   }
/*    */   
/*    */   public int getCpuSubType() {
/* 76 */     return this.cpusubtype;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 81 */     return "Header{, cputype=" + this.cputype + ", cpusubtype=" + this.cpusubtype + ", filetype=" + this.filetype + ", ncmds=" + this.ncmds + ", sizeofcmds=" + this.sizeofcmds + ", flags=" + this.flags + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\Header.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */