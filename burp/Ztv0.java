package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.browser.Zcv;

public class Ztv0 {
  private static final Zv0 Zp;
  
  private final Zthl ZB;
  
  private final Zrs4 ZQ;
  
  private final Zeft Za;
  
  private final Zkks ZF;
  
  private final Zeu9 ZZ;
  
  private final Zb1b Zs;
  
  private final Zefx ZI;
  
  private final Ztos<Zt1z> ZE;
  
  private final Zkq4 Zo;
  
  private boolean ZV;
  
  private boolean ZT;
  
  private boolean ZH;
  
  private int ZY;
  
  private int Zb;
  
  private int ZW;
  
  private boolean ZC;
  
  private boolean Zl;
  
  private Zsxd Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztv0(Zkq4 paramZkq4, Zthl paramZthl, Zli8 paramZli8, Ztc6 paramZtc6, Zrs4 paramZrs4, Zefx paramZefx, Zeu9 paramZeu9, Zkks paramZkks, Zkl6 paramZkl6, Zmv7 paramZmv7) {
    this.Zo = paramZkq4;
    this.ZB = paramZthl;
    this.ZQ = paramZrs4;
    this.Za = new Zeft(paramZli8, paramZkl6.ZB(), new Zzr_(Zp), paramZeu9);
    this.ZF = paramZkks;
    this.ZI = paramZefx;
    this.ZZ = paramZeu9;
    this.Zs = Zb1b.ZV(paramZtc6, paramZkks, new Zt19(paramZli8, paramZmv7), paramZthl);
    this.ZE = new Ztos<>(Zt1z.Zy());
  }
  
  public Optional<Zefx> Zb() {
    return Optional.<Zsxd>ofNullable(this.Zn).map(Zsxd::ZX).filter(Ztv0::lambda$getLatestBaseRequest$0).map(List::getFirst).map(Zg3d::ZR);
  }
  
  public Optional<List<Zg3d>> ZE() {
    return Optional.<Zsxd>ofNullable(this.Zn).map(Zsxd::ZX).map(Ztv0::lambda$getLatestBaseResponses$1);
  }
  
  public Zlyj Z_(Zlv5 paramZlv5) throws Zg57, Zmnk, Zmn5 {
    // Byte code:
    //   0: invokestatic ZB : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual Zk : ()V
    //   8: aload_0
    //   9: getfield Zs : Lburp/Zb1b;
    //   12: invokevirtual ZR : ()Z
    //   15: ifeq -> 51
    //   18: aload_0
    //   19: getfield ZC : Z
    //   22: ifeq -> 80
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: aload_0
    //   33: invokevirtual Zt : ()Lburp/Zb41;
    //   36: astore_3
    //   37: aload_0
    //   38: aload_3
    //   39: invokevirtual ZZ : (Lburp/Zb41;)V
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield ZC : Z
    //   47: aload_2
    //   48: ifnull -> 80
    //   51: aload_0
    //   52: getfield ZV : Z
    //   55: ifeq -> 80
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: aload_1
    //   67: invokevirtual Zz : ()Z
    //   70: invokevirtual ZU : (Z)V
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload_0
    //   81: aload_1
    //   82: invokevirtual Zo : (Lburp/Zlv5;)Lburp/Zs2l;
    //   85: astore_3
    //   86: goto -> 275
    //   89: astore #4
    //   91: aload #4
    //   93: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   96: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   99: aload_0
    //   100: getfield Zs : Lburp/Zb1b;
    //   103: invokevirtual ZR : ()Z
    //   106: ifeq -> 121
    //   109: aload_0
    //   110: aload_1
    //   111: aload #4
    //   113: invokevirtual Zt : (Lburp/Zlv5;Lburp/Zmnk;)Lburp/Zs2l;
    //   116: astore_3
    //   117: aload_2
    //   118: ifnull -> 275
    //   121: aload_0
    //   122: invokevirtual ZS : ()Z
    //   125: ifeq -> 210
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   138: sipush #-13656
    //   141: sipush #6721
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: iconst_3
    //   148: anewarray java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload #4
    //   155: aastore
    //   156: dup
    //   157: iconst_1
    //   158: aload_0
    //   159: getfield ZY : I
    //   162: iconst_1
    //   163: iadd
    //   164: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   167: aastore
    //   168: dup
    //   169: iconst_2
    //   170: aload_0
    //   171: getfield ZQ : Lburp/Zrs4;
    //   174: getfield Zc : I
    //   177: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   180: aastore
    //   181: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   184: aload_0
    //   185: invokevirtual Zt : ()Lburp/Zb41;
    //   188: astore #5
    //   190: aload_0
    //   191: aload #5
    //   193: invokevirtual ZZ : (Lburp/Zb41;)V
    //   196: aload_0
    //   197: dup
    //   198: getfield ZY : I
    //   201: iconst_1
    //   202: iadd
    //   203: putfield ZY : I
    //   206: aload_2
    //   207: ifnull -> 248
    //   210: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   213: sipush #-13643
    //   216: sipush #24009
    //   219: invokestatic a : (II)Ljava/lang/String;
    //   222: iconst_1
    //   223: anewarray java/lang/Object
    //   226: dup
    //   227: iconst_0
    //   228: aload #4
    //   230: aastore
    //   231: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: aload_0
    //   235: getfield Zs : Lburp/Zb1b;
    //   238: invokevirtual ZF : ()V
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: aload_0
    //   249: aload_1
    //   250: invokevirtual Zo : (Lburp/Zlv5;)Lburp/Zs2l;
    //   253: astore_3
    //   254: goto -> 275
    //   257: astore #5
    //   259: aload #5
    //   261: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   264: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   267: aload_0
    //   268: aload_1
    //   269: aload #5
    //   271: invokevirtual Zt : (Lburp/Zlv5;Lburp/Zmnk;)Lburp/Zs2l;
    //   274: astore_3
    //   275: aload_0
    //   276: getfield Zs : Lburp/Zb1b;
    //   279: invokevirtual ZR : ()Z
    //   282: ifne -> 307
    //   285: aload_0
    //   286: getfield Za : Lburp/Zeft;
    //   289: aload_3
    //   290: aload_1
    //   291: invokevirtual Zz : ()Z
    //   294: invokevirtual ZZ : (Lburp/Zs2l;Z)Z
    //   297: ifeq -> 332
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_0
    //   308: invokevirtual ZD : ()V
    //   311: aload_0
    //   312: iconst_0
    //   313: putfield ZW : I
    //   316: aload_0
    //   317: iconst_0
    //   318: putfield ZT : Z
    //   321: aload_2
    //   322: ifnull -> 453
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   331: athrow
    //   332: aload_0
    //   333: getfield ZT : Z
    //   336: ifeq -> 389
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   345: athrow
    //   346: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   349: sipush #-13640
    //   352: sipush #26599
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: iconst_0
    //   359: anewarray java/lang/Object
    //   362: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   365: aload_0
    //   366: aload_1
    //   367: invokevirtual Zz : ()Z
    //   370: invokevirtual ZU : (Z)V
    //   373: aload_0
    //   374: iconst_0
    //   375: putfield ZT : Z
    //   378: aload_2
    //   379: ifnull -> 453
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   388: athrow
    //   389: aload_0
    //   390: invokevirtual ZU : ()V
    //   393: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   396: sipush #-13644
    //   399: sipush #-31640
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: iconst_0
    //   406: anewarray java/lang/Object
    //   409: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   412: aload_0
    //   413: aload_0
    //   414: dup
    //   415: getfield ZW : I
    //   418: iconst_1
    //   419: iadd
    //   420: dup_x1
    //   421: putfield ZW : I
    //   424: aload_0
    //   425: getfield ZQ : Lburp/Zrs4;
    //   428: getfield Zu : I
    //   431: if_icmpne -> 449
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   440: athrow
    //   441: iconst_1
    //   442: goto -> 450
    //   445: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   448: athrow
    //   449: iconst_0
    //   450: putfield ZV : Z
    //   453: aload_3
    //   454: invokevirtual ZYW : ()Lburp/Zzl1;
    //   457: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   460: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   465: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   468: aconst_null
    //   469: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   472: checkcast net/portswigger/browser/Zcv
    //   475: astore #4
    //   477: new burp/Zlyj
    //   480: dup
    //   481: aload_3
    //   482: invokevirtual ZYe : ()Lburp/Zsxd;
    //   485: aload #4
    //   487: invokespecial <init> : (Lburp/Zsxd;Lnet/portswigger/browser/Zcv;)V
    //   490: areturn
    // Exception table:
    //   from	to	target	type
    //   4	25	28	burp/Zmnc
    //   37	58	61	burp/Zmnc
    //   51	73	76	burp/Zmnc
    //   80	86	89	burp/Zmnc
    //   117	128	131	burp/Zmnc
    //   190	241	244	burp/Zmnc
    //   248	254	257	burp/Zmnc
    //   275	300	303	burp/Zmnc
    //   285	325	328	burp/Zmnc
    //   307	339	342	burp/Zmnc
    //   332	382	385	burp/Zmnc
    //   346	434	437	burp/Zmnc
    //   389	445	445	burp/Zmnc
  }
  
  public void ZK() {
    try {
      if (!Zm())
        return; 
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    Zlfh.ZB(Zrp6.DEBUG, a(-13642, -18538), new Object[0]);
    this.ZC = true;
    this.Zb++;
  }
  
  public boolean ZN() {
    return this.ZH;
  }
  
  private void Zk() throws Zmnk, Zmn5 {
    if (!this.Zl) {
      Zb41 zb41 = Zt();
      this.Zs.ZF();
      Zt(zb41);
      this.Zl = true;
    } 
  }
  
  private Zb41 Zt() throws Zmnk, Zmn5 {
    int[] arrayOfInt = Zm4b.ZB();
    Ztw0 ztw0 = null;
    try {
    
    } catch (Zmnc zmnc) {
      throw a(null);
    } 
    byte b1 = this.ZF.Zx() ? 1 : 3;
    byte b2 = 0;
    while (b2 < b1) {
      try {
        ztw0 = Zr();
      } catch (Zmnc zmnc) {
        try {
          Zah.Zl(zmnc, Zk_.COMMON_RUNTIME_FAILURE);
          if (this.ZQ.ZN == 0)
            throw zmnc; 
        } catch (Zmnc zmnc1) {
          throw a(null);
        } 
        ztw0 = ZU(this::Zr);
      } 
      try {
        if (b2 == 0)
          this.Za.Zh(); 
      } catch (Zmnc zmnc) {
        throw a(null);
      } 
      this.Za.ZD(ztw0.ZV(), ztw0.ZV6());
      b2++;
      if (arrayOfInt != null)
        break; 
    } 
    return Zb41.ZE(ztw0.ZVM());
  }
  
  private Ztw0 Zr() throws Zmnk, Zmn5 {
    Zlfh.ZB(Zrp6.DEBUG, a(-13649, 12372), new Object[] { this.Zs.Z_() });
    try {
      LinkedList<Zzl1> linkedList = new LinkedList();
      Zz3v zz3v = Zz3v.ZW().Zl(this.ZF).Zu((new Zlv5()).ZD(true));
      Objects.requireNonNull(linkedList);
      Zzl1 zzl1 = this.Zs.Z_().ZP(linkedList::add, Zk2h.PATH_EXECUTOR_RESAMPLING_REQUEST, zz3v);
      linkedList.add(zzl1);
      Optional<Zsxd> optional = this.ZF.ZV(zzl1.Z_O());
      try {
      
      } catch (Zmnk zmnk) {
        throw a(null);
      } 
      this.Zn = optional.isPresent() ? optional.get() : ZG(zz3v);
      return new Ztw0(linkedList, this.Zn);
    } catch (Zmnk zmnk) {
      Zah.Zl(zmnk, Zk_.RETHROWN);
      throw zmnk;
    } 
  }
  
  private Zsxd ZG(Zz3v paramZz3v) throws Zmnk, Zmn5 {
    Zrp0 zrp0 = this.Zs.Z_().ZC();
    try {
      if (this.ZF.Zx())
        throw new Zmnd(zrp0); 
    } catch (Zmnk zmnk) {
      throw a(null);
    } 
    Zm2.Zo(Zze0.SCANNER_PATH_EXECUTOR_REISSUE_MISSING_REQUEST);
    Zkhi.Zg(Zk2h.PATH_EXECUTOR_REISSUED_REQUEST);
    Zsxd zsxd = this.ZB.Zb(zrp0, Zb().orElse(this.ZI), paramZz3v.Zl(this.ZF.ZH()));
    return Zkks.ZO(0, zsxd).<Throwable>orElseThrow(zrp0::lambda$reissueTargetRequestFromBaseRequest$3);
  }
  
  private void Zt(Zb41 paramZb41) throws Zmnk, Zmn5 {
    int[] arrayOfInt = Zm4b.ZB();
    try {
      if (this.Zs.Z_().ZW()) {
        Zlfh.ZB(Zrp6.DEBUG, a(-13661, -3346), new Object[0]);
        return;
      } 
    } catch (Zmnc zmnc) {
      throw a(null);
    } 
    Zz3v zz3v = Zz3v.ZW().Zl(this.ZF).Zu((new Zlv5()).ZD(true));
    if (!this.ZF.Zx()) {
      Zlfh.ZB(Zrp6.DEBUG, a(-13633, 31852), new Object[] { this.Zs.Z_() });
      Zsxd zsxd = ZG(zz3v);
      try {
        if (this.Za.Zb(zsxd, false)) {
          Zlfh.ZB(Zrp6.DEBUG, a(-13653, -14349), new Object[0]);
          this.Zs.Zw();
          return;
        } 
      } catch (Zmnc zmnc) {
        throw a(null);
      } 
      Zlfh.ZB(Zrp6.DEBUG, a(-13651, 23390), new Object[0]);
    } 
    int i = this.Zs.Z_().ZD();
    int j = i - 1;
    Zlfh.ZB(Zrp6.DEBUG, a(-13646, 31659), new Object[] { this.Zs.Z_(), Integer.valueOf(j) });
    byte b = 0;
    while (b < j) {
      try {
        Zlfh.ZB(Zrp6.DEBUG, a(-13664, 2724), new Object[] { Integer.valueOf(b) });
        Optional<Zz3y> optional = this.Zs.ZH(b, paramZb41);
        if (!optional.isEmpty() || arrayOfInt != null)
          try {
            if (ZK(optional.get(), zz3v, i))
              return; 
          } catch (Zmn5 zmn5) {
            throw a(null);
          }  
      } catch (Zmnc zmnc) {
        Zah.Zl(zmnc, Zk_.COMMON_RUNTIME_FAILURE);
        Zlfh.ZB(Zrp6.DEBUG, a(-13657, 6377), new Object[] { zmnc.Za });
      } 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    if (this.Zs.Z_().Zs())
      try {
        Zz3y zz3y = this.Zs.ZP(paramZb41);
        if (ZK(zz3y, zz3v, i)) {
          Zlfh.ZB(Zrp6.DEBUG, a(-13654, -8376), new Object[0]);
          Zm2.Zo(Zze0.SCANNER_PATH_EXECUTOR_SIMPLIFIED_RECORDED_LOGIN);
          return;
        } 
      } catch (Zmnc zmnc) {
        Zah.Zl(zmnc, Zk_.IGNORED);
        Zlfh.ZB(Zrp6.DEBUG, a(-13638, -6488), new Object[0]);
      }  
    Zlfh.ZB(Zrp6.DEBUG, a(-13641, 10156), new Object[] { Integer.valueOf(i) });
    Zm2.Zo(Zze0.SCANNER_PATH_EXECUTOR_WALK_FULL_PATH);
    Zkhi.Zg(Zk2h.PATH_EXECUTOR_FULL_PATH_USED);
    this.Zs.ZF();
  }
  
  private boolean ZK(Zz3y paramZz3y, Zz3v paramZz3v, int paramInt) throws Zmnk, Zmn5 {
    // Byte code:
    //   0: aload_1
    //   1: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   6: getstatic burp/Zk2h.PATH_EXECUTOR_SIMPLIFICATION_REQUEST : Lburp/Zk2h;
    //   9: aload_2
    //   10: invokevirtual ZP : (Ljava/util/function/Consumer;Lburp/Zk2h;Lburp/Zz3v;)Lburp/Zzl1;
    //   13: astore #5
    //   15: invokestatic ZB : ()[I
    //   18: aload_0
    //   19: getfield ZF : Lburp/Zkks;
    //   22: aload #5
    //   24: invokevirtual Z_O : ()Lburp/Zkan;
    //   27: invokevirtual ZV : (Lburp/Zkan;)Ljava/util/Optional;
    //   30: astore #6
    //   32: astore #4
    //   34: aload #6
    //   36: invokevirtual isPresent : ()Z
    //   39: ifeq -> 204
    //   42: aload_0
    //   43: getfield Za : Lburp/Zeft;
    //   46: aload #5
    //   48: aload #6
    //   50: invokevirtual get : ()Ljava/lang/Object;
    //   53: checkcast burp/Zsxd
    //   56: iconst_0
    //   57: invokevirtual ZM : (Lburp/Zzl1;Lburp/Zsxd;Z)Z
    //   60: ifeq -> 204
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_1
    //   71: invokevirtual ZW : ()Z
    //   74: ifeq -> 127
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   87: sipush #-13659
    //   90: sipush #-659
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: anewarray java/lang/Object
    //   100: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: getstatic burp/Zze0.SCANNER_PATH_EXECUTOR_WALK_DIRECT_PATH : Lburp/Zze0;
    //   106: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   109: getstatic burp/Zk2h.PATH_EXECUTOR_DIRECT_PATH_USED : Lburp/Zk2h;
    //   112: invokestatic Zg : (Lburp/Zk2h;)V
    //   115: aload #4
    //   117: ifnull -> 175
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   130: sipush #-13635
    //   133: sipush #25924
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: iconst_1
    //   140: anewarray java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload_1
    //   146: invokevirtual ZD : ()I
    //   149: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   152: aastore
    //   153: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: getstatic burp/Zze0.SCANNER_PATH_EXECUTOR_WALK_SIMPLE_PATH : Lburp/Zze0;
    //   159: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   162: getstatic burp/Zk2h.PATH_EXECUTOR_SIMPLE_PATH_USED : Lburp/Zk2h;
    //   165: invokestatic Zg : (Lburp/Zk2h;)V
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_1
    //   176: invokevirtual ZD : ()I
    //   179: iload_3
    //   180: if_icmpge -> 202
    //   183: aload_0
    //   184: getfield Zs : Lburp/Zb1b;
    //   187: aload_1
    //   188: invokevirtual ZT : (Lburp/Zz3y;)V
    //   191: aload_0
    //   192: invokevirtual ZW : ()V
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: iconst_1
    //   203: ireturn
    //   204: iconst_0
    //   205: ireturn
    // Exception table:
    //   from	to	target	type
    //   34	63	66	burp/Zmnk
    //   42	77	80	burp/Zmnk
    //   70	120	123	burp/Zmnk
    //   84	168	171	burp/Zmnk
    //   175	195	198	burp/Zmnk
  }
  
  private Zs2l Zo(Zlv5 paramZlv5) throws Zmnk, Zmn5 {
    Zz3v zz3v = Zz3v.ZW().ZX().Zu(paramZlv5.ZR(this.Zo)).Zl(this.ZF);
    Optional<Zz3y> optional = this.Zs.Zj();
    if (optional.isPresent()) {
      Zzl1 zzl1 = ((Zz3y)optional.get()).ZP(Ztv0::lambda$verifySimplifiedPath$4, Zk2h.PATH_EXECUTOR_PAYLOAD_REQUEST, zz3v);
      Optional<Zsxd> optional1 = this.ZF.ZV(zzl1.Z_O());
      try {
      
      } catch (Zmnk zmnk) {
        throw a(null);
      } 
      Zsxd zsxd1 = optional1.isPresent() ? optional1.get() : ZG(zz3v);
      return new Zs2l(zsxd1, zzl1);
    } 
    Zsxd zsxd = ZG(zz3v);
    return new Zs2l(zsxd, null);
  }
  
  private Zs2l Zt(Zlv5 paramZlv5, Zmnk paramZmnk) throws Zmnk, Zmn5 {
    try {
      if (this.ZQ.ZN != 0)
        try {
          return ZU(paramZlv5);
        } catch (Zmnk zmnk) {
          Zlfh.ZB(Zrp6.TRACE, a(-13663, 19912), new Object[] { Boolean.valueOf(this.Zs.ZR()), zmnk });
          Zlfh.ZB(Zrp6.TRACE, a(-13634, -28336), new Object[] { Integer.valueOf(this.ZF.Zl()), Boolean.valueOf(this.ZF.ZL()), this.ZZ });
          Zlfh.ZB(Zrp6.TRACE, a(-13636, -21191), new Object[] { this.Zs.Z_() });
          Zlfh.ZB(Zrp6.TRACE, a(-13662, 6097), new Object[] { this.Zs.Zj() });
          Zah.Zl(zmnk, Zk_.RETHROWN);
          throw zmnk;
        }  
    } catch (Zmn5 zmn5) {
      throw a(null);
    } 
    throw paramZmnk;
  }
  
  private Zs2l ZU(Zlv5 paramZlv5) throws Zmnk, Zmn5 {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> Zu : (Lburp/Ztv0;Lburp/Zlv5;)Lburp/Zsnr;
    //   8: invokevirtual ZU : (Lburp/Zsnr;)Ljava/lang/Object;
    //   11: checkcast burp/Zs2l
    //   14: areturn
  }
  
  private <T> T ZU(Zsnr<T> paramZsnr) throws Zmnk, Zmn5 {
    byte b = 1;
    Zmnk zmnk = null;
    int[] arrayOfInt = Zm4b.ZB();
    while (true) {
      try {
        if (ZN(b)) {
          Zlfh.ZB(Zrp6.DEBUG, a(-13658, -1508), new Object[] { Integer.valueOf(b), Integer.valueOf(this.ZQ.ZN) });
          try {
            return paramZsnr.Zu();
          } catch (Zmnk zmnk1) {
            Zah.Zl(zmnk1, Zk_.COMMON_RUNTIME_FAILURE);
            zmnk = zmnk1;
            b++;
            if (arrayOfInt != null)
              break; 
            continue;
          } 
        } 
      } catch (Zmn5 zmn5) {
        throw a(null);
      } 
      break;
    } 
    throw zmnk;
  }
  
  public void ZU(boolean paramBoolean) throws Zg57, Zmnk, Zmn5 {
    // Byte code:
    //   0: invokestatic ZB : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zs : Lburp/Zb1b;
    //   8: invokevirtual ZR : ()Z
    //   11: ifeq -> 48
    //   14: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   17: sipush #-13650
    //   20: sipush #-21764
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: iconst_0
    //   27: anewarray java/lang/Object
    //   30: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: aload_0
    //   34: invokevirtual ZD : ()V
    //   37: aload_0
    //   38: iconst_0
    //   39: putfield ZW : I
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield ZV : Z
    //   47: return
    //   48: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   51: sipush #-13637
    //   54: sipush #20119
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: iconst_0
    //   61: anewarray java/lang/Object
    //   64: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: invokestatic ZW : ()Lburp/Zz3v;
    //   70: aload_0
    //   71: getfield ZF : Lburp/Zkks;
    //   74: invokevirtual Zl : (Lburp/Zkks;)Lburp/Zz3v;
    //   77: new burp/Zlv5
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: iconst_1
    //   85: invokevirtual ZD : (Z)Lburp/Zlv5;
    //   88: invokevirtual Zu : (Lburp/Zlv5;)Lburp/Zz3v;
    //   91: astore_3
    //   92: aload_0
    //   93: getfield Zs : Lburp/Zb1b;
    //   96: invokevirtual Zj : ()Ljava/util/Optional;
    //   99: invokevirtual isPresent : ()Z
    //   102: ifeq -> 242
    //   105: aload_0
    //   106: getfield Zs : Lburp/Zb1b;
    //   109: invokevirtual Zj : ()Ljava/util/Optional;
    //   112: invokevirtual get : ()Ljava/lang/Object;
    //   115: checkcast burp/Zz3y
    //   118: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   123: getstatic burp/Zk2h.PATH_EXECUTOR_SESSION_VERIFICATION_REQUEST : Lburp/Zk2h;
    //   126: aload_3
    //   127: invokevirtual ZP : (Ljava/util/function/Consumer;Lburp/Zk2h;Lburp/Zz3v;)Lburp/Zzl1;
    //   130: astore #4
    //   132: aload_0
    //   133: getfield ZF : Lburp/Zkks;
    //   136: aload #4
    //   138: invokevirtual Z_O : ()Lburp/Zkan;
    //   141: invokevirtual ZV : (Lburp/Zkan;)Ljava/util/Optional;
    //   144: astore #5
    //   146: aload #5
    //   148: invokevirtual isPresent : ()Z
    //   151: ifeq -> 238
    //   154: aload_0
    //   155: getfield Za : Lburp/Zeft;
    //   158: aload #4
    //   160: aload #5
    //   162: invokevirtual get : ()Ljava/lang/Object;
    //   165: checkcast burp/Zsxd
    //   168: iload_1
    //   169: invokevirtual ZM : (Lburp/Zzl1;Lburp/Zsxd;Z)Z
    //   172: ifeq -> 238
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   185: sipush #-13639
    //   188: sipush #21215
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: iconst_1
    //   195: anewarray java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload_0
    //   201: getfield Zs : Lburp/Zb1b;
    //   204: invokevirtual Zj : ()Ljava/util/Optional;
    //   207: invokevirtual get : ()Ljava/lang/Object;
    //   210: checkcast burp/Zz3y
    //   213: invokevirtual ZD : ()I
    //   216: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   219: aastore
    //   220: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: aload_0
    //   224: invokevirtual ZD : ()V
    //   227: aload_0
    //   228: iconst_0
    //   229: putfield ZW : I
    //   232: aload_0
    //   233: iconst_0
    //   234: putfield ZV : Z
    //   237: return
    //   238: aload_2
    //   239: ifnull -> 296
    //   242: aload_0
    //   243: aload_3
    //   244: invokevirtual ZG : (Lburp/Zz3v;)Lburp/Zsxd;
    //   247: astore #4
    //   249: aload_0
    //   250: getfield Za : Lburp/Zeft;
    //   253: aload #4
    //   255: iload_1
    //   256: invokevirtual Zb : (Lburp/Zsxd;Z)Z
    //   259: ifeq -> 296
    //   262: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   265: sipush #-13652
    //   268: sipush #-13065
    //   271: invokestatic a : (II)Ljava/lang/String;
    //   274: iconst_0
    //   275: anewarray java/lang/Object
    //   278: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: aload_0
    //   282: invokevirtual ZD : ()V
    //   285: aload_0
    //   286: iconst_0
    //   287: putfield ZW : I
    //   290: aload_0
    //   291: iconst_0
    //   292: putfield ZV : Z
    //   295: return
    //   296: goto -> 307
    //   299: astore_3
    //   300: aload_3
    //   301: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   304: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   307: aload_0
    //   308: invokevirtual ZS : ()Z
    //   311: ifeq -> 382
    //   314: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   317: sipush #-13660
    //   320: sipush #-16623
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: iconst_2
    //   327: anewarray java/lang/Object
    //   330: dup
    //   331: iconst_0
    //   332: aload_0
    //   333: getfield ZY : I
    //   336: iconst_1
    //   337: iadd
    //   338: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   341: aastore
    //   342: dup
    //   343: iconst_1
    //   344: aload_0
    //   345: getfield ZQ : Lburp/Zrs4;
    //   348: getfield Zc : I
    //   351: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   354: aastore
    //   355: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: aload_0
    //   359: invokevirtual Zt : ()Lburp/Zb41;
    //   362: astore_3
    //   363: aload_0
    //   364: aload_3
    //   365: invokevirtual ZZ : (Lburp/Zb41;)V
    //   368: aload_0
    //   369: dup
    //   370: getfield ZY : I
    //   373: iconst_1
    //   374: iadd
    //   375: putfield ZY : I
    //   378: aload_2
    //   379: ifnull -> 420
    //   382: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   385: sipush #-13655
    //   388: sipush #-30462
    //   391: invokestatic a : (II)Ljava/lang/String;
    //   394: iconst_0
    //   395: anewarray java/lang/Object
    //   398: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   401: aload_0
    //   402: iconst_0
    //   403: putfield ZY : I
    //   406: aload_0
    //   407: getfield Zs : Lburp/Zb1b;
    //   410: invokevirtual ZF : ()V
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   419: athrow
    //   420: new burp/Zg57
    //   423: dup
    //   424: invokespecial <init> : ()V
    //   427: athrow
    //   428: astore_3
    //   429: aload_3
    //   430: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   433: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   436: aload_0
    //   437: iconst_0
    //   438: putfield Zl : Z
    //   441: aload_0
    //   442: dup
    //   443: getfield ZY : I
    //   446: iconst_1
    //   447: iadd
    //   448: putfield ZY : I
    //   451: aload_3
    //   452: athrow
    //   453: astore #6
    //   455: aload_0
    //   456: iconst_0
    //   457: putfield ZW : I
    //   460: aload_0
    //   461: iconst_0
    //   462: putfield ZV : Z
    //   465: aload #6
    //   467: athrow
    // Exception table:
    //   from	to	target	type
    //   4	37	428	burp/Zmnc
    //   4	37	453	finally
    //   48	227	428	burp/Zmnc
    //   48	227	453	finally
    //   67	227	299	burp/Zmnc
    //   146	175	178	burp/Zmnc
    //   238	285	299	burp/Zmnc
    //   238	285	428	burp/Zmnc
    //   238	285	453	finally
    //   296	428	428	burp/Zmnc
    //   296	455	453	finally
    //   363	413	416	burp/Zmnc
  }
  
  private boolean ZS() {
    try {
      if (this.ZQ.Zc > 0)
        try {
          if (this.ZY < this.ZQ.Zc);
        } catch (Zg57 zg57) {
          throw a(null);
        }  
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return false;
  }
  
  private void ZZ(Zb41 paramZb41) {
    int[] arrayOfInt = Zm4b.ZB();
    try {
      if (this.Zs.ZP()) {
        try {
          this.Zs.Zw();
          if (arrayOfInt != null) {
            if (this.Zs.ZZ()) {
              Optional<Zz3y> optional = this.Zs.Ze(paramZb41);
              optional.ifPresent(this::lambda$switchToSimplifiedPath$8);
            } 
            return;
          } 
        } catch (Zg57 zg57) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    if (this.Zs.ZZ()) {
      Optional<Zz3y> optional = this.Zs.Ze(paramZb41);
      optional.ifPresent(this::lambda$switchToSimplifiedPath$8);
    } 
  }
  
  private void ZW() {
    try {
      if (this.ZQ.Zt)
        this.ZT = true; 
    } catch (Zg57 zg57) {
      throw a(null);
    } 
  }
  
  private boolean Zm() {
    try {
      if (this.Zl)
        try {
          if (this.Zs.ZR())
            try {
              if (this.Zs.ZT())
                try {
                  if (this.Zb < this.ZQ.Zz);
                } catch (Zg57 zg57) {
                  throw a(null);
                }  
            } catch (Zg57 zg57) {
              throw a(null);
            }  
        } catch (Zg57 zg57) {
          throw a(null);
        }  
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean ZN(int paramInt) {
    try {
      if (this.ZQ.ZN != 0)
        try {
          if (paramInt <= this.ZQ.ZN);
        } catch (Zg57 zg57) {
          throw a(null);
        }  
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return false;
  }
  
  private void ZD() {
    this.ZH = true;
    this.ZE.ZD(Zt1z.Zu);
  }
  
  private void ZU() {
    this.ZH = false;
    this.ZE.ZD(Zt1z.Zz);
  }
  
  public void Zi() {
    this.Zs.Zt();
  }
  
  public Zz3y ZJ() {
    return this.Zs.Z_();
  }
  
  private void lambda$switchToSimplifiedPath$8(Zz3y paramZz3y) {
    this.Zs.ZT(paramZz3y);
    ZW();
  }
  
  private Zs2l lambda$retryBlockedDoorwayWhenSendingPayload$6(Zlv5 paramZlv5) throws Zmnk, Zmn5 {
    return Zo(paramZlv5);
  }
  
  private static void lambda$verifySimplifiedPath$4(Zzl1 paramZzl1) {}
  
  private static Zmnd lambda$reissueTargetRequestFromBaseRequest$3(Zrp0 paramZrp0) {
    return new Zmnd(paramZrp0);
  }
  
  private static Zcv lambda$go$2(Zzl1 paramZzl1) {
    return paramZzl1.Z_3().ZJ().Zx();
  }
  
  private static List lambda$getLatestBaseResponses$1(List paramList) {
    return (List)paramList.stream().filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private static boolean lambda$getLatestBaseRequest$0(List paramList) {
    try {
    
    } catch (Zg57 zg57) {
      throw a(null);
    } 
    return !paramList.isEmpty();
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÃÅ,óï. wïõ;;0G¡[mÛ~îIÑ¾ýfA{wC>d\\rù\\rk6Øq\\rËÍëÅHn·jE]À¤ÏóÉ¥\\nxbtlÉ½ÒtØWtQÚöò=Àæ)ßÕKH¥CÛÂo¡î³;@MÒAhè()ªª¥i,»0UVTgùh ¬ù[ï÷®j]B|/þRkyXYÃ'DÓß>¬çúú µ¿ªÜ)Ö]Ößæû,h#-µ^K`.vDÚ-öòþX¡/9Z-Ã.ÏwÏIx¥þÃèÌÔ÷©^?ß,p©è%Ì¹]m÷¶Û2Ó$Jâ3íºWtÒ1éÒÀ¾·ËxüXLµ4§6ða­uqc!»CßtÈ» %À$7*ðÜèIü·CöK¾)NbAæ.f»pí \\rð¸4i$sÉw¿GÿäX\\r\\r)sÈDÊ[ås~à·¸£½e`¯ìÀëõOÈt\\b?¡M0µÌ·µD½[åjõÃ3D&mq!6KÎbØ%õboéY<z2s*Ùê,¿z(ñ9ñ-»4ñjvòn*¸¡¿CÇº Ï¾©%.­,HòýÁÑÔ­±&Ç6²äH\\tâ:Kó÷ÙÈÃûÓ0G¡k"¯n?<ËtEöhòºAaB½+c<Noõb¦*æBô¸¾i¹½o{¯%V÷:ùpªÃ¾º=}Ýóq©ñmó£0V³íMö!ü·÷Vv÷y+bÚí{6CËä*`»¥#ñ¥§Wä\:\\r$zS9TcN½3QÝj\\n»W¬b\\rÉy×¿<y®×¦/ÜÃä³SL>º*Å6\\t!ü8k®B=«rw æ@ÙÄ@:ñä¡]æ,¤·ö#Æ0²¿uð<0íÐ%§N½sîô7|Yê8~Öh!\\t×<?:y#k\¯ÉhË*Ós/Äã£GöÃI9&u·ëf0Òø}$ÛcY\þwçÞ.¸\\büRÐ^ìy¬ôÁrüÄÄ6IË¦ÝVuô´ï"Êð\ø%lEÐ<ö\\raàå<ñå3\\fUz4èõäãT¨ý¯H~¦ç¥fÅöÜoÑ6kà%Z¦E_O`)L¹âkõüP6þZ1Ó<{ÉÜÿ&´G¨¬ÁDoðí<N(ÂºIÃ.|b<7}% ssÙW\\bß8©\\rmæynô*U*ÊÒÝ%Z©HÅâIÆ\\bnKàÚ£â²S9ºúÑ¨iQ9Ì~åZ.ý\\n t%àØÅ¿Ëmfauf×ÚÚj?\\fY ôs­ú¢ÒÝ\\rlÇ-8(þ&¿1Ð¦üÕ½$,µ`ÕÁQk±÷èW²«¨\\n\\n1«-M¹Â"¶ÝlÚB7ÆDkÑÝåx³Øjù\\n\\t Z¼?¥I'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #43
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #15
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
    //   68: ldc '4þ~äÉÿÌt³IþÑÝ£ýû]ò]h\\f>Ë-ð·£'=ÿ¦Í¤|¶ÐHÌÎüØbÍ7â'¿¿Ú+\\bOBx^öÊ8%N'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #31
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #23
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
    //   129: putstatic burp/Ztv0.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztv0.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #95
    //   214: goto -> 244
    //   217: bipush #119
    //   219: goto -> 244
    //   222: bipush #75
    //   224: goto -> 244
    //   227: bipush #29
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #124
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zlne
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: iconst_0
    //   308: invokevirtual ZI : (I)Lburp/Zlne;
    //   311: invokevirtual ZO : ()Lburp/Zv0;
    //   314: putstatic burp/Ztv0.Zp : Lburp/Zv0;
    //   317: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCAAE) & 0xFFFF;
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
      char c = 'æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztv0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */