package net.portswigger;

import burp.Zbqc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Zoy implements Znw, Zf2 {
  private final Zml Zj;
  
  private final Set<String> ZT = new HashSet<>();
  
  private final Set<String> Zx = new HashSet<>();
  
  private final Set<Zip> Zz;
  
  private Map<Zfp, Long> ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zoy(Zml paramZml) {
    int i = Zm2.Zx();
    try {
      this.Zz = new HashSet<>();
      this.ZU = new HashMap<>();
      if (paramZml == null)
        throw new IllegalArgumentException(a(1072, 30557)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zj = paramZml;
      paramZml.Zs(this);
      if (i == 0)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zz(Zgl paramZgl, String paramString) {
    try {
      if (this.ZT.contains(paramString))
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zj.Z_((new Zcw(Zl9.TELEMETRY, 0)).Zh(a(1077, -20508), Zgi.BAPP.name()).Zs(paramZgl).ZN(paramString).ZV());
    this.ZT.add(paramString);
  }
  
  public void ZR(Zgl paramZgl, String paramString) {
    try {
      if (this.Zx.contains(paramString))
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zj.Z_((new Zcw(Zl9.TELEMETRY, 0)).Zh(a(1077, -20508), Zgi.EXTENDER_API_USAGE.name()).ZN(paramString).Zs(paramZgl).ZV());
    this.Zx.add(paramString);
  }
  
  public void ZN(Zgl paramZgl, Zzr paramZzr, long paramLong) {
    this.Zj.Z_((new Zcw(Zl9.TELEMETRY, 0)).Zh(a(1076, -11522), Zgi.QUANTITY.name()).Zh(a(1079, 1001), paramZzr.name()).ZN(Long.toString(paramLong)).Zs(paramZgl).ZV());
  }
  
  public void ZU(Zgl paramZgl, Zip paramZip) {
    try {
      if (this.Zz.contains(paramZip))
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zj.Z_((new Zcw(Zl9.TELEMETRY, 0)).Zh(a(1077, -20508), Zgi.FEATURE_USE.name()).Zh(a(1075, 13847), paramZip.name()).Zs(paramZgl).ZV());
    this.Zz.add(paramZip);
  }
  
  public void Zj(Zfp paramZfp) {
    // Byte code:
    //   0: invokestatic Zx : ()I
    //   3: aload_0
    //   4: getfield ZU : Ljava/util/Map;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: istore_2
    //   11: aload_0
    //   12: getfield ZU : Ljava/util/Map;
    //   15: aload_1
    //   16: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast java/lang/Long
    //   24: astore #4
    //   26: aload #4
    //   28: ifnonnull -> 57
    //   31: aload_0
    //   32: getfield ZU : Ljava/util/Map;
    //   35: aload_1
    //   36: lconst_1
    //   37: invokestatic valueOf : (J)Ljava/lang/Long;
    //   40: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   45: pop
    //   46: iload_2
    //   47: ifne -> 104
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   56: athrow
    //   57: aload #4
    //   59: invokevirtual longValue : ()J
    //   62: ldc2_w 9223372036854775807
    //   65: lcmp
    //   66: ifeq -> 104
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   75: athrow
    //   76: aload_0
    //   77: getfield ZU : Ljava/util/Map;
    //   80: aload_1
    //   81: aload #4
    //   83: invokevirtual longValue : ()J
    //   86: lconst_1
    //   87: ladd
    //   88: invokestatic valueOf : (J)Ljava/lang/Long;
    //   91: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   96: pop
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   103: athrow
    //   104: aload_3
    //   105: monitorexit
    //   106: goto -> 116
    //   109: astore #5
    //   111: aload_3
    //   112: monitorexit
    //   113: aload #5
    //   115: athrow
    //   116: return
    // Exception table:
    //   from	to	target	type
    //   11	106	109	finally
    //   26	50	53	java/lang/IllegalArgumentException
    //   31	69	72	java/lang/IllegalArgumentException
    //   57	97	100	java/lang/IllegalArgumentException
    //   109	113	109	finally
  }
  
  public void Zr(Zgl paramZgl, Zrmw paramZrmw, String paramString) {
    Zuh.Zb(Zlz.Zu(paramString), Zqf.Zk);
    Zn8 zn8 = (new Zcw(Zl9.TELEMETRY, 0)).Zh(a(1077, -20508), Zgi.INFO.name()).Zh(a(1073, 32583), paramZrmw.name()).ZN(paramString).Zs(paramZgl).ZV();
    int i = Zm2.Zx();
    try {
      this.Zj.Z_(zn8);
      if (Zbqc.Zwu() == null)
        Zm2.ZZ(++i); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZI() {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: aload_0
    //   4: getfield ZU : Ljava/util/Map;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: istore_1
    //   11: aload_0
    //   12: getfield ZU : Ljava/util/Map;
    //   15: astore_2
    //   16: aload_0
    //   17: new java/util/HashMap
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: putfield ZU : Ljava/util/Map;
    //   27: aload_3
    //   28: monitorexit
    //   29: goto -> 39
    //   32: astore #4
    //   34: aload_3
    //   35: monitorexit
    //   36: aload #4
    //   38: athrow
    //   39: aload_2
    //   40: invokeinterface entrySet : ()Ljava/util/Set;
    //   45: invokeinterface iterator : ()Ljava/util/Iterator;
    //   50: astore_3
    //   51: aload_3
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 162
    //   60: aload_3
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast java/util/Map$Entry
    //   69: astore #4
    //   71: aload_0
    //   72: getfield Zj : Lnet/portswigger/Zml;
    //   75: new net/portswigger/Zcw
    //   78: dup
    //   79: getstatic net/portswigger/Zl9.TELEMETRY : Lnet/portswigger/Zl9;
    //   82: iconst_0
    //   83: invokespecial <init> : (Lnet/portswigger/Zl9;I)V
    //   86: sipush #1077
    //   89: sipush #-20508
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: getstatic net/portswigger/Zgi.COUNTER : Lnet/portswigger/Zgi;
    //   98: invokevirtual name : ()Ljava/lang/String;
    //   101: invokevirtual Zh : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/Zcw;
    //   104: sipush #1074
    //   107: sipush #11408
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: aload #4
    //   115: invokeinterface getKey : ()Ljava/lang/Object;
    //   120: checkcast net/portswigger/Zfp
    //   123: invokeinterface name : ()Ljava/lang/String;
    //   128: invokevirtual Zh : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/Zcw;
    //   131: aload #4
    //   133: invokeinterface getValue : ()Ljava/lang/Object;
    //   138: checkcast java/lang/Long
    //   141: invokevirtual longValue : ()J
    //   144: invokestatic toString : (J)Ljava/lang/String;
    //   147: invokevirtual ZN : (Ljava/lang/String;)Lnet/portswigger/Zcw;
    //   150: invokevirtual ZV : ()Lnet/portswigger/Zn8;
    //   153: invokeinterface Z_ : (Lnet/portswigger/Zn8;)V
    //   158: iload_1
    //   159: ifeq -> 51
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   11	29	32	finally
    //   32	36	32	finally
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¬ù¤Y7;Û"£ M²mîU©¬×ý©Ë%\Ê±heÏð&ëHõ\\f=g¬Ú&h¾² \\fPÂIÎÔÜ¶ÝÇÌ»ÍqËà'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #39
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
    //   68: ldc '`ÃZ\\ràôþò²qò  Ê,'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #7
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
    //   128: putstatic net/portswigger/Zoy.a : [Ljava/lang/String;
    //   131: bipush #7
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zoy.b : [Ljava/lang/String;
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
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #96
    //   219: goto -> 244
    //   222: bipush #124
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #77
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x431) & 0xFFFF;
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
      char c = '·';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zoy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */