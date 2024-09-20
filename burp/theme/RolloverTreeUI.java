package burp.theme;

import burp.Zlkk;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.function.Supplier;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.plaf.ComponentUI;
import javax.swing.tree.TreePath;

public class RolloverTreeUI extends BurpTreeUI {
  public static final int HORIZONTAL_PADDING = 10;
  
  private int rolloverRow = -1;
  
  private RolloverTreeUI$RolloverTreeAdapter rolloverTreeAdapter;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new RolloverTreeUI();
  }
  
  protected void installListeners() {
    super.installListeners();
    this.rolloverTreeAdapter = new RolloverTreeUI$RolloverTreeAdapter(this);
    this.tree.addMouseListener(this.rolloverTreeAdapter);
    this.tree.addMouseMotionListener(this.rolloverTreeAdapter);
    this.tree.addMouseWheelListener(this.rolloverTreeAdapter);
  }
  
  protected void uninstallListeners() {
    this.tree.removeMouseWheelListener(this.rolloverTreeAdapter);
    this.tree.removeMouseMotionListener(this.rolloverTreeAdapter);
    this.tree.removeMouseListener(this.rolloverTreeAdapter);
    super.uninstallListeners();
  }
  
  protected void completeUIUninstall() {
    super.completeUIUninstall();
    this.rolloverTreeAdapter = null;
  }
  
  public boolean isRolloverRow(int paramInt) {
    return (this.rolloverRow == paramInt);
  }
  
  protected boolean isPaintSelection() {
    return false;
  }
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual create : ()Ljava/awt/Graphics;
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual getClipBounds : ()Ljava/awt/Rectangle;
    //   11: astore #5
    //   13: aload #4
    //   15: checkcast java/awt/Graphics2D
    //   18: getstatic java/awt/RenderingHints.KEY_ANTIALIASING : Ljava/awt/RenderingHints$Key;
    //   21: getstatic java/awt/RenderingHints.VALUE_ANTIALIAS_ON : Ljava/lang/Object;
    //   24: invokevirtual setRenderingHint : (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
    //   27: invokestatic Zk : ()I
    //   30: aload_0
    //   31: aload_0
    //   32: getfield tree : Ljavax/swing/JTree;
    //   35: invokevirtual getMousePosition : ()Ljava/awt/Point;
    //   38: invokevirtual getTreePathForPoint : (Ljava/awt/Point;)Ljavax/swing/tree/TreePath;
    //   41: astore #6
    //   43: aload_0
    //   44: getfield tree : Ljavax/swing/JTree;
    //   47: iconst_0
    //   48: aload #5
    //   50: getfield y : I
    //   53: invokevirtual getClosestRowForLocation : (II)I
    //   56: istore #7
    //   58: aload_0
    //   59: getfield tree : Ljavax/swing/JTree;
    //   62: iconst_0
    //   63: aload #5
    //   65: getfield y : I
    //   68: aload #5
    //   70: getfield height : I
    //   73: iadd
    //   74: iconst_1
    //   75: isub
    //   76: invokevirtual getClosestRowForLocation : (II)I
    //   79: istore #8
    //   81: aload_0
    //   82: getfield tree : Ljavax/swing/JTree;
    //   85: aload #6
    //   87: invokevirtual getRowForPath : (Ljavax/swing/tree/TreePath;)I
    //   90: istore #9
    //   92: istore_3
    //   93: iload #7
    //   95: iconst_m1
    //   96: if_icmpne -> 102
    //   99: iconst_0
    //   100: istore #7
    //   102: iload #8
    //   104: iconst_m1
    //   105: if_icmpne -> 112
    //   108: iload #7
    //   110: istore #8
    //   112: iload #7
    //   114: istore #10
    //   116: iload #10
    //   118: iload #8
    //   120: if_icmpgt -> 171
    //   123: aload_0
    //   124: getfield tree : Ljavax/swing/JTree;
    //   127: iload #10
    //   129: invokevirtual isRowSelected : (I)Z
    //   132: ifeq -> 147
    //   135: aload_0
    //   136: aload #4
    //   138: iload #10
    //   140: invokevirtual paintSelectedRow : (Ljava/awt/Graphics;I)V
    //   143: iload_3
    //   144: ifeq -> 164
    //   147: iload #9
    //   149: iload #10
    //   151: if_icmpne -> 164
    //   154: aload_0
    //   155: aload #4
    //   157: aload #6
    //   159: iload #10
    //   161: invokevirtual paintRolloverRow : (Ljava/awt/Graphics;Ljavax/swing/tree/TreePath;I)V
    //   164: iinc #10, 1
    //   167: iload_3
    //   168: ifeq -> 116
    //   171: aload #4
    //   173: invokevirtual dispose : ()V
    //   176: aload_0
    //   177: aload_1
    //   178: aload_2
    //   179: invokespecial paint : (Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
    //   182: return
  }
  
  private void paintSelectedRow(Graphics paramGraphics, int paramInt) {
    Objects.requireNonNull(Zlkk.SELECTION_BACKGROUND);
    paintRow(paramGraphics, paramInt, Zlkk.SELECTION_BACKGROUND::ZS);
  }
  
  private void paintRolloverRow(Graphics paramGraphics, TreePath paramTreePath, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_3
    //   3: aload_0
    //   4: aload_2
    //   5: iload_3
    //   6: <illegal opcode> get : (Lburp/theme/RolloverTreeUI;Ljavax/swing/tree/TreePath;I)Ljava/util/function/Supplier;
    //   11: invokevirtual paintRow : (Ljava/awt/Graphics;ILjava/util/function/Supplier;)V
    //   14: return
  }
  
  private void paintRow(Graphics paramGraphics, int paramInt, Supplier<Color> paramSupplier) {
    Rectangle rectangle = this.tree.getRowBounds(paramInt);
    if (rectangle != null) {
      paramGraphics.setColor(paramSupplier.get());
      Insets insets = this.tree.getInsets();
      int i = insets.left - 10;
      int j = insets.right - 10;
      paramGraphics.fillRoundRect(rectangle.x + i, rectangle.y, rectangle.width - i - j, rectangle.height, 10, 10);
    } 
  }
  
  private int getRowForPoint(Point paramPoint) {
    return (paramPoint == null) ? -1 : this.tree.getRowForLocation(paramPoint.x, paramPoint.y);
  }
  
  private TreePath getTreePathForPoint(Point paramPoint) {
    return (paramPoint == null) ? null : this.tree.getPathForLocation(paramPoint.x, paramPoint.y);
  }
  
  private Color lambda$paintRolloverRow$0(TreePath paramTreePath, int paramInt) {
    Component component = this.currentCellRenderer.getTreeCellRendererComponent(this.tree, paramTreePath.getLastPathComponent(), false, false, false, paramInt, false);
    return component.getBackground();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\RolloverTreeUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */