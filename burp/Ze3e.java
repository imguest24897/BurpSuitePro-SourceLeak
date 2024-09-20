package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

class Ze3e implements Zr00 {
  private final Zkr6 ZA;
  
  private final Zr_4 Ze;
  
  Ze3e(Zkr6 paramZkr6, Zr_4 paramZr_4) {
    this.ZA = paramZkr6;
    this.Ze = paramZr_4;
  }
  
  public void Zp(Zmzk paramZmzk, Zstu paramZstu1, List<int[]> paramList, Zstu paramZstu2) {
    Zx(paramZmzk, paramZstu1, paramList, paramZstu2, null, true);
  }
  
  public void Zx(Zmzk paramZmzk, Zstu paramZstu1, List<int[]> paramList, Zstu paramZstu2, String paramString, boolean paramBoolean) {
    Zstu zstu = (paramZmzk == null) ? null : this.Ze.Zh(paramZmzk.toString());
    Zxpp zxpp = this.Ze.<Zxpp>ZH(new Zz1t(zstu, true));
    Zy(zxpp, paramZstu1, paramList, paramZstu2, paramString, paramBoolean);
  }
  
  public void Zr(Zxpp paramZxpp, Zstu paramZstu1, List<int[]> paramList, Zstu paramZstu2) {
    Zy(paramZxpp, paramZstu1, paramList, paramZstu2, null, true);
  }
  
  public void Zy(Zxpp paramZxpp, Zstu paramZstu1, List<int[]> paramList, Zstu paramZstu2, String paramString, boolean paramBoolean) {
    try {
      if (paramZstu1 != null) {
        Zm2.Zo(Zze0.SUITE_INTERFACES_SEND_TO_INTRUDER);
        this.ZA.Z_(paramZxpp, paramZstu1, paramList, paramZstu2, paramString, paramBoolean);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void Za() {
    this.ZA.Zfc();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */