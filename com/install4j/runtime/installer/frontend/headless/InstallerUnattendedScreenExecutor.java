/*    */ package com.install4j.runtime.installer.frontend.headless;
/*    */ 
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.InstallerContextImpl;
/*    */ import java.awt.Window;
/*    */ 
/*    */ public class InstallerUnattendedScreenExecutor
/*    */   extends UnattendedScreenExecutor {
/*    */   public InstallerUnattendedScreenExecutor(boolean quietOverwrite, boolean noFileFailures, int wait, String splash, boolean unattendedAlerts, boolean dialog, Window parentWindow) {
/* 10 */     super(quietOverwrite, noFileFailures, wait, splash, unattendedAlerts, dialog, parentWindow);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ContextImpl createContext() {
/* 15 */     return (ContextImpl)new InstallerContextImpl(this);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\headless\InstallerUnattendedScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */