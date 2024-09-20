/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class RequireInstallerPrivilegesAction
/*    */   extends AbstractPrivilegesAction
/*    */ {
/*    */   private boolean failIfNotObtained = true;
/*    */   
/*    */   public boolean isFailIfNotObtained() {
/* 15 */     return replaceWithTextOverride("failIfNotObtained", this.failIfNotObtained);
/*    */   }
/*    */   
/*    */   public void setFailIfNotObtained(boolean failIfNotObtained) {
/* 19 */     this.failIfNotObtained = failIfNotObtained;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 24 */     boolean adminRightsRequired = Objects.equals(Boolean.TRUE, InstallerVariables.getVariable("sys.adminRights"));
/* 25 */     if (adminRightsRequired && (!Util.isAdminGroup() || !Util.hasFullAdminRights())) {
/* 26 */       if (Util.isWindows())
/* 27 */         return handleResult(startOnWindows(context), context); 
/* 28 */       if (Util.isMacOS())
/* 29 */         return handleResult(startOnMac(context), context); 
/* 30 */       if (RequestPrivilegesAction.isLinuxPrivilegeHandling()) {
/* 31 */         boolean success = false;
/* 32 */         if (!Objects.equals(Boolean.TRUE, InstallerVariables.getVariable("sys.adminRightsUiRootUnix"))) {
/* 33 */           success = startOnLinux(context);
/*    */         }
/* 35 */         return handleResult(success, context);
/*    */       } 
/* 37 */       return handleResult(false, context);
/*    */     } 
/*    */     
/* 40 */     return true;
/*    */   }
/*    */   
/*    */   private boolean handleResult(boolean success, Context context) throws UserCanceledException {
/* 44 */     setAdminRightsVariable();
/* 45 */     if (!success && isFailIfNotObtained()) {
/* 46 */       showFailureMessage(context);
/*    */     }
/* 48 */     return success;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\RequireInstallerPrivilegesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */