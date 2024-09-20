package burp;

import java.util.List;

public class Zz30 implements Zlic {
  public void Zf(Zstu paramZstu1, Zs68 paramZs681, Zstu paramZstu2, Zs68 paramZs682, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    ZU(paramZstu1, paramZs681, paramZs682, paramList1);
    ZU(paramZstu2, paramZs682, paramZs681, paramList2);
  }
  
  private void ZU(Zstu paramZstu, Zs68 paramZs681, Zs68 paramZs682, List<Zl1r> paramList) {
    int[] arrayOfInt = Zgim.ZP();
    for (Ztbr ztbr : paramZs681.ZN) {
      if (!ZN(ztbr.Zqy(), paramZs682.ZN))
        Zr(ztbr, paramZstu, paramList); 
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private static void Zr(Ztbr paramZtbr, Zstu paramZstu, List<Zl1r> paramList) {
    paramList.add(new Zl1r(Zebz.Zc(paramZstu, paramZtbr.ZqE(), paramZtbr.ZqW()), paramZtbr.ZqW()));
  }
  
  private static boolean ZN(String paramString, List<Ztbr> paramList) {
    int[] arrayOfInt = Zgim.ZP();
    for (Ztbr ztbr : paramList) {
      if (paramString.equals(ztbr.Zqy()))
        return true; 
      if (arrayOfInt != null)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz30.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */