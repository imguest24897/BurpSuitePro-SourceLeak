package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Zlbk extends KeyAdapter {
  private boolean Zf;
  
  final Zbws ZC;
  
  final Zt8j ZZ;
  
  Zlbk(Zt8j paramZt8j, Zbws paramZbws) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: invokestatic ZE : ()Ljava/lang/String;
    //   5: aload_0
    //   6: getfield ZZ : Lburp/Zt8j;
    //   9: iconst_0
    //   10: putfield Zo : Z
    //   13: astore_2
    //   14: aload_1
    //   15: invokevirtual getKeyChar : ()C
    //   18: bipush #10
    //   20: if_icmpne -> 121
    //   23: aload_0
    //   24: getfield Zf : Z
    //   27: ifne -> 121
    //   30: aload_1
    //   31: invokevirtual isShiftDown : ()Z
    //   34: ifeq -> 103
    //   37: aload_0
    //   38: getfield ZZ : Lburp/Zt8j;
    //   41: iconst_1
    //   42: putfield Zo : Z
    //   45: aload_1
    //   46: invokevirtual consume : ()V
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield Zf : Z
    //   54: aload_0
    //   55: getfield ZZ : Lburp/Zt8j;
    //   58: getfield ZW : Lburp/Zl86;
    //   61: new java/awt/event/KeyEvent
    //   64: dup
    //   65: aload_1
    //   66: invokevirtual getSource : ()Ljava/lang/Object;
    //   69: checkcast java/awt/Component
    //   72: aload_1
    //   73: invokevirtual getID : ()I
    //   76: aload_1
    //   77: invokevirtual getWhen : ()J
    //   80: iconst_0
    //   81: aload_1
    //   82: invokevirtual getKeyCode : ()I
    //   85: aload_1
    //   86: invokevirtual getKeyChar : ()C
    //   89: aload_1
    //   90: invokevirtual getKeyLocation : ()I
    //   93: invokespecial <init> : (Ljava/awt/Component;IJIICI)V
    //   96: invokevirtual dispatchEvent : (Ljava/awt/AWTEvent;)V
    //   99: aload_2
    //   100: ifnull -> 115
    //   103: aload_1
    //   104: invokevirtual consume : ()V
    //   107: aload_0
    //   108: getfield ZZ : Lburp/Zt8j;
    //   111: invokevirtual stopCellEditing : ()Z
    //   114: pop
    //   115: iconst_0
    //   116: istore_3
    //   117: aload_2
    //   118: ifnull -> 126
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield Zf : Z
    //   126: iload_3
    //   127: ifeq -> 154
    //   130: aload_0
    //   131: getfield ZZ : Lburp/Zt8j;
    //   134: getfield Zu : I
    //   137: iconst_m1
    //   138: if_icmpeq -> 154
    //   141: aload_0
    //   142: aload_0
    //   143: getfield ZC : Lburp/Zbws;
    //   146: <illegal opcode> run : (Lburp/Zlbk;Lburp/Zbws;)Ljava/lang/Runnable;
    //   151: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   154: return
  }
  
  private void lambda$keyPressed$0(Zbws paramZbws) {
    paramZbws.setRowHeight(this.ZZ.Zu, (int)this.ZZ.ZW.getPreferredSize().getHeight());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */