/*    */ package com.install4j.runtime.installer.frontend.headless;
/*    */ 
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.InstallerContextImpl;
/*    */ 
/*    */ public class InstallerConsoleScreenExecutor
/*    */   extends ConsoleScreenExecutor
/*    */ {
/*    */   protected ContextImpl createContext() {
/* 10 */     return (ContextImpl)new InstallerContextImpl(this);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\headless\InstallerConsoleScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */