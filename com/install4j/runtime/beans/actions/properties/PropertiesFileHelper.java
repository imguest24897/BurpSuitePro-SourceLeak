/*     */ package com.install4j.runtime.beans.actions.properties;
/*     */ 
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.CharsetEncoder;
/*     */ 
/*     */ public class PropertiesFileHelper
/*     */ {
/*   9 */   private static final char[] hexDigit = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
/*     */   
/*     */   public static String unescapeFromPropertiesFile(String text) {
/*  12 */     StringBuilder out = new StringBuilder();
/*  13 */     int offset = 0;
/*  14 */     int length = text.length();
/*  15 */     while (offset < length) {
/*  16 */       char c = text.charAt(offset++);
/*  17 */       if (c == '\\') {
/*  18 */         c = text.charAt(offset++);
/*  19 */         if (c == 'u') {
/*  20 */           int value = 0;
/*  21 */           for (int i = 0; i < 4; i++) {
/*  22 */             c = text.charAt(offset++);
/*  23 */             switch (c) {
/*     */               case '0':
/*     */               case '1':
/*     */               case '2':
/*     */               case '3':
/*     */               case '4':
/*     */               case '5':
/*     */               case '6':
/*     */               case '7':
/*     */               case '8':
/*     */               case '9':
/*  34 */                 value = (value << 4) + c - 48;
/*     */                 break;
/*     */               case 'a':
/*     */               case 'b':
/*     */               case 'c':
/*     */               case 'd':
/*     */               case 'e':
/*     */               case 'f':
/*  42 */                 value = (value << 4) + 10 + c - 97;
/*     */                 break;
/*     */               case 'A':
/*     */               case 'B':
/*     */               case 'C':
/*     */               case 'D':
/*     */               case 'E':
/*     */               case 'F':
/*  50 */                 value = (value << 4) + 10 + c - 65;
/*     */                 break;
/*     */               default:
/*  53 */                 throw new IllegalArgumentException("Malformed \\uxxxx encoding.");
/*     */             } 
/*     */           } 
/*  56 */           out.append((char)value); continue;
/*     */         } 
/*  58 */         switch (c) {
/*     */           case 't':
/*  60 */             c = '\t';
/*     */             break;
/*     */           case 'r':
/*  63 */             c = '\r';
/*     */             break;
/*     */           case 'n':
/*  66 */             c = '\n';
/*     */             break;
/*     */           case 'f':
/*  69 */             c = '\f';
/*     */             break;
/*     */         } 
/*  72 */         out.append(c);
/*     */         continue;
/*     */       } 
/*  75 */       out.append(c);
/*     */     } 
/*     */     
/*  78 */     return out.toString();
/*     */   }
/*     */   
/*     */   public static String escapeForPropertyFile(String text, boolean escapeKey, CharsetEncoder encoder, boolean regexpReplacement) {
/*  82 */     int length = text.length();
/*  83 */     StringBuilder out = new StringBuilder(length * 2);
/*     */     
/*  85 */     for (int x = 0; x < length; x++) {
/*  86 */       char c = text.charAt(x);
/*  87 */       if (c > '=' && c < '') {
/*  88 */         if (c == '\\') {
/*  89 */           out.append('\\');
/*  90 */           out.append('\\');
/*     */         } else {
/*     */           
/*  93 */           out.append(c);
/*     */         } 
/*     */       } else {
/*  96 */         switch (c) {
/*     */           case ' ':
/*  98 */             if (x == 0 || escapeKey) {
/*  99 */               out.append('\\');
/*     */             }
/* 101 */             out.append(' ');
/*     */             break;
/*     */           case '\t':
/* 104 */             out.append('\\');
/* 105 */             out.append('t');
/*     */             break;
/*     */           case '\n':
/* 108 */             out.append('\\');
/* 109 */             out.append('n');
/*     */             break;
/*     */           case '\r':
/* 112 */             out.append('\\');
/* 113 */             out.append('r');
/*     */             break;
/*     */           case '\f':
/* 116 */             out.append('\\');
/* 117 */             out.append('f');
/*     */             break;
/*     */           case '!':
/*     */           case '#':
/*     */           case ':':
/*     */           case '=':
/* 123 */             if (escapeKey || encoder == null) {
/* 124 */               out.append('\\');
/*     */             }
/* 126 */             out.append(c);
/*     */             break;
/*     */           default:
/* 129 */             if (!canEncode(c, encoder)) {
/* 130 */               if (regexpReplacement) {
/* 131 */                 out.append('\\');
/*     */               }
/* 133 */               out.append('\\');
/* 134 */               out.append('u');
/* 135 */               out.append(toHex(c >> 12 & 0xF));
/* 136 */               out.append(toHex(c >> 8 & 0xF));
/* 137 */               out.append(toHex(c >> 4 & 0xF));
/* 138 */               out.append(toHex(c & 0xF)); break;
/*     */             } 
/* 140 */             out.append(c); break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 144 */     return out.toString();
/*     */   }
/*     */   
/*     */   private static boolean canEncode(char c, CharsetEncoder encoder) {
/* 148 */     if (encoder == null) {
/* 149 */       return (c >= ' ' && c <= '~');
/*     */     }
/* 151 */     return (c >= ' ' && encoder.canEncode(c));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void writeComments(String comments, BufferedWriter writer, CharsetEncoder encoder) throws IOException {
/* 156 */     int length = comments.length();
/* 157 */     int current = 0;
/* 158 */     int last = 0;
/* 159 */     char[] uu = new char[6];
/* 160 */     uu[0] = '\\';
/* 161 */     uu[1] = 'u';
/* 162 */     while (current < length) {
/* 163 */       char c = comments.charAt(current);
/* 164 */       if (!canEncodeForComments(c, encoder) || c == '\n' || c == '\r') {
/* 165 */         if (last != current) {
/* 166 */           writer.write(comments.substring(last, current));
/*     */         }
/* 168 */         if (c > 'ÿ') {
/* 169 */           uu[2] = toHex(c >> 12 & 0xF);
/* 170 */           uu[3] = toHex(c >> 8 & 0xF);
/* 171 */           uu[4] = toHex(c >> 4 & 0xF);
/* 172 */           uu[5] = toHex(c & 0xF);
/* 173 */           writer.write(new String(uu));
/*     */         } else {
/* 175 */           writer.newLine();
/* 176 */           if (c == '\r' && current != length - 1 && comments.charAt(current + 1) == '\n') {
/* 177 */             current++;
/*     */           }
/*     */         } 
/* 180 */         last = current + 1;
/*     */       } 
/* 182 */       current++;
/*     */     } 
/* 184 */     if (last != current) {
/* 185 */       writer.write(comments.substring(last, current));
/*     */     }
/* 187 */     writer.newLine();
/*     */   }
/*     */   
/*     */   private static boolean canEncodeForComments(char c, CharsetEncoder encoder) {
/* 191 */     if (encoder == null) {
/* 192 */       return (c >= ' ' && c <= 'ÿ');
/*     */     }
/* 194 */     return (c >= ' ' && encoder.canEncode(c));
/*     */   }
/*     */ 
/*     */   
/*     */   private static char toHex(int nibble) {
/* 199 */     return hexDigit[nibble & 0xF];
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\PropertiesFileHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */