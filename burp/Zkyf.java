package burp;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zkyf extends Zkte {
  private final Zbis ZJ;
  
  private final AtomicBoolean ZC;
  
  private Zk5w ZO;
  
  private static final String a;
  
  public Zkyf(Zbis paramZbis, Zr_4 paramZr_4) {
    super(paramZr_4, paramZbis);
    this.ZJ = paramZbis;
    boolean bool = Zm0h.Zb();
    this.ZC = new AtomicBoolean(false);
    if (Zbqc.Zwu() == null)
      Zm0h.ZB(!bool); 
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    if (this.ZC.get())
      return null; 
    if (this.ZO == null && ZZ(paramZzlx))
      return null; 
    byte[] arrayOfByte = this.ZO.Zf(paramArrayOfbyte);
    return (arrayOfByte == null) ? null : this.ZJ.Zyn().Zm(new Zr1f(paramZzlx), paramArrayOfbyte, arrayOfByte);
  }
  
  public void Zy4() {
    if (this.ZO != null)
      this.ZO.Zw(); 
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZJ.ZS(paramZs4f);
  }
  
  private boolean ZZ(Zzlx paramZzlx) {
    Zrun zrun = paramZzlx.ZH(this.ZJ.ZeP());
    if (zrun != null)
      this.ZO = zrun.ZJ(paramZzlx.ZW()); 
    if (this.ZO == null) {
      this.ZC.compareAndSet(false, true);
      Zskh zskh = paramZzlx.Zx().ZY4();
      zskh.Zz().Zl(Zkqn.ERROR, String.format(a, new Object[] { this.ZJ.ZeP() }));
      return true;
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #73
    //   2: ldc 'gt7r\\f5,Uz~w"x@{*w\\b%iv1p8kTg;zIySe~{%iOf7qq|@l2q\\b5,Fp0{0xNgd>L"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkyf.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #104
    //   82: goto -> 112
    //   85: bipush #92
    //   87: goto -> 112
    //   90: bipush #23
    //   92: goto -> 112
    //   95: bipush #87
    //   97: goto -> 112
    //   100: bipush #32
    //   102: goto -> 112
    //   105: bipush #24
    //   107: goto -> 112
    //   110: bipush #69
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
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
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */