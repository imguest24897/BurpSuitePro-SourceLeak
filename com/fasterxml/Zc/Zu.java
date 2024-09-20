package com.fasterxml.Zc;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zp;
import java.io.IOException;
import java.io.Serializable;

public class Zu implements Zp, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected String ZS;
  
  protected Zk ZF;
  
  public Zu() {
    this(ZY.toString());
  }
  
  public Zu(String paramString) {
    this.ZS = paramString;
    this.ZF = Zd.ZA(Zxm.NONE);
  }
  
  public void Zg(Zf paramZf) throws IOException {
    try {
      if (this.ZS != null)
        paramZf.ZM(this.ZS); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void ZN(Zf paramZf) throws IOException {
    paramZf.ZB('{');
  }
  
  public void ZV(Zf paramZf) throws IOException {}
  
  public void Zc(Zf paramZf) throws IOException {
    paramZf.ZB(this.ZF.ZT());
  }
  
  public void ZK(Zf paramZf) throws IOException {
    paramZf.ZB(this.ZF.Zt());
  }
  
  public void Zy(Zf paramZf, int paramInt) throws IOException {
    paramZf.ZB('}');
  }
  
  public void Zy(Zf paramZf) throws IOException {
    paramZf.ZB('[');
  }
  
  public void ZD(Zf paramZf) throws IOException {}
  
  public void Zj(Zf paramZf) throws IOException {
    paramZf.ZB(this.ZF.Zi());
  }
  
  public void Zi(Zf paramZf, int paramInt) throws IOException {
    paramZf.ZB(']');
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */