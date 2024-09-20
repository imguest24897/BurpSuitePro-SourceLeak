package burp;

import java.util.Objects;

public class Z_6 extends Zni implements Zm8f {
  @Zzvo(1)
  private Zstu Zt;
  
  @Zzvo(2)
  private Zstu Zx;
  
  @Zzvo(3)
  private Zstu Zv;
  
  public Z_6(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this.Zt = Zyf.Zy(paramArrayOfbyte1);
    this.Zx = Zyf.Zy(paramArrayOfbyte2);
    int[] arrayOfInt = Zlex.Z_();
    this.Zv = Zyf.Zy(paramArrayOfbyte3);
    if (Zbqc.Zwu() == null)
      Zlex.Zz(new int[5]); 
  }
  
  public byte[] ZoI() {
    return Objects.isNull(this.Zt) ? null : this.Zt.ZiD();
  }
  
  public byte[] Zo5() {
    return Objects.isNull(this.Zx) ? null : this.Zx.ZiD();
  }
  
  public byte[] Zom() {
    return Objects.isNull(this.Zv) ? null : this.Zv.ZiD();
  }
  
  public Zeu4<? extends Zm8f> ZF() {
    return ZZ;
  }
  
  public boolean ZoJ() {
    return (Zom() == null && Zo5() == null && ZoI() == null);
  }
  
  public void Zov() {
    this.Zt = null;
    this.Zx = null;
  }
  
  public void Zi(byte[] paramArrayOfbyte) {
    this.Zt = Zyf.Zy(paramArrayOfbyte);
  }
  
  public void ZA(byte[] paramArrayOfbyte) {
    this.Zx = Zyf.Zy(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */