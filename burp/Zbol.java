package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class Zbol extends DefaultListCellRenderer {
  public Component getListCellRendererComponent(JList<?> paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: iload #4
    //   6: iconst_0
    //   7: invokespecial getListCellRendererComponent : (Ljavax/swing/JList;Ljava/lang/Object;IZZ)Ljava/awt/Component;
    //   10: pop
    //   11: invokestatic ZQ : ()Z
    //   14: aload_1
    //   15: invokevirtual getBackground : ()Ljava/awt/Color;
    //   18: astore #7
    //   20: istore #6
    //   22: iload #4
    //   24: ifeq -> 40
    //   27: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   30: invokevirtual ZS : ()Ljava/awt/Color;
    //   33: astore #7
    //   35: iload #6
    //   37: ifeq -> 78
    //   40: aload_1
    //   41: invokevirtual getUI : ()Ljavax/swing/plaf/ListUI;
    //   44: astore #8
    //   46: aload #8
    //   48: instanceof burp/theme/RolloverListUI
    //   51: ifeq -> 78
    //   54: aload #8
    //   56: checkcast burp/theme/RolloverListUI
    //   59: astore #9
    //   61: aload #9
    //   63: iload_3
    //   64: invokevirtual isRolloverRow : (I)Z
    //   67: ifeq -> 78
    //   70: getstatic burp/Zlkk.ROLLOVER_BACKGROUND : Lburp/Zlkk;
    //   73: invokevirtual ZS : ()Ljava/awt/Color;
    //   76: astore #7
    //   78: aload_0
    //   79: aload #7
    //   81: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   84: aload_0
    //   85: areturn
  }
  
  public Insets getInsets() {
    Insets insets = super.getInsets();
    insets.left += 6;
    insets.right += 6;
    return insets;
  }
  
  public Insets getInsets(Insets paramInsets) {
    paramInsets = super.getInsets(paramInsets);
    paramInsets.left += 6;
    paramInsets.right += 6;
    return paramInsets;
  }
  
  public void paint(Graphics paramGraphics) {
    ((Graphics2D)paramGraphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Rectangle rectangle = paramGraphics.getClipBounds();
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRoundRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height, 10, 10);
    setBackground(null);
    super.paint(paramGraphics);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbol.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */