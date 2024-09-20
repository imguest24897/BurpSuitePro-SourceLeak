/*     */ package com.install4j.api.windows.service;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ServiceConfiguration
/*     */   implements Serializable
/*     */ {
/*     */   private String binaryName;
/*     */   private String displayName;
/*     */   private ServiceStartType startType;
/*     */   private String dependencies;
/*     */   private String description;
/*     */   private Boolean delayedAutoStart;
/*     */   private Boolean restartOnFailure;
/*  19 */   private int restartMillis = 1000;
/*  20 */   private int maxRestarts = 0;
/*  21 */   private int resetSeconds = 0;
/*     */ 
/*     */   
/*     */   private ServiceAccount serviceAccount;
/*     */ 
/*     */   
/*     */   private String otherAccountName;
/*     */   
/*     */   private String otherAccountPassword;
/*     */ 
/*     */   
/*     */   public ServiceConfiguration binaryName(String binaryName) {
/*  33 */     this.binaryName = binaryName;
/*  34 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration displayName(String displayName) {
/*  43 */     this.displayName = displayName;
/*  44 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration startType(ServiceStartType startType) {
/*  53 */     this.startType = startType;
/*  54 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration dependencies(String dependencies) {
/*  63 */     this.dependencies = dependencies;
/*  64 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration description(String description) {
/*  73 */     this.description = description;
/*  74 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration delayedAutoStart(Boolean delayedAutoStart) {
/*  83 */     this.delayedAutoStart = delayedAutoStart;
/*  84 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration restartOnFailure(Boolean restartOnFailure) {
/*  93 */     this.restartOnFailure = restartOnFailure;
/*  94 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration restartMillis(int restartMillis) {
/* 103 */     this.restartMillis = restartMillis;
/* 104 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration maxRestarts(int maxRestarts) {
/* 114 */     this.maxRestarts = maxRestarts;
/* 115 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration resetSeconds(int resetSeconds) {
/* 124 */     this.resetSeconds = resetSeconds;
/* 125 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration serviceAccount(ServiceAccount serviceAccount) {
/* 135 */     this.serviceAccount = serviceAccount;
/* 136 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration otherAccountName(String otherAccountName) {
/* 146 */     this.serviceAccount = ServiceAccount.OTHER;
/* 147 */     this.otherAccountName = otherAccountName;
/* 148 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ServiceConfiguration otherAccountPassword(String otherAccountPassword) {
/* 157 */     this.serviceAccount = ServiceAccount.OTHER;
/* 158 */     this.otherAccountPassword = otherAccountPassword;
/* 159 */     return this;
/*     */   }
/*     */   
/*     */   String getBinaryName() {
/* 163 */     return this.binaryName;
/*     */   }
/*     */   
/*     */   String getDisplayName() {
/* 167 */     return this.displayName;
/*     */   }
/*     */   
/*     */   ServiceStartType getStartType() {
/* 171 */     return this.startType;
/*     */   }
/*     */   
/*     */   String getDependencies() {
/* 175 */     return this.dependencies;
/*     */   }
/*     */   
/*     */   ServiceAccount getServiceAccount() {
/* 179 */     return this.serviceAccount;
/*     */   }
/*     */   
/*     */   String getOtherAccountName() {
/* 183 */     return this.otherAccountName;
/*     */   }
/*     */   
/*     */   String getOtherAccountPassword() {
/* 187 */     return this.otherAccountPassword;
/*     */   }
/*     */   
/*     */   String getDescription() {
/* 191 */     return this.description;
/*     */   }
/*     */   
/*     */   Boolean getDelayedAutoStart() {
/* 195 */     return this.delayedAutoStart;
/*     */   }
/*     */   
/*     */   Boolean getRestartOnFailure() {
/* 199 */     return this.restartOnFailure;
/*     */   }
/*     */   
/*     */   public Integer getRestartMillis() {
/* 203 */     return Integer.valueOf(this.restartMillis);
/*     */   }
/*     */   
/*     */   public Integer getMaxRestarts() {
/* 207 */     return Integer.valueOf(this.maxRestarts);
/*     */   }
/*     */   
/*     */   public Integer getResetSeconds() {
/* 211 */     return Integer.valueOf(this.resetSeconds);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\service\ServiceConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */