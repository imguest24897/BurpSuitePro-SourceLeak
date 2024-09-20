package net.portswigger;

import java.util.List;

@Zsi("UrlApiScan")
public class Zq0 {
  @Zvd(Zp = "name")
  public final String ZF;
  
  @Zvd(Zp = "scanConfigurations")
  public final List<Zih> ZL;
  
  @Zvd(Zp = "scanCallback")
  public final Zq_ Zl;
  
  @Zvd(Zp = "bchecks")
  public final List<Zrmz> ZO;
  
  @Zvd(Zp = "apiDefinitionUrl")
  public final String Zj;
  
  @Zvd(Zp = "apiDefinitionConfiguration")
  public final Zhk Zn;
  
  @Zox
  public Zq0(@Zc5(Ze = "name", ZS = "null") String paramString1, @Zc5(Ze = "scanConfigurations", ZS = "[]") List<Zih> paramList, @Zc5(Ze = "scanCallback", ZS = "null") Zq_ paramZq_, @Zc5(Ze = "bchecks", ZS = "[]", ZT = true) List<Zrmz> paramList1, @Zc5(Ze = "apiDefinitionUrl") String paramString2, @Zc5(Ze = "apiDefinitionConfiguration") Zhk paramZhk) {
    this.ZF = paramString1;
    this.Zn = paramZhk;
    this.ZL = paramList;
    this.Zl = paramZq_;
    this.ZO = paramList1;
    this.Zj = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zq0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */