package burp;

import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public class Zezm extends Zezv {
  private final Zb9v Zo;
  
  private final BooleanSupplier Zk;
  
  private static final String b;
  
  public Zezm(byte paramByte, Zr69 paramZr69, Zl7h paramZl7h, Ztos<Zt35> paramZtos, Zb9v paramZb9v, String paramString, BooleanSupplier paramBooleanSupplier) {
    super(paramByte, paramZr69, paramZl7h, paramZtos, paramString);
    this.Zo = paramZb9v;
    this.Zk = paramBooleanSupplier;
  }
  
  protected Zrp0 Z_() {
    String str = Zez7.Zv();
    Zbg zbg = this.ZQ.ZVx().ZPZ();
    if (zbg == null) {
      this.ZW.Zy(Zrp6.DEBUG, Zlq7.NOT_FOUND_LOGIN_DOORWAY, new Object[0]);
      return null;
    } 
    List<Zl_> list = zbg.Zna();
    Optional<Ztc6> optional = Zg0y.ZF(this.ZQ, this.Zd, Zrp6.DEBUG).ZE(Ztiq.Zk().ZO((List)list));
    if (!optional.isEmpty()) {
      Zrp0 zrp0 = ((Ztc6)optional.get()).ZV().ZXL();
      if (zrp0 instanceof Zl_) {
        Zl_ zl_ = (Zl_)zrp0;
        if (str != null) {
          this.ZW.Zy(Zrp6.DEBUG, Zlq7.FOUND_LOGIN_DOORWAY, new Object[] { zl_.Znq().ZHk().<String>map(Zski::ZyJ).orElse("") });
          this.ZW.Zy(Zrp6.DEBUG, Zlq7.ATTEMPTING_TO_LOGIN, new Object[] { this.Zp });
          return zl_;
        } 
      } 
    } 
    this.ZW.Zy(Zrp6.DEBUG, Zlq7.NOT_FOUND_LOGIN_DOORWAY, new Object[0]);
    return null;
  }
  
  public boolean ZN(Zsiv paramZsiv) {
    if (!this.Zk.getAsBoolean())
      return false; 
    this.Zd.Zl(new Zb9v[] { this.Zo });
    return super.ZN(paramZsiv);
  }
  
  public boolean Zg() {
    return false;
  }
  
  public String toString() {
    return b + b + String.valueOf(this.Zo);
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 'z&7|F%Q\\r*AG.p :@m%S=\\t2Wz)Y!(M[/X*'GH&Or'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zezm.b : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #61
    //   82: goto -> 112
    //   85: bipush #78
    //   87: goto -> 112
    //   90: bipush #127
    //   92: goto -> 112
    //   95: bipush #82
    //   97: goto -> 112
    //   100: bipush #47
    //   102: goto -> 112
    //   105: bipush #40
    //   107: goto -> 112
    //   110: bipush #75
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */