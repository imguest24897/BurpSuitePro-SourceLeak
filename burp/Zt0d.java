package burp;

import java.util.function.Supplier;
import javax.management.MBeanServer;

public class Zt0d {
  private final Zz6n ZF;
  
  private final Supplier<Long> Zz;
  
  public Zt0d(Zz6n paramZz6n, MBeanServer paramMBeanServer) {
    this.ZF = paramZz6n;
    this.Zz = paramMBeanServer::lambda$new$0;
  }
  
  public boolean Zj(Zt4o paramZt4o) {
    return (paramZt4o == Zt4o.USE) ? true : ((paramZt4o == Zt4o.ONLY_IF_HARDWARE_SUPPORTS && ZY()));
  }
  
  public boolean ZY() {
    int i = this.ZF.ZY();
    if (i < 2)
      return false; 
    long l1 = this.ZF.Zj();
    if (l1 >= 8065646592L)
      return true; 
    long l2 = ((Long)this.Zz.get()).longValue();
    return (l2 >= 8065646592L);
  }
  
  private static Long lambda$new$0(MBeanServer paramMBeanServer) {
    return Zlxx.ZE(Zl_6.TOTAL_PHYSICAL_MEMORY_SIZE, paramMBeanServer).orElse(Long.valueOf(Long.MAX_VALUE));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */