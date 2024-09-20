package burp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

public class Zm2x extends Zm99 {
  private Zx0e Zd;
  
  private boolean ZR = false;
  
  public Zm2x() {
    this(Zx0e.DOWN);
  }
  
  public Zm2x(Zx0e paramZx0e) {
    this.Zd = paramZx0e;
  }
  
  protected void paintComponent(Graphics paramGraphics) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast java/awt/Graphics2D
    //   4: astore_3
    //   5: invokestatic ZM : ()Z
    //   8: aload_3
    //   9: aload_0
    //   10: getfield Zd : Lburp/Zx0e;
    //   13: getfield ZK : I
    //   16: i2d
    //   17: invokestatic toRadians : (D)D
    //   20: invokevirtual rotate : (D)V
    //   23: istore_2
    //   24: aload_0
    //   25: getfield Zd : Lburp/Zx0e;
    //   28: getstatic burp/Zx0e.UP : Lburp/Zx0e;
    //   31: if_acmpne -> 48
    //   34: aload_3
    //   35: aload_0
    //   36: invokevirtual getHeight : ()I
    //   39: ineg
    //   40: iconst_0
    //   41: invokevirtual translate : (II)V
    //   44: iload_2
    //   45: ifne -> 58
    //   48: aload_3
    //   49: iconst_0
    //   50: aload_0
    //   51: invokevirtual getWidth : ()I
    //   54: ineg
    //   55: invokevirtual translate : (II)V
    //   58: aload_0
    //   59: iconst_1
    //   60: putfield ZR : Z
    //   63: aload_0
    //   64: aload_3
    //   65: invokespecial paintComponent : (Ljava/awt/Graphics;)V
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield ZR : Z
    //   73: aload_3
    //   74: aload_0
    //   75: getfield Zd : Lburp/Zx0e;
    //   78: getfield ZK : I
    //   81: i2d
    //   82: invokestatic toRadians : (D)D
    //   85: dneg
    //   86: invokevirtual rotate : (D)V
    //   89: aload_0
    //   90: getfield Zd : Lburp/Zx0e;
    //   93: getstatic burp/Zx0e.UP : Lburp/Zx0e;
    //   96: if_acmpne -> 113
    //   99: aload_3
    //   100: iconst_0
    //   101: aload_0
    //   102: invokevirtual getHeight : ()I
    //   105: ineg
    //   106: invokevirtual translate : (II)V
    //   109: iload_2
    //   110: ifne -> 123
    //   113: aload_3
    //   114: aload_0
    //   115: invokevirtual getWidth : ()I
    //   118: ineg
    //   119: iconst_0
    //   120: invokevirtual translate : (II)V
    //   123: return
  }
  
  public Insets getInsets(Insets paramInsets) {
    return ZK(super.getInsets(paramInsets));
  }
  
  public Insets getInsets() {
    return ZK(super.getInsets());
  }
  
  private Insets ZK(Insets paramInsets) {
    boolean bool = Zm99.ZM();
    if (this.ZR) {
      if (this.Zd == Zx0e.UP) {
        int j = paramInsets.bottom;
        paramInsets.bottom = paramInsets.left;
        paramInsets.left = paramInsets.top;
        paramInsets.top = paramInsets.right;
        paramInsets.right = j;
        if (!bool) {
          j = paramInsets.bottom;
          paramInsets.bottom = paramInsets.right;
          paramInsets.right = paramInsets.top;
          paramInsets.top = paramInsets.left;
          paramInsets.left = j;
          return paramInsets;
        } 
        return paramInsets;
      } 
    } else {
      return paramInsets;
    } 
    int i = paramInsets.bottom;
    paramInsets.bottom = paramInsets.right;
    paramInsets.right = paramInsets.top;
    paramInsets.top = paramInsets.left;
    paramInsets.left = i;
    return paramInsets;
  }
  
  public int getWidth() {
    return this.ZR ? super.getHeight() : super.getWidth();
  }
  
  public int getHeight() {
    return this.ZR ? super.getWidth() : super.getHeight();
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    int i = dimension.width;
    dimension.width = dimension.height;
    dimension.height = i;
    return dimension;
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public Dimension getMaximumSize() {
    Dimension dimension = super.getMaximumSize();
    int i = dimension.width;
    dimension.width = dimension.height + 10;
    dimension.height = i + 10;
    return dimension;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */