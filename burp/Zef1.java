package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.swing.JSeparator;
import net.portswigger.Znr;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zef1 implements Zzyl {
  private final Zerg Zc;
  
  private final Zbiv Za;
  
  private final Zm_r ZM;
  
  private final Function<Point, List<Zgxp>> ZG;
  
  private final Znr<Zrpb, InputEvent, int[], Zmgv[], List<Component>> ZV;
  
  private List<Zgxp> ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zef1(Zbiv paramZbiv, Zerg paramZerg, Zm_r paramZm_r, Function<Point, List<Zgxp>> paramFunction, Znr<Zrpb, InputEvent, int[], Zmgv[], List<Component>> paramZnr) {
    this.Zc = paramZerg;
    this.Za = paramZbiv;
    this.ZM = paramZm_r;
    this.ZG = paramFunction;
    this.ZV = paramZnr;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZM.ZY(paramInt, this.ZW);
  }
  
  public void ZQ(InputEvent paramInputEvent, Component paramComponent, Point paramPoint) {
    Zl(paramPoint);
    if (this.ZW == null || this.ZW.isEmpty())
      return; 
    boolean bool = (this.ZW.size() > 1) ? true : false;
    Zgxp zgxp = this.ZW.get(0);
    Zmzk zmzk = zgxp.Zod();
    Zstu zstu = zgxp.ZoO();
    Zkj9 zkj9 = new Zkj9();
    Zt(bool, zgxp, zkj9);
    this.Za.ZA(zkj9, this::ZH, this);
    zkj9.add(new JSeparator());
    Zn(bool, zstu, zkj9);
    ZI(paramInputEvent, zkj9);
    zkj9.add(new JSeparator());
    zkj9.add(Ztsr.ZW(this, 134864));
    ZH(bool, zkj9);
    ZQ(bool, zkj9);
    zkj9.add(new JSeparator());
    Zz5n.Zn(zmzk, zkj9, this, a(26265, -29070));
    ZG(bool, zstu, zkj9);
    Zl(bool, zkj9);
    zkj9.add(new JSeparator());
    zkj9.add(new Zepa(a(26263, 4813), Zk97.DESKTOP_TOOLS_INTRUDER_ATTACKS_ATTACK_RESULTS, Zt2m.ZF(paramComponent)));
    zkj9.show(paramComponent, paramPoint.x, paramPoint.y);
  }
  
  private void ZQ(boolean paramBoolean, Zkj9 paramZkj9) {
    if (!paramBoolean) {
      paramZkj9.add(Ztsr.ZW(this, 527616));
      paramZkj9.add(Ztsr.ZW(this, 134416));
    } 
  }
  
  private void Zn(boolean paramBoolean, Zstu paramZstu, Zkj9 paramZkj9) {
    int i = Zmuy.ZK();
    if (paramBoolean) {
      ZK(paramZkj9);
      if (i != 0) {
        ZU(paramZstu, paramZkj9);
        return;
      } 
      return;
    } 
    ZU(paramZstu, paramZkj9);
  }
  
  private void ZH(boolean paramBoolean, Zkj9 paramZkj9) {
    int i = Zmuy.Zp();
    if (paramBoolean) {
      paramZkj9.add(Ztsr.Zx(this, 527360, a(26267, -25547)));
      if (i == 0) {
        paramZkj9.add(Ztsr.ZW(this, 527360));
        return;
      } 
      return;
    } 
    paramZkj9.add(Ztsr.ZW(this, 527360));
  }
  
  private void ZG(boolean paramBoolean, Zstu paramZstu, Zkj9 paramZkj9) {
    int i = Zmuy.ZK();
    if (paramBoolean) {
      paramZkj9.add(Ztsr.Zx(this, 134432, a(26258, -32243)));
      if (i != 0) {
        if (paramZstu != null)
          paramZkj9.add(Ztsr.ZW(this, 134432)); 
        return;
      } 
      return;
    } 
    if (paramZstu != null)
      paramZkj9.add(Ztsr.ZW(this, 134432)); 
  }
  
  private void Zl(boolean paramBoolean, Zkj9 paramZkj9) {
    int i = Zmuy.ZK();
    if (paramBoolean) {
      paramZkj9.add(Ztsr.Zx(this, 134784, a(26245, -24319)));
      if (i != 0) {
        paramZkj9.add(Ztsr.Zx(this, 134784, a(26257, 32169)));
        return;
      } 
      return;
    } 
    paramZkj9.add(Ztsr.Zx(this, 134784, a(26257, 32169)));
  }
  
  private void ZI(InputEvent paramInputEvent, Zkj9 paramZkj9) {
    int i = Zmuy.Zp();
    List<Zesk> list = this.Zc.ZM().ZY();
    if (list != null) {
      List list1 = (List)this.ZV.Zj(Zrpb.CONTEXT_INTRUDER_ATTACK_RESULTS, paramInputEvent, null, this.ZW.<Zmgv>toArray((Zmgv[])new Zgxp[0]));
      for (Component component : list1) {
        paramZkj9.add(component);
        if (i == 0)
          break; 
      } 
    } 
  }
  
  private void ZK(Zkj9 paramZkj9) {
    paramZkj9.add(Ztsr.Zx(this, 132672, a(26244, -28331)));
    paramZkj9.add(Ztsr.Zx(this, 132736, a(26260, -26983)));
  }
  
  private void ZU(Zstu paramZstu, Zkj9 paramZkj9) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield Zc : Lburp/Zerg;
    //   8: invokevirtual Zg : ()Lburp/Zr00;
    //   11: ifnull -> 25
    //   14: aload_2
    //   15: aload_0
    //   16: ldc 131584
    //   18: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   21: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   24: pop
    //   25: aload_0
    //   26: getfield Zc : Lburp/Zerg;
    //   29: invokevirtual Zm : ()Lburp/Zx_a;
    //   32: ifnull -> 46
    //   35: aload_2
    //   36: aload_0
    //   37: ldc 131328
    //   39: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   42: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   45: pop
    //   46: aload_0
    //   47: getfield Zc : Lburp/Zerg;
    //   50: invokevirtual ZK : ()Lburp/Zbui;
    //   53: ifnull -> 67
    //   56: aload_2
    //   57: aload_0
    //   58: ldc 133120
    //   60: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   63: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   66: pop
    //   67: aload_0
    //   68: getfield Zc : Lburp/Zerg;
    //   71: invokevirtual Ze : ()Lburp/Zeu0;
    //   74: ifnull -> 88
    //   77: aload_2
    //   78: aload_0
    //   79: ldc 132992
    //   81: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   84: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   87: pop
    //   88: aload_0
    //   89: getfield Zc : Lburp/Zerg;
    //   92: invokevirtual ZM : ()Lburp/Zgvn;
    //   95: ifnull -> 124
    //   98: aload_0
    //   99: getfield Zc : Lburp/Zerg;
    //   102: invokevirtual ZM : ()Lburp/Zgvn;
    //   105: invokeinterface ZR : ()Z
    //   110: ifeq -> 124
    //   113: aload_2
    //   114: aload_0
    //   115: ldc 133008
    //   117: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   120: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   123: pop
    //   124: aload_0
    //   125: getfield Zc : Lburp/Zerg;
    //   128: invokevirtual ZH : ()Lburp/Zg_j;
    //   131: ifnull -> 202
    //   134: aload_1
    //   135: ifnonnull -> 162
    //   138: aload_2
    //   139: aload_0
    //   140: ldc 132672
    //   142: sipush #26268
    //   145: sipush #19764
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   154: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   157: pop
    //   158: iload_3
    //   159: ifne -> 202
    //   162: aload_2
    //   163: aload_0
    //   164: ldc 132672
    //   166: sipush #26261
    //   169: sipush #-15626
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   178: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   181: pop
    //   182: aload_2
    //   183: aload_0
    //   184: ldc 132736
    //   186: sipush #26271
    //   189: sipush #-15733
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   198: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   201: pop
    //   202: aload_1
    //   203: ifnull -> 217
    //   206: aload_2
    //   207: aload_0
    //   208: ldc 134912
    //   210: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   213: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   216: pop
    //   217: new burp/Zztv
    //   220: dup
    //   221: sipush #26262
    //   224: sipush #-27473
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: invokespecial <init> : (Ljava/lang/String;)V
    //   233: astore #4
    //   235: aload #4
    //   237: aload_0
    //   238: ldc 135168
    //   240: sipush #26270
    //   243: sipush #-14090
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   252: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   255: pop
    //   256: aload #4
    //   258: aload_0
    //   259: ldc 135424
    //   261: sipush #26266
    //   264: sipush #-15746
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   273: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   276: pop
    //   277: aload_2
    //   278: aload #4
    //   280: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   283: pop
    //   284: aload_2
    //   285: aload_0
    //   286: ldc 134144
    //   288: iconst_1
    //   289: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   292: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   295: pop
    //   296: return
  }
  
  private void Zt(boolean paramBoolean, Zgxp paramZgxp, Zkj9 paramZkj9) {
    String str = paramBoolean ? String.format(a(26269, 23039), new Object[] { Integer.valueOf(this.ZW.size()) }) : String.format(a(26264, 27810), new Object[] { Integer.valueOf(paramZgxp.Zep()) });
    Zepe zepe = new Zepe(str);
    paramZkj9.add(zepe);
    paramZkj9.add(new JSeparator());
  }
  
  private void Zl(Point paramPoint) {
    this.ZW = this.ZG.apply(paramPoint);
  }
  
  private void ZH(Ztj1 paramZtj1) {
    int i = Zmuy.ZK();
    String str = (this.ZW.size() == 1) ? a(26259, 21035) : a(26256, -18778);
    if (this.ZM.ZY(this.ZW, str))
      return; 
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      if (i == 0) {
        Objects.requireNonNull(zriy);
        this.ZW.forEach(zriy::Zy);
        return;
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '´¨Jñ1Ö~ ¯Àú=yHMT¶ÜoHv±ó,Afô(æígð,÷Ö>¸ºo\\tQº\\t£î¢¡óèÐ (Å('¯$Tî©nW[/cQ¤H;:6wv*@Z-¿\\r¤4ozsÀ\\tÌb¸z&æAãA6\\t³ÇÈð/áp02é\\bë®/Á¤¼L`e@Æ³s;æþ[{WÕ÷m·<¤¿²?Ýb&WÛSXZý¨½ÎRJÃkÉ7É«ÇO¿¤w&'Ù®\\t+Æ»T4«°7«6Çc¶2YÈpvðGÎ\\b#äUÖ?Qm}M¥¨'¬hþÌøYrÜ~&Uµ§ø¹¾÷ùä:é+¯¶ÍZüBD8èê(rÑÖ¤]·44·3¢1ÈúÈÝzÀ56ÞM`IÊÜG½Ì)|þÍ¯i-Ö@ã)RwM2M>Aò}ÚzDgga«¦zïàÑòM}ä0WGï ÐP´ wRQï,pêµilMM¦ \\bcÁ­d\\f_S~*\\n]KEãs®·u^µ0²vi¿Âó}¾x)Ùb zÊ=lÚ7²w\\fv@¦æ4´êX®w7IMñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #28
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
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
    //   68: ldc '³lÛÉ!ÓL¨û¨Är5ÔûJV&í"ûcj²ÖÌZð·=®ïæ¾Ä»k'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #96
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
    //   129: putstatic burp/Zef1.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zef1.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #122
    //   214: goto -> 243
    //   217: bipush #95
    //   219: goto -> 243
    //   222: bipush #26
    //   224: goto -> 243
    //   227: bipush #124
    //   229: goto -> 243
    //   232: bipush #102
    //   234: goto -> 243
    //   237: bipush #37
    //   239: goto -> 243
    //   242: iconst_1
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
    int i = (paramInt1 ^ 0x6694) & 0xFFFF;
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
      byte b1 = 5;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zef1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */