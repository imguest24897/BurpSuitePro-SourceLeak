/*     */ package com.exe4j.runtime.util;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PushbackInputStream;
/*     */ import java.io.Reader;
/*     */ import java.util.Collection;
/*     */ 
/*     */ public class FileUtil {
/*     */   public static boolean copyFile(File sourceFile, File targetFile) throws IOException {
/*  15 */     return copyFile(sourceFile, targetFile, false);
/*     */   }
/*     */   private static final int BUFFER_SIZE = 8192;
/*     */   public static boolean copyFile(File sourceFile, File targetFile, boolean append) throws IOException {
/*  19 */     FileInputStream fis = null;
/*  20 */     FileOutputStream fos = null;
/*     */     try {
/*  22 */       fis = new FileInputStream(sourceFile);
/*  23 */       fos = new FileOutputStream(targetFile, append);
/*  24 */       return (pumpStream(fis, fos) != -1L);
/*     */     } finally {
/*  26 */       if (fis != null) {
/*  27 */         fis.close();
/*     */       }
/*  29 */       if (fos != null) {
/*  30 */         fos.close();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean copyFile(File sourceFile, File targetFile, CopyProgressListener copyProgressListener) throws IOException {
/*  36 */     FileInputStream inputStream = new FileInputStream(sourceFile);
/*     */     try {
/*  38 */       return extractFile(inputStream, targetFile, sourceFile.length(), copyProgressListener, true);
/*     */     } finally {
/*     */       try {
/*  41 */         inputStream.close();
/*  42 */       } catch (IOException iOException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean extractFile(InputStream in, File targetFile, long length, CopyProgressListener copyProgressListener, boolean checkReadIoException) throws IOException {
/*  48 */     FileOutputStream fos = null;
/*     */     try {
/*  50 */       fos = new FileOutputStream(targetFile);
/*  51 */       return (pumpStream(in, length, fos, copyProgressListener, checkReadIoException) > -1L);
/*     */     } finally {
/*  53 */       if (fos != null) {
/*  54 */         fos.close();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void emptyDirectory(File dir) {
/*  60 */     File[] files = dir.listFiles();
/*  61 */     if (files == null) {
/*     */       return;
/*     */     }
/*  64 */     for (File file : files) {
/*  65 */       if (file.isDirectory()) {
/*  66 */         deleteDirectory(file);
/*  67 */         file.delete();
/*     */       } else {
/*  69 */         file.delete();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void deleteDirectory(File dir) {
/*  75 */     emptyDirectory(dir);
/*  76 */     dir.delete();
/*     */   }
/*     */   public static void copyDirectory(File sourceDir, File targetDir, boolean recursive) throws IOException {
/*  79 */     copyDirectory(sourceDir, targetDir, recursive, null, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void copyDirectory(File sourceDir, File targetDir, boolean recursive, Collection excludeSuffixes, Collection excludeFiles) throws IOException {
/*  85 */     File[] files = sourceDir.listFiles();
/*  86 */     if (files == null) {
/*     */       return;
/*     */     }
/*     */     
/*  90 */     for (File file : files) {
/*  91 */       File sourceFile = (new File(sourceDir, file.getName())).getCanonicalFile();
/*     */       
/*  93 */       if (excludeFiles == null || !excludeFiles.contains(sourceFile)) {
/*  94 */         File targetFile = new File(targetDir, sourceFile.getName());
/*  95 */         if (sourceFile.isDirectory() && recursive) {
/*  96 */           if (!targetFile.exists() && !targetFile.mkdirs()) {
/*  97 */             throw new IOException("Cannot create " + targetDir.getPath());
/*     */           }
/*  99 */           copyDirectory(sourceFile, targetFile, true, excludeSuffixes, excludeFiles);
/*     */         } else {
/* 101 */           boolean excluded = false;
/* 102 */           if (excludeSuffixes != null) {
/* 103 */             Iterator<String> it = excludeSuffixes.iterator();
/* 104 */             while (it.hasNext() && !excluded) {
/* 105 */               String suffix = ((String)it.next()).toLowerCase(Locale.ENGLISH);
/* 106 */               if (sourceFile.getName().toLowerCase(Locale.ENGLISH).endsWith(suffix)) {
/* 107 */                 excluded = true;
/*     */               }
/*     */             } 
/*     */           } 
/* 111 */           if (!excluded) {
/* 112 */             copyFile(sourceFile, targetFile);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long pumpCharStream(Reader reader, Writer writer) throws IOException {
/* 122 */     long count = 0L;
/*     */     int c;
/* 124 */     while ((c = reader.read()) != -1) {
/* 125 */       if (writer != null) {
/* 126 */         writer.write(c);
/*     */       }
/* 128 */       count++;
/*     */     } 
/*     */     
/* 131 */     if (writer != null) {
/* 132 */       writer.flush();
/*     */     }
/*     */     
/* 135 */     return count;
/*     */   }
/*     */   
/*     */   public static List<String> readLines(InputStream input) throws IOException {
/* 139 */     List<String> lineList = new ArrayList<String>();
/* 140 */     BufferedReader br = new BufferedReader(new InputStreamReader(input));
/*     */     String line;
/* 142 */     while ((line = br.readLine()) != null) {
/* 143 */       while (line.endsWith("\r") || line.endsWith("\n")) {
/* 144 */         line = line.substring(0, line.length() - 1);
/*     */       }
/* 146 */       lineList.add(line);
/*     */     } 
/* 148 */     return lineList;
/*     */   }
/*     */   
/*     */   public static long pumpStream(InputStream is, OutputStream os) throws IOException {
/* 152 */     return pumpStream(is, os, null);
/*     */   }
/*     */   
/*     */   public static long pumpStream(InputStream is, OutputStream os, CopyProgressListener copyProgressListener) throws IOException {
/* 156 */     return pumpStream(is, os, copyProgressListener, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static long pumpStream(InputStream is, OutputStream os, CopyProgressListener copyProgressListener, boolean checkReadIoException) throws IOException {
/* 161 */     return pumpStream(is, -1L, os, copyProgressListener, checkReadIoException);
/*     */   }
/*     */ 
/*     */   
/*     */   public static long pumpStream(InputStream is, long length, OutputStream os, CopyProgressListener copyProgressListener, boolean checkReadIoException) throws IOException {
/* 166 */     return pumpStream(is, length, false, os, copyProgressListener, checkReadIoException);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long pumpStream(InputStream is, long length, boolean padOrTruncate, OutputStream os, CopyProgressListener copyProgressListener, boolean checkReadIoException) throws IOException {
/* 172 */     if (padOrTruncate && length < 0L) {
/* 173 */       throw new IllegalStateException();
/*     */     }
/*     */     
/* 176 */     boolean useBuffers = (length == -1L || length > 819200L);
/* 177 */     if (useBuffers && !(is instanceof BufferedInputStream)) {
/* 178 */       is = new BufferedInputStream(is, 8192);
/*     */     }
/*     */     
/* 181 */     if (useBuffers && !(os instanceof BufferedOutputStream)) {
/* 182 */       os = new BufferedOutputStream(os, 8192);
/*     */     }
/*     */     
/* 185 */     byte[] buf = new byte[8192];
/*     */     
/* 187 */     long count = 0L;
/* 188 */     int currentCount = read(is, buf, checkReadIoException);
/* 189 */     while (currentCount != -1) {
/* 190 */       if (padOrTruncate && count + currentCount > length) {
/* 191 */         int truncatedCurrentCount = (int)Math.max(0L, length - count);
/* 192 */         os.write(buf, 0, truncatedCurrentCount);
/* 193 */         count += truncatedCurrentCount;
/*     */         break;
/*     */       } 
/* 196 */       os.write(buf, 0, currentCount);
/* 197 */       count += currentCount;
/* 198 */       if (copyProgressListener != null && 
/* 199 */         !copyProgressListener.progressPerformed(currentCount)) {
/* 200 */         return -1L;
/*     */       }
/*     */       
/* 203 */       currentCount = read(is, buf, checkReadIoException);
/*     */     } 
/* 205 */     if (padOrTruncate && count < length) {
/* 206 */       while (count < length) {
/* 207 */         os.write(0);
/* 208 */         count++;
/*     */       } 
/*     */     }
/* 211 */     os.flush();
/* 212 */     return count;
/*     */   }
/*     */   
/*     */   private static int read(InputStream is, byte[] buf, boolean checkReadIoException) throws IOException {
/*     */     try {
/* 217 */       return is.read(buf);
/* 218 */     } catch (RuntimeException e) {
/* 219 */       if (checkReadIoException) {
/* 220 */         throw new ReadIOException(e);
/*     */       }
/* 222 */       throw e;
/*     */     }
/* 224 */     catch (IOException e) {
/* 225 */       if (checkReadIoException) {
/* 226 */         throw new ReadIOException(e);
/*     */       }
/* 228 */       throw e;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void rename(File tempFile, File destFile) throws IOException {
/* 234 */     int tryNum = 0;
/* 235 */     while (!tempFile.renameTo(destFile)) {
/*     */       try {
/* 237 */         Thread.sleep(100L);
/* 238 */       } catch (InterruptedException interruptedException) {}
/*     */       
/* 240 */       if (destFile.exists()) {
/* 241 */         destFile.delete();
/*     */       }
/* 243 */       if (tryNum > 20) {
/* 244 */         throw new IOException("could not rename " + tempFile + " to " + destFile);
/*     */       }
/* 246 */       tryNum++;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean isContainedInOrEquals(File file, File parent) {
/*     */     try {
/* 252 */       while (file != null) {
/* 253 */         if (file.getCanonicalFile().equals(parent.getCanonicalFile())) {
/* 254 */           return true;
/*     */         }
/* 256 */         file = file.getParentFile();
/*     */       } 
/* 258 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 261 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String readTextFile(File file, String encoding) throws IOException {
/* 266 */     Reader reader = null;
/*     */     try {
/* 268 */       reader = createTextFileReader(file, encoding);
/* 269 */       StringWriter stringWriter = new StringWriter();
/*     */       int character;
/* 271 */       while ((character = reader.read()) != -1) {
/* 272 */         stringWriter.write(character);
/*     */       }
/* 274 */       return stringWriter.toString();
/*     */     } finally {
/* 276 */       if (reader != null)
/* 277 */         reader.close(); 
/*     */     } 
/*     */   }
/*     */   public static BufferedReader createTextFileReader(File file, String encoding) throws IOException {
/*     */     InputStream sourceInputStream;
/*     */     InputStreamReader inputStreamReader;
/* 283 */     FileInputStream fileInputStream = new FileInputStream(file);
/* 284 */     PushbackInputStream pushbackInputStream = new PushbackInputStream(fileInputStream, 2);
/* 285 */     byte[] signature = new byte[2];
/* 286 */     pushbackInputStream.read(signature);
/* 287 */     pushbackInputStream.unread(signature);
/*     */     
/* 289 */     if (isGzipStream(signature)) {
/* 290 */       sourceInputStream = new GZIPInputStream(pushbackInputStream);
/*     */     } else {
/* 292 */       sourceInputStream = pushbackInputStream;
/*     */     } 
/*     */     
/* 295 */     if (encoding == null || encoding.isEmpty()) {
/* 296 */       inputStreamReader = new InputStreamReader(sourceInputStream);
/*     */     } else {
/* 298 */       inputStreamReader = new InputStreamReader(sourceInputStream, encoding);
/*     */     } 
/* 300 */     return new BufferedReader(inputStreamReader);
/*     */   }
/*     */   
/*     */   public static boolean isGzipStream(byte[] bytes) {
/* 304 */     int head = bytes[0] & 0xFF | bytes[1] << 8 & 0xFF00;
/* 305 */     return (head == 35615);
/*     */   }
/*     */   
/*     */   public static String getCanonicalPath(File file) {
/*     */     try {
/* 310 */       return file.getCanonicalPath();
/* 311 */     } catch (IOException e) {
/* 312 */       return file.getAbsolutePath();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static File getCanonicalFile(File file) {
/* 317 */     if (file != null) {
/*     */       try {
/* 319 */         file = file.getCanonicalFile();
/* 320 */       } catch (IOException e) {
/* 321 */         file = file.getAbsoluteFile();
/*     */       } 
/*     */     }
/* 324 */     return file;
/*     */   }
/*     */   
/*     */   public static interface CopyProgressListener {
/*     */     boolean progressPerformed(long param1Long);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\FileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */