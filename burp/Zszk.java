package burp;

import net.portswigger.Zen;

class Zszk {
  static String Zr(Zen paramZen) {
    return Zw(paramZen) + Zw(paramZen);
  }
  
  static String Zw(Zen paramZen) {
    return Zkvx.HTML_PAYLOAD_VALUE_ONE.ZY(paramZen.toString(), 10);
  }
  
  static String ZU(Zen paramZen) {
    return Zkvx.HTML_PAYLOAD_VALUE_TWO.ZY(paramZen.toString(), 10);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */