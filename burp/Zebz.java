package burp;

import java.util.Collections;
import java.util.List;

public class Zebz {
  public static List<Ztu8> Zf(Zs68 paramZs68) {
    return (paramZs68.Zd == null) ? Collections.<Ztu8>emptyList() : paramZs68.Zd;
  }
  
  static boolean Zb(Zstu paramZstu, int paramInt) {
    return (paramZstu.Zp(paramInt) == 32 || paramZstu.Zp(paramInt) == 9);
  }
  
  static int Zc(Zstu paramZstu, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zgim.ZP();
    while (Zb(paramZstu, paramInt1) && paramInt1 < paramInt2) {
      paramInt1++;
      if (arrayOfInt != null)
        break; 
    } 
    return paramInt1;
  }
  
  public static void Zi(List<Zl1r> paramList1, List<Zl1r> paramList2, List<Ztsm> paramList) {
    int[] arrayOfInt = Zgim.ZP();
    for (Ztsm ztsm : paramList) {
      switch (ztsm.ZK) {
        case 1:
          paramList1.add(new Zl1r(ztsm.Zz[0], ztsm.Zz[1]));
        case 2:
          paramList2.add(new Zl1r(ztsm.Zz[2], ztsm.Zz[3]));
        case 3:
          paramList1.add(new Zl1r(ztsm.Zz[0], ztsm.Zz[1]));
          paramList2.add(new Zl1r(ztsm.Zz[2], ztsm.Zz[3]));
          break;
      } 
      continue;
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */