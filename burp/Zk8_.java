package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zk8_ extends MouseAdapter {
  final Runnable Zu;
  
  final Runnable ZC;
  
  final Zm9g ZQ;
  
  Zk8_(Zm9g paramZm9g, Runnable paramRunnable1, Runnable paramRunnable2) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    this.ZQ.ZX = true;
    this.ZQ.Zi();
    this.ZQ.Zy();
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    this.ZQ.ZX = false;
    this.ZQ.Zi();
    this.ZQ.Zy();
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (this.ZQ.isEnabled() && this.ZQ.isFocusable())
      this.ZQ.requestFocusInWindow(); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZQ : Lburp/Zm9g;
    //   8: invokevirtual isEnabled : ()Z
    //   11: ifeq -> 28
    //   14: aload_0
    //   15: getfield ZQ : Lburp/Zm9g;
    //   18: aload_1
    //   19: invokevirtual getPoint : ()Ljava/awt/Point;
    //   22: invokevirtual contains : (Ljava/awt/Point;)Z
    //   25: ifne -> 29
    //   28: return
    //   29: aload_0
    //   30: getfield ZQ : Lburp/Zm9g;
    //   33: invokevirtual getIcon : ()Ljavax/swing/Icon;
    //   36: astore_3
    //   37: aload_3
    //   38: ifnull -> 141
    //   41: aload_0
    //   42: getfield ZQ : Lburp/Zm9g;
    //   45: invokevirtual getInsets : ()Ljava/awt/Insets;
    //   48: getfield right : I
    //   51: aload_3
    //   52: invokeinterface getIconWidth : ()I
    //   57: iadd
    //   58: aload_0
    //   59: getfield ZQ : Lburp/Zm9g;
    //   62: invokevirtual getIconTextGap : ()I
    //   65: iconst_2
    //   66: idiv
    //   67: iadd
    //   68: istore #4
    //   70: aload_0
    //   71: getfield ZQ : Lburp/Zm9g;
    //   74: invokevirtual getWidth : ()I
    //   77: iload #4
    //   79: isub
    //   80: istore #5
    //   82: new java/awt/Rectangle
    //   85: dup
    //   86: iload #5
    //   88: iconst_0
    //   89: iload #4
    //   91: aload_0
    //   92: getfield ZQ : Lburp/Zm9g;
    //   95: invokevirtual getHeight : ()I
    //   98: invokespecial <init> : (IIII)V
    //   101: astore #6
    //   103: aload #6
    //   105: aload_1
    //   106: invokevirtual getPoint : ()Ljava/awt/Point;
    //   109: invokevirtual contains : (Ljava/awt/Point;)Z
    //   112: ifeq -> 128
    //   115: aload_0
    //   116: getfield Zu : Ljava/lang/Runnable;
    //   119: invokeinterface run : ()V
    //   124: iload_2
    //   125: ifeq -> 137
    //   128: aload_0
    //   129: getfield ZC : Ljava/lang/Runnable;
    //   132: invokeinterface run : ()V
    //   137: iload_2
    //   138: ifeq -> 150
    //   141: aload_0
    //   142: getfield ZC : Ljava/lang/Runnable;
    //   145: invokeinterface run : ()V
    //   150: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */