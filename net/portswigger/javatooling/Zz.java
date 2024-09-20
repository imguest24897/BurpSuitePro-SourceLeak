package net.portswigger.javatooling;

import java.util.ArrayList;
import java.util.List;

public class Zz implements Zc {
  private static int ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze Zo(String paramString) throws Exception {
    Z_ z_ = new Z_(paramString);
    z_.ZQ();
    Zm(z_);
    Z_(z_);
    return new Zb(z_);
  }
  
  private static void Z_(Z_ paramZ_) {
    ArrayList<String> arrayList = new ArrayList(List.of((Object[])new String[] { 
            a(5014, 22650), a(5023, 19281), a(5015, -22836), a(5054, 9135), a(5002, -3345), a(5040, 5603), a(5005, -22008), a(5042, 4786), a(4993, -3835), a(5046, 9084), 
            a(5021, 3087), a(5001, -8262), a(5055, -1341), a(5000, -13616), a(5010, 28200), a(5007, -27729), a(5022, 31690), a(5011, 19328), a(5016, -5466), a(5008, -7433), 
            a(5006, 18217), a(5013, 17816), a(4995, 22675), a(4992, -388), a(5018, 15061), a(5017, 25057) }));
    if (a(5045, -15207).equalsIgnoreCase(System.getProperty(a(5043, 1065)))) {
      arrayList.add(a(5044, 20725));
      arrayList.add(a(5020, 13717));
    } 
    System.setProperty(a(4998, -23836), String.join(",", (Iterable)arrayList));
    System.setProperty(a(4997, 16946), paramZ_.ZI());
    System.setProperty(a(5019, -20020), paramZ_.Zq());
    System.setProperty(a(5012, -32101), paramZ_.ZB());
    System.setProperty(a(5009, -32445), a(5052, -28438));
    System.setProperty(a(5004, 28616), a(5047, -12506));
    System.setProperty(a(4994, -18570), a(5003, 29507));
  }
  
  private static void Zm(Z_ paramZ_) throws Exception {
    // Byte code:
    //   0: invokestatic ZO : ()I
    //   3: ldc net/portswigger/javatooling/Zz
    //   5: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8: sipush #4996
    //   11: sipush #-9828
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokevirtual getResource : (Ljava/lang/String;)Ljava/net/URL;
    //   20: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast java/net/URL
    //   26: invokevirtual toURI : ()Ljava/net/URI;
    //   29: astore_2
    //   30: istore_1
    //   31: aload_2
    //   32: invokevirtual getScheme : ()Ljava/lang/String;
    //   35: sipush #5041
    //   38: sipush #20390
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 81
    //   50: aload_2
    //   51: invokestatic emptyMap : ()Ljava/util/Map;
    //   54: invokestatic newFileSystem : (Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;
    //   57: astore_3
    //   58: aload_3
    //   59: sipush #4999
    //   62: sipush #-16344
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: iconst_0
    //   69: anewarray java/lang/String
    //   72: invokevirtual getPath : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   75: astore #4
    //   77: iload_1
    //   78: ifne -> 89
    //   81: aconst_null
    //   82: astore_3
    //   83: aload_2
    //   84: invokestatic get : (Ljava/net/URI;)Ljava/nio/file/Path;
    //   87: astore #4
    //   89: aload_3
    //   90: astore #5
    //   92: aload #4
    //   94: iconst_0
    //   95: anewarray java/nio/file/FileVisitOption
    //   98: invokestatic walk : (Ljava/nio/file/Path;[Ljava/nio/file/FileVisitOption;)Ljava/util/stream/Stream;
    //   101: astore #6
    //   103: aload #6
    //   105: invokeinterface toList : ()Ljava/util/List;
    //   110: astore #7
    //   112: aload #7
    //   114: invokeinterface iterator : ()Ljava/util/Iterator;
    //   119: astore #8
    //   121: aload #8
    //   123: invokeinterface hasNext : ()Z
    //   128: ifeq -> 248
    //   131: aload #8
    //   133: invokeinterface next : ()Ljava/lang/Object;
    //   138: checkcast java/nio/file/Path
    //   141: astore #9
    //   143: aload_0
    //   144: invokevirtual ZH : ()Ljava/nio/file/Path;
    //   147: aload #4
    //   149: aload #9
    //   151: invokeinterface relativize : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
    //   156: invokeinterface toString : ()Ljava/lang/String;
    //   161: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   166: astore #10
    //   168: aload #10
    //   170: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   175: iconst_0
    //   176: anewarray java/nio/file/LinkOption
    //   179: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   182: ifne -> 207
    //   185: aload #10
    //   187: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   192: iconst_0
    //   193: anewarray java/nio/file/attribute/FileAttribute
    //   196: invokestatic createDirectories : (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
    //   199: pop
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   206: athrow
    //   207: aload #9
    //   209: iconst_0
    //   210: anewarray java/nio/file/LinkOption
    //   213: invokestatic isDirectory : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
    //   216: ifne -> 244
    //   219: aload #9
    //   221: aload #10
    //   223: iconst_1
    //   224: anewarray java/nio/file/CopyOption
    //   227: dup
    //   228: iconst_0
    //   229: getstatic java/nio/file/StandardCopyOption.REPLACE_EXISTING : Ljava/nio/file/StandardCopyOption;
    //   232: aastore
    //   233: invokestatic copy : (Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    //   236: pop
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   243: athrow
    //   244: iload_1
    //   245: ifne -> 121
    //   248: aload #6
    //   250: ifnull -> 296
    //   253: aload #6
    //   255: invokeinterface close : ()V
    //   260: goto -> 296
    //   263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   266: athrow
    //   267: astore #7
    //   269: aload #6
    //   271: ifnull -> 293
    //   274: aload #6
    //   276: invokeinterface close : ()V
    //   281: goto -> 293
    //   284: astore #8
    //   286: aload #7
    //   288: aload #8
    //   290: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   293: aload #7
    //   295: athrow
    //   296: aload #5
    //   298: ifnull -> 340
    //   301: aload #5
    //   303: invokevirtual close : ()V
    //   306: goto -> 340
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: astore #6
    //   315: aload #5
    //   317: ifnull -> 337
    //   320: aload #5
    //   322: invokevirtual close : ()V
    //   325: goto -> 337
    //   328: astore #7
    //   330: aload #6
    //   332: aload #7
    //   334: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   337: aload #6
    //   339: athrow
    //   340: return
    // Exception table:
    //   from	to	target	type
    //   92	296	313	java/lang/Throwable
    //   103	248	267	java/lang/Throwable
    //   168	200	203	java/lang/Throwable
    //   207	237	240	java/lang/Throwable
    //   248	263	263	java/lang/Throwable
    //   274	281	284	java/lang/Throwable
    //   296	309	309	java/lang/Throwable
    //   320	325	328	java/lang/Throwable
  }
  
  public static void Zn(int paramInt) {
    ZS = paramInt;
  }
  
  public static int ZU() {
    return ZS;
  }
  
  public static int ZO() {
    int i = ZU();
    return (i == 0) ? 22 : 0;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #43
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zn : (I)V
    //   13: ldc 'P&ü\\t¡IOÇsÙC*åO,oÕ%Æ/Zp$hÚgw'û¢¼ÑÆ>âÚAà<FÎC¨Z¯ú\\bTTÎ°0^¡Å®¤ ´1p éh'rÍ7tBÓÏ0>À±Õ/ XæìÙñ³Kµ3C¬ÔÑà*ßÍxüÂ;Ôü\äUr2ká4¤É½Ë£Ùgç :Ä´æ7û#03#}À#¢Kq®¸\\rÅóug´OeÆËAØx*Ç<>ùf"¾TuG\\ndÚJ V\\ryP}Ç¶âk®Ð2jCCîxÍÀÝ>5`»Q¶ÈiMÂ#êìßRÍ­,SôéÛðß`wþvIû²LÓnr8.Òw"ÔÜÀa]Þc|ä¼3bëX\\nÜ$.|î­Üa&ñ\\tïFí\áN¹=&êÒ¬ÎKOÖén(m:.\\bäwñcùúç®|Ì-KlMeN±·b-Îwµ-$èÑKOò/%ú´ÊÂ?zéÇ*ËG¹O*wDÄ¶Í@ý«S¼Í"8'¸4÷Ý°8Bìcª»Jgz\\ts~wÕMIW>aÒN¯D#ÎÀÕ76} Ô.×]:Í$\\n\\fV¤A-ùYFí¶ñ\\f"#bêëRýw´âáÌþS ¦gÉ0#E_Hï#mí«dÓ¨²0å¡$Ä£¢²Ð­\\fW%dìAÕ\\nÅÛõt°ÖD(¥7+&é_û`ÁÆ rÎÂùÛPÑ}ú|B@Üõo6R´q$É`|Á+´þP¤ouÈ÷Ö\\r8z¼ÿØ\2x¶%Q1©cøÈ´+uö8ÕwKôÝgrÈ¦¸yL£Sâ|z#Èþ÷_e-×ºêËÊ«¸x\\r²S±oRaé\\tþ=/}Í,üH;üväÑýg2¾Îkke¤ã½«­ÓÑU$¯~F£²ÉéK~©Î¦ÇÑ¶$ÁWZó.&*Ùc¸)Ú×«<ÑÔ¬BG%Z¾ÿ.6á.õ~b¹n7` r¥i'"uÇë5Ù* ooý*)÷á3%|vËêõÂaMAzúÎ/-XfGr¤í%ñp{ÃËôâX'ôE\\bpÓ\·ìàzºÍ~K}¾ÔØy¢(9bÿès¨«\\ne:\\bSsõÚGÌº$ôPÇã§êOÊúÑàH'*"`Á´PSeütMÜdä+UABïc&°÷T¥ß#©¢ñ§@U/ºô(ÒÑ|Òcû×dßx>À]øÒJÚ¦d;ÊÉ# diòþ¦+kV,²](x)òªñþ¥Ï<é@«Ð§H9=¶^ïPÊÒ|ÓZ2Â²_©m¿½yÉ@°ñ&,÷}wbJÀÒÞ!Ä4_3Ð4×àGå!Ì»4\\b\\rsö)õ¿4ÏüáýÉ2×tl&Æ[¦XÍX¦õºl@¹»¦FÆðÔÉªHóRB°'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #33
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #27
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
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
    //   72: ldc '¬#¥k/N~]¹Íaoep291ÝÈÕ>7übkÇþ}gÑ)Ý_'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #38
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #31
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic net/portswigger/javatooling/Zz.a : [Ljava/lang/String;
    //   136: bipush #43
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/javatooling/Zz.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #7
    //   218: goto -> 248
    //   221: bipush #68
    //   223: goto -> 248
    //   226: bipush #91
    //   228: goto -> 248
    //   231: bipush #10
    //   233: goto -> 248
    //   236: bipush #17
    //   238: goto -> 248
    //   241: bipush #16
    //   243: goto -> 248
    //   246: bipush #68
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1396) & 0xFFFF;
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
      char c = '¥';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\javatooling\Zz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */