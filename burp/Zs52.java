package burp;

import java.util.List;

class Zs52 implements Zryr {
  private final Zxl_ ZY;
  
  private final Zr_4 Ze;
  
  private final Zt0f ZX;
  
  private final List<Zgtc> ZM;
  
  private static final String a;
  
  private Zs52(Zxl_ paramZxl_, Zr_4 paramZr_4) {
    this.ZY = paramZxl_;
    this.Ze = paramZr_4;
    this.ZM = paramZxl_.ZB();
    this.ZX = new Zt0f(this.ZM, this.ZM);
  }
  
  public String ZX() {
    return a;
  }
  
  public Zr_4 Zv() {
    return this.Ze;
  }
  
  public Zt0f Zy() {
    return this.ZX;
  }
  
  public Zgtc ZD(int paramInt) {
    synchronized (this.ZM) {
      return this.ZM.get(paramInt);
    } 
  }
  
  public void Za(int paramInt) {
    Zgtc zgtc = ZD(paramInt);
    zgtc.Zr(!zgtc.ZA());
    this.ZY.ZA();
    this.ZX.fireTableCellUpdated(paramInt, 0);
  }
  
  public void ZR(int paramInt) {
    this.ZY.ZO(paramInt);
    this.ZX.fireTableRowsDeleted(paramInt, paramInt);
  }
  
  public void Zv(int paramInt) {
    this.ZY.ZD(paramInt - 1);
    this.ZX.fireTableRowsUpdated(paramInt - 1, paramInt);
  }
  
  public void Zo(int paramInt) {
    this.ZY.ZD(paramInt);
    this.ZX.fireTableRowsUpdated(paramInt, paramInt + 1);
  }
  
  public void ZM(Zgtc paramZgtc) {
    int i = ZR();
    this.ZY.ZD(paramZgtc);
    this.ZX.fireTableRowsInserted(i, i);
  }
  
  private int ZR() {
    synchronized (this.ZM) {
      return this.ZM.size();
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #62
    //   2: ldc 'l}t}!K\\bmg~a\\r\\njb?lMwzNlV\\fphxlPj rj\\fPgrn\\nA'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs52.a : Ljava/lang/String;
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
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #48
    //   87: goto -> 112
    //   90: bipush #47
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #64
    //   102: goto -> 112
    //   105: bipush #26
    //   107: goto -> 112
    //   110: bipush #70
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs52.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */