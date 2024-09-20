/*     */ package com.install4j.api.update;
/*     */ 
/*     */ import com.install4j.api.beans.ErrorHandlingCallback;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.apiimpl.UpdateCheckerImpl;
/*     */ import com.install4j.runtime.launcher.integration.AutomaticUpdate;
/*     */ import com.install4j.runtime.launcher.integration.UpdateExecutionConfig;
/*     */ import com.install4j.runtime.util.VersionCheck;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UpdateChecker
/*     */ {
/*     */   public static UpdateDescriptor getUpdateDescriptor(String urlSpec, ApplicationDisplayMode displayMode) throws UserCanceledException, IOException {
/*  37 */     return getUpdateDescriptor(urlSpec, displayMode, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static UpdateDescriptor getUpdateDescriptor(String urlSpec, ApplicationDisplayMode displayMode, ErrorHandlingCallback errorHandlingCallback) throws UserCanceledException, IOException {
/*  50 */     UpdateCheckRequest updateCheckRequest = (new UpdateCheckRequest(urlSpec)).applicationDisplayMode(displayMode).errorHandlingCallback(errorHandlingCallback);
/*  51 */     return getUpdateDescriptor(updateCheckRequest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static UpdateDescriptor getUpdateDescriptor(UpdateCheckRequest updateCheckRequest) throws UserCanceledException, IOException {
/*  65 */     return UpdateCheckerImpl.getUpdateDescriptor(updateCheckRequest);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isUpdateScheduled() {
/*  77 */     return AutomaticUpdate.isScheduled(null, true, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void executeScheduledUpdate(List<String> updaterArguments, boolean restartLauncher, Runnable shutdownRunnable) {
/*  92 */     executeScheduledUpdate(updaterArguments, restartLauncher, null, shutdownRunnable);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void executeScheduledUpdate(List<String> updaterArguments, boolean restartLauncher, List<String> launcherArguments, Runnable shutdownRunnable) {
/* 106 */     AutomaticUpdate.checkUpdates((launcherArguments == null || launcherArguments.isEmpty()) ? null : launcherArguments.<String>toArray(new String[0]), new UpdateExecutionConfig(updaterArguments), restartLauncher, shutdownRunnable);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isVersionLessThanOrEqual(String expectedLowerVersion, String expectedHigherVersion) {
/* 119 */     return VersionCheck.checkCompatible(expectedLowerVersion, expectedHigherVersion);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isVersionGreaterThan(String expectedHigherVersion, String expectedLowerVersion) {
/* 132 */     return (!Objects.equals(expectedLowerVersion, expectedHigherVersion) && isVersionLessThanOrEqual(expectedLowerVersion, expectedHigherVersion));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\UpdateChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */