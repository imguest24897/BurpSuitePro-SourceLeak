package burp;

import javax.swing.tree.DefaultTreeModel;

public class Zkct {
  private final DefaultTreeModel Zv;
  
  private final boolean ZB;
  
  private final Ztzy Zh;
  
  public Zkct(DefaultTreeModel paramDefaultTreeModel, boolean paramBoolean, Ztzy paramZtzy) {
    this.Zv = paramDefaultTreeModel;
    this.ZB = paramBoolean;
    this.Zh = paramZtzy;
  }
  
  public void Zk(Zble paramZble) {
    int i = Zble.Zr();
    Zlah zlah = paramZble.Zg().ZVZ(this.ZB);
    boolean bool = zlah.ZR() ? Zb3i.ZE(zlah.ZRb(), zlah.ZRN()) : true;
    Zble zble = paramZble.Zw();
    while (zble != null && !zble.isRoot()) {
      Zmnm zmnm = zble.Zg();
      Zzgu zzgu = Zr(zble, paramZble, bool);
      if (zzgu.ZjL() == zmnm.ZOg())
        break; 
      int j = zmnm.ZVD(this.ZB);
      zmnm.ZB(zzgu.Zj7());
      int k = zmnm.ZVD(this.ZB);
      if (k == j)
        break; 
      this.Zv.nodeChanged(zble);
      this.Zh.Zu(zble);
      paramZble = zble;
      zble = zble.Zw();
      if (i == 0)
        break; 
    } 
  }
  
  private Zzgu Zr(Zble paramZble1, Zble paramZble2, int paramInt) {
    Zlah zlah = Zlah.Zr;
    int j = 9999;
    int i = Zble.ZI();
    for (Zble zble : paramZble1.ZT()) {
      Zmnm zmnm = zble.Zg();
      int k = (zble == paramZble2) ? paramInt : zmnm.ZVD(this.ZB);
      if (k < j) {
        j = k;
        zlah = zmnm.ZVZ(this.ZB);
      } 
      if (i != 0)
        break; 
    } 
    return new Zzgu(zlah, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkct.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */