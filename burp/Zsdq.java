package burp;

import java.util.Arrays;
import java.util.List;
import javax.swing.tree.TreeNode;

public class Zsdq {
  private final TreeNode Zy;
  
  private static final String a;
  
  public Zsdq(TreeNode paramTreeNode) {
    this.Zy = paramTreeNode;
  }
  
  public int Zt(Zxya paramZxya) {
    int i = this.Zy.getChildCount() - 1;
    return (i == -1) ? 0 : Zf(paramZxya, 0, i, i);
  }
  
  private int Zf(Zxya paramZxya, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_0
    //   6: aload_1
    //   7: iload_2
    //   8: invokevirtual ZS : (Lburp/Zxya;I)I
    //   11: istore #6
    //   13: iload #6
    //   15: ifne -> 22
    //   18: iload_2
    //   19: iconst_1
    //   20: iadd
    //   21: ireturn
    //   22: iload #6
    //   24: ifge -> 37
    //   27: iload_2
    //   28: iconst_1
    //   29: isub
    //   30: istore #4
    //   32: aload #5
    //   34: ifnonnull -> 41
    //   37: iload_2
    //   38: iconst_1
    //   39: iadd
    //   40: istore_3
    //   41: iload #4
    //   43: iload_3
    //   44: if_icmpge -> 57
    //   47: iload #6
    //   49: ifle -> 55
    //   52: iinc #2, 1
    //   55: iload_2
    //   56: ireturn
    //   57: iload_3
    //   58: iload #4
    //   60: iadd
    //   61: iconst_2
    //   62: idiv
    //   63: istore_2
    //   64: aload_0
    //   65: aload_1
    //   66: iload_2
    //   67: iload_3
    //   68: iload #4
    //   70: invokevirtual Zf : (Lburp/Zxya;III)I
    //   73: ireturn
  }
  
  private int ZS(Zxya paramZxya, int paramInt) {
    Zxya zxya = (Zxya)((Zz_1)this.Zy.getChildAt(paramInt)).Z_();
    if (zxya.ZX()) {
      Zmzk zmzk1 = paramZxya.Zq().Zdz();
      Zmzk zmzk2 = zxya.Zq().Zdz();
      int i = ZH(zmzk1.ZJ1()).compareTo(ZH(zmzk2.ZJ1()));
      if (i == 0)
        i = zmzk1.compareTo(zmzk2); 
      return i;
    } 
    return paramZxya.ZZ().compareTo(zxya.ZZ());
  }
  
  private String ZH(String paramString) {
    List<String> list = Arrays.asList(paramString.split(a));
    int i = list.size();
    String str = Zz_1.ZG();
    byte b = 1;
    while (b < i) {
      String str1 = String.join(".", list.subList(b, i));
      if (Zkub.Zv(str1))
        return (String)list.get(b - 1) + "." + (String)list.get(b - 1); 
      b++;
      if (str == null)
        break; 
    } 
    return paramString;
  }
  
  static {
    // Byte code:
    //   0: bipush #44
    //   2: ldc 'f-'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsdq.a : Ljava/lang/String;
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
    //   80: bipush #22
    //   82: goto -> 112
    //   85: bipush #47
    //   87: goto -> 112
    //   90: bipush #76
    //   92: goto -> 112
    //   95: bipush #33
    //   97: goto -> 112
    //   100: bipush #102
    //   102: goto -> 112
    //   105: bipush #63
    //   107: goto -> 112
    //   110: bipush #45
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */