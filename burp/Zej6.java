package burp;

public class Zej6 {
  final long Zh;
  
  final boolean ZY;
  
  private final Zsm7 ZT;
  
  public Zej6(Zsm7 paramZsm7, Zzud paramZzud) {
    this.Zh = paramZzud.Ze();
    this.ZY = paramZzud.ZU();
    this.ZT = paramZsm7;
  }
  
  public boolean Zp(Zej6 paramZej6) {
    return paramZej6.ZY ? false : Zh(paramZej6.Zh);
  }
  
  public boolean Zh(long paramLong) {
    if (this.ZY)
      return true; 
    int i = (int)(this.ZT.Zb().toMillis() * 0.75D);
    return (this.Zh - paramLong >= i && this.Zh > this.ZT.Zb().toMillis() - 1000L);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zej6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */