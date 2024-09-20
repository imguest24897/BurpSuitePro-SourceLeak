package burp;

import java.util.Collection;
import java.util.function.BiConsumer;

public class Zel2 extends Zeli<Zrbc, Zt0r> {
  private final Zbza Zj;
  
  private final Zlba ZQ;
  
  private final Zmz6 ZK;
  
  private final Zkq4 ZN;
  
  private final Zz1i Zt;
  
  private final Zsoh Zg;
  
  private final Zbnt ZH;
  
  private final Zrjd Zv;
  
  private final Zb0k ZE;
  
  private final Zesv Zy;
  
  private final Zzkd Zb;
  
  private final Ze4e Zo;
  
  private final Zr46 Zz;
  
  public Zel2(Zbza paramZbza, Zlba paramZlba, Zmz6 paramZmz6, Zkq4 paramZkq4, Zm8t paramZm8t, Zsoh paramZsoh, Zbnt paramZbnt, Zrjd paramZrjd, Zb0k paramZb0k, Zesv paramZesv, Zzkd paramZzkd, Ze4e paramZe4e, Zr46 paramZr46, Zr_4 paramZr_4, Zrgd paramZrgd, Zz1i paramZz1i, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.A4, paramZbza, paramZz1i, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.Zj = paramZbza;
    this.ZQ = paramZlba;
    this.ZK = paramZmz6;
    this.ZN = paramZkq4;
    boolean bool = Zmg6.Zs();
    this.Zg = paramZsoh;
    this.ZH = paramZbnt;
    this.Zv = paramZrjd;
    this.ZE = paramZb0k;
    this.Zy = paramZesv;
    this.Zb = paramZzkd;
    this.Zo = paramZe4e;
    this.Zz = paramZr46;
    this.Zt = paramZz1i;
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  protected boolean ZR() {
    return (this.ZN.ZsB() && this.Zj.ZgD());
  }
  
  protected Iterable<Zrbc> Zi() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZN : Lburp/Zkq4;
    //   4: invokeinterface ZsB : ()Z
    //   9: ifeq -> 28
    //   12: aload_0
    //   13: getfield Zj : Lburp/Zbza;
    //   16: invokeinterface ZgD : ()Z
    //   21: ifeq -> 28
    //   24: iconst_1
    //   25: goto -> 29
    //   28: iconst_0
    //   29: istore_1
    //   30: new java/util/HashSet
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: invokestatic synchronizedSet : (Ljava/util/Set;)Ljava/util/Set;
    //   40: astore_2
    //   41: iload_1
    //   42: ifeq -> 169
    //   45: iconst_3
    //   46: anewarray burp/Zrbc
    //   49: dup
    //   50: iconst_0
    //   51: new burp/Ztmi
    //   54: dup
    //   55: getstatic burp/Zt0r.A4 : Lburp/Zt0r;
    //   58: aload_0
    //   59: getfield Zt : Lburp/Zz1i;
    //   62: aload_0
    //   63: getfield Zj : Lburp/Zbza;
    //   66: aload_2
    //   67: dup
    //   68: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   71: pop
    //   72: <illegal opcode> accept : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   77: invokespecial <init> : (Lburp/Zl5x;Lburp/Zz1i;Lburp/Zbza;Ljava/util/function/Consumer;)V
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: new burp/Zz31
    //   86: dup
    //   87: getstatic burp/Zt0r.A4 : Lburp/Zt0r;
    //   90: aload_0
    //   91: getfield ZK : Lburp/Zmz6;
    //   94: aload_0
    //   95: getfield ZN : Lburp/Zkq4;
    //   98: aload_0
    //   99: getfield Zt : Lburp/Zz1i;
    //   102: aload_0
    //   103: getfield ZQ : Lburp/Zlba;
    //   106: aload_0
    //   107: getfield Zj : Lburp/Zbza;
    //   110: aload_0
    //   111: getfield Zo : Lburp/Ze4e;
    //   114: aload_0
    //   115: aload_2
    //   116: <illegal opcode> Zn : (Lburp/Zel2;Ljava/util/Collection;)Lburp/Zku7;
    //   121: aload_0
    //   122: <illegal opcode> apply : (Lburp/Zel2;)Ljava/util/function/Function;
    //   127: <illegal opcode> Z_ : ()Lburp/Ztj_;
    //   132: aload_2
    //   133: <illegal opcode> get : (Ljava/util/Collection;)Ljava/util/function/Supplier;
    //   138: invokespecial <init> : (Lburp/Zl5x;Lburp/Zmz6;Lburp/Zkq4;Lburp/Zz1i;Lburp/Zlba;Lburp/Zbza;Lburp/Ze4e;Lburp/Zku7;Ljava/util/function/Function;Lburp/Ztj_;Ljava/util/function/Supplier;)V
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: new burp/Zso2
    //   147: dup
    //   148: getstatic burp/Zt0r.A4 : Lburp/Zt0r;
    //   151: aload_0
    //   152: getfield Zs : Lburp/Zbza;
    //   155: aload_0
    //   156: getfield Zz : Lburp/Zr46;
    //   159: invokespecial <init> : (Lburp/Zl5x;Lburp/Zbza;Lburp/Zr46;)V
    //   162: aastore
    //   163: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   166: goto -> 172
    //   169: invokestatic emptyList : ()Ljava/util/List;
    //   172: areturn
  }
  
  private static Collection lambda$buildPhases$5(Collection paramCollection) {
    return paramCollection;
  }
  
  private static void lambda$buildPhases$4(Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {}
  
  private Ze3n lambda$buildPhases$3(Ztpx paramZtpx) {
    Ze3n ze3n = this.Zv.Zc(this.Zj, paramZtpx);
    ZG(ze3n);
    return ze3n;
  }
  
  private Ze5i lambda$buildPhases$2(Collection paramCollection, Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz1i paramZz1i, Zxs7 paramZxs7, BiConsumer paramBiConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: aload #6
    //   3: aload_1
    //   4: aload_3
    //   5: aload_2
    //   6: aload #4
    //   8: aload #5
    //   10: <illegal opcode> Zk : (Lburp/Zel2;Lburp/Zxs7;Ljava/util/Collection;Lburp/Ztpx;Lburp/Zrj;Lburp/Ze3n;Lburp/Zz1i;)Lburp/Ze5i;
    //   15: areturn
  }
  
  private void lambda$buildPhases$1(Zxs7 paramZxs7, Collection<Zb09> paramCollection, Ztpx paramZtpx, Zrj paramZrj, Ze3n paramZe3n, Zz1i paramZz1i, Zz4_ paramZz4_) {
    boolean bool = Zmg6.Zs();
    for (Zsxt zsxt : this.Zj.Zgh().ZU(paramZxs7.Zl())) {
      if (this.Zj.ZO(Zt0r.A4) && paramCollection.stream().anyMatch(paramZxs7::lambda$buildPhases$0))
        break; 
      Zbza zbza = this.ZQ.ZW(zsxt.ZL.intValue());
      Ze3n ze3n = this.Zv.ZO(zbza, paramZtpx);
      ZG(ze3n);
      Zli zli = new Zli(this.Zg, paramZrj, paramZtpx, this.ZN, this.ZQ, paramZe3n, ze3n, paramZz1i, this.Zo, this.ZE, Zt0r.A4, paramCollection, this.ZC);
      Zs_6 zs_6 = this.Zy.ZY(paramZe3n, ze3n, paramZxs7);
      Zmg6 zmg6 = new Zmg6(paramZe3n, ze3n, this.ZN, this.Zb, paramZxs7, zs_6, paramZrj, paramZz4_, this.ZH);
      zli.Zs(paramZxs7, zmg6, paramZz4_);
      if (!bool)
        break; 
    } 
  }
  
  private static boolean lambda$buildPhases$0(Zxs7 paramZxs7, Zb09 paramZb09) {
    return paramZb09.Zk(Zt0r.A4, paramZxs7.Zl());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */