/*     */ package com.install4j.runtime.installer.platform.macos.macho;
/*     */ import com.install4j.runtime.util.BinaryUtil;
/*     */ import java.io.Closeable;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.FileChannel;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.OpenOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.StandardOpenOption;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ public class FatMachoFile implements Closeable {
/*     */   public static final int FAT_MAGIC = -889275714;
/*     */   public static final int FAT_CIGAM = -1095041334;
/*     */   public static final int ALIGNMENT = 4096;
/*     */   private int magic;
/*     */   private FileChannel channel;
/*     */   private RandomAccessFile raFile;
/*  24 */   private List<Architecture> architectures = new ArrayList<>();
/*     */   
/*     */   public FatMachoFile(File file) throws IOException {
/*  27 */     this(file, true, false);
/*     */   }
/*     */   
/*     */   public FatMachoFile(File file, boolean writeable, boolean createNew) throws IOException {
/*  31 */     if (writeable)
/*  32 */     { this.raFile = new RandomAccessFile(file, "rw");
/*  33 */       init(createNew); }
/*     */     else { 
/*  35 */       try { RandomAccessFile raFile = new RandomAccessFile(file, "r"); 
/*  36 */         try { this.raFile = raFile;
/*  37 */           init(createNew);
/*  38 */           raFile.close(); } catch (Throwable throwable) { try { raFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  }
/*  39 */       finally { this.raFile = null; }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   private void init(boolean createNew) throws IOException {
/*  45 */     if (createNew) {
/*  46 */       this.magic = -889275714;
/*  47 */       this.channel = this.raFile.getChannel();
/*     */     } else {
/*  49 */       this.magic = this.raFile.readInt();
/*  50 */       if (isFat()) {
/*  51 */         this.channel = this.raFile.getChannel();
/*  52 */         int number = readInt();
/*     */         
/*  54 */         for (int i = 0; i < number; i++) {
/*  55 */           Architecture architecture = new Architecture();
/*  56 */           this.architectures.add(architecture);
/*     */         } 
/*     */       } else {
/*  59 */         this.raFile.close();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void writeInt(int v) throws IOException {
/*  65 */     this.raFile.writeInt(isBigEndian() ? v : BinaryUtil.swap(v));
/*     */   }
/*     */   
/*     */   private int readInt() throws IOException {
/*  69 */     int ret = this.raFile.readInt();
/*  70 */     return isBigEndian() ? ret : BinaryUtil.swap(ret);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/*  75 */     if (this.channel != null) {
/*  76 */       this.channel.close();
/*  77 */       this.channel = null;
/*     */     } 
/*  79 */     if (this.raFile != null) {
/*  80 */       this.raFile.close();
/*  81 */       this.raFile = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void write() throws IOException {
/*  86 */     this.raFile.seek(0L);
/*  87 */     this.raFile.setLength(0L);
/*  88 */     this.raFile.writeInt(this.magic);
/*  89 */     writeInt(this.architectures.size());
/*     */     
/*  91 */     int offset = 4096;
/*  92 */     for (Architecture architecture : this.architectures) {
/*  93 */       offset = (int)BinaryUtil.align(offset, 1L << architecture.align);
/*  94 */       offset = architecture.write(offset);
/*     */     } 
/*  96 */     close();
/*     */   }
/*     */   
/*     */   public List<Architecture> getArchitectures() {
/* 100 */     return this.architectures;
/*     */   }
/*     */   
/*     */   public boolean isBigEndian() {
/* 104 */     return (this.magic == -889275714);
/*     */   }
/*     */   
/*     */   public boolean isFat() {
/* 108 */     return isFatMagic(this.magic);
/*     */   }
/*     */   
/*     */   public void addArchitecture(MachoFile machoFile) {
/* 112 */     this.architectures.add(new Architecture(machoFile));
/*     */   }
/*     */   
/*     */   private static boolean isFatMagic(int magic) {
/* 116 */     return (magic == -889275714 || magic == -1095041334);
/*     */   }
/*     */   
/*     */   public static boolean isAnyMacho(Path path) throws IOException {
/* 120 */     if (Files.isRegularFile(path, new java.nio.file.LinkOption[0]) && Files.size(path) > 4L) {
/* 121 */       DataInputStream in = new DataInputStream(Files.newInputStream(path, new OpenOption[] { StandardOpenOption.READ })); 
/* 122 */       try { int magic = in.readInt();
/* 123 */         boolean bool = (isFatMagic(magic) || MachoFile.isThinMagic(magic)) ? true : false;
/* 124 */         in.close(); return bool; } catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*     */     
/* 126 */     }  return false;
/*     */   }
/*     */   
/*     */   public static boolean isFatMacho(Path path) throws IOException {
/* 130 */     if (Files.isRegularFile(path, new java.nio.file.LinkOption[0]) && Files.size(path) > 4L) {
/* 131 */       DataInputStream in = new DataInputStream(Files.newInputStream(path, new OpenOption[] { StandardOpenOption.READ })); 
/* 132 */       try { int magic = in.readInt();
/* 133 */         boolean bool = isFatMagic(magic);
/* 134 */         in.close(); return bool; } catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*     */     
/* 136 */     }  return false;
/*     */   }
/*     */   
/*     */   public class Architecture
/*     */   {
/*     */     private final int cputype;
/*     */     private final int cpusubtype;
/*     */     private final int align;
/*     */     private ByteBuffer data;
/*     */     
/*     */     public Architecture(MachoFile machoFile) {
/* 147 */       this.cputype = machoFile.getCpuType();
/* 148 */       this.cpusubtype = machoFile.getCpuSubType();
/* 149 */       MachoCpuType machoCpuType = MachoCpuType.getCpuType(this.cputype);
/* 150 */       this.align = (machoCpuType == MachoCpuType.X86_64 || machoCpuType == MachoCpuType.X86) ? 12 : 14;
/*     */       
/* 152 */       this.data = machoFile.getData();
/*     */     }
/*     */     
/*     */     private Architecture() throws IOException {
/* 156 */       this.cputype = FatMachoFile.this.readInt();
/* 157 */       this.cpusubtype = FatMachoFile.this.readInt();
/* 158 */       int offset = FatMachoFile.this.readInt();
/* 159 */       int size = FatMachoFile.this.readInt();
/* 160 */       this.align = FatMachoFile.this.readInt();
/*     */       
/* 162 */       long pos = FatMachoFile.this.raFile.getFilePointer();
/* 163 */       FatMachoFile.this.raFile.seek(offset);
/*     */       
/* 165 */       this.data = ByteBuffer.allocate(size);
/* 166 */       BinaryUtil.readFully(FatMachoFile.this.channel, this.data);
/*     */       
/* 168 */       FatMachoFile.this.raFile.seek(pos);
/*     */     }
/*     */     
/*     */     public MachoCpuType getCpuType() {
/* 172 */       return MachoCpuType.getCpuType(this.cputype);
/*     */     }
/*     */     
/*     */     public ByteBuffer getData() {
/* 176 */       return (ByteBuffer)this.data.duplicate().position(0);
/*     */     }
/*     */     
/*     */     public void setData(ByteBuffer data) {
/* 180 */       this.data = data;
/*     */     }
/*     */     
/*     */     private int write(int offset) throws IOException {
/* 184 */       FatMachoFile.this.writeInt(this.cputype);
/* 185 */       FatMachoFile.this.writeInt(this.cpusubtype);
/* 186 */       FatMachoFile.this.writeInt(offset);
/* 187 */       FatMachoFile.this.writeInt(this.data.limit());
/* 188 */       FatMachoFile.this.writeInt(this.align);
/*     */       
/* 190 */       long pos = FatMachoFile.this.raFile.getFilePointer();
/* 191 */       FatMachoFile.this.raFile.seek(offset);
/*     */       
/* 193 */       BinaryUtil.writeFully(FatMachoFile.this.channel, this.data);
/* 194 */       FatMachoFile.this.raFile.seek(pos);
/*     */       
/* 196 */       return (int)BinaryUtil.align((offset + this.data.limit()), 4096L);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 201 */       return "Architecture{machocputype=" + 
/* 202 */         getCpuType() + ", cputype=" + this.cputype + ", cpusubtype=" + this.cpusubtype + ", align=" + this.align + '}';
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\FatMachoFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */