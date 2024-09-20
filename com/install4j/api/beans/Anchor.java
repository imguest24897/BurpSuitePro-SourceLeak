/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum Anchor
/*    */ {
/* 13 */   NORTHWEST("North-West", 23, true),
/* 14 */   NORTH("North", 19, false),
/* 15 */   NORTHEAST("North-East", 24, true),
/* 16 */   WEST("West", 21, false),
/* 17 */   CENTER("Center", 10, false),
/* 18 */   EAST("East", 22, false),
/* 19 */   SOUTHWEST("South-West", 25, true),
/* 20 */   SOUTH("South", 20, false),
/* 21 */   SOUTHEAST("South-East", 26, true);
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   private final int value;
/*    */   
/*    */   private final boolean corner;
/*    */   
/*    */   public static Anchor getByValue(int value) {
/* 30 */     for (Anchor anchor : values()) {
/* 31 */       if (anchor.getValue() == value) {
/* 32 */         return anchor;
/*    */       }
/*    */     } 
/* 35 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   Anchor(String verbose, int value, boolean corner) {
/* 43 */     this.verbose = verbose;
/* 44 */     this.value = value;
/* 45 */     this.corner = corner;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isCorner() {
/* 53 */     return this.corner;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getValue() {
/* 60 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 65 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\Anchor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */