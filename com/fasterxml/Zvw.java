package com.fasterxml;

public final class Zvw {
  public final int ZI = 24;
  
  private final byte[] Zj = new byte[24];
  
  private int Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static String Zy(double paramDouble) {
    return (new Zvw()).ZD(paramDouble);
  }
  
  private String ZD(double paramDouble) {
    switch (ZV(paramDouble)) {
      case 0:
        return Zt();
      case 1:
        return a(27778, 30288);
      case 2:
        return a(27780, 24712);
      case 3:
        return a(27781, 1897);
      case 4:
        return a(27783, -12042);
    } 
    return a(27782, 10446);
  }
  
  private int ZV(double paramDouble) {
    long l1 = Double.doubleToRawLongBits(paramDouble);
    long l2 = l1 & 0xFFFFFFFFFFFFFL;
    int i = (int)(l1 >>> 52L) & 0x7FF;
    if (i < 2047) {
      this.Zg = -1;
      if (l1 < 0L)
        Zu(45); 
      if (i != 0) {
        int j = 1075 - i;
        long l = 0x10000000000000L | l2;
        if ((((0 < j) ? 1 : 0) & ((j < 53) ? 1 : 0)) != 0) {
          long l3 = l >> j;
          if (l3 << j == l)
            return ZV(l3, 0); 
        } 
        return ZZ(-j, l, 0);
      } 
      return (l2 != 0L) ? ((l2 < 3L) ? ZZ(-1074, 10L * l2, -1) : ZZ(-1074, l2, 0)) : ((l1 == 0L) ? 1 : 2);
    } 
    return (l2 != 0L) ? 5 : ((l1 > 0L) ? 3 : 4);
  }
  
  private int ZZ(int paramInt1, long paramLong, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: lload_2
    //   4: l2i
    //   5: iconst_1
    //   6: iand
    //   7: istore #6
    //   9: lload_2
    //   10: iconst_2
    //   11: lshl
    //   12: lstore #7
    //   14: istore #5
    //   16: lload #7
    //   18: ldc2_w 2
    //   21: ladd
    //   22: lstore #9
    //   24: lload_2
    //   25: ldc2_w 4503599627370496
    //   28: lcmp
    //   29: ifeq -> 36
    //   32: iconst_1
    //   33: goto -> 37
    //   36: iconst_0
    //   37: iload_1
    //   38: sipush #-1074
    //   41: if_icmpne -> 48
    //   44: iconst_1
    //   45: goto -> 49
    //   48: iconst_0
    //   49: ior
    //   50: ifeq -> 72
    //   53: lload #7
    //   55: ldc2_w 2
    //   58: lsub
    //   59: lstore #11
    //   61: iload_1
    //   62: invokestatic Zc : (I)I
    //   65: istore #13
    //   67: iload #5
    //   69: ifne -> 84
    //   72: lload #7
    //   74: lconst_1
    //   75: lsub
    //   76: lstore #11
    //   78: iload_1
    //   79: invokestatic Zj : (I)I
    //   82: istore #13
    //   84: iload_1
    //   85: iload #13
    //   87: ineg
    //   88: invokestatic ZG : (I)I
    //   91: iadd
    //   92: iconst_2
    //   93: iadd
    //   94: istore #14
    //   96: iload #13
    //   98: invokestatic ZJ : (I)J
    //   101: lstore #15
    //   103: iload #13
    //   105: invokestatic ZL : (I)J
    //   108: lstore #17
    //   110: lload #15
    //   112: lload #17
    //   114: lload #7
    //   116: iload #14
    //   118: lshl
    //   119: invokestatic Zd : (JJJ)J
    //   122: lstore #19
    //   124: lload #15
    //   126: lload #17
    //   128: lload #11
    //   130: iload #14
    //   132: lshl
    //   133: invokestatic Zd : (JJJ)J
    //   136: lstore #21
    //   138: lload #15
    //   140: lload #17
    //   142: lload #9
    //   144: iload #14
    //   146: lshl
    //   147: invokestatic Zd : (JJJ)J
    //   150: lstore #23
    //   152: lload #19
    //   154: iconst_2
    //   155: lshr
    //   156: lstore #25
    //   158: lload #25
    //   160: ldc2_w 100
    //   163: lcmp
    //   164: iflt -> 257
    //   167: ldc2_w 10
    //   170: lload #25
    //   172: ldc2_w 1844674407370955168
    //   175: invokestatic Zo : (JJ)J
    //   178: lmul
    //   179: lstore #27
    //   181: lload #27
    //   183: ldc2_w 10
    //   186: ladd
    //   187: lstore #29
    //   189: lload #21
    //   191: iload #6
    //   193: i2l
    //   194: ladd
    //   195: lload #27
    //   197: iconst_2
    //   198: lshl
    //   199: lcmp
    //   200: ifgt -> 207
    //   203: iconst_1
    //   204: goto -> 208
    //   207: iconst_0
    //   208: istore #31
    //   210: lload #29
    //   212: iconst_2
    //   213: lshl
    //   214: iload #6
    //   216: i2l
    //   217: ladd
    //   218: lload #23
    //   220: lcmp
    //   221: ifgt -> 228
    //   224: iconst_1
    //   225: goto -> 229
    //   228: iconst_0
    //   229: istore #32
    //   231: iload #31
    //   233: iload #32
    //   235: if_icmpeq -> 257
    //   238: aload_0
    //   239: iload #31
    //   241: ifeq -> 249
    //   244: lload #27
    //   246: goto -> 251
    //   249: lload #29
    //   251: iload #13
    //   253: invokespecial ZV : (JI)I
    //   256: ireturn
    //   257: lload #25
    //   259: lconst_1
    //   260: ladd
    //   261: lstore #27
    //   263: lload #21
    //   265: iload #6
    //   267: i2l
    //   268: ladd
    //   269: lload #25
    //   271: iconst_2
    //   272: lshl
    //   273: lcmp
    //   274: ifgt -> 281
    //   277: iconst_1
    //   278: goto -> 282
    //   281: iconst_0
    //   282: istore #29
    //   284: lload #27
    //   286: iconst_2
    //   287: lshl
    //   288: iload #6
    //   290: i2l
    //   291: ladd
    //   292: lload #23
    //   294: lcmp
    //   295: ifgt -> 302
    //   298: iconst_1
    //   299: goto -> 303
    //   302: iconst_0
    //   303: istore #30
    //   305: iload #29
    //   307: iload #30
    //   309: if_icmpeq -> 334
    //   312: aload_0
    //   313: iload #29
    //   315: ifeq -> 323
    //   318: lload #25
    //   320: goto -> 325
    //   323: lload #27
    //   325: iload #13
    //   327: iload #4
    //   329: iadd
    //   330: invokespecial ZV : (JI)I
    //   333: ireturn
    //   334: lload #19
    //   336: lload #25
    //   338: lload #27
    //   340: ladd
    //   341: iconst_1
    //   342: lshl
    //   343: lsub
    //   344: lstore #31
    //   346: aload_0
    //   347: lload #31
    //   349: lconst_0
    //   350: lcmp
    //   351: iflt -> 370
    //   354: lload #31
    //   356: lconst_0
    //   357: lcmp
    //   358: ifne -> 375
    //   361: lload #25
    //   363: lconst_1
    //   364: land
    //   365: lconst_0
    //   366: lcmp
    //   367: ifne -> 375
    //   370: lload #25
    //   372: goto -> 377
    //   375: lload #27
    //   377: iload #13
    //   379: iload #4
    //   381: iadd
    //   382: invokespecial ZV : (JI)I
    //   385: ireturn
  }
  
  private static long Zd(long paramLong1, long paramLong2, long paramLong3) {
    long l1 = Zy9.Zo(paramLong2, paramLong3);
    long l2 = paramLong1 * paramLong3;
    long l3 = Zy9.Zo(paramLong1, paramLong3);
    long l4 = (l2 >>> 1L) + l1;
    long l5 = l3 + (l4 >>> 63L);
    return l5 | (l4 & Long.MAX_VALUE) + Long.MAX_VALUE >>> 63L;
  }
  
  private int ZV(long paramLong, int paramInt) {
    int i = Zy9.Zc(64 - Long.numberOfLeadingZeros(paramLong));
    if (paramLong >= Zy9.ZO(i))
      i++; 
    paramLong *= Zy9.ZO(17 - i);
    paramInt += i;
    long l = Zy9.Zo(paramLong, 193428131138340668L) >>> 20L;
    int j = (int)(paramLong - 100000000L * l);
    int k = (int)(l * 1441151881L >>> 57L);
    int m = (int)(l - (100000000 * k));
    return (0 < paramInt && paramInt <= 7) ? Zi(k, m, j, paramInt) : ((-3 < paramInt && paramInt <= 0) ? Zo(k, m, j, paramInt) : Zn(k, m, j, paramInt));
  }
  
  private int Zi(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZM(paramInt1);
    int j = ZX(paramInt2);
    int i = Zyz.ZN();
    byte b = 1;
    while (b < paramInt4) {
      int k = 10 * j;
      ZM(k >>> 28);
      j = k & 0xFFFFFFF;
      b++;
      if (i != 0)
        break; 
    } 
    Zu(46);
    while (b <= 8) {
      int k = 10 * j;
      ZM(k >>> 28);
      j = k & 0xFFFFFFF;
      b++;
      if (i != 0)
        break; 
    } 
    ZY(paramInt3);
    return 0;
  }
  
  private int Zo(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZM(0);
    int i = Zyz.Zv();
    Zu(46);
    while (paramInt4 < 0) {
      ZM(0);
      paramInt4++;
      if (i == 0)
        break; 
    } 
    ZM(paramInt1);
    Zd(paramInt2);
    ZY(paramInt3);
    return 0;
  }
  
  private int Zn(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ZM(paramInt1);
    Zu(46);
    Zd(paramInt2);
    ZY(paramInt3);
    Zq(paramInt4 - 1);
    return 0;
  }
  
  private void ZY(int paramInt) {
    if (paramInt != 0)
      Zd(paramInt); 
    Zb();
  }
  
  private void Zd(int paramInt) {
    int j = ZX(paramInt);
    int i = Zyz.Zv();
    byte b = 0;
    while (b < 8) {
      int k = 10 * j;
      ZM(k >>> 28);
      j = k & 0xFFFFFFF;
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  private void Zb() {
    int i = Zyz.Zv();
    while (this.Zj[this.Zg] == 48) {
      this.Zg--;
      if (i == 0)
        break; 
    } 
    if (this.Zj[this.Zg] == 46)
      this.Zg++; 
  }
  
  private int ZX(int paramInt) {
    return (int)(Zy9.Zo((paramInt + 1) << 28L, 193428131138340668L) >>> 20L) - 1;
  }
  
  private void Zq(int paramInt) {
    Zu(69);
    if (paramInt < 0) {
      Zu(45);
      paramInt = -paramInt;
    } 
    if (paramInt < 10) {
      ZM(paramInt);
      return;
    } 
    if (paramInt >= 100) {
      int j = paramInt * 1311 >>> 17;
      ZM(j);
      paramInt -= 100 * j;
    } 
    int i = paramInt * 103 >>> 10;
    ZM(i);
    ZM(paramInt - 10 * i);
  }
  
  private void Zu(int paramInt) {
    this.Zj[++this.Zg] = (byte)paramInt;
  }
  
  private void ZM(int paramInt) {
    this.Zj[++this.Zg] = (byte)(48 + paramInt);
  }
  
  private String Zt() {
    return new String(this.Zj, 0, 0, this.Zg + 1);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'aî\\tYjÆY8#Í¼8:L'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #13
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc '/eê®ÁªNÇI'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #8
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: iconst_1
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 80
    //   124: aload #5
    //   126: putstatic com/fasterxml/Zvw.a : [Ljava/lang/String;
    //   129: iconst_5
    //   130: anewarray java/lang/String
    //   133: putstatic com/fasterxml/Zvw.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #23
    //   210: goto -> 240
    //   213: bipush #102
    //   215: goto -> 240
    //   218: bipush #69
    //   220: goto -> 240
    //   223: bipush #45
    //   225: goto -> 240
    //   228: bipush #79
    //   230: goto -> 240
    //   233: bipush #53
    //   235: goto -> 240
    //   238: bipush #96
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6C86) & 0xFFFF;
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
      byte b1 = 111;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */