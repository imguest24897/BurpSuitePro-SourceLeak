package burp;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import net.portswigger.Zfp;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zss0 implements Zgwj {
  private final Zeh6 ZA;
  
  private final Zxli Zi;
  
  private final Ztwv Zw;
  
  private final Zroz Zt;
  
  private int Zm = 1;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zss0(Zeh6 paramZeh6, Zxli paramZxli, Ztwv paramZtwv, Zroz paramZroz) {
    this.ZA = paramZeh6;
    this.Zi = paramZxli;
    this.Zw = paramZtwv;
    this.Zt = paramZroz;
  }
  
  public void ZK(Zlte paramZlte, Component paramComponent, Consumer<Zmkb> paramConsumer) {
    // Byte code:
    //   0: invokestatic getPointerInfo : ()Ljava/awt/PointerInfo;
    //   3: invokevirtual getLocation : ()Ljava/awt/Point;
    //   6: astore #5
    //   8: new java/awt/Point
    //   11: dup
    //   12: aload #5
    //   14: invokespecial <init> : (Ljava/awt/Point;)V
    //   17: astore #6
    //   19: aload #6
    //   21: aload_2
    //   22: invokestatic convertPointFromScreen : (Ljava/awt/Point;Ljava/awt/Component;)V
    //   25: invokestatic Zl : ()I
    //   28: new burp/Zkj9
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #7
    //   37: new burp/Zepe
    //   40: dup
    //   41: sipush #-22246
    //   44: sipush #-10666
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: invokespecial <init> : (Ljava/lang/String;)V
    //   53: astore #8
    //   55: new burp/Zepe
    //   58: dup
    //   59: sipush #-22242
    //   62: sipush #11489
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: astore #9
    //   73: aload #7
    //   75: sipush #-22250
    //   78: sipush #-6137
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual setName : (Ljava/lang/String;)V
    //   87: aload #8
    //   89: sipush #-22243
    //   92: sipush #-23687
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: invokevirtual setName : (Ljava/lang/String;)V
    //   101: aload #9
    //   103: sipush #-22256
    //   106: sipush #-2620
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual setName : (Ljava/lang/String;)V
    //   115: aload #8
    //   117: aload_0
    //   118: aload_3
    //   119: <illegal opcode> actionPerformed : (Lburp/Zss0;Ljava/util/function/Consumer;)Ljava/awt/event/ActionListener;
    //   124: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   127: aload #9
    //   129: aload_0
    //   130: aload_3
    //   131: <illegal opcode> actionPerformed : (Lburp/Zss0;Ljava/util/function/Consumer;)Ljava/awt/event/ActionListener;
    //   136: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   139: istore #4
    //   141: aload #7
    //   143: aload #8
    //   145: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   148: pop
    //   149: aload #7
    //   151: aload #9
    //   153: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   156: pop
    //   157: getstatic burp/Zeuf.NEW_TAB_GROUP : Lburp/Zeuf;
    //   160: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   163: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   166: invokevirtual Z_ : ()Lburp/Ze9n;
    //   169: astore #10
    //   171: new burp/Zepe
    //   174: dup
    //   175: sipush #-22247
    //   178: sipush #-27290
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: aload #10
    //   186: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   189: astore #11
    //   191: aload #11
    //   193: aload_0
    //   194: aload_1
    //   195: <illegal opcode> actionPerformed : (Lburp/Zss0;Lburp/Zlte;)Ljava/awt/event/ActionListener;
    //   200: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   203: aload #11
    //   205: sipush #-22245
    //   208: sipush #-17903
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: invokevirtual setName : (Ljava/lang/String;)V
    //   217: aload #11
    //   219: aload_0
    //   220: getfield Zt : Lburp/Zroz;
    //   223: invokevirtual ZL : ()Z
    //   226: invokevirtual setEnabled : (Z)V
    //   229: aload #7
    //   231: new javax/swing/JPopupMenu$Separator
    //   234: dup
    //   235: invokespecial <init> : ()V
    //   238: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   241: pop
    //   242: aload #7
    //   244: aload #11
    //   246: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   249: pop
    //   250: aload #7
    //   252: aload_2
    //   253: aload #6
    //   255: getfield x : I
    //   258: aload #6
    //   260: getfield y : I
    //   263: invokevirtual show : (Ljava/awt/Component;II)V
    //   266: invokestatic Zwu : ()[Lburp/Zbqc;
    //   269: ifnonnull -> 280
    //   272: iinc #4, 1
    //   275: iload #4
    //   277: invokestatic Zx : (I)V
    //   280: return
  }
  
  public void Zn(Zlte paramZlte, int paramInt, Consumer<List<Zmkb>> paramConsumer) {
    Zzyu zzyu = this.Zt.Zs(paramInt);
    if (zzyu == null) {
      Zuh.ZT(false, Zqf.Zr, a(-22249, 1932));
      return;
    } 
    zzyu.ZS(new Zlf6(this, paramZlte, paramInt, paramConsumer));
  }
  
  public Zmkb ZQ() {
    Objects.requireNonNull(this.Zi);
    return Zf(this.Zi::Zo, Zze0.REPEATER_UI_HTTP_TAB_ADDED, null);
  }
  
  private void ZY(Zlte paramZlte, int paramInt, Ztpl paramZtpl, Consumer<List<Zmkb>> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zt : Lburp/Zroz;
    //   4: iload_2
    //   5: invokevirtual Zi : (I)Lburp/Zzb7;
    //   8: astore #5
    //   10: aload_0
    //   11: aload_1
    //   12: invokeinterface ZO : ()Ljavax/swing/JComponent;
    //   17: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   20: aload_0
    //   21: aload_3
    //   22: aload #5
    //   24: aload #4
    //   26: <illegal opcode> accept : (Lburp/Zss0;Lburp/Ztpl;Lburp/Zzb7;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   31: invokevirtual ZO : (Ljava/awt/Window;Ljava/util/function/Consumer;)V
    //   34: return
  }
  
  private void Zb(Ztpl paramZtpl, int paramInt, Zzb7 paramZzb7, Consumer<List<Zmkb>> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Lburp/Ztwv;
    //   4: aload_0
    //   5: iload_2
    //   6: aload_1
    //   7: aload_3
    //   8: aload #4
    //   10: <illegal opcode> run : (Lburp/Zss0;ILburp/Ztpl;Lburp/Zzb7;Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   15: sipush #-22248
    //   18: sipush #-1520
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokeinterface Zl : (Ljava/lang/Runnable;Ljava/lang/String;)Ljava/util/concurrent/Future;
    //   29: pop
    //   30: return
  }
  
  private Zmkb ZP() {
    Objects.requireNonNull(this.Zi);
    return Zf(this.Zi::ZX, Zze0.REPEATER_UI_WEBSOCKET_TAB_ADDED, null);
  }
  
  private Zmkb Zf(Function<String, Zzyu> paramFunction, Zfp paramZfp, Zzb7 paramZzb7) {
    String str = (this.ZA.ZEH()).Ze;
    Zzyu zzyu = paramFunction.apply(str);
    if (paramZzb7 != null) {
      zzyu.Zm(paramZzb7);
      paramZzb7.ZyB();
    } 
    Component component = zzyu.ZI();
    Zm2.Zo(paramZfp);
    return new Zmkb(str, component, zzyu);
  }
  
  private void ZO(Window paramWindow, Consumer<Integer> paramConsumer) {
    // Byte code:
    //   0: new burp/Zrhc
    //   3: dup
    //   4: aload_1
    //   5: getstatic burp/Zzv7.REPEATER_DUPLICATE_TAB_DIALOG : Lburp/Zzv7;
    //   8: sipush #-22252
    //   11: sipush #22349
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: sipush #-22241
    //   20: sipush #4480
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: sipush #-22251
    //   29: sipush #-27460
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: sipush #-22244
    //   38: sipush #19043
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: iconst_1
    //   45: bipush #100
    //   47: aload_0
    //   48: getfield Zm : I
    //   51: aload_0
    //   52: aload_2
    //   53: <illegal opcode> accept : (Lburp/Zss0;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    //   58: invokespecial <init> : (Ljava/awt/Window;Lburp/Zzv7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/function/Consumer;)V
    //   61: astore_3
    //   62: aload_3
    //   63: invokevirtual Zm : ()V
    //   66: return
  }
  
  private void lambda$promptForDuplicationCount$7(Consumer<Integer> paramConsumer, Integer paramInteger) {
    this.Zm = paramInteger.intValue();
    paramConsumer.accept(paramInteger);
  }
  
  private void lambda$handleDuplicateTabs$6(int paramInt, Ztpl paramZtpl, Zzb7 paramZzb7, Consumer paramConsumer) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #6
    //   9: invokestatic Zl : ()I
    //   12: iconst_0
    //   13: istore #7
    //   15: istore #5
    //   17: iload #7
    //   19: iload_1
    //   20: if_icmpge -> 54
    //   23: aload #6
    //   25: aload_0
    //   26: aload_0
    //   27: aload_2
    //   28: <illegal opcode> apply : (Lburp/Zss0;Lburp/Ztpl;)Ljava/util/function/Function;
    //   33: getstatic burp/Zze0.REPEATER_UI_HTTP_TAB_DUPLICATED : Lburp/Zze0;
    //   36: aload_3
    //   37: invokevirtual Zf : (Ljava/util/function/Function;Lnet/portswigger/Zfp;Lburp/Zzb7;)Lburp/Zmkb;
    //   40: invokeinterface add : (Ljava/lang/Object;)Z
    //   45: pop
    //   46: iinc #7, 1
    //   49: iload #5
    //   51: ifne -> 17
    //   54: aload #4
    //   56: aload #6
    //   58: <illegal opcode> run : (Ljava/util/function/Consumer;Ljava/util/List;)Ljava/lang/Runnable;
    //   63: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   66: return
  }
  
  private static void lambda$handleDuplicateTabs$5(Consumer<List> paramConsumer, List paramList) {
    paramConsumer.accept(paramList);
  }
  
  private Zzyu lambda$handleDuplicateTabs$4(Ztpl paramZtpl, String paramString) {
    return this.Zi.ZO(paramZtpl, paramString);
  }
  
  private void lambda$duplicateHttpRequester$3(Ztpl paramZtpl, Zzb7 paramZzb7, Consumer<List<Zmkb>> paramConsumer, Integer paramInteger) {
    Zb(paramZtpl, paramInteger.intValue(), paramZzb7, paramConsumer);
  }
  
  private void lambda$newTabRequested$2(Zlte paramZlte, ActionEvent paramActionEvent) {
    this.Zt.Zr(paramZlte, false);
  }
  
  private void lambda$newTabRequested$1(Consumer<Zmkb> paramConsumer, ActionEvent paramActionEvent) {
    paramConsumer.accept(ZP());
  }
  
  private void lambda$newTabRequested$0(Consumer<Zmkb> paramConsumer, ActionEvent paramActionEvent) {
    paramConsumer.accept(ZQ());
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'µáñQl"§Ê(G*³ík½\\t\\n²7\\fs#*_ã;Ç?#Ôµ\\tà×8º%´ÏiÖDÄW;Å÷aiÇ·kRPs¬í÷´zÞÁöIÞyªÌ6.Ê»7ò²C\<2#³j^ÇY+[_ÊßÆ \\t©PS¥í;æ\\týüøòMô)N\\r§³ý$+ëpóÂ wUWêÌ5%wC?E¬'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #92
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
    //   68: ldc 'WÀõÂx#âß¥ åu(WãüÖæ/\\rPGå° rIlÀ,¨Gyj.F¹Km\(ò'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #30
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #126
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
    //   129: putstatic burp/Zss0.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zss0.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #89
    //   214: goto -> 244
    //   217: bipush #19
    //   219: goto -> 244
    //   222: bipush #7
    //   224: goto -> 244
    //   227: bipush #111
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #18
    //   239: goto -> 244
    //   242: bipush #19
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA91C) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zss0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */