package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import net.portswigger.Zm2;

public class Zsti implements Zm3g {
  private final Zlw0 ZN;
  
  private final Zson ZX;
  
  private final Runnable Zf;
  
  private final PropertyChangeListener ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsti(Zson paramZson, Zzyl paramZzyl, Zlgj paramZlgj, Supplier<Zl4w> paramSupplier, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZX : Lburp/Zson;
    //   9: aload_0
    //   10: aload #5
    //   12: putfield Zf : Ljava/lang/Runnable;
    //   15: aload_0
    //   16: aload #5
    //   18: <illegal opcode> propertyChange : (Ljava/lang/Runnable;)Ljava/beans/PropertyChangeListener;
    //   23: putfield ZW : Ljava/beans/PropertyChangeListener;
    //   26: invokestatic Zp : ()Lburp/Zrxv;
    //   29: invokevirtual ZX : ()Lburp/Zrxv;
    //   32: invokevirtual Z_ : ()Lburp/Zrxv;
    //   35: aload_2
    //   36: invokevirtual ZP : (Lburp/Zzyl;)Lburp/Zrxv;
    //   39: getstatic burp/Zlkk.SUITE_TABBED_PANE_BACKGROUND : Lburp/Zlkk;
    //   42: invokevirtual ZD : (Lburp/Zlkk;)Lburp/Zrxv;
    //   45: aload_3
    //   46: aload #4
    //   48: invokestatic ZP : (Lburp/Zlgj;Ljava/util/function/Supplier;)Ljava/awt/Component;
    //   51: invokevirtual Zl : (Ljava/awt/Component;)Lburp/Zrxv;
    //   54: new burp/Zlg3
    //   57: dup
    //   58: new burp/Zsxc
    //   61: dup
    //   62: aload_0
    //   63: invokespecial <init> : (Lburp/Zsti;)V
    //   66: invokespecial <init> : (Lburp/Zsxc;)V
    //   69: invokevirtual ZD : (Lburp/Ztuc;)Lburp/Zrxv;
    //   72: aload_0
    //   73: aload_1
    //   74: <illegal opcode> accept : (Lburp/Zsti;Lburp/Zson;)Ljava/util/function/Consumer;
    //   79: invokevirtual ZG : (Ljava/util/function/Consumer;)Lburp/Zrxv;
    //   82: getstatic java/awt/dnd/DragSource.DefaultMoveDrop : Ljava/awt/Cursor;
    //   85: invokevirtual Zv : (Ljava/awt/Cursor;)Lburp/Zrxv;
    //   88: astore #6
    //   90: aload_0
    //   91: new burp/Zlw0
    //   94: dup
    //   95: aload #6
    //   97: new burp/Zk7h
    //   100: dup
    //   101: aload_0
    //   102: invokespecial <init> : (Lburp/Zsti;)V
    //   105: aload_0
    //   106: <illegal opcode> ZE : (Lburp/Zsti;)Lburp/Zzdl;
    //   111: aload_1
    //   112: <illegal opcode> ZL : (Lburp/Zson;)Lburp/Zo0;
    //   117: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   122: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   125: iconst_0
    //   126: invokespecial <init> : (Lburp/Zrxv;Lburp/Zz9w;Lburp/Zzdl;Lburp/Zo0;Ljava/util/function/Predicate;Z)V
    //   129: putfield ZN : Lburp/Zlw0;
    //   132: aload_0
    //   133: invokevirtual Zc : ()Ljavax/swing/JTabbedPane;
    //   136: sipush #20822
    //   139: sipush #14799
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual setName : (Ljava/lang/String;)V
    //   148: return
  }
  
  public Optional<Zl5t> ZG(String paramString) {
    return this.ZN.ZW(paramString);
  }
  
  public Optional<Zl5t> Zt(Component paramComponent) {
    return this.ZN.ZD(paramComponent);
  }
  
  void Zt(Zl5t paramZl5t) {
    this.ZN.Zr(paramZl5t);
    this.Zf.run();
    paramZl5t.Zi(a(20818, -7372), this.ZW);
    paramZl5t.ZJ(a(20818, -7372), this.ZW);
  }
  
  void ZV(Component paramComponent) {
    this.ZN.ZD(paramComponent).ifPresent(this::lambda$remove$4);
    this.ZN.Ze(paramComponent);
    this.Zf.run();
  }
  
  JTabbedPane Zc() {
    return this.ZN.Zc();
  }
  
  void Zr(Component paramComponent) {
    this.ZN.ZM(paramComponent);
  }
  
  void Zt(Component paramComponent, Color paramColor, boolean paramBoolean) {
    this.ZN.Zj(paramComponent, paramColor, paramBoolean);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    String str = Zbk_.Zb();
    List<?> list = paramZmf_.Zs(a(20826, -24299), Zsti::lambda$loadBurpConfiguration$5);
    if (list != null) {
      this.ZX.Zd(paramZmf_);
      List<?> list1 = paramZmf_.Zs(a(20821, 1328), Zsti::lambda$loadBurpConfiguration$6);
      if (list1 != null) {
        byte b = 0;
        while (b < list1.size()) {
          Integer integer = Integer.valueOf(b);
          Zlbj zlbj = (Zlbj)list1.get(b);
          list.stream().filter(zlbj::lambda$loadBurpConfiguration$7).forEach(integer::lambda$loadBurpConfiguration$8);
          b++;
          if (str == null)
            break; 
        } 
      } 
      this.ZN.Zf((List)list);
    } 
  }
  
  void ZD() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic Zb : ()Ljava/lang/String;
    //   5: aload_0
    //   6: getfield ZN : Lburp/Zlw0;
    //   9: invokevirtual ZF : ()Ljava/util/List;
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore_3
    //   18: astore_1
    //   19: aload_3
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 128
    //   28: aload_3
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast burp/Zl5t
    //   37: astore #4
    //   39: aload #4
    //   41: invokeinterface Zl : ()Z
    //   46: ifeq -> 66
    //   49: aload #4
    //   51: invokestatic Zb : (Lburp/Zl5t;)Ljava/util/Optional;
    //   54: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   59: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   62: aload_1
    //   63: ifnonnull -> 124
    //   66: aload #4
    //   68: invokeinterface Zz : ()Z
    //   73: ifeq -> 93
    //   76: aload #4
    //   78: invokestatic ZP : (Lburp/Zl5t;)Ljava/util/Optional;
    //   81: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   86: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   89: aload_1
    //   90: ifnonnull -> 124
    //   93: aload #4
    //   95: invokestatic ZK : (Lburp/Zl5t;)Ljava/util/Optional;
    //   98: astore #5
    //   100: aload #5
    //   102: invokevirtual isPresent : ()Z
    //   105: ifeq -> 124
    //   108: aload #5
    //   110: invokevirtual get : ()Ljava/lang/Object;
    //   113: checkcast net/portswigger/Zzr
    //   116: iload_2
    //   117: iinc #2, 1
    //   120: i2l
    //   121: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   124: aload_1
    //   125: ifnonnull -> 19
    //   128: return
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zzqw zzqw = paramZg4j.ZP(a(20824, 31319));
    this.ZN.ZF().forEach(zzqw::lambda$saveBurpConfiguration$9);
    this.ZX.Zl(paramZg4j);
  }
  
  public List<Zl5t> ZJ() {
    return this.ZN.ZF();
  }
  
  private static Component ZP(Zlgj paramZlgj, Supplier<Zl4w> paramSupplier) {
    Zbqc zbqc = new Zbqc();
    zbqc.setLayout(new BoxLayout(zbqc, 0));
    zbqc.Zl(Zlkk.SUITE_TABBED_PANE_BACKGROUND);
    Zm9t zm9t = new Zm9t();
    zm9t.setName(a(20817, 18119));
    zm9t.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
    zm9t.ZO(Zlkk.SUITE_TABBED_PANE_BACKGROUND);
    zm9t.ZD(Zlkk.SUITE_TABBED_PANE_BACKGROUND);
    zm9t.ZO(a(20829, 26645), Ze3m.ZC(Zeuf.SEARCH, Zlkk.ACTION_NORMAL).ZG(Zlkk.ACTION_HOVER).ZU(Zmcx.LARGE_LINE_SIZE).Z_(), a(20828, 27280), paramZlgj::lambda$createTabbedPaneTrailingComponent$10);
    zbqc.add(zm9t);
    zm9t = new Zm9t();
    zm9t.setName(a(20823, 2114));
    zm9t.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
    zm9t.ZO(Zlkk.SUITE_TABBED_PANE_BACKGROUND);
    zm9t.ZD(Zlkk.SUITE_TABBED_PANE_BACKGROUND);
    zm9t.ZO(a(20831, 32388), Ze3m.ZC(Zeuf.SETTINGS, Zlkk.ACTION_NORMAL).ZG(Zlkk.ACTION_HOVER).ZU(Zmcx.LARGE_LINE_SIZE).Z_(), a(20820, -25362), paramSupplier::lambda$createTabbedPaneTrailingComponent$11);
    zbqc.add(zm9t);
    return zbqc;
  }
  
  private static void lambda$createTabbedPaneTrailingComponent$11(Supplier<Zl4w> paramSupplier, MouseEvent paramMouseEvent) {
    ((Zl4w)paramSupplier.get()).setVisible(true);
  }
  
  private static void lambda$createTabbedPaneTrailingComponent$10(Zlgj paramZlgj, MouseEvent paramMouseEvent) {
    Zm2.ZC(Zrrh.SUITE_SEARCH_OPEN_VIA_ICON);
    paramZlgj.ZK();
  }
  
  private static void lambda$saveBurpConfiguration$9(Zzqw paramZzqw, Zl5t paramZl5t) {
    Zzqp zzqp = paramZzqw.Zc();
    zzqp.Zm(a(20830, 30304), paramZl5t.Zs());
    zzqp.Zj(a(20818, -7372), paramZl5t.Zl());
  }
  
  private static void lambda$loadBurpConfiguration$8(Integer paramInteger, Zeyb paramZeyb) {
    paramZeyb.Zk(paramInteger);
  }
  
  private static boolean lambda$loadBurpConfiguration$7(Zlbj paramZlbj, Zeyb paramZeyb) {
    return paramZlbj.ZkA().contains(paramZeyb.Zs());
  }
  
  private static Zlbj lambda$loadBurpConfiguration$6(Zvt paramZvt) throws Zzam {
    return new Zlbj(paramZvt.ZG(a(20827, -16847)));
  }
  
  private static Zeyb lambda$loadBurpConfiguration$5(Zvt paramZvt) throws Zzam {
    return new Zeyb(paramZvt.ZC(a(20819, -30941)), paramZvt.Zc(a(20818, -7372), false));
  }
  
  private void lambda$remove$4(Zl5t paramZl5t) {
    paramZl5t.Zi(a(20816, 15499), this.ZW);
  }
  
  private static void lambda$new$3(Zson paramZson, Integer paramInteger1, Integer paramInteger2, Zl5t paramZl5t) {
    if (paramInteger1 != null) {
      Zl0q zl0q = paramZson.ZbH(paramInteger1.intValue());
      zl0q.ZQ(paramZl5t);
    } 
    if (paramInteger2 != null) {
      Zl0q zl0q = paramZson.ZbH(paramInteger2.intValue());
      zl0q.ZA(paramZl5t);
      if (!paramZl5t.Zl())
        zl0q.setVisible(true); 
      if (zl0q.getExtendedState() == 1)
        zl0q.setExtendedState(0); 
      zl0q.toFront();
    } 
  }
  
  private void lambda$new$2(Zson paramZson, Zlfz paramZlfz) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zs0 : ()Ljavax/swing/JTabbedPane;
    //   4: astore_3
    //   5: aload_2
    //   6: invokevirtual Zs : ()I
    //   9: istore #4
    //   11: aload_0
    //   12: aload_3
    //   13: iload #4
    //   15: invokevirtual getComponentAt : (I)Ljava/awt/Component;
    //   18: invokevirtual Zt : (Ljava/awt/Component;)Ljava/util/Optional;
    //   21: aload_3
    //   22: iload #4
    //   24: aload_2
    //   25: aload_1
    //   26: <illegal opcode> accept : (Ljavax/swing/JTabbedPane;ILburp/Zlfz;Lburp/Zson;)Ljava/util/function/Consumer;
    //   31: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   34: return
  }
  
  private static void lambda$new$1(JTabbedPane paramJTabbedPane, int paramInt, Zlfz paramZlfz, Zson paramZson, Zl5t paramZl5t) {
    Point point = Zgzo.ZO(paramJTabbedPane, paramInt, paramZlfz.Zs1());
    Zl0q zl0q = paramZson.ZQ(point);
    paramZl5t.Zk(Integer.valueOf(paramZson.ZST().indexOf(zl0q)));
    Zq9.Zv(paramZl5t).ifPresent(Zm2::ZC);
  }
  
  private static void lambda$new$0(Runnable paramRunnable, PropertyChangeEvent paramPropertyChangeEvent) {
    paramRunnable.run();
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'x¸Rñî7è£aqâb'ÿ @-Ç^ôq QGÍ½\\f=Ef¸Y\\rð@DÍf-¸yä6ñëßf'êê"·ô×E°¹ØúÀÌ\\bBi)Q äHçñÿÑ.EoÏûÕd©aëÈmù1 \\rLÏ>wÁXæeZé4'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #27
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'µ9Dã)Ýÿ\\tå]«£ÉX,°¯YïýÙÐ¾¨£ÑX-`'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #125
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zsti.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsti.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #83
    //   214: goto -> 243
    //   217: bipush #68
    //   219: goto -> 243
    //   222: bipush #62
    //   224: goto -> 243
    //   227: bipush #49
    //   229: goto -> 243
    //   232: bipush #41
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #50
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5156) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'Ô';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsti.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */