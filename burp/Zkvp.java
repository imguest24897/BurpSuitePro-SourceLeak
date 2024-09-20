package burp;

import java.time.Duration;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkvp implements Zz1 {
  private final Ztpx Zr;
  
  private final Zgb6 Zc;
  
  private final Zkq4 Zf;
  
  private final Zl11 Zb;
  
  private final Zz3j Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkvp(Ztpx paramZtpx, Zgb6 paramZgb6, Zkq4 paramZkq4, Zl11 paramZl11, Zz3j paramZz3j) {
    this.Zr = paramZtpx;
    this.Zc = paramZgb6;
    this.Zf = paramZkq4;
    this.Zb = paramZl11;
    this.Zn = paramZz3j;
  }
  
  public Zsxd Zl(Zlgm paramZlgm, Zefx paramZefx, Duration paramDuration1, Duration paramDuration2, Ze45 paramZe45, boolean paramBoolean, Zsil paramZsil) throws Zm_j, Zktz {
    // Byte code:
    //   0: invokestatic Ze : ()I
    //   3: istore #8
    //   5: aload #4
    //   7: ifnull -> 33
    //   10: aload #4
    //   12: invokevirtual isZero : ()Z
    //   15: ifne -> 33
    //   18: goto -> 25
    //   21: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   24: athrow
    //   25: iconst_1
    //   26: goto -> 34
    //   29: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   32: athrow
    //   33: iconst_0
    //   34: istore #9
    //   36: aload_3
    //   37: ifnull -> 48
    //   40: aload_3
    //   41: goto -> 64
    //   44: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   47: athrow
    //   48: aload_0
    //   49: getfield Zf : Lburp/Zkq4;
    //   52: invokeinterface ZT1 : ()Ljava/util/Optional;
    //   57: aconst_null
    //   58: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   61: checkcast java/time/Duration
    //   64: astore_3
    //   65: aload #4
    //   67: ifnull -> 79
    //   70: aload #4
    //   72: goto -> 95
    //   75: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   78: athrow
    //   79: aload_0
    //   80: getfield Zf : Lburp/Zkq4;
    //   83: invokeinterface ZTa : ()Ljava/util/Optional;
    //   88: aconst_null
    //   89: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: checkcast java/time/Duration
    //   95: astore #4
    //   97: aload_0
    //   98: getfield Zc : Lburp/Zgb6;
    //   101: invokestatic ZG : (Lburp/Zgb6;)Lburp/Zs38;
    //   104: aload_3
    //   105: invokevirtual Zq : (Ljava/time/Duration;)Lburp/Zs38;
    //   108: aload #4
    //   110: invokevirtual ZI : (Ljava/time/Duration;)Lburp/Zs38;
    //   113: aload #5
    //   115: invokevirtual ZV : (Lburp/Ze45;)Lburp/Zs38;
    //   118: iconst_1
    //   119: invokevirtual Ze : (Z)Lburp/Zs38;
    //   122: new burp/Zzcr
    //   125: dup
    //   126: aload_1
    //   127: invokespecial <init> : (Lburp/Zlgm;)V
    //   130: invokevirtual Zp : (Lburp/Zlgm;)Lburp/Zs38;
    //   133: astore #10
    //   135: iload #6
    //   137: ifeq -> 154
    //   140: aload #10
    //   142: iconst_0
    //   143: invokevirtual Zi : (Z)Lburp/Zs38;
    //   146: pop
    //   147: goto -> 154
    //   150: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   153: athrow
    //   154: aload #10
    //   156: invokevirtual Zy : ()Lburp/Zts5;
    //   159: astore #11
    //   161: aload_0
    //   162: getfield Zr : Lburp/Ztpx;
    //   165: aload_0
    //   166: getfield Zn : Lburp/Zz3j;
    //   169: aload_0
    //   170: aload_2
    //   171: aload #11
    //   173: aload #7
    //   175: <illegal opcode> get : (Lburp/Zkvp;Lburp/Zefx;Lburp/Zts5;Lburp/Zsil;)Ljava/util/function/Supplier;
    //   180: aload_2
    //   181: invokevirtual Z_ : (Ljava/util/function/Supplier;Lburp/Zefx;)Lburp/Ztaw;
    //   184: invokeinterface ZJ : (Lburp/Ztaw;)Lburp/Zsxd;
    //   189: astore #12
    //   191: aload #12
    //   193: invokeinterface ZG : ()Lburp/Zg3d;
    //   198: astore #13
    //   200: getstatic burp/Zrar.Zd : [I
    //   203: aload #13
    //   205: invokeinterface Zb : ()Lburp/Zvom;
    //   210: invokevirtual ordinal : ()I
    //   213: iaload
    //   214: tableswitch default -> 435, 1 -> 248, 2 -> 257, 3 -> 308, 4 -> 345, 5 -> 391
    //   248: aload #12
    //   250: goto -> 483
    //   253: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   256: athrow
    //   257: iload #9
    //   259: ifeq -> 271
    //   262: aload #12
    //   264: goto -> 483
    //   267: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   270: athrow
    //   271: new burp/Zm_j
    //   274: dup
    //   275: sipush #-1396
    //   278: sipush #-19006
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: iconst_1
    //   285: anewarray java/lang/Object
    //   288: dup
    //   289: iconst_0
    //   290: aload #13
    //   292: invokeinterface Zb : ()Lburp/Zvom;
    //   297: aastore
    //   298: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   301: getstatic burp/Zkhr.TIMED_OUT : Lburp/Zkhr;
    //   304: invokespecial <init> : (Ljava/lang/String;Lburp/Zkhr;)V
    //   307: athrow
    //   308: new burp/Zm_j
    //   311: dup
    //   312: sipush #-1395
    //   315: sipush #-7803
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: iconst_1
    //   322: anewarray java/lang/Object
    //   325: dup
    //   326: iconst_0
    //   327: aload #13
    //   329: invokeinterface Zb : ()Lburp/Zvom;
    //   334: aastore
    //   335: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   338: getstatic burp/Zkhr.STREAMING_RESPONSE : Lburp/Zkhr;
    //   341: invokespecial <init> : (Ljava/lang/String;Lburp/Zkhr;)V
    //   344: athrow
    //   345: new burp/Zm_l
    //   348: dup
    //   349: sipush #-1395
    //   352: sipush #-7803
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: iconst_1
    //   359: anewarray java/lang/Object
    //   362: dup
    //   363: iconst_0
    //   364: sipush #-1393
    //   367: sipush #-18523
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: aastore
    //   374: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   377: aload #13
    //   379: invokeinterface Zx : ()Ljava/lang/Exception;
    //   384: checkcast java/net/UnknownHostException
    //   387: invokespecial <init> : (Ljava/lang/String;Ljava/net/UnknownHostException;)V
    //   390: athrow
    //   391: new burp/Zm_j
    //   394: dup
    //   395: sipush #-1395
    //   398: sipush #-7803
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: iconst_1
    //   405: anewarray java/lang/Object
    //   408: dup
    //   409: iconst_0
    //   410: aload #13
    //   412: invokeinterface Zb : ()Lburp/Zvom;
    //   417: aastore
    //   418: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   421: getstatic burp/Zkhr.CONNECTION_FAILURE : Lburp/Zkhr;
    //   424: aload #13
    //   426: invokeinterface Zx : ()Ljava/lang/Exception;
    //   431: invokespecial <init> : (Ljava/lang/String;Lburp/Zkhr;Ljava/lang/Throwable;)V
    //   434: athrow
    //   435: sipush #-1395
    //   438: sipush #-7803
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: iconst_1
    //   445: anewarray java/lang/Object
    //   448: dup
    //   449: iconst_0
    //   450: aload #13
    //   452: invokeinterface Zb : ()Lburp/Zvom;
    //   457: aastore
    //   458: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   461: astore #14
    //   463: new burp/Zm_j
    //   466: dup
    //   467: aload #14
    //   469: getstatic burp/Zkhr.EMPTY_RESPONSE : Lburp/Zkhr;
    //   472: aload #13
    //   474: invokeinterface Zx : ()Ljava/lang/Exception;
    //   479: invokespecial <init> : (Ljava/lang/String;Lburp/Zkhr;Ljava/lang/Throwable;)V
    //   482: athrow
    //   483: iload #8
    //   485: ifne -> 502
    //   488: iconst_4
    //   489: anewarray burp/Zbqc
    //   492: invokestatic Zr : ([Lburp/Zbqc;)V
    //   495: goto -> 502
    //   498: invokestatic a : (Lburp/Zgum;)Lburp/Zgum;
    //   501: athrow
    //   502: areturn
    //   503: astore #12
    //   505: aload #12
    //   507: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   510: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   513: new burp/Zktz
    //   516: dup
    //   517: invokespecial <init> : ()V
    //   520: athrow
    // Exception table:
    //   from	to	target	type
    //   5	18	21	burp/Zgum
    //   10	29	29	burp/Zgum
    //   36	44	44	burp/Zgum
    //   65	75	75	burp/Zgum
    //   135	147	150	burp/Zgum
    //   161	483	503	burp/Zgum
    //   200	253	253	burp/Zgum
    //   257	267	267	burp/Zgum
    //   483	495	498	burp/Zgum
  }
  
  public Zsxd Zf(Zlgm paramZlgm, Zefx paramZefx, Duration paramDuration1, Duration paramDuration2, Ze45 paramZe45, boolean paramBoolean, Zsil paramZsil) {
    try {
      return Zl(paramZlgm, paramZefx, paramDuration1, paramDuration2, paramZe45, paramBoolean, paramZsil);
    } catch (Zm_j zm_j) {
      Zah.Zl(zm_j, Zk_.UNEXPECTED);
      throw new RuntimeException(zm_j);
    } 
  }
  
  private Zsxd lambda$issueRequest$0(Zefx paramZefx, Zts5 paramZts5, Zsil paramZsil) {
    return this.Zb.ZE(paramZefx, paramZts5, paramZsil, Zlbz.Zx);
  }
  
  private static Zgum a(Zgum paramZgum) {
    return paramZgum;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÌiT·ÃÀËiyÏóQWs\\bÖîîÜÎVþ½Ã; Ùýö%A#(¹Ú!ÿ×t|ºDL_ÔUæ*\\f¶º¯æOR¨'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #32
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #118
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
    //   69: putstatic burp/Zkvp.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zkvp.b : [Ljava/lang/String;
    //   79: goto -> 225
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
    //   98: if_icmpgt -> 198
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 180, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 171, 5 -> 175
    //   152: bipush #64
    //   154: goto -> 182
    //   157: bipush #69
    //   159: goto -> 182
    //   162: bipush #104
    //   164: goto -> 182
    //   167: iconst_4
    //   168: goto -> 182
    //   171: iconst_2
    //   172: goto -> 182
    //   175: bipush #38
    //   177: goto -> 182
    //   180: bipush #10
    //   182: ixor
    //   183: ixor
    //   184: i2c
    //   185: castore
    //   186: iinc #6, 1
    //   189: dup
    //   190: ifne -> 198
    //   193: dup2
    //   194: dup_x1
    //   195: goto -> 105
    //   198: dup2_x1
    //   199: pop2
    //   200: dup_x2
    //   201: iload #6
    //   203: if_icmpgt -> 101
    //   206: pop
    //   207: new java/lang/String
    //   210: dup_x1
    //   211: swap
    //   212: invokespecial <init> : ([C)V
    //   215: invokevirtual intern : ()Ljava/lang/String;
    //   218: swap
    //   219: pop
    //   220: swap
    //   221: pop
    //   222: goto -> 39
    //   225: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFA8D) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */