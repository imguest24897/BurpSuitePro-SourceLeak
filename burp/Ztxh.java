package burp;

import java.util.Collections;

public class Ztxh extends Ztx1 {
  private final Ztai Zm;
  
  public Ztxh(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Ztai paramZtai, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Collections.singletonList(Zlp9.FILE_UPLOAD_PHP), new Zt4j(paramZe3n, paramZbjl, new Zl7m(paramZbjl, paramInt, paramZe3n.ZM().Zgv(), new Zrwd(paramZbjl.ZB()), paramZtai), paramZesv, paramZr_4, paramZbnt), new Zgi2());
    this.Zm = paramZtai;
    if (Zbqc.Zwu() == null)
      Zg20.ZR("VSex9b"); 
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && this.Zm.ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.COLLABORATOR_BASED));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */