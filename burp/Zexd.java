package burp;

public class Zexd extends Zexe<Zgc3> {
  public void Zh(Zgc3 paramZgc3) {
    Zgcs zgcs = (Zgcs)paramZgc3.ZI();
    Ztyn ztyn = Zes8.ZB(zgcs);
    boolean bool = Zexe.ZK();
    if (ztyn == null)
      return; 
    if (ztyn instanceof Zgcj) {
      Zgc7 zgc7 = ((Zgcj)ztyn).ZM();
      byte b = 0;
      for (Zb3t zb3t : paramZgc3.ZC()) {
        if (Zl19.ZR(zb3t))
          ZR(zb3t, b++, zgc7); 
        if (!bool)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */