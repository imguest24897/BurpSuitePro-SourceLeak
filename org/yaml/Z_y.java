package org.yaml;

import burp.Zbqc;

public abstract class Z_y implements Zjt {
  private static final ThreadLocal<char[]> ZL;
  
  static final boolean Zv;
  
  private static int[] ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected abstract char[] ZT(int paramInt);
  
  protected int Z_(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zh : ()[I
    //   3: iload_2
    //   4: istore #5
    //   6: astore #4
    //   8: iload #5
    //   10: iload_3
    //   11: if_icmpge -> 90
    //   14: aload_1
    //   15: iload #5
    //   17: iload_3
    //   18: invokestatic Zt : (Ljava/lang/CharSequence;II)I
    //   21: istore #6
    //   23: iload #6
    //   25: iflt -> 90
    //   28: aload_0
    //   29: iload #6
    //   31: invokevirtual ZT : (I)[C
    //   34: ifnull -> 56
    //   37: goto -> 44
    //   40: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload #4
    //   46: ifnonnull -> 90
    //   49: goto -> 56
    //   52: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   55: athrow
    //   56: iload #5
    //   58: iload #6
    //   60: invokestatic isSupplementaryCodePoint : (I)Z
    //   63: ifeq -> 81
    //   66: goto -> 73
    //   69: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   72: athrow
    //   73: iconst_2
    //   74: goto -> 82
    //   77: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   80: athrow
    //   81: iconst_1
    //   82: iadd
    //   83: istore #5
    //   85: aload #4
    //   87: ifnonnull -> 8
    //   90: iload #5
    //   92: ireturn
    // Exception table:
    //   from	to	target	type
    //   23	37	40	java/lang/IllegalArgumentException
    //   28	49	52	java/lang/IllegalArgumentException
    //   44	66	69	java/lang/IllegalArgumentException
    //   56	77	77	java/lang/IllegalArgumentException
  }
  
  public String ZI(String paramString) {
    int i = paramString.length();
    int j = Z_(paramString, 0, i);
    int[] arrayOfInt = Zh();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        ZS(new int[2]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (j == i) ? paramString : ZT(paramString, j);
  }
  
  protected final String ZT(String paramString, int paramInt) {
    int i = paramString.length();
    int[] arrayOfInt = Zh();
    char[] arrayOfChar = ZL.get();
    int j = 0;
    int k = 0;
    while (paramInt < i) {
      int n = Zt(paramString, paramInt, i);
      try {
        if (n < 0)
          throw new IllegalArgumentException(a(24084, 26973)); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      char[] arrayOfChar1 = ZT(n);
      if (arrayOfChar1 != null) {
        int i1 = paramInt - k;
        int i2 = j + i1 + arrayOfChar1.length;
        if (arrayOfChar.length < i2) {
          int i3 = i2 + i - paramInt + 32;
          arrayOfChar = ZB(arrayOfChar, j, i3);
        } 
        if (i1 > 0) {
          paramString.getChars(k, paramInt, arrayOfChar, j);
          j += i1;
        } 
        if (arrayOfChar1.length > 0) {
          System.arraycopy(arrayOfChar1, 0, arrayOfChar, j, arrayOfChar1.length);
          j += arrayOfChar1.length;
        } 
      } 
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      k = paramInt + (Character.isSupplementaryCodePoint(n) ? 2 : 1);
      paramInt = Z_(paramString, k, i);
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    int m = i - k;
    if (m > 0) {
      int n = j + m;
      if (arrayOfChar.length < n)
        arrayOfChar = ZB(arrayOfChar, j, n); 
      paramString.getChars(k, i, arrayOfChar, j);
      j = n;
    } 
    return new String(arrayOfChar, 0, j);
  }
  
  protected static final int Zt(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    if (paramInt1 < paramInt2) {
      char c = paramCharSequence.charAt(paramInt1++);
      try {
        if (c >= '?')
          try {
            if (c <= '?') {
              try {
                if (c <= '?') {
                  try {
                    if (paramInt1 == paramInt2)
                      return -c; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw b(null);
                  } 
                  char c1 = paramCharSequence.charAt(paramInt1);
                  try {
                    if (Character.isLowSurrogate(c1))
                      return Character.toCodePoint(c, c1); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw b(null);
                  } 
                  throw new IllegalArgumentException(a(24087, 7389) + c1 + a(24081, -22102) + c1 + a(24082, 19078) + paramInt1);
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw b(null);
              } 
              throw new IllegalArgumentException(a(24083, 5722) + c + a(24085, 100) + c + a(24080, 9536) + (paramInt1 - 1));
            } 
            return c;
          } catch (IllegalArgumentException illegalArgumentException) {
            throw b(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      return c;
    } 
    throw new IndexOutOfBoundsException(a(24086, 13058));
  }
  
  private static final char[] ZB(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    char[] arrayOfChar = new char[paramInt2];
    try {
      if (paramInt1 > 0)
        System.arraycopy(paramArrayOfchar, 0, arrayOfChar, 0, paramInt1); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return arrayOfChar;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñ"Ã¾7´î?\\rÝ´¢Le¬<üþ0ô\\n\\ra\ÖÄÊOð­$¶ áHYDEÛ+âDãtûÊV \\fÌÆÜÄ640bí'Á*¸6ê_ç¥&jáúÐa~#u&HVä:\\bi³ÇÁõC#\\r>ôÞDê­õÂú÷\\f'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_5
    //   22: newarray int
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic ZS : ([I)V
    //   29: bipush #23
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'lõâ#mÕø=3Í´â;íéõ¶bÆZu%ðcÿ8ïb4¹ÏýbÅ'ñæã"«S"Iz\\tXÿÔ¾,c'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #29
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #32
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic org/yaml/Z_y.a : [Ljava/lang/String;
    //   138: bipush #8
    //   140: anewarray java/lang/String
    //   143: putstatic org/yaml/Z_y.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #73
    //   222: goto -> 252
    //   225: bipush #32
    //   227: goto -> 252
    //   230: bipush #113
    //   232: goto -> 252
    //   235: bipush #102
    //   237: goto -> 252
    //   240: bipush #7
    //   242: goto -> 252
    //   245: bipush #48
    //   247: goto -> 252
    //   250: bipush #103
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: ldc org/yaml/Z_y
    //   310: invokevirtual desiredAssertionStatus : ()Z
    //   313: ifne -> 324
    //   316: iconst_1
    //   317: goto -> 325
    //   320: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   323: athrow
    //   324: iconst_0
    //   325: putstatic org/yaml/Z_y.Zv : Z
    //   328: new org/yaml/Zgi
    //   331: dup
    //   332: invokespecial <init> : ()V
    //   335: putstatic org/yaml/Z_y.ZL : Ljava/lang/ThreadLocal;
    //   338: return
    // Exception table:
    //   from	to	target	type
    //   308	320	320	java/lang/IllegalArgumentException
  }
  
  public static void ZS(int[] paramArrayOfint) {
    ZA = paramArrayOfint;
  }
  
  public static int[] Zh() {
    return ZA;
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5E10) & 0xFFFF;
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
      byte b1 = 27;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_y.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */