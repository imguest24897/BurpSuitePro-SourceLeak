package burp;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Zrej {
  final String Zc;
  
  final boolean ZM;
  
  final File ZJ;
  
  final boolean Zf;
  
  final boolean Zo;
  
  public final boolean ZI;
  
  final boolean ZP;
  
  public final List<File> Zj;
  
  final Runnable ZG;
  
  public final boolean Ze;
  
  private boolean Zl;
  
  private Zrej(Zgvv paramZgvv) {
    this.ZM = paramZgvv.ZM;
    this.Zc = paramZgvv.ZT;
    this.ZJ = paramZgvv.Zi;
    this.Zf = paramZgvv.Zg;
    this.Zo = paramZgvv.Zp;
    this.ZI = paramZgvv.ZU;
    this.ZP = paramZgvv.ZV;
    this.Zj = paramZgvv.ZH;
    this.ZG = paramZgvv.ZA;
    this.Ze = paramZgvv.Zh;
    this.Zl = paramZgvv.ZK;
  }
  
  void ZD() {
    if (this.ZJ != null)
      this.ZJ.setLastModified((new Date()).getTime()); 
  }
  
  void ZH(boolean paramBoolean) {
    this.Zl = paramBoolean;
  }
  
  boolean Za() {
    return this.Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrej.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */