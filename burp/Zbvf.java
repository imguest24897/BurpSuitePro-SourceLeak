package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Box;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class Zbvf extends Zbqc {
  private final Zlfb ZW;
  
  private final Zbup Zl;
  
  private final Zsl9 ZA;
  
  private final Zsl9 ZS;
  
  private final Map<Integer, Zsl9> Zn;
  
  private Zbvj Zc;
  
  private Zbqc Zy;
  
  public Zbvf(Zlfb paramZlfb, Zbup paramZbup) {
    this.ZW = paramZlfb;
    this.Zl = paramZbup;
    this.ZA = new Zsl9();
    this.ZS = new Zsl9();
    this.ZS.Zy();
    this.Zn = new HashMap<>();
    Zl(Zlkk.BACKGROUNDER);
    setBorder(new EmptyBorder(7, 7, 0, 4));
    Zu();
  }
  
  public Dimension getPreferredSize() {
    return new Dimension((this.Zl.getSize()).width, (super.getPreferredSize()).height);
  }
  
  public void Zk(Zg4s paramZg4s) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zbvf;Lburp/Zg4s;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void Zb(Point paramPoint) {
    JLayeredPane jLayeredPane = ((Zl04)Zt2m.ZF(this)).getLayeredPane();
    if (this.Zc == null) {
      this.Zc = new Zbvj();
      jLayeredPane.add(this.Zc, JLayeredPane.DRAG_LAYER);
    } 
    Point point1 = new Point(paramPoint);
    SwingUtilities.convertPointFromScreen(point1, jLayeredPane);
    this.Zc.Zg(point1);
    Point point2 = this.Zl.getLocationOnScreen();
    int i = this.Zl.getHeight();
    byte b = (paramPoint.y < point2.y) ? -10 : ((paramPoint.y > point2.y + i) ? 10 : 0);
    Rectangle rectangle = this.Zl.getViewport().getViewRect();
    rectangle.y += b;
    scrollRectToVisible(rectangle);
  }
  
  public void Zy(int paramInt, Zkyq paramZkyq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zsl9;
    //   4: invokevirtual ZV : ()V
    //   7: invokestatic ZP : ()[I
    //   10: aload_0
    //   11: getfield ZS : Lburp/Zsl9;
    //   14: invokevirtual ZV : ()V
    //   17: aload_0
    //   18: getfield Zn : Ljava/util/Map;
    //   21: invokeinterface values : ()Ljava/util/Collection;
    //   26: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   31: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   36: astore_3
    //   37: iload_1
    //   38: iconst_m1
    //   39: if_icmpne -> 53
    //   42: aload_0
    //   43: getfield ZA : Lburp/Zsl9;
    //   46: invokevirtual Zy : ()V
    //   49: aload_3
    //   50: ifnull -> 80
    //   53: aload_0
    //   54: getfield Zn : Ljava/util/Map;
    //   57: iload_1
    //   58: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   61: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: checkcast burp/Zsl9
    //   69: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   72: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   77: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   80: aload_0
    //   81: getfield Zc : Lburp/Zbvj;
    //   84: ifnull -> 98
    //   87: aload_0
    //   88: getfield Zc : Lburp/Zbvj;
    //   91: aload_2
    //   92: invokevirtual ZU : ()Ljava/lang/String;
    //   95: invokevirtual ZE : (Ljava/lang/String;)V
    //   98: return
  }
  
  public void ZP() {
    this.ZA.ZV();
    this.Zn.values().forEach(Zsl9::ZV);
    this.ZS.Zy();
    if (this.Zc != null)
      this.Zc.setVisible(false); 
  }
  
  private void Zu() {
    setLayout(new GridBagLayout());
    this.Zy = new Zbvl();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.weighty = 1.0D;
    add(Box.createGlue(), gridBagConstraints);
  }
  
  private void lambda$showTasks$0(Zg4s paramZg4s) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Ljava/util/Map;
    //   4: invokeinterface clear : ()V
    //   9: invokestatic ZP : ()[I
    //   12: aload_0
    //   13: getfield Zy : Lburp/Zbqc;
    //   16: invokevirtual removeAll : ()V
    //   19: astore_2
    //   20: aload_1
    //   21: invokevirtual ZH : ()Z
    //   24: ifeq -> 38
    //   27: aload_0
    //   28: getfield ZW : Lburp/Zlfb;
    //   31: invokevirtual Zq : ()V
    //   34: aload_2
    //   35: ifnull -> 157
    //   38: aload_0
    //   39: getfield Zy : Lburp/Zbqc;
    //   42: aload_0
    //   43: getfield ZA : Lburp/Zsl9;
    //   46: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   49: pop
    //   50: aload_1
    //   51: invokevirtual iterator : ()Ljava/util/Iterator;
    //   54: astore_3
    //   55: aload_3
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 138
    //   64: aload_3
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: checkcast burp/Zkyq
    //   73: astore #4
    //   75: aload_0
    //   76: getfield Zy : Lburp/Zbqc;
    //   79: new burp/Zb75
    //   82: dup
    //   83: aload #4
    //   85: invokevirtual Zg : ()Ljava/awt/Component;
    //   88: invokespecial <init> : (Ljava/awt/Component;)V
    //   91: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   94: pop
    //   95: new burp/Zsl9
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore #5
    //   104: aload_0
    //   105: getfield Zn : Ljava/util/Map;
    //   108: aload #4
    //   110: invokevirtual Zi : ()I
    //   113: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   116: aload #5
    //   118: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload_0
    //   125: getfield Zy : Lburp/Zbqc;
    //   128: aload #5
    //   130: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   133: pop
    //   134: aload_2
    //   135: ifnull -> 55
    //   138: aload_0
    //   139: getfield Zy : Lburp/Zbqc;
    //   142: aload_0
    //   143: getfield ZS : Lburp/Zsl9;
    //   146: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   149: pop
    //   150: aload_0
    //   151: getfield ZW : Lburp/Zlfb;
    //   154: invokevirtual Zf : ()V
    //   157: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */