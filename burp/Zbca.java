package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;

class Zbca extends Zbqc {
  private final Zxer Zb;
  
  private final Ztca Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbca(Zxer paramZxer, Ztca paramZtca, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Component paramComponent, Zlkk paramZlkk) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zb : Lburp/Zxer;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Zi : Lburp/Ztca;
    //   14: aload_0
    //   15: new java/awt/GridBagLayout
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   25: aload #7
    //   27: ifnull -> 36
    //   30: aload_0
    //   31: aload #7
    //   33: invokevirtual Zl : (Lburp/Zlkk;)V
    //   36: iconst_0
    //   37: istore #8
    //   39: iload_3
    //   40: ifeq -> 190
    //   43: new burp/Zm9t
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: astore #9
    //   52: aload #9
    //   54: sipush #27021
    //   57: sipush #2198
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: invokevirtual setName : (Ljava/lang/String;)V
    //   66: aload #9
    //   68: getstatic burp/Zeuf.ADD : Lburp/Zeuf;
    //   71: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   74: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   77: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   80: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   83: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   86: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   89: invokevirtual Z_ : ()Lburp/Ze9n;
    //   92: sipush #27023
    //   95: sipush #26997
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: aload_1
    //   102: dup
    //   103: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   106: pop
    //   107: <illegal opcode> accept : (Lburp/Zxer;)Ljava/util/function/Consumer;
    //   112: invokevirtual ZE : (Lburp/Ze9n;Ljava/lang/String;Ljava/util/function/Consumer;)V
    //   115: aload #7
    //   117: ifnull -> 134
    //   120: aload #9
    //   122: aload #7
    //   124: invokevirtual ZO : (Lburp/Zlkk;)V
    //   127: aload #9
    //   129: aload #7
    //   131: invokevirtual ZD : (Lburp/Zlkk;)V
    //   134: new java/awt/GridBagConstraints
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: astore #10
    //   143: aload #10
    //   145: iload #8
    //   147: iinc #8, 1
    //   150: putfield gridx : I
    //   153: aload #10
    //   155: bipush #23
    //   157: putfield anchor : I
    //   160: aload #10
    //   162: new java/awt/Insets
    //   165: dup
    //   166: iconst_0
    //   167: iconst_5
    //   168: iconst_0
    //   169: iconst_0
    //   170: invokespecial <init> : (IIII)V
    //   173: putfield insets : Ljava/awt/Insets;
    //   176: aload #10
    //   178: dconst_1
    //   179: putfield weightx : D
    //   182: aload_0
    //   183: aload #9
    //   185: aload #10
    //   187: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   190: aload #6
    //   192: ifnull -> 259
    //   195: new java/awt/GridBagConstraints
    //   198: dup
    //   199: invokespecial <init> : ()V
    //   202: astore #9
    //   204: aload #9
    //   206: iload #8
    //   208: iinc #8, 1
    //   211: putfield gridx : I
    //   214: aload #9
    //   216: bipush #22
    //   218: putfield anchor : I
    //   221: aload #9
    //   223: new java/awt/Insets
    //   226: dup
    //   227: iconst_0
    //   228: iconst_5
    //   229: iconst_0
    //   230: iconst_0
    //   231: invokespecial <init> : (IIII)V
    //   234: putfield insets : Ljava/awt/Insets;
    //   237: aload #9
    //   239: iload_3
    //   240: ifeq -> 247
    //   243: dconst_0
    //   244: goto -> 248
    //   247: dconst_1
    //   248: putfield weightx : D
    //   251: aload_0
    //   252: aload #6
    //   254: aload #9
    //   256: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   259: iload #4
    //   261: ifeq -> 372
    //   264: aload_0
    //   265: invokevirtual Zf : ()Lburp/Zm9t;
    //   268: astore #9
    //   270: aload #9
    //   272: sipush #27022
    //   275: sipush #21847
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: invokevirtual setName : (Ljava/lang/String;)V
    //   284: aload #7
    //   286: ifnull -> 303
    //   289: aload #9
    //   291: aload #7
    //   293: invokevirtual ZO : (Lburp/Zlkk;)V
    //   296: aload #9
    //   298: aload #7
    //   300: invokevirtual ZD : (Lburp/Zlkk;)V
    //   303: new java/awt/GridBagConstraints
    //   306: dup
    //   307: invokespecial <init> : ()V
    //   310: astore #10
    //   312: aload #10
    //   314: iload #8
    //   316: iinc #8, 1
    //   319: putfield gridx : I
    //   322: aload #10
    //   324: bipush #22
    //   326: putfield anchor : I
    //   329: aload #10
    //   331: new java/awt/Insets
    //   334: dup
    //   335: iconst_0
    //   336: iconst_5
    //   337: iconst_0
    //   338: iconst_0
    //   339: invokespecial <init> : (IIII)V
    //   342: putfield insets : Ljava/awt/Insets;
    //   345: aload #10
    //   347: aload #6
    //   349: ifnonnull -> 356
    //   352: iload_3
    //   353: ifeq -> 360
    //   356: dconst_0
    //   357: goto -> 361
    //   360: dconst_1
    //   361: putfield weightx : D
    //   364: aload_0
    //   365: aload #9
    //   367: aload #10
    //   369: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   372: iload #5
    //   374: ifeq -> 536
    //   377: new burp/Zm9t
    //   380: dup
    //   381: invokespecial <init> : ()V
    //   384: astore #9
    //   386: aload #9
    //   388: sipush #27020
    //   391: sipush #-16576
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: invokevirtual setName : (Ljava/lang/String;)V
    //   400: aload #9
    //   402: getstatic burp/Zeuf.OPTIONS : Lburp/Zeuf;
    //   405: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   408: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   411: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   414: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   417: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   420: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   423: invokevirtual Z_ : ()Lburp/Ze9n;
    //   426: sipush #27016
    //   429: sipush #22437
    //   432: invokestatic a : (II)Ljava/lang/String;
    //   435: aload_1
    //   436: aload #9
    //   438: <illegal opcode> accept : (Lburp/Zxer;Lburp/Zm9t;)Ljava/util/function/Consumer;
    //   443: invokevirtual ZE : (Lburp/Ze9n;Ljava/lang/String;Ljava/util/function/Consumer;)V
    //   446: aload #7
    //   448: ifnull -> 465
    //   451: aload #9
    //   453: aload #7
    //   455: invokevirtual ZO : (Lburp/Zlkk;)V
    //   458: aload #9
    //   460: aload #7
    //   462: invokevirtual ZD : (Lburp/Zlkk;)V
    //   465: new java/awt/GridBagConstraints
    //   468: dup
    //   469: invokespecial <init> : ()V
    //   472: astore #10
    //   474: aload #10
    //   476: iload #8
    //   478: putfield gridx : I
    //   481: aload #10
    //   483: bipush #22
    //   485: putfield anchor : I
    //   488: aload #10
    //   490: new java/awt/Insets
    //   493: dup
    //   494: iconst_0
    //   495: iconst_5
    //   496: iconst_0
    //   497: iconst_5
    //   498: invokespecial <init> : (IIII)V
    //   501: putfield insets : Ljava/awt/Insets;
    //   504: aload #10
    //   506: aload #6
    //   508: ifnonnull -> 520
    //   511: iload #4
    //   513: ifne -> 520
    //   516: iload_3
    //   517: ifeq -> 524
    //   520: dconst_0
    //   521: goto -> 525
    //   524: dconst_1
    //   525: putfield weightx : D
    //   528: aload_0
    //   529: aload #9
    //   531: aload #10
    //   533: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   536: return
  }
  
  private Zm9t Zf() {
    // Byte code:
    //   0: new burp/Zm9t
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_1
    //   9: getstatic burp/Zeuf.SEARCH : Lburp/Zeuf;
    //   12: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   15: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   18: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   21: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   24: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   27: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   30: invokevirtual Z_ : ()Lburp/Ze9n;
    //   33: sipush #27017
    //   36: sipush #-302
    //   39: invokestatic a : (II)Ljava/lang/String;
    //   42: aload_0
    //   43: aload_1
    //   44: <illegal opcode> run : (Lburp/Zbca;Lburp/Zm9t;)Ljava/lang/Runnable;
    //   49: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   52: aload_1
    //   53: areturn
  }
  
  private void Zh(Component paramComponent) {
    int k;
    Zsos zsos = new Zsos(this.Zb, this.Zi);
    int i = paramComponent.getWidth();
    int j = paramComponent.getHeight();
    Dimension dimension = zsos.ZV();
    switch (this.Zb.getTabPlacement()) {
      default:
        k = -dimension.width + i;
      case 3:
        k = 0;
      case 2:
        k = i;
      case 4:
        k = -dimension.width;
        break;
    } 
    boolean bool = false;
    zsos.Zv(paramComponent, k, bool);
  }
  
  void Zv() {
    Zsos zsos = new Zsos(this.Zb, this.Zi);
    Dimension dimension1 = this.Zb.getSize();
    Dimension dimension2 = zsos.ZV();
    int i = Math.max(0, (dimension1.width - dimension2.width) / 2);
    int j = Math.max(0, (dimension1.height - dimension2.height) / 2);
    zsos.Zv((Component)this.Zb, i, j);
  }
  
  private void lambda$buildSearchButton$1(Zm9t paramZm9t) {
    Zh(paramZm9t);
  }
  
  private static void lambda$new$0(Zxer paramZxer, Zm9t paramZm9t, MouseEvent paramMouseEvent) {
    paramZxer.ZC(paramZm9t, paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ã*}ïç'[jVø­±(´#ãºh³Ms&ºcÙQCk*D×«¹Ì¦I`Ó7\\f3'åô£/è`4QV¿·È]'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
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
    //   64: goto -> 23
    //   67: ldc 'AÉnÔ`âsyý\\fÁÌpKjâNÄ¾ù¤'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #11
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #67
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
    //   128: putstatic burp/Zbca.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbca.b : [Ljava/lang/String;
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
    //   212: bipush #38
    //   214: goto -> 244
    //   217: bipush #76
    //   219: goto -> 244
    //   222: bipush #27
    //   224: goto -> 244
    //   227: bipush #78
    //   229: goto -> 244
    //   232: bipush #34
    //   234: goto -> 244
    //   237: bipush #27
    //   239: goto -> 244
    //   242: bipush #56
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
    int i = (paramInt1 ^ 0x698D) & 0xFFFF;
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
      byte b1 = 1;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbca.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */