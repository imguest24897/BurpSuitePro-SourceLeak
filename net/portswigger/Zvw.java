package net.portswigger;

import burp.Zbqc;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Zvw implements Iterable<Zdi> {
  private final LinkedHashMap<Z_3, Zdi> Zp = new LinkedHashMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zvw Zu() {
    return new Zvw();
  }
  
  public static Zvw Zm(Zvw paramZvw1, Zvw paramZvw2) {
    return Zf(paramZvw1, paramZvw2);
  }
  
  public static Zvw Zf(Zvw paramZvw, String... paramVarArgs) {
    try {
      if (paramVarArgs.length % 2 != 0)
        throw new UnsupportedOperationException(a(-18267, -18433)); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    LinkedList<Zdi> linkedList = new LinkedList();
    byte b = 0;
    try {
      while (b < paramVarArgs.length) {
        linkedList.add(Zdi.Zh(paramVarArgs[b], paramVarArgs[b + 1]));
        b += 2;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return Zf(paramZvw, linkedList);
  }
  
  public static Zvw Zt(Zvw paramZvw, Zto<String, String>... paramVarArgs) {
    LinkedList<Zdi> linkedList = new LinkedList();
    Zbqc[] arrayOfZbqc = Zj.Zk();
    Zto<String, String>[] arrayOfZto = paramVarArgs;
    int i = arrayOfZto.length;
    byte b = 0;
    while (b < i) {
      Zto<String, String> zto = arrayOfZto[b];
      linkedList.add(Zdi.Zh((String)zto.Zq, (String)zto.Zo));
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return Zf(paramZvw, linkedList);
  }
  
  public static Zvw Zf(Zvw paramZvw, Iterable<Zdi> paramIterable) {
    return ZH((Iterable<Zdi>)Stream.<Zdi>concat(paramZvw.ZQ(), StreamSupport.stream(paramIterable.spliterator(), false)).collect(Collectors.toList()));
  }
  
  public static Zvw ZF(Map<String, String> paramMap) {
    LinkedList<Zdi> linkedList = new LinkedList();
    Iterator<Map.Entry> iterator = paramMap.entrySet().iterator();
    Zbqc[] arrayOfZbqc = Zj.Zk();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      linkedList.add(Zdi.Zh((String)entry.getKey(), (String)entry.getValue()));
      if (arrayOfZbqc != null)
        break; 
    } 
    return ZH(linkedList);
  }
  
  public static Zvw ZQ(String... paramVarArgs) {
    try {
      if (paramVarArgs.length % 2 != 0)
        throw new UnsupportedOperationException(a(-18266, 10739)); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    LinkedList<Zdi> linkedList = new LinkedList();
    byte b = 0;
    try {
      while (b < paramVarArgs.length) {
        linkedList.add(Zdi.Zh(paramVarArgs[b], paramVarArgs[b + 1]));
        b += 2;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return ZH(linkedList);
  }
  
  public static Zvw ZH(Iterable<Zdi> paramIterable) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (Zdi zdi : paramIterable) {
      Z_3 z_3 = zdi.ZW;
      try {
        if (linkedHashMap.containsKey(z_3)) {
          linkedHashMap.put(z_3, ((Zdi)linkedHashMap.get(z_3)).Zh(zdi));
          continue;
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      linkedHashMap.put(z_3, zdi);
    } 
    return new Zvw((LinkedHashMap)linkedHashMap);
  }
  
  public Zvw() {}
  
  private Zvw(LinkedHashMap<Z_3, Zdi> paramLinkedHashMap) {}
  
  public Optional<String> Zk(String paramString) {
    Z_3 z_3 = new Z_3(paramString);
    try {
      if (!this.Zp.containsKey(z_3))
        return Optional.empty(); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    AtomicReference<String> atomicReference = new AtomicReference();
    ((Zdi)this.Zp.get(z_3)).ZC(atomicReference::lambda$get$0);
    return Optional.of(atomicReference.get());
  }
  
  public boolean Zn(String paramString1, String paramString2) {
    return ((Boolean)Zk(paramString1).<Boolean>map(paramString2::lambda$valEquals$2).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  public boolean Zm(String paramString1, String paramString2) {
    return ((Boolean)Zk(paramString1).<Boolean>map(paramString2::lambda$valEqualsIgnoringCase$3).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  public boolean Zy(String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Zk : (Ljava/lang/String;)Ljava/util/Optional;
    //   5: aload_2
    //   6: aload_3
    //   7: <illegal opcode> apply : (Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Function;
    //   12: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   15: iconst_0
    //   16: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   19: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast java/lang/Boolean
    //   25: invokevirtual booleanValue : ()Z
    //   28: ireturn
  }
  
  public boolean ZE(String paramString1, String paramString2) {
    return ((Boolean)Zk(paramString1).<Boolean>map(paramString2::lambda$valContainsIgnoringCase$6).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  public String Zw(String paramString1, String paramString2) {
    return Zk(paramString1).orElse(paramString2);
  }
  
  public Stream<Zdi> ZQ() {
    return this.Zp.values().stream();
  }
  
  public int ZG() {
    return this.Zp.size();
  }
  
  public boolean Zp(String paramString) {
    return this.Zp.containsKey(new Z_3(paramString));
  }
  
  public Iterator<Zdi> iterator() {
    return ZQ().iterator();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Zbqc[] arrayOfZbqc = Zj.Zk();
    for (Zdi zdi : this) {
      zdi.ZC(stringBuilder::lambda$toString$7);
      if (arrayOfZbqc != null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    Zbqc[] arrayOfZbqc = Zj.Zk();
    try {
      if (this == paramObject)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zvw zvw = (Zvw)paramObject;
            try {
              if (this.Zp.size() != zvw.Zp.size())
                return false; 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            for (Map.Entry<Z_3, Zdi> entry : this.Zp.entrySet()) {
              Zdi zdi = zvw.Zp.get(entry.getKey());
              try {
                if (zdi == null)
                  return false; 
              } catch (UnsupportedOperationException unsupportedOperationException) {
                throw a(null);
              } 
              try {
                if (!((Zdi)entry.getValue()).equals(zdi))
                  return false; 
              } catch (UnsupportedOperationException unsupportedOperationException) {
                throw a(null);
              } 
              if (arrayOfZbqc != null)
                break; 
            } 
            return true;
          } 
          return false;
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zp });
  }
  
  private static void lambda$toString$7(StringBuilder paramStringBuilder, Z_3 paramZ_3, String paramString) {
    paramStringBuilder.append(paramZ_3.ZZ).append(a(-18268, -27631)).append(paramString).append('\n');
  }
  
  private static Boolean lambda$valContainsIgnoringCase$6(String paramString1, String paramString2) {
    return Boolean.valueOf(paramString2.toLowerCase().contains(paramString1.toLowerCase()));
  }
  
  private static Boolean lambda$valAsListContainsIgnoringCase$5(String paramString1, String paramString2, String paramString3) {
    return Boolean.valueOf(Arrays.<String>stream(paramString3.split(paramString1)).anyMatch(paramString2::lambda$valAsListContainsIgnoringCase$4));
  }
  
  private static boolean lambda$valAsListContainsIgnoringCase$4(String paramString1, String paramString2) {
    return paramString2.equalsIgnoreCase(paramString1);
  }
  
  private static Boolean lambda$valEqualsIgnoringCase$3(String paramString1, String paramString2) {
    return Boolean.valueOf(paramString2.equalsIgnoreCase(paramString1));
  }
  
  private static Boolean lambda$valEquals$2(String paramString1, String paramString2) {
    return Boolean.valueOf(paramString2.equals(paramString1));
  }
  
  private static void lambda$getAll$1(List<String> paramList, Z_3 paramZ_3, String paramString) {
    paramList.add(paramString);
  }
  
  private static void lambda$get$0(AtomicReference<String> paramAtomicReference, Z_3 paramZ_3, String paramString) {
    paramAtomicReference.set(paramString);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '$ô%ÞçWUÆ³ÌÚôRT\&ÛvFÐÀ¸»Z]BÏ¯/öò<H%È}°dMá =Ä ¬òÜô\çlh/®¨¬ Ö~ÙØÙ\\r'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #80
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
    //   68: putstatic net/portswigger/Zvw.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic net/portswigger/Zvw.b : [Ljava/lang/String;
    //   78: goto -> 226
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
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #26
    //   154: goto -> 183
    //   157: bipush #83
    //   159: goto -> 183
    //   162: iconst_2
    //   163: goto -> 183
    //   166: bipush #54
    //   168: goto -> 183
    //   171: bipush #11
    //   173: goto -> 183
    //   176: bipush #12
    //   178: goto -> 183
    //   181: bipush #126
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB8A4) & 0xFFFF;
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
      byte b1 = 8;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvw.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */