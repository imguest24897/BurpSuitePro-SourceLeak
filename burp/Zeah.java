package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zeah extends KeyAdapter {
  final Zsos Zl;
  
  Zeah(Zsos paramZsos) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual getKeyCode : ()I
    //   7: istore_3
    //   8: astore_2
    //   9: iload_3
    //   10: bipush #10
    //   12: if_icmpne -> 57
    //   15: aload_0
    //   16: getfield Zl : Lburp/Zsos;
    //   19: getfield Z_ : I
    //   22: iflt -> 57
    //   25: aload_0
    //   26: getfield Zl : Lburp/Zsos;
    //   29: aload_0
    //   30: getfield Zl : Lburp/Zsos;
    //   33: getfield Zr : Ljava/util/List;
    //   36: aload_0
    //   37: getfield Zl : Lburp/Zsos;
    //   40: getfield Z_ : I
    //   43: invokeinterface get : (I)Ljava/lang/Object;
    //   48: checkcast burp/Ztsa
    //   51: getfield Zo : I
    //   54: invokevirtual ZP : (I)V
    //   57: iload_3
    //   58: bipush #27
    //   60: if_icmpne -> 73
    //   63: aload_0
    //   64: getfield Zl : Lburp/Zsos;
    //   67: getfield ZQ : Lburp/Zkjh;
    //   70: invokevirtual Zy : ()V
    //   73: iload_3
    //   74: bipush #38
    //   76: if_icmpeq -> 86
    //   79: iload_3
    //   80: sipush #224
    //   83: if_icmpne -> 116
    //   86: aload_0
    //   87: getfield Zl : Lburp/Zsos;
    //   90: getfield Z_ : I
    //   93: ifle -> 169
    //   96: aload_0
    //   97: getfield Zl : Lburp/Zsos;
    //   100: aload_0
    //   101: getfield Zl : Lburp/Zsos;
    //   104: getfield Z_ : I
    //   107: iconst_1
    //   108: isub
    //   109: invokevirtual ZN : (I)V
    //   112: aload_2
    //   113: ifnull -> 169
    //   116: iload_3
    //   117: bipush #40
    //   119: if_icmpeq -> 129
    //   122: iload_3
    //   123: sipush #225
    //   126: if_icmpne -> 169
    //   129: aload_0
    //   130: getfield Zl : Lburp/Zsos;
    //   133: getfield Z_ : I
    //   136: aload_0
    //   137: getfield Zl : Lburp/Zsos;
    //   140: getfield Zr : Ljava/util/List;
    //   143: invokeinterface size : ()I
    //   148: iconst_1
    //   149: isub
    //   150: if_icmpge -> 169
    //   153: aload_0
    //   154: getfield Zl : Lburp/Zsos;
    //   157: aload_0
    //   158: getfield Zl : Lburp/Zsos;
    //   161: getfield Z_ : I
    //   164: iconst_1
    //   165: iadd
    //   166: invokevirtual ZN : (I)V
    //   169: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeah.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */