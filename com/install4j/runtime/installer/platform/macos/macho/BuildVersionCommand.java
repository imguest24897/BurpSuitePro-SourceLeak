/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class BuildVersionCommand
/*    */   extends VersionCommand
/*    */ {
/*    */   public static final int PLATFORM_MACOS = 1;
/*    */   public static final int PLATFORM_IOS = 2;
/*    */   public static final int PLATFORM_TVOS = 3;
/*    */   public static final int PLATFORM_WATCHOS = 4;
/*    */   public static final int PLATFORM_BRIDGEOS = 5;
/*    */   private int platform;
/* 17 */   private final List<BuildToolVersion> tools = new ArrayList<>();
/*    */   
/*    */   public BuildVersionCommand(int contentLength) {
/* 20 */     super(contentLength);
/*    */   }
/*    */ 
/*    */   
/*    */   public void readData(ByteBuffer buf, boolean bit64) throws IOException {
/* 25 */     this.platform = buf.getInt();
/* 26 */     setMinos(buf.getInt());
/* 27 */     setSdk(buf.getInt());
/* 28 */     int ntools = buf.getInt();
/* 29 */     this.tools.clear();
/* 30 */     for (int i = 0; i < ntools; i++) {
/* 31 */       BuildToolVersion buildToolVersion = new BuildToolVersion();
/* 32 */       buildToolVersion.read(buf, bit64);
/* 33 */       this.tools.add(buildToolVersion);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeData(ByteBuffer buf, boolean bit64) throws IOException {
/* 40 */     buf.putInt(this.platform);
/* 41 */     buf.putInt(getMinos());
/* 42 */     buf.putInt(getSdk());
/* 43 */     buf.putInt(this.tools.size());
/* 44 */     for (BuildToolVersion tool : this.tools)
/* 45 */       tool.write(buf, bit64); 
/*    */   }
/*    */   
/*    */   private static class BuildToolVersion
/*    */     implements Part {
/*    */     public static final int TOOL_CLANG = 1;
/*    */     public static final int TOOL_SWIFT = 2;
/*    */     public static final int TOOL_LD = 3;
/*    */     private int tool;
/*    */     private int version;
/*    */     
/*    */     private BuildToolVersion() {}
/*    */     
/*    */     public void read(ByteBuffer buf, boolean bit64) throws IOException {
/* 59 */       this.tool = buf.getInt();
/* 60 */       this.version = buf.getInt();
/*    */     }
/*    */ 
/*    */     
/*    */     public void write(ByteBuffer buf, boolean bit64) throws IOException {
/* 65 */       buf.putInt(this.tool);
/* 66 */       buf.putInt(this.version);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\BuildVersionCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */