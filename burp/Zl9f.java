package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.portswigger.Zkb;

public class Zl9f {
  private static final Ztog Zk = new Ztog(Collections.emptyList(), "");
  
  private final Map<String, Ztog> ZG = new HashMap<>();
  
  private String Zc;
  
  public boolean Zv(String paramString) {
    return this.ZG.containsKey(paramString);
  }
  
  public Ztog Zm(String paramString) {
    return this.ZG.getOrDefault(paramString, Zk);
  }
  
  public Collection<String> ZO() {
    return this.ZG.keySet();
  }
  
  public void Zl(String paramString, Ztog paramZtog) {
    this.ZG.put(paramString, paramZtog);
    if (this.Zc == null)
      this.Zc = paramString; 
  }
  
  public int ZJ() {
    return this.ZG.size();
  }
  
  byte[] Zj() {
    return Zkb.Zy(this.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */