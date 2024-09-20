package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm7z {
  private Zgxf Zn;
  
  private Zor Zp;
  
  private final Map<TreePath, Boolean> ZA;
  
  private boolean ZL;
  
  private final List<TreePath> Zz;
  
  private int ZN;
  
  private static final String a;
  
  public Zm7z(Zgxf paramZgxf, Zor paramZor, Map<TreePath, Boolean> paramMap, boolean paramBoolean) {
    this.Zn = paramZgxf;
    this.Zp = paramZor;
    this.ZA = paramMap;
    this.ZL = paramBoolean;
    this.Zz = new ArrayList<>(10);
  }
  
  public boolean ZG(Ze3h paramZe3h) {
    this.Zn.ZQ(new Zgur(this, paramZe3h), a);
    return true;
  }
  
  private boolean Zi(Zz_1 paramZz_1, Zboe paramZboe, boolean paramBoolean, float paramFloat1, float paramFloat2) {
    int[] arrayOfInt = Zgxf.ZV();
    try {
      if (!paramZboe.Zq(paramFloat1, null))
        return false; 
      try {
        if (paramBoolean && !paramZz_1.Zi())
          return true; 
      } catch (Exception exception) {
        throw a(null);
      } 
      int i = paramZz_1.getChildCount();
      if (i > 0) {
        float f1 = paramFloat2 / i;
        float f2 = paramFloat1;
        int j = paramZz_1.getChildCount() - 1;
        while (j >= 0) {
          if (!Zi((Zz_1)paramZz_1.getChildAt(j), paramZboe, paramBoolean, f2, f1))
            return false; 
          f2 += f1;
          j--;
          if (arrayOfInt != null)
            break; 
        } 
        Zq(new TreePath((Object[])paramZz_1.Zp()));
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return true;
  }
  
  private void Zq(TreePath paramTreePath) {
    this.Zz.add(paramTreePath);
    if (++this.ZN >= 10)
      Zg(); 
  }
  
  private void Zg() {
    Zbsv.Zb(new Zz7h(this));
    this.Zz.clear();
    this.ZN = 0;
  }
  
  private boolean Zc(TreePath paramTreePath) {
    if (this.ZA == null)
      return true; 
    Boolean bool = this.ZA.get(paramTreePath);
    return (bool == null || !bool.booleanValue());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'Y'?892^-0552H7;79'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm7z.a : Ljava/lang/String;
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
    //   80: bipush #82
    //   82: goto -> 112
    //   85: bipush #17
    //   87: goto -> 112
    //   90: bipush #41
    //   92: goto -> 112
    //   95: bipush #16
    //   97: goto -> 112
    //   100: bipush #24
    //   102: goto -> 112
    //   105: bipush #19
    //   107: goto -> 112
    //   110: bipush #92
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */