package burp;

import java.util.Objects;

public class Zxhx extends Zxsr implements Zxph {
  public Zxhx(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public <T extends Number> void Zd(T paramT, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    ZSq().Zl(paramT.shortValue(), ZG(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3));
  }
  
  public <T extends Number> void Zs(T paramT, byte[] paramArrayOfbyte) {
    short s = paramT.shortValue();
    Ze93<Zm8f> ze93 = ZSq();
    Zbqc[] arrayOfZbqc = Zsi_.ZE();
    Zm8f zm8f = ze93.Zz(s);
    if (Objects.nonNull(zm8f)) {
      zm8f.Zi(paramArrayOfbyte);
      ze93.Zl(s, zm8f);
    } 
    if (Zbqc.Zwu() == null)
      Zsi_.Zh(new Zbqc[5]); 
  }
  
  public <T extends Number> void Zz(T paramT, byte[] paramArrayOfbyte) {
    short s = paramT.shortValue();
    Ze93<Zm8f> ze93 = ZSq();
    Zm8f zm8f = ze93.Zz(s);
    Zbqc[] arrayOfZbqc = Zsi_.ZE();
    if (Objects.nonNull(zm8f)) {
      zm8f.ZA(paramArrayOfbyte);
      ze93.Zl(s, zm8f);
    } 
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public <T extends Number> byte[] ZK(T paramT) {
    Zm8f zm8f = ZSq().Zz(paramT.shortValue());
    return Objects.isNull(zm8f) ? null : zm8f.ZoI();
  }
  
  public <T extends Number> byte[] ZF(T paramT) {
    Zm8f zm8f = ZSq().Zz(paramT.shortValue());
    return Objects.isNull(zm8f) ? null : zm8f.Zo5();
  }
  
  public <T extends Number> byte[] Zm(T paramT) {
    Zm8f zm8f = ZSq().Zz(paramT.shortValue());
    return Objects.isNull(zm8f) ? null : zm8f.Zom();
  }
  
  public <T extends Number> Zm8f Zo(T paramT) {
    return ZSq().Zz(paramT.shortValue());
  }
  
  public boolean ZxD() {
    return (ZK(Integer.valueOf(0)) != null && ZF(Integer.valueOf(0)) != null);
  }
  
  public int Zxp() {
    return ZSq().Zjp();
  }
  
  public byte[][][] ZxY() {
    return Zrqb.Zd(this);
  }
  
  public <T extends Number> void ZW(T paramT, Zm8f paramZm8f) {
    Ze93<Zm8f> ze93 = ZSq();
    ze93.Zl(paramT.shortValue(), paramZm8f);
  }
  
  public <T extends Number> void Zc(T paramT, byte[][] paramArrayOfbyte) {
    ZW(paramT, Zlex.ZM(this.Za, paramArrayOfbyte));
  }
  
  public <T extends Number> boolean Zg(T paramT) {
    return ZSq().ZF(paramT.shortValue());
  }
  
  public Zeu4<? extends Zxph> ZF() {
    return Zb;
  }
  
  private Zm8f ZG(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    return this.Za.<Zm8f>ZH(new Ze6a(paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3));
  }
  
  private Ze93<Zm8f> ZSq() {
    return this.Za.<Ze93<Zm8f>>ZJ(this, Zk_5.ZQ);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxhx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */