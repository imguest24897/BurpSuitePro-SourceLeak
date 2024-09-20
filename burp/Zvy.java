package burp;

import java.util.LinkedList;
import java.util.List;

public abstract class Zvy<T extends Zvy<T>> {
  protected Zz_4 Zp = Zz_4.URL;
  
  protected String Zz;
  
  protected String Zc;
  
  protected String Zu;
  
  protected final List<String> Zv = new LinkedList<>();
  
  private static String Zb;
  
  public T ZP(Zz_4 paramZz_4) {
    this.Zp = paramZz_4;
    return (T)this;
  }
  
  public T Zn(String paramString) {
    this.Zz = paramString;
    return (T)this;
  }
  
  public T ZR(String paramString) {
    this.Zc = paramString;
    return (T)this;
  }
  
  public T Zi(String paramString) {
    if (paramString != null)
      this.Zv.add(paramString); 
    return (T)this;
  }
  
  public T Ze(List<String> paramList) {
    this.Zv.addAll(paramList);
    return (T)this;
  }
  
  public T Zj(String paramString) {
    this.Zu = paramString;
    return (T)this;
  }
  
  public static void Zk(String paramString) {
    Zb = paramString;
  }
  
  public static String ZD() {
    return Zb;
  }
  
  static {
    if (ZD() != null)
      Zk("GOqwu"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */