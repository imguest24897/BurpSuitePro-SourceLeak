package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmai {
  private final Zgxf Za;
  
  private final Zor ZK;
  
  private final Map<TreePath, Boolean> Zg;
  
  private final List<TreePath> Zl;
  
  private int ZW;
  
  private static final String a;
  
  public Zmai(Zgxf paramZgxf, Zor paramZor, Map<TreePath, Boolean> paramMap) {
    this.Za = paramZgxf;
    this.ZK = paramZor;
    this.Zg = paramMap;
    this.Zl = new ArrayList<>(10);
  }
  
  public boolean Zi(Ze3h paramZe3h) {
    this.Za.ZQ(new Zl_m(this, paramZe3h), a);
    return true;
  }
  
  private boolean Zh(Zz_1 paramZz_1, Zboe paramZboe, float paramFloat1, float paramFloat2) {
    int[] arrayOfInt = Zgxf.ZV();
    try {
      if (!paramZboe.Zq(paramFloat1, null))
        return false; 
      int i = paramZz_1.getChildCount();
      if (i > 0) {
        float f1 = paramFloat2 / i;
        float f2 = paramFloat1;
        byte b = 0;
        while (b < paramZz_1.getChildCount()) {
          try {
            if (!Zh((Zz_1)paramZz_1.getChildAt(b), paramZboe, f2, f1))
              return false; 
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            Zah.Zl(indexOutOfBoundsException, Zk_.UNEXPECTED);
            return false;
          } 
          f2 += f1;
          b++;
          if (arrayOfInt != null)
            break; 
        } 
        Zs(new TreePath((Object[])paramZz_1.Zp()));
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return true;
  }
  
  private void Zs(TreePath paramTreePath) {
    try {
      this.Zl.add(paramTreePath);
      if (++this.ZW >= 10)
        ZP(); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void ZP() {
    Zbsv.Zb(new Zm11(this));
    this.Zl.clear();
    this.ZW = 0;
  }
  
  private boolean Zv(TreePath paramTreePath) {
    try {
      if (this.Zg == null)
        return true; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Boolean bool = this.Zg.get(paramTreePath);
    try {
      if (bool != null)
        try {
          if (bool.booleanValue());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return false;
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
  
  static {
    // Byte code:
    //   0: bipush #93
    //   2: ldc 'WHji~qHfti`o|Hpnzkmp'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmai.a : Ljava/lang/String;
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
    //   80: bipush #73
    //   82: goto -> 112
    //   85: bipush #53
    //   87: goto -> 112
    //   90: bipush #121
    //   92: goto -> 112
    //   95: bipush #91
    //   97: goto -> 112
    //   100: bipush #85
    //   102: goto -> 112
    //   105: bipush #83
    //   107: goto -> 112
    //   110: bipush #81
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmai.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */