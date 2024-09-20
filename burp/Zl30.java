package burp;

import java.util.Collections;
import java.util.List;

public class Zl30 {
  private final Zr9_ ZG;
  
  private final List<Ztx4> ZK;
  
  private final Zkol Zt;
  
  private static String[] ZZ;
  
  private static final String a;
  
  Zl30(Zr9_ paramZr9_, List<Ztx4> paramList, Zkol paramZkol) {
    this.ZG = paramZr9_;
    this.ZK = Collections.unmodifiableList(paramList);
    this.Zt = paramZkol;
  }
  
  public Zr9_ ZC() {
    return this.ZG;
  }
  
  public List<Ztx4> ZT() {
    return this.ZK;
  }
  
  public Zb3t Zw(List<Zb3t> paramList) {
    return this.Zt.Zu(this.ZG, paramList);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(this.ZG.toString());
    stringBuilder.append(a);
    String[] arrayOfString = ZM();
    for (Ztx4 ztx4 : this.ZK) {
      stringBuilder.append(ztx4.toString()).append(" ");
      if (arrayOfString != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    return stringBuilder.toString();
  }
  
  public static void ZF(String[] paramArrayOfString) {
    ZZ = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return ZZ;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZM : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic ZF : ([Ljava/lang/String;)V
    //   13: iconst_1
    //   14: ldc 'uyg'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zl30.a : Ljava/lang/String;
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
    //   92: bipush #84
    //   94: goto -> 124
    //   97: bipush #49
    //   99: goto -> 124
    //   102: bipush #70
    //   104: goto -> 124
    //   107: bipush #70
    //   109: goto -> 124
    //   112: bipush #11
    //   114: goto -> 124
    //   117: bipush #44
    //   119: goto -> 124
    //   122: bipush #126
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl30.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */