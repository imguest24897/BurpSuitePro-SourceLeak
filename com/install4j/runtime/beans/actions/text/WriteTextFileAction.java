/*     */ package com.install4j.runtime.beans.actions.text;
/*     */ 
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.beans.actions.files.AbstractModifySingleFileAction;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class WriteTextFileAction
/*     */   extends AbstractModifySingleFileAction
/*     */   implements PropertyLoggingInterceptor {
/*  15 */   private String text = "";
/*  16 */   private String encoding = "";
/*     */   private boolean escaped = true;
/*     */   private boolean append = false;
/*     */   private boolean logText = true;
/*     */   
/*     */   public boolean isLogText() {
/*  22 */     return replaceWithTextOverride("logText", this.logText);
/*     */   }
/*     */   
/*     */   public void setLogText(boolean logText) {
/*  26 */     this.logText = logText;
/*     */   }
/*     */   
/*     */   public boolean isEscaped() {
/*  30 */     return replaceWithTextOverride("escaped", this.escaped);
/*     */   }
/*     */   
/*     */   public void setEscaped(boolean escaped) {
/*  34 */     this.escaped = escaped;
/*     */   }
/*     */   
/*     */   public String getText() {
/*  38 */     return replaceVariables(replaceVariables(this.text, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setText(String text) {
/*  42 */     this.text = text;
/*     */   }
/*     */   
/*     */   public String getEncoding() {
/*  46 */     return replaceVariables(replaceVariables(this.encoding));
/*     */   }
/*     */   
/*     */   public void setEncoding(String encoding) {
/*  50 */     this.encoding = encoding;
/*     */   }
/*     */   
/*     */   public boolean isAppend() {
/*  54 */     return replaceWithTextOverride("append", this.append);
/*     */   }
/*     */   
/*     */   public void setAppend(boolean append) {
/*  58 */     this.append = append;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean fileWillBeCreated() {
/*  63 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean modifyFile(File file, Context context) throws IOException {
/*  68 */     String encoding = getEncoding();
/*  69 */     String usedText = getText();
/*  70 */     if (isEscaped()) {
/*     */       try {
/*  72 */         usedText = loadConvert(usedText);
/*  73 */       } catch (Exception e) {
/*  74 */         Logger.getInstance().log(e);
/*  75 */         return false;
/*     */       } 
/*     */     }
/*  78 */     InstallerUtil.writeTextFile(usedText, file, encoding, isAppend());
/*  79 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String loadConvert(String theString) {
/*  84 */     int len = theString.length();
/*  85 */     StringBuilder outBuffer = new StringBuilder(len);
/*     */     
/*  87 */     for (int x = 0; x < len; ) {
/*  88 */       char aChar = theString.charAt(x++);
/*  89 */       if (aChar == '\\') {
/*  90 */         aChar = theString.charAt(x++);
/*  91 */         if (aChar == 'u') {
/*  92 */           int value = 0;
/*  93 */           for (int i = 0; i < 4; i++) {
/*  94 */             aChar = theString.charAt(x++);
/*  95 */             switch (aChar) { case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7':
/*     */               case '8':
/*     */               case '9':
/*  98 */                 value = (value << 4) + aChar - 48; break;
/*     */               case 'a': case 'b': case 'c': case 'd': case 'e':
/*     */               case 'f':
/* 101 */                 value = (value << 4) + 10 + aChar - 97; break;
/*     */               case 'A': case 'B': case 'C': case 'D': case 'E':
/*     */               case 'F':
/* 104 */                 value = (value << 4) + 10 + aChar - 65;
/*     */                 break;
/*     */               default:
/* 107 */                 throw new IllegalArgumentException("Malformed \\uxxxx encoding."); }
/*     */           
/*     */           } 
/* 110 */           outBuffer.append((char)value); continue;
/*     */         } 
/* 112 */         if (aChar == 't') { aChar = '\t'; }
/* 113 */         else if (aChar == 'r') { aChar = '\r'; }
/* 114 */         else if (aChar == 'n') { aChar = '\n'; }
/* 115 */         else if (aChar == 'f') { aChar = '\f'; }
/* 116 */          outBuffer.append(aChar);
/*     */         continue;
/*     */       } 
/* 119 */       outBuffer.append(aChar);
/*     */     } 
/* 121 */     return outBuffer.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/* 126 */     return maybeFilterLogReplacement(propertyName, "text", propertyValue, isLogText());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\WriteTextFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */