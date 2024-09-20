package burp;

public class Zmht implements Zbj6 {
  private final Zbj6 ZL;
  
  private final Zsge Ze;
  
  public Zmht(Zbj6 paramZbj6) {
    this.ZL = paramZbj6;
    this.Ze = new Zsge();
  }
  
  public void ZJ(Zzl1 paramZzl1) {
    this.ZL.ZJ(paramZzl1);
    this.Ze.Z_(ZK(paramZzl1));
  }
  
  public boolean ZY(Zzl1 paramZzl1) {
    return (this.Ze.Zw(ZK(paramZzl1)) && this.ZL.ZY(paramZzl1));
  }
  
  private static int ZK(Zzl1 paramZzl1) {
    return paramZzl1.Z_O().Zj().Zg().size();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmht.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */