package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zrrj extends Zrgr {
  Zrrj(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    boolean bool = false;
    if (paramZml3.Zd().ZXF() != null)
      try {
        this.ZN.reset(paramZml3.Zd().ZXF());
        bool = this.ZN.find();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    return (bool == ((ZC() == 0)));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */