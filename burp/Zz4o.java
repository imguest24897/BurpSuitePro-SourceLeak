package burp;

import java.util.List;
import net.portswigger.Zen;

public class Zz4o implements Zlhe {
  private final Ze2z ZV;
  
  private final Zl3v Zp;
  
  private final Zee7 Zl;
  
  private final Zrcc Z_;
  
  private final Zs7p ZK;
  
  private final Zmdk Zi;
  
  public Zz4o(Ze2z paramZe2z, Zl3v paramZl3v, Zee7 paramZee7, Zrcc paramZrcc, Zs7p paramZs7p, Zmdk paramZmdk) {
    this.ZV = paramZe2z;
    this.Zp = paramZl3v;
    this.Zl = paramZee7;
    boolean bool = Ztg_.ZK();
    this.Z_ = paramZrcc;
    this.ZK = paramZs7p;
    this.Zi = paramZmdk;
    if (bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void Zm(Zen paramZen, String paramString1, int paramInt1, byte[] paramArrayOfbyte, String paramString2, int paramInt2) {
    if (this.Zl.Zx() <= 0.1D)
      return; 
    if (ZM(paramZen, paramString2)) {
      this.ZK.Ze();
      return;
    } 
    Zxyr zxyr = new Zxyr(paramZen.Zb, paramZen.ZO, paramZen.toString(), paramString1, paramInt1, paramArrayOfbyte, this.Zi.Zd(), paramString2, paramInt2, paramZen.Zv.toString());
    this.ZK.Zk();
    this.ZV.ZU(paramZen.Zv.Zp(), zxyr);
    this.Zp.Za();
  }
  
  public void Zg(Zb25 paramZb25, Zen paramZen, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, String paramString, int paramInt) {
    if (ZM(paramZen, paramString)) {
      this.ZK.Ze();
      return;
    } 
    Zxyt zxyt = new Zxyt(paramZb25, paramZen.Zb, paramZen.toString(), paramZen.ZO, paramArrayOfbyte1, paramArrayOfbyte2, this.Zi.Zd(), paramString, paramInt, paramZen.Zv.toString());
    this.ZK.ZW();
    this.ZV.ZU(paramZen.Zv.Zp(), zxyt);
    this.Zp.Za();
  }
  
  public void Zk(Zb25 paramZb25, Zen paramZen, byte[] paramArrayOfbyte1, List<byte[]> paramList, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, String paramString, int paramInt) {
    if (ZM(paramZen, paramString)) {
      this.ZK.Ze();
      return;
    } 
    Zxyy zxyy = new Zxyy(paramZb25, paramZen.Zb, paramZen.toString(), paramZen.ZO, paramArrayOfbyte1, paramList, paramArrayOfbyte2, paramArrayOfbyte3, this.Zi.Zd(), paramString, paramInt, paramZen.Zv.toString());
    this.ZK.ZW();
    this.ZV.ZU(paramZen.Zv.Zp(), zxyy);
    this.Zp.Za();
  }
  
  public boolean ZM(Zen paramZen, String paramString) {
    return (this.Z_.Zt(paramString) || this.Z_.Z_(paramZen.Zv.toString()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */