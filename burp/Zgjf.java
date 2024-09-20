package burp;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgjf implements Zm3g {
  private final Zbw_<?> Zo;
  
  private final Zkl6 Zb;
  
  private final Ztwv Zx;
  
  private final Zr_4 Zg;
  
  private final Zxzw ZE;
  
  private final Ze5r<Zs9s, Zg5n> ZJ;
  
  private final Zt_4 ZP;
  
  private final Zlb7 ZR;
  
  private final Zmxj ZY;
  
  private final Ze_h ZO;
  
  private boolean Zr;
  
  private static int ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgjf(Zkrw paramZkrw, Zbw_<?> paramZbw_, Zefg<Zg5n> paramZefg, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_4, Zlb7 paramZlb7, Zmxj paramZmxj, Ze_h paramZe_h) {
    this.Zo = paramZbw_;
    this.Zb = paramZkl6;
    this.Zx = paramZtwv;
    this.Zg = paramZr_4;
    this.ZR = paramZlb7;
    this.ZY = paramZmxj;
    this.ZO = paramZe_h;
    int i = Zi();
    ArrayList<Zb2z> arrayList = new ArrayList();
    this.ZE = new Zryn(this, paramZkrw);
    try {
      for (Zg5n zg5n : paramZefg) {
        try {
          arrayList.add(new Zb2z(zg5n, paramZkl6, paramZtwv, paramZlb7, paramZbw_.ZFY(), paramZbw_.ZF0(), this.ZE, null));
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.UNEXPECTED);
        } 
        if (i == 0)
          break; 
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    try {
      this.ZJ = new Ze5r<>((List)arrayList, paramZefg);
      this.ZP = new Zt_4(this.ZJ);
      this.ZP.fireTableDataChanged();
      paramZbw_.ZF(this);
      if (Zbqc.Zwu() == null)
        ZK(++i); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  public Zt_4 ZM() {
    return this.ZP;
  }
  
  public boolean ZJ(int paramInt, Window paramWindow) {
    Zs9s zs9s = this.ZJ.ZV(paramInt);
    if (!zs9s.Zc()) {
      boolean bool = zs9s.Zy(paramWindow);
      this.ZO.Zo(zs9s);
      this.ZP.fireTableCellUpdated(paramInt, 0);
      return bool;
    } 
    return true;
  }
  
  public void ZX(int paramInt, Window paramWindow) {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZJ : Lburp/Ze5r;
    //   8: iload_1
    //   9: invokevirtual ZV : (I)Lburp/Zgd8;
    //   12: checkcast burp/Zs9s
    //   15: astore #4
    //   17: aload #4
    //   19: invokeinterface Zc : ()Z
    //   24: ifeq -> 38
    //   27: aload #4
    //   29: invokeinterface Zw : ()V
    //   34: iload_3
    //   35: ifne -> 56
    //   38: aload #4
    //   40: aload_2
    //   41: invokeinterface Zy : (Ljava/awt/Window;)Z
    //   46: pop
    //   47: aload_0
    //   48: getfield ZO : Lburp/Ze_h;
    //   51: aload #4
    //   53: invokevirtual Zo : (Lburp/Zs9s;)V
    //   56: aload_0
    //   57: getfield ZP : Lburp/Zt_4;
    //   60: iload_1
    //   61: iconst_0
    //   62: invokevirtual fireTableCellUpdated : (II)V
    //   65: return
  }
  
  public void Zc() {
    this.ZJ.forEach(this::lambda$startEnabledListeners$0);
    this.Zr = true;
  }
  
  public void ZZ() {
    this.ZJ.forEach(Zgjf::lambda$stopEnabledListeners$1);
  }
  
  public boolean Zd() {
    return this.ZJ.Zo(Zs9s::Zc);
  }
  
  public int Zz() {
    return this.ZJ.ZG();
  }
  
  public void ZU(Zs9s paramZs9s, Window paramWindow, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zx : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: iload_3
    //   8: <illegal opcode> run : (Lburp/Zgjf;Lburp/Zs9s;Ljava/awt/Window;Z)Ljava/lang/Runnable;
    //   13: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   18: pop
    //   19: return
  }
  
  public void Zf(Zs9s paramZs9s1, Zs9s paramZs9s2, Window paramWindow, boolean paramBoolean) {
    if (paramZs9s1.Zb() && !paramZs9s2.Zb())
      this.ZY.Zp(); 
    paramZs9s1.Zp(paramZs9s2, paramWindow);
    ZL(paramZs9s1, paramWindow, paramBoolean);
    this.ZP.Zy(paramZs9s1);
  }
  
  private void ZL(Zs9s paramZs9s, Window paramWindow, boolean paramBoolean) {
    if (paramBoolean && !paramZs9s.Zc())
      paramZs9s.Zy(paramWindow); 
    this.Zo.ZFv();
    this.ZO.Zo(paramZs9s);
  }
  
  public void Zk(int paramInt) {
    Zs9s zs9s = this.ZJ.Zf(paramInt);
    if (zs9s.Zc())
      zs9s.Zw(); 
    this.ZP.fireTableRowsDeleted(paramInt, paramInt);
  }
  
  public Zs9s ZQ(int paramInt) {
    return this.ZJ.ZV(paramInt);
  }
  
  public void Zl(Zg4j paramZg4j) {
    Zzqw zzqw = paramZg4j.ZP(a(22691, -8487));
    Iterator<Zs9s> iterator = this.ZJ.Za().iterator();
    int i = Zi();
    while (iterator.hasNext()) {
      Zs9s zs9s = iterator.next();
      zs9s.ZC(zzqw);
      if (i == 0)
        break; 
    } 
  }
  
  public void Zd(Zmf_ paramZmf_) {
    if (paramZmf_.Zh(a(22690, -17937))) {
      List<?> list = paramZmf_.Zs(a(22691, -8487), new Zl7w(this));
      Zs((List)list);
    } 
  }
  
  private void Zs(List<Zs9s> paramList) {
    if (paramList != null) {
      ZZ();
      this.ZJ.Zd(paramList);
      this.ZP.fireTableDataChanged();
      if (this.Zr)
        Zc(); 
      this.ZP.fireTableDataChanged();
      this.Zo.ZFv();
    } 
  }
  
  public void Zf(int paramInt) {
    Zs9s zs9s = this.ZJ.ZV(paramInt);
    if (zs9s.Zb())
      this.ZY.Zp(); 
    zs9s.ZG(!zs9s.Zb());
    this.ZP.fireTableCellUpdated(paramInt, 6);
  }
  
  private void lambda$listenerAdded$2(Zs9s paramZs9s, Window paramWindow, boolean paramBoolean) {
    this.ZJ.Ze(paramZs9s);
    ZL(paramZs9s, paramWindow, paramBoolean);
    this.ZP.fireTableRowsInserted(this.ZJ.ZG() - 1, this.ZJ.ZG() - 1);
  }
  
  private static void lambda$stopEnabledListeners$1(Zs9s paramZs9s) {
    try {
      if (paramZs9s.Zc())
        paramZs9s.Z_(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$startEnabledListeners$0(Zs9s paramZs9s) {
    if (paramZs9s.Zc()) {
      paramZs9s.Zy(null);
      this.ZO.Zo(paramZs9s);
    } 
  }
  
  public static void ZK(int paramInt) {
    ZV = paramInt;
  }
  
  public static int Zi() {
    return ZV;
  }
  
  public static int Zn() {
    int i = Zi();
    return (i == 0) ? 126 : 0;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'UV¶)ï\\fùW8µ®Þeª?ä\\tÏ¸Ê0Üå¢\\r¬?Ì1yzGÿ»ùYÅÞ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #95
    //   19: bipush #23
    //   21: istore_1
    //   22: invokestatic ZK : (I)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #86
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
    //   74: putstatic burp/Zgjf.a : [Ljava/lang/String;
    //   77: iconst_2
    //   78: anewarray java/lang/String
    //   81: putstatic burp/Zgjf.b : [Ljava/lang/String;
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
    //   156: bipush #14
    //   158: goto -> 188
    //   161: bipush #45
    //   163: goto -> 188
    //   166: bipush #127
    //   168: goto -> 188
    //   171: bipush #90
    //   173: goto -> 188
    //   176: bipush #13
    //   178: goto -> 188
    //   181: bipush #109
    //   183: goto -> 188
    //   186: bipush #32
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
    int i = (paramInt1 ^ 0x58A3) & 0xFFFF;
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
      byte b1 = 42;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */