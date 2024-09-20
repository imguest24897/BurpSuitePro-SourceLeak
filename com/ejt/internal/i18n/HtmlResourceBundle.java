/*    */ package com.ejt.internal.i18n;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.InputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Enumeration;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.List;
/*    */ import java.util.ResourceBundle;
/*    */ import java.util.Set;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class HtmlResourceBundle extends ResourceBundle {
/* 15 */   private static final Pattern PATTERN_DIV = Pattern.compile("<div\\s+id=\"([^\"]+)\"");
/* 16 */   private static final Pattern PATTERN_KEY = Pattern.compile("(.*?)(?:\\.(\\d+))?");
/*    */   
/*    */   private LinkedHashMap<String, String> messages;
/*    */   
/*    */   public HtmlResourceBundle(InputStream input, ResourceBundle parent) throws IOException {
/* 21 */     this.messages = new LinkedHashMap<String, String>();
/*    */     
/* 23 */     setParent(parent);
/*    */     
/* 25 */     BufferedReader br = new BufferedReader(new InputStreamReader(input, "UTF-8"));
/*    */     
/* 27 */     boolean inDiv = false;
/* 28 */     String currentId = null;
/* 29 */     List<String> currentLines = new ArrayList<String>(); String line;
/* 30 */     while ((line = br.readLine()) != null) {
/* 31 */       String trimmedLine = line.trim();
/* 32 */       if (trimmedLine.startsWith("<div")) {
/* 33 */         inDiv = true;
/* 34 */         Matcher matcher = PATTERN_DIV.matcher(trimmedLine);
/* 35 */         if (matcher.find())
/* 36 */           currentId = matcher.group(1);  continue;
/*    */       } 
/* 38 */       if (trimmedLine.startsWith("</div>")) {
/* 39 */         if (currentId != null) {
/* 40 */           Matcher matcher = PATTERN_KEY.matcher(currentId);
/* 41 */           if (matcher.matches()) {
/* 42 */             String key = matcher.group(1);
/* 43 */             this.messages.put(key, toMessage(currentLines));
/*    */           } 
/*    */         } 
/* 46 */         currentLines.clear();
/* 47 */         currentId = null;
/* 48 */         inDiv = false; continue;
/* 49 */       }  if (inDiv) {
/* 50 */         currentLines.add(trimmedLine);
/*    */       }
/*    */     } 
/* 53 */     input.close();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private String toMessage(List<String> currentLines) {
/* 58 */     StringBuilder buffer = new StringBuilder();
/* 59 */     for (String currentLine : currentLines) {
/* 60 */       if (buffer.length() > 0) {
/* 61 */         buffer.append(' ');
/*    */       }
/* 63 */       buffer.append(currentLine.trim());
/*    */     } 
/* 65 */     return buffer.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Enumeration<String> getKeys() {
/* 71 */     Set<String> keySet = this.messages.keySet();
/* 72 */     if (this.parent != null) {
/* 73 */       keySet = new LinkedHashSet<String>(keySet);
/* 74 */       Enumeration<String> en = this.parent.getKeys();
/* 75 */       while (en.hasMoreElements()) {
/* 76 */         keySet.add(en.nextElement());
/*    */       }
/*    */     } 
/* 79 */     return Collections.enumeration(keySet);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Object handleGetObject(@NotNull String key) {
/* 84 */     return this.messages.get(key);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\i18n\HtmlResourceBundle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */