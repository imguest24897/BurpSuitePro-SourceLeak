package burp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Zrqp implements Zl5n {
  private static final List<Short> ZT = Arrays.asList(new Short[] { Short.valueOf((short)256), Short.valueOf((short)257), Short.valueOf((short)260), Short.valueOf((short)262), Short.valueOf((short)258), Short.valueOf((short)261), Short.valueOf((short)259) });
  
  private final Zs68 ZO;
  
  private final int ZF;
  
  private final Consumer<Integer> Zc;
  
  private static int ZH;
  
  public Zrqp(Zs68 paramZs68, int paramInt, Consumer<Integer> paramConsumer) {
    this.ZO = paramZs68;
    this.ZF = paramInt;
    this.Zc = paramConsumer;
  }
  
  public Ztk8 Z_() {
    int i = ZT(this.ZO.ZH) ? this.ZO.Zk : this.ZF;
    this.Zc.accept(Integer.valueOf(i));
    return Ztk8.ZD();
  }
  
  private static boolean ZT(Zk8m paramZk8m) {
    return !ZT.contains(Short.valueOf(paramZk8m.Zj));
  }
  
  public static void Zn(int paramInt) {
    ZH = paramInt;
  }
  
  public static int ZZ() {
    return ZH;
  }
  
  public static int Ze() {
    int i = ZZ();
    return (i == 0) ? 99 : 0;
  }
  
  static {
    if (Ze() == 0)
      Zn(39); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */