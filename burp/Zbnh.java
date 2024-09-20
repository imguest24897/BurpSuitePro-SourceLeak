package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Zbnh implements Zrs_ {
  private final boolean ZP;
  
  private final Zerg ZV;
  
  private final Zgso Zu;
  
  Zbnh(boolean paramBoolean, Zerg paramZerg, Zbnt paramZbnt, Zkl6 paramZkl6, Zeew paramZeew, Zm6x paramZm6x) {
    this.ZP = paramBoolean;
    this.ZV = paramZerg;
    this.Zu = new Zgso(paramZbnt, paramZkl6, paramZerg, paramZeew, new Zsai(), paramZm6x);
  }
  
  public List<Component> Zi(Zmgv paramZmgv, Zlbp paramZlbp, Zgu3 paramZgu3, Zgsq paramZgsq, MouseEvent paramMouseEvent, Zzyl paramZzyl, Component paramComponent, boolean paramBoolean, int[] paramArrayOfint) {
    ArrayList<Zepk> arrayList = new ArrayList();
    if (this.ZV.ZH() != null)
      arrayList.add(Ztsr.ZW(paramZzyl, 132608)); 
    if (this.ZV.Za() != null)
      arrayList.add(Ztsr.ZW(paramZzyl, 132864)); 
    List<Zesk> list = this.ZV.ZM().ZY();
    if (list != null) {
      Zrpb zrpb = null;
      if (this.ZP) {
        switch (Zkqh.Zm[paramZgu3.ordinal()]) {
          case 1:
            zrpb = Zrpb.CONTEXT_MESSAGE_EDITOR_REQUEST;
            break;
          case 2:
            zrpb = Zrpb.CONTEXT_MESSAGE_EDITOR_RESPONSE;
            break;
        } 
      } else {
        switch (Zkqh.Zm[paramZgu3.ordinal()]) {
          case 1:
          
          case 2:
          
          default:
            break;
        } 
        zrpb = zrpb;
      } 
      if (zrpb != null) {
        Zmgv zmgv = Zsb5.Zj(paramZmgv, paramZlbp, paramZgu3, paramZgsq);
        List<Component> list1 = this.Zu.ZN(zrpb, paramMouseEvent, paramArrayOfint, zmgv);
        arrayList.addAll(list1);
      } 
    } 
    arrayList.add(new Zem9());
    if (paramZgu3 == Zgu3.HTTP_REQUEST && this.ZP) {
      arrayList.add(Ztsr.ZW(paramZzyl, 395264));
      arrayList.add(Ztsr.ZW(paramZzyl, 395328));
    } 
    if (!paramBoolean)
      arrayList.add(Ztsr.ZW(paramZzyl, 393728)); 
    arrayList.add(Ztsr.ZW(paramZzyl, 394048));
    if (this.ZP)
      arrayList.add(Ztsr.ZW(paramZzyl, 394112)); 
    if (paramZmgv != null) {
      List<Component> list1 = paramZmgv.Zof();
      if (list1 != null && !list1.isEmpty()) {
        arrayList.add(new Zem9());
        arrayList.addAll(list1);
      } 
    } 
    return (List)arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */