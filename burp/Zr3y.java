package burp;

import java.util.Objects;

class Zr3y {
  static boolean ZG(Zelu paramZelu, Object paramObject) {
    Zbqc[] arrayOfZbqc = Zxay.Z_();
    if (paramObject instanceof Zelu) {
      Zelu zelu = (Zelu)paramObject;
      if (arrayOfZbqc != null)
        return (Objects.equals(paramZelu.ZDj(), zelu.ZDj()) && Objects.equals(paramZelu.ZD7(), zelu.ZD7()) && Objects.equals(paramZelu.ZDA(), zelu.ZDA())); 
    } 
    return false;
  }
  
  static int Zs(Zelu paramZelu) {
    Zbqc[] arrayOfZbqc = Zxay.Z_();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
    return Objects.hash(new Object[] { paramZelu.ZDj(), paramZelu.ZD7(), paramZelu.ZDA() });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */