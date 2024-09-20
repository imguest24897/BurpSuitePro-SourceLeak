package burp;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Window;
import javax.swing.JFrame;

public class Zl04 extends JFrame {
  private final Zb_o Zj = new Zb_o();
  
  private Rectangle ZD = getBounds();
  
  private static Zbqc[] Zp;
  
  public Zl04() throws HeadlessException {
    setIconImages(Zt2m.ZT);
    addComponentListener(new Zbny(this));
  }
  
  public Rectangle Zo() {
    try {
    
    } catch (HeadlessException headlessException) {
      throw b(null);
    } 
    Rectangle rectangle = (getExtendedState() == 0) ? getBounds() : this.ZD;
    return new Rectangle(rectangle);
  }
  
  public void ZO(Window paramWindow) {
    Zt2m.Zy(this, paramWindow);
  }
  
  public void ZQ(Window paramWindow) {
    Zt2m.Zq(this, paramWindow);
  }
  
  public void setVisible(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: iload_1
    //   12: invokespecial setVisible : (Z)V
    //   15: iload_2
    //   16: ifne -> 43
    //   19: goto -> 26
    //   22: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: iload_1
    //   28: <illegal opcode> run : (Lburp/Zl04;Z)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: goto -> 54
    //   46: astore_3
    //   47: aload_3
    //   48: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   51: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   54: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/Exception
    //   4	43	46	java/lang/Exception
    //   10	36	39	java/lang/Exception
  }
  
  private void Zy() {
    try {
      if (getExtendedState() == 0)
        this.ZD = getBounds(); 
    } catch (HeadlessException headlessException) {
      throw b(null);
    } 
  }
  
  private void lambda$setVisible$0(boolean paramBoolean) {
    ZO(this, paramBoolean);
  }
  
  static void ZO(Zl04 paramZl04, boolean paramBoolean) {
    paramZl04.setVisible(paramBoolean);
  }
  
  public static void Zk(Zbqc[] paramArrayOfZbqc) {
    Zp = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZEl() {
    return Zp;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZEl() == null)
      Zk(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl04.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */