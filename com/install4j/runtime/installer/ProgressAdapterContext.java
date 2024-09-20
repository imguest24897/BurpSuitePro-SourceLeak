/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ 
/*    */ public class ProgressAdapterContext
/*    */   extends ContextProxy {
/*    */   private ProgressInterface progressInterface;
/*    */   
/*    */   public ProgressAdapterContext(Context parentContext, ProgressInterface progressInterface) {
/* 11 */     super(parentContext);
/* 12 */     this.progressInterface = progressInterface;
/*    */   }
/*    */ 
/*    */   
/*    */   public ProgressInterface getProgressInterface() {
/* 17 */     return this.progressInterface;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\ProgressAdapterContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */