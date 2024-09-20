package com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import java.math.BigInteger;
import java.util.NavigableMap;

class Zy extends Zl {
  private static final String[] d;
  
  private static final String[] e;
  
  public BigInteger ZH(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) throws NumberFormatException {
    try {
      int i = paramCharSequence.length();
      int j = Ze.ZP(i, paramInt1, paramInt2);
      int k = paramInt1;
      char c = paramCharSequence.charAt(k);
      try {
      
      } catch (ArithmeticException arithmeticException) {
        throw a(null);
      } 
      boolean bool = (c == '-') ? true : false;
      try {
        if (bool || c == '+') {
          c = Ze(paramCharSequence, ++k, j);
          try {
            if (c == '\000')
              throw new NumberFormatException(b(13865, 22836)); 
          } catch (ArithmeticException arithmeticException) {
            throw a(null);
          } 
        } 
      } catch (ArithmeticException arithmeticException) {
        throw a(null);
      } 
      switch (paramInt3) {
        case 10:
          return ZN(paramCharSequence, k, j, bool);
        case 16:
          return ZY(paramCharSequence, k, j, bool);
      } 
      return new BigInteger(paramCharSequence.subSequence(paramInt1, paramInt2).toString(), paramInt3);
    } catch (ArithmeticException arithmeticException) {
      NumberFormatException numberFormatException = new NumberFormatException(b(13866, 19860));
      numberFormatException.initCause(arithmeticException);
      throw numberFormatException;
    } 
  }
  
  private BigInteger ZN(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i = paramInt2 - paramInt1;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    try {
      if (ZG(i))
        return ZF(paramCharSequence, paramInt1, paramInt2, paramBoolean); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int j = paramInt1 + (i & 0x7);
    long l = Zb.Zb(paramCharSequence, paramInt1, j);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int k = (l >= 0L) ? 1 : 0;
    paramInt1 = j;
    while (paramInt1 < paramInt2) {
      int m = Zb.Zw(paramCharSequence, paramInt1);
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      k &= (m >= 0) ? 1 : 0;
      l = l * 100000000L + m;
      paramInt1 += 8;
      if (arrayOfZbqc != null)
        break; 
    } 
    try {
      if (k == 0)
        throw new NumberFormatException(b(13864, -16047)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return BigInteger.valueOf(paramBoolean ? -l : l);
  }
  
  private BigInteger ZY(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: aload_1
    //   5: iload_2
    //   6: iload_3
    //   7: invokespecial ZY : (Ljava/lang/CharSequence;II)I
    //   10: istore_2
    //   11: astore #5
    //   13: iload_3
    //   14: iload_2
    //   15: isub
    //   16: istore #6
    //   18: iload #6
    //   20: ifgt -> 31
    //   23: getstatic java/math/BigInteger.ZERO : Ljava/math/BigInteger;
    //   26: areturn
    //   27: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   30: athrow
    //   31: iload #6
    //   33: invokestatic Zq : (I)V
    //   36: iload #6
    //   38: iconst_1
    //   39: iadd
    //   40: iconst_1
    //   41: ishr
    //   42: iconst_1
    //   43: iadd
    //   44: newarray byte
    //   46: astore #7
    //   48: iconst_1
    //   49: istore #8
    //   51: iconst_0
    //   52: istore #9
    //   54: iload #6
    //   56: iconst_1
    //   57: iand
    //   58: ifeq -> 107
    //   61: aload_1
    //   62: iload_2
    //   63: iinc #2, 1
    //   66: invokeinterface charAt : (I)C
    //   71: istore #10
    //   73: iload #10
    //   75: invokestatic Ze : (C)I
    //   78: istore #11
    //   80: aload #7
    //   82: iload #8
    //   84: iinc #8, 1
    //   87: iload #11
    //   89: i2b
    //   90: bastore
    //   91: iload #11
    //   93: ifge -> 104
    //   96: iconst_1
    //   97: goto -> 105
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: iconst_0
    //   105: istore #9
    //   107: iload_2
    //   108: iload_3
    //   109: iload_2
    //   110: isub
    //   111: bipush #7
    //   113: iand
    //   114: iadd
    //   115: istore #10
    //   117: iload_2
    //   118: iload #10
    //   120: if_icmpge -> 212
    //   123: aload_1
    //   124: iload_2
    //   125: invokeinterface charAt : (I)C
    //   130: istore #11
    //   132: aload_1
    //   133: iload_2
    //   134: iconst_1
    //   135: iadd
    //   136: invokeinterface charAt : (I)C
    //   141: istore #12
    //   143: iload #11
    //   145: invokestatic Ze : (C)I
    //   148: istore #13
    //   150: iload #12
    //   152: invokestatic Ze : (C)I
    //   155: istore #14
    //   157: aload #7
    //   159: iload #8
    //   161: iinc #8, 1
    //   164: iload #13
    //   166: iconst_4
    //   167: ishl
    //   168: iload #14
    //   170: ior
    //   171: i2b
    //   172: bastore
    //   173: iload #9
    //   175: iload #14
    //   177: iflt -> 192
    //   180: iload #13
    //   182: ifge -> 200
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   191: athrow
    //   192: iconst_1
    //   193: goto -> 201
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: iconst_0
    //   201: ior
    //   202: istore #9
    //   204: iinc #2, 2
    //   207: aload #5
    //   209: ifnull -> 117
    //   212: iload_2
    //   213: iload_3
    //   214: if_icmpge -> 266
    //   217: aload_1
    //   218: iload_2
    //   219: invokestatic ZU : (Ljava/lang/CharSequence;I)J
    //   222: lstore #11
    //   224: aload #7
    //   226: iload #8
    //   228: lload #11
    //   230: l2i
    //   231: invokestatic Zd : ([BII)V
    //   234: iload #9
    //   236: lload #11
    //   238: lconst_0
    //   239: lcmp
    //   240: ifge -> 251
    //   243: iconst_1
    //   244: goto -> 252
    //   247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   250: athrow
    //   251: iconst_0
    //   252: ior
    //   253: istore #9
    //   255: iinc #2, 8
    //   258: iinc #8, 4
    //   261: aload #5
    //   263: ifnull -> 212
    //   266: iload #9
    //   268: ifeq -> 292
    //   271: new java/lang/NumberFormatException
    //   274: dup
    //   275: sipush #13864
    //   278: sipush #-16047
    //   281: invokestatic b : (II)Ljava/lang/String;
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    //   288: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   291: athrow
    //   292: new java/math/BigInteger
    //   295: dup
    //   296: aload #7
    //   298: invokespecial <init> : ([B)V
    //   301: astore #11
    //   303: iload #4
    //   305: ifeq -> 320
    //   308: aload #11
    //   310: invokevirtual negate : ()Ljava/math/BigInteger;
    //   313: goto -> 322
    //   316: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   319: athrow
    //   320: aload #11
    //   322: areturn
    // Exception table:
    //   from	to	target	type
    //   18	27	27	java/lang/NumberFormatException
    //   80	100	100	java/lang/NumberFormatException
    //   157	185	188	java/lang/NumberFormatException
    //   180	196	196	java/lang/NumberFormatException
    //   224	247	247	java/lang/NumberFormatException
    //   266	288	288	java/lang/NumberFormatException
    //   303	316	316	java/lang/NumberFormatException
  }
  
  private BigInteger ZF(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    paramInt1 = ZY(paramCharSequence, paramInt1, paramInt2);
    int i = paramInt2 - paramInt1;
    Zn(i);
    NavigableMap<Integer, BigInteger> navigableMap = Zf.Zt(paramInt1, paramInt2);
    BigInteger bigInteger = Zm.Zc(paramCharSequence, paramInt1, paramInt2, navigableMap, 400);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramBoolean ? bigInteger.negate() : bigInteger;
  }
  
  private int ZY(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (paramInt1 < paramInt2) {
      try {
        if (paramCharSequence.charAt(paramInt1) == '0') {
          paramInt1++;
          if (arrayOfZbqc != null)
            break; 
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return paramInt1;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'L«ûÇöö²ÙZ|7Bî:&¤ÒñTRFö´ÞÅRýdØXÃÅ2ªõì¡'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #14
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #83
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zz/Zy.d : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zz/Zy.e : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #19
    //   154: goto -> 183
    //   157: bipush #65
    //   159: goto -> 183
    //   162: iconst_1
    //   163: goto -> 183
    //   166: bipush #110
    //   168: goto -> 183
    //   171: bipush #124
    //   173: goto -> 183
    //   176: bipush #74
    //   178: goto -> 183
    //   181: bipush #52
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3628) & 0xFFFF;
    if (e[i] == null) {
      char[] arrayOfChar = d[i].toCharArray();
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
      byte b1 = 55;
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
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */