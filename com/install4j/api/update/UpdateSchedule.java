/*    */ package com.install4j.api.update;
/*    */ 
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum UpdateSchedule
/*    */ {
/* 15 */   ON_EVERY_START("On every start", "start"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   DAILY("Daily", "daily"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   WEEKLY("Weekly", "weekly"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   MONTHLY("Monthly", "monthly"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 38 */   NEVER("Never", "never");
/*    */   @Deprecated
/*    */   public static final UpdateSchedule[] ALL_VALUES;
/*    */   private final String verbose;
/*    */   private final String id;
/*    */   
/*    */   static {
/* 45 */     ALL_VALUES = values();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static UpdateSchedule getById(String id) {
/* 54 */     for (UpdateSchedule updateSchedule : values()) {
/* 55 */       if (Objects.equals(updateSchedule.getId(), id)) {
/* 56 */         return updateSchedule;
/*    */       }
/*    */     } 
/* 59 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   UpdateSchedule(String verbose, String id) {
/* 66 */     this.verbose = verbose;
/* 67 */     this.id = id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getId() {
/* 76 */     return this.id;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 81 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\UpdateSchedule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */