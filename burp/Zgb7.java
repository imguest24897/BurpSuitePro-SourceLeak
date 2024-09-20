package burp;

import java.util.Optional;
import net.portswigger.browser.Zcv;
import net.portswigger.browser.Zd6;
import net.portswigger.browser.Ze6;
import net.portswigger.browser.Zec;
import net.portswigger.browser.Zjq;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zth;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Zzz;

public class Zgb7<F> implements Zz0z {
  private final Ztgw Zt;
  
  private final Zsxd Zv;
  
  protected Zgb7(Ztgw paramZtgw, Zsxd paramZsxd) {
    this.Zt = paramZtgw;
    this.Zv = paramZsxd;
  }
  
  public static <F> Zgb7<F> ZA(Ztgw paramZtgw, Zsxd paramZsxd) {
    return new Zgb7<>(paramZtgw, paramZsxd);
  }
  
  public Ztgw Zb() {
    return this.Zt;
  }
  
  public Optional<Zsxd> Zk() {
    return Optional.ofNullable(this.Zv);
  }
  
  public Zgbv<F> ZA(F paramF) {
    return new Zgbv<>(this.Zt, this.Zv, paramF);
  }
  
  public Optional<F> Zy() {
    return Optional.empty();
  }
  
  public boolean ZD() {
    return (Zb().Zk() != Zec.DOCUMENT) ? false : ((this.Zv == null || this.Zv.ZG().Ze() == null) ? false : Ztfi.ZC(this.Zv.ZG().Ze().Zm()));
  }
  
  public Zlve ZW(Zjw paramZjw, Zbnt paramZbnt, Zjq paramZjq, Ze6 paramZe6, Zcv paramZcv) throws Ztk {
    // Byte code:
    //   0: new burp/Zzpi
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: invokestatic Zs : ()Ljava/lang/String;
    //   12: aload_0
    //   13: getfield Zt : Lburp/Ztgw;
    //   16: invokevirtual Zd : ()Lburp/Zski;
    //   19: astore #8
    //   21: astore #6
    //   23: aload_0
    //   24: getfield Zv : Lburp/Zsxd;
    //   27: ifnull -> 54
    //   30: aload_0
    //   31: getfield Zv : Lburp/Zsxd;
    //   34: invokeinterface ZG : ()Lburp/Zg3d;
    //   39: invokeinterface Ze : ()Lburp/Zb6q;
    //   44: ifnonnull -> 88
    //   47: goto -> 54
    //   50: invokestatic a : (Lnet/portswigger/browser/Ztk;)Lnet/portswigger/browser/Ztk;
    //   53: athrow
    //   54: aload #7
    //   56: aload #8
    //   58: invokevirtual ZU : (Lburp/Zski;)Lburp/Zzpi;
    //   61: pop
    //   62: aload #6
    //   64: ifnull -> 171
    //   67: goto -> 74
    //   70: invokestatic a : (Lnet/portswigger/browser/Ztk;)Lnet/portswigger/browser/Ztk;
    //   73: athrow
    //   74: iconst_1
    //   75: anewarray burp/Zbqc
    //   78: invokestatic Zr : ([Lburp/Zbqc;)V
    //   81: goto -> 88
    //   84: invokestatic a : (Lnet/portswigger/browser/Ztk;)Lnet/portswigger/browser/Ztk;
    //   87: athrow
    //   88: aload #8
    //   90: aload_0
    //   91: getfield Zv : Lburp/Zsxd;
    //   94: invokeinterface ZG : ()Lburp/Zg3d;
    //   99: invokeinterface Ze : ()Lburp/Zb6q;
    //   104: aload_0
    //   105: invokevirtual Zk : ()Ljava/util/Optional;
    //   108: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   113: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   116: getstatic java/time/Duration.ZERO : Ljava/time/Duration;
    //   119: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   122: checkcast java/time/Duration
    //   125: aload_2
    //   126: invokestatic Zt : (Lburp/Zski;Lburp/Zb6q;Ljava/time/Duration;Lburp/Zbnt;)Lburp/Zt70;
    //   129: astore #9
    //   131: aload #7
    //   133: aload #9
    //   135: invokevirtual Zi : (Lburp/Zt70;)Lburp/Zzpi;
    //   138: pop
    //   139: aload_1
    //   140: invokeinterface Zx : ()Lnet/portswigger/browser/Zd0;
    //   145: aload #4
    //   147: invokeinterface Zi : (Lnet/portswigger/browser/Ze6;)Lnet/portswigger/browser/Zdb;
    //   152: astore #10
    //   154: aload #7
    //   156: aload #8
    //   158: aload #10
    //   160: aload #5
    //   162: aload_3
    //   163: aload_2
    //   164: invokestatic Zk : (Lburp/Zski;Lnet/portswigger/browser/Zdb;Lnet/portswigger/browser/Zcv;Lnet/portswigger/browser/Zjq;Lburp/Zbnt;)Lburp/Zmfc;
    //   167: invokevirtual ZE : (Lburp/Zmfc;)Lburp/Zzpi;
    //   170: pop
    //   171: aload #7
    //   173: invokevirtual Zu : ()Lburp/Zlve;
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   23	47	50	net/portswigger/browser/Ztk
    //   30	67	70	net/portswigger/browser/Ztk
    //   54	81	84	net/portswigger/browser/Ztk
  }
  
  public Zd6 Zm() {
    if (this.Zv == null || this.Zv.ZG().Ze() == null)
      return (Zd6)new Zth(); 
    Zb6q zb6q = this.Zv.ZG().Ze();
    return (Zd6)new Zzz(zb6q.Ze(), Ztfi.Zb(zb6q.Zm()), Ztfi.Zu(zb6q.Zm()), this.Zv.ZG().Ze().Zt());
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgb7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */