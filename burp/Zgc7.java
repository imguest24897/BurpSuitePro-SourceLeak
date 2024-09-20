package burp;

import java.util.ArrayList;
import java.util.List;

public class Zgc7 extends Zgcq {
  private String Zn;
  
  private Ztyn ZU = new Zgc6();
  
  private Ztyn Zm = new Zgcz(b);
  
  private static final String b;
  
  public Zgc7(List<Zb3t> paramList) {
    super(paramList);
    Zm();
    ZD();
  }
  
  private void Zm() {
    List<Ztyn> list = ZO(Zxc6.CodeSymbols);
    if (list == null) {
      list = new ArrayList(1);
      Zm(Zxc6.CodeSymbols, list);
    } 
    list.add(this.Zm);
  }
  
  private void ZD() {
    boolean bool = Zgcx.Zj();
    for (Zb3t zb3t : ZC()) {
      if (Zl19.ZM(zb3t)) {
        Zgcu zgcu = (Zgcu)zb3t;
        this.Zn = zgcu.Zi();
        if (bool)
          continue; 
        break;
      } 
      continue;
      if (bool)
        break; 
    } 
  }
  
  public void Zm(Ztgs paramZtgs) {
    paramZtgs.Zv(this);
  }
  
  public String ZN() {
    return this.Zn;
  }
  
  public Ztyn Zb() {
    return this.ZU;
  }
  
  public Ztyn Zv() {
    return this.Zm;
  }
  
  static {
    // Byte code:
    //   0: bipush #107
    //   2: ldc '"\\t*X?7\\b'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgc7.b : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #40
    //   82: goto -> 111
    //   85: bipush #16
    //   87: goto -> 111
    //   90: bipush #38
    //   92: goto -> 111
    //   95: bipush #12
    //   97: goto -> 111
    //   100: iconst_4
    //   101: goto -> 111
    //   104: bipush #86
    //   106: goto -> 111
    //   109: bipush #58
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */