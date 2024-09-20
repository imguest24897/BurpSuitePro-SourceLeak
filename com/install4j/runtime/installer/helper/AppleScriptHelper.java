/*     */ package com.install4j.runtime.installer.helper;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class AppleScriptHelper {
/*  15 */   private static final int RECORD_PREFIX_LENGTH = "__i4j_rec_".length();
/*     */   
/*     */   private static final String RECORD_PREFIX = "__i4j_rec_";
/*     */   
/*     */   private static final String RECORD_START = "__i4j_rec_start";
/*     */ 
/*     */   
/*     */   public static String getRecordScript(String... identifiersToValues) {
/*  23 */     StringBuilder builder = new StringBuilder("    \tset output to output & \"\\n__i4j_rec_start\"\n");
/*  24 */     for (int i = 0; i < identifiersToValues.length; i += 2) {
/*  25 */       if (identifiersToValues[i].contains(":")) {
/*  26 */         throw new IllegalArgumentException("identifier must not contain a ':'");
/*     */       }
/*  28 */       builder.append("    \tset output to output & \"\\n__i4j_rec_").append(identifiersToValues[i]).append(": \" & ").append(identifiersToValues[i + 1]).append("\n");
/*     */     } 
/*  30 */     return builder.toString();
/*     */   }
/*     */   
/*     */   public static List<Map<String, String>> getRecords(String script) {
/*  34 */     StringBuffer output = new StringBuffer();
/*  35 */     StringBuffer error = new StringBuffer();
/*  36 */     if (executeScript(script, output, error)) {
/*  37 */       List<Map<String, String>> ret = new ArrayList<>();
/*  38 */       Map<String, String> currentEntry = null;
/*  39 */       String lastIdentifier = null;
/*  40 */       for (String line : output.toString().split("[\\r\\n]+")) {
/*     */         try {
/*  42 */           if (line.equals("__i4j_rec_start")) {
/*  43 */             if (currentEntry != null) {
/*  44 */               ret.add(currentEntry);
/*     */             }
/*  46 */             currentEntry = new HashMap<>();
/*  47 */             lastIdentifier = null;
/*  48 */           } else if (line.startsWith("__i4j_rec_")) {
/*  49 */             if (currentEntry == null) {
/*  50 */               Logger.getInstance().error(null, "start missing before: " + line);
/*     */             } else {
/*  52 */               int colonPos = line.indexOf(':', RECORD_PREFIX_LENGTH);
/*  53 */               if (colonPos == -1) {
/*  54 */                 Logger.getInstance().error(null, "invalid line: " + line);
/*     */               } else {
/*  56 */                 lastIdentifier = line.substring(RECORD_PREFIX_LENGTH, colonPos);
/*  57 */                 String value = "";
/*  58 */                 if (line.length() >= colonPos + 2) {
/*  59 */                   value = line.substring(colonPos + 2);
/*     */                 }
/*  61 */                 currentEntry.put(lastIdentifier, value);
/*     */               } 
/*     */             } 
/*  64 */           } else if (lastIdentifier != null) {
/*  65 */             currentEntry.put(lastIdentifier, (String)currentEntry.get(lastIdentifier) + "\n" + line);
/*     */           } 
/*  67 */         } catch (Exception e) {
/*  68 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/*  71 */       if (currentEntry != null) {
/*  72 */         ret.add(currentEntry);
/*     */       }
/*  74 */       return ret;
/*     */     } 
/*  76 */     Logger.getInstance().error(null, "error executing AppleScript: " + error);
/*     */     
/*  78 */     return null;
/*     */   }
/*     */   
/*     */   public static boolean executeScript(String script) {
/*  82 */     StringBuffer output = new StringBuffer();
/*  83 */     Logger.getInstance().info(null, script);
/*  84 */     boolean ret = executeScript(script, output, output);
/*  85 */     Logger.getInstance().info(null, output.toString());
/*  86 */     return ret;
/*     */   }
/*     */   
/*     */   private static boolean executeScript(String script, StringBuffer output, StringBuffer error) {
/*     */     try {
/*  91 */       File tempFile = File.createTempFile("i4j", ".script");
/*  92 */       PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(tempFile)), StandardCharsets.UTF_8));
/*  93 */       pw.println(script);
/*  94 */       pw.close();
/*  95 */       boolean ret = (Execution.executeWithReturnCode(new String[] { "/usr/bin/osascript", tempFile.getAbsolutePath() }, output, error, true) == 0);
/*  96 */       tempFile.delete();
/*  97 */       return ret;
/*  98 */     } catch (IOException e) {
/*  99 */       Logger.getInstance().log(e);
/* 100 */       return false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\AppleScriptHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */