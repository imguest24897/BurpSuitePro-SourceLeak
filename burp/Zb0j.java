package burp;

import java.io.FileWriter;
import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

abstract class Zb0j implements Runnable {
  final Zzb4 Zj;
  
  final Zsh9 Zx;
  
  final Zz38 Z_;
  
  final FileWriter ZR;
  
  final Zbnt ZX;
  
  final Zey9 ZU;
  
  final Zr1x ZB;
  
  private final Zskh ZW;
  
  Zb0j(Zzb4 paramZzb4, Zsh9 paramZsh9, Zz38 paramZz38, Zskh paramZskh, Zbnt paramZbnt, Zey9 paramZey9) {
    this.Zj = paramZzb4;
    this.Zx = paramZsh9;
    this.Z_ = paramZz38;
    this.ZW = paramZskh;
    this.ZX = paramZbnt;
    this.ZU = paramZey9;
    this.ZR = paramZsh9.Zi;
    this.ZB = new Zr1x();
  }
  
  protected Zree ZQ(Zrdb paramZrdb) {
    return this.Zj.ZK(paramZrdb);
  }
  
  public void run() {
    try {
      try {
        ZX();
        this.ZR.close();
        if (this.Z_ != null)
          this.Z_.ZB(100); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (this.ZB.Zw())
          Zmgc.DATA_CORRUPTION_REPORTING.ZK(this.ZW.Zz(), new Object[0]); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      try {
        Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
        Zmgc.ERROR_GENERATING_REPORT.ZV(this.ZW.Zz(), new Object[] { iOException.getMessage() });
        if (this.Z_ != null)
          this.Z_.ZB(-1); 
      } catch (IOException iOException1) {
        throw a(null);
      } 
    } 
  }
  
  protected abstract void ZX() throws IOException;
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */