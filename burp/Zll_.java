package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zll_ extends Zlln {
  Zll_() {
    super(new Zxgh());
  }
  
  public Zlln ZZ(Zsp paramZsp) throws Zzt7 {
    try {
      if (paramZsp.Zi == Zmcm.HEADERS)
        throw new Zzt7(Zlxi.PROTOCOL_ERROR); 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    return this;
  }
  
  public Zlln Zs(Zsp paramZsp) {
    Zuh.ZT(false, Zqf.Zr, paramZsp.toString());
    return this;
  }
  
  public Zrsv Zl() {
    return Zrsv.CLOSED;
  }
  
  public String toString() {
    return Zl().toString();
  }
  
  private static Zzt7 a(Zzt7 paramZzt7) {
    return paramZzt7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zll_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */