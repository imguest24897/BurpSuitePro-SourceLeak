package net.portswigger;

import java.util.List;

@Zsi("SimpleScope")
public class Z_x implements Zsu {
  @Zvd(Zp = "include")
  public final List<Zec> Zg;
  
  @Zvd(Zp = "exclude")
  public final List<Zec> ZL;
  
  @Zox
  public Z_x(@Zc5(Ze = "include", ZS = "[]") List<Zec> paramList1, @Zc5(Ze = "exclude", ZS = "[]") List<Zec> paramList2) {
    this.Zg = paramList1;
    this.ZL = paramList2;
  }
  
  public void ZB(Zko paramZko) {
    paramZko.Zc(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */