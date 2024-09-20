package burp;

import java.io.File;
import net.portswigger.Zah;
import net.portswigger.Zcr;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

public class Zzl_ {
  private final Zl9 ZH;
  
  private final Zl0 ZX;
  
  private final Zee5 ZS;
  
  private static final String a;
  
  Zzl_(Zl9 paramZl9, Zl0 paramZl0, Ze78 paramZe78) {
    this.ZH = paramZl9;
    this.ZX = paramZl0;
    this.ZS = paramZe78.ZY();
  }
  
  public void Zc(Zcr paramZcr) throws Zlvk {
    Zeu1 zeu1 = ZU(paramZcr);
    Zv(zeu1);
  }
  
  private Zeu1 ZU(Zcr paramZcr) {
    File file = this.ZX.Zh(this.ZS.ZS(paramZcr.Zs()), paramZcr.Zo());
    Zeu1 zeu1 = new Zeu1(Ztqs.Zo(paramZcr.Zp()), file.getPath(), paramZcr.ZI(), false, paramZcr.Zz(), paramZcr.Zs());
    this.ZH.Zc(zeu1);
    return zeu1;
  }
  
  private void Zv(Zeu1 paramZeu1) throws Zlvk {
    try {
      this.ZH.Zz(paramZeu1, true, false);
    } catch (UnsupportedClassVersionError unsupportedClassVersionError) {
      Zah.Zl(unsupportedClassVersionError, Zk_.USER_ERROR);
      throw new Zlvk(a);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zlvk(throwable);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: ldc 'TFPj,TfHj&QP2exv92U\w<YFwTj(DQ`Oc;C]}Ii/~sQX'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzl_.a : Ljava/lang/String;
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
    //   80: bipush #13
    //   82: goto -> 112
    //   85: bipush #56
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #25
    //   97: goto -> 112
    //   100: bipush #86
    //   102: goto -> 112
    //   105: bipush #47
    //   107: goto -> 112
    //   110: bipush #43
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzl_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */