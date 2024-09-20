package burp;

import java.awt.Component;
import javax.swing.table.TableCellRenderer;

class Zbw3 extends Zbws implements Zeq {
  final Zbmo ZP;
  
  Zbw3(Zbmo paramZbmo, Ztn4 paramZtn4) {
    super(paramZtn4);
    Zc(this);
  }
  
  public void changeSelection(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #5
    //   5: aload_0
    //   6: aload_0
    //   7: getfield ZP : Lburp/Zbmo;
    //   10: getfield Zq : Lburp/Zbw3;
    //   13: if_acmpne -> 38
    //   16: aload_0
    //   17: iload_1
    //   18: aload_0
    //   19: getfield ZP : Lburp/Zbmo;
    //   22: getfield Zr : Lburp/Zbw3;
    //   25: invokevirtual getSelectedRow : ()I
    //   28: invokevirtual ZJ : (II)I
    //   31: istore #6
    //   33: iload #5
    //   35: ifne -> 55
    //   38: aload_0
    //   39: iload_1
    //   40: aload_0
    //   41: getfield ZP : Lburp/Zbmo;
    //   44: getfield Zq : Lburp/Zbw3;
    //   47: invokevirtual getSelectedRow : ()I
    //   50: invokevirtual ZJ : (II)I
    //   53: istore #6
    //   55: aload_0
    //   56: iload #6
    //   58: iload_2
    //   59: iload_3
    //   60: iload #4
    //   62: invokespecial changeSelection : (IIZZ)V
    //   65: return
  }
  
  private int ZJ(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: istore_3
    //   4: iload_1
    //   5: istore #4
    //   7: iload #4
    //   9: iload_2
    //   10: if_icmpne -> 73
    //   13: aload_0
    //   14: invokevirtual getSelectedRow : ()I
    //   17: istore #5
    //   19: iload #4
    //   21: iload #5
    //   23: if_icmpeq -> 73
    //   26: iload #4
    //   28: iload #5
    //   30: iconst_1
    //   31: iadd
    //   32: if_icmpne -> 58
    //   35: iload #4
    //   37: iconst_1
    //   38: iadd
    //   39: istore #4
    //   41: iload #4
    //   43: aload_0
    //   44: invokevirtual getRowCount : ()I
    //   47: if_icmpne -> 73
    //   50: iload #5
    //   52: istore #4
    //   54: iload_3
    //   55: ifeq -> 73
    //   58: iload #4
    //   60: iconst_1
    //   61: isub
    //   62: istore #4
    //   64: iload #4
    //   66: ifge -> 73
    //   69: iload #5
    //   71: istore #4
    //   73: iload #4
    //   75: ireturn
  }
  
  public Component prepareRenderer(TableCellRenderer paramTableCellRenderer, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: aload_1
    //   7: iload_2
    //   8: iload_3
    //   9: invokespecial prepareRenderer : (Ljavax/swing/table/TableCellRenderer;II)Ljava/awt/Component;
    //   12: astore #5
    //   14: aload_0
    //   15: aload_0
    //   16: getfield ZP : Lburp/Zbmo;
    //   19: getfield Zq : Lburp/Zbw3;
    //   22: if_acmpne -> 65
    //   25: iload_2
    //   26: aload_0
    //   27: getfield ZP : Lburp/Zbmo;
    //   30: getfield Zr : Lburp/Zbw3;
    //   33: invokevirtual getSelectedRow : ()I
    //   36: if_icmpne -> 52
    //   39: aload #5
    //   41: getstatic java/awt/Color.LIGHT_GRAY : Ljava/awt/Color;
    //   44: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   47: iload #4
    //   49: ifne -> 100
    //   52: aload #5
    //   54: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   57: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   60: iload #4
    //   62: ifne -> 100
    //   65: iload_2
    //   66: aload_0
    //   67: getfield ZP : Lburp/Zbmo;
    //   70: getfield Zq : Lburp/Zbw3;
    //   73: invokevirtual getSelectedRow : ()I
    //   76: if_icmpne -> 92
    //   79: aload #5
    //   81: getstatic java/awt/Color.LIGHT_GRAY : Ljava/awt/Color;
    //   84: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   87: iload #4
    //   89: ifne -> 100
    //   92: aload #5
    //   94: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   97: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   100: aload #5
    //   102: areturn
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    if (paramInt1 == -1)
      return; 
    if ((this == this.ZP.Zq && this.ZP.Zr.getSelectedRow() != -1) || (this == this.ZP.Zr && this.ZP.Zq.getSelectedRow() != -1)) {
      this.ZP.Zo.setEnabled(true);
      this.ZP.ZE.setEnabled(true);
    } 
    this.ZP.Zq.repaint();
    this.ZP.Zr.repaint();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbw3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */