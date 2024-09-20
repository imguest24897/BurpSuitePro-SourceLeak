package burp;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzba {
  private final int ZJ;
  
  private final Map<Zrw_, Set<Zrnc>> ZU = new ConcurrentHashMap<>();
  
  private final Set<Zrnc> ZV = new CopyOnWriteArraySet<>();
  
  private final Map<Zghi, AtomicInteger> ZK = new ConcurrentHashMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zzba(int paramInt) {
    this.ZJ = paramInt;
  }
  
  void ZQ(Zrnc paramZrnc) {
    ((Set<Zrnc>)this.ZU.computeIfAbsent(Zrw_.Zj(paramZrnc), Zzba::lambda$add$0)).add(paramZrnc);
  }
  
  public void ZW() {
    Zg(Runnable::run);
  }
  
  public void Zg(Consumer<Runnable> paramConsumer) {
    // Byte code:
    //   0: invokestatic ZD : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZV : Ljava/util/Set;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifne -> 17
    //   16: return
    //   17: aload_0
    //   18: getfield ZU : Ljava/util/Map;
    //   21: invokeinterface size : ()I
    //   26: i2f
    //   27: getstatic burp/Zr_h.ZH : I
    //   30: i2f
    //   31: fdiv
    //   32: f2d
    //   33: invokestatic ceil : (D)D
    //   36: d2i
    //   37: istore_3
    //   38: iconst_0
    //   39: istore #4
    //   41: new java/util/ArrayList
    //   44: dup
    //   45: aload_0
    //   46: getfield ZU : Ljava/util/Map;
    //   49: invokeinterface entrySet : ()Ljava/util/Set;
    //   54: invokespecial <init> : (Ljava/util/Collection;)V
    //   57: astore #5
    //   59: iload #4
    //   61: aload #5
    //   63: invokeinterface size : ()I
    //   68: if_icmpge -> 122
    //   71: aload #5
    //   73: iload #4
    //   75: iload #4
    //   77: iload_3
    //   78: iadd
    //   79: aload_0
    //   80: getfield ZU : Ljava/util/Map;
    //   83: invokeinterface size : ()I
    //   88: invokestatic min : (II)I
    //   91: invokeinterface subList : (II)Ljava/util/List;
    //   96: astore #6
    //   98: iload #4
    //   100: iload_3
    //   101: iadd
    //   102: istore #4
    //   104: aload_1
    //   105: aload_0
    //   106: aload #6
    //   108: <illegal opcode> run : (Lburp/Zzba;Ljava/util/List;)Ljava/lang/Runnable;
    //   113: invokeinterface accept : (Ljava/lang/Object;)V
    //   118: aload_2
    //   119: ifnonnull -> 59
    //   122: return
  }
  
  private Collection<Zrnc> Zc(Zrw_ paramZrw_, Set<Zrnc> paramSet) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZD : ()[Ljava/lang/String;
    //   12: new java/util/LinkedHashSet
    //   15: dup
    //   16: aload_2
    //   17: invokespecial <init> : (Ljava/util/Collection;)V
    //   20: astore #5
    //   22: aload_1
    //   23: invokestatic ZA : (Lburp/Zrw_;)Ljava/util/List;
    //   26: invokeinterface iterator : ()Ljava/util/Iterator;
    //   31: astore #6
    //   33: astore_3
    //   34: aload #6
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 309
    //   44: aload #6
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast burp/Zghi
    //   54: astore #7
    //   56: aload #5
    //   58: invokeinterface iterator : ()Ljava/util/Iterator;
    //   63: astore #8
    //   65: aload #8
    //   67: invokeinterface hasNext : ()Z
    //   72: ifeq -> 117
    //   75: aload #8
    //   77: invokeinterface next : ()Ljava/lang/Object;
    //   82: checkcast burp/Zrnc
    //   85: astore #9
    //   87: aload #4
    //   89: aload #7
    //   91: aload #9
    //   93: invokevirtual Zd : (Lburp/Zrnc;)I
    //   96: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   99: aload_0
    //   100: aload #9
    //   102: <illegal opcode> apply : (Lburp/Zzba;Lburp/Zrnc;)Ljava/util/function/BiFunction;
    //   107: invokeinterface compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
    //   112: pop
    //   113: aload_3
    //   114: ifnonnull -> 65
    //   117: aload #5
    //   119: invokeinterface size : ()I
    //   124: istore #8
    //   126: aload #4
    //   128: invokeinterface size : ()I
    //   133: istore #9
    //   135: aload_0
    //   136: getfield ZK : Ljava/util/Map;
    //   139: aload #7
    //   141: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   146: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   151: checkcast java/util/concurrent/atomic/AtomicInteger
    //   154: iload #8
    //   156: iload #9
    //   158: isub
    //   159: invokevirtual addAndGet : (I)I
    //   162: pop
    //   163: iload #9
    //   165: iload #8
    //   167: if_icmpeq -> 242
    //   170: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   173: sipush #32593
    //   176: sipush #8797
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: iconst_1
    //   183: anewarray java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload #4
    //   190: invokeinterface values : ()Ljava/util/Collection;
    //   195: aastore
    //   196: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   202: sipush #32592
    //   205: sipush #-17132
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: iconst_3
    //   212: anewarray java/lang/Object
    //   215: dup
    //   216: iconst_0
    //   217: iload #8
    //   219: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   222: aastore
    //   223: dup
    //   224: iconst_1
    //   225: iload #9
    //   227: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   230: aastore
    //   231: dup
    //   232: iconst_2
    //   233: aload #7
    //   235: invokevirtual name : ()Ljava/lang/String;
    //   238: aastore
    //   239: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: aload #4
    //   244: invokeinterface size : ()I
    //   249: aload_0
    //   250: getfield ZJ : I
    //   253: if_icmpgt -> 260
    //   256: iconst_1
    //   257: goto -> 261
    //   260: iconst_0
    //   261: istore #10
    //   263: iload #10
    //   265: ifeq -> 276
    //   268: aload #4
    //   270: invokeinterface values : ()Ljava/util/Collection;
    //   275: areturn
    //   276: aload #5
    //   278: invokeinterface clear : ()V
    //   283: aload #5
    //   285: aload #4
    //   287: invokeinterface values : ()Ljava/util/Collection;
    //   292: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   297: pop
    //   298: aload #4
    //   300: invokeinterface clear : ()V
    //   305: aload_3
    //   306: ifnonnull -> 34
    //   309: aload_1
    //   310: invokevirtual ZN : ()Z
    //   313: ifeq -> 329
    //   316: aload_0
    //   317: aload #5
    //   319: aload_0
    //   320: getfield ZJ : I
    //   323: invokevirtual Z_ : (Ljava/util/Set;I)Ljava/util/Set;
    //   326: goto -> 331
    //   329: aload #5
    //   331: areturn
  }
  
  private Zrnc Zp(Zrnc paramZrnc1, Zrnc paramZrnc2) {
    if (paramZrnc1.ZR() < paramZrnc2.ZR())
      return paramZrnc1; 
    if (paramZrnc1.ZR() > paramZrnc2.ZR())
      return paramZrnc2; 
    if (paramZrnc1.ZC() < paramZrnc2.ZC())
      return paramZrnc1; 
    if (paramZrnc1.ZC() > paramZrnc2.ZC())
      return paramZrnc2; 
    Zrnc zrnc = Za(paramZrnc1, paramZrnc2);
    return (zrnc == paramZrnc1) ? paramZrnc1 : paramZrnc2;
  }
  
  private static Zrnc Za(Zrnc paramZrnc1, Zrnc paramZrnc2) {
    return (Zxct.ZB.compare(paramZrnc2.ZB(), paramZrnc1.ZB()) > 0) ? paramZrnc2 : paramZrnc1;
  }
  
  private Set<Zrnc> Z_(Set<Zrnc> paramSet, int paramInt) {
    TreeSet<Zrnc> treeSet = new TreeSet(Comparator.comparingInt(Zrnc::ZR).thenComparingInt(System::identityHashCode));
    treeSet.addAll(paramSet);
    return (Set<Zrnc>)treeSet.stream().limit(paramInt).collect(Collectors.toUnmodifiableSet());
  }
  
  public int Zo() {
    return this.ZU.values().stream().filter(Objects::nonNull).mapToInt(Collection::size).sum();
  }
  
  public int ZP() {
    return this.ZV.size();
  }
  
  public Set<Zrnc> ZH(Predicate<Zrnc> paramPredicate) {
    if (this.ZV.isEmpty() && !this.ZU.isEmpty()) {
      Zuh.ZT(false, Zqf.Zr, a(32594, -12405));
      ZW();
    } 
    return (Set<Zrnc>)this.ZV.stream().filter(paramPredicate).collect(Collectors.toUnmodifiableSet());
  }
  
  public Map<Zghi, AtomicInteger> Zk() {
    return this.ZK;
  }
  
  private static boolean lambda$getConsolidatedRequestsToAudit$5(Zrnc paramZrnc) {
    return true;
  }
  
  private static AtomicInteger lambda$consolidate$4(Zghi paramZghi) {
    return new AtomicInteger();
  }
  
  private Zrnc lambda$consolidate$3(Zrnc paramZrnc1, Integer paramInteger, Zrnc paramZrnc2) {
    return (paramZrnc2 == null) ? paramZrnc1 : Zp(paramZrnc2, paramZrnc1);
  }
  
  private void lambda$consolidate$2(List paramList) {
    paramList.forEach(this::lambda$consolidate$1);
  }
  
  private void lambda$consolidate$1(Map.Entry paramEntry) {
    this.ZV.addAll(Zc((Zrw_)paramEntry.getKey(), (Set<Zrnc>)paramEntry.getValue()));
  }
  
  private static Set lambda$add$0(Zrw_ paramZrw_) {
    return new CopyOnWriteArraySet();
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ß6­á]ü¶ãÎÇÜÂ%péBÐng+úßó]´ÑßÝPdìT,]]g\\n£-ÕQ2^§ätØ¡û¡\\rù¿ß7Ei¼Á,ª¼ßîç\\ra'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #59
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #33
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zzba.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zzba.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #34
    //   154: goto -> 184
    //   157: bipush #48
    //   159: goto -> 184
    //   162: bipush #82
    //   164: goto -> 184
    //   167: bipush #63
    //   169: goto -> 184
    //   172: bipush #48
    //   174: goto -> 184
    //   177: bipush #19
    //   179: goto -> 184
    //   182: bipush #117
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
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
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7F50) & 0xFFFF;
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
      byte b1 = 90;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzba.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */