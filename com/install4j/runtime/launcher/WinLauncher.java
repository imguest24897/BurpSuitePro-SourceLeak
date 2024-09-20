/*    */ package com.install4j.runtime.launcher;
/*    */ 
/*    */ import com.exe4j.runtime.util.WinDel;
/*    */ import com.install4j.runtime.installer.platform.win32.Win32Exec;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WinLauncher
/*    */ {
/*    */   public static void main(String[] args) {
/* 14 */     LauncherHelper.INSTANCE.initIntegration();
/* 15 */     if (com.exe4j.runtime.WinLauncher.isService()) {
/* 16 */       LauncherHelper.INSTANCE.setUnattended(true);
/*    */     }
/* 18 */     WinDel.setLauncher(new WinDel.Launcher()
/*    */         {
/*    */           public void launch(String... command) throws IOException {
/* 21 */             Win32Exec.launch(command);
/*    */           }
/*    */         });
/* 24 */     args = LauncherHelper.INSTANCE.initVariables(WinLauncher.class, args);
/* 25 */     com.exe4j.runtime.WinLauncher.main(args);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\WinLauncher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */