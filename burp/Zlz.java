package burp;

import java.util.List;

public class Zlz implements Zlic {
  private static final String a;
  
  public void Zf(Zstu paramZstu1, Zs68 paramZs681, Zstu paramZstu2, Zs68 paramZs682, List<Zl1r> paramList1, List<Zl1r> paramList2) {
    Zs5n zs5n1 = ZC(paramZs681);
    Zs5n zs5n2 = ZC(paramZs682);
    if (zs5n1 != null && zs5n2 != null && Zsw8.Zn(zs5n1.ZQG(), zs5n2.ZQG()))
      return; 
    if (zs5n1 != null)
      paramList1.add(new Zl1r(zs5n1.ZQs(), zs5n1.ZQc())); 
    if (zs5n2 != null)
      paramList2.add(new Zl1r(zs5n2.ZQs(), zs5n2.ZQc())); 
  }
  
  private Zs5n ZC(Zs68 paramZs68) {
    int[] arrayOfInt = Zgim.ZP();
    for (Ztu8 ztu8 : Zebz.Zf(paramZs68)) {
      if (Zljb.ZZ(ztu8)) {
        Zs5n zs5n = ztu8.ZlP().ZIm(a);
        if (zs5n != null)
          return zs5n; 
      } 
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc 'g|[4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlz.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #48
    //   82: goto -> 111
    //   85: bipush #49
    //   87: goto -> 111
    //   90: iconst_1
    //   91: goto -> 111
    //   94: bipush #109
    //   96: goto -> 111
    //   99: bipush #67
    //   101: goto -> 111
    //   104: bipush #83
    //   106: goto -> 111
    //   109: bipush #54
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */