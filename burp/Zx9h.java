package burp;

import java.util.Objects;
import net.portswigger.Zsy;

class Zx9h extends Zx9q implements Zl4b {
  private static final String a;
  
  Zx9h(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Ztvs ZRz() {
    return new Ztv1(ZjC(), new Zsy(String.valueOf(ZnQ())));
  }
  
  public boolean ZY(Ze7n paramZe7n) {
    return Ztrt.Zr(paramZe7n);
  }
  
  private int ZnQ() {
    return this.Za.Zx(this, Zk6x.ZF);
  }
  
  public boolean equals(Object paramObject) {
    return (super.equals(paramObject) && Ztrt.ZJ(this, paramObject));
  }
  
  public int hashCode() {
    int[] arrayOfInt = Zfc.ZMt();
    if (Zbqc.Zwu() == null)
      Zfc.ZO(new int[3]); 
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), ZjC(), Boolean.valueOf(ZRC()) });
  }
  
  public Zb9v ZjC() {
    return this.Za.<Zb9v>ZJ(this, Zk6x.Zv);
  }
  
  public String toString() {
    return a;
  }
  
  public Zeu4<? extends Zlru> ZF() {
    return (Zeu4)Zl4b.ZX;
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '\\r$ PO/'77J>7'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx9h.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #120
    //   82: goto -> 111
    //   85: bipush #96
    //   87: goto -> 111
    //   90: bipush #93
    //   92: goto -> 111
    //   95: bipush #114
    //   97: goto -> 111
    //   100: iconst_3
    //   101: goto -> 111
    //   104: bipush #23
    //   106: goto -> 111
    //   109: bipush #109
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */