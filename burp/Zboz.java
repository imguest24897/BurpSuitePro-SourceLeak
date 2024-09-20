package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zboz {
  private static final Map<Zvow, Zzi8> ZA = new HashMap<>();
  
  private final Zkkf ZE;
  
  private final Zr_4 ZZ;
  
  private final Zsvx ZP;
  
  public Zboz(Zkkf paramZkkf, Zgb6 paramZgb6, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.ZE = paramZkkf;
    this.ZZ = paramZr_4;
    this.ZP = new Zsvx(paramZbnt, paramZr_4, paramZgb6.ZU0());
  }
  
  synchronized List<Zzem> ZF(Zer0 paramZer0, int paramInt) {
    ArrayList<Zzem> arrayList = new ArrayList();
    Iterator<Zsjh<?>> iterator = this.ZP.ZS(paramZer0).iterator();
    int[] arrayOfInt = Zxco.Z_();
    while (iterator.hasNext()) {
      Zrsr zrsr;
      Zsjh<Ztkk> zsjh = (Zsjh)iterator.next();
      Ztkk ztkk = this.ZZ.<Ztkk>ZH(zsjh);
      switch (paramZer0.ZO()) {
        case 2:
          zrsr = Zsm6.ZB(paramZer0);
        case 1:
          arrayList.add(this.ZZ.<Zzem>ZH(new Ze80(this.ZE.ZX(paramInt), ztkk)));
          break;
      } 
      continue;
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zboz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */