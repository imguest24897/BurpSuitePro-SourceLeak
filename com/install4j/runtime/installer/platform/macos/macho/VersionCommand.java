/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ public abstract class VersionCommand extends OpaqueContent {
/*    */   private int minos;
/*    */   private int sdk;
/*    */   
/*    */   public VersionCommand(int contentLength) {
/*  8 */     super(contentLength);
/*    */   }
/*    */   
/*    */   public int getMinos() {
/* 12 */     return this.minos;
/*    */   }
/*    */   
/*    */   public void setMinos(int minos) {
/* 16 */     this.minos = minos;
/*    */   }
/*    */   
/*    */   public int getSdk() {
/* 20 */     return this.sdk;
/*    */   }
/*    */   
/*    */   public void setSdk(int sdk) {
/* 24 */     this.sdk = sdk;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\VersionCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */