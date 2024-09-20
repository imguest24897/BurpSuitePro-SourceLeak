package burp;

public class Zexr extends Zexe<Zgc2> {
  public void ZK(Zgc2 paramZgc2) {
    Ztyn ztyn = null;
    Zrqv zrqv = new Zrqv(paramZgc2);
    boolean bool = Zexe.ZM();
    for (Zb3t zb3t : zrqv) {
      if (Zl19.ZG(zb3t))
        ztyn = ((Zgc7)zb3t).Zb(); 
      if (bool)
        break; 
    } 
    if (ztyn != null && paramZgc2.ZC().size() > 2)
      ZH(paramZgc2.ZC().get(1), ztyn); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */