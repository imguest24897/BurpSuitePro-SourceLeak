package burp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class Zeli<T extends Zlm2, U extends Zl5x> implements Zepb<T> {
  protected final U ZM;
  
  protected final Zrgd ZD;
  
  protected final Ze4e Zp;
  
  protected final Zbza Zs;
  
  protected final Ztos<Zt1o> ZC;
  
  private final Zrij ZT = Zlxq.ZE.ZV(1);
  
  private final Zm8t ZL;
  
  private final Zmn9 ZB;
  
  private final List<Ze3n> Zk;
  
  private final List<Zts2> ZA;
  
  private final Zlli<Zt13> ZZ;
  
  private static int[] Ze;
  
  protected Zeli(Zm8t paramZm8t, U paramU, Zbza paramZbza, Zz1i paramZz1i, Zr_4 paramZr_4, Zbnt paramZbnt, Zrgd paramZrgd, Ze4e paramZe4e, Zsoh paramZsoh, Zlli<Zt13> paramZlli, Ztos<Zt1o> paramZtos) {
    this.ZL = paramZm8t;
    this.ZM = paramU;
    int[] arrayOfInt = Zb();
    this.Zs = paramZbza;
    this.ZD = Objects.<Zrgd>requireNonNull(paramZrgd);
    this.Zp = paramZe4e;
    this.ZZ = paramZlli;
    this.ZC = paramZtos;
    this.ZB = new Zmn9(paramZbza, paramZz1i, (Zl5x)paramU, paramZr_4, paramZbnt, paramZrgd, paramZe4e, paramZsoh, paramZtos);
    this.Zk = new LinkedList<>();
    this.ZA = new LinkedList<>();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  protected abstract Iterable<T> Zi();
  
  protected abstract boolean ZR();
  
  protected void ZG(Ze3n paramZe3n) {
    int[] arrayOfInt = Zb();
    this.ZA.add(Zts2.Zr().<Void>ZA(this.ZZ, Zt13.Zd, paramZe3n::lambda$createdActiveAuditItem$0, this.ZT).<Zb6l>Zd(this.ZC, Zt1o.ZH, paramZe3n::lambda$createdActiveAuditItem$0, this.ZT).Zd(this.ZC, Zt1o.Zx, paramZe3n::lambda$createdActiveAuditItem$0, this.ZT));
    this.Zk.add(paramZe3n);
    if (Zbqc.Zwu() == null)
      Zw(new int[3]); 
  }
  
  public final Iterable<T> ZN() {
    return this::lambda$build$3;
  }
  
  private Iterator lambda$build$3() {
    return new Zeo7(this);
  }
  
  private static void lambda$createdActiveAuditItem$0(Ze3n paramZe3n, Zxr8 paramZxr8) {
    paramZe3n.Z_();
  }
  
  public static void Zw(int[] paramArrayOfint) {
    Ze = paramArrayOfint;
  }
  
  public static int[] Zb() {
    return Ze;
  }
  
  static {
    if (Zb() != null)
      Zw(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeli.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */