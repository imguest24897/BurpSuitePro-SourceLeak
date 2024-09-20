package burp;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zgt_ implements Zr69 {
  private final Stack<Zt6r> ZU = new Stack<>();
  
  private final Zz28 Zj;
  
  private final Zskh Zt;
  
  private Zsug Zc;
  
  private Zmv7 Zb;
  
  private static final String a;
  
  protected Zgt_(Duration paramDuration, Zz28 paramZz28, Zsug paramZsug, Zskh paramZskh) {
    this.Zj = paramZz28;
    this.Zc = paramZsug;
    this.Zt = paramZskh;
    this.Zb = Zx8e.ZB(paramZsug, paramZskh);
    this.ZU.push(new Zt6r(a, Collections.emptyList(), Zgt_::lambda$new$0, paramDuration));
  }
  
  public void ZN(String paramString) {
    Zt6r zt6r = Zx().Zx(paramString);
    this.ZU.push(zt6r);
  }
  
  public void Zu() {
    Zuh.Zb((this.ZU.size() >= 2), Zqf.Zr);
    this.ZU.pop();
  }
  
  public Zt6r Zx() {
    return this.ZU.peek();
  }
  
  public List<Zb9v> ZF() {
    return (Zx()).Zg;
  }
  
  public void ZQ(List<Zb9v> paramList) {
    (Zx()).Zg = paramList;
  }
  
  public void Zl(Zb9v... paramVarArgs) {
    (Zx()).Zg = Arrays.asList(paramVarArgs);
  }
  
  public boolean Zy(Zrp0 paramZrp0) {
    boolean bool = ((Boolean)paramZrp0.<Boolean>Zv(new Zxny(this))).booleanValue();
    return (bool && Zx().Zk(paramZrp0));
  }
  
  public Duration ZS() {
    return (Zx()).ZI;
  }
  
  public void ZA(Duration paramDuration) {
    if ((Zx()).ZI == null || (Zx()).ZI.compareTo(paramDuration) > 0)
      (Zx()).ZI = paramDuration; 
  }
  
  public void Zi(Predicate<Zrp0> paramPredicate) {
    (Zx()).ZR = paramPredicate;
  }
  
  public boolean ZG(Zlit paramZlit) {
    Zuh.Zb((this.Zj != null), Zqf.Zr);
    return (this.Zj == null || this.Zj.ZG(paramZlit));
  }
  
  public boolean ZB(Zmzk paramZmzk) {
    Zuh.Zb((this.Zj != null), Zqf.Zr);
    return (this.Zj == null || this.Zj.ZB(paramZmzk));
  }
  
  public boolean ZH(Zlit paramZlit) {
    Zuh.Zb((this.Zj != null), Zqf.Zr);
    return (this.Zj != null && this.Zj.ZH(paramZlit));
  }
  
  public boolean ZF(Zlit paramZlit) {
    Zuh.Zb((this.Zj != null), Zqf.Zr);
    return (this.Zj == null || this.Zj.ZF(paramZlit));
  }
  
  public Zmv7 ZD() {
    return this.Zb;
  }
  
  public void Zz(Zsug paramZsug) {
    this.Zc = paramZsug;
    this.Zb = Zx8e.ZB(paramZsug, this.Zt);
  }
  
  private static boolean lambda$new$0(Zrp0 paramZrp0) {
    return !(paramZrp0 instanceof Zm72);
  }
  
  static {
    // Byte code:
    //   0: bipush #85
    //   2: ldc 'Uex7NN'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgt_.a : Ljava/lang/String;
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
    //   80: bipush #31
    //   82: goto -> 112
    //   85: bipush #110
    //   87: goto -> 112
    //   90: bipush #89
    //   92: goto -> 112
    //   95: bipush #89
    //   97: goto -> 112
    //   100: bipush #11
    //   102: goto -> 112
    //   105: bipush #122
    //   107: goto -> 112
    //   110: bipush #119
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgt_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */