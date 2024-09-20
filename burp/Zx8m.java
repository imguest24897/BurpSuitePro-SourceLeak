package burp;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Zx8m implements Zm7u {
  final List Zp;
  
  final Zeug Zc;
  
  final int ZS;
  
  final byte[] ZL;
  
  final Ztft ZV;
  
  Zx8m(Ztft paramZtft, List paramList, Zeug paramZeug, int paramInt, byte[] paramArrayOfbyte) {}
  
  public Instant ZR() {
    return this.ZV.Zl.ZR();
  }
  
  public Instant ZQ() {
    return this.ZV.Zl.ZQ();
  }
  
  public Zl6b Zp() {
    return this.ZV.Zl.Zp();
  }
  
  public List<String> Zm() {
    return this.Zp;
  }
  
  public short Ze() {
    return this.Zc.Zg;
  }
  
  public int Zs() {
    return this.ZS;
  }
  
  public int ZF() {
    return this.ZL.length;
  }
  
  public Zstu Za() {
    return Zyf.Zy(this.ZL);
  }
  
  public Zstu Zt() {
    return (this.ZL == null || this.ZS < 0) ? Zyf.ZQm() : Zyf.Zy(Arrays.copyOfRange(this.ZL, this.ZS, this.ZL.length));
  }
  
  public List<String> Zg() {
    return (this.Zc.Zl == null) ? Collections.<String>emptyList() : this.Zc.Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx8m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */