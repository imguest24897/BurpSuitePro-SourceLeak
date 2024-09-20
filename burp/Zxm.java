package burp;

public class Zxm implements Zmno {
  private final Zmno Ze;
  
  private final Zsge ZO;
  
  public Zxm(Zmno paramZmno) {
    this.Ze = paramZmno;
    this.ZO = new Zsge();
  }
  
  public void ZT(Zsxd paramZsxd) {
    this.Ze.ZT(paramZsxd);
    this.ZO.Z_(Zp(paramZsxd));
  }
  
  public boolean ZJ(Zsxd paramZsxd) {
    return (this.ZO.Zw(Zp(paramZsxd)) && this.Ze.ZJ(paramZsxd));
  }
  
  private static int Zp(Zsxd paramZsxd) {
    return paramZsxd.Zg().size();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */