/*     */ package com.nimbusds.jose.shaded.json.writer;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.json.JSONStyle;
/*     */ import com.nimbusds.jose.shaded.json.JSONValue;
/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CompessorMapper
/*     */   extends JsonReaderI<CompessorMapper>
/*     */ {
/*     */   private Appendable out;
/*     */   private JSONStyle compression;
/*     */   private Boolean _isObj;
/*     */   private boolean needSep = false;
/*     */   private boolean isOpen = false;
/*     */   private boolean isClosed = false;
/*     */   
/*     */   private boolean isArray() {
/*  34 */     return (this._isObj == Boolean.FALSE);
/*     */   }
/*     */   
/*     */   private boolean isObject() {
/*  38 */     return (this._isObj == Boolean.TRUE);
/*     */   }
/*     */   
/*     */   private boolean isCompressor(Object obj) {
/*  42 */     return obj instanceof CompessorMapper;
/*     */   }
/*     */   
/*     */   public CompessorMapper(JsonReader base, Appendable out, JSONStyle compression) {
/*  46 */     this(base, out, compression, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public CompessorMapper(JsonReader base, Appendable out, JSONStyle compression, Boolean isObj) {
/*  51 */     super(base);
/*  52 */     this.out = out;
/*  53 */     this.compression = compression;
/*  54 */     this._isObj = isObj;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JsonReaderI<?> startObject(String key) throws IOException {
/*  60 */     open(this);
/*  61 */     startKey(key);
/*     */     
/*  63 */     CompessorMapper r = new CompessorMapper(this.base, this.out, this.compression, Boolean.valueOf(true));
/*  64 */     open(r);
/*  65 */     return r;
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonReaderI<?> startArray(String key) throws IOException {
/*  70 */     open(this);
/*  71 */     startKey(key);
/*     */     
/*  73 */     CompessorMapper r = new CompessorMapper(this.base, this.out, this.compression, Boolean.valueOf(false));
/*  74 */     open(r);
/*  75 */     return r;
/*     */   }
/*     */   
/*     */   private void startKey(String key) throws IOException {
/*  79 */     addComma();
/*     */ 
/*     */     
/*  82 */     if (isArray())
/*     */       return; 
/*  84 */     if (!this.compression.mustProtectKey(key)) {
/*  85 */       this.out.append(key);
/*     */     } else {
/*  87 */       this.out.append('"');
/*  88 */       JSONValue.escape(key, this.out, this.compression);
/*  89 */       this.out.append('"');
/*     */     } 
/*  91 */     this.out.append(':');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(Object current, String key, Object value) throws IOException {
/*  98 */     if (isCompressor(value)) {
/*  99 */       addComma();
/*     */       return;
/*     */     } 
/* 102 */     startKey(key);
/* 103 */     writeValue(value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addValue(Object current, Object value) throws IOException {
/* 110 */     addComma();
/* 111 */     writeValue(value);
/*     */   }
/*     */   
/*     */   private void addComma() throws IOException {
/* 115 */     if (this.needSep) {
/* 116 */       this.out.append(',');
/*     */     } else {
/*     */       
/* 119 */       this.needSep = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void writeValue(Object value) throws IOException {
/* 124 */     if (value instanceof String) {
/* 125 */       this.compression.writeString(this.out, (String)value);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 136 */     else if (isCompressor(value)) {
/* 137 */       close(value);
/*     */     } else {
/*     */       
/* 140 */       JSONValue.writeJSONString(value, this.out, this.compression);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object createObject() {
/* 149 */     this._isObj = Boolean.valueOf(true);
/*     */     try {
/* 151 */       open(this);
/* 152 */     } catch (Exception exception) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object createArray() {
/* 167 */     this._isObj = Boolean.valueOf(false);
/*     */     try {
/* 169 */       open(this);
/* 170 */     } catch (Exception exception) {}
/*     */     
/* 172 */     return this;
/*     */   }
/*     */   
/*     */   public CompessorMapper convert(Object current) {
/*     */     try {
/* 177 */       close(current);
/* 178 */       return this;
/* 179 */     } catch (Exception e) {
/* 180 */       return this;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void close(Object obj) throws IOException {
/* 185 */     if (!isCompressor(obj))
/*     */       return; 
/* 187 */     if (((CompessorMapper)obj).isClosed)
/*     */       return; 
/* 189 */     ((CompessorMapper)obj).isClosed = true;
/* 190 */     if (((CompessorMapper)obj).isObject()) {
/*     */       
/* 192 */       this.out.append('}');
/* 193 */       this.needSep = true;
/* 194 */     } else if (((CompessorMapper)obj).isArray()) {
/*     */       
/* 196 */       this.out.append(']');
/* 197 */       this.needSep = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void open(Object obj) throws IOException {
/* 202 */     if (!isCompressor(obj))
/*     */       return; 
/* 204 */     if (((CompessorMapper)obj).isOpen)
/*     */       return; 
/* 206 */     ((CompessorMapper)obj).isOpen = true;
/* 207 */     if (((CompessorMapper)obj).isObject()) {
/*     */       
/* 209 */       this.out.append('{');
/* 210 */       this.needSep = false;
/* 211 */     } else if (((CompessorMapper)obj).isArray()) {
/*     */       
/* 213 */       this.out.append('[');
/* 214 */       this.needSep = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\writer\CompessorMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */