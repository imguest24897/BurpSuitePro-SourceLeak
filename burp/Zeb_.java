package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zeb_ extends Zebx {
  final Zq2 ZC;
  
  Zeb_(Zq2 paramZq2) {}
  
  public void Zk(Zmxt paramZmxt) {
    int[] arrayOfInt = Zl9l.ZF();
    Zefg<Zrdb> zefg = paramZmxt.Zqz().ZRn();
    try {
      byte b = 0;
      while (b < zefg.size()) {
        ((Zrdb)zefg.get(b)).ZV(this.ZC.Zr);
        b++;
        if (arrayOfInt != null)
          break; 
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.IGNORED);
    } 
    try {
      if (paramZmxt.Zqf().Z__() != null)
        this.ZC.Zr.Zp(paramZmxt); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  public void Zq(Zg6u paramZg6u) {
    try {
      if (paramZg6u.Zxo().Z__() != null)
        this.ZC.Zr.Zp(paramZg6u); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeb_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */