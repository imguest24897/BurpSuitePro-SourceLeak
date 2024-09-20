package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.portswigger.Zoq;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzae implements Zlg4 {
  private final Zsoh ZN;
  
  private final Ztpx Zc;
  
  private final Zbnt Z_;
  
  private final Instant ZB;
  
  private final Zefx Zn;
  
  private final List<Duration> Zh;
  
  private final List<Zb6q> Zk;
  
  private final Zoq<Zs68> Zv;
  
  private final Zvow ZI;
  
  public Zzae(Zsoh paramZsoh, Ztpx paramZtpx, Zbnt paramZbnt, Instant paramInstant, Zefx paramZefx, List<Duration> paramList, List<Zb6q> paramList1) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZN : Lburp/Zsoh;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Zc : Lburp/Ztpx;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield Z_ : Lburp/Zbnt;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield ZB : Ljava/time/Instant;
    //   25: aload_0
    //   26: aload #5
    //   28: putfield Zn : Lburp/Zefx;
    //   31: aload_0
    //   32: aload #6
    //   34: putfield Zh : Ljava/util/List;
    //   37: aload_0
    //   38: aload #7
    //   40: putfield Zk : Ljava/util/List;
    //   43: aload_0
    //   44: aload_0
    //   45: aload #7
    //   47: aload_3
    //   48: <illegal opcode> get : (Lburp/Zzae;Ljava/util/List;Lburp/Zbnt;)Ljava/util/function/Supplier;
    //   53: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   56: putfield Zv : Lnet/portswigger/Zoq;
    //   59: aload_0
    //   60: new burp/Zvow
    //   63: dup
    //   64: aload #5
    //   66: invokeinterface ZT : ()Lburp/Zmzk;
    //   71: aload_3
    //   72: invokespecial <init> : (Lburp/Zmzk;Lburp/Zbnt;)V
    //   75: aload #5
    //   77: invokevirtual ZC : (Lburp/Zefx;)Lburp/Zvow;
    //   80: aload #4
    //   82: invokevirtual toEpochMilli : ()J
    //   85: invokevirtual ZF : (J)Lburp/Zvow;
    //   88: aload #7
    //   90: invokeinterface getFirst : ()Ljava/lang/Object;
    //   95: checkcast burp/Zb6q
    //   98: invokevirtual Zo : (Lburp/Zb6q;)Lburp/Zvow;
    //   101: putfield ZI : Lburp/Zvow;
    //   104: return
  }
  
  public Instant Zr() {
    return this.ZB;
  }
  
  public Zefx ZH() {
    return this.Zn;
  }
  
  public List<Duration> Zx() {
    return this.Zh;
  }
  
  public Zb6q ZD() throws Zsc2 {
    try {
    
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    Zuh.Zb(!this.Zk.isEmpty(), Zqf.Zx);
    return this.Zk.getFirst();
  }
  
  public List<Zb6q> Zp() throws Zsc2 {
    return this.Zk;
  }
  
  public Zs68 ZJ() throws Zsc2 {
    return (Zs68)this.Zv.Zz();
  }
  
  public Zvow ZB(Zmzk paramZmzk) {
    return new Zvow(paramZmzk, this.Z_);
  }
  
  public Zvow ZS() {
    return new Zvow(this.ZI);
  }
  
  public Zlyj ZF(Zbza paramZbza, Zlv5 paramZlv5) {
    return new Zlyj(this.ZN.ZD(Ztao.Zc(this.Zc, paramZbza, this.Zn.ZD()).Zx(paramZlv5.Zy()).Zf(paramZlv5.ZZ()).Zz(paramZlv5.ZN()).ZU(paramZlv5.ZR()).ZA()), null);
  }
  
  public boolean ZI() {
    return true;
  }
  
  public boolean ZK() {
    return true;
  }
  
  public void ZN() {}
  
  public void Zs() {}
  
  private Zs68 lambda$new$1(List<Zb6q> paramList, Zbnt paramZbnt) {
    return Zbwc.Zr(ZH().ZF(), ((Zb6q)paramList.getFirst()).Za(), Zt0k.HTML_AND_VIEWSTATE_ANALYSIS, true, false, paramZbnt, Zzae::lambda$new$0);
  }
  
  private static Boolean lambda$new$0() {
    return Boolean.valueOf(false);
  }
  
  private static Zsc2 a(Zsc2 paramZsc2) {
    return paramZsc2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */