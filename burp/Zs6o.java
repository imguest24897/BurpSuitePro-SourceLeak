package burp;

import java.util.List;
import java.util.Objects;

public interface Zs6o extends Zxss {
  public static final Zeu4<Zs6o> ZO = new Zklq();
  
  default <T> T ZJ(Zzbv<T> paramZzbv) {
    return paramZzbv.ZS(this);
  }
  
  default Zlvj ZY() {
    return (new Zkkb<>(Zt(), ZFy())).ZH(Zy()).Zg(Zm()).Zz(Zf()).Zl();
  }
  
  default boolean Zu(Zgyy paramZgyy) {
    if (paramZgyy instanceof Zs6o) {
      Zs6o zs6o = (Zs6o)paramZgyy;
      if (Objects.equals(ZFy(), zs6o.ZFy()) && Objects.equals(Zy(), zs6o.Zy()) && Objects.equals(Zf(), zs6o.Zf()) && Objects.equals(ZS(), zs6o.ZS()));
    } 
    return false;
  }
  
  default Zz3o Zt() {
    return Zz3o.API;
  }
  
  String Zy();
  
  String Zf();
  
  Zr2a ZS();
  
  private List<Ze7n> Zm() {
    return ZS().Zta().stream().map(Zz_b::ZZg).toList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */