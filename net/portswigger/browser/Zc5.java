package net.portswigger.browser;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zd4;
import net.portswigger.Zfb;
import net.portswigger.Zi7;
import net.portswigger.Zqf;
import net.portswigger.Zrmq;
import net.portswigger.Zuh;
import net.portswigger.Zv3;

public class Zc5 implements Iterable<Zd_> {
  private final Zdr Zm;
  
  private final List<Zd_> Zp;
  
  private static int Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zc5(Zdr paramZdr, List<Zd_> paramList) {
    this.Zm = paramZdr;
    this.Zp = new LinkedList<>(paramList);
  }
  
  public void Zo(int paramInt, Zd_ paramZd_) {
    this.Zp.add(paramInt, paramZd_);
  }
  
  public void Zx(int paramInt, Zd_ paramZd_) {
    this.Zp.set(paramInt, paramZd_);
  }
  
  public void ZQ(int paramInt) {
    this.Zp.remove(paramInt);
  }
  
  public Iterator<Zd_> iterator() {
    return this.Zp.iterator();
  }
  
  public static Zc5 Zr(Zdt... paramVarArgs) throws Zcy {
    return Zu((List<Zer>)Arrays.<Zdt>stream(paramVarArgs).map(Zdt::Zd).collect(Collectors.toList()));
  }
  
  public static Zc5 Zu(List<Zer> paramList) throws Zcy {
    try {
      if (paramList.isEmpty())
        throw new Zcy(a(8048, 16)); 
    } catch (Zcy zcy) {
      throw a(null);
    } 
    Zch zch = new Zch();
    paramList.forEach(zch::lambda$from$0);
    return zch.ZK();
  }
  
  public static Zc5 Zr(String paramString) throws Zcy {
    LinkedList<Zer> linkedList = new LinkedList();
    Zrmq zrmq = Zv3.Zx(paramString);
    int i = Zr();
    try {
      if (!zrmq.Zw())
        throw new Zcy(a(8049, -4972)); 
    } catch (Zcy zcy) {
      throw a(null);
    } 
    for (Zi7 zi7 : zrmq.ZT().ZO()) {
      Optional<Zer> optional = Zer.ZJ(zi7);
      Objects.requireNonNull(linkedList);
      optional.ifPresent(linkedList::add);
      if (i == 0)
        break; 
    } 
    return Zu(linkedList);
  }
  
  public String ZL() {
    Zfb zfb = Zv3.ZG();
    zfb.Zh((Zd4)this.Zm.ZA(Zv3.ZU()));
    Iterator<Zd_> iterator = this.Zp.iterator();
    int i = ZP();
    while (iterator.hasNext()) {
      Zd_ zd_ = iterator.next();
      Zi7 zi7 = zd_.ZA(Zv3.ZU());
      zfb.Zh((Zd4)zi7);
      if (i != 0)
        break; 
    } 
    return zfb.Zo().ZM(4).toString();
  }
  
  public Zdr Zv() {
    return this.Zm;
  }
  
  public Zd_ Zm() {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zuh.Zb(!this.Zp.isEmpty(), Zqf.Zr);
    return this.Zp.removeFirst();
  }
  
  public boolean Zb() {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !this.Zp.isEmpty();
  }
  
  private static void lambda$from$0(Zch paramZch, Zer paramZer) {
    // Byte code:
    //   0: invokestatic ZP : ()I
    //   3: aload_1
    //   4: dup
    //   5: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8: pop
    //   9: astore_3
    //   10: istore_2
    //   11: iconst_0
    //   12: istore #4
    //   14: aload_3
    //   15: iload #4
    //   17: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   22: lookupswitch default -> 48, 0 -> 62, 1 -> 79
    //   48: new java/lang/MatchException
    //   51: dup
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   57: athrow
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_3
    //   63: checkcast net/portswigger/browser/Zd_
    //   66: astore #5
    //   68: aload_0
    //   69: aload #5
    //   71: invokevirtual Ze : (Lnet/portswigger/browser/Zd_;)Lnet/portswigger/browser/Zch;
    //   74: pop
    //   75: iload_2
    //   76: ifeq -> 92
    //   79: aload_3
    //   80: checkcast net/portswigger/browser/Zdr
    //   83: astore #6
    //   85: aload_0
    //   86: aload #6
    //   88: invokevirtual Zf : (Lnet/portswigger/browser/Zdr;)Lnet/portswigger/browser/Zch;
    //   91: pop
    //   92: return
    // Exception table:
    //   from	to	target	type
    //   14	58	58	java/lang/MatchException
  }
  
  public static void Zv(int paramInt) {
    Zi = paramInt;
  }
  
  public static int Zr() {
    return Zi;
  }
  
  public static int ZP() {
    int i = Zr();
    try {
      if (i == 0)
        return 99; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: bipush #113
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zv : (I)V
    //   13: ldc ' ý"ï£®kÕû³P!õÔÑÆ@°ÐCÜ©ÌÈÚ^ÞWâÛ¿æ]¸&£ÎMJÐ,QQ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #17
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #126
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
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
    //   72: aload #5
    //   74: putstatic net/portswigger/browser/Zc5.a : [Ljava/lang/String;
    //   77: iconst_2
    //   78: anewarray java/lang/String
    //   81: putstatic net/portswigger/browser/Zc5.b : [Ljava/lang/String;
    //   84: goto -> 231
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 204
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #77
    //   158: goto -> 188
    //   161: bipush #54
    //   163: goto -> 188
    //   166: bipush #66
    //   168: goto -> 188
    //   171: bipush #97
    //   173: goto -> 188
    //   176: bipush #104
    //   178: goto -> 188
    //   181: bipush #41
    //   183: goto -> 188
    //   186: bipush #69
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 110
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 106
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
    //   228: goto -> 44
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1F70) & 0xFFFF;
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
      byte b1 = 110;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zc5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */