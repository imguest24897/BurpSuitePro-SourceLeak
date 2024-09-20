package burp;

import java.util.List;

class Zstt {
  private boolean ZR;
  
  private boolean Zk;
  
  private boolean ZZ;
  
  private boolean ZQ;
  
  private boolean Zb;
  
  private boolean Zo = true;
  
  final Zep5 Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zstt(Zep5 paramZep5) {}
  
  public boolean Zx(List<Zer0> paramList) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zb : Z
    //   8: ifeq -> 99
    //   11: aload_0
    //   12: getfield Zl : Lburp/Zep5;
    //   15: getfield Z_ : Lburp/Zes1;
    //   18: getfield Zu : Lburp/Zzi5;
    //   21: invokevirtual Zi : ()Z
    //   24: ifne -> 99
    //   27: aload_0
    //   28: aload_1
    //   29: getstatic burp/Zb25.DNS : Lburp/Zb25;
    //   32: invokevirtual ZZ : (Ljava/util/List;Lburp/Zb25;)Z
    //   35: ifeq -> 66
    //   38: aload_0
    //   39: getfield Zl : Lburp/Zep5;
    //   42: getfield ZB : Lburp/Zs8h;
    //   45: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   48: sipush #-29126
    //   51: sipush #-1085
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   62: aload_2
    //   63: ifnonnull -> 123
    //   66: aload_0
    //   67: getfield Zl : Lburp/Zep5;
    //   70: getfield ZB : Lburp/Zs8h;
    //   73: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   76: sipush #-29131
    //   79: sipush #-2582
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   90: aload_0
    //   91: iconst_0
    //   92: putfield Zo : Z
    //   95: aload_2
    //   96: ifnonnull -> 123
    //   99: aload_0
    //   100: getfield Zl : Lburp/Zep5;
    //   103: getfield ZB : Lburp/Zs8h;
    //   106: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   109: sipush #-29131
    //   112: sipush #-2582
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   123: aload_0
    //   124: getfield ZR : Z
    //   127: ifeq -> 202
    //   130: aload_0
    //   131: aload_1
    //   132: getstatic burp/Zb25.HTTP : Lburp/Zb25;
    //   135: invokevirtual ZZ : (Ljava/util/List;Lburp/Zb25;)Z
    //   138: ifeq -> 169
    //   141: aload_0
    //   142: getfield Zl : Lburp/Zep5;
    //   145: getfield ZB : Lburp/Zs8h;
    //   148: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   151: sipush #-29122
    //   154: sipush #-31810
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   165: aload_2
    //   166: ifnonnull -> 226
    //   169: aload_0
    //   170: getfield Zl : Lburp/Zep5;
    //   173: getfield ZB : Lburp/Zs8h;
    //   176: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   179: sipush #-29124
    //   182: sipush #-8174
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield Zo : Z
    //   198: aload_2
    //   199: ifnonnull -> 226
    //   202: aload_0
    //   203: getfield Zl : Lburp/Zep5;
    //   206: getfield ZB : Lburp/Zs8h;
    //   209: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   212: sipush #-29124
    //   215: sipush #-8174
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   226: aload_0
    //   227: getfield Zk : Z
    //   230: ifeq -> 305
    //   233: aload_0
    //   234: aload_1
    //   235: getstatic burp/Zb25.HTTPS : Lburp/Zb25;
    //   238: invokevirtual ZZ : (Ljava/util/List;Lburp/Zb25;)Z
    //   241: ifeq -> 272
    //   244: aload_0
    //   245: getfield Zl : Lburp/Zep5;
    //   248: getfield ZB : Lburp/Zs8h;
    //   251: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   254: sipush #-29121
    //   257: sipush #-24677
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   268: aload_2
    //   269: ifnonnull -> 329
    //   272: aload_0
    //   273: getfield Zl : Lburp/Zep5;
    //   276: getfield ZB : Lburp/Zs8h;
    //   279: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   282: sipush #-29127
    //   285: sipush #32326
    //   288: invokestatic a : (II)Ljava/lang/String;
    //   291: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   296: aload_0
    //   297: iconst_0
    //   298: putfield Zo : Z
    //   301: aload_2
    //   302: ifnonnull -> 329
    //   305: aload_0
    //   306: getfield Zl : Lburp/Zep5;
    //   309: getfield ZB : Lburp/Zs8h;
    //   312: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   315: sipush #-29127
    //   318: sipush #32326
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   329: aload_0
    //   330: getfield ZZ : Z
    //   333: ifeq -> 408
    //   336: aload_0
    //   337: aload_1
    //   338: getstatic burp/Zb25.SMTP : Lburp/Zb25;
    //   341: invokevirtual ZZ : (Ljava/util/List;Lburp/Zb25;)Z
    //   344: ifeq -> 375
    //   347: aload_0
    //   348: getfield Zl : Lburp/Zep5;
    //   351: getfield ZB : Lburp/Zs8h;
    //   354: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   357: sipush #-29123
    //   360: sipush #7816
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   371: aload_2
    //   372: ifnonnull -> 432
    //   375: aload_0
    //   376: getfield Zl : Lburp/Zep5;
    //   379: getfield ZB : Lburp/Zs8h;
    //   382: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   385: sipush #-29132
    //   388: sipush #-11769
    //   391: invokestatic a : (II)Ljava/lang/String;
    //   394: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   399: aload_0
    //   400: iconst_0
    //   401: putfield Zo : Z
    //   404: aload_2
    //   405: ifnonnull -> 432
    //   408: aload_0
    //   409: getfield Zl : Lburp/Zep5;
    //   412: getfield ZB : Lburp/Zs8h;
    //   415: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   418: sipush #-29132
    //   421: sipush #-11769
    //   424: invokestatic a : (II)Ljava/lang/String;
    //   427: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   432: aload_0
    //   433: getfield ZQ : Z
    //   436: ifeq -> 511
    //   439: aload_0
    //   440: aload_1
    //   441: getstatic burp/Zb25.SMTPS : Lburp/Zb25;
    //   444: invokevirtual ZZ : (Ljava/util/List;Lburp/Zb25;)Z
    //   447: ifeq -> 478
    //   450: aload_0
    //   451: getfield Zl : Lburp/Zep5;
    //   454: getfield ZB : Lburp/Zs8h;
    //   457: getstatic burp/Zk53.OK : Lburp/Zk53;
    //   460: sipush #-29128
    //   463: sipush #16750
    //   466: invokestatic a : (II)Ljava/lang/String;
    //   469: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   474: aload_2
    //   475: ifnonnull -> 535
    //   478: aload_0
    //   479: getfield Zl : Lburp/Zep5;
    //   482: getfield ZB : Lburp/Zs8h;
    //   485: getstatic burp/Zk53.ERROR : Lburp/Zk53;
    //   488: sipush #-29125
    //   491: sipush #-25730
    //   494: invokestatic a : (II)Ljava/lang/String;
    //   497: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   502: aload_0
    //   503: iconst_0
    //   504: putfield Zo : Z
    //   507: aload_2
    //   508: ifnonnull -> 535
    //   511: aload_0
    //   512: getfield Zl : Lburp/Zep5;
    //   515: getfield ZB : Lburp/Zs8h;
    //   518: getstatic burp/Zk53.WARNING : Lburp/Zk53;
    //   521: sipush #-29125
    //   524: sipush #-25730
    //   527: invokestatic a : (II)Ljava/lang/String;
    //   530: invokeinterface ZN : (Lburp/Zk53;Ljava/lang/String;)V
    //   535: aload_0
    //   536: getfield Zo : Z
    //   539: ireturn
  }
  
  private boolean ZZ(List<Zer0> paramList, Zb25 paramZb25) {
    Zbqc[] arrayOfZbqc = Zep5.Zp();
    for (Zer0 zer0 : paramList) {
      if (zer0.ZA() == paramZb25)
        return true; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return false;
  }
  
  void Ze() {
    this.Zb = true;
  }
  
  void Zw() {
    this.ZR = true;
  }
  
  void ZX() {
    this.Zk = true;
  }
  
  void Zn() {
    this.ZZ = true;
  }
  
  void Zs() {
    this.ZQ = true;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ûmo)Tr9á¯3è?n}XÙ£¯KÓj5ôñ-ºzJ:XÒ}Ö=ÞË·ÊBz£å¬*u&h83Ë ­YÃ¯Á¢àR÷àãE2t0º\\b]xv²ÞÒb\\rÿÜI1G6&SüÆÔíqúò«Nñpi½Ã!4«fônÕøºÓ®,GlÚÒô`\\rÏq*eÁ`þØÚîKYÐ|©7\\fC`a`÷Z¼'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #48
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
    //   68: ldc 'çàs²Ò\\t«\\n-GÖØgÝü¹ºc¬ÇÜ ßÅÃÊH(wD<å'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #22
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #30
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
    //   129: putstatic burp/Zstt.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zstt.b : [Ljava/lang/String;
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
    //   212: bipush #127
    //   214: goto -> 244
    //   217: bipush #64
    //   219: goto -> 244
    //   222: bipush #39
    //   224: goto -> 244
    //   227: bipush #26
    //   229: goto -> 244
    //   232: bipush #49
    //   234: goto -> 244
    //   237: bipush #31
    //   239: goto -> 244
    //   242: bipush #41
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
    int i = (paramInt1 ^ 0xFFFF8E3D) & 0xFFFF;
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
      char c = 'ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */