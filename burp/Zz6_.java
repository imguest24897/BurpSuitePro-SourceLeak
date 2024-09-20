package burp;

import java.awt.Component;
import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

class Zz6_<T extends Zr6e> {
  private final Zxer Zn;
  
  private final Zrsj<T> ZM;
  
  private final Zzc2 ZS;
  
  private final Ztca Zj;
  
  private final boolean Zi;
  
  Zz6_(Zxer paramZxer, Zrsj<T> paramZrsj, Zzc2 paramZzc2, Ztca paramZtca, boolean paramBoolean) {
    this.Zn = paramZxer;
    this.ZM = paramZrsj;
    this.ZS = paramZzc2;
    this.Zj = paramZtca;
    this.Zi = paramBoolean;
  }
  
  void Zq(int paramInt1, int paramInt2) {
    ZO(paramInt1, paramInt2, true, true);
  }
  
  void ZJ(int paramInt, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZM : Lburp/Zrsj;
    //   4: aload_2
    //   5: invokeinterface Zi : (Lburp/Zr6e;)Lnet/portswigger/Zto;
    //   10: getfield Zo : Ljava/lang/Object;
    //   13: checkcast java/lang/Integer
    //   16: invokevirtual intValue : ()I
    //   19: istore_3
    //   20: iload_3
    //   21: iconst_1
    //   22: iadd
    //   23: istore #4
    //   25: iload #4
    //   27: ifge -> 31
    //   30: return
    //   31: aload_0
    //   32: getfield Zn : Lburp/Zxer;
    //   35: iload_1
    //   36: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   39: astore #5
    //   41: aload_0
    //   42: getfield Zn : Lburp/Zxer;
    //   45: iload_1
    //   46: invokevirtual getComponentAt : (I)Ljava/awt/Component;
    //   49: astore #6
    //   51: aload_0
    //   52: aload #5
    //   54: iload_1
    //   55: iload #4
    //   57: aload_2
    //   58: invokevirtual Zh : (Ljava/awt/Component;IILburp/Zr6e;)Lnet/portswigger/Zto;
    //   61: astore #7
    //   63: aload #7
    //   65: getfield Zq : Ljava/lang/Object;
    //   68: checkcast java/lang/Integer
    //   71: invokevirtual intValue : ()I
    //   74: istore_1
    //   75: aload #7
    //   77: getfield Zo : Ljava/lang/Object;
    //   80: checkcast java/lang/Integer
    //   83: invokevirtual intValue : ()I
    //   86: istore #4
    //   88: aload_0
    //   89: getfield Zn : Lburp/Zxer;
    //   92: iload_1
    //   93: invokevirtual isEnabledAt : (I)Z
    //   96: istore #8
    //   98: iload_1
    //   99: iload #4
    //   101: if_icmpge -> 111
    //   104: iload #4
    //   106: iconst_1
    //   107: isub
    //   108: goto -> 113
    //   111: iload #4
    //   113: istore #9
    //   115: aload_0
    //   116: aload #5
    //   118: aload #6
    //   120: iload_1
    //   121: iload #9
    //   123: iload #8
    //   125: invokevirtual Zq : (Ljava/awt/Component;Ljava/awt/Component;IIZ)V
    //   128: iload #8
    //   130: ifeq -> 144
    //   133: aload_0
    //   134: aload #6
    //   136: <illegal opcode> run : (Lburp/Zz6_;Ljava/awt/Component;)Ljava/lang/Runnable;
    //   141: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   144: return
  }
  
  void Zn(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramInt2 < 0 || paramInt2 == paramInt1 || paramInt2 == paramInt1 + 1)
      return; 
    ZO(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }
  
  private void ZO(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Zxer;
    //   4: iload_1
    //   5: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   8: astore #6
    //   10: invokestatic Zr : ()[Ljava/lang/String;
    //   13: aload_0
    //   14: getfield Zn : Lburp/Zxer;
    //   17: iload_1
    //   18: invokevirtual getComponentAt : (I)Ljava/awt/Component;
    //   21: astore #7
    //   23: astore #5
    //   25: iload_3
    //   26: ifeq -> 70
    //   29: aload_0
    //   30: getfield Zi : Z
    //   33: ifeq -> 70
    //   36: aload_0
    //   37: aload #6
    //   39: iload_1
    //   40: iload_2
    //   41: invokevirtual ZD : (Ljava/awt/Component;II)Lnet/portswigger/Zto;
    //   44: astore #8
    //   46: aload #8
    //   48: getfield Zq : Ljava/lang/Object;
    //   51: checkcast java/lang/Integer
    //   54: invokevirtual intValue : ()I
    //   57: istore_1
    //   58: aload #8
    //   60: getfield Zo : Ljava/lang/Object;
    //   63: checkcast java/lang/Integer
    //   66: invokevirtual intValue : ()I
    //   69: istore_2
    //   70: aload_0
    //   71: getfield Zn : Lburp/Zxer;
    //   74: iload_1
    //   75: invokevirtual isEnabledAt : (I)Z
    //   78: istore #8
    //   80: iload_1
    //   81: iload_2
    //   82: if_icmpge -> 91
    //   85: iload_2
    //   86: iconst_1
    //   87: isub
    //   88: goto -> 92
    //   91: iload_2
    //   92: istore #9
    //   94: aload_0
    //   95: aload #6
    //   97: aload #7
    //   99: iload_1
    //   100: iload #9
    //   102: iload #8
    //   104: invokevirtual Zq : (Ljava/awt/Component;Ljava/awt/Component;IIZ)V
    //   107: iload #8
    //   109: ifeq -> 146
    //   112: iload #4
    //   114: ifeq -> 146
    //   117: iload_3
    //   118: ifeq -> 137
    //   121: aload_0
    //   122: aload #7
    //   124: <illegal opcode> run : (Lburp/Zz6_;Ljava/awt/Component;)Ljava/lang/Runnable;
    //   129: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   132: aload #5
    //   134: ifnull -> 146
    //   137: aload_0
    //   138: getfield Zn : Lburp/Zxer;
    //   141: aload #7
    //   143: invokevirtual setSelectedComponent : (Ljava/awt/Component;)V
    //   146: return
  }
  
  void ZX(int paramInt1, int paramInt2) {
    Zuh.Zb(this.ZM.Zf(paramInt1), Zqf.Zr);
    if (paramInt2 < 0 || paramInt2 == paramInt1 || paramInt2 == paramInt1 + 1)
      return; 
    T t = this.ZM.ZD(paramInt1);
    int i = (paramInt1 < paramInt2) ? (paramInt2 - 1) : paramInt2;
    Zd(paramInt1, i, t);
    this.Zj.Zh();
  }
  
  private Zto<Integer, Integer> ZD(Component paramComponent, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: iload_3
    //   6: aload_0
    //   7: getfield Zn : Lburp/Zxer;
    //   10: invokevirtual getTabCount : ()I
    //   13: if_icmpne -> 20
    //   16: iconst_1
    //   17: goto -> 21
    //   20: iconst_0
    //   21: istore #5
    //   23: aload_0
    //   24: getfield ZM : Lburp/Zrsj;
    //   27: iload_2
    //   28: invokeinterface ZD : (I)Lburp/Zr6e;
    //   33: astore #6
    //   35: iload #5
    //   37: ifne -> 53
    //   40: aload_0
    //   41: getfield ZM : Lburp/Zrsj;
    //   44: iload_3
    //   45: invokeinterface Zf : (I)Z
    //   50: ifeq -> 57
    //   53: aconst_null
    //   54: goto -> 67
    //   57: aload_0
    //   58: getfield ZM : Lburp/Zrsj;
    //   61: iload_3
    //   62: invokeinterface ZD : (I)Lburp/Zr6e;
    //   67: astore #7
    //   69: iconst_0
    //   70: istore #8
    //   72: aload #7
    //   74: ifnull -> 93
    //   77: aload #7
    //   79: invokeinterface Zy7 : ()Z
    //   84: ifne -> 93
    //   87: aconst_null
    //   88: astore #7
    //   90: iconst_1
    //   91: istore #8
    //   93: iload #5
    //   95: ifeq -> 102
    //   98: aconst_null
    //   99: goto -> 110
    //   102: aload_0
    //   103: getfield Zn : Lburp/Zxer;
    //   106: iload_3
    //   107: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   110: astore #9
    //   112: aload_0
    //   113: iload_2
    //   114: aload #6
    //   116: aload #7
    //   118: invokevirtual Zl : (ILburp/Zr6e;Lburp/Zr6e;)V
    //   121: aload_0
    //   122: getfield Zn : Lburp/Zxer;
    //   125: aload_1
    //   126: invokevirtual indexOfTabComponent : (Ljava/awt/Component;)I
    //   129: istore #10
    //   131: iload #8
    //   133: ifeq -> 163
    //   136: aload_0
    //   137: getfield ZM : Lburp/Zrsj;
    //   140: iload_3
    //   141: invokeinterface Zt : (I)Lnet/portswigger/Zto;
    //   146: getfield Zo : Ljava/lang/Object;
    //   149: checkcast java/lang/Integer
    //   152: invokevirtual intValue : ()I
    //   155: iconst_1
    //   156: iadd
    //   157: istore_3
    //   158: aload #4
    //   160: ifnull -> 196
    //   163: iload #5
    //   165: ifeq -> 181
    //   168: aload_0
    //   169: getfield Zn : Lburp/Zxer;
    //   172: invokevirtual getTabCount : ()I
    //   175: istore_3
    //   176: aload #4
    //   178: ifnull -> 196
    //   181: iload_2
    //   182: iload_3
    //   183: if_icmpge -> 196
    //   186: aload_0
    //   187: getfield Zn : Lburp/Zxer;
    //   190: aload #9
    //   192: invokevirtual indexOfTabComponent : (Ljava/awt/Component;)I
    //   195: istore_3
    //   196: iload #10
    //   198: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   201: iload_3
    //   202: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   205: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   208: areturn
  }
  
  private Zto<Integer, Integer> Zh(Component paramComponent, int paramInt1, int paramInt2, T paramT) {
    T t = this.ZM.ZD(paramInt1);
    Component component = (paramInt2 < this.Zn.getTabCount()) ? this.Zn.getTabComponentAt(paramInt2) : null;
    Zl(paramInt1, t, paramT);
    int i = this.Zn.indexOfTabComponent(paramComponent);
    paramInt2 = (component != null) ? this.Zn.indexOfTabComponent(component) : this.Zn.getTabCount();
    return Zto.ZM(Integer.valueOf(i), Integer.valueOf(paramInt2));
  }
  
  private void Zl(int paramInt, T paramT1, T paramT2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_2
    //   6: ifnull -> 17
    //   9: aload_3
    //   10: ifnonnull -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: istore #5
    //   20: aload_3
    //   21: ifnull -> 38
    //   24: aload_3
    //   25: aload_2
    //   26: invokeinterface ZF : (Ljava/lang/Object;)Z
    //   31: ifne -> 38
    //   34: iconst_1
    //   35: goto -> 39
    //   38: iconst_0
    //   39: istore #6
    //   41: iload #5
    //   43: ifeq -> 74
    //   46: aload_0
    //   47: getfield ZM : Lburp/Zrsj;
    //   50: aload_0
    //   51: getfield Zn : Lburp/Zxer;
    //   54: iload_1
    //   55: invokeinterface ZW : (Lburp/Zlte;I)V
    //   60: aload_0
    //   61: getfield Zj : Lburp/Ztca;
    //   64: invokeinterface Zy : ()V
    //   69: aload #4
    //   71: ifnull -> 162
    //   74: iload #6
    //   76: ifeq -> 153
    //   79: aload_0
    //   80: getfield ZM : Lburp/Zrsj;
    //   83: iload_1
    //   84: invokeinterface ZC : (I)Lburp/Zliy;
    //   89: astore #7
    //   91: aload_0
    //   92: getfield ZM : Lburp/Zrsj;
    //   95: aload_0
    //   96: getfield Zn : Lburp/Zxer;
    //   99: iload_1
    //   100: invokeinterface ZW : (Lburp/Zlte;I)V
    //   105: aload_0
    //   106: getfield ZM : Lburp/Zrsj;
    //   109: aload_0
    //   110: getfield Zn : Lburp/Zxer;
    //   113: aload #7
    //   115: aload_3
    //   116: invokeinterface Zz : (Lburp/Zlte;Lburp/Zliy;Lburp/Zr6e;)V
    //   121: aload_2
    //   122: ifnonnull -> 139
    //   125: aload_0
    //   126: getfield Zj : Lburp/Ztca;
    //   129: invokeinterface ZW : ()V
    //   134: aload #4
    //   136: ifnull -> 148
    //   139: aload_0
    //   140: getfield Zj : Lburp/Ztca;
    //   143: invokeinterface Zq : ()V
    //   148: aload #4
    //   150: ifnull -> 162
    //   153: aload_0
    //   154: getfield Zj : Lburp/Ztca;
    //   157: invokeinterface Za : ()V
    //   162: return
  }
  
  private void Zq(Component paramComponent1, Component paramComponent2, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.Zn.Zf(paramInt1, true);
    this.Zn.ZN(paramComponent1, paramComponent2, paramInt2);
    this.Zn.setEnabledAt(paramInt2, paramBoolean);
    this.ZS.Zk(paramInt1, paramInt2);
  }
  
  private void Zd(int paramInt1, int paramInt2, T paramT) {
    this.Zn.Zx(paramInt1);
    this.Zn.Zt(paramInt2, (Zr6e)paramT);
    this.ZS.ZP(this.Zn, paramInt1, paramInt2, (Zr6e)paramT);
  }
  
  private void lambda$moveTabWithoutIndexCheck$1(Component paramComponent) {
    this.Zn.setSelectedComponent(paramComponent);
  }
  
  private void lambda$dragTabIntoCollapsedGroup$0(Component paramComponent) {
    this.Zn.setSelectedComponent(paramComponent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */