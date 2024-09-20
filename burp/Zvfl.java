package burp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class Zvfl extends JComponent {
  private static final Rectangle ZC = new Rectangle();
  
  private final JTabbedPane Zn;
  
  private final AtomicReference<Rectangle> Zh;
  
  public Zvfl(JTabbedPane paramJTabbedPane) {
    this.Zn = paramJTabbedPane;
    this.Zh = new AtomicReference<>(ZC);
  }
  
  public void Zv() {
    this.Zh.set(ZC);
  }
  
  public void ZA(int paramInt) {
    String[] arrayOfString = Zxer.Zr();
    if (paramInt < 0) {
      this.Zh.set(ZC);
      return;
    } 
    if (this.Zn.getTabPlacement() == 1 || this.Zn.getTabPlacement() == 3) {
      Zj(paramInt);
      if (arrayOfString != null) {
        Zp(paramInt);
        return;
      } 
      return;
    } 
    Zp(paramInt);
  }
  
  private void Zj(int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zn : Ljavax/swing/JTabbedPane;
    //   8: invokevirtual getTabCount : ()I
    //   11: ifne -> 15
    //   14: return
    //   15: iload_1
    //   16: ifne -> 59
    //   19: aload_0
    //   20: getfield Zn : Ljavax/swing/JTabbedPane;
    //   23: iconst_0
    //   24: invokevirtual getBoundsAt : (I)Ljava/awt/Rectangle;
    //   27: astore #4
    //   29: new java/awt/Rectangle
    //   32: dup
    //   33: aload #4
    //   35: getfield x : I
    //   38: iconst_1
    //   39: isub
    //   40: aload #4
    //   42: getfield y : I
    //   45: iconst_3
    //   46: aload #4
    //   48: getfield height : I
    //   51: invokespecial <init> : (IIII)V
    //   54: astore_3
    //   55: aload_2
    //   56: ifnull -> 103
    //   59: aload_0
    //   60: getfield Zn : Ljavax/swing/JTabbedPane;
    //   63: iload_1
    //   64: iconst_1
    //   65: isub
    //   66: invokevirtual getBoundsAt : (I)Ljava/awt/Rectangle;
    //   69: astore #4
    //   71: new java/awt/Rectangle
    //   74: dup
    //   75: aload #4
    //   77: getfield x : I
    //   80: aload #4
    //   82: getfield width : I
    //   85: iadd
    //   86: iconst_1
    //   87: isub
    //   88: aload #4
    //   90: getfield y : I
    //   93: iconst_3
    //   94: aload #4
    //   96: getfield height : I
    //   99: invokespecial <init> : (IIII)V
    //   102: astore_3
    //   103: aload_0
    //   104: getfield Zh : Ljava/util/concurrent/atomic/AtomicReference;
    //   107: aload_3
    //   108: invokevirtual set : (Ljava/lang/Object;)V
    //   111: return
  }
  
  private void Zp(int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zn : Ljavax/swing/JTabbedPane;
    //   8: invokevirtual getTabCount : ()I
    //   11: ifne -> 15
    //   14: return
    //   15: iload_1
    //   16: ifne -> 59
    //   19: aload_0
    //   20: getfield Zn : Ljavax/swing/JTabbedPane;
    //   23: iconst_0
    //   24: invokevirtual getBoundsAt : (I)Ljava/awt/Rectangle;
    //   27: astore #4
    //   29: new java/awt/Rectangle
    //   32: dup
    //   33: aload #4
    //   35: getfield x : I
    //   38: aload #4
    //   40: getfield y : I
    //   43: iconst_1
    //   44: isub
    //   45: aload #4
    //   47: getfield width : I
    //   50: iconst_3
    //   51: invokespecial <init> : (IIII)V
    //   54: astore_3
    //   55: aload_2
    //   56: ifnull -> 103
    //   59: aload_0
    //   60: getfield Zn : Ljavax/swing/JTabbedPane;
    //   63: iload_1
    //   64: iconst_1
    //   65: isub
    //   66: invokevirtual getBoundsAt : (I)Ljava/awt/Rectangle;
    //   69: astore #4
    //   71: new java/awt/Rectangle
    //   74: dup
    //   75: aload #4
    //   77: getfield x : I
    //   80: aload #4
    //   82: getfield y : I
    //   85: aload #4
    //   87: getfield height : I
    //   90: iadd
    //   91: iconst_1
    //   92: isub
    //   93: aload #4
    //   95: getfield width : I
    //   98: iconst_3
    //   99: invokespecial <init> : (IIII)V
    //   102: astore_3
    //   103: aload_0
    //   104: getfield Zh : Ljava/util/concurrent/atomic/AtomicReference;
    //   107: aload_3
    //   108: invokevirtual set : (Ljava/lang/Object;)V
    //   111: return
  }
  
  public void paint(Graphics paramGraphics) {
    Rectangle rectangle = this.Zh.get();
    JRootPane jRootPane = this.Zn.getRootPane();
    if (!rectangle.isEmpty() && jRootPane != null) {
      Graphics2D graphics2D = (Graphics2D)paramGraphics;
      graphics2D.setPaint(Zlkk.BURP_ORANGE.ZS());
      graphics2D.fill(SwingUtilities.convertRectangle(this.Zn, rectangle, jRootPane.getGlassPane()));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */