package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zli;

public class Zloe extends Zloq implements Runnable {
  private final Zgll Zp = new Zgll(10000);
  
  private OutputStream ZF = this.Zp.ZE();
  
  private final boolean Zv;
  
  private final boolean ZY;
  
  private final Ztwv ZU;
  
  private boolean ZC;
  
  private static final String[] b;
  
  private static final String[] c;
  
  Zloe(Socket paramSocket, boolean paramBoolean1, boolean paramBoolean2, Zsxe paramZsxe, Ztwv paramZtwv, Zrgd paramZrgd) throws IOException {
    super(paramSocket, 2147483647, 2147483647, paramZsxe, paramZrgd, null, null, true);
    this.Zv = paramBoolean1;
    this.ZY = paramBoolean2;
    this.ZU = paramZtwv;
  }
  
  public InputStream ZF() {
    return this.Zp.Zb();
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: sipush #10000
    //   8: newarray byte
    //   10: putfield ZL : [B
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield Zo : I
    //   18: aload_0
    //   19: invokevirtual Zq : ()V
    //   22: aload_0
    //   23: getfield ZC : Z
    //   26: ifeq -> 48
    //   29: aload_0
    //   30: new burp/Zr1d
    //   33: dup
    //   34: aload_0
    //   35: getfield ZF : Ljava/io/OutputStream;
    //   38: aload_0
    //   39: getfield ZU : Lburp/Ztwv;
    //   42: invokespecial <init> : (Ljava/io/OutputStream;Lburp/Ztwv;)V
    //   45: putfield ZF : Ljava/io/OutputStream;
    //   48: aload_0
    //   49: getfield Zo : I
    //   52: tableswitch default -> 148, 0 -> 92, 1 -> 148, 2 -> 121, 3 -> 148, 4 -> 148, 5 -> 148
    //   92: aload_0
    //   93: aload_0
    //   94: getfield ZF : Ljava/io/OutputStream;
    //   97: aload_0
    //   98: getfield Zc : [B
    //   101: aload_0
    //   102: getfield Zx : I
    //   105: ldc 2147483647
    //   107: invokevirtual ZN : (Ljava/io/OutputStream;[BII)V
    //   110: iload_1
    //   111: ifne -> 167
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: aload_0
    //   123: getfield ZF : Ljava/io/OutputStream;
    //   126: aload_0
    //   127: getfield Zc : [B
    //   130: aload_0
    //   131: getfield Zx : I
    //   134: invokevirtual ZI : (Ljava/io/OutputStream;[BI)V
    //   137: iload_1
    //   138: ifne -> 167
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: iconst_0
    //   149: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   152: aload_0
    //   153: getfield Zo : I
    //   156: i2l
    //   157: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: goto -> 178
    //   170: astore_2
    //   171: aload_2
    //   172: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   175: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   178: aload_0
    //   179: getfield ZB : Ljava/net/Socket;
    //   182: invokevirtual close : ()V
    //   185: goto -> 196
    //   188: astore_2
    //   189: aload_2
    //   190: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   193: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   196: aload_0
    //   197: getfield ZF : Ljava/io/OutputStream;
    //   200: invokevirtual close : ()V
    //   203: goto -> 214
    //   206: astore_2
    //   207: aload_2
    //   208: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   211: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   214: return
    // Exception table:
    //   from	to	target	type
    //   13	167	170	java/lang/Exception
    //   48	114	117	java/lang/Exception
    //   92	141	144	java/lang/Exception
    //   121	160	163	java/lang/Exception
    //   178	185	188	java/io/IOException
    //   196	203	206	java/io/IOException
  }
  
  private void Zq() throws IOException {
    int i = Zloq.Zo();
    int j = 0;
    while (true) {
      try {
        try {
          this.Zg = this.Zk.read(this.ZL);
          if (this.Zg < 0)
            throw new IOException(); 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
      } catch (IOException iOException) {
        try {
          Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
          if (this.Zc != null)
            this.ZF.write(this.Zc, j, this.Zc.length - j); 
        } catch (IOException iOException1) {
          throw a(null);
        } 
        throw iOException;
      } 
      this.ZN.write(this.ZL, 0, this.Zg);
      this.Zc = this.ZN.toByteArray();
      while (true) {
        int k = Zli.Zg(this.Zc, (byte)10, false, j, this.Zc.length);
        this.ZF.write(this.Zc, j, iOException - j + 1);
        j = iOException + 1;
      } 
      break;
    } 
  }
  
  protected void Zh() {
    throw new UnsupportedOperationException();
  }
  
  protected void ZZ(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  protected void ZJ() {
    throw new UnsupportedOperationException();
  }
  
  void ZM(ByteArrayOutputStream paramByteArrayOutputStream) {}
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Öq×')©ãÃ¤ïòrË\\f3JÂM­CÃÔKÂ)'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #51
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'UóÄÜ´vIºa·E+íÒ¬Én,'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_4
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #99
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zloe.b : [Ljava/lang/String;
    //   129: iconst_5
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zloe.c : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 255
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 227, 5 -> 232
    //   208: bipush #116
    //   210: goto -> 239
    //   213: bipush #25
    //   215: goto -> 239
    //   218: bipush #13
    //   220: goto -> 239
    //   223: iconst_5
    //   224: goto -> 239
    //   227: bipush #28
    //   229: goto -> 239
    //   232: bipush #115
    //   234: goto -> 239
    //   237: bipush #118
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 162
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 158
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 38, 0 -> 96
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x22D) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 27;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zloe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */