package burp;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Zbwh extends Zbws implements Zky2, Zedo {
  private final Consumer<Boolean> ZL;
  
  private final List<Zm30> ZK;
  
  private final Zt_1 Zo;
  
  Zbwh(boolean paramBoolean, List<String> paramList, Consumer<Boolean> paramConsumer) {
    this.ZL = paramConsumer;
    List<String> list1 = Zgzh.Zz();
    List<String> list2 = Zgzh.ZH();
    int[] arrayOfInt = Zr7c.Zv();
    this.ZK = new ArrayList<>(list1.size());
    List<String> list3 = (!paramBoolean && paramList.isEmpty()) ? list2 : paramList;
    for (String str : list1) {
      this.ZK.add(new Zm30(str, list3.contains(str), Zbwh::lambda$new$0));
      if (arrayOfInt != null)
        break; 
    } 
    paramConsumer.accept(Boolean.valueOf(list3.isEmpty()));
    this.Zo = new Zt_1(this);
    ZL(this.Zo);
    Zk(this);
  }
  
  List<String> ZU() {
    return (List<String>)this.ZK.stream().filter(Zm30::Zt).map(Zm30::ZR).collect(Collectors.toList());
  }
  
  void ZJ(boolean paramBoolean) {
    int[] arrayOfInt = Zr7c.Zv();
    for (Zm30 zm30 : this.ZK) {
      zm30.Zd(paramBoolean);
      if (arrayOfInt != null)
        break; 
    } 
    Zt2();
    this.ZL.accept(Boolean.valueOf(!paramBoolean));
  }
  
  public void Zt2() {
    this.Zo.fireTableDataChanged();
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      int i = convertRowIndexToModel(paramInt1);
      Zm30 zm30 = this.ZK.get(i);
      zm30.Zd(!zm30.Zt());
      this.ZL.accept(Boolean.valueOf(this.ZK.stream().noneMatch(Zm30::Zt)));
      this.Zo.fireTableRowsUpdated(i, i);
    } 
  }
  
  private static void lambda$new$0(Zm30 paramZm30, boolean paramBoolean) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */