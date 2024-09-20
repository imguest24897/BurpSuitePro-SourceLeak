package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgxz implements Zz1h {
  private final Zr_4 Z_;
  
  public static Zz1h Zw(Zr_4 paramZr_4) {
    return new Zgxz(paramZr_4);
  }
  
  private Zgxz(Zr_4 paramZr_4) {
    this.Z_ = paramZr_4;
  }
  
  public <T extends Zgpi<T>> Zefg<T> Zq(Zefg<T> paramZefg) {
    return Za(paramZefg).Zq(paramZefg);
  }
  
  public <T extends Zgpi<T>> List<T> Zq(List<T> paramList) {
    return Za(paramList).Zq(paramList);
  }
  
  private <T extends Zgpi<T>> Zz1h Za(List<T> paramList) {
    try {
      if (!paramList.isEmpty())
        try {
          if (paramList.get(0) instanceof Zni)
            try {
              return (Zz1h)(this.Z_.Zi() ? new Zkbq(this) : new Zxws(this));
            } catch (Zev3 zev3) {
              Zah.Zl(zev3, Zk_.UNEXPECTED);
              return ZS;
            }  
          return ZS;
        } catch (Zev3 zev3) {
          throw a(null);
        }  
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    return ZS;
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */