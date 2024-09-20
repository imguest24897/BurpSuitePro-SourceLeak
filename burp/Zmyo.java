package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmyo implements Zroy {
  private final Zbnt Zn;
  
  private final Zr_4 Zw;
  
  private final long ZS;
  
  public Zmyo(Zr_4 paramZr_4, Zbnt paramZbnt, long paramLong) {
    this.Zn = paramZbnt;
    this.Zw = paramZr_4;
    this.ZS = paramLong;
  }
  
  public List<Zsjh<?>> Zb(Zewx paramZewx, Zer0 paramZer0, List<Zer0> paramList) {
    ArrayList<Zsjh<?>> arrayList = new ArrayList();
    Zer0 zer0 = Zf(paramList, Collections.singletonList(paramZewx.ZG()));
    if (zer0 != null) {
      Zkoa zkoa = new Zkoa(paramZewx, this.Zn, false, this.ZS, this.Zw.<Zmzk>ZH(paramZewx.ZW()));
      arrayList.addAll(zkoa.Z_(zer0));
    } 
    return arrayList;
  }
  
  private Zer0 Zf(List<Zer0> paramList, List<Zlp9> paramList1) {
    boolean bool = Zkoa.ZP();
    for (Zer0 zer0 : paramList) {
      if (zer0.ZO() != 1)
        continue; 
      if ((zer0.ZA() == Zb25.SMTP || zer0.ZA() == Zb25.SMTPS) && ZK(zer0, paramList1))
        return zer0; 
      if (!bool)
        break; 
    } 
    return null;
  }
  
  private boolean ZK(Zer0 paramZer0, List<Zlp9> paramList) {
    Ztt6 ztt6 = (new Zrh3(paramZer0.Zi())).Zd();
    if (ztt6 == null) {
      Zuh.Zb(false, Zqf.Zk);
      return false;
    } 
    return Zlp9.Za(paramList, ztt6.ZN());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmyo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */