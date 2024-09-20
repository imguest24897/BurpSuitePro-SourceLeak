package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zgzz {
  private final Zslu ZN;
  
  private final Zbiv Zx;
  
  private final Zerg ZQ;
  
  private final Zm6x Zz;
  
  private final Zbp5 ZV;
  
  private final Zei6 ZA;
  
  private final Zmf9 ZP;
  
  private final Ziy Zk;
  
  private final Zeo_ Z_;
  
  private final Zgso ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgzz(Zslu paramZslu, Zbiv paramZbiv, Zerg paramZerg, Zbnt paramZbnt, Zkl6 paramZkl6, Zm6x paramZm6x, Zbp5 paramZbp5, Zei6 paramZei6, Zmf9 paramZmf9, Ziy paramZiy, Zeo_ paramZeo_) {
    this.ZN = paramZslu;
    this.Zx = paramZbiv;
    this.ZQ = paramZerg;
    this.Zz = paramZm6x;
    this.ZV = paramZbp5;
    this.ZA = paramZei6;
    this.ZP = paramZmf9;
    this.Zk = paramZiy;
    this.Z_ = paramZeo_;
    this.ZW = new Zgso(paramZbnt, paramZkl6, paramZerg, Zeew.PROXY, new Zsai(), paramZm6x);
  }
  
  void ZZ(List<Ztf_<?>> paramList, Component paramComponent, Point paramPoint, InputEvent paramInputEvent) {
    Zlle zlle = new Zlle(paramList);
    if (zlle.Zr())
      return; 
    Zkj9 zkj9 = ZT(zlle);
    ZA(zkj9, zlle);
    Zm(zlle, paramPoint, zkj9);
    ZM(zkj9, zlle);
    Zk(zkj9, zlle);
    Zl(zlle, paramInputEvent, zkj9);
    zkj9.show(paramComponent, paramPoint.x, paramPoint.y);
  }
  
  private Zkj9 ZT(Zlle paramZlle) {
    String str = paramZlle.ZG() ? a(-19839, 31605).formatted(new Object[] { Integer.valueOf(paramZlle.ZJ()) }) : paramZlle.Zp().Zy().toString();
    Zkj9 zkj9 = Zsn5.ZR(str);
    zkj9.setName(a(-19829, -6464));
    return zkj9;
  }
  
  private void ZA(Zkj9 paramZkj9, Zlle paramZlle) {
    // Byte code:
    //   0: invokestatic ZH : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: invokevirtual ZG : ()Z
    //   8: ifeq -> 43
    //   11: aload_1
    //   12: aload_0
    //   13: getfield Zk : Lburp/Ziy;
    //   16: ldc 133408
    //   18: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   21: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   24: pop
    //   25: aload_1
    //   26: aload_0
    //   27: getfield Zk : Lburp/Ziy;
    //   30: ldc 133440
    //   32: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   35: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   38: pop
    //   39: iload_3
    //   40: ifeq -> 91
    //   43: aload_2
    //   44: invokevirtual Zp : ()Lburp/Ztf_;
    //   47: invokeinterface Zy : ()Lburp/Zlit;
    //   52: astore #4
    //   54: aload_0
    //   55: getfield ZN : Lburp/Zslu;
    //   58: aload #4
    //   60: invokeinterface ZG : (Lburp/Zlit;)Z
    //   65: ifeq -> 73
    //   68: ldc 133440
    //   70: goto -> 75
    //   73: ldc 133408
    //   75: istore #5
    //   77: aload_1
    //   78: aload_0
    //   79: getfield Zk : Lburp/Ziy;
    //   82: iload #5
    //   84: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   87: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   90: pop
    //   91: return
  }
  
  private void Zm(Zlle paramZlle, Point paramPoint, Zkj9 paramZkj9) {
    // Byte code:
    //   0: aload_3
    //   1: new burp/Zem9
    //   4: dup
    //   5: iconst_0
    //   6: invokespecial <init> : (I)V
    //   9: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   12: pop
    //   13: aload_3
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual Zs : (Lburp/Zlle;)Lburp/Zepe;
    //   19: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   22: pop
    //   23: aload_3
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual ZR : (Lburp/Zlle;)Lburp/Zepe;
    //   29: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   32: pop
    //   33: aload_3
    //   34: new burp/Zem9
    //   37: dup
    //   38: iconst_0
    //   39: invokespecial <init> : (I)V
    //   42: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   45: pop
    //   46: aload_0
    //   47: getfield ZA : Lburp/Zei6;
    //   50: invokevirtual Zy : ()Lburp/Zz6e;
    //   53: invokeinterface ZJ : ()Lburp/Zmzk;
    //   58: aload_3
    //   59: aload_0
    //   60: aload_1
    //   61: aload_2
    //   62: <illegal opcode> ZI : (Lburp/Zgzz;Lburp/Zlle;Ljava/awt/Point;)Lburp/Zzyl;
    //   67: invokestatic ZL : (Lburp/Zmzk;Lburp/Zkj9;Lburp/Zzyl;)V
    //   70: aload_1
    //   71: invokevirtual ZG : ()Z
    //   74: ifne -> 124
    //   77: aload_1
    //   78: invokevirtual ZX : ()Z
    //   81: ifeq -> 124
    //   84: aload_3
    //   85: new burp/Zem9
    //   88: dup
    //   89: iconst_0
    //   90: invokespecial <init> : (I)V
    //   93: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   96: pop
    //   97: aload_0
    //   98: getfield Z_ : Lburp/Zeo_;
    //   101: aload_1
    //   102: invokevirtual Zp : ()Lburp/Ztf_;
    //   105: invokevirtual ZM : (Lburp/Zz6e;)Ljava/util/List;
    //   108: aload_3
    //   109: dup
    //   110: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   113: pop
    //   114: <illegal opcode> accept : (Lburp/Zkj9;)Ljava/util/function/Consumer;
    //   119: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   124: return
  }
  
  private Zepe ZR(Zlle paramZlle) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #-19836
    //   7: sipush #-283
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> actionPerformed : (Lburp/Zgzz;Lburp/Zlle;)Ljava/awt/event/ActionListener;
    //   25: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   28: aload_2
    //   29: sipush #-19837
    //   32: sipush #11222
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual setName : (Ljava/lang/String;)V
    //   41: aload_2
    //   42: areturn
  }
  
  private Zepe Zs(Zlle paramZlle) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #-19833
    //   7: sipush #7014
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> actionPerformed : (Lburp/Zgzz;Lburp/Zlle;)Ljava/awt/event/ActionListener;
    //   25: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   28: aload_2
    //   29: sipush #-19832
    //   32: sipush #15557
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual setName : (Ljava/lang/String;)V
    //   41: aload_2
    //   42: areturn
  }
  
  private void ZM(Zkj9 paramZkj9, Zlle paramZlle) {
    List<Zeo2> list = paramZlle.Zb();
    if (!list.isEmpty()) {
      paramZkj9.add(new Zem9(0));
      Zzwi zzwi = new Zzwi(list);
      Objects.requireNonNull(zzwi);
      this.Zx.ZA(paramZkj9, zzwi::Zp, this.Zk);
    } 
  }
  
  private void Zk(Zkj9 paramZkj9, Zlle paramZlle) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: invokevirtual ZX : ()Z
    //   8: ifeq -> 102
    //   11: aload_1
    //   12: new burp/Zem9
    //   15: dup
    //   16: iconst_0
    //   17: invokespecial <init> : (I)V
    //   20: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   23: pop
    //   24: aload_2
    //   25: invokevirtual ZG : ()Z
    //   28: ifeq -> 81
    //   31: aload_1
    //   32: aload_0
    //   33: getfield Zk : Lburp/Ziy;
    //   36: ldc 132672
    //   38: sipush #-19825
    //   41: sipush #20206
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   50: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   53: pop
    //   54: aload_1
    //   55: aload_0
    //   56: getfield Zk : Lburp/Ziy;
    //   59: ldc 132736
    //   61: sipush #-19831
    //   64: sipush #-6834
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   73: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   76: pop
    //   77: iload_3
    //   78: ifne -> 175
    //   81: aload_0
    //   82: aload_1
    //   83: aload_2
    //   84: invokevirtual Zp : ()Lburp/Ztf_;
    //   87: invokeinterface ZL : ()Lburp/Zmw9;
    //   92: checkcast burp/Zeo2
    //   95: invokevirtual ZQ : (Lburp/Zkj9;Lburp/Zeo2;)V
    //   98: iload_3
    //   99: ifne -> 175
    //   102: aload_2
    //   103: invokevirtual ZM : ()Z
    //   106: ifeq -> 175
    //   109: aload_1
    //   110: new burp/Zem9
    //   113: dup
    //   114: iconst_0
    //   115: invokespecial <init> : (I)V
    //   118: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   121: pop
    //   122: aload_2
    //   123: invokevirtual ZG : ()Z
    //   126: ifne -> 152
    //   129: aload_1
    //   130: aload_0
    //   131: getfield Zk : Lburp/Ziy;
    //   134: ldc 131328
    //   136: sipush #-19830
    //   139: sipush #27667
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   148: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   151: pop
    //   152: aload_1
    //   153: aload_0
    //   154: getfield Zk : Lburp/Ziy;
    //   157: ldc 132608
    //   159: sipush #-19838
    //   162: sipush #-22834
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   171: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   174: pop
    //   175: return
  }
  
  private void ZQ(Zkj9 paramZkj9, Zeo2 paramZeo2) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZQ : Lburp/Zerg;
    //   8: invokevirtual Zg : ()Lburp/Zr00;
    //   11: ifnull -> 28
    //   14: aload_1
    //   15: aload_0
    //   16: getfield Zk : Lburp/Ziy;
    //   19: ldc 131584
    //   21: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   24: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   27: pop
    //   28: aload_0
    //   29: getfield ZQ : Lburp/Zerg;
    //   32: invokevirtual Zm : ()Lburp/Zx_a;
    //   35: ifnull -> 52
    //   38: aload_1
    //   39: aload_0
    //   40: getfield Zk : Lburp/Ziy;
    //   43: ldc 131328
    //   45: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   48: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   51: pop
    //   52: aload_0
    //   53: getfield ZQ : Lburp/Zerg;
    //   56: invokevirtual ZK : ()Lburp/Zbui;
    //   59: ifnull -> 76
    //   62: aload_1
    //   63: aload_0
    //   64: getfield Zk : Lburp/Ziy;
    //   67: ldc 133120
    //   69: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   72: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   75: pop
    //   76: aload_0
    //   77: getfield ZQ : Lburp/Zerg;
    //   80: invokevirtual Ze : ()Lburp/Zeu0;
    //   83: ifnull -> 100
    //   86: aload_1
    //   87: aload_0
    //   88: getfield Zk : Lburp/Ziy;
    //   91: ldc 132992
    //   93: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   96: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   99: pop
    //   100: aload_0
    //   101: getfield ZQ : Lburp/Zerg;
    //   104: invokevirtual ZM : ()Lburp/Zgvn;
    //   107: ifnull -> 139
    //   110: aload_0
    //   111: getfield ZQ : Lburp/Zerg;
    //   114: invokevirtual ZM : ()Lburp/Zgvn;
    //   117: invokeinterface ZR : ()Z
    //   122: ifeq -> 139
    //   125: aload_1
    //   126: aload_0
    //   127: getfield Zk : Lburp/Ziy;
    //   130: ldc 133008
    //   132: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   135: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   138: pop
    //   139: aload_0
    //   140: getfield ZQ : Lburp/Zerg;
    //   143: invokevirtual ZH : ()Lburp/Zg_j;
    //   146: ifnull -> 231
    //   149: aload_2
    //   150: invokeinterface ZoO : ()Lburp/Zstu;
    //   155: ifnonnull -> 185
    //   158: aload_1
    //   159: aload_0
    //   160: getfield Zk : Lburp/Ziy;
    //   163: ldc 132672
    //   165: sipush #-19827
    //   168: sipush #24213
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   177: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   180: pop
    //   181: iload_3
    //   182: ifne -> 231
    //   185: aload_1
    //   186: aload_0
    //   187: getfield Zk : Lburp/Ziy;
    //   190: ldc 132672
    //   192: sipush #-19826
    //   195: sipush #-17192
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   204: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   207: pop
    //   208: aload_1
    //   209: aload_0
    //   210: getfield Zk : Lburp/Ziy;
    //   213: ldc 132736
    //   215: sipush #-19835
    //   218: sipush #-16764
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   227: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   230: pop
    //   231: aload_2
    //   232: invokeinterface ZoO : ()Lburp/Zstu;
    //   237: ifnull -> 254
    //   240: aload_1
    //   241: aload_0
    //   242: getfield Zk : Lburp/Ziy;
    //   245: ldc 134912
    //   247: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   250: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   253: pop
    //   254: new burp/Zztv
    //   257: dup
    //   258: sipush #-19840
    //   261: sipush #15160
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: invokespecial <init> : (Ljava/lang/String;)V
    //   270: astore #4
    //   272: aload #4
    //   274: aload_0
    //   275: getfield Zk : Lburp/Ziy;
    //   278: ldc 135168
    //   280: sipush #-19828
    //   283: sipush #4860
    //   286: invokestatic a : (II)Ljava/lang/String;
    //   289: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   292: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   295: pop
    //   296: aload #4
    //   298: aload_0
    //   299: getfield Zk : Lburp/Ziy;
    //   302: ldc 135424
    //   304: sipush #-19834
    //   307: sipush #6212
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   316: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   319: pop
    //   320: aload_1
    //   321: aload #4
    //   323: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   326: pop
    //   327: return
  }
  
  private void Zl(Zlle paramZlle, InputEvent paramInputEvent, Zkj9 paramZkj9) {
    List<Zesk> list = this.ZQ.ZM().ZY();
    if (list == null)
      return; 
    List<Component> list1 = this.ZW.Zj(Zrpb.CONTEXT_PROXY_INTERCEPT, paramInputEvent, paramZlle.Zb().<Zmgv>toArray((Zmgv[])new Zeo2[0]), (List<Zlv8>)paramZlle.ZU().stream().map(this::lambda$addExtensionItems$3).collect(Collectors.toList()));
    Objects.requireNonNull(paramZkj9);
    list1.forEach(paramZkj9::add);
  }
  
  private Zmp4 lambda$addExtensionItems$3(Zzh2 paramZzh2) {
    return new Zmp4(paramZzh2, this.ZV, this.Zz);
  }
  
  private void lambda$forwardMenuItem$2(Zlle paramZlle, ActionEvent paramActionEvent) {
    this.ZP.ZS(paramZlle.Zx());
  }
  
  private void lambda$dropMenuItem$1(Zlle paramZlle, ActionEvent paramActionEvent) {
    this.ZP.Zq(paramZlle.Zx());
  }
  
  private boolean lambda$addInterceptItems$0(Zlle paramZlle, Point paramPoint, int paramInt, Object paramObject) {
    return this.Zk.ZQ(paramInt, paramZlle.Zk(), paramPoint);
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'îïâðF0êÉLÝ3laU Æ¦&¡H÷&ÉµpZ· uØ/`ÅuZRýDLâU½Ê.j|¸rk=Þ\\rµJmhhLm§Ô§ð²&b¾ss]´©}½d[%z´NÎ¥J$f½ÉfËämwÞ'ëÄùùWxxÑ)\\tÃn¬\\r·ÄïÎá±ÜP ©A¦ÖËûuÛ{¦ÁÔJb%=s ¶8º¡©QUáFÙoB:OÅ\\r¶ôª[xYLýÍErDç×g;v¿âú*ä9Y\\nË¦î'ØOì.8_qÿÅJLí¢4ÒºóÔìF¦¹Aäs)^Ìý&kè¦ñ}/±áá;äKðÏàIíìªÙ¢×·z'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #20
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'ÒSéþì¶ÎúÁúi¡Ç&r84z/År¶"EO"LÚKCp,°Y)Á'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #16
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #15
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zgzz.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgzz.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #44
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #53
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #80
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB284) & 0xFFFF;
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
      byte b1 = 107;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */