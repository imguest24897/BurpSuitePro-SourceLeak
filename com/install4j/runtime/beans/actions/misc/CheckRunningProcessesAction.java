/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.helper.RunningProcessChecker;
/*    */ import java.io.File;
/*    */ 
/*    */ public class CheckRunningProcessesAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/* 13 */   private String message = "${i18n:AppRunningError(\"install4j\", \"${compiler:sys.fullName}\")}";
/* 14 */   private CloseStrategy closeStrategy = CloseStrategy.ASK_FOR_CLOSE;
/*    */   
/* 16 */   private int timeOut = 5000;
/*    */   
/*    */   private boolean includeLaunchers = true;
/*    */   
/*    */   private boolean allowIgnore = false;
/*    */   private File[] additionalExecutables;
/*    */   
/*    */   public String getMessage() {
/* 24 */     return replaceVariables(replaceVariables(this.message));
/*    */   }
/*    */   
/*    */   public void setMessage(String message) {
/* 28 */     this.message = message;
/*    */   }
/*    */   
/*    */   public CloseStrategy getCloseStrategy() {
/* 32 */     return (CloseStrategy)replaceWithTextOverride("closeStrategy", this.closeStrategy, CloseStrategy.class);
/*    */   }
/*    */   
/*    */   public void setCloseStrategy(CloseStrategy closeStrategy) {
/* 36 */     this.closeStrategy = closeStrategy;
/*    */   }
/*    */   
/*    */   public int getTimeOut() {
/* 40 */     return replaceWithTextOverride("timeOut", this.timeOut);
/*    */   }
/*    */   
/*    */   public void setTimeOut(int timeOut) {
/* 44 */     this.timeOut = timeOut;
/*    */   }
/*    */   
/*    */   public boolean isIncludeLaunchers() {
/* 48 */     return replaceWithTextOverride("includeLaunchers", this.includeLaunchers);
/*    */   }
/*    */   
/*    */   public void setIncludeLaunchers(boolean includeLaunchers) {
/* 52 */     this.includeLaunchers = includeLaunchers;
/*    */   }
/*    */   
/*    */   public boolean isAllowIgnore() {
/* 56 */     return replaceWithTextOverride("allowIgnore", this.allowIgnore);
/*    */   }
/*    */   
/*    */   public void setAllowIgnore(boolean allowIgnore) {
/* 60 */     this.allowIgnore = allowIgnore;
/*    */   }
/*    */   
/*    */   public File[] getAdditionalExecutables() {
/* 64 */     return (File[])replaceWithTextOverride("additionalExecutables", replaceVariables(this.additionalExecutables), File[].class);
/*    */   }
/*    */   
/*    */   public void setAdditionalExecutables(File[] additionalExecutables) {
/* 68 */     this.additionalExecutables = additionalExecutables;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 73 */     if (!Util.isWindows() && !Util.isMacOS()) {
/* 74 */       return true;
/*    */     }
/* 76 */     return RunningProcessChecker.checkRunningProcesses(getMessage(), getCloseStrategy().getType(), getTimeOut(), isAllowIgnore(), isIncludeLaunchers(), getAdditionalExecutables());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 81 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\CheckRunningProcessesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */