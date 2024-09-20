package burp;

public class Zeuv implements Zr4p {
  private final Zgcz Zv;
  
  private Ztyn ZU;
  
  private Ztyn ZH;
  
  private static boolean Zo;
  
  public Zeuv(Zgcz paramZgcz) {
    this.Zv = paramZgcz;
  }
  
  public boolean ZO(Zgcj paramZgcj) {
    boolean bool = ZK();
    if (this.Zv.ZV().equals(paramZgcj.ZV()))
      this.ZH = paramZgcj; 
    if (Zbqc.Zwu() == null)
      Zu(!bool); 
    return false;
  }
  
  public boolean Zo(Zgcz paramZgcz) {
    boolean bool = Zc();
    if (paramZgcz.ZV().equals(this.Zv.ZV()))
      this.ZU = paramZgcz; 
    if (bool)
      Zbqc.Zr(new Zbqc[1]); 
    return false;
  }
  
  public void Zi(Ztyn paramZtyn, Zgcq paramZgcq) {
    if (this.ZH != null)
      paramZgcq.Za(this.ZH); 
    if (this.ZU == null)
      paramZgcq.ZI(paramZtyn); 
  }
  
  public static void Zu(boolean paramBoolean) {
    Zo = paramBoolean;
  }
  
  public static boolean ZK() {
    return Zo;
  }
  
  public static boolean Zc() {
    boolean bool = ZK();
    return !bool;
  }
  
  static {
    if (Zc())
      Zu(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeuv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */