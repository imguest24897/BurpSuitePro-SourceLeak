package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zsy;

public class Zsvz {
  private final Zldj Zx = new Zldj();
  
  private final Zsy ZX;
  
  final boolean Zr;
  
  private String ZS;
  
  private boolean ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zsvz(Zsy paramZsy, String paramString) {
    this.ZX = paramZsy;
    this.Zx.Zi(Zru2.ZW(paramString));
    Zj(paramString);
    this.Zr = (this.ZS != null);
  }
  
  public Zsvz Zd() {
    this.ZF = true;
    return this;
  }
  
  public Zldj Zp() {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    if (this.ZS == null && this.ZF) {
      this.Zx.Zi(Zru2.ZQ(a(29019, 16319) + a(29019, 16319) + this.ZX.Z_(5)));
      this.ZS = a(29022, -22956);
    } 
    if (this.ZS != null) {
      byte b = 0;
      while (b < this.Zx.ZI()) {
        Zru2 zru2 = this.Zx.Ze(b);
        if (zru2.ZI.contains(a(29017, -29433)))
          ZW(zru2, Zru2.ZQ(zru2.ZI.replace(a(29017, -29433), this.ZS))); 
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return this.Zx;
  }
  
  private String Zs() {
    StringBuilder stringBuilder = new StringBuilder();
    Iterator<Zru2> iterator = this.Zx.iterator();
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    while (iterator.hasNext()) {
      Zru2 zru2 = iterator.next();
      stringBuilder.append(zru2.ZI);
      if (arrayOfZbqc == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public Zsvz Zw(String paramString) {
    int i = Zt29.Zs(Zs());
    if (ZJ(paramString))
      return this; 
    Zw(paramString, i);
    return this;
  }
  
  public Zsvz ZG(String paramString) {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    if (this.ZS == null) {
      this.ZS = a(29020, 30335);
      this.Zx.Zi(Zru2.ZQ(a(29021, -7284) + a(29021, -7284) + paramString));
      return this;
    } 
    for (Zru2 zru2 : this.Zx) {
      for (Ztu8 ztu8 : Zk(zru2.ZI)) {
        if (ztu8.ZlD() == 1) {
          ZW(zru2, Zru2.ZW(zru2.ZI.substring(0, ztu8.ZlK())));
          this.Zx.Zi(Zru2.ZQ("&" + paramString + ";"));
          this.Zx.Zi(Zru2.ZW(zru2.ZI.substring(ztu8.ZlK())));
          return this;
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return this;
  }
  
  public Zsvz Zf() {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    byte b = 0;
    while (b < this.Zx.ZI()) {
      Zru2 zru2 = this.Zx.Ze(b);
      for (Ztu8 ztu8 : Zk(zru2.ZI)) {
        if (ztu8 == null || ztu8.ZlP() == null || ztu8.ZlD() == 2 || !a(29016, -15236).equals(ztu8.ZlP().ZJ3()) || ztu8.ZlP().ZJo() == null)
          continue; 
        for (Zs5n zs5n : ztu8.ZlP().ZJo()) {
          if (!a(29009, -29047).equals(zs5n.ZQd()))
            continue; 
          if (!a(29008, -11733).equals(zs5n.ZQG())) {
            ZW(zru2, Zru2.ZW(zru2.ZI.substring(0, zs5n.ZQs())));
            this.Zx.Zy(1, Zru2.ZQ(a(29013, -20131)));
            this.Zx.Zy(2, Zru2.ZW(zru2.ZI.substring(zs5n.ZQc())));
          } 
          return this;
        } 
        ZW(zru2, Zru2.ZW(zru2.ZI.substring(0, ztu8.Zli() - 2)));
        this.Zx.Zy(1, Zru2.ZQ(a(29014, 21428)));
        this.Zx.Zy(2, Zru2.ZW(zru2.ZI.substring(ztu8.Zli() - 2)));
        if (arrayOfZbqc == null)
          break; 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return this;
  }
  
  public Zsvz Z_(String paramString) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZS : Ljava/lang/String;
    //   8: ifnonnull -> 145
    //   11: aload_0
    //   12: aload_0
    //   13: getfield ZX : Lnet/portswigger/Zsy;
    //   16: invokevirtual Zi : ()Lnet/portswigger/Zk5;
    //   19: invokevirtual Zq : ()Lnet/portswigger/Zk5;
    //   22: iconst_3
    //   23: invokevirtual ZK : (I)Ljava/lang/String;
    //   26: putfield ZS : Ljava/lang/String;
    //   29: aload_0
    //   30: getfield ZS : Ljava/lang/String;
    //   33: aload_1
    //   34: sipush #29012
    //   37: sipush #13455
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: aload_0
    //   44: getfield ZS : Ljava/lang/String;
    //   47: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   50: aload_0
    //   51: getfield ZS : Ljava/lang/String;
    //   54: aload_0
    //   55: getfield ZS : Ljava/lang/String;
    //   58: astore #7
    //   60: astore #8
    //   62: astore #9
    //   64: astore #10
    //   66: ldc '<'
    //   68: aload #10
    //   70: ldc ' '
    //   72: aload #9
    //   74: ldc '>'
    //   76: aload #8
    //   78: sipush #29018
    //   81: sipush #-14655
    //   84: invokestatic a : (II)Ljava/lang/String;
    //   87: aload #7
    //   89: ldc '>'
    //   91: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   96: astore_1
    //   97: aload_0
    //   98: getfield Zx : Lburp/Zldj;
    //   101: invokevirtual toString : ()Ljava/lang/String;
    //   104: invokestatic Zs : (Ljava/lang/String;)Z
    //   107: ifeq -> 125
    //   110: aload_0
    //   111: getfield Zx : Lburp/Zldj;
    //   114: aload_1
    //   115: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   118: invokevirtual Zi : (Lburp/Zru2;)V
    //   121: aload_2
    //   122: ifnonnull -> 347
    //   125: aload_0
    //   126: aload_0
    //   127: getfield Zx : Lburp/Zldj;
    //   130: iconst_0
    //   131: invokevirtual Ze : (I)Lburp/Zru2;
    //   134: aload_1
    //   135: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   138: invokevirtual ZW : (Lburp/Zru2;Lburp/Zru2;)V
    //   141: aload_2
    //   142: ifnonnull -> 347
    //   145: aload_0
    //   146: getfield Zx : Lburp/Zldj;
    //   149: invokevirtual iterator : ()Ljava/util/Iterator;
    //   152: astore_3
    //   153: aload_3
    //   154: invokeinterface hasNext : ()Z
    //   159: ifeq -> 347
    //   162: aload_3
    //   163: invokeinterface next : ()Ljava/lang/Object;
    //   168: checkcast burp/Zru2
    //   171: astore #4
    //   173: aload_0
    //   174: aload #4
    //   176: getfield ZI : Ljava/lang/String;
    //   179: invokevirtual Zk : (Ljava/lang/String;)Ljava/util/List;
    //   182: invokeinterface iterator : ()Ljava/util/Iterator;
    //   187: astore #5
    //   189: aload #5
    //   191: invokeinterface hasNext : ()Z
    //   196: ifeq -> 343
    //   199: aload #5
    //   201: invokeinterface next : ()Ljava/lang/Object;
    //   206: checkcast burp/Ztu8
    //   209: astore #6
    //   211: aload #6
    //   213: invokeinterface ZlP : ()Lburp/Zs_n;
    //   218: ifnull -> 339
    //   221: aload_0
    //   222: getfield ZS : Ljava/lang/String;
    //   225: aload #6
    //   227: invokeinterface ZlP : ()Lburp/Zs_n;
    //   232: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   237: invokevirtual equals : (Ljava/lang/Object;)Z
    //   240: ifeq -> 339
    //   243: aload_0
    //   244: aload #4
    //   246: aload #4
    //   248: getfield ZI : Ljava/lang/String;
    //   251: iconst_0
    //   252: aload #6
    //   254: invokeinterface Zli : ()I
    //   259: iconst_1
    //   260: isub
    //   261: invokevirtual substring : (II)Ljava/lang/String;
    //   264: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   269: invokestatic ZW : (Ljava/lang/String;)Lburp/Zru2;
    //   272: invokevirtual ZW : (Lburp/Zru2;Lburp/Zru2;)V
    //   275: aload_0
    //   276: getfield Zx : Lburp/Zldj;
    //   279: aload_1
    //   280: sipush #29017
    //   283: sipush #-29433
    //   286: invokestatic a : (II)Ljava/lang/String;
    //   289: aload_0
    //   290: getfield ZS : Ljava/lang/String;
    //   293: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   296: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   299: invokevirtual Zi : (Lburp/Zru2;)V
    //   302: aload_0
    //   303: getfield Zx : Lburp/Zldj;
    //   306: aload #4
    //   308: getfield ZI : Ljava/lang/String;
    //   311: aload #6
    //   313: invokeinterface Zli : ()I
    //   318: iconst_1
    //   319: isub
    //   320: aload #4
    //   322: getfield ZI : Ljava/lang/String;
    //   325: invokevirtual length : ()I
    //   328: invokevirtual substring : (II)Ljava/lang/String;
    //   331: invokestatic ZW : (Ljava/lang/String;)Lburp/Zru2;
    //   334: invokevirtual Zi : (Lburp/Zru2;)V
    //   337: aload_0
    //   338: areturn
    //   339: aload_2
    //   340: ifnonnull -> 189
    //   343: aload_2
    //   344: ifnonnull -> 153
    //   347: aload_0
    //   348: areturn
  }
  
  public Zsvz Zn(String paramString) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZS : Ljava/lang/String;
    //   8: ifnonnull -> 135
    //   11: aload_0
    //   12: aload_0
    //   13: getfield ZX : Lnet/portswigger/Zsy;
    //   16: invokevirtual Zi : ()Lnet/portswigger/Zk5;
    //   19: invokevirtual Zq : ()Lnet/portswigger/Zk5;
    //   22: iconst_3
    //   23: invokevirtual ZK : (I)Ljava/lang/String;
    //   26: putfield ZS : Ljava/lang/String;
    //   29: aload_0
    //   30: getfield ZS : Ljava/lang/String;
    //   33: aload_1
    //   34: sipush #29017
    //   37: sipush #-29433
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: aload_0
    //   44: getfield ZS : Ljava/lang/String;
    //   47: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   50: aload_0
    //   51: getfield ZS : Ljava/lang/String;
    //   54: astore #7
    //   56: astore #8
    //   58: astore #9
    //   60: ldc '<'
    //   62: aload #9
    //   64: ldc ' '
    //   66: aload #8
    //   68: sipush #29023
    //   71: sipush #4835
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: aload #7
    //   79: ldc '>'
    //   81: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   86: astore_1
    //   87: aload_0
    //   88: getfield Zx : Lburp/Zldj;
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokestatic Zs : (Ljava/lang/String;)Z
    //   97: ifeq -> 115
    //   100: aload_0
    //   101: getfield Zx : Lburp/Zldj;
    //   104: aload_1
    //   105: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   108: invokevirtual Zi : (Lburp/Zru2;)V
    //   111: aload_2
    //   112: ifnonnull -> 337
    //   115: aload_0
    //   116: aload_0
    //   117: getfield Zx : Lburp/Zldj;
    //   120: iconst_0
    //   121: invokevirtual Ze : (I)Lburp/Zru2;
    //   124: aload_1
    //   125: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   128: invokevirtual ZW : (Lburp/Zru2;Lburp/Zru2;)V
    //   131: aload_2
    //   132: ifnonnull -> 337
    //   135: aload_0
    //   136: getfield Zx : Lburp/Zldj;
    //   139: invokevirtual iterator : ()Ljava/util/Iterator;
    //   142: astore_3
    //   143: aload_3
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 337
    //   152: aload_3
    //   153: invokeinterface next : ()Ljava/lang/Object;
    //   158: checkcast burp/Zru2
    //   161: astore #4
    //   163: aload_0
    //   164: aload #4
    //   166: getfield ZI : Ljava/lang/String;
    //   169: invokevirtual Zk : (Ljava/lang/String;)Ljava/util/List;
    //   172: invokeinterface iterator : ()Ljava/util/Iterator;
    //   177: astore #5
    //   179: aload #5
    //   181: invokeinterface hasNext : ()Z
    //   186: ifeq -> 333
    //   189: aload #5
    //   191: invokeinterface next : ()Ljava/lang/Object;
    //   196: checkcast burp/Ztu8
    //   199: astore #6
    //   201: aload #6
    //   203: invokeinterface ZlP : ()Lburp/Zs_n;
    //   208: ifnull -> 329
    //   211: aload_0
    //   212: getfield ZS : Ljava/lang/String;
    //   215: aload #6
    //   217: invokeinterface ZlP : ()Lburp/Zs_n;
    //   222: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifeq -> 329
    //   233: aload_0
    //   234: aload #4
    //   236: aload #4
    //   238: getfield ZI : Ljava/lang/String;
    //   241: iconst_0
    //   242: aload #6
    //   244: invokeinterface Zli : ()I
    //   249: iconst_1
    //   250: isub
    //   251: invokevirtual substring : (II)Ljava/lang/String;
    //   254: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   259: invokestatic ZW : (Ljava/lang/String;)Lburp/Zru2;
    //   262: invokevirtual ZW : (Lburp/Zru2;Lburp/Zru2;)V
    //   265: aload_0
    //   266: getfield Zx : Lburp/Zldj;
    //   269: aload_1
    //   270: sipush #29017
    //   273: sipush #-29433
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: aload_0
    //   280: getfield ZS : Ljava/lang/String;
    //   283: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   286: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   289: invokevirtual Zi : (Lburp/Zru2;)V
    //   292: aload_0
    //   293: getfield Zx : Lburp/Zldj;
    //   296: aload #4
    //   298: getfield ZI : Ljava/lang/String;
    //   301: aload #6
    //   303: invokeinterface Zli : ()I
    //   308: iconst_1
    //   309: isub
    //   310: aload #4
    //   312: getfield ZI : Ljava/lang/String;
    //   315: invokevirtual length : ()I
    //   318: invokevirtual substring : (II)Ljava/lang/String;
    //   321: invokestatic ZW : (Ljava/lang/String;)Lburp/Zru2;
    //   324: invokevirtual Zi : (Lburp/Zru2;)V
    //   327: aload_0
    //   328: areturn
    //   329: aload_2
    //   330: ifnonnull -> 179
    //   333: aload_2
    //   334: ifnonnull -> 143
    //   337: aload_0
    //   338: areturn
  }
  
  public Zsvz ZP(String paramString) {
    Zru2 zru2 = this.Zx.Ze(0);
    List<Ztu8> list = Zk(zru2.ZI);
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    if (!list.isEmpty()) {
      Ztu8 ztu8 = list.get(0);
      if (ztu8 != null && ztu8.ZlP() != null && a(29016, -15236).equals(ztu8.ZlP().ZJ3())) {
        ZW(zru2, Zru2.ZW(zru2.ZI.substring(0, ztu8.Zli())));
        this.Zx.Zi(Zru2.ZQ(paramString));
        this.Zx.Zi(Zru2.ZW(zru2.ZI.substring(ztu8.Zli())));
        if (arrayOfZbqc == null) {
          ZW(zru2, Zru2.ZQ(paramString));
          this.Zx.Zi(Zru2.ZW(zru2.ZI));
          return this;
        } 
        return this;
      } 
    } else {
      return this;
    } 
    ZW(zru2, Zru2.ZQ(paramString));
    this.Zx.Zi(Zru2.ZW(zru2.ZI));
    return this;
  }
  
  private void Zj(String paramString) {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    for (Ztu8 ztu8 : Zk(paramString)) {
      if (ztu8 != null && ztu8.ZlP() != null && ztu8.ZlD() != 2 && !a(29010, 28827).equals(ztu8.ZlP().ZJ3())) {
        this.ZS = ztu8.ZlP().ZJ3();
        if (arrayOfZbqc == null)
          continue; 
        break;
      } 
      continue;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private List<Ztu8> Zk(String paramString) {
    return Zsz8.ZJ(Zyf.Za(paramString), 0, paramString.length(), (byte)1);
  }
  
  private void ZW(Zru2 paramZru21, Zru2 paramZru22) {
    this.Zx.Zg(this.Zx.Zm(paramZru21), paramZru22);
  }
  
  private void Zw(String paramString, int paramInt) {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: iconst_0
    //   5: istore #4
    //   7: iload #4
    //   9: aload_0
    //   10: getfield Zx : Lburp/Zldj;
    //   13: invokevirtual ZI : ()I
    //   16: if_icmpge -> 186
    //   19: aload_0
    //   20: getfield Zx : Lburp/Zldj;
    //   23: iload #4
    //   25: invokevirtual Ze : (I)Lburp/Zru2;
    //   28: astore #5
    //   30: iload_2
    //   31: aload #5
    //   33: getfield ZI : Ljava/lang/String;
    //   36: invokevirtual length : ()I
    //   39: if_icmpge -> 140
    //   42: iload_2
    //   43: ifne -> 76
    //   46: aload_0
    //   47: getfield Zx : Lburp/Zldj;
    //   50: aload_0
    //   51: getfield Zx : Lburp/Zldj;
    //   54: aload #5
    //   56: invokevirtual Zm : (Lburp/Zru2;)I
    //   59: putfield Zi : I
    //   62: aload_0
    //   63: aload #5
    //   65: aload_1
    //   66: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   69: invokevirtual ZW : (Lburp/Zru2;Lburp/Zru2;)V
    //   72: aload_3
    //   73: ifnonnull -> 120
    //   76: aload_0
    //   77: aload #5
    //   79: aload #5
    //   81: getfield ZI : Ljava/lang/String;
    //   84: iconst_0
    //   85: iload_2
    //   86: invokevirtual substring : (II)Ljava/lang/String;
    //   89: invokestatic ZW : (Ljava/lang/String;)Lburp/Zru2;
    //   92: invokevirtual ZW : (Lburp/Zru2;Lburp/Zru2;)V
    //   95: aload_0
    //   96: getfield Zx : Lburp/Zldj;
    //   99: aload_0
    //   100: getfield Zx : Lburp/Zldj;
    //   103: invokevirtual ZI : ()I
    //   106: putfield Zi : I
    //   109: aload_0
    //   110: getfield Zx : Lburp/Zldj;
    //   113: aload_1
    //   114: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   117: invokevirtual Zi : (Lburp/Zru2;)V
    //   120: aload_0
    //   121: getfield Zx : Lburp/Zldj;
    //   124: aload #5
    //   126: getfield ZI : Ljava/lang/String;
    //   129: iload_2
    //   130: invokevirtual substring : (I)Ljava/lang/String;
    //   133: invokestatic ZW : (Ljava/lang/String;)Lburp/Zru2;
    //   136: invokevirtual Zi : (Lburp/Zru2;)V
    //   139: return
    //   140: iload_2
    //   141: aload #5
    //   143: getfield ZI : Ljava/lang/String;
    //   146: invokevirtual length : ()I
    //   149: if_icmpne -> 179
    //   152: aload_0
    //   153: getfield Zx : Lburp/Zldj;
    //   156: iload #4
    //   158: iconst_1
    //   159: iadd
    //   160: aload_1
    //   161: invokestatic ZQ : (Ljava/lang/String;)Lburp/Zru2;
    //   164: invokevirtual Zy : (ILburp/Zru2;)V
    //   167: aload_0
    //   168: getfield Zx : Lburp/Zldj;
    //   171: iload #4
    //   173: iconst_1
    //   174: iadd
    //   175: putfield Zi : I
    //   178: return
    //   179: iinc #4, 1
    //   182: aload_3
    //   183: ifnonnull -> 7
    //   186: return
  }
  
  private boolean ZJ(String paramString) {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    byte b = 0;
    while (b < this.Zx.ZI()) {
      Zru2 zru2 = this.Zx.Ze(b);
      Ztu8 ztu8 = Zc(zru2);
      if (ztu8 != null) {
        ZW(zru2, Zru2.ZW(zru2.ZI.substring(0, ztu8.ZlK())));
        this.Zx.Zi = this.Zx.ZI();
        this.Zx.Zi(Zru2.ZQ(paramString));
        this.Zx.Zi(Zru2.ZW(zru2.ZI.substring(ztu8.Zli(), zru2.ZI.length())));
        return true;
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  private Ztu8 Zc(Zru2 paramZru2) {
    Zbqc[] arrayOfZbqc = Zldj.ZL();
    for (Ztu8 ztu8 : Zk(paramZru2.ZI)) {
      if (ztu8.ZlD() == 2 && ztu8.Zlv() != null && ztu8.Zlv().startsWith(a(29015, 31857)))
        return ztu8; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'v\\np3°oÅyÇÂø}O¾Q\\bbsý:àB;ãMJ¤¶s7 9xB+,ÝØZ\\tçÄÁOMM è¼Á·OpXÇ\\tVÈO'íSxûd¼b<º ¢DÅã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #105
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'È6§ÁÀ´ø'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #64
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zsvz.a : [Ljava/lang/String;
    //   130: bipush #17
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsvz.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #12
    //   214: goto -> 244
    //   217: bipush #69
    //   219: goto -> 244
    //   222: bipush #7
    //   224: goto -> 244
    //   227: bipush #113
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #60
    //   239: goto -> 244
    //   242: bipush #116
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7150) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsvz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */