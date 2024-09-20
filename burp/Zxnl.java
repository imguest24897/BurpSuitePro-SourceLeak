package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zxnl {
  private final Zr_4 ZP;
  
  private final Zbnt ZY;
  
  private final Zgb6 Zg;
  
  public Zxnl(Zr_4 paramZr_4, Zbnt paramZbnt, Zgb6 paramZgb6) {
    this.ZP = paramZr_4;
    this.ZY = paramZbnt;
    this.Zg = paramZgb6;
  }
  
  public List<IBurpCollaboratorInteraction> Zw(List<Zer0> paramList) {
    ArrayList<IBurpCollaboratorInteraction> arrayList = new ArrayList();
    Iterator<Zer0> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Zzgk.Zy();
    while (iterator.hasNext()) {
      Zer0 zer0 = iterator.next();
      for (Zsjh<Ztkk> zsjh : ZP(zer0).Z_(zer0)) {
        Zrsr zrsr;
        Ztxo ztxo;
        Ztkk ztkk = this.ZP.<Ztkk>ZH(zsjh);
        switch (zer0.ZO()) {
          case 2:
            zrsr = Zsm6.ZB(zer0);
            ztxo = Zsm6.ZX(zer0);
          case 1:
            arrayList.add(Zs(ztkk));
            break;
        } 
        continue;
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  private static IBurpCollaboratorInteraction Zs(Ztkk paramZtkk) {
    return Zrms.ZE(paramZtkk);
  }
  
  private static IBurpCollaboratorInteraction Zf(Zrsr paramZrsr, Ztkk paramZtkk, String paramString) {
    return Zrms.ZM(paramZtkk, paramZrsr, paramString);
  }
  
  private Zkoa ZP(Zer0 paramZer0) {
    Zmzk zmzk = Zsm6.ZN(paramZer0, this.ZP, this.Zg.ZU0());
    return new Zkoa(Zsm6.Z_, this.ZY, false, 0L, zmzk);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */