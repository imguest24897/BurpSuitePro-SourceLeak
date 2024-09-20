package net.portswigger.browser;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zja {
  private static final List<String> Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zc8 Zo(Zjw paramZjw, Zt3 paramZt3) throws Ztk {
    // Byte code:
    //   0: new java/util/concurrent/atomic/AtomicReference
    //   3: dup
    //   4: ldc ''
    //   6: invokespecial <init> : (Ljava/lang/Object;)V
    //   9: astore_3
    //   10: aload_2
    //   11: invokeinterface spliterator : ()Ljava/util/Spliterator;
    //   16: iconst_1
    //   17: invokestatic stream : (Ljava/util/Spliterator;Z)Ljava/util/stream/Stream;
    //   20: aload_3
    //   21: aload_2
    //   22: <illegal opcode> apply : (Ljava/util/concurrent/atomic/AtomicReference;Lnet/portswigger/browser/Zt3;)Ljava/util/function/Function;
    //   27: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   32: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   37: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   42: invokeinterface toList : ()Ljava/util/List;
    //   47: astore #4
    //   49: new net/portswigger/browser/Zc8
    //   52: dup
    //   53: aload_1
    //   54: invokeinterface ZS : ()Lnet/portswigger/browser/Zed;
    //   59: invokeinterface Zr : ()Ljava/lang/String;
    //   64: aload_1
    //   65: invokeinterface Zx : ()Lnet/portswigger/browser/Zd0;
    //   70: invokeinterface ZU : ()Ljava/lang/String;
    //   75: aload_3
    //   76: invokevirtual get : ()Ljava/lang/Object;
    //   79: checkcast java/lang/String
    //   82: aload #4
    //   84: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   87: areturn
  }
  
  private static Zey lambda$describeUsingDom$0(AtomicReference<String> paramAtomicReference, Zt3 paramZt3, Zel paramZel) {
    String str = paramZel.ZD().toLowerCase();
    try {
      if (str.equals(a(8514, -24602)))
        paramAtomicReference.set(paramZel.ZW().<String>map(Zjn::ZaS).orElse("")); 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    try {
      if (Zj.contains(str))
        return null; 
    } catch (Ztk ztk) {
      throw a(null);
    } 
    try {
      try {
        if (paramZel.ZH())
          try {
            if (paramZel.Zu()) {
              try {
              
              } catch (Ztk ztk) {
                throw a(null);
              } 
              String str1 = paramZel.ZJ() ? paramZel.ZI() : null;
              String str2 = paramZel.Zq().Zi();
              try {
                if (str2.length() < 2000 && paramZt3.ZR(paramZel))
                  return new Zey(paramZel.Zt(), paramZel.ZW().<String>map(Zjn::ZaS).orElse(""), str2, str1, paramZel.ZJ()); 
              } catch (Ztk ztk) {
                throw a(null);
              } 
            } 
          } catch (Ztk ztk) {
            throw a(null);
          }  
      } catch (Ztk ztk) {
        throw a(null);
      } 
    } catch (Ztk ztk) {
      Zah.Zl(ztk, Zk_.IGNORED);
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÖO?6ûeèÁqç{"êÃò'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #9
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #24
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   64: goto -> 22
    //   67: ldc '&Êïu(lS'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #23
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   127: putstatic net/portswigger/browser/Zja.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic net/portswigger/browser/Zja.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #76
    //   210: goto -> 240
    //   213: bipush #80
    //   215: goto -> 240
    //   218: bipush #95
    //   220: goto -> 240
    //   223: bipush #69
    //   225: goto -> 240
    //   228: bipush #27
    //   230: goto -> 240
    //   233: bipush #114
    //   235: goto -> 240
    //   238: bipush #81
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 39, 0 -> 97
    //   296: sipush #8516
    //   299: sipush #20135
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: sipush #8515
    //   308: sipush #-9996
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: sipush #8513
    //   317: sipush #-26452
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: sipush #8512
    //   326: sipush #-27181
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   335: putstatic net/portswigger/browser/Zja.Zj : Ljava/util/List;
    //   338: return
  }
  
  private static Ztk a(Ztk paramZtk) {
    return paramZtk;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2140) & 0xFFFF;
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
      byte b1 = 20;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zja.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */