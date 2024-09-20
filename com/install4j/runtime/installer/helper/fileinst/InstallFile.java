/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ 
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import java.io.File;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ class InstallFile
/*     */   extends File {
/*     */   private boolean shared = false;
/*  15 */   private UninstallMode uninstallMode = UninstallMode.IF_CREATED;
/*     */   
/*     */   private int rollbackId;
/*     */   private List<Command> preUninstallCommands;
/*     */   
/*     */   public InstallFile(File file, boolean shared) {
/*  21 */     super(file.getParent(), file.getName());
/*  22 */     this.shared = shared;
/*     */   }
/*     */   
/*     */   public InstallFile(File file, boolean shared, UninstallMode uninstallMode) {
/*  26 */     super(file.getParent(), file.getName());
/*  27 */     this.shared = shared;
/*  28 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */   
/*     */   public InstallFile(String pathname, boolean shared, UninstallMode uninstallMode) {
/*  32 */     super(pathname);
/*  33 */     this.shared = shared;
/*  34 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */   
/*     */   public InstallFile(String parent, String child, boolean shared, UninstallMode uninstallMode) {
/*  38 */     super(parent, child);
/*  39 */     this.shared = shared;
/*  40 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */   
/*     */   public InstallFile(File parent, String child, boolean shared, UninstallMode uninstallMode) {
/*  44 */     super(parent, child);
/*  45 */     this.shared = shared;
/*  46 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */   
/*     */   public InstallFile(String pathname) {
/*  50 */     super(pathname);
/*     */   }
/*     */   
/*     */   public InstallFile(String parent, String child) {
/*  54 */     super(parent, child);
/*     */   }
/*     */   
/*     */   public InstallFile(File parent, String child) {
/*  58 */     super(parent, child);
/*     */   }
/*     */   
/*     */   public int getRollbackId() {
/*  62 */     return this.rollbackId;
/*     */   }
/*     */   
/*     */   public void setRollbackId(int rollbackId) {
/*  66 */     this.rollbackId = rollbackId;
/*     */   }
/*     */   
/*     */   public boolean isShared() {
/*  70 */     return this.shared;
/*     */   }
/*     */   
/*     */   public void setShared(boolean shared) {
/*  74 */     this.shared = shared;
/*     */   }
/*     */   
/*     */   public UninstallMode getUninstallMode() {
/*  78 */     return this.uninstallMode;
/*     */   }
/*     */   
/*     */   public void setUninstallMode(UninstallMode uninstallMode) {
/*  82 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */   
/*     */   public boolean checkUninstall(boolean uninstallForUpgrade) {
/*  86 */     if (this.uninstallMode == UninstallMode.NEVER) {
/*  87 */       return false;
/*     */     }
/*  89 */     if (uninstallForUpgrade && (this.uninstallMode == UninstallMode.IF_CREATED_BUT_NOT_FOR_UPDATE || this.uninstallMode == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE))
/*     */     {
/*     */       
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     return true;
/*     */   }
/*     */   
/*     */   public List<Command> getPreUninstallCommands() {
/*  99 */     return (this.preUninstallCommands == null) ? Collections.<Command>emptyList() : this.preUninstallCommands;
/*     */   }
/*     */   
/*     */   public void addPreUninstallCommand(Command command) {
/* 103 */     if (this.preUninstallCommands == null) {
/* 104 */       this.preUninstallCommands = new ArrayList<>();
/*     */     }
/* 106 */     if (!this.preUninstallCommands.contains(command)) {
/* 107 */       this.preUninstallCommands.add(command);
/*     */     }
/*     */   }
/*     */   
/*     */   public void updatePreUninstallCommands(List<Command> preUninstallCommands) {
/* 112 */     if (preUninstallCommands != null && preUninstallCommands.isEmpty()) {
/* 113 */       this.preUninstallCommands = null;
/*     */     } else {
/* 115 */       this.preUninstallCommands = preUninstallCommands;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class Command
/*     */     implements Serializable
/*     */   {
/*     */     private final boolean adminRights;
/*     */     
/*     */     public Command(boolean adminRights, String executable, @NotNull String[] arguments) {
/* 125 */       this.adminRights = adminRights;
/* 126 */       this.executable = executable;
/* 127 */       this.arguments = arguments;
/*     */     } private final String executable; @NotNull
/*     */     private final String[] arguments;
/*     */     public boolean isAdminRights() {
/* 131 */       return this.adminRights;
/*     */     }
/*     */     
/*     */     public String getExecutable() {
/* 135 */       return this.executable;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String[] getArguments() {
/* 140 */       return this.arguments;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object o) {
/* 145 */       if (this == o) return true; 
/* 146 */       if (o == null || getClass() != o.getClass()) return false;
/*     */       
/* 148 */       Command command = (Command)o;
/*     */       
/* 150 */       if (this.adminRights != command.adminRights) return false; 
/* 151 */       if (!this.executable.equals(command.executable)) return false;
/*     */       
/* 153 */       if (!Arrays.equals((Object[])this.arguments, (Object[])command.arguments)) return false;
/*     */       
/* 155 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 160 */       int result = this.adminRights ? 1 : 0;
/* 161 */       result = 31 * result + this.executable.hashCode();
/* 162 */       result = 31 * result + Arrays.hashCode((Object[])this.arguments);
/* 163 */       return result;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\InstallFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */