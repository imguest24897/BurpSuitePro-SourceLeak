package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zzvq {
  private static int ZM;
  
  private final List<Zzyu> Z_;
  
  private final Zsob ZQ;
  
  private final Zroz ZY;
  
  private List<Zkv6> ZW;
  
  private static final String a;
  
  public Zzvq(List<Zzyu> paramList, Zsob paramZsob, Zroz paramZroz) {
    this.Z_ = paramList;
    this.ZQ = paramZsob;
    this.ZY = paramZroz;
  }
  
  public void ZE(Zlte paramZlte, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: ifeq -> 20
    //   5: aload_1
    //   6: invokeinterface getSelectedIndex : ()I
    //   11: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   17: goto -> 23
    //   20: invokestatic emptyList : ()Ljava/util/List;
    //   23: invokevirtual ZY : (Ljava/util/List;)V
    //   26: aload_1
    //   27: invokeinterface ZO : ()Ljavax/swing/JComponent;
    //   32: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   35: getstatic burp/Zzvq.ZM : I
    //   38: getstatic burp/Zzvq.a : Ljava/lang/String;
    //   41: swap
    //   42: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   47: aload_0
    //   48: getfield ZW : Ljava/util/List;
    //   51: invokestatic Zw : (Ljava/awt/Window;Ljava/lang/String;Ljava/util/List;)Lburp/Zr7t;
    //   54: astore_3
    //   55: aload_3
    //   56: iconst_1
    //   57: invokevirtual setVisible : (Z)V
    //   60: aload_3
    //   61: invokevirtual ZC : ()Z
    //   64: ifne -> 144
    //   67: getstatic burp/Zzvq.ZM : I
    //   70: iconst_1
    //   71: iadd
    //   72: putstatic burp/Zzvq.ZM : I
    //   75: aload_0
    //   76: invokevirtual Zy : ()Ljava/util/List;
    //   79: astore #4
    //   81: new java/util/ArrayList
    //   84: dup
    //   85: aload #4
    //   87: invokespecial <init> : (Ljava/util/Collection;)V
    //   90: astore #5
    //   92: aload #5
    //   94: invokestatic reverse : (Ljava/util/List;)V
    //   97: aload #5
    //   99: aload_0
    //   100: aload_1
    //   101: <illegal opcode> accept : (Lburp/Zzvq;Lburp/Zlte;)Ljava/util/function/Consumer;
    //   106: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   111: aload_0
    //   112: getfield ZY : Lburp/Zroz;
    //   115: aload_1
    //   116: aload_3
    //   117: invokevirtual Zr : ()Ljava/lang/String;
    //   120: aload_3
    //   121: invokevirtual Zx : ()Lburp/Zbf6;
    //   124: aload_0
    //   125: invokevirtual Zy : ()Ljava/util/List;
    //   128: invokevirtual Zn : (Lburp/Zlte;Ljava/lang/String;Lburp/Zbf6;Ljava/util/List;)Lburp/Zzb7;
    //   131: pop
    //   132: getstatic burp/Zze0.REPEATER_UI_TAB_GROUP_CREATED : Lburp/Zze0;
    //   135: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   138: aload_1
    //   139: invokeinterface repaint : ()V
    //   144: return
  }
  
  public void ZJ(Zlte paramZlte, Zzb7 paramZzb7) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: getfield ZY : Lburp/Zroz;
    //   5: aload_2
    //   6: invokevirtual Zl : (Lburp/Zr6e;)Ljava/util/List;
    //   9: invokevirtual ZY : (Ljava/util/List;)V
    //   12: invokestatic ZI : ()I
    //   15: aload_1
    //   16: invokeinterface ZO : ()Ljavax/swing/JComponent;
    //   21: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   24: aload_2
    //   25: aload_0
    //   26: getfield ZW : Ljava/util/List;
    //   29: invokestatic Zm : (Ljava/awt/Window;Lburp/Zr6e;Ljava/util/List;)Lburp/Zr7t;
    //   32: astore #4
    //   34: istore_3
    //   35: aload #4
    //   37: iconst_1
    //   38: invokevirtual setVisible : (Z)V
    //   41: aload #4
    //   43: invokevirtual ZC : ()Z
    //   46: ifne -> 294
    //   49: aload_0
    //   50: getfield ZY : Lburp/Zroz;
    //   53: aload_2
    //   54: invokevirtual Zl : (Lburp/Zr6e;)Ljava/util/List;
    //   57: astore #5
    //   59: aload #5
    //   61: iconst_1
    //   62: aload #5
    //   64: invokeinterface size : ()I
    //   69: invokeinterface subList : (II)Ljava/util/List;
    //   74: astore #6
    //   76: aload_0
    //   77: invokevirtual Zy : ()Ljava/util/List;
    //   80: astore #7
    //   82: aload_0
    //   83: getfield ZY : Lburp/Zroz;
    //   86: invokevirtual Zh : ()I
    //   89: istore #8
    //   91: new java/util/ArrayList
    //   94: dup
    //   95: aload #6
    //   97: invokespecial <init> : (Ljava/util/Collection;)V
    //   100: astore #9
    //   102: aload #9
    //   104: invokestatic reverse : (Ljava/util/List;)V
    //   107: aload #9
    //   109: aload #7
    //   111: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   116: pop
    //   117: aload #9
    //   119: aload_0
    //   120: aload_1
    //   121: <illegal opcode> accept : (Lburp/Zzvq;Lburp/Zlte;)Ljava/util/function/Consumer;
    //   126: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   131: aload_2
    //   132: invokeinterface Zy5 : ()I
    //   137: ifle -> 150
    //   140: aload_0
    //   141: getfield ZY : Lburp/Zroz;
    //   144: aload_1
    //   145: aload_2
    //   146: iconst_0
    //   147: invokevirtual Zb : (Lburp/Zlte;Lburp/Zr6e;Z)V
    //   150: aload_0
    //   151: getfield ZY : Lburp/Zroz;
    //   154: invokevirtual Zh : ()I
    //   157: iload #8
    //   159: if_icmpge -> 189
    //   162: aload_0
    //   163: getfield ZY : Lburp/Zroz;
    //   166: aload_1
    //   167: aload #4
    //   169: invokevirtual Zr : ()Ljava/lang/String;
    //   172: aload #4
    //   174: invokevirtual Zx : ()Lburp/Zbf6;
    //   177: aload_0
    //   178: invokevirtual Zy : ()Ljava/util/List;
    //   181: invokevirtual Zn : (Lburp/Zlte;Ljava/lang/String;Lburp/Zbf6;Ljava/util/List;)Lburp/Zzb7;
    //   184: pop
    //   185: iload_3
    //   186: ifeq -> 282
    //   189: aload_1
    //   190: aload #5
    //   192: iconst_0
    //   193: invokeinterface get : (I)Ljava/lang/Object;
    //   198: checkcast java/lang/Integer
    //   201: invokevirtual intValue : ()I
    //   204: aload #4
    //   206: invokevirtual Zr : ()Ljava/lang/String;
    //   209: invokeinterface setTitleAt : (ILjava/lang/String;)V
    //   214: aload_2
    //   215: aload #4
    //   217: invokevirtual Zr : ()Ljava/lang/String;
    //   220: invokeinterface Zti : (Ljava/lang/String;)V
    //   225: aload_2
    //   226: aload #4
    //   228: invokevirtual Zx : ()Lburp/Zbf6;
    //   231: invokeinterface ZC : (Lburp/Zbf6;)V
    //   236: new java/util/ArrayList
    //   239: dup
    //   240: aload #7
    //   242: invokespecial <init> : (Ljava/util/Collection;)V
    //   245: astore #10
    //   247: aload #10
    //   249: aload #6
    //   251: invokeinterface removeAll : (Ljava/util/Collection;)Z
    //   256: pop
    //   257: aload #10
    //   259: aload_0
    //   260: aload_1
    //   261: aload_2
    //   262: <illegal opcode> accept : (Lburp/Zzvq;Lburp/Zlte;Lburp/Zzb7;)Ljava/util/function/Consumer;
    //   267: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   272: aload_0
    //   273: getfield ZY : Lburp/Zroz;
    //   276: aload_1
    //   277: aload_2
    //   278: iconst_0
    //   279: invokevirtual Zb : (Lburp/Zlte;Lburp/Zr6e;Z)V
    //   282: getstatic burp/Zze0.REPEATER_UI_TAB_GROUP_EDITED : Lburp/Zze0;
    //   285: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   288: aload_1
    //   289: invokeinterface repaint : ()V
    //   294: return
  }
  
  private List<Integer> Zy() {
    return (List<Integer>)this.ZW.stream().filter(Zkv6::ZU).map(this::lambda$getSelectedIndices$3).collect(Collectors.toList());
  }
  
  private void ZY(List<Integer> paramList) {
    this.ZW = new ArrayList<>();
    byte b = 0;
    int i = Zsob.ZI();
    while (b < this.ZQ.Zh()) {
      Zggb zggb = this.ZQ.ZE(b);
      if (!zggb.Zm()) {
        Zzyu zzyu = this.Z_.get(zggb.Zc());
        boolean bool = paramList.contains(Integer.valueOf(b));
        if (zzyu.ZR() == null || bool) {
          Zzdy zzdy = ZY(zzyu.ZS(), bool);
          this.ZW.add(new Zkv6(zzyu, zzdy));
        } 
      } 
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  private Zzdy ZY(String paramString, boolean paramBoolean) {
    Zzdy zzdy = new Zzdy();
    zzdy.setText(paramString);
    zzdy.setSelected(paramBoolean);
    return zzdy;
  }
  
  private Integer lambda$getSelectedIndices$3(Zkv6 paramZkv6) {
    return Integer.valueOf(this.ZQ.ZC(paramZkv6.Zi));
  }
  
  private void lambda$showEditTabGroupDialog$2(Zlte paramZlte, Zzb7 paramZzb7, Integer paramInteger) {
    this.ZY.ZZ(paramZlte, this.Z_.get(this.ZQ.ZE(paramInteger.intValue()).Zc()), paramZzb7, false);
  }
  
  private void lambda$showEditTabGroupDialog$1(Zlte paramZlte, Integer paramInteger) {
    this.ZY.ZJ(paramZlte, paramInteger.intValue(), false);
  }
  
  private void lambda$showNewTabGroupDialog$0(Zlte paramZlte, Integer paramInteger) {
    this.ZY.ZW(paramZlte, paramInteger.intValue());
  }
  
  static {
    // Byte code:
    //   0: bipush #85
    //   2: ldc ' poDy'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzvq.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_5
    //   81: goto -> 111
    //   84: bipush #39
    //   86: goto -> 111
    //   89: bipush #74
    //   91: goto -> 111
    //   94: bipush #79
    //   96: goto -> 111
    //   99: bipush #97
    //   101: goto -> 111
    //   104: bipush #12
    //   106: goto -> 111
    //   109: bipush #43
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: iconst_1
    //   154: putstatic burp/Zzvq.ZM : I
    //   157: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzvq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */