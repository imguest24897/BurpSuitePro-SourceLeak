package burp;

public class Zm74 {
  private final Ze4y ZP;
  
  private final Zedm Zr;
  
  public Zm74(Ze4y paramZe4y, Zedm paramZedm) {
    this.ZP = paramZe4y;
    this.Zr = paramZedm;
  }
  
  public Zz6i ZJ(Zewm paramZewm) {
    if (paramZewm.Zv())
      return new Zz5q(); 
    if (paramZewm.ZN() == 1) {
      Ztx4 ztx4 = paramZewm.ZQ();
      return (Zz6i)((ztx4 instanceof Zbop) ? new Zlt7() : new Zsd_((Zr9_)ztx4, this.Zr, this.ZP));
    } 
    return new Zzz7(paramZewm, this.Zr);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm74.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */