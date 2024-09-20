/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ 
/*     */ class ContentCollector {
/*     */   private static final String DATA_DIR_NAME = "data";
/*     */   private InstallerContext context;
/*     */   private boolean saveDownloadedFiles;
/*     */   private boolean acceptAllCertificates;
/*     */   
/*     */   public ContentCollector(InstallerContext context, boolean saveDownloadedFiles, boolean acceptAllCertificates) {
/*  33 */     this.context = context;
/*  34 */     this.saveDownloadedFiles = saveDownloadedFiles;
/*  35 */     this.acceptAllCertificates = acceptAllCertificates;
/*     */   }
/*     */   
/*     */   public Map<Comparable<String>, InputStream> collectContentStreams(String componentId) throws UserCanceledException, IOException {
/*  39 */     Map<Comparable<String>, InputStream> contentStreams = new HashMap<>();
/*  40 */     List<String> downloadNumbers = new ArrayList<>();
/*     */     
/*  42 */     ContentStats contentStats = ContentStats.getInstance();
/*     */     
/*  44 */     String propertyModuleName = System.getProperty("exe4j.moduleName");
/*     */     
/*  46 */     Map<String, UnextractedInfo> nameToUnextractedInfo = initUnextractedFiles();
/*     */     
/*  48 */     Set<String> contentNumbers = contentStats.getSelectedContentNumbers(componentId);
/*  49 */     for (String number : contentNumbers) {
/*  50 */       File installerDir; String fileName = contentStats.getFileName(number);
/*     */       
/*  52 */       UnextractedInfo unextractedInfo = nameToUnextractedInfo.get(fileName);
/*  53 */       if (unextractedInfo != null) {
/*  54 */         assert propertyModuleName != null;
/*     */         
/*  56 */         InputStream inputStream = new PartialFileInputStream(new File(propertyModuleName), unextractedInfo.position, unextractedInfo.length);
/*  57 */         contentStreams.put(number, inputStream);
/*     */         continue;
/*     */       } 
/*  60 */       if (propertyModuleName == null) {
/*  61 */         installerDir = new File(".");
/*     */       } else {
/*  63 */         installerDir = InstallerUtil.getAbsoluteFile(new File(propertyModuleName)).getParentFile();
/*     */       } 
/*     */       
/*  66 */       File contentFile = getContentFile(contentStats, number, fileName, installerDir);
/*     */       
/*  68 */       if (!contentFile.exists() && (Util.isMacosInstaller() || MsiHelper.isStartedFromMsi())) {
/*  69 */         String mediaDir = (String)this.context.getVariable("sys.mediaDir");
/*  70 */         if (mediaDir != null) {
/*  71 */           contentFile = getContentFile(contentStats, number, fileName, new File(mediaDir));
/*     */         }
/*     */       } 
/*     */       
/*  75 */       if (!contentFile.exists()) {
/*  76 */         String downloadUrl = InstallerConfig.getCurrentInstance().getDownloadURL();
/*  77 */         if (downloadUrl.trim().length() == 0) {
/*  78 */           String message = Messages.getString(".ErrorReadingSource") + "\n" + fileName;
/*  79 */           Util.showMessage(message, 0);
/*  80 */           throw new UserCanceledException();
/*     */         } 
/*  82 */         downloadNumbers.add(number);
/*     */         continue;
/*     */       } 
/*  85 */       InputStream in = new SplittedFileInputStream(contentFile);
/*  86 */       contentStreams.put(number, in);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  91 */     Map<Comparable<String>, File> numberToDownloadedFiles = downloadContentFiles(downloadNumbers, this.saveDownloadedFiles, this.acceptAllCertificates, (Context)this.context);
/*  92 */     for (Map.Entry<Comparable<String>, File> entry : numberToDownloadedFiles.entrySet()) {
/*  93 */       contentStreams.put(entry.getKey(), new FileInputStream(entry.getValue()));
/*     */     }
/*     */     
/*  96 */     return contentStreams;
/*     */   }
/*     */   
/*     */   private File getContentFile(ContentStats contentStats, String number, String fileName, File installerDir) {
/* 100 */     File contentFile = getAbsoluteFile(new File(fileName));
/*     */     
/* 102 */     if (!contentFile.exists()) {
/* 103 */       contentFile = getAbsoluteFile(new File(new File(installerDir, contentStats.getDirName()), fileName));
/*     */     }
/*     */     
/* 106 */     if (!contentFile.exists()) {
/* 107 */       contentFile = getAbsoluteFile(new File(installerDir, fileName));
/*     */     }
/*     */     
/* 110 */     if (!contentFile.exists()) {
/* 111 */       contentFile = getAbsoluteFile(new File(new File(installerDir, "data"), fileName));
/*     */     }
/*     */     
/* 114 */     if (!contentFile.exists()) {
/* 115 */       contentFile = getAbsoluteFile(new File(new File(installerDir, "common_files.dat"), "common_files." + contentStats
/* 116 */             .getComponentListString(number) + ".dat"));
/*     */     }
/*     */     
/* 119 */     if (!contentFile.exists()) {
/* 120 */       contentFile = getAbsoluteFile(new File(new File(installerDir, "data"), "common_files." + contentStats
/* 121 */             .getComponentListString(number) + ".dat"));
/*     */     }
/*     */     
/* 124 */     if (!contentFile.exists()) {
/* 125 */       contentFile = getAbsoluteFile(new File(installerDir, "common_files." + contentStats
/* 126 */             .getComponentListString(number) + ".dat"));
/*     */     }
/* 128 */     return contentFile;
/*     */   }
/*     */   
/*     */   private File getAbsoluteFile(File file) {
/* 132 */     return InstallerUtil.getAbsoluteFile(file);
/*     */   }
/*     */   
/*     */   private Map<String, UnextractedInfo> initUnextractedFiles() throws IOException {
/* 136 */     Map<String, UnextractedInfo> nameToUnextractedInfo = new HashMap<>();
/*     */     
/* 138 */     String propertyModuleName = System.getProperty("exe4j.moduleName");
/*     */     
/* 140 */     if (!Util.isMacosInstaller() && propertyModuleName != null) {
/*     */       
/* 142 */       int startPos = Integer.getInteger("exe4j.unextractedPositionRestart", 0).intValue();
/* 143 */       if (startPos == 0) {
/* 144 */         startPos = Integer.getInteger("exe4j.unextractedPosition", 0).intValue();
/*     */       }
/* 146 */       if (startPos == 0) {
/* 147 */         long totalDataLength = Long.getLong("exe4j.totalDataLength", 0L).longValue();
/* 148 */         File moduleFile = new File(propertyModuleName);
/* 149 */         if (totalDataLength > 0L && moduleFile.exists()) {
/* 150 */           startPos = (int)(moduleFile.length() - totalDataLength);
/*     */         }
/*     */       } 
/*     */       
/* 154 */       if (startPos > 0) {
/* 155 */         long currentPosition = 0L;
/*     */         
/* 157 */         CountingInputStream cin = new CountingInputStream(new BufferedInputStream(new FileInputStream(propertyModuleName)));
/* 158 */         DataInputStream din = new DataInputStream(cin);
/* 159 */         din.skipBytes(startPos);
/*     */         
/* 161 */         if (din.readInt() == -387705899) {
/* 162 */           int count = din.readInt();
/* 163 */           for (int i = 0; i < count; i++) {
/* 164 */             UnextractedInfo unextractedInfo = new UnextractedInfo();
/*     */             
/* 166 */             String name = din.readUTF();
/* 167 */             unextractedInfo.length = din.readLong();
/* 168 */             unextractedInfo.position = currentPosition;
/*     */             
/* 170 */             currentPosition += unextractedInfo.length;
/*     */             
/* 172 */             nameToUnextractedInfo.put(name, unextractedInfo);
/*     */           } 
/*     */           
/* 175 */           for (UnextractedInfo unextractedInfo : nameToUnextractedInfo.values()) {
/* 176 */             unextractedInfo.position += cin.getCount();
/*     */           }
/*     */         } else {
/* 179 */           throw new IOException("wrong magic number");
/*     */         } 
/*     */         
/* 182 */         din.close();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 187 */     return nameToUnextractedInfo;
/*     */   }
/*     */ 
/*     */   
/*     */   private static Map<Comparable<String>, File> downloadContentFiles(final List<String> downloadNumbers, final boolean saveDownloadedFiles, final boolean acceptAllCertificates, Context context) throws IOException, UserCanceledException {
/* 192 */     if (downloadNumbers.size() > 0) {
/* 193 */       context.getProgressInterface().setStatusMessage(Messages.getString(".Downloading"));
/*     */     }
/* 195 */     return (Map<Comparable<String>, File>)HelperCommunication.getInstance().fetchObjectChecked(ExecutionContext.UNELEVATED, new FetchObjectAction<Map<Comparable<String>, File>>()
/*     */         {
/*     */           protected Map<Comparable<String>, File> fetchValue(Context context) throws Exception {
/* 198 */             Downloader downloader = new Downloader(context, context.getProgressInterface()); 
/* 199 */             try { downloader.setAcceptAllCertificates(acceptAllCertificates);
/* 200 */               if (downloadNumbers.size() > 0) {
/* 201 */                 context.getProgressInterface().setStatusMessage(Messages.getString(".Downloading"));
/*     */               }
/*     */               
/* 204 */               ContentStats contentStats = ContentStats.getInstance();
/*     */               
/* 206 */               long totalSize = 0L;
/* 207 */               for (String number : downloadNumbers) {
/* 208 */                 totalSize += contentStats.getFileSize(number);
/*     */               }
/* 210 */               downloader.setTotalSize(totalSize);
/*     */               
/* 212 */               Map<Comparable<String>, File> downloadedFiles = new HashMap<>();
/* 213 */               for (String number : downloadNumbers) {
/* 214 */                 boolean retry = true;
/* 215 */                 while (retry) {
/*     */                   try {
/* 217 */                     File file = ContentCollector.downloadSingleFile(number, downloader, context, saveDownloadedFiles);
/* 218 */                     downloadedFiles.put(number, file);
/* 219 */                     retry = false;
/* 220 */                   } catch (IOException e) {
/* 221 */                     downloader.resetLastTransfer();
/* 222 */                     Logger.getInstance().info(this, e.toString());
/* 223 */                     ContentCollector.askRetry(".DownloadContentError");
/*     */                   } 
/*     */                 } 
/*     */               } 
/* 227 */               Map<Comparable<String>, File> map1 = downloadedFiles;
/* 228 */               downloader.close(); return map1; }
/*     */             catch (Throwable throwable) { try {
/*     */                 downloader.close();
/*     */               } catch (Throwable throwable1) {
/*     */                 throwable.addSuppressed(throwable1);
/*     */               }  throw throwable; }
/* 234 */              } }); } private static File downloadSingleFile(String number, Downloader downloader, Context context, boolean saveDownloadedFiles) throws IOException, UserCanceledException { ContentStats contentStats = ContentStats.getInstance();
/*     */     
/* 236 */     File outputFile = null; try {
/*     */       boolean retry;
/* 238 */       String baseUrlString = InstallerConfig.getCurrentInstance().getDownloadURL().trim();
/* 239 */       if (!baseUrlString.endsWith("/")) {
/* 240 */         baseUrlString = baseUrlString + "/";
/*     */       }
/*     */       
/* 243 */       String expectedChecksum = null;
/*     */       do {
/* 245 */         String fileName, actualChecksum = null;
/*     */         do {
/* 247 */           retry = false;
/* 248 */           fileName = connect(number, baseUrlString, downloader);
/*     */           
/* 250 */           String mediaDir = (String)context.getVariable("sys.mediaDir");
/* 251 */           if (saveDownloadedFiles && mediaDir != null) {
/*     */             try {
/* 253 */               File testFile = File.createTempFile("i4jc", ".tst", new File(mediaDir));
/* 254 */               if (!testFile.delete()) {
/* 255 */                 InstallerUtil.deleteOnExit(testFile);
/*     */               }
/* 257 */               outputFile = new File(mediaDir, fileName);
/* 258 */             } catch (IOException iOException) {}
/*     */           }
/*     */           
/* 261 */           if (outputFile == null) {
/* 262 */             outputFile = File.createTempFile("i4jc", ".dat");
/*     */           }
/*     */           try {
/* 265 */             downloader.download(outputFile, contentStats.getFileSize(number), !saveDownloadedFiles);
/* 266 */             actualChecksum = ChecksumChecker.getHexStringFromBytes(downloader.digest());
/* 267 */           } catch (IOException e) {
/* 268 */             Logger.getInstance().error(ContentCollector.class, "could not download file");
/* 269 */             Logger.getInstance().log(e);
/* 270 */             askRetry(".DownloadInterrupted");
/* 271 */             retry = true;
/*     */           } 
/* 273 */         } while (retry);
/*     */         
/* 275 */         retry = false;
/* 276 */         if (expectedChecksum == null) {
/* 277 */           expectedChecksum = ChecksumChecker.getExpectedDigest(context, baseUrlString + "sha256sums", fileName);
/*     */         }
/* 279 */         if (Objects.equals("", expectedChecksum))
/* 280 */           continue;  Logger.getInstance().info(ContentCollector.class, "expected checksum " + expectedChecksum + ", actual checksum " + actualChecksum);
/* 281 */         if (Objects.equals(expectedChecksum, actualChecksum))
/* 282 */           continue;  downloader.resetLastTransfer();
/* 283 */         askRetry(".DownloadFileCorrupt");
/* 284 */         retry = true;
/*     */       
/*     */       }
/* 287 */       while (retry);
/*     */     } finally {
/* 289 */       if (!saveDownloadedFiles && outputFile != null) {
/* 290 */         InstallerUtil.deleteOnExit(outputFile);
/*     */       }
/*     */     } 
/*     */     
/* 294 */     return outputFile; }
/*     */ 
/*     */   
/*     */   private static String connect(String number, String baseUrlString, Downloader downloader) throws UserCanceledException, IOException {
/* 298 */     ContentStats contentStats = ContentStats.getInstance();
/*     */     
/* 300 */     String fileName = contentStats.getFileName(number);
/* 301 */     String downloadUrlString = baseUrlString + fileName;
/*     */     try {
/* 303 */       Logger.getInstance().info(ContentCollector.class, "Trying to load " + downloadUrlString);
/* 304 */       downloader.connect(downloadUrlString);
/* 305 */     } catch (IOException e) {
/* 306 */       Logger.getInstance().info(ContentCollector.class, e.toString());
/* 307 */       fileName = "common_files." + contentStats.getComponentListString(number) + ".dat";
/* 308 */       downloadUrlString = baseUrlString + fileName;
/* 309 */       Logger.getInstance().info(ContentCollector.class, "Trying to load " + downloadUrlString);
/* 310 */       downloader.connect(downloadUrlString);
/*     */     } 
/* 312 */     Logger.getInstance().info(ContentCollector.class, "connected");
/*     */     
/* 314 */     return fileName;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void askRetry(String messageKey) throws UserCanceledException {
/* 319 */     switch (Util.showOptionDialog(Messages.getString(messageKey), new String[] {
/* 320 */           Messages.getString(".ButtonOK"), Messages.getString(".ButtonCancel") }, 2)) {
/*     */       
/*     */       case -1:
/*     */       case 1:
/* 324 */         throw new UserCanceledException();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static class UnextractedInfo {
/*     */     private long position;
/*     */     private long length;
/*     */     
/*     */     private UnextractedInfo() {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\ContentCollector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */