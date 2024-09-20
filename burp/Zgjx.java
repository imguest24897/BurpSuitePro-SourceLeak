package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Supplier;

public class Zgjx implements ActionListener {
  private final Zecv ZW;
  
  private final Supplier<String> ZC;
  
  public Zgjx(Zecv paramZecv, Supplier<String> paramSupplier) {
    this.ZW = paramZecv;
    this.ZC = paramSupplier;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSource : ()Ljava/lang/Object;
    //   4: checkcast javax/swing/JCheckBox
    //   7: astore_3
    //   8: invokestatic Zc : ()Z
    //   11: aload_0
    //   12: getfield ZC : Ljava/util/function/Supplier;
    //   15: invokeinterface get : ()Ljava/lang/Object;
    //   20: checkcast java/lang/String
    //   23: astore #4
    //   25: istore_2
    //   26: aload_3
    //   27: invokevirtual isSelected : ()Z
    //   30: ifeq -> 48
    //   33: aload_0
    //   34: getfield ZW : Lburp/Zecv;
    //   37: aload #4
    //   39: invokeinterface ZW : (Ljava/lang/String;)V
    //   44: iload_2
    //   45: ifne -> 59
    //   48: aload_0
    //   49: getfield ZW : Lburp/Zecv;
    //   52: aload #4
    //   54: invokeinterface ZF : (Ljava/lang/String;)V
    //   59: invokestatic Zwu : ()[Lburp/Zbqc;
    //   62: ifnonnull -> 77
    //   65: iload_2
    //   66: ifeq -> 73
    //   69: iconst_0
    //   70: goto -> 74
    //   73: iconst_1
    //   74: invokestatic Zw : (Z)V
    //   77: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */