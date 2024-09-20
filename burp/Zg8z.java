package burp;

import java.awt.BorderLayout;

public class Zg8z extends Zbqc {
  private final Zkf3 Zv;
  
  private final Zg84 ZW;
  
  private final Zg80 Zx;
  
  private final Zg9p ZE;
  
  private final Ztzy Zg;
  
  private Zble Zt;
  
  private static final String a;
  
  public Zg8z(Ztdi paramZtdi, Zgx0 paramZgx0, Ztyg paramZtyg, Zgq7 paramZgq7, Zbnt paramZbnt, Zkf3 paramZkf3, boolean paramBoolean1, Ztwv paramZtwv, Zr8q paramZr8q, Zs0g paramZs0g, Zs6i paramZs6i, Zm6x paramZm6x, boolean paramBoolean2, Zgb6 paramZgb6, Zb0h paramZb0h) {
    this.Zv = paramZkf3;
    this.Zg = new Zge0(this);
    this.ZW = new Zg84(paramZtdi, paramZkf3.ZN(), this.Zg, paramBoolean1, paramZtwv, paramZr8q, paramZs0g);
    Ztos<Zt3y> ztos = new Ztos<>(Zt1_.Ze());
    this.Zx = new Zg80(paramZtdi, paramZgx0, paramZtyg, paramZgq7, paramZbnt, paramZkf3, (Ztos)ztos, paramBoolean1, paramZs6i, paramZm6x, paramBoolean2, paramZgb6, paramZtwv, paramZb0h);
    this.ZW.ZQ(new Zmwi(this));
    this.ZE = new Zbn1(this);
    setLayout(new BorderLayout());
    setBorder(new Zrz7(Zlkk.PANEL_BORDER));
    Zmyz zmyz = new Zmyz();
    zmyz.setLeftComponent(this.ZW);
    zmyz.setRightComponent(this.Zx);
    zmyz.Za(50);
    add(zmyz, a);
    ztos.Zb(Zt1_.Zz, paramZtdi::lambda$new$1, paramZtwv);
    ztos.Zb(Zt1_.ZW, paramZtdi::lambda$new$3, paramZtwv);
  }
  
  public void Zy() {
    this.ZW.Zc();
    this.Zx.Zu();
    this.Zv.ZU(this.ZE);
    this.Zv.Zu(this.Zg);
  }
  
  public void ZA() {
    this.Zv.ZY(this.Zg);
    this.Zv.Zs(this.ZE);
    this.Zx.ZT();
    this.ZW.ZH();
  }
  
  private static void lambda$new$3(Ztdi paramZtdi, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZtdi::lambda$new$2);
  }
  
  private static void lambda$new$2(Ztdi paramZtdi, Zgp5 paramZgp5) {
    paramZtdi.ZP(paramZgp5.ZYI());
  }
  
  private static void lambda$new$1(Ztdi paramZtdi, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramZtdi::lambda$new$0);
  }
  
  private static void lambda$new$0(Ztdi paramZtdi, Zgp5 paramZgp5) {
    paramZtdi.Zq(paramZgp5.ZYI());
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc '9\\fA"O'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg8z.a : Ljava/lang/String;
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
    //   80: bipush #110
    //   82: goto -> 112
    //   85: bipush #125
    //   87: goto -> 112
    //   90: bipush #123
    //   92: goto -> 112
    //   95: bipush #33
    //   97: goto -> 112
    //   100: bipush #83
    //   102: goto -> 112
    //   105: bipush #41
    //   107: goto -> 112
    //   110: bipush #77
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */