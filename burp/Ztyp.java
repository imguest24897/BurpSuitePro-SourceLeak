package burp;

import java.util.Collections;
import java.util.Objects;

public class Ztyp implements Zehc {
  private final Ze3n Zp;
  
  private final Zkea ZD;
  
  private static int[] ZR;
  
  public Ztyp(Zrgd paramZrgd, Zskh paramZskh, Zz1i paramZz1i, Ze3n paramZe3n, Zz_9 paramZz_9) {
    this.Zp = paramZe3n;
    this.ZD = new Zkea(paramZrgd, paramZskh, paramZz1i.Zc(paramZe3n.Za()).ZCP(), paramZz_9.ZqT());
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_JwtWeakHmacSecret;
  }
  
  public Ztk8 Zb() {
    Zgq<Zgpi> zgq = new Zgq<>();
    Objects.requireNonNull(zgq);
    Zttv.ZF(this.Zp).filter(Zsyq::Zy).map(this::lambda$doCheck$0).filter(Objects::nonNull).forEach(zgq::Zu);
    return Ztk8.Zy((Zgq)zgq);
  }
  
  private Zx_5 lambda$doCheck$0(Zsyq paramZsyq) {
    String str = this.ZD.ZU(paramZsyq.Ze(), paramZsyq.Zw());
    return (str == null) ? null : Zzhp.ZE(this.Zp.Za(), this.Zp.ZN(), this.Zp.Zt().ZK(Collections.singletonList(paramZsyq.Zb())), str);
  }
  
  public static void ZJ(int[] paramArrayOfint) {
    ZR = paramArrayOfint;
  }
  
  public static int[] Zw() {
    return ZR;
  }
  
  static {
    if (Zw() == null)
      ZJ(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */