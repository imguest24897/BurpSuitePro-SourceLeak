package burp;

import java.io.IOException;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zt4s implements Ztae {
  private final Zbw_<?> ZE;
  
  private final Zr3p Zj;
  
  private final Zm6x Zg;
  
  private final Zs_y Zz;
  
  private final Zzxx Zi;
  
  private Zt4s(Zbw_<?> paramZbw_, Zr3p paramZr3p, Zm6x paramZm6x, Zs_y paramZs_y, Zzxx paramZzxx) {
    this.ZE = paramZbw_;
    this.Zj = paramZr3p;
    this.Zg = paramZm6x;
    this.Zz = paramZs_y;
    this.Zi = paramZzxx;
  }
  
  public Zxym ZQ(Zefx paramZefx, Socket paramSocket1, Socket paramSocket2) {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zlit zlit = (paramZefx == null) ? null : paramZefx.ZF();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = (paramZefx == null) ? null : paramZefx.ZD();
    try {
      Zth_ zth_ = this.Zj.Zg(zlit, arrayOfByte, paramSocket1, paramSocket2);
      zth_.ZI(new Zsnf(this, paramSocket1, zth_, zlit));
      return zth_;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      return null;
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */