package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public abstract class Zzvx {
  protected static final Set<String> ZM;
  
  private final Zsvm Zc;
  
  private final Set<String> Zb;
  
  private final List<Zzbn> Zt;
  
  private final Map<String, Object> Zm;
  
  private final Map<String, List<Zmgt>> Zq;
  
  private final Map<String, Zzbn> Zz;
  
  private Zbjr Zy;
  
  private Zzeq Z_;
  
  private static int[] Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zzvx(Zsvm paramZsvm, Zbnr paramZbnr) {
    this.Zc = paramZsvm;
    this.Zb = new LinkedHashSet<>();
    this.Zt = new ArrayList<>();
    this.Zm = new HashMap<>();
    this.Zq = new HashMap<>();
    this.Zz = new HashMap<>();
    this.Z_ = Zzeq.ZL;
    Zzbn zzbn = new Zzbn(paramZbnr.Zx().ZA(), paramZbnr.Zx().ZL(), Collections.emptyList());
    this.Zz.put(a(26672, 20322), zzbn);
    this.Zz.put(a(26678, -14153), zzbn);
    int[] arrayOfInt = ZL();
    try {
      if (paramZsvm.ZI().Zr(Zgv3.V1_BETA))
        this.Zm.put(a(26686, -10753), paramZbnr.ZG()); 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    try {
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
  }
  
  public abstract void Zf(Zx_5 paramZx_5);
  
  public abstract Ze3n ZX();
  
  public abstract Zx_5 Zf(Ztz1 paramZtz1, Map<Long, String> paramMap, List<Zlfv<? extends Zgkc>> paramList);
  
  public Zsvm Zx() {
    return this.Zc;
  }
  
  Map<String, Object> Zn() {
    return this.Zm;
  }
  
  Map<String, List<Zmgt>> ZT() {
    return this.Zq;
  }
  
  Map<String, Zzbn> Zc() {
    return this.Zz;
  }
  
  public Zzbn Zk(String paramString) {
    Zzbn zzbn = this.Zz.get(paramString);
    try {
      if (zzbn == null)
        throw new Ze41(paramString); 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    return zzbn;
  }
  
  public abstract Zzvx Zr();
  
  public List<Zzvx> ZD() {
    LinkedList<Zzvx> linkedList = new LinkedList();
    linkedList.add(Zr());
    int[] arrayOfInt = ZL();
    for (Map.Entry<String, List<Zmgt>> entry : ZT().entrySet()) {
      LinkedList<Zzvx> linkedList1 = new LinkedList();
      for (Zmgt zmgt : entry.getValue()) {
        for (Zzvx zzvx1 : linkedList) {
          Zzvx zzvx2 = zzvx1.Zr();
          zzvx2.ZB((String)entry.getKey(), zmgt.ZT(zzvx1), true);
          linkedList1.add(zzvx2);
          if (arrayOfInt != null)
            break; 
        } 
        if (arrayOfInt != null)
          break; 
      } 
      linkedList = linkedList1;
      if (arrayOfInt != null)
        break; 
    } 
    return linkedList;
  }
  
  public void ZB(String paramString, Object paramObject, boolean paramBoolean) {
    try {
      if (paramBoolean) {
        try {
          if (ZM.contains(paramString))
            throw new Ze4i(paramString); 
        } catch (Ze41 ze41) {
          throw a(null);
        } 
        try {
          if (!this.Zm.containsKey(paramString)) {
            try {
              if (this.Zz.containsKey(paramString))
                throw new Ze4u(paramString); 
            } catch (Ze41 ze41) {
              throw a(null);
            } 
          } else {
            throw new Ze4u(paramString);
          } 
        } catch (Ze41 ze41) {
          throw a(null);
        } 
      } 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    this.Zm.put(paramString, paramObject);
  }
  
  public void Zg(String paramString, Object paramObject) {
    ZB(paramString, paramObject, false);
  }
  
  public Object ZE(String paramString) {
    Object object = Zn().get(paramString);
    try {
      if (object == null)
        throw new Ze49(paramString); 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    if (object instanceof Zm3v) {
      Zm3v zm3v = (Zm3v)object;
      return zm3v.Zm(this);
    } 
    return object;
  }
  
  public abstract Zbnr ZU();
  
  public void ZE(String paramString, List<Zmgt> paramList) {
    try {
      if (this.Zq.containsKey(paramString))
        throw new Ze4u(paramString); 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    this.Zq.put(paramString, paramList);
  }
  
  public void Zt(Zzeq paramZzeq) {
    this.Z_ = paramZzeq;
  }
  
  public Zzeq Zw() {
    return this.Z_;
  }
  
  public void Zh() {
    this.Z_.ZQ();
  }
  
  public static Consumer<Zzvx> Zf(Collection<Zzbl> paramCollection) {
    return paramCollection::lambda$define$0;
  }
  
  public List<Zzbn> Zf() {
    return Zb99.ZX(this.Zt);
  }
  
  public void ZI(Zzbn paramZzbn) {
    int[] arrayOfInt = ZL();
    Optional<Zzbn> optional = this.Zt.stream().filter(paramZzbn::lambda$addResult$1).findFirst();
    try {
      if (optional.isPresent()) {
        try {
          ((Zzbn)optional.get()).ZI(paramZzbn);
          if (arrayOfInt != null) {
            this.Zt.add(paramZzbn);
            return;
          } 
        } catch (Ze41 ze41) {
          throw a(null);
        } 
        return;
      } 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    this.Zt.add(paramZzbn);
  }
  
  public Zbjr ZH() {
    return this.Zy;
  }
  
  public void Zo(Zbjr paramZbjr) {
    try {
      if (this.Zy == null)
        this.Zy = paramZbjr; 
    } catch (Ze41 ze41) {
      throw a(null);
    } 
  }
  
  public void ZT(String paramString) {
    if (paramString != null) {
      boolean bool = this.Zb.add(paramString);
      try {
        if (!bool) {
          a(26674, -10428);
          throw new IllegalArgumentException(a(26674, -10428) + a(26674, -10428) + String.join(a(26675, 2908), this.Zb) + a(26676, 17344));
        } 
      } catch (Ze41 ze41) {
        throw a(null);
      } 
    } 
  }
  
  public void ZW() {
    this.Zb.clear();
  }
  
  public void ZA() {
    Objects.requireNonNull(this.Zz);
    this.Zz.keySet().stream().filter(Zzvx::lambda$clearRepeatedDiffRequestResponses$2).toList().forEach(this.Zz::remove);
  }
  
  private static boolean lambda$clearRepeatedDiffRequestResponses$2(String paramString) {
    return paramString.startsWith(a(26677, -22602));
  }
  
  private static boolean lambda$addResult$1(Zzbn paramZzbn1, Zzbn paramZzbn2) {
    try {
      if (paramZzbn2.ZR().equals(paramZzbn1.ZR()))
        try {
          if (paramZzbn2.Zb().Za().equals(paramZzbn1.Zb().Za()));
        } catch (Ze41 ze41) {
          throw a(null);
        }  
    } catch (Ze41 ze41) {
      throw a(null);
    } 
    return false;
  }
  
  private static void lambda$define$0(Collection paramCollection, Zzvx paramZzvx) {
    int[] arrayOfInt = ZL();
    for (Zzbl zzbl : paramCollection) {
      if (zzbl instanceof Zmgt) {
        Zmgt zmgt = (Zmgt)zzbl;
        paramZzvx.ZB(zmgt.ZN(), zmgt, true);
      } 
      if (arrayOfInt != null)
        break; 
    } 
    for (Zzbl zzbl : paramCollection) {
      if (zzbl instanceof Zznd) {
        Zznd zznd = (Zznd)zzbl;
        zznd.Zk(paramZzvx);
      } 
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'sûr¬>\\fRÆGäÚYd-UcÑ^2üZ¯m»b-Õ\\f­úù¤¯ô,5ASAWÔ¦Ëd»ÇVÜ¡ÀñÙæø\\n4÷8z¾a-\\rÈzö'0>¡ãÞ`àZÀ]Eì'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zd : ([I)V
    //   22: bipush #6
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #74
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'à¾©x\\n+3¹Ø?{²'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_4
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #46
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zzvx.a : [Ljava/lang/String;
    //   135: bipush #9
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zzvx.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 263
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #121
    //   218: goto -> 247
    //   221: bipush #8
    //   223: goto -> 247
    //   226: bipush #44
    //   228: goto -> 247
    //   231: bipush #109
    //   233: goto -> 247
    //   236: iconst_2
    //   237: goto -> 247
    //   240: bipush #47
    //   242: goto -> 247
    //   245: bipush #51
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 169
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 165
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 102
    //   304: sipush #26673
    //   307: sipush #17697
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: sipush #26679
    //   316: sipush #32689
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   325: putstatic burp/Zzvx.ZM : Ljava/util/Set;
    //   328: return
  }
  
  public static void Zd(int[] paramArrayOfint) {
    Zx = paramArrayOfint;
  }
  
  public static int[] ZL() {
    return Zx;
  }
  
  private static Ze41 a(Ze41 paramZe41) {
    return paramZe41;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6836) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */