package burp;

public class Zbn_ implements Zgtm {
  private final Ztp8 Zt;
  
  private final Zvou ZR;
  
  private final Runnable Zz;
  
  public Zbn_(Ztp8 paramZtp8, Zvou paramZvou, Runnable paramRunnable) {
    this.Zt = paramZtp8;
    Zbqc[] arrayOfZbqc = Ztmb.Zd();
    this.ZR = paramZvou;
    this.Zz = paramRunnable;
    if (Zbqc.Zwu() == null)
      Ztmb.Zi(new Zbqc[1]); 
  }
  
  public void Zr(int paramInt, String paramString1, String paramString2) {
    Zbqc[] arrayOfZbqc = Ztmb.Zd();
    this.ZR.apply(this.Zt.get()).ZR(paramInt, paramString1, paramString2);
    this.Zz.run();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public boolean ZS() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbn_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */