package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmfe {
  public static Ztr2 ZD(Zs66 paramZs66) {
    try {
      switch (Zlay.Za[paramZs66.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        
        case 6:
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        case 11:
        
        case 12:
        
        case 13:
        case 14:
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        case 20:
        case 21:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zk, paramZs66.toString());
    return new Zlzr();
  }
  
  public static Ztr2 Zj(Zefx paramZefx, int paramInt1, int paramInt2) {
    Zs66 zs66 = Zrq1.ZB(paramZefx, paramInt1, paramInt2);
    try {
      if (zs66 == Zs66.MANUAL_INSERTION_POINT)
        return new Zlzr(); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return ZD(zs66);
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmfe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */