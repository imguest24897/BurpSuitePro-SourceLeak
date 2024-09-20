/*     */ package com.formdev.flatlaf.extras;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.SystemInfo;
/*     */ import java.awt.Desktop;
/*     */ import java.awt.EventQueue;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Proxy;
/*     */ import java.util.function.Consumer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatDesktop
/*     */ {
/*     */   public static interface QuitResponse
/*     */   {
/*     */     void performQuit();
/*     */     
/*     */     void cancelQuit();
/*     */   }
/*     */   
/*     */   public enum Action
/*     */   {
/*  38 */     APP_ABOUT, APP_PREFERENCES, APP_QUIT_HANDLER;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isSupported(Action action) {
/*  44 */     if (SystemInfo.isJava_9_orLater)
/*     */       try {
/*  46 */         return Desktop.getDesktop().isSupported(Enum.<Desktop.Action>valueOf(Desktop.Action.class, action.name()));
/*  47 */       } catch (Exception ex) {
/*  48 */         LoggingFacade.INSTANCE.logSevere(null, ex);
/*  49 */         return false;
/*     */       }  
/*  51 */     if (SystemInfo.isMacOS) {
/*  52 */       return true;
/*     */     }
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setAboutHandler(Runnable aboutHandler) {
/*     */     String handlerClassName;
/*  69 */     if (!isSupported(Action.APP_ABOUT)) {
/*     */       return;
/*     */     }
/*     */     
/*  73 */     if (SystemInfo.isJava_9_orLater) {
/*  74 */       handlerClassName = "java.awt.desktop.AboutHandler";
/*  75 */     } else if (SystemInfo.isMacOS) {
/*  76 */       handlerClassName = "com.apple.eawt.AboutHandler";
/*     */     } else {
/*     */       return;
/*     */     } 
/*  80 */     setHandler("setAboutHandler", handlerClassName, aboutHandler);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setPreferencesHandler(Runnable preferencesHandler) {
/*     */     String handlerClassName;
/*  95 */     if (!isSupported(Action.APP_PREFERENCES)) {
/*     */       return;
/*     */     }
/*     */     
/*  99 */     if (SystemInfo.isJava_9_orLater) {
/* 100 */       handlerClassName = "java.awt.desktop.PreferencesHandler";
/* 101 */     } else if (SystemInfo.isMacOS) {
/* 102 */       handlerClassName = "com.apple.eawt.PreferencesHandler";
/*     */     } else {
/*     */       return;
/*     */     } 
/* 106 */     setHandler("setPreferencesHandler", handlerClassName, preferencesHandler);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void setHandler(String setHandlerMethodName, String handlerClassName, Runnable handler) {
/*     */     try {
/* 113 */       Object desktopOrApplication = getDesktopOrApplication();
/* 114 */       Class<?> handlerClass = Class.forName(handlerClassName);
/*     */       
/* 116 */       Method m = desktopOrApplication.getClass().getMethod(setHandlerMethodName, new Class[] { handlerClass });
/* 117 */       m.invoke(desktopOrApplication, new Object[] { Proxy.newProxyInstance(FlatDesktop.class.getClassLoader(), new Class[] { handlerClass }, (proxy, method, args) -> {
/*     */                 EventQueue.invokeLater(());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 return null;
/*     */               }) });
/* 128 */     } catch (Exception ex) {
/* 129 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setQuitHandler(Consumer<QuitResponse> quitHandler) {
/*     */     String handlerClassName;
/* 147 */     if (!isSupported(Action.APP_QUIT_HANDLER)) {
/*     */       return;
/*     */     }
/*     */     
/* 151 */     if (SystemInfo.isJava_9_orLater) {
/* 152 */       handlerClassName = "java.awt.desktop.QuitHandler";
/* 153 */     } else if (SystemInfo.isMacOS) {
/* 154 */       handlerClassName = "com.apple.eawt.QuitHandler";
/*     */     } else {
/*     */       return;
/*     */     } 
/*     */     try {
/* 159 */       Object desktopOrApplication = getDesktopOrApplication();
/* 160 */       Class<?> handlerClass = Class.forName(handlerClassName);
/*     */       
/* 162 */       Method m = desktopOrApplication.getClass().getMethod("setQuitHandler", new Class[] { handlerClass });
/* 163 */       m.invoke(desktopOrApplication, new Object[] { Proxy.newProxyInstance(FlatDesktop.class.getClassLoader(), new Class[] { handlerClass }, (proxy, method, args) -> {
/*     */                 final Object response = args[1];
/*     */ 
/*     */                 
/*     */                 final String responseClass = SystemInfo.isJava_9_orLater ? "java.awt.desktop.QuitResponse" : "com.apple.eawt.QuitResponse";
/*     */                 
/*     */                 quitHandler.accept(new QuitResponse()
/*     */                     {
/*     */                       public void performQuit()
/*     */                       {
/*     */                         try {
/* 174 */                           Class.forName(responseClass).getMethod("performQuit", new Class[0]).invoke(response, new Object[0]);
/* 175 */                         } catch (Exception ex) {
/* 176 */                           LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */                         } 
/*     */                       }
/*     */ 
/*     */                       
/*     */                       public void cancelQuit() {
/*     */                         try {
/* 183 */                           Class.forName(responseClass).getMethod("cancelQuit", new Class[0]).invoke(response, new Object[0]);
/* 184 */                         } catch (Exception ex) {
/* 185 */                           LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */                         } 
/*     */                       }
/*     */                     });
/*     */                 
/*     */                 return null;
/*     */               }) });
/* 192 */     } catch (Exception ex) {
/* 193 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Object getDesktopOrApplication() throws Exception {
/* 198 */     if (SystemInfo.isJava_9_orLater)
/* 199 */       return Desktop.getDesktop(); 
/* 200 */     if (SystemInfo.isMacOS) {
/*     */       try {
/* 202 */         Class<?> cls = Class.forName("com.apple.eawt.Application");
/* 203 */         return cls.getMethod("getApplication", new Class[0]).invoke(null, new Object[0]);
/* 204 */       } catch (Exception ex) {
/* 205 */         LoggingFacade.INSTANCE.logSevere(null, ex);
/* 206 */         throw new UnsupportedOperationException();
/*     */       } 
/*     */     }
/* 209 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatlaf\extras\FlatDesktop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */