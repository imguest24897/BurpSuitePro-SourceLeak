package net.portswigger;

public class Zu_ implements Zlb {
  private final Runnable Zp;
  
  private final Znn ZN;
  
  private Zu_(Runnable paramRunnable, Znn paramZnn) {
    this.Zp = paramRunnable;
    this.ZN = paramZnn;
  }
  
  public void Zv(byte[] paramArrayOfbyte) {
    try {
      this.ZN.ZH(Zny.ZL(paramArrayOfbyte));
      this.Zp.run();
    } catch (Zrmv zrmv) {
      Zah.Zl(zrmv, Zk_.IGNORED);
    } 
  }
  
  public boolean ZM() {
    return this.ZN.Zz();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zu_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */