package burp;

import java.time.Duration;
import java.util.Objects;
import net.portswigger.Zm2;
import net.portswigger.Zup;

public interface Zmnh {
  static Zmnh ZP(Zz0n paramZz0n, Zzw4 paramZzw4, boolean paramBoolean, Zrud paramZrud, Zz9q paramZz9q, Runnable paramRunnable) {
    if (paramBoolean)
      return new Zegp(); 
    boolean bool = (paramZrud.ZN() && !paramZz0n.Zr().Za()) ? true : false;
    if (bool) {
      Objects.requireNonNull(paramZzw4);
      Zi7 zi7 = new Zi7(paramZzw4::ZF, paramRunnable::lambda$updateProcessorFor$0);
      Zxt2 zxt2 = new Zxt2(paramZz0n, zi7);
      if (zxt2.Zz()) {
        Zm2.ZC(Zrrh.SUITE_PROCESS_AUTO_UPDATE_FALLBACK);
        zxt2.Zf();
        return new Zray(paramZzw4, paramZz9q);
      } 
      return new Zeux(zxt2);
    } 
    return (Zmnh)(paramZz0n.Zr().ZN() ? new Zra5() : new Zray(paramZzw4, paramZz9q));
  }
  
  void ZJ(Zg1c paramZg1c, Zup paramZup);
  
  Duration Zb();
  
  Duration Zq();
  
  default void ZL() {}
  
  default Runnable Zy() {
    return Zmnh::lambda$postStartupTask$1;
  }
  
  private static void lambda$postStartupTask$1() {}
  
  private static Runnable lambda$updateProcessorFor$0(Runnable paramRunnable) {
    return paramRunnable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmnh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */