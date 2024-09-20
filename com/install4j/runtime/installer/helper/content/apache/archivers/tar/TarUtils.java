/*     */ package com.install4j.runtime.installer.helper.content.apache.archivers.tar;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.zip.ZipEncoding;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.zip.ZipEncodingHelper;
/*     */ import java.io.IOException;
/*     */ import java.math.BigInteger;
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TarUtils
/*     */ {
/*     */   private static final int BYTE_MASK = 255;
/*  42 */   static final ZipEncoding DEFAULT_ENCODING = ZipEncodingHelper.getZipEncoding(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   static final ZipEncoding FALLBACK_ENCODING = new ZipEncoding() {
/*     */       public boolean canEncode(String name) {
/*  50 */         return true;
/*     */       }
/*     */       
/*     */       public ByteBuffer encode(String name) {
/*  54 */         int length = name.length();
/*  55 */         byte[] buf = new byte[length];
/*     */ 
/*     */         
/*  58 */         for (int i = 0; i < length; i++) {
/*  59 */           buf[i] = (byte)name.charAt(i);
/*     */         }
/*  61 */         return ByteBuffer.wrap(buf);
/*     */       }
/*     */ 
/*     */       
/*     */       public String decode(byte[] buffer) {
/*  66 */         int length = buffer.length;
/*  67 */         StringBuilder result = new StringBuilder(length);
/*     */         
/*  69 */         for (byte b : buffer) {
/*  70 */           if (b == 0) {
/*     */             break;
/*     */           }
/*  73 */           result.append((char)(b & 0xFF));
/*     */         } 
/*     */         
/*  76 */         return result.toString();
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long parseOctal(byte[] buffer, int offset, int length) {
/* 106 */     long result = 0L;
/* 107 */     int end = offset + length;
/* 108 */     int start = offset;
/*     */     
/* 110 */     if (length < 2) {
/* 111 */       throw new IllegalArgumentException("Length " + length + " must be at least 2");
/*     */     }
/*     */     
/* 114 */     if (buffer[start] == 0) {
/* 115 */       return 0L;
/*     */     }
/*     */ 
/*     */     
/* 119 */     while (start < end && 
/* 120 */       buffer[start] == 32) {
/* 121 */       start++;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     byte trailer = buffer[end - 1];
/* 132 */     while (start < end && (trailer == 0 || trailer == 32)) {
/* 133 */       end--;
/* 134 */       trailer = buffer[end - 1];
/*     */     } 
/*     */     
/* 137 */     for (; start < end; start++) {
/* 138 */       byte currentByte = buffer[start];
/*     */       
/* 140 */       if (currentByte < 48 || currentByte > 55) {
/* 141 */         throw new IllegalArgumentException(
/* 142 */             exceptionMessage(buffer, offset, length, start, currentByte));
/*     */       }
/* 144 */       result = (result << 3L) + (currentByte - 48);
/*     */     } 
/*     */ 
/*     */     
/* 148 */     return result;
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
/*     */   public static long parseOctalOrBinary(byte[] buffer, int offset, int length) {
/* 171 */     if ((buffer[offset] & 0x80) == 0) {
/* 172 */       return parseOctal(buffer, offset, length);
/*     */     }
/* 174 */     boolean negative = (buffer[offset] == -1);
/* 175 */     if (length < 9) {
/* 176 */       return parseBinaryLong(buffer, offset, length, negative);
/*     */     }
/* 178 */     return parseBinaryBigInteger(buffer, offset, length, negative);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static long parseBinaryLong(byte[] buffer, int offset, int length, boolean negative) {
/* 184 */     if (length >= 9) {
/* 185 */       throw new IllegalArgumentException("At offset " + offset + ", " + length + " byte binary number exceeds maximum signed long value");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 190 */     long val = 0L;
/* 191 */     for (int i = 1; i < length; i++) {
/* 192 */       val = (val << 8L) + (buffer[offset + i] & 0xFF);
/*     */     }
/* 194 */     if (negative) {
/*     */       
/* 196 */       val--;
/* 197 */       val ^= (long)Math.pow(2.0D, (length - 1) * 8.0D) - 1L;
/*     */     } 
/* 199 */     return negative ? -val : val;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static long parseBinaryBigInteger(byte[] buffer, int offset, int length, boolean negative) {
/* 206 */     byte[] remainder = new byte[length - 1];
/* 207 */     System.arraycopy(buffer, offset + 1, remainder, 0, length - 1);
/* 208 */     BigInteger val = new BigInteger(remainder);
/* 209 */     if (negative)
/*     */     {
/* 211 */       val = val.add(BigInteger.valueOf(-1L)).not();
/*     */     }
/* 213 */     if (val.bitLength() > 63) {
/* 214 */       throw new IllegalArgumentException("At offset " + offset + ", " + length + " byte binary number exceeds maximum signed long value");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 219 */     return negative ? -val.longValue() : val.longValue();
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
/*     */   public static boolean parseBoolean(byte[] buffer, int offset) {
/* 233 */     return (buffer[offset] == 1);
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
/*     */   private static String exceptionMessage(byte[] buffer, int offset, int length, int current, byte currentByte) {
/* 246 */     String string = new String(buffer, offset, length);
/*     */     
/* 248 */     string = string.replaceAll("\000", "{NUL}");
/* 249 */     return "Invalid byte " + currentByte + " at offset " + (current - offset) + " in '" + string + "' len=" + length;
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
/*     */   public static String parseName(byte[] buffer, int offset, int length) {
/*     */     try {
/* 264 */       return parseName(buffer, offset, length, DEFAULT_ENCODING);
/* 265 */     } catch (IOException ex) {
/*     */       try {
/* 267 */         return parseName(buffer, offset, length, FALLBACK_ENCODING);
/* 268 */       } catch (IOException ex2) {
/*     */         
/* 270 */         throw new RuntimeException(ex2);
/*     */       } 
/*     */     } 
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
/*     */   public static String parseName(byte[] buffer, int offset, int length, ZipEncoding encoding) throws IOException {
/* 293 */     int len = 0;
/* 294 */     for (int i = offset; len < length && buffer[i] != 0; i++) {
/* 295 */       len++;
/*     */     }
/* 297 */     if (len > 0) {
/* 298 */       byte[] b = new byte[len];
/* 299 */       System.arraycopy(buffer, offset, b, 0, len);
/* 300 */       return encoding.decode(b);
/*     */     } 
/* 302 */     return "";
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
/*     */   public static int formatNameBytes(String name, byte[] buf, int offset, int length) {
/*     */     try {
/* 322 */       return formatNameBytes(name, buf, offset, length, DEFAULT_ENCODING);
/* 323 */     } catch (IOException ex) {
/*     */       try {
/* 325 */         return formatNameBytes(name, buf, offset, length, FALLBACK_ENCODING);
/*     */       }
/* 327 */       catch (IOException ex2) {
/*     */         
/* 329 */         throw new RuntimeException(ex2);
/*     */       } 
/*     */     } 
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
/*     */   public static int formatNameBytes(String name, byte[] buf, int offset, int length, ZipEncoding encoding) throws IOException {
/* 356 */     int len = name.length();
/* 357 */     ByteBuffer b = encoding.encode(name);
/* 358 */     while (b.limit() > length && len > 0) {
/* 359 */       b = encoding.encode(name.substring(0, --len));
/*     */     }
/* 361 */     int limit = b.limit() - b.position();
/* 362 */     System.arraycopy(b.array(), b.arrayOffset(), buf, offset, limit);
/*     */ 
/*     */     
/* 365 */     for (int i = limit; i < length; i++) {
/* 366 */       buf[offset + i] = 0;
/*     */     }
/*     */     
/* 369 */     return offset + length;
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
/*     */   public static void formatUnsignedOctalString(long value, byte[] buffer, int offset, int length) {
/* 383 */     int remaining = length;
/* 384 */     remaining--;
/* 385 */     if (value == 0L) {
/* 386 */       buffer[offset + remaining--] = 48;
/*     */     } else {
/* 388 */       long val = value;
/* 389 */       for (; remaining >= 0 && val != 0L; remaining--) {
/*     */         
/* 391 */         buffer[offset + remaining] = (byte)(48 + (byte)(int)(val & 0x7L));
/* 392 */         val >>>= 3L;
/*     */       } 
/*     */       
/* 395 */       if (val != 0L) {
/* 396 */         throw new IllegalArgumentException(value + "=" + 
/* 397 */             Long.toOctalString(value) + " will not fit in octal number buffer of length " + length);
/*     */       }
/*     */     } 
/*     */     
/* 401 */     for (; remaining >= 0; remaining--) {
/* 402 */       buffer[offset + remaining] = 48;
/*     */     }
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
/*     */   public static int formatOctalBytes(long value, byte[] buf, int offset, int length) {
/* 422 */     int idx = length - 2;
/* 423 */     formatUnsignedOctalString(value, buf, offset, idx);
/*     */     
/* 425 */     buf[offset + idx++] = 32;
/* 426 */     buf[offset + idx] = 0;
/*     */     
/* 428 */     return offset + length;
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
/*     */   public static int formatLongOctalBytes(long value, byte[] buf, int offset, int length) {
/* 447 */     int idx = length - 1;
/*     */     
/* 449 */     formatUnsignedOctalString(value, buf, offset, idx);
/* 450 */     buf[offset + idx] = 32;
/*     */     
/* 452 */     return offset + length;
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
/*     */   public static int formatLongOctalOrBinaryBytes(long value, byte[] buf, int offset, int length) {
/* 476 */     long maxAsOctalChar = (length == 8) ? 2097151L : 8589934591L;
/*     */     
/* 478 */     boolean negative = (value < 0L);
/* 479 */     if (!negative && value <= maxAsOctalChar) {
/* 480 */       return formatLongOctalBytes(value, buf, offset, length);
/*     */     }
/*     */     
/* 483 */     if (length < 9) {
/* 484 */       formatLongBinary(value, buf, offset, length, negative);
/*     */     } else {
/* 486 */       formatBigIntegerBinary(value, buf, offset, length, negative);
/*     */     } 
/*     */     
/* 489 */     buf[offset] = (byte)(negative ? 255 : 128);
/* 490 */     return offset + length;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void formatLongBinary(long value, byte[] buf, int offset, int length, boolean negative) {
/* 496 */     int bits = (length - 1) * 8;
/* 497 */     long max = 1L << bits;
/* 498 */     long val = Math.abs(value);
/* 499 */     if (val < 0L || val >= max) {
/* 500 */       throw new IllegalArgumentException("Value " + value + " is too large for " + length + " byte field.");
/*     */     }
/*     */     
/* 503 */     if (negative) {
/* 504 */       val ^= max - 1L;
/* 505 */       val++;
/* 506 */       val |= 255L << bits;
/*     */     } 
/* 508 */     for (int i = offset + length - 1; i >= offset; i--) {
/* 509 */       buf[i] = (byte)(int)val;
/* 510 */       val >>= 8L;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void formatBigIntegerBinary(long value, byte[] buf, int offset, int length, boolean negative) {
/* 518 */     BigInteger val = BigInteger.valueOf(value);
/* 519 */     byte[] b = val.toByteArray();
/* 520 */     int len = b.length;
/* 521 */     if (len > length - 1) {
/* 522 */       throw new IllegalArgumentException("Value " + value + " is too large for " + length + " byte field.");
/*     */     }
/*     */     
/* 525 */     int off = offset + length - len;
/* 526 */     System.arraycopy(b, 0, buf, off, len);
/* 527 */     byte fill = (byte)(negative ? 255 : 0);
/* 528 */     for (int i = offset + 1; i < off; i++) {
/* 529 */       buf[i] = fill;
/*     */     }
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
/*     */   public static int formatCheckSumOctalBytes(long value, byte[] buf, int offset, int length) {
/* 549 */     int idx = length - 2;
/* 550 */     formatUnsignedOctalString(value, buf, offset, idx);
/*     */     
/* 552 */     buf[offset + idx++] = 0;
/* 553 */     buf[offset + idx] = 32;
/*     */     
/* 555 */     return offset + length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long computeCheckSum(byte[] buf) {
/* 565 */     long sum = 0L;
/*     */     
/* 567 */     for (byte element : buf) {
/* 568 */       sum += (0xFF & element);
/*     */     }
/*     */     
/* 571 */     return sum;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean verifyCheckSum(byte[] header) {
/* 600 */     long storedSum = parseOctal(header, 148, 8);
/* 601 */     long unsignedSum = 0L;
/* 602 */     long signedSum = 0L;
/*     */     
/* 604 */     for (int i = 0; i < header.length; i++) {
/* 605 */       byte b = header[i];
/* 606 */       if (148 <= i && i < 156) {
/* 607 */         b = 32;
/*     */       }
/* 609 */       unsignedSum += (0xFF & b);
/* 610 */       signedSum += b;
/*     */     } 
/* 612 */     return (storedSum == unsignedSum || storedSum == signedSum);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apache\archivers\tar\TarUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */