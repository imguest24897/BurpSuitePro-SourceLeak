package burp;

public class Zwr extends Zni implements Zrp {
  @Zzvo(1)
  private boolean ZZ;
  
  @Zzvo(2)
  private boolean Zv;
  
  public Zwr(boolean paramBoolean1, boolean paramBoolean2) {
    this.ZZ = paramBoolean1;
    this.Zv = paramBoolean2;
  }
  
  public boolean ZJG() {
    return this.ZZ;
  }
  
  public void ZvM(boolean paramBoolean) {
    this.ZZ = paramBoolean;
  }
  
  public boolean ZJ6() {
    return this.Zv;
  }
  
  public void ZvC(boolean paramBoolean) {
    this.Zv = paramBoolean;
  }
  
  public String toString() {
    return Zmuq.ZX(this);
  }
  
  public boolean equals(Object paramObject) {
    if (Zewd.ZI(this, (Zgpi)paramObject))
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zwr zwr = (Zwr)paramObject;
    return Zmuq.ZJ(this, zwr);
  }
  
  public int hashCode() {
    return Zmuq.Zx(this);
  }
  
  public Zeu4<? extends Zrp> ZF() {
    return Zrp.ZR;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */