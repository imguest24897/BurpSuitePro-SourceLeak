package com.fasterxml;

public final class Zyz {
  public final int Z_ = 15;
  
  private final byte[] Zo = new byte[15];
  
  private int ZF;
  
  private static int ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zn(float paramFloat) {
    return (new Zyz()).Zc(paramFloat);
  }
  
  private String Zc(float paramFloat) {
    switch (ZH(paramFloat)) {
      case 0:
        return Zt();
      case 1:
        return a(-13573, 31470);
      case 2:
        return a(-13574, -16603);
      case 3:
        return a(-13575, 11923);
      case 4:
        return a(-13570, 30907);
    } 
    return a(-13576, 32650);
  }
  
  private int ZH(float paramFloat) {
    int i = Float.floatToRawIntBits(paramFloat);
    int j = i & 0x7FFFFF;
    int k = i >>> 23 & 0xFF;
    if (k < 255) {
      this.ZF = -1;
      if (i < 0)
        Zb(45); 
      if (k != 0) {
        int m = 150 - k;
        int n = 0x800000 | j;
        if ((((0 < m) ? 1 : 0) & ((m < 24) ? 1 : 0)) != 0) {
          int i1 = n >> m;
          if (i1 << m == n)
            return Zr(i1, 0); 
        } 
        return Zj(-m, n, 0);
      } 
      return (j != 0) ? ((j < 8) ? Zj(-149, 10 * j, -1) : Zj(-149, j, 0)) : ((i == 0) ? 1 : 2);
    } 
    return (j != 0) ? 5 : ((i > 0) ? 3 : 4);
  }
  
  private int Zj(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic ZN : ()I
    //   3: iload_2
    //   4: iconst_1
    //   5: iand
    //   6: istore #5
    //   8: iload_2
    //   9: iconst_2
    //   10: ishl
    //   11: i2l
    //   12: lstore #6
    //   14: istore #4
    //   16: lload #6
    //   18: ldc2_w 2
    //   21: ladd
    //   22: lstore #8
    //   24: iload_2
    //   25: ldc 8388608
    //   27: if_icmpeq -> 34
    //   30: iconst_1
    //   31: goto -> 35
    //   34: iconst_0
    //   35: iload_1
    //   36: sipush #-149
    //   39: if_icmpne -> 46
    //   42: iconst_1
    //   43: goto -> 47
    //   46: iconst_0
    //   47: ior
    //   48: ifeq -> 70
    //   51: lload #6
    //   53: ldc2_w 2
    //   56: lsub
    //   57: lstore #10
    //   59: iload_1
    //   60: invokestatic Zc : (I)I
    //   63: istore #12
    //   65: iload #4
    //   67: ifeq -> 82
    //   70: lload #6
    //   72: lconst_1
    //   73: lsub
    //   74: lstore #10
    //   76: iload_1
    //   77: invokestatic Zj : (I)I
    //   80: istore #12
    //   82: iload_1
    //   83: iload #12
    //   85: ineg
    //   86: invokestatic ZG : (I)I
    //   89: iadd
    //   90: bipush #33
    //   92: iadd
    //   93: istore #13
    //   95: iload #12
    //   97: invokestatic ZJ : (I)J
    //   100: lconst_1
    //   101: ladd
    //   102: lstore #14
    //   104: lload #14
    //   106: lload #6
    //   108: iload #13
    //   110: lshl
    //   111: invokestatic Zo : (JJ)I
    //   114: istore #16
    //   116: lload #14
    //   118: lload #10
    //   120: iload #13
    //   122: lshl
    //   123: invokestatic Zo : (JJ)I
    //   126: istore #17
    //   128: lload #14
    //   130: lload #8
    //   132: iload #13
    //   134: lshl
    //   135: invokestatic Zo : (JJ)I
    //   138: istore #18
    //   140: iload #16
    //   142: iconst_2
    //   143: ishr
    //   144: istore #19
    //   146: iload #19
    //   148: bipush #100
    //   150: if_icmplt -> 240
    //   153: bipush #10
    //   155: iload #19
    //   157: i2l
    //   158: ldc2_w 1717986919
    //   161: lmul
    //   162: bipush #34
    //   164: lushr
    //   165: l2i
    //   166: imul
    //   167: istore #20
    //   169: iload #20
    //   171: bipush #10
    //   173: iadd
    //   174: istore #21
    //   176: iload #17
    //   178: iload #5
    //   180: iadd
    //   181: iload #20
    //   183: iconst_2
    //   184: ishl
    //   185: if_icmpgt -> 192
    //   188: iconst_1
    //   189: goto -> 193
    //   192: iconst_0
    //   193: istore #22
    //   195: iload #21
    //   197: iconst_2
    //   198: ishl
    //   199: iload #5
    //   201: iadd
    //   202: iload #18
    //   204: if_icmpgt -> 211
    //   207: iconst_1
    //   208: goto -> 212
    //   211: iconst_0
    //   212: istore #23
    //   214: iload #22
    //   216: iload #23
    //   218: if_icmpeq -> 240
    //   221: aload_0
    //   222: iload #22
    //   224: ifeq -> 232
    //   227: iload #20
    //   229: goto -> 234
    //   232: iload #21
    //   234: iload #12
    //   236: invokespecial Zr : (II)I
    //   239: ireturn
    //   240: iload #19
    //   242: iconst_1
    //   243: iadd
    //   244: istore #20
    //   246: iload #17
    //   248: iload #5
    //   250: iadd
    //   251: iload #19
    //   253: iconst_2
    //   254: ishl
    //   255: if_icmpgt -> 262
    //   258: iconst_1
    //   259: goto -> 263
    //   262: iconst_0
    //   263: istore #21
    //   265: iload #20
    //   267: iconst_2
    //   268: ishl
    //   269: iload #5
    //   271: iadd
    //   272: iload #18
    //   274: if_icmpgt -> 281
    //   277: iconst_1
    //   278: goto -> 282
    //   281: iconst_0
    //   282: istore #22
    //   284: iload #21
    //   286: iload #22
    //   288: if_icmpeq -> 312
    //   291: aload_0
    //   292: iload #21
    //   294: ifeq -> 302
    //   297: iload #19
    //   299: goto -> 304
    //   302: iload #20
    //   304: iload #12
    //   306: iload_3
    //   307: iadd
    //   308: invokespecial Zr : (II)I
    //   311: ireturn
    //   312: iload #16
    //   314: iload #19
    //   316: iload #20
    //   318: iadd
    //   319: iconst_1
    //   320: ishl
    //   321: isub
    //   322: istore #23
    //   324: aload_0
    //   325: iload #23
    //   327: iflt -> 342
    //   330: iload #23
    //   332: ifne -> 347
    //   335: iload #19
    //   337: iconst_1
    //   338: iand
    //   339: ifne -> 347
    //   342: iload #19
    //   344: goto -> 349
    //   347: iload #20
    //   349: iload #12
    //   351: iload_3
    //   352: iadd
    //   353: invokespecial Zr : (II)I
    //   356: ireturn
  }
  
  private static int Zo(long paramLong1, long paramLong2) {
    long l1 = Zy9.Zo(paramLong1, paramLong2);
    long l2 = l1 >>> 31L;
    return (int)(l2 | (l1 & 0xFFFFFFFFL) + 4294967295L >>> 32L);
  }
  
  private int Zr(int paramInt1, int paramInt2) {
    int i = Zy9.Zc(32 - Integer.numberOfLeadingZeros(paramInt1));
    if (paramInt1 >= Zy9.ZO(i))
      i++; 
    paramInt1 = (int)(paramInt1 * Zy9.ZO(9 - i));
    paramInt2 += i;
    int j = (int)(paramInt1 * 1441151881L >>> 57L);
    int k = paramInt1 - 100000000 * j;
    return (0 < paramInt2 && paramInt2 <= 7) ? ZE(j, k, paramInt2) : ((-3 < paramInt2 && paramInt2 <= 0) ? Ze(j, k, paramInt2) : Zz(j, k, paramInt2));
  }
  
  private int ZE(int paramInt1, int paramInt2, int paramInt3) {
    ZR(paramInt1);
    int i = ZN();
    int j = ZI(paramInt2);
    byte b = 1;
    while (b < paramInt3) {
      int k = 10 * j;
      ZR(k >>> 28);
      j = k & 0xFFFFFFF;
      b++;
      if (i != 0)
        break; 
    } 
    Zb(46);
    while (b <= 8) {
      int k = 10 * j;
      ZR(k >>> 28);
      j = k & 0xFFFFFFF;
      b++;
      if (i != 0)
        break; 
    } 
    Zp();
    return 0;
  }
  
  private int Ze(int paramInt1, int paramInt2, int paramInt3) {
    ZR(0);
    int i = ZN();
    Zb(46);
    while (paramInt3 < 0) {
      ZR(0);
      paramInt3++;
      if (i != 0)
        break; 
    } 
    ZR(paramInt1);
    ZP(paramInt2);
    Zp();
    return 0;
  }
  
  private int Zz(int paramInt1, int paramInt2, int paramInt3) {
    ZR(paramInt1);
    Zb(46);
    ZP(paramInt2);
    Zp();
    ZX(paramInt3 - 1);
    return 0;
  }
  
  private void ZP(int paramInt) {
    int j = ZI(paramInt);
    byte b = 0;
    int i = Zv();
    while (b < 8) {
      int k = 10 * j;
      ZR(k >>> 28);
      j = k & 0xFFFFFFF;
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  private void Zp() {
    int i = Zv();
    while (this.Zo[this.ZF] == 48) {
      this.ZF--;
      if (i == 0)
        break; 
    } 
    if (this.Zo[this.ZF] == 46)
      this.ZF++; 
  }
  
  private int ZI(int paramInt) {
    return (int)(Zy9.Zo((paramInt + 1) << 28L, 193428131138340668L) >>> 20L) - 1;
  }
  
  private void ZX(int paramInt) {
    Zb(69);
    if (paramInt < 0) {
      Zb(45);
      paramInt = -paramInt;
    } 
    if (paramInt < 10) {
      ZR(paramInt);
      return;
    } 
    int i = paramInt * 103 >>> 10;
    ZR(i);
    ZR(paramInt - 10 * i);
  }
  
  private void Zb(int paramInt) {
    this.Zo[++this.ZF] = (byte)paramInt;
  }
  
  private void ZR(int paramInt) {
    this.Zo[++this.ZF] = (byte)(48 + paramInt);
  }
  
  private String Zt() {
    return new String(this.Zo, 0, 0, this.ZF + 1);
  }
  
  public static void Zx(int paramInt) {
    ZP = paramInt;
  }
  
  public static int Zv() {
    return ZP;
  }
  
  public static int ZN() {
    int i = Zv();
    return (i == 0) ? 120 : 0;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: bipush #80
    //   10: ldc 'Ðâ®¿gM'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: iconst_4
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic Zx : (I)V
    //   26: bipush #30
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
    //   71: ldc ' 5[\\tl©\\tzmmPêL ë'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #8
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #75
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
    //   132: putstatic com/fasterxml/Zyz.a : [Ljava/lang/String;
    //   135: iconst_5
    //   136: anewarray java/lang/String
    //   139: putstatic com/fasterxml/Zyz.b : [Ljava/lang/String;
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
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #87
    //   218: goto -> 248
    //   221: bipush #103
    //   223: goto -> 248
    //   226: bipush #12
    //   228: goto -> 248
    //   231: bipush #53
    //   233: goto -> 248
    //   236: bipush #46
    //   238: goto -> 248
    //   241: bipush #6
    //   243: goto -> 248
    //   246: bipush #55
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCAFA) & 0xFFFF;
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
      char c = 'Á';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */