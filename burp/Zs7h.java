package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.Zto;
import net.portswigger.Zzc;

class Zs7h {
  private final List<Zzq3> ZJ = new LinkedList<>();
  
  private final Zzq3 ZI = Zzq3.ZJ(this.ZJ);
  
  private final boolean Zo;
  
  private final boolean Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zs7h(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) {
    this((Collection)Collections.singleton(paramArrayOfbyte), paramBoolean1, paramBoolean2);
  }
  
  public Zs7h(Collection<byte[]> paramCollection, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zo = paramBoolean1;
    this.Zd = paramBoolean2;
    this.ZJ.add(this.ZI);
    for (byte[] arrayOfByte : paramCollection) {
      if (paramBoolean1)
        arrayOfByte = ZF(arrayOfByte); 
      ZB(arrayOfByte);
    } 
    ZQ();
    Zp();
  }
  
  Zzrd ZB() {
    return Zzrr.ZB(this.ZI);
  }
  
  private void ZB(byte[] paramArrayOfbyte) {
    Zzq3 zzq3 = this.ZI;
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      Zzq3 zzq31;
      int i = paramArrayOfbyte[b] & 0xFF;
      if (b < paramArrayOfbyte.length - 1) {
        zzq31 = zzq3.ZV(this.ZJ, i);
      } else {
        zzq31 = zzq3.Zt(this.ZJ, i, true, null);
      } 
      zzq3 = zzq31;
    } 
  }
  
  private void ZQ() {
    LinkedList<Zto> linkedList = new LinkedList();
    linkedList.add(Zto.ZM(this.ZI, new Zzzz()));
    byte b = 0;
    while (!linkedList.isEmpty()) {
      Zto zto = linkedList.poll();
      Zzq3 zzq3 = (Zzq3)zto.Zq;
      Zzzz zzzz = (Zzzz)zto.Zo;
      if ((zzq3 == this.ZI && b++ != 0) || zzq3.Zr())
        continue; 
      for (byte b1 = 0; b1 < (zzq3.Zd()).length; b1++) {
        Zzq3 zzq31 = zzq3.Zd()[b1];
        if (zzq31.Za(zzq3) > 0)
          linkedList.add(Zto.ZM(zzq31, zzzz.Zp(b1))); 
      } 
      ZK(zzq3, zzzz);
    } 
  }
  
  private void ZK(Zzq3 paramZzq3, Zzzz paramZzzz) {
    for (byte b = 1; b <= paramZzzz.Zt(); b++)
      Za(paramZzq3, paramZzzz, b); 
  }
  
  private void Za(Zzq3 paramZzq3, Zzzz paramZzzz, int paramInt) {
    Zzq3 zzq3 = this.ZI;
    int i;
    for (i = paramInt; i < paramZzzz.Zt(); i++) {
      int j = paramZzzz.ZV(i);
      if (zzq3.Zd()[j] == this.ZI)
        return; 
      zzq3 = zzq3.Zd()[j];
    } 
    for (i = 0; i < (zzq3.Zd()).length; i++) {
      Zzq3 zzq31 = zzq3.Zd()[i];
      if (zzq31 != this.ZI && paramZzq3.Zd()[i] == this.ZI)
        paramZzq3.Zt(this.ZJ, i, false, zzq31); 
    } 
  }
  
  private void Zp() {
    LinkedList<Zzq3> linkedList = new LinkedList<>(this.ZJ);
    for (Zzq3 zzq3 : linkedList) {
      if (!zzq3.Zr()) {
        Zzq3[] arrayOfZzq3 = zzq3.Zd();
        for (byte b = 0; b < arrayOfZzq3.length; b++) {
          Zzq3 zzq31 = arrayOfZzq3[b];
          if (zzq31 != this.ZI) {
            if (this.Zo)
              Zg(b, zzq3, zzq31); 
            if (this.Zd)
              Zc(b, zzq3, zzq31); 
          } 
        } 
      } 
    } 
    if (this.Zd) {
      linkedList = new LinkedList<>(this.ZJ);
      int i = linkedList.stream().mapToInt(Zzq3::Za).max().orElse(-1);
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (Zzq3 zzq3 : linkedList) {
        if (!zzq3.Zr()) {
          Zzq3[] arrayOfZzq3 = zzq3.Zd();
          for (byte b = 0; b < arrayOfZzq3.length; b++) {
            Zzq3 zzq31 = arrayOfZzq3[b];
            if (zzq31 != this.ZI && zzq31.Za() <= i) {
              Map<Zzzz, Zzq3> map = ZK(b, zzq3, zzq31);
              for (Map.Entry<Zzzz, Zzq3> entry : map.entrySet()) {
                Zzzz zzzz = (Zzzz)entry.getKey();
                Zzq3 zzq32 = (Zzq3)entry.getValue();
                if (!hashMap.containsKey(zzzz))
                  hashMap.put(zzzz, new HashSet()); 
                ((Set<Zzq3>)hashMap.get(zzzz)).add(zzq32);
              } 
              map = Zw(b, zzq3, zzq31);
              for (Map.Entry<Zzzz, Zzq3> entry : map.entrySet()) {
                Zzzz zzzz = (Zzzz)entry.getKey();
                Zzq3 zzq32 = (Zzq3)entry.getValue();
                if (!hashMap.containsKey(zzzz))
                  hashMap.put(zzzz, new HashSet()); 
                ((Set<Zzq3>)hashMap.get(zzzz)).add(zzq32);
              } 
            } 
          } 
        } 
      } 
      for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
        Zzzz zzzz = (Zzzz)entry.getKey();
        Set set = (Set)entry.getValue();
        for (Zzq3 zzq31 : set) {
          Zzq3 zzq32 = this.ZI;
          byte b;
          for (b = 0; b < zzzz.Zt(); b++) {
            int j = zzzz.ZV(b);
            zzq32 = zzq32.Zd()[j];
          } 
          for (b = 0; b < (zzq32.Zd()).length; b++) {
            Zzq3 zzq3 = zzq32.Zd()[b];
            if (zzq3 != this.ZI && zzq31.Zd()[b] == this.ZI)
              zzq31.Zo(b, zzq3); 
          } 
        } 
      } 
    } 
  }
  
  private static void Zg(int paramInt, Zzq3 paramZzq31, Zzq3 paramZzq32) {
    if (paramInt >= 97 && paramInt <= 122) {
      int i = paramInt - 32;
      paramZzq31.Zo(i, paramZzq32);
    } 
  }
  
  private static byte[] ZF(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = (byte[])paramArrayOfbyte.clone();
    for (byte b = 0; b < arrayOfByte.length; b++) {
      byte b1 = arrayOfByte[b];
      if (b1 >= 65 && b1 <= 90)
        arrayOfByte[b] = (byte)(b1 + 32); 
    } 
    return arrayOfByte;
  }
  
  private static void Zc(int paramInt, Zzq3 paramZzq31, Zzq3 paramZzq32) {
    if (paramInt == 32)
      paramZzq31.Zo(43, paramZzq32); 
  }
  
  private Map<Zzzz, Zzq3> ZK(int paramInt, Zzq3 paramZzq31, Zzq3 paramZzq32) {
    int i;
    int j;
    HashMap<Object, Object> hashMap = new HashMap<>();
    Zzq3 zzq31 = paramZzq31.Zd()[37];
    if (zzq31 == this.ZI) {
      zzq31 = Zzq3.Zd(this.ZJ, this.ZI, false);
      paramZzq31.Zo(37, zzq31);
      hashMap.put(new Zzzz(), zzq31);
    } 
    byte[] arrayOfByte = Integer.toString(paramInt, 16).getBytes();
    if (arrayOfByte.length == 1) {
      i = 48;
      j = arrayOfByte[0] & 0xFF;
    } else {
      i = arrayOfByte[0] & 0xFF;
      j = arrayOfByte[1] & 0xFF;
    } 
    Zzq3 zzq32 = zzq31.Zd()[i];
    if (zzq32 == this.ZI) {
      zzq32 = Zzq3.Zd(this.ZJ, this.ZI, false);
      hashMap.put((new Zzzz()).Zp(i), zzq32);
      zzq31.Zo(i, zzq32);
      Zg(i, zzq31, zzq32);
    } 
    zzq32.Zo(j, paramZzq32);
    Zg(j, zzq32, paramZzq32);
    return (Map)hashMap;
  }
  
  private Map<Zzzz, Zzq3> Zw(int paramInt, Zzq3 paramZzq31, Zzq3 paramZzq32) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    List<String> list = Zy(paramInt);
    for (String str : list) {
      byte[] arrayOfByte = str.getBytes();
      Zzq3 zzq3 = paramZzq31;
      for (byte b = 0; b < arrayOfByte.length; b++) {
        int i = arrayOfByte[b] & 0xFF;
        boolean bool = (b == arrayOfByte.length - 1) ? true : false;
        if (!bool) {
          Zzq3 zzq31 = zzq3.Zd()[i];
          if (zzq31 == this.ZI) {
            zzq31 = Zzq3.Zd(this.ZJ, this.ZI, false);
            Zzzz zzzz = new Zzzz();
            for (byte b1 = 1; b1 <= b; b1++)
              zzzz.Zp(arrayOfByte[b1]); 
            hashMap.put(zzzz, zzq31);
            zzq3.Zo(i, zzq31);
            Zg(i, zzq3, zzq31);
          } 
          zzq3 = zzq31;
        } else {
          zzq3.Zo(i, paramZzq32);
        } 
      } 
    } 
    return (Map)hashMap;
  }
  
  private List<String> Zy(int paramInt) {
    LinkedList<String> linkedList = new LinkedList();
    linkedList.add(Zzc.Zb(String.valueOf((char)paramInt)));
    switch (paramInt) {
      case 32:
        linkedList.add(a(-7013, 20201));
        break;
      case 34:
        linkedList.add(a(-7010, 17345));
        break;
      case 39:
        linkedList.add(a(-7011, -3711));
        break;
      case 60:
        linkedList.add(a(-7012, -14900));
        break;
      case 62:
        linkedList.add(a(-7014, 8453));
        break;
      case 38:
        linkedList.add(a(-7009, -5871));
        break;
    } 
    return linkedList;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '*»÷Rç`Àç²Ô]dC D33L'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'òÿT`û¸'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #125
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zs7h.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zs7h.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #104
    //   219: goto -> 244
    //   222: bipush #92
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #86
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE49E) & 0xFFFF;
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
      byte b1 = 100;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */