package burp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zle_ extends Zlew {
  public Zle_(Zsiw paramZsiw) {
    super(paramZsiw);
  }
  
  public Zrec ZY() {
    return this::lambda$bypass$4;
  }
  
  public int Zz() {
    return 2;
  }
  
  public List<Zl1r> Zy(Ze3n paramZe3n) {
    LinkedList<Zl1r> linkedList = new LinkedList();
    this.Za.Zt(linkedList);
    return linkedList;
  }
  
  private static boolean Zr(Zlou paramZlou1, Zlou paramZlou2) {
    return (paramZlou1.Zx == paramZlou2.Zx && Objects.equals(paramZlou1.ZA, paramZlou2.ZA));
  }
  
  private Zefx lambda$bypass$4(Zefx paramZefx) {
    List<Zlou> list = paramZefx.ZZ(Zle_::lambda$bypass$0);
    this.Za.Zc().stream().peek(Zle_::lambda$bypass$1).forEach(list::lambda$bypass$3);
    paramZefx = paramZefx.ZZ(new byte[0]);
    Iterator<Zlou> iterator = list.iterator();
    int i = Zlew.Zj();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      paramZefx = paramZefx.ZH(zlou);
      if (i == 0)
        break; 
    } 
    return paramZefx;
  }
  
  private static void lambda$bypass$3(List paramList, Zlou paramZlou) {
    paramList.removeIf(paramZlou::lambda$bypass$2);
  }
  
  private static boolean lambda$bypass$2(Zlou paramZlou1, Zlou paramZlou2) {
    return Zr(paramZlou1, paramZlou2);
  }
  
  private static void lambda$bypass$1(Zlou paramZlou) {
    Zuh.Zb(paramZlou.Zx.ZO(), Zqf.Zr);
  }
  
  private static boolean lambda$bypass$0(Zlou paramZlou) {
    return paramZlou.Zx.ZO();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zle_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */