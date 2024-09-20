/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.net.DigestAlgorithm;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ 
/*     */ public class ChecksumChecker {
/*  18 */   private static final char[] hexChars = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
/*     */   
/*     */   public static String getHexStringFromBytes(byte[] bytes) {
/*  21 */     StringBuilder buffer = new StringBuilder();
/*  22 */     for (byte b : bytes) {
/*  23 */       int msb = (b & 0xFF) / 16;
/*  24 */       int lsb = (b & 0xFF) % 16;
/*  25 */       buffer.append(hexChars[msb]);
/*  26 */       buffer.append(hexChars[lsb]);
/*     */     } 
/*  28 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static String getExpectedDigest(Context context, String urlString, String expectedFileName) throws IOException, UserCanceledException {
/*  32 */     Downloader downloader = new Downloader(context, null); 
/*  33 */     try { String str = getExpectedDigest(downloader, context, urlString, "", DigestAlgorithm.SHA256, expectedFileName);
/*  34 */       downloader.close(); return str; }
/*     */     catch (Throwable throwable) { try { downloader.close(); }
/*     */       catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */        throw throwable; }
/*  38 */      } public static String getExpectedDigest(Downloader downloader, Context context, String digestUrl, String downloadUrl, DigestAlgorithm digestAlgorithm, String expectedFileName) throws UserCanceledException, IOException { boolean previousProgress = downloader.isProgressEnabled();
/*     */     try {
/*  40 */       downloader.setProgressEnabled(false);
/*  41 */       File checksumFile = File.createTempFile("digest", ".tmp");
/*     */       
/*  43 */       connect(downloader, digestUrl, downloadUrl, digestAlgorithm);
/*  44 */       downloader.download(checksumFile, -1L, true);
/*     */       
/*  46 */       try { BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(checksumFile), StandardCharsets.UTF_8)); 
/*  47 */         try { String line = reader.readLine();
/*  48 */           while (line != null)
/*  49 */           { int spaceIndex = line.indexOf(' ');
/*  50 */             if (spaceIndex > -1)
/*  51 */             { String checksum = line.substring(0, spaceIndex).toLowerCase(Locale.ENGLISH);
/*  52 */               String fileName = line.substring(spaceIndex + 1);
/*  53 */               while (fileName.startsWith("*") || fileName.startsWith(" ")) {
/*  54 */                 fileName = fileName.substring(1);
/*     */               }
/*  56 */               if (Objects.equals(fileName, expectedFileName))
/*  57 */               { String str = checksum;
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  62 */                 reader.close(); return str; }  }  line = reader.readLine(); }  reader.close(); } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  }
/*  63 */       finally { checksumFile.delete(); }
/*     */     
/*  65 */     } catch (IOException e) {
/*  66 */       Logger.getInstance().error(ChecksumChecker.class, "could not get digest file");
/*  67 */       Logger.getInstance().log(e);
/*  68 */       if (context != null && 
/*  69 */         CompilerVariableHelper.getCompilerExtensionVariable(context, "failOnDigestFileError", false)) {
/*  70 */         throw e;
/*     */       }
/*     */     }
/*  73 */     catch (UserCanceledException e) {
/*  74 */       Logger.getInstance().error(ChecksumChecker.class, "could not get digest file");
/*  75 */       Logger.getInstance().log((Throwable)e);
/*  76 */       if (context != null && context.isCancelling()) {
/*  77 */         throw e;
/*     */       }
/*     */     } finally {
/*  80 */       downloader.setProgressEnabled(previousProgress);
/*     */     } 
/*  82 */     String message = "file with name " + expectedFileName + " not found in digest file";
/*  83 */     Logger.getInstance().error(ChecksumChecker.class, message);
/*  84 */     if (CompilerVariableHelper.getCompilerExtensionVariable(context, "failOnDigestFileError", false)) {
/*  85 */       throw new IOException(message);
/*     */     }
/*  87 */     return ""; }
/*     */ 
/*     */   
/*     */   private static void connect(Downloader downloader, String digestUrl, String downloadUrl, DigestAlgorithm digestAlgorithm) throws IOException, UserCanceledException {
/*  91 */     if (digestUrl == null || digestUrl.trim().length() == 0) {
/*  92 */       if (digestAlgorithm == DigestAlgorithm.SHA256_OR_MD5) {
/*     */         try {
/*  94 */           downloader.connect(createDigestUrl(downloadUrl, "sha256sums"));
/*  95 */         } catch (FileNotFoundException e) {
/*  96 */           downloader.connect(createDigestUrl(downloadUrl, "md5sums"));
/*     */         } 
/*  98 */       } else if (digestAlgorithm == DigestAlgorithm.SHA256) {
/*  99 */         downloader.connect(createDigestUrl(downloadUrl, "sha256sums"));
/* 100 */       } else if (digestAlgorithm == DigestAlgorithm.MD5) {
/* 101 */         downloader.connect(createDigestUrl(downloadUrl, "md5sums"));
/*     */       } 
/*     */     } else {
/* 104 */       downloader.connect(digestUrl);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String createDigestUrl(String mainSpec, String checksumFileName) throws MalformedURLException {
/* 109 */     URL mainUrl = new URL(mainSpec);
/*     */ 
/*     */     
/* 112 */     String urlString = mainUrl.getProtocol() + ":";
/* 113 */     if (mainUrl.getAuthority() != null && mainUrl.getAuthority().length() > 0) {
/* 114 */       urlString = urlString + "//" + mainUrl.getAuthority();
/*     */     }
/* 116 */     String path = mainUrl.getPath();
/* 117 */     if (path != null) {
/* 118 */       int index = path.lastIndexOf('/');
/* 119 */       if (index > -1) {
/* 120 */         urlString = urlString + path.substring(0, index);
/*     */       }
/*     */     } 
/* 123 */     if (!urlString.endsWith("/")) {
/* 124 */       urlString = urlString + "/";
/*     */     }
/* 126 */     urlString = urlString + checksumFileName;
/* 127 */     if (mainUrl.getQuery() != null) {
/* 128 */       urlString = urlString + "?" + mainUrl.getQuery();
/*     */     }
/* 130 */     if (mainUrl.getRef() != null) {
/* 131 */       urlString = urlString + "#" + mainUrl.getRef();
/*     */     }
/* 133 */     return urlString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\ChecksumChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */