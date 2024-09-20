package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zguq {
  private final Zkit ZV;
  
  private final Zzir Zu;
  
  private final List<Zkm9> Zx;
  
  private static int[] ZX;
  
  public Zguq(Zkit paramZkit, Zzir paramZzir) {
    this.ZV = paramZkit;
    int[] arrayOfInt = ZU();
    this.Zu = paramZzir;
    this.Zx = Arrays.asList(new Zkm9[] { new Zm1(paramZkit), new Ze1u(paramZkit), new Zrg4(paramZkit), new Zspc(paramZkit), new Zssx(paramZkit), new Zrrr(paramZkit) });
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public List<String> ZT() {
    int[] arrayOfInt = ZU();
    Ze_6 ze_6 = this.Zu.ZvB();
    if (ze_6 == null) {
      Zl3g.Zw(this.ZV, this.Zu);
      return Arrays.asList(Zqw.Zj);
    } 
    ArrayList<String> arrayList = new ArrayList();
    for (Zkm9 zkm9 : this.Zx) {
      arrayList.addAll(zkm9.ZE(ze_6));
      if (arrayOfInt == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zj(new int[5]); 
    return arrayList;
  }
  
  public static void Zj(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] ZU() {
    return ZX;
  }
  
  static {
    if (ZU() == null)
      Zj(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zguq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */