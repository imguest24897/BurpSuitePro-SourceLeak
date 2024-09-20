package burp;

import java.util.LinkedList;
import java.util.List;

public class Ztom {
  private final Zgmh ZL;
  
  private final Ztbb ZB;
  
  private final Zgb6 Z_;
  
  private final List<Zmne> Zo;
  
  private Zde Zs;
  
  private List<Ztnz> Zg;
  
  private Zlit Zq;
  
  private String Zz;
  
  private Zxk3 ZF;
  
  private Zstu ZJ;
  
  private static String[] ZP;
  
  private static final String[] b;
  
  private static final String[] c;
  
  Ztom(Zgmh paramZgmh, Ztbb paramZtbb, Zgb6 paramZgb6) {
    this.ZL = paramZgmh;
    this.ZB = paramZtbb;
    this.Z_ = paramZgb6;
    this.Zs = Zsss.GET;
    this.Zo = new LinkedList<>();
  }
  
  public Ztom Zj(Zde paramZde) {
    this.Zs = paramZde;
    return this;
  }
  
  public Ztom ZK(Zxk3 paramZxk3) {
    this.ZF = paramZxk3;
    return this;
  }
  
  public Ztom Zf(Zlit paramZlit) {
    this.Zq = paramZlit;
    return this;
  }
  
  public Ztom ZM(String paramString) {
    this.Zz = paramString;
    return this;
  }
  
  public Ztom Zl(List<Ztnz> paramList) {
    this.Zg = paramList;
    return this;
  }
  
  public Ztom Za(List<Ztnz> paramList) {
    paramList.forEach(this::Zc);
    return this;
  }
  
  public Ztom Zc(Ztnz paramZtnz) {
    this.Zo.add(new Zmne(paramZtnz, true));
    return this;
  }
  
  public Ztom ZI(Ztnz paramZtnz) {
    this.Zo.add(new Zmne(paramZtnz, false));
    return this;
  }
  
  public Ztom Zw(String paramString) {
    return Zc(new Ztnz(a(14752, 27645), paramString));
  }
  
  public Ztom ZZ(Zstu paramZstu) {
    this.ZJ = paramZstu;
    return this;
  }
  
  public Zstu Zr() {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zq : Lburp/Zlit;
    //   8: ifnull -> 19
    //   11: iconst_1
    //   12: goto -> 20
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: iconst_0
    //   20: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   23: sipush #14755
    //   26: sipush #13866
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   35: aload_0
    //   36: getfield Zz : Ljava/lang/String;
    //   39: ifnonnull -> 65
    //   42: aload_0
    //   43: aload_0
    //   44: getfield Zq : Lburp/Zlit;
    //   47: invokeinterface Zdz : ()Lburp/Zmzk;
    //   52: invokestatic ZO : (Lburp/Zmzk;)Ljava/lang/String;
    //   55: putfield Zz : Ljava/lang/String;
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Zg : Ljava/util/List;
    //   69: ifnonnull -> 95
    //   72: aload_0
    //   73: aload_0
    //   74: getfield Z_ : Lburp/Zgb6;
    //   77: invokeinterface Zcq : ()Z
    //   82: invokestatic Zd : (Z)Ljava/util/List;
    //   85: putfield Zg : Ljava/util/List;
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: new burp/Zrkb
    //   98: dup
    //   99: aload_0
    //   100: getfield Zg : Ljava/util/List;
    //   103: invokespecial <init> : (Ljava/util/List;)V
    //   106: aload_0
    //   107: getfield Zo : Ljava/util/List;
    //   110: invokevirtual ZU : (Ljava/util/List;)Lburp/Zrkb;
    //   113: invokevirtual Zr : ()Ljava/util/List;
    //   116: astore_2
    //   117: aload_0
    //   118: getfield ZF : Lburp/Zxk3;
    //   121: ifnonnull -> 151
    //   124: aload_0
    //   125: aload_0
    //   126: getfield ZB : Lburp/Ztbb;
    //   129: aload_0
    //   130: getfield Zq : Lburp/Zlit;
    //   133: invokeinterface Zdz : ()Lburp/Zmzk;
    //   138: invokevirtual ZP : (Lburp/Zmzk;)Lburp/Zxk3;
    //   141: putfield ZF : Lburp/Zxk3;
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: new java/io/ByteArrayOutputStream
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: astore_3
    //   159: aload_3
    //   160: aload_0
    //   161: getfield Zs : Lburp/Zde;
    //   164: invokeinterface ZV : ()[B
    //   169: invokevirtual write : ([B)V
    //   172: aload_3
    //   173: bipush #32
    //   175: invokevirtual write : (I)V
    //   178: aload_0
    //   179: getfield ZL : Lburp/Zgmh;
    //   182: aload_0
    //   183: getfield Zq : Lburp/Zlit;
    //   186: invokeinterface Zd1 : ()Ljava/lang/String;
    //   191: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   196: ifnull -> 245
    //   199: aload_0
    //   200: getfield Zq : Lburp/Zlit;
    //   203: invokeinterface Zdr : ()Z
    //   208: ifne -> 245
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: aload_3
    //   219: aload_0
    //   220: getfield Zq : Lburp/Zlit;
    //   223: invokeinterface toString : ()Ljava/lang/String;
    //   228: invokestatic Zy : (Ljava/lang/String;)[B
    //   231: invokevirtual write : ([B)V
    //   234: aload_1
    //   235: ifnull -> 265
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: aload_3
    //   246: aload_0
    //   247: getfield Zq : Lburp/Zlit;
    //   250: invokeinterface ZdH : ()[B
    //   255: invokevirtual write : ([B)V
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   264: athrow
    //   265: aload_3
    //   266: bipush #32
    //   268: invokevirtual write : (I)V
    //   271: aload_3
    //   272: aload_0
    //   273: getfield ZF : Lburp/Zxk3;
    //   276: invokevirtual Za : ()[B
    //   279: invokevirtual write : ([B)V
    //   282: aload_3
    //   283: getstatic net/portswigger/Zdo.Zn : [B
    //   286: invokevirtual write : ([B)V
    //   289: aload_3
    //   290: getstatic net/portswigger/Zdo.ZU : [B
    //   293: invokevirtual write : ([B)V
    //   296: aload_3
    //   297: aload_0
    //   298: getfield Zz : Ljava/lang/String;
    //   301: invokestatic Zy : (Ljava/lang/String;)[B
    //   304: invokevirtual write : ([B)V
    //   307: aload_3
    //   308: getstatic net/portswigger/Zdo.Zn : [B
    //   311: invokevirtual write : ([B)V
    //   314: aload_2
    //   315: invokeinterface iterator : ()Ljava/util/Iterator;
    //   320: astore #4
    //   322: aload #4
    //   324: invokeinterface hasNext : ()Z
    //   329: ifeq -> 381
    //   332: aload #4
    //   334: invokeinterface next : ()Ljava/lang/Object;
    //   339: checkcast burp/Ztnz
    //   342: astore #5
    //   344: aload #5
    //   346: invokevirtual Zg : ()[B
    //   349: astore #6
    //   351: aload #6
    //   353: arraylength
    //   354: ifne -> 364
    //   357: goto -> 322
    //   360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   363: athrow
    //   364: aload_3
    //   365: aload #6
    //   367: invokevirtual write : ([B)V
    //   370: aload_3
    //   371: getstatic net/portswigger/Zdo.Zn : [B
    //   374: invokevirtual write : ([B)V
    //   377: aload_1
    //   378: ifnull -> 322
    //   381: aload_0
    //   382: getfield ZJ : Lburp/Zstu;
    //   385: ifnull -> 437
    //   388: aload_3
    //   389: sipush #14753
    //   392: sipush #-15752
    //   395: invokestatic a : (II)Ljava/lang/String;
    //   398: invokestatic Zy : (Ljava/lang/String;)[B
    //   401: invokevirtual write : ([B)V
    //   404: aload_3
    //   405: aload_0
    //   406: getfield ZJ : Lburp/Zstu;
    //   409: invokeinterface Zpu : ()I
    //   414: invokestatic toString : (I)Ljava/lang/String;
    //   417: invokestatic Zy : (Ljava/lang/String;)[B
    //   420: invokevirtual write : ([B)V
    //   423: aload_3
    //   424: getstatic net/portswigger/Zdo.Zn : [B
    //   427: invokevirtual write : ([B)V
    //   430: goto -> 437
    //   433: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   436: athrow
    //   437: aload_3
    //   438: getstatic net/portswigger/Zdo.Zn : [B
    //   441: invokevirtual write : ([B)V
    //   444: aload_0
    //   445: getfield ZJ : Lburp/Zstu;
    //   448: ifnull -> 471
    //   451: aload_3
    //   452: aload_0
    //   453: getfield ZJ : Lburp/Zstu;
    //   456: invokeinterface ZiD : ()[B
    //   461: invokevirtual write : ([B)V
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   470: athrow
    //   471: goto -> 484
    //   474: astore #4
    //   476: aload #4
    //   478: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   481: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   484: aload_3
    //   485: invokevirtual toByteArray : ()[B
    //   488: invokestatic Zy : ([B)Lburp/Zyf;
    //   491: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	15	java/lang/Exception
    //   20	58	61	java/lang/Exception
    //   65	88	91	java/lang/Exception
    //   117	144	147	java/lang/Exception
    //   159	211	214	java/lang/Exception
    //   159	471	474	java/lang/Exception
    //   199	238	241	java/lang/Exception
    //   218	258	261	java/lang/Exception
    //   351	360	360	java/lang/Exception
    //   381	430	433	java/lang/Exception
    //   437	464	467	java/lang/Exception
  }
  
  public static void Zn(String[] paramArrayOfString) {
    ZP = paramArrayOfString;
  }
  
  public static String[] ZG() {
    return ZP;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qÐäUÃà¤ýñô\\ndð!)¾-Õs'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic Zn : ([Ljava/lang/String;)V
    //   21: bipush #16
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #43
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
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
    //   71: aload #5
    //   73: putstatic burp/Ztom.b : [Ljava/lang/String;
    //   76: iconst_3
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Ztom.c : [Ljava/lang/String;
    //   83: goto -> 230
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 203
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 185, 0 -> 156, 1 -> 161, 2 -> 165, 3 -> 170, 4 -> 175, 5 -> 180
    //   156: bipush #82
    //   158: goto -> 187
    //   161: iconst_1
    //   162: goto -> 187
    //   165: bipush #113
    //   167: goto -> 187
    //   170: bipush #11
    //   172: goto -> 187
    //   175: bipush #118
    //   177: goto -> 187
    //   180: bipush #110
    //   182: goto -> 187
    //   185: bipush #10
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 109
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 105
    //   211: pop
    //   212: new java/lang/String
    //   215: dup_x1
    //   216: swap
    //   217: invokespecial <init> : ([C)V
    //   220: invokevirtual intern : ()Ljava/lang/String;
    //   223: swap
    //   224: pop
    //   225: swap
    //   226: pop
    //   227: goto -> 43
    //   230: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x39A1) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 115;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztom.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */