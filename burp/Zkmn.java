package burp;

import net.portswigger.Zkb;

public class Zkmn {
  private final long Zx;
  
  private static int ZD;
  
  private Zkmn(long paramLong) {
    this.Zx = paramLong;
  }
  
  static Zkmn Zm(long paramLong) {
    return new Zkmn(paramLong);
  }
  
  public static Zkmn ZA() {
    return new Zkmn(0L);
  }
  
  public static Zkmn Zr() {
    return new Zkmn(-1L);
  }
  
  public static Zkmn ZQ(Zski paramZski) {
    String str = ZT(paramZski);
    return str.isEmpty() ? Zr() : new Zkmn((new Zeun()).ZT(str).ZS());
  }
  
  private static String ZT(Zski paramZski) {
    StringBuilder stringBuilder = new StringBuilder();
    if (paramZski != null) {
      Zlit zlit = paramZski.ZyR();
      stringBuilder.append(zlit.Zd1());
      if (zlit.ZdH() != null)
        stringBuilder.append(Zkb.ZG(zlit.ZdH())); 
      if (paramZski.Zyb() != null)
        stringBuilder.append("#").append(paramZski.Zyb()); 
    } 
    return stringBuilder.toString();
  }
  
  public long ZT() {
    return this.Zx;
  }
  
  public Zkmn ZQ(Zkmn paramZkmn) {
    return (this.Zx == paramZkmn.Zx) ? Zm(this.Zx) : ZA();
  }
  
  public boolean ZX() {
    return (this.Zx == 0L);
  }
  
  public static void Zp(int paramInt) {
    ZD = paramInt;
  }
  
  public static int Zn() {
    return ZD;
  }
  
  public static int Zp() {
    int i = Zn();
    return (i == 0) ? 124 : 0;
  }
  
  static {
    if (Zn() != 0)
      Zp(62); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkmn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */