package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zk29 extends Zk2i {
  static final Collection<Byte> ZA = List.of(Byte.valueOf((byte)4), Byte.valueOf((byte)3), Byte.valueOf((byte)2), Byte.valueOf((byte)1), Byte.valueOf((byte)-1));
  
  Zk29(Collection<Zrdb> paramCollection, Zr1x paramZr1x) {
    super(paramCollection, paramZr1x);
    boolean bool = Zsh9.ZX();
    Iterator<Byte> iterator = ZA.iterator();
    while (iterator.hasNext()) {
      byte b = ((Byte)iterator.next()).byteValue();
      ArrayList<Zrdb> arrayList = new ArrayList();
      for (Zrdb zrdb : paramCollection) {
        try {
          if (zrdb.ZaJ() == b)
            arrayList.add(zrdb); 
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
          paramZr1x.ZV();
        } 
        if (!bool)
          break; 
      } 
      try {
        if (arrayList.size() == 0)
          continue; 
      } catch (Exception exception) {
        throw b(null);
      } 
      this.Zp.add(Zr(arrayList));
      if (!bool)
        break; 
    } 
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk29.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */