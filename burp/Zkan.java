package burp;

public class Zkan {
  private final Zsxd ZN;
  
  private final Zsxd ZC;
  
  private Zkan(Zsxd paramZsxd1, Zsxd paramZsxd2) {
    this.ZN = paramZsxd1;
    this.ZC = paramZsxd2;
  }
  
  public static Zkan Zq(Zsxd paramZsxd) {
    return new Zkan(paramZsxd, paramZsxd);
  }
  
  public static Zkan ZB(Zsxd paramZsxd1, Zsxd paramZsxd2) {
    return new Zkan(paramZsxd1, paramZsxd2);
  }
  
  public Zsxd Zj() {
    return this.ZN;
  }
  
  public Zsxd ZK() {
    return this.ZC;
  }
  
  public boolean Zh() {
    return (!this.ZN.ZX().isEmpty() && this.ZN.ZG().Zb() != Zvom.RESPONSE_RECEIVED);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkan.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */