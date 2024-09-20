package burp;

import java.util.Arrays;
import net.portswigger.Zsy;

public class Zlv9 {
  private final Zb6q Zn;
  
  private final Zt9b ZA;
  
  private final int ZC;
  
  private final int ZJ;
  
  private final byte Zg;
  
  private final Zsy Zp;
  
  public Zlv9(Zb6q paramZb6q, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, byte paramByte, Zsy paramZsy) {
    this(paramZb6q, Zxar.Zg(paramArrayOfbyte), paramInt1, paramInt2, paramByte, paramZsy);
  }
  
  Zlv9(Zb6q paramZb6q, Zt9b paramZt9b, int paramInt1, int paramInt2, byte paramByte, Zsy paramZsy) {
    this.Zn = paramZb6q;
    this.ZA = paramZt9b;
    this.ZC = paramInt1;
    this.ZJ = paramInt2;
    this.Zg = paramByte;
    this.Zp = paramZsy;
  }
  
  public void ZL(Zku6 paramZku6) {
    String str = Zz_p.Zl();
    int i = this.ZC;
    Ze6l ze6l;
    while (null != (ze6l = this.ZA.ZL(this.Zn.Za().ZiD(), i, this.ZJ))) {
      byte[] arrayOfByte = Arrays.copyOfRange(this.Zn.Za().ZiD(), ze6l.Zk, ze6l.ZR);
      i = ze6l.Zk;
      Zkv8 zkv8 = ZV(paramZku6, i, arrayOfByte).ZQ();
      paramZku6.Zg(zkv8, this.Zg);
      i = ze6l.ZR;
      if (str != null)
        break; 
    } 
  }
  
  Zb6x ZV(Zku6 paramZku6, int paramInt, byte[] paramArrayOfbyte) {
    return new Zb6x(paramZku6, paramInt, this.Zn.Zs(), this.Zg, this.Zp, paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlv9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */