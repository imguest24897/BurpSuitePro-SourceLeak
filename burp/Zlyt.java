package burp;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Objects;
import java.util.Optional;
import javax.swing.JTabbedPane;

public final class Zlyt extends Record {
  private final Zxer Zv;
  
  private final Zrsj<? extends Zr6e> Zn;
  
  public Zlyt(Zxer paramZxer, Zrsj<? extends Zr6e> paramZrsj) {
    this.Zv = paramZxer;
    this.Zn = paramZrsj;
  }
  
  Optional<Zr88> ZX(Point paramPoint) {
    int i = ZU(paramPoint);
    if (i >= 0) {
      Rectangle rectangle = this.Zv.getBoundsAt(i);
      Zr6e zr6e = (Zr6e)this.Zn.ZD(i);
      if (zr6e != null && this.Zn.Zf(i) && !zr6e.Zy7()) {
        boolean bool1 = (this.Zv.getTabPlacement() == 1 || this.Zv.getTabPlacement() == 3) ? true : false;
        boolean bool2 = bool1 ? ((paramPoint.x > rectangle.x + rectangle.width / 4 && paramPoint.x < rectangle.x + rectangle.width * 3 / 4) ? true : false) : ((paramPoint.y > rectangle.y + rectangle.height / 4 && paramPoint.y < rectangle.y + rectangle.height * 3 / 4) ? true : false);
        if (bool2)
          return Optional.of((Zr88)this.Zv.getTabComponentAt(i)); 
      } 
    } 
    return Optional.empty();
  }
  
  public int ZW(Point paramPoint) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zv : Lburp/Zxer;
    //   8: invokevirtual getTabPlacement : ()I
    //   11: iconst_1
    //   12: if_icmpeq -> 26
    //   15: aload_0
    //   16: getfield Zv : Lburp/Zxer;
    //   19: invokevirtual getTabPlacement : ()I
    //   22: iconst_3
    //   23: if_icmpne -> 30
    //   26: iconst_1
    //   27: goto -> 31
    //   30: iconst_0
    //   31: istore_3
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual ZU : (Ljava/awt/Point;)I
    //   37: istore #4
    //   39: iload #4
    //   41: iflt -> 122
    //   44: aload_0
    //   45: getfield Zv : Lburp/Zxer;
    //   48: iload #4
    //   50: invokevirtual getBoundsAt : (I)Ljava/awt/Rectangle;
    //   53: astore #5
    //   55: iload_3
    //   56: ifeq -> 87
    //   59: aload_1
    //   60: getfield x : I
    //   63: aload #5
    //   65: getfield x : I
    //   68: aload #5
    //   70: getfield width : I
    //   73: iconst_2
    //   74: idiv
    //   75: iadd
    //   76: if_icmplt -> 83
    //   79: iconst_1
    //   80: goto -> 112
    //   83: iconst_0
    //   84: goto -> 112
    //   87: aload_1
    //   88: getfield y : I
    //   91: aload #5
    //   93: getfield y : I
    //   96: aload #5
    //   98: getfield height : I
    //   101: iconst_2
    //   102: idiv
    //   103: iadd
    //   104: if_icmplt -> 111
    //   107: iconst_1
    //   108: goto -> 112
    //   111: iconst_0
    //   112: istore #6
    //   114: iload #6
    //   116: ifeq -> 122
    //   119: iinc #4, 1
    //   122: iload #4
    //   124: iflt -> 143
    //   127: iload #4
    //   129: aload_0
    //   130: getfield Zv : Lburp/Zxer;
    //   133: invokevirtual getTabCount : ()I
    //   136: if_icmpge -> 143
    //   139: iconst_1
    //   140: goto -> 144
    //   143: iconst_0
    //   144: istore #5
    //   146: iload #5
    //   148: ifne -> 193
    //   151: aload_0
    //   152: invokevirtual Zs : ()Ljava/awt/Rectangle;
    //   155: aload_1
    //   156: invokevirtual contains : (Ljava/awt/Point;)Z
    //   159: ifeq -> 169
    //   162: iconst_0
    //   163: istore #4
    //   165: aload_2
    //   166: ifnull -> 193
    //   169: aload_0
    //   170: invokevirtual Zz : ()Ljava/awt/Rectangle;
    //   173: aload_1
    //   174: invokevirtual contains : (Ljava/awt/Point;)Z
    //   177: ifeq -> 190
    //   180: aload_0
    //   181: getfield Zv : Lburp/Zxer;
    //   184: invokevirtual getTabCount : ()I
    //   187: goto -> 191
    //   190: iconst_m1
    //   191: istore #4
    //   193: iload #4
    //   195: iflt -> 275
    //   198: iload #4
    //   200: aload_0
    //   201: getfield Zv : Lburp/Zxer;
    //   204: invokevirtual getTabCount : ()I
    //   207: if_icmpge -> 275
    //   210: aload_0
    //   211: getfield Zn : Lburp/Zrsj;
    //   214: iload #4
    //   216: invokeinterface ZD : (I)Lburp/Zr6e;
    //   221: astore #6
    //   223: aload #6
    //   225: ifnull -> 275
    //   228: aload #6
    //   230: invokeinterface Zy7 : ()Z
    //   235: ifne -> 275
    //   238: aload_0
    //   239: getfield Zn : Lburp/Zrsj;
    //   242: iload #4
    //   244: invokeinterface Zf : (I)Z
    //   249: ifne -> 275
    //   252: aload_0
    //   253: getfield Zn : Lburp/Zrsj;
    //   256: iload #4
    //   258: invokeinterface Zt : (I)Lnet/portswigger/Zto;
    //   263: getfield Zo : Ljava/lang/Object;
    //   266: checkcast java/lang/Integer
    //   269: invokevirtual intValue : ()I
    //   272: iconst_1
    //   273: iadd
    //   274: ireturn
    //   275: iload #4
    //   277: ireturn
  }
  
  public boolean Zw(JTabbedPane paramJTabbedPane, int paramInt1, int paramInt2) {
    if (!Objects.equals(paramJTabbedPane, this.Zv))
      return true; 
    boolean bool = this.Zn.Zf(paramInt1);
    if (!bool && ZU(paramJTabbedPane, paramInt1, paramInt2))
      return true; 
    if (paramInt2 < 0)
      return false; 
    if (!bool)
      return true; 
    boolean bool1 = (paramInt2 == paramInt1 + this.Zn.ZD(paramInt1).Zy5() + 1) ? true : false;
    if (bool1)
      return false; 
    boolean bool2 = (paramInt2 >= this.Zv.getTabCount()) ? true : false;
    if (bool2)
      return true; 
    boolean bool3 = (this.Zn.ZD(paramInt2) != null && !this.Zn.Zf(paramInt2)) ? true : false;
    return !bool3;
  }
  
  public boolean ZU(JTabbedPane paramJTabbedPane, int paramInt1, int paramInt2) {
    if (!Objects.equals(paramJTabbedPane, this.Zv))
      return false; 
    Object object = this.Zn.ZD(paramInt1);
    if (object != null) {
      Integer integer = (Integer)(this.Zn.Zi((Zr6e)object)).Zo;
      return (paramInt2 == integer.intValue() + 1);
    } 
    return false;
  }
  
  private int ZU(Point paramPoint) {
    byte b = 0;
    String[] arrayOfString = Zxer.Zr();
    while (b < this.Zv.getTabCount()) {
      Rectangle rectangle = this.Zv.getBoundsAt(b);
      if (rectangle.contains(paramPoint))
        return b; 
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return -1;
  }
  
  private Rectangle Zs() {
    if (this.Zv.getTabCount() == 0)
      return this.Zv.getBounds(); 
    Rectangle rectangle = this.Zv.getBoundsAt(0);
    boolean bool = (this.Zv.getTabPlacement() == 1 || this.Zv.getTabPlacement() == 3) ? true : false;
    int i = bool ? (this.Zv.getBounds()).x : rectangle.x;
    int j = bool ? rectangle.y : (this.Zv.getBounds()).y;
    int k = bool ? (rectangle.width + rectangle.x - (this.Zv.getBounds()).x) : rectangle.width;
    int m = bool ? rectangle.height : (rectangle.height + rectangle.y - (this.Zv.getBounds()).y);
    rectangle.setLocation(i, j);
    rectangle.setSize(k, m);
    return rectangle;
  }
  
  private Rectangle Zz() {
    if (this.Zv.getTabCount() == 0)
      return this.Zv.getBounds(); 
    Rectangle rectangle = this.Zv.getBoundsAt(this.Zv.getTabCount() - 1);
    boolean bool = (this.Zv.getTabPlacement() == 1 || this.Zv.getTabPlacement() == 3) ? true : false;
    int i = bool ? ((this.Zv.getBounds()).width - rectangle.x) : rectangle.width;
    int j = bool ? rectangle.height : ((this.Zv.getBounds()).height - rectangle.y);
    rectangle.setSize(i, j);
    return rectangle;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlyt;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlyt;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlyt;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */