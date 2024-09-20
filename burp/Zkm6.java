package burp;

import java.util.Collection;
import java.util.Iterator;

public class Zkm6<T> {
  private final Zrvr<T> Zv;
  
  private static final String a;
  
  public Zkm6(Zrvr<T> paramZrvr) {
    this.Zv = paramZrvr;
  }
  
  public void Zs(Collection<T> paramCollection, String paramString, Zb_j paramZb_j) {
    byte b = 0;
    Iterator<T> iterator = paramCollection.iterator();
    int[] arrayOfInt = Ze5r.Zj();
    while (iterator.hasNext()) {
      T t = iterator.next();
      if (t != null) {
        String str = this.Zv.ZY(t);
        if (str != null) {
          paramZb_j.ZV(paramString + paramString, str);
          b++;
        } 
      } 
      if (arrayOfInt != null)
        break; 
    } 
    if (b == 0) {
      paramZb_j.ZV(paramString + "0", a);
      b = 1;
    } 
    while (paramZb_j.ZB(paramString + paramString)) {
      b++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: ldc '|S09v|'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkm6.a : Ljava/lang/String;
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
    //   80: bipush #76
    //   82: goto -> 112
    //   85: bipush #32
    //   87: goto -> 112
    //   90: bipush #44
    //   92: goto -> 112
    //   95: bipush #71
    //   97: goto -> 112
    //   100: bipush #122
    //   102: goto -> 112
    //   105: bipush #87
    //   107: goto -> 112
    //   110: bipush #21
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkm6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */