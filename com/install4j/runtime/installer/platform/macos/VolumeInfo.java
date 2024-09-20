/*     */ package com.install4j.runtime.installer.platform.macos;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.DirectOutputRedirection;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class VolumeInfo {
/*     */   public static Map<String, String> getMountPointToDiskFile() {
/*  21 */     Map<String, String> mountPointToDiskFile = new HashMap<>();
/*     */     
/*  23 */     StringBuffer output = new StringBuffer();
/*     */     try {
/*  25 */       int returnCode = Execution.executeWithReturnCode(new String[] { "/usr/bin/hdiutil", "info", "-plist" }, output, true);
/*     */       
/*  27 */       if (returnCode != 0) {
/*  28 */         return mountPointToDiskFile;
/*     */       }
/*  30 */       Document document = XmlHelper.parseString(output.toString(), false, false);
/*  31 */       Element element = document.getDocumentElement();
/*  32 */       element = PlistHelper.getFirstChild(PlistHelper.getFirstChild(element, "dict"), "array");
/*  33 */       for (Element diskImageElement : XmlHelper.childElements(element)) {
/*     */         try {
/*  35 */           String imagePath = XmlHelper.getTextValue(PlistHelper.findValue(diskImageElement, "image-path"));
/*  36 */           Element systemEntities = PlistHelper.findValue(diskImageElement, "system-entities");
/*  37 */           for (Element dictElement : XmlHelper.childElements(systemEntities)) {
/*     */             try {
/*  39 */               String mountPoint = XmlHelper.getTextValue(PlistHelper.findValue(dictElement, "mount-point"));
/*  40 */               String path = removeDownloadSuffix(imagePath);
/*  41 */               mountPointToDiskFile.put(mountPoint, path);
/*  42 */               Logger.getInstance().info(VolumeInfo.class, "image: " + path + ", mountPoint: " + mountPoint);
/*     */               break;
/*  44 */             } catch (Exception exception) {}
/*     */           
/*     */           }
/*     */         
/*     */         }
/*  49 */         catch (Exception e) {
/*  50 */           Logger.getInstance().info(VolumeInfo.class, "Could not get volume info: " + e);
/*     */         } 
/*     */       } 
/*  53 */     } catch (Exception e) {
/*  54 */       Logger.getInstance().error(VolumeInfo.class, "Could not get volume info: " + e);
/*     */     } 
/*  56 */     return mountPointToDiskFile;
/*     */   }
/*     */   private static final String DOWNLOAD_SUFFIX = ".download";
/*     */   
/*     */   private static String removeDownloadSuffix(String imagePath) {
/*  61 */     File parentFile = (new File(imagePath)).getParentFile();
/*  62 */     if (parentFile.getName().endsWith(".download")) {
/*  63 */       String path = parentFile.getAbsolutePath();
/*  64 */       return path.substring(0, path.length() - ".download".length());
/*     */     } 
/*  66 */     return imagePath;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static File attachDmg(File dmgFile, boolean noBrowse) throws IOException {
/*  71 */     Logger.getExistingInstance().info(null, "mounting dmg");
/*  72 */     List<String> arguments = new ArrayList<>();
/*  73 */     arguments.add("attach");
/*  74 */     if (noBrowse)
/*     */     {
/*  76 */       arguments.add("-nobrowse");
/*     */     }
/*  78 */     arguments.add(dmgFile.getAbsolutePath());
/*  79 */     arguments.add("-plist");
/*  80 */     LaunchHelper.LaunchResult launchResult = LaunchHelper.launchApplicationWithResult((new LaunchDescriptor(new File("/usr/bin/hdiutil"))).arguments(arguments).wait(true).stdoutRedirection((OutputRedirection)new DirectOutputRedirection()));
/*  81 */     if (launchResult == null) {
/*  82 */       Logger.getInstance().error(null, "could not execute hdiutil");
/*  83 */       return null;
/*     */     } 
/*  85 */     if (launchResult.getReturnCode() == 0 && launchResult.getOutput() != null) {
/*  86 */       String mountPoint = parseMountPoint(launchResult.getOutput());
/*  87 */       if (mountPoint != null) {
/*  88 */         return new File(mountPoint);
/*     */       }
/*     */     } 
/*  91 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static File findAttachedDmg(File dmgFile) throws IOException {
/*  98 */     Map<String, String> mountPointToDiskFile = getMountPointToDiskFile();
/*  99 */     if (mountPointToDiskFile != null) {
/* 100 */       for (int tryCount = 0; tryCount < 5; tryCount++) {
/* 101 */         for (Map.Entry<String, String> entry : mountPointToDiskFile.entrySet()) {
/* 102 */           if (Objects.equals((new File(entry.getValue())).getCanonicalFile(), dmgFile.getCanonicalFile())) {
/* 103 */             File mountPoint = new File(entry.getKey());
/* 104 */             for (int dirTryCount = 0; !mountPoint.isDirectory() && dirTryCount < 5; dirTryCount++) {
/*     */               try {
/* 106 */                 Thread.sleep(500L);
/* 107 */               } catch (InterruptedException interruptedException) {}
/*     */             } 
/* 109 */             return mountPoint;
/*     */           } 
/*     */         } 
/*     */         try {
/* 113 */           Thread.sleep(500L);
/* 114 */         } catch (InterruptedException interruptedException) {}
/* 115 */         mountPointToDiskFile = getMountPointToDiskFile();
/*     */       } 
/* 117 */       Logger.getInstance().error(null, "could not find mount point");
/*     */     } else {
/* 119 */       Logger.getInstance().error(null, "could not mount dmg file or retrieve mount points");
/*     */     } 
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   private static String parseMountPoint(String attachOutput) {
/*     */     try {
/* 126 */       Document document = XmlHelper.parseString(attachOutput, false, false);
/* 127 */       Element arrayElement = PlistHelper.getFirstChild(PlistHelper.getFirstChild(document.getDocumentElement(), "dict"), "array");
/* 128 */       for (Element partitionElement : XmlHelper.childElements(arrayElement)) {
/*     */         try {
/* 130 */           return XmlHelper.getTextValue(PlistHelper.findValue(partitionElement, "mount-point"));
/* 131 */         } catch (NotFoundException notFoundException) {}
/*     */       }
/*     */     
/* 134 */     } catch (Throwable t) {
/* 135 */       Logger.getInstance().log(t);
/*     */     } 
/* 137 */     return null;
/*     */   }
/*     */   
/*     */   public static boolean detach(File mountPoint) {
/* 141 */     Integer ret = LaunchHelper.launchApplication((new LaunchDescriptor(new File("/usr/bin/hdiutil"))).arguments(new String[] { "detach", mountPoint.getAbsolutePath() }).wait(true));
/* 142 */     return (ret != null && ret.intValue() == 0);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\VolumeInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */