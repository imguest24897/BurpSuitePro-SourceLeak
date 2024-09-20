/*     */ package com.install4j.runtime.installer.platform.macos.macho;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ class Segment64Command
/*     */   extends SegmentCommand
/*     */ {
/*     */   private static final String TEXT = "__TEXT";
/*     */   private long vmaddr;
/*     */   private long vmsize;
/*     */   private long fileoff;
/*     */   private long filesize;
/*     */   private int maxprot;
/*     */   private int initprot;
/*     */   private int nsects;
/*     */   private int flags;
/*  23 */   private final List<Section64> textSections = new ArrayList<>();
/*     */   
/*     */   public Segment64Command(int length) {
/*  26 */     super(length);
/*     */   }
/*     */ 
/*     */   
/*     */   public void readData(ByteBuffer buf, boolean bit64) throws IOException {
/*  31 */     buf.get(this.segmentName);
/*  32 */     this.vmaddr = buf.getLong();
/*  33 */     this.vmsize = buf.getLong();
/*  34 */     this.fileoff = buf.getLong();
/*  35 */     this.filesize = buf.getLong();
/*  36 */     this.maxprot = buf.getInt();
/*  37 */     this.initprot = buf.getInt();
/*  38 */     this.nsects = buf.getInt();
/*  39 */     this.flags = buf.getInt();
/*     */     
/*  41 */     if (this.nsects > 0 && "__TEXT".equals(getSegmentName())) {
/*  42 */       for (int currentSectionId = 0; currentSectionId < this.nsects; currentSectionId++) {
/*  43 */         this.textSections.add(new Section64(buf));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeData(ByteBuffer buf, boolean bit64) throws IOException {
/*  50 */     buf.put(this.segmentName);
/*  51 */     buf.putLong(this.vmaddr);
/*  52 */     buf.putLong(this.vmsize);
/*  53 */     buf.putLong(this.fileoff);
/*  54 */     buf.putLong(this.filesize);
/*  55 */     buf.putInt(this.maxprot);
/*  56 */     buf.putInt(this.initprot);
/*  57 */     buf.putInt(this.nsects);
/*  58 */     buf.putInt(this.flags);
/*     */   }
/*     */   
/*     */   public Section64 findTextSection(String name) {
/*  62 */     byte[] searchedName = Arrays.copyOf(name.getBytes(StandardCharsets.UTF_8), 16);
/*  63 */     for (Section64 textSection : this.textSections) {
/*  64 */       if (Arrays.equals(textSection.sectname, searchedName)) {
/*  65 */         return textSection;
/*     */       }
/*     */     } 
/*  68 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getVmsize() {
/*  73 */     return this.vmsize;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVmsize(long vmsize) {
/*  78 */     this.vmsize = vmsize;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getFilesize() {
/*  83 */     return this.filesize;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getFileoff() {
/*  88 */     return this.fileoff;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFilesize(long filesize) {
/*  93 */     this.filesize = filesize;
/*     */   }
/*     */   
/*     */   public int getFlags() {
/*  97 */     return this.flags;
/*     */   }
/*     */   
/*     */   public void setFlags(int flags) {
/* 101 */     this.flags = flags;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 106 */     return "Segment64Command{segmentName=" + 
/* 107 */       getSegmentName() + ", vmaddr=" + this.vmaddr + ", vmsize=" + this.vmsize + ", fileoff=" + this.fileoff + ", filesize=" + this.filesize + ", maxprot=" + this.maxprot + ", initprot=" + this.initprot + ", nsects=" + this.nsects + ", flags=" + this.flags + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Section64
/*     */   {
/*     */     private static final int NAME_LENGTH = 16;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     private final byte[] sectname = new byte[16];
/* 123 */     private final byte[] segname = new byte[16];
/*     */     private final long addr;
/*     */     private final long size;
/*     */     private final int offset;
/*     */     private final int align;
/*     */     private final int reloff;
/*     */     private final int nreloc;
/*     */     private final int flags;
/*     */     private final int reserved1;
/*     */     private final int reserved2;
/*     */     private final int reserved3;
/*     */     
/*     */     public Section64(ByteBuffer buf) {
/* 136 */       buf.get(this.sectname);
/* 137 */       buf.get(this.segname);
/* 138 */       this.addr = buf.getLong();
/* 139 */       this.size = buf.getLong();
/* 140 */       this.offset = buf.getInt();
/* 141 */       this.align = buf.getInt();
/* 142 */       this.reloff = buf.getInt();
/* 143 */       this.nreloc = buf.getInt();
/* 144 */       this.flags = buf.getInt();
/* 145 */       this.reserved1 = buf.getInt();
/* 146 */       this.reserved2 = buf.getInt();
/* 147 */       this.reserved3 = buf.getInt();
/*     */     }
/*     */     
/*     */     public long getSize() {
/* 151 */       return this.size;
/*     */     }
/*     */     
/*     */     public int getOffset() {
/* 155 */       return this.offset;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\Segment64Command.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */