package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.List;

class Zmtj implements Zsh3<Zzh2>, Zzyl {
  private final Zzp8<Zzh2> Z_;
  
  private final Zze3<Zzh2> Zn;
  
  private final Zgso ZR;
  
  private final Zerg ZD;
  
  private final Zbp5 ZU;
  
  private final Zm6x Zp;
  
  private List<Zzh2> ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmtj(Zzp8<Zzh2> paramZzp8, Zze3<Zzh2> paramZze3, Zbnt paramZbnt, Zkl6 paramZkl6, Zerg paramZerg, Zbp5 paramZbp5, Zm6x paramZm6x) {
    this.Z_ = paramZzp8;
    this.Zn = paramZze3;
    this.ZD = paramZerg;
    this.ZU = paramZbp5;
    this.Zp = paramZm6x;
    this.ZR = new Zgso(paramZbnt, paramZkl6, paramZerg, Zeew.PROXY, new Zsai(), paramZm6x);
  }
  
  public void ZK(List<Zzh2> paramList, InputEvent paramInputEvent, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: invokestatic Zp6 : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnull -> 18
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 19
    //   18: return
    //   19: new burp/Zb_g
    //   22: dup
    //   23: aload_0
    //   24: getfield Z_ : Lburp/Zzp8;
    //   27: aload_1
    //   28: aload #4
    //   30: invokespecial <init> : (Lburp/Zzp8;Ljava/util/List;Ljava/awt/Point;)V
    //   33: astore #6
    //   35: aload_0
    //   36: aload_1
    //   37: putfield ZI : Ljava/util/List;
    //   40: aload_1
    //   41: iconst_0
    //   42: invokeinterface get : (I)Ljava/lang/Object;
    //   47: checkcast burp/Zzh2
    //   50: astore #7
    //   52: aload_1
    //   53: invokeinterface size : ()I
    //   58: istore #8
    //   60: iload #8
    //   62: iconst_1
    //   63: if_icmple -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: istore #9
    //   73: iload #9
    //   75: ifne -> 84
    //   78: aload #7
    //   80: ifnonnull -> 84
    //   83: return
    //   84: aload_0
    //   85: getfield Zn : Lburp/Zze3;
    //   88: aload #7
    //   90: invokeinterface ZR : (Lburp/Zmw9;)Lburp/Zlit;
    //   95: astore #10
    //   97: iload #9
    //   99: ifeq -> 110
    //   102: iload #8
    //   104: invokestatic ZA : (I)Lburp/Zkj9;
    //   107: goto -> 118
    //   110: aload #10
    //   112: invokestatic ZD : (Lburp/Zlit;)Ljava/lang/String;
    //   115: invokestatic ZR : (Ljava/lang/String;)Lburp/Zkj9;
    //   118: astore #11
    //   120: iload #9
    //   122: ifne -> 147
    //   125: aload #11
    //   127: aload #6
    //   129: ldc 131328
    //   131: sipush #12545
    //   134: sipush #-22584
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   143: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   146: pop
    //   147: aload #11
    //   149: aload #6
    //   151: ldc 132672
    //   153: sipush #12547
    //   156: sipush #-702
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   165: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   168: pop
    //   169: aload #11
    //   171: aload #6
    //   173: ldc 524800
    //   175: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   178: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   181: pop
    //   182: aload_0
    //   183: getfield ZD : Lburp/Zerg;
    //   186: invokevirtual ZM : ()Lburp/Zgvn;
    //   189: invokeinterface ZY : ()Ljava/util/List;
    //   194: astore #12
    //   196: aload #12
    //   198: ifnull -> 286
    //   201: aload_0
    //   202: getfield ZR : Lburp/Zgso;
    //   205: getstatic burp/Zrpb.CONTEXT_WS_HISTORY : Lburp/Zrpb;
    //   208: aload_2
    //   209: aload_1
    //   210: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   215: aload_0
    //   216: <illegal opcode> apply : (Lburp/Zmtj;)Ljava/util/function/Function;
    //   221: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   226: invokestatic toList : ()Ljava/util/stream/Collector;
    //   229: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   234: checkcast java/util/List
    //   237: invokevirtual ZW : (Lburp/Zrpb;Ljava/awt/event/InputEvent;Ljava/util/List;)Ljava/util/List;
    //   240: astore #13
    //   242: aload #13
    //   244: invokeinterface iterator : ()Ljava/util/Iterator;
    //   249: astore #14
    //   251: aload #14
    //   253: invokeinterface hasNext : ()Z
    //   258: ifeq -> 286
    //   261: aload #14
    //   263: invokeinterface next : ()Ljava/lang/Object;
    //   268: checkcast java/awt/Component
    //   271: astore #15
    //   273: aload #11
    //   275: aload #15
    //   277: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   280: pop
    //   281: aload #5
    //   283: ifnonnull -> 251
    //   286: aload #11
    //   288: new javax/swing/JSeparator
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   298: pop
    //   299: aload #10
    //   301: invokeinterface Zdz : ()Lburp/Zmzk;
    //   306: aload #11
    //   308: aload #6
    //   310: invokestatic ZL : (Lburp/Zmzk;Lburp/Zkj9;Lburp/Zzyl;)V
    //   313: iload #9
    //   315: ifeq -> 345
    //   318: aload #11
    //   320: aload #6
    //   322: ldc 134656
    //   324: sipush #12544
    //   327: sipush #16347
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   336: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   339: pop
    //   340: aload #5
    //   342: ifnonnull -> 367
    //   345: aload #11
    //   347: aload #6
    //   349: ldc 134656
    //   351: sipush #12549
    //   354: sipush #12699
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   363: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   366: pop
    //   367: aload #11
    //   369: aload #6
    //   371: ldc 525056
    //   373: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   376: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   379: pop
    //   380: iload #9
    //   382: ifeq -> 412
    //   385: aload #11
    //   387: aload #6
    //   389: ldc 134400
    //   391: sipush #12548
    //   394: sipush #28129
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   403: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   406: pop
    //   407: aload #5
    //   409: ifnonnull -> 425
    //   412: aload #11
    //   414: aload #6
    //   416: ldc 134400
    //   418: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   421: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   424: pop
    //   425: aload #11
    //   427: new javax/swing/JSeparator
    //   430: dup
    //   431: invokespecial <init> : ()V
    //   434: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   437: pop
    //   438: aload #11
    //   440: new burp/Zepa
    //   443: dup
    //   444: sipush #12546
    //   447: sipush #-13517
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: getstatic burp/Zk97.DESKTOP_TOOLS_PROXY_HISTORY : Lburp/Zk97;
    //   456: aload_3
    //   457: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   460: invokespecial <init> : (Ljava/lang/String;Lburp/Zk97;Ljava/awt/Window;)V
    //   463: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   466: pop
    //   467: aload #11
    //   469: aload_3
    //   470: aload #4
    //   472: getfield x : I
    //   475: aload #4
    //   477: getfield y : I
    //   480: invokevirtual show : (Ljava/awt/Component;II)V
    //   483: return
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.Z_.Zd(paramInt, this.ZI, null);
  }
  
  private Zmp4 lambda$showPopup$0(Zzh2 paramZzh2) {
    return new Zmp4(paramZzh2, this.ZU, this.Zp);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'óð)¯¯.{Ù.ô`0!z`ûbßGgõ¦PY{ ä\\bfËéøÊ7ÌA.ÏeÔwãÉÂ£Ä\\b[Õ^Y9Í ë$¨_,:,\\r»Hy¬l'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
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
    //   68: ldc ':uÞ~·¼;2O\\t©ÂP6î½'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #47
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
    //   129: putstatic burp/Zmtj.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmtj.b : [Ljava/lang/String;
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
    //   212: bipush #39
    //   214: goto -> 243
    //   217: bipush #51
    //   219: goto -> 243
    //   222: bipush #23
    //   224: goto -> 243
    //   227: bipush #50
    //   229: goto -> 243
    //   232: bipush #24
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #96
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
    int i = (paramInt1 ^ 0x3101) & 0xFFFF;
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
      char c = 'Ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmtj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */