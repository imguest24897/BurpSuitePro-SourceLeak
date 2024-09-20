package burp;

import java.awt.Component;
import java.util.function.BiFunction;
import javax.swing.JTable;

class Zm25 extends Zm23 {
  private static final Ze3m Zg = Ze3m.ZC(Zeuf.CHEVRON_RIGHT, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER);
  
  private final BiFunction<Integer, Integer, Boolean> Zs;
  
  private final Ze9n ZR;
  
  public Zm25(BiFunction<Integer, Integer, Boolean> paramBiFunction) {
    this.Zs = paramBiFunction;
    this.ZR = Zg.Z_();
    setHorizontalAlignment(0);
    setIcon(this.ZR);
    setOpaque(true);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield Zs : Ljava/util/function/BiFunction;
    //   9: iload #5
    //   11: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14: iload #6
    //   16: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   24: checkcast java/lang/Boolean
    //   27: invokevirtual booleanValue : ()Z
    //   30: ifeq -> 45
    //   33: aload_0
    //   34: getfield ZR : Lburp/Ze9n;
    //   37: invokevirtual Zx : ()V
    //   40: aload #7
    //   42: ifnull -> 52
    //   45: aload_0
    //   46: getfield ZR : Lburp/Ze9n;
    //   49: invokevirtual Zm : ()V
    //   52: aload_0
    //   53: iload_3
    //   54: ifeq -> 63
    //   57: getstatic burp/Zlkk.INSPECTOR_TABLE_ROW_HIGHLIGHT_ACTION_BACKGROUND : Lburp/Zlkk;
    //   60: goto -> 66
    //   63: getstatic burp/Zlkk.INSPECTOR_TABLE_BACKGROUND : Lburp/Zlkk;
    //   66: invokevirtual ZO : (Lburp/Zlkk;)V
    //   69: aload_0
    //   70: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm25.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */