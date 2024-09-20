/*    */ package com.install4j.runtime.beans.applications;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ public class UninstallerApplication
/*    */   extends ApplicationWithPath
/*    */   implements SystemApplication
/*    */ {
/*    */   public UninstallerApplication() {
/* 10 */     setExecutableName("uninstall");
/* 11 */     setExecutableDirectory(new File("."));
/*    */   }
/*    */ 
/*    */   
/*    */   protected String getDefaultUnixMode() {
/* 16 */     return "700";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getApplicationMode() {
/* 21 */     return "uninstaller";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\UninstallerApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */