package burp;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zsbh {
  private final RandomAccessFile Zb;
  
  private final int ZD;
  
  private final long Zn;
  
  private final int ZR;
  
  private final FileChannel Ze;
  
  private final Zlrc ZT;
  
  private final FileLock ZB;
  
  private final List<Zkeu> ZP = new ArrayList<>();
  
  private MappedByteBuffer Zg;
  
  private Zkeu ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static Zsbh Zo(FileChannel paramFileChannel, File paramFile, RandomAccessFile paramRandomAccessFile, long paramLong, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc) throws Zev3 {
    try {
      Zsbh zsbh = new Zsbh(paramFileChannel, paramFile, paramRandomAccessFile, paramLong, paramInt2, paramInt3, paramZlrc);
      zsbh.ZH = zsbh.ZL(0L, paramInt1, paramInt1);
      zsbh.Zg = zsbh.ZH.Zk();
      return zsbh;
    } catch (Zl4t zl4t) {
      Zah.Zl(zl4t, Zk_.UNEXPECTED);
      throw new Zev3(a(-17800, -4679).formatted(new Object[] { paramFile.getAbsolutePath(), zl4t.getMessage() }));
    } 
  }
  
  static Zsbh Zu(FileChannel paramFileChannel, File paramFile, RandomAccessFile paramRandomAccessFile, long paramLong, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc) throws Zev3 {
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      Zsbh zsbh = new Zsbh(paramFileChannel, paramFile, paramRandomAccessFile, paramLong, paramInt2, paramInt3, paramZlrc);
      long l = paramFileChannel.size();
      int i = (int)(l / paramInt3);
      try {
        if (l > (i * paramInt3))
          i++; 
      } catch (Zl4t zl4t) {
        throw a(null);
      } 
      int j = (int)(l - ((i - 1) * paramInt3));
      int k = ZD(paramInt1, paramInt2, l);
      try {
        byte b = 0;
        while (b < i) {
          int m = Zm(paramInt3, i, j, b);
          long l1 = b * paramInt3;
          zsbh.ZH = zsbh.ZL(l1, m, k);
          b++;
          if (arrayOfZbqc != null)
            break; 
        } 
      } catch (Zl4t zl4t) {
        Zah.Zl(zl4t, Zk_.IGNORED);
        throw new Zev3(a(-17798, -2187).formatted(new Object[] { paramFile.getAbsolutePath(), zl4t.getMessage() }));
      } 
      zsbh.Zg = ((Zkeu)zsbh.ZP.getFirst()).Zk();
      if (Zbqc.Zwu() == null)
        Zxsr.Zj(new Zbqc[4]); 
      return zsbh;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zkfw(iOException);
    } 
  }
  
  private static int Zm(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    try {
      if (paramInt4 + 1 == paramInt2)
        return paramInt3; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramInt4 + 2 == paramInt2)
        return paramInt1 + paramInt3; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return paramInt1 * 2 - 1;
  }
  
  private static int ZD(int paramInt1, int paramInt2, long paramLong) {
    int i = paramInt1;
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    while (i < paramInt2 && i < paramLong) {
      i *= 2;
      if (arrayOfZbqc != null)
        break; 
    } 
    if (i > paramInt2)
      i = paramInt2; 
    return i;
  }
  
  private Zsbh(FileChannel paramFileChannel, File paramFile, RandomAccessFile paramRandomAccessFile, long paramLong, int paramInt1, int paramInt2, Zlrc paramZlrc) throws Zev3 {
    this.Zb = paramRandomAccessFile;
    this.ZD = paramInt1;
    this.Zn = paramLong;
    this.ZR = paramInt2;
    this.Ze = paramFileChannel;
    this.ZT = paramZlrc;
    try {
      this.ZB = paramFileChannel.tryLock();
      if (this.ZB == null)
        throw new Exception(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zev3(exception, a(-17797, -11526).formatted(new Object[] { paramFile.getAbsolutePath() }));
    } 
  }
  
  public void Zb() {
    try {
      try {
        if (this.Ze.isOpen()) {
          this.ZB.release();
          this.Ze.close();
          this.Zb.close();
        } 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zkfw(iOException);
    } 
  }
  
  private Zkeu ZL(long paramLong, int paramInt1, int paramInt2) throws Zl4t {
    Zkeu zkeu = new Zkeu(this.Ze, this.Zn, paramLong, paramInt1, paramInt2, this.ZD, this.ZT);
    this.ZP.add(zkeu);
    return zkeu;
  }
  
  void ZA(long paramLong, int paramInt) throws Zl4t {
    long l = paramLong + paramInt;
    try {
      this.ZH.ZY(l);
      if (l >= this.ZH.ZC() + this.ZR) {
        this.ZH = ZL(this.ZH.ZC() + this.ZR, this.ZD, this.ZD);
        this.ZH.ZY(l);
      } 
    } catch (Zl4t zl4t) {
      throw a(null);
    } 
  }
  
  MappedByteBuffer Zf() {
    return this.Zg;
  }
  
  void ZM(long paramLong, boolean paramBoolean) {
    Zkeu zkeu = Zx(paramLong);
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    zkeu.Zk().put(Za(paramLong), (byte)(paramBoolean ? 1 : 0));
  }
  
  boolean Zj(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (1 == zkeu.Zk().get(Za(paramLong)));
  }
  
  void Zb(long paramLong, byte paramByte) {
    Zkeu zkeu = Zx(paramLong);
    zkeu.Zk().put(Za(paramLong), paramByte);
  }
  
  byte ZW(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().get(Za(paramLong));
  }
  
  void ZI(long paramLong, char paramChar) {
    Zkeu zkeu = Zx(paramLong);
    zkeu.Zk().putChar(Za(paramLong), paramChar);
  }
  
  char Ze(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().getChar(Za(paramLong));
  }
  
  void Zj(long paramLong, short paramShort) {
    Zkeu zkeu = Zx(paramLong);
    zkeu.Zk().putShort(Za(paramLong), paramShort);
  }
  
  short Zw(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().getShort(Za(paramLong));
  }
  
  void Zq(long paramLong, int paramInt) {
    Zkeu zkeu = Zx(paramLong);
    zkeu.Zk().putInt(Za(paramLong), paramInt);
  }
  
  int ZY(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().getInt(Za(paramLong));
  }
  
  void ZD(long paramLong1, long paramLong2) {
    Zkeu zkeu = Zx(paramLong1);
    zkeu.Zk().putLong(Za(paramLong1), paramLong2);
  }
  
  long Zd(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().getLong(Za(paramLong));
  }
  
  void Zk(long paramLong, float paramFloat) {
    Zkeu zkeu = Zx(paramLong);
    zkeu.Zk().putFloat(Za(paramLong), paramFloat);
  }
  
  float ZI(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().getFloat(Za(paramLong));
  }
  
  void Zl(long paramLong, double paramDouble) {
    Zkeu zkeu = Zx(paramLong);
    zkeu.Zk().putDouble(Za(paramLong), paramDouble);
  }
  
  double ZA(long paramLong) {
    Zkeu zkeu = Zx(paramLong);
    return zkeu.Zk().getDouble(Za(paramLong));
  }
  
  boolean ZP(long paramLong) {
    int i = (int)(paramLong / this.ZR);
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      if (i == this.ZP.size())
        try {
          if (paramLong % this.ZR == 0L)
            return true; 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (i >= this.ZP.size())
        return false; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zkeu zkeu = this.ZP.get(i);
    int j = Za(paramLong);
    MappedByteBuffer mappedByteBuffer = zkeu.Zk();
    int k = Math.min(1024, mappedByteBuffer.limit() - j);
    byte b = 0;
    while (b < k) {
      try {
        if (0 != mappedByteBuffer.get(j + b))
          return false; 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  Zso4 ZF(long paramLong, int paramInt) {
    Zkeu zkeu = Zx(paramLong);
    return new Zso4(zkeu.Zk(), Za(paramLong), paramInt);
  }
  
  private Zkeu Zx(long paramLong) {
    int i = (int)(paramLong / this.ZR);
    return this.ZP.get(i);
  }
  
  private int Za(long paramLong) {
    return (int)(paramLong % this.ZR);
  }
  
  void Zn() {
    ArrayList<Zkeu> arrayList = new ArrayList<>(this.ZP);
    Iterator<Zkeu> iterator = arrayList.iterator();
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    while (iterator.hasNext()) {
      Zkeu zkeu = iterator.next();
      zkeu.Zk().force();
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÇëÔ,Ô´`ZôS1çÊf`öc½x+,ôµ` ¹!»Ð&âçH©¾r,ZXþ_öD¾óÞ`¿| ¥§"Ç×Héá\\t Õ1@êðÓó÷dk¶µT*©;D±àÂ©'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #34
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #120
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zsbh.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zsbh.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #115
    //   154: goto -> 184
    //   157: bipush #12
    //   159: goto -> 184
    //   162: bipush #55
    //   164: goto -> 184
    //   167: bipush #36
    //   169: goto -> 184
    //   172: bipush #44
    //   174: goto -> 184
    //   177: bipush #17
    //   179: goto -> 184
    //   182: bipush #96
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBA7A) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */