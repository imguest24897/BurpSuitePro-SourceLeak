package burp;

import java.util.Optional;

public interface Ze5n extends Zg35<Ze5n> {
  public static final Zeu4<Ze5n> ZQ = new Zkzw();
  
  static Ze5n ZqG() {
    return ZN((short)-1, (short)-1);
  }
  
  static Ze5n Zg(short paramShort) {
    return ZN(paramShort, paramShort);
  }
  
  static Ze5n Z_(Zlve paramZlve) {
    Optional<?> optional = paramZlve.ZO().map(Zt70::ZC);
    short s1 = ((Short)optional.<Short>map(Zb6q::Ze).orElse(Short.valueOf((short)-1))).shortValue();
    short s2 = (paramZlve.ZJ().Ze()).ZJ;
    return ZN(s1, s2);
  }
  
  private static Ze5n ZN(short paramShort1, short paramShort2) {
    return new Zhv(paramShort1, paramShort2);
  }
  
  boolean Zp(Ze5n paramZe5n);
  
  boolean Zw(short paramShort1, short paramShort2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */