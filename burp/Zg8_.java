package burp;

import java.awt.BorderLayout;

class Zg8_ extends Zbqc {
  private final Zkf3 Zb;
  
  private final Zbws Z_;
  
  private final Zt0x Zt;
  
  private static final String a;
  
  public Zg8_(Zkf3 paramZkf3, boolean paramBoolean) {
    this.Zb = paramZkf3;
    setLayout(new BorderLayout());
    this.Zt = new Zt0x(paramZkf3, paramBoolean);
    this.Z_ = ZV(this.Zt);
    Zbup zbup = new Zbup();
    zbup.setViewportView(this.Z_);
    add(zbup, a);
  }
  
  private Zbws ZV(Zt0x paramZt0x) {
    Zbws zbws = new Zbws();
    zbws.setRowSelectionAllowed(true);
    zbws.setDragEnabled(false);
    zbws.setSelectionMode(0);
    zbws.ZL(paramZt0x);
    zbws.setFillsViewportHeight(true);
    return zbws;
  }
  
  void Zx() {
    this.Zb.Zv(this.Zt);
    this.Zb.Zq(this.Zt);
  }
  
  public void Zs() {
    this.Zb.ZX(this.Zt);
    this.Zb.ZE(this.Zt);
  }
  
  void Z_(Zmnm paramZmnm) {
    this.Z_.clearSelection();
    this.Zt.ZC(paramZmnm);
  }
  
  void ZS(Zmnm paramZmnm) {
    this.Zt.Zp(paramZmnm);
  }
  
  static {
    // Byte code:
    //   0: bipush #47
    //   2: ldc 'RZf3'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg8_.a : Ljava/lang/String;
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
    //   80: bipush #62
    //   82: goto -> 112
    //   85: bipush #16
    //   87: goto -> 112
    //   90: bipush #39
    //   92: goto -> 112
    //   95: bipush #104
    //   97: goto -> 112
    //   100: bipush #95
    //   102: goto -> 112
    //   105: bipush #66
    //   107: goto -> 112
    //   110: bipush #90
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */