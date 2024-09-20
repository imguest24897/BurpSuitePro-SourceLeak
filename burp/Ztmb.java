package burp;

public class Ztmb {
  private final Ztp8 Zt;
  
  private final Runnable Zz;
  
  private static Zbqc[] ZU;
  
  public Ztmb(Ztp8 paramZtp8, Runnable paramRunnable) {
    this.Zt = paramZtp8;
    this.Zz = paramRunnable;
  }
  
  public Zgtm ZQ(Zvou paramZvou) {
    return Zr(paramZvou, true);
  }
  
  public Zgtm Zr(Zvou paramZvou, boolean paramBoolean) {
    return paramBoolean ? new Zbn_(this.Zt, paramZvou, this.Zz) : new Zmaa();
  }
  
  public static void Zi(Zbqc[] paramArrayOfZbqc) {
    ZU = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zd() {
    return ZU;
  }
  
  static {
    if (Zd() != null)
      Zi(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */