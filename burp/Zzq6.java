package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import net.portswigger.Zlz;

public class Zzq6 implements Zzyl {
  private final Zgrj ZS;
  
  private final Zg6q ZZ;
  
  private final Zerg Zn;
  
  private final Component Zz;
  
  private final Zgso Zk;
  
  private Zkj9 Zy;
  
  private List<Zg7t> ZK;
  
  private List<Zrdb> ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zzq6(Zgrj paramZgrj, Zg6q paramZg6q, Zerg paramZerg, Component paramComponent, Zbnt paramZbnt, Zkl6 paramZkl6, Zm6x paramZm6x) {
    this.ZS = paramZgrj;
    this.ZZ = paramZg6q;
    this.Zn = paramZerg;
    this.Zz = paramComponent;
    this.Zk = new Zgso(paramZbnt, paramZkl6, paramZerg, Zeew.SCANNER, new Zsai(), paramZm6x);
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZS.Zj(paramInt, this.ZK, this.ZN);
  }
  
  public void Z_(List<Zg7t> paramList, List<Zrdb> paramList1, MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZK : Ljava/util/List;
    //   5: invokestatic ZL : ()[Lburp/Zbqc;
    //   8: aload_0
    //   9: aload_2
    //   10: putfield ZN : Ljava/util/List;
    //   13: astore #4
    //   15: aload_2
    //   16: invokeinterface isEmpty : ()Z
    //   21: ifne -> 50
    //   24: aload_0
    //   25: aload_0
    //   26: aload_1
    //   27: invokeinterface getFirst : ()Ljava/lang/Object;
    //   32: checkcast burp/Zg7t
    //   35: invokevirtual Zn : (Lburp/Zg7t;)Lburp/Zkj9;
    //   38: putfield Zy : Lburp/Zkj9;
    //   41: aload_0
    //   42: invokevirtual ZG : ()V
    //   45: aload #4
    //   47: ifnonnull -> 61
    //   50: aload_0
    //   51: new burp/Zkj9
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: putfield Zy : Lburp/Zkj9;
    //   61: aload_0
    //   62: getfield ZZ : Lburp/Zg6q;
    //   65: invokeinterface Zy : ()Lburp/Zxgq;
    //   70: getfield allowDashboardViewActions : Z
    //   73: ifeq -> 80
    //   76: aload_0
    //   77: invokevirtual Zy : ()V
    //   80: aload_0
    //   81: invokevirtual ZW : ()V
    //   84: aload_0
    //   85: aload_3
    //   86: invokevirtual Zi : (Ljava/awt/event/MouseEvent;)V
    //   89: aload_0
    //   90: getfield Zy : Lburp/Zkj9;
    //   93: aload_3
    //   94: invokevirtual getComponent : ()Ljava/awt/Component;
    //   97: aload_3
    //   98: invokevirtual getX : ()I
    //   101: aload_3
    //   102: invokevirtual getY : ()I
    //   105: invokevirtual show : (Ljava/awt/Component;II)V
    //   108: return
  }
  
  private Zkj9 Zn(Zg7t paramZg7t) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    if (this.ZK.size() > 1) {
      String str1 = "" + this.ZK.size() + this.ZK.size();
      ImageIcon imageIcon1 = null;
      if (arrayOfZbqc == null) {
        str1 = Zlz.ZB(paramZg7t.toString(), 60);
        imageIcon1 = Ztvx.ZO(paramZg7t.ZH().ZaJ(), paramZg7t.ZH().Zac(), false);
        return Zsn5.Zy(str1, imageIcon1);
      } 
      return Zsn5.Zy(str1, imageIcon1);
    } 
    String str = Zlz.ZB(paramZg7t.toString(), 60);
    ImageIcon imageIcon = Ztvx.ZO(paramZg7t.ZH().ZaJ(), paramZg7t.ZH().Zac(), false);
    return Zsn5.Zy(str, imageIcon);
  }
  
  private void ZG() {
    // Byte code:
    //   0: invokestatic ZL : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZK : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: iconst_1
    //   14: if_icmple -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: istore_2
    //   23: aload_0
    //   24: getfield ZN : Ljava/util/List;
    //   27: invokeinterface size : ()I
    //   32: iconst_1
    //   33: if_icmple -> 40
    //   36: iconst_1
    //   37: goto -> 41
    //   40: iconst_0
    //   41: istore_3
    //   42: iload_2
    //   43: ifeq -> 61
    //   46: sipush #6981
    //   49: sipush #-26783
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: astore #4
    //   57: aload_1
    //   58: ifnonnull -> 91
    //   61: iload_3
    //   62: ifeq -> 80
    //   65: sipush #6990
    //   68: sipush #-8533
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: astore #4
    //   76: aload_1
    //   77: ifnonnull -> 91
    //   80: sipush #6988
    //   83: sipush #-31471
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: astore #4
    //   91: aload_0
    //   92: getfield Zy : Lburp/Zkj9;
    //   95: aload_0
    //   96: ldc 530688
    //   98: aload #4
    //   100: sipush #6989
    //   103: sipush #9317
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: swap
    //   110: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   115: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   118: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   121: pop
    //   122: new burp/Zztv
    //   125: dup
    //   126: sipush #6980
    //   129: sipush #2673
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: invokespecial <init> : (Ljava/lang/String;)V
    //   138: astore #5
    //   140: aload_0
    //   141: aload #5
    //   143: ldc 531200
    //   145: iconst_4
    //   146: invokevirtual Zl : (Lburp/Zztv;IB)V
    //   149: aload_0
    //   150: aload #5
    //   152: ldc 531216
    //   154: iconst_3
    //   155: invokevirtual Zl : (Lburp/Zztv;IB)V
    //   158: aload_0
    //   159: aload #5
    //   161: ldc 531232
    //   163: iconst_2
    //   164: invokevirtual Zl : (Lburp/Zztv;IB)V
    //   167: aload_0
    //   168: aload #5
    //   170: ldc 531248
    //   172: iconst_1
    //   173: invokevirtual Zl : (Lburp/Zztv;IB)V
    //   176: aload_0
    //   177: aload #5
    //   179: ldc 531264
    //   181: iconst_m1
    //   182: invokevirtual Zl : (Lburp/Zztv;IB)V
    //   185: aload_0
    //   186: aload #5
    //   188: invokevirtual Zl : (Lburp/Zztv;)V
    //   191: aload #5
    //   193: aload_0
    //   194: ldc 531280
    //   196: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   199: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   202: pop
    //   203: aload_0
    //   204: getfield Zy : Lburp/Zkj9;
    //   207: aload #5
    //   209: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   212: pop
    //   213: new burp/Zztv
    //   216: dup
    //   217: sipush #6987
    //   220: sipush #-24982
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: invokespecial <init> : (Ljava/lang/String;)V
    //   229: astore #6
    //   231: aload_0
    //   232: invokevirtual Zn : ()B
    //   235: istore #7
    //   237: aload_0
    //   238: aload #6
    //   240: ldc 531456
    //   242: iload #7
    //   244: iconst_3
    //   245: invokevirtual Zs : (Lburp/Zztv;IBB)V
    //   248: aload_0
    //   249: aload #6
    //   251: ldc 531472
    //   253: iload #7
    //   255: iconst_2
    //   256: invokevirtual Zs : (Lburp/Zztv;IBB)V
    //   259: aload_0
    //   260: aload #6
    //   262: ldc 531488
    //   264: iload #7
    //   266: iconst_1
    //   267: invokevirtual Zs : (Lburp/Zztv;IBB)V
    //   270: aload_0
    //   271: aload #6
    //   273: invokevirtual Zl : (Lburp/Zztv;)V
    //   276: aload #6
    //   278: aload_0
    //   279: ldc 531504
    //   281: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   284: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   287: pop
    //   288: aload_0
    //   289: getfield Zy : Lburp/Zkj9;
    //   292: aload #6
    //   294: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   297: pop
    //   298: aload_0
    //   299: getfield ZZ : Lburp/Zg6q;
    //   302: invokeinterface Zy : ()Lburp/Zxgq;
    //   307: getfield allowDelete : Z
    //   310: ifeq -> 344
    //   313: aload_0
    //   314: getfield Zy : Lburp/Zkj9;
    //   317: aload_0
    //   318: ldc 530944
    //   320: aload #4
    //   322: sipush #6984
    //   325: sipush #27488
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: swap
    //   332: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   337: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   340: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   343: pop
    //   344: aload_0
    //   345: invokevirtual Zr : ()V
    //   348: return
  }
  
  private byte Zn() {
    byte b = ((Zrdb)this.ZN.get(0)).ZaJ();
    Iterator<Zrdb> iterator = this.ZN.iterator();
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    while (iterator.hasNext()) {
      Zrdb zrdb = iterator.next();
      if (zrdb.ZaJ() != b)
        return 3; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return b;
  }
  
  private void Zl(Zztv paramZztv, int paramInt, byte paramByte) {
    ZU(paramZztv, paramInt, paramByte, (byte)3);
  }
  
  private void Zs(Zztv paramZztv, int paramInt, byte paramByte1, byte paramByte2) {
    ZU(paramZztv, paramInt, paramByte1, paramByte2);
  }
  
  private void ZU(Zztv paramZztv, int paramInt, byte paramByte1, byte paramByte2) {
    Zepk zepk = Ztsr.ZW(this, paramInt);
    zepk.setIcon(Ztvx.ZO(paramByte1, paramByte2, false));
    paramZztv.add(zepk);
  }
  
  private void Zy() {
    Zztv zztv = new Zztv(a(6991, 13148));
    ButtonGroup buttonGroup = new ButtonGroup();
    Ze77 ze771 = Ztsr.ZS(this, 530432, null);
    buttonGroup.add(ze771);
    zztv.add(ze771);
    Ze77 ze772 = Ztsr.ZS(this, 530176, null);
    buttonGroup.add(ze772);
    zztv.add(ze772);
    Zzpl zzpl = this.ZZ.Zg();
    buttonGroup.setSelected(ze771.getModel(), (zzpl == Zzpl.SIDE_BY_SIDE));
    buttonGroup.setSelected(ze772.getModel(), (zzpl == Zzpl.TABBED));
    this.Zy.add(zztv);
    this.Zy.add(Ztsr.ZW(this, 527168));
    Zr();
  }
  
  private void ZW() {
    this.Zy.add(new Zepa(a(6986, -3412), Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_ISSUES_VIEW, Zt2m.ZF(this.Zz)));
  }
  
  private void Zi(MouseEvent paramMouseEvent) {
    Zbqc[] arrayOfZbqc = Zxaf.ZL();
    List<Zesk> list = this.Zn.ZM().ZY();
    if (list != null) {
      Zrdb[] arrayOfZrdb = new Zrdb[this.ZN.size()];
      Iterator<Zrdb> iterator = this.ZN.iterator();
      byte b = 0;
      while (b < arrayOfZrdb.length) {
        arrayOfZrdb[b] = iterator.next();
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
      List<Component> list1 = this.Zk.ZZ(Zrpb.CONTEXT_SCANNER_RESULTS, paramMouseEvent, arrayOfZrdb);
      for (Component component : list1) {
        this.Zy.add(component);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  private void Zr() {
    this.Zy.add(new JSeparator());
  }
  
  private void Zl(Zztv paramZztv) {
    paramZztv.add(new JSeparator());
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '@èGÚÎÉÊ¡Vë2ª£<Lûë§~õÝyï·w1<¾|ïôùÏü.ø®Ø9JwøG¤¯sïvù½\\nñLQN½9ýtÀ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #18
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
    //   67: ldc '¼Ð@-uc1ÌÈ&,Á ;a%¤"@'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #12
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #49
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
    //   128: putstatic burp/Zzq6.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzq6.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #35
    //   214: goto -> 243
    //   217: iconst_5
    //   218: goto -> 243
    //   221: bipush #76
    //   223: goto -> 243
    //   226: bipush #95
    //   228: goto -> 243
    //   231: bipush #77
    //   233: goto -> 243
    //   236: bipush #66
    //   238: goto -> 243
    //   241: bipush #64
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1B4C) & 0xFFFF;
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
      char c = '¸';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzq6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */