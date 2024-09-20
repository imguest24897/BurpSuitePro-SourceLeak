/*    */ package com.install4j.api.windows;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum DriveType
/*    */ {
/* 15 */   UNKNOWN(0, "unknown"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 20 */   REMOVABLE(2, "removable"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   FIXED(3, "fixed"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 30 */   REMOTE(4, "remote"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   CDROM(5, "cdrom"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 40 */   RAMDISK(6, "ramdisk");
/*    */   
/*    */   private final int intValue;
/*    */   
/*    */   private final String name;
/*    */ 
/*    */   
/*    */   public static DriveType getFromIntValue(int value) {
/* 48 */     for (DriveType driveType : values()) {
/* 49 */       if (driveType.getIntValue() == value) {
/* 50 */         return driveType;
/*    */       }
/*    */     } 
/* 53 */     return UNKNOWN;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   DriveType(int intValue, String name) {
/* 60 */     this.intValue = intValue;
/* 61 */     this.name = name;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIntValue() {
/* 69 */     return this.intValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 74 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\DriveType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */