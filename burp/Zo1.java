package burp;

public class Zo1 {
  private final ThreadLocal<Zleg> ZK = new ThreadLocal<>();
  
  public Zleg Zg() {
    return this.ZK.get();
  }
  
  public void Zu(Zleg paramZleg) {
    this.ZK.set(paramZleg);
  }
  
  public void ZG() {
    this.ZK.remove();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zo1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */