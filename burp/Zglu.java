package burp;

import java.util.Objects;

public class Zglu {
  public static void Zl(Zlli<Zt18> paramZlli, Ztos<Zt1o> paramZtos) {
    paramZlli.ZE(Zt18.Zz, paramZtos::lambda$subscribeTo$1);
    paramZtos.ZE(Zt1o.Zu, paramZtos::lambda$subscribeTo$3);
  }
  
  private static void ZE(Ztos<Zt1o> paramZtos, Zlj9 paramZlj9) {
    Zx_3 zx_3 = new Zx_3();
    Objects.requireNonNull(zx_3);
    paramZlj9.Zu().ifPresent(zx_3::Zb);
    paramZlj9.Zk().ifPresent(zx_3::lambda$updateCrawlProgress$4);
    if (paramZlj9.ZW())
      zx_3.ZJ(-1); 
    paramZtos.ZD(new Zxr8(Zt1o.Zd, zx_3.Zl()));
  }
  
  private static void ZF(Ztos<Zt1o> paramZtos, Zlj9 paramZlj9) {
    Zx_3 zx_3 = new Zx_3();
    Objects.requireNonNull(zx_3);
    paramZlj9.Zu().ifPresent(zx_3::Zb);
    paramZlj9.Zk().ifPresent(zx_3::lambda$updateAuditProgress$5);
    paramZtos.ZD(new Zxr8(Zt1o.Zd, zx_3.Zl()));
  }
  
  private static void lambda$updateAuditProgress$5(Zx_3 paramZx_3, Integer paramInteger) {
    paramZx_3.ZJ((100 + paramInteger.intValue() * 7) / 8);
  }
  
  private static void lambda$updateCrawlProgress$4(Zx_3 paramZx_3, Integer paramInteger) {
    paramZx_3.ZJ(paramInteger.intValue() / 8);
  }
  
  private static void lambda$subscribeTo$3(Ztos paramZtos, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZtos::lambda$subscribeTo$2);
  }
  
  private static void lambda$subscribeTo$2(Ztos<Zt1o> paramZtos, Zlj9 paramZlj9) {
    ZF(paramZtos, paramZlj9);
  }
  
  private static void lambda$subscribeTo$1(Ztos paramZtos, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZtos::lambda$subscribeTo$0);
  }
  
  private static void lambda$subscribeTo$0(Ztos<Zt1o> paramZtos, Zlj9 paramZlj9) {
    ZE(paramZtos, paramZlj9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */