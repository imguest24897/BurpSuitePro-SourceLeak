package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

@FunctionalInterface
public interface Zb1d {
  public static final String[] a;
  
  public static final String[] b;
  
  Zx69 ZZ(Zzvx paramZzvx, String... paramVarArgs);
  
  private static String Zj(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    try {
      if (paramArrayOfString1.length > 0) {
        try {
          if (paramArrayOfString1.length > 1)
            throw new IllegalArgumentException(a(-28955, 26560)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramArrayOfString1[0];
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfString2.length > 0) {
        try {
          if (paramArrayOfString2.length > 1)
            throw new IllegalArgumentException(a(-28960, 19602)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramArrayOfString2[0];
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return a(-28957, 12945);
  }
  
  static Zm0j ZU(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$responseCode$1);
  }
  
  static Zeqj ZW(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$url$2);
  }
  
  static Zeqj Zd(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$method$3);
  }
  
  static Zeqj Zk(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$query$4);
  }
  
  static Zeqj Zw(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$requestHttpVersion$5);
  }
  
  static Zeqj ZY(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$responseHttpVersion$6);
  }
  
  static Zeqj Zo(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$fullResponse$7);
  }
  
  static Zeqj Za(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28958, 13775));
    return Zeqj.Zw(paramVarArgs::lambda$fullRequest$8);
  }
  
  static Zbs5 Zm(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return new Zbs5(paramVarArgs);
  }
  
  static Zryv Zv(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28956, -24107));
    return new Zryv(paramVarArgs);
  }
  
  static Zeqj ZS(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$responseBody$9);
  }
  
  static Zeqj ZA(String... paramVarArgs) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zuh.ZT((paramVarArgs.length < 2), Zqf.Zk, a(-28959, 24755));
    return Zeqj.Zw(paramVarArgs::lambda$requestBody$10);
  }
  
  private static Zefx ZH(String paramString, Zzvx paramZzvx) {
    return paramZzvx.Zk(paramString).ZR();
  }
  
  private static Zx69 Zn(String paramString, Zzvx paramZzvx) {
    Zzbn zzbn = paramZzvx.Zk(paramString);
    Zstu zstu = zzbn.Zb().Za();
    int i = Zlt_.ZT(zstu, (byte)32, 0, 2147483647);
    return Zx69.Zl(zzbn, zstu.Zb(i + 1, i + 4), i + 1);
  }
  
  private static Zlit Zm(String paramString, Zzvx paramZzvx) {
    return ZH(paramString, paramZzvx).ZF();
  }
  
  private static Zx69 ZQ(String paramString, Zzvx paramZzvx) {
    Zzbn zzbn = paramZzvx.Zk(paramString);
    Zm0u zm0u = Ztr9.ZG(zzbn.ZR().ZG().get(0));
    zzbn.ZV(new Zl1r(zm0u.ZB.ZgZ(), zm0u.ZB.Zgg()));
    return Zx69.Zp(Zlt_.Zv(Zm(paramString, paramZzvx).Zdw()));
  }
  
  private static Zx69 Zp(String paramString, Zzvx paramZzvx) {
    Zzbn zzbn = paramZzvx.Zk(paramString);
    Zm0u zm0u = Ztr9.ZG(zzbn.ZR().ZG().get(0));
    zzbn.ZV(new Zl1r(zm0u.ZB.ZgJ(), zm0u.ZB.ZgY()));
    String str = zzbn.ZR().Zr();
    return Zx69.Zp(Zyf.Za(str));
  }
  
  private static Zx69 ZG(String paramString, Zzvx paramZzvx) {
    Zzbn zzbn = paramZzvx.Zk(paramString);
    Zm0u zm0u = Ztr9.ZG(zzbn.ZR().ZG().get(0));
    zzbn.ZV(new Zl1r(zm0u.ZB.ZgZ(), zm0u.ZB.Zgg()));
    byte[] arrayOfByte = zzbn.ZR().ZF().ZdC();
    return Zx69.Zp(Zyf.Zy(arrayOfByte));
  }
  
  private static Zx69 ZE(String paramString, Zzvx paramZzvx) {
    byte[] arrayOfByte = ZH(paramString, paramZzvx).Zw();
    return Zx69.Zp(Zlt_.ZF(arrayOfByte, new Zruo()));
  }
  
  private static Zx69 ZX(String paramString, Zzvx paramZzvx) {
    Zzbn zzbn = paramZzvx.Zk(paramString);
    Zm0u zm0u = Ztr9.ZG(zzbn.ZR().ZG().get(0));
    zzbn.ZV(new Zl1r(zm0u.ZB.ZgQ(), zm0u.ZB.Zg5()));
    String str = zzbn.ZR().Z_();
    return Zx69.Zp(Zyf.Za(str));
  }
  
  private static Zx69 ZS(String paramString, Zzvx paramZzvx) {
    Zzbn zzbn = paramZzvx.Zk(paramString);
    Zs68 zs68 = Zbwc.Zr(null, zzbn.Zb().Za(), Zt0k.HTML_HEAD_ANALYSIS, true, false, paramZzvx.ZU().Zq(), Zb1d::lambda$getHttpVersionFromResponse$11);
    return Zx69.Zl(zzbn, Zlt_.Zv(zs68.Zf), 0);
  }
  
  private static Boolean lambda$getHttpVersionFromResponse$11() {
    return Boolean.valueOf(false);
  }
  
  private static Zx69 lambda$requestBody$10(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return ZE(str, paramZzvx);
  }
  
  private static Zx69 lambda$responseBody$9(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    Zzbn zzbn = paramZzvx.Zk(str);
    Zb6q zb6q = zzbn.Zb();
    int i = zb6q.Zs();
    return Zx69.Zl(zzbn, zb6q.Zt(), i);
  }
  
  private static Zx69 lambda$fullRequest$8(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    Zyf zyf = Zyf.Zy(ZH(str, paramZzvx).ZD());
    return Zx69.Zp(zyf);
  }
  
  private static Zx69 lambda$fullResponse$7(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    Zzbn zzbn = paramZzvx.Zk(str);
    return Zx69.Zl(zzbn, zzbn.Zb().Za(), 0);
  }
  
  private static Zx69 lambda$responseHttpVersion$6(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return ZS(str, paramZzvx);
  }
  
  private static Zx69 lambda$requestHttpVersion$5(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return ZX(str, paramZzvx);
  }
  
  private static Zx69 lambda$query$4(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return ZG(str, paramZzvx);
  }
  
  private static Zx69 lambda$method$3(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return Zp(str, paramZzvx);
  }
  
  private static Zx69 lambda$url$2(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return ZQ(str, paramZzvx);
  }
  
  private static Zx69 lambda$responseCode$1(String[] paramArrayOfString1, Zzvx paramZzvx, String[] paramArrayOfString2) {
    String str = Zj(paramArrayOfString2, paramArrayOfString1);
    return Zn(str, paramZzvx);
  }
  
  private Zx69 lambda$as$0(String paramString, Zzvx paramZzvx, String[] paramArrayOfString) {
    Zx69 zx69 = ZZ(paramZzvx, paramArrayOfString);
    paramZzvx.Zg(paramString, zx69.Zs());
    return zx69;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '6ÚûI/²¾cÅßÛ#Í0V¨«ÚÑ <\\b+T³\\bú$#.²V"çêþ¤á`+\s¨"ë\\nSB&ÙBhàeDý¥¦Ã ®©à:H5·!3¿7ú±2É4^Þ.%Ôð=NÌ\\f'ºÝ¸!C\\fÀ-Ms+â@ \\fN¾¾C)'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #53
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #53
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'ëû¢^ú}\\fiÞ4÷ÅùÀ3[ºy7Y'\\t¢BB04×Z"äõòkdÃÔ \\t²z>-ÄJ!õi¦öAB¸±yG!å\\bîx¡'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #34
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #86
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zb1d.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb1d.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #42
    //   229: goto -> 244
    //   232: bipush #125
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #88
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8EE1) & 0xFFFF;
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
      byte b1 = 35;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */