package burp;

public class Zmlt implements Zkrr {
  private final Zsoh Zl;
  
  private final Ztai Zp;
  
  private final Zkl6 ZV;
  
  private final Ze3n ZG;
  
  private final Zlc3 Zk;
  
  public Zmlt(Zsoh paramZsoh, Ztai paramZtai, Zkl6 paramZkl6, Ze3n paramZe3n) {
    this.Zl = paramZsoh;
    this.Zp = paramZtai;
    this.ZV = paramZkl6;
    String str = Zlc3.ZD();
    this.ZG = paramZe3n;
    this.Zk = new Zlc3(paramZe3n);
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_FlashCrossdomainPolicy;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.Zp.Zr(Zzu2.FLASH_CROSS_DOMAIN_POLICY)) {
      byte[] arrayOfByte = this.ZV.Zs().ZO().Zf(new Zax(this.ZG.Za(), Zlc3.Zx)).Zr().ZiD();
      Zsxd zsxd = this.Zl.ZD(Ztao.Zc(paramZtpx, this.ZG.ZM(), arrayOfByte).Zz(false).ZA());
      Zstu zstu = Zsoh.ZA(zsxd);
      paramZz4_.Zz(this.Zk.Ze(arrayOfByte, zstu, Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.ZV.ZB()), System.currentTimeMillis()));
    } 
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */