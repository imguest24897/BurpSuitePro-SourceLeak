/*     */ package com.install4j.runtime.installer.helper.applaunch;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.comm.InterProcessCommunication;
/*     */ import com.install4j.runtime.util.DaemonThreadFactory;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.concurrent.ExecutorService;
/*     */ import java.util.concurrent.Executors;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ 
/*     */ class RemoteCommunication extends ProgressCommunication {
/*     */   private final InterProcessCommunication communication;
/*  15 */   private final ExecutorService executorService = Executors.newSingleThreadExecutor((ThreadFactory)new DaemonThreadFactory("progress-comm-"));
/*     */   
/*     */   public RemoteCommunication(InterProcessCommunication communication) {
/*  18 */     this.communication = communication;
/*     */   }
/*     */ 
/*     */   
/*     */   public void exiting() {
/*  23 */     submit(new Event(CommType.EXITING, null));
/*  24 */     this.executorService.shutdown();
/*     */     try {
/*  26 */       this.executorService.awaitTermination(2L, TimeUnit.SECONDS);
/*  27 */     } catch (InterruptedException e) {
/*  28 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void screenActivated(String id) {
/*  34 */     submit(new Event(CommType.SHOW_SCREEN, id));
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionStarted(String id) {
/*  39 */     submit(new Event(CommType.EXECUTE_ACTION, id));
/*     */   }
/*     */ 
/*     */   
/*     */   public void statusMessage(String message) {
/*  44 */     submit(new Event(CommType.STATUS_MESSAGE, message));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void detailMessage(String message) {
/*  50 */     submit(new Event(CommType.DETAIL_MESSAGE, message));
/*     */   }
/*     */ 
/*     */   
/*     */   public void percentCompleted(int value) {
/*  55 */     submit(new Event(CommType.PERCENTAGE_COMPLETED, Integer.valueOf(value)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void secondaryPercentCompleted(int value) {
/*  60 */     submit(new Event(CommType.SECONDARY_PERCENTAGE_COMPLETED, Integer.valueOf(value)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void indeterminateProgress(boolean indeterminateProgress) {
/*  65 */     submit(new Event(CommType.INDETERMINATE_PROGRESS, Boolean.valueOf(indeterminateProgress)));
/*     */   }
/*     */   
/*     */   private void submit(Event event) {
/*  69 */     this.executorService.submit(() -> {
/*     */           if (this.communication.isConnected()) {
/*     */             try {
/*     */               this.communication.writeDataBlock(event.getData());
/*  73 */             } catch (IOException iOException) {}
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Event
/*     */   {
/*     */     private final CommType type;
/*     */     private final Object parameter;
/*     */     
/*     */     public Event(CommType type, Object parameter) {
/*  85 */       this.type = type;
/*  86 */       this.parameter = parameter;
/*     */     }
/*     */     
/*     */     public byte[] getData() {
/*  90 */       ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/*  91 */       DataOutputStream out = new DataOutputStream(byteArrayOutputStream);
/*     */       try {
/*  93 */         out.writeInt(this.type.ordinal());
/*  94 */         if (this.parameter instanceof String) {
/*  95 */           out.writeUTF((String)this.parameter);
/*  96 */         } else if (this.parameter instanceof Integer) {
/*  97 */           out.writeInt(((Integer)this.parameter).intValue());
/*  98 */         } else if (this.parameter instanceof Boolean) {
/*  99 */           out.writeBoolean(((Boolean)this.parameter).booleanValue());
/*     */         } 
/* 101 */       } catch (IOException e) {
/* 102 */         e.printStackTrace();
/*     */       } 
/* 104 */       return byteArrayOutputStream.toByteArray();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\RemoteCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */