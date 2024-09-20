/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ 
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class ServiceFile
/*    */   extends UnixConfigFile
/*    */ {
/*    */   private static final String GROUP_UNIT = "Unit";
/*    */   private static final String GROUP_SERVICE = "Service";
/*    */   private static final String GROUP_INSTALL = "Install";
/*    */   
/*    */   public ServiceFile() {}
/*    */   
/*    */   public ServiceFile(String target, String description, boolean useExec) {
/* 15 */     String wantedBy = "multi-user.target graphical.target";
/*    */     
/* 17 */     add("Unit", "Description", description);
/* 18 */     add("Unit", "Before", wantedBy);
/* 19 */     add("Unit", "After", "network-online.target remote-fs.target time-sync.target");
/* 20 */     add("Unit", "Wants", "network-online.target");
/* 21 */     add("Service", "Type", useExec ? "exec" : "simple");
/* 22 */     if (!target.startsWith("\"")) {
/* 23 */       target = "\"" + target + "\"";
/*    */     }
/* 25 */     add("Service", "ExecStart", target + " start-launchd");
/* 26 */     add("Service", "SuccessExitStatus", "0 143");
/* 27 */     add("Service", "KillMode", "process");
/* 28 */     add("Install", "WantedBy", wantedBy);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected UnixConfigFile.Group getMainGroup() {
/* 34 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isUniqueKeys() {
/* 39 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\ServiceFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */