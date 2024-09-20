package burp;

import java.util.Objects;

class Zlpz {
  static boolean ZA(Zg0d paramZg0d, Object paramObject) {
    int i = Zld4.Zb();
    if (paramObject instanceof Zg0d) {
      Zg0d zg0d = (Zg0d)paramObject;
      if (i != 0)
        return Objects.equals(paramZg0d.ZDR(), zg0d.ZDR()); 
    } 
    return false;
  }
  
  static int ZD(Zg0d paramZg0d) {
    return Objects.hash(new Object[] { paramZg0d.ZDR() });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlpz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */