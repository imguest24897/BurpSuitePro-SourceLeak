package burp;

import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs7o {
  private final Zsll Zf;
  
  private final String ZP;
  
  private final String Ze;
  
  private final boolean ZR;
  
  private final boolean Zd;
  
  private final String Zm;
  
  private final String ZS;
  
  private final byte[] ZZ;
  
  private final boolean Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs7o(Zefx paramZefx, Zsll paramZsll, List<String> paramList, String paramString, byte[] paramArrayOfbyte, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZT : ()I
    //   7: aload_0
    //   8: aload_2
    //   9: putfield Zf : Lburp/Zsll;
    //   12: aload_0
    //   13: aload #4
    //   15: putfield ZS : Ljava/lang/String;
    //   18: istore #7
    //   20: aload_0
    //   21: aload #5
    //   23: putfield ZZ : [B
    //   26: aload_0
    //   27: iload #6
    //   29: putfield Zq : Z
    //   32: aload_0
    //   33: iload #6
    //   35: ifne -> 42
    //   38: iconst_1
    //   39: goto -> 43
    //   42: iconst_0
    //   43: putfield Zd : Z
    //   46: sipush #17990
    //   49: sipush #29000
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: aload_1
    //   56: invokeinterface Zr : ()Ljava/lang/String;
    //   61: invokevirtual equals : (Ljava/lang/Object;)Z
    //   64: ifeq -> 146
    //   67: aload_0
    //   68: sipush #17996
    //   71: sipush #7387
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: putfield ZP : Ljava/lang/String;
    //   80: aload_0
    //   81: aload_1
    //   82: invokeinterface Zc : ()Ljava/util/List;
    //   87: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   92: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   97: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   102: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   107: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   112: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   117: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   122: ldc '&'
    //   124: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   127: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   132: checkcast java/lang/String
    //   135: invokestatic ZU : (Ljava/lang/String;)Ljava/lang/String;
    //   138: putfield Ze : Ljava/lang/String;
    //   141: iload #7
    //   143: ifeq -> 165
    //   146: aload_0
    //   147: sipush #17993
    //   150: sipush #-11001
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: putfield ZP : Ljava/lang/String;
    //   159: aload_0
    //   160: ldc ''
    //   162: putfield Ze : Ljava/lang/String;
    //   165: aload_3
    //   166: invokeinterface isEmpty : ()Z
    //   171: ifeq -> 199
    //   174: aload_0
    //   175: iload #6
    //   177: ifne -> 184
    //   180: iconst_1
    //   181: goto -> 185
    //   184: iconst_0
    //   185: putfield ZR : Z
    //   188: aload_0
    //   189: ldc ''
    //   191: putfield Zm : Ljava/lang/String;
    //   194: iload #7
    //   196: ifeq -> 254
    //   199: aload_0
    //   200: iconst_0
    //   201: putfield ZR : Z
    //   204: aload_0
    //   205: aload_3
    //   206: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   211: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   216: invokeinterface peek : (Ljava/util/function/Consumer;)Ljava/util/stream/Stream;
    //   221: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   226: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   231: sipush #17985
    //   234: sipush #18155
    //   237: invokestatic a : (II)Ljava/lang/String;
    //   240: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   243: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   248: checkcast java/lang/String
    //   251: putfield Zm : Ljava/lang/String;
    //   254: return
  }
  
  public String ZI() {
    int i = Zgtq.ZT();
    Zlfh.ZB(Zrp6.TRACE, a(17997, 15237), new Object[] { this.Zf.name(), Boolean.valueOf(this.ZR) });
    String str = String.format(a(17986, 9978), new Object[] { Boolean.valueOf(this.ZR), Boolean.valueOf(this.Zd), Boolean.valueOf(!this.Zq), Boolean.valueOf(this.Zq), this.Zf.dynamicJavaScriptAnalysisMode, Boolean.valueOf(Zlfh.ZL()), this.ZS, this.Zm });
    Zlfh.ZB(Zrp6.TRACE, a(18013, -26610), new Object[] { str });
    StringBuilder stringBuilder = (new StringBuilder()).append(String.format(a(17991, -678), new Object[] { str })).append(a(18012, -368)).append(a(17989, -6589)).append(a(17984, -4079)).append(String.format(a(17987, -8858), new Object[] { this.ZP })).append(String.format(a(17992, 27248), new Object[] { this.Ze }));
    if (!this.ZR && !this.Zq) {
      Zuh.Zb((this.ZZ != null), Zqf.Zr);
      String str1 = String.format(a(17999, 20500), new Object[] { Zkb.ZG(this.ZZ) });
      Zlfh.ZB(Zrp6.TRACE, a(17994, -29996), new Object[] { str1 });
      stringBuilder.append(str1);
    } 
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
    return stringBuilder.toString();
  }
  
  private static String ZU(String paramString) {
    return paramString.replaceAll(a(17998, -1229), a(17995, 2159));
  }
  
  private static void lambda$new$3(String paramString) {
    Zlfh.ZB(Zrp6.TRACE, a(17988, -3008), new Object[] { paramString });
  }
  
  private static String lambda$new$2(Zlou paramZlou) {
    return paramZlou.ZA + "=" + paramZlou.ZA;
  }
  
  private static boolean lambda$new$1(Zlou paramZlou) {
    return !paramZlou.Zr.contains("\000");
  }
  
  private static boolean lambda$new$0(Zlou paramZlou) {
    return paramZlou.Zx.ZO();
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ð¯Y(B÷"oö/Ý¿C³ ²íøfÉÓ|Õ^~J$?z)ÌÕ\\r:á2n¤uH$IÇÈ:Är×/Ñín?hÃ5øW¶:­lÜó°HI²¢§f²m¶ÑÎØ5B{n\\tÂ?.ÉHÓà\\t=&Ê'qXPÆ6döVf0çù+ççØÄiÚý mì:uÊÞØõù\\nÂô>Æ)Øþ{Ý=§@bÉ¸¯i7G®æ»ù&Ü¯[ºÚ9RÜDÝ Í¬e-.9+UèwØá¸ÃÀUwÙnÊd÷=eO!ºTÌÆº÷\\rOp'zã«ÔK\\f7V¹[¡7Ý?ï7Ø\\r:´ý,ò{éÒßJzØ4ÒâÄÓ\\fBRÚGçïò»vvüDE_F]øqÂë²ú7tY©d´¢gý<Ä¬ñë©¸Ûv sßì£!ºsÜGÏYA}Æ`¤î«9,B,5\«\\fÿ 2¨%%~y\\nÅÆÙóÄ©µ·ÒZÚºò%ÛÍ.HHdåÛ¯]éNoĩÈ»#uQàg°á~Èãÿ·\Ø­Þ}\\nrðÉ[øVõ´á?Åëú c7­äÿ\\rõ[U\\rçQR_©âOûùS³£Ç+ðèøA3kÆáÁfD~o¨ÝÎ±K%ñ®.öíì<ÃýbìbâAÄî­oVú­WtÀóO#Ûa4Õñ'P>0f$Ûv\\nÀËÇÝºäÕ{mÚ¢Ù.Ôou[ã\\tEä\\n\\rµ)@Ìµ\\b69+ü­NàZ.¤ãË ìx{1qb3ÄVþý¿wªÎGÇ×¿ñ]gàW[ý¦F\l³L°3\\rúi÷©*\\fäîÐj¨Òî¯I;wæç/«¡TC¬ÿìÔ_Ãl'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #35
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #91
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
    //   68: ldc 'Dí'bµH¤P£Ê×.ÜaªUBãÏLM{\\n¾ÈØüùeê :úZDL7GpJôß\,Þÿ(|w=~7rò«¢W{&ÖÈ9 R|¤öç"oUÒä¦=À.çoÞBwóIóSï/áËãÔT\ÙøDw:¦ OZäY.áÕ² /d¤Æ[\\taê'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #99
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
    //   129: putstatic burp/Zs7o.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs7o.b : [Ljava/lang/String;
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
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #64
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #94
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #18
    //   239: goto -> 244
    //   242: bipush #35
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x464D) & 0xFFFF;
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
      byte b1 = 77;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */