package burp;

public class Zx_c implements Zesu {
  private final Zeun ZX = new Zeun();
  
  private static final String a;
  
  public void Zz(Zg8y paramZg8y) {
    Zm3y zm3y;
    String[] arrayOfString = Zeun.ZG();
    if (paramZg8y instanceof Zm3y) {
      zm3y = (Zm3y)paramZg8y;
      if (paramZg8y.ZM() == Zz3o.FORM) {
        String str = zm3y.Zh().stream().filter(Zx_c::lambda$updateWith$0).map(Zrtj::Z_).findFirst().orElse(a);
        this.ZX.Zk(str);
        if (arrayOfString != null) {
          this.ZX.Zk(zm3y.Zu());
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    this.ZX.Zk(zm3y.Zu());
  }
  
  public void ZG(Zt82 paramZt82) {
    this.ZX.Zv(paramZt82, Zr());
  }
  
  public Zlug Zr() {
    return Zlug.OUTBOUND_EDGE_TAG_NAMES;
  }
  
  private static boolean lambda$updateWith$0(Zrtj paramZrtj) {
    return (paramZrtj.ZN() == Zl2w.SUBMIT || paramZrtj.ZN() == Zl2w.IMAGE);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: ldc 'KtXA8zbLoXT$}cA'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx_c.a : Ljava/lang/String;
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
    //   80: bipush #41
    //   82: goto -> 111
    //   85: bipush #23
    //   87: goto -> 111
    //   90: bipush #116
    //   92: goto -> 111
    //   95: bipush #62
    //   97: goto -> 111
    //   100: bipush #65
    //   102: goto -> 111
    //   105: bipush #20
    //   107: goto -> 111
    //   110: iconst_3
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */