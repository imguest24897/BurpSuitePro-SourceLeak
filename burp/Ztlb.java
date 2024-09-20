package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztlb {
  private final Zmzk Z_;
  
  private final Zr59 ZJ;
  
  private final Ztno ZX;
  
  private static String Zc;
  
  Ztlb(Zmzk paramZmzk, Ztno paramZtno, Zsfe paramZsfe) {
    this.Z_ = paramZmzk;
    this.ZX = paramZtno;
    this.ZJ = paramZsfe.ZG();
  }
  
  public Iterable<Zxw0> ZO(Zl2x paramZl2x) {
    Function<Zeut, Boolean> function;
    Zbii zbii = this.ZJ.ZS();
    Zm8c zm8c = new Zm8c(this.Z_, paramZl2x, this.ZX, zbii);
    String str = ZT();
    switch (Zrjp.Zi[zbii.ordinal()]) {
      case 1:
        return Arrays.asList(new Zxw0[] { new Zk57(this.ZX, zbii, paramZl2x, this.Z_), new Zlkx(zm8c, null, null), new Zmed(zm8c, this.ZJ.Zy(), null), new Zlkx(zm8c, this.ZJ.Zy(), this.ZJ.Za()), new Zmed(zm8c, this.ZJ.Zy(), this.ZJ.Za()) });
      case 2:
        return Arrays.asList(new Zxw0[] { new Zk57(this.ZX, zbii, paramZl2x, this.Z_), new Zlkx(zm8c, null, null), new Zmed(zm8c, this.ZJ.Zy(), null) });
      case 3:
        function = this::lambda$from$0;
        return Arrays.asList(new Zxw0[] { new Zk57(this.ZX, zbii, paramZl2x, this.Z_, function), new Zlkx(zm8c, this.ZJ.Zy(), this.ZJ.Za()), new Zmed(zm8c, this.ZJ.Zy(), this.ZJ.Za()) });
    } 
    Zuh.ZT(false, Zqf.Zr, zbii.name());
    if (Zbqc.Zwu() == null)
      Zg("eoOyob"); 
    return Collections.emptyList();
  }
  
  private Boolean lambda$from$0(Zeut paramZeut) {
    return Boolean.valueOf((Arrays.equals((Object[])paramZeut.ZM(), (Object[])this.ZJ.Zy()) && Arrays.equals((Object[])paramZeut.Zn(), (Object[])this.ZJ.Za())));
  }
  
  public static void Zg(String paramString) {
    Zc = paramString;
  }
  
  public static String ZT() {
    return Zc;
  }
  
  static {
    if (ZT() != null)
      Zg("JRF9xb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztlb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */