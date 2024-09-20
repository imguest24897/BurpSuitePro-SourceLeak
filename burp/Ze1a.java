package burp;

public class Ze1a {
  private final Ze97 Zk;
  
  private final Zrbm Zl;
  
  private final Zbx7 ZP;
  
  private final Zz98 Zu;
  
  private final Zl5o ZQ;
  
  private Ztwh ZM;
  
  public Ze1a(Ze97 paramZe97, Zrbm paramZrbm, Zbx7 paramZbx7, Zz98 paramZz98, Ztwh paramZtwh, Zl5o paramZl5o) {
    this.Zk = paramZe97;
    this.Zl = paramZrbm;
    this.ZP = paramZbx7;
    this.Zu = paramZz98;
    this.ZM = paramZtwh;
    this.ZQ = (paramZl5o != null) ? paramZl5o : (new Zrb4()).ZU(null);
  }
  
  void ZX(Ztwh paramZtwh) {
    this.ZM = paramZtwh;
  }
  
  boolean Zs() {
    return (this.ZP.Zk() == 0) ? true : ((Ze() && Zo()));
  }
  
  boolean Zy() {
    return (this.Zu.ZP() && ZL() && Zo());
  }
  
  boolean Zr() {
    return (this.Zu.ZN() && ZL() && Zo());
  }
  
  boolean ZI() {
    boolean bool1 = (this.ZP.Zk() == 1) ? true : false;
    if (bool1)
      return false; 
    boolean bool2 = (this.ZP.Zk() > ZM()) ? true : false;
    return (this.Zu.Zr() || bool2);
  }
  
  private boolean Zo() {
    return (this.ZP.Zk() < ZM());
  }
  
  private int ZM() {
    return (this.ZM.Zw() && this.ZM.ZY() == 1) ? 1 : this.ZQ.Zri();
  }
  
  private boolean ZL() {
    return (this.Zk.Zb() > 0 || this.Zl.ZB());
  }
  
  private boolean Ze() {
    return (this.Zu.ZN() && this.Zu.ZP());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */