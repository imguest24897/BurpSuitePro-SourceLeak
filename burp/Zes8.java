package burp;

public class Zes8 {
  public static Ztyn ZB(Zgcs paramZgcs) {
    return ZE((Zgc0)paramZgcs.ZC().get(0));
  }
  
  public static Ztyn ZE(Zgc0 paramZgc0) {
    Zb3t zb3t = paramZgc0.ZC().get(0);
    if (Zl19.ZM(zb3t)) {
      Zgcu zgcu = (Zgcu)zb3t;
      return zgcu.Zd();
    } 
    if (Zl19.ZZ(zb3t)) {
      Zgc9 zgc9 = (Zgc9)zb3t;
      Zgc0 zgc0 = (Zgc0)zgc9.ZC().get(zgc9.ZC().size() - 1);
      if (Zl19.ZM(zgc0.ZC().get(0)))
        return ((Zgcu)zgc0.ZC().get(0)).Zd(); 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zes8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */