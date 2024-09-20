package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zmh {
  private final List<Ztj1> ZP = new ArrayList<>();
  
  void Zm(Ztj1 paramZtj1) {
    Zuh.Zb(!this.ZP.contains(paramZtj1), Zqf.Zr);
    this.ZP.add(paramZtj1);
  }
  
  void ZC(Ztj1 paramZtj1) {
    this.ZP.remove(paramZtj1);
  }
  
  List<Ztj1> Ze() {
    List<Zti> list = Zz();
    Collections.sort(list);
    return list.isEmpty() ? Collections.<Ztj1>emptyList() : ZG(list);
  }
  
  private List<Zti> Zz() {
    return (List<Zti>)this.ZP.stream().filter(Zmh::lambda$tasksThatCanIncrease$0).map(Zti::new).collect(Collectors.toList());
  }
  
  private static List<Ztj1> ZG(List<Zti> paramList) {
    ArrayList<Ztj1> arrayList = new ArrayList();
    Zti zti = paramList.get(0);
    boolean bool = Zs3t.ZI();
    for (Zti zti1 : paramList) {
      if (zti.ZK(zti1) == 0)
        arrayList.add(zti1.ZU); 
      if (!bool)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean lambda$tasksThatCanIncrease$0(Ztj1 paramZtj1) {
    return (!paramZtj1.ZE() && !paramZtj1.ZF() && paramZtj1.Zx().Zn());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */