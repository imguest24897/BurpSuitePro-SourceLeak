package burp;

import java.util.Collection;
import java.util.function.BiConsumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zelh extends Zeli<Zrbc, Zt0r> {
  private final Zkq4 Zi;
  
  private final Zmz6 ZO;
  
  private final Zlba Zq;
  
  private final Zbza Zc;
  
  private final Ze4e ZF;
  
  private final Zr46 ZN;
  
  private final Zrjd ZE;
  
  private final Zens ZK;
  
  private final Zz1i Zf;
  
  public Zelh(Zm8t paramZm8t, Zkq4 paramZkq4, Zmz6 paramZmz6, Zlba paramZlba, Zbza paramZbza, Ze4e paramZe4e, Zr46 paramZr46, Zrjd paramZrjd, Zr_4 paramZr_4, Zbnt paramZbnt, Zrgd paramZrgd, Zens paramZens, Zz1i paramZz1i, Zsoh paramZsoh, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    super(paramZm8t, Zt0r.A2, paramZbza, paramZz1i, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZlli, paramZtos);
    this.Zi = paramZkq4;
    this.ZO = paramZmz6;
    this.Zq = paramZlba;
    this.Zc = paramZbza;
    this.ZF = paramZe4e;
    this.ZN = paramZr46;
    this.ZE = paramZrjd;
    this.ZK = paramZens;
    this.Zf = paramZz1i;
  }
  
  protected boolean ZR() {
    return this.Zi.ZsB();
  }
  
  protected Iterable<Zrbc> Zi() {
    // Byte code:
    //   0: new burp/Zmsw
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: new java/util/HashSet
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: invokestatic synchronizedSet : (Ljava/util/Set;)Ljava/util/Set;
    //   18: astore_2
    //   19: aload_0
    //   20: getfield Zi : Lburp/Zkq4;
    //   23: invokeinterface ZsB : ()Z
    //   28: ifeq -> 161
    //   31: iconst_3
    //   32: anewarray burp/Zrbc
    //   35: dup
    //   36: iconst_0
    //   37: new burp/Ztmi
    //   40: dup
    //   41: getstatic burp/Zt0r.A2 : Lburp/Zt0r;
    //   44: aload_0
    //   45: getfield Zf : Lburp/Zz1i;
    //   48: aload_0
    //   49: getfield Zc : Lburp/Zbza;
    //   52: aload_2
    //   53: dup
    //   54: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: pop
    //   58: <illegal opcode> accept : (Ljava/util/Collection;)Ljava/util/function/Consumer;
    //   63: invokespecial <init> : (Lburp/Zl5x;Lburp/Zz1i;Lburp/Zbza;Ljava/util/function/Consumer;)V
    //   66: aastore
    //   67: dup
    //   68: iconst_1
    //   69: new burp/Zz31
    //   72: dup
    //   73: getstatic burp/Zt0r.A2 : Lburp/Zt0r;
    //   76: aload_0
    //   77: getfield ZO : Lburp/Zmz6;
    //   80: aload_0
    //   81: getfield Zi : Lburp/Zkq4;
    //   84: aload_0
    //   85: getfield Zf : Lburp/Zz1i;
    //   88: aload_0
    //   89: getfield Zq : Lburp/Zlba;
    //   92: aload_0
    //   93: getfield Zc : Lburp/Zbza;
    //   96: aload_0
    //   97: getfield ZF : Lburp/Ze4e;
    //   100: aload_0
    //   101: aload_1
    //   102: <illegal opcode> Zn : (Lburp/Zelh;Lburp/Zmsw;)Lburp/Zku7;
    //   107: aload_0
    //   108: <illegal opcode> apply : (Lburp/Zelh;)Ljava/util/function/Function;
    //   113: aload_0
    //   114: aload_1
    //   115: <illegal opcode> Z_ : (Lburp/Zelh;Lburp/Zmsw;)Lburp/Ztj_;
    //   120: aload_2
    //   121: <illegal opcode> get : (Ljava/util/Collection;)Ljava/util/function/Supplier;
    //   126: invokespecial <init> : (Lburp/Zl5x;Lburp/Zmz6;Lburp/Zkq4;Lburp/Zz1i;Lburp/Zlba;Lburp/Zbza;Lburp/Ze4e;Lburp/Zku7;Ljava/util/function/Function;Lburp/Ztj_;Ljava/util/function/Supplier;)V
    //   129: aastore
    //   130: dup
    //   131: iconst_2
    //   132: new burp/Zso2
    //   135: dup
    //   136: getstatic burp/Zt0r.A2 : Lburp/Zt0r;
    //   139: aload_0
    //   140: getfield Zc : Lburp/Zbza;
    //   143: aload_0
    //   144: getfield ZN : Lburp/Zr46;
    //   147: invokespecial <init> : (Lburp/Zl5x;Lburp/Zbza;Lburp/Zr46;)V
    //   150: aastore
    //   151: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   154: goto -> 164
    //   157: invokestatic a : (Lburp/Zg57;)Lburp/Zg57;
    //   160: athrow
    //   161: invokestatic emptyList : ()Ljava/util/List;
    //   164: areturn
    // Exception table:
    //   from	to	target	type
    //   19	157	157	burp/Zg57
  }
  
  private void Zt(int paramInt, Zz4_ paramZz4_, Ze3n paramZe3n, Zmsw paramZmsw) {
    try {
      try {
        this.ZK.ZL(paramZmsw, paramInt).Zk(paramZe3n, null, paramZz4_);
        if (!paramZe3n.ZR())
          try {
            if (!paramZe3n.ZU())
              Zt(paramInt, paramZz4_, paramZe3n, paramZmsw); 
          } catch (Zg57 zg57) {
            throw a(null);
          }  
      } catch (Zg57 zg57) {
        throw a(null);
      } 
    } catch (Zg57 zg57) {
      Zah.Zl(zg57, Zk_.IGNORED);
      Zt(paramInt, paramZz4_, paramZe3n, paramZmsw);
    } 
  }
  
  private static Collection lambda$buildPhases$4(Collection paramCollection) {
    return paramCollection;
  }
  
  private void lambda$buildPhases$3(Zmsw paramZmsw, Zrj paramZrj, Ze3n paramZe3n, Zz4_ paramZz4_) {
    Zt(paramZrj.Zg(), paramZz4_, paramZe3n, paramZmsw);
  }
  
  private Ze3n lambda$buildPhases$2(Ztpx paramZtpx) {
    Ze3n ze3n = this.ZE.Zc(this.Zc, paramZtpx);
    ZG(ze3n);
    return ze3n;
  }
  
  private Ze5i lambda$buildPhases$1(Zmsw paramZmsw, Zrj paramZrj, Ztpx paramZtpx, Ze3n paramZe3n, Zz1i paramZz1i, Zxs7 paramZxs7, BiConsumer paramBiConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Lburp/Zens;
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual Zg : ()I
    //   9: invokevirtual ZU : (Lburp/Zmsw;I)Lburp/Zlzb;
    //   12: astore #8
    //   14: aload #8
    //   16: aload #4
    //   18: aload #6
    //   20: <illegal opcode> Zk : (Lburp/Zlzb;Lburp/Ze3n;Lburp/Zxs7;)Lburp/Ze5i;
    //   25: areturn
  }
  
  private static void lambda$buildPhases$0(Zlzb paramZlzb, Ze3n paramZe3n, Zxs7 paramZxs7, Zz4_ paramZz4_) {
    paramZlzb.Zk(paramZe3n, paramZxs7, paramZz4_);
  }
  
  private static Zg57 a(Zg57 paramZg57) {
    return paramZg57;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zelh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */