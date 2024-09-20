package burp;

import java.awt.Component;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

class Zzee implements Zmgv {
  private final Component Zz;
  
  private final Supplier<Zto7> Zy;
  
  private static final String a;
  
  Zzee(Component paramComponent, Supplier<Zto7> paramSupplier) {
    this.Zz = paramComponent;
    this.Zy = paramSupplier;
  }
  
  public Zmzk Zod() {
    return ZS().ZlL().Zdz();
  }
  
  public List<Component> Zof() {
    return Collections.emptyList();
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a, Zk97.DESKTOP_TOOLS_LOGGER, Zt2m.ZF(this.Zz));
  }
  
  public Zbr Zo3() {
    return ZS().Zo3();
  }
  
  public Zgsq Zoe() {
    Zto7 zto7 = ZS();
    return (zto7 == null) ? null : zto7.Zoe();
  }
  
  public Zstu Zos() {
    return ZS().Zos();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public Zstu ZoO() {
    return ZS().ZoO();
  }
  
  public long ZoB() {
    return ZS().ZoB();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private Zto7 ZS() {
    return this.Zy.get();
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: ldc 'zFjPv_Tjxv[F$hxLZ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzee.a : Ljava/lang/String;
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
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #115
    //   87: goto -> 112
    //   90: bipush #49
    //   92: goto -> 112
    //   95: bipush #43
    //   97: goto -> 112
    //   100: bipush #10
    //   102: goto -> 112
    //   105: bipush #92
    //   107: goto -> 112
    //   110: bipush #89
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzee.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */