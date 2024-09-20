package burp;

import java.util.EnumSet;
import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrd5 {
  private static final EnumSet<Zklf> ZU;
  
  private static final Map<Zezf, EnumSet<Zklf>> Zk;
  
  private String Zs;
  
  private String Zr;
  
  private static final String a;
  
  public Zrd5 Zg(String paramString) {
    this.Zs = (paramString == null) ? "" : paramString;
    return this;
  }
  
  public Zrd5 Zy(String paramString) {
    this.Zr = paramString;
    return this;
  }
  
  public EnumSet<Zklf> Zw() {
    if (this.Zr == null) {
      Zuh.Zb(false, Zqf.Zr);
      return ZU;
    } 
    EnumSet<Zklf> enumSet = Zk.get(new Zezf(this.Zs, this.Zr.contains(a)));
    return (enumSet == null) ? ZU : enumSet;
  }
  
  private static Zezf ZD(String paramString) {
    return new Zezf(paramString, false);
  }
  
  private static Zezf ZN(String paramString) {
    return new Zezf(paramString, true);
  }
  
  static {
    // Byte code:
    //   0: bipush #87
    //   2: ldc ',:Z'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrd5.a : Ljava/lang/String;
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
    //   80: bipush #124
    //   82: goto -> 112
    //   85: bipush #11
    //   87: goto -> 112
    //   90: bipush #9
    //   92: goto -> 112
    //   95: bipush #107
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #39
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
    //   154: ldc burp/Zklf
    //   156: invokestatic noneOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
    //   159: putstatic burp/Zrd5.ZU : Ljava/util/EnumSet;
    //   162: new burp/Zmru
    //   165: dup
    //   166: invokespecial <init> : ()V
    //   169: putstatic burp/Zrd5.Zk : Ljava/util/Map;
    //   172: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrd5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */