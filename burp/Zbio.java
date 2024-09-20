package burp;

import java.util.List;
import java.util.Objects;

public interface Zbio extends Zxss {
  public static final Zeu4<Zbio> ZL = new Zkz7();
  
  String ZxI();
  
  Zlit Zxa();
  
  List<Zsdr> Zxm();
  
  String ZxL();
  
  List<Ze7n> ZxP();
  
  default Zski ZFy() {
    return Zski.Zf(Zxa());
  }
  
  default Zeu4<? extends Zrp0> ZF() {
    return (Zeu4)ZL;
  }
  
  default Zlvj ZY() {
    return (new Zkkb<>(Zt(), Zxa())).ZH(ZxI()).ZO(Zxm()).Zz(ZxL()).Zg(ZxP()).Zl();
  }
  
  default boolean Zu(Zgyy paramZgyy) {
    if (paramZgyy instanceof Zbio) {
      Zbio zbio = (Zbio)paramZgyy;
      if (Objects.equals(ZxI(), zbio.ZxI()) && Objects.equals(Zxa(), zbio.Zxa()) && Objects.equals(Zxm(), zbio.Zxm()) && Objects.equals(ZxL(), zbio.ZxL()) && Objects.equals(ZxP(), zbio.ZxP()) && Zt() == zbio.Zt());
    } 
    return false;
  }
  
  default <T> T ZJ(Zzbv<T> paramZzbv) {
    return paramZzbv.ZD(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbio.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */