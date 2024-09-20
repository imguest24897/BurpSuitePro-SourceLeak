package burp;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Zszt implements Zehp {
  private final Consumer<Ze7n> ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zszt(Consumer<Ze7n> paramConsumer) {
    this.ZV = paramConsumer;
  }
  
  public void ZG(Zsvv paramZsvv, Zrji paramZrji, String paramString1, String paramString2) {
    ZN(paramZsvv, paramZrji, paramString1, new HashSet<>());
  }
  
  public void ZN(Zsvv paramZsvv, Zrji paramZrji, String paramString, Set<Ztjl> paramSet) {
    // Byte code:
    //   0: invokestatic Zi : ()[I
    //   3: astore #5
    //   5: aload_2
    //   6: invokevirtual ZwK : ()Z
    //   9: ifne -> 29
    //   12: aload_2
    //   13: invokevirtual ZwF : ()Z
    //   16: ifne -> 138
    //   19: aload_2
    //   20: invokevirtual Zwz : ()Lburp/Zrji;
    //   23: invokevirtual ZwK : ()Z
    //   26: ifeq -> 138
    //   29: aload_3
    //   30: sipush #-9887
    //   33: sipush #-5674
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   42: astore #6
    //   44: new burp/Ztaf
    //   47: dup
    //   48: aload_1
    //   49: aload_2
    //   50: invokevirtual Zw : ()Lburp/Zrji;
    //   53: invokespecial <init> : (Lburp/Zsvv;Lburp/Zrji;)V
    //   56: new burp/Zio
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: aload_3
    //   64: invokevirtual Zj : (Ljava/lang/String;)Lburp/Zvy;
    //   67: checkcast burp/Zio
    //   70: aload #6
    //   72: arraylength
    //   73: ifne -> 80
    //   76: aload_3
    //   77: goto -> 88
    //   80: aload #6
    //   82: aload #6
    //   84: arraylength
    //   85: iconst_1
    //   86: isub
    //   87: aaload
    //   88: invokevirtual Zn : (Ljava/lang/String;)Lburp/Zvy;
    //   91: checkcast burp/Zio
    //   94: getstatic burp/Zz_4.BODY : Lburp/Zz_4;
    //   97: invokevirtual ZP : (Lburp/Zz_4;)Lburp/Zvy;
    //   100: checkcast burp/Zio
    //   103: iconst_0
    //   104: invokevirtual ZO : (Z)Lburp/Zio;
    //   107: aload_2
    //   108: invokevirtual ZwF : ()Z
    //   111: invokevirtual ZF : (Z)Lburp/Zio;
    //   114: invokevirtual Zf : (Lburp/Zio;)Lburp/Zio;
    //   117: invokevirtual Zb : ()Lburp/Zs3b;
    //   120: astore #7
    //   122: aload_0
    //   123: getfield ZV : Ljava/util/function/Consumer;
    //   126: aload #7
    //   128: invokeinterface accept : (Ljava/lang/Object;)V
    //   133: aload #5
    //   135: ifnull -> 302
    //   138: aload_2
    //   139: invokevirtual Zwe : ()Ljava/util/Optional;
    //   142: invokevirtual isPresent : ()Z
    //   145: ifeq -> 192
    //   148: aload_0
    //   149: aload_1
    //   150: aload_2
    //   151: invokevirtual Zwe : ()Ljava/util/Optional;
    //   154: invokevirtual get : ()Ljava/lang/Object;
    //   157: checkcast burp/Zrji
    //   160: aload_3
    //   161: sipush #-9888
    //   164: sipush #7424
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   175: new java/util/HashSet
    //   178: dup
    //   179: aload #4
    //   181: invokespecial <init> : (Ljava/util/Collection;)V
    //   184: invokevirtual ZN : (Lburp/Zsvv;Lburp/Zrji;Ljava/lang/String;Ljava/util/Set;)V
    //   187: aload #5
    //   189: ifnull -> 302
    //   192: aload_2
    //   193: aload_1
    //   194: invokevirtual ZM : (Lburp/Zsvv;)Lburp/Zsk1;
    //   197: astore #6
    //   199: aload #6
    //   201: instanceof burp/Ztjl
    //   204: ifeq -> 219
    //   207: aload #6
    //   209: checkcast burp/Ztjl
    //   212: astore #7
    //   214: aload #5
    //   216: ifnull -> 220
    //   219: return
    //   220: aload #4
    //   222: aload #7
    //   224: invokeinterface add : (Ljava/lang/Object;)Z
    //   229: ifne -> 233
    //   232: return
    //   233: aload #7
    //   235: invokevirtual ZtK : ()Ljava/util/List;
    //   238: invokeinterface iterator : ()Ljava/util/Iterator;
    //   243: astore #8
    //   245: aload #8
    //   247: invokeinterface hasNext : ()Z
    //   252: ifeq -> 302
    //   255: aload #8
    //   257: invokeinterface next : ()Ljava/lang/Object;
    //   262: checkcast burp/Zzqr
    //   265: astore #9
    //   267: aload_0
    //   268: aload_1
    //   269: aload #9
    //   271: invokevirtual Zx3 : ()Lburp/Zrji;
    //   274: aload_3
    //   275: aload #9
    //   277: invokevirtual ZxH : ()Ljava/lang/String;
    //   280: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   285: new java/util/HashSet
    //   288: dup
    //   289: aload #4
    //   291: invokespecial <init> : (Ljava/util/Collection;)V
    //   294: invokevirtual ZN : (Lburp/Zsvv;Lburp/Zrji;Ljava/lang/String;Ljava/util/Set;)V
    //   297: aload #5
    //   299: ifnull -> 245
    //   302: invokestatic Zwu : ()[Lburp/Zbqc;
    //   305: ifnonnull -> 314
    //   308: iconst_5
    //   309: newarray int
    //   311: invokestatic ZS : ([I)V
    //   314: return
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÇP÷¹'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #59
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
    //   68: putstatic burp/Zszt.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zszt.b : [Ljava/lang/String;
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
    //   152: bipush #78
    //   154: goto -> 184
    //   157: bipush #93
    //   159: goto -> 184
    //   162: bipush #18
    //   164: goto -> 184
    //   167: bipush #43
    //   169: goto -> 184
    //   172: bipush #120
    //   174: goto -> 184
    //   177: bipush #66
    //   179: goto -> 184
    //   182: bipush #13
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
    int i = (paramInt1 ^ 0xFFFFD960) & 0xFFFF;
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
      char c = 'Î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zszt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */