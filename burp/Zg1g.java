package burp;

import java.util.Objects;

class Zg1g {
  static boolean ZA(Zr8 paramZr8, Object paramObject) {
    int i = Zs6f.ZG();
    if (paramZr8.ZF(paramObject))
      return true; 
    if (paramObject instanceof Zr8) {
      Zr8 zr8 = (Zr8)paramObject;
      if (i != 0)
        return (Objects.equals(paramZr8.ZNj(), zr8.ZNj()) && Objects.equals(paramZr8.ZND(), zr8.ZND())); 
    } 
    return false;
  }
  
  static int Zz(Zr8 paramZr8) {
    int i = Zs6f.ZG();
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
    return Objects.hash(new Object[] { paramZr8.ZNj(), paramZr8.ZND() });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */