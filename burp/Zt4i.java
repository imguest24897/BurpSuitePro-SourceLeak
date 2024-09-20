package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.browser.Zc4;
import net.portswigger.browser.Zel;

public class Zt4i<T extends Zt4i<T>> {
  private final Map<String, List<String>> ZW;
  
  private final List<Zzjv> Za;
  
  private final Zz3o ZT;
  
  private final String ZQ;
  
  private final Map<String, String> Zr;
  
  private final Zel ZN;
  
  private final List<Zrtj> Zy = new ArrayList<>();
  
  public Zt4i(Zz3o paramZz3o, String paramString, Map<String, String> paramMap) {
    this.ZT = paramZz3o;
    this.ZQ = paramString;
    this.Zr = paramMap;
    this.Za = new ArrayList<>();
    this.ZW = new HashMap<>();
    this.ZN = null;
  }
  
  public Zt4i(Zz3o paramZz3o, Zel paramZel) {
    this.ZT = paramZz3o;
    this.ZQ = paramZel.ZD();
    this.Zr = paramZel.ZM();
    this.Za = new ArrayList<>();
    this.ZW = paramZel.ZF();
    this.ZN = paramZel;
  }
  
  public T Zq(Zc4 paramZc4, String paramString) {
    String str = paramString.trim();
    if (!str.isEmpty())
      this.Za.add(Zzjv.Zx(paramZc4, str)); 
    return (T)this;
  }
  
  public T ZM(List<Zzjv> paramList) {
    this.Za.addAll(paramList);
    return (T)this;
  }
  
  public T ZJ(List<Zrtj> paramList) {
    this.Zy.addAll(paramList);
    return (T)this;
  }
  
  public Zm3y ZK() {
    return new Zm3y(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */