package burp;

import java.net.URL;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkvw implements IHttpRequestResponse {
  private final Zmfj ZC;
  
  private final Zbnt ZK;
  
  private final Ztx8 ZG;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static IHttpRequestResponse Za(Zmfj paramZmfj, Zbnt paramZbnt) {
    return new Zlv4(new Zkvw(paramZmfj, paramZbnt, Ztx8.ZC));
  }
  
  protected Zkvw(Zmfj paramZmfj, Zbnt paramZbnt, Ztx8 paramZtx8) {
    this.ZC = paramZmfj;
    this.ZK = paramZbnt;
    this.ZG = paramZtx8;
  }
  
  public String getHost() {
    return this.ZC.Zs().ZJ1();
  }
  
  public int getPort() {
    return this.ZC.Zs().ZJO();
  }
  
  public String getProtocol() {
    return this.ZC.Zs().ZJQ();
  }
  
  public void setHost(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void setPort(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: iload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;I)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void setProtocol(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public byte[] getRequest() {
    try {
      return this.ZC.Zp();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public URL getUrl() {
    try {
      Zz1p zz1p = Zekx.Zu(this.ZC.Zs(), this.ZC.Zp(), (byte)1, this.ZK);
      return (zz1p.Zo == null) ? null : Zmg3.ZE(zz1p.Zo);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public void setRequest(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;[B)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public byte[] getResponse() {
    try {
      return this.ZC.ZM();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return null;
    } 
  }
  
  public void setResponse(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;[B)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public short getStatusCode() {
    try {
      return (Zmre.ZK(null, this.ZC.ZM(), Zt0k.NO_HTML_ANALYSIS, this.ZK)).Zb;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return 0;
    } 
  }
  
  public String getComment() {
    try {
      return this.ZC.ZV();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZG.Zf(throwable);
    } 
  }
  
  public void setComment(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public String getHighlight() {
    try {
      return this.ZC.ZN();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZG.Zf(throwable);
    } 
  }
  
  public void setHighlight(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zkvw;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IHttpService getHttpService() {
    Zmzk zmzk = this.ZC.Zs();
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (zmzk == null) ? null : Zb28.ZU(zmzk);
  }
  
  public void setHttpService(IHttpService paramIHttpService) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #16218
    //   4: sipush #-8134
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   13: pop
    //   14: aload_0
    //   15: getfield ZG : Lburp/Ztx8;
    //   18: aload_0
    //   19: aload_1
    //   20: <illegal opcode> Zk : (Lburp/Zkvw;Lburp/IHttpService;)Lburp/Zl6v;
    //   25: invokeinterface ZO : (Lburp/Zl6v;)V
    //   30: return
  }
  
  private void lambda$setHttpService$7(IHttpService paramIHttpService) throws Throwable {
    this.ZC.ZU(Zb28.Zs(paramIHttpService, this.ZK));
  }
  
  private void lambda$setHighlight$6(String paramString) throws Throwable {
    this.ZC.ZB(paramString);
  }
  
  private void lambda$setComment$5(String paramString) throws Throwable {
    this.ZC.ZP(paramString);
  }
  
  private void lambda$setResponse$4(byte[] paramArrayOfbyte) throws Throwable {
    this.ZC.ZV(paramArrayOfbyte);
  }
  
  private void lambda$setRequest$3(byte[] paramArrayOfbyte) throws Throwable {
    this.ZC.ZH(paramArrayOfbyte);
  }
  
  private void lambda$setProtocol$2(String paramString) throws Throwable {
    try {
      if (paramString == null)
        throw new NullPointerException(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (!a(16216, 27687).equalsIgnoreCase(paramString))
        try {
          if (!a(16219, -3317).equalsIgnoreCase(paramString))
            throw new IllegalArgumentException(a(16217, 18303)); 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zmzk zmzk = this.ZC.Zs();
    this.ZC.ZU(this.ZK.ZY(zmzk.ZJ1(), zmzk.ZJO(), a(16219, -3317).equalsIgnoreCase(paramString)));
  }
  
  private void lambda$setPort$1(int paramInt) throws Throwable {
    Zmzk zmzk = this.ZC.Zs();
    this.ZC.ZU(this.ZK.ZY(zmzk.ZJ1(), paramInt, a(16221, 15249).equalsIgnoreCase(zmzk.ZJQ())));
  }
  
  private void lambda$setHost$0(String paramString) throws Throwable {
    Zmzk zmzk = this.ZC.Zs();
    this.ZC.ZU(this.ZK.ZY(paramString, zmzk.ZJO(), a(16219, -3317).equalsIgnoreCase(zmzk.ZJQ())));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Hx{ëý~ãþÎH¿+³\DÌt'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #16
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #124
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'x¢±#¢Ó6Ü+ÍQåbÄ×\\n¤^úHï»Êï¼TC'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #27
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #57
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zkvw.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zkvw.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #87
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #30
    //   234: goto -> 244
    //   237: bipush #34
    //   239: goto -> 244
    //   242: bipush #43
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
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
    int i = (paramInt1 ^ 0x3F59) & 0xFFFF;
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
      byte b1 = 52;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */