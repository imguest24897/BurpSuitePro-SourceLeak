package burp;

class Zzrr extends Zzrd {
  private final Zzq3 Zd;
  
  private Zzrr(Zzq3 paramZzq3) {
    this.Zd = paramZzq3;
  }
  
  static Zzrd ZB(Zzq3 paramZzq3) {
    return new Zzrr(paramZzq3);
  }
  
  public Zbu4 Zk(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    String str = Zbu4.ZN();
    if (paramArrayOfbyte == null)
      return Zq; 
    Zzq3 zzq3 = this.Zd;
    if (zzq3.Zr())
      return new Zbu4(paramInt1, paramInt1, true); 
    Zk8t zk8t = new Zk8t();
    int i = (paramInt2 == -1 || paramInt2 > paramArrayOfbyte.length) ? paramArrayOfbyte.length : paramInt2;
    int j = paramInt1;
    while (j < i) {
      zzq3 = zzq3.ZR(j, paramArrayOfbyte[j], zk8t);
      if (zk8t.Z_()) {
        Zbu4 zbu41 = zk8t.Zm();
        Zbu4 zbu42 = Zk(paramArrayOfbyte, zbu41.ZR() + 1, zbu41.ZQ());
        return zbu42.ZP() ? zbu42 : zbu41;
      } 
      j++;
      if (str == null)
        break; 
    } 
    return Zq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */