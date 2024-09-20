package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgk6 implements Zz09 {
  private final Zgxp ZP;
  
  private final Zzlx ZW;
  
  private final Zsh8 Zl;
  
  private final Zggp ZF;
  
  private final Zm3c ZN;
  
  private final Zr_4 ZU;
  
  private final Zkn Zv;
  
  private final Zb_x Zs;
  
  private final Zms6 Zp;
  
  private final Zttp Zk;
  
  private final Zemt ZT;
  
  private final Zgb6 ZL;
  
  private final Zz3j ZC;
  
  private final boolean Zh;
  
  private final boolean ZS;
  
  private static String ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgk6(Zgxp paramZgxp, Zzlx paramZzlx, Zggp paramZggp, Zsh8 paramZsh8, Zm3c paramZm3c, Zr_4 paramZr_4, Zkn paramZkn, Zb_x paramZb_x, Zms6 paramZms6, Zttp paramZttp, Zemt paramZemt, Zgb6 paramZgb6, Zz3j paramZz3j, Zxr3 paramZxr3) {
    this.ZP = paramZgxp;
    this.ZW = paramZzlx;
    this.ZF = paramZggp;
    this.Zl = paramZsh8;
    this.ZN = paramZm3c;
    this.ZU = paramZr_4;
    this.Zv = paramZkn;
    this.Zs = paramZb_x;
    this.Zp = paramZms6;
    this.Zk = paramZttp;
    this.ZT = paramZemt;
    this.ZL = paramZgb6;
    String str = ZT();
    this.ZC = paramZz3j;
    this.Zh = paramZsh8.ZPu();
    this.ZS = paramZsh8.ZP8();
    if (str != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public void ZC(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx) {
    try {
      ZE(paramZtpx);
    } finally {
      this.Zp.ZX();
    } 
  }
  
  private void ZE(Ztpx paramZtpx) {
    try {
      this.Zk.ZV();
      ZW();
      this.Zk.Zw();
      Zsxd zsxd = ZJ(this.ZP, paramZtpx);
      try {
        if (zsxd != null)
          ZP(zsxd); 
      } catch (Exception exception) {
        throw a(null);
      } 
      Ztyh.Zc();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } catch (OutOfMemoryError outOfMemoryError) {
      Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
      Ztyh.ZR(this.ZW.Zx().ZY4());
    } 
    try {
      this.Zk.ZV();
      if (!this.Zl.ZPh())
        try {
          if (!Zsim.ZR(this.ZP))
            ZI(); 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (this.Zl.ZP0())
        ZR(this.ZP); 
    } catch (Exception exception) {
      throw a(null);
    } 
    ZS();
    this.ZT.ZE(this.ZP);
  }
  
  private void ZI() {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZP : Lburp/Zgxp;
    //   8: invokeinterface Ze9 : ()Lburp/Zxph;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield Zl : Lburp/Zsh8;
    //   18: invokeinterface ZPa : ()Lburp/Zejb;
    //   23: getstatic burp/Zejb.SNIPER : Lburp/Zejb;
    //   26: if_acmpne -> 62
    //   29: aload_0
    //   30: getfield ZP : Lburp/Zgxp;
    //   33: invokeinterface Zer : ()S
    //   38: istore_3
    //   39: aload_2
    //   40: iload_3
    //   41: invokestatic valueOf : (S)Ljava/lang/Short;
    //   44: invokeinterface Zo : (Ljava/lang/Number;)Lburp/Zm8f;
    //   49: astore #4
    //   51: aload #4
    //   53: invokeinterface Zov : ()V
    //   58: aload_1
    //   59: ifnull -> 100
    //   62: iconst_0
    //   63: istore_3
    //   64: iload_3
    //   65: aload_2
    //   66: invokeinterface Zxp : ()I
    //   71: if_icmpge -> 100
    //   74: aload_2
    //   75: iload_3
    //   76: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   79: invokeinterface Zo : (Ljava/lang/Number;)Lburp/Zm8f;
    //   84: astore #4
    //   86: aload #4
    //   88: invokeinterface Zov : ()V
    //   93: iinc #3, 1
    //   96: aload_1
    //   97: ifnull -> 64
    //   100: return
  }
  
  private void ZP(Zsxd paramZsxd) {
    this.Zv.ZR(paramZsxd);
    Zp(paramZsxd);
    if (this.Zl.ZPn())
      return; 
    Zg3d zg3d = paramZsxd.ZG();
    Zvom zvom = zg3d.Zb();
    Optional<Zb6q> optional = Optional.ofNullable(zg3d.Ze());
    this.ZP.Zxg(paramZsxd.ZZ());
    this.ZP.ZB(paramZsxd.Zn());
    this.ZP.ZX(paramZsxd.ZL().toMillis());
    this.ZP.ZY(paramZsxd.ZE().toMillis());
    if (this.Zl.ZPM() != Zmae.NEVER_FOLLOW)
      ZU(paramZsxd); 
    this.ZP.ZZb((zvom == Zvom.CONNECTION_FAILED || zvom == Zvom.NO_RESPONSE_DATA));
    this.ZP.ZZD((zvom == Zvom.TIMED_OUT));
    this.Zk.ZV();
    optional.ifPresent(this::lambda$updateResultItemWithRequestResult$0);
    this.Zk.Zw();
  }
  
  private void ZM(Zstu paramZstu) {
    Zz4g zz4g = this.Zl.ZP_();
    if (zz4g != null)
      this.ZN.ZE(this.ZP, paramZstu, this.Zl, zz4g.ZvZ(), zz4g.Zvb(), zz4g, (byte)((zz4g.Zvz() ? 1 : 0) | (zz4g.Zv_() ? 2 : 0) | (zz4g.ZvO() ? 4 : 0)), null, null); 
  }
  
  private void ZB(Zb6q paramZb6q, Zstu paramZstu) {
    if (this.ZS)
      this.ZP.Zj(paramZstu.Zp(this.ZU)); 
    this.ZP.ZWs(paramZstu.Zpu());
    this.ZP.ZWb(paramZb6q.Zs());
    this.ZP.Zq(paramZb6q.Ze());
  }
  
  private void Zp(Zsxd paramZsxd) {
    String str = ZT();
    if (this.Zh) {
      Zg3d zg3d = paramZsxd.Zz();
      Zefx zefx = zg3d.ZR();
      Zstu zstu = this.ZU.ZZ(zefx.ZD());
      this.ZP.Zk(zstu);
      if (str != null) {
        this.ZP.Zk((Zstu)null);
        return;
      } 
      return;
    } 
    this.ZP.Zk((Zstu)null);
  }
  
  private void Zb(List<String> paramList) {
    String str = String.join(" ", (Iterable)paramList);
    Zstu zstu = this.ZU.Zh(str);
    this.ZP.ZV(zstu);
  }
  
  private void ZW() {
    Zstu zstu = this.ZP.Zos();
    if (this.Zl.ZPx())
      zstu = Zgyj.Ze(zstu); 
    if (this.Zl.ZP5()) {
      String str = ZK() ? a(-2084, 7069) : a(-2088, -464);
      zstu = Zgyj.Zh(zstu, a(-2087, -16536), false, str, true, false);
    } 
    Zmzk zmzk = this.ZP.Zod();
    if (this.Zl.ZPE().ZwB() && zmzk != null) {
      String str = Zt(zmzk);
      zstu = Zgyj.Zh(zstu, a(-2081, 9769), false, a(-2082, -6345) + a(-2082, -6345), true, true);
    } 
    this.ZP.Zk(zstu.Zp(this.ZU));
  }
  
  private boolean ZK() {
    Zrp zrp = this.Zl.ZPH();
    return zrp.ZJG() ? zrp.ZJ6() : this.ZL.Zcq();
  }
  
  private static String Zt(Zmzk paramZmzk) {
    boolean bool = paramZmzk.ZJZ();
    int i = paramZmzk.ZJO();
    String str1 = paramZmzk.ZJ1();
    String str2 = ((bool && i != 443) || (!bool && i != 80)) ? String.format(a(-2083, -26279), new Object[] { Integer.valueOf(i) }) : "";
    return str1 + str1;
  }
  
  private void ZU(Zsxd paramZsxd) {
    List<Zg3d> list1 = paramZsxd.ZX();
    List<Zg3d> list2 = paramZsxd.Zg();
    int i = list2.size();
    this.ZP.ZK((byte)i);
    String str = ZT();
    if ((!this.Zh && !this.ZS) || list2.isEmpty())
      return; 
    Zxo zxo = this.ZU.<Zxo>ZH(new Zrla());
    Zrte<Zmzk> zrte = this.ZU.<Zrte>Zv((Zllg)new Zguz<>(Zmzk.Zj), i);
    byte b = 0;
    while (b < list1.size() - 1) {
      Zstu zstu1 = this.ZS ? ((Zg3d)list1.get(b)).Ze().Za().Zp(this.ZU) : null;
      Zstu zstu2 = this.Zl.ZPu() ? this.ZU.ZZ(((Zg3d)list1.get(b + 1)).ZL().ZD()) : null;
      zxo.Zo(zstu2, zstu1);
      Zmzk zmzk = ((Zg3d)list1.get(b + 1)).ZL().ZT();
      if (zmzk != null)
        zrte.ZU(b, zmzk); 
      b++;
      if (str != null)
        break; 
    } 
    this.ZP.ZD(zxo);
    this.ZP.ZH(zrte);
  }
  
  private void ZS() {
    if (this.Zs.ZO() % 10 == 0)
      this.Zs.Zm(this.ZW.Zo()); 
  }
  
  private Zsxd ZJ(Zgxp paramZgxp, Ztpx paramZtpx) {
    // Byte code:
    //   0: invokestatic ZT : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aconst_null
    //   5: astore #4
    //   7: aload_0
    //   8: getfield Zl : Lburp/Zsh8;
    //   11: invokeinterface ZPD : ()I
    //   16: istore #5
    //   18: aload_0
    //   19: getfield Zl : Lburp/Zsh8;
    //   22: invokeinterface ZPP : ()I
    //   27: istore #6
    //   29: iconst_0
    //   30: istore #7
    //   32: iload #7
    //   34: iload #5
    //   36: if_icmpgt -> 256
    //   39: aload_2
    //   40: aload_0
    //   41: getfield ZC : Lburp/Zz3j;
    //   44: aload_0
    //   45: aload_1
    //   46: <illegal opcode> get : (Lburp/Zgk6;Lburp/Zgxp;)Ljava/util/function/Supplier;
    //   51: aload_1
    //   52: invokeinterface Zod : ()Lburp/Zmzk;
    //   57: aload_1
    //   58: invokeinterface Zos : ()Lburp/Zstu;
    //   63: invokeinterface ZiD : ()[B
    //   68: invokevirtual ZA : (Ljava/util/function/Supplier;Lburp/Zmzk;[B)Lburp/Ztaw;
    //   71: invokeinterface ZJ : (Lburp/Ztaw;)Lburp/Zsxd;
    //   76: astore #4
    //   78: aload #4
    //   80: ifnonnull -> 85
    //   83: aconst_null
    //   84: areturn
    //   85: aload #4
    //   87: invokeinterface ZG : ()Lburp/Zg3d;
    //   92: astore #8
    //   94: aload #8
    //   96: invokeinterface Zb : ()Lburp/Zvom;
    //   101: astore #9
    //   103: aload #9
    //   105: getstatic burp/Zvom.UNKNOWN_HOST : Lburp/Zvom;
    //   108: if_acmpeq -> 126
    //   111: aload #9
    //   113: getstatic burp/Zvom.STREAMING_RESPONSE : Lburp/Zvom;
    //   116: if_acmpne -> 128
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aconst_null
    //   127: areturn
    //   128: aload #8
    //   130: invokeinterface Ze : ()Lburp/Zb6q;
    //   135: astore #10
    //   137: aload #9
    //   139: getstatic burp/Zvom.TIMED_OUT : Lburp/Zvom;
    //   142: if_acmpne -> 182
    //   145: aload #10
    //   147: ifnull -> 182
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload #10
    //   159: invokeinterface ZF : ()I
    //   164: ifle -> 182
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: iconst_1
    //   175: goto -> 183
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: iconst_0
    //   183: istore #11
    //   185: aload #9
    //   187: getstatic burp/Zvom.RESPONSE_RECEIVED : Lburp/Zvom;
    //   190: if_acmpeq -> 220
    //   193: aload #9
    //   195: getstatic burp/Zvom.ABORTED : Lburp/Zvom;
    //   198: if_acmpeq -> 220
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: iload #11
    //   210: ifeq -> 223
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: aload #4
    //   222: areturn
    //   223: aload_0
    //   224: getfield Zs : Lburp/Zb_x;
    //   227: invokevirtual Z_ : ()V
    //   230: iload #6
    //   232: i2l
    //   233: invokestatic sleep : (J)V
    //   236: goto -> 249
    //   239: astore #12
    //   241: aload #12
    //   243: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   246: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   249: iinc #7, 1
    //   252: aload_3
    //   253: ifnull -> 32
    //   256: goto -> 282
    //   259: astore #5
    //   261: aload #5
    //   263: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   266: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   269: goto -> 282
    //   272: astore #5
    //   274: aload #5
    //   276: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   279: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   282: aload #4
    //   284: areturn
    // Exception table:
    //   from	to	target	type
    //   7	84	259	burp/Zgum
    //   7	84	272	java/lang/Exception
    //   85	127	259	burp/Zgum
    //   85	127	272	java/lang/Exception
    //   103	119	122	java/lang/InterruptedException
    //   128	222	259	burp/Zgum
    //   128	222	272	java/lang/Exception
    //   137	150	153	java/lang/InterruptedException
    //   145	167	170	java/lang/InterruptedException
    //   157	178	178	java/lang/InterruptedException
    //   185	201	204	java/lang/InterruptedException
    //   193	213	216	java/lang/InterruptedException
    //   223	256	259	burp/Zgum
    //   223	256	272	java/lang/Exception
    //   230	236	239	java/lang/InterruptedException
  }
  
  private void ZR(Zgxp paramZgxp) {
    String str = ZT();
    if (paramZgxp.Zew() || Zsim.ZR(paramZgxp))
      return; 
    Zrte<Ze9k> zrte = this.Zl.ZPq();
    int i = zrte.Zpu();
    byte b = 0;
    while (b < i) {
      Ze9k ze9k = zrte.ZdF(b);
      if (ze9k instanceof Zkfd) {
        Zkfd zkfd = (Zkfd)ze9k;
        Zznf zznf = paramZgxp.ZeD();
        Zrte<Zstu> zrte1 = (zznf == null) ? null : zznf.ZTL();
        zkfd.ZO(zrte1);
      } 
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private Zsxd lambda$makeHttpRequest$1(Zgxp paramZgxp) {
    return this.ZF.Zd(paramZgxp);
  }
  
  private void lambda$updateResultItemWithRequestResult$0(Zb6q paramZb6q) {
    Zstu zstu = paramZb6q.Za();
    List<String> list = paramZb6q.Zg();
    if (!list.isEmpty())
      Zb(list); 
    if (zstu != null) {
      ZB(paramZb6q, zstu);
      ZM(zstu);
    } 
  }
  
  public static void ZW(String paramString) {
    ZZ = paramString;
  }
  
  public static String ZT() {
    return ZZ;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZW : (Ljava/lang/String;)V
    //   13: ldc 'a¾ïâ1f¹0gOWãp¬lSÖã¤<ÝÎHm&5³à\\t'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #22
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #101
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
    //   72: ldc '¢.H6?ÛBÆND7ìÍË[IA²Ûÿ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #17
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #68
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
    //   133: putstatic burp/Zgk6.a : [Ljava/lang/String;
    //   136: bipush #6
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zgk6.b : [Ljava/lang/String;
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
    //   216: bipush #120
    //   218: goto -> 248
    //   221: bipush #9
    //   223: goto -> 248
    //   226: bipush #64
    //   228: goto -> 248
    //   231: bipush #49
    //   233: goto -> 248
    //   236: bipush #126
    //   238: goto -> 248
    //   241: bipush #66
    //   243: goto -> 248
    //   246: bipush #77
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
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF7DC) & 0xFFFF;
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
      char c = '±';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */