package net.portswigger;

import java.util.List;

@Zsi("Scan")
public class Zf9 {
  @Zvd(Zp = "urls")
  public final List<String> Zl;
  
  @Zvd(Zp = "name")
  public final String Zz;
  
  @Zvd(Zp = "scope")
  public final Zsu ZF;
  
  @Zvd(Zp = "applicationLogins")
  public final List<Zkz> Ze;
  
  @Zvd(Zp = "scanConfigurations")
  public final List<Zih> ZU;
  
  @Zvd(Zp = "resourcePool")
  public final String Z_;
  
  @Zvd(Zp = "scanCallback")
  public final Zq_ Zt;
  
  @Zvd(Zp = "protocolOption")
  public final Zzd Zj;
  
  @Zvd(Zp = "bchecks")
  public final List<Zrmz> Zk;
  
  @Zox
  public Zf9(@Zc5(Ze = "urls") List<String> paramList, @Zc5(Ze = "name", ZS = "null") String paramString1, @Zc5(Ze = "scope", ZS = "null") Zsu paramZsu, @Zc5(Ze = "applicationLogins", ZS = "[]") List<Zkz> paramList1, @Zc5(Ze = "scanConfigurations", ZS = "[]") List<Zih> paramList2, @Zc5(Ze = "resourcePool", ZS = "null") String paramString2, @Zc5(Ze = "scanCallback", ZS = "null") Zq_ paramZq_, @Zc5(Ze = "protocolOption", ZS = "null") Zzd paramZzd, @Zc5(Ze = "bchecks", ZS = "[]", ZT = true) List<Zrmz> paramList3) {
    this.Zl = paramList;
    this.Zz = paramString1;
    this.ZF = paramZsu;
    this.ZU = paramList2;
    this.Ze = paramList1;
    this.Z_ = paramString2;
    this.Zt = paramZq_;
    this.Zj = paramZzd;
    this.Zk = paramList3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */