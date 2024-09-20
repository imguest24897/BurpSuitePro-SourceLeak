package burp;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Zsb8 {
  public static final Set<Zlug> ZO = Set.of(Zlug.CREDIT_CARD_COUNT, Zlug.SOCIAL_SECURITY_NUMBER_COUNT, Zlug.EMAIL_ADDRESS_COUNT, Zlug.JSON_NODE_COUNT);
  
  private final Zl13 ZW;
  
  private final Zl13 ZH;
  
  private final Zlit Zh;
  
  private final Zstu Zs;
  
  private final Zstu ZB;
  
  private final Zbnt Ze;
  
  private Set<Zlug> Zr;
  
  public Zsb8(Zlit paramZlit, Zstu paramZstu1, Zstu paramZstu2, Zbnt paramZbnt) {
    this(paramZlit, paramZstu1, paramZstu2, paramZbnt, ZO, null);
  }
  
  public Zsb8(Zlit paramZlit, Zstu paramZstu1, Zstu paramZstu2, Zbnt paramZbnt, Set<Zlug> paramSet1, Set<Zlug> paramSet2) {
    this.Zh = paramZlit;
    this.Ze = paramZbnt;
    this.Zs = paramZstu1;
    int i = Zlug.ZS();
    this.ZB = paramZstu2;
    this.Zr = paramSet1;
    if (paramSet2 != null)
      this.Zr = (Set<Zlug>)Zlug.RESPONSE_ATTRIBUTES.stream().filter(paramSet2::lambda$new$0).collect(Collectors.toSet()); 
    this.ZW = new Zl13(ZV(paramZstu1));
    this.ZH = new Zl13(ZV(paramZstu2));
    this.ZW.Zu(this.Zr);
    this.ZH.Zu(this.Zr);
    ZQ(paramZstu1);
    Zr(paramZstu2);
    if (i == 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public boolean Zw() {
    return (this.ZW.Zr() || this.ZH.Zr());
  }
  
  public boolean Zy() {
    return (this.ZW.Zr() && this.ZH.Zr());
  }
  
  public Zkvd Zp() {
    return Zo(this.Zs, this.ZB);
  }
  
  public Zkvd Zo(Zstu paramZstu1, Zstu paramZstu2) {
    Ztwq ztwq = new Ztwq(paramZstu1, paramZstu2, this.Ze);
    this.ZW.ZO(this.ZH, ztwq);
    return ztwq.ZL();
  }
  
  public void ZQ(Zstu paramZstu) {
    Zs6y zs6y = ZV(paramZstu);
    this.ZW.Zk(zs6y);
    this.ZH.Zd(zs6y);
  }
  
  public void Zr(Zstu paramZstu) {
    Zs6y zs6y = ZV(paramZstu);
    this.ZH.Zk(zs6y);
    this.ZW.Zd(zs6y);
  }
  
  private Zs6y ZV(Zstu paramZstu) {
    Zs68 zs68 = Zbwc.Zt(this.Zh, paramZstu, Zt0k.HTML_ANALYSIS, this.Ze);
    List<Zg8y> list = (new Zm4c<>(this.Ze)).Zn().Zw().ZW(Zski.Zf(this.Zh), zs68);
    return (new Zk1s()).Zc(this.Zr).Zx(paramZstu, zs68).Zw(list).ZF();
  }
  
  private static boolean lambda$new$0(Set paramSet, Zlug paramZlug) {
    return !paramSet.contains(paramZlug);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsb8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */