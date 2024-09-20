package burp;

import java.util.List;

class Zbd5 extends Zbqc {
  private final Zejo Zk;
  
  Zbd5(Zejo paramZejo, List<Zb00> paramList, Zs_i paramZs_i, Zlli<Zt1j> paramZlli, Zmsv paramZmsv) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/GridBagLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: aload_0
    //   12: aload_1
    //   13: putfield Zk : Lburp/Zejo;
    //   16: invokestatic Zz : ()I
    //   19: iconst_0
    //   20: istore #7
    //   22: new java/util/LinkedList
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: astore #8
    //   31: istore #6
    //   33: aload #4
    //   35: getstatic burp/Zt1j.ZK : Lburp/Zlnb;
    //   38: aload #8
    //   40: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   45: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   50: pop
    //   51: iconst_0
    //   52: istore #9
    //   54: iload #9
    //   56: aload_2
    //   57: invokeinterface size : ()I
    //   62: if_icmpge -> 324
    //   65: aload_2
    //   66: iload #9
    //   68: invokeinterface get : (I)Ljava/lang/Object;
    //   73: checkcast burp/Zb00
    //   76: astore #10
    //   78: new java/awt/GridBagConstraints
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: astore #11
    //   87: aload #11
    //   89: iconst_0
    //   90: putfield gridx : I
    //   93: aload #11
    //   95: iload #7
    //   97: iinc #7, 1
    //   100: putfield gridy : I
    //   103: aload #11
    //   105: new java/awt/Insets
    //   108: dup
    //   109: iconst_0
    //   110: iconst_0
    //   111: iconst_0
    //   112: iconst_0
    //   113: invokespecial <init> : (IIII)V
    //   116: putfield insets : Ljava/awt/Insets;
    //   119: aload #11
    //   121: iconst_2
    //   122: putfield fill : I
    //   125: aload #11
    //   127: bipush #11
    //   129: putfield anchor : I
    //   132: aload #11
    //   134: dconst_1
    //   135: putfield weightx : D
    //   138: aload #10
    //   140: invokeinterface ZsQ : ()Lburp/Zbdr;
    //   145: astore #12
    //   147: aload #8
    //   149: aload #12
    //   151: invokeinterface add : (Ljava/lang/Object;)Z
    //   156: pop
    //   157: aload #12
    //   159: new burp/Zrf5
    //   162: dup
    //   163: iconst_0
    //   164: iconst_0
    //   165: iconst_1
    //   166: iconst_0
    //   167: getstatic burp/Zlkk.COLLAPSIBLE_SIDEBAR_LABEL_SEPARATOR : Lburp/Zlkk;
    //   170: invokespecial <init> : (IIIILburp/Zlkk;)V
    //   173: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   176: aload_2
    //   177: invokeinterface size : ()I
    //   182: iconst_1
    //   183: if_icmple -> 241
    //   186: aload #5
    //   188: getstatic burp/Zmsv.AUTO_EXPAND : Lburp/Zmsv;
    //   191: if_acmpne -> 241
    //   194: aload_3
    //   195: ifnonnull -> 211
    //   198: iload #9
    //   200: ifne -> 207
    //   203: iconst_1
    //   204: goto -> 227
    //   207: iconst_0
    //   208: goto -> 227
    //   211: aload #10
    //   213: invokeinterface ZsO : ()Lburp/Zs_i;
    //   218: aload_3
    //   219: if_acmpne -> 226
    //   222: iconst_1
    //   223: goto -> 227
    //   226: iconst_0
    //   227: istore #13
    //   229: aload #12
    //   231: iload #13
    //   233: invokestatic ZN : (Lburp/Zbdr;Z)V
    //   236: iload #6
    //   238: ifne -> 247
    //   241: aload #12
    //   243: iconst_0
    //   244: invokestatic ZN : (Lburp/Zbdr;Z)V
    //   247: aload_0
    //   248: aload #12
    //   250: aload #11
    //   252: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   255: new burp/Zkbj
    //   258: dup
    //   259: aload_1
    //   260: aload #10
    //   262: aload #12
    //   264: invokespecial <init> : (Lburp/Zejo;Lburp/Zb00;Lburp/Zbdr;)V
    //   267: astore #13
    //   269: aload #12
    //   271: aload #13
    //   273: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   276: aload #4
    //   278: getstatic burp/Zt1j.Zm : Lburp/Zlnb;
    //   281: aload #10
    //   283: aload #12
    //   285: <illegal opcode> accept : (Lburp/Zb00;Lburp/Zbdr;)Ljava/util/function/Consumer;
    //   290: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   295: pop
    //   296: aload #4
    //   298: getstatic burp/Zt1j.Zx : Lburp/Zlnb;
    //   301: aload #10
    //   303: aload #12
    //   305: <illegal opcode> accept : (Lburp/Zb00;Lburp/Zbdr;)Ljava/util/function/Consumer;
    //   310: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   315: pop
    //   316: iinc #9, 1
    //   319: iload #6
    //   321: ifne -> 54
    //   324: new burp/Zbqc
    //   327: dup
    //   328: invokespecial <init> : ()V
    //   331: astore #9
    //   333: aload #9
    //   335: getstatic burp/Zlkk.COLLAPSIBLE_SIDEBAR_BACKGROUND : Lburp/Zlkk;
    //   338: invokevirtual Zl : (Lburp/Zlkk;)V
    //   341: new java/awt/GridBagConstraints
    //   344: dup
    //   345: invokespecial <init> : ()V
    //   348: astore #10
    //   350: aload #10
    //   352: iconst_0
    //   353: putfield gridx : I
    //   356: aload #10
    //   358: iload #7
    //   360: putfield gridy : I
    //   363: aload #10
    //   365: new java/awt/Insets
    //   368: dup
    //   369: bipush #8
    //   371: iconst_0
    //   372: iconst_0
    //   373: iconst_0
    //   374: invokespecial <init> : (IIII)V
    //   377: putfield insets : Ljava/awt/Insets;
    //   380: aload #10
    //   382: iconst_1
    //   383: putfield fill : I
    //   386: aload #10
    //   388: bipush #11
    //   390: putfield anchor : I
    //   393: aload #10
    //   395: dconst_1
    //   396: putfield weightx : D
    //   399: aload #10
    //   401: dconst_1
    //   402: putfield weighty : D
    //   405: aload_0
    //   406: aload #9
    //   408: aload #10
    //   410: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   413: aload_0
    //   414: getstatic burp/Zlkk.COLLAPSIBLE_SIDEBAR_BACKGROUND : Lburp/Zlkk;
    //   417: invokevirtual Zl : (Lburp/Zlkk;)V
    //   420: return
  }
  
  public void Zk(int paramInt) {
    this.Zk.ZZ(paramInt);
  }
  
  private static void ZN(Zbdr paramZbdr, boolean paramBoolean) {
    Zlkk zlkk1 = paramBoolean ? Zlkk.COLLAPSIBLE_SIDEBAR_SELECTED_LABEL_FOREGROUND : Zlkk.COLLAPSIBLE_SIDEBAR_LABEL_FOREGROUND;
    Zlkk zlkk2 = paramBoolean ? Zlkk.COLLAPSIBLE_SIDEBAR_SELECTED_LABEL_BACKGROUND : Zlkk.COLLAPSIBLE_SIDEBAR_BACKGROUND;
    paramZbdr.Zq(zlkk1);
    paramZbdr.Zl(zlkk2);
  }
  
  private static void lambda$new$3(Zb00 paramZb00, Zbdr paramZbdr, Zxr8<Zs_i> paramZxr8) {
    if (paramZxr8.ZF().orElseThrow() == paramZb00.ZsO())
      ZN(paramZbdr, false); 
  }
  
  private static void lambda$new$2(Zb00 paramZb00, Zbdr paramZbdr, Zxr8<Zs_i> paramZxr8) {
    boolean bool = (paramZxr8.ZF().orElseThrow() == paramZb00.ZsO()) ? true : false;
    ZN(paramZbdr, bool);
    if (bool)
      paramZb00.ZG(); 
  }
  
  private static void lambda$new$1(List paramList, Zxr8 paramZxr8) {
    paramList.forEach(Zbd5::lambda$new$0);
  }
  
  private static void lambda$new$0(Zbdr paramZbdr) {
    ZN(paramZbdr, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */