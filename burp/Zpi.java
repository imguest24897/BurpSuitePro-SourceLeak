package burp;

public class Zpi extends Zni implements Zrrc {
  @Zzvo(0)
  private final int Zl;
  
  @Zzvo(1)
  private final int Zi;
  
  public Zpi(int paramInt1, int paramInt2) {
    this.Zl = paramInt1;
    this.Zi = paramInt2;
  }
  
  public int startOffset() {
    return this.Zl;
  }
  
  public int endOffset() {
    return this.Zi;
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Zpi(paramInt1, paramInt2);
  }
  
  public Zeu4<Zrrc> ZF() {
    return Zm;
  }
  
  public boolean equals(Object paramObject) {
    return Zl8v.ZJ(this, paramObject);
  }
  
  public int hashCode() {
    return Zl8v.ZE(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */