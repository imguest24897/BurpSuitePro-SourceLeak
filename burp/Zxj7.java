package burp;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

class Zxj7 {
  private final Zbnt ZF;
  
  private final Zey9 ZY;
  
  private final Zb0h ZC;
  
  private final ExecutorService Zk;
  
  private final ExecutorService Zl;
  
  private final ScheduledExecutorService ZL;
  
  private final Zkee ZO;
  
  private final Zb86 Zm;
  
  private final Zgb6 ZI;
  
  private final Supplier<Zl4w> ZJ;
  
  Zxj7(Zbnt paramZbnt, Zey9 paramZey9, Zb0h paramZb0h, Zkee paramZkee, Zb86 paramZb86, Zgb6 paramZgb6, Supplier<Zl4w> paramSupplier) {
    this.ZF = paramZbnt;
    this.ZY = paramZey9;
    this.ZC = paramZb0h;
    this.ZO = paramZkee;
    this.Zm = paramZb86;
    this.ZI = paramZgb6;
    this.ZJ = paramSupplier;
    this.Zk = Executors.newSingleThreadExecutor();
    this.Zl = Executors.newCachedThreadPool();
    this.ZL = Executors.newSingleThreadScheduledExecutor();
  }
  
  Ze3i Zp(Zbps paramZbps, List<Zmon> paramList, Zs_i paramZs_i, Zto1 paramZto1) {
    if (Zb12.ZG())
      return new Ze3i(Zbxj.ZN, Zr2e.Za); 
    Zglf zglf = new Zglf(paramZbps, this.ZF, this.ZY, this.ZC, this.Zk, this.Zl, this.ZL, this.ZO, this.Zm);
    LinkedList<Zglf> linkedList = new LinkedList();
    linkedList.add(zglf);
    if (paramList != null) {
      linkedList.addAll(paramList);
      linkedList.sort(Comparator.comparing(Zxj7::lambda$create$0));
    } 
    Zbdt zbdt = Zbdt.Zl((List)linkedList, paramZto1).Zq(this.ZI).Zk(this.ZJ).ZS(paramZs_i).Zu();
    return new Ze3i(zbdt, zglf);
  }
  
  private static Integer lambda$create$0(Zmon paramZmon) {
    return Integer.valueOf((paramZmon.ZsO()).componentId);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxj7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */