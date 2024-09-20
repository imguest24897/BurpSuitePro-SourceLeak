/*     */ package com.install4j.runtime.installer.helper.apiimpl;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.update.UpdateSchedule;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.registry.InstallRegistry;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UpdateScheduleRegistryImpl
/*     */ {
/*     */   private static final String REGVAL_PREFIX_UPDATE_SCHEDULE = "updateSchedule";
/*     */   private static final String REGVAL_PREFIX_LAST_UPDATE = "lastUpdate";
/*     */   
/*     */   public static boolean checkAndReset() {
/*  24 */     UpdateSchedule updateSchedule = getUpdateSchedule();
/*  25 */     if (updateSchedule == null || updateSchedule == UpdateSchedule.NEVER) {
/*  26 */       return false;
/*     */     }
/*     */     
/*  29 */     Date lastUpdateCheckDate = getLastUpdateCheckDate();
/*  30 */     if (lastUpdateCheckDate == null || updateSchedule == UpdateSchedule.ON_EVERY_START) {
/*  31 */       checkedForUpdate();
/*  32 */       return true;
/*     */     } 
/*     */ 
/*     */     
/*  36 */     Calendar now = Calendar.getInstance();
/*  37 */     Calendar updateCheck = Calendar.getInstance();
/*  38 */     updateCheck.setTime(lastUpdateCheckDate);
/*  39 */     updateCheck.add(getField(updateSchedule), 1);
/*     */     
/*  41 */     if (updateCheck.before(now)) {
/*  42 */       checkedForUpdate();
/*  43 */       return true;
/*     */     } 
/*     */     
/*  46 */     return false;
/*     */   }
/*     */   
/*     */   private static int getField(UpdateSchedule updateSchedule) {
/*  50 */     if (updateSchedule == UpdateSchedule.DAILY)
/*  51 */       return 5; 
/*  52 */     if (updateSchedule == UpdateSchedule.WEEKLY)
/*  53 */       return 3; 
/*  54 */     if (updateSchedule == UpdateSchedule.MONTHLY) {
/*  55 */       return 2;
/*     */     }
/*  57 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Date getLastUpdateCheckDate() {
/*  62 */     String applicationId = getApplicationId();
/*  63 */     if (applicationId == null) {
/*  64 */       return null;
/*     */     }
/*  66 */     String value = InstallRegistry.getValue("lastUpdate" + applicationId);
/*  67 */     if (value == null) {
/*  68 */       return null;
/*     */     }
/*     */     try {
/*  71 */       return new Date(Long.parseLong(value));
/*  72 */     } catch (NumberFormatException e) {
/*  73 */       e.printStackTrace();
/*  74 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void checkedForUpdate() {
/*  79 */     String applicationId = getApplicationId();
/*  80 */     if (applicationId == null) {
/*     */       return;
/*     */     }
/*  83 */     InstallRegistry.setValue("lastUpdate" + applicationId, String.valueOf((new Date()).getTime()));
/*     */   }
/*     */   
/*     */   public static void setUpdateSchedule(UpdateSchedule updateSchedule) {
/*  87 */     String applicationId = getApplicationId();
/*  88 */     if (applicationId == null) {
/*     */       return;
/*     */     }
/*  91 */     InstallRegistry.setValue("updateSchedule" + applicationId, updateSchedule.getId());
/*     */   }
/*     */   
/*     */   public static UpdateSchedule getUpdateSchedule() {
/*  95 */     String applicationId = getApplicationId();
/*  96 */     if (applicationId == null) {
/*  97 */       return null;
/*     */     }
/*  99 */     return UpdateSchedule.getById(InstallRegistry.getValue("updateSchedule" + applicationId));
/*     */   }
/*     */   
/*     */   public static String getApplicationId() {
/* 103 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/* 104 */     if (installerConfig == null) {
/*     */       try {
/* 106 */         installerConfig = InstallerConfig.getGeneralConfigFromFile(new File(ResourceHelper.getRuntimeDir(), "i4jparams.conf"));
/* 107 */       } catch (IOException e) {
/* 108 */         if (System.getProperty("install4j.launcherId") != null) {
/* 109 */           e.printStackTrace();
/*     */         }
/* 111 */         return null;
/*     */       } 
/*     */     }
/* 114 */     return installerConfig.getApplicationId();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\UpdateScheduleRegistryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */