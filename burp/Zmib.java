package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Ziw;

class Zmib {
  public static List<Ziw> Zc(int paramInt) {
    ArrayList<Ziw> arrayList = new ArrayList();
    if ((paramInt & 0x1) != 0)
      arrayList.add(Ziw.IN_BAND); 
    if ((paramInt & 0x2) != 0)
      arrayList.add(Ziw.OUT_OF_BAND); 
    if ((paramInt & 0x4) != 0)
      arrayList.add(Ziw.INFILTRATOR_BAND); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmib.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */