package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import net.portswigger.Zen;

public class Zzow {
  private final Map<Zlp9, Zen> ZP = new LinkedHashMap<>();
  
  public void Zv(Zlp9 paramZlp9, Zen paramZen) {
    this.ZP.put(paramZlp9, paramZen);
  }
  
  public Zen ZP(Zlp9 paramZlp9) {
    return this.ZP.get(paramZlp9);
  }
  
  public Zen Zb(int paramInt) {
    return (new ArrayList<>(this.ZP.values())).get(paramInt);
  }
  
  public int Zd() {
    return this.ZP.size();
  }
  
  public Zlp9 Zp(byte[] paramArrayOfbyte) {
    int i = Zlp9.ZT();
    for (Map.Entry<Zlp9, Zen> entry : this.ZP.entrySet()) {
      if (((Zen)entry.getValue()).ZL(paramArrayOfbyte))
        return (Zlp9)entry.getKey(); 
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  public Collection<Zen> ZL() {
    return this.ZP.values();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzow.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */