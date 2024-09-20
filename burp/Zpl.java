package burp;

public class Zpl extends Zni implements Zro0 {
  @Zzvo(1)
  private final boolean Zc;
  
  @Zzvo(2)
  private final int ZA;
  
  @Zzvo(3)
  private final int ZS;
  
  @Zzvo(4)
  private int Zm;
  
  public Zpl(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    this.Zc = paramBoolean;
    this.ZA = paramInt1;
    this.ZS = paramInt2;
    this.Zm = paramInt3;
  }
  
  public Zeu4<? extends Zro0> ZF() {
    return ZK;
  }
  
  public boolean ZES() {
    return this.Zc;
  }
  
  public int ZEp() {
    return this.ZA;
  }
  
  public int ZE5() {
    return this.ZS;
  }
  
  public int ZEh() {
    return this.Zm;
  }
  
  public void Zsy(int paramInt) {
    this.Zm = paramInt;
  }
  
  public String toString() {
    return Zlhr.Zh(this);
  }
  
  public boolean equals(Object paramObject) {
    return Zlhr.ZW(this, paramObject);
  }
  
  public int hashCode() {
    return Zlhr.ZT(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */