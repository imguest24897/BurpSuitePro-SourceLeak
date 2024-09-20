package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrei implements Zlv8 {
  private final Zsmh ZN;
  
  private final Zgli Zg;
  
  private static final String a;
  
  public Zrei(Zsmh paramZsmh, Zgli paramZgli) {
    this.ZN = paramZsmh;
    this.Zg = paramZgli;
  }
  
  public boolean ZY() {
    return (this.Zg.Zt() == Ze3o.CLIENT_TO_SERVER);
  }
  
  public byte[] ZW() {
    Zrp8 zrp8 = new Zrp8();
    this.ZN.Zh(zrp8);
    return zrp8.Zb();
  }
  
  public void Zo(byte[] paramArrayOfbyte) {
    Zuh.ZT(false, Zqf.ZC, a);
  }
  
  public Zefx ZP() {
    return this.Zg.ZM();
  }
  
  public String ZE() {
    return this.Zg.ZIx();
  }
  
  public void Zx(String paramString) {
    this.Zg.Zxg(paramString);
  }
  
  public byte Zq() {
    return this.Zg.ZaP();
  }
  
  public void Zj(byte paramByte) {
    this.Zg.ZB(paramByte);
  }
  
  public boolean ZM() {
    return true;
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 'RBjW.MyNj%qHm*X<Nq?Sh\\rjkX<^{kOsJl&\hD}'D2'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zrei.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #29
    //   82: goto -> 112
    //   85: bipush #44
    //   87: goto -> 112
    //   90: bipush #31
    //   92: goto -> 112
    //   95: bipush #118
    //   97: goto -> 112
    //   100: bipush #74
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #60
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrei.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */