package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Zr4x {
  private static String[] ZX;
  
  private static final String[] b;
  
  private static final String[] c;
  
  static void Zu(Ztas paramZtas, Zr69 paramZr69, Zz1m<Zt35> paramZz1m, Zefg<Zgnc> paramZefg, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    Zt8i zt8i = paramZtas.ZUi();
    boolean bool = ((Collection)zt8i.Zsg().Znr().getOrDefault(zt8i.ZsJ(), Collections.emptyList())).stream().filter(zt8i::lambda$exitTaken$0).noneMatch(zt8i::lambda$exitTaken$1);
    if (!bool || !paramZr69.Zo())
      return; 
    List<Zgnc> list = zt8i.ZsL().Zqg().stream().map(Ztrm::ZzQ).flatMap(Collection::stream).filter(Zr4x::lambda$exitTaken$2).filter(paramZkl6::lambda$exitTaken$3).toList();
    Zq(list, paramZr69, paramZkl6, paramZr_4, paramZz1m, zt8i, paramZefg);
  }
  
  private static void Zq(List<Zgnc> paramList, Zr69 paramZr69, Zkl6 paramZkl6, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zt8i paramZt8i, Zefg<Zgnc> paramZefg) {
    Set set = (Set)paramList.stream().map(Zm55::new).sorted(Comparator.comparing(Zm55::Zy).thenComparing(Zm55::Zp)).collect(Collectors.toCollection(java.util.LinkedHashSet::new));
    Iterator<Zm55> iterator = set.iterator();
    String[] arrayOfString = Zf();
    while (iterator.hasNext()) {
      Zm55 zm55 = iterator.next();
      Objects.requireNonNull(zm55);
      if (paramZefg.stream().anyMatch(zm55::Zs))
        continue; 
      paramZefg.add(zm55.ZO);
      List<Zgyy> list = ZC(paramZt8i.Zsu(), zm55, paramZr69, paramZz1m, paramZr_4, paramZkl6);
      paramZt8i.Zsu().Za(list);
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private static boolean Zh(Zgnc paramZgnc, Zkl6 paramZkl6) {
    Zey9 zey9 = paramZkl6.ZH();
    Zmzk zmzk = paramZgnc.ZzX().ZyR().Zdz();
    Zstu zstu = paramZgnc.Zzk();
    Zefx zefx = zey9.Zu(zmzk, zstu);
    Zrsn zrsn = Zrsn.Zq(paramZgnc.Zza(), paramZkl6.ZB());
    return Zkh8.ZR(zefx, zrsn).isPresent();
  }
  
  public static List<Zgyy> ZC(Zeu9 paramZeu9, Zm55 paramZm55, Zr69 paramZr69, Zz1m<Zt35> paramZz1m, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: invokestatic Zf : ()[Ljava/lang/String;
    //   12: aload_1
    //   13: aload #5
    //   15: invokeinterface ZH : ()Lburp/Zey9;
    //   20: invokevirtual ZQ : (Lburp/Zey9;)Lburp/Zefx;
    //   23: astore #8
    //   25: astore #6
    //   27: aload_2
    //   28: aload #8
    //   30: invokeinterface ZF : ()Lburp/Zlit;
    //   35: invokeinterface ZG : (Lburp/Zlit;)Z
    //   40: ifeq -> 184
    //   43: aload #4
    //   45: new burp/Zefw
    //   48: dup
    //   49: aload_0
    //   50: getstatic burp/Zz3o.GRAPHQL_INTROSPECTION : Lburp/Zz3o;
    //   53: aload #8
    //   55: new burp/Zio
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: getstatic burp/Zmtz.TEXT : Lburp/Zmtz;
    //   65: invokevirtual ZG : (Lburp/Zmtz;)Lburp/Zio;
    //   68: sipush #23426
    //   71: sipush #-15367
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: aload_1
    //   78: invokevirtual Zp : ()Ljava/lang/String;
    //   81: invokevirtual equals : (Ljava/lang/Object;)Z
    //   84: ifeq -> 93
    //   87: getstatic burp/Zz_4.BODY : Lburp/Zz_4;
    //   90: goto -> 96
    //   93: getstatic burp/Zz_4.URL : Lburp/Zz_4;
    //   96: invokevirtual ZP : (Lburp/Zz_4;)Lburp/Zvy;
    //   99: checkcast burp/Zio
    //   102: sipush #23425
    //   105: sipush #-30234
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual Zn : (Ljava/lang/String;)Lburp/Zvy;
    //   114: checkcast burp/Zio
    //   117: sipush #23424
    //   120: sipush #-6355
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zvy;
    //   129: checkcast burp/Zio
    //   132: iconst_0
    //   133: invokestatic ZM : (Z)Ljava/lang/String;
    //   136: invokevirtual ZR : (Ljava/lang/String;)Lburp/Zvy;
    //   139: checkcast burp/Zio
    //   142: iconst_0
    //   143: invokevirtual ZO : (Z)Lburp/Zio;
    //   146: iconst_0
    //   147: invokevirtual ZF : (Z)Lburp/Zio;
    //   150: invokevirtual Zb : ()Lburp/Zs3b;
    //   153: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   156: invokespecial <init> : (Lburp/Zeu9;Lburp/Zz3o;Lburp/Zefx;Ljava/util/List;)V
    //   159: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   164: checkcast burp/Zxss
    //   167: astore #9
    //   169: aload #7
    //   171: aload #9
    //   173: invokeinterface add : (Ljava/lang/Object;)Z
    //   178: pop
    //   179: aload #6
    //   181: ifnonnull -> 202
    //   184: aload_3
    //   185: new burp/Zxr8
    //   188: dup
    //   189: getstatic burp/Zt35.ZU : Lburp/Zlnb;
    //   192: aload #8
    //   194: invokespecial <init> : (Lburp/Zlnb;Ljava/lang/Object;)V
    //   197: invokeinterface ZD : (Lburp/Zxr8;)V
    //   202: aload #7
    //   204: invokestatic Zwu : ()[Lburp/Zbqc;
    //   207: ifnonnull -> 217
    //   210: iconst_5
    //   211: anewarray java/lang/String
    //   214: invokestatic ZQ : ([Ljava/lang/String;)V
    //   217: areturn
  }
  
  private static boolean lambda$exitTaken$3(Zkl6 paramZkl6, Zgnc paramZgnc) {
    return Zh(paramZgnc, paramZkl6);
  }
  
  private static boolean lambda$exitTaken$2(Zgnc paramZgnc) {
    return (paramZgnc.Zza() != null);
  }
  
  private static boolean lambda$exitTaken$1(Zt8i paramZt8i1, Zt8i paramZt8i2) {
    return paramZt8i2.Zsu().equals(paramZt8i1.Zsu());
  }
  
  private static boolean lambda$exitTaken$0(Zt8i paramZt8i1, Zt8i paramZt8i2) {
    return !paramZt8i2.equals(paramZt8i1);
  }
  
  public static void ZQ(String[] paramArrayOfString) {
    ZX = paramArrayOfString;
  }
  
  public static String[] Zf() {
    return ZX;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic ZQ : ([Ljava/lang/String;)V
    //   15: ldc '|oÕÇL;Ú%þ'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: iconst_5
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #52
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 88
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: aload #5
    //   75: putstatic burp/Zr4x.b : [Ljava/lang/String;
    //   78: iconst_3
    //   79: anewarray java/lang/String
    //   82: putstatic burp/Zr4x.c : [Ljava/lang/String;
    //   85: goto -> 231
    //   88: dup_x2
    //   89: pop
    //   90: invokevirtual toCharArray : ()[C
    //   93: dup_x1
    //   94: arraylength
    //   95: dup_x2
    //   96: pop
    //   97: iconst_0
    //   98: istore #6
    //   100: dup2_x1
    //   101: pop2
    //   102: dup_x2
    //   103: iconst_1
    //   104: if_icmpgt -> 204
    //   107: dup2
    //   108: swap
    //   109: iload #6
    //   111: dup2_x1
    //   112: caload
    //   113: swap
    //   114: iload #6
    //   116: bipush #7
    //   118: irem
    //   119: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #11
    //   158: goto -> 188
    //   161: bipush #33
    //   163: goto -> 188
    //   166: bipush #9
    //   168: goto -> 188
    //   171: bipush #62
    //   173: goto -> 188
    //   176: bipush #27
    //   178: goto -> 188
    //   181: bipush #14
    //   183: goto -> 188
    //   186: bipush #15
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 111
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 107
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 45
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5B80) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'î';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */