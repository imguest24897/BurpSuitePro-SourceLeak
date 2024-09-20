package burp;

import java.util.EnumSet;

public class Zmej extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmej() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore #11
    //   5: aload #5
    //   7: invokevirtual Zh : ()Z
    //   10: ifne -> 22
    //   13: iconst_0
    //   14: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   17: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   20: aconst_null
    //   21: areturn
    //   22: aload #5
    //   24: invokevirtual ZJ : ()Lburp/Zze_;
    //   27: astore #12
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore #13
    //   38: aload #13
    //   40: sipush #16539
    //   43: sipush #3071
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload #13
    //   55: aload #6
    //   57: iconst_1
    //   58: iconst_1
    //   59: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload #13
    //   68: sipush #16543
    //   71: sipush #-9632
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload #13
    //   83: sipush #16528
    //   86: sipush #8774
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: iload_2
    //   97: tableswitch default -> 232, 0 -> 132, 1 -> 152, 2 -> 172, 3 -> 192, 4 -> 212
    //   132: aload #13
    //   134: sipush #16530
    //   137: sipush #4322
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: iload #11
    //   149: ifne -> 241
    //   152: aload #13
    //   154: sipush #16535
    //   157: sipush #-25154
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: iload #11
    //   169: ifne -> 241
    //   172: aload #13
    //   174: sipush #16534
    //   177: sipush #-20972
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: iload #11
    //   189: ifne -> 241
    //   192: aload #13
    //   194: sipush #16531
    //   197: sipush #7810
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: iload #11
    //   209: ifne -> 241
    //   212: aload #13
    //   214: sipush #16537
    //   217: sipush #-19204
    //   220: invokestatic a : (II)Ljava/lang/String;
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: iload #11
    //   229: ifne -> 241
    //   232: iconst_0
    //   233: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   236: iload_2
    //   237: i2l
    //   238: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   241: aload #13
    //   243: ldc '.'
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload #12
    //   251: invokeinterface Zub : ()Lburp/Zll7;
    //   256: invokeinterface Zsf : ()Lburp/Zstu;
    //   261: invokeinterface ZiD : ()[B
    //   266: astore #14
    //   268: iload_2
    //   269: iconst_2
    //   270: if_icmpne -> 346
    //   273: aload #13
    //   275: sipush #16541
    //   278: sipush #6867
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: pop
    //   288: aload #13
    //   290: aload #14
    //   292: invokestatic Zn : ([B)Ljava/lang/String;
    //   295: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   298: aload #13
    //   300: sipush #16536
    //   303: sipush #14366
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: pop
    //   313: aload #13
    //   315: aload #6
    //   317: iconst_1
    //   318: iconst_0
    //   319: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   322: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: pop
    //   326: aload #13
    //   328: sipush #16538
    //   331: sipush #-27986
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: pop
    //   341: iload #11
    //   343: ifne -> 414
    //   346: aload #13
    //   348: sipush #16540
    //   351: sipush #-18718
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: pop
    //   361: aload #13
    //   363: aload #14
    //   365: invokestatic Zn : ([B)Ljava/lang/String;
    //   368: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   371: aload #13
    //   373: sipush #16542
    //   376: sipush #11077
    //   379: invokestatic a : (II)Ljava/lang/String;
    //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: aload #13
    //   388: aload #6
    //   390: iconst_1
    //   391: iconst_0
    //   392: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload #13
    //   401: sipush #16529
    //   404: sipush #12234
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: pop
    //   414: aload #13
    //   416: aload #12
    //   418: invokeinterface ZKo : ()J
    //   423: aload #12
    //   425: invokeinterface ZKk : ()J
    //   430: sipush #16532
    //   433: sipush #-12714
    //   436: invokestatic a : (II)Ljava/lang/String;
    //   439: invokestatic Zz : (Ljava/lang/StringBuilder;JJLjava/lang/String;)V
    //   442: aload #13
    //   444: sipush #16533
    //   447: sipush #-1149
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: pop
    //   457: aload #13
    //   459: aload #4
    //   461: getstatic burp/Ztz3.CANARY : Lburp/Ztz3;
    //   464: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   467: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   470: aload #13
    //   472: ldc '.'
    //   474: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload #13
    //   480: invokevirtual toString : ()Ljava/lang/String;
    //   483: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '81?»E\,ñg¥^¼H£ãQ,4%\\bTk2¨·xR]Fè¼ V¨ÊPÐN\\b.}:÷ó¦6hqQ1uÍ¥&ôQ9à°åh\\f]ÇL¤®pnnslÚ¸åÕÅHåFþò^®ÑÙÝÄ¤Ï¶°;Y²9ÍÎz'««·ºP¦e4!ã¡§ESzóúDzqîÎ¬6/l\\tTW¯êï}Ò:"dþùFQDÍúñï¨<ØòLSè=© èIÔá*ªN?¤ør&ðA#ý1ADÇ\\bÌÜø63Ô²&VCtziE|´'Î¢~²X,K=óû¡¦Uñ3¥c[¶o\V¦ï\\f.åBøö§§@åÎ21½­cÇßHM¨ØñÌ¬}{Æ4ÛiëæÝGhJG4³\\tbh´:bÇO@/&,*14^8Òjí½\\rõEÝ6ì'ÁNë¬ÃUö:òZ`/'Õr¸^X"`.Õ®kÿM!ÜLY®©IÀüüx¹ªG\\r}$Á;JÂRq£kYC¤Û0E²%nµï[bå\\fcûú´mNÖHS1EI^LmÏNs6/¤¯©íâ'åAíÌ¤SÛß¡®õ9Ú»%p¯«¤Eåvr3´ÛIoún¡V\\n6vá6¹{Þï¿Ç ü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #31
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
    //   68: ldc 'Ñl¢Gëî`f1àVÔûÉù²ãä)ª?áL·»Þ×3*Û÷íÞ?Y\\rù8y~3\\nyÑÙ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #41
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #55
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
    //   129: putstatic burp/Zmej.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmej.b : [Ljava/lang/String;
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
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #108
    //   219: goto -> 244
    //   222: bipush #20
    //   224: goto -> 244
    //   227: bipush #48
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #91
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
    int i = (paramInt1 ^ 0x4096) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmej.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */