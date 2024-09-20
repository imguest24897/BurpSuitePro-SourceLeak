/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ public class PercentScaler
/*    */ {
/*    */   private int fromPercent;
/*    */   private int toPercent;
/*    */   
/*    */   public PercentScaler(int fromPercent, int toPercent) {
/*  9 */     this.fromPercent = fromPercent;
/* 10 */     this.toPercent = toPercent;
/*    */   }
/*    */   
/*    */   public float getFromPercent() {
/* 14 */     return this.fromPercent;
/*    */   }
/*    */   
/*    */   public float getToPercent() {
/* 18 */     return this.toPercent;
/*    */   }
/*    */   
/*    */   public int scalePercent(int percent) {
/* 22 */     int scaledPercent = (int)(this.fromPercent + 1.0F * percent / 100.0F * (this.toPercent - this.fromPercent));
/* 23 */     scaledPercent = Math.min(Math.max(this.fromPercent, scaledPercent), this.toPercent);
/*    */     
/* 25 */     return scaledPercent;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\PercentScaler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */