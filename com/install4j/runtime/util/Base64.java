/*     */ package com.install4j.runtime.util;
/*     */ 
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Base64
/*     */ {
/*     */   public static final int NO_OPTIONS = 0;
/*     */   public static final int ENCODE = 1;
/*     */   public static final int DECODE = 0;
/*     */   private static final byte EQUALS_SIGN = 61;
/*     */   private static final String PREFERRED_ENCODING = "UTF-8";
/*     */   
/*     */   static {
/*  16 */     _NATIVE_ALPHABET = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  33 */       __bytes = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes("UTF-8");
/*     */     }
/*  35 */     catch (UnsupportedEncodingException use) {
/*  36 */       __bytes = _NATIVE_ALPHABET;
/*     */     } 
/*  38 */     ALPHABET = __bytes;
/*     */ 
/*     */ 
/*     */     
/*  42 */     DECODABET = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9 };
/*     */   }
/*     */ 
/*     */   
/*     */   private static final byte[] ALPHABET;
/*     */   private static final byte[] _NATIVE_ALPHABET;
/*     */   private static final byte[] DECODABET;
/*     */   private static final byte WHITE_SPACE_ENC = -5;
/*     */   private static final byte EQUALS_SIGN_ENC = -1;
/*     */   
/*     */   static {
/*     */     byte[] __bytes;
/*     */   }
/*     */   
/*     */   public static String encodeForFiles(byte[] source) {
/*  57 */     return encode(source).replace('+', '-').replace('/', '_');
/*     */   }
/*     */   
/*     */   public static String encodeForFiles(String s) {
/*     */     try {
/*  62 */       return encodeForFiles(s.getBytes("UTF-8"));
/*  63 */     } catch (UnsupportedEncodingException e) {
/*  64 */       e.printStackTrace();
/*  65 */       return "";
/*     */     } 
/*     */   }
/*     */   
/*     */   public static byte[] decodeForFiles(String s) {
/*  70 */     return decode(s.replace('-', '+').replace('_', '/'));
/*     */   }
/*     */   
/*     */   public static String decodeAsStringForFiles(String s) {
/*     */     try {
/*  75 */       return new String(decodeForFiles(s), "UTF-8");
/*  76 */     } catch (UnsupportedEncodingException e) {
/*  77 */       e.printStackTrace();
/*  78 */       return "";
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String encode(byte[] source) {
/*  85 */     int len = source.length;
/*  86 */     int len43 = len * 4 / 3;
/*  87 */     byte[] outBuff = new byte[len43 + ((len % 3 > 0) ? 4 : 0)];
/*  88 */     int d = 0;
/*  89 */     int e = 0;
/*  90 */     int len2 = len - 2;
/*  91 */     for (; d < len2; d += 3, e += 4) {
/*  92 */       encode3to4(source, d, 3, outBuff, e);
/*     */     }
/*     */     
/*  95 */     if (d < len) {
/*  96 */       encode3to4(source, d, len - d, outBuff, e);
/*  97 */       e += 4;
/*     */     } 
/*     */     
/*     */     try {
/* 101 */       return new String(outBuff, 0, e, "UTF-8");
/*     */     }
/* 103 */     catch (UnsupportedEncodingException uue) {
/* 104 */       return new String(outBuff, 0, e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static byte[] decode(String s) {
/*     */     byte[] bytes;
/*     */     try {
/* 112 */       bytes = s.getBytes("UTF-8");
/*     */     }
/* 114 */     catch (UnsupportedEncodingException uee) {
/* 115 */       bytes = s.getBytes();
/*     */     } 
/*     */     
/* 118 */     int len = bytes.length;
/* 119 */     int len34 = len * 3 / 4;
/* 120 */     byte[] outBuff = new byte[len34];
/* 121 */     int outBuffPosn = 0;
/*     */     
/* 123 */     byte[] b4 = new byte[4];
/* 124 */     int b4Posn = 0;
/*     */ 
/*     */ 
/*     */     
/* 128 */     for (int i = 0; i < len; i++) {
/* 129 */       byte sbiCrop = (byte)(bytes[i] & Byte.MAX_VALUE);
/* 130 */       byte sbiDecode = DECODABET[sbiCrop];
/*     */       
/* 132 */       if (sbiDecode >= -5) {
/* 133 */         if (sbiDecode >= -1) {
/* 134 */           b4[b4Posn++] = sbiCrop;
/* 135 */           if (b4Posn > 3) {
/* 136 */             outBuffPosn += decode4to3(b4, 0, outBuff, outBuffPosn);
/* 137 */             b4Posn = 0;
/*     */             
/* 139 */             if (sbiCrop == 61) {
/*     */               break;
/*     */             }
/*     */           }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 147 */         throw new RuntimeException("Bad Base64 input character at " + i + ": " + bytes[i] + "(decimal)");
/*     */       } 
/*     */     } 
/*     */     
/* 151 */     byte[] out = new byte[outBuffPosn];
/* 152 */     System.arraycopy(outBuff, 0, out, 0, outBuffPosn);
/* 153 */     return out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static byte[] encode3to4(byte[] source, int srcOffset, int numSigBytes, byte[] destination, int destOffset) {
/* 161 */     int inBuff = ((numSigBytes > 0) ? (source[srcOffset] << 24 >>> 8) : 0) | ((numSigBytes > 1) ? (source[srcOffset + 1] << 24 >>> 16) : 0) | ((numSigBytes > 2) ? (source[srcOffset + 2] << 24 >>> 24) : 0);
/*     */     
/* 163 */     switch (numSigBytes) {
/*     */       case 3:
/* 165 */         destination[destOffset] = ALPHABET[inBuff >>> 18];
/* 166 */         destination[destOffset + 1] = ALPHABET[inBuff >>> 12 & 0x3F];
/* 167 */         destination[destOffset + 2] = ALPHABET[inBuff >>> 6 & 0x3F];
/* 168 */         destination[destOffset + 3] = ALPHABET[inBuff & 0x3F];
/* 169 */         return destination;
/*     */       
/*     */       case 2:
/* 172 */         destination[destOffset] = ALPHABET[inBuff >>> 18];
/* 173 */         destination[destOffset + 1] = ALPHABET[inBuff >>> 12 & 0x3F];
/* 174 */         destination[destOffset + 2] = ALPHABET[inBuff >>> 6 & 0x3F];
/* 175 */         destination[destOffset + 3] = 61;
/* 176 */         return destination;
/*     */       
/*     */       case 1:
/* 179 */         destination[destOffset] = ALPHABET[inBuff >>> 18];
/* 180 */         destination[destOffset + 1] = ALPHABET[inBuff >>> 12 & 0x3F];
/* 181 */         destination[destOffset + 2] = 61;
/* 182 */         destination[destOffset + 3] = 61;
/* 183 */         return destination;
/*     */     } 
/*     */     
/* 186 */     return destination;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int decode4to3(byte[] source, int srcOffset, byte[] destination, int destOffset) {
/* 192 */     if (source[srcOffset + 2] == 61) {
/* 193 */       int outBuff = (DECODABET[source[srcOffset]] & 0xFF) << 18 | (DECODABET[source[srcOffset + 1]] & 0xFF) << 12;
/*     */ 
/*     */       
/* 196 */       destination[destOffset] = (byte)(outBuff >>> 16);
/* 197 */       return 1;
/*     */     } 
/*     */     
/* 200 */     if (source[srcOffset + 3] == 61) {
/* 201 */       int outBuff = (DECODABET[source[srcOffset]] & 0xFF) << 18 | (DECODABET[source[srcOffset + 1]] & 0xFF) << 12 | (DECODABET[source[srcOffset + 2]] & 0xFF) << 6;
/*     */ 
/*     */ 
/*     */       
/* 205 */       destination[destOffset] = (byte)(outBuff >>> 16);
/* 206 */       destination[destOffset + 1] = (byte)(outBuff >>> 8);
/* 207 */       return 2;
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 212 */       int outBuff = (DECODABET[source[srcOffset]] & 0xFF) << 18 | (DECODABET[source[srcOffset + 1]] & 0xFF) << 12 | (DECODABET[source[srcOffset + 2]] & 0xFF) << 6 | DECODABET[source[srcOffset + 3]] & 0xFF;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 218 */       destination[destOffset] = (byte)(outBuff >> 16);
/* 219 */       destination[destOffset + 1] = (byte)(outBuff >> 8);
/* 220 */       destination[destOffset + 2] = (byte)outBuff;
/*     */       
/* 222 */       return 3;
/* 223 */     } catch (Exception e) {
/* 224 */       assert DECODABET != null;
/* 225 */       System.err.println("" + source[srcOffset] + ": " + DECODABET[source[srcOffset]]);
/* 226 */       System.err.println("" + source[srcOffset + 1] + ": " + DECODABET[source[srcOffset + 1]]);
/* 227 */       System.err.println("" + source[srcOffset + 2] + ": " + DECODABET[source[srcOffset + 2]]);
/* 228 */       System.err.println("" + source[srcOffset + 3] + ": " + DECODABET[source[srcOffset + 3]]);
/* 229 */       return -1;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\Base64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */