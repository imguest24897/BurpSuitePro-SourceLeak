/*     */ package com.install4j.runtime.beans.actions.properties;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ import java.io.StringWriter;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.CharsetEncoder;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class TextProperties extends LinkedHashMap<String, String> {
/*  12 */   private Map<String, String> prefixes = new HashMap<>(); private String header;
/*     */   
/*     */   public String getHeader() {
/*  15 */     return this.header;
/*     */   }
/*     */   
/*     */   public void setHeader(String header) {
/*  19 */     this.header = header;
/*     */   }
/*     */   
/*     */   public Map<String, String> getPrefixes() {
/*  23 */     return this.prefixes;
/*     */   }
/*     */   
/*     */   public String getPrefix(String key) {
/*  27 */     return this.prefixes.get(key);
/*     */   }
/*     */   
/*     */   public void setPrefix(String key, String prefix) {
/*  31 */     if (prefix != null) {
/*  32 */       this.prefixes.put(key, prefix);
/*     */     } else {
/*  34 */       this.prefixes.remove(key);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void write(File file, PropertiesWriteParameters propertiesWriteParameters) throws IOException {
/*  39 */     write(new FileOutputStream(file), propertiesWriteParameters);
/*     */   }
/*     */   
/*     */   public void write(OutputStream outputStream, PropertiesWriteParameters propertiesWriteParameters) throws IOException {
/*  43 */     BufferedWriter writer = propertiesWriteParameters.createWriter(outputStream);
/*  44 */     write(writer, propertiesWriteParameters);
/*     */   }
/*     */   
/*     */   public void write(Writer writer, PropertiesWriteParameters propertiesWriteParameters) throws IOException {
/*     */     BufferedWriter bufferedWriter;
/*  49 */     if (writer instanceof BufferedWriter) {
/*  50 */       bufferedWriter = (BufferedWriter)writer;
/*     */     } else {
/*  52 */       bufferedWriter = new BufferedWriter(writer);
/*     */     } 
/*  54 */     CharsetEncoder encoder = propertiesWriteParameters.createEncoderForEscapingCheck();
/*  55 */     if (this.header != null) {
/*  56 */       PropertiesFileHelper.writeComments(this.header, bufferedWriter, encoder);
/*     */     }
/*     */     try {
/*  59 */       for (Map.Entry<String, String> entry : entrySet()) {
/*  60 */         String rawKey = entry.getKey();
/*  61 */         String key = PropertiesFileHelper.escapeForPropertyFile(rawKey, true, encoder, false);
/*  62 */         String value = PropertiesFileHelper.escapeForPropertyFile(entry.getValue(), false, encoder, false);
/*  63 */         String prefix = this.prefixes.get(rawKey);
/*  64 */         if (prefix != null) {
/*  65 */           PropertiesFileHelper.writeComments(prefix, bufferedWriter, encoder);
/*     */         }
/*  67 */         bufferedWriter.write(key + "=" + value);
/*  68 */         bufferedWriter.newLine();
/*     */       } 
/*  70 */       String trailingPrefix = this.prefixes.get(null);
/*  71 */       if (trailingPrefix != null) {
/*  72 */         PropertiesFileHelper.writeComments(trailingPrefix, bufferedWriter, encoder);
/*     */       }
/*     */     } finally {
/*  75 */       bufferedWriter.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void read(File file, PropertiesFileParameters propertiesFileParameters) throws IOException {
/*  80 */     read(new FileInputStream(file), propertiesFileParameters);
/*     */   }
/*     */   
/*     */   public void read(InputStream inputStream, PropertiesFileParameters propertiesFileParameters) throws IOException {
/*  84 */     read(propertiesFileParameters.createReader(inputStream));
/*     */   }
/*     */   
/*     */   public void read(Reader reader) throws IOException {
/*     */     BufferedReader bufferedReader;
/*  89 */     if (reader instanceof BufferedReader) {
/*  90 */       bufferedReader = (BufferedReader)reader;
/*     */     } else {
/*  92 */       bufferedReader = new BufferedReader(reader);
/*     */     } 
/*  94 */     StringBuilder prefix = null;
/*     */     try {
/*     */       String line;
/*  97 */       while ((line = bufferedReader.readLine()) != null) {
/*  98 */         String trimmedLine = line.trim();
/*  99 */         if (trimmedLine.isEmpty() || trimmedLine.startsWith("#")) {
/* 100 */           if (prefix == null) {
/* 101 */             prefix = new StringBuilder();
/*     */           } else {
/* 103 */             prefix.append("\n");
/*     */           } 
/* 105 */           prefix.append(line);
/*     */           continue;
/*     */         } 
/* 108 */         int lineLength = line.length();
/* 109 */         boolean precedingBackslash = false;
/* 110 */         int keyLength = 0;
/* 111 */         int valueStart = lineLength;
/* 112 */         boolean hasSeparator = false;
/* 113 */         while (keyLength < lineLength) {
/* 114 */           char c = line.charAt(keyLength);
/* 115 */           if ((c == '=' || c == ':') && !precedingBackslash) {
/* 116 */             valueStart = keyLength + 1;
/* 117 */             hasSeparator = true; break;
/*     */           } 
/* 119 */           if ((c == ' ' || c == '\t' || c == '\f') && !precedingBackslash) {
/* 120 */             valueStart = keyLength + 1;
/*     */             break;
/*     */           } 
/* 123 */           if (c == '\\') {
/* 124 */             precedingBackslash = !precedingBackslash;
/*     */           } else {
/* 126 */             precedingBackslash = false;
/*     */           } 
/* 128 */           keyLength++;
/*     */         } 
/* 130 */         while (valueStart < lineLength) {
/* 131 */           char c = line.charAt(valueStart);
/* 132 */           if (c != ' ' && c != '\t' && c != '\f') {
/* 133 */             if (!hasSeparator && (c == '=' || c == ':')) {
/* 134 */               hasSeparator = true;
/*     */             } else {
/*     */               break;
/*     */             } 
/*     */           }
/* 139 */           valueStart++;
/*     */         } 
/* 141 */         String key = PropertiesFileHelper.unescapeFromPropertiesFile(line.substring(0, keyLength));
/* 142 */         String value = PropertiesFileHelper.unescapeFromPropertiesFile(line.substring(valueStart, lineLength));
/* 143 */         put(key, value);
/* 144 */         if (prefix != null) {
/* 145 */           this.prefixes.put(key, prefix.toString());
/* 146 */           prefix = null;
/*     */         } 
/*     */       } 
/*     */       
/* 150 */       if (prefix != null) {
/* 151 */         this.prefixes.put(null, prefix.toString());
/*     */       }
/*     */     } finally {
/* 154 */       bufferedReader.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void putAll(Map<? extends String, ? extends String> map) {
/* 160 */     super.putAll(map);
/*     */     
/* 162 */     if (map instanceof TextProperties) {
/* 163 */       TextProperties textProperties = (TextProperties)map;
/* 164 */       if (textProperties.getHeader() != null) {
/* 165 */         setHeader(textProperties.getHeader());
/*     */       }
/* 167 */       this.prefixes.putAll(textProperties.getPrefixes());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String remove(Object key) {
/* 173 */     String remove = super.remove(key);
/* 174 */     this.prefixes.remove(key);
/* 175 */     return remove;
/*     */   }
/*     */   
/*     */   public String convertToUtf8String() throws IOException {
/* 179 */     StringWriter writer = new StringWriter();
/* 180 */     write(writer, new PropertiesWriteParameters(PropertiesFileEncoding.UTF8));
/* 181 */     return writer.toString();
/*     */   }
/*     */   
/*     */   public String convertToPropertiesString() throws IOException {
/* 185 */     StringWriter writer = new StringWriter();
/* 186 */     write(writer, new PropertiesWriteParameters(PropertiesFileEncoding.JAVA_PROPERTIES));
/* 187 */     return writer.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\TextProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */