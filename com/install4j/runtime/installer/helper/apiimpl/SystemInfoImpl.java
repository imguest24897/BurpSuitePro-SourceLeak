/*     */ package com.install4j.runtime.installer.helper.apiimpl;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import com.install4j.runtime.installer.platform.win32.Misc;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.lang.management.OperatingSystemMXBean;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.NoSuchElementException;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ 
/*     */ public class SystemInfoImpl
/*     */ {
/*  19 */   private static long physicalMemoryCache = -1L;
/*     */   
/*     */   public static long getFreeDiskSpace(File file) {
/*  22 */     file = file.getAbsoluteFile();
/*  23 */     while (file != null && !file.exists()) {
/*  24 */       file = file.getParentFile();
/*     */     }
/*  26 */     if (file != null) {
/*     */       try {
/*  28 */         if (Util.isWindows()) {
/*  29 */           return Misc.getFreeDiskSpace(file);
/*     */         }
/*     */         
/*  32 */         StringBuffer outputBuffer = new StringBuffer();
/*  33 */         if ((Util.isMacOS() || Util.isLinux()) && Execution.executeAndWait(new String[] { "df", "-k", file.getAbsolutePath() }, outputBuffer)) {
/*  34 */           String output = outputBuffer.toString().trim();
/*  35 */           StringTokenizer tokLines = new StringTokenizer(output, "\n");
/*  36 */           tokLines.nextToken();
/*  37 */           String line = tokLines.nextToken();
/*     */           
/*  39 */           StringTokenizer tokValues = new StringTokenizer(line, " \t\f");
/*     */           
/*     */           try {
/*  42 */             tokValues.nextToken();
/*  43 */             tokValues.nextToken();
/*  44 */             tokValues.nextToken();
/*  45 */           } catch (NoSuchElementException el) {
/*     */             
/*  47 */             line = tokLines.nextToken();
/*  48 */             tokValues = new StringTokenizer(line, " \t\f");
/*     */             
/*  50 */             tokValues.nextToken();
/*  51 */             tokValues.nextToken();
/*     */           } 
/*  53 */           return Long.parseLong(tokValues.nextToken()) * 1024L;
/*     */         }
/*     */       
/*  56 */       } catch (Exception e) {
/*     */         
/*  58 */         System.err.println("Could not determine disk space: " + e.getMessage());
/*     */       } 
/*     */     }
/*  61 */     return -1L;
/*     */   }
/*     */   
/*     */   public static long getPhysicalMemory() {
/*  65 */     if (physicalMemoryCache == -1L) {
/*  66 */       physicalMemoryCache = initPhysicalMemory();
/*     */     }
/*  68 */     return physicalMemoryCache;
/*     */   }
/*     */   
/*     */   private static long initPhysicalMemory() {
/*     */     try {
/*  73 */       OperatingSystemMXBean mbean = ManagementFactory.getOperatingSystemMXBean();
/*  74 */       Class<?> sunClass = Class.forName("com.sun.management.OperatingSystemMXBean");
/*  75 */       if (sunClass.isInstance(mbean)) {
/*  76 */         Method physicalMemMethod = sunClass.getMethod("getTotalPhysicalMemorySize", new Class[0]);
/*  77 */         Object ret = physicalMemMethod.invoke(mbean, new Object[0]);
/*  78 */         if (ret instanceof Long) {
/*  79 */           return ((Long)ret).longValue();
/*     */         }
/*     */       } 
/*  82 */     } catch (Throwable throwable) {}
/*     */ 
/*     */     
/*     */     try {
/*  86 */       if (Util.isWindows())
/*  87 */         return Misc.getPhysicalMemory(); 
/*  88 */       if (Util.isMacOS()) {
/*  89 */         long val = getSysctlResult("hw.memsize");
/*  90 */         if (val == 0L) {
/*  91 */           val = getSysctlResult("hw.physmem");
/*     */         }
/*  93 */         return val;
/*  94 */       }  if (Util.isLinux()) {
/*  95 */         BufferedReader reader = new BufferedReader(new FileReader("/proc/meminfo")); 
/*  96 */         try { String output = reader.readLine();
/*  97 */           String outputStart = "MemTotal: ";
/*  98 */           while (output != null)
/*  99 */           { output = output.trim();
/* 100 */             if (output.startsWith(outputStart) && output.length() > outputStart.length() + 2)
/* 101 */             { output = output.substring(outputStart.length(), output.length() - 2).trim();
/* 102 */               long l = Long.parseLong(output) * 1024L;
/*     */ 
/*     */ 
/*     */               
/* 106 */               reader.close(); return l; }  output = reader.readLine(); }  reader.close(); } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/*     */       } 
/* 108 */     } catch (Exception e) {
/* 109 */       e.printStackTrace();
/*     */     } 
/* 111 */     return 0L;
/*     */   }
/*     */   
/*     */   private static long getSysctlResult(String valueName) throws IOException {
/* 115 */     long val = 0L;
/*     */     try {
/* 117 */       StringBuffer outputBuffer = new StringBuffer();
/* 118 */       if (Execution.executeAndWait(new String[] { "sysctl", valueName }, outputBuffer)) {
/* 119 */         String output = outputBuffer.toString().trim();
/* 120 */         String outputStart = valueName + ": ";
/* 121 */         if (output.startsWith(outputStart)) {
/* 122 */           val = Long.parseLong(output.substring(outputStart.length()));
/*     */         }
/*     */       } 
/* 125 */     } catch (NumberFormatException numberFormatException) {}
/*     */ 
/*     */     
/* 128 */     return val;
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 132 */     System.out.println(getPhysicalMemory());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\SystemInfoImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */