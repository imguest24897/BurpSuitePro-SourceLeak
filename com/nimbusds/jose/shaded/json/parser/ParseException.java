/*     */ package com.nimbusds.jose.shaded.json.parser;
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
/*     */ public class ParseException
/*     */   extends Exception
/*     */ {
/*     */   private static final long serialVersionUID = 8879024178584091857L;
/*     */   public static final int ERROR_UNEXPECTED_CHAR = 0;
/*     */   public static final int ERROR_UNEXPECTED_TOKEN = 1;
/*     */   public static final int ERROR_UNEXPECTED_EXCEPTION = 2;
/*     */   public static final int ERROR_UNEXPECTED_EOF = 3;
/*     */   public static final int ERROR_UNEXPECTED_UNICODE = 4;
/*     */   public static final int ERROR_UNEXPECTED_DUPLICATE_KEY = 5;
/*     */   public static final int ERROR_UNEXPECTED_LEADING_0 = 6;
/*     */   private int errorType;
/*     */   private Object unexpectedObject;
/*     */   private int position;
/*     */   
/*     */   public ParseException(int position, int errorType, Object unexpectedObject) {
/*  39 */     super(toMessage(position, errorType, unexpectedObject));
/*  40 */     this.position = position;
/*  41 */     this.errorType = errorType;
/*  42 */     this.unexpectedObject = unexpectedObject;
/*     */   }
/*     */   
/*     */   public ParseException(int position, Throwable cause) {
/*  46 */     super(toMessage(position, 2, cause), cause);
/*  47 */     this.position = position;
/*  48 */     this.errorType = 2;
/*  49 */     this.unexpectedObject = cause;
/*     */   }
/*     */   
/*     */   public int getErrorType() {
/*  53 */     return this.errorType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPosition() {
/*  61 */     return this.position;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getUnexpectedObject() {
/*  70 */     return this.unexpectedObject;
/*     */   }
/*     */   
/*     */   private static String toMessage(int position, int errorType, Object unexpectedObject) {
/*  74 */     StringBuilder sb = new StringBuilder();
/*     */     
/*  76 */     if (errorType == 0) {
/*  77 */       sb.append("Unexpected character (");
/*  78 */       sb.append(unexpectedObject);
/*  79 */       sb.append(") at position ");
/*  80 */       sb.append(position);
/*  81 */       sb.append(".");
/*  82 */     } else if (errorType == 1) {
/*  83 */       sb.append("Unexpected token ");
/*  84 */       sb.append(unexpectedObject);
/*  85 */       sb.append(" at position ");
/*  86 */       sb.append(position);
/*  87 */       sb.append(".");
/*  88 */     } else if (errorType == 2) {
/*  89 */       sb.append("Unexpected exception ");
/*  90 */       sb.append(unexpectedObject);
/*  91 */       sb.append(" occur at position ");
/*  92 */       sb.append(position);
/*  93 */       sb.append(".");
/*  94 */     } else if (errorType == 3) {
/*  95 */       sb.append("Unexpected End Of File position ");
/*  96 */       sb.append(position);
/*  97 */       sb.append(": ");
/*  98 */       sb.append(unexpectedObject);
/*  99 */     } else if (errorType == 4) {
/* 100 */       sb.append("Unexpected unicode escape sequence ");
/* 101 */       sb.append(unexpectedObject);
/* 102 */       sb.append(" at position ");
/* 103 */       sb.append(position);
/* 104 */       sb.append(".");
/* 105 */     } else if (errorType == 5) {
/* 106 */       sb.append("Unexpected duplicate key:");
/* 107 */       sb.append(unexpectedObject);
/* 108 */       sb.append(" at position ");
/* 109 */       sb.append(position);
/* 110 */       sb.append(".");
/* 111 */     } else if (errorType == 6) {
/* 112 */       sb.append("Unexpected leading 0 in digit for token:");
/* 113 */       sb.append(unexpectedObject);
/* 114 */       sb.append(" at position ");
/* 115 */       sb.append(position);
/* 116 */       sb.append(".");
/*     */     } else {
/* 118 */       sb.append("Unkown error at position ");
/* 119 */       sb.append(position);
/* 120 */       sb.append(".");
/*     */     } 
/* 122 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\parser\ParseException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */