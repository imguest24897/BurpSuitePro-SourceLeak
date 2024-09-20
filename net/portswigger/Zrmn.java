package net.portswigger;

@Zsi("CollaboratorEvidence")
public class Zrmn implements Zl_ {
  @Zvd(Zp = "detail")
  public final Zno Zn;
  
  @Zvd(Zp = "requestResponse")
  public final Zia Zt;
  
  @Zvd(Zp = "dnsEvent")
  public final Zv5 Zb;
  
  @Zvd(Zp = "httpEvent")
  public final Zv8 ZG;
  
  @Zvd(Zp = "smtpEvent")
  public final Zvl Ze;
  
  private static int Zd;
  
  @Zox
  public Zrmn(@Zc5(Ze = "detail") Zno paramZno, @Zc5(Ze = "requestResponse", ZS = "null") Zia paramZia, @Zc5(Ze = "dnsEvent", ZS = "null") Zv5 paramZv5, @Zc5(Ze = "httpEvent", ZS = "null") Zv8 paramZv8, @Zc5(Ze = "smtpEvent", ZS = "null") Zvl paramZvl) {
    this.Zn = paramZno;
    this.Zt = paramZia;
    this.Zb = paramZv5;
    this.ZG = paramZv8;
    this.Ze = paramZvl;
  }
  
  public static void ZJ(int paramInt) {
    Zd = paramInt;
  }
  
  public static int ZO() {
    return Zd;
  }
  
  public static int Zz() {
    int i = ZO();
    return (i == 0) ? 82 : 0;
  }
  
  static {
    if (ZO() == 0)
      ZJ(64); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */