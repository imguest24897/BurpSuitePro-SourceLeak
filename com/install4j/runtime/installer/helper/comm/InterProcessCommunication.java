/*     */ package com.install4j.runtime.installer.helper.comm;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.unix.PipeCommunicationBackend;
/*     */ import java.io.IOException;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.PublicKey;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.IllegalBlockSizeException;
/*     */ import javax.crypto.KeyGenerator;
/*     */ import javax.crypto.SecretKey;
/*     */ 
/*     */ public class InterProcessCommunication {
/*  18 */   public static final ErrorLogger INSTALLER_APP_LOGGER = new ErrorLogger()
/*     */     {
/*     */       public void log(String str) {
/*  21 */         Logger.getInstance().error(null, str);
/*     */       }
/*     */ 
/*     */       
/*     */       public void log(Throwable t) {
/*  26 */         Logger.getInstance().log(t);
/*     */       }
/*     */     };
/*     */   private CommunicationBackend backend; private final String parentIdentifier;
/*     */   public static interface ErrorLogger {
/*     */     void log(String param1String);
/*     */     void log(Throwable param1Throwable); }
/*     */   
/*     */   private boolean connected = false;
/*     */   private String hash;
/*     */   private final boolean winCurrentUserOnly;
/*     */   private final ErrorLogger logger;
/*     */   private KeyPair rsaKey;
/*     */   private final Cipher aesEncryptCipher;
/*     */   private final Cipher aesDecryptCipher;
/*     */   
/*     */   public InterProcessCommunication(String parentIdentifier, String parentHash, boolean winCurrentUserOnly, ErrorLogger logger) {
/*  43 */     this.parentIdentifier = parentIdentifier;
/*  44 */     this.hash = parentHash;
/*  45 */     this.winCurrentUserOnly = winCurrentUserOnly;
/*  46 */     this.logger = logger;
/*     */     try {
/*  48 */       this.aesDecryptCipher = Cipher.getInstance("AES");
/*  49 */       this.aesEncryptCipher = Cipher.getInstance("AES");
/*  50 */     } catch (Exception e) {
/*  51 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private CommunicationBackend getBackend() {
/*  56 */     if (this.backend == null) {
/*  57 */       boolean preferTcp = Boolean.getBoolean("install4j.tcpComm");
/*  58 */       if (Util.isAtLeastWindowsVista() && !preferTcp) {
/*  59 */         this.backend = (CommunicationBackend)new Win32CommunicationBackend(this.winCurrentUserOnly, this.logger);
/*  60 */       } else if (Util.isMacOS() || (!Util.isWindows() && !preferTcp)) {
/*  61 */         this.backend = (CommunicationBackend)new PipeCommunicationBackend();
/*     */       } 
/*     */       
/*  64 */       if (this.backend == null) {
/*  65 */         this.backend = (CommunicationBackend)new TcpCommunicationBackend();
/*     */       }
/*     */     } 
/*     */     
/*  69 */     return this.backend;
/*     */   }
/*     */   
/*     */   public String getParentIdentifier() {
/*  73 */     return this.parentIdentifier;
/*     */   }
/*     */   
/*     */   public String getHash() {
/*  77 */     return this.hash;
/*     */   }
/*     */   
/*     */   public boolean connect() {
/*  81 */     if (getBackend().connect(getParentIdentifier())) {
/*  82 */       this.connected = true;
/*     */       try {
/*     */         SecretKey aesKey;
/*  85 */         Cipher rsaCipher = Cipher.getInstance("RSA");
/*     */ 
/*     */         
/*  88 */         if (getParentIdentifier() != null) {
/*  89 */           byte[] rsaPublicBytes = getBackend().readDataBlock();
/*  90 */           String hash = createHash(rsaPublicBytes);
/*  91 */           if (!getHash().equals(hash)) {
/*  92 */             this.logger.log("wrong public key hash " + getHash() + ", " + hash);
/*  93 */             System.exit(1);
/*     */           } 
/*  95 */           PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(rsaPublicBytes));
/*  96 */           rsaCipher.init(2, publicKey);
/*  97 */           aesKey = new SecretKeySpec(rsaCipher.doFinal(getBackend().readDataBlock()), "AES");
/*     */         } else {
/*  99 */           KeyGenerator generator = KeyGenerator.getInstance("AES");
/* 100 */           generator.init(128);
/* 101 */           aesKey = generator.generateKey();
/* 102 */           byte[] aesKeyToBeTransmitted = aesKey.getEncoded();
/* 103 */           if (!getBackend().writeDataBlock(this.rsaKey.getPublic().getEncoded())) {
/* 104 */             this.logger.log("helper key exchange failed 1");
/* 105 */             return false;
/*     */           } 
/* 107 */           rsaCipher.init(1, this.rsaKey.getPrivate());
/* 108 */           if (!getBackend().writeDataBlock(rsaCipher.doFinal(aesKeyToBeTransmitted))) {
/* 109 */             this.logger.log("helper key exchange failed 2");
/* 110 */             return false;
/*     */           } 
/* 112 */           this.rsaKey = null;
/*     */         } 
/* 114 */         this.aesDecryptCipher.init(2, aesKey);
/* 115 */         this.aesEncryptCipher.init(1, aesKey);
/*     */       }
/* 117 */       catch (NoSuchAlgorithmException|java.security.InvalidKeyException|IllegalBlockSizeException|javax.crypto.BadPaddingException|java.security.spec.InvalidKeySpecException|javax.crypto.NoSuchPaddingException e) {
/* 118 */         this.logger.log(e);
/* 119 */         return false;
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     return this.connected;
/*     */   }
/*     */   
/*     */   public boolean isConnected() {
/* 127 */     return this.connected;
/*     */   }
/*     */   
/*     */   public Class<?> getBackendClass() {
/* 131 */     return getBackend().getClass();
/*     */   }
/*     */   
/*     */   public String createListener() {
/*     */     try {
/* 136 */       KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
/* 137 */       keyPairGenerator.initialize(2048);
/* 138 */       this.rsaKey = keyPairGenerator.generateKeyPair();
/* 139 */       this.hash = createHash(this.rsaKey.getPublic().getEncoded());
/* 140 */       return getBackend().createListener();
/* 141 */     } catch (NoSuchAlgorithmException e) {
/* 142 */       e.printStackTrace();
/* 143 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setDisconnected() {
/* 148 */     this.connected = false;
/*     */   }
/*     */   
/*     */   public byte[] readDataBlock() throws IOException {
/* 152 */     byte[] bytes = getBackend().readDataBlock();
/* 153 */     if (bytes == null) {
/* 154 */       throw new IOException("read failed");
/*     */     }
/*     */     try {
/* 157 */       return this.aesDecryptCipher.doFinal(bytes);
/* 158 */     } catch (IllegalBlockSizeException|javax.crypto.BadPaddingException e) {
/* 159 */       throw new IOException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void writeDataBlock(byte[] bytes) throws IOException {
/*     */     try {
/* 165 */       bytes = this.aesEncryptCipher.doFinal(bytes);
/* 166 */       if (!getBackend().writeDataBlock(bytes)) {
/* 167 */         throw new IOException("write failed");
/*     */       }
/* 169 */     } catch (IllegalBlockSizeException|javax.crypto.BadPaddingException e) {
/* 170 */       throw new IOException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String createHash(byte[] bytes) {
/*     */     try {
/* 176 */       MessageDigest md = MessageDigest.getInstance("SHA-256");
/* 177 */       return Base64.encodeForFiles(md.digest(bytes));
/* 178 */     } catch (NoSuchAlgorithmException e) {
/* 179 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\InterProcessCommunication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */