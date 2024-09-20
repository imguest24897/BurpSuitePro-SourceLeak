package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;

public class Zepa extends Zepe {
  public Zepa(String paramString, Zk97 paramZk97, Window paramWindow) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: aload_3
    //   7: aload_2
    //   8: <illegal opcode> actionPerformed : (Ljava/awt/Window;Lburp/Zk97;)Ljava/awt/event/ActionListener;
    //   13: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   16: return
  }
  
  private static void lambda$new$0(Window paramWindow, Zk97 paramZk97, ActionEvent paramActionEvent) {
    Zz1q.Zc(paramWindow, paramZk97);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */