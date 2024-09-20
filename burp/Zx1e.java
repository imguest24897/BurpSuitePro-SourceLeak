package burp;

public class Zx1e extends Zxsr implements Zgqa {
  Zx1e(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public int ZIk() {
    return this.Za.Zx(this, Zkz4.Ze);
  }
  
  public int ZID() {
    return this.Za.Zx(this, Zkz4.ZR);
  }
  
  public int ZIJ() {
    return this.Za.Zx(this, Zkz4.Zb);
  }
  
  public int ZI7() {
    return this.Za.Zx(this, Zkz4.ZD);
  }
  
  public boolean equals(Object paramObject) {
    String str = Zgrq.Zz();
    if (ZF(paramObject))
      return true; 
    if (paramObject instanceof Zgqa) {
      Zgqa zgqa = (Zgqa)paramObject;
      if (str != null)
        return (ZIk() != zgqa.ZIk()) ? false : ((ZID() != zgqa.ZID()) ? false : ((ZIJ() != zgqa.ZIJ()) ? false : ((ZI7() == zgqa.ZI7())))); 
    } 
    return false;
  }
  
  public int hashCode() {
    int i = ZIk();
    i = 31 * i + ZID();
    i = 31 * i + ZIJ();
    i = 31 * i + ZI7();
    String str = Zgrq.Zz();
    if (Zbqc.Zwu() == null)
      Zgrq.Zj("DKkCSc"); 
    return i;
  }
  
  public Zeu4<? extends Zgqa> ZF() {
    return Zf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx1e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */