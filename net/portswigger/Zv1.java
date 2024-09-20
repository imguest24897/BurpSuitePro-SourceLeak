package net.portswigger;

import java.util.List;

@Zsi("InformationListEvidence")
public class Zv1 implements Zl_ {
  @Zvd(Zp = "requestResponse")
  public final Zia Zr;
  
  @Zvd(Zp = "informationItems")
  public final List<String> Zy;
  
  @Zox
  public Zv1(@Zc5(Ze = "requestResponse") Zia paramZia, @Zc5(Ze = "informationItems") List<String> paramList) {
    this.Zr = paramZia;
    this.Zy = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */