package burp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Zgbb implements Zxam {
  private final Zmgn ZC;
  
  private final PropertyChangeSupport Zq;
  
  private Zzio ZI;
  
  private List<Zxyv> Zx;
  
  private boolean ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgbb(Zmgn paramZmgn) {
    this.ZC = paramZmgn;
    this.Zq = new PropertyChangeSupport(this);
    Ztfu ztfu = new Ztfu(this);
    paramZmgn.addPropertyChangeListener(a(-13310, -9971), ztfu);
    paramZmgn.addPropertyChangeListener(a(-13312, -10164), ztfu);
    int i = Zxyv.ZO();
    this.Zx = new ArrayList<>();
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void ZO(Zzio paramZzio) {
    this.ZI = paramZzio;
  }
  
  public void Zu(PropertyChangeListener paramPropertyChangeListener) {
    this.Zq.addPropertyChangeListener(paramPropertyChangeListener);
  }
  
  public Zxyv ZB(int paramInt) {
    Zxyv zxyv = null;
    if (paramInt > -1)
      for (byte b = 0; b < this.Zx.size(); b++) {
        Zxyv zxyv1 = Zt(b);
        if (zxyv1.ZY(paramInt)) {
          if (zxyv1.ZF())
            return null; 
          zxyv = zxyv1;
          break;
        } 
      }  
    return zxyv;
  }
  
  public Zxyv Zt(int paramInt) {
    return this.Zx.get(paramInt);
  }
  
  public int Zi() {
    return this.Zx.size();
  }
  
  public Zxyv ZY(int paramInt) {
    return ZZ(this.Zx, paramInt);
  }
  
  private Zxyv ZZ(List<Zxyv> paramList, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: invokestatic ZO : ()I
    //   6: aload_1
    //   7: invokeinterface size : ()I
    //   12: iconst_1
    //   13: isub
    //   14: istore #5
    //   16: istore_3
    //   17: iload #4
    //   19: iload #5
    //   21: if_icmpgt -> 107
    //   24: iload #4
    //   26: iload #5
    //   28: iadd
    //   29: iconst_1
    //   30: ishr
    //   31: istore #6
    //   33: aload_1
    //   34: iload #6
    //   36: invokeinterface get : (I)Ljava/lang/Object;
    //   41: checkcast burp/Zxyv
    //   44: astore #7
    //   46: aload #7
    //   48: invokevirtual Zp : ()I
    //   51: istore #8
    //   53: iload_2
    //   54: iload #8
    //   56: if_icmpne -> 62
    //   59: aload #7
    //   61: areturn
    //   62: iload_2
    //   63: iload #8
    //   65: if_icmpge -> 78
    //   68: iload #6
    //   70: iconst_1
    //   71: isub
    //   72: istore #5
    //   74: iload_3
    //   75: ifeq -> 103
    //   78: aload #7
    //   80: invokevirtual Zl : ()I
    //   83: istore #9
    //   85: iload_2
    //   86: iload #9
    //   88: if_icmplt -> 101
    //   91: iload #6
    //   93: iconst_1
    //   94: iadd
    //   95: istore #4
    //   97: iload_3
    //   98: ifeq -> 103
    //   101: aconst_null
    //   102: areturn
    //   103: iload_3
    //   104: ifeq -> 17
    //   107: aconst_null
    //   108: areturn
  }
  
  public int ZZ(int paramInt, boolean paramBoolean) {
    int j = 0;
    Iterator<Zxyv> iterator = this.Zx.iterator();
    int i = Zxyv.Zk();
    while (iterator.hasNext()) {
      Zxyv zxyv = iterator.next();
      int k = paramBoolean ? (paramInt + j) : paramInt;
      if (zxyv.Zp() >= k)
        break; 
      j += ZI(zxyv, k);
      if (i == 0)
        break; 
    } 
    return j;
  }
  
  private int ZI(Zxyv paramZxyv, int paramInt) {
    int i = 0;
    if (paramZxyv.Zl() < paramInt || (paramZxyv.ZF() && paramZxyv.Zp() < paramInt))
      i = paramZxyv.Zc(); 
    return i;
  }
  
  public int Zh() {
    int i = this.ZC.getLineCount() - 1;
    if (ZB()) {
      int j = Zi();
      if (j > 0) {
        Zxyv zxyv = Zt(j - 1);
        if (zxyv.Zw(i) && zxyv.ZF())
          i = zxyv.Zp(); 
      } 
    } 
    return i;
  }
  
  public boolean ZZ() {
    return this.ZE;
  }
  
  public boolean ZB() {
    return (this.ZE && this.ZI != null);
  }
  
  public boolean ZN(int paramInt) {
    int i = Zxyv.Zk();
    for (Zxyv zxyv : this.Zx) {
      if (zxyv.Zw(paramInt))
        return zxyv.ZF(); 
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  private void ZO(Zxyv paramZxyv, List<Zxyv> paramList) {
    int i = Collections.binarySearch((List)paramList, paramZxyv);
    if (i >= 0) {
      Zxyv zxyv = paramList.get(i);
      paramZxyv.Zg(zxyv.ZF());
    } 
  }
  
  private void ZR(List<Zxyv> paramList) {
    int i = Zxyv.Zk();
    for (Zxyv zxyv : paramList) {
      ZO(zxyv, this.Zx);
      if (i == 0)
        break; 
    } 
  }
  
  public Set<Integer> Zz() {
    // Byte code:
    //   0: new java/util/HashSet
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZO : ()I
    //   11: aload_0
    //   12: getfield Zx : Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: istore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 118
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zxyv
    //   40: astore #4
    //   42: aload #4
    //   44: invokevirtual ZF : ()Z
    //   47: ifeq -> 100
    //   50: aload #4
    //   52: invokevirtual Zp : ()I
    //   55: iconst_1
    //   56: iadd
    //   57: istore #5
    //   59: aload #4
    //   61: invokevirtual Zl : ()I
    //   64: istore #6
    //   66: iload #5
    //   68: istore #7
    //   70: iload #7
    //   72: iload #6
    //   74: if_icmpgt -> 96
    //   77: aload_2
    //   78: iload #7
    //   80: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   83: invokeinterface add : (Ljava/lang/Object;)Z
    //   88: pop
    //   89: iinc #7, 1
    //   92: iload_1
    //   93: ifeq -> 70
    //   96: iload_1
    //   97: ifeq -> 114
    //   100: aload_2
    //   101: new java/util/HashSet
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   113: pop
    //   114: iload_1
    //   115: ifeq -> 22
    //   118: aload_2
    //   119: areturn
  }
  
  public void Zo(PropertyChangeListener paramPropertyChangeListener) {
    this.Zq.removePropertyChangeListener(paramPropertyChangeListener);
  }
  
  public void ZN() {
    int i = Zxyv.Zk();
    if (this.ZE && this.ZI != null) {
      List<Zxyv> list = this.ZI.Zl(this.ZC);
      ZR(list);
      this.Zx = list;
      this.Zq.firePropertyChange(a(-13309, -10138), (Object)null, this.Zx);
      this.ZC.repaint();
      if (i == 0) {
        this.Zx.clear();
        return;
      } 
      return;
    } 
    this.Zx.clear();
  }
  
  public void Zd(boolean paramBoolean) {
    if (paramBoolean != this.ZE) {
      this.ZE = paramBoolean;
      if (!paramBoolean) {
        this.Zx = Collections.emptyList();
        this.ZC.repaint();
      } 
      this.Zq.firePropertyChange(a(-13309, -10138), (Object)null, (Object)null);
    } 
  }
  
  public void ZR() {
    ZX(Zgbb::lambda$collapseAllFolds$0);
  }
  
  public void ZK() {
    ZX(Zxyv::ZF);
  }
  
  private void ZX(Predicate<Zxyv> paramPredicate) {
    boolean bool = false;
    Iterator<Zxyv> iterator = this.Zx.iterator();
    int i = Zxyv.ZO();
    while (iterator.hasNext()) {
      Zxyv zxyv = iterator.next();
      if (paramPredicate.test(zxyv)) {
        zxyv.Zh();
        bool = true;
      } 
      if (i != 0)
        break; 
    } 
    if (bool) {
      this.ZC.repaint();
      this.Zq.firePropertyChange(a(-13311, 10012), (Object)null, this.Zx);
    } 
  }
  
  private static boolean lambda$collapseAllFolds$0(Zxyv paramZxyv) {
    return !paramZxyv.ZF();
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'R'÷þ^Áv¿Ûà\\ffÂÆ©Èjï1«L'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #16
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #75
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
    //   67: ldc 'Ê^{Ø¯ò(Ï\\fóÖ5ØñÌ¤X¼'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_3
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
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zgbb.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zgbb.b : [Ljava/lang/String;
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
    //   208: bipush #100
    //   210: goto -> 240
    //   213: bipush #103
    //   215: goto -> 240
    //   218: bipush #70
    //   220: goto -> 240
    //   223: bipush #107
    //   225: goto -> 240
    //   228: bipush #9
    //   230: goto -> 240
    //   233: bipush #89
    //   235: goto -> 240
    //   238: bipush #49
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
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCC02) & 0xFFFF;
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
      char c = 'é';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */