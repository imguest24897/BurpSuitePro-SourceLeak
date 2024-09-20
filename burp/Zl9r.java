package burp;

class Zl9r extends Zl9l {
  public byte Zf = 0;
  
  public byte ZA = 0;
  
  public int ZK = 9999;
  
  final Zgd Zu;
  
  private Zl9r(Zgd paramZgd) {}
  
  protected boolean ZF(Zez3 paramZez3) {
    Zs3g zs3g = new Zs3g(this.Zu.ZB, paramZez3);
    int i = zs3g.ZN();
    if (i == 9999)
      return false; 
    if (i < this.ZK) {
      this.Zf = zs3g.ZM();
      this.ZA = zs3g.Zk();
      this.ZK = i;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */