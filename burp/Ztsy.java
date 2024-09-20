package burp;

import java.io.IOException;
import java.util.ArrayList;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztsy implements Zm41 {
  private final Zl83 ZN;
  
  private final Ztng Zq;
  
  private final Zr_4 Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztsy(Zl83 paramZl83, Zr_4 paramZr_4) {
    this.ZN = paramZl83;
    this.Zp = paramZr_4;
    this.Zq = new Ztng(paramZl83.Zr8());
  }
  
  public Zl83 ZM() {
    return this.ZN;
  }
  
  public Ztng Zk() {
    return this.Zq;
  }
  
  public void Zz(Zxwh paramZxwh) {
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      int i = zefg.size();
      zefg.add(paramZxwh);
      this.Zq.fireTableRowsInserted(i, i);
    } 
  }
  
  public void ZQ(Zxwh paramZxwh, int paramInt) {
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      zefg.remove(paramInt);
      zefg.add(paramInt, paramZxwh);
      this.Zq.fireTableRowsUpdated(paramInt, paramInt);
    } 
  }
  
  public Zxwh ZP(int paramInt) {
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      return zefg.get(paramInt);
    } 
  }
  
  public void Zs(int[] paramArrayOfint) {
    String[] arrayOfString = Zbb7.ZS();
    if (paramArrayOfint == null || paramArrayOfint.length == 0)
      return; 
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      ArrayList<Zxwh> arrayList = new ArrayList<>(zefg);
      int[] arrayOfInt = paramArrayOfint;
      int i = arrayOfInt.length;
      byte b = 0;
      while (b < i) {
        int j = arrayOfInt[b];
        Zxwh zxwh = arrayList.get(j);
        zefg.remove(zxwh);
        b++;
        if (arrayOfString == null)
          break; 
      } 
      this.Zq.fireTableDataChanged();
    } 
  }
  
  public void Zv(int paramInt) {
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      Zxwh zxwh = zefg.get(paramInt);
      zefg.remove(paramInt);
      zefg.add(paramInt + 1, zxwh);
      this.Zq.fireTableRowsUpdated(paramInt, paramInt + 1);
    } 
  }
  
  public void ZU(int paramInt) {
    Zefg<Zxwh> zefg = this.ZN.Zr8();
    Zxwh zxwh = zefg.get(paramInt);
    zxwh.ZvX(!zxwh.ZWy());
    this.Zq.fireTableCellUpdated(paramInt, 0);
  }
  
  public int ZN() {
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      return zefg.size();
    } 
  }
  
  public void ZN(byte[] paramArrayOfbyte) {
    this.ZN.Zl(paramArrayOfbyte);
  }
  
  public byte[] Zc() {
    return this.ZN.Zrc();
  }
  
  public byte[][] Zm(Zm42 paramZm42, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return ZL(paramZm42, paramArrayOfbyte1, new byte[][] { paramArrayOfbyte2, null, null });
  }
  
  public byte[][] ZL(Zm42 paramZm42, byte[] paramArrayOfbyte, byte[][] paramArrayOfbyte1) {
    String[] arrayOfString = Zbb7.ZS();
    Zsvr zsvr = new Zsvr(paramZm42);
    try {
      byte[] arrayOfByte = paramArrayOfbyte1[0];
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      for (Zxwh zxwh : zefg) {
        if (zxwh.ZWy()) {
          byte[] arrayOfByte1 = zsvr.Zi(zxwh).ZT(paramArrayOfbyte1[0], arrayOfByte, paramArrayOfbyte);
          if (arrayOfByte1 == null)
            arrayOfByte1 = Zdo.ZQ; 
          try {
            if (arrayOfByte1 != paramArrayOfbyte1[0])
              paramArrayOfbyte1[2] = null; 
          } catch (Exception exception) {
            throw a(null);
          } 
          paramArrayOfbyte1[0] = arrayOfByte1;
          if (arrayOfByte1 == ZI)
            return paramArrayOfbyte1; 
        } 
        if (arrayOfString == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    try {
      if (paramArrayOfbyte1[2] == null)
        paramArrayOfbyte1[2] = Zmw.Zi(paramArrayOfbyte1[0], 199, 196); 
    } catch (Exception exception) {
      throw a(null);
    } 
    paramArrayOfbyte1[1] = Zd(paramArrayOfbyte1[0]);
    return paramArrayOfbyte1;
  }
  
  public byte[] Zd(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return null; 
    byte[] arrayOfByte = this.ZN.Zrc();
    if (arrayOfByte != null) {
      Zuh.Zb((arrayOfByte.length > 0), Zqf.Zk);
      paramArrayOfbyte = Zxpr.ZI(paramArrayOfbyte, arrayOfByte);
    } 
    return paramArrayOfbyte;
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    String[] arrayOfString = Zbb7.ZS();
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      for (Zxwh zxwh : zefg) {
        paramZs4f.ZL("r", zxwh.ZWY());
        if (arrayOfString == null)
          break; 
      } 
    } 
    byte[] arrayOfByte = this.ZN.Zrc();
    try {
      if (arrayOfByte != null)
        paramZs4f.ZY(a(-11615, -16803), arrayOfByte); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static Zm41 Zc(String paramString, Zgyp paramZgyp, Zr_4 paramZr_4) throws IOException, Ze27 {
    String[] arrayOfString = Zbb7.ZS();
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zl83 zl83 = paramZr_4.<Zl83>ZH(new Zbsu());
    Ztsy ztsy = new Ztsy(zl83, paramZr_4);
    synchronized (ztsy.ZN.Zz6()) {
      Zefg<Zxwh> zefg = ztsy.ZN.Zr8();
      do {
        String str = zgyp.ZW("r");
        if (str == null)
          break; 
        Zxwh zxwh = Zr5t.Zn(str, paramZr_4);
        try {
          if (zxwh != null) {
            zxwh.ZO(Zraf.ZA);
            zefg.add(zxwh);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } while (arrayOfString != null);
    } 
    ztsy.ZN.Zl(zgyp.ZI(a(-11610, -20712)));
    zgyp.ZE();
    return ztsy;
  }
  
  public void ZP(Zb_j paramZb_j) {
    String[] arrayOfString = Zbb7.ZS();
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      int i = 0;
      while (i < zefg.size()) {
        paramZb_j.ZR(Zeew.INTRUDER, a(-11614, -14340) + a(-11614, -14340), ((Zxwh)zefg.get(i)).ZWY());
        i++;
        if (arrayOfString == null)
          break; 
      } 
      i = zefg.size();
      while (paramZb_j.Za(Zeew.INTRUDER, a(-11612, 27589) + a(-11612, 27589))) {
        i++;
        if (arrayOfString == null)
          break; 
      } 
      if (zefg.isEmpty())
        paramZb_j.ZR(Zeew.INTRUDER, a(-11616, -5028), a(-11611, -14220)); 
    } 
  }
  
  public void Zs(Zb_j paramZb_j) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZN : Lburp/Zl83;
    //   8: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   13: dup
    //   14: astore_3
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield ZN : Lburp/Zl83;
    //   20: invokeinterface Zr8 : ()Lburp/Zefg;
    //   25: astore #4
    //   27: aload #4
    //   29: invokeinterface clear : ()V
    //   34: aload_0
    //   35: getfield Zq : Lburp/Ztng;
    //   38: invokevirtual fireTableDataChanged : ()V
    //   41: aload_1
    //   42: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   45: sipush #-11609
    //   48: sipush #-28370
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   59: astore #5
    //   61: aload #5
    //   63: ifnonnull -> 74
    //   66: aload_0
    //   67: invokevirtual ZNH : ()V
    //   70: aload_2
    //   71: ifnonnull -> 155
    //   74: sipush #-11613
    //   77: sipush #-12950
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: aload #5
    //   85: invokevirtual equals : (Ljava/lang/Object;)Z
    //   88: ifne -> 155
    //   91: iconst_0
    //   92: istore #6
    //   94: aload_1
    //   95: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   98: iload #6
    //   100: sipush #-11612
    //   103: sipush #27589
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: swap
    //   110: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   115: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   120: dup
    //   121: astore #7
    //   123: ifnull -> 155
    //   126: aload #7
    //   128: aload_0
    //   129: getfield Zp : Lburp/Zr_4;
    //   132: invokestatic Zn : (Ljava/lang/String;Lburp/Zr_4;)Lburp/Zxwh;
    //   135: astore #8
    //   137: aload #8
    //   139: ifnull -> 148
    //   142: aload_0
    //   143: aload #8
    //   145: invokevirtual Zz : (Lburp/Zxwh;)V
    //   148: iinc #6, 1
    //   151: aload_2
    //   152: ifnonnull -> 94
    //   155: aload_3
    //   156: monitorexit
    //   157: goto -> 167
    //   160: astore #9
    //   162: aload_3
    //   163: monitorexit
    //   164: aload #9
    //   166: athrow
    //   167: return
    // Exception table:
    //   from	to	target	type
    //   16	157	160	finally
    //   160	164	160	finally
  }
  
  public void ZNH() {
    synchronized (this.ZN.Zz6()) {
      Zefg<Zxwh> zefg = this.ZN.Zr8();
      zefg.clear();
    } 
    this.Zq.fireTableDataChanged();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¦/ÃÍvÅ]Ç¾ùï°2&¦x¦ÞH\\tË@câ(.6ß±ì¿á)sÒîíR\\r\\rú\\tý:´ÉÞKI4³^<·0¤Ö²BêôMU'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #25
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'ãaÍ»\}m#5«ïl«$\\f¡_ÞÒÑëB'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #110
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
    //   128: putstatic burp/Ztsy.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ztsy.b : [Ljava/lang/String;
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
    //   212: bipush #80
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #32
    //   224: goto -> 244
    //   227: bipush #60
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #65
    //   239: goto -> 244
    //   242: bipush #110
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD2A1) & 0xFFFF;
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
      char c = '¢';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */