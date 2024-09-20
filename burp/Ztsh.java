package burp;

public class Ztsh {
  private final Zmhe ZP;
  
  private final byte Zc;
  
  private final byte[] ZJ;
  
  private final byte ZM;
  
  private final byte Zd;
  
  private Zlvf ZZ;
  
  public Ztsh(Zmhe paramZmhe, byte paramByte1, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    this.ZP = paramZmhe;
    this.Zc = paramByte1;
    this.ZJ = paramArrayOfbyte;
    this.ZM = paramByte2;
    this.Zd = paramByte3;
  }
  
  public Zku6 ZQ(Zt9b paramZt9b) {
    return ZA(paramZt9b, Zri7.ZJ(new Zrrb(this.ZJ, this.Zc)), Zlp5.Zc());
  }
  
  public Zku6 ZA(Zt9b paramZt9b, Zri7 paramZri7, Zlp5 paramZlp5) {
    Zlvf zlvf = this.ZP.ZK(paramZri7, paramZlp5.Zd(((this.Zd & 0x2) != 0)));
    return Zc(paramZt9b, zlvf);
  }
  
  private Zku6 Zc(Zt9b paramZt9b, Zlvf paramZlvf) {
    if (this.ZZ == null)
      this.ZZ = paramZlvf; 
    return (new Zt0g(this.ZJ, this.ZM, this.ZZ)).Zq(paramZt9b);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */