package burp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zk5p {
  private static final Zk5p Zk;
  
  private static String[] ZB;
  
  private static String[] Za;
  
  private static File ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zk5p() {
    ZB = new String[] { 
        a(-15155, -22568), a(-15164, 26943), a(-15121, -14816), a(-15165, -11867), a(-15112, -8317), a(-15122, -10813), a(-15160, 23011), a(-15120, 21831), a(-15167, -15877), a(-15129, 18063), 
        a(-15118, 10706), a(-15166, 6968), a(-15114, -32195), a(-15108, -17045), a(-15111, -3632), a(-15135, -1172), a(-15168, -30475), a(-15133, -20929), a(-15149, 30733), a(-15113, 17633), 
        a(-15126, -14435), a(-15161, -17165), a(-15136, -23532), a(-15145, 14191), a(-15150, -20631), a(-15105, 4700), a(-15124, -7105), a(-15159, -20500), a(-15162, -14721), a(-15157, 21222), 
        a(-15125, -9706), a(-15116, -6840), a(-15153, 6320), a(-15148, -17297), a(-15154, -9705), a(-15106, -16312), a(-15134, 5450), a(-15156, -17646), a(-15131, 26259), a(-15109, -16444), 
        a(-15152, -22440), a(-15132, 13515), a(-15107, 18945), a(-15123, 20215), a(-15130, -13932), a(-15117, 15605), a(-15146, -31714), a(-15163, 24300) };
  }
  
  static void ZX(Zedd paramZedd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual removeAllItems : ()V
    //   4: invokestatic ZS : ()[Ljava/lang/String;
    //   7: aload_0
    //   8: sipush #-15158
    //   11: sipush #-22612
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokevirtual addItem : (Ljava/lang/Object;)V
    //   20: astore_2
    //   21: getstatic burp/Zk5p.ZN : Ljava/io/File;
    //   24: ifnonnull -> 35
    //   27: getstatic burp/Zk5p.ZB : [Ljava/lang/String;
    //   30: astore_3
    //   31: aload_2
    //   32: ifnonnull -> 52
    //   35: getstatic burp/Zk5p.Za : [Ljava/lang/String;
    //   38: ifnull -> 45
    //   41: iload_1
    //   42: ifeq -> 48
    //   45: invokestatic ZZ : ()V
    //   48: getstatic burp/Zk5p.Za : [Ljava/lang/String;
    //   51: astore_3
    //   52: aload_3
    //   53: astore #4
    //   55: aload #4
    //   57: arraylength
    //   58: istore #5
    //   60: iconst_0
    //   61: istore #6
    //   63: iload #6
    //   65: iload #5
    //   67: if_icmpge -> 126
    //   70: aload #4
    //   72: iload #6
    //   74: aaload
    //   75: astore #7
    //   77: aload #7
    //   79: astore #8
    //   81: aload #8
    //   83: sipush #-15151
    //   86: sipush #7229
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   95: ifeq -> 113
    //   98: aload #8
    //   100: iconst_0
    //   101: aload #8
    //   103: invokevirtual length : ()I
    //   106: iconst_4
    //   107: isub
    //   108: invokevirtual substring : (II)Ljava/lang/String;
    //   111: astore #8
    //   113: aload_0
    //   114: aload #8
    //   116: invokevirtual addItem : (Ljava/lang/Object;)V
    //   119: iinc #6, 1
    //   122: aload_2
    //   123: ifnonnull -> 63
    //   126: return
  }
  
  public static boolean Zd(File paramFile) {
    boolean bool = false;
    String[] arrayOfString2 = ZB;
    String[] arrayOfString1 = Zbb7.ZS();
    int i = arrayOfString2.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString2[b];
      try {
        InputStream inputStream = Zk.getClass().getResourceAsStream(a(-15127, -2632) + a(-15127, -2632) + str);
        try {
          FileOutputStream fileOutputStream = new FileOutputStream(new File(paramFile, str + str));
          try {
            int j;
            while (-1 != (j = inputStream.read())) {
              fileOutputStream.write(j);
              if (arrayOfString1 == null)
                break; 
            } 
            fileOutputStream.flush();
            fileOutputStream.close();
          } catch (Throwable throwable) {
            try {
              fileOutputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            } 
            throw throwable;
          } 
          try {
            if (inputStream != null)
              inputStream.close(); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
        } catch (Throwable throwable) {
          if (inputStream != null)
            try {
              inputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            }  
          throw throwable;
        } 
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
        bool = true;
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
        bool = true;
      } 
      b++;
      if (arrayOfString1 == null)
        break; 
    } 
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    return !bool;
  }
  
  public static String[] ZU() {
    ZZ();
    return Za;
  }
  
  public static String[] Zl() {
    return ZB;
  }
  
  public static void Ze(File paramFile) {
    ZN = paramFile;
  }
  
  private static void ZZ() {
    ArrayList<String> arrayList = new ArrayList();
    File[] arrayOfFile = ZN.listFiles();
    String[] arrayOfString = Zbb7.ZS();
    if (arrayOfFile != null) {
      File[] arrayOfFile1 = arrayOfFile;
      int i = arrayOfFile1.length;
      byte b = 0;
      while (b < i) {
        File file = arrayOfFile1[b];
        if (!file.isDirectory()) {
          String str = file.getName();
          if (!".".equals(str) && !a(-15119, -23039).equals(str))
            arrayList.add(str); 
        } 
        b++;
        if (arrayOfString == null)
          break; 
      } 
    } 
    Collections.sort(arrayList);
    Za = new String[arrayList.size()];
    Za = arrayList.<String>toArray(Za);
  }
  
  static List<byte[]> ZI(int paramInt, boolean paramBoolean) {
    try {
      return Zs6n.Zj(Zf(paramInt, paramBoolean));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return (List)Collections.emptyList();
    } 
  }
  
  private static ByteBuffer Zf(int paramInt, boolean paramBoolean) throws IOException {
    try {
      if (paramBoolean || ZN == null) {
        URL uRL = Zk.getClass().getResource(a(-15115, 19877) + a(-15115, 19877) + ZB[paramInt]);
        try {
          if (uRL == null)
            throw new IOException(a(-15128, -18903) + a(-15128, -18903) + ZB[paramInt]); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        InputStream inputStream = uRL.openStream();
        try {
          byte[] arrayOfByte = inputStream.readAllBytes();
          ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(arrayOfByte.length);
          byteBuffer1.put(arrayOfByte);
          byteBuffer1.flip();
          ByteBuffer byteBuffer2 = byteBuffer1;
          try {
            if (inputStream != null)
              inputStream.close(); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return byteBuffer2;
        } catch (Throwable throwable) {
          if (inputStream != null)
            try {
              inputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            }  
          throw throwable;
        } 
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    File file = new File(ZN, Za[paramInt]);
    FileInputStream fileInputStream = new FileInputStream(file);
    try {
      FileChannel fileChannel = fileInputStream.getChannel();
      try {
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size());
        try {
          if (fileChannel != null)
            fileChannel.close(); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        fileInputStream.close();
        return mappedByteBuffer;
      } catch (Throwable throwable) {
        if (fileChannel != null)
          try {
            fileChannel.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (Throwable throwable) {
      try {
        fileInputStream.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
  }
  
  public static List<Zstu> Zw(int paramInt, Zr_4 paramZr_4, boolean paramBoolean) {
    Objects.requireNonNull(paramZr_4);
    return (List<Zstu>)ZI(paramInt, paramBoolean).stream().map(paramZr_4::ZZ).collect(Collectors.toList());
  }
  
  static {
    // Byte code:
    //   0: bipush #55
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\êô5\\nXéª[ÕAi:çó>© Mº¡²Øªµ¯oIa¾¶Á4¾Ê!çß8ì<áÔÈØá¯þ"¸<¹Ò'­°M[Ðx-±n#­Ì+Ï3\\bW¤wìþ~k9a³P#ã¯mï\\fÀsG¦[¡Y§!´7gZþ&\\rÈ5eóEµ¹¬\\fÛoØØèox`o»´m:ÙQÙ¬wzRÂ\\bÀþ©í:Ð8Uá¦¬yÁ0°æz3úò´~±µý:Ì0¨-~J©UVà¸aE%jÕ/×L?P>Ai>mÞey_QXHöfµn\\t Ò16º=4&:Çûtè`ç@)îÀf)ÒÛ¨í,ý)73a¥&Ú¼üÐ/ô+6ÉthË²[§ZW.×Älû's ï©nÐ] Òm\!(ÊËñÕw»QUÛÅ#Îc¨þÓR]¡ùÄVÿ È\\f15ôS¥]Iºû& 0ÐjD1"Ïú×Ý+mÏ=PbÓ5NmOÇÿ¸æß.¿»Ë]:pm\\nA=&8O ,8NÚqqåÞ³§´bãòµà/þ x-x/[mÆâòp½7jö×ÈO&güZ®Uc+k.TØ4Ê¹L?íê¦§Þv!eèðö]³ÑªnÃyTW-ë¹X¼uN«~Q{+ÇÆ$iH´Émp>¯Ú:~9!â\\t¥£Õg_½lØÅ\\fVW²D^m'à`çEo\\tðî;£±2°Üçk³wT»yYnW¼É¬|»±LV?vkY÷=!Ïîcê¯©;ÒxÑ¤Ê(Õ DæG2ù}°3`/ÉÄiS¨ÒèÈõüû\\b1sÂ0(³/ûb¦ xûæ¶ß°Û11j£u`Õ¬³:³Í 5Éä6§Î»?{wÂºG!øHAuGëU]ÑÇÏ¦~Y(¦%óÞE.Oçaáö¼ôD°^Aw¤y9#¡(àë~3!×AF¤_ý#9(çlòÉ@*ÞåïùÖZðÜ<©áýR³I\\bYª/@îâW¨,p)a9ª}RÃ2XÇ:IóÑ<u*k°ãÑæVæðá'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #68
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
    //   68: ldc 'Û³)\ösÒøÓMUCM+÷$ù£ÒüV'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #75
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
    //   129: putstatic burp/Zk5p.a : [Ljava/lang/String;
    //   132: bipush #55
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk5p.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #44
    //   214: goto -> 243
    //   217: bipush #79
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #8
    //   228: goto -> 243
    //   231: bipush #39
    //   233: goto -> 243
    //   236: bipush #12
    //   238: goto -> 243
    //   241: bipush #29
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zk5p
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zk5p.Zk : Lburp/Zk5p;
    //   310: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC4E2) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */