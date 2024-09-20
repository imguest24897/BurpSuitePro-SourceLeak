/*     */ package com.nimbusds.jose.shaded.json;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JSONStyle
/*     */ {
/*     */   public static final int FLAG_PROTECT_KEYS = 1;
/*     */   public static final int FLAG_PROTECT_4WEB = 2;
/*     */   public static final int FLAG_PROTECT_VALUES = 4;
/*     */   public static final int FLAG_AGRESSIVE = 8;
/*     */   public static final int FLAG_IGNORE_NULL = 16;
/*  49 */   public static final JSONStyle NO_COMPRESS = new JSONStyle(0);
/*  50 */   public static final JSONStyle MAX_COMPRESS = new JSONStyle(-1);
/*     */ 
/*     */ 
/*     */   
/*  54 */   public static final JSONStyle LT_COMPRESS = new JSONStyle(2);
/*     */   
/*     */   private boolean _protectKeys;
/*     */   
/*     */   private boolean _protect4Web;
/*     */   private boolean _protectValues;
/*     */   private boolean _ignore_null;
/*     */   private JStylerObj.MustProtect mpKey;
/*     */   private JStylerObj.MustProtect mpValue;
/*     */   private JStylerObj.StringProtector esc;
/*     */   
/*     */   public JSONStyle(int FLAG) {
/*     */     JStylerObj.MustProtect mp;
/*  67 */     this._protectKeys = ((FLAG & 0x1) == 0);
/*  68 */     this._protectValues = ((FLAG & 0x4) == 0);
/*  69 */     this._protect4Web = ((FLAG & 0x2) == 0);
/*  70 */     this._ignore_null = ((FLAG & 0x10) > 0);
/*     */ 
/*     */     
/*  73 */     if ((FLAG & 0x8) > 0) {
/*  74 */       mp = JStylerObj.MP_AGGRESIVE;
/*     */     } else {
/*  76 */       mp = JStylerObj.MP_SIMPLE;
/*     */     } 
/*  78 */     if (this._protectValues) {
/*  79 */       this.mpValue = JStylerObj.MP_TRUE;
/*     */     } else {
/*  81 */       this.mpValue = mp;
/*     */     } 
/*  83 */     if (this._protectKeys) {
/*  84 */       this.mpKey = JStylerObj.MP_TRUE;
/*     */     } else {
/*  86 */       this.mpKey = mp;
/*     */     } 
/*  88 */     if (this._protect4Web) {
/*  89 */       this.esc = JStylerObj.ESCAPE4Web;
/*     */     } else {
/*  91 */       this.esc = JStylerObj.ESCAPE_LT;
/*     */     } 
/*     */   }
/*     */   public JSONStyle() {
/*  95 */     this(0);
/*     */   }
/*     */   
/*     */   public boolean protectKeys() {
/*  99 */     return this._protectKeys;
/*     */   }
/*     */   
/*     */   public boolean protectValues() {
/* 103 */     return this._protectValues;
/*     */   }
/*     */   
/*     */   public boolean protect4Web() {
/* 107 */     return this._protect4Web;
/*     */   }
/*     */   
/*     */   public boolean ignoreNull() {
/* 111 */     return this._ignore_null;
/*     */   }
/*     */   
/*     */   public boolean indent() {
/* 115 */     return false;
/*     */   }
/*     */   
/*     */   public boolean mustProtectKey(String s) {
/* 119 */     return this.mpKey.mustBeProtect(s);
/*     */   }
/*     */   
/*     */   public boolean mustProtectValue(String s) {
/* 123 */     return this.mpValue.mustBeProtect(s);
/*     */   }
/*     */   
/*     */   public void writeString(Appendable out, String value) throws IOException {
/* 127 */     if (!mustProtectValue(value)) {
/* 128 */       out.append(value);
/*     */     } else {
/* 130 */       out.append('"');
/* 131 */       JSONValue.escape(value, out, this);
/* 132 */       out.append('"');
/*     */     } 
/*     */   }
/*     */   
/*     */   public void escape(String s, Appendable out) {
/* 137 */     this.esc.escape(s, out);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void objectStart(Appendable out) throws IOException {
/* 144 */     out.append('{');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void objectStop(Appendable out) throws IOException {
/* 151 */     out.append('}');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void objectFirstStart(Appendable out) throws IOException {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void objectNext(Appendable out) throws IOException {
/* 164 */     out.append(',');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void objectElmStop(Appendable out) throws IOException {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void objectEndOfKey(Appendable out) throws IOException {
/* 177 */     out.append(':');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void arrayStart(Appendable out) throws IOException {
/* 184 */     out.append('[');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void arrayStop(Appendable out) throws IOException {
/* 191 */     out.append(']');
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void arrayfirstObject(Appendable out) throws IOException {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void arrayNextElm(Appendable out) throws IOException {
/* 204 */     out.append(',');
/*     */   }
/*     */   
/*     */   public void arrayObjectEnd(Appendable out) throws IOException {}
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JSONStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */