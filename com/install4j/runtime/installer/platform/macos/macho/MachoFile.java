/*     */ package com.install4j.runtime.installer.platform.macos.macho;
/*     */ 
/*     */ import com.install4j.runtime.util.BinaryUtil;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.ByteOrder;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class MachoFile
/*     */   implements Part {
/*  14 */   private static int MH_MAGIC = -17958194;
/*  15 */   private static int MH_CIGAM = -822415874;
/*     */   
/*  17 */   private static int MH_MAGIC_64 = -17958193;
/*  18 */   private static int MH_CIGAM_64 = -805638658;
/*     */   
/*  20 */   private static String LINK_EDIT_SEGMENT_NAME = "__LINKEDIT";
/*     */   
/*     */   private int magic;
/*     */   
/*     */   private Header header;
/*  25 */   private List<LoadCommand> loadCommands = new ArrayList<>();
/*     */   
/*     */   private ByteBuffer byteBuffer;
/*     */   
/*     */   public MachoFile(@NotNull ByteBuffer data) throws IOException {
/*  30 */     this.byteBuffer = data;
/*  31 */     this.byteBuffer.order(ByteOrder.BIG_ENDIAN);
/*  32 */     this.magic = this.byteBuffer.getInt();
/*  33 */     if (!isThinMagic(this.magic)) {
/*  34 */       throw new NoMachoException();
/*     */     }
/*  36 */     if (!isBigEndian()) {
/*  37 */       this.byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
/*     */     }
/*  39 */     read(this.byteBuffer, is64Bit());
/*     */   }
/*     */   
/*     */   public boolean isExecutable() {
/*  43 */     return this.header.isExecutable();
/*     */   }
/*     */   
/*     */   static boolean isThinMagic(int magic) {
/*  47 */     return (magic == MH_MAGIC || magic == MH_CIGAM || magic == MH_MAGIC_64 || magic == MH_CIGAM_64);
/*     */   }
/*     */   
/*     */   public void growLinkSegment(int size) throws IOException {
/*  51 */     for (LoadCommand loadCommand : this.loadCommands) {
/*  52 */       if (loadCommand.getContent() instanceof SegmentCommand) {
/*  53 */         SegmentCommand segmentCommand = (SegmentCommand)loadCommand.getContent();
/*  54 */         if (segmentCommand.getSegmentName().equals(LINK_EDIT_SEGMENT_NAME)) {
/*  55 */           long newFileSize = segmentCommand.getFilesize() + size;
/*  56 */           segmentCommand.setFilesize(newFileSize);
/*  57 */           segmentCommand.setVmsize(Math.max(segmentCommand.getVmsize(), alignVmSize(newFileSize)));
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static long alignVmSize(long size) {
/*  65 */     return BinaryUtil.align(size, 4096L);
/*     */   }
/*     */   
/*     */   public boolean is64Bit() {
/*  69 */     return (this.magic == MH_MAGIC_64 || this.magic == MH_CIGAM_64);
/*     */   }
/*     */   
/*     */   public boolean isBigEndian() {
/*  73 */     return (this.magic == MH_MAGIC_64 || this.magic == MH_MAGIC);
/*     */   }
/*     */ 
/*     */   
/*     */   public void read(ByteBuffer buf, boolean bit64) throws IOException {
/*  78 */     this.header = new Header();
/*  79 */     this.header.read(buf, bit64);
/*     */     
/*  81 */     for (int i = 0; i < this.header.getNcmds(); i++) {
/*  82 */       LoadCommand loadCommand = new LoadCommand();
/*  83 */       loadCommand.read(buf, bit64);
/*  84 */       this.loadCommands.add(loadCommand);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void write(ByteBuffer buf, boolean bit64) throws IOException {
/*  90 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void appendOrReplaceLoadCommand(LoadCommand loadCommand) throws IOException {
/*  94 */     removeLoadCommand(loadCommand.getCmd());
/*  95 */     this.loadCommands.add(loadCommand);
/*     */   }
/*     */   
/*     */   public void removeLoadCommand(int cmd) throws IOException {
/*  99 */     this.loadCommands.removeIf(loadCommand -> (loadCommand.getCmd() == cmd));
/*     */   }
/*     */   
/*     */   public void removeSignature() throws IOException {
/* 103 */     shrinkForSignatureRemoval();
/* 104 */     removeLoadCommand(29);
/*     */   }
/*     */   
/*     */   private void shrinkForSignatureRemoval() {
/* 108 */     LinkDataCommand codeSignatureCommand = null;
/* 109 */     SegmentCommand linkEditCommand = null;
/* 110 */     SymtabCommand symtabCommand = null;
/* 111 */     for (int commandIndex = 0; commandIndex < this.loadCommands.size(); commandIndex++) {
/* 112 */       SegmentCommand segmentCommand; LoadCommand loadCommand = this.loadCommands.get(commandIndex);
/* 113 */       switch (loadCommand.getCmd()) {
/*     */         case 29:
/* 115 */           if (commandIndex == this.loadCommands.size() - 1) {
/* 116 */             codeSignatureCommand = (LinkDataCommand)loadCommand.getContent();
/*     */           }
/*     */           break;
/*     */         case 1:
/*     */         case 25:
/* 121 */           segmentCommand = (SegmentCommand)loadCommand.getContent();
/* 122 */           if ("__LINKEDIT".equals(segmentCommand.getSegmentName())) {
/* 123 */             linkEditCommand = segmentCommand;
/*     */           }
/*     */           break;
/*     */         case 2:
/* 127 */           symtabCommand = (SymtabCommand)loadCommand.getContent();
/*     */           break;
/*     */       } 
/*     */     } 
/* 131 */     if (codeSignatureCommand == null || linkEditCommand == null) {
/*     */       return;
/*     */     }
/*     */     
/* 135 */     int codeSignatureOffset = codeSignatureCommand.getOffset();
/* 136 */     int codeSignatureSize = codeSignatureCommand.getSize();
/*     */     
/* 138 */     if (codeSignatureOffset + codeSignatureSize != this.byteBuffer.limit()) {
/*     */       return;
/*     */     }
/*     */     
/* 142 */     long linkEditOffset = linkEditCommand.getFileoff();
/* 143 */     long linkEditSize = linkEditCommand.getFilesize();
/*     */     
/* 145 */     if (linkEditOffset + linkEditSize != this.byteBuffer.limit()) {
/*     */       return;
/*     */     }
/*     */     
/* 149 */     int sizeReduction = codeSignatureSize;
/* 150 */     if (symtabCommand != null) {
/* 151 */       long diffSize = (this.byteBuffer.limit() - sizeReduction - symtabCommand.getStroff() + symtabCommand.getStrsize());
/*     */       
/* 153 */       if (0L <= diffSize && diffSize <= 16L) {
/* 154 */         sizeReduction = (int)(sizeReduction + diffSize);
/*     */       }
/*     */     } 
/*     */     
/* 158 */     setLength(this.byteBuffer.limit() - sizeReduction);
/* 159 */     linkEditCommand.setFilesize(linkEditCommand.getFilesize() - sizeReduction);
/* 160 */     linkEditCommand.setVmsize(alignVmSize(linkEditCommand.getFilesize()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeHeaderAndCommands() throws IOException {
/* 165 */     this.header.updateHeader(this.loadCommands);
/* 166 */     this.byteBuffer.position(4);
/* 167 */     this.header.write(this.byteBuffer, is64Bit());
/* 168 */     for (LoadCommand loadCommand : this.loadCommands) {
/* 169 */       loadCommand.write(this.byteBuffer, is64Bit());
/*     */     }
/*     */   }
/*     */   
/*     */   public void position(int pos) {
/* 174 */     this.byteBuffer.position(pos);
/*     */   }
/*     */   
/*     */   public void write(byte[] bytes) {
/* 178 */     this.byteBuffer.put(bytes);
/*     */   }
/*     */   
/*     */   public void setLength(int length) {
/* 182 */     if (this.byteBuffer.capacity() >= length) {
/* 183 */       this.byteBuffer.limit(length);
/*     */     } else {
/* 185 */       int pos = this.byteBuffer.position();
/* 186 */       ByteBuffer newBuffer = ByteBuffer.allocate(length);
/* 187 */       newBuffer.order(this.byteBuffer.order());
/* 188 */       newBuffer.put((ByteBuffer)this.byteBuffer.position(0));
/* 189 */       this.byteBuffer = newBuffer;
/* 190 */       this.byteBuffer.position(pos);
/*     */     } 
/*     */   }
/*     */   
/*     */   public ByteBuffer getData() {
/* 195 */     return (ByteBuffer)this.byteBuffer.duplicate().position(0);
/*     */   }
/*     */   
/*     */   public void setMinimumSdkVersion(int version) throws IOException {
/* 199 */     for (LoadCommand loadCommand : this.loadCommands) {
/* 200 */       if (loadCommand.getContent() instanceof VersionCommand) {
/* 201 */         VersionCommand versionCommand = (VersionCommand)loadCommand.getContent();
/* 202 */         if (versionCommand.getSdk() < version) {
/* 203 */           versionCommand.setSdk(version);
/* 204 */           versionCommand.write(this.byteBuffer, is64Bit());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public MachoCpuType getMachoCpuType() {
/* 211 */     return this.header.getMachoCpuType();
/*     */   }
/*     */   
/*     */   public int getCpuType() {
/* 215 */     return this.header.getCpuType();
/*     */   }
/*     */   
/*     */   public int getCpuSubType() {
/* 219 */     return this.header.getCpuSubType();
/*     */   }
/*     */   
/*     */   public void changeInfoPlist(byte[] bytes) {
/* 223 */     for (LoadCommand loadCommand : this.loadCommands) {
/* 224 */       if (loadCommand.getContent() instanceof Segment64Command) {
/* 225 */         Segment64Command segmentCommand = (Segment64Command)loadCommand.getContent();
/* 226 */         Segment64Command.Section64 section64 = segmentCommand.findTextSection("__info_plist");
/* 227 */         if (section64 != null) {
/* 228 */           int previousLength = (int)section64.getSize();
/* 229 */           if (previousLength != bytes.length) {
/* 230 */             throw new IllegalArgumentException("embedded plist must be of the same length: " + previousLength + " != " + bytes.length);
/*     */           }
/* 232 */           ByteBuffer data = getData();
/* 233 */           data.position(section64.getOffset());
/* 234 */           data.put(bytes);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public byte[] getInfoPlist() {
/* 241 */     for (LoadCommand loadCommand : this.loadCommands) {
/* 242 */       if (loadCommand.getContent() instanceof Segment64Command) {
/* 243 */         Segment64Command segmentCommand = (Segment64Command)loadCommand.getContent();
/* 244 */         Segment64Command.Section64 section64 = segmentCommand.findTextSection("__info_plist");
/* 245 */         if (section64 != null) {
/* 246 */           int length = (int)section64.getSize();
/* 247 */           if (length > 0) {
/* 248 */             byte[] ret = new byte[length];
/* 249 */             ByteBuffer data = getData();
/* 250 */             data.position(section64.getOffset());
/* 251 */             data.get(ret);
/* 252 */             return ret;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 257 */     return null;
/*     */   }
/*     */   
/*     */   public static class NoMachoException extends IOException {
/*     */     public NoMachoException(File file) {
/* 262 */       super("no macho file: " + file);
/*     */     }
/*     */     public NoMachoException() {
/* 265 */       super("no macho file");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\MachoFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */