/*    */ package com.install4j.runtime.installer.frontend.headless;
/*    */ 
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.UninstallerContextImpl;
/*    */ 
/*    */ public class UninstallerUnattendedScreenExecutor extends UnattendedScreenExecutor {
/*    */   public UninstallerUnattendedScreenExecutor(boolean quietOverwrite, boolean noFileFailures, int wait, String splash, boolean unattendedAlerts) {
/*  8 */     super(quietOverwrite, noFileFailures, wait, splash, unattendedAlerts, false, null);
/*    */   }
/*    */ 
/*    */   
/*    */   protected ContextImpl createContext() {
/* 13 */     return (ContextImpl)new UninstallerContextImpl(this);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\headless\UninstallerUnattendedScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */