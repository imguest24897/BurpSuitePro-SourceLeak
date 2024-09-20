package burp;

import java.util.Arrays;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zen;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

class Zx__ implements Zzwz {
  private final Zlk4 Zy;
  
  private final int ZM;
  
  private final int ZB;
  
  private final Zbjl Ze;
  
  private final Zsy ZL;
  
  private final Zxs7 Zr;
  
  private Zen Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zx__(Zlk4 paramZlk4, int paramInt1, int paramInt2, Zbjl paramZbjl, Zsy paramZsy, Zxs7 paramZxs7) {
    this.Zy = paramZlk4;
    this.ZM = paramInt1;
    this.ZB = paramInt2;
    this.Ze = paramZbjl;
    this.ZL = paramZsy;
    this.Zr = paramZxs7;
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.Zm = paramZen;
    return Zt(paramZlp9);
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    int[] arrayOfInt = Ztok.ZS();
    for (Zewx zewx : Zb()) {
      try {
        if (zewx.ZG() == paramZlp9)
          return zewx; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  public List<Zewx> ZK() {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore_1
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: iconst_2
    //   9: anewarray burp/Zewx
    //   12: dup
    //   13: iconst_0
    //   14: aload_0
    //   15: getstatic burp/Zlp9.NUMERIC_MYSQL_SQLI_PAYLOAD : Lburp/Zlp9;
    //   18: ldc ''
    //   20: ldc ''
    //   22: iconst_0
    //   23: invokevirtual ZV : (Lburp/Zlp9;Ljava/lang/String;Ljava/lang/String;B)Lburp/Zewx;
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: aload_0
    //   30: getstatic burp/Zlp9.STRING_MYSQL_SQLI_PAYLOAD : Lburp/Zlp9;
    //   33: sipush #-2177
    //   36: sipush #-25384
    //   39: invokestatic a : (II)Ljava/lang/String;
    //   42: sipush #-2192
    //   45: sipush #-21305
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokevirtual ZV : (Lburp/Zlp9;Ljava/lang/String;Ljava/lang/String;B)Lburp/Zewx;
    //   55: aastore
    //   56: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   59: invokespecial <init> : (Ljava/util/Collection;)V
    //   62: astore_2
    //   63: aload_0
    //   64: getfield Zy : Lburp/Zlk4;
    //   67: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   70: if_acmpeq -> 87
    //   73: aload_0
    //   74: invokevirtual Zp : ()Z
    //   77: ifeq -> 120
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   86: athrow
    //   87: aload_2
    //   88: aload_0
    //   89: getstatic burp/Zlp9.NUMERIC_MYSQL_ORDER_BY_SQLI_PAYLOAD : Lburp/Zlp9;
    //   92: ldc ''
    //   94: sipush #-2189
    //   97: sipush #-18433
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: iconst_1
    //   104: invokevirtual ZV : (Lburp/Zlp9;Ljava/lang/String;Ljava/lang/String;B)Lburp/Zewx;
    //   107: invokeinterface add : (Ljava/lang/Object;)Z
    //   112: pop
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   119: athrow
    //   120: aload_0
    //   121: getfield Zy : Lburp/Zlk4;
    //   124: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   127: if_acmpne -> 163
    //   130: aload_2
    //   131: aload_0
    //   132: getstatic burp/Zlp9.STRING_MYSQL_ORDER_BY_SQLI_PAYLOAD : Lburp/Zlp9;
    //   135: ldc '''
    //   137: sipush #-2189
    //   140: sipush #-18433
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: iconst_1
    //   147: invokevirtual ZV : (Lburp/Zlp9;Ljava/lang/String;Ljava/lang/String;B)Lburp/Zewx;
    //   150: invokeinterface add : (Ljava/lang/Object;)Z
    //   155: pop
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   162: athrow
    //   163: aload_2
    //   164: invokestatic Zwu : ()[Lburp/Zbqc;
    //   167: ifnonnull -> 183
    //   170: iconst_2
    //   171: newarray int
    //   173: invokestatic ZY : ([I)V
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   182: athrow
    //   183: areturn
    // Exception table:
    //   from	to	target	type
    //   63	80	83	java/lang/NumberFormatException
    //   73	113	116	java/lang/NumberFormatException
    //   120	156	159	java/lang/NumberFormatException
    //   163	176	179	java/lang/NumberFormatException
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return new Ztok(null);
  }
  
  private List<Zewx> Zb() {
    return Arrays.asList(new Zewx[] { ZV(Zlp9.NUMERIC_MYSQL_SQLI_PAYLOAD, "", "", (byte)0), ZV(Zlp9.STRING_MYSQL_SQLI_PAYLOAD, a(-2178, 15632), a(-2188, 29979), (byte)1), ZV(Zlp9.NUMERIC_MYSQL_ORDER_BY_SQLI_PAYLOAD, "", a(-2186, -6665), (byte)1), ZV(Zlp9.STRING_MYSQL_ORDER_BY_SQLI_PAYLOAD, "'", a(-2189, -18433), (byte)1) });
  }
  
  private boolean Zp() {
    try {
      if (!this.Zy.ZO(Zlk4.NORMAL)) {
        try {
          if (this.Zr.ZI() == null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    if (this.Zr.Zg())
      try {
        int i = Integer.parseInt(this.Zr.ZI());
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return (i < 1000);
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.UNEXPECTED);
        Zuh.ZT(false, Zqf.Zr, this.Zr.ZI());
        return false;
      }  
    try {
      if (!a(-2191, 13742).equalsIgnoreCase(this.Zr.ZI())) {
        try {
          if (a(-2185, 19491).equalsIgnoreCase(this.Zr.ZI()));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private Zewx ZV(Zlp9 paramZlp9, String paramString1, String paramString2, byte paramByte) {
    Zen zen = Zq(paramZlp9);
    String str = paramString1 + paramString1 + ZV(zen, paramZlp9);
    return ZL(zen, str, paramZlp9, paramByte);
  }
  
  private Zewx ZL(Zen paramZen, String paramString, Zlp9 paramZlp9, byte paramByte) {
    return new Zewx(paramZen, Zkb.Zy(paramString), paramZlp9, new Zmhr(this.Ze.ZB().ZU(paramZen), 80, false), paramByte, Zewx.ZA);
  }
  
  private Zen Zq(Zlp9 paramZlp9) {
    try {
      if (this.Zm != null)
        return this.Zm; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Ztt6 ztt6 = new Ztt6(this.ZM, this.ZB, paramZlp9, this.Zr.Zl());
    return this.Ze.ZK(1, ztt6.toString());
  }
  
  private String ZV(Zen paramZen, Zlp9 paramZlp9) {
    Zzi5 zzi5 = this.Ze.ZB();
    try {
      if (paramZlp9 == Zlp9.NUMERIC_MYSQL_ORDER_BY_SQLI_PAYLOAD || paramZlp9 == Zlp9.STRING_MYSQL_ORDER_BY_SQLI_PAYLOAD) {
        String str4 = ZD();
        String str5 = zzi5.ZJ();
        String str6 = paramZen.toString();
        return a(-2180, 2321) + a(-2180, 2321) + str6 + "." + str5 + a(-2182, -30404) + str4;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str1 = ZD();
    String str2 = zzi5.ZJ();
    String str3 = paramZen.toString();
    return a(-2187, -14870) + a(-2187, -14870) + str3 + "." + str2 + a(-2179, 8266) + str1;
  }
  
  private String ZD() {
    return this.ZL.Zi().Zq().ZK(3);
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ñ¢PôÌôR{þ\\bÙS¯[öh$Y)áv®@²ñ}ÿ×FÃ¢ØùF¼A¢_X/1}jþÔ}VÎ·ºPm¢Î¶û3'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #86
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'S/yø'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #116
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zx__.a : [Ljava/lang/String;
    //   130: bipush #13
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zx__.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #20
    //   214: goto -> 243
    //   217: bipush #66
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #125
    //   228: goto -> 243
    //   231: bipush #82
    //   233: goto -> 243
    //   236: bipush #37
    //   238: goto -> 243
    //   241: bipush #90
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF776) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx__.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */