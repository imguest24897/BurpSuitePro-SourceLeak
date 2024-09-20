package org.yaml;

import burp.Zbqc;

public class Z_9 {
  private static final String Zc;
  
  private static final char[] Zw;
  
  private static final byte[] ZN;
  
  private static int[] ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static byte[] Zv(char[] paramArrayOfchar) {
    return ZM(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public static byte[] ZM(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    int[] arrayOfInt = ZP();
    try {
      if (paramInt2 % 4 != 0)
        throw new IllegalArgumentException(a(-4348, -22692)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    while (paramInt2 > 0) {
      try {
        if (paramArrayOfchar[paramInt1 + paramInt2 - 1] == '=') {
          paramInt2--;
          if (arrayOfInt != null) {
            Zbqc.Zr(new Zbqc[5]);
            break;
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    int i = paramInt2 * 3 / 4;
    byte[] arrayOfByte = new byte[i];
    int j = paramInt1;
    int k = paramInt1 + paramInt2;
    byte b = 0;
    while (j < k) {
      char c1 = paramArrayOfchar[j++];
      char c2 = paramArrayOfchar[j++];
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b1 = (j < k) ? paramArrayOfchar[j++] : 65;
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b2 = (j < k) ? paramArrayOfchar[j++] : 65;
      try {
        if (c1 <= '') {
          try {
            if (c2 <= '') {
              try {
                if (b1 <= 127) {
                  try {
                    if (b2 > 127)
                      throw new IllegalArgumentException(a(-4345, -26008)); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } else {
                  throw new IllegalArgumentException(a(-4345, -26008));
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
              throw new IllegalArgumentException(a(-4345, -26008));
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          throw new IllegalArgumentException(a(-4345, -26008));
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte b3 = ZN[c1];
      byte b4 = ZN[c2];
      byte b5 = ZN[b1];
      byte b6 = ZN[b2];
      try {
        if (b3 >= 0)
          try {
            if (b4 >= 0)
              try {
                if (b5 >= 0)
                  try {
                    if (b6 >= 0) {
                      int m = b3 << 2 | b4 >>> 4;
                      int n = (b4 & 0xF) << 4 | b5 >>> 2;
                      int i1 = (b5 & 0x3) << 6 | b6;
                      try {
                        arrayOfByte[b++] = (byte)m;
                        if (b < i)
                          arrayOfByte[b++] = (byte)n; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      } 
                      try {
                        if (b < i)
                          arrayOfByte[b++] = (byte)i1; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      } 
                      if (arrayOfInt != null)
                        break; 
                      continue;
                    } 
                    throw new IllegalArgumentException(a(-4346, -21513));
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      throw new IllegalArgumentException(a(-4346, -21513));
    } 
    return arrayOfByte;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic Zn : ([I)V
    //   12: ldc '}Ë¾ø/5ßGëÇÔ=¬NÕHa¨RHA@ïAÆ¤¤ ¯ü³wÒm=k*eÕ-ùµêjÆ'°)M~|QÆÐ±ïÍÚÆÁZqú('
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #14
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #44
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'ofæz·Mû¿kì@O7`§;yt©(ð`ÌñF| £µc)³\¡\\t_ãP6,/\\n£u¬'ÔÓid²W* £ Ý;ÿHÍ¨®'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #41
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #9
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic org/yaml/Z_9.a : [Ljava/lang/String;
    //   135: iconst_4
    //   136: anewarray java/lang/String
    //   139: putstatic org/yaml/Z_9.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 263
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #59
    //   218: goto -> 247
    //   221: bipush #69
    //   223: goto -> 247
    //   226: bipush #37
    //   228: goto -> 247
    //   231: bipush #46
    //   233: goto -> 247
    //   236: iconst_1
    //   237: goto -> 247
    //   240: bipush #46
    //   242: goto -> 247
    //   245: bipush #45
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 168
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 164
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 43, 0 -> 102
    //   304: sipush #-4347
    //   307: sipush #9895
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   316: putstatic org/yaml/Z_9.Zc : Ljava/lang/String;
    //   319: bipush #64
    //   321: newarray char
    //   323: putstatic org/yaml/Z_9.Zw : [C
    //   326: iconst_0
    //   327: istore #7
    //   329: bipush #65
    //   331: istore #8
    //   333: iload #8
    //   335: bipush #90
    //   337: if_icmpgt -> 361
    //   340: getstatic org/yaml/Z_9.Zw : [C
    //   343: iload #7
    //   345: iinc #7, 1
    //   348: iload #8
    //   350: castore
    //   351: iload #8
    //   353: iconst_1
    //   354: iadd
    //   355: i2c
    //   356: istore #8
    //   358: goto -> 333
    //   361: bipush #97
    //   363: istore #8
    //   365: iload #8
    //   367: bipush #122
    //   369: if_icmpgt -> 393
    //   372: getstatic org/yaml/Z_9.Zw : [C
    //   375: iload #7
    //   377: iinc #7, 1
    //   380: iload #8
    //   382: castore
    //   383: iload #8
    //   385: iconst_1
    //   386: iadd
    //   387: i2c
    //   388: istore #8
    //   390: goto -> 365
    //   393: bipush #48
    //   395: istore #8
    //   397: iload #8
    //   399: bipush #57
    //   401: if_icmpgt -> 425
    //   404: getstatic org/yaml/Z_9.Zw : [C
    //   407: iload #7
    //   409: iinc #7, 1
    //   412: iload #8
    //   414: castore
    //   415: iload #8
    //   417: iconst_1
    //   418: iadd
    //   419: i2c
    //   420: istore #8
    //   422: goto -> 397
    //   425: getstatic org/yaml/Z_9.Zw : [C
    //   428: iload #7
    //   430: iinc #7, 1
    //   433: bipush #43
    //   435: castore
    //   436: getstatic org/yaml/Z_9.Zw : [C
    //   439: iload #7
    //   441: iinc #7, 1
    //   444: bipush #47
    //   446: castore
    //   447: sipush #128
    //   450: newarray byte
    //   452: putstatic org/yaml/Z_9.ZN : [B
    //   455: iconst_0
    //   456: istore #7
    //   458: iload #7
    //   460: getstatic org/yaml/Z_9.ZN : [B
    //   463: arraylength
    //   464: if_icmpge -> 484
    //   467: getstatic org/yaml/Z_9.ZN : [B
    //   470: iload #7
    //   472: iconst_m1
    //   473: bastore
    //   474: iinc #7, 1
    //   477: goto -> 458
    //   480: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   483: athrow
    //   484: iconst_0
    //   485: istore #7
    //   487: iload #7
    //   489: bipush #64
    //   491: if_icmpge -> 517
    //   494: getstatic org/yaml/Z_9.ZN : [B
    //   497: getstatic org/yaml/Z_9.Zw : [C
    //   500: iload #7
    //   502: caload
    //   503: iload #7
    //   505: i2b
    //   506: bastore
    //   507: iinc #7, 1
    //   510: goto -> 487
    //   513: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   516: athrow
    //   517: return
    // Exception table:
    //   from	to	target	type
    //   458	480	480	java/lang/IllegalArgumentException
    //   487	513	513	java/lang/IllegalArgumentException
  }
  
  public static void Zn(int[] paramArrayOfint) {
    ZK = paramArrayOfint;
  }
  
  public static int[] ZP() {
    return ZK;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEF05) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 45;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_9.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */