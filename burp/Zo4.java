package burp;

public class Zo4 {
  public static final Zo4 ZL = new Zo4(Zmjk.SELECTION, true, true, true);
  
  private final Zmjk Ze;
  
  private boolean Zg;
  
  private boolean ZN;
  
  private boolean ZX;
  
  public Zo4(Zmjk paramZmjk, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.Ze = paramZmjk;
    this.Zg = paramBoolean1;
    this.ZN = paramBoolean2;
    this.ZX = paramBoolean3;
  }
  
  public Zmjk Z_() {
    return this.Ze;
  }
  
  public boolean Zc() {
    return this.Ze.ZI();
  }
  
  public boolean ZO() {
    return this.Zg;
  }
  
  public void Zk(boolean paramBoolean) {
    if (!Zc())
      this.Zg = paramBoolean; 
  }
  
  public boolean Zk() {
    return this.ZN;
  }
  
  public void ZX(boolean paramBoolean) {
    if (!Zc())
      this.ZN = paramBoolean; 
  }
  
  public boolean Zn() {
    return this.ZX;
  }
  
  public void ZY(boolean paramBoolean) {
    if (!Zc())
      this.ZX = paramBoolean; 
  }
  
  public boolean Zt() {
    if (!Zc()) {
      Zk(!ZO());
      return true;
    } 
    return false;
  }
  
  public boolean ZR() {
    if (!Zc()) {
      ZX(!Zk());
      return true;
    } 
    return false;
  }
  
  public boolean Zu() {
    ZY(!Zn());
    return true;
  }
  
  public Zo4 ZD() {
    return new Zo4(this.Ze, this.Zg, this.ZN, this.ZX);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zo4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */