package burp.theme;

import com.formdev.flatlaf.ui.FlatTabbedPaneUI;
import java.awt.Container;
import java.awt.Rectangle;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

class BurpOverflowTabbedPaneUI$1 extends FlatTabbedPaneUI.FlatTabbedPaneScrollLayout {
  final BurpOverflowTabbedPaneUI this$0;
  
  BurpOverflowTabbedPaneUI$1(BasicTabbedPaneUI.TabbedPaneLayout paramTabbedPaneLayout) {
    super(paramBurpOverflowTabbedPaneUI, paramTabbedPaneLayout);
  }
  
  public void layoutContainer(Container paramContainer) {
    super.layoutContainer(paramContainer);
    updateTabRects();
    updateMoreTabsButtonPosition();
  }
  
  private void updateTabRects() {
    int j = BurpOverflowTabbedPaneUI.access$000(BurpOverflowTabbedPaneUI.this).getSelectedIndex();
    int i = BurpTableUI.ZL();
    if (j != -1) {
      calculateTabVisibleIndices();
      if (!BurpOverflowTabbedPaneUI.this.tabsInOriginalOrder(j)) {
        Rectangle rectangle1 = BurpOverflowTabbedPaneUI.access$100(BurpOverflowTabbedPaneUI.this)[j];
        int k = rectangle1.width;
        Rectangle rectangle2 = new Rectangle((BurpOverflowTabbedPaneUI.access$200(BurpOverflowTabbedPaneUI.this)[BurpOverflowTabbedPaneUI.this.tabbedPane.ZI()]).x, rectangle1.y, k, rectangle1.height);
        int m = j;
        while (m > BurpOverflowTabbedPaneUI.this.tabbedPane.ZI()) {
          BurpOverflowTabbedPaneUI.access$300(BurpOverflowTabbedPaneUI.this)[m] = BurpOverflowTabbedPaneUI.access$400(BurpOverflowTabbedPaneUI.this)[m - 1];
          (BurpOverflowTabbedPaneUI.access$500(BurpOverflowTabbedPaneUI.this)[m]).x += k;
          m--;
          if (i == 0)
            break; 
        } 
        BurpOverflowTabbedPaneUI.access$600(BurpOverflowTabbedPaneUI.this)[BurpOverflowTabbedPaneUI.this.tabbedPane.ZI()] = rectangle2;
        if (BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() != -1 && BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() < (BurpOverflowTabbedPaneUI.access$700(BurpOverflowTabbedPaneUI.this)).length && BurpOverflowTabbedPaneUI.this.tabbedPane.Zy() != BurpOverflowTabbedPaneUI.this.tabbedPane.ZI()) {
          Rectangle rectangle3 = BurpOverflowTabbedPaneUI.access$800(BurpOverflowTabbedPaneUI.this)[BurpOverflowTabbedPaneUI.this.tabbedPane.ZO()];
          int n = rectangle3.width;
          Rectangle rectangle4 = new Rectangle((BurpOverflowTabbedPaneUI.access$900(BurpOverflowTabbedPaneUI.this)[BurpOverflowTabbedPaneUI.this.tabbedPane.Zy()]).x, rectangle3.y, n, rectangle3.height);
          if (BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() != j) {
            int i1 = BurpOverflowTabbedPaneUI.this.tabbedPane.ZO();
            while (i1 > BurpOverflowTabbedPaneUI.this.tabbedPane.Zy()) {
              BurpOverflowTabbedPaneUI.access$1000(BurpOverflowTabbedPaneUI.this)[i1] = BurpOverflowTabbedPaneUI.access$1100(BurpOverflowTabbedPaneUI.this)[i1 - 1];
              (BurpOverflowTabbedPaneUI.access$1200(BurpOverflowTabbedPaneUI.this)[i1]).x += n;
              i1--;
              if (i == 0)
                break; 
            } 
            BurpOverflowTabbedPaneUI.access$1300(BurpOverflowTabbedPaneUI.this)[BurpOverflowTabbedPaneUI.this.tabbedPane.Zy()] = rectangle4;
          } 
        } 
      } 
    } 
  }
  
  private void calculateTabVisibleIndices() {
    boolean bool = false;
    int j = (BurpOverflowTabbedPaneUI.access$1400(BurpOverflowTabbedPaneUI.this).getBounds()).width;
    int k = BurpOverflowTabbedPaneUI.access$1500(BurpOverflowTabbedPaneUI.this).getSelectedIndex();
    int m = (BurpOverflowTabbedPaneUI.access$1600(BurpOverflowTabbedPaneUI.this)[k]).width;
    int i = BurpTableUI.Zk();
    byte b1 = (BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() == -1 || BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() >= (BurpOverflowTabbedPaneUI.access$1700(BurpOverflowTabbedPaneUI.this)).length || BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() == k) ? 0 : (BurpOverflowTabbedPaneUI.access$1800(BurpOverflowTabbedPaneUI.this)[BurpOverflowTabbedPaneUI.this.tabbedPane.ZO()]).width;
    byte b2 = 0;
    while (b2 < (BurpOverflowTabbedPaneUI.access$1900(BurpOverflowTabbedPaneUI.this)).length) {
      Rectangle rectangle = BurpOverflowTabbedPaneUI.access$2000(BurpOverflowTabbedPaneUI.this)[b2];
      if (b2 == k) {
        BurpOverflowTabbedPaneUI.this.tabbedPane.Zl(b2);
        bool = true;
      } 
      if (b2 == BurpOverflowTabbedPaneUI.this.tabbedPane.ZO()) {
        BurpOverflowTabbedPaneUI.this.tabbedPane.Zg(-1);
        BurpOverflowTabbedPaneUI.this.tabbedPane.ZX(-1);
        return;
      } 
      byte b = bool ? b1 : (m + b1);
      if (j >= rectangle.x + rectangle.width + b || i != 0) {
        b2++;
        if (i != 0)
          break; 
      } 
    } 
    if (!bool)
      BurpOverflowTabbedPaneUI.this.tabbedPane.Zl(b2); 
    if (BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() != -1) {
      BurpOverflowTabbedPaneUI.this.tabbedPane.ZX((bool || BurpOverflowTabbedPaneUI.this.tabbedPane.ZO() == k) ? b2 : (b2 + 1));
      if (i != 0) {
        if (!bool) {
          BurpOverflowTabbedPaneUI.this.tabbedPane.Zg(k);
          BurpOverflowTabbedPaneUI.this.tabbedPane.ZX(b2);
        } 
        return;
      } 
      return;
    } 
    if (!bool) {
      BurpOverflowTabbedPaneUI.this.tabbedPane.Zg(k);
      BurpOverflowTabbedPaneUI.this.tabbedPane.ZX(b2);
    } 
  }
  
  private void updateMoreTabsButtonPosition() {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: iconst_0
    //   4: istore_3
    //   5: istore_1
    //   6: aload_0
    //   7: getfield this$0 : Lburp/theme/BurpOverflowTabbedPaneUI;
    //   10: invokestatic access$2100 : (Lburp/theme/BurpOverflowTabbedPaneUI;)Ljavax/swing/JViewport;
    //   13: invokevirtual getBounds : ()Ljava/awt/Rectangle;
    //   16: getfield width : I
    //   19: istore #4
    //   21: iconst_0
    //   22: istore_2
    //   23: iload_2
    //   24: aload_0
    //   25: getfield this$0 : Lburp/theme/BurpOverflowTabbedPaneUI;
    //   28: invokestatic access$2200 : (Lburp/theme/BurpOverflowTabbedPaneUI;)[Ljava/awt/Rectangle;
    //   31: arraylength
    //   32: if_icmpge -> 122
    //   35: iload_3
    //   36: aload_0
    //   37: getfield this$0 : Lburp/theme/BurpOverflowTabbedPaneUI;
    //   40: invokestatic access$2300 : (Lburp/theme/BurpOverflowTabbedPaneUI;)[Ljava/awt/Rectangle;
    //   43: iload_2
    //   44: aaload
    //   45: getfield width : I
    //   48: iadd
    //   49: istore_3
    //   50: iload_3
    //   51: iload #4
    //   53: if_icmple -> 115
    //   56: aload_0
    //   57: getfield this$0 : Lburp/theme/BurpOverflowTabbedPaneUI;
    //   60: getfield moreTabsButton : Lburp/theme/BurpOverflowTabbedPaneUI$MoreTabsButton;
    //   63: invokevirtual getBounds : ()Ljava/awt/Rectangle;
    //   66: astore #5
    //   68: aload_0
    //   69: getfield this$0 : Lburp/theme/BurpOverflowTabbedPaneUI;
    //   72: invokestatic access$2400 : (Lburp/theme/BurpOverflowTabbedPaneUI;)[Ljava/awt/Rectangle;
    //   75: iload_2
    //   76: aaload
    //   77: getfield x : I
    //   80: istore #6
    //   82: iload #6
    //   84: aload #5
    //   86: getfield x : I
    //   89: if_icmpge -> 122
    //   92: aload #5
    //   94: iload #6
    //   96: putfield x : I
    //   99: aload_0
    //   100: getfield this$0 : Lburp/theme/BurpOverflowTabbedPaneUI;
    //   103: getfield moreTabsButton : Lburp/theme/BurpOverflowTabbedPaneUI$MoreTabsButton;
    //   106: aload #5
    //   108: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   111: iload_1
    //   112: ifne -> 122
    //   115: iinc #2, 1
    //   118: iload_1
    //   119: ifne -> 23
    //   122: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpOverflowTabbedPaneUI$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */