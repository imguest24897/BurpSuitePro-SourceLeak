package burp;

import java.math.BigInteger;

public class Zwl extends Zni implements Ztju {
  private final Zr_4 Zz;
  
  @Zzvo(0)
  private Zstu Ze;
  
  public Zwl(Zr_4 paramZr_4, BigInteger paramBigInteger) {
    this.Zz = paramZr_4;
    boolean bool = Zlc9.Zi();
    ZA(paramBigInteger);
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public BigInteger ZtG() {
    return Zldz.ZW(this.Ze);
  }
  
  private void ZA(BigInteger paramBigInteger) {
    boolean bool = Zlc9.Zi();
    if (paramBigInteger == null) {
      this.Ze = null;
      if (bool) {
        byte[] arrayOfByte1 = paramBigInteger.toByteArray();
        this.Ze = this.Zz.ZZ(arrayOfByte1);
        return;
      } 
      return;
    } 
    byte[] arrayOfByte = paramBigInteger.toByteArray();
    this.Ze = this.Zz.ZZ(arrayOfByte);
  }
  
  public boolean equals(Object paramObject) {
    return Zldz.Z_(this, paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zwl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */