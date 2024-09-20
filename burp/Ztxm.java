package burp;

import java.util.Collections;

public class Ztxm extends Ztx1 {
  private final Ztai ZI;
  
  private static String[] Zg;
  
  public Ztxm(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Ztai paramZtai, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Collections.singletonList(Zlp9.FILE_UPLOAD_SVG), new Zt4j(paramZe3n, paramZbjl, new Zt5n(paramZbjl, paramInt, paramZe3n.ZM().Zgv(), new Zrwd(paramZbjl.ZB()), paramZtai), paramZesv, paramZr_4, paramZbnt), new Zgi2());
    this.ZI = paramZtai;
    if (Zbqc.Zwu() == null)
      ZT(new String[1]); 
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (this.ZI.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) && super.ZD(paramZmaj));
  }
  
  public static void ZT(String[] paramArrayOfString) {
    Zg = paramArrayOfString;
  }
  
  public static String[] ZL() {
    return Zg;
  }
  
  static {
    if (ZL() != null)
      ZT(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */