package burp;

public class Ztxq extends Ztx1 {
  private final Ztai Zv;
  
  public Ztxq(Zbjl paramZbjl, int paramInt, Ze3n paramZe3n, Zesv paramZesv, Ztai paramZtai, Zr_4 paramZr_4, Zbnt paramZbnt) {
    super(Zb99.Zh(new Zlp9[] { Zlp9.FILE_UPLOAD_PDF_JAVASCRIPT, Zlp9.FILE_UPLOAD_PDF_NO_JAVASCRIPT }, ), new Zt4j(paramZe3n, paramZbjl, new Zkbd(paramZtai, paramZbjl, paramInt, paramZe3n.ZM().Zgv(), new Zrwd(paramZbjl.ZB())), paramZesv, paramZr_4, paramZbnt), new Zgiq());
    this.Zv = paramZtai;
    if (Zbqc.Zwu() == null)
      Zg2_.Zv(new int[2]); 
  }
  
  public boolean ZD(Zmaj paramZmaj) {
    return (this.Zv.ZS(Zzu2.XSS_STORED, Zr3z.COLLABORATOR_BASED) && super.ZD(paramZmaj));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztxq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */