package burp;

import java.util.Collections;

public class Ztx7 extends Ztx1 {
  private final Ztai ZR;
  
  public Ztx7(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Ztai paramZtai, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Collections.singletonList(Zlp9.FILE_UPLOAD_SSI), new Zt4z(Collections.singletonList(Zlp9.FILE_UPLOAD_SSI), paramZe3n, paramZbjl, new Zz50(paramZbjl, paramInt, paramZe3n.ZM().Zgv(), new Zrwd(paramZbjl.ZB()), paramZtai), paramZesv, paramZr_4, paramZbnt), new Zgi2());
    this.ZR = paramZtai;
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (super.ZD(paramZmaj) && Zl8g.Zo(paramZmaj.ZO) && this.ZR.ZS(Zzu2.SSI_INJECTION, Zr3z.COLLABORATOR_BASED));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */