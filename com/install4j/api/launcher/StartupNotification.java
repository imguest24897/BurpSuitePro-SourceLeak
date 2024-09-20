/*    */ package com.install4j.api.launcher;
/*    */ 
/*    */ import com.exe4j.Controller;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*    */ import com.install4j.runtime.launcher.util.SingleInstance;
/*    */ import java.util.EventListener;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StartupNotification
/*    */ {
/*    */   private static Listener listener;
/*    */   
/*    */   public static void registerStartupListener(Listener listener) {
/* 39 */     if (InstallerUtil.isWindows()) {
/* 40 */       StartupNotification.listener = listener;
/* 41 */       if (listener != null) {
/* 42 */         Controller.registerStartupListener(new ListenerAdapter());
/*    */       }
/* 44 */     } else if (InstallerUtil.isMacOS()) {
/* 45 */       VersionSpecificHelper.setMacStartupListener(listener);
/*    */     } else {
/* 47 */       Objects.requireNonNull(listener); SingleInstance.registerStartupListener(listener::startupPerformed);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void setHandleQuit(boolean handleQuit) {
/* 58 */     if (InstallerUtil.isMacOS()) {
/* 59 */       VersionSpecificHelper.setMacHandleQuit(handleQuit);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static class ListenerAdapter
/*    */     implements Controller.StartupListener
/*    */   {
/*    */     private ListenerAdapter() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void startupPerformed(String parameters) {
/* 86 */       if (StartupNotification.listener != null)
/* 87 */         StartupNotification.listener.startupPerformed(parameters); 
/*    */     }
/*    */   }
/*    */   
/*    */   public static interface Listener extends EventListener {
/*    */     void startupPerformed(String param1String);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\launcher\StartupNotification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */