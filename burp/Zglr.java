package burp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Zglr implements Zsnq {
  private final List<Zvs> ZV = (List<Zvs>)Arrays.<Zzu2>stream(Zzu2.values()).filter(Zglr::lambda$new$0).collect(Collectors.toList());
  
  public void ZY(Zxz8 paramZxz8) {
    paramZxz8.Zgn(true);
    paramZxz8.ZgR(false);
    paramZxz8.Zg_(false);
    paramZxz8.Zgx(false);
    Zzu2[] arrayOfZzu2 = Zzu2.values();
    int i = arrayOfZzu2.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zb_8.Zj();
    while (b < i) {
      Zzu2 zzu2 = arrayOfZzu2[b];
      if (!zzu2.ZD().contains(Zzua.PASSIVE))
        paramZxz8.ZX(zzu2, false); 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public boolean ZJ() {
    return false;
  }
  
  public List<Zvs> ZK() {
    return this.ZV;
  }
  
  public boolean Zr() {
    return false;
  }
  
  public void Zu(boolean paramBoolean, Zzdy paramZzdy1, Zzdy paramZzdy2, Zzdy paramZzdy3, Zzdy paramZzdy4, Zzdy paramZzdy5) {
    paramZzdy1.setEnabled(paramBoolean);
    paramZzdy2.setEnabled(false);
    paramZzdy3.setEnabled(false);
    paramZzdy4.setEnabled(false);
    paramZzdy5.setEnabled(paramBoolean);
  }
  
  private static boolean lambda$new$0(Zzu2 paramZzu2) {
    return (paramZzu2.ZG() && paramZzu2.ZD().contains(Zzua.PASSIVE));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */