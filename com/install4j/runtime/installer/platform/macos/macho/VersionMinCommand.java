/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public class VersionMinCommand extends VersionCommand {
/*    */   public VersionMinCommand(int contentLength) {
/*  8 */     super(contentLength);
/*    */   }
/*    */ 
/*    */   
/*    */   public void readData(ByteBuffer buf, boolean bit64) throws IOException {
/* 13 */     setMinos(buf.getInt());
/* 14 */     setSdk(buf.getInt());
/*    */   }
/*    */ 
/*    */   
/*    */   public void writeData(ByteBuffer buf, boolean bit64) throws IOException {
/* 19 */     buf.putInt(getMinos());
/* 20 */     buf.putInt(getSdk());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\VersionMinCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */