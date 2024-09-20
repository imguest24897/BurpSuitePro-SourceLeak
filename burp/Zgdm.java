package burp;

import java.util.LinkedList;

public class Zgdm {
  public static Zsxd Zc(Zsxd paramZsxd, Zefx paramZefx) {
    LinkedList<Zg3d> linkedList = new LinkedList<>(paramZsxd.Zg());
    Zg3d zg3d = paramZsxd.ZG();
    Zefx zefx1 = paramZefx.ZM(zg3d.ZR().ZT());
    Zefx zefx2 = null;
    if (zg3d.ZL() != null)
      zefx2 = paramZefx.ZM(zg3d.ZL().ZT()); 
    Zrdj zrdj = new Zrdj(zefx1, zefx2, zg3d.Zb(), zg3d.Ze(), zg3d.ZQ(), zg3d.ZA(), zg3d.Zs(), zg3d.ZS(), zg3d.Zx());
    linkedList.add(zrdj);
    return new Zrbo(linkedList);
  }
  
  public static Zsxd Zg(Zsxd paramZsxd, Ze1w paramZe1w) {
    LinkedList<Zg3d> linkedList = new LinkedList<>(paramZsxd.Zg());
    Zefx zefx = paramZe1w.Zd();
    Zrdj zrdj = new Zrdj(zefx, null, Zvom.NOT_ISSUED, null, 0L, 0L, Zsxd.ZG, Zsxd.ZG, null);
    linkedList.add(zrdj);
    return new Zrbo(linkedList, paramZe1w.ZV(), paramZe1w.ZN());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */