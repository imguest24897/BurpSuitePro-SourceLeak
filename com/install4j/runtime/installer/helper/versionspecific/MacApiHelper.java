/*    */ package com.install4j.runtime.installer.helper.versionspecific;
/*    */ 
/*    */ import com.apple.eawt.AppEvent;
/*    */ import com.apple.eawt.Application;
/*    */ import com.apple.eawt.QuitResponse;
/*    */ import com.install4j.api.launcher.StartupNotification;
/*    */ import java.io.File;
/*    */ import java.net.URI;
/*    */ 
/*    */ class MacApiHelper {
/*    */   static void requestForeground() {
/* 12 */     Application.getApplication().requestForeground(true);
/*    */   }
/*    */   
/*    */   static void setMacStartupListener(StartupNotification.Listener startupListener) {
/*    */     try {
/* 17 */       if (startupListener != null) {
/* 18 */         Application.getApplication().setOpenFileHandler(openFilesEvent -> {
/*    */               for (File file : openFilesEvent.getFiles()) {
/*    */                 startupListener.startupPerformed(file.getAbsolutePath());
/*    */               }
/*    */             });
/* 23 */         Application.getApplication().setOpenURIHandler(openURIEvent -> {
/*    */               URI uri = openURIEvent.getURI();
/*    */               if (uri != null) {
/*    */                 startupListener.startupPerformed(uri.toString());
/*    */               }
/*    */             });
/*    */       } 
/* 30 */     } catch (Throwable t) {
/* 31 */       t.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   static void setMacHandleQuit(boolean handleQuit) {
/*    */     try {
/* 38 */       Application.getApplication().setQuitHandler((quitEvent, quitResponse) -> {
/*    */             if (handleQuit) {
/*    */               quitResponse.performQuit();
/*    */             } else {
/*    */               quitResponse.cancelQuit();
/*    */             } 
/*    */           });
/* 45 */     } catch (Throwable t) {
/* 46 */       t.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   static void setMacQuitHandler(Runnable runnable) {
/*    */     try {
/* 52 */       if (runnable != null) {
/* 53 */         Application.getApplication().setQuitHandler((quitEvent, quitResponse) -> {
/*    */               quitResponse.cancelQuit();
/*    */               runnable.run();
/*    */             });
/*    */       }
/* 58 */     } catch (Throwable t) {
/* 59 */       t.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   static void setMacAboutHandler(Runnable runnable) {
/*    */     try {
/* 65 */       if (runnable != null) {
/* 66 */         Application.getApplication().setAboutHandler(aboutEvent -> runnable.run());
/*    */       }
/* 68 */     } catch (Throwable t) {
/* 69 */       t.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   static void setMacPreferencesHandler(Runnable runnable) {
/*    */     try {
/* 75 */       if (runnable != null) {
/* 76 */         Application.getApplication().setPreferencesHandler(preferencesEvent -> runnable.run());
/*    */       }
/* 78 */     } catch (Throwable t) {
/* 79 */       t.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\MacApiHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */