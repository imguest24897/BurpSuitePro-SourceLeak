package burp.theme;

import com.formdev.flatlaf.ui.FlatTabbedPaneUI;

class BurpTabbedPaneUI$1 extends FlatTabbedPaneUI.FlatTabbedPaneLayout {
  final BurpTabbedPaneUI this$0;
  
  private static final String a;
  
  BurpTabbedPaneUI$1() {
    super(paramBurpTabbedPaneUI);
  }
  
  protected void calculateTabRects(int paramInt1, int paramInt2) {
    super.calculateTabRects(paramInt1, paramInt2);
    reverseRuns(paramInt2);
  }
  
  protected void normalizeTabRuns(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected void padTabRun(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt3 != (BurpTabbedPaneUI.access$000(BurpTabbedPaneUI.this)).length - 1)
      super.padTabRun(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  protected void padSelectedTab(int paramInt1, int paramInt2) {}
  
  protected int preferredTabAreaHeight(int paramInt1, int paramInt2) {
    return (BurpTabbedPaneUI.access$100(BurpTabbedPaneUI.this).getTabCount() == 0 && BurpTabbedPaneUI.access$200(BurpTabbedPaneUI.this).getClientProperty(a) instanceof java.awt.Component) ? BurpTabbedPaneUI.access$300(BurpTabbedPaneUI.this, paramInt1, 1, BurpTabbedPaneUI.this.calculateMaxTabHeight(paramInt1)) : super.preferredTabAreaHeight(paramInt1, paramInt2);
  }
  
  private void reverseRuns(int paramInt) {
    int[] arrayOfInt = new int[BurpTabbedPaneUI.access$400(BurpTabbedPaneUI.this)];
    int i = BurpTableUI.ZL();
    byte b1 = 0;
    while (b1 < BurpTabbedPaneUI.access$500(BurpTabbedPaneUI.this)) {
      arrayOfInt[b1] = (BurpTabbedPaneUI.access$600(BurpTabbedPaneUI.this)[BurpTabbedPaneUI.access$700(BurpTabbedPaneUI.this)[b1]]).y;
      b1++;
      if (i == 0)
        break; 
    } 
    b1 = 0;
    byte b2 = 0;
    while (b2 < paramInt) {
      if (b1 < BurpTabbedPaneUI.access$800(BurpTabbedPaneUI.this) - 1 && b2 == BurpTabbedPaneUI.access$900(BurpTabbedPaneUI.this)[b1 + 1])
        b1++; 
      (BurpTabbedPaneUI.access$1000(BurpTabbedPaneUI.this)[b2]).y = arrayOfInt[BurpTabbedPaneUI.access$1100(BurpTabbedPaneUI.this) - 1 - b1];
      b2++;
      if (i == 0)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #92
    //   2: ldc 'G)\\n,^m]`O{l \Jb ^gy'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/theme/BurpTabbedPaneUI$1.a : Ljava/lang/String;
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
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #33
    //   87: goto -> 112
    //   90: bipush #55
    //   92: goto -> 112
    //   95: bipush #42
    //   97: goto -> 112
    //   100: bipush #18
    //   102: goto -> 112
    //   105: bipush #103
    //   107: goto -> 112
    //   110: bipush #85
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTabbedPaneUI$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */