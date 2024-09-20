package burp;

import java.util.EnumSet;

public interface Zs98 extends Zgpi<Zs98>, Zkj1 {
  public static final Zeu4<Zs98> Zs = new Zk3s();
  
  Zzcq<Zeo2> ZC6();
  
  Zzcq<Zvo1> ZCB();
  
  Zqu ZCE();
  
  int ZC3();
  
  void Zzy(int paramInt);
  
  int ZCD();
  
  void Zz4(int paramInt);
  
  Zefg<Zez3> ZCe();
  
  default EnumSet<Zln4> ZC7() {
    Zqu zqu = ZCE();
    EnumSet<Zln4> enumSet = EnumSet.noneOf(Zln4.class);
    if (zqu.Zoy())
      enumSet.add(Zln4.LINKS); 
    if (zqu.Zo1())
      enumSet.add(Zln4.FORMS); 
    return enumSet;
  }
  
  default EnumSet<Ze48> ZCZ() {
    Zqu zqu = ZCE();
    EnumSet<Ze48> enumSet = EnumSet.noneOf(Ze48.class);
    if (zqu.ZoR())
      enumSet.add(Ze48.EVERYTHING); 
    if (zqu.ZoG())
      enumSet.add(Ze48.ITEM_ITSELF); 
    if (zqu.Zo7())
      enumSet.add(Ze48.SAME_DOMAIN); 
    if (zqu.Zo6())
      enumSet.add(Ze48.LOOK_AT_SCOPE); 
    return enumSet;
  }
  
  default Zmet ZGk() {
    return ZCE().ZGk();
  }
  
  default Zl34 ZGY() {
    return ZCE().ZGY();
  }
  
  default Zl34 ZGp() {
    return ZCE().ZGp();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs98.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */