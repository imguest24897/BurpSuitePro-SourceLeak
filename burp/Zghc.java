package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zghc {
  public static Zz1p ZY(Zmzk paramZmzk, Zstu paramZstu, byte paramByte, Zbnt paramZbnt) {
    return ZP(paramZmzk, paramZstu, paramByte, paramZbnt, Zghc::lambda$analyze$0);
  }
  
  public static Zz1p ZP(Zmzk paramZmzk, Zstu paramZstu, byte paramByte, Zbnt paramZbnt, Supplier<Boolean> paramSupplier) {
    Zuh.Zb(true, Zqf.Zr);
    Ztvi ztvi = Ztvi.Zn();
    if ((paramByte & 0x13) == 0)
      return ztvi.Zi(); 
    if (((Boolean)paramSupplier.get()).booleanValue())
      return null; 
    int i = Zgyj.Zi(paramZstu);
    if (i < 0)
      i = paramZstu.Zpu(); 
    ztvi.Za(i);
    if (((Boolean)paramSupplier.get()).booleanValue())
      return null; 
    int j = Zgyj.ZW(paramZstu, Math.max(0, i - 2));
    if (j == -1)
      j = paramZstu.Zpu(); 
    ztvi.ZZ(j);
    if (((Boolean)paramSupplier.get()).booleanValue())
      return null; 
    boolean bool = ((paramByte & 0x10) != 0) ? true : false;
    ArrayList<Integer> arrayList = ((paramByte & 0x8) != 0) ? new ArrayList() : null;
    ztvi.ZK(arrayList);
    List<String> list = Zgyj.ZX(paramZstu, 0, i, arrayList, bool, paramSupplier);
    ztvi.ZA(list);
    if (((Boolean)paramSupplier.get()).booleanValue() || list == null)
      return null; 
    Zk9o zk9o = (new Zxsc(paramZbnt)).ZK(paramZmzk, list);
    if (((Boolean)paramSupplier.get()).booleanValue())
      return null; 
    Zlqn zlqn = Zlqn.Zl();
    if ((paramByte & 0x2) != 0)
      zlqn = Zeex.Zk(list, j, paramZstu, paramSupplier); 
    return ((Boolean)paramSupplier.get()).booleanValue() ? null : ztvi.ZW(zk9o).ZQ(zlqn.Zg).ZB(zlqn.ZF).Zi();
  }
  
  private static Boolean lambda$analyze$0() {
    return Boolean.valueOf(false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zghc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */