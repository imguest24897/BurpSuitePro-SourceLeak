/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ abstract class FileInstallerState implements Serializable {
/*     */   private transient boolean respondedOverwriteNever = false;
/*     */   private transient boolean respondedOverwriteAlways = false;
/*  19 */   protected transient int currentId = 0;
/*  20 */   protected transient int maxId = 0;
/*     */   
/*  22 */   private static FileInstallerState instance = HelperCommunication.getInstance().isElevatedHelper() ? new HelperFileInstallerState() : new MainFileInstallerState();
/*  23 */   private Set<Integer> rolledBackIds = new HashSet<>();
/*     */   
/*     */   public static FileInstallerState getInstance() {
/*  26 */     return instance;
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
/*     */   public boolean isRespondedOverwriteNever() {
/*  58 */     return this.respondedOverwriteNever;
/*     */   }
/*     */   
/*     */   public boolean isRespondedOverwriteAlways() {
/*  62 */     return this.respondedOverwriteAlways;
/*     */   }
/*     */   
/*     */   public void setRespondedOverwriteNever(final boolean respondedOverwriteNever) {
/*  66 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  69 */             (FileInstallerState.getInstance()).respondedOverwriteNever = respondedOverwriteNever;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void setRespondedOverwriteAlways(final boolean respondedOverwriteAlways) {
/*  75 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  78 */             (FileInstallerState.getInstance()).respondedOverwriteAlways = respondedOverwriteAlways;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void setRollbackIds(final int currentId, final int maxId) {
/*  84 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  87 */             (FileInstallerState.getInstance()).currentId = currentId;
/*  88 */             (FileInstallerState.getInstance()).maxId = maxId;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public Set<Integer> getRolledBackIds() {
/*  94 */     return this.rolledBackIds;
/*     */   }
/*     */   
/*     */   public void addRolledBackId(final int id) {
/*  98 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 101 */             for (int i = id; i <= FileInstallerState.this.maxId; i++)
/* 102 */               (FileInstallerState.getInstance()).rolledBackIds.add(Integer.valueOf(i)); 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public abstract void setRollbackBarrier();
/*     */   
/*     */   public abstract void setLogDir(File paramFile);
/*     */   
/*     */   public abstract void writeLog() throws IOException, UserCanceledException;
/*     */   
/*     */   public abstract boolean wasPreviouslyCreated(File paramFile);
/*     */   
/*     */   public abstract boolean hasRollbackFiles();
/*     */   
/*     */   public abstract boolean hasUnrollbackedFiles();
/*     */   
/*     */   public abstract void addReplacedFile(BackupPair paramBackupPair);
/*     */   
/*     */   public abstract void addCreatedDir(InstallFile paramInstallFile);
/*     */   
/*     */   public abstract void registerCleanupFile(File paramFile);
/*     */   
/*     */   public abstract void registerPreUninstallCommand(File paramFile, boolean paramBoolean, String paramString, String[] paramArrayOfString);
/*     */   
/*     */   public abstract void addCreatedFile(InstallFile paramInstallFile, boolean paramBoolean);
/*     */   
/*     */   public abstract FileLogger getRollbackFileLogger();
/*     */   
/*     */   public abstract List<BackupPair> getReplacedFiles();
/*     */   
/*     */   public abstract List<File> getCleanupFiles();
/*     */   
/*     */   public abstract boolean isCurrentRebootRequired();
/*     */   
/*     */   public abstract void setCurrentRebootRequired(boolean paramBoolean);
/*     */   
/*     */   public abstract void setFileRollbackPerformed(boolean paramBoolean);
/*     */   
/*     */   public abstract boolean isFileRollbackPerformed();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\FileInstallerState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */