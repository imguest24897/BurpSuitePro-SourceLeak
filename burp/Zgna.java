package burp;

import java.time.Duration;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zgna extends Zgpi<Zgna>, Zgpq {
  public static final Zeu4<Zgna> ZF = new Zkpa();
  
  int ZPo();
  
  void Zzv(int paramInt);
  
  Zkcl ZNs();
  
  String ZPy();
  
  String ZP6();
  
  void Zon(String paramString);
  
  String ZPl();
  
  void Zou(String paramString);
  
  String ZPK();
  
  void Zod(String paramString);
  
  boolean ZPw();
  
  void ZIx(boolean paramBoolean);
  
  int ZPm();
  
  void ZzT(int paramInt);
  
  int ZdT();
  
  int Zdy();
  
  Zl5o ZPd();
  
  default Optional<Duration> ZPf() {
    return Optional.empty();
  }
  
  default void Zr(Duration paramDuration) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  Duration ZPB();
  
  void ZL(Duration paramDuration);
  
  default void Zm(Duration paramDuration) {
    ZL(ZPB().plus(paramDuration));
  }
  
  default void ZV(Zx6t paramZx6t, Zrbm paramZrbm) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgna.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */