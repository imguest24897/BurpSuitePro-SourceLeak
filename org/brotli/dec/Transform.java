/*     */ package org.brotli.dec;
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
/*     */ final class Transform
/*     */ {
/*     */   private final byte[] prefix;
/*     */   private final int type;
/*     */   private final byte[] suffix;
/*     */   
/*     */   Transform(String prefix, int type, String suffix) {
/*  40 */     this.prefix = readUniBytes(prefix);
/*  41 */     this.type = type;
/*  42 */     this.suffix = readUniBytes(suffix);
/*     */   }
/*     */   
/*     */   static byte[] readUniBytes(String uniBytes) {
/*  46 */     byte[] result = new byte[uniBytes.length()];
/*  47 */     for (int i = 0; i < result.length; i++) {
/*  48 */       result[i] = (byte)uniBytes.charAt(i);
/*     */     }
/*  50 */     return result;
/*     */   }
/*     */   
/*  53 */   static final Transform[] TRANSFORMS = new Transform[] { new Transform("", 0, ""), new Transform("", 0, " "), new Transform(" ", 0, " "), new Transform("", 12, ""), new Transform("", 10, " "), new Transform("", 0, " the "), new Transform(" ", 0, ""), new Transform("s ", 0, " "), new Transform("", 0, " of "), new Transform("", 10, ""), new Transform("", 0, " and "), new Transform("", 13, ""), new Transform("", 1, ""), new Transform(", ", 0, " "), new Transform("", 0, ", "), new Transform(" ", 10, " "), new Transform("", 0, " in "), new Transform("", 0, " to "), new Transform("e ", 0, " "), new Transform("", 0, "\""), new Transform("", 0, "."), new Transform("", 0, "\">"), new Transform("", 0, "\n"), new Transform("", 3, ""), new Transform("", 0, "]"), new Transform("", 0, " for "), new Transform("", 14, ""), new Transform("", 2, ""), new Transform("", 0, " a "), new Transform("", 0, " that "), new Transform(" ", 10, ""), new Transform("", 0, ". "), new Transform(".", 0, ""), new Transform(" ", 0, ", "), new Transform("", 15, ""), new Transform("", 0, " with "), new Transform("", 0, "'"), new Transform("", 0, " from "), new Transform("", 0, " by "), new Transform("", 16, ""), new Transform("", 17, ""), new Transform(" the ", 0, ""), new Transform("", 4, ""), new Transform("", 0, ". The "), new Transform("", 11, ""), new Transform("", 0, " on "), new Transform("", 0, " as "), new Transform("", 0, " is "), new Transform("", 7, ""), new Transform("", 1, "ing "), new Transform("", 0, "\n\t"), new Transform("", 0, ":"), new Transform(" ", 0, ". "), new Transform("", 0, "ed "), new Transform("", 20, ""), new Transform("", 18, ""), new Transform("", 6, ""), new Transform("", 0, "("), new Transform("", 10, ", "), new Transform("", 8, ""), new Transform("", 0, " at "), new Transform("", 0, "ly "), new Transform(" the ", 0, " of "), new Transform("", 5, ""), new Transform("", 9, ""), new Transform(" ", 10, ", "), new Transform("", 10, "\""), new Transform(".", 0, "("), new Transform("", 11, " "), new Transform("", 10, "\">"), new Transform("", 0, "=\""), new Transform(" ", 0, "."), new Transform(".com/", 0, ""), new Transform(" the ", 0, " of the "), new Transform("", 10, "'"), new Transform("", 0, ". This "), new Transform("", 0, ","), new Transform(".", 0, " "), new Transform("", 10, "("), new Transform("", 10, "."), new Transform("", 0, " not "), new Transform(" ", 0, "=\""), new Transform("", 0, "er "), new Transform(" ", 11, " "), new Transform("", 0, "al "), new Transform(" ", 11, ""), new Transform("", 0, "='"), new Transform("", 11, "\""), new Transform("", 10, ". "), new Transform(" ", 0, "("), new Transform("", 0, "ful "), new Transform(" ", 10, ". "), new Transform("", 0, "ive "), new Transform("", 0, "less "), new Transform("", 11, "'"), new Transform("", 0, "est "), new Transform(" ", 10, "."), new Transform("", 11, "\">"), new Transform(" ", 0, "='"), new Transform("", 10, ","), new Transform("", 0, "ize "), new Transform("", 11, "."), new Transform("Â ", 0, ""), new Transform(" ", 0, ","), new Transform("", 10, "=\""), new Transform("", 11, "=\""), new Transform("", 0, "ous "), new Transform("", 11, ", "), new Transform("", 10, "='"), new Transform(" ", 10, ","), new Transform(" ", 11, "=\""), new Transform(" ", 11, ", "), new Transform("", 11, ","), new Transform("", 11, "("), new Transform("", 11, ". "), new Transform(" ", 11, "."), new Transform("", 11, "='"), new Transform(" ", 11, ". "), new Transform(" ", 10, "=\""), new Transform(" ", 11, "='"), new Transform(" ", 10, "='") };
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
/*     */   static int transformDictionaryWord(byte[] dst, int dstOffset, byte[] word, int wordOffset, int len, Transform transform) {
/* 179 */     int offset = dstOffset;
/*     */ 
/*     */     
/* 182 */     byte[] string = transform.prefix;
/* 183 */     int tmp = string.length;
/* 184 */     int i = 0;
/*     */     
/* 186 */     while (i < tmp) {
/* 187 */       dst[offset++] = string[i++];
/*     */     }
/*     */ 
/*     */     
/* 191 */     int op = transform.type;
/* 192 */     tmp = WordTransformType.getOmitFirst(op);
/* 193 */     if (tmp > len) {
/* 194 */       tmp = len;
/*     */     }
/* 196 */     wordOffset += tmp;
/* 197 */     len -= tmp;
/* 198 */     len -= WordTransformType.getOmitLast(op);
/* 199 */     i = len;
/* 200 */     while (i > 0) {
/* 201 */       dst[offset++] = word[wordOffset++];
/* 202 */       i--;
/*     */     } 
/*     */     
/* 205 */     if (op == 11 || op == 10) {
/* 206 */       int uppercaseOffset = offset - len;
/* 207 */       if (op == 10) {
/* 208 */         len = 1;
/*     */       }
/* 210 */       while (len > 0) {
/* 211 */         tmp = dst[uppercaseOffset] & 0xFF;
/* 212 */         if (tmp < 192) {
/* 213 */           if (tmp >= 97 && tmp <= 122) {
/* 214 */             dst[uppercaseOffset] = (byte)(dst[uppercaseOffset] ^ 0x20);
/*     */           }
/* 216 */           uppercaseOffset++;
/* 217 */           len--; continue;
/* 218 */         }  if (tmp < 224) {
/* 219 */           dst[uppercaseOffset + 1] = (byte)(dst[uppercaseOffset + 1] ^ 0x20);
/* 220 */           uppercaseOffset += 2;
/* 221 */           len -= 2; continue;
/*     */         } 
/* 223 */         dst[uppercaseOffset + 2] = (byte)(dst[uppercaseOffset + 2] ^ 0x5);
/* 224 */         uppercaseOffset += 3;
/* 225 */         len -= 3;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 231 */     string = transform.suffix;
/* 232 */     tmp = string.length;
/* 233 */     i = 0;
/* 234 */     while (i < tmp) {
/* 235 */       dst[offset++] = string[i++];
/*     */     }
/*     */     
/* 238 */     return offset - dstOffset;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\Transform.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */