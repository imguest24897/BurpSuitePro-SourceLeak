package burp;

import java.awt.Dialog;
import java.awt.Window;
import javax.swing.JDialog;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrh7 extends JDialog {
  private final Zzv7 ZC;
  
  private static String Zq;
  
  public Zrh7(Window paramWindow, boolean paramBoolean, Zzv7 paramZzv7) {
    super(paramWindow, paramBoolean ? Dialog.ModalityType.DOCUMENT_MODAL : Dialog.ModalityType.MODELESS);
    this.ZC = paramZzv7;
    setIconImages(Zt2m.ZT);
  }
  
  public void Zq(Window paramWindow) {
    Zt2m.Zy(this, paramWindow);
  }
  
  public void ZN(Window paramWindow) {
    Zt2m.Zq(this, paramWindow);
  }
  
  public void Zv(Window paramWindow, int paramInt1, int paramInt2) {
    Zt2m.Z_(this, paramWindow, paramInt1, paramInt2);
  }
  
  public void Zl(Window paramWindow, int paramInt1, int paramInt2) {
    Zt2m.ZB(this, paramWindow, paramInt1, paramInt2);
  }
  
  public void setVisible(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: iload_1
    //   12: invokespecial setVisible : (Z)V
    //   15: iload_2
    //   16: ifeq -> 43
    //   19: goto -> 26
    //   22: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: iload_1
    //   28: <illegal opcode> run : (Lburp/Zrh7;Z)Ljava/lang/Runnable;
    //   33: invokestatic invokeAndWait : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: goto -> 61
    //   46: astore_3
    //   47: aload_3
    //   48: aload_0
    //   49: getfield ZC : Lburp/Zzv7;
    //   52: invokevirtual toString : ()Ljava/lang/String;
    //   55: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   58: invokestatic ZU : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;)V
    //   61: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/Exception
    //   4	43	46	java/lang/Exception
    //   10	36	39	java/lang/Exception
  }
  
  private void lambda$setVisible$0(boolean paramBoolean) {
    try {
      ZQ(this, paramBoolean);
    } catch (Exception exception) {
      Zah.ZU(exception, this.ZC.toString(), Zk_.UNEXPECTED);
    } 
  }
  
  static void ZQ(Zrh7 paramZrh7, boolean paramBoolean) {
    paramZrh7.setVisible(paramBoolean);
  }
  
  public static void ZG(String paramString) {
    Zq = paramString;
  }
  
  public static String Zwz() {
    return Zq;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    if (Zwz() == null)
      ZG("uGtxtc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrh7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */