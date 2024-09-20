package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

class Zsgb {
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zm(Zxlv<Zrp0> paramZxlv, Zrp0 paramZrp0, Zszw paramZszw) {
    Zgxq zgxq = Za(paramZrp0, paramZxlv);
    return zgxq.Zm(Zepq.Zt(paramZszw));
  }
  
  public static boolean ZS(Zxlv<Zrp0> paramZxlv) {
    return paramZxlv.Zq1();
  }
  
  static void Zl(Zxlv<Zrp0> paramZxlv, Zzwo<Zrp0, Zboh> paramZzwo) {
    paramZxlv.Zqq();
    paramZzwo.Zly();
  }
  
  static void ZR(Zs_g paramZs_g, Zxlv<Zrp0> paramZxlv, Zzwo<Zrp0, Zboh> paramZzwo, Zr_4 paramZr_4, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZZ : ()Lburp/Zrp0;
    //   4: astore #7
    //   6: invokestatic Zq : ()Ljava/lang/String;
    //   9: aload_0
    //   10: invokevirtual Zt : ()Lburp/Zszw;
    //   13: invokestatic Zt : (Lburp/Zszw;)Lburp/Zepq;
    //   16: astore #8
    //   18: aload_0
    //   19: invokevirtual Zn : ()Z
    //   22: istore #9
    //   24: aload #7
    //   26: new burp/Zl81
    //   29: dup
    //   30: aload #4
    //   32: invokespecial <init> : (Lburp/Zr69;)V
    //   35: invokeinterface Zv : (Lburp/Zsl5;)Ljava/lang/Object;
    //   40: checkcast java/lang/Boolean
    //   43: invokevirtual booleanValue : ()Z
    //   46: istore #10
    //   48: astore #6
    //   50: iload #10
    //   52: ifeq -> 291
    //   55: iload #9
    //   57: ifne -> 72
    //   60: aload #4
    //   62: aload #7
    //   64: invokeinterface Zy : (Lburp/Zrp0;)Z
    //   69: ifeq -> 291
    //   72: aload #7
    //   74: aload_1
    //   75: invokestatic Za : (Lburp/Zrp0;Lburp/Zxlv;)Lburp/Zgxq;
    //   78: astore #11
    //   80: aload #11
    //   82: aload #8
    //   84: invokevirtual ZS : (Lburp/Zepq;)Z
    //   87: ifeq -> 291
    //   90: aload_1
    //   91: aload #7
    //   93: aload #11
    //   95: invokevirtual ZB : ()J
    //   98: invokeinterface Zr : (Lburp/Zgpi;J)Ljava/lang/Long;
    //   103: pop
    //   104: aload #7
    //   106: new burp/Zre0
    //   109: dup
    //   110: invokespecial <init> : ()V
    //   113: invokeinterface Zv : (Lburp/Zsl5;)Ljava/lang/Object;
    //   118: checkcast burp/Zteg
    //   121: astore #12
    //   123: new burp/Zm3r
    //   126: dup
    //   127: aload #4
    //   129: aload_3
    //   130: invokespecial <init> : (Lburp/Zr69;Lburp/Zr_4;)V
    //   133: aload #12
    //   135: invokevirtual ZS : ()Ljava/util/List;
    //   138: aload #12
    //   140: invokevirtual ZX : ()Lburp/Zz3o;
    //   143: invokevirtual ZO : (Ljava/util/List;Lburp/Zz3o;)Ljava/util/Optional;
    //   146: astore #13
    //   148: aload #13
    //   150: aload_2
    //   151: aload #7
    //   153: <illegal opcode> accept : (Lburp/Zzwo;Lburp/Zrp0;)Ljava/util/function/Consumer;
    //   158: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   161: aload #7
    //   163: invokeinterface Znq : ()Lburp/Zeu9;
    //   168: invokeinterface ZHk : ()Ljava/util/Optional;
    //   173: astore #14
    //   175: aload #14
    //   177: invokevirtual isPresent : ()Z
    //   180: ifeq -> 199
    //   183: aload #14
    //   185: invokevirtual get : ()Ljava/lang/Object;
    //   188: checkcast burp/Zski
    //   191: invokeinterface ZyJ : ()Ljava/lang/String;
    //   196: goto -> 208
    //   199: sipush #27170
    //   202: sipush #22553
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: astore #15
    //   210: aload #4
    //   212: invokeinterface ZD : ()Lburp/Zmv7;
    //   217: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   220: getstatic burp/Zlq7.ADD_PENDING_EXIT : Lburp/Zlq7;
    //   223: iconst_5
    //   224: anewarray java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload #15
    //   231: aastore
    //   232: dup
    //   233: iconst_1
    //   234: aload #12
    //   236: invokevirtual ZX : ()Lburp/Zz3o;
    //   239: aastore
    //   240: dup
    //   241: iconst_2
    //   242: aload #7
    //   244: invokeinterface Zne : ()Ljava/lang/String;
    //   249: aastore
    //   250: dup
    //   251: iconst_3
    //   252: aload #8
    //   254: aastore
    //   255: dup
    //   256: iconst_4
    //   257: aload_1
    //   258: invokeinterface Zqw : ()I
    //   263: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   266: aastore
    //   267: invokeinterface Zy : (Lburp/Zrp6;Lburp/Zlq7;[Ljava/lang/Object;)V
    //   272: aload #5
    //   274: new burp/Zxr8
    //   277: dup
    //   278: getstatic burp/Zt35.ZO : Lburp/Zlnb;
    //   281: aload #7
    //   283: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   286: invokeinterface ZD : (Lburp/Zxr8;)V
    //   291: invokestatic Zwu : ()[Lburp/Zbqc;
    //   294: ifnonnull -> 302
    //   297: ldc 'aBeIEc'
    //   299: invokestatic Zc : (Ljava/lang/String;)V
    //   302: return
  }
  
  static void ZI(Zrp0 paramZrp0, Zszw paramZszw, boolean paramBoolean, Zxlv<Zrp0> paramZxlv, Zzwo<Zrp0, Zboh> paramZzwo, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    // Byte code:
    //   0: invokestatic Zq : ()Ljava/lang/String;
    //   3: astore #7
    //   5: aload_3
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic Zm : (Lburp/Zxlv;Lburp/Zrp0;Lburp/Zszw;)Z
    //   11: ifne -> 15
    //   14: return
    //   15: aload #4
    //   17: aload_0
    //   18: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   23: checkcast burp/Zboh
    //   26: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   29: astore #8
    //   31: aload #8
    //   33: iload_2
    //   34: aload #6
    //   36: <illegal opcode> accept : (ZLburp/Zmv7;)Ljava/util/function/Consumer;
    //   41: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   44: aload #8
    //   46: aload #6
    //   48: <illegal opcode> apply : (Lburp/Zmv7;)Ljava/util/function/Function;
    //   53: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   56: iconst_1
    //   57: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   60: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast java/lang/Boolean
    //   66: invokevirtual booleanValue : ()Z
    //   69: ifeq -> 123
    //   72: aload_0
    //   73: aload_3
    //   74: invokestatic Za : (Lburp/Zrp0;Lburp/Zxlv;)Lburp/Zgxq;
    //   77: astore #9
    //   79: aload #9
    //   81: aload_1
    //   82: invokestatic Zt : (Lburp/Zszw;)Lburp/Zepq;
    //   85: invokevirtual Zj : (Lburp/Zepq;)V
    //   88: aload #9
    //   90: invokevirtual ZJ : ()Z
    //   93: ifeq -> 110
    //   96: aload_0
    //   97: aload_3
    //   98: aload #5
    //   100: aload #6
    //   102: invokestatic Z_ : (Lburp/Zrp0;Lburp/Zxlv;Lburp/Zz1m;Lburp/Zmv7;)V
    //   105: aload #7
    //   107: ifnull -> 123
    //   110: aload_3
    //   111: aload_0
    //   112: aload #9
    //   114: invokevirtual ZB : ()J
    //   117: invokeinterface Zr : (Lburp/Zgpi;J)Ljava/lang/Long;
    //   122: pop
    //   123: return
  }
  
  static void Z_(Zrp0 paramZrp0, Zxlv<Zrp0> paramZxlv, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    if (paramZxlv.Zu(paramZrp0) != null) {
      paramZz1m.ZD(new Zxr8(Zt35.Zu, paramZrp0));
      paramZmv7.Zy(Zrp6.DEBUG, Zlq7.REMOVE_FROM_PENDING, new Object[] { paramZrp0, Integer.valueOf(paramZxlv.Zqw()) });
    } 
  }
  
  static List<Zrp0> Zh(Predicate<Zrp0> paramPredicate, Zxlv<Zrp0> paramZxlv, Zz1m<Zt35> paramZz1m) {
    ArrayList<Zrp0> arrayList = new ArrayList();
    Iterator<Zrp0> iterator = paramZxlv.ZqI().iterator();
    String str = Zs_g.Zq();
    while (iterator.hasNext()) {
      Zrp0 zrp0 = iterator.next();
      if (paramPredicate.test(zrp0)) {
        paramZz1m.ZD(new Zxr8(Zt35.Zu, zrp0));
        arrayList.add(zrp0);
      } 
      if (str != null)
        break; 
    } 
    Objects.requireNonNull(paramZxlv);
    arrayList.forEach(paramZxlv::Zu);
    return arrayList;
  }
  
  static Zlru Zn(Zrp0 paramZrp0, Zzwo<Zrp0, Zboh> paramZzwo, Ztx paramZtx) {
    return Optional.<Zboh>ofNullable(paramZzwo.Zd(paramZrp0)).flatMap(Zboh::ZBi).orElse(paramZtx);
  }
  
  private static Zgxq Za(Zrp0 paramZrp0, Zxlv<Zrp0> paramZxlv) {
    return Zgxq.Zq(paramZxlv.ZI(paramZrp0));
  }
  
  static String Zt(Zxlv<Zrp0> paramZxlv) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramZxlv.Zqw());
    String str = Zs_g.Zq();
    if (paramZxlv.Zqw() <= 10)
      for (Zrp0 zrp0 : paramZxlv.ZqI()) {
        stringBuilder.append(a(27171, 9784)).append(zrp0);
        if (str != null)
          break; 
      }  
    return stringBuilder.toString();
  }
  
  private static Boolean lambda$exitTaken$2(Zmv7 paramZmv7, Zboh paramZboh) {
    return Boolean.valueOf(paramZboh.ZO(paramZmv7));
  }
  
  private static void lambda$exitTaken$1(boolean paramBoolean, Zmv7 paramZmv7, Zboh paramZboh) {
    paramZboh.Zg(paramBoolean, paramZmv7);
  }
  
  private static void lambda$makePending$0(Zzwo<Zrp0, Zboh> paramZzwo, Zrp0 paramZrp0, Zboh paramZboh) {
    paramZzwo.Zu(paramZrp0, paramZboh);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'êÁ«= '
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #10
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
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
    //   66: aload #5
    //   68: putstatic burp/Zsgb.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zsgb.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #17
    //   154: goto -> 184
    //   157: bipush #11
    //   159: goto -> 184
    //   162: bipush #74
    //   164: goto -> 184
    //   167: bipush #31
    //   169: goto -> 184
    //   172: bipush #19
    //   174: goto -> 184
    //   177: bipush #117
    //   179: goto -> 184
    //   182: bipush #124
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6A22) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsgb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */