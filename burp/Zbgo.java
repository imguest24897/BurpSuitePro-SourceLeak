package burp;

import java.awt.Component;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.swing.SwingUtilities;

public class Zbgo extends Zbqc implements Zzyl {
  private final Component ZP;
  
  private final Zbxj ZU;
  
  private final Consumer<Boolean> ZF;
  
  private final Zx55 ZV;
  
  private final Zmyz ZA;
  
  private Zrpp Zu;
  
  private static final String a;
  
  public Zbgo(Component paramComponent, List<Zmon> paramList, Zrpp paramZrpp, boolean paramBoolean, Zs_i paramZs_i, Consumer<Boolean> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/awt/BorderLayout
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   15: aload_0
    //   16: aload_1
    //   17: putfield ZP : Ljava/awt/Component;
    //   20: aload_0
    //   21: aload_3
    //   22: putfield Zu : Lburp/Zrpp;
    //   25: aload_0
    //   26: aload #6
    //   28: putfield ZF : Ljava/util/function/Consumer;
    //   31: new burp/Zto1
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #7
    //   40: aload_0
    //   41: aload_2
    //   42: aload #7
    //   44: invokestatic Zl : (Ljava/util/List;Lburp/Ztos;)Lburp/Zmld;
    //   47: iconst_1
    //   48: invokevirtual ZT : (Z)Lburp/Zmld;
    //   51: iload #4
    //   53: invokevirtual ZR : (Z)Lburp/Zmld;
    //   56: invokestatic ZH : ()F
    //   59: ldc 77.0
    //   61: fmul
    //   62: f2i
    //   63: invokevirtual ZL : (I)Lburp/Zmld;
    //   66: invokevirtual Zu : ()Lburp/Zbdt;
    //   69: putfield ZU : Lburp/Zbxj;
    //   72: aload_0
    //   73: new burp/Zx55
    //   76: dup
    //   77: aload_0
    //   78: invokespecial <init> : (Lburp/Zbgo;)V
    //   81: putfield ZV : Lburp/Zx55;
    //   84: aload_0
    //   85: new burp/Zmyz
    //   88: dup
    //   89: iconst_1
    //   90: invokespecial <init> : (I)V
    //   93: putfield ZA : Lburp/Zmyz;
    //   96: aload_0
    //   97: getfield ZU : Lburp/Zbxj;
    //   100: aload_3
    //   101: invokeinterface Zl : (Lburp/Zrpp;)V
    //   106: aload #5
    //   108: ifnull -> 129
    //   111: aload_0
    //   112: getfield ZU : Lburp/Zbxj;
    //   115: aload #5
    //   117: invokeinterface Zv : (Lburp/Zs_i;)V
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   128: athrow
    //   129: aload #7
    //   131: getstatic burp/Zt1j.ZD : Lburp/Zlnb;
    //   134: aload_0
    //   135: aload #6
    //   137: <illegal opcode> accept : (Lburp/Zbgo;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   142: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   145: pop
    //   146: aload #7
    //   148: getstatic burp/Zt1j.ZK : Lburp/Zlnb;
    //   151: aload_0
    //   152: aload #6
    //   154: <illegal opcode> accept : (Lburp/Zbgo;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   159: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   162: pop
    //   163: aload #7
    //   165: getstatic burp/Zt1j.Zk : Lburp/Zlnb;
    //   168: aload_0
    //   169: <illegal opcode> accept : (Lburp/Zbgo;)Ljava/util/function/Consumer;
    //   174: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   177: pop
    //   178: aload_0
    //   179: getfield ZA : Lburp/Zmyz;
    //   182: aload_3
    //   183: getstatic burp/Zrpp.LEFT : Lburp/Zrpp;
    //   186: if_acmpne -> 197
    //   189: dconst_0
    //   190: goto -> 198
    //   193: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   196: athrow
    //   197: dconst_1
    //   198: invokevirtual setResizeWeight : (D)V
    //   201: aload_0
    //   202: getfield ZA : Lburp/Zmyz;
    //   205: aload_0
    //   206: getfield ZV : Lburp/Zx55;
    //   209: invokevirtual addPropertyChangeListener : (Ljava/beans/PropertyChangeListener;)V
    //   212: aload_0
    //   213: getfield ZA : Lburp/Zmyz;
    //   216: iconst_1
    //   217: invokevirtual setDividerSize : (I)V
    //   220: aload_0
    //   221: aload_0
    //   222: getfield ZA : Lburp/Zmyz;
    //   225: getstatic burp/Zbgo.a : Ljava/lang/String;
    //   228: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   231: aload_0
    //   232: invokevirtual ZQ : ()V
    //   235: return
    // Exception table:
    //   from	to	target	type
    //   40	122	125	java/lang/IllegalArgumentException
    //   129	193	193	java/lang/IllegalArgumentException
  }
  
  public void Zw(boolean paramBoolean) {
    this.ZU.ZJ(paramBoolean);
    this.ZV.Zd(paramBoolean);
    this.ZF.accept(Boolean.valueOf(paramBoolean));
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZU != null) {
      Component component = this.ZU.ZQ();
      try {
        if (component.getParent() == null)
          SwingUtilities.updateComponentTreeUI(component); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    try {
      if (paramInt == 404992) {
        this.ZU.Zs();
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private void ZQ() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zmyz;
    //   4: aconst_null
    //   5: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   8: invokestatic Zz : ()I
    //   11: aload_0
    //   12: getfield ZA : Lburp/Zmyz;
    //   15: aconst_null
    //   16: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   19: istore_1
    //   20: aload_0
    //   21: getfield Zu : Lburp/Zrpp;
    //   24: getstatic burp/Zrpp.LEFT : Lburp/Zrpp;
    //   27: if_acmpne -> 76
    //   30: aload_0
    //   31: getfield ZA : Lburp/Zmyz;
    //   34: aload_0
    //   35: getfield ZU : Lburp/Zbxj;
    //   38: invokeinterface ZQ : ()Ljava/awt/Component;
    //   43: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   46: aload_0
    //   47: getfield ZA : Lburp/Zmyz;
    //   50: aload_0
    //   51: getfield ZP : Ljava/awt/Component;
    //   54: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   57: aload_0
    //   58: getfield ZA : Lburp/Zmyz;
    //   61: dconst_0
    //   62: invokevirtual setResizeWeight : (D)V
    //   65: iload_1
    //   66: ifne -> 118
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   75: athrow
    //   76: aload_0
    //   77: getfield ZA : Lburp/Zmyz;
    //   80: aload_0
    //   81: getfield ZP : Ljava/awt/Component;
    //   84: invokevirtual setLeftComponent : (Ljava/awt/Component;)V
    //   87: aload_0
    //   88: getfield ZA : Lburp/Zmyz;
    //   91: aload_0
    //   92: getfield ZU : Lburp/Zbxj;
    //   95: invokeinterface ZQ : ()Ljava/awt/Component;
    //   100: invokevirtual setRightComponent : (Ljava/awt/Component;)V
    //   103: aload_0
    //   104: getfield ZA : Lburp/Zmyz;
    //   107: dconst_1
    //   108: invokevirtual setResizeWeight : (D)V
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: aload_0
    //   119: getfield ZV : Lburp/Zx55;
    //   122: invokevirtual ZR : ()V
    //   125: aload_0
    //   126: getfield ZA : Lburp/Zmyz;
    //   129: invokestatic ZF : (Ljava/awt/Component;)V
    //   132: return
    // Exception table:
    //   from	to	target	type
    //   20	69	72	java/lang/IllegalArgumentException
    //   30	111	114	java/lang/IllegalArgumentException
  }
  
  private int Z_(int paramInt) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zu == Zrpp.LEFT) ? paramInt : (this.ZA.getWidth() - this.ZA.getDividerSize() - paramInt);
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    this.ZV.Zc((Zrpp)paramZxr8.ZF().orElseThrow(IllegalArgumentException::new));
  }
  
  private void lambda$new$1(Consumer<Boolean> paramConsumer, Zxr8 paramZxr8) {
    this.ZV.Zd(false);
    paramConsumer.accept(Boolean.valueOf(false));
  }
  
  private void lambda$new$0(Consumer<Boolean> paramConsumer, Zxr8 paramZxr8) {
    this.ZV.Zd(true);
    paramConsumer.accept(Boolean.valueOf(true));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: ldc '\\r-VnJh'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbgo.a : Ljava/lang/String;
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
    //   80: bipush #95
    //   82: goto -> 112
    //   85: bipush #89
    //   87: goto -> 112
    //   90: bipush #41
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #62
    //   102: goto -> 112
    //   105: bipush #11
    //   107: goto -> 112
    //   110: bipush #49
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */