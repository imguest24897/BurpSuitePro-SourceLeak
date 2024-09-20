package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zkb;
import net.portswigger.Zli;

class Zmwg {
  private final Supplier<Zefx> Zt;
  
  private final Supplier<Integer> ZH;
  
  private final List<Zmv3> Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmwg(List<Zt8g> paramList, Supplier<Zefx> paramSupplier, Supplier<Integer> paramSupplier1) {
    this.Zt = paramSupplier;
    this.ZH = paramSupplier1;
    this.Zd = (List<Zmv3>)paramList.stream().filter(Zmwg::lambda$new$0).map(Zmv3::Zp).collect(Collectors.toList());
  }
  
  List<Zmv3> Zc() {
    return this.Zd;
  }
  
  Zga7 Zt(String paramString1, String paramString2) {
    boolean bool = this.Zd.isEmpty();
    int i = bool ? ((Integer)this.ZH.get()).intValue() : ((Zmv3)this.Zd.get(this.Zd.size() - 1)).Zu;
    Zmv3 zmv3 = Zmv3.Zl(paramString1, paramString2, i + (bool ? 0 : 1));
    this.Zd.add(zmv3);
    String str = bool ? "" : "&";
    return new Zga7(i, Zkb.Zy(str + str));
  }
  
  Zga7 ZB(String paramString1, String paramString2, String paramString3, int paramInt) {
    String str1 = paramString2;
    String str2 = paramString1;
    String str3 = paramString3;
    byte[] arrayOfByte = Zkb.Zy(a(13632, -864) + a(13632, -864) + str3 + a(13633, 11907) + str2 + a(13635, 22750) + str1);
    Zga7 zga7 = new Zga7(paramInt, arrayOfByte);
    int i = paramInt + paramString3.length() + 42;
    int j = i + paramString1.length();
    int k = j + 5;
    int m = k + paramString2.length();
    this.Zd.add(Zmv3.Zp(paramString1, paramString2, i, j, k, m));
    return zga7;
  }
  
  List<Zrif> ZD(int paramInt, String paramString1, String paramString2) {
    Zmv3 zmv31 = this.Zd.get(paramInt);
    Zmv3 zmv32 = Zmv3.ZR(zmv31, paramString1, paramString2);
    this.Zd.set(paramInt, zmv32);
    Za(paramInt + 1, zmv32.Zu - zmv31.Zu);
    ArrayList<Zrif> arrayList = new ArrayList();
    int[] arrayOfInt = Zb6u.ZI();
    if (zmv31.Zb == Zrdu.BODY_PARAM_URL_ENCODED) {
      arrayList.add(new Zrif(zmv31.ZW, zmv31.Zu, Zkb.Zy(zmv32.toString())));
      if (arrayOfInt != null) {
        arrayList.add(new Zrif(zmv31.ZW, zmv31.Zs, Zkb.Zy(paramString1)));
        arrayList.add(new Zrif(zmv32.ZO, zmv32.ZO + zmv31.ZL.length(), Zkb.Zy(paramString2)));
        return arrayList;
      } 
      return arrayList;
    } 
    arrayList.add(new Zrif(zmv31.ZW, zmv31.Zs, Zkb.Zy(paramString1)));
    arrayList.add(new Zrif(zmv32.ZO, zmv32.ZO + zmv31.ZL.length(), Zkb.Zy(paramString2)));
    return arrayList;
  }
  
  List<Zmg4> Zc(List<Integer> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: aload_1
    //   13: invokespecial <init> : (Ljava/util/Collection;)V
    //   16: astore #4
    //   18: aload #4
    //   20: invokestatic reverseOrder : ()Ljava/util/Comparator;
    //   23: invokeinterface sort : (Ljava/util/Comparator;)V
    //   28: aload_0
    //   29: getfield Zt : Ljava/util/function/Supplier;
    //   32: invokeinterface get : ()Ljava/lang/Object;
    //   37: checkcast burp/Zsmh
    //   40: invokestatic Zu : (Lburp/Zsmh;)[B
    //   43: astore #5
    //   45: invokestatic ZI : ()[I
    //   48: aload #5
    //   50: arraylength
    //   51: istore #6
    //   53: aload #4
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #7
    //   62: astore_2
    //   63: aload #7
    //   65: invokeinterface hasNext : ()Z
    //   70: ifeq -> 276
    //   73: aload #7
    //   75: invokeinterface next : ()Ljava/lang/Object;
    //   80: checkcast java/lang/Integer
    //   83: invokevirtual intValue : ()I
    //   86: istore #8
    //   88: aload_0
    //   89: getfield Zd : Ljava/util/List;
    //   92: iload #8
    //   94: invokeinterface remove : (I)Ljava/lang/Object;
    //   99: checkcast burp/Zmv3
    //   102: astore #9
    //   104: aload #9
    //   106: getfield Zb : Lburp/Zrdu;
    //   109: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   112: if_acmpne -> 175
    //   115: iload #8
    //   117: ifle -> 130
    //   120: aload #9
    //   122: getfield ZW : I
    //   125: iconst_1
    //   126: isub
    //   127: goto -> 135
    //   130: aload #9
    //   132: getfield ZW : I
    //   135: istore #10
    //   137: iload #8
    //   139: ifne -> 164
    //   142: aload_0
    //   143: getfield Zd : Ljava/util/List;
    //   146: invokeinterface isEmpty : ()Z
    //   151: ifne -> 164
    //   154: aload #9
    //   156: getfield Zu : I
    //   159: iconst_1
    //   160: iadd
    //   161: goto -> 169
    //   164: aload #9
    //   166: getfield Zu : I
    //   169: istore #11
    //   171: aload_2
    //   172: ifnull -> 233
    //   175: aload_0
    //   176: getfield Zd : Ljava/util/List;
    //   179: invokeinterface isEmpty : ()Z
    //   184: ifeq -> 212
    //   187: aload_0
    //   188: getfield ZH : Ljava/util/function/Supplier;
    //   191: invokeinterface get : ()Ljava/lang/Object;
    //   196: checkcast java/lang/Integer
    //   199: invokevirtual intValue : ()I
    //   202: istore #10
    //   204: iload #6
    //   206: istore #11
    //   208: aload_2
    //   209: ifnull -> 233
    //   212: aload_0
    //   213: iload #8
    //   215: aload #9
    //   217: aload #5
    //   219: invokevirtual ZL : (ILburp/Zmv3;[B)I
    //   222: istore #10
    //   224: aload #9
    //   226: aload #5
    //   228: invokestatic ZQ : (Lburp/Zmv3;[B)I
    //   231: istore #11
    //   233: aload_0
    //   234: iload #8
    //   236: iload #10
    //   238: iload #11
    //   240: isub
    //   241: invokevirtual Za : (II)V
    //   244: iload #6
    //   246: iload #11
    //   248: iload #10
    //   250: isub
    //   251: isub
    //   252: istore #6
    //   254: aload_3
    //   255: new burp/Zmg4
    //   258: dup
    //   259: iload #10
    //   261: iload #11
    //   263: invokespecial <init> : (II)V
    //   266: invokeinterface add : (Ljava/lang/Object;)Z
    //   271: pop
    //   272: aload_2
    //   273: ifnull -> 63
    //   276: aload_3
    //   277: areturn
  }
  
  Zrif Zp(int paramInt1, int paramInt2) {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    int[] arrayOfInt = Zb6u.ZI();
    Zmv3 zmv31 = (paramInt1 < paramInt2) ? this.Zd.get(paramInt1) : this.Zd.get(paramInt2);
    Zmv3 zmv32 = (paramInt1 < paramInt2) ? this.Zd.get(paramInt2) : this.Zd.get(paramInt1);
    if (zmv31.Zb == Zrdu.BODY_PARAM_URL_ENCODED) {
      Zrif zrif1 = new Zrif(zmv31.ZW, zmv32.Zu, Zkb.Zy(String.valueOf(zmv32) + "&" + String.valueOf(zmv32)));
      zmv32 = zmv32.ZV(zmv31.ZW - zmv32.ZW);
      zmv31 = zmv31.ZV(zmv32.Zl.length() + zmv32.ZL.length() + 2);
      if (arrayOfInt != null) {
        Zbqc.Zr(new Zbqc[4]);
      } else {
        this.Zd.set(i, zmv32);
        this.Zd.set(j, zmv31);
        return zrif1;
      } 
    } 
    byte[] arrayOfByte1 = Zt6s.Zu(this.Zt.get());
    int k = ZL(i, zmv31, arrayOfByte1);
    int m = ZQ(zmv31, arrayOfByte1);
    int n = ZQ(zmv32, arrayOfByte1);
    byte[] arrayOfByte2 = new byte[n - k];
    int i1 = n - m;
    System.arraycopy(arrayOfByte1, m, arrayOfByte2, 0, i1);
    System.arraycopy(arrayOfByte1, k, arrayOfByte2, i1, m - k);
    Zrif zrif = new Zrif(k, n, arrayOfByte2);
    zmv31 = zmv31.ZV(n - m);
    zmv32 = zmv32.ZV(k - m);
    this.Zd.set(i, zmv32);
    this.Zd.set(j, zmv31);
    return zrif;
  }
  
  private int ZL(int paramInt, Zmv3 paramZmv3, byte[] paramArrayOfbyte) {
    int i = ((Integer)this.ZH.get()).intValue();
    if (paramInt == 0)
      return i; 
    int j = Zli.ZD(paramArrayOfbyte, (byte)10, i, paramZmv3.ZW);
    return Zli.ZD(paramArrayOfbyte, (byte)10, i, j) + 1;
  }
  
  private static int ZQ(Zmv3 paramZmv3, byte[] paramArrayOfbyte) {
    return Zli.ZU(paramArrayOfbyte, (byte)10, paramZmv3.Zu, paramZmv3.Zu + 2) + 1;
  }
  
  void ZU(int paramInt) {
    Za(0, paramInt);
  }
  
  private void Za(int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zb6u.ZI();
    if (paramInt2 == 0)
      return; 
    int i = paramInt1;
    while (i < this.Zd.size()) {
      this.Zd.set(i, ((Zmv3)this.Zd.get(i)).ZV(paramInt2));
      i++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private static boolean lambda$new$0(Zt8g paramZt8g) {
    return (paramZt8g.ZbQ() == Zrdu.BODY_PARAM_URL_ENCODED || paramZt8g.ZbQ() == Zrdu.BODY_PARAM_MULTIPART);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÅU(«w ÿ)E/}M"ú·§ÅìéÁxáéÅ«Â¯½\\t8&ÀjÒ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #123
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'aþZ(ì'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_2
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #61
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zmwg.a : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zmwg.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #127
    //   210: goto -> 240
    //   213: bipush #75
    //   215: goto -> 240
    //   218: bipush #65
    //   220: goto -> 240
    //   223: bipush #72
    //   225: goto -> 240
    //   228: bipush #84
    //   230: goto -> 240
    //   233: bipush #81
    //   235: goto -> 240
    //   238: bipush #82
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3540) & 0xFFFF;
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
      char c = '¾';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmwg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */