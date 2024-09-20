package burp;

import java.util.Map;

public class Zke9 implements Zt84 {
  private static int ZE;
  
  public final int Zj = ++ZE;
  
  public final Zmzk ZA;
  
  public final byte[] Zf;
  
  private final byte[] Zs;
  
  Zkk3 ZL;
  
  private final Zs68 ZU;
  
  final Map<String, String> ZR;
  
  final Map<String, String> ZK;
  
  Zke9(Zmzk paramZmzk, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zbnt paramZbnt) {
    this.ZA = paramZmzk;
    this.Zf = paramArrayOfbyte1;
    this.Zs = paramArrayOfbyte2;
    this.ZU = Zmre.ZK(null, paramArrayOfbyte2, Zt0k.HTML_ANALYSIS, paramZbnt);
    this.ZR = Ze8.ZT(paramArrayOfbyte2);
    this.ZK = Ze8.ZU(paramArrayOfbyte2, this.ZU.Zk, paramZbnt);
  }
  
  public byte[] ZcV() {
    return this.Zs;
  }
  
  public Zs68 ZeG() {
    return this.ZU;
  }
  
  public void Zl(byte[] paramArrayOfbyte, Zr_4 paramZr_4) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zke9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */