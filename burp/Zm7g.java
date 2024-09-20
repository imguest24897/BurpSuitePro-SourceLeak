package burp;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zdz;
import net.portswigger.Zym;
import net.portswigger.Zyq;

public class Zm7g {
  static List<Zgd5> ZJ = List.of(Zgd5.ZJ);
  
  public static Zmgt ZF(String paramString) {
    return new Zmro(paramString);
  }
  
  public static Zmgt ZP(String paramString) {
    String str = Zlsd.ZL(paramString);
    Zdz zdz = new Zdz(new StringReader(str));
    Zyq zyq = zdz.Zd_().Zy();
    int[] arrayOfInt = Zmgt.ZK();
    Zym zym = (Zym)zyq.ZO(0);
    LinkedList<Zbiy> linkedList = new LinkedList();
    for (Object object : zym.ZV()) {
      linkedList.add(Zlsd.Ze(object));
      if (arrayOfInt == null)
        break; 
    } 
    return new Zmr8(linkedList);
  }
  
  public static Zmgt Zy(int paramInt) {
    return new Zmg5(paramInt);
  }
  
  public static Zmgt Zl() {
    return new Zmgy();
  }
  
  private static void lambda$givenAHost$0(Zzvx paramZzvx) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */