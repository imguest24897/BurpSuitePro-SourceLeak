package burp;

import java.util.List;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zx4o {
  private final Ztbx ZY;
  
  private final Zx_5 Zj;
  
  private final Zzun ZC;
  
  private static int Zv;
  
  public Zx4o(Zx_5 paramZx_5, Ztbx paramZtbx, Zzun paramZzun) {
    this.Zj = paramZx_5;
    this.ZY = paramZtbx;
    this.ZC = paramZzun;
  }
  
  List<Zx57> ZE(Zsy paramZsy) {
    return this.ZC.ZC(paramZsy);
  }
  
  public boolean Zc() {
    return (this.ZC != null);
  }
  
  Zs68 Zi() {
    return this.ZY.Zt;
  }
  
  Ze3n Zn() {
    return this.ZY.ZX;
  }
  
  public void Zn(Consumer<Zx_5> paramConsumer) {
    paramConsumer.accept(this.Zj);
  }
  
  public static void ZW(int paramInt) {
    Zv = paramInt;
  }
  
  public static int Zh() {
    return Zv;
  }
  
  public static int Zm() {
    int i = Zh();
    return (i == 0) ? 69 : 0;
  }
  
  static {
    if (Zm() != 0)
      ZW(74); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */