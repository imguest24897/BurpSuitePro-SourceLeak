package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public interface Zeg1 extends Zgpi<Zeg1> {
  public static final Zeu4<Zeg1> Zm;
  
  public static final Comparator<Zbg> Zr;
  
  public static final Comparator<Zbg> Zw;
  
  public static final String[] a;
  
  public static final String[] b;
  
  Zbg ZP(Zgqa paramZgqa);
  
  void ZA(Zgqa paramZgqa, Zbg paramZbg);
  
  Collection<Zbg> ZPI();
  
  Zgqa Zi(Zl_ paramZl_);
  
  Zbg ZD(Zgqa paramZgqa, Zl_ paramZl_);
  
  default void ZX(Zeu9 paramZeu9) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZHp : ()Ljava/util/List;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: aload_0
    //   12: <illegal opcode> apply : (Lburp/Zeg1;)Ljava/util/function/Function;
    //   17: invokestatic groupingBy : (Ljava/util/function/Function;)Ljava/util/stream/Collector;
    //   20: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   25: checkcast java/util/Map
    //   28: astore_3
    //   29: invokestatic ZG : ()[I
    //   32: aload_3
    //   33: invokeinterface entrySet : ()Ljava/util/Set;
    //   38: invokeinterface iterator : ()Ljava/util/Iterator;
    //   43: astore #4
    //   45: astore_2
    //   46: aload #4
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 125
    //   56: aload #4
    //   58: invokeinterface next : ()Ljava/lang/Object;
    //   63: checkcast java/util/Map$Entry
    //   66: astore #5
    //   68: aload #5
    //   70: invokeinterface getValue : ()Ljava/lang/Object;
    //   75: checkcast java/util/List
    //   78: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   83: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   88: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   93: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   98: invokestatic comparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   101: invokeinterface max : (Ljava/util/Comparator;)Ljava/util/Optional;
    //   106: astore #6
    //   108: aload #6
    //   110: aload_0
    //   111: aload #5
    //   113: <illegal opcode> accept : (Lburp/Zeg1;Ljava/util/Map$Entry;)Ljava/util/function/Consumer;
    //   118: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   121: aload_2
    //   122: ifnull -> 46
    //   125: return
  }
  
  private static int Za(Zm6i paramZm6i) {
    int i = 0;
    String str = ((String)paramZm6i.ZmJ().stream().map(Zzjv::ZxZ).collect(Collectors.joining(""))).toLowerCase();
    Zz3o zz3o = paramZm6i.Zm2();
    i += (zz3o == Zz3o.SUBMIT) ? 5 : 0;
    i += (zz3o == Zz3o.FORM) ? 5 : 0;
    i += str.contains(a(1631, -27916)) ? 10 : 0;
    i += str.contains(a(1625, 16561)) ? 10 : 0;
    i += str.contains(a(1628, 22615)) ? 9 : 0;
    i += str.contains(a(1630, -28518)) ? -10 : 0;
    i += str.contains(a(1624, 23229)) ? -10 : 0;
    i += str.contains("?") ? -5 : 0;
    i += str.contains(a(1629, -6591)) ? -5 : 0;
    return i;
  }
  
  default Collection<Zl_> ZPt() {
    ArrayList<Zl_> arrayList = new ArrayList();
    Iterator<Zbg> iterator = ZPI().iterator();
    int[] arrayOfInt = Zlrg.ZG();
    while (iterator.hasNext()) {
      Zbg zbg = iterator.next();
      arrayList.addAll(zbg.Zna());
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  default Zbg ZPZ() {
    return ZH(Zw);
  }
  
  default Zbg ZPC() {
    return (ZPI().size() > 1) ? ZH(Zr) : null;
  }
  
  default Zbg ZH(Comparator<Zbg> paramComparator) {
    Collection<Zbg> collection = ZPI();
    if (collection.isEmpty())
      return null; 
    ArrayList<Zbg> arrayList = new ArrayList<>(collection);
    arrayList.sort(paramComparator);
    return arrayList.get(0);
  }
  
  private void lambda$roomAdded$2(Map.Entry paramEntry, Zl_ paramZl_) {
    Zgqa zgqa = (Zgqa)paramEntry.getKey();
    Zbg zbg = ZP(zgqa);
    int[] arrayOfInt = Zlrg.ZG();
    if (zbg == null) {
      zbg = ZD(zgqa, paramZl_);
      ZA(zgqa, zbg);
      if (arrayOfInt != null) {
        zbg.ZD(paramZl_);
        return;
      } 
      return;
    } 
    zbg.ZD(paramZl_);
  }
  
  private static int lambda$roomAdded$1(Zl_ paramZl_) {
    return Za(paramZl_.Zfy());
  }
  
  private static boolean lambda$roomAdded$0(Zl_ paramZl_) {
    return paramZl_.Zfy().Zmc().Zta().stream().anyMatch(Zz_b::ZMY);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '*ù©c\\bhêzR½KwT#?e\|'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #121
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc '\V»=âyÒ¥'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #61
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zeg1.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zeg1.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #39
    //   214: goto -> 244
    //   217: bipush #25
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #125
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
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zkz0
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zeg1.Zm : Lburp/Zeu4;
    //   310: new burp/Zgft
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: putstatic burp/Zeg1.Zr : Ljava/util/Comparator;
    //   320: getstatic burp/Zeg1.Zr : Ljava/util/Comparator;
    //   323: invokestatic reverseOrder : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   326: putstatic burp/Zeg1.Zw : Ljava/util/Comparator;
    //   329: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x65C) & 0xFFFF;
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
      byte b1 = 15;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeg1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */