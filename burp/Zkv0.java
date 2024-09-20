package burp;

import java.util.Iterator;

public class Zkv0 {
  private final Zes3 Zh;
  
  private Ztgs Zf;
  
  private final Zxpd ZD;
  
  private static int[] ZS;
  
  public Zkv0(Zes3 paramZes3, Ztgs paramZtgs, Zxpd paramZxpd) {
    this.Zh = paramZes3;
    this.Zf = paramZtgs;
    int[] arrayOfInt = Zh();
    this.ZD = paramZxpd;
    if (Zbqc.Zwu() == null)
      Zb(new int[3]); 
  }
  
  public void ZH() {
    Zz61 zz61 = new Zz61(this.Zh.Zq());
    Iterator<Zb3t> iterator = zz61.iterator();
    int[] arrayOfInt = Zh();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      this.ZD.ZZ();
      zb3t.Zm(this.Zf);
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
  }
  
  public static void Zb(int[] paramArrayOfint) {
    ZS = paramArrayOfint;
  }
  
  public static int[] Zh() {
    return ZS;
  }
  
  static {
    if (Zh() == null)
      Zb(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkv0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */