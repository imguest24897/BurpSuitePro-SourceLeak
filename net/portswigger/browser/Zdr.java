package net.portswigger.browser;

import java.util.Map;
import net.portswigger.Zd4;
import net.portswigger.Zfb;
import net.portswigger.Zi7;
import net.portswigger.Zv3;

public final class Zdr implements Zer {
  public static final Zdr ZR;
  
  private final Zj5 Zv;
  
  private final Map<Integer, Zx> ZE;
  
  private final Map<Integer, Ze2> ZG;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private Zdr(Zj5 paramZj5, Map<Integer, Zx> paramMap, Map<Integer, Ze2> paramMap1) {
    this.Zv = paramZj5;
    this.ZE = paramMap;
    this.ZG = paramMap1;
  }
  
  public Zdr(Zi7 paramZi7) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokestatic ZJ : (Lnet/portswigger/Zi7;)Lnet/portswigger/browser/Zj5;
    //   9: putfield Zv : Lnet/portswigger/browser/Zj5;
    //   12: aload_0
    //   13: new java/util/HashMap
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: putfield ZE : Ljava/util/Map;
    //   23: invokestatic ZZ : ()Ljava/lang/String;
    //   26: aload_0
    //   27: new java/util/HashMap
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: putfield ZG : Ljava/util/Map;
    //   37: astore_2
    //   38: aload_1
    //   39: sipush #-839
    //   42: sipush #18093
    //   45: invokestatic b : (II)Ljava/lang/String;
    //   48: invokeinterface Zm : (Ljava/lang/String;)Z
    //   53: ifeq -> 88
    //   56: aload_1
    //   57: sipush #-841
    //   60: sipush #25115
    //   63: invokestatic b : (II)Ljava/lang/String;
    //   66: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   71: invokeinterface ZT : ()Lnet/portswigger/Zfb;
    //   76: invokeinterface Zs : ()Ljava/util/Iterator;
    //   81: goto -> 91
    //   84: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   87: athrow
    //   88: invokestatic emptyIterator : ()Ljava/util/Iterator;
    //   91: astore_3
    //   92: aload_3
    //   93: invokeinterface hasNext : ()Z
    //   98: ifeq -> 295
    //   101: aload_3
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast net/portswigger/Zrmq
    //   110: invokeinterface Zu : ()Lnet/portswigger/Zi7;
    //   115: astore #4
    //   117: aload #4
    //   119: sipush #-860
    //   122: sipush #-20560
    //   125: invokestatic b : (II)Ljava/lang/String;
    //   128: invokeinterface Zm : (Ljava/lang/String;)Z
    //   133: ifeq -> 291
    //   136: aload #4
    //   138: sipush #-838
    //   141: sipush #-31833
    //   144: invokestatic b : (II)Ljava/lang/String;
    //   147: invokeinterface Zm : (Ljava/lang/String;)Z
    //   152: ifeq -> 250
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   161: athrow
    //   162: aload #4
    //   164: sipush #-835
    //   167: sipush #-14607
    //   170: invokestatic b : (II)Ljava/lang/String;
    //   173: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   178: sipush #-833
    //   181: sipush #1600
    //   184: invokestatic b : (II)Ljava/lang/String;
    //   187: invokeinterface Zm : (Ljava/lang/String;)Z
    //   192: ifeq -> 250
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   201: athrow
    //   202: new net/portswigger/browser/Zx
    //   205: dup
    //   206: aload #4
    //   208: sipush #-835
    //   211: sipush #-14607
    //   214: invokestatic b : (II)Ljava/lang/String;
    //   217: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   222: sipush #-846
    //   225: sipush #14746
    //   228: invokestatic b : (II)Ljava/lang/String;
    //   231: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   236: invokeinterface ZW : ()Ljava/lang/String;
    //   241: invokespecial <init> : (Ljava/lang/String;)V
    //   244: astore #5
    //   246: aload_2
    //   247: ifnonnull -> 255
    //   250: getstatic net/portswigger/browser/Zx.ZL : Lnet/portswigger/browser/Zx;
    //   253: astore #5
    //   255: aload_0
    //   256: getfield ZE : Ljava/util/Map;
    //   259: aload #4
    //   261: sipush #-844
    //   264: sipush #29081
    //   267: invokestatic b : (II)Ljava/lang/String;
    //   270: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   275: invokeinterface ZR : ()I
    //   280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   283: aload #5
    //   285: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   290: pop
    //   291: aload_2
    //   292: ifnonnull -> 92
    //   295: aload_1
    //   296: sipush #-848
    //   299: sipush #-21108
    //   302: invokestatic b : (II)Ljava/lang/String;
    //   305: invokeinterface Zm : (Ljava/lang/String;)Z
    //   310: ifeq -> 345
    //   313: aload_1
    //   314: sipush #-843
    //   317: sipush #-8805
    //   320: invokestatic b : (II)Ljava/lang/String;
    //   323: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   328: invokeinterface ZT : ()Lnet/portswigger/Zfb;
    //   333: invokeinterface Zs : ()Ljava/util/Iterator;
    //   338: goto -> 348
    //   341: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   344: athrow
    //   345: invokestatic emptyIterator : ()Ljava/util/Iterator;
    //   348: astore #4
    //   350: aload #4
    //   352: invokeinterface hasNext : ()Z
    //   357: ifeq -> 555
    //   360: aload #4
    //   362: invokeinterface next : ()Ljava/lang/Object;
    //   367: checkcast net/portswigger/Zrmq
    //   370: invokeinterface Zu : ()Lnet/portswigger/Zi7;
    //   375: astore #5
    //   377: aload #5
    //   379: sipush #-842
    //   382: sipush #4925
    //   385: invokestatic b : (II)Ljava/lang/String;
    //   388: invokeinterface Zm : (Ljava/lang/String;)Z
    //   393: ifeq -> 551
    //   396: aload #5
    //   398: sipush #-835
    //   401: sipush #-14607
    //   404: invokestatic b : (II)Ljava/lang/String;
    //   407: invokeinterface Zm : (Ljava/lang/String;)Z
    //   412: ifeq -> 510
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   421: athrow
    //   422: aload #5
    //   424: sipush #-835
    //   427: sipush #-14607
    //   430: invokestatic b : (II)Ljava/lang/String;
    //   433: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   438: sipush #-836
    //   441: sipush #-9892
    //   444: invokestatic b : (II)Ljava/lang/String;
    //   447: invokeinterface Zm : (Ljava/lang/String;)Z
    //   452: ifeq -> 510
    //   455: goto -> 462
    //   458: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   461: athrow
    //   462: new net/portswigger/browser/Ze2
    //   465: dup
    //   466: aload #5
    //   468: sipush #-835
    //   471: sipush #-14607
    //   474: invokestatic b : (II)Ljava/lang/String;
    //   477: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   482: sipush #-840
    //   485: sipush #30394
    //   488: invokestatic b : (II)Ljava/lang/String;
    //   491: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   496: invokeinterface ZW : ()Ljava/lang/String;
    //   501: invokespecial <init> : (Ljava/lang/String;)V
    //   504: astore #6
    //   506: aload_2
    //   507: ifnonnull -> 515
    //   510: getstatic net/portswigger/browser/Ze2.Zj : Lnet/portswigger/browser/Ze2;
    //   513: astore #6
    //   515: aload_0
    //   516: getfield ZG : Ljava/util/Map;
    //   519: aload #5
    //   521: sipush #-837
    //   524: sipush #31354
    //   527: invokestatic b : (II)Ljava/lang/String;
    //   530: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   535: invokeinterface ZR : ()I
    //   540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   543: aload #6
    //   545: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   550: pop
    //   551: aload_2
    //   552: ifnonnull -> 350
    //   555: return
    // Exception table:
    //   from	to	target	type
    //   38	84	84	java/lang/IllegalArgumentException
    //   117	155	158	java/lang/IllegalArgumentException
    //   136	195	198	java/lang/IllegalArgumentException
    //   295	341	341	java/lang/IllegalArgumentException
    //   377	415	418	java/lang/IllegalArgumentException
    //   396	455	458	java/lang/IllegalArgumentException
  }
  
  public Zj5 ZY() {
    return this.Zv;
  }
  
  public Zx ZB(int paramInt) {
    try {
      if (paramInt == 0)
        return Zx.ZL; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx zx = this.ZE.get(Integer.valueOf(paramInt));
    try {
      if (zx == null)
        throw new IllegalArgumentException(String.format(b(-847, -18404), new Object[] { Integer.valueOf(paramInt) })); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zx;
  }
  
  public Zi7 ZA(Zi7 paramZi7) {
    paramZi7.Zg(b(-834, -19363), Zd3.META_DATA.jsonName);
    this.Zv.ZI(paramZi7);
    Zfb zfb1 = Zv3.ZG();
    this.ZE.forEach(zfb1::lambda$buildJson$0);
    Zfb zfb2 = Zv3.ZG();
    this.ZG.forEach(zfb2::lambda$buildJson$1);
    paramZi7.ZN(b(-841, 25115), (Zd4)zfb1);
    paramZi7.ZN(b(-843, -8805), (Zd4)zfb2);
    return paramZi7;
  }
  
  public String toString() {
    return b(-845, -16061);
  }
  
  private static void lambda$buildJson$1(Zfb paramZfb, Integer paramInteger, Ze2 paramZe2) {
    Zi7 zi71 = Zv3.ZU();
    zi71.Zy(b(-837, 31354), paramInteger.intValue());
    Zi7 zi72 = Zv3.ZU();
    zi72.Zg(b(-840, 30394), paramZe2.ZR());
    zi71.ZN(b(-835, -14607), (Zd4)zi72);
    paramZfb.Zh((Zd4)zi71);
  }
  
  private static void lambda$buildJson$0(Zfb paramZfb, Integer paramInteger, Zx paramZx) {
    Zi7 zi71 = Zv3.ZU();
    zi71.Zy(b(-844, 29081), paramInteger.intValue());
    Zi7 zi72 = Zv3.ZU();
    zi72.Zg(b(-846, 14746), paramZx.ZC());
    zi71.ZN(b(-835, -14607), (Zd4)zi72);
    paramZfb.Zh((Zd4)zi71);
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Dðe¯¸÷&p?/þ-u:.E·µòb+,èL¡aÒyc0(~->Tnóa­âXLÅ u±ÔÝ+xÐâlJ´þlÐZ\\b>þr28P>\\bPþ{£tf¨J\\n/ñ&þÀ@WÕÊ\\ti(,ë(P¾Zp#Ù\\bÁI­2§`rßUd*7Ì\\n¶cF¯\\bñq'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_1
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
    //   64: goto -> 23
    //   67: ldc ' ©z%\\tr{s*JÉ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #112
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
    //   127: putstatic net/portswigger/browser/Zdr.c : [Ljava/lang/String;
    //   130: bipush #17
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/browser/Zdr.d : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #87
    //   214: goto -> 243
    //   217: bipush #75
    //   219: goto -> 243
    //   222: bipush #98
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #62
    //   233: goto -> 243
    //   236: bipush #27
    //   238: goto -> 243
    //   241: bipush #72
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: new net/portswigger/browser/Zdr
    //   303: dup
    //   304: getstatic net/portswigger/browser/Zj5.Zc : Lnet/portswigger/browser/Zj5;
    //   307: invokestatic emptyMap : ()Ljava/util/Map;
    //   310: invokestatic emptyMap : ()Ljava/util/Map;
    //   313: invokespecial <init> : (Lnet/portswigger/browser/Zj5;Ljava/util/Map;Ljava/util/Map;)V
    //   316: putstatic net/portswigger/browser/Zdr.ZR : Lnet/portswigger/browser/Zdr;
    //   319: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFCB4) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = '²';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */