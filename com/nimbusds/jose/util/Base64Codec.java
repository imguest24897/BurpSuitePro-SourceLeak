/*     */ package com.nimbusds.jose.util;
/*     */ 
/*     */ import java.util.Arrays;
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
/*     */ final class Base64Codec
/*     */ {
/*     */   static int computeEncodedLength(int inputLength, boolean urlSafe) {
/*  43 */     if (inputLength == 0) {
/*  44 */       return 0;
/*     */     }
/*     */     
/*  47 */     if (urlSafe) {
/*     */ 
/*     */       
/*  50 */       int fullQuadLength = inputLength / 3 << 2;
/*     */ 
/*     */       
/*  53 */       int remainder = inputLength % 3;
/*     */ 
/*     */       
/*  56 */       return (remainder == 0) ? fullQuadLength : (fullQuadLength + remainder + 1);
/*     */     } 
/*     */     
/*  59 */     return (inputLength - 1) / 3 + 1 << 2;
/*     */   }
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
/*     */   static int tpSelect(int bool, int when_true, int when_false) {
/*  85 */     int mask = bool - 1;
/*     */     
/*  87 */     return when_true ^ mask & (when_true ^ when_false);
/*     */   }
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
/*     */   static int tpLT(int a, int b) {
/* 100 */     return (int)(a - b >>> 63L);
/*     */   }
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
/*     */   static int tpGT(int a, int b) {
/* 113 */     return (int)(b - a >>> 63L);
/*     */   }
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
/*     */   static int tpEq(int a, int b) {
/* 129 */     int bit_diff = a ^ b;
/* 130 */     int msb_iff_zero_diff = bit_diff - 1 & (bit_diff ^ 0xFFFFFFFF);
/* 131 */     return msb_iff_zero_diff >>> 63;
/*     */   }
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
/*     */   static byte encodeDigitBase64(int digit_idx) {
/* 146 */     assert digit_idx >= 0 && digit_idx <= 63;
/*     */ 
/*     */     
/* 149 */     int is_uppercase = tpLT(digit_idx, 26);
/* 150 */     int is_lowercase = tpGT(digit_idx, 25) & tpLT(digit_idx, 52);
/* 151 */     int is_decimal = tpGT(digit_idx, 51) & tpLT(digit_idx, 62);
/* 152 */     int is_62 = tpEq(digit_idx, 62);
/* 153 */     int is_63 = tpEq(digit_idx, 63);
/*     */ 
/*     */     
/* 156 */     int as_uppercase = digit_idx - 0 + 65;
/* 157 */     int as_lowercase = digit_idx - 26 + 97;
/* 158 */     int as_decimal = digit_idx - 52 + 48;
/* 159 */     int as_62 = 43;
/* 160 */     int as_63 = 47;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 168 */     int ascii = tpSelect(is_uppercase, as_uppercase, 0) | tpSelect(is_lowercase, as_lowercase, 0) | tpSelect(is_decimal, as_decimal, 0) | tpSelect(is_62, 43, 0) | tpSelect(is_63, 47, 0);
/*     */     
/* 170 */     return (byte)ascii;
/*     */   }
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
/*     */   static byte encodeDigitBase64URL(int digit_idx) {
/* 185 */     assert digit_idx >= 0 && digit_idx <= 63;
/*     */ 
/*     */     
/* 188 */     int is_uppercase = tpLT(digit_idx, 26);
/* 189 */     int is_lowercase = tpGT(digit_idx, 25) & tpLT(digit_idx, 52);
/* 190 */     int is_decimal = tpGT(digit_idx, 51) & tpLT(digit_idx, 62);
/* 191 */     int is_62 = tpEq(digit_idx, 62);
/* 192 */     int is_63 = tpEq(digit_idx, 63);
/*     */ 
/*     */     
/* 195 */     int as_uppercase = digit_idx - 0 + 65;
/* 196 */     int as_lowercase = digit_idx - 26 + 97;
/* 197 */     int as_decimal = digit_idx - 52 + 48;
/* 198 */     int as_62 = 45;
/* 199 */     int as_63 = 95;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     int ascii = tpSelect(is_uppercase, as_uppercase, 0) | tpSelect(is_lowercase, as_lowercase, 0) | tpSelect(is_decimal, as_decimal, 0) | tpSelect(is_62, 45, 0) | tpSelect(is_63, 95, 0);
/*     */     
/* 209 */     return (byte)ascii;
/*     */   }
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
/*     */   static int decodeDigit(byte ascii) {
/* 226 */     int is_uppercase = tpGT(ascii, 64) & tpLT(ascii, 91);
/* 227 */     int is_lowercase = tpGT(ascii, 96) & tpLT(ascii, 123);
/* 228 */     int is_decimal = tpGT(ascii, 47) & tpLT(ascii, 58);
/* 229 */     int is_62 = tpEq(ascii, 45) | tpEq(ascii, 43);
/* 230 */     int is_63 = tpEq(ascii, 95) | tpEq(ascii, 47);
/*     */ 
/*     */     
/* 233 */     int is_valid = is_uppercase | is_lowercase | is_decimal | is_62 | is_63;
/*     */ 
/*     */     
/* 236 */     int from_uppercase = ascii - 65 + 0;
/* 237 */     int from_lowercase = ascii - 97 + 26;
/* 238 */     int from_decimal = ascii - 48 + 52;
/* 239 */     int from_62 = 62;
/* 240 */     int from_63 = 63;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     int digit_idx = tpSelect(is_uppercase, from_uppercase, 0) | tpSelect(is_lowercase, from_lowercase, 0) | tpSelect(is_decimal, from_decimal, 0) | tpSelect(is_62, 62, 0) | tpSelect(is_63, 63, 0) | tpSelect(is_valid, 0, -1);
/*     */     
/* 251 */     assert digit_idx >= -1 && digit_idx <= 63;
/*     */     
/* 253 */     return digit_idx;
/*     */   }
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
/*     */   public static String encodeToString(byte[] byteArray, boolean urlSafe) {
/* 270 */     int sLen = (byteArray != null) ? byteArray.length : 0;
/*     */     
/* 272 */     if (sLen == 0) {
/* 273 */       return "";
/*     */     }
/*     */     
/* 276 */     int eLen = sLen / 3 * 3;
/* 277 */     int dLen = computeEncodedLength(sLen, urlSafe);
/* 278 */     byte[] out = new byte[dLen];
/*     */ 
/*     */     
/* 281 */     for (int s = 0, d = 0; s < eLen; ) {
/*     */ 
/*     */       
/* 284 */       int i = (byteArray[s++] & 0xFF) << 16 | (byteArray[s++] & 0xFF) << 8 | byteArray[s++] & 0xFF;
/*     */ 
/*     */       
/* 287 */       if (urlSafe) {
/* 288 */         out[d++] = encodeDigitBase64URL(i >>> 18 & 0x3F);
/* 289 */         out[d++] = encodeDigitBase64URL(i >>> 12 & 0x3F);
/* 290 */         out[d++] = encodeDigitBase64URL(i >>> 6 & 0x3F);
/* 291 */         out[d++] = encodeDigitBase64URL(i & 0x3F); continue;
/*     */       } 
/* 293 */       out[d++] = encodeDigitBase64(i >>> 18 & 0x3F);
/* 294 */       out[d++] = encodeDigitBase64(i >>> 12 & 0x3F);
/* 295 */       out[d++] = encodeDigitBase64(i >>> 6 & 0x3F);
/* 296 */       out[d++] = encodeDigitBase64(i & 0x3F);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 302 */     int left = sLen - eLen;
/* 303 */     if (left > 0) {
/*     */       
/* 305 */       int i = (byteArray[eLen] & 0xFF) << 10 | ((left == 2) ? ((byteArray[sLen - 1] & 0xFF) << 2) : 0);
/*     */ 
/*     */       
/* 308 */       if (urlSafe) {
/*     */         
/* 310 */         if (left == 2) {
/* 311 */           out[dLen - 3] = encodeDigitBase64URL(i >> 12);
/* 312 */           out[dLen - 2] = encodeDigitBase64URL(i >>> 6 & 0x3F);
/* 313 */           out[dLen - 1] = encodeDigitBase64URL(i & 0x3F);
/*     */         } else {
/* 315 */           out[dLen - 2] = encodeDigitBase64URL(i >> 12);
/* 316 */           out[dLen - 1] = encodeDigitBase64URL(i >>> 6 & 0x3F);
/*     */         } 
/*     */       } else {
/*     */         
/* 320 */         out[dLen - 4] = encodeDigitBase64(i >> 12);
/* 321 */         out[dLen - 3] = encodeDigitBase64(i >>> 6 & 0x3F);
/* 322 */         out[dLen - 2] = (left == 2) ? encodeDigitBase64(i & 0x3F) : 61;
/* 323 */         out[dLen - 1] = 61;
/*     */       } 
/*     */     } 
/*     */     
/* 327 */     return new String(out, StandardCharset.UTF_8);
/*     */   }
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
/*     */   public static byte[] decode(String b64String) {
/* 344 */     if (b64String == null || b64String.isEmpty()) {
/* 345 */       return new byte[0];
/*     */     }
/*     */     
/* 348 */     byte[] srcBytes = b64String.getBytes(StandardCharset.UTF_8);
/* 349 */     int sLen = srcBytes.length;
/*     */ 
/*     */     
/* 352 */     int maxOutputLen = checkedCast(sLen * 6L >> 3L);
/*     */ 
/*     */     
/* 355 */     byte[] dstBytes = new byte[maxOutputLen];
/*     */ 
/*     */     
/* 358 */     int d = 0;
/* 359 */     for (int s = 0; s < srcBytes.length; ) {
/*     */ 
/*     */       
/* 362 */       int i = 0;
/*     */       
/* 364 */       int j = 0;
/* 365 */       while (j < 4 && s < sLen) {
/*     */         
/* 367 */         int c = decodeDigit(srcBytes[s++]);
/* 368 */         if (c >= 0) {
/* 369 */           i |= c << 18 - j * 6;
/* 370 */           j++;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 377 */       if (j >= 2) {
/* 378 */         dstBytes[d++] = (byte)(i >> 16);
/* 379 */         if (j >= 3) {
/* 380 */           dstBytes[d++] = (byte)(i >> 8);
/* 381 */           if (j >= 4) {
/* 382 */             dstBytes[d++] = (byte)i;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 391 */     return Arrays.copyOf(dstBytes, d);
/*     */   }
/*     */   
/*     */   private static int checkedCast(long value) {
/* 395 */     int result = (int)value;
/* 396 */     if (result != value) {
/* 397 */       throw new IllegalArgumentException(value + " cannot be cast to int without changing its value.");
/*     */     }
/*     */     
/* 400 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jos\\util\Base64Codec.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */