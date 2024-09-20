package burp;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zd2;
import net.portswigger.browser.Zec;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zi;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Ztv;

public class Ztgw {
  private static final Set<String> Zr;
  
  private static final Set<String> ZC;
  
  private final Zev Zw;
  
  private final Zd2 ZP;
  
  private final boolean Zc;
  
  private final Zec ZL;
  
  private final String ZM;
  
  private final Zski ZZ;
  
  private final Zefx Zh;
  
  private final Ztv ZV;
  
  private static String ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Ztgw(Zev paramZev, Zd2 paramZd2, boolean paramBoolean, Zec paramZec, String paramString, Zski paramZski, Zefx paramZefx, Ztv paramZtv) {
    this.Zw = paramZev;
    this.Zc = paramBoolean;
    this.ZL = paramZec;
    this.ZM = paramString;
    this.ZZ = paramZski;
    this.Zh = paramZefx;
    this.ZV = paramZtv;
    this.ZP = paramZd2;
  }
  
  public static Ztgw Zn(Zjt paramZjt, Ztv paramZtv, Zkvk paramZkvk, Zkl6 paramZkl6) throws MalformedURLException, Zxgy, Zxg5 {
    return Zs(paramZjt, paramZtv, paramZkvk, paramZkl6, null);
  }
  
  public static Ztgw Zc(Zjt paramZjt, Zkvk paramZkvk, Zkl6 paramZkl6, Zstu paramZstu) throws MalformedURLException, Zxgy, Zxg5 {
    return Zs(paramZjt, Ztv.ZD(), paramZkvk, paramZkl6, paramZstu);
  }
  
  private static Ztgw Zs(Zjt paramZjt, Ztv paramZtv, Zkvk paramZkvk, Zkl6 paramZkl6, Zstu paramZstu) throws MalformedURLException, Zxgy, Zxg5 {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zm : ()Lnet/portswigger/browser/Zev;
    //   4: astore #5
    //   6: aload_0
    //   7: invokevirtual ZT : ()Lnet/portswigger/browser/Zd2;
    //   10: astore #6
    //   12: aload_0
    //   13: invokevirtual ZR : ()Z
    //   16: istore #7
    //   18: aload_0
    //   19: invokevirtual ZD : ()Lnet/portswigger/browser/Zec;
    //   22: astore #8
    //   24: aload_0
    //   25: invokevirtual Ze : ()Ljava/lang/String;
    //   28: astore #9
    //   30: aload_0
    //   31: invokevirtual ZV : ()Ljava/lang/String;
    //   34: aload_3
    //   35: invokeinterface ZB : ()Lburp/Zbnt;
    //   40: new burp/Zruo
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: invokestatic ZU : (Ljava/lang/String;Lburp/Zbnt;Lburp/Zr_4;)Lburp/Zlit;
    //   50: astore #10
    //   52: aload_0
    //   53: invokevirtual ZJ : ()Ljava/lang/String;
    //   56: ifnull -> 93
    //   59: aload_0
    //   60: invokevirtual ZJ : ()Ljava/lang/String;
    //   63: ldc '#'
    //   65: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   68: ifeq -> 93
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/net/MalformedURLException;)Ljava/net/MalformedURLException;
    //   77: athrow
    //   78: aload_0
    //   79: invokevirtual ZJ : ()Ljava/lang/String;
    //   82: iconst_1
    //   83: invokevirtual substring : (I)Ljava/lang/String;
    //   86: goto -> 97
    //   89: invokestatic a : (Ljava/net/MalformedURLException;)Ljava/net/MalformedURLException;
    //   92: athrow
    //   93: aload_0
    //   94: invokevirtual ZJ : ()Ljava/lang/String;
    //   97: astore #11
    //   99: aload #10
    //   101: aload #11
    //   103: invokestatic ZO : (Lburp/Zlit;Ljava/lang/String;)Lburp/Zski;
    //   106: astore #12
    //   108: aload_0
    //   109: invokevirtual ZC : ()Ljava/lang/String;
    //   112: astore #13
    //   114: aload #13
    //   116: ifnonnull -> 143
    //   119: getstatic burp/Ztgw.Zr : Ljava/util/Set;
    //   122: aload #9
    //   124: invokeinterface contains : (Ljava/lang/Object;)Z
    //   129: ifeq -> 143
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/net/MalformedURLException;)Ljava/net/MalformedURLException;
    //   138: athrow
    //   139: ldc ''
    //   141: astore #13
    //   143: aload #4
    //   145: ifnull -> 157
    //   148: aload #4
    //   150: goto -> 162
    //   153: invokestatic a : (Ljava/net/MalformedURLException;)Ljava/net/MalformedURLException;
    //   156: athrow
    //   157: aload #13
    //   159: invokestatic Zv : (Ljava/lang/String;)Lburp/Zstu;
    //   162: astore #14
    //   164: aload_3
    //   165: invokeinterface Zs : ()Lburp/Zm6e;
    //   170: invokeinterface ZO : ()Lburp/Ztom;
    //   175: aload #9
    //   177: invokestatic Zv : (Ljava/lang/String;)Lburp/Zde;
    //   180: invokevirtual Zj : (Lburp/Zde;)Lburp/Ztom;
    //   183: aload #10
    //   185: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   188: aload #14
    //   190: invokevirtual ZZ : (Lburp/Zstu;)Lburp/Ztom;
    //   193: astore #15
    //   195: aload_2
    //   196: aload_0
    //   197: invokevirtual ZX : ()Ljava/util/List;
    //   200: aload #15
    //   202: invokestatic Zr : (Lburp/Zkvk;Ljava/util/List;Lburp/Ztom;)V
    //   205: aload_3
    //   206: invokeinterface ZH : ()Lburp/Zey9;
    //   211: astore #16
    //   213: aload #10
    //   215: invokeinterface Zdz : ()Lburp/Zmzk;
    //   220: astore #17
    //   222: aload #15
    //   224: invokevirtual Zr : ()Lburp/Zstu;
    //   227: astore #18
    //   229: new burp/Ztgw
    //   232: dup
    //   233: aload #5
    //   235: aload #6
    //   237: iload #7
    //   239: aload #8
    //   241: aload #9
    //   243: aload #12
    //   245: aload #16
    //   247: aload #17
    //   249: aload #18
    //   251: invokevirtual Zu : (Lburp/Zmzk;Lburp/Zstu;)Lburp/Zefx;
    //   254: aload_1
    //   255: invokespecial <init> : (Lnet/portswigger/browser/Zev;Lnet/portswigger/browser/Zd2;ZLnet/portswigger/browser/Zec;Ljava/lang/String;Lburp/Zski;Lburp/Zefx;Lnet/portswigger/browser/Ztv;)V
    //   258: areturn
    // Exception table:
    //   from	to	target	type
    //   52	71	74	java/net/MalformedURLException
    //   59	89	89	java/net/MalformedURLException
    //   114	132	135	java/net/MalformedURLException
    //   143	153	153	java/net/MalformedURLException
  }
  
  public boolean Zq() {
    return this.Zc;
  }
  
  public boolean ZE() {
    return (Zq() && this.ZL == Zec.DOCUMENT);
  }
  
  public boolean Zv(Zev paramZev) {
    return Objects.equals(this.Zw, paramZev);
  }
  
  public Zec Zk() {
    return this.ZL;
  }
  
  public String ZC() {
    return this.ZM;
  }
  
  public Zmzk Zt() {
    return Zd().ZyR().Zdz();
  }
  
  public Zski Zd() {
    return this.ZZ;
  }
  
  public Zefx ZP() {
    return this.Zh;
  }
  
  public Ztv Zh() {
    return this.ZV;
  }
  
  public Zd2 Zu() {
    return this.ZP;
  }
  
  private static void Zr(Zkvk paramZkvk, List<Zc7> paramList, Ztom paramZtom) {
    paramList.stream().filter(Zelw::ZG).filter(Ztgw::lambda$addCustomAndBrowserHeaders$0).filter(Ztgw::lambda$addCustomAndBrowserHeaders$1).forEach(paramZtom::lambda$addCustomAndBrowserHeaders$2);
    if (paramZkvk != null) {
      Objects.requireNonNull(paramZtom);
      paramZkvk.Zc().forEach(paramZtom::Zc);
    } 
    paramZtom.Zc(new Ztnz(a(-6155, -7708), Zi.Zw()));
    paramZtom.Zc(new Ztnz(a(-6149, 376), Zi.Zp()));
    paramZtom.Zc(new Ztnz(a(-6146, -27725), Zi.ZF()));
  }
  
  private static void lambda$addCustomAndBrowserHeaders$2(Ztom paramZtom, Zc7 paramZc7) {
    String str = Zs();
    Ztnz ztnz = new Ztnz(paramZc7.ZRz(), paramZc7.ZRO());
    if (ZC.contains(paramZc7.ZRz().toLowerCase())) {
      paramZtom.Zc(ztnz);
      if (str != null) {
        paramZtom.ZI(ztnz);
        return;
      } 
      return;
    } 
    paramZtom.ZI(ztnz);
  }
  
  private static boolean lambda$addCustomAndBrowserHeaders$1(Zc7 paramZc7) {
    return !paramZc7.ZRz().equalsIgnoreCase(a(-6151, -10082));
  }
  
  private static boolean lambda$addCustomAndBrowserHeaders$0(Zc7 paramZc7) {
    return !paramZc7.ZRz().equalsIgnoreCase(a(-6156, -4754));
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'äp~ÄòåøÍ* \\tu=íßà§\\n\\tÉ»Ïõ¼ð×%Êf.mªòçxötÖûÆ< ÚHMôhu`²F¡ßØ¨3õn`û¬­Lçn'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic ZE : (Ljava/lang/String;)V
    //   22: bipush #6
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #41
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'éÃGk¤ÆÁ!¶×'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #9
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #74
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Ztgw.a : [Ljava/lang/String;
    //   136: bipush #10
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Ztgw.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #11
    //   218: goto -> 248
    //   221: bipush #20
    //   223: goto -> 248
    //   226: bipush #66
    //   228: goto -> 248
    //   231: bipush #118
    //   233: goto -> 248
    //   236: bipush #75
    //   238: goto -> 248
    //   241: bipush #122
    //   243: goto -> 248
    //   246: bipush #62
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: sipush #-6152
    //   307: sipush #-14157
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: sipush #-6148
    //   316: sipush #7859
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: sipush #-6145
    //   325: sipush #-5122
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   334: putstatic burp/Ztgw.Zr : Ljava/util/Set;
    //   337: sipush #-6147
    //   340: sipush #11836
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: sipush #-6150
    //   349: sipush #-19367
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   358: putstatic burp/Ztgw.ZC : Ljava/util/Set;
    //   361: return
  }
  
  public static void ZE(String paramString) {
    ZX = paramString;
  }
  
  public static String Zs() {
    return ZX;
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7FD) & 0xFFFF;
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
      char c = '©';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */