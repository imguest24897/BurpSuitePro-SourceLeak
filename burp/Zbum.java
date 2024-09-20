package burp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Zbum {
  private final Set<Zer0> Zs;
  
  private static final String a;
  
  public Zbum() {
    this(new HashSet<>(0));
  }
  
  public Zbum(Set<Zer0> paramSet) {
    this.Zs = paramSet;
  }
  
  public String Zt() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('{');
    boolean bool = Ztg_.Z_();
    if (this.Zs != null && !this.Zs.isEmpty()) {
      stringBuilder.append(a);
      Iterator<Zer0> iterator = this.Zs.iterator();
      while (iterator.hasNext()) {
        Zer0 zer0 = iterator.next();
        stringBuilder.append(zer0.ZS());
        if (iterator.hasNext())
          stringBuilder.append(','); 
        if (!bool)
          break; 
      } 
      stringBuilder.append("]");
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #84
    //   2: ldc 'FJP>\F]d'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbum.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #48
    //   82: goto -> 111
    //   85: bipush #55
    //   87: goto -> 111
    //   90: bipush #123
    //   92: goto -> 111
    //   95: bipush #48
    //   97: goto -> 111
    //   100: bipush #51
    //   102: goto -> 111
    //   105: bipush #107
    //   107: goto -> 111
    //   110: iconst_4
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbum.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */