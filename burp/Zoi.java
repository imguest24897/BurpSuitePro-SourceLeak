package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;

public class Zoi implements Zmon {
  private final Zbv4 ZA;
  
  private final Zbqc ZE;
  
  private final Zb9b Zd;
  
  private final Zze0 ZL;
  
  private static final String a;
  
  public Zoi(Zb9b paramZb9b, Ztk2 paramZtk2, Zbcp paramZbcp, Zl_l paramZl_l, Zze0 paramZze0) {
    this.Zd = paramZb9b;
    this.ZL = paramZze0;
    String str = Zrqo.ZjI();
    this.ZA = new Zbv4(new Zbvs(paramZtk2, paramZbcp, paramZl_l));
    this.ZE = new Zbqc(new BorderLayout());
    this.ZE.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZE.setPreferredSize(new Dimension(Zgdi.ZK(), this.ZE.getHeight()));
    this.ZE.add(this.ZA, a);
    if (Zbqc.Zwu() == null)
      Zrqo.Zm("cvYxk"); 
  }
  
  public Component ZE() {
    return this.ZE;
  }
  
  public List<Zm9t> ZC() {
    return this.ZA.ZC();
  }
  
  public Zs_i ZsO() {
    return this.ZA.ZsO();
  }
  
  public String Zsd() {
    return this.ZA.Zsd();
  }
  
  public Zbdr ZsQ() {
    return this.ZA.ZsQ();
  }
  
  public Zze0 Zsc() {
    return this.ZL;
  }
  
  public Zb9b ZI() {
    return this.Zd;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 't%L'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zoi.a : Ljava/lang/String;
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
    //   80: bipush #43
    //   82: goto -> 112
    //   85: bipush #108
    //   87: goto -> 112
    //   90: bipush #54
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #84
    //   102: goto -> 112
    //   105: bipush #17
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */