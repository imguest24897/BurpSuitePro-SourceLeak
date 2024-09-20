package burp;

import java.util.ArrayList;
import java.util.List;

public class Ztm5 {
  private final List<Zsvc> ZN;
  
  private final List<Zsvc> ZV;
  
  private final Ztta Zy;
  
  private int Zk = 0;
  
  private static int ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztm5(List<Zsvc> paramList, Ztta paramZtta) {
    int i = Zl();
    this.ZN = paramList;
    this.Zy = paramZtta;
    this.ZV = new ArrayList<>();
    while (this.Zk < paramList.size() && paramZtta.Zp(Zk())) {
      this.Zk++;
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      ZE(++i); 
  }
  
  public Zsvc Zk() {
    return !this.ZV.isEmpty() ? this.ZV.get(0) : ((this.Zk >= this.ZN.size()) ? null : this.ZN.get(this.Zk));
  }
  
  public void Zq() {
    if (ZL())
      return; 
    do {
      this.Zk++;
    } while (this.Zk < this.ZN.size() && this.Zy.Zp(Zk()));
  }
  
  public void ZJ(Zsvc paramZsvc) {
    this.ZV.add(paramZsvc);
  }
  
  public Zsvc ZK() {
    int i = Zl();
    int j = this.Zk - 1;
    while (j >= 0 && this.Zy.Zp(this.ZN.get(j))) {
      j--;
      if (i == 0)
        break; 
    } 
    return (j >= 0) ? this.ZN.get(j) : null;
  }
  
  public Zsvc Zv(int paramInt) {
    return (paramInt > this.Zk) ? null : this.ZN.get(this.Zk - paramInt);
  }
  
  private boolean ZL() {
    if (!this.ZV.isEmpty()) {
      this.ZV.remove(0);
      return true;
    } 
    return false;
  }
  
  public String Zz() {
    int i = Zl();
    int j = this.Zk;
    if (j >= this.ZN.size())
      j = this.ZN.size() - 1; 
    int k = Zf(j, 3);
    int m = ZA(j, 3);
    StringBuilder stringBuilder = new StringBuilder();
    int n = k;
    while (n < j) {
      Zsvc zsvc1 = this.ZN.get(n);
      stringBuilder.append(zsvc1.Zy.substring(zsvc1.ZH, zsvc1.ZJ)).append(' ');
      n++;
      if (i == 0) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    Zsvc zsvc = this.ZN.get(j);
    stringBuilder.append(a(20667, 13448)).append(zsvc.Zy.substring(zsvc.ZH, zsvc.ZJ)).append(a(20666, -30606));
    n = j + 1;
    while (n < m) {
      zsvc = this.ZN.get(n);
      stringBuilder.append(zsvc.Zy.substring(zsvc.ZH, zsvc.ZJ)).append(' ');
      n++;
      if (i == 0)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  private int Zf(int paramInt1, int paramInt2) {
    int i = Zl();
    while (paramInt1 > 0 && paramInt2 > 0) {
      if (((Zsvc)this.ZN.get(paramInt1)).ZE == Zgho.LINE_TERMINATOR)
        paramInt2--; 
      paramInt1--;
      if (i == 0)
        break; 
    } 
    return paramInt1;
  }
  
  private int ZA(int paramInt1, int paramInt2) {
    int i = Zd();
    while (paramInt1 < this.ZN.size() && paramInt2 >= 0) {
      if (((Zsvc)this.ZN.get(paramInt1)).ZE == Zgho.LINE_TERMINATOR)
        paramInt2--; 
      paramInt1++;
      if (i != 0)
        break; 
    } 
    return paramInt1;
  }
  
  public static void ZE(int paramInt) {
    ZO = paramInt;
  }
  
  public static int Zd() {
    return ZO;
  }
  
  public static int Zl() {
    int i = Zd();
    return (i == 0) ? 82 : 0;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic ZE : (I)V
    //   12: ldc '&¥àÏí°B³KÙ'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #6
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #41
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic burp/Ztm5.a : [Ljava/lang/String;
    //   76: iconst_2
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Ztm5.b : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #80
    //   158: goto -> 188
    //   161: bipush #37
    //   163: goto -> 188
    //   166: bipush #58
    //   168: goto -> 188
    //   171: bipush #84
    //   173: goto -> 188
    //   176: bipush #61
    //   178: goto -> 188
    //   181: bipush #84
    //   183: goto -> 188
    //   186: bipush #54
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
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
    //   228: goto -> 43
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x50BA) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztm5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */