package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.portswigger.Z_n;
import net.portswigger.Zg7;

public class Zsmj implements Zg7 {
  private final List<Z_n> ZK;
  
  public Zsmj(Zzb4 paramZzb4) {
    ArrayList<Z_n> arrayList = new ArrayList();
    Zbqc[] arrayOfZbqc = Zbfm.Zf();
    Zzu2[] arrayOfZzu2 = Zzu2.values();
    int i = arrayOfZzu2.length;
    byte b = 0;
    while (b < i) {
      Zzu2 zzu2 = arrayOfZzu2[b];
      if (!zzu2.Zq()) {
        Zree zree = paramZzb4.ZR(zzu2);
        if (zree != null && zree != Zree.Zx)
          arrayList.add(new Z_n(Integer.toString(zzu2.ZS()), zree.ZZV(), zree.ZZA(), zree.ZZH(), zree.ZZK(), zree.ZZF(), zzu2.Zo())); 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    this.ZK = Collections.unmodifiableList(arrayList);
  }
  
  public List<Z_n> Zu() {
    return this.ZK;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */