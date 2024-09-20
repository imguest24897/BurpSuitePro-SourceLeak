package burp;

import java.util.Comparator;
import java.util.List;

class Zeq8 {
  private final Ztn0 Zu;
  
  private final Zedy ZD;
  
  private final Zzjc ZZ;
  
  private final Zr4a Zc;
  
  Zeq8(Ztn0 paramZtn0, Zedy paramZedy, Zzjc paramZzjc, Zr4a paramZr4a) {
    this.Zu = paramZtn0;
    this.ZD = paramZedy;
    this.ZZ = paramZzjc;
    this.Zc = paramZr4a;
  }
  
  void Zv(List<Zkvj> paramList) {
    Zr(paramList, false);
  }
  
  void Zo(List<Zkvj> paramList) {
    Zr(paramList, true);
  }
  
  void Zn(List<Zkvj> paramList) {
    paramList.forEach(this::lambda$duplicateItems$0);
  }
  
  void Zj(List<Zkvj> paramList) {
    paramList.stream().map(Zkvj::ZL6).sorted(Comparator.reverseOrder()).forEach(this::lambda$removeItems$1);
  }
  
  private void Zr(List<Zkvj> paramList, boolean paramBoolean) {
    paramList.forEach(paramBoolean::lambda$setEnabledStateOnItems$2);
    int[] arrayOfInt = paramList.stream().mapToInt(Zkvj::ZL6).sorted().toArray();
    this.Zu.fireTableRowsUpdated(arrayOfInt[0], arrayOfInt[arrayOfInt.length - 1]);
    this.Zc.Zi();
  }
  
  private static void lambda$setEnabledStateOnItems$2(boolean paramBoolean, Zkvj paramZkvj) {
    paramZkvj.ZO(paramBoolean);
  }
  
  private void lambda$removeItems$1(Integer paramInteger) {
    this.ZZ.ZP(paramInteger.intValue());
    this.Zu.fireTableRowsDeleted(paramInteger.intValue(), paramInteger.intValue());
  }
  
  private void lambda$duplicateItems$0(Zkvj paramZkvj) {
    this.ZZ.Zb(this.ZD.ZX(paramZkvj.ZLy()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeq8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */