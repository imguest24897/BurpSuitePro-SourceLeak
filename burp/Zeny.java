package burp;

public class Zeny {
  private int ZU = 0;
  
  private int Za = 0;
  
  private int ZM = 0;
  
  public boolean Zw() {
    return (this.ZU == 0);
  }
  
  public boolean Zy() {
    return (this.ZU < this.Za);
  }
  
  public boolean ZN() {
    return (this.ZU > 0 && this.ZM > 5);
  }
  
  public void Zk(int paramInt) {
    this.ZM = paramInt;
  }
  
  public void Zd(int paramInt) {
    this.ZU = paramInt;
  }
  
  public void Zm(int paramInt) {
    this.Za = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeny.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */