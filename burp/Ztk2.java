package burp;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;

public class Ztk2 extends Ztk9 {
  private final Property<Zsc_> ZF = (Property<Zsc_>)new SimpleObjectProperty();
  
  private final ChangeListener<Boolean> ZK;
  
  private final ListChangeListener<Zrw9> ZI;
  
  public Ztk2() {
    int i = Zsc_.Zc();
    this.ZK = this::lambda$new$1;
    this.ZI = this::lambda$new$4;
    this.ZF.addListener(this::lambda$new$6);
    if (Zbqc.Zwu() == null)
      Zsc_.ZE(++i); 
  }
  
  public void Zy(Zsc_ paramZsc_) {
    this.ZF.setValue(paramZsc_);
  }
  
  private int Zw(ObservableValue<? extends Boolean> paramObservableValue) {
    int i = Zsc_.ZW();
    Zsc_ zsc_ = (Zsc_)this.ZF.getValue();
    if (zsc_ != null) {
      byte b = 0;
      while (b < zsc_.ZE()) {
        Zrw9 zrw9 = zsc_.Zm(b);
        if (zrw9.ZQ() == paramObservableValue)
          return b; 
        b++;
        if (i == 0)
          break; 
      } 
    } 
    return -1;
  }
  
  private void Zz(Zsc_ paramZsc_) {
    int i = Zsc_.ZW();
    byte b = 0;
    while (b < paramZsc_.ZE()) {
      Zk(b, paramZsc_.Zm(b));
      b++;
      if (i == 0)
        break; 
    } 
  }
  
  private void ZK(Zrw9 paramZrw9) {
    paramZrw9.ZQ().removeListener(this.ZK);
  }
  
  private void Zp(Zrw9 paramZrw9) {
    paramZrw9.ZQ().addListener(this.ZK);
  }
  
  private void lambda$new$6(ObservableValue paramObservableValue, Zsc_ paramZsc_1, Zsc_ paramZsc_2) {
    // Byte code:
    //   0: invokestatic Zc : ()I
    //   3: istore #4
    //   5: aload_2
    //   6: ifnull -> 56
    //   9: aload_2
    //   10: aload_0
    //   11: getfield ZI : Ljavafx/collections/ListChangeListener;
    //   14: invokevirtual Zv : (Ljavafx/collections/ListChangeListener;)V
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: aload_2
    //   23: invokevirtual ZE : ()I
    //   26: if_icmpge -> 47
    //   29: aload_0
    //   30: aload_2
    //   31: iload #5
    //   33: invokevirtual Zm : (I)Lburp/Zrw9;
    //   36: invokevirtual ZK : (Lburp/Zrw9;)V
    //   39: iinc #5, 1
    //   42: iload #4
    //   44: ifeq -> 20
    //   47: aload_0
    //   48: <illegal opcode> run : (Lburp/Ztk2;)Ljava/lang/Runnable;
    //   53: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   56: aload_3
    //   57: ifnull -> 108
    //   60: aload_3
    //   61: aload_0
    //   62: getfield ZI : Ljavafx/collections/ListChangeListener;
    //   65: invokevirtual Zf : (Ljavafx/collections/ListChangeListener;)V
    //   68: iconst_0
    //   69: istore #5
    //   71: iload #5
    //   73: aload_3
    //   74: invokevirtual ZE : ()I
    //   77: if_icmpge -> 98
    //   80: aload_0
    //   81: aload_3
    //   82: iload #5
    //   84: invokevirtual Zm : (I)Lburp/Zrw9;
    //   87: invokevirtual Zp : (Lburp/Zrw9;)V
    //   90: iinc #5, 1
    //   93: iload #4
    //   95: ifeq -> 71
    //   98: aload_0
    //   99: aload_3
    //   100: <illegal opcode> run : (Lburp/Ztk2;Lburp/Zsc_;)Ljava/lang/Runnable;
    //   105: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   108: return
  }
  
  private void lambda$new$5(Zsc_ paramZsc_) {
    Zz(paramZsc_);
  }
  
  private void lambda$new$4(ListChangeListener.Change paramChange) {
    // Byte code:
    //   0: invokestatic Zc : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual next : ()Z
    //   8: ifeq -> 158
    //   11: aload_1
    //   12: invokevirtual wasRemoved : ()Z
    //   15: ifeq -> 80
    //   18: aload_1
    //   19: invokevirtual getRemoved : ()Ljava/util/List;
    //   22: astore_3
    //   23: aload_3
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #4
    //   31: aload #4
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 80
    //   41: aload #4
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast burp/Zrw9
    //   51: astore #5
    //   53: aload_0
    //   54: aload #5
    //   56: invokevirtual ZK : (Lburp/Zrw9;)V
    //   59: aload_1
    //   60: invokevirtual getFrom : ()I
    //   63: istore #6
    //   65: aload_0
    //   66: iload #6
    //   68: <illegal opcode> run : (Lburp/Ztk2;I)Ljava/lang/Runnable;
    //   73: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   76: iload_2
    //   77: ifeq -> 31
    //   80: aload_1
    //   81: invokevirtual wasAdded : ()Z
    //   84: ifeq -> 4
    //   87: aload_1
    //   88: invokevirtual getAddedSubList : ()Ljava/util/List;
    //   91: astore_3
    //   92: iconst_0
    //   93: istore #4
    //   95: iload #4
    //   97: aload_3
    //   98: invokeinterface size : ()I
    //   103: if_icmpge -> 154
    //   106: aload_3
    //   107: iload #4
    //   109: invokeinterface get : (I)Ljava/lang/Object;
    //   114: checkcast burp/Zrw9
    //   117: astore #5
    //   119: aload_0
    //   120: aload #5
    //   122: invokevirtual Zp : (Lburp/Zrw9;)V
    //   125: aload_1
    //   126: invokevirtual getFrom : ()I
    //   129: iload #4
    //   131: iadd
    //   132: istore #6
    //   134: aload_0
    //   135: iload #6
    //   137: aload #5
    //   139: <illegal opcode> run : (Lburp/Ztk2;ILburp/Zrw9;)Ljava/lang/Runnable;
    //   144: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   147: iinc #4, 1
    //   150: iload_2
    //   151: ifeq -> 95
    //   154: iload_2
    //   155: ifeq -> 4
    //   158: return
  }
  
  private void lambda$new$3(int paramInt, Zrw9 paramZrw9) {
    Zk(paramInt, paramZrw9);
  }
  
  private void lambda$new$2(int paramInt) {
    ZV(paramInt);
  }
  
  private void lambda$new$1(ObservableValue paramObservableValue, Boolean paramBoolean1, Boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Ztk2;Ljavafx/beans/value/ObservableValue;)Ljava/lang/Runnable;
    //   7: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$new$0(ObservableValue<? extends Boolean> paramObservableValue) {
    Zl(Zw(paramObservableValue));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */