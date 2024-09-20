package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ztsm {
  public byte ZK;
  
  public int[] Zz = new int[4];
  
  Ztsm(byte paramByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.ZK = paramByte;
    this.Zz[0] = paramInt1;
    this.Zz[1] = paramInt2;
    this.Zz[2] = paramInt3;
    this.Zz[3] = paramInt4;
  }
  
  void ZT(int paramInt) {
    this.ZK = (byte)(this.ZK | 0x1);
    this.Zz[0] = Math.min(paramInt, this.Zz[0]);
    this.Zz[1] = Math.max(paramInt, this.Zz[1]);
  }
  
  void Zj(int paramInt) {
    this.ZK = (byte)(this.ZK | 0x2);
    this.Zz[2] = Math.min(paramInt, this.Zz[2]);
    this.Zz[3] = Math.max(paramInt, this.Zz[3]);
  }
  
  public static List<Zkv5>[] ZZ(List<Ztsm> paramList) {
    ArrayList<Zlsh> arrayList1 = new ArrayList();
    ArrayList<Zlsh> arrayList2 = new ArrayList();
    Iterator<Ztsm> iterator = paramList.iterator();
    int i = Zrtd.ZH();
    while (iterator.hasNext()) {
      Ztsm ztsm = iterator.next();
      switch (ztsm.ZK) {
        case 1:
          arrayList1.add(new Zlsh(ztsm.Zz[0], ztsm.Zz[1], Zlkk.COMPARER_DELETED));
        case 3:
          arrayList1.add(new Zlsh(ztsm.Zz[0], ztsm.Zz[1], Zlkk.COMPARER_MODIFIED));
          arrayList2.add(new Zlsh(ztsm.Zz[2], ztsm.Zz[3], Zlkk.COMPARER_MODIFIED));
        case 2:
          arrayList2.add(new Zlsh(ztsm.Zz[2], ztsm.Zz[3], Zlkk.COMPARER_ADDED));
          break;
      } 
      continue;
      if (i == 0)
        break; 
    } 
    return (List<Zkv5>[])new List[] { arrayList1, arrayList2 };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */