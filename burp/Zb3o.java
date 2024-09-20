package burp;

import java.util.function.IntConsumer;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Zb3o implements ListSelectionListener {
  private final ListSelectionModel Zk;
  
  private final Zbva Z_;
  
  private final Zbc9 Zl;
  
  private final Ze01 ZB;
  
  private final Ze01 Zq;
  
  private final Ze01 Zn;
  
  private final Ze01 Zu;
  
  private final Zemk ZV;
  
  private final IntConsumer Zm;
  
  final Zbve Zd;
  
  private Zb3o(Zbve paramZbve, ListSelectionModel paramListSelectionModel, Zbva paramZbva, Zbc9 paramZbc9, Ze01 paramZe011, Ze01 paramZe012, Ze01 paramZe013, Ze01 paramZe014, Zemk paramZemk, IntConsumer paramIntConsumer) {
    this.Zk = paramListSelectionModel;
    this.Z_ = paramZbva;
    this.Zl = paramZbc9;
    this.ZB = paramZe011;
    this.Zq = paramZe012;
    this.Zn = paramZe013;
    this.Zu = paramZe014;
    this.ZV = paramZemk;
    this.Zm = paramIntConsumer;
  }
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zk : Ljavax/swing/ListSelectionModel;
    //   8: invokeinterface isSelectionEmpty : ()Z
    //   13: ifeq -> 79
    //   16: aload_0
    //   17: getfield Zn : Lburp/Ze01;
    //   20: iconst_0
    //   21: invokevirtual setEnabled : (Z)V
    //   24: aload_0
    //   25: getfield ZB : Lburp/Ze01;
    //   28: iconst_0
    //   29: invokevirtual setEnabled : (Z)V
    //   32: aload_0
    //   33: getfield Zu : Lburp/Ze01;
    //   36: iconst_0
    //   37: invokevirtual setEnabled : (Z)V
    //   40: aload_0
    //   41: getfield Zq : Lburp/Ze01;
    //   44: iconst_0
    //   45: invokevirtual setEnabled : (Z)V
    //   48: aload_0
    //   49: getfield Z_ : Lburp/Zbva;
    //   52: aconst_null
    //   53: iconst_0
    //   54: invokevirtual Zt : (Lburp/Zryx;Z)V
    //   57: aload_0
    //   58: getfield Zm : Ljava/util/function/IntConsumer;
    //   61: iconst_0
    //   62: invokeinterface accept : (I)V
    //   67: aload_0
    //   68: getfield Zl : Lburp/Zbc9;
    //   71: iconst_0
    //   72: invokevirtual Zv : (I)V
    //   75: aload_2
    //   76: ifnull -> 223
    //   79: aload_0
    //   80: getfield Z_ : Lburp/Zbva;
    //   83: invokevirtual ZJ : ()I
    //   86: ifeq -> 102
    //   89: aload_0
    //   90: getfield Zk : Ljavax/swing/ListSelectionModel;
    //   93: invokeinterface getSelectedItemsCount : ()I
    //   98: iconst_1
    //   99: if_icmpne -> 202
    //   102: aload_0
    //   103: getfield Zn : Lburp/Ze01;
    //   106: iconst_1
    //   107: invokevirtual setEnabled : (Z)V
    //   110: aload_0
    //   111: getfield ZB : Lburp/Ze01;
    //   114: iconst_1
    //   115: invokevirtual setEnabled : (Z)V
    //   118: aload_0
    //   119: getfield Zu : Lburp/Ze01;
    //   122: iconst_1
    //   123: invokevirtual setEnabled : (Z)V
    //   126: aload_0
    //   127: getfield Zq : Lburp/Ze01;
    //   130: iconst_1
    //   131: invokevirtual setEnabled : (Z)V
    //   134: aload_0
    //   135: getfield Zd : Lburp/Zbve;
    //   138: getfield Zn : Lburp/Zbws;
    //   141: aload_0
    //   142: getfield Zk : Ljavax/swing/ListSelectionModel;
    //   145: invokeinterface getMinSelectionIndex : ()I
    //   150: invokevirtual convertRowIndexToModel : (I)I
    //   153: istore_3
    //   154: aload_0
    //   155: getfield ZV : Lburp/Zemk;
    //   158: iload_3
    //   159: invokeinterface Zm : (I)Lburp/Zryx;
    //   164: astore #4
    //   166: aload_0
    //   167: getfield Zm : Ljava/util/function/IntConsumer;
    //   170: aload #4
    //   172: invokevirtual ZA : ()I
    //   175: invokeinterface accept : (I)V
    //   180: aload_0
    //   181: getfield Z_ : Lburp/Zbva;
    //   184: aload #4
    //   186: iconst_0
    //   187: invokevirtual Zt : (Lburp/Zryx;Z)V
    //   190: aload_0
    //   191: getfield Zl : Lburp/Zbc9;
    //   194: iconst_1
    //   195: invokevirtual Zv : (I)V
    //   198: aload_2
    //   199: ifnull -> 223
    //   202: aload_0
    //   203: getfield Zk : Ljavax/swing/ListSelectionModel;
    //   206: invokeinterface getSelectedItemsCount : ()I
    //   211: iconst_1
    //   212: if_icmple -> 223
    //   215: aload_0
    //   216: getfield Zn : Lburp/Ze01;
    //   219: iconst_0
    //   220: invokevirtual setEnabled : (Z)V
    //   223: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */