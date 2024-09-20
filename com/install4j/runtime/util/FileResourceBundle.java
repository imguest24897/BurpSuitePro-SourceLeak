/*    */ package com.install4j.runtime.util;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Enumeration;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.ResourceBundle;
/*    */ import java.util.Set;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class FileResourceBundle extends ResourceBundle implements ExtendedResourceBundle {
/*    */   public FileResourceBundle(File file, ResourceBundle parent) throws IOException {
/* 14 */     this(new FileInputStream(file), parent);
/*    */   }
/*    */   private LinkedHashMap<String, String> properties;
/*    */   
/*    */   public FileResourceBundle(InputStream input, ResourceBundle parent) throws IOException {
/* 19 */     this.properties = new LinkedHashMap<>();
/*    */     
/* 21 */     setParent(parent);
/*    */     
/* 23 */     BufferedReader br = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
/*    */     String line;
/* 25 */     while ((line = br.readLine()) != null) {
/* 26 */       if (line.trim().startsWith("#")) {
/*    */         continue;
/*    */       }
/* 29 */       int index = line.indexOf('=');
/* 30 */       if (index == -1) {
/*    */         continue;
/*    */       }
/* 33 */       String key = line.substring(0, index);
/* 34 */       if (key.charAt(0) == '﻿') {
/* 35 */         key = key.substring(1);
/*    */       }
/* 37 */       String value = line.substring(index + 1);
/* 38 */       value = replaceLineBreaks(value);
/* 39 */       this.properties.put(key, value);
/*    */     } 
/*    */     
/* 42 */     input.close();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean containsKeyDirectly(@NotNull String key) {
/* 47 */     boolean contained = this.properties.containsKey(key);
/* 48 */     if (!contained && key.startsWith(".")) {
/* 49 */       return this.properties.containsKey(key.substring(1));
/*    */     }
/* 51 */     return contained;
/*    */   }
/*    */ 
/*    */   
/*    */   public LinkedHashMap<String, String> getProperties() {
/* 56 */     return this.properties;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Enumeration<String> getKeys() {
/* 63 */     Set<String> keySet = this.properties.keySet();
/* 64 */     if (this.parent != null) {
/* 65 */       keySet = new LinkedHashSet<>(keySet);
/*    */       
/* 67 */       Enumeration<String> en = this.parent.getKeys();
/* 68 */       while (en.hasMoreElements()) {
/* 69 */         keySet.add(en.nextElement());
/*    */       }
/*    */     } 
/*    */     
/* 73 */     return Collections.enumeration(keySet);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Object handleGetObject(@NotNull String key) {
/* 78 */     if (key.startsWith(".")) {
/* 79 */       String keyWithoutLeadingDot = key.substring(1);
/* 80 */       if (!this.properties.containsKey(key) && this.properties.containsKey(keyWithoutLeadingDot)) {
/* 81 */         return this.properties.get(keyWithoutLeadingDot);
/*    */       }
/*    */     } 
/* 84 */     return this.properties.get(key);
/*    */   }
/*    */ 
/*    */   
/*    */   private String replaceLineBreaks(String string) {
/*    */     int index;
/* 90 */     while ((index = string.indexOf("\\n")) > -1) {
/* 91 */       string = string.substring(0, index) + "\n" + string.substring(index + 2);
/*    */     }
/* 93 */     while ((index = string.indexOf("¥n")) > -1) {
/* 94 */       string = string.substring(0, index) + "\n" + string.substring(index + 2);
/*    */     }
/* 96 */     return string;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\FileResourceBundle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */