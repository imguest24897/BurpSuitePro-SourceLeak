package burp;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrgp implements Zgbd {
  private final Supplier<Zrtw> ZP;
  
  private final Supplier<Zbr> Z_;
  
  private final Supplier<Zb2t> ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrgp(Supplier<Zrtw> paramSupplier, Supplier<Zbr> paramSupplier1, Supplier<Zb2t> paramSupplier2) {
    this.ZP = paramSupplier;
    this.Z_ = paramSupplier1;
    this.ZL = paramSupplier2;
  }
  
  public boolean Zf() {
    try {
      if (((Zrtw)this.ZP.get()).Zsl())
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zbr zbr = this.Z_.get();
    try {
      if (zbr != null)
        try {
          if (!zbr.Zd()) {
            Optional<Integer> optional = ZO(zbr);
            try {
              if (optional.isEmpty())
                return false; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            int i = ((Integer)optional.get()).intValue();
            try {
              if (i == -1)
                return true; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            int j = Zg(zbr);
            try {
            
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return (i != j);
          } 
          return false;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zw() {
    // Byte code:
    //   0: invokestatic Zr : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Z_ : Ljava/util/function/Supplier;
    //   8: invokeinterface get : ()Ljava/lang/Object;
    //   13: checkcast burp/Zbr
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull -> 35
    //   21: aload_2
    //   22: invokevirtual Zd : ()Z
    //   25: ifeq -> 41
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   34: athrow
    //   35: iconst_0
    //   36: ireturn
    //   37: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   40: athrow
    //   41: aload_2
    //   42: invokevirtual Zx : ()Lburp/Zkyt;
    //   45: getstatic burp/Zkyt.UNKNOWN : Lburp/Zkyt;
    //   48: if_acmpeq -> 68
    //   51: aload_2
    //   52: invokevirtual Zx : ()Lburp/Zkyt;
    //   55: getstatic burp/Zkyt.AUTO : Lburp/Zkyt;
    //   58: if_acmpne -> 74
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   67: athrow
    //   68: iconst_0
    //   69: ireturn
    //   70: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   73: athrow
    //   74: aload_2
    //   75: sipush #-2523
    //   78: sipush #-10108
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokestatic Z_ : (Lburp/Zbr;Ljava/lang/String;)Ljava/util/Optional;
    //   87: astore_3
    //   88: aload_3
    //   89: invokevirtual isEmpty : ()Z
    //   92: ifeq -> 101
    //   95: iconst_0
    //   96: ireturn
    //   97: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   100: athrow
    //   101: aload_3
    //   102: invokevirtual get : ()Ljava/lang/Object;
    //   105: checkcast java/lang/String
    //   108: astore #4
    //   110: aload #4
    //   112: invokevirtual isEmpty : ()Z
    //   115: ifeq -> 124
    //   118: iconst_1
    //   119: ireturn
    //   120: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   123: athrow
    //   124: aload_2
    //   125: invokevirtual Zx : ()Lburp/Zkyt;
    //   128: getstatic burp/Zkyt.HTTP1 : Lburp/Zkyt;
    //   131: if_acmpne -> 349
    //   134: aload_0
    //   135: getfield ZP : Ljava/util/function/Supplier;
    //   138: invokeinterface get : ()Ljava/lang/Object;
    //   143: checkcast burp/Zrtw
    //   146: invokeinterface Zuq : ()Z
    //   151: istore #5
    //   153: aload #4
    //   155: getstatic java/util/Locale.UK : Ljava/util/Locale;
    //   158: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   161: invokevirtual trim : ()Ljava/lang/String;
    //   164: astore #6
    //   166: iconst_m1
    //   167: istore #7
    //   169: aload #6
    //   171: invokevirtual hashCode : ()I
    //   174: lookupswitch default -> 258, 94756344 -> 200, 211181701 -> 231
    //   200: aload #6
    //   202: sipush #-2524
    //   205: sipush #16011
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: invokevirtual equals : (Ljava/lang/Object;)Z
    //   214: ifeq -> 258
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   223: athrow
    //   224: iconst_0
    //   225: istore #7
    //   227: aload_1
    //   228: ifnull -> 258
    //   231: aload #6
    //   233: sipush #-2522
    //   236: sipush #32242
    //   239: invokestatic a : (II)Ljava/lang/String;
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: ifeq -> 258
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   254: athrow
    //   255: iconst_1
    //   256: istore #7
    //   258: iload #7
    //   260: lookupswitch default -> 347, 0 -> 288, 1 -> 332
    //   288: iload #5
    //   290: ifne -> 322
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   299: athrow
    //   300: aload_0
    //   301: getfield ZL : Ljava/util/function/Supplier;
    //   304: invokeinterface get : ()Ljava/lang/Object;
    //   309: getstatic burp/Zb2t.SEND_ON_SINGLE_CONNECTION : Lburp/Zb2t;
    //   312: if_acmpne -> 330
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   321: athrow
    //   322: iconst_1
    //   323: goto -> 331
    //   326: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   329: athrow
    //   330: iconst_0
    //   331: ireturn
    //   332: iload #5
    //   334: ifne -> 345
    //   337: iconst_1
    //   338: goto -> 346
    //   341: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   344: athrow
    //   345: iconst_0
    //   346: ireturn
    //   347: iconst_1
    //   348: ireturn
    //   349: aload_2
    //   350: invokevirtual Zx : ()Lburp/Zkyt;
    //   353: getstatic burp/Zkyt.HTTP2 : Lburp/Zkyt;
    //   356: if_acmpne -> 367
    //   359: iconst_1
    //   360: goto -> 368
    //   363: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   366: athrow
    //   367: iconst_0
    //   368: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   371: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   374: aload_0
    //   375: getfield ZP : Ljava/util/function/Supplier;
    //   378: invokeinterface get : ()Ljava/lang/Object;
    //   383: checkcast burp/Zrtw
    //   386: invokeinterface Zs2 : ()Z
    //   391: ifne -> 402
    //   394: iconst_1
    //   395: goto -> 403
    //   398: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   401: athrow
    //   402: iconst_0
    //   403: ireturn
    // Exception table:
    //   from	to	target	type
    //   17	28	31	java/lang/NumberFormatException
    //   21	37	37	java/lang/NumberFormatException
    //   41	61	64	java/lang/NumberFormatException
    //   51	70	70	java/lang/NumberFormatException
    //   88	97	97	java/lang/NumberFormatException
    //   110	120	120	java/lang/NumberFormatException
    //   169	217	220	java/lang/NumberFormatException
    //   227	248	251	java/lang/NumberFormatException
    //   258	293	296	java/lang/NumberFormatException
    //   288	315	318	java/lang/NumberFormatException
    //   300	326	326	java/lang/NumberFormatException
    //   332	341	341	java/lang/NumberFormatException
    //   349	363	363	java/lang/NumberFormatException
    //   368	398	398	java/lang/NumberFormatException
  }
  
  private static Optional<Integer> ZO(Zbr paramZbr) {
    Optional<String> optional = Z_(paramZbr, a(-2521, 29701));
    try {
      if (optional.isEmpty())
        return Optional.empty(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      return Optional.of(Integer.valueOf(Integer.parseInt(optional.get())));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.COMMON_RUNTIME_FAILURE);
      return Optional.of(Integer.valueOf(-1));
    } 
  }
  
  private static Optional<String> Z_(Zbr paramZbr, String paramString) {
    String str = ZG(paramZbr, paramString);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (str == null) ? Optional.<String>empty() : Optional.<String>of(str.substring(paramString.length()).trim());
  }
  
  private static String ZG(Zbr paramZbr, String paramString) {
    List<String> list = ZM(paramZbr);
    return Zgyj.ZZ(list, paramString, false);
  }
  
  private static int Zg(Zbr paramZbr) {
    Zstu zstu = paramZbr.Zr();
    try {
      if (paramZbr.Zu()) {
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return (zstu == null) ? 0 : zstu.Zpu();
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int i = Zgyj.Zg(zstu);
    return zstu.Zpu() - i;
  }
  
  private static List<String> ZM(Zbr paramZbr) {
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramZbr.Zz() ? Zgyj.ZI(paramZbr.Zr()) : (List<String>)paramZbr.ZO().stream().map(Zk94::ZZ1).collect(Collectors.toList());
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '2Ó&sä­áTáôA'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #11
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #45
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
    //   67: ldc 'È8Lïi:ÎYá'\\n?ÄàyÖ55eã'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #15
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #114
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zrgp.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zrgp.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #8
    //   214: goto -> 244
    //   217: bipush #106
    //   219: goto -> 244
    //   222: bipush #89
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #50
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF625) & 0xFFFF;
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
      char c = 'Ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */