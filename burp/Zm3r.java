package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Zm3r {
  private final Zgzg Zh;
  
  private final Zr69 ZN;
  
  private final Zr_4 Zi;
  
  public Zm3r(Zr69 paramZr69, Zr_4 paramZr_4) {
    this.ZN = paramZr69;
    String[] arrayOfString = Zg1q.Zp();
    this.Zh = new Zgzg(paramZr69, paramZr_4);
    this.Zi = paramZr_4;
    if (Zbqc.Zwu() == null)
      Zg1q.ZQ(new String[2]); 
  }
  
  public Optional<Zboh> ZO(List<Ze7n> paramList, Zz3o paramZz3o) {
    String[] arrayOfString = Zg1q.Zp();
    List<Zs49<?>> list = (new Zv8j(this.ZN, paramZz3o)).Zo(paramList);
    if (list.isEmpty())
      return Optional.empty(); 
    int i = Math.min(this.ZN.ZN(), list.size());
    ArrayList<Zlru> arrayList = new ArrayList(i);
    byte b = 0;
    while (b < i) {
      arrayList.add(this.Zi.<Zlru>ZH((Zsqx<Zlru>)list.get(b)));
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return Optional.of(this.Zi.<Zboh>ZH(new Zrxo(arrayList, this.Zh.Zx(paramZz3o, arrayList))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */