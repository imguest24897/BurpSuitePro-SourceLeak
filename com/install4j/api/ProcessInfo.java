/*    */ package com.install4j.api;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ProcessInfo
/*    */   implements Serializable
/*    */ {
/*    */   private int processId;
/*    */   private String moduleName;
/*    */   
/*    */   protected ProcessInfo(int processId, String moduleName) {
/* 18 */     this.processId = processId;
/* 19 */     this.moduleName = moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getModuleName() {
/* 28 */     return this.moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getProcessId() {
/* 37 */     return this.processId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract String getWindowTitle();
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     return "processId=" + this.processId + ", moduleName='" + this.moduleName + '\'' + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 56 */     if (this == o) {
/* 57 */       return true;
/*    */     }
/* 59 */     if (o == null || getClass() != o.getClass()) {
/* 60 */       return false;
/*    */     }
/*    */     
/* 63 */     ProcessInfo that = (ProcessInfo)o;
/*    */     
/* 65 */     if (this.processId != that.processId) {
/* 66 */       return false;
/*    */     }
/*    */     
/* 69 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 74 */     return this.processId;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\ProcessInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */