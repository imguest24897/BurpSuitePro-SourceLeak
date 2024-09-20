package burp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Zm34 implements Zsnq {
  private final List<Zvs> Zd = (List<Zvs>)Arrays.<Zzu2>stream(Zzu2.values()).filter(Zm34::lambda$new$0).collect(Collectors.toList());
  
  public void ZY(Zxz8 paramZxz8) {
    Zzu2[] arrayOfZzu2 = Zzu2.values();
    int i = arrayOfZzu2.length;
    Zbqc[] arrayOfZbqc = Zb_8.Zj();
    byte b = 0;
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
    return this.Zd;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm34.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */