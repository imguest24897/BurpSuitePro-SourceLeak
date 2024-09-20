package burp;

import java.util.List;

class Zv8j implements Zb95 {
  private final Zg17 ZF;
  
  private final Zg1h ZI;
  
  private final Zz3o Zu;
  
  Zv8j(Zr69 paramZr69, Zz3o paramZz3o) {
    this.ZF = new Zg17(paramZr69);
    String[] arrayOfString = Zg1q.Zp();
    this.ZI = new Zg1h(paramZr69);
    this.Zu = paramZz3o;
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public List<Zs49<?>> Zo(List<Ze7n> paramList) {
    return Zz3o.API_EDGE_TYPES.contains(this.Zu) ? this.ZI.Zo(paramList) : this.ZF.Zo(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */