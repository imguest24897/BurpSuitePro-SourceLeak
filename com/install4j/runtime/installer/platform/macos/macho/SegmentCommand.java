/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import java.nio.charset.StandardCharsets;
/*    */ 
/*    */ public abstract class SegmentCommand extends OpaqueContent {
/*  6 */   protected byte[] segmentName = new byte[16];
/*    */   
/*    */   public SegmentCommand(int length) {
/*  9 */     super(length);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getSegmentName() {
/*    */     int termination;
/* 15 */     for (termination = 0; termination < this.segmentName.length && this.segmentName[termination] != 0; termination++);
/*    */     
/* 17 */     return new String(this.segmentName, 0, termination, StandardCharsets.UTF_8);
/*    */   }
/*    */   
/*    */   public abstract long getVmsize();
/*    */   
/*    */   public abstract void setVmsize(long paramLong);
/*    */   
/*    */   public abstract long getFilesize();
/*    */   
/*    */   public abstract void setFilesize(long paramLong);
/*    */   
/*    */   public abstract long getFileoff();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\SegmentCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */