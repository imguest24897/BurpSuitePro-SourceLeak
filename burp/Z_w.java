package burp;

import java.util.Objects;

public class Z_w extends Zni implements Zxph {
  @Zzvo(1)
  private final Ze93<Zm8f> Zi;
  
  private final Zr_4 ZV;
  
  public Z_w(Ze93<Zm8f> paramZe93, Zr_4 paramZr_4) {
    this.Zi = paramZe93;
    this.ZV = paramZr_4;
  }
  
  public <T extends Number> void Zd(T paramT, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this.Zi.Zl(paramT.shortValue(), new Z_6(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3));
  }
  
  public <T extends Number> void Zs(T paramT, byte[] paramArrayOfbyte) {
    short s = paramT.shortValue();
    Zm8f zm8f = this.Zi.Zz(s);
    if (Objects.nonNull(zm8f)) {
      zm8f.Zi(paramArrayOfbyte);
      this.Zi.Zl(s, zm8f);
    } 
  }
  
  public <T extends Number> void Zz(T paramT, byte[] paramArrayOfbyte) {
    short s = paramT.shortValue();
    Zm8f zm8f = this.Zi.Zz(s);
    if (Objects.nonNull(zm8f)) {
      zm8f.ZA(paramArrayOfbyte);
      this.Zi.Zl(s, zm8f);
    } 
  }
  
  public <T extends Number> byte[] ZK(T paramT) {
    Zm8f zm8f = this.Zi.Zz(paramT.shortValue());
    return Objects.isNull(zm8f) ? null : zm8f.ZoI();
  }
  
  public <T extends Number> byte[] ZF(T paramT) {
    Zm8f zm8f = this.Zi.Zz(paramT.shortValue());
    return Objects.isNull(zm8f) ? null : zm8f.Zo5();
  }
  
  public <T extends Number> byte[] Zm(T paramT) {
    Zm8f zm8f = this.Zi.Zz(paramT.shortValue());
    return Objects.isNull(zm8f) ? null : zm8f.Zom();
  }
  
  public <T extends Number> Zm8f Zo(T paramT) {
    return this.Zi.Zz(paramT.shortValue());
  }
  
  public boolean ZxD() {
    return (ZK(Integer.valueOf(0)) != null && ZF(Integer.valueOf(0)) != null);
  }
  
  public int Zxp() {
    return this.Zi.Zjp();
  }
  
  public byte[][][] ZxY() {
    return Zrqb.Zd(this);
  }
  
  public <T extends Number> void ZW(T paramT, Zm8f paramZm8f) {
    this.Zi.Zl(paramT.shortValue(), paramZm8f);
  }
  
  public <T extends Number> void Zc(T paramT, byte[][] paramArrayOfbyte) {
    ZW(paramT, Zlex.ZM(this.ZV, paramArrayOfbyte));
  }
  
  public <T extends Number> boolean Zg(T paramT) {
    return this.Zi.ZF(paramT.shortValue());
  }
  
  public Zeu4<? extends Zxph> ZF() {
    return Zb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */