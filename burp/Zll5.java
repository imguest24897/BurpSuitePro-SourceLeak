package burp;

public class Zll5 extends Zllr {
  private final byte Zk;
  
  public Zll5(Zzu2 paramZzu2, String paramString, Zxsx paramZxsx, byte paramByte) {
    super(Ze46.ZT(paramZzu2), paramString, paramZxsx);
    this.Zk = paramByte;
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public byte ZK() {
    return this.Zk;
  }
  
  public boolean ZT(Zxs7 paramZxs7) {
    return (!paramZxs7.Zg() || this.Zk == 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zll5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */