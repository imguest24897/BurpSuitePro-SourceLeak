/*    */ package com.install4j.api.update;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.apiimpl.UpdateScheduleRegistryImpl;
/*    */ import java.util.Date;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UpdateScheduleRegistry
/*    */ {
/*    */   public static boolean checkAndReset() {
/* 28 */     return UpdateScheduleRegistryImpl.checkAndReset();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void setUpdateSchedule(UpdateSchedule updateSchedule) {
/* 36 */     UpdateScheduleRegistryImpl.setUpdateSchedule(updateSchedule);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static UpdateSchedule getUpdateSchedule() {
/* 44 */     return UpdateScheduleRegistryImpl.getUpdateSchedule();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Date getLastUpdateCheckDate() {
/* 52 */     return UpdateScheduleRegistryImpl.getLastUpdateCheckDate();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void checkedForUpdate() {
/* 60 */     UpdateScheduleRegistryImpl.checkedForUpdate();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\UpdateScheduleRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */