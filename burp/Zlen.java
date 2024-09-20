package burp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Zlen extends Zlew {
  public Zlen(Zsiw paramZsiw) {
    super(paramZsiw);
  }
  
  public Zrec ZY() {
    return this::lambda$bypass$0;
  }
  
  public int Zz() {
    return 1;
  }
  
  public List<Zl1r> Zy(Ze3n paramZe3n) {
    LinkedList<Zl1r> linkedList = new LinkedList();
    this.Za.Z_(linkedList);
    return linkedList;
  }
  
  private Zefx lambda$bypass$0(Zefx paramZefx) {
    List<Zlou> list = paramZefx.Zc();
    Iterator<Zlou> iterator = this.Za.Zc().iterator();
    int i = Zlew.Zj();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      for (Zlou zlou1 : list) {
        if (zlou1 != null && zlou.ZA.equalsIgnoreCase(zlou1.ZA))
          paramZefx = paramZefx.ZK(zlou1.ZA, zlou1.Zx, ""); 
        if (i == 0)
          break; 
      } 
      if (i == 0)
        break; 
    } 
    return paramZefx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */