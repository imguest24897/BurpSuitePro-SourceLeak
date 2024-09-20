package burp;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zt7m implements Zkrr {
  public static final Zro0 ZS;
  
  private final Zkl6 ZX;
  
  private final Zsoh Zf;
  
  private final Ze3n Zu;
  
  private final Zkq4 ZE;
  
  private final Zbjl Z_;
  
  private final Zbom ZL;
  
  private final Duration ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt7m(Zkl6 paramZkl6, Zsoh paramZsoh, Ze3n paramZe3n, Zkq4 paramZkq4, Zbjl paramZbjl, Zz1i paramZz1i) {
    this.ZX = paramZkl6;
    this.Zf = paramZsoh;
    this.Zu = paramZe3n;
    this.ZE = paramZkq4;
    this.Z_ = paramZbjl;
    this.ZL = paramZz1i.Zc(paramZe3n.Za());
    this.ZZ = paramZkq4.Zq2();
  }
  
  public Zbsl Zp() {
    return Zbsl.APR_RequestSmuggling;
  }
  
  public String toString() {
    return Zp().name();
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Lburp/Zbom;
    //   4: invokeinterface Zgg : ()Lburp/Zmjl;
    //   9: astore #5
    //   11: invokestatic Zp : ()[Lburp/Zbqc;
    //   14: aload_0
    //   15: getfield Zu : Lburp/Ze3n;
    //   18: invokevirtual ZA : ()Lburp/Zefx;
    //   21: astore #6
    //   23: aload_0
    //   24: getfield Zu : Lburp/Ze3n;
    //   27: invokevirtual Zp : ()Lburp/Zs68;
    //   30: astore #7
    //   32: astore #4
    //   34: aload #5
    //   36: aload #6
    //   38: aload #7
    //   40: invokestatic Zu : (Lburp/Zmjl;Lburp/Zefx;Lburp/Zs68;)Z
    //   43: ifeq -> 51
    //   46: return
    //   47: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   50: athrow
    //   51: aload_0
    //   52: invokevirtual ZU : ()Ljava/util/List;
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #8
    //   62: aload #8
    //   64: invokeinterface hasNext : ()Z
    //   69: ifeq -> 119
    //   72: aload #8
    //   74: invokeinterface next : ()Ljava/lang/Object;
    //   79: checkcast burp/Zs8f
    //   82: astore #9
    //   84: aload_0
    //   85: aload_2
    //   86: aload_3
    //   87: aload #9
    //   89: aload_1
    //   90: invokevirtual Zg : ()I
    //   93: aload_0
    //   94: getfield ZL : Lburp/Zbom;
    //   97: invokevirtual Ze : (Lburp/Ztpx;Lburp/Zz4_;Lburp/Zs8f;ILburp/Zbom;)Z
    //   100: istore #10
    //   102: iload #10
    //   104: ifne -> 114
    //   107: goto -> 119
    //   110: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   113: athrow
    //   114: aload #4
    //   116: ifnonnull -> 62
    //   119: sipush #-23048
    //   122: sipush #5970
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: aload #6
    //   130: invokeinterface Zr : ()Ljava/lang/String;
    //   135: invokevirtual equals : (Ljava/lang/Object;)Z
    //   138: ifeq -> 177
    //   141: aload_0
    //   142: getfield ZE : Lburp/Zkq4;
    //   145: getstatic burp/Zzu2.REQUEST_SMUGGLING : Lburp/Zzu2;
    //   148: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
    //   151: getstatic burp/Zr3z.REQUEST_SMUGGLING_INTRUSIVE : Lburp/Zr3z;
    //   154: invokeinterface Zl : (Ljava/util/Set;Lburp/Zr3z;)Z
    //   159: ifeq -> 177
    //   162: goto -> 169
    //   165: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   168: athrow
    //   169: iconst_1
    //   170: goto -> 178
    //   173: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   176: athrow
    //   177: iconst_0
    //   178: istore #8
    //   180: iload #8
    //   182: ifeq -> 246
    //   185: aload_0
    //   186: aload_2
    //   187: invokevirtual ZD : (Lburp/Ztpx;)Ljava/util/Optional;
    //   190: astore #9
    //   192: aload #9
    //   194: invokevirtual isPresent : ()Z
    //   197: ifeq -> 246
    //   200: aload_3
    //   201: aload #9
    //   203: invokevirtual get : ()Ljava/lang/Object;
    //   206: checkcast burp/Zsqx
    //   209: invokeinterface Zz : (Lburp/Zsqx;)V
    //   214: aload_3
    //   215: aload_0
    //   216: getfield ZL : Lburp/Zbom;
    //   219: invokeinterface Zgg : ()Lburp/Zmjl;
    //   224: dup
    //   225: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   228: pop
    //   229: <illegal opcode> run : (Lburp/Zmjl;)Ljava/lang/Runnable;
    //   234: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   239: goto -> 246
    //   242: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   245: athrow
    //   246: aload_3
    //   247: aload_0
    //   248: aload #5
    //   250: aload #6
    //   252: aload #7
    //   254: <illegal opcode> run : (Lburp/Zt7m;Lburp/Zmjl;Lburp/Zefx;Lburp/Zs68;)Ljava/lang/Runnable;
    //   259: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   264: return
    // Exception table:
    //   from	to	target	type
    //   34	47	47	burp/Zscd
    //   102	110	110	burp/Zscd
    //   119	162	165	burp/Zscd
    //   141	173	173	burp/Zscd
    //   192	239	242	burp/Zscd
  }
  
  private boolean Ze(Ztpx paramZtpx, Zz4_ paramZz4_, Zs8f paramZs8f, int paramInt, Zbom paramZbom) {
    Zty9 zty9 = Zty9.Zb(paramZs8f.Zw(), paramZs8f.Zr());
    Zsv5 zsv5 = zty9.Ze(this.ZX.ZH());
    Zg1 zg1 = zsv5.Z_();
    Zlph[] arrayOfZlph = { zsv5, zg1 };
    int[] arrayOfInt1 = { 1, 0, 1, 0, 0, 1, 0, 1 };
    int[] arrayOfInt2 = arrayOfInt1;
    Zbqc[] arrayOfZbqc = Zroa.Zp();
    int i = arrayOfInt2.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt2[b];
      try {
        Zlph zlph = arrayOfZlph[j];
        Zzhi zzhi = Ztao.Zc(paramZtpx, this.Zu.ZM(), this.Zu.ZA().ZD()).Zx(zlph.ZI()).Zz(false);
        try {
        
        } catch (Zscd zscd) {
          throw a(null);
        } 
        boolean bool = (zlph == zg1) ? true : false;
        if (bool)
          zzhi = zzhi.Zf(Duration.ofMillis(this.Zu.ZoB()).plus(this.ZZ)); 
        Zsex zsex = new Zsex(this.Zf.ZD(zzhi.ZA()));
        zlph.Zk(zsex.Z_(), zsex.ZT());
        if (zlph.ZS())
          return bool; 
      } catch (Zscd zscd) {
        Zah.Zl(Zscg.Zg(zscd), Zk_.IGNORED);
        return true;
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    Zy(zsv5, zg1, paramZz4_, paramZtpx, paramInt, paramZbom, paramZs8f);
    return false;
  }
  
  public List<Zs8f> ZU() {
    try {
      if (!this.ZX.ZM().ZM(this.Zu.Za())) {
        try {
          if (this.ZL.Zg_());
        } catch (Zscd zscd) {
          throw a(null);
        } 
        boolean bool = false;
        return (List<Zs8f>)Zs8f.Zq.stream().filter(bool::lambda$applicableTechniquesAndPermutations$1).filter(bool::lambda$applicableTechniquesAndPermutations$2).collect(Collectors.toList());
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private void Zy(Zsv5 paramZsv5, Zlph paramZlph, Zz4_ paramZz4_, Ztpx paramZtpx, int paramInt, Zbom paramZbom, Zs8f paramZs8f) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface ZM : ()Lburp/Zb6q;
    //   6: ifnull -> 30
    //   9: aload_2
    //   10: invokeinterface ZM : ()Lburp/Zb6q;
    //   15: invokeinterface ZF : ()I
    //   20: ifne -> 38
    //   23: goto -> 30
    //   26: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   29: athrow
    //   30: iconst_1
    //   31: goto -> 39
    //   34: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   37: athrow
    //   38: iconst_0
    //   39: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   42: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   45: aload #7
    //   47: invokevirtual Zw : ()Lburp/Zk9m;
    //   50: astore #8
    //   52: aload #7
    //   54: invokevirtual Zr : ()Lburp/Zgsh;
    //   57: astore #9
    //   59: getstatic burp/Zroa.TIMEOUT : Lburp/Zroa;
    //   62: iconst_2
    //   63: anewarray burp/Zvow
    //   66: dup
    //   67: iconst_0
    //   68: aload_0
    //   69: getfield Zu : Lburp/Ze3n;
    //   72: invokevirtual ZI : ()Lburp/Zvow;
    //   75: aload_1
    //   76: invokevirtual Zp : ()Lburp/Zefx;
    //   79: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   82: aload_1
    //   83: invokevirtual Zp : ()Lburp/Zefx;
    //   86: aload #8
    //   88: aload #9
    //   90: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   95: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   98: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   101: aload_1
    //   102: invokevirtual ZM : ()Lburp/Zb6q;
    //   105: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   108: aastore
    //   109: dup
    //   110: iconst_1
    //   111: aload_0
    //   112: getfield Zu : Lburp/Ze3n;
    //   115: invokevirtual ZI : ()Lburp/Zvow;
    //   118: aload_2
    //   119: invokeinterface Zp : ()Lburp/Zefx;
    //   124: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   127: aload_2
    //   128: invokeinterface Zp : ()Lburp/Zefx;
    //   133: aload #8
    //   135: aload #9
    //   137: <illegal opcode> apply : (Lburp/Zk9m;Lburp/Zgsh;)Ljava/util/function/Function;
    //   142: invokestatic ZT : (Lburp/Zefx;Ljava/util/function/Function;)Ljava/util/List;
    //   145: invokevirtual ZK : (Ljava/util/Collection;)Lburp/Zvow;
    //   148: aastore
    //   149: invokestatic Zw : (Lburp/Zroa;[Lburp/Zvow;)Lburp/Zerr;
    //   152: astore #10
    //   154: aload_0
    //   155: getfield ZE : Lburp/Zkq4;
    //   158: getstatic burp/Zzu2.REQUEST_SMUGGLING : Lburp/Zzu2;
    //   161: invokestatic singleton : (Ljava/lang/Object;)Ljava/util/Set;
    //   164: getstatic burp/Zr3z.REQUEST_SMUGGLING_INTRUSIVE : Lburp/Zr3z;
    //   167: invokeinterface Zl : (Ljava/util/Set;Lburp/Zr3z;)Z
    //   172: istore #11
    //   174: iload #11
    //   176: ifeq -> 246
    //   179: new burp/Zgkq
    //   182: dup
    //   183: aload_0
    //   184: getfield Zf : Lburp/Zsoh;
    //   187: aload #4
    //   189: aload_0
    //   190: getfield Zu : Lburp/Ze3n;
    //   193: aload_1
    //   194: aload #8
    //   196: aload #9
    //   198: invokespecial <init> : (Lburp/Zsoh;Lburp/Ztpx;Lburp/Ze3n;Lburp/Zsv5;Lburp/Zk9m;Lburp/Zgsh;)V
    //   201: aload #10
    //   203: invokevirtual ZE : (Lburp/Zerr;)V
    //   206: new burp/Zs_j
    //   209: dup
    //   210: aload_0
    //   211: getfield Zf : Lburp/Zsoh;
    //   214: aload #4
    //   216: aload_0
    //   217: getfield Z_ : Lburp/Zbjl;
    //   220: iload #5
    //   222: aload_0
    //   223: getfield Zu : Lburp/Ze3n;
    //   226: aload_1
    //   227: aload #8
    //   229: aload #9
    //   231: invokespecial <init> : (Lburp/Zsoh;Lburp/Ztpx;Lburp/Zbjl;ILburp/Ze3n;Lburp/Zsv5;Lburp/Zk9m;Lburp/Zgsh;)V
    //   234: aload #10
    //   236: invokevirtual ZE : (Lburp/Zerr;)V
    //   239: goto -> 246
    //   242: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   245: athrow
    //   246: aload #10
    //   248: iconst_4
    //   249: invokevirtual ZX : (B)Z
    //   252: ifne -> 289
    //   255: new burp/Zxou
    //   258: dup
    //   259: aload_0
    //   260: getfield Zf : Lburp/Zsoh;
    //   263: aload #4
    //   265: aload_0
    //   266: getfield Zu : Lburp/Ze3n;
    //   269: aload_1
    //   270: aload #8
    //   272: aload #9
    //   274: invokespecial <init> : (Lburp/Zsoh;Lburp/Ztpx;Lburp/Ze3n;Lburp/Zlph;Lburp/Zk9m;Lburp/Zgsh;)V
    //   277: aload #10
    //   279: invokevirtual ZE : (Lburp/Zerr;)V
    //   282: goto -> 289
    //   285: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   288: athrow
    //   289: aload #10
    //   291: iconst_2
    //   292: invokevirtual Zy : (B)Z
    //   295: ifne -> 310
    //   298: iload #11
    //   300: ifne -> 340
    //   303: goto -> 310
    //   306: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   309: athrow
    //   310: aload_3
    //   311: aload #6
    //   313: invokeinterface Zgg : ()Lburp/Zmjl;
    //   318: dup
    //   319: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   322: pop
    //   323: <illegal opcode> run : (Lburp/Zmjl;)Ljava/lang/Runnable;
    //   328: invokeinterface ZL : (Ljava/lang/Runnable;)V
    //   333: goto -> 340
    //   336: invokestatic a : (Lburp/Zscd;)Lburp/Zscd;
    //   339: athrow
    //   340: aload_3
    //   341: aload_0
    //   342: getfield Zu : Lburp/Ze3n;
    //   345: invokevirtual Za : ()Lburp/Zmzk;
    //   348: aload_0
    //   349: getfield Zu : Lburp/Ze3n;
    //   352: invokevirtual ZN : ()Ljava/lang/String;
    //   355: aload #8
    //   357: invokevirtual Zh : ()B
    //   360: aload #9
    //   362: invokevirtual Zo : ()B
    //   365: aload #10
    //   367: invokestatic ZC : (Lburp/Zmzk;Ljava/lang/String;BILburp/Zerr;)Lburp/Zx_5;
    //   370: invokeinterface Zz : (Lburp/Zsqx;)V
    //   375: return
    // Exception table:
    //   from	to	target	type
    //   0	23	26	burp/Zscd
    //   9	34	34	burp/Zscd
    //   174	239	242	burp/Zscd
    //   246	282	285	burp/Zscd
    //   289	303	306	burp/Zscd
    //   298	333	336	burp/Zscd
  }
  
  private Optional<Zx_5> ZD(Ztpx paramZtpx) {
    Optional<Zmyb> optional = Zmw7.Zq(paramZtpx, this.Zf, this.ZL, this.ZX, this.Zu);
    if (optional.isPresent()) {
      Zmyb zmyb = optional.get();
      HashMap<Object, Object> hashMap = new HashMap<>();
      Zkqu zkqu = zmyb.ZX();
      Zsxd zsxd = ZK(paramZtpx, zkqu, (Map)hashMap);
      try {
        if (zkqu.ZY(zsxd))
          return Optional.empty(); 
      } catch (Zscd zscd) {
        throw a(null);
      } 
      return ZI(paramZtpx, zmyb, (Map)hashMap, zsxd);
    } 
    return Optional.empty();
  }
  
  private Optional<Zx_5> ZI(Ztpx paramZtpx, Zmyb paramZmyb, Map<Zkqu, byte[]> paramMap, Zsxd paramZsxd) {
    Zbqc[] arrayOfZbqc = Zroa.Zp();
    byte b = 0;
    while (b < Zk(this.ZE.ZqT()) - 1) {
      Zkqu zkqu = paramZmyb.ZX();
      try {
        Zsxd zsxd = ZK(paramZtpx, zkqu, paramMap);
        Zrrt zrrt = new Zrrt(this.Zu, zsxd, paramMap, paramZsxd);
        zkqu.ZL(zrrt);
        Optional<Zx_5> optional = zrrt.Zc();
        if (optional.isPresent())
          return optional; 
      } catch (Zscd zscd) {
        Zah.Zl(Zscg.Zg(zscd), Zk_.IGNORED);
        return Optional.empty();
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return Optional.empty();
  }
  
  private Zsxd ZK(Ztpx paramZtpx, Zkqu paramZkqu, Map<Zkqu, byte[]> paramMap) {
    Zstu zstu = paramZkqu.Zw();
    Zsxd zsxd = this.Zf.ZD(Ztao.Zc(paramZtpx, this.Zu.ZM(), this.Zu.ZA().ZD()).Zx(Zxgd.Zu(zstu::lambda$issueAndRecordGadgetRequest$5).ZN()).ZA());
    Zefx zefx = zsxd.Zz().ZL();
    paramMap.put(paramZkqu, zefx.Zb().ZD());
    return zsxd;
  }
  
  private static int Zk(Zlk4 paramZlk4) {
    try {
      switch (Zeiv.Zi[paramZlk4.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
    return 10;
  }
  
  private static Zefx lambda$issueAndRecordGadgetRequest$5(Zstu paramZstu, Zefx paramZefx) {
    return paramZefx.Zx(a(-23044, 18345), a(-23045, 13965)).Zx(a(-23046, 29853), String.valueOf(paramZstu.Zpu())).ZZ(paramZstu.ZiD());
  }
  
  private static List lambda$runFollowups$3(Zk9m paramZk9m, Zgsh paramZgsh, Zr6q paramZr6q) {
    return paramZk9m.Zw(Zyf.Zy(paramZr6q.ZD()), paramZgsh);
  }
  
  private static boolean lambda$applicableTechniquesAndPermutations$2(boolean paramBoolean, Zs8f paramZs8f) {
    try {
      if (!paramBoolean) {
        try {
          if (paramZs8f.Zr().Zq() != Zlwb.MUST_USE_HTTP2);
        } catch (Zscd zscd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private static boolean lambda$applicableTechniquesAndPermutations$1(boolean paramBoolean, Zs8f paramZs8f) {
    try {
      if (!paramBoolean) {
        try {
          if (paramZs8f.Zw().Zw() != Zlwb.MUST_USE_HTTP2);
        } catch (Zscd zscd) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zscd zscd) {
      throw a(null);
    } 
  }
  
  private void lambda$doCheck$0(Zmjl paramZmjl, Zefx paramZefx, Zs68 paramZs68) {
    Zmw7.Zm(this.ZE, paramZmjl, paramZefx, paramZs68);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc ',ÇûWrø¸,SÝà¢'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #105
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc ']>Ó­ðÄVO\\nµ³$6Wõ b'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #10
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #72
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zt7m.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zt7m.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #21
    //   210: goto -> 240
    //   213: bipush #55
    //   215: goto -> 240
    //   218: bipush #21
    //   220: goto -> 240
    //   223: bipush #78
    //   225: goto -> 240
    //   228: bipush #19
    //   230: goto -> 240
    //   233: bipush #8
    //   235: goto -> 240
    //   238: bipush #77
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 97
    //   296: sipush #-23047
    //   299: sipush #327
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: invokestatic Zgd : (Ljava/lang/String;)Lburp/Zro0;
    //   308: putstatic burp/Zt7m.ZS : Lburp/Zro0;
    //   311: return
  }
  
  private static Zscd a(Zscd paramZscd) {
    return paramZscd;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA5F8) & 0xFFFF;
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
      char c = 'Ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */