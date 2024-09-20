package net.portswigger;

import java.util.List;

@Zsi("FileUploadApiScan")
public class Zq7 {
  @Zvd(Zp = "name")
  public final String ZG;
  
  @Zvd(Zp = "scanConfigurations")
  public final List<Zih> Zt;
  
  @Zvd(Zp = "scanCallback")
  public final Zq_ Zy;
  
  @Zvd(Zp = "bchecks")
  public final List<Zrmz> ZB;
  
  @Zvd(Zp = "apiDefinition")
  public final String Zn;
  
  @Zvd(Zp = "apiDefinitionConfiguration")
  public final Zst ZZ;
  
  @Zox
  public Zq7(@Zc5(Ze = "name", ZS = "null") String paramString1, @Zc5(Ze = "scanConfigurations", ZS = "[]") List<Zih> paramList, @Zc5(Ze = "scanCallback", ZS = "null") Zq_ paramZq_, @Zc5(Ze = "bchecks", ZS = "[]", ZT = true) List<Zrmz> paramList1, @Zc5(Ze = "apiDefinition") String paramString2, @Zc5(Ze = "apiDefinitionConfiguration") Zst paramZst) {
    this.ZG = paramString1;
    this.Zt = paramList;
    this.Zy = paramZq_;
    this.ZB = paramList1;
    this.Zn = paramString2;
    this.ZZ = paramZst;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zq7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */