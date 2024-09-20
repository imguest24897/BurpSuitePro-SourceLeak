package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Zk2z implements Zras<Zm9l> {
  private final Zeu9 Zk;
  
  private final Zrp0 ZM;
  
  private final Zlru ZT;
  
  private final Zszw ZS;
  
  public Zk2z(Zeu9 paramZeu9, Zrp0 paramZrp0, Zlru paramZlru, Zszw paramZszw) {
    this.Zk = paramZeu9;
    this.ZM = paramZrp0;
    this.ZT = paramZlru;
    this.ZS = paramZszw;
  }
  
  public List<Zm9l> Zn() {
    Zbqc[] arrayOfZbqc = Zxf2.ZM();
    ArrayList<Zm9l> arrayList = new ArrayList();
    if (this.Zk != null)
      arrayList.add(Zm9l.Zp(this.Zk)); 
    Collection collection1 = this.ZM.Znr().getOrDefault(this.ZS, Collections.emptyList());
    List list = collection1.stream().filter(this::lambda$getCandidateRoomsForMatching$0).toList();
    boolean bool = list.isEmpty();
    Collection collection2 = bool ? collection1 : list;
    for (Zt8i zt8i : collection2) {
      if (!zt8i.Zsu().equals(this.Zk))
        arrayList.add(Zm9l.Zp(zt8i.Zsu())); 
      if (arrayOfZbqc != null)
        break; 
    } 
    if (this.ZT instanceof Zlfm)
      arrayList.add(Zm9l.Zp(this.ZM.Znq())); 
    return arrayList;
  }
  
  private boolean lambda$getCandidateRoomsForMatching$0(Zt8i paramZt8i) {
    return paramZt8i.ZsD().ZF(this.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */