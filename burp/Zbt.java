package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import net.portswigger.Zen;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbt implements Iterable<Zer0> {
  private final Map<Integer, List<Zer0>> ZC = new HashMap<>();
  
  private Consumer<Zbt> Zs = Zbt::lambda$new$0;
  
  Zbt ZS(Consumer<Zbt> paramConsumer) {
    this.Zs = paramConsumer;
    return this;
  }
  
  synchronized List<Zer0> ZS(Zen paramZen) {
    int i = Zlp9.ZT();
    if (paramZen == null) {
      Zuh.Zb(false, Zqf.Zv);
      return Collections.emptyList();
    } 
    Ztt6 ztt6 = (new Zrh3(paramZen.ZO)).Zd();
    List list = this.ZC.get(Integer.valueOf(ztt6.ZK()));
    if (list == null)
      return Collections.emptyList(); 
    ArrayList<Zer0> arrayList = new ArrayList();
    for (Zer0 zer0 : list) {
      if (paramZen.toString().equals(zer0.Zx()))
        arrayList.add(zer0); 
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  synchronized void ZX(Set<String> paramSet, int paramInt) {
    List list = this.ZC.get(Integer.valueOf(paramInt));
    if (list != null)
      list.removeIf(paramSet::lambda$clearInteractionsFromCache$1); 
  }
  
  synchronized List<Zer0> ZF(Zen paramZen) {
    int i = Zlp9.Zr();
    if (paramZen == null) {
      Zuh.Zb(false, Zqf.Zv);
      return Collections.emptyList();
    } 
    Ztt6 ztt6 = (new Zrh3(paramZen.ZO)).Zd();
    List<Zer0> list = this.ZC.get(Integer.valueOf(ztt6.ZK()));
    if (list == null)
      return Collections.emptyList(); 
    ArrayList<Zer0> arrayList = new ArrayList();
    byte b = 0;
    while (b < list.size()) {
      if (paramZen.toString().equals(((Zer0)list.get(b)).Zx()) || Zbj1.ZQ(paramZen, list.get(b))) {
        arrayList.add(list.remove(b));
        b--;
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  public synchronized List<Zer0> Za(Ze3n paramZe3n) {
    List<Zer0> list = this.ZC.remove(Integer.valueOf(paramZe3n.ZM().Zgv()));
    return (list == null) ? Collections.<Zer0>emptyList() : list;
  }
  
  synchronized void ZJ(List<Zer0> paramList, boolean paramBoolean) {
    int i = Zlp9.Zr();
    for (Zer0 zer0 : paramList) {
      Ztt6 ztt6 = (new Zrh3(zer0.Zi())).Zd();
      if (ztt6 != null) {
        List<Zer0> list = this.ZC.computeIfAbsent(Integer.valueOf(ztt6.ZK()), Zbt::lambda$updateCache$2);
        list.add(zer0);
      } 
      if (i != 0)
        break; 
    } 
    if (paramBoolean)
      this.Zs.accept(this); 
  }
  
  public Iterator<Zer0> iterator() {
    return this.ZC.values().stream().flatMap(Collection::stream).iterator();
  }
  
  private static List lambda$updateCache$2(Integer paramInteger) {
    return new ArrayList();
  }
  
  private static boolean lambda$clearInteractionsFromCache$1(Set paramSet, Zer0 paramZer0) {
    return paramSet.contains(paramZer0.Zx());
  }
  
  private static void lambda$new$0(Zbt paramZbt) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */