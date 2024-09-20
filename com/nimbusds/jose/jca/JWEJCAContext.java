/*     */ package com.nimbusds.jose.jca;
/*     */ 
/*     */ import java.security.Provider;
/*     */ import java.security.SecureRandom;
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
/*     */ public final class JWEJCAContext
/*     */   extends JCAContext
/*     */ {
/*     */   private Provider keProvider;
/*     */   private Provider ceProvider;
/*     */   private Provider macProvider;
/*     */   
/*     */   public JWEJCAContext() {
/*  59 */     this(null, null, null, null, null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JWEJCAContext(Provider generalProvider, Provider keProvider, Provider ceProvider, Provider macProvider, SecureRandom randomGen) {
/*  95 */     super(generalProvider, randomGen);
/*  96 */     this.keProvider = keProvider;
/*  97 */     this.ceProvider = ceProvider;
/*  98 */     this.macProvider = macProvider;
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
/*     */   public void setKeyEncryptionProvider(Provider keProvider) {
/* 113 */     this.keProvider = keProvider;
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
/*     */   public Provider getKeyEncryptionProvider() {
/* 125 */     return (this.keProvider != null) ? this.keProvider : getProvider();
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
/*     */   public void setContentEncryptionProvider(Provider ceProvider) {
/* 139 */     this.ceProvider = ceProvider;
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
/*     */   public Provider getContentEncryptionProvider() {
/* 151 */     return (this.ceProvider != null) ? this.ceProvider : getProvider();
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
/*     */   public void setMACProvider(Provider macProvider) {
/* 167 */     this.macProvider = macProvider;
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
/*     */   public Provider getMACProvider() {
/* 180 */     return (this.macProvider != null) ? this.macProvider : getProvider();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\jca\JWEJCAContext.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */