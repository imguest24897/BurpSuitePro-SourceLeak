package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

public class Zsd6 {
  private final Ztdi Zo;
  
  private final Zsg4 ZT;
  
  private static Zbqc[] ZG;
  
  private static final String a;
  
  public Zsd6(Ztdi paramZtdi, Zr_4 paramZr_4, Zbnt paramZbnt, Zz1m<Zt18> paramZz1m) {
    this(paramZtdi, new Zsg4(paramZtdi, paramZr_4, paramZbnt, paramZz1m));
  }
  
  Zsd6(Ztdi paramZtdi, Zsg4 paramZsg4) {
    this.Zo = paramZtdi;
    this.ZT = paramZsg4;
  }
  
  public void Za(Zlli<Zt35> paramZlli) {
    paramZlli.ZE(Zt35.Zq, this::lambda$subscribeTo$0);
    paramZlli.ZE(Zt35.ZU, this::lambda$subscribeTo$1);
    paramZlli.ZE(Zt35.ZO, this::lambda$subscribeTo$2);
    paramZlli.ZE(Zt35.ZW, this::lambda$subscribeTo$3);
  }
  
  void Za(Zlvj paramZlvj) {
    Z_(paramZlvj.Zx().ZyR());
  }
  
  void Zq(Zefx paramZefx) {
    Z_(paramZefx.ZF());
  }
  
  private void Z_(Zlit paramZlit) {
    if (paramZlit.Zdw().contains(a))
      return; 
    Zez3 zez3 = this.ZT.Zd(paramZlit);
    this.Zo.ZR(zez3);
  }
  
  void ZY(Zrp0 paramZrp0) {
    Optional optional = paramZrp0.<Optional>Zv(new Zmw5(this));
    optional.ifPresent(this::lambda$exitMadePending$4);
  }
  
  void Zy(Ztas paramZtas) {
    Zt8i zt8i = paramZtas.ZUi();
    boolean bool = ((Collection)zt8i.Zsg().Znr().getOrDefault(zt8i.ZsJ(), Collections.emptyList())).stream().filter(zt8i::lambda$roomEntered$5).filter(zt8i::lambda$roomEntered$6).noneMatch(zt8i::lambda$roomEntered$7);
    Zlat zlat = paramZtas.ZU8();
    if (!bool || zlat == null || (zlat.Zu() != null && !zlat.Zu().ZVL()))
      return; 
    zlat.Zg().Zqg().forEach(this::ZU);
  }
  
  private void ZU(Ztrm paramZtrm) {
    if ((paramZtrm.Zw()).scannable) {
      Objects.requireNonNull(this.ZT);
      Objects.requireNonNull(this.Zo);
      paramZtrm.ZzQ().stream().filter(Zsd6::lambda$addCorridorToSiteMap$8).map(this.ZT::Zk).forEach(this.Zo::ZR);
    } 
  }
  
  private static boolean lambda$addCorridorToSiteMap$8(Zgnc paramZgnc) {
    return (paramZgnc.Zza() != null);
  }
  
  private static boolean lambda$roomEntered$7(Zt8i paramZt8i1, Zt8i paramZt8i2) {
    return paramZt8i2.Zsu().equals(paramZt8i1.Zsu());
  }
  
  private static boolean lambda$roomEntered$6(Zt8i paramZt8i1, Zt8i paramZt8i2) {
    return paramZt8i2.ZsD().equals(paramZt8i1.ZsD());
  }
  
  private static boolean lambda$roomEntered$5(Zt8i paramZt8i1, Zt8i paramZt8i2) {
    return !paramZt8i2.equals(paramZt8i1);
  }
  
  private void lambda$exitMadePending$4(Zlit paramZlit) {
    Zez3 zez3 = this.ZT.Zd(paramZlit);
    this.Zo.ZR(zez3);
  }
  
  private void lambda$subscribeTo$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zy);
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZY);
  }
  
  private void lambda$subscribeTo$1(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zq);
  }
  
  private void lambda$subscribeTo$0(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Za);
  }
  
  public static void ZD(Zbqc[] paramArrayOfZbqc) {
    ZG = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZR() {
    return ZG;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_2
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZD : ([Lburp/Zbqc;)V
    //   13: bipush #52
    //   15: ldc '{-iLW0A1;!\]3P11oJ'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zsd6.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #96
    //   94: goto -> 124
    //   97: bipush #107
    //   99: goto -> 124
    //   102: bipush #56
    //   104: goto -> 124
    //   107: bipush #27
    //   109: goto -> 124
    //   112: bipush #12
    //   114: goto -> 124
    //   117: bipush #118
    //   119: goto -> 124
    //   122: bipush #17
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
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
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsd6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */