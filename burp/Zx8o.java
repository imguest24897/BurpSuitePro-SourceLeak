package burp;

class Zx8o implements Zryr {
  private final Zsxk Z_;
  
  private final Zr_4 Zu;
  
  private final Zt0f ZH;
  
  private final Ze5r<Zgtc, Zrer> Zb;
  
  private static final String a;
  
  private Zx8o(Zsxk paramZsxk, Zr_4 paramZr_4) {
    this.Z_ = paramZsxk;
    this.Zu = paramZr_4;
    this.Zb = paramZsxk.Zo();
    this.ZH = new Zt0f(paramZsxk.ZJ(), this.Zb.Zf());
  }
  
  public String ZX() {
    return a;
  }
  
  public Zr_4 Zv() {
    return this.Zu;
  }
  
  public Zt0f Zy() {
    return this.ZH;
  }
  
  public Zgtc ZD(int paramInt) {
    synchronized (this.Zb.Zf()) {
      return this.Zb.ZV(paramInt);
    } 
  }
  
  public void Za(int paramInt) {
    Zgtc zgtc = ZD(paramInt);
    zgtc.Zr(!zgtc.ZA());
    this.Z_.ZO();
    this.ZH.fireTableCellUpdated(paramInt, 0);
  }
  
  public void ZR(int paramInt) {
    this.Z_.Zs(paramInt);
    this.ZH.fireTableRowsDeleted(paramInt, paramInt);
  }
  
  public void Zv(int paramInt) {
    this.Z_.Zd(paramInt - 1);
    this.ZH.fireTableRowsUpdated(paramInt - 1, paramInt);
  }
  
  public void Zo(int paramInt) {
    this.Z_.Zd(paramInt);
    this.ZH.fireTableRowsUpdated(paramInt, paramInt + 1);
  }
  
  public void ZM(Zgtc paramZgtc) {
    int i = Zk();
    this.Z_.ZU(paramZgtc);
    this.ZH.fireTableRowsInserted(i, i);
  }
  
  private int Zk() {
    synchronized (this.Zb.Zf()) {
      return this.Zb.Za().size();
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #73
    //   2: ldc 'AOzunRdoBcXb]T~\\t)bTOybPIc'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zx8o.a : Ljava/lang/String;
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
    //   85: bipush #116
    //   87: goto -> 112
    //   90: bipush #63
    //   92: goto -> 112
    //   95: bipush #89
    //   97: goto -> 112
    //   100: bipush #52
    //   102: goto -> 112
    //   105: bipush #63
    //   107: goto -> 112
    //   110: bipush #72
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx8o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */