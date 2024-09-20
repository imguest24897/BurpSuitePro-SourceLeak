package burp;

public class Ztwb implements Ztb2 {
  private final int ZX;
  
  Ztwb(int paramInt) {
    this.ZX = paramInt;
  }
  
  public Zefx Zj(Zm7u paramZm7u) throws Zry8, Zry6 {
    try {
      if (paramZm7u.Ze() == 407)
        throw new Zry8(paramZm7u); 
    } catch (Zry8 zry8) {
      throw a(null);
    } 
    throw new Zry6(this.ZX, paramZm7u);
  }
  
  private static Zry8 a(Zry8 paramZry8) {
    return paramZry8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */