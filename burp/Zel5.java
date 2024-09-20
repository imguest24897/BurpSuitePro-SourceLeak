package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Zel5 implements Zroy {
  private final Zbnt ZG;
  
  private final Zr_4 Zp;
  
  private final long Zt;
  
  public Zel5(Zr_4 paramZr_4, Zbnt paramZbnt, long paramLong) {
    this.ZG = paramZbnt;
    this.Zp = paramZr_4;
    this.Zt = paramLong;
  }
  
  public List<Zsjh<?>> Zb(Zewx paramZewx, Zer0 paramZer0, List<Zer0> paramList) {
    ArrayList<Zsjh<?>> arrayList = new ArrayList();
    Iterator<Zer0> iterator = (new Zrhz(paramList, Collections.singletonList(paramZewx.ZG()))).ZJ().iterator();
    boolean bool = Zkoa.ZB();
    while (iterator.hasNext()) {
      Zer0 zer0 = iterator.next();
      Zkoa zkoa = new Zkoa(paramZewx, this.ZG, false, this.Zt, this.Zp.<Zmzk>ZH(paramZewx.ZW()));
      arrayList.addAll(zkoa.Z_(zer0));
      if (bool)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */