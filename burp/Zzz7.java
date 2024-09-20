package burp;

public class Zzz7 implements Zz6i {
  private final Zewm Zb;
  
  private final Zedm Zp;
  
  public Zzz7(Zewm paramZewm, Zedm paramZedm) {
    this.Zb = paramZewm;
    this.Zp = paramZedm;
  }
  
  public boolean Zl() {
    String[] arrayOfString = Zedm.Zq();
    for (Ztx4 ztx4 : this.Zb.ZU()) {
      Zewm zewm = new Zewm(new Ztx4[] { ztx4 });
      if (!this.Zp.Zc(zewm))
        return false; 
      if (arrayOfString != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zedm.ZZ(new String[3]); 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzz7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */