package burp;

import java.util.HashMap;
import java.util.Map;

public abstract class Zgc8 implements Zesp {
  private Map<Zxc6, Object> ZK;
  
  private static int Zc;
  
  public void Zm(Zxc6 paramZxc6, Object paramObject) {
    int i = ZX();
    if (this.ZK == null)
      this.ZK = new HashMap<>(1); 
    this.ZK.put(paramZxc6, paramObject);
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public <T> T ZO(Zxc6 paramZxc6) {
    return (T)((this.ZK == null) ? null : this.ZK.get(paramZxc6));
  }
  
  public <T> T Zw(Zxc6 paramZxc6) {
    if (this.ZK == null)
      return null; 
    Object object = this.ZK.remove(paramZxc6);
    if (this.ZK.isEmpty())
      this.ZK = null; 
    return (T)object;
  }
  
  public static void ZJ(int paramInt) {
    Zc = paramInt;
  }
  
  public static int ZE() {
    return Zc;
  }
  
  public static int ZX() {
    int i = ZE();
    return (i == 0) ? 22 : 0;
  }
  
  static {
    if (ZE() == 0)
      ZJ(93); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgc8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */