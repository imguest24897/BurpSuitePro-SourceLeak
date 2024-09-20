package net.portswigger.devtools.client.impl.connection;

import burp.Zbqc;
import burp.Zgrn;
import burp.Zlnb;
import burp.Zrij;
import burp.Ztos;
import burp.Zxr8;
import burp.Zz1m;
import burp.Zz_h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.portswigger.Za1;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zny;
import net.portswigger.Zrmv;
import net.portswigger.Ztv;
import net.portswigger.Zv_;
import net.portswigger.Zvb;
import net.portswigger.Zzs;
import net.portswigger.Zzw;
import net.portswigger.browser.Zb;
import net.portswigger.browser.Zds;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zb;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.client.impl.Zm_;
import net.portswigger.devtools.client.impl.Zmb;
import net.portswigger.devtools.client.impl.Zmf;
import net.portswigger.devtools.client.impl.Zmi;
import net.portswigger.devtools.client.impl.Zxi;

public class Zs implements Zl, Zzw {
  private final AtomicReference<Zh> ZC = new AtomicReference<>(Zh.DISCONNECTED);
  
  private final Ztos<Zu> Zr = new Ztos(Zu.Z_());
  
  private final Zmi ZM = new Zmi(Zmb.ZJ());
  
  private final Zo Zb;
  
  private final ByteArrayOutputStream Zl;
  
  private final Za1 Zt;
  
  private final Zxi ZS;
  
  private volatile URI ZY;
  
  private volatile Zv_ Zd;
  
  private static String Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs() {
    String str = ZA();
    try {
      this.ZS = Zxi.ZC();
      this.Zb = new Zw(this.ZS, this.ZM, (Zz1m<Zu>)this.Zr);
      this.Zl = new Zb(this);
      this.Zt = (Za1)new Ztv(this.Zl);
      if (str == null)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public URI Zf() {
    try {
      if (!ZR())
        throw new IllegalStateException(a(5918, 25322)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.ZY;
  }
  
  public void Ze(URI paramURI, String paramString) throws Zi {
    try {
      if (this.ZC.getAndSet(Zh.CONNECTED) != Zh.DISCONNECTED)
        return; 
    } catch (Zi zi) {
      throw a(null);
    } 
    Zb.Zp(Zds.INFO, a(5908, 17692), new Object[] { paramURI });
    this.ZY = paramURI;
    this.Zd = ZD(paramURI.toString(), paramString);
  }
  
  public boolean ZR() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZC.get() == Zh.CONNECTED);
  }
  
  public CompletableFuture<Zf<?>> ZP(Zm_ paramZm_) {
    try {
      if (!ZR())
        return CompletableFuture.failedFuture((Throwable)new Zp(a(5913, 5718))); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zmf zmf = this.ZM.Zw(paramZm_);
    synchronized (this.Zl) {
      this.Zl.reset();
      this.Zb.Zx(zmf, this.Zt);
      try {
        this.Zt.Zr();
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.RETHROWN);
        throw new RuntimeException(iOException);
      } 
      try {
        try {
          if (Zb.Zi(Zds.DEBUG))
            Zb.Zp(Zds.DEBUG, a(5915, 10779), new Object[] { Zny.ZL(Arrays.copyOf(this.Zl.toByteArray(), this.Zl.size())) }); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.Zd.Zv(this.Zl.toByteArray(), this.Zl.size(), false);
        return (CompletableFuture<Zf<?>>)zmf.ZU().Zd();
      } catch (Zrmv zrmv) {
        Zah.Zl((Throwable)zrmv, Zk_.PROCESSED_LATER);
        this.ZM.Z_(zmf);
        return CompletableFuture.failedFuture((Throwable)new Zp(a(5912, -9361)));
      } catch (Zzs zzs) {
        try {
          Zah.Zl((Throwable)zzs, Zk_.PROCESSED_LATER);
          this.ZM.Z_(zmf);
          if (Zb.Zi(Zds.WARNING))
            Zb.Zp(Zds.WARNING, a(5891, 25400), new Object[] { Zny.ZL(Arrays.copyOf(this.Zl.toByteArray(), Math.min(this.Zl.size(), 200))) }); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return CompletableFuture.failedFuture((Throwable)new Zb(a(5890, 7512).formatted(new Object[] { Integer.valueOf(this.Zl.size()) })));
      } 
    } 
  }
  
  public void ZR(Predicate<Zmf> paramPredicate) {
    Collection collection = this.ZM.Zl(paramPredicate);
    collection.forEach(this::lambda$cancelWhere$0);
  }
  
  public <T> Zgrn Zo(Zlnb<T> paramZlnb, Consumer<Zxr8<T>> paramConsumer, Executor paramExecutor, Zrij paramZrij) throws Zz_h {
    return this.Zr.Zo(paramZlnb, paramConsumer, paramExecutor, paramZrij);
  }
  
  public void ZQ(String paramString) {
    try {
      Zb.Zp(Zds.DEBUG, a(5910, -13420), new Object[] { paramString });
      if (!ZR())
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zb.Zn(paramString);
  }
  
  public void ZM(byte[] paramArrayOfbyte) {
    throw new UnsupportedOperationException(a(5907, -18666));
  }
  
  public Zxi Zp() {
    return this.ZS;
  }
  
  public void ZX() {
    Zb.Zp(Zds.DEBUG, a(5905, 32732), new Object[0]);
    this.ZC.set(Zh.CONNECTED);
    this.Zr.ZD(Ze.ZH(this.ZY));
  }
  
  public void Za(Throwable paramThrowable) {
    try {
      if (this.ZC.get() == Zh.DISCONNECTED)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = (this.ZC.getAndSet(Zh.DISCONNECTED) != Zh.DISCONNECTING) ? true : false;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    String str = (paramThrowable != null) ? Objects.toString(paramThrowable.getMessage(), a(5889, 2835)) : a(5904, -24888);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      Zb.Zp(bool ? Zds.ERROR : Zds.INFO, a(5916, -29651), new Object[] { this.ZY, str });
      if (paramThrowable != null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Zah.Zl(paramThrowable, bool ? Zk_.COMMON_RUNTIME_FAILURE : Zk_.IGNORED);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZM.ZG();
    this.Zr.ZD(Z_.ZB(this.ZY));
    this.ZY = null;
  }
  
  public void Zd() {
    try {
      if (!this.ZC.compareAndSet(Zh.CONNECTED, Zh.DISCONNECTING))
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zb.Zp(Zds.INFO, a(5906, 27205), new Object[0]);
    this.Zd.close();
  }
  
  public String toString() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return a(5917, 15866) + a(5917, 15866);
  }
  
  private Zv_ ZD(String paramString1, String paramString2) throws Zi {
    try {
      Zvb zvb = new Zvb();
      zvb.Zq(Executors.newSingleThreadExecutor(Zs::lambda$createWebSocketClient$1)).ZZ().ZJ(true).ZW(61440).ZC(40960).ZV(a(5888, -9945), paramString2).Zi().Zj(104857600);
      return zvb.Zi(paramString1, this, new net.portswigger.Zhb[0]);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new Zi(iOException);
    } 
  }
  
  private static Thread lambda$createWebSocketClient$1(Runnable paramRunnable) {
    return new Thread(paramRunnable, a(5914, 11405));
  }
  
  private void lambda$cancelWhere$0(Zmf paramZmf) {
    this.ZM.Z_(paramZmf);
    paramZmf.ZU().Zh((Exception)new Z_(a(5919, 26011)));
  }
  
  public static void ZJ(String paramString) {
    Zj = paramString;
  }
  
  public static String ZA() {
    return Zj;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'KiLMfc'
    //   11: ldc 'E6ÝëëÍóÆ!µ.ì3¥Ú\\nÇOE+_Õ{Hþäîæµêæ¥`Þ#§Â- ×Ñ®h¸Ó°­'9Â½kèÁYnçF¦ÑÈô·è¥Ãu>»=Ñ;#TFÒ»ÌçpT\\ÈÎoU¤"MoNíHVÐÒ¤Ï\\fRÚ~/*'Kä ;S¯¬Ä3µE]Ö\\r1g·5G3t<xÌLã1^RòPÃÒúóÛf42Ã\\t}uÝã3¹¤9îb_å,^M>æh¢BQL){ÉeZ·¨ÑøbmZÅ6;h\\tÞnÅ\\nN-(8(/©5_çýÙÇÛÁ¹67ck«½ïß¤MÀñ{É*zÌ,òz{kET°ç _ÍÄ¿ (ê_ë%úä~:*$7ßï\\f})M+®UEÂi¸ïKPa B7æÚ\\r¼ _Ê¹4$B÷Ãt\\rº§H´phêÞ¥kÔæf×~ç/o¹/9g!¢æg|Y°9V\^÷'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: bipush #11
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic ZJ : (Ljava/lang/String;)V
    //   28: bipush #108
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '%Ù¥%mBTODª·¡ßæ\P3:EÅTø÷¿tï«D\Pû©ÒÐ¸ áG&¸·ñ×$ÝI/Ù{ñ\\fq­ø2úÆx^ÍàÞI8Chú'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #46
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #95
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/devtools/client/impl/connection/Zs.a : [Ljava/lang/String;
    //   137: bipush #20
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/devtools/client/impl/connection/Zs.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #56
    //   218: goto -> 248
    //   221: bipush #46
    //   223: goto -> 248
    //   226: bipush #85
    //   228: goto -> 248
    //   231: bipush #78
    //   233: goto -> 248
    //   236: bipush #28
    //   238: goto -> 248
    //   241: bipush #49
    //   243: goto -> 248
    //   246: bipush #110
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1710) & 0xFFFF;
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
      char c = 'Ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Zs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */