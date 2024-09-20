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
/*     */ class JStylerObj
/*     */ {
/*  27 */   public static final MPSimple MP_SIMPLE = new MPSimple();
/*  28 */   public static final MPTrue MP_TRUE = new MPTrue();
/*  29 */   public static final MPAgressive MP_AGGRESIVE = new MPAgressive();
/*     */   
/*  31 */   public static final EscapeLT ESCAPE_LT = new EscapeLT();
/*  32 */   public static final Escape4Web ESCAPE4Web = new Escape4Web();
/*     */   
/*     */   public static interface MustProtect {
/*     */     boolean mustBeProtect(String param1String); }
/*     */   
/*     */   private static class MPTrue implements MustProtect { private MPTrue() {}
/*     */     
/*     */     public boolean mustBeProtect(String s) {
/*  40 */       return true;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static class MPSimple
/*     */     implements MustProtect
/*     */   {
/*     */     private MPSimple() {}
/*     */ 
/*     */     
/*     */     public boolean mustBeProtect(String s) {
/*  53 */       if (s == null)
/*  54 */         return false; 
/*  55 */       int len = s.length();
/*  56 */       if (len == 0)
/*  57 */         return true; 
/*  58 */       if (s.trim() != s) {
/*  59 */         return true;
/*     */       }
/*  61 */       char ch = s.charAt(0);
/*  62 */       if ((ch >= '0' && ch <= '9') || ch == '-') {
/*  63 */         return true;
/*     */       }
/*  65 */       for (int i = 0; i < len; i++) {
/*  66 */         ch = s.charAt(i);
/*  67 */         if (JStylerObj.isSpace(ch))
/*  68 */           return true; 
/*  69 */         if (JStylerObj.isSpecial(ch))
/*  70 */           return true; 
/*  71 */         if (JStylerObj.isSpecialChar(ch))
/*  72 */           return true; 
/*  73 */         if (JStylerObj.isUnicode(ch)) {
/*  74 */           return true;
/*     */         }
/*     */       } 
/*  77 */       if (JStylerObj.isKeyword(s))
/*  78 */         return true; 
/*  79 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class MPAgressive implements MustProtect {
/*     */     public boolean mustBeProtect(String s) {
/*  85 */       if (s == null)
/*  86 */         return false; 
/*  87 */       int len = s.length();
/*     */       
/*  89 */       if (len == 0) {
/*  90 */         return true;
/*     */       }
/*     */       
/*  93 */       if (s.trim() != s) {
/*  94 */         return true;
/*     */       }
/*     */       
/*  97 */       char ch = s.charAt(0);
/*  98 */       if (JStylerObj.isSpecial(ch) || JStylerObj.isUnicode(ch)) {
/*  99 */         return true;
/*     */       }
/* 101 */       for (int i = 1; i < len; i++) {
/* 102 */         ch = s.charAt(i);
/* 103 */         if (JStylerObj.isSpecialClose(ch) || JStylerObj.isUnicode(ch)) {
/* 104 */           return true;
/*     */         }
/*     */       } 
/* 107 */       if (JStylerObj.isKeyword(s)) {
/* 108 */         return true;
/*     */       }
/* 110 */       ch = s.charAt(0);
/*     */       
/* 112 */       if ((ch >= '0' && ch <= '9') || ch == '-') {
/* 113 */         int p = 1;
/*     */         
/* 115 */         for (; p < len; p++) {
/* 116 */           ch = s.charAt(p);
/* 117 */           if (ch < '0' || ch > '9') {
/*     */             break;
/*     */           }
/*     */         } 
/* 121 */         if (p == len) {
/* 122 */           return true;
/*     */         }
/* 124 */         if (ch == '.') {
/* 125 */           p++;
/*     */         }
/*     */         
/* 128 */         for (; p < len; p++) {
/* 129 */           ch = s.charAt(p);
/* 130 */           if (ch < '0' || ch > '9')
/*     */             break; 
/*     */         } 
/* 133 */         if (p == len) {
/* 134 */           return true;
/*     */         }
/* 136 */         if (ch == 'E' || ch == 'e') {
/* 137 */           p++;
/* 138 */           if (p == len)
/* 139 */             return false; 
/* 140 */           ch = s.charAt(p);
/* 141 */           if (ch == '+' || ch == '-') {
/* 142 */             p++;
/* 143 */             ch = s.charAt(p);
/*     */           } 
/*     */         } 
/* 146 */         if (p == len) {
/* 147 */           return false;
/*     */         }
/* 149 */         for (; p < len; p++) {
/* 150 */           ch = s.charAt(p);
/* 151 */           if (ch < '0' || ch > '9') {
/*     */             break;
/*     */           }
/*     */         } 
/* 155 */         if (p == len)
/* 156 */           return true; 
/* 157 */         return false;
/*     */       } 
/* 159 */       return false;
/*     */     }
/*     */     private MPAgressive() {} }
/*     */   
/*     */   public static boolean isSpace(char c) {
/* 164 */     return (c == '\r' || c == '\n' || c == '\t' || c == ' ');
/*     */   }
/*     */   
/*     */   public static boolean isSpecialChar(char c) {
/* 168 */     return (c == '\b' || c == '\f' || c == '\n');
/*     */   }
/*     */   
/*     */   public static boolean isSpecialOpen(char c) {
/* 172 */     return (c == '{' || c == '[' || c == ',' || c == ':');
/*     */   }
/*     */   
/*     */   public static boolean isSpecialClose(char c) {
/* 176 */     return (c == '}' || c == ']' || c == ',' || c == ':');
/*     */   }
/*     */   
/*     */   public static boolean isSpecial(char c) {
/* 180 */     return (c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '"');
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isUnicode(char c) {
/* 185 */     return ((c >= '\000' && c <= '\037') || (c >= '' && c <= '') || (c >= ' ' && c <= '⃿'));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isKeyword(String s) {
/* 194 */     if (s.length() < 3)
/* 195 */       return false; 
/* 196 */     char c = s.charAt(0);
/* 197 */     if (c == 'n')
/* 198 */       return s.equals("null"); 
/* 199 */     if (c == 't')
/* 200 */       return s.equals("true"); 
/* 201 */     if (c == 'f')
/* 202 */       return s.equals("false"); 
/* 203 */     if (c == 'N')
/* 204 */       return s.equals("NaN"); 
/* 205 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static interface StringProtector
/*     */   {
/*     */     void escape(String param1String, Appendable param1Appendable);
/*     */   }
/*     */ 
/*     */   
/*     */   private static class EscapeLT
/*     */     implements StringProtector
/*     */   {
/*     */     private EscapeLT() {}
/*     */     
/*     */     public void escape(String s, Appendable out) {
/*     */       try {
/* 222 */         int len = s.length();
/* 223 */         for (int i = 0; i < len; i++) {
/* 224 */           char ch = s.charAt(i);
/* 225 */           switch (ch) {
/*     */             case '"':
/* 227 */               out.append("\\\"");
/*     */               break;
/*     */             case '\\':
/* 230 */               out.append("\\\\");
/*     */               break;
/*     */             case '\b':
/* 233 */               out.append("\\b");
/*     */               break;
/*     */             case '\f':
/* 236 */               out.append("\\f");
/*     */               break;
/*     */             case '\n':
/* 239 */               out.append("\\n");
/*     */               break;
/*     */             case '\r':
/* 242 */               out.append("\\r");
/*     */               break;
/*     */             case '\t':
/* 245 */               out.append("\\t");
/*     */               break;
/*     */ 
/*     */             
/*     */             default:
/* 250 */               if ((ch >= '\000' && ch <= '\037') || (ch >= '' && ch <= '') || (ch >= ' ' && ch <= '⃿')) {
/*     */                 
/* 252 */                 out.append("\\u");
/* 253 */                 String hex = "0123456789ABCDEF";
/* 254 */                 out.append(hex.charAt(ch >> 12 & 0xF));
/* 255 */                 out.append(hex.charAt(ch >> 8 & 0xF));
/* 256 */                 out.append(hex.charAt(ch >> 4 & 0xF));
/* 257 */                 out.append(hex.charAt(ch >> 0 & 0xF)); break;
/*     */               } 
/* 259 */               out.append(ch);
/*     */               break;
/*     */           } 
/*     */         } 
/* 263 */       } catch (IOException e) {
/* 264 */         throw new RuntimeException("Impossible Exception");
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class Escape4Web
/*     */     implements StringProtector
/*     */   {
/*     */     private Escape4Web() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void escape(String s, Appendable sb) {
/*     */       try {
/* 280 */         int len = s.length();
/* 281 */         for (int i = 0; i < len; i++) {
/* 282 */           char ch = s.charAt(i);
/* 283 */           switch (ch) {
/*     */             case '"':
/* 285 */               sb.append("\\\"");
/*     */               break;
/*     */             case '\\':
/* 288 */               sb.append("\\\\");
/*     */               break;
/*     */             case '\b':
/* 291 */               sb.append("\\b");
/*     */               break;
/*     */             case '\f':
/* 294 */               sb.append("\\f");
/*     */               break;
/*     */             case '\n':
/* 297 */               sb.append("\\n");
/*     */               break;
/*     */             case '\r':
/* 300 */               sb.append("\\r");
/*     */               break;
/*     */             case '\t':
/* 303 */               sb.append("\\t");
/*     */               break;
/*     */             case '/':
/* 306 */               sb.append("\\/");
/*     */               break;
/*     */ 
/*     */             
/*     */             default:
/* 311 */               if ((ch >= '\000' && ch <= '\037') || (ch >= '' && ch <= '') || (ch >= ' ' && ch <= '⃿')) {
/*     */                 
/* 313 */                 sb.append("\\u");
/* 314 */                 String hex = "0123456789ABCDEF";
/* 315 */                 sb.append(hex.charAt(ch >> 12 & 0xF));
/* 316 */                 sb.append(hex.charAt(ch >> 8 & 0xF));
/* 317 */                 sb.append(hex.charAt(ch >> 4 & 0xF));
/* 318 */                 sb.append(hex.charAt(ch >> 0 & 0xF)); break;
/*     */               } 
/* 320 */               sb.append(ch);
/*     */               break;
/*     */           } 
/*     */         } 
/* 324 */       } catch (IOException e) {
/* 325 */         throw new RuntimeException("Impossible Error");
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\JStylerObj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */