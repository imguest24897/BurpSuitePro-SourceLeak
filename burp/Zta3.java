package burp;

public class Zta3 implements Zmxz {
  private final Zmxz ZG;
  
  public Zta3(Zmxz paramZmxz) {
    this.ZG = paramZmxz;
  }
  
  public Zl4m Zi(Zrdb paramZrdb1, Zrdb paramZrdb2, Zz1h paramZz1h) {
    byte b1 = paramZrdb1.Zaw();
    byte b2 = paramZrdb2.Zaw();
    byte b3 = paramZrdb1.Zak();
    byte b4 = paramZrdb2.Zak();
    return (b1 > b2) ? Zl4m.Zh : ((b1 < b2) ? Zl4m.Zf : ((b3 > b4) ? Zl4m.Zh : ((b3 < b4) ? Zl4m.Zf : this.ZG.Zi(paramZrdb1, paramZrdb2, paramZz1h))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zta3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */