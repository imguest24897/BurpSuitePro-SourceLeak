package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zzy;

class Zmjq {
  private static Zzy ZO(Zb9y paramZb9y) {
    switch (Zrmq.ZT[paramZb9y.ordinal()]) {
      case 1:
        return Zzy.ISSUE_FOUND;
      case 2:
        return Zzy.ISSUE_DELETED;
      case 3:
        return Zzy.ISSUE_UPDATED;
      case 4:
        return Zzy.ISSUE_UPDATED;
      case 5:
        return Zzy.ISSUE_UPDATED;
    } 
    Zuh.ZT(false, Zqf.Zk, paramZb9y.name());
    return Zzy.ISSUE_UPDATED;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmjq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */