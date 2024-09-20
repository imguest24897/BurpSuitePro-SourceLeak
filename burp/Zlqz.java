package burp;

import java.util.ArrayList;
import java.util.List;

public class Zlqz implements Zzwk {
  private final List<Zgud> ZR;
  
  public Zlqz(List<Zgud> paramList) {
    this.ZR = paramList;
  }
  
  public void Zf(Zb3t paramZb3t) {
    String[] arrayOfString = Zrko.ZO();
    for (Zgud zgud : this.ZR) {
      if (!zgud.Zg())
        zgud.Zi(paramZb3t); 
      if (arrayOfString == null)
        break; 
    } 
    if (paramZb3t.ZO(Zxc6.TaintSource) != null && paramZb3t.ZO(Zxc6.TaintSink) != null) {
      Zm4y zm4y = new Zm4y(paramZb3t, paramZb3t);
      ZT(paramZb3t, zm4y);
    } 
  }
  
  public void Zc(Zb3t paramZb3t) {
    String[] arrayOfString = Zrko.ZO();
    for (Zgud zgud : this.ZR) {
      if (zgud.Zg())
        zgud.Zi(paramZb3t); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void ZT(Zesp paramZesp, Zgbi paramZgbi) {
    List<Zgbi> list = paramZesp.<List>ZO(Zxc6.TaintHops);
    if (list == null) {
      list = new ArrayList(1);
      paramZesp.Zm(Zxc6.TaintHops, list);
    } 
    list.add(paramZgbi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */