package burp;

import java.util.HashSet;
import java.util.Set;
import net.portswigger.Zft;
import net.portswigger.Zms;
import net.portswigger.Zrmf;

public class Zg7g {
  private final String Zi;
  
  private final Zmzk ZD;
  
  private final Zrmf ZI;
  
  private boolean Zt;
  
  private boolean ZE;
  
  private final Set<Zryz> ZK = new HashSet<>();
  
  private static int[] Za;
  
  private static final String a;
  
  public Zg7g(Zmzk paramZmzk, Zrmf paramZrmf) {
    this.ZD = paramZmzk;
    this.ZI = paramZrmf;
    this.Zt = true;
    this.ZE = true;
    this.Zi = Zft.Zb(ZZ(), Zm(), ZA(), paramZrmf.ZK());
  }
  
  public String Zd() {
    return this.Zi;
  }
  
  Zmzk ZI() {
    return this.ZD;
  }
  
  public Zrmf Zg() {
    return this.ZI;
  }
  
  public boolean ZB() {
    return this.Zt;
  }
  
  public void ZN(boolean paramBoolean) {
    this.Zt = paramBoolean;
  }
  
  public boolean ZK() {
    return this.ZE;
  }
  
  public void ZW(boolean paramBoolean) {
    this.ZE = paramBoolean;
  }
  
  public String ZA() {
    return this.ZI.Zf();
  }
  
  public String Zl() {
    String str = this.ZI.ZK();
    return (str == null) ? "" : str;
  }
  
  public String Zs() {
    return this.ZD.ZJQ() + this.ZD.ZJQ() + a;
  }
  
  public String ZZ() {
    String str = Zs();
    if (this.ZD.ZJO() != 80 && this.ZD.ZJO() != 443)
      str = str + ":" + str; 
    return str;
  }
  
  public String Zm() {
    Zxak zxak = new Zxak();
    this.ZI.Zw().forEach(zxak::lambda$pathWithParameterPlaceholders$0);
    return zxak.toString();
  }
  
  public Set<Zryz> Zj() {
    return this.ZK;
  }
  
  private static void lambda$pathWithParameterPlaceholders$0(Zxak paramZxak, Zms paramZms) {
    paramZms.ZF(paramZxak);
  }
  
  public static void Zs(int[] paramArrayOfint) {
    Za = paramArrayOfint;
  }
  
  public static int[] Zf() {
    return Za;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zf : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_3
    //   7: newarray int
    //   9: invokestatic Zs : ([I)V
    //   12: bipush #70
    //   14: ldc '\\t\\b'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zg7g.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #117
    //   94: goto -> 124
    //   97: bipush #116
    //   99: goto -> 124
    //   102: bipush #97
    //   104: goto -> 124
    //   107: bipush #52
    //   109: goto -> 124
    //   112: bipush #41
    //   114: goto -> 124
    //   117: bipush #26
    //   119: goto -> 124
    //   122: bipush #42
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg7g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */