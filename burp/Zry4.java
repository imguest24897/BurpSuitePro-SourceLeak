package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zry4 implements Zlic {
  public void Zf(Zstu paramZstu1, Zs68 paramZs681, Zstu paramZstu2, Zs68 paramZs682, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    Zrtg zrtg = new Zrtg(paramZstu1, paramZs681.Zk, paramZstu1.Zpu(), paramZstu2, paramZs682.Zk, paramZstu2.Zpu(), null);
    zrtg.Zz(Zy(paramZs681), Zy(paramZs682));
    Zebz.Zi(paramList1, paramList2, zrtg.ZT());
  }
  
  private List<int[]> Zy(Zs68 paramZs68) {
    return (List)((paramZs68.Zs - paramZs68.Zk < 2048) ? Collections.emptyList() : Arrays.asList(new int[][] { { 1024 + paramZs68.Zk, paramZs68.Zs - 1024 } }));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zry4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */