package burp;

import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.SwingWorker;
import net.portswigger.Zdo;
import net.portswigger.Zl0;

class Zxf9 extends SwingWorker<Void, Void> {
  private final Zrhg ZQ;
  
  private final int Zj;
  
  private final float ZH;
  
  private final Zl0 Ze;
  
  private File ZR;
  
  final Zg1r ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zxf9(Zg1r paramZg1r, Zl0 paramZl0) {
    this.Ze = paramZl0;
    this.ZQ = new Zrhg(paramZg1r.ZX, a(32510, -14348), true);
    this.Zj = paramZg1r.Zb.getRowCount();
    this.ZH = 100.0F / this.Zj;
    addPropertyChangeListener(this::lambda$new$0);
  }
  
  protected Void ZH() {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZK : Lburp/Zg1r;
    //   9: getfield Zh : Ljava/io/File;
    //   12: putfield ZR : Ljava/io/File;
    //   15: aload_0
    //   16: getfield ZK : Lburp/Zg1r;
    //   19: getfield ZU : Z
    //   22: ifeq -> 40
    //   25: aload_0
    //   26: invokevirtual Zf : ()V
    //   29: iload_1
    //   30: ifne -> 51
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   39: athrow
    //   40: aload_0
    //   41: invokevirtual Zi : ()V
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: aload_0
    //   52: getfield ZQ : Lburp/Zrhg;
    //   55: iconst_1
    //   56: invokevirtual Zd : (Z)V
    //   59: goto -> 157
    //   62: astore_2
    //   63: aload_2
    //   64: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   67: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   70: getstatic burp/Zmgc.ERROR_CREATING_FILE : Lburp/Zmgc;
    //   73: aload_0
    //   74: getfield ZK : Lburp/Zg1r;
    //   77: getfield Zf : Lburp/Zskh;
    //   80: iconst_1
    //   81: anewarray java/lang/Object
    //   84: dup
    //   85: iconst_0
    //   86: aload_0
    //   87: getfield ZR : Ljava/io/File;
    //   90: invokevirtual getPath : ()Ljava/lang/String;
    //   93: aastore
    //   94: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   97: pop
    //   98: aload_0
    //   99: getfield ZQ : Lburp/Zrhg;
    //   102: iconst_1
    //   103: invokevirtual Zd : (Z)V
    //   106: goto -> 157
    //   109: astore_2
    //   110: aload_2
    //   111: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   114: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   117: getstatic burp/Zmgc.SAVE_SERVER_RESPONSE_ERROR : Lburp/Zmgc;
    //   120: aload_0
    //   121: getfield ZK : Lburp/Zg1r;
    //   124: getfield Zf : Lburp/Zskh;
    //   127: iconst_0
    //   128: anewarray java/lang/Object
    //   131: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   134: pop
    //   135: aload_0
    //   136: getfield ZQ : Lburp/Zrhg;
    //   139: iconst_1
    //   140: invokevirtual Zd : (Z)V
    //   143: goto -> 157
    //   146: astore_3
    //   147: aload_0
    //   148: getfield ZQ : Lburp/Zrhg;
    //   151: iconst_1
    //   152: invokevirtual Zd : (Z)V
    //   155: aload_3
    //   156: athrow
    //   157: aconst_null
    //   158: areturn
    // Exception table:
    //   from	to	target	type
    //   4	33	36	java/io/FileNotFoundException
    //   4	51	62	java/io/FileNotFoundException
    //   4	51	109	java/lang/Exception
    //   4	51	146	finally
    //   25	44	47	java/io/FileNotFoundException
    //   62	98	146	finally
    //   109	135	146	finally
  }
  
  private void Zf() throws IOException {
    OutputStream outputStream = this.Ze.Zp(this.ZR);
    float f = 0.0F;
    boolean bool = Zs7w.Zw();
    byte b = 0;
    while (b < this.Zj) {
      try {
        if (this.ZQ.ZS())
          return; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Zstu zstu = this.ZK.Zb.ZW(b).ZoO();
      try {
        if (zstu != null)
          outputStream.write(zstu.ZiD()); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      outputStream.write(Zdo.Zn);
      outputStream.write(Zdo.Zn);
      outputStream.write(Zdo.Zn);
      f += this.ZH;
      setProgress((int)f);
      b++;
      if (bool)
        break; 
    } 
    outputStream.close();
  }
  
  private void Zi() throws IOException {
    float f = 0.0F;
    byte b = 0;
    boolean bool = Zs7w.ZX();
    while (b < this.Zj) {
      try {
        if (this.ZQ.ZS())
          return; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Zgxp zgxp = this.ZK.Zb.ZW(b);
      Zstu zstu = zgxp.ZoO();
      if (zstu != null) {
        this.ZR = this.Ze.Zh(this.ZK.Zh, Integer.toString(zgxp.Zep()));
        OutputStream outputStream = this.Ze.Zp(this.ZR);
        outputStream.write(zstu.ZiD());
        outputStream.close();
      } 
      f += this.ZH;
      setProgress((int)f);
      b++;
      if (!bool)
        break; 
    } 
  }
  
  private void lambda$new$0(PropertyChangeEvent paramPropertyChangeEvent) {
    if (a(32509, -25034).equals(paramPropertyChangeEvent.getPropertyName()))
      this.ZQ.Zq(((Integer)paramPropertyChangeEvent.getNewValue()).intValue(), a(32508, -15891)); 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¡­G­ó^´ËCÅÉs.\\\bhÎ ô¬Sði¢Z´?ð6áÛ5ev}éîÛ8'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #14
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #17
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
    //   69: putstatic burp/Zxf9.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zxf9.b : [Ljava/lang/String;
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
    //   152: bipush #10
    //   154: goto -> 184
    //   157: bipush #110
    //   159: goto -> 184
    //   162: bipush #62
    //   164: goto -> 184
    //   167: bipush #102
    //   169: goto -> 184
    //   172: bipush #85
    //   174: goto -> 184
    //   177: bipush #60
    //   179: goto -> 184
    //   182: bipush #110
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
    int i = (paramInt1 ^ 0x7EFC) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxf9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */