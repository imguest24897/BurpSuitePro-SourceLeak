package burp;

public class Zman implements Zr4p {
  private final Zgcj ZF;
  
  private Ztyn Zp;
  
  private boolean Zn;
  
  public Zman(Zgcj paramZgcj) {
    this.ZF = paramZgcj;
  }
  
  public boolean ZO(Zgcj paramZgcj) {
    if (paramZgcj.ZV() != null && paramZgcj.ZV().equals(this.ZF.ZV()))
      this.Zp = paramZgcj; 
    return false;
  }
  
  public boolean Zo(Zgcz paramZgcz) {
    if (paramZgcz.ZV() != null && paramZgcz.ZV().equals(this.ZF.ZV()))
      this.Zn = true; 
    return false;
  }
  
  public void Zi(Ztyn paramZtyn, Zgcq paramZgcq) {
    if (this.Zp != null)
      paramZgcq.Za(this.Zp); 
    if (!this.Zn)
      paramZgcq.ZI(paramZtyn); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zman.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */