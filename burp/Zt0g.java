package burp;

import net.portswigger.Zqf;
import net.portswigger.Zsy;
import net.portswigger.Zuh;

public class Zt0g {
  private final byte[] Zw;
  
  private final byte ZW;
  
  private final Zlvf ZE;
  
  public Zt0g(byte[] paramArrayOfbyte, byte paramByte, Zlvf paramZlvf) {
    this.Zw = paramArrayOfbyte;
    this.ZW = paramByte;
    this.ZE = paramZlvf;
  }
  
  public Zku6 Zq(Zt9b paramZt9b) {
    Zb6q zb6q1 = this.ZE.ZM().ZT();
    Zb6q zb6q2 = Zs(this.ZE.ZM());
    Zeq2 zeq2 = ZH(zb6q1, zb6q2);
    return ZC(this.ZE, zb6q1, zb6q2, zeq2, paramZt9b);
  }
  
  private Zb6q Zs(Zzud paramZzud) {
    return (paramZzud.Zq() > 0) ? paramZzud.ZV().get(0) : null;
  }
  
  private Zeq2 ZH(Zb6q paramZb6q1, Zb6q paramZb6q2) {
    int i = 0;
    int j = paramZb6q1.ZF();
    int k = 0;
    String str = Zz_p.Zl();
    int m = (paramZb6q2 == null) ? 0 : paramZb6q2.ZF();
    switch (this.ZW) {
      case 0:
        j = paramZb6q1.Zs();
        if (paramZb6q2 != null) {
          m = paramZb6q2.Zs();
          if (str != null);
        } 
        return new Zeq2(new Zmvi(i, j), new Zmvi(k, m));
      case 1:
        i = paramZb6q1.Zs();
        if (paramZb6q2 != null) {
          k = paramZb6q2.Zs();
          if (str != null);
        } 
        return new Zeq2(new Zmvi(i, j), new Zmvi(k, m));
      case 2:
        if (str != null)
          break; 
        return new Zeq2(new Zmvi(i, j), new Zmvi(k, m));
    } 
    Zuh.Zv(false, Zqf.Zk, this.ZW);
    return new Zeq2(new Zmvi(i, j), new Zmvi(k, m));
  }
  
  private Zku6 ZC(Zlvf paramZlvf, Zb6q paramZb6q1, Zb6q paramZb6q2, Zeq2 paramZeq2, Zt9b paramZt9b) {
    Ztqp ztqp = new Ztqp(this.Zw, paramZb6q1, paramZb6q2, paramZlvf);
    if (paramZb6q2 != null)
      ZH(ztqp, paramZb6q2, paramZt9b, paramZeq2.ZX, (byte)1); 
    if (paramZb6q1 != null)
      ZH(ztqp, paramZb6q1, paramZt9b, paramZeq2.Zb, (byte)2); 
    return ztqp;
  }
  
  private static void ZH(Zku6 paramZku6, Zb6q paramZb6q, Zt9b paramZt9b, Zmvi paramZmvi, byte paramByte) {
    if (paramZt9b.ZL(paramZb6q.Za().ZiD(), paramZmvi.Zs, paramZmvi.ZR) != null) {
      paramZku6.ZK(Zvu.ZQ(paramZb6q.Za().ZiD(), paramZb6q.Zs(), paramZb6q.Zm()));
      (new Zlv9(paramZb6q, paramZt9b, paramZmvi.Zs, paramZmvi.ZR, paramByte, new Zsy())).ZL(paramZku6);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */