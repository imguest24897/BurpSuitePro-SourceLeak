package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zkb;
import net.portswigger.Zli;

class Zkoc {
  private final Zkq4 Zv;
  
  private final Ze3n ZD;
  
  private final Supplier<Zt8g> Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zkoc(Zkq4 paramZkq4, Ze3n paramZe3n, Supplier<Zt8g> paramSupplier) {
    this.Zv = paramZkq4;
    this.ZD = paramZe3n;
    this.Zt = paramSupplier;
  }
  
  boolean ZW(Zbjw paramZbjw, Zz4_ paramZz4_, Zmvq paramZmvq) {
    Zbqc[] arrayOfZbqc = Zmk.ZK();
    try {
      if (!this.Zv.Zr(Zzu2.WEB_CACHE_POISONING))
        return false; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    int i = Zi(paramZbjw);
    byte b = 0;
    while (b < i) {
      this.ZD.Zr((new Zlv5()).Za(ZS(paramZbjw.Zq(), paramZbjw.ZQ()).Zz().ZV()).ZD(false));
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    Zsex zsex = new Zsex(this.ZD.Zr((new Zlv5()).Za(ZS(Collections.emptyList(), paramZbjw.ZQ()).Zz().ZV()).ZD(false)));
    byte[] arrayOfByte = zsex.ZT().Za().ZiD();
    try {
      if (ZG(paramZbjw, arrayOfByte) || ZN(paramZbjw, zsex)) {
        Zsex zsex1 = new Zsex(this.ZD.Zr((new Zlv5()).Za(ZS(Collections.emptyList(), Zu()).Zz().ZV()).ZD(false)));
        try {
          if (zsex1.ZT().Ze() == this.ZD.ZL().Ze())
            try {
              if (!ZK(zsex1.ZT().Za().ZiD(), paramZbjw.Za())) {
                ZP(paramZbjw, paramZz4_, paramZmvq, zsex);
                return true;
              } 
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private int Zi(Zbjw paramZbjw) {
    try {
      switch (Zgj_.ZV[this.Zv.ZqT().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    int i = 5;
    try {
      if (paramZbjw.Zl(new String[] { a(-27486, 12228), a(-27478, 3624), a(-27487, 6082), a(-27477, -3832), a(-27474, 21633), a(-27476, -6005), a(-27480, -15345), a(-27479, -27136), a(-27485, 15697) }) || paramZbjw.ZY(new String[] { a(-27473, 31583), a(-27475, -1409) }))
        i *= 2; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return i - 1;
  }
  
  private boolean ZG(Zbjw paramZbjw, byte[] paramArrayOfbyte) {
    try {
      if (paramZbjw.ZB())
        try {
          if (ZK(paramArrayOfbyte, paramZbjw.Za()));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZN(Zbjw paramZbjw, Zzud paramZzud) {
    try {
      if (!paramZbjw.ZB())
        try {
          if (paramZzud.ZT().Ze() != this.ZD.ZL().Ze());
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private Zt8g Zu() {
    return this.Zt.get();
  }
  
  private Zxgd ZS(List<String> paramList, Zt8g paramZt8g) {
    return Zm4p.Zz(paramList, paramZt8g);
  }
  
  private void ZP(Zbjw paramZbjw, Zz4_ paramZz4_, Zmvq paramZmvq, Zzud paramZzud) {
    // Byte code:
    //   0: invokestatic ZK : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield ZD : Lburp/Ze3n;
    //   9: invokevirtual ZI : ()Lburp/Zvow;
    //   12: aload #4
    //   14: invokeinterface ZL : ()Lburp/Zefx;
    //   19: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   22: aload #4
    //   24: invokeinterface ZT : ()Lburp/Zb6q;
    //   29: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   32: astore #6
    //   34: aload_1
    //   35: invokevirtual ZB : ()Z
    //   38: ifeq -> 72
    //   41: aload_3
    //   42: getfield ZE : Lburp/Zvow;
    //   45: astore #7
    //   47: aload #6
    //   49: aload_1
    //   50: invokevirtual Zr : ()Lburp/Zb6q;
    //   53: aload_1
    //   54: invokevirtual Za : ()Ljava/lang/String;
    //   57: invokestatic Zp : (Lburp/Zb6q;Ljava/lang/String;)Ljava/util/List;
    //   60: invokevirtual Z_ : (Ljava/util/Collection;)Lburp/Zvow;
    //   63: pop
    //   64: iconst_3
    //   65: istore #8
    //   67: aload #5
    //   69: ifnull -> 182
    //   72: aload_0
    //   73: getfield ZD : Lburp/Ze3n;
    //   76: invokevirtual ZI : ()Lburp/Zvow;
    //   79: aload_0
    //   80: getfield ZD : Lburp/Ze3n;
    //   83: invokevirtual ZA : ()Lburp/Zefx;
    //   86: invokeinterface ZD : ()[B
    //   91: invokevirtual Zp : ([B)Lburp/Zvow;
    //   94: aload_0
    //   95: getfield ZD : Lburp/Ze3n;
    //   98: invokevirtual ZL : ()Lburp/Zb6q;
    //   101: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   104: aload_0
    //   105: getfield ZD : Lburp/Ze3n;
    //   108: invokevirtual ZL : ()Lburp/Zb6q;
    //   111: invokeinterface Za : ()Lburp/Zstu;
    //   116: invokeinterface ZiD : ()[B
    //   121: aload_0
    //   122: getfield ZD : Lburp/Ze3n;
    //   125: invokevirtual ZL : ()Lburp/Zb6q;
    //   128: invokeinterface Ze : ()S
    //   133: invokestatic Zc : ([BS)Lburp/Zl1r;
    //   136: invokevirtual Zf : (Lburp/Zl1r;)Lburp/Zvow;
    //   139: astore #7
    //   141: aload #6
    //   143: aload #4
    //   145: invokeinterface ZT : ()Lburp/Zb6q;
    //   150: invokeinterface Za : ()Lburp/Zstu;
    //   155: invokeinterface ZiD : ()[B
    //   160: aload #4
    //   162: invokeinterface ZT : ()Lburp/Zb6q;
    //   167: invokeinterface Ze : ()S
    //   172: invokestatic Zc : ([BS)Lburp/Zl1r;
    //   175: invokevirtual Zf : (Lburp/Zl1r;)Lburp/Zvow;
    //   178: pop
    //   179: iconst_1
    //   180: istore #8
    //   182: aload_1
    //   183: invokevirtual ZR : ()B
    //   186: ifne -> 197
    //   189: iconst_0
    //   190: goto -> 198
    //   193: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   196: athrow
    //   197: iconst_1
    //   198: istore #9
    //   200: aload_2
    //   201: aload_3
    //   202: getfield Zq : Lburp/Zvow;
    //   205: aload #7
    //   207: aload #6
    //   209: aload_0
    //   210: getfield ZD : Lburp/Ze3n;
    //   213: invokevirtual Za : ()Lburp/Zmzk;
    //   216: iload #9
    //   218: aload_0
    //   219: getfield ZD : Lburp/Ze3n;
    //   222: invokevirtual ZA : ()Lburp/Zefx;
    //   225: invokeinterface ZF : ()Lburp/Zlit;
    //   230: invokeinterface Zd4 : ()[B
    //   235: iload #8
    //   237: aload_1
    //   238: invokevirtual Zq : ()Ljava/util/List;
    //   241: aload_1
    //   242: invokevirtual Za : ()Ljava/lang/String;
    //   245: aload_1
    //   246: invokevirtual ZB : ()Z
    //   249: aload_1
    //   250: invokevirtual Zr : ()Lburp/Zb6q;
    //   253: invokeinterface Ze : ()S
    //   258: invokestatic ZY : (Lburp/Zvow;Lburp/Zvow;Lburp/Zvow;Lburp/Zmzk;B[BBLjava/util/List;Ljava/lang/String;ZS)Lburp/Zsqx;
    //   261: invokeinterface Zz : (Lburp/Zsqx;)V
    //   266: return
    // Exception table:
    //   from	to	target	type
    //   182	193	193	java/lang/MatchException
  }
  
  private static boolean ZK(byte[] paramArrayOfbyte, String paramString) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (Zli.ZL(paramArrayOfbyte, Zkb.Zy(paramString), false) >= 0);
  }
  
  private static List<Zl1r> Zp(Zb6q paramZb6q, String paramString) {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Zl8v.ZB(paramString, paramZb6q.Za().ZiD(), arrayList, false);
    return arrayList;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qi1ªªÏ»9À}h®É&mJ¨GÙÚRImá\\ti1]¬ãËtÇð´\\f¨°@}Û^×ró{Æ`±é|<®YyYkI'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #43
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '¨ì9M'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #32
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zkoc.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkoc.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #101
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #77
    //   224: goto -> 244
    //   227: bipush #92
    //   229: goto -> 244
    //   232: bipush #55
    //   234: goto -> 244
    //   237: bipush #108
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
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF94AB) & 0xFFFF;
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
      byte b1 = 83;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkoc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */