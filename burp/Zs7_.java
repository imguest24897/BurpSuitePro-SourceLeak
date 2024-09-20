package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zs7_ extends MouseAdapter {
  final Zbky ZN;
  
  private static final String a;
  
  Zs7_(Zbky paramZbky) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZN : Lburp/Zbky;
    //   4: aload_1
    //   5: invokevirtual getPoint : ()Ljava/awt/Point;
    //   8: invokevirtual contains : (Ljava/awt/Point;)Z
    //   11: ifeq -> 33
    //   14: aload_0
    //   15: getfield ZN : Lburp/Zbky;
    //   18: getfield Zn : Ljava/util/List;
    //   21: aload_0
    //   22: aload_1
    //   23: <illegal opcode> accept : (Lburp/Zs7_;Ljava/awt/event/MouseEvent;)Ljava/util/function/Consumer;
    //   28: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   33: return
  }
  
  private void lambda$mouseReleased$0(MouseEvent paramMouseEvent, ActionListener paramActionListener) {
    paramActionListener.actionPerformed(new ActionEvent(this.ZN, 1001, a, System.currentTimeMillis(), paramMouseEvent.getModifiersEx()));
  }
  
  static {
    // Byte code:
    //   0: bipush #111
    //   2: ldc '`E~xm'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs7_.a : Ljava/lang/String;
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
    //   80: bipush #73
    //   82: goto -> 112
    //   85: bipush #67
    //   87: goto -> 112
    //   90: bipush #125
    //   92: goto -> 112
    //   95: bipush #15
    //   97: goto -> 112
    //   100: bipush #114
    //   102: goto -> 112
    //   105: bipush #112
    //   107: goto -> 112
    //   110: bipush #99
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */