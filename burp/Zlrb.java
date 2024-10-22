package burp;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zcg;
import net.portswigger.Zk_;
import net.portswigger.Zlo;
import net.portswigger.Zrm1;
import net.portswigger.Zrme;
import net.portswigger.Zrzh;
import net.portswigger.Zsh;

public class Zlrb implements Zzxq {
  public final Zt90 Zn;
  
  public final Zlnv ZT;
  
  private final Set<Zlo> Zu = EnumSet.of(Zlo.UNLICENSED, Zlo.LICENSE_EXPIRED, Zlo.WRONG_EXECUTION_MODE);
  
  private final Zrzh Za;
  
  private volatile Zlo ZV;
  
  private volatile String ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlrb(Zt90 paramZt90, Zlnv paramZlnv) {
    this.Zn = paramZt90;
    this.ZT = paramZlnv;
    this.Za = new Zrzh(Zkez.Zn(paramZlnv, Zlo.UNLICENSED, null), null);
    paramZt90.Zf(this, Zxc8.REST_API);
  }
  
  public synchronized Zrzh ZW() {
    return this.Za;
  }
  
  public synchronized void Zv(Ztph paramZtph) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getfield ZB : Lnet/portswigger/Zlo;
    //   5: putfield ZV : Lnet/portswigger/Zlo;
    //   8: invokestatic ZR : ()[Lburp/Zbqc;
    //   11: aload_0
    //   12: aload_1
    //   13: getfield Zt : Ljava/lang/String;
    //   16: putfield ZI : Ljava/lang/String;
    //   19: astore_2
    //   20: aload_1
    //   21: getfield ZB : Lnet/portswigger/Zlo;
    //   24: getstatic net/portswigger/Zlo.LICENSE_ACTIVATED : Lnet/portswigger/Zlo;
    //   27: if_acmpne -> 46
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual Zo : (Lburp/Ztph;)V
    //   35: aload_2
    //   36: ifnonnull -> 105
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_1
    //   47: getfield ZB : Lnet/portswigger/Zlo;
    //   50: getstatic net/portswigger/Zlo.LICENSE_NOT_REQUIRED : Lnet/portswigger/Zlo;
    //   53: if_acmpne -> 93
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: getfield Za : Lnet/portswigger/Zrzh;
    //   67: aload_0
    //   68: getfield ZT : Lburp/Zlnv;
    //   71: aload_1
    //   72: getfield ZB : Lnet/portswigger/Zlo;
    //   75: aconst_null
    //   76: invokestatic Zn : (Lburp/Zlnv;Lnet/portswigger/Zlo;Lburp/Zkvo;)Lnet/portswigger/Zg2;
    //   79: putfield ZA : Lnet/portswigger/Zg2;
    //   82: aload_2
    //   83: ifnonnull -> 105
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_0
    //   94: aload_1
    //   95: invokevirtual ZY : (Lburp/Ztph;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: return
    // Exception table:
    //   from	to	target	type
    //   20	39	42	net/portswigger/Zrme
    //   30	56	59	net/portswigger/Zrme
    //   46	86	89	net/portswigger/Zrme
    //   63	98	101	net/portswigger/Zrme
  }
  
  public Zsh ZX() {
    try {
      if (this.Zu.contains(this.ZV))
        throw new Zrme(Integer.valueOf(1005), a(31767, -21561)); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    String str = this.Zn.Zz(Zxc8.REST_API);
    try {
      if (this.ZV == Zlo.LICENSE_ACTIVATION_ERROR)
        throw new Zrm1(Integer.valueOf(1006), this.ZI); 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    return new Zsh(str, "", Integer.valueOf(0), "", "", "");
  }
  
  public Zcg ZE(Zsh paramZsh) {
    String str;
    Zbqc[] arrayOfZbqc = Zkez.ZR();
    try {
      try {
        if (paramZsh.ZK != null) {
          try {
            if (paramZsh.Za == null)
              throw new Zrme(Integer.valueOf(1001), a(31766, 15299)); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (paramZsh.Zl != null)
              try {
                if (paramZsh.Zn == null)
                  throw new Zrme(Integer.valueOf(1001), a(31762, 24621)); 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          String str1 = this.Zn.Zs(paramZsh.Zc, paramZsh.ZK, paramZsh.Za.intValue(), paramZsh.Zl, paramZsh.Zn);
          if (arrayOfZbqc == null)
            str1 = this.Zn.Zm(paramZsh.Zc); 
          return new Zcg(str1);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      str = this.Zn.Zm(paramZsh.Zc);
    } catch (IOException iOException) {
      try {
        Zah.Zl(iOException, Zk_.IGNORED);
        if (iOException.getMessage().contains(a(31761, 18023)))
          throw new Zrm1(Integer.valueOf(1010), a(31764, -2660)); 
      } catch (IOException iOException1) {
        throw a(null);
      } 
      throw new Zrm1(Integer.valueOf(1009), a(31765, 16764));
    } 
    return new Zcg(str);
  }
  
  public void ZF(Zcg paramZcg) {
    Zlo zlo = this.Zn.ZF(paramZcg.ZX, Zxc8.REST_API);
    try {
      switch (Zrm0.Zr[zlo.ordinal()]) {
        case 1:
        case 3:
          return;
        case 7:
          throw new Zrme(Integer.valueOf(1007), this.Zn.ZV());
      } 
    } catch (Zrme zrme) {
      throw a(null);
    } 
    throw new Zrm1(Integer.valueOf(1008), a(31763, 23680));
  }
  
  private void ZY(Ztph paramZtph) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Za : Lnet/portswigger/Zrzh;
    //   4: aload_1
    //   5: getfield ZB : Lnet/portswigger/Zlo;
    //   8: getstatic net/portswigger/Zlo.UNLICENSED : Lnet/portswigger/Zlo;
    //   11: if_acmpeq -> 31
    //   14: aload_1
    //   15: getfield ZB : Lnet/portswigger/Zlo;
    //   18: getstatic net/portswigger/Zlo.LICENSE_EXPIRED : Lnet/portswigger/Zlo;
    //   21: if_acmpne -> 39
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aconst_null
    //   32: goto -> 54
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_0
    //   40: getfield ZT : Lburp/Zlnv;
    //   43: aload_1
    //   44: getfield ZB : Lnet/portswigger/Zlo;
    //   47: aload_1
    //   48: getfield Zd : Lburp/Zkvo;
    //   51: invokestatic Zn : (Lburp/Zlnv;Lnet/portswigger/Zlo;Lburp/Zkvo;)Lnet/portswigger/Zg2;
    //   54: putfield Zq : Lnet/portswigger/Zg2;
    //   57: return
    // Exception table:
    //   from	to	target	type
    //   0	24	27	net/portswigger/Zrme
    //   14	35	35	net/portswigger/Zrme
  }
  
  void Zo(Ztph paramZtph) {
    this.Za.ZA = Zkez.Zn(this.ZT, paramZtph.ZB, paramZtph.Zd);
    this.Za.Zq = null;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'N@ÊÂp´¼=Óª¦üY´8RÞ¦Y\\b²,Fëq7ÕhQ¹kM¡7Õ®q _}\\r½3·ÒÊ$ë{A­iG²¸Eõmþ¯f%4H/¹Y:9áÓ ¾ðó]âöD>eÏZg2Ö´tèîm\\tåÐ+.Çtí@/ÙÿS\\tx³Àõ¦"Û%ùç£AÞ®;84d/å'ÁçÜ5¿Æ\\f¸p½?[E¬$8J>ÐñvÄ>áiéLA\\rZÕWî#f3áJµ3ç~(a #^÷p'Hp s. BµÖ¬Ô6C¯eÉÛÈ*xN¾b¿®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc 'ï`Ó[µûÓ!ÏÄÂwºeä2di¼½[ö õ}ýô\\tý"Û÷1Iµ\\fRU¯%'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #48
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #107
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
    //   129: putstatic burp/Zlrb.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlrb.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #18
    //   214: goto -> 243
    //   217: iconst_3
    //   218: goto -> 243
    //   221: bipush #78
    //   223: goto -> 243
    //   226: bipush #63
    //   228: goto -> 243
    //   231: bipush #100
    //   233: goto -> 243
    //   236: bipush #56
    //   238: goto -> 243
    //   241: bipush #102
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7C17) & 0xFFFF;
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
      char c = ' ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlrb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */