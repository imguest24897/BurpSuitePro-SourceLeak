package burp;

import java.util.Iterator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Ze7v {
  public static int ZV(Zbj5 paramZbj5) {
    int j = 0;
    Iterator<Zrho> iterator = paramZbj5.Zfz().iterator();
    int i = Zm9j.ZU();
    while (iterator.hasNext()) {
      Zrho zrho = iterator.next();
      j += ZI(zrho.ZAX());
      if (i != 0)
        break; 
    } 
    j -= 6 * paramZbj5.ZfG();
    return j;
  }
  
  private static int ZI(Ztfy paramZtfy) {
    switch (Zlyc.Zr[paramZtfy.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        return 5;
      case 8:
      case 9:
      case 10:
      case 11:
        return 4;
      case 12:
      case 13:
      case 14:
        return 3;
      case 15:
      case 16:
      case 17:
        return 2;
      case 18:
        return 1;
    } 
    Zuh.Zb(false, Zqf.Zk);
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */