package burp;

public class Zzyy implements Zmxz {
  private final Zmxz ZW;
  
  public Zzyy(Zmxz paramZmxz) {
    this.ZW = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    byte b1 = paramZrdb1.Zaw();
    byte b2 = paramZrdb2.Zaw();
    Zbqc[] arrayOfZbqc = Zxll.ZT();
    byte b3 = paramZrdb1.Zak();
    byte b4 = paramZrdb2.Zak();
    if (b1 >= b2 && b3 >= b4)
      return this.ZW.Zi(paramZrdb1, paramZrdb2, paramZz1h); 
    if (b1 <= b2 && b3 <= b4)
      return Zl4m.Zf; 
    if (Zbqc.Zwu() == null)
      Zxll.ZS(new Zbqc[1]); 
    return Zl4m.ZX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzyy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */