package burp;

public class Zldo implements Zt7b {
  private final Zt7b Zk;
  
  private volatile boolean ZA;
  
  public Zldo(Zt7b paramZt7b) {
    this.Zk = paramZt7b;
  }
  
  public void ZI() {
    this.ZA = true;
  }
  
  public void ZK() {
    this.ZA = false;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    if (!this.ZA)
      this.Zk.Zj(paramZgu3); 
  }
  
  public void ZU() {
    if (!this.ZA)
      this.Zk.ZU(); 
  }
  
  public void Zn() {
    if (!this.ZA)
      this.Zk.Zn(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */