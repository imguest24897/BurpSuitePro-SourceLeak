package burp;

public class Zedi implements Zmgf {
  private final Zxpd Zb;
  
  private static Zbqc[] ZE;
  
  public Zedi(Zxpd paramZxpd) {
    this.Zb = paramZxpd;
  }
  
  public boolean Ze(Zkr1<Zmv4> paramZkr1, int paramInt, Zrn9 paramZrn9) {
    Zmv4 zmv42;
    Zmv4 zmv41 = paramZkr1.ZP();
    byte b = 2;
    Zbqc[] arrayOfZbqc = ZV();
    do {
      zmv42 = paramZkr1.ZZ(b++);
    } while (zmv42 != null && zmv42 instanceof Zlik);
    if (zmv42 == null || zmv42.ZP() < paramInt)
      return false; 
    this.Zb.ZZ();
    Zb3t zb3t1 = paramZrn9.Zp().get(paramInt - 1);
    Zgbi zgbi = paramZrn9.Zx().get(zb3t1);
    Ztyn ztyn = (Ztyn)zgbi.ZX();
    Zb3t zb3t2 = zmv41.ZM();
    Zz61 zz61 = new Zz61(zb3t2);
    for (Zb3t zb3t : zz61) {
      if (Zl19.Zf(zb3t)) {
        if (Zh((Zgcn)zb3t, ztyn))
          return true; 
        break;
      } 
      if (Zf(zb3t, ztyn))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zh(Zgcn paramZgcn, Ztyn paramZtyn) {
    Zgcc zgcc = (Zgcc)paramZgcn.ZC().get(1);
    return ((zgcc.ZK()).ZE == Zgho.PLUS_EQUALS) ? false : ((Zl19.Zr(paramZgcn.ZU()) && ((Zgcu)paramZgcn.ZU().ZC().get(0)).Zd() == paramZtyn));
  }
  
  private boolean Zf(Zb3t paramZb3t, Ztyn paramZtyn) {
    return (Zl19.ZO(paramZb3t) && paramZb3t.Zk() && Zl19.ZM(paramZb3t.ZC().get(0)) && ((Zgcu)paramZb3t.ZC().get(0)).Zd() == paramZtyn);
  }
  
  public static void ZO(Zbqc[] paramArrayOfZbqc) {
    ZE = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZV() {
    return ZE;
  }
  
  static {
    if (ZV() != null)
      ZO(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */