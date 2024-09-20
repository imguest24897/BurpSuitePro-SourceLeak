package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Zm3d implements Zsmu {
  private final List<Zoo> Zo = new ArrayList<>();
  
  private final List<Zoo> Za = new ArrayList<>();
  
  private final Map<Zoo, Zoo> ZE = new HashMap<>();
  
  public void Zp(Zgpi paramZgpi, int paramInt) {
    synchronized (this.Zo) {
      this.Zo.add(new Zoo(paramZgpi, paramInt));
    } 
  }
  
  public void Zb(Zgpi paramZgpi1, Zgpi paramZgpi2) {
    synchronized (this.Zo) {
      this.ZE.put(Zoo.Zb(paramZgpi1), Zj(paramZgpi2));
    } 
  }
  
  public void ZX(Zgpi paramZgpi) {
    synchronized (this.Zo) {
      Zoo zoo = Zj(paramZgpi);
      if (zoo != null)
        this.Za.add(zoo); 
    } 
  }
  
  public void Zz() {
    synchronized (this.Zo) {
      this.Zo.clear();
      this.Za.clear();
    } 
  }
  
  private Zoo Zj(Zgpi paramZgpi) {
    if (paramZgpi == null)
      return null; 
    int i = this.Zo.indexOf(Zoo.Zb(paramZgpi));
    return (i != -1) ? this.Zo.get(i) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */