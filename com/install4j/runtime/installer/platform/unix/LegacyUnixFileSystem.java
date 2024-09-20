/*     */ package com.install4j.runtime.installer.platform.unix;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Objects;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ public class LegacyUnixFileSystem
/*     */ {
/*     */   private static final String LINK_ARROW = " -> ";
/*     */   
/*     */   public static boolean setMode(int intMode, File destFile) {
/*  17 */     return setMode(StringUtil.padLeft(Integer.toOctalString(intMode & 0x1FF), '0', 3), destFile, false);
/*     */   }
/*     */   
/*     */   public static boolean setMode(String mode, File destFile) {
/*  21 */     return setMode(mode, destFile, false);
/*     */   }
/*     */   
/*     */   public static boolean setMode(String mode, File destFile, boolean recursive) {
/*  25 */     return setMode(mode, destFile, recursive, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean setMode(String mode, File destFile, boolean recursive, StringBuffer output) {
/*  30 */     if (Util.isWindows()) return false;
/*     */     
/*  32 */     if (Boolean.getBoolean("install4j.noDefaultChmod") && Objects.equals(mode, "644")) {
/*  33 */       return true;
/*     */     }
/*     */     try {
/*  36 */       String destFilePath = quoteDollarSign(destFile.getAbsolutePath());
/*  37 */       if (recursive) {
/*  38 */         return Execution.executeAndWait(new String[] { "chmod", "-R", mode, destFilePath }, output);
/*     */       }
/*  40 */       return Execution.executeAndWait(new String[] { "chmod", mode, destFilePath }, output);
/*     */     }
/*  42 */     catch (IOException e) {
/*  43 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean setMode(String mode, Collection<File> destFiles) {
/*  48 */     if (Util.isWindows()) return false;
/*     */     
/*     */     try {
/*  51 */       String[] command = new String[destFiles.size() + 2];
/*  52 */       command[0] = "chmod";
/*  53 */       command[1] = mode;
/*  54 */       int i = 2;
/*  55 */       for (File file : destFiles) {
/*  56 */         command[i++] = quoteDollarSign(file.getAbsolutePath());
/*     */       }
/*     */       
/*  59 */       return Execution.executeAndWait(command, null);
/*  60 */     } catch (IOException e) {
/*  61 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean createLink(String destFileName, File linkFile) throws IOException {
/*  66 */     if (Util.isWindows()) return false;
/*     */     
/*  68 */     linkFile.delete();
/*  69 */     return Execution.executeAndWait(new String[] { "ln", "-s", quoteDollarSign(destFileName), 
/*  70 */           quoteDollarSign(linkFile.getAbsolutePath()) }, null);
/*     */   }
/*     */   
/*     */   public static boolean setOwner(String owner, File file) {
/*  74 */     if (Util.isWindows()) {
/*  75 */       return false;
/*     */     }
/*     */     
/*     */     try {
/*     */       String executable;
/*  80 */       if (owner.startsWith(":")) {
/*  81 */         executable = "chgrp";
/*  82 */         owner = owner.substring(1);
/*     */       } else {
/*  84 */         executable = "chown";
/*     */       } 
/*  86 */       return Execution.executeAndWait(new String[] { executable, owner, quoteDollarSign(file.getAbsolutePath()) }, null);
/*  87 */     } catch (IOException e) {
/*  88 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static FileInformationImpl getFileInformation(File file) {
/*  93 */     if (file == null || !file.exists()) {
/*  94 */       return null;
/*     */     }
/*     */     try {
/*  97 */       StringBuffer output = new StringBuffer();
/*  98 */       String filePath = quoteDollarSign(file.getAbsolutePath());
/*  99 */       if (!Execution.executeAndWait(new String[] { "ls", "-lad", filePath }, output) || output.length() == 0) {
/* 100 */         return null;
/*     */       }
/*     */       
/* 103 */       FileInformationImpl fileInformation = new FileInformationImpl();
/*     */       
/* 105 */       fileInformation.mode = fromJavaTypeMode(output.substring(1));
/* 106 */       fileInformation.ownerInfo = getOwnerInfo(output);
/* 107 */       fileInformation.link = (output.charAt(0) == 'l');
/* 108 */       if (fileInformation.link) {
/* 109 */         fileInformation.linkTarget = getLinkTarget(output.toString());
/*     */       }
/*     */ 
/*     */       
/* 113 */       return fileInformation;
/* 114 */     } catch (Exception e) {
/* 115 */       System.err.println("Could not get file information for " + file.getAbsolutePath() + ", exception: " + e.getMessage());
/* 116 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String quoteDollarSign(String s) {
/* 121 */     return s.replaceAll("\\$", "\\\\\\$");
/*     */   }
/*     */   
/*     */   public static int getMode(File file) {
/* 125 */     FileInformationImpl fileInformation = getFileInformation(file);
/* 126 */     if (fileInformation != null) {
/* 127 */       return fileInformation.getMode();
/*     */     }
/* 129 */     return -1;
/*     */   }
/*     */   
/*     */   public static String getOwnerInfo(File file) {
/* 133 */     FileInformationImpl fileInformation = getFileInformation(file);
/* 134 */     if (fileInformation != null) {
/* 135 */       return fileInformation.getOwnerInfo();
/*     */     }
/* 137 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String getLinkTarget(String output) {
/* 142 */     int index = output.lastIndexOf(" -> ");
/* 143 */     if (index > -1) {
/* 144 */       return output.substring(index + " -> ".length()).trim();
/*     */     }
/* 146 */     return null;
/*     */   }
/*     */   
/*     */   private static String getOwnerInfo(StringBuffer output) {
/* 150 */     StringBuilder owner = new StringBuilder();
/* 151 */     int tokenCount = 0;
/* 152 */     for (StringTokenizer tokenizer = new StringTokenizer(output.toString(), " "); tokenizer.hasMoreTokens() && tokenCount < 4; ) {
/* 153 */       String token = tokenizer.nextToken();
/*     */       
/* 155 */       if (tokenCount == 2) {
/* 156 */         owner = new StringBuilder(token.trim());
/* 157 */       } else if (tokenCount == 3) {
/* 158 */         owner.append(":").append(token.trim());
/*     */       } 
/*     */       
/* 161 */       tokenCount++;
/*     */     } 
/* 163 */     if (tokenCount == 4 && owner.length() > 0) {
/* 164 */       return owner.toString();
/*     */     }
/* 166 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int fromJavaTypeMode(String javaTypeString) {
/* 171 */     if (javaTypeString.length() < 9) {
/* 172 */       return -1;
/*     */     }
/*     */     
/* 175 */     int mode = getGroupMode(javaTypeString, 0);
/* 176 */     mode += getGroupMode(javaTypeString, 1);
/* 177 */     mode += getGroupMode(javaTypeString, 2);
/* 178 */     return mode;
/*     */   }
/*     */   
/*     */   private static int getGroupMode(String output, int group) {
/* 182 */     int multiplier = (int)Math.pow(8.0D, (2 - group));
/*     */     
/* 184 */     int mode = 0;
/* 185 */     if (output.charAt(0 + group * 3) == 'r') {
/* 186 */       mode += multiplier * 4;
/*     */     }
/* 188 */     if (output.charAt(1 + group * 3) == 'w') {
/* 189 */       mode += multiplier * 2;
/*     */     }
/* 191 */     if (output.charAt(2 + group * 3) == 'x') {
/* 192 */       mode += multiplier;
/*     */     }
/* 194 */     return mode;
/*     */   }
/*     */   
/*     */   public static String toJavaTypeMode(String octalString) {
/* 198 */     int intValue = Integer.parseInt(octalString, 8);
/* 199 */     return toJavaTypeMode(intValue);
/*     */   }
/*     */   
/*     */   public static String toJavaTypeMode(int intValue) {
/* 203 */     StringBuffer ret = new StringBuffer();
/* 204 */     appendSingleJavaTypeMode((intValue & 0x1C0) >> 6, ret);
/* 205 */     appendSingleJavaTypeMode((intValue & 0x38) >> 3, ret);
/* 206 */     appendSingleJavaTypeMode(intValue & 0x7, ret);
/* 207 */     return ret.toString();
/*     */   }
/*     */   
/*     */   private static void appendSingleJavaTypeMode(int intValue, StringBuffer ret) {
/* 211 */     if ((intValue & 0x4) > 0) { ret.append("r"); } else { ret.append("-"); }
/* 212 */      if ((intValue & 0x2) > 0) { ret.append("w"); } else { ret.append("-"); }
/* 213 */      if ((intValue & 0x1) > 0) { ret.append("x"); } else { ret.append("-"); }
/*     */   
/*     */   }
/*     */   public static void main(String[] args) {
/* 217 */     System.out.println(Integer.toOctalString(fromJavaTypeMode(toJavaTypeMode("664"))));
/*     */   }
/*     */   
/*     */   public static class FileInformationImpl
/*     */     implements UnixFileSystem.FileInformation {
/* 222 */     private int mode = -1;
/*     */     
/*     */     private String ownerInfo;
/*     */     
/*     */     private boolean link;
/*     */     
/*     */     private String linkTarget;
/*     */     
/*     */     public FileInformationImpl(int mode, String ownerInfo, boolean link, String linkTarget) {
/* 231 */       this.mode = mode;
/* 232 */       this.ownerInfo = ownerInfo;
/* 233 */       this.link = link;
/* 234 */       this.linkTarget = linkTarget;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getMode() {
/* 239 */       return this.mode;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getOwnerInfo() {
/* 244 */       return this.ownerInfo;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isLink() {
/* 249 */       return this.link;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getLinkTarget() {
/* 254 */       return this.linkTarget;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 259 */       return Integer.toOctalString(this.mode) + ", " + this.ownerInfo + ", link: " + this.link + (this.link ? (", target: " + this.linkTarget) : "");
/*     */     }
/*     */     
/*     */     private FileInformationImpl() {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\LegacyUnixFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */