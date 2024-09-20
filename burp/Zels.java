package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zels implements Zzyl {
  private final Zz0n Zh;
  
  private final Zt4u ZJ;
  
  private final Zgbj Zw;
  
  private final Zgb6 Zl;
  
  private final Zskh ZW;
  
  private final Zslu ZD;
  
  private final Ze8b ZY;
  
  private final Zbiv ZF;
  
  private final Zgx0 Zx;
  
  private final Zerg Zo;
  
  private final Zskh Zu;
  
  private final Zbnt ZX;
  
  private final Ze47 ZE;
  
  private final Ztdi ZU;
  
  private final Zkqf Z_;
  
  private Component Zr;
  
  private Zez3 Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zels(Zz0n paramZz0n, Zt4u paramZt4u, Zgbj paramZgbj, Zgb6 paramZgb6, Zskh paramZskh1, Zslu paramZslu, Zkl6 paramZkl6, Ze8b paramZe8b, Zbiv paramZbiv, Zgx0 paramZgx0, Zerg paramZerg, Zskh paramZskh2, Ztdi paramZtdi, Zgso paramZgso) {
    this.Zh = paramZz0n;
    this.ZJ = paramZt4u;
    this.Zw = paramZgbj;
    this.Zl = paramZgb6;
    this.ZW = paramZskh1;
    this.ZD = paramZslu;
    this.ZY = paramZe8b;
    this.ZF = paramZbiv;
    this.Zx = paramZgx0;
    this.Zo = paramZerg;
    this.Zu = paramZskh2;
    this.ZX = paramZkl6.ZB();
    this.ZU = paramZtdi;
    Objects.requireNonNull(paramZgb6);
    this.ZE = new Ze47(paramZkl6.ZM(), paramZgb6::ZcC);
    this.Z_ = new Zkqf(paramZerg, paramZgso, paramZslu, this);
  }
  
  void Zg(Zmxi paramZmxi, Zez3 paramZez3, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: putfield Zb : Lburp/Zez3;
    //   5: invokestatic Zc : ()Ljava/lang/String;
    //   8: aload_0
    //   9: aload_3
    //   10: putfield Zr : Ljava/awt/Component;
    //   13: aload_2
    //   14: invokeinterface ZoO : ()Lburp/Zstu;
    //   19: astore #6
    //   21: astore #5
    //   23: aload #6
    //   25: ifnull -> 42
    //   28: aload #6
    //   30: invokeinterface Zpu : ()I
    //   35: ifle -> 42
    //   38: iconst_1
    //   39: goto -> 43
    //   42: iconst_0
    //   43: istore #7
    //   45: aload_0
    //   46: invokevirtual Zx : ()Ljava/lang/String;
    //   49: invokestatic ZR : (Ljava/lang/String;)Lburp/Zkj9;
    //   52: astore #8
    //   54: new burp/Zepe
    //   57: dup
    //   58: sipush #-16263
    //   61: sipush #6166
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: astore #9
    //   72: aload #9
    //   74: aload_1
    //   75: aload_2
    //   76: <illegal opcode> actionPerformed : (Lburp/Zmxi;Lburp/Zez3;)Ljava/awt/event/ActionListener;
    //   81: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   84: aload #8
    //   86: aload #9
    //   88: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   91: pop
    //   92: aload_0
    //   93: getfield Z_ : Lburp/Zkqf;
    //   96: aload #8
    //   98: invokevirtual Zr : (Lburp/Zkj9;)V
    //   101: aload_0
    //   102: getfield Z_ : Lburp/Zkqf;
    //   105: aload #8
    //   107: aload_2
    //   108: invokeinterface ZlL : ()Lburp/Zlit;
    //   113: iconst_0
    //   114: invokevirtual Zr : (Lburp/Zkj9;Lburp/Zlit;Z)V
    //   117: aload_0
    //   118: getfield Z_ : Lburp/Zkqf;
    //   121: aload #8
    //   123: invokevirtual Zr : (Lburp/Zkj9;)V
    //   126: aload_0
    //   127: aload #8
    //   129: invokevirtual Zc : (Lburp/Zkj9;)V
    //   132: aload_0
    //   133: getfield Z_ : Lburp/Zkqf;
    //   136: aload #8
    //   138: iconst_0
    //   139: iconst_1
    //   140: iload #7
    //   142: invokevirtual ZW : (Lburp/Zkj9;ZZZ)V
    //   145: aload_0
    //   146: aload #8
    //   148: invokevirtual Zd : (Lburp/Zkj9;)V
    //   151: aload_0
    //   152: getfield Z_ : Lburp/Zkqf;
    //   155: aload #8
    //   157: invokevirtual Zr : (Lburp/Zkj9;)V
    //   160: aload_0
    //   161: aload #8
    //   163: invokevirtual Zk : (Lburp/Zkj9;)V
    //   166: aload_0
    //   167: getfield Z_ : Lburp/Zkqf;
    //   170: aload #8
    //   172: iconst_0
    //   173: iconst_0
    //   174: invokevirtual ZF : (Lburp/Zkj9;ZZ)V
    //   177: aload #8
    //   179: aload_3
    //   180: aload #4
    //   182: getfield x : I
    //   185: aload #4
    //   187: getfield y : I
    //   190: invokevirtual show : (Ljava/awt/Component;II)V
    //   193: aload #5
    //   195: ifnonnull -> 205
    //   198: iconst_4
    //   199: anewarray burp/Zbqc
    //   202: invokestatic Zr : ([Lburp/Zbqc;)V
    //   205: return
  }
  
  private String Zx() {
    Zez3 zez3 = this.Zb;
    if (zez3 instanceof Zg6u) {
      Zg6u zg6u = (Zg6u)zez3;
      byte[] arrayOfByte = this.Zb.ZlL().ZdH();
      int i = Zli.ZD(arrayOfByte, (byte)47, 0, arrayOfByte.length);
      if (arrayOfByte.length - i > 1)
        i++; 
      String str1 = Zsw8.ZH(zg6u.Zxo().Z_O(), a(-16258, 6673));
      String str2 = Zkb.ZG(Zmw.Zz(arrayOfByte, i, arrayOfByte.length));
      return str1 + str1 + a(-16261, 22404);
    } 
    return this.Zb.ZlL().toString();
  }
  
  private void Zc(Zkj9 paramZkj9) {
    this.ZF.ZA(paramZkj9, this::lambda$addScanMenuItems$1, this);
  }
  
  private void Zd(Zkj9 paramZkj9) {
    this.Z_.Zr(paramZkj9);
    Zztv zztv = new Zztv(a(-16264, -14644));
    paramZkj9.add(zztv);
    zztv.add(Ztsr.ZY(this, 133376, true));
    zztv.add(Ztsr.ZY(this, 133632, true));
    zztv.add(Ztsr.ZY(this, 133888, true));
    zztv.add(Ztsr.ZY(this, 134144, true));
  }
  
  private void Zk(Zkj9 paramZkj9) {
    paramZkj9.add(Ztsr.ZW(this, 134400));
    paramZkj9.add(Ztsr.ZW(this, 134416));
    Zstu zstu = this.Zb.ZoO();
    if (zstu != null && zstu.Zpu() > 0)
      paramZkj9.add(Ztsr.ZW(this, 134432)); 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return ZI(paramInt, this.Zb);
  }
  
  private boolean ZI(int paramInt, Zez3 paramZez3) {
    try {
      Window window = Zt2m.ZF(this.Zr);
      Zlit zlit = paramZez3.ZlL();
      Zmzk zmzk = zlit.Zdz();
      try {
        switch (paramInt) {
          case 133408:
          
          case 133440:
          
          case 136448:
          
          case 136704:
          
          case 136960:
          
          case 131584:
          
          case 131328:
          
          case 133120:
          
          case 132992:
          
          case 133008:
          
          case 132672:
          
          case 132736:
          
          case 134912:
          
          case 135168:
          
          case 135424:
          
          case 134400:
          
          case 134416:
          
          case 134432:
          
          case 134784:
          
          case 133376:
          
          case 133888:
          
          case 133632:
          
          case 134144:
          
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return true;
    } 
  }
  
  private boolean Zd(Zlit paramZlit) {
    this.ZY.ZV(this.ZJ.ZA(), this.ZD.ZAy());
    this.ZD.Zl(new Zlit[] { paramZlit });
    return true;
  }
  
  private boolean ZS(Zlit paramZlit) {
    this.ZD.Zi(new Zlit[] { paramZlit });
    return true;
  }
  
  private boolean ZS(Zll9 paramZll9, Window paramWindow) {
    this.ZF.ZH(paramWindow, Collections.singletonList(paramZll9));
    return true;
  }
  
  private boolean ZD(Zll9 paramZll9) {
    this.ZF.Zv().Zp(paramZll9);
    return true;
  }
  
  private boolean ZK(Zll9 paramZll9) {
    this.ZF.Zv().ZV(paramZll9);
    return true;
  }
  
  private boolean ZW(Zll9 paramZll9, Zmzk paramZmzk) {
    this.Zo.Zg().Zp(paramZmzk, paramZll9.Zos(), null, paramZll9.ZoO());
    return true;
  }
  
  private boolean ZS(Zmzk paramZmzk, Zstu paramZstu) {
    this.Zo.Zm().Ze(paramZmzk, paramZstu, null, null);
    return true;
  }
  
  private boolean ZK(Zll9 paramZll9, Zmzk paramZmzk) {
    String str = Zb71.Zc();
    if (paramZll9.ZoO() != null) {
      this.Zo.ZK().ZP(paramZmzk, paramZll9.Zos(), paramZll9.ZoO());
      if (str == null) {
        this.Zo.ZK().ZU(paramZmzk, paramZll9.Zos());
        return true;
      } 
      return true;
    } 
    this.Zo.ZK().ZU(paramZmzk, paramZll9.Zos());
    return true;
  }
  
  private boolean ZO(Zll9 paramZll9, Zmzk paramZmzk) {
    this.Zo.Ze().ZN(paramZll9.Ze2(), paramZmzk, paramZll9.Zos(), paramZll9.ZoO(), paramZll9.ZoB(), null);
    return true;
  }
  
  private boolean Zp(Zll9 paramZll9, Zmzk paramZmzk) {
    this.Zo.ZM().ZB(paramZmzk, paramZll9.Zos(), paramZll9.ZoO(), paramZll9.Ze2());
    return true;
  }
  
  private boolean Zg(Zstu paramZstu) {
    this.Zo.ZH().ZM(paramZstu);
    return true;
  }
  
  private boolean ZJ(Zstu paramZstu) {
    this.Zo.ZH().ZM(paramZstu);
    return true;
  }
  
  private boolean Zq(Zlit paramZlit, Zstu paramZstu, Window paramWindow) {
    this.Zo.ZJ().Zf(paramZlit, paramZstu, paramWindow, (byte)0);
    return true;
  }
  
  private boolean ZA(Zlit paramZlit, Zstu paramZstu, boolean paramBoolean, Window paramWindow) {
    this.Zo.ZJ().Zj(paramZlit, paramZstu, paramBoolean, paramWindow);
    return true;
  }
  
  private boolean Zv(Zlit paramZlit) {
    this.Zh.ZD().ZR(paramZlit.toString());
    return true;
  }
  
  private boolean Zb(Zmzk paramZmzk, Zstu paramZstu, Window paramWindow) {
    Zz1p zz1p = Zghc.ZY(paramZmzk, paramZstu, (byte)2, this.ZX);
    String str = Zt5w.ZP(zz1p, paramZstu, paramWindow, this.ZW);
    if (!str.isEmpty())
      this.Zh.ZD().ZR(str); 
    return true;
  }
  
  private boolean Zn(Zlit paramZlit, Zstu paramZstu) {
    String str = Zb71.Zc();
    if (paramZstu == null)
      return true; 
    Zs68 zs68 = Zbwc.Zt((Zlit)null, paramZstu, Zt0k.HTML_ANALYSIS, this.ZX);
    List<Zsq8> list = Zm46.Zl(paramZlit, zs68, paramZstu, null, this.ZU, this.ZX, this.Zl.ZU0());
    Set set = (Set)list.stream().map(Zels::lambda$copyLinks$2).collect(Collectors.toSet());
    StringBuilder stringBuilder = new StringBuilder();
    for (String str1 : set) {
      stringBuilder.append(str1);
      stringBuilder.append(Zlb0.Zp);
      if (str == null)
        break; 
    } 
    this.Zh.ZD().ZR(stringBuilder.toString());
    return true;
  }
  
  private boolean ZT(Zll9 paramZll9, Window paramWindow) {
    Zg89 zg89 = new Zg89();
    File file = Zs6n.ZA(Zg1m.DATA, this.ZJ, paramWindow, 1, a(-16262, 22793), zg89);
    if (file != null)
      (new Zzq9(new Zll9[] { paramZll9 }, paramWindow, this.Zu, file, zg89.Zi(), this.ZX, this.Zh.ZM())).run(); 
    return true;
  }
  
  private boolean Zk(Zlit paramZlit, Window paramWindow) {
    this.Zx.Zj(paramWindow, paramZlit);
    return true;
  }
  
  private boolean Zy(Zlit paramZlit, Window paramWindow) {
    this.Zw.Zt(paramWindow, paramZlit);
    return true;
  }
  
  private boolean Zu(Zlit paramZlit, Window paramWindow) {
    this.Zw.Zl(paramWindow, paramZlit);
    return true;
  }
  
  private boolean ZD(Zmzk paramZmzk, Zstu paramZstu, Window paramWindow) {
    Zkyt zkyt = this.ZE.Zw(paramZmzk);
    Zbr zbr = Zbr.Zy(paramZstu, zkyt);
    Zgsq zgsq = Zxd9.ZT(zbr).<Zgsq>map(Zgsq::ZW).orElse(Zgsq.AUTO);
    this.Zw.ZC(Zeew.TARGET, paramWindow, paramZmzk, zbr, zgsq);
    return true;
  }
  
  private static String lambda$copyLinks$2(Zsq8 paramZsq8) {
    return paramZsq8.ZZ.toString();
  }
  
  private void lambda$addScanMenuItems$1(Ztj1 paramZtj1) {
    String str = Zb71.Zc();
    Zrbm zrbm = paramZtj1.Zi();
    if (zrbm instanceof Zriy) {
      Zriy zriy = (Zriy)zrbm;
      if (str != null) {
        zriy.Zy(this.Zb);
        return;
      } 
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  private static void lambda$showPopup$0(Zmxi paramZmxi, Zez3 paramZez3, ActionEvent paramActionEvent) {
    paramZmxi.ZJ();
    paramZmxi.ZC(paramZez3);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'wÑù?ô;£ë4Ç&\\nÁ¾Ù®P{Å¹>-¡íM'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #13
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #54
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
    //   67: ldc 'ï«Fg[,Jsêc,MÈ3D£ù¸vc£'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #71
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zels.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zels.b : [Ljava/lang/String;
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
    //   212: bipush #23
    //   214: goto -> 244
    //   217: bipush #121
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #100
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #8
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC07A) & 0xFFFF;
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
      char c = 'Ï';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zels.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */