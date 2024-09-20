package burp;

public class Zsxb implements Zkrr {
  private final Zsoh ZT;
  
  private final Ztai Zq;
  
  private final Zkl6 Zw;
  
  private final Ze3n ZA;
  
  private final Zzuf Zr;
  
  public Zsxb(Zsoh paramZsoh, Ztai paramZtai, Zkl6 paramZkl6, Ze3n paramZe3n) {
    this.ZT = paramZsoh;
    this.Zq = paramZtai;
    this.Zw = paramZkl6;
    this.ZA = paramZe3n;
    String[] arrayOfString = Zzuf.Zc();
    this.Zr = new Zzuf(paramZe3n);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_SilverlightCrossdomainPolicy;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    if (this.Zq.Zr(Zzu2.SILVERLIGHT_CROSS_DOMAIN_POLICY)) {
      byte[] arrayOfByte = this.Zw.Zs().ZO().Zf(new Zax(this.ZA.Za(), Zzuf.Zf)).Zr().ZiD();
      Zsxd zsxd = this.ZT.ZD(Ztao.Zc(paramZtpx, this.ZA.ZM(), arrayOfByte).Zz(false).ZA());
      Zstu zstu = Zsoh.ZA(zsxd);
      paramZz4_.Zz(this.Zr.ZN(arrayOfByte, zstu, Zbwc.Zt((Zlit)null, zstu, Zt0k.HTML_ANALYSIS, this.Zw.ZB()), System.currentTimeMillis()));
    } 
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsxb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */