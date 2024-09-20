package net.portswigger;

import java.util.List;

@Zsi("AdvancedScope")
public class Zal implements Zsu {
  @Zvd(Zp = "include")
  public final List<Zi4> ZY;
  
  @Zvd(Zp = "exclude")
  public final List<Zi4> ZQ;
  
  @Zox
  public Zal(@Zc5(Ze = "include", ZS = "[]") List<Zi4> paramList1, @Zc5(Ze = "exclude", ZS = "[]") List<Zi4> paramList2) {
    this.ZY = paramList1;
    this.ZQ = paramList2;
  }
  
  public void ZB(Zko paramZko) {
    paramZko.Zn(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zal.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */