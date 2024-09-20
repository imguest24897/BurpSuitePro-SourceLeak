package burp;

import java.util.List;

public class Ztbc implements Zr9 {
  private final Zbnt Zu;
  
  private final Zzw2 ZI;
  
  private final Zm6e Zn;
  
  private final Zey9 Zq;
  
  private final String Zs;
  
  private static boolean Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztbc(Zbnt paramZbnt, Zkl6 paramZkl6, Zzw2 paramZzw2, String paramString) {
    this.Zu = paramZbnt;
    boolean bool = Zj();
    this.ZI = paramZzw2;
    this.Zs = paramString;
    this.Zn = paramZkl6.Zs();
    this.Zq = paramZkl6.ZH();
    if (Zbqc.Zwu() == null)
      ZD(!bool); 
  }
  
  public void Zy(List<Zsdt> paramList) {
    // Byte code:
    //   0: new burp/Zax
    //   3: dup
    //   4: new java/net/URL
    //   7: dup
    //   8: sipush #21273
    //   11: sipush #-29840
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield Zu : Lburp/Zbnt;
    //   24: invokespecial <init> : (Ljava/net/URL;Lburp/Zbnt;)V
    //   27: astore_2
    //   28: new burp/Ztc5
    //   31: dup
    //   32: aload_0
    //   33: getfield Zs : Ljava/lang/String;
    //   36: aload_1
    //   37: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
    //   40: invokevirtual Zd : ()Ljava/lang/String;
    //   43: invokestatic Za : (Ljava/lang/String;)Lburp/Zyf;
    //   46: astore_3
    //   47: aload_0
    //   48: getfield Zn : Lburp/Zm6e;
    //   51: invokeinterface ZO : ()Lburp/Ztom;
    //   56: getstatic burp/Zsss.POST : Lburp/Zsss;
    //   59: invokevirtual Zj : (Lburp/Zde;)Lburp/Ztom;
    //   62: aload_2
    //   63: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   66: getstatic burp/Zxk3.HTTP_V11 : Lburp/Zxk3;
    //   69: invokevirtual ZK : (Lburp/Zxk3;)Lburp/Ztom;
    //   72: sipush #21272
    //   75: sipush #-10447
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokevirtual Zw : (Ljava/lang/String;)Lburp/Ztom;
    //   84: new burp/Ztnz
    //   87: dup
    //   88: sipush #21275
    //   91: sipush #-7633
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: sipush #21274
    //   100: sipush #-2999
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   109: invokestatic of : (Ljava/lang/Object;)Ljava/util/List;
    //   112: invokevirtual Zl : (Ljava/util/List;)Lburp/Ztom;
    //   115: aload_3
    //   116: invokevirtual ZZ : (Lburp/Zstu;)Lburp/Ztom;
    //   119: invokevirtual Zr : ()Lburp/Zstu;
    //   122: astore #4
    //   124: aload_0
    //   125: getfield Zq : Lburp/Zey9;
    //   128: aload_2
    //   129: invokeinterface Zdz : ()Lburp/Zmzk;
    //   134: aload #4
    //   136: invokevirtual Zu : (Lburp/Zmzk;Lburp/Zstu;)Lburp/Zefx;
    //   139: astore #5
    //   141: aload_0
    //   142: getfield ZI : Lburp/Zzw2;
    //   145: aload #5
    //   147: invokevirtual Zj : (Lburp/Zefx;)Lburp/Zg3d;
    //   150: astore #6
    //   152: aload #6
    //   154: invokeinterface Zb : ()Lburp/Zvom;
    //   159: getstatic burp/Zvom.RESPONSE_RECEIVED : Lburp/Zvom;
    //   162: if_acmpne -> 198
    //   165: aload #6
    //   167: invokeinterface Ze : ()Lburp/Zb6q;
    //   172: invokeinterface Ze : ()S
    //   177: sipush #200
    //   180: if_icmpne -> 198
    //   183: goto -> 190
    //   186: invokestatic a : (Lburp/Zxgy;)Lburp/Zxgy;
    //   189: athrow
    //   190: iconst_1
    //   191: goto -> 199
    //   194: invokestatic a : (Lburp/Zxgy;)Lburp/Zxgy;
    //   197: athrow
    //   198: iconst_0
    //   199: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   202: aload #6
    //   204: invokeinterface Zb : ()Lburp/Zvom;
    //   209: getstatic burp/Zvom.RESPONSE_RECEIVED : Lburp/Zvom;
    //   212: if_acmpne -> 249
    //   215: aload #6
    //   217: invokeinterface Ze : ()Lburp/Zb6q;
    //   222: invokeinterface Ze : ()S
    //   227: sipush #21279
    //   230: sipush #23516
    //   233: invokestatic a : (II)Ljava/lang/String;
    //   236: swap
    //   237: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;S)Ljava/lang/String;
    //   242: goto -> 259
    //   245: invokestatic a : (Lburp/Zxgy;)Lburp/Zxgy;
    //   248: athrow
    //   249: aload #6
    //   251: invokeinterface Zb : ()Lburp/Zvom;
    //   256: invokevirtual toString : ()Ljava/lang/String;
    //   259: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   262: goto -> 273
    //   265: astore_2
    //   266: aload_2
    //   267: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   270: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   273: return
    // Exception table:
    //   from	to	target	type
    //   0	262	265	burp/Zxgy
    //   0	262	265	burp/Zxg5
    //   0	262	265	java/net/MalformedURLException
    //   152	183	186	burp/Zxgy
    //   165	194	194	burp/Zxgy
    //   199	245	245	burp/Zxgy
  }
  
  public static void ZD(boolean paramBoolean) {
    Zb = paramBoolean;
  }
  
  public static boolean Zj() {
    return Zb;
  }
  
  public static boolean Zh() {
    boolean bool = Zj();
    return !bool;
  }
  
  private static Zxgy a(Zxgy paramZxgy) {
    return paramZxgy;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_1
    //   9: ldc '«FUÞ4Ñ.Ñ©b¹ëJC\SjgÇ3ÌíÖ°UPóÅ8ì ßxáR¹âz\\bÂlÏ%c\á{¬a¾Ë'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: invokestatic ZD : (Z)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #67
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 144
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'ögóìS® M3IùÚì ÷3\IöUNøúÆþÍ}='
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_5
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #74
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 144
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Ztbc.a : [Ljava/lang/String;
    //   134: iconst_5
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Ztbc.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #8
    //   214: goto -> 244
    //   217: bipush #60
    //   219: goto -> 244
    //   222: bipush #79
    //   224: goto -> 244
    //   227: bipush #22
    //   229: goto -> 244
    //   232: bipush #32
    //   234: goto -> 244
    //   237: bipush #51
    //   239: goto -> 244
    //   242: bipush #119
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 43, 0 -> 101
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x531B) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztbc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */