package burp;

import java.awt.event.HierarchyEvent;
import net.portswigger.Zm2;

public class Zr30 {
  public static void ZN(HierarchyEvent paramHierarchyEvent, Zbws paramZbws, Zzca paramZzca, Zrrh paramZrrh) {
    if (paramZbws == null)
      return; 
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L && paramZbws.isShowing() && paramZzca == Zzca.BAMBDA)
      Zm2.ZC(paramZrrh); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr30.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */