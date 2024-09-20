package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zx_o {
  public static final Zx_o Zm = Zx_o::lambda$static$0;
  
  Zswo ZE(Zz28 paramZz28, Zs9z paramZs9z);
  
  default Optional<Zefx> ZC(Zs9z paramZs9z, Zefx paramZefx) {
    return Optional.of(paramZefx);
  }
  
  static Zx_o Zb(int paramInt) {
    if (paramInt == 0)
      return Zm; 
    switch ((byte)paramInt) {
      case 1:
        return new Zrqs();
      case 2:
        return new Zsox();
      case 3:
        return new Ze2v();
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return Zm;
  }
  
  private static Zswo lambda$static$0(Zz28 paramZz28, Zs9z paramZs9z) {
    return Zswo.STOP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */