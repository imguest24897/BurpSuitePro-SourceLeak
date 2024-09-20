package burp;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zezu implements Runnable {
  private final Component ZX;
  
  private final String ZM;
  
  private final Object ZK;
  
  private final String[] Zv;
  
  private final int ZL;
  
  private final int ZU;
  
  private final int Zn;
  
  private final int ZE;
  
  int Zm;
  
  Zezu(Component paramComponent, String paramString, Object paramObject, int paramInt1, int paramInt2, String[] paramArrayOfString, int paramInt3, int paramInt4) {
    this.ZX = paramComponent;
    this.ZK = paramObject;
    this.ZL = paramInt1;
    this.ZU = paramInt2;
    this.Zv = paramArrayOfString;
    this.Zn = paramInt3;
    this.ZM = paramString;
    this.ZE = paramInt4;
    this.Zm = -1;
  }
  
  public void run() {
    Object[] arrayOfObject = Zf();
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      JOptionPane.showOptionDialog((this.ZX == null) ? new Zl04() : this.ZX, this.ZK, this.ZM, this.ZL, this.ZU, null, arrayOfObject, (this.Zn == -1) ? null : arrayOfObject[this.Zn]);
    } catch (Exception exception) {
      Zah.ZU(exception, this.ZM, Zk_.UNEXPECTED);
    } 
  }
  
  private Object[] Zf() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zv : [Ljava/lang/String;
    //   4: arraylength
    //   5: anewarray java/lang/Object
    //   8: astore_2
    //   9: invokestatic ZvS : ()[Ljava/lang/String;
    //   12: iconst_0
    //   13: istore_3
    //   14: astore_1
    //   15: iload_3
    //   16: aload_0
    //   17: getfield Zv : [Ljava/lang/String;
    //   20: arraylength
    //   21: if_icmpge -> 99
    //   24: aload_0
    //   25: getfield ZE : I
    //   28: iload_3
    //   29: if_icmpne -> 48
    //   32: new burp/Ze0q
    //   35: dup
    //   36: aload_0
    //   37: getfield Zv : [Ljava/lang/String;
    //   40: iload_3
    //   41: aaload
    //   42: invokespecial <init> : (Ljava/lang/String;)V
    //   45: goto -> 61
    //   48: new burp/Ze01
    //   51: dup
    //   52: aload_0
    //   53: getfield Zv : [Ljava/lang/String;
    //   56: iload_3
    //   57: aaload
    //   58: invokespecial <init> : (Ljava/lang/String;)V
    //   61: astore #4
    //   63: aload #4
    //   65: iconst_1
    //   66: invokevirtual setFocusable : (Z)V
    //   69: iload_3
    //   70: istore #5
    //   72: aload #4
    //   74: aload_0
    //   75: iload #5
    //   77: aload #4
    //   79: <illegal opcode> actionPerformed : (Lburp/Zezu;ILburp/Ze01;)Ljava/awt/event/ActionListener;
    //   84: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   87: aload_2
    //   88: iload_3
    //   89: aload #4
    //   91: aastore
    //   92: iinc #3, 1
    //   95: aload_1
    //   96: ifnonnull -> 15
    //   99: aload_2
    //   100: areturn
  }
  
  private void lambda$createOptionButtons$0(int paramInt, Ze01 paramZe01, ActionEvent paramActionEvent) {
    this.Zm = paramInt;
    Window window = SwingUtilities.getWindowAncestor(paramZe01);
    if (window != null)
      window.setVisible(false); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zezu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */