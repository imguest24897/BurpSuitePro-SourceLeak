/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.comm.CommunicationBackend;
/*     */ import com.install4j.runtime.installer.helper.comm.InterProcessCommunication;
/*     */ 
/*     */ 
/*     */ public class Win32CommunicationBackend
/*     */   implements CommunicationBackend
/*     */ {
/*     */   private static final String LISTENER_READ_SUFFIX = ".r";
/*     */   private static volatile long currentUserSecurityAttributes;
/*     */   private final long securityAttributes;
/*  13 */   private long writeId = getInvalidHandle0();
/*  14 */   private long readId = getInvalidHandle0();
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
/*     */   public Win32CommunicationBackend(boolean currentUserOnly, InterProcessCommunication.ErrorLogger logger) {
/*  31 */     if (currentUserOnly) {
/*  32 */       if (currentUserSecurityAttributes == 0L) {
/*  33 */         currentUserSecurityAttributes = createCurrentUserSecurityAttributes0();
/*     */       }
/*  35 */       if (currentUserSecurityAttributes == 0L) {
/*  36 */         logger.log("could not create current user only security attributes");
/*     */       }
/*  38 */       this.securityAttributes = currentUserSecurityAttributes;
/*     */     } else {
/*  40 */       this.securityAttributes = 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int getCurrentProcessId() {
/*  45 */     return getCurrentProcessId0();
/*     */   }
/*     */   
/*     */   static {
/*  49 */     Common.init();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean writeDataBlock(byte[] bytes) {
/*  54 */     return writeDataBlock0(this.writeId, bytes);
/*     */   }
/*     */ 
/*     */   
/*     */   public byte[] readDataBlock() {
/*  59 */     return readDataBlock0(this.readId);
/*     */   }
/*     */ 
/*     */   
/*     */   public String createListener() {
/*  64 */     for (int i = 0; i < 200; i++) {
/*     */       
/*  66 */       String writeName = "\\\\.\\pipe\\i4jcomm" + i;
/*  67 */       this.writeId = createListener0(writeName, this.securityAttributes);
/*  68 */       if (this.writeId != getInvalidHandle0()) {
/*  69 */         this.readId = createListener0(writeName + ".r", this.securityAttributes);
/*  70 */         if (this.readId == getInvalidHandle0()) {
/*  71 */           closeHandle0(this.writeId);
/*  72 */           this.writeId = getInvalidHandle0();
/*     */         } else {
/*  74 */           return writeName;
/*     */         } 
/*     */       } 
/*     */     } 
/*  78 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean connect(String identifier) {
/*  83 */     if (identifier == null) {
/*  84 */       if (connectNamedPipe0(this.writeId)) {
/*  85 */         if (connectNamedPipe0(this.readId)) {
/*  86 */           return true;
/*     */         }
/*  88 */         disconnectNamedPipe0(this.writeId);
/*     */       } 
/*     */     } else {
/*     */       
/*  92 */       this.readId = connectClient0(identifier);
/*  93 */       if (this.readId != getInvalidHandle0()) {
/*  94 */         this.writeId = connectClient0(identifier + ".r");
/*  95 */         if (this.writeId != getInvalidHandle0()) {
/*  96 */           return true;
/*     */         }
/*  98 */         closeHandle0(this.readId);
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     return false;
/*     */   }
/*     */   
/*     */   static native long getInvalidHandle0();
/*     */   
/*     */   private static native long createListener0(String paramString, long paramLong);
/*     */   
/*     */   static native byte[] readDataBlock0(long paramLong);
/*     */   
/*     */   static native boolean writeDataBlock0(long paramLong, byte[] paramArrayOfbyte);
/*     */   
/*     */   static native long connectClient0(String paramString);
/*     */   
/*     */   private static native boolean connectNamedPipe0(long paramLong);
/*     */   
/*     */   private static native void disconnectNamedPipe0(long paramLong);
/*     */   
/*     */   static native void closeHandle0(long paramLong);
/*     */   
/*     */   private static native long createCurrentUserSecurityAttributes0();
/*     */   
/*     */   private static native boolean isProcessAlive0(int paramInt);
/*     */   
/*     */   private static native int getCurrentProcessId0();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32CommunicationBackend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */