package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zzh7 implements Zvov {
  private List<Zkv5> Zy = Collections.emptyList();
  
  private List<Zkv5> ZQ = Collections.emptyList();
  
  private Zc Zz;
  
  public List<Zkv5> Zq() {
    return this.Zy;
  }
  
  public List<Zkv5> Zi() {
    return this.ZQ;
  }
  
  public void Zi(Zc paramZc) {
    this.Zz = paramZc;
  }
  
  public void Zh(List<Zkv5> paramList) {
    paramList = Objects.<List<Zkv5>>requireNonNullElse(paramList, Collections.emptyList());
    if (paramList.isEmpty() && this.Zy.isEmpty())
      return; 
    this.Zy = paramList;
    if (this.Zz != null)
      this.Zz.ZX(); 
  }
  
  public void ZD(Zkv5 paramZkv5) {
    ArrayList<Zkv5> arrayList = new ArrayList<>(this.ZQ);
    arrayList.add(paramZkv5);
    ZW(Zb99.ZX(arrayList));
  }
  
  public void ZB(Zkv5 paramZkv5) {
    ArrayList<Zkv5> arrayList = new ArrayList<>(this.ZQ);
    arrayList.remove(paramZkv5);
    int i = Zzn5.Zu();
    ZW(Zb99.ZX(arrayList));
    if (Zbqc.Zwu() == null)
      Zzn5.ZW(++i); 
  }
  
  public void ZW(List<Zkv5> paramList) {
    this.ZQ = Objects.<List<Zkv5>>requireNonNullElse(paramList, Collections.emptyList());
    if (this.Zz != null)
      this.Zz.ZX(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */