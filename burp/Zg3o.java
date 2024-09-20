package burp;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.BiFunction;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

public class Zg3o {
  private final Zmhe Z_;
  
  private final Ze3n Zx;
  
  private final Zxs7 Zr;
  
  private final Zbfi Zg;
  
  private final Zbnt Zq;
  
  private final boolean ZD;
  
  private boolean ZW = false;
  
  private boolean ZG;
  
  private Ze7l Za;
  
  private static Zbqc[] Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg3o(Zmhe paramZmhe, Zbfi paramZbfi, Ze3n paramZe3n, Zxs7 paramZxs7, Zbnt paramZbnt, boolean paramBoolean) {
    this.Z_ = paramZmhe;
    this.Zx = paramZe3n;
    this.Zr = paramZxs7;
    this.Zq = paramZbnt;
    this.Zg = paramZbfi;
    Zbqc[] arrayOfZbqc = ZN();
    this.ZD = paramBoolean;
    this.Za = new Ze7l(paramZxs7.ZI(), new Zsy());
    if (Zbqc.Zwu() == null)
      ZY(new Zbqc[3]); 
  }
  
  public Zsqx<Zrdb> Zh() {
    Zgd_ zgd_ = new Zgd_();
    Optional<Zrwz> optional = zgd_.Zj((BiFunction<Zxcs, Zxcs, Zsb8>[])new BiFunction[] { this::Z_, this::lambda$doCheck$0, this::lambda$doCheck$1, this::lambda$doCheck$2 });
    Zbqc[] arrayOfZbqc = ZN();
    if (optional.isEmpty())
      return null; 
    Zrwz zrwz = optional.get();
    Zsqx<Zrdb> zsqx1 = Zq();
    if (zsqx1 != null)
      return zsqx1; 
    Zkvd zkvd = zrwz.ZR.Zo(zrwz.ZB.ZE, zrwz.ZU.ZE);
    Zsqx<Zrdb> zsqx2 = Zc(zrwz.ZR, zrwz.ZU);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
    return (zsqx2 != null) ? zsqx2 : Zr(zkvd, (byte)1, zrwz.ZB, zrwz.ZU);
  }
  
  private Zsb8 ZS(Zxcs paramZxcs1, Zxcs paramZxcs2) {
    String str1 = this.Zr.ZI();
    if (!str1.contains("/"))
      return null; 
    String str2 = str1.substring(0, str1.lastIndexOf("/"));
    if (str2.isEmpty())
      return null; 
    String str3 = Zkb.ZG(this.Zx.ZA().ZF().Zd4());
    String str4 = str3.substring(0, str3.lastIndexOf("/"));
    if (!str4.endsWith(str2))
      return null; 
    String str5 = str3.substring(str3.lastIndexOf('/'));
    this.Za = new Ze7l(str2 + str2, new Zsy());
    this.ZG = true;
    return Z_(paramZxcs1, paramZxcs2);
  }
  
  private Zsb8 Zr(Zxcs paramZxcs1, Zxcs paramZxcs2) {
    return ZG("", paramZxcs1, paramZxcs2);
  }
  
  private Zsb8 ZG(String paramString, Zxcs paramZxcs1, Zxcs paramZxcs2) {
    String str1 = Zkb.ZG(this.Zx.ZA().ZF().Zd4());
    String str2 = paramString + paramString;
    if (Zsw8.ZP(str2) || str2.equals(this.Zr.ZI()))
      return null; 
    this.Za = new Ze7l(str2, new Zsy());
    this.ZG = true;
    return Z_(paramZxcs1, paramZxcs2);
  }
  
  private Zsb8 Z_(Zxcs paramZxcs1, Zxcs paramZxcs2) {
    Zesc zesc = new Zesc(this, paramZxcs1, paramZxcs2);
    Zxzf zxzf = new Zxzf(this.Zx.ZA().ZF(), this.Zx.ZL().Za(), zesc, this.Zq);
    return !zxzf.Ze(this.Zg.ZqM()) ? null : zxzf.ZX();
  }
  
  private Zsqx<Zrdb> Zq() {
    EnumSet<Zzgt> enumSet = (new Zma2(this.Zx.ZA(), this.Zx.Zp())).Zb();
    if (enumSet.contains(Zzgt.IIS)) {
      Zsqx<Zrdb> zsqx = ZY(a(4450, -26369), new Zrzx(this.Zx.ZL().Za(), new String[] { a(4454, 21505) }));
      if (zsqx != null)
        return zsqx; 
    } 
    if (enumSet.contains(Zzgt.JAVAEE)) {
      Zsqx<Zrdb> zsqx = ZY(a(4451, 15107), new Zrzx(this.Zx.ZL().Za(), new String[] { a(4452, 7409) }));
      if (zsqx != null)
        return zsqx; 
    } 
    return enumSet.contains(Zzgt.APACHE) ? ZY(a(4449, -28922), new Zrzx(this.Zx.ZL().Za(), new String[] { a(4448, 10783), a(4453, 9924), a(4455, 7941) })) : null;
  }
  
  private Zsqx<Zrdb> Zc(Zsb8 paramZsb8, Zxcs paramZxcs) {
    // Byte code:
    //   0: new burp/Zxcs
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZN : ()[Lburp/Zbqc;
    //   12: iconst_0
    //   13: istore #5
    //   15: astore_3
    //   16: iload #5
    //   18: aload_0
    //   19: getfield Zg : Lburp/Zbfi;
    //   22: invokeinterface ZqM : ()Lburp/Zeko;
    //   27: invokestatic ZM : (Lburp/Zeko;)I
    //   30: if_icmpge -> 97
    //   33: aload_0
    //   34: aload #4
    //   36: aload_0
    //   37: getfield Za : Lburp/Ze7l;
    //   40: invokevirtual ZP : ()[B
    //   43: invokevirtual Zb : (Lburp/Zxcs;[B)Lburp/Zzud;
    //   46: astore #6
    //   48: aload_0
    //   49: getfield ZG : Z
    //   52: ifeq -> 70
    //   55: aload_1
    //   56: aload #6
    //   58: invokeinterface Zl : ()Lburp/Zstu;
    //   63: invokevirtual Zr : (Lburp/Zstu;)V
    //   66: aload_3
    //   67: ifnonnull -> 81
    //   70: aload_1
    //   71: aload #6
    //   73: invokeinterface Zl : ()Lburp/Zstu;
    //   78: invokevirtual ZQ : (Lburp/Zstu;)V
    //   81: aload_1
    //   82: invokevirtual Zw : ()Z
    //   85: ifne -> 90
    //   88: aconst_null
    //   89: areturn
    //   90: iinc #5, 1
    //   93: aload_3
    //   94: ifnonnull -> 16
    //   97: aload_0
    //   98: aload_1
    //   99: aload #4
    //   101: getfield ZE : Lburp/Zstu;
    //   104: aload_2
    //   105: getfield ZE : Lburp/Zstu;
    //   108: invokevirtual Zo : (Lburp/Zstu;Lburp/Zstu;)Lburp/Zkvd;
    //   111: iconst_2
    //   112: aload #4
    //   114: aload_2
    //   115: invokevirtual Zr : (Lburp/Zkvd;BLburp/Zxcs;Lburp/Zxcs;)Lburp/Zsqx;
    //   118: areturn
  }
  
  private Zzud Zb(Zxcs paramZxcs, byte[] paramArrayOfbyte) {
    Zlvf zlvf = this.Z_.ZK(Zri7.ZJ(new Zrrb(paramArrayOfbyte, (byte)0)), Zlp5.Zc().Zd(false));
    if (paramZxcs.ZC == null) {
      paramZxcs.ZC = paramArrayOfbyte;
      paramZxcs.Zr = zlvf.ZY();
      paramZxcs.ZE = zlvf.ZM().Zl();
    } 
    return zlvf.ZM();
  }
  
  private Zsqx<Zrdb> Zr(Zkvd paramZkvd, byte paramByte, Zxcs paramZxcs1, Zxcs paramZxcs2) {
    Zvow zvow1 = this.Zx.ZI().Zp(paramZxcs1.Zr.ZE()).ZK(paramZxcs1.Zr.ZO()).Zu(paramZxcs1.ZE).Z_(paramZkvd.ZF());
    Zvow zvow2 = this.Zx.ZI().Zp(paramZxcs2.Zr.ZE()).ZK(paramZxcs2.Zr.ZO()).Zu(paramZxcs2.ZE).Z_(paramZkvd.ZR());
    return Zmvl.ZY(this.Zx.Za(), this.Zx.ZN(), paramZkvd.Zt() ? paramByte : 1, zvow1, zvow2, this.Zr, paramZxcs1.ZC, paramZxcs2.ZC);
  }
  
  private Zsqx<Zrdb> ZY(String paramString, Zrzx paramZrzx) {
    Zsqx<Zrdb> zsqx = null;
    Ze1d ze1d = new Ze1d(Zkb.ZG(this.Zx.ZA().ZF().Zd4()), this.Zr.ZI(), paramString);
    for (String str : ze1d) {
      Zlvf zlvf = this.Z_.ZK(Zri7.ZJ(new Zrrb(Zkb.Zy(str), (byte)0)), Zlp5.Zc().Zd(false));
      Zzud zzud = zlvf.ZM();
      int[] arrayOfInt = paramZrzx.Zs(zzud);
      if (arrayOfInt != null) {
        String str1 = str + "X";
        Zlvf zlvf1 = this.Z_.ZK(Zri7.ZJ(new Zrrb(Zkb.Zy(str1), (byte)0)), Zlp5.Zc().Zd(false));
        if (paramZrzx.Zs(zlvf1.ZM()) == null) {
          this.ZW = true;
          zsqx = Zv(zzud, str, zlvf.ZY(), arrayOfInt, paramString);
          break;
        } 
      } 
    } 
    return zsqx;
  }
  
  private Zsqx<Zrdb> Zv(Zzud paramZzud, String paramString1, Zs2i paramZs2i, int[] paramArrayOfint, String paramString2) {
    Zvow zvow = this.Zx.ZI().Zp(paramZs2i.ZE()).ZK(paramZs2i.ZO()).Zu(paramZzud.Zl()).Zf(Zrlp.Zj(paramArrayOfint[0], paramArrayOfint[1]));
    return Zmvl.Zc(this.Zx.Za(), this.Zx.ZN(), zvow, this.Zr, Zkb.Zy(paramString1), paramString2);
  }
  
  public boolean Zm() {
    return this.ZW;
  }
  
  private Zsb8 lambda$doCheck$2(Zxcs paramZxcs1, Zxcs paramZxcs2) {
    return this.ZD ? ZS(paramZxcs1, paramZxcs2) : null;
  }
  
  private Zsb8 lambda$doCheck$1(Zxcs paramZxcs1, Zxcs paramZxcs2) {
    return this.ZD ? ZG("/", paramZxcs1, paramZxcs2) : null;
  }
  
  private Zsb8 lambda$doCheck$0(Zxcs paramZxcs1, Zxcs paramZxcs2) {
    return this.ZD ? Zr(paramZxcs1, paramZxcs2) : null;
  }
  
  public static void ZY(Zbqc[] paramArrayOfZbqc) {
    Zo = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZN() {
    return Zo;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_2
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: ldc 'CÒ]å®E\\bw)UtaÐKÉi¯«è6|2k9æE\\nÀ/®DÆ%´9\\nk\\t´öú¤n\\bÒ´í+$'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic ZY : ([Lburp/Zbqc;)V
    //   25: bipush #9
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #7
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'Q6ñæM`X )À \\f1ÏaºmÀÙ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #11
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #25
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zg3o.a : [Ljava/lang/String;
    //   139: bipush #8
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zg3o.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 267
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 239, 5 -> 244
    //   220: bipush #87
    //   222: goto -> 251
    //   225: bipush #45
    //   227: goto -> 251
    //   230: bipush #100
    //   232: goto -> 251
    //   235: iconst_4
    //   236: goto -> 251
    //   239: bipush #53
    //   241: goto -> 251
    //   244: bipush #78
    //   246: goto -> 251
    //   249: bipush #76
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 173
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 169
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1161) & 0xFFFF;
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
      byte b1 = 64;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg3o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */