package burp;

import java.io.IOException;

public abstract class Ztqv {
  final Zkjm Zc;
  
  private final Ztb2 Zx;
  
  private final String Zd;
  
  private final String Zy;
  
  private static int Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztqv(Zkjm paramZkjm, Ztb2 paramZtb2, String paramString1, String paramString2) {
    this.Zc = paramZkjm;
    this.Zx = paramZtb2;
    this.Zd = paramString1;
    this.Zy = paramString2;
  }
  
  public Zefx ZF(Zkbo paramZkbo, Zefx paramZefx) throws Zryj, Zry8, Zxt3, IOException {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: getfield Zd : Ljava/lang/String;
    //   5: invokeinterface ZY : (Ljava/lang/String;)Lburp/Zefx;
    //   10: astore #4
    //   12: aload_0
    //   13: invokevirtual Zr : ()Ljava/lang/String;
    //   16: sipush #32598
    //   19: sipush #-8152
    //   22: invokestatic a : (II)Ljava/lang/String;
    //   25: swap
    //   26: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   31: astore #5
    //   33: invokestatic Zm : ()I
    //   36: aload #4
    //   38: aload_0
    //   39: getfield Zd : Ljava/lang/String;
    //   42: aload #5
    //   44: invokeinterface Zx : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zefx;
    //   49: astore #6
    //   51: aload_1
    //   52: aload #6
    //   54: invokeinterface ZJ : (Lburp/Zefx;)Lburp/Zm7u;
    //   59: astore #7
    //   61: istore_3
    //   62: aload #7
    //   64: invokeinterface Za : ()Lburp/Zstu;
    //   69: astore #8
    //   71: aload #8
    //   73: ifnonnull -> 84
    //   76: aconst_null
    //   77: goto -> 94
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload #8
    //   86: aload_0
    //   87: getfield Zy : Ljava/lang/String;
    //   90: iconst_0
    //   91: invokestatic ZV : (Lburp/Zstu;Ljava/lang/String;Z)Ljava/lang/String;
    //   94: astore #9
    //   96: aload #9
    //   98: ifnull -> 123
    //   101: aload #9
    //   103: invokevirtual length : ()I
    //   106: aload_0
    //   107: getfield Zy : Ljava/lang/String;
    //   110: invokevirtual length : ()I
    //   113: if_icmpge -> 139
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_0
    //   124: getfield Zx : Lburp/Ztb2;
    //   127: aload #7
    //   129: invokeinterface Zj : (Lburp/Zm7u;)Lburp/Zefx;
    //   134: areturn
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload #9
    //   141: aload_0
    //   142: getfield Zy : Ljava/lang/String;
    //   145: invokevirtual length : ()I
    //   148: invokevirtual substring : (I)Ljava/lang/String;
    //   151: invokevirtual getBytes : ()[B
    //   154: invokestatic Zt : ([B)[B
    //   157: astore #10
    //   159: aload #10
    //   161: arraylength
    //   162: aload_0
    //   163: invokevirtual Zn : ()I
    //   166: if_icmpge -> 185
    //   169: aload_0
    //   170: getfield Zx : Lburp/Ztb2;
    //   173: aload #7
    //   175: invokeinterface Zj : (Lburp/Zm7u;)Lburp/Zefx;
    //   180: areturn
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: bipush #8
    //   187: newarray byte
    //   189: astore #11
    //   191: aload #10
    //   193: bipush #24
    //   195: aload #11
    //   197: iconst_0
    //   198: bipush #8
    //   200: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   203: aload_0
    //   204: aload #10
    //   206: aload #11
    //   208: invokevirtual Zc : ([B[B)Ljava/lang/String;
    //   211: sipush #32599
    //   214: sipush #-4359
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: swap
    //   221: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   226: astore #12
    //   228: aload #4
    //   230: aload_0
    //   231: getfield Zd : Ljava/lang/String;
    //   234: aload #12
    //   236: invokeinterface Zx : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zefx;
    //   241: astore #13
    //   243: aload #8
    //   245: sipush #32597
    //   248: sipush #18715
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: iconst_0
    //   255: invokestatic ZV : (Lburp/Zstu;Ljava/lang/String;Z)Ljava/lang/String;
    //   258: astore #14
    //   260: aload #14
    //   262: ifnull -> 428
    //   265: new java/util/ArrayList
    //   268: dup
    //   269: invokespecial <init> : ()V
    //   272: astore #15
    //   274: aload #8
    //   276: iconst_0
    //   277: aload #8
    //   279: invokestatic Zi : (Lburp/Zstu;)I
    //   282: aload #15
    //   284: invokestatic ZZ : (Lburp/Zstu;IILjava/util/List;)Ljava/util/List;
    //   287: astore #16
    //   289: aconst_null
    //   290: aload #16
    //   292: aload #15
    //   294: invokestatic Z_ : (Lburp/Zmzk;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    //   297: astore #17
    //   299: aload #17
    //   301: invokeinterface iterator : ()Ljava/util/Iterator;
    //   306: astore #18
    //   308: aload #18
    //   310: invokeinterface hasNext : ()Z
    //   315: ifeq -> 428
    //   318: aload #18
    //   320: invokeinterface next : ()Ljava/lang/Object;
    //   325: checkcast burp/Ztbr
    //   328: astore #19
    //   330: aload #19
    //   332: invokeinterface Zq0 : ()Ljava/lang/String;
    //   337: ifnonnull -> 349
    //   340: ldc ''
    //   342: goto -> 356
    //   345: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   348: athrow
    //   349: aload #19
    //   351: invokeinterface Zq0 : ()Ljava/lang/String;
    //   356: astore #20
    //   358: aload #13
    //   360: aload #19
    //   362: <illegal opcode> test : (Lburp/Ztbr;)Ljava/util/function/Predicate;
    //   367: invokeinterface Z_ : (Ljava/util/function/Predicate;)Z
    //   372: ifeq -> 400
    //   375: aload #13
    //   377: aload #19
    //   379: invokeinterface Zqy : ()Ljava/lang/String;
    //   384: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   387: aload #20
    //   389: invokeinterface ZK : (Ljava/lang/String;Lburp/Zrdu;Ljava/lang/String;)Lburp/Zefx;
    //   394: astore #13
    //   396: iload_3
    //   397: ifeq -> 424
    //   400: aload #13
    //   402: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   405: aload #19
    //   407: invokeinterface Zqy : ()Ljava/lang/String;
    //   412: aload #20
    //   414: invokestatic Z_ : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;)Lburp/Zlou;
    //   417: invokeinterface ZH : (Lburp/Zlou;)Lburp/Zefx;
    //   422: astore #13
    //   424: iload_3
    //   425: ifeq -> 308
    //   428: goto -> 441
    //   431: astore #14
    //   433: aload #14
    //   435: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   438: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   441: aload #13
    //   443: areturn
    // Exception table:
    //   from	to	target	type
    //   71	80	80	java/lang/Exception
    //   96	116	119	java/lang/Exception
    //   101	135	135	java/lang/Exception
    //   159	181	181	java/lang/Exception
    //   243	428	431	java/lang/Exception
    //   330	345	345	java/lang/Exception
  }
  
  abstract int Zn();
  
  abstract String Zc(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws Zxt3;
  
  abstract String Zr();
  
  private static boolean lambda$getAuthenticatedRequest$0(Ztbr paramZtbr, Zlou paramZlou) {
    return (paramZtbr.Zqy().equals(paramZlou.ZA) && paramZlou.Zx == Zrdu.COOKIE);
  }
  
  public static void Zw(int paramInt) {
    Z_ = paramInt;
  }
  
  public static int Zm() {
    return Z_;
  }
  
  public static int ZU() {
    int i = Zm();
    return (i == 0) ? 111 : 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic Zw : (I)V
    //   12: ldc '¶Tö[nÒ(Ð!$Nù±×'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: iconst_5
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #90
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 85
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 25
    //   70: aload #5
    //   72: putstatic burp/Ztqv.a : [Ljava/lang/String;
    //   75: iconst_3
    //   76: anewarray java/lang/String
    //   79: putstatic burp/Ztqv.b : [Ljava/lang/String;
    //   82: goto -> 230
    //   85: dup_x2
    //   86: pop
    //   87: invokevirtual toCharArray : ()[C
    //   90: dup_x1
    //   91: arraylength
    //   92: dup_x2
    //   93: pop
    //   94: iconst_0
    //   95: istore #6
    //   97: dup2_x1
    //   98: pop2
    //   99: dup_x2
    //   100: iconst_1
    //   101: if_icmpgt -> 203
    //   104: dup2
    //   105: swap
    //   106: iload #6
    //   108: dup2_x1
    //   109: caload
    //   110: swap
    //   111: iload #6
    //   113: bipush #7
    //   115: irem
    //   116: tableswitch default -> 185, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 175, 5 -> 180
    //   156: bipush #35
    //   158: goto -> 187
    //   161: bipush #44
    //   163: goto -> 187
    //   166: bipush #110
    //   168: goto -> 187
    //   171: iconst_2
    //   172: goto -> 187
    //   175: bipush #97
    //   177: goto -> 187
    //   180: bipush #41
    //   182: goto -> 187
    //   185: bipush #93
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 108
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 104
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
    //   227: goto -> 42
    //   230: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7F57) & 0xFFFF;
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
      byte b1 = 25;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */