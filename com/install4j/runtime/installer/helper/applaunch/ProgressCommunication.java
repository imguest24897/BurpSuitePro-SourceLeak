/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UnattendedProgressInterface;
/*    */ import com.install4j.api.launcher.ApplicationLauncher;
/*    */ import com.install4j.runtime.installer.helper.comm.InterProcessCommunication;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public abstract class ProgressCommunication
/*    */   implements ApplicationLauncher.ProgressListener {
/*    */   private static volatile ProgressCommunication progressCommunication;
/*    */   
/*    */   @NotNull
/*    */   public static ProgressCommunication getCurrent() {
/* 16 */     ProgressCommunication progressCommunication = ProgressCommunication.progressCommunication;
/* 17 */     if (progressCommunication == null) {
/* 18 */       return NullCommunication.INSTANCE;
/*    */     }
/* 20 */     return progressCommunication;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void registerInProcess(@Nullable ApplicationLauncher.ProgressListener progressListener) {
/* 25 */     if (progressListener == null) {
/* 26 */       progressCommunication = NullCommunication.INSTANCE;
/*    */     } else {
/* 28 */       progressCommunication = new InProcessCommunication(progressListener);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void init() {
/*    */     try {
/* 34 */       String id = System.getProperty("install4j.progressId");
/* 35 */       String hash = System.getProperty("install4j.progressHash");
/* 36 */       if (id != null && hash != null) {
/* 37 */         InterProcessCommunication communication = new InterProcessCommunication(id, hash, true, InterProcessCommunication.INSTALLER_APP_LOGGER);
/* 38 */         Thread thread = new Thread(() -> {
/*    */               try {
/*    */                 if (communication.connect()) {
/*    */                   progressCommunication = new RemoteCommunication(communication);
/*    */                 }
/* 43 */               } catch (Throwable t) {
/*    */                 t.printStackTrace();
/*    */               } 
/*    */             });
/* 47 */         thread.setDaemon(true);
/* 48 */         thread.start();
/* 49 */         thread.join(4000L);
/*    */       } 
/* 51 */     } catch (Throwable t) {
/* 52 */       t.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   public ProgressInterface wrap(ProgressInterface progressInterface) {
/* 57 */     if (progressInterface == null)
/* 58 */       return null; 
/* 59 */     if (progressInterface instanceof UnattendedProgressInterface) {
/* 60 */       return new UnattendedProgressInterfaceWrapper((UnattendedProgressInterface)progressInterface, this);
/*    */     }
/* 62 */     return new ProgressInterfaceWrapper(progressInterface, this);
/*    */   }
/*    */ 
/*    */   
/*    */   public final UnattendedProgressInterface wrap(UnattendedProgressInterface progressInterface) {
/* 67 */     return (UnattendedProgressInterface)wrap((ProgressInterface)progressInterface);
/*    */   }
/*    */   
/*    */   public abstract void exiting();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\ProgressCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */