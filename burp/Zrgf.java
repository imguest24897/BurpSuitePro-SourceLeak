package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zrgf implements Zxym {
  private final Socket ZF;
  
  private final Socket Zy;
  
  private final Zdg ZL;
  
  private final Zdg Zt;
  
  private final AtomicBoolean ZI;
  
  protected final Zrwh Zv;
  
  Zrgf(Socket paramSocket1, Socket paramSocket2, Ztwv paramZtwv) throws IOException {
    this.ZF = paramSocket1;
    this.Zy = paramSocket2;
    Zbqc[] arrayOfZbqc = Zsg3.Zh();
    try {
      this.Zv = new Zrwh(paramSocket1, paramSocket2, paramZtwv, this::Zv);
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZL = (paramSocket1 == null) ? null : new Zdg(paramSocket1.getOutputStream(), this.Zv);
    this.Zt = new Zdg(paramSocket2.getOutputStream(), this.Zv);
    this.ZI = new AtomicBoolean(true);
    try {
      if (paramSocket1 != null)
        paramSocket1.setSoTimeout(0); 
      paramSocket2.setSoTimeout(0);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      Zv();
      throw iOException;
    } 
    try {
      if (arrayOfZbqc != null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void Zt() throws IOException {
    this.Zv.Zi();
  }
  
  public Zmhv Zr(Zl36 paramZl36, Ze3o paramZe3o, Zeew paramZeew) {
    try {
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      Zdg zdg = (paramZe3o == Ze3o.CLIENT_TO_SERVER) ? this.Zt : this.ZL;
      Zl36 zl36 = zdg.Za(paramZl36, paramZe3o, paramZeew);
      return new Zmhv(zl36);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zv();
      return new Zmhv();
    } 
  }
  
  public void Zr(Zsg3 paramZsg3, byte[] paramArrayOfbyte) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zm(Zlgo paramZlgo) {
    this.Zv.Zr(paramZlgo);
  }
  
  public void ZL(Zlgo paramZlgo) {
    this.Zv.Zb(paramZlgo);
  }
  
  public boolean ZA() {
    return this.ZI.get();
  }
  
  public void Zv() {
    this.ZI.set(false);
    if (this.ZF != null)
      Zsdz.ZW(this.ZF); 
    Zsdz.ZW(this.Zy);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */