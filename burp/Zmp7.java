package burp;

import java.time.Duration;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import net.portswigger.browser.Zec;

public class Zmp7 implements Zzs1 {
  private static final Set<Integer> ZO;
  
  private static final Set<Zec> ZB;
  
  private static final Duration[] Zx;
  
  private final Zrgd ZW;
  
  private final Zlkl ZS;
  
  private final Map<Zlit, Zef9> Zk = new ConcurrentHashMap<>();
  
  private final Map<Zlit, Zef9> ZK = new ConcurrentHashMap<>();
  
  private final Map<Zmzk, Zef9> ZL = new ConcurrentHashMap<>();
  
  private static final String a;
  
  Zmp7(Zrgd paramZrgd, Zlkl paramZlkl) {
    String[] arrayOfString = Zel_.Zf();
    this.ZW = paramZrgd;
    this.ZS = paramZlkl;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static Zzs1 ZG(Zrgd paramZrgd, Zbnt paramZbnt, Zr_4 paramZr_4, Ztdi paramZtdi, Ztuv paramZtuv) {
    String[] arrayOfString = Zel_.Zf();
    if (Zbqc.Zwu() == null)
      Zel_.ZV(new String[1]); 
    return new Zmp7(paramZrgd, new Zg5w(paramZtdi, paramZtuv, paramZr_4, paramZbnt));
  }
  
  public Optional<Zz0z> Zo(Ztgw paramZtgw) {
    return ZO(paramZtgw, false);
  }
  
  public Optional<Zz0z> ZO(Ztgw paramZtgw, boolean paramBoolean) {
    if (ZJ(paramZtgw, paramBoolean)) {
      Optional<Zlcg> optional = this.ZS.Zh(paramZtgw);
      if (optional.isPresent())
        return optional.filter(Zmp7::lambda$get$0).map(Function.identity()); 
      if (ZG(paramZtgw))
        return Optional.of(new Zz5y()); 
    } 
    return Optional.empty();
  }
  
  public void ZW(Zgb7<?> paramZgb7) {
    ZR(paramZgb7.Zb());
    if (ZF(paramZgb7))
      this.ZS.Zj(paramZgb7); 
  }
  
  public void Zv(Ztgw paramZtgw) {
    ZD(paramZtgw.Zd().ZyR(), this.Zk);
  }
  
  public void ZY(Ztgw paramZtgw) {
    ZD(paramZtgw.Zd().ZyR().Zdt(), this.ZK);
  }
  
  public void Zi(Ztgw paramZtgw) {
    ZD(paramZtgw.Zt(), this.ZL);
  }
  
  private <T> void ZD(T paramT, Map<T, Zef9> paramMap) {
    paramMap.compute(paramT, this::lambda$registerFailure$1);
  }
  
  private boolean ZG(Ztgw paramZtgw) {
    return (Zb(paramZtgw.Zt(), this.ZL) || Zb(paramZtgw.Zd().ZyR().Zdt(), this.ZK) || Zb(paramZtgw.Zd().ZyR(), this.Zk));
  }
  
  private <T> boolean Zb(T paramT, Map<T, Zef9> paramMap) {
    Zef9 zef9 = paramMap.get(paramT);
    return (zef9 != null && !zef9.ZI(this.ZW.Zn()));
  }
  
  private boolean ZJ(Ztgw paramZtgw, boolean paramBoolean) {
    return (a.equalsIgnoreCase(paramZtgw.ZC()) && (ZB.contains(paramZtgw.Zk()) || (paramZtgw.Zk() == Zec.DOCUMENT && paramBoolean)));
  }
  
  private boolean ZF(Zgb7<?> paramZgb7) {
    return (paramZgb7.Zk().isPresent() && ((Zsxd)paramZgb7.Zk().get()).ZG().Ze() != null && !ZO.contains(Integer.valueOf(((Zsxd)paramZgb7.Zk().get()).ZG().Ze().Ze())) && ZB.contains(paramZgb7.Zb().Zk()));
  }
  
  private void ZR(Ztgw paramZtgw) {
    this.Zk.remove(paramZtgw.Zd().ZyR());
    this.ZK.remove(paramZtgw.Zd().ZyR().Zdt());
    this.ZL.remove(paramZtgw.Zt());
  }
  
  private Zef9 lambda$registerFailure$1(Object paramObject, Zef9 paramZef9) {
    return Zef9.Zu(this.ZW.Zn(), (paramZef9 == null) ? 0 : paramZef9.ZB);
  }
  
  private static boolean lambda$get$0(Zlcg paramZlcg) {
    return (!ZO.contains(Integer.valueOf(paramZlcg.ZN())) && paramZlcg.ZN() != 304);
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: ldc 'O%'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmp7.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #42
    //   82: goto -> 112
    //   85: bipush #66
    //   87: goto -> 112
    //   90: bipush #117
    //   92: goto -> 112
    //   95: bipush #18
    //   97: goto -> 112
    //   100: bipush #30
    //   102: goto -> 112
    //   105: bipush #47
    //   107: goto -> 112
    //   110: bipush #97
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: bipush #25
    //   156: anewarray java/lang/Integer
    //   159: dup
    //   160: iconst_0
    //   161: bipush #101
    //   163: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: sipush #206
    //   172: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   175: aastore
    //   176: dup
    //   177: iconst_2
    //   178: sipush #401
    //   181: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   184: aastore
    //   185: dup
    //   186: iconst_3
    //   187: sipush #402
    //   190: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   193: aastore
    //   194: dup
    //   195: iconst_4
    //   196: sipush #403
    //   199: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   202: aastore
    //   203: dup
    //   204: iconst_5
    //   205: sipush #408
    //   208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   211: aastore
    //   212: dup
    //   213: bipush #6
    //   215: sipush #409
    //   218: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   221: aastore
    //   222: dup
    //   223: bipush #7
    //   225: sipush #411
    //   228: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   231: aastore
    //   232: dup
    //   233: bipush #8
    //   235: sipush #412
    //   238: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   241: aastore
    //   242: dup
    //   243: bipush #9
    //   245: sipush #413
    //   248: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   251: aastore
    //   252: dup
    //   253: bipush #10
    //   255: sipush #416
    //   258: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   261: aastore
    //   262: dup
    //   263: bipush #11
    //   265: sipush #417
    //   268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   271: aastore
    //   272: dup
    //   273: bipush #12
    //   275: sipush #423
    //   278: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   281: aastore
    //   282: dup
    //   283: bipush #13
    //   285: sipush #424
    //   288: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   291: aastore
    //   292: dup
    //   293: bipush #14
    //   295: sipush #425
    //   298: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   301: aastore
    //   302: dup
    //   303: bipush #15
    //   305: sipush #426
    //   308: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   311: aastore
    //   312: dup
    //   313: bipush #16
    //   315: sipush #428
    //   318: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   321: aastore
    //   322: dup
    //   323: bipush #17
    //   325: sipush #429
    //   328: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   331: aastore
    //   332: dup
    //   333: bipush #18
    //   335: sipush #431
    //   338: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   341: aastore
    //   342: dup
    //   343: bipush #19
    //   345: sipush #502
    //   348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   351: aastore
    //   352: dup
    //   353: bipush #20
    //   355: sipush #503
    //   358: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   361: aastore
    //   362: dup
    //   363: bipush #21
    //   365: sipush #504
    //   368: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   371: aastore
    //   372: dup
    //   373: bipush #22
    //   375: sipush #505
    //   378: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   381: aastore
    //   382: dup
    //   383: bipush #23
    //   385: sipush #507
    //   388: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   391: aastore
    //   392: dup
    //   393: bipush #24
    //   395: sipush #511
    //   398: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   401: aastore
    //   402: invokestatic of : ([Ljava/lang/Object;)Ljava/util/Set;
    //   405: putstatic burp/Zmp7.ZO : Ljava/util/Set;
    //   408: getstatic net/portswigger/browser/Zec.IMAGE : Lnet/portswigger/browser/Zec;
    //   411: getstatic net/portswigger/browser/Zec.STYLESHEET : Lnet/portswigger/browser/Zec;
    //   414: getstatic net/portswigger/browser/Zec.SCRIPT : Lnet/portswigger/browser/Zec;
    //   417: getstatic net/portswigger/browser/Zec.FONT : Lnet/portswigger/browser/Zec;
    //   420: getstatic net/portswigger/browser/Zec.MEDIA : Lnet/portswigger/browser/Zec;
    //   423: getstatic net/portswigger/browser/Zec.TEXT_TRACK : Lnet/portswigger/browser/Zec;
    //   426: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   429: putstatic burp/Zmp7.ZB : Ljava/util/Set;
    //   432: bipush #10
    //   434: anewarray java/time/Duration
    //   437: dup
    //   438: iconst_0
    //   439: getstatic java/time/Duration.ZERO : Ljava/time/Duration;
    //   442: aastore
    //   443: dup
    //   444: iconst_1
    //   445: ldc2_w 500
    //   448: invokestatic ofMillis : (J)Ljava/time/Duration;
    //   451: aastore
    //   452: dup
    //   453: iconst_2
    //   454: lconst_1
    //   455: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   458: aastore
    //   459: dup
    //   460: iconst_3
    //   461: ldc2_w 2
    //   464: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   467: aastore
    //   468: dup
    //   469: iconst_4
    //   470: ldc2_w 5
    //   473: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   476: aastore
    //   477: dup
    //   478: iconst_5
    //   479: ldc2_w 10
    //   482: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   485: aastore
    //   486: dup
    //   487: bipush #6
    //   489: ldc2_w 30
    //   492: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   495: aastore
    //   496: dup
    //   497: bipush #7
    //   499: lconst_1
    //   500: invokestatic ofMinutes : (J)Ljava/time/Duration;
    //   503: aastore
    //   504: dup
    //   505: bipush #8
    //   507: ldc2_w 2
    //   510: invokestatic ofMinutes : (J)Ljava/time/Duration;
    //   513: aastore
    //   514: dup
    //   515: bipush #9
    //   517: ldc2_w 5
    //   520: invokestatic ofMinutes : (J)Ljava/time/Duration;
    //   523: aastore
    //   524: putstatic burp/Zmp7.Zx : [Ljava/time/Duration;
    //   527: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmp7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */