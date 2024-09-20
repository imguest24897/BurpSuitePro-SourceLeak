package burp;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Zrud {
  private final Zb_j ZU;
  
  private final Zs4c Zx;
  
  private final String ZS;
  
  private final String ZO;
  
  private final List<Ze9e> ZG;
  
  private Zgxg ZR = Zrud::lambda$new$0;
  
  private static Zbqc[] ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrud(Zb_j paramZb_j, Zs4c paramZs4c, String paramString) {
    this.ZU = paramZb_j;
    this.Zx = paramZs4c;
    String str = Zsk5.Zd();
    this.ZS = a(-28402, 3756) + a(-28402, 3756);
    this.ZO = a(-28401, 13800) + a(-28401, 13800);
    this.ZG = new CopyOnWriteArrayList<>();
    Zbqc[] arrayOfZbqc = Za();
    if (paramString != null)
      ZU(new Ze9e(paramString, paramString)); 
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void Zq(boolean paramBoolean) {
    this.ZU.ZV(this.ZS, Boolean.toString(paramBoolean));
  }
  
  public Ze9e Zz() {
    Ze9e ze9e = Zr();
    return (ze9e != null) ? ze9e : Ze9e.Zt;
  }
  
  private Ze9e Zr() {
    return Ze9e.Zz(this.ZU.Zn(this.ZO));
  }
  
  public void ZU(Ze9e paramZe9e) {
    Zbqc[] arrayOfZbqc = Za();
    if (Ze9e.Zt.equals(paramZe9e)) {
      this.ZU.ZB(this.ZO);
      if (arrayOfZbqc == null) {
        this.ZU.ZV(this.ZO, paramZe9e.Zl());
        return;
      } 
      return;
    } 
    this.ZU.ZV(this.ZO, paramZe9e.Zl());
  }
  
  public boolean ZN() {
    if (!Zsht.ZQ())
      return false; 
    String str = this.ZU.Zn(this.ZS);
    return (str == null) ? this.Zx.ZD(new String[] { a(-28404, -28551) }).ZC(a(-28403, 7859), true) : Boolean.parseBoolean(str);
  }
  
  public Zlaq ZZ() {
    return new Zlaq(new Zmu1(this), Zlal.Zf);
  }
  
  public void Zx(Ze9e paramZe9e) {
    if (Zr() == null)
      ZU(paramZe9e); 
    this.ZR.ZK();
  }
  
  public void Ze(List<Ze9e> paramList) {
    Zbqc[] arrayOfZbqc = Za();
    synchronized (this.ZG) {
      this.ZG.clear();
      this.ZG.addAll(paramList);
    } 
    this.ZR.ZK();
    if (Zbqc.Zwu() == null)
      ZD(new Zbqc[1]); 
  }
  
  public List<Ze9e> Zg() {
    synchronized (this.ZG) {
      if (this.ZG.isEmpty())
        return Ze9e.Zt.equals(Zz()) ? Collections.<Ze9e>emptyList() : Collections.<Ze9e>singletonList(Zz()); 
      return this.ZG;
    } 
  }
  
  public void ZX(Zgxg paramZgxg) {
    this.ZR = paramZgxg;
  }
  
  private static void lambda$new$0() {}
  
  public static void ZD(Zbqc[] paramArrayOfZbqc) {
    ZP = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return ZP;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_1
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic ZD : ([Lburp/Zbqc;)V
    //   15: ldc '%ÉBÀÁÙUÝïÉlg@jºYB±Üï6edþBdx'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #20
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #89
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '3ç«:ó¦.Ø­gÇÑ¿è"+#{©z®`ÙdG'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #19
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #85
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 148
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zrud.a : [Ljava/lang/String;
    //   138: iconst_4
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zrud.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #18
    //   218: goto -> 248
    //   221: bipush #71
    //   223: goto -> 248
    //   226: bipush #73
    //   228: goto -> 248
    //   231: bipush #67
    //   233: goto -> 248
    //   236: bipush #60
    //   238: goto -> 248
    //   241: bipush #16
    //   243: goto -> 248
    //   246: bipush #93
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 46, 0 -> 105
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF910F) & 0xFFFF;
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
      char c = 'Á';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrud.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */