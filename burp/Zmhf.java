package burp;

import java.util.Objects;

class Zmhf {
  static boolean Zm(Zb4i paramZb4i, Object paramObject) {
    String str = Zwh.Zgl();
    if (paramObject instanceof Zb4i) {
      Zb4i zb4i = (Zb4i)paramObject;
      if (str == null)
        return (Objects.equals(paramZb4i.ZM4(), zb4i.ZM4()) && Objects.equals(paramZb4i.ZM2(), zb4i.ZM2()) && Objects.equals(paramZb4i.ZMF(), zb4i.ZMF())); 
    } 
    return false;
  }
  
  static int ZF(Zb4i paramZb4i) {
    String str = Zwh.Zgl();
    if (Zbqc.Zwu() == null)
      Zwh.Zp("UqKXSc"); 
    return Objects.hash(new Object[] { paramZb4i.ZM4(), paramZb4i.ZM2(), paramZb4i.ZMF() });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */