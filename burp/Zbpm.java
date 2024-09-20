package burp;

import java.util.LinkedList;
import java.util.List;

public class Zbpm implements Ze6i {
  private static final byte[] ZY = new byte[0];
  
  private final Zt2j ZX;
  
  public Zbpm(Zbip paramZbip) {
    this.ZX = new Zt2j(paramZbip);
  }
  
  public List<Zsp> Zm(int paramInt, Zefx paramZefx, boolean paramBoolean) {
    Zld zld = new Zld(paramBoolean);
    paramZefx.Zi(zld);
    boolean bool = zld.Zm();
    Zz0x zz0x = bool ? Zz0x.Zx(new byte[] { 4 }) : Zz0x.Zx(new byte[] { 4, 1 });
    LinkedList<Zsu> linkedList = new LinkedList();
    linkedList.add(new Zsu(paramInt, zz0x, zld.ZE));
    if (bool) {
      this.ZX.ZQ((List)linkedList, paramInt, zld.Zb);
      linkedList.add(new Zs3(paramInt, Zz0x.Zx(new byte[] { 1 }, ), ZY));
    } 
    return (List)linkedList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */