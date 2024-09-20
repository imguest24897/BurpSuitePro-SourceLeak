package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

class Zr8f extends Zr8o {
  private final Component ZV;
  
  private final Zliy Z_;
  
  private final boolean Zx;
  
  private final Component ZU;
  
  private static final String a;
  
  Zr8f(Zgah paramZgah, String paramString, Component paramComponent, Zliy paramZliy, Zxer paramZxer, Zzc2 paramZzc2, Ztca paramZtca, Zrsj paramZrsj, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    super(paramZgah, paramString, paramZxer, paramZzc2, paramZtca, paramZrsj, paramBoolean1, paramBoolean2);
    this.ZV = paramComponent;
    this.Z_ = paramZliy;
    this.Zx = paramBoolean3;
    String[] arrayOfString = Zxer.Zr();
    if (paramBoolean3) {
      this.ZU = new Zsk9(this, paramComponent);
      this.ZU.setName(a);
      add(this.ZU);
      if (arrayOfString != null) {
        this.ZU = null;
        return;
      } 
      return;
    } 
    this.ZU = null;
  }
  
  Zliy Zi() {
    return this.Z_;
  }
  
  void ZT() {
    this.Zz.ZQ(this.ZI, this.Zi, this.ZV, this.Z_);
  }
  
  public void ZA(MouseEvent paramMouseEvent, int paramInt) {
    this.Zz.Zw(paramMouseEvent, paramInt);
  }
  
  public void paint(Graphics paramGraphics) {
    Zr6e zr6e = ZR();
    boolean bool = (zr6e == null || zr6e.Zy7()) ? true : false;
    this.Zc.setVisible(bool);
    if (this.ZU != null)
      this.ZU.setVisible(bool); 
    super.paint(paramGraphics);
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    if (this.Zx) {
      Dimension dimension1 = this.Zc.getPreferredSize();
      Dimension dimension2 = this.ZU.getPreferredSize();
      return new Dimension(dimension1.width + dimension2.width + 8, Math.max(dimension1.height, dimension2.height) + 1);
    } 
    return super.preferredLayoutSize(paramContainer);
  }
  
  public void layoutContainer(Container paramContainer) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zx : Z
    //   8: ifeq -> 142
    //   11: aload_0
    //   12: getfield Zc : Lburp/Zg85;
    //   15: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   18: astore_3
    //   19: aload_0
    //   20: getfield ZU : Ljava/awt/Component;
    //   23: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   26: astore #4
    //   28: iconst_0
    //   29: istore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: aload_3
    //   35: getfield height : I
    //   38: aload #4
    //   40: getfield height : I
    //   43: isub
    //   44: istore #7
    //   46: iload #7
    //   48: ifle -> 63
    //   51: iconst_1
    //   52: iload #7
    //   54: iconst_2
    //   55: idiv
    //   56: iadd
    //   57: istore #6
    //   59: aload_2
    //   60: ifnull -> 75
    //   63: iload #7
    //   65: ifge -> 75
    //   68: iload #7
    //   70: ineg
    //   71: iconst_2
    //   72: idiv
    //   73: istore #5
    //   75: aload_0
    //   76: getfield Zc : Lburp/Zg85;
    //   79: iconst_0
    //   80: iconst_1
    //   81: iload #5
    //   83: iadd
    //   84: invokevirtual setLocation : (II)V
    //   87: aload_0
    //   88: getfield Zc : Lburp/Zg85;
    //   91: new java/awt/Dimension
    //   94: dup
    //   95: aload_3
    //   96: getfield width : I
    //   99: iconst_2
    //   100: iadd
    //   101: aload_3
    //   102: getfield height : I
    //   105: invokespecial <init> : (II)V
    //   108: invokevirtual setSize : (Ljava/awt/Dimension;)V
    //   111: aload_0
    //   112: getfield ZU : Ljava/awt/Component;
    //   115: aload_3
    //   116: getfield width : I
    //   119: bipush #7
    //   121: iadd
    //   122: iconst_1
    //   123: iload #6
    //   125: iadd
    //   126: invokevirtual setLocation : (II)V
    //   129: aload_0
    //   130: getfield ZU : Ljava/awt/Component;
    //   133: aload #4
    //   135: invokevirtual setSize : (Ljava/awt/Dimension;)V
    //   138: aload_2
    //   139: ifnull -> 147
    //   142: aload_0
    //   143: aload_1
    //   144: invokespecial layoutContainer : (Ljava/awt/Container;)V
    //   147: return
  }
  
  public Zr6e ZR() {
    return (this.Z_ == null) ? null : this.Z_.ZR();
  }
  
  public boolean Zp() {
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc 'tdx<?{cN:,zu2-zh'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr8f.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #110
    //   82: goto -> 111
    //   85: iconst_1
    //   86: goto -> 111
    //   89: bipush #18
    //   91: goto -> 111
    //   94: bipush #14
    //   96: goto -> 111
    //   99: bipush #100
    //   101: goto -> 111
    //   104: bipush #76
    //   106: goto -> 111
    //   109: bipush #123
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */