package burp;

import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Zrc1 {
  private final Ztdi ZL;
  
  private final Zgb6 ZI;
  
  private final Zbnt ZZ;
  
  private final Zz_r Zm;
  
  private final Zs98 ZW;
  
  private final Zr_4 Zq;
  
  private final List<Zb1o> ZO;
  
  private final AtomicInteger Zp;
  
  private final Zlie ZJ;
  
  private static int ZP;
  
  private static final String a;
  
  public Zrc1(Ztdi paramZtdi, Zgb6 paramZgb6, Zbnt paramZbnt, Zz_r paramZz_r, Zs98 paramZs98, Zr_4 paramZr_4) {
    this.ZL = paramZtdi;
    this.ZI = paramZgb6;
    this.ZZ = paramZbnt;
    this.Zm = paramZz_r;
    int i = Zz();
    this.ZW = paramZs98;
    this.Zq = paramZr_4;
    this.ZO = new CopyOnWriteArrayList<>();
    this.Zp = new AtomicInteger(paramZs98.ZCD());
    this.ZJ = new Zlie(paramZs98);
    if (Zbqc.Zwu() == null)
      Zp(++i); 
  }
  
  public void ZZ(Zz1p paramZz1p, Zstu paramZstu1, Zstu paramZstu2, EnumSet<Zln4> paramEnumSet, Ztfx paramZtfx) {
    if (paramZstu2 != null) {
      Zs68 zs68 = Zbwc.ZS(paramZz1p, paramZstu2, Zt0k.HTML_ANALYSIS, this.ZZ);
      if (paramZtfx.Zw())
        ZB(paramZstu1, paramZstu2, paramZz1p, zs68); 
      ZR(paramZstu2, paramZz1p, zs68, paramEnumSet, paramZtfx);
    } 
    int i = this.Zp.incrementAndGet();
    this.ZW.Zz4(i);
    this.ZO.forEach(i::lambda$processResponse$0);
  }
  
  private void ZB(Zstu paramZstu1, Zstu paramZstu2, Zz1p paramZz1p, Zs68 paramZs68) {
    Zez3 zez3 = ZC(paramZstu1, paramZz1p);
    (new Zsir()).Zp(paramZstu1.Zp(this.Zq), paramZz1p.Zb).ZV(paramZstu2.Zp(this.Zq), paramZs68.Zs, paramZs68.Zb, ZB(zez3, paramZs68), Zsir.ZO(paramZs68), System.currentTimeMillis()).ZZ((byte)2, (paramZs68.Zb == 404) ? 2 : 0).Zd(zez3);
    this.ZL.ZR(zez3);
    this.Zm.Zg(Zeew.TARGET, zez3);
  }
  
  private Zez3 ZC(Zstu paramZstu, Zz1p paramZz1p) {
    int i = ZL();
    if (a.equalsIgnoreCase(paramZz1p.Zb)) {
      Objects.requireNonNull(this.ZJ);
      Zez3 zez3 = this.ZL.Zb(paramZz1p.Zo, paramZstu, paramZz1p.ZO(), (short)0, this.ZJ::Zt);
      if (i != 0) {
        Objects.requireNonNull(this.ZJ);
        return this.ZL.Zs(paramZz1p.Zo, (short)0, this.ZJ::Zt);
      } 
      return zez3;
    } 
    Objects.requireNonNull(this.ZJ);
    return this.ZL.Zs(paramZz1p.Zo, (short)0, this.ZJ::Zt);
  }
  
  private void ZR(Zstu paramZstu, Zz1p paramZz1p, Zs68 paramZs68, EnumSet<Zln4> paramEnumSet, Ztfx paramZtfx) {
    // Byte code:
    //   0: aload #4
    //   2: getstatic burp/Zln4.LINKS : Lburp/Zln4;
    //   5: invokevirtual contains : (Ljava/lang/Object;)Z
    //   8: ifeq -> 83
    //   11: aload_2
    //   12: aload_3
    //   13: aload_1
    //   14: aconst_null
    //   15: aload_0
    //   16: getfield ZL : Lburp/Ztdi;
    //   19: aload_0
    //   20: getfield ZZ : Lburp/Zbnt;
    //   23: aload_0
    //   24: getfield ZI : Lburp/Zgb6;
    //   27: invokeinterface ZU0 : ()Lburp/Zes1;
    //   32: invokestatic ZF : (Lburp/Zz1p;Lburp/Zs68;Lburp/Zstu;[BLburp/Ztdi;Lburp/Zbnt;Lburp/Zes1;)Ljava/util/List;
    //   35: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   40: aload #5
    //   42: <illegal opcode> test : (Lburp/Ztfx;)Ljava/util/function/Predicate;
    //   47: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   52: aload_0
    //   53: aload_2
    //   54: <illegal opcode> apply : (Lburp/Zrc1;Lburp/Zz1p;)Ljava/util/function/Function;
    //   59: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   64: aload_0
    //   65: getfield ZL : Lburp/Ztdi;
    //   68: dup
    //   69: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   72: pop
    //   73: <illegal opcode> accept : (Lburp/Ztdi;)Ljava/util/function/Consumer;
    //   78: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   83: aload #4
    //   85: getstatic burp/Zln4.FORMS : Lburp/Zln4;
    //   88: invokevirtual contains : (Ljava/lang/Object;)Z
    //   91: ifeq -> 153
    //   94: aload_3
    //   95: getfield ZQ : Ljava/util/List;
    //   98: ifnull -> 153
    //   101: aload_3
    //   102: getfield ZQ : Ljava/util/List;
    //   105: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   110: aload #5
    //   112: <illegal opcode> test : (Lburp/Ztfx;)Ljava/util/function/Predicate;
    //   117: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   122: aload_0
    //   123: aload_2
    //   124: <illegal opcode> apply : (Lburp/Zrc1;Lburp/Zz1p;)Ljava/util/function/Function;
    //   129: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   134: aload_0
    //   135: getfield ZL : Lburp/Ztdi;
    //   138: dup
    //   139: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   142: pop
    //   143: <illegal opcode> accept : (Lburp/Ztdi;)Ljava/util/function/Consumer;
    //   148: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   153: return
  }
  
  public void Zv(Zb1o paramZb1o) {
    this.ZO.add(paramZb1o);
    this.ZJ.ZL.add(paramZb1o);
  }
  
  private static short ZB(Zez3 paramZez3, Zs68 paramZs68) {
    int i = Zz();
    null = (new Zb4h(paramZez3)).ZU().Z_F();
    if (null == 0) {
      null = paramZs68.ZH.Zj;
      if (i == 0) {
        switch (paramZs68.ZH.Zj) {
          case 0:
          case 1:
          case 2:
          case 512:
            if (i == 0)
              break; 
            return null;
        } 
        return paramZs68.ZH.Zj;
      } 
      return null;
    } 
    switch (paramZs68.ZH.Zj) {
      case 0:
      case 1:
      case 2:
      case 512:
        if (i == 0)
          break; 
        return null;
    } 
    return paramZs68.ZH.Zj;
  }
  
  public void ZR() {
    this.ZO.forEach(this::lambda$updateListenersBasedOnPersistedData$7);
    this.ZJ.Zp();
  }
  
  private void lambda$updateListenersBasedOnPersistedData$7(Zb1o paramZb1o) {
    paramZb1o.ZA(this.Zp.get());
  }
  
  private Zez3 lambda$addResponseLinksToSiteMap$6(Zz1p paramZz1p, Zx8_ paramZx8_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Lburp/Ztdi;
    //   4: aload_2
    //   5: invokeinterface ZZa : ()Lburp/Zlit;
    //   10: iconst_0
    //   11: aload_0
    //   12: aload_1
    //   13: <illegal opcode> Zk : (Lburp/Zrc1;Lburp/Zz1p;)Lburp/Ztuv;
    //   18: invokeinterface Zs : (Lburp/Zlit;SLburp/Ztuv;)Lburp/Zez3;
    //   23: areturn
  }
  
  private void lambda$addResponseLinksToSiteMap$5(Zz1p paramZz1p, Zez3 paramZez3) {
    this.ZJ.ZP(paramZz1p.Zo, paramZez3);
  }
  
  private static boolean lambda$addResponseLinksToSiteMap$4(Ztfx paramZtfx, Zx8_ paramZx8_) {
    return paramZtfx.ZW(paramZx8_.ZZa());
  }
  
  private Zez3 lambda$addResponseLinksToSiteMap$3(Zz1p paramZz1p, Zsq8 paramZsq8) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZL : Lburp/Ztdi;
    //   4: aload_2
    //   5: getfield ZZ : Lburp/Zlit;
    //   8: iconst_0
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> Zk : (Lburp/Zrc1;Lburp/Zz1p;)Lburp/Ztuv;
    //   16: invokeinterface Zs : (Lburp/Zlit;SLburp/Ztuv;)Lburp/Zez3;
    //   21: areturn
  }
  
  private void lambda$addResponseLinksToSiteMap$2(Zz1p paramZz1p, Zez3 paramZez3) {
    this.ZJ.ZX(paramZz1p.Zo, paramZez3);
  }
  
  private static boolean lambda$addResponseLinksToSiteMap$1(Ztfx paramZtfx, Zsq8 paramZsq8) {
    return paramZtfx.ZW(paramZsq8.ZZ);
  }
  
  private static void lambda$processResponse$0(int paramInt, Zb1o paramZb1o) {
    paramZb1o.ZA(paramInt);
  }
  
  public static void Zp(int paramInt) {
    ZP = paramInt;
  }
  
  public static int Zz() {
    return ZP;
  }
  
  public static int ZL() {
    int i = Zz();
    return (i == 0) ? 76 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: ifeq -> 11
    //   6: bipush #80
    //   8: invokestatic Zp : (I)V
    //   11: bipush #19
    //   13: ldc '46w'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zrc1.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #119
    //   94: goto -> 124
    //   97: bipush #65
    //   99: goto -> 124
    //   102: bipush #118
    //   104: goto -> 124
    //   107: bipush #48
    //   109: goto -> 124
    //   112: bipush #100
    //   114: goto -> 124
    //   117: bipush #94
    //   119: goto -> 124
    //   122: bipush #105
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrc1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */