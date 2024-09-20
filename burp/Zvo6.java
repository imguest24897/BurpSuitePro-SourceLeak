package burp;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zvo6 extends Zvol implements Zkgx {
  private final Zmgn ZE;
  
  private final List<Zg90> ZD;
  
  private final List<Zg74> ZL;
  
  private static final String c;
  
  public Zvo6(Zmgn paramZmgn) {
    super(paramZmgn);
    this.ZE = paramZmgn;
    this.ZD = new CopyOnWriteArrayList<>();
    this.ZL = new CopyOnWriteArrayList<>();
    setName(c);
    setBorder(Zxt_.Zb);
    setVerticalScrollBarPolicy(22);
    setHorizontalScrollBarPolicy(30);
    getVerticalScrollBar().setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
    getHorizontalScrollBar().setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
    setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
    paramZmgn.Zx(getViewport());
    paramZmgn.addCaretListener(new Zmoa(this));
  }
  
  public void updateUI() {
    super.updateUI();
    getVerticalScrollBar().setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
    getHorizontalScrollBar().setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
    setBackground(Zlkk.TEXT_EDITOR_BACKGROUND.ZS());
  }
  
  public void addNotify() {
    super.addNotify();
    this.ZL.forEach(Zg74::Zk);
  }
  
  public void removeNotify() {
    super.removeNotify();
    this.ZL.forEach(Zg74::ZD);
  }
  
  public Zmgn ZC() {
    return this.ZE;
  }
  
  public Ze9f ZW() {
    return (Ze9f)this.ZE.getDocument();
  }
  
  void Zl(Zg90 paramZg90) {
    this.ZD.add(paramZg90);
  }
  
  void Zi(Zg74 paramZg74) {
    this.ZL.add(paramZg74);
  }
  
  void Zr(int paramInt) {
    this.ZE.setCaretPosition(paramInt);
    ZP(paramInt);
  }
  
  void ZW(int paramInt1, int paramInt2) {
    this.ZE.select(paramInt1, paramInt2);
    ZP(paramInt1);
  }
  
  void Zv(int paramInt) {
    try {
      Rectangle2D rectangle2D = this.ZE.modelToView2D(paramInt);
      if (rectangle2D != null) {
        Rectangle rectangle = rectangle2D.getBounds();
        this.ZE.scrollRectToVisible(rectangle);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZP(int paramInt) {
    try {
      int i = this.ZE.getParent().getHeight() / 2;
      int j = -this.ZE.getY();
      int k = j + i;
      Rectangle2D rectangle2D = this.ZE.modelToView2D(paramInt);
      if (rectangle2D != null) {
        Rectangle rectangle = rectangle2D.getBounds();
        try {
        
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        rectangle.y += (k < rectangle.y) ? i : -i;
        this.ZE.scrollRectToVisible(rectangle);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isVisible : ()Z
    //   4: istore_1
    //   5: aload_0
    //   6: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   9: invokevirtual getViewPosition : ()Ljava/awt/Point;
    //   12: astore_2
    //   13: aload_0
    //   14: getfield ZE : Lburp/Zmgn;
    //   17: astore #5
    //   19: aload #5
    //   21: instanceof burp/Zkgx
    //   24: ifeq -> 44
    //   27: aload #5
    //   29: checkcast burp/Zkgx
    //   32: astore #4
    //   34: aload #4
    //   36: invokeinterface ZI : ()Lburp/Ztcw;
    //   41: goto -> 49
    //   44: <illegal opcode> Zg : ()Lburp/Ztcw;
    //   49: astore_3
    //   50: iconst_2
    //   51: anewarray burp/Ztcw
    //   54: dup
    //   55: iconst_0
    //   56: aload_3
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: aload_0
    //   61: iload_1
    //   62: aload_2
    //   63: <illegal opcode> Zg : (Lburp/Zvo6;ZLjava/awt/Point;)Lburp/Ztcw;
    //   68: aastore
    //   69: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   72: areturn
  }
  
  public void ZU() {
    Zmgn zmgn = this.ZE;
    if (zmgn instanceof Zkgx) {
      Zkgx zkgx = (Zkgx)zmgn;
      zkgx.ZU();
    } 
    getViewport().setViewPosition(new Point(0, 0));
  }
  
  private void lambda$checkpoint$2(boolean paramBoolean, Point paramPoint) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual setVisible : (Z)V
    //   5: aload_0
    //   6: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   9: aload_2
    //   10: invokevirtual setViewPosition : (Ljava/awt/Point;)V
    //   13: aload_0
    //   14: aload_2
    //   15: <illegal opcode> run : (Lburp/Zvo6;Ljava/awt/Point;)Ljava/lang/Runnable;
    //   20: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   23: return
  }
  
  private void lambda$checkpoint$1(Point paramPoint) {
    getViewport().setViewPosition(paramPoint);
  }
  
  private static void lambda$checkpoint$0() {}
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: ldc '%av.\\r`lx\\t;'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zvo6.c : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #107
    //   82: goto -> 112
    //   85: bipush #39
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #47
    //   97: goto -> 112
    //   100: bipush #69
    //   102: goto -> 112
    //   105: bipush #106
    //   107: goto -> 112
    //   110: bipush #95
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvo6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */