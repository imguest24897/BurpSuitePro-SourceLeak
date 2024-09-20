/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.BinaryUtil;
/*     */ import java.io.EOFException;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.util.Arrays;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ public class PE32Handler
/*     */ {
/*     */   private RandomAccessFile raFile;
/*     */   private boolean pe32Plus;
/*     */   private Machine machine;
/*     */   public static final int IMAGE_FILE_MACHINE_AMD64 = 34404;
/*     */   public static final int IMAGE_FILE_MACHINE_ARM64 = 43620;
/*     */   public static final int IMAGE_FILE_MACHINE_I386 = 332;
/*     */   
/*     */   @NotNull
/*     */   public static Machine getMachine(File file) throws IOException {
/*  24 */     RandomAccessFile raFile = new RandomAccessFile(file, "r"); 
/*  25 */     try { PE32Handler pe32Handler = new PE32Handler();
/*  26 */       pe32Handler.initRaFile(raFile);
/*  27 */       Machine machine = pe32Handler.getMachine();
/*  28 */       raFile.close(); return machine; }
/*     */     catch (Throwable throwable) { try { raFile.close(); }
/*     */       catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */        throw throwable; }
/*  32 */      } protected final int initRaFile(RandomAccessFile raFile) throws IOException { this.raFile = raFile;
/*     */     
/*  34 */     if (raFile.length() < 64L || read() != 77 || read() != 90) {
/*  35 */       throw new IOException("no PE32 file");
/*     */     }
/*     */     
/*  38 */     raFile.seek(60L);
/*  39 */     int peHeaderOffset = readInt();
/*     */     
/*  41 */     if (raFile.length() < (peHeaderOffset + 160)) {
/*  42 */       throw new IOException("file too short (PE)");
/*     */     }
/*  44 */     raFile.seek(peHeaderOffset);
/*  45 */     if (!Arrays.equals(new byte[] { 80, 69, 0, 0 }, readBytes(4))) {
/*  46 */       throw new IOException("PE header not found");
/*     */     }
/*  48 */     this.machine = getMachine(readUnsignedShort());
/*     */     
/*  50 */     raFile.seek((peHeaderOffset + 24));
/*  51 */     this.pe32Plus = (readShort() == 523);
/*  52 */     return peHeaderOffset; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   static Machine getMachine(int machine) {
/*  57 */     switch (machine) {
/*     */       case 34404:
/*  59 */         return Machine.X64;
/*     */       case 43620:
/*  61 */         return Machine.ARM64;
/*     */       case 332:
/*  63 */         return Machine.I386;
/*     */     } 
/*  65 */     return Machine.UNKNOWN;
/*     */   }
/*     */   
/*     */   public boolean isPe32Plus() {
/*  69 */     return this.pe32Plus;
/*     */   }
/*     */   
/*     */   public Machine getMachine() {
/*  73 */     return this.machine;
/*     */   }
/*     */   
/*     */   protected final byte[] readBytes(int count) throws IOException {
/*  77 */     byte[] ret = new byte[count];
/*  78 */     this.raFile.readFully(ret);
/*  79 */     return ret;
/*     */   }
/*     */   
/*     */   protected final int read() throws IOException {
/*  83 */     return this.raFile.read();
/*     */   }
/*     */   
/*     */   protected final void writeInt(int val) throws IOException {
/*  87 */     this.raFile.writeInt(BinaryUtil.swap(val));
/*     */   }
/*     */   
/*     */   protected final int readInt() throws IOException {
/*  91 */     return BinaryUtil.swap(this.raFile.readInt());
/*     */   }
/*     */   
/*     */   protected final short readShort() throws IOException {
/*  95 */     return BinaryUtil.swap(this.raFile.readShort());
/*     */   }
/*     */   
/*     */   protected final int readUnsignedShort() throws IOException {
/*  99 */     int ch1 = this.raFile.read();
/* 100 */     int ch2 = this.raFile.read();
/* 101 */     if ((ch1 | ch2) < 0)
/* 102 */       throw new EOFException(); 
/* 103 */     return (ch2 << 8) + (ch1 << 0);
/*     */   }
/*     */   
/*     */   protected final void writeUnsignedInt(long v) throws IOException {
/* 107 */     this.raFile.write((int)(v >>> 0L & 0xFFL));
/* 108 */     this.raFile.write((int)(v >>> 8L & 0xFFL));
/* 109 */     this.raFile.write((int)(v >>> 16L & 0xFFL));
/* 110 */     this.raFile.write((int)(v >>> 24L & 0xFFL));
/*     */   }
/*     */   
/*     */   protected final long readUnsignedInt() throws IOException {
/* 114 */     long ch1 = this.raFile.read();
/* 115 */     long ch2 = this.raFile.read();
/* 116 */     long ch3 = this.raFile.read();
/* 117 */     long ch4 = this.raFile.read();
/* 118 */     if ((ch1 | ch2 | ch3 | ch4) < 0L)
/* 119 */       throw new EOFException(); 
/* 120 */     return (ch4 << 24L) + (ch3 << 16L) + (ch2 << 8L) + (ch1 << 0L);
/*     */   }
/*     */   
/*     */   public static Machine getJREMachine() {
/* 124 */     if (InstallerUtil.isAaarch64())
/* 125 */       return Machine.ARM64; 
/* 126 */     if (InstallerUtil.is32BitJVM()) {
/* 127 */       return Machine.I386;
/*     */     }
/* 129 */     return Machine.X64;
/*     */   }
/*     */   
/*     */   public enum Machine
/*     */   {
/* 134 */     I386,
/* 135 */     X64,
/* 136 */     ARM64,
/* 137 */     UNKNOWN;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\PE32Handler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */