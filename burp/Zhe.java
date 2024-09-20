package burp;

public class Zhe extends Zni implements Zgqa {
  @Zzvo(1)
  private final int Zh;
  
  @Zzvo(2)
  private final int ZO;
  
  @Zzvo(3)
  private final int Zj;
  
  @Zzvo(4)
  private final int ZI;
  
  Zhe(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zh = paramInt1;
    this.ZO = paramInt2;
    this.Zj = paramInt3;
    this.ZI = paramInt4;
  }
  
  public int ZIk() {
    return this.Zh;
  }
  
  public int ZID() {
    return this.ZO;
  }
  
  public int ZIJ() {
    return this.Zj;
  }
  
  public int ZI7() {
    return this.ZI;
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
    null = this.Zh;
    null = 31 * null + this.ZO;
    null = 31 * null + this.Zj;
    return 31 * null + this.ZI;
  }
  
  public Zeu4<? extends Zgqa> ZF() {
    return Zf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */