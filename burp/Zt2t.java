package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

class Zt2t extends Zt2r {
  private final Zm82 ZA;
  
  private final Zzv5 ZG;
  
  Zt2t(Zm82 paramZm82, Zskh paramZskh, Ztdi paramZtdi, Zz_r paramZz_r, Zgb6 paramZgb6, Zzv5 paramZzv5, Zxz1 paramZxz1, Zbnt paramZbnt, Ztwv paramZtwv, Zr_4 paramZr_4, Zey9 paramZey9) {
    this.ZA = paramZm82;
    this.ZG = paramZzv5;
    this.Zi = paramZskh;
    this.Z_ = paramZtdi;
    this.Zn = paramZzv5;
    Zbsw zbsw = new Zbsw(this, this.Zn, paramZgb6, paramZtdi, paramZbnt, paramZz_r, paramZr_4);
    this.ZY = new Zsbg(zbsw, this.Zn, paramZtwv);
    this.ZR = new Zgk5(this, zbsw, this.Zn, paramZxz1, paramZtdi, new Zyu<>(Zez3.ZZ, 1024), paramZtwv, paramZey9);
  }
  
  public Zstu Zi(byte paramByte1, Zlit paramZlit1, Zlit paramZlit2, List<Zt8g> paramList, byte paramByte2, AtomicReference<Zstu> paramAtomicReference) {
    return this.ZA.Zb(paramZlit1);
  }
  
  public byte Zc(Zlit paramZlit, Zs68 paramZs68, Zstu paramZstu) {
    return this.ZA.ZD(paramZlit, paramZs68, paramZstu);
  }
  
  public boolean Zi() {
    return false;
  }
  
  public boolean Zt() {
    return this.ZG.ZA();
  }
  
  public void ZK(Zez3 paramZez3) {
    if (this.ZG.ZA())
      Zh(paramZez3); 
  }
  
  void Zh(Zez3 paramZez3) {
    Zs73 zs73 = (new Ztgc(paramZez3)).ZE();
    zs73.ZU((byte)1);
    this.ZR.ZW(paramZez3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */