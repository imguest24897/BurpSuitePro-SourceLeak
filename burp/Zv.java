package burp;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;

class Zv extends BoxLayout {
  public Zv(Container paramContainer, int paramInt) {
    super(paramContainer, paramInt);
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    return ZF(paramContainer, super.preferredLayoutSize(paramContainer));
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return ZF(paramContainer, super.minimumLayoutSize(paramContainer));
  }
  
  public void layoutContainer(Container paramContainer) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial layoutContainer : (Ljava/awt/Container;)V
    //   5: invokestatic Z_z : ()[Lburp/Zbqc;
    //   8: iconst_1
    //   9: istore_3
    //   10: astore_2
    //   11: iload_3
    //   12: aload_1
    //   13: invokevirtual getComponentCount : ()I
    //   16: if_icmpge -> 108
    //   19: aload_1
    //   20: iload_3
    //   21: invokevirtual getComponent : (I)Ljava/awt/Component;
    //   24: astore #4
    //   26: aload #4
    //   28: invokevirtual getBounds : ()Ljava/awt/Rectangle;
    //   31: astore #5
    //   33: aload_0
    //   34: invokevirtual getAxis : ()I
    //   37: istore #6
    //   39: iload #6
    //   41: ifeq -> 50
    //   44: iload #6
    //   46: iconst_2
    //   47: if_icmpne -> 68
    //   50: aload #5
    //   52: dup
    //   53: getfield x : I
    //   56: iload_3
    //   57: bipush #6
    //   59: imul
    //   60: iadd
    //   61: putfield x : I
    //   64: aload_2
    //   65: ifnonnull -> 94
    //   68: iload #6
    //   70: iconst_1
    //   71: if_icmpeq -> 80
    //   74: iload #6
    //   76: iconst_3
    //   77: if_icmpne -> 94
    //   80: aload #5
    //   82: dup
    //   83: getfield y : I
    //   86: iload_3
    //   87: bipush #6
    //   89: imul
    //   90: iadd
    //   91: putfield y : I
    //   94: aload #4
    //   96: aload #5
    //   98: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   101: iinc #3, 1
    //   104: aload_2
    //   105: ifnonnull -> 11
    //   108: return
  }
  
  private Dimension ZF(Container paramContainer, Dimension paramDimension) {
    int i = (paramContainer.getComponentCount() - 1) * 6;
    int j = getAxis();
    return (j == 0 || j == 2) ? new Dimension(paramDimension.width + i, paramDimension.height) : ((j == 1 || j == 3) ? new Dimension(paramDimension.width, paramDimension.height + i) : paramDimension);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */