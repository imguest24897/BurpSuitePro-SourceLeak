package burp;

import java.util.ArrayList;
import java.util.List;

public class Zsl0 implements Zsx5 {
  private final Zg1j ZO;
  
  public Zsl0(Zg1j paramZg1j) {
    this.ZO = paramZg1j;
  }
  
  public List<Zlz8> Z_(String paramString, List<Zlz8> paramList) {
    Zbqc[] arrayOfZbqc = Zs6i.Zm();
    if (this.ZO.ZO().equals(paramString))
      return paramList; 
    ArrayList<Zlz8> arrayList = new ArrayList();
    for (Zlz8 zlz8 : paramList) {
      List<Zr8p> list = zlz8.ZLF().stream().filter(Zsl0::lambda$sanitise$0).toList();
      arrayList.add(new Zlz8(zlz8.ZLx(), list));
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  private static boolean lambda$sanitise$0(Zr8p paramZr8p) {
    return !(paramZr8p instanceof Zrg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsl0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */