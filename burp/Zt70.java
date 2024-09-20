package burp;

import java.time.Duration;
import net.portswigger.Zoq;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zt70 {
  private final Zski Zm;
  
  private final Zb6q ZR;
  
  private final Zoq<Zs68> ZO;
  
  private final Duration ZL;
  
  private Zt70(Zski paramZski, Zb6q paramZb6q, Zoq<Zs68> paramZoq, Duration paramDuration) {
    Zuh.Zb((paramZski != null), Zqf.Zv);
    Zuh.Zb((paramZb6q != null), Zqf.Zv);
    Zuh.Zb((paramZoq != null), Zqf.Zv);
    Zuh.Zb((paramDuration != null), Zqf.Zv);
    this.Zm = paramZski;
    this.ZR = paramZb6q;
    this.ZO = paramZoq;
    this.ZL = paramDuration;
  }
  
  public static Zt70 Zb(Zski paramZski, Zb6q paramZb6q, Zs68 paramZs68, Duration paramDuration) {
    return new Zt70(paramZski, paramZb6q, Zoq.ZZ(paramZs68::lambda$from$0), paramDuration);
  }
  
  public static Zt70 Zt(Zski paramZski, Zb6q paramZb6q, Duration paramDuration, Zbnt paramZbnt) {
    // Byte code:
    //   0: new burp/Zt70
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: aload_0
    //   7: aload_1
    //   8: aload_3
    //   9: <illegal opcode> get : (Lburp/Zski;Lburp/Zb6q;Lburp/Zbnt;)Ljava/util/function/Supplier;
    //   14: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   17: aload_2
    //   18: invokespecial <init> : (Lburp/Zski;Lburp/Zb6q;Lnet/portswigger/Zoq;Ljava/time/Duration;)V
    //   21: areturn
  }
  
  public Zlit Zr() {
    return (this.Zm == null) ? null : this.Zm.ZyR();
  }
  
  public Zski Zj() {
    return this.Zm;
  }
  
  public Zb6q ZC() {
    return this.ZR;
  }
  
  public Zs68 ZH() {
    return (Zs68)this.ZO.Zz();
  }
  
  public Duration Zw() {
    return this.ZL;
  }
  
  private static Zs68 lambda$from$1(Zski paramZski, Zb6q paramZb6q, Zbnt paramZbnt) {
    return Zbwc.Zt(paramZski.ZyR(), paramZb6q.Za(), Zt0k.HTML_ANALYSIS, paramZbnt);
  }
  
  private static Zs68 lambda$from$0(Zs68 paramZs68) {
    return paramZs68;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt70.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */