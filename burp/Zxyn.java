package burp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zxyn implements Zgyp {
  private final Zr_4 ZL;
  
  private final DataInputStream ZG;
  
  private String Zf;
  
  private String Zg;
  
  private static final byte[] Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxyn(InputStream paramInputStream, String paramString, Zr_4 paramZr_4) {
    this.ZG = new DataInputStream(paramInputStream);
    this.Zg = paramString;
    this.ZL = paramZr_4;
  }
  
  public String ZA(String paramString, Charset paramCharset) throws IOException, Ze27 {
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.read() != 3) {
        ZJ(String.format(a(6044, -15326), new Object[] { paramString }));
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.ZG.readInt();
    byte[] arrayOfByte = new byte[i];
    try {
      this.ZG.readFully(arrayOfByte);
      Zl(paramString);
      this.Zf = null;
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (paramCharset == null) ? Zkb.ZG(arrayOfByte) : new String(arrayOfByte, paramCharset);
  }
  
  public String ZW(String paramString) throws IOException, Ze27 {
    return ZA(paramString, null);
  }
  
  public Integer ZM(String paramString) throws IOException, Ze27 {
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.read() != 0) {
        ZJ(String.format(a(6037, -29154), new Object[] { paramString }));
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Integer integer = Integer.valueOf(this.ZG.readInt());
    Zl(paramString);
    this.Zf = null;
    return integer;
  }
  
  public Long Zv(String paramString) throws IOException, Ze27 {
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.read() != 1) {
        ZJ(String.format(a(6042, -7095), new Object[] { paramString }));
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Long long_ = Long.valueOf(this.ZG.readLong());
    Zl(paramString);
    this.Zf = null;
    return long_;
  }
  
  public Double Zx(String paramString) throws IOException, Ze27 {
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.read() != 6) {
        ZJ(String.format(a(6033, 9159), new Object[] { paramString }));
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Double double_ = Double.valueOf(this.ZG.readDouble());
    Zl(paramString);
    this.Zf = null;
    return double_;
  }
  
  public Boolean Zq(String paramString) throws IOException, Ze27 {
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZG.read() != 2) {
        ZJ(String.format(a(6032, 12224), new Object[] { paramString }));
        return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Boolean bool = Boolean.valueOf(this.ZG.readBoolean());
    Zl(paramString);
    this.Zf = null;
    return bool;
  }
  
  public byte[] ZI(String paramString) throws IOException, Ze27 {
    byte[] arrayOfByte;
    int j;
    String[] arrayOfString = Ze27.ZP();
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.ZG.read();
    switch (i) {
      case 4:
        j = this.ZG.readInt();
        arrayOfByte = new byte[j];
        this.ZG.readFully(arrayOfByte);
        if (arrayOfString == null);
        Zl(paramString);
        this.Zf = null;
        return arrayOfByte;
      case 5:
        arrayOfByte = Zm;
        try {
          if (arrayOfString == null)
            break; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zl(paramString);
        this.Zf = null;
        return arrayOfByte;
    } 
    ZJ(String.format(a(6040, 26674), new Object[] { paramString }));
    return null;
  }
  
  public Zstu Zi(String paramString) throws IOException, Ze27 {
    Zstu zstu;
    int j;
    String[] arrayOfString = Ze27.ZP();
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.ZG.read();
    switch (i) {
      case 4:
        j = this.ZG.readInt();
        zstu = this.ZL.ZI(this.ZG, j);
        if (arrayOfString == null);
        Zl(paramString);
        this.Zf = null;
        return zstu;
      case 5:
        zstu = null;
        try {
          if (arrayOfString == null)
            break; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zl(paramString);
        this.Zf = null;
        return zstu;
    } 
    ZJ(String.format(a(6045, 1161), new Object[] { paramString }));
    return null;
  }
  
  public Zgyp Zm(String paramString) throws IOException, Ze27 {
    try {
      Zz();
      if (!paramString.equals(this.Zf))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zf = null;
    return new Zxyn(this.ZG, paramString, this.ZL);
  }
  
  public void ZE() throws IOException, Ze27 {
    try {
      if (this.Zg != null) {
        Zl(this.Zg);
        this.Zg = null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  void Zz() throws IOException, Ze27 {
    try {
      if (this.Zf == null)
        try {
          if (this.Zg != null)
            ZY(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zl(String paramString) throws IOException, Ze27 {
    int i = this.ZG.read();
    String str1 = "";
    if (i == 60) {
      i = this.ZG.read();
      str1 = "<";
    } 
    try {
      if (i != 47)
        ZJ(String.format(a(6035, 16675), new Object[] { str1, paramString, str1, Zy(i, '>') })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str2 = Zw();
    try {
      if (!str2.equals(paramString))
        ZJ(String.format(a(6034, 28221), new Object[] { str1, paramString, str1, str2 })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZY() throws IOException, Ze27 {
    int i = this.ZG.read();
    try {
      if (i == -1) {
        this.Zf = null;
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (i != 60)
        ZJ(String.format(a(6041, -29154), new Object[] { Zy(i, '<') })); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.Zf = Zw();
      if (this.Zf.isEmpty())
        ZJ(a(6043, -887)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zf.startsWith("/")) {
        try {
          if (!this.Zf.substring(1).equals(this.Zg))
            ZJ(String.format(a(6038, -23768), new Object[] { this.Zg, this.Zf })); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.Zg = null;
        this.Zf = null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private String Zw() throws IOException, Ze27 {
    StringBuilder stringBuilder = new StringBuilder();
    while (true) {
      int i = this.ZG.read();
      try {
        if (i == -1)
          ZJ(a(6039, 32408)); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (i == 62)
          return stringBuilder.toString(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      stringBuilder.append((char)i);
    } 
  }
  
  private String Zy(int paramInt, char paramChar) {
    StringBuilder stringBuilder = new StringBuilder();
    Za(stringBuilder, paramInt);
    String[] arrayOfString = Ze27.ZP();
    try {
      byte b = 0;
      while (b < 9) {
        int i = this.ZG.read();
        try {
          if (i == -1)
            break; 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        try {
          Za(stringBuilder, i);
          if (i == paramChar)
            break; 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        b++;
        if (arrayOfString == null)
          break; 
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
    } 
    return stringBuilder.toString();
  }
  
  private void Za(StringBuilder paramStringBuilder, int paramInt) {
    paramStringBuilder.append((paramInt == -1) ? a(6036, -23488) : (Character.isISOControl(paramInt) ? String.format(a(6047, 18918), new Object[] { Integer.valueOf(paramInt) }) : String.valueOf((char)paramInt)));
  }
  
  private void ZJ(String paramString) throws Ze27 {
    throw new Ze27(String.format(a(6046, 28253), new Object[] { paramString, this.Zf, this.Zg }));
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÕléÍ*=^$sxÕfÓa5ºPØö)^ëX¢@WX(æçúMÖ_ªò÷Ú\\nWUËÇFB$«4]`§ê\²êL7"|ªºø»"©Rl©t\\fGéÊ¸\\tqß£v5À3Îrµ:\\r4\\fÕlmUl»C6[ÇîÝFiØË,.\\tÙ!Ô'=ÍËérbì²Ã¼lºí½ýýu\\tE9ëRåIBHèÚ-%÷¸þøeX¾ÒÛÿ\\tV*çLzÅ¡« ?ÊQ²2rÉ²Á7D}Â-2úÁ±Ò6·ªî×®&ÿEWX9b9z|°c>Î(âV4å£ÕÈøâôÅO&{3Pß×EO¡ä§7ïN¨X uÎ°ÜY?7²¬@ÌëlXÃ2<o=rFä®bqÈÜgë=ÎµÚÄàF.'Õ]mbö/TÐÇ/FPr¯æ;)¢qH.æRÆºÔòè÷¡`ÊÌTÙj¤\\rÞkmµôz]×¨\\tu,\\r¹ìf*H2D3ÈÙ·gÃRÍðEþ·àü%.9G_ )*/Éù9ÐG1ÏÙzdír;Û¸oÚá¿|½EC8LËJáJÊ(ë3B©ut*r]ká£*&á²P(úÊ2Ïÿ_Øf§Ó÷*<¨eÌªtÜxëÝ4â{@oçWrÂTæøuñ À¥tÝÊ$ÎéoÖõþrÖ"k1¥Dn¯è©6\\bX\\bÌrØ_²0É¹4D­4-³èF½¿ ÌDíÈbqþ3y §~ÉÇÅTé´eN«+Ù'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #46
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'ó;Ô!l¨y´[Ka¸_01Øý¼Ój5fd+´W$$ä¾(låö<ÝKÃ6%âG'HQ(,ÆiOïq,ØTh­×3'ì\\b_æÓîÈ\\rô~8^á>»'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #52
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #61
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zxyn.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxyn.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #97
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #36
    //   224: goto -> 244
    //   227: bipush #84
    //   229: goto -> 244
    //   232: bipush #108
    //   234: goto -> 244
    //   237: bipush #81
    //   239: goto -> 244
    //   242: bipush #30
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: sipush #1024
    //   303: newarray byte
    //   305: putstatic burp/Zxyn.Zb : [B
    //   308: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1793) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxyn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */