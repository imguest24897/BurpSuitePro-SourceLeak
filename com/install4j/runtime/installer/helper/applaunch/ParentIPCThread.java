/*    */ package com.install4j.runtime.installer.helper.applaunch;
/*    */ 
/*    */ import com.install4j.api.launcher.ApplicationLauncher;
/*    */ import com.install4j.runtime.installer.helper.comm.InterProcessCommunication;
/*    */ import com.install4j.runtime.util.DaemonThreadFactory;
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.ThreadFactory;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ class ParentIPCThread
/*    */   extends Thread {
/*    */   @NotNull
/*    */   private final InterProcessCommunication communication;
/*    */   @NotNull
/*    */   private ApplicationLauncher.ProgressListener progressListener;
/*    */   @NotNull
/*    */   private ShutdownWaiter shutdownWaiter;
/* 22 */   private final ExecutorService executorService = Executors.newSingleThreadExecutor((ThreadFactory)new DaemonThreadFactory("i4j-progress-exec-"));
/*    */   
/*    */   ParentIPCThread(@NotNull InterProcessCommunication communication, @NotNull ShutdownWaiter shutdownWaiter, @NotNull ApplicationLauncher.ProgressListener progressListener) {
/* 25 */     super("_i4j_ipc_thread");
/* 26 */     setDaemon(true);
/* 27 */     setPriority(4);
/* 28 */     this.communication = communication;
/* 29 */     this.progressListener = progressListener;
/* 30 */     this.shutdownWaiter = shutdownWaiter;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/*    */     try {
/* 36 */       if (this.communication.connect()) {
/* 37 */         CommType[] commTypes = CommType.values();
/* 38 */         while (!this.shutdownWaiter.isExitCalled()) {
/* 39 */           byte[] data = this.communication.readDataBlock();
/* 40 */           DataInputStream din = new DataInputStream(new ByteArrayInputStream(data));
/* 41 */           int typeOrdinal = din.readInt();
/* 42 */           if (typeOrdinal >= 0 && typeOrdinal < commTypes.length) {
/* 43 */             String id; String message; int value; boolean indeterminateProgress; switch (commTypes[typeOrdinal]) {
/*    */               case EXITING:
/*    */                 return;
/*    */               case SHOW_SCREEN:
/* 47 */                 id = din.readUTF();
/* 48 */                 this.executorService.execute(() -> this.progressListener.screenActivated(id));
/*    */ 
/*    */               
/*    */               case EXECUTE_ACTION:
/* 52 */                 id = din.readUTF();
/* 53 */                 this.executorService.execute(() -> this.progressListener.actionStarted(id));
/*    */ 
/*    */               
/*    */               case STATUS_MESSAGE:
/* 57 */                 message = din.readUTF();
/* 58 */                 this.executorService.execute(() -> this.progressListener.statusMessage(message));
/*    */ 
/*    */               
/*    */               case DETAIL_MESSAGE:
/* 62 */                 message = din.readUTF();
/* 63 */                 this.executorService.execute(() -> this.progressListener.detailMessage(message));
/*    */ 
/*    */               
/*    */               case PERCENTAGE_COMPLETED:
/* 67 */                 value = din.readInt();
/* 68 */                 this.executorService.execute(() -> this.progressListener.percentCompleted(value));
/*    */ 
/*    */               
/*    */               case SECONDARY_PERCENTAGE_COMPLETED:
/* 72 */                 value = din.readInt();
/* 73 */                 this.executorService.execute(() -> this.progressListener.secondaryPercentCompleted(value));
/*    */ 
/*    */               
/*    */               case INDETERMINATE_PROGRESS:
/* 77 */                 indeterminateProgress = din.readBoolean();
/* 78 */                 this.executorService.execute(() -> this.progressListener.indeterminateProgress(indeterminateProgress));
/*    */             } 
/*    */ 
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/* 85 */     } catch (IOException iOException) {}
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\ParentIPCThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */