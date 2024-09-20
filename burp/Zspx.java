package burp;

import java.util.function.BooleanSupplier;
import javax.swing.JComponent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zspx<T extends Zmw9<?>> implements Zedo, Zt5e, Zzkg {
  private final Zsii<T> ZM;
  
  private final Zg0a<T> Zz;
  
  private final Zbk5 ZV;
  
  private final Zbkd ZZ;
  
  private static final String a;
  
  public Zspx(Zsii<T> paramZsii, Zg0a<T> paramZg0a, Ztun paramZtun, Zm2j paramZm2j) {
    this.ZM = paramZsii;
    this.Zz = paramZg0a;
    this.ZV = ZY(paramZtun);
    Zm2o zm2o = new Zm2o(Zmcx.LARGE_LINE_SIZE);
    zm2o.Zi(Zk97.DESKTOP_TOOLS_PROXY_HISTORY);
    this.ZZ = new Zbkd();
    this.ZZ.Zn(this.ZV);
    this.ZZ.Zh(zm2o);
    this.ZZ.Zh(paramZm2j);
  }
  
  private Zbk5 ZY(Ztun paramZtun) {
    return (new Zxwe(this.ZM, this::Zn, paramZtun)).ZA(true).ZU();
  }
  
  private void ZY() {
    this.ZV.Zy();
  }
  
  public JComponent ZR() {
    return this.ZZ;
  }
  
  private void Zn(BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    Zm2.Zo(Zze0.PROXY_HISTORY_EDITED_VIEW_FILTER);
    ZY();
    try {
      this.Zz.Zo(this.ZM.ZS6(), paramBooleanSupplier, paramRunnable);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void Zt2() {
    this.ZM.ZSz();
    this.ZV.Zv();
  }
  
  public void ZC(Zz28 paramZz28) {
    this.ZV.ZC();
  }
  
  public void Zn(Zsij paramZsij) {
    this.ZV.ZE(a);
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: ldc 'J'yr1m4f''
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zspx.a : Ljava/lang/String;
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
    //   80: bipush #52
    //   82: goto -> 112
    //   85: bipush #122
    //   87: goto -> 112
    //   90: bipush #40
    //   92: goto -> 112
    //   95: bipush #44
    //   97: goto -> 112
    //   100: bipush #105
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #7
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zspx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */