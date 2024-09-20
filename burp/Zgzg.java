package burp;

import java.util.LinkedList;
import java.util.List;

public class Zgzg {
  private final Zr69 Zg;
  
  private final int Zv;
  
  private final Zr_4 ZD;
  
  private static String Zu;
  
  public Zgzg(Zr69 paramZr69, Zr_4 paramZr_4) {
    this.Zg = paramZr69;
    this.Zv = paramZr69.ZM();
    String str = Zn();
    this.ZD = paramZr_4;
    if (Zbqc.Zwu() == null)
      ZB("M9Y9K"); 
  }
  
  public List<Zr8t> Zx(Zz3o paramZz3o, List<Zlru> paramList) {
    String str = Zn();
    LinkedList<Zr8t> linkedList = new LinkedList();
    boolean bool1 = !this.Zg.ZQ() ? true : false;
    boolean bool2 = (paramZz3o != Zz3o.FORM && paramZz3o != Zz3o.SUBMIT) ? true : false;
    if (bool1 && bool2)
      linkedList.add(this.ZD.<Zr8t>ZH(new Zvff())); 
    if (paramList.size() > this.Zv)
      linkedList.add(this.ZD.<Zr8t>ZH(new Zxab(this.Zg.Zl()))); 
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
    return linkedList;
  }
  
  public static void ZB(String paramString) {
    Zu = paramString;
  }
  
  public static String Zn() {
    return Zu;
  }
  
  static {
    if (Zn() == null)
      ZB("rP1rNc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */