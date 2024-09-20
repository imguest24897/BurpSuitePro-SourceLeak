package burp;

import java.util.List;

public class Zmms extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZH : ()[I
    //   3: astore #11
    //   5: aload #5
    //   7: invokevirtual Zt : ()Lburp/Zt38;
    //   10: invokeinterface ZCr : ()Lburp/Zefg;
    //   15: astore #12
    //   17: aload #12
    //   19: ifnonnull -> 31
    //   22: iconst_0
    //   23: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   26: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   29: aconst_null
    //   30: areturn
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore #13
    //   40: aload #4
    //   42: invokevirtual Zm : ()Lburp/Zlt9;
    //   45: getstatic burp/Zlt9.MERGE_MULTIPLE_IDENTIFIERS : Lburp/Zlt9;
    //   48: if_acmpne -> 71
    //   51: aload #13
    //   53: sipush #-13819
    //   56: sipush #19906
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload #11
    //   68: ifnonnull -> 189
    //   71: aload #4
    //   73: invokevirtual Zm : ()Lburp/Zlt9;
    //   76: getstatic burp/Zlt9.MERGE_SINGLE_IDENTIFIER : Lburp/Zlt9;
    //   79: if_acmpne -> 102
    //   82: aload #13
    //   84: sipush #-13817
    //   87: sipush #-13198
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #11
    //   99: ifnonnull -> 189
    //   102: aload #13
    //   104: sipush #-13811
    //   107: sipush #11721
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload #13
    //   119: new burp/Zax
    //   122: dup
    //   123: aload #7
    //   125: aload #8
    //   127: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   136: aload #13
    //   138: sipush #-13812
    //   141: sipush #11449
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload #13
    //   153: aload #12
    //   155: invokeinterface size : ()I
    //   160: iconst_1
    //   161: if_icmpne -> 176
    //   164: sipush #-13814
    //   167: sipush #-20294
    //   170: invokestatic a : (II)Ljava/lang/String;
    //   173: goto -> 185
    //   176: sipush #-13824
    //   179: sipush #-4172
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload #12
    //   191: invokeinterface iterator : ()Ljava/util/Iterator;
    //   196: astore #14
    //   198: aload #14
    //   200: invokeinterface hasNext : ()Z
    //   205: ifeq -> 267
    //   208: aload #14
    //   210: invokeinterface next : ()Ljava/lang/Object;
    //   215: checkcast burp/Zsdr
    //   218: astore #15
    //   220: aload #13
    //   222: sipush #-13820
    //   225: sipush #-18396
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload #13
    //   237: aload #15
    //   239: invokeinterface toString : ()Ljava/lang/String;
    //   244: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   247: aload #13
    //   249: sipush #-13816
    //   252: sipush #16865
    //   255: invokestatic a : (II)Ljava/lang/String;
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: aload #11
    //   264: ifnonnull -> 198
    //   267: aload #13
    //   269: sipush #-13813
    //   272: sipush #15479
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: pop
    //   282: aload #13
    //   284: aload #4
    //   286: aload #5
    //   288: sipush #-13815
    //   291: sipush #8151
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: invokestatic ZE : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;Ljava/lang/String;)V
    //   300: aload #13
    //   302: invokevirtual toString : ()Ljava/lang/String;
    //   305: areturn
  }
  
  public String Z_(List<Zrdb> paramList) {
    // Byte code:
    //   0: new java/util/TreeSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZH : ()[I
    //   11: aload_1
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore #4
    //   19: astore_2
    //   20: aload #4
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 124
    //   30: aload #4
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zrdb
    //   40: astore #5
    //   42: aload #5
    //   44: invokeinterface Za7 : ()Lburp/Ztub;
    //   49: invokevirtual Zt : ()Lburp/Zt38;
    //   52: invokeinterface ZCr : ()Lburp/Zefg;
    //   57: astore #6
    //   59: aload #6
    //   61: ifnonnull -> 73
    //   64: iconst_0
    //   65: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   68: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   71: aconst_null
    //   72: areturn
    //   73: aload #6
    //   75: invokeinterface iterator : ()Ljava/util/Iterator;
    //   80: astore #7
    //   82: aload #7
    //   84: invokeinterface hasNext : ()Z
    //   89: ifeq -> 120
    //   92: aload #7
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: checkcast burp/Zsdr
    //   102: astore #8
    //   104: aload_3
    //   105: aload #8
    //   107: invokeinterface toString : ()Ljava/lang/String;
    //   112: invokevirtual add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: aload_2
    //   117: ifnonnull -> 82
    //   120: aload_2
    //   121: ifnonnull -> 20
    //   124: new java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial <init> : ()V
    //   131: astore #4
    //   133: aload #4
    //   135: aload_1
    //   136: invokeinterface size : ()I
    //   141: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload #4
    //   147: sipush #-13823
    //   150: sipush #-6669
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload_3
    //   161: invokevirtual size : ()I
    //   164: istore #5
    //   166: iload #5
    //   168: iconst_1
    //   169: if_icmpne -> 191
    //   172: aload #4
    //   174: sipush #-13809
    //   177: sipush #23798
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_2
    //   188: ifnonnull -> 214
    //   191: aload #4
    //   193: iload #5
    //   195: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload #4
    //   201: sipush #-13810
    //   204: sipush #24504
    //   207: invokestatic a : (II)Ljava/lang/String;
    //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: aload_3
    //   215: invokevirtual iterator : ()Ljava/util/Iterator;
    //   218: astore #6
    //   220: aload #6
    //   222: invokeinterface hasNext : ()Z
    //   227: ifeq -> 283
    //   230: aload #6
    //   232: invokeinterface next : ()Ljava/lang/Object;
    //   237: checkcast java/lang/String
    //   240: astore #7
    //   242: aload #4
    //   244: sipush #-13822
    //   247: sipush #-15236
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: aload #4
    //   259: aload #7
    //   261: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   264: aload #4
    //   266: sipush #-13818
    //   269: sipush #12198
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: pop
    //   279: aload_2
    //   280: ifnonnull -> 220
    //   283: aload #4
    //   285: sipush #-13821
    //   288: sipush #25292
    //   291: invokestatic a : (II)Ljava/lang/String;
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: aload #4
    //   300: invokevirtual toString : ()Ljava/lang/String;
    //   303: invokestatic Zwu : ()[Lburp/Zbqc;
    //   306: ifnonnull -> 315
    //   309: iconst_1
    //   310: newarray int
    //   312: invokestatic ZJ : ([I)V
    //   315: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '+g¹æ5çzÕV½dÉã2BëbÉF^\\r\\n<Âã²RÒÌM³ÏëÊâÿrÝ&µÒl..Ý:×.\\b»®½i^Ö"¾â<$fz³-(p°ßUâ¦^qã>¤Sõt_ìz#ýG§ÅÖs2õj36íÔùF_ÛÊ`·s\\rwüU}ð²¨[¯B©OãóßðtÈÛ(¦².^O···*j)ûµo4¢oßñgÍÅB,¿|oü%^M¯6£¨zEÓGRNA¿´öÛ¢h.l(íné¶$1+ád3áñ,üë·Û\\në\\rí{4×H}\\t?©6ÙÔP³Ác\\bRÆØáá¢É]*;mb²/OõWËß-@7F`X%n÷¿Ó¡¦Niã{9ñ[2D{*ÇÉ~ùüÚÒ?bÌ¦*5»pk0Ò±Â`&æenºQ@@x|ÀâÏæv ;³77nÚÒáªÁvå}Öaóý7\\bbfHYi@wH3ØfáÑ£BÛír»uZÛÞl¾4Ý1'ÙÇG¡ZimB°ñ¬¨EG±§xrRN?Ë`mCQ­Û ´ÈWðö0dæÚ*YZÂv/TÙ<èVN¢'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'îúlfï/;j¬ÜsàºìÖC]Jí Óc5®¦SÖ°0zCÐQª9eIV7¾âËÝÑôEyÙ g´üHó Ú5éO"vÍEqîG³9)i!1bÖ~:AhÜ/õUB'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #90
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
    //   128: putstatic burp/Zmms.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmms.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #101
    //   214: goto -> 243
    //   217: bipush #54
    //   219: goto -> 243
    //   222: bipush #72
    //   224: goto -> 243
    //   227: bipush #84
    //   229: goto -> 243
    //   232: bipush #63
    //   234: goto -> 243
    //   237: iconst_4
    //   238: goto -> 243
    //   241: bipush #90
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
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCA0A) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmms.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */