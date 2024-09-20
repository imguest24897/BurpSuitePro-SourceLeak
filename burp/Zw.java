package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Optional;

class Zw implements PropertyChangeListener {
  private final Zzdl Ze;
  
  private final Zo0 Zj;
  
  final Zlw0 Zd;
  
  private static final String a;
  
  private Zw(Zlw0 paramZlw0, Zzdl paramZzdl, Zo0 paramZo0) {
    this.Ze = paramZzdl;
    this.Zj = paramZo0;
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSource : ()Ljava/lang/Object;
    //   4: checkcast burp/Zl5t
    //   7: astore_3
    //   8: invokestatic Zb : ()Ljava/lang/String;
    //   11: aload_1
    //   12: invokevirtual getNewValue : ()Ljava/lang/Object;
    //   15: checkcast java/lang/Boolean
    //   18: invokevirtual booleanValue : ()Z
    //   21: istore #4
    //   23: astore_2
    //   24: aload_3
    //   25: invokeinterface Zf : ()Lburp/Zztv;
    //   30: astore #5
    //   32: aload #5
    //   34: ifnull -> 52
    //   37: aload #5
    //   39: iload #4
    //   41: ifne -> 48
    //   44: iconst_1
    //   45: goto -> 49
    //   48: iconst_0
    //   49: invokevirtual setVisible : (Z)V
    //   52: iload #4
    //   54: ifeq -> 121
    //   57: aload_0
    //   58: getfield Zd : Lburp/Zlw0;
    //   61: invokevirtual Zc : ()Ljavax/swing/JTabbedPane;
    //   64: aload_3
    //   65: invokeinterface ZZ : ()Ljava/awt/Component;
    //   70: invokevirtual remove : (Ljava/awt/Component;)V
    //   73: getstatic burp/Zw.a : Ljava/lang/String;
    //   76: aload_3
    //   77: invokeinterface Zs : ()Ljava/lang/String;
    //   82: invokevirtual equals : (Ljava/lang/Object;)Z
    //   85: ifeq -> 175
    //   88: aload_0
    //   89: invokevirtual ZZ : ()Z
    //   92: ifeq -> 175
    //   95: aload_0
    //   96: getfield Zd : Lburp/Zlw0;
    //   99: getstatic burp/Zeew.DASHBOARD : Lburp/Zeew;
    //   102: invokevirtual Zp : ()Ljava/lang/String;
    //   105: invokevirtual ZW : (Ljava/lang/String;)Ljava/util/Optional;
    //   108: aload_0
    //   109: <illegal opcode> accept : (Lburp/Zw;)Ljava/util/function/Consumer;
    //   114: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   117: aload_2
    //   118: ifnonnull -> 175
    //   121: aload_3
    //   122: invokeinterface Zb : ()Ljava/lang/Integer;
    //   127: ifnonnull -> 151
    //   130: aload_0
    //   131: getfield Ze : Lburp/Zzdl;
    //   134: aload_3
    //   135: invokeinterface ZE : (Lburp/Zl5t;)V
    //   140: aload_0
    //   141: getfield Zd : Lburp/Zlw0;
    //   144: invokevirtual Zq : ()V
    //   147: aload_2
    //   148: ifnonnull -> 175
    //   151: aload_0
    //   152: getfield Zj : Lburp/Zo0;
    //   155: aconst_null
    //   156: aload_3
    //   157: invokeinterface Zb : ()Ljava/lang/Integer;
    //   162: aload_3
    //   163: invokeinterface ZL : (Ljava/lang/Integer;Ljava/lang/Integer;Lburp/Zl5t;)V
    //   168: aload_0
    //   169: getfield Zd : Lburp/Zlw0;
    //   172: invokevirtual Zq : ()V
    //   175: return
  }
  
  private boolean ZZ() {
    Optional<Zl5t> optional = this.Zd.ZW(Zeew.DASHBOARD.Zp());
    return (optional.isPresent() && !((Zl5t)optional.get()).Zl() && !((Zl5t)optional.get()).Zz());
  }
  
  private void lambda$propertyChange$1(Zl5t paramZl5t) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zw;Lburp/Zl5t;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$propertyChange$0(Zl5t paramZl5t) {
    this.Zd.Zc().setSelectedComponent(paramZl5t.ZZ());
  }
  
  static {
    // Byte code:
    //   0: bipush #48
    //   2: ldc ':/I\\t'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zw.a : Ljava/lang/String;
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
    //   80: bipush #70
    //   82: goto -> 112
    //   85: bipush #73
    //   87: goto -> 112
    //   90: bipush #126
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #8
    //   107: goto -> 112
    //   110: bipush #66
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */