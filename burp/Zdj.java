package burp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zkb;
import net.portswigger.Zsy;

public class Zdj implements Zkrr {
  static final List<Zer7> ZY;
  
  private final Ze3n Z_;
  
  private final Zbnt Zv;
  
  private final Zsy Zn;
  
  private final Zsoh Zc;
  
  private Zzhh Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zdj(Ze3n paramZe3n, Zbnt paramZbnt, Zsy paramZsy, Zsoh paramZsoh) {
    this.Z_ = paramZe3n;
    this.Zv = paramZbnt;
    this.Zn = paramZsy;
    this.Zc = paramZsoh;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: iconst_3
    //   1: newarray int
    //   3: dup
    //   4: iconst_0
    //   5: iconst_5
    //   6: iastore
    //   7: dup
    //   8: iconst_1
    //   9: bipush #6
    //   11: iastore
    //   12: dup
    //   13: iconst_2
    //   14: bipush #7
    //   16: iastore
    //   17: astore #4
    //   19: new java/util/concurrent/atomic/AtomicInteger
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #5
    //   28: new burp/Zrqj
    //   31: dup
    //   32: iconst_4
    //   33: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   38: aload_0
    //   39: getfield Z_ : Lburp/Ze3n;
    //   42: aload_0
    //   43: getfield Zv : Lburp/Zbnt;
    //   46: aload_0
    //   47: getfield Zc : Lburp/Zsoh;
    //   50: aload_2
    //   51: aload_3
    //   52: aload_0
    //   53: <illegal opcode> test : (Lburp/Zdj;)Ljava/util/function/Predicate;
    //   58: aload_0
    //   59: <illegal opcode> apply : (Lburp/Zdj;)Ljava/util/function/BiFunction;
    //   64: aload_0
    //   65: aload #4
    //   67: aload #5
    //   69: <illegal opcode> apply : (Lburp/Zdj;[ILjava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Function;
    //   74: aload_0
    //   75: <illegal opcode> apply : (Lburp/Zdj;)Ljava/util/function/BiFunction;
    //   80: invokespecial <init> : (BLjava/util/function/Function;Lburp/Ze3n;Lburp/Zbnt;Lburp/Zsoh;Lburp/Ztpx;Lburp/Zz4_;Ljava/util/function/Predicate;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   83: invokevirtual ZO : ()V
    //   86: return
  }
  
  public Zbsl Zp() {
    return Zbsl.APU_BackupFilesAppendFilename;
  }
  
  public String toString() {
    return Zp().toString();
  }
  
  private byte[] lambda$doCheck$4(String paramString1, String paramString2) {
    return Zkb.Zy(paramString1.substring(0, this.Zz.Zw) + paramString1.substring(0, this.Zz.Zw) + Zrqj.Zi(this.Zz.Zt) + paramString2.replace(" ", a(-5824, 3460)));
  }
  
  private byte[] lambda$doCheck$3(int[] paramArrayOfint, AtomicInteger paramAtomicInteger, String paramString) {
    String str = this.Zn.Zi().Zq().ZK(paramArrayOfint[paramAtomicInteger.getAndIncrement() % paramArrayOfint.length]);
    return Zkb.Zy(paramString.substring(0, this.Zz.Zw) + paramString.substring(0, this.Zz.Zw) + this.Zz.Zt + str);
  }
  
  private byte[] lambda$doCheck$2(String paramString1, String paramString2) {
    return Zkb.Zy(paramString1.substring(0, this.Zz.Zw) + paramString1.substring(0, this.Zz.Zw) + this.Zz.Zt + paramString2.replace(" ", a(-5812, 24834)));
  }
  
  private boolean lambda$doCheck$1(Zzhh paramZzhh) {
    this.Zz = paramZzhh;
    return true;
  }
  
  private static List lambda$doCheck$0(Zlit paramZlit) {
    return ZY;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Æ\\f\\t\\feù·ÞÃò_ñq\\râê\Ö£¶®\\fîÐÀ+>UcPÖÁ\\nnö-´¶©V²ÍìpÄ5¶ÌÅyùÇêIØsY½-Â%Ç/oê8ì&^%Úu;üù1©q$ªÏÒ¹¥ðîÑs¡´ûð'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
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
    //   67: ldc 'a\\rTñFöÛ!Àæ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #54
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
    //   127: putstatic burp/Zdj.a : [Ljava/lang/String;
    //   130: bipush #15
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zdj.b : [Ljava/lang/String;
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
    //   212: bipush #52
    //   214: goto -> 243
    //   217: bipush #59
    //   219: goto -> 243
    //   222: bipush #54
    //   224: goto -> 243
    //   227: iconst_2
    //   228: goto -> 243
    //   231: bipush #77
    //   233: goto -> 243
    //   236: bipush #43
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
    //   300: bipush #6
    //   302: anewarray burp/Zer7
    //   305: dup
    //   306: iconst_0
    //   307: sipush #-5813
    //   310: sipush #6248
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: bipush #6
    //   318: anewarray java/lang/String
    //   321: dup
    //   322: iconst_0
    //   323: sipush #-5811
    //   326: sipush #-32567
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: aastore
    //   333: dup
    //   334: iconst_1
    //   335: sipush #-5809
    //   338: sipush #-1030
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_2
    //   347: sipush #-5814
    //   350: sipush #27526
    //   353: invokestatic a : (II)Ljava/lang/String;
    //   356: aastore
    //   357: dup
    //   358: iconst_3
    //   359: sipush #-5816
    //   362: sipush #26591
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: aastore
    //   369: dup
    //   370: iconst_4
    //   371: sipush #-5815
    //   374: sipush #-31739
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aastore
    //   381: dup
    //   382: iconst_5
    //   383: sipush #-5821
    //   386: sipush #10213
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: aastore
    //   393: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   396: invokestatic ZZ : (Ljava/lang/String;Ljava/util/List;)Lburp/Ziq;
    //   399: aastore
    //   400: dup
    //   401: iconst_1
    //   402: sipush #-5823
    //   405: sipush #15087
    //   408: invokestatic a : (II)Ljava/lang/String;
    //   411: iconst_2
    //   412: anewarray java/lang/String
    //   415: dup
    //   416: iconst_0
    //   417: sipush #-5820
    //   420: sipush #-17100
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: aastore
    //   427: dup
    //   428: iconst_1
    //   429: sipush #-5819
    //   432: sipush #5380
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   442: invokestatic ZZ : (Ljava/lang/String;Ljava/util/List;)Lburp/Ziq;
    //   445: aastore
    //   446: dup
    //   447: iconst_2
    //   448: ldc '1'
    //   450: ldc '2'
    //   452: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   455: invokestatic ZZ : (Ljava/lang/String;Ljava/util/List;)Lburp/Ziq;
    //   458: aastore
    //   459: dup
    //   460: iconst_3
    //   461: sipush #-5818
    //   464: sipush #-32530
    //   467: invokestatic a : (II)Ljava/lang/String;
    //   470: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   473: aastore
    //   474: dup
    //   475: iconst_4
    //   476: sipush #-5817
    //   479: sipush #15331
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   488: aastore
    //   489: dup
    //   490: iconst_5
    //   491: sipush #-5810
    //   494: sipush #12748
    //   497: invokestatic a : (II)Ljava/lang/String;
    //   500: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   503: aastore
    //   504: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   507: putstatic burp/Zdj.ZY : Ljava/util/List;
    //   510: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE94D) & 0xFFFF;
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
      byte b1 = 23;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */