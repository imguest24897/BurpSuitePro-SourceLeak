package burp;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zgot extends Zbqc implements Zeq {
  private final Map<String, List<Zxkf>> Zf;
  
  private final Zbws ZI;
  
  private final Zt_y Zz;
  
  private final Zgoy Z_;
  
  private Zbup Zi;
  
  private Zmyz Zx;
  
  private static final String a;
  
  Zgot(Set<String> paramSet, Map<String, List<Zxkf>> paramMap, Zbnt paramZbnt, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Zl04 paramZl04, Zkl6 paramZkl6, Ze47 paramZe47) {
    this.Zf = paramMap;
    Ze();
    Zmse.Zf(this.Zx, 120, 20);
    this.Zz = new Zt_y(paramSet, paramMap);
    this.ZI = new Zbws(this.Zz);
    this.Zi.setViewportView(this.ZI);
    this.ZI.Zc(this);
    this.Z_ = new Zgoy(new ArrayList<>(), paramZbnt, paramZtyg, paramZgq7, paramZz1z, paramZl04, true, "", paramZkl6, paramZe47);
    this.Zx.setBottomComponent(this.Z_);
    this.Zx.Za(20);
  }
  
  private void Ze() {
    this.Zx = new Zmyz();
    this.Zi = new Zbup();
    setLayout(new BorderLayout());
    this.Zx.setOrientation(0);
    this.Zx.setLeftComponent(this.Zi);
    add(this.Zx, a);
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    String str = this.Zz.Zy(this.ZI.convertRowIndexToModel(paramInt1));
    this.Z_.ZR(this.Zf.get(str), str);
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: ldc '-"Lc'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgot.a : Ljava/lang/String;
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
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #81
    //   87: goto -> 112
    //   90: bipush #104
    //   92: goto -> 112
    //   95: bipush #46
    //   97: goto -> 112
    //   100: bipush #16
    //   102: goto -> 112
    //   105: bipush #111
    //   107: goto -> 112
    //   110: bipush #126
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */