package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Zgdu implements Zm3g {
  private boolean Zv = false;
  
  private Zzqi ZE = new Zzqi(1337, Zs8b.LOOPBACK_ONLY, null);
  
  private boolean ZI = false;
  
  private List<Zgt> Zy = new ArrayList<>();
  
  private String Zo;
  
  private boolean ZX = false;
  
  private Zzk3 ZZ = Zzk3.OFF;
  
  private String Zr = a(25748, 26783);
  
  private String Zh = a(25743, -23021);
  
  private static int Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: invokestatic Zg : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: aload_1
    //   6: sipush #25747
    //   9: sipush #28781
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: aload_0
    //   16: getfield Zv : Z
    //   19: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   24: putfield Zv : Z
    //   27: aload_1
    //   28: sipush #25749
    //   31: sipush #31590
    //   34: invokestatic a : (II)Ljava/lang/String;
    //   37: invokeinterface Zh : (Ljava/lang/String;)Z
    //   42: ifne -> 81
    //   45: aload_1
    //   46: sipush #25755
    //   49: sipush #32516
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokeinterface Zh : (Ljava/lang/String;)Z
    //   60: ifne -> 81
    //   63: aload_1
    //   64: sipush #25756
    //   67: sipush #23593
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokeinterface Zh : (Ljava/lang/String;)Z
    //   78: ifeq -> 164
    //   81: aload_0
    //   82: new burp/Zzqi
    //   85: dup
    //   86: aload_1
    //   87: sipush #25729
    //   90: sipush #-12737
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: aload_0
    //   97: getfield ZE : Lburp/Zzqi;
    //   100: getfield ZQ : I
    //   103: invokeinterface ZA : (Ljava/lang/String;I)I
    //   108: aload_1
    //   109: sipush #25739
    //   112: sipush #-16926
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: aload_0
    //   119: getfield ZE : Lburp/Zzqi;
    //   122: getfield Zj : Lburp/Zs8b;
    //   125: getfield json : Ljava/lang/String;
    //   128: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   133: invokestatic ZU : (Ljava/lang/String;)Lburp/Zs8b;
    //   136: aload_1
    //   137: sipush #25728
    //   140: sipush #20991
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload_0
    //   147: getfield ZE : Lburp/Zzqi;
    //   150: getfield Zf : Ljava/lang/String;
    //   153: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   158: invokespecial <init> : (ILburp/Zs8b;Ljava/lang/String;)V
    //   161: putfield ZE : Lburp/Zzqi;
    //   164: aload_0
    //   165: aload_1
    //   166: sipush #25754
    //   169: sipush #-24969
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: aload_0
    //   176: getfield ZI : Z
    //   179: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   184: putfield ZI : Z
    //   187: aload_1
    //   188: sipush #25753
    //   191: sipush #16246
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: invokeinterface Zh : (Ljava/lang/String;)Z
    //   202: ifeq -> 238
    //   205: new java/util/HashSet
    //   208: dup
    //   209: invokespecial <init> : ()V
    //   212: astore_3
    //   213: aload_0
    //   214: aload_1
    //   215: sipush #25757
    //   218: sipush #-13450
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: aload_3
    //   225: <illegal opcode> Zu : (Ljava/util/Set;)Lburp/Zsh4;
    //   230: invokeinterface Zs : (Ljava/lang/String;Lburp/Zsh4;)Ljava/util/List;
    //   235: putfield Zy : Ljava/util/List;
    //   238: aload_0
    //   239: aload_1
    //   240: sipush #25730
    //   243: sipush #12161
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: aload_0
    //   250: getfield Zo : Ljava/lang/String;
    //   253: invokeinterface Zn : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   258: putfield Zo : Ljava/lang/String;
    //   261: aload_0
    //   262: aload_1
    //   263: sipush #25750
    //   266: sipush #-5149
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: aload_0
    //   273: getfield ZX : Z
    //   276: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   281: putfield ZX : Z
    //   284: aload_0
    //   285: aload_1
    //   286: sipush #25741
    //   289: sipush #11603
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: aload_0
    //   296: getfield Zr : Ljava/lang/String;
    //   299: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   304: putfield Zr : Ljava/lang/String;
    //   307: aload_0
    //   308: aload_1
    //   309: sipush #25740
    //   312: sipush #-28087
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: aload_0
    //   319: getfield Zh : Ljava/lang/String;
    //   322: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   327: putfield Zh : Ljava/lang/String;
    //   330: aload_1
    //   331: sipush #25746
    //   334: sipush #-25155
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aload_0
    //   341: getfield ZZ : Lburp/Zzk3;
    //   344: getstatic burp/Zzk3.OFF : Lburp/Zzk3;
    //   347: if_acmpeq -> 354
    //   350: iconst_1
    //   351: goto -> 355
    //   354: iconst_0
    //   355: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   360: ifeq -> 374
    //   363: aload_0
    //   364: getstatic burp/Zzk3.DEBUG : Lburp/Zzk3;
    //   367: putfield ZZ : Lburp/Zzk3;
    //   370: iload_2
    //   371: ifne -> 381
    //   374: aload_0
    //   375: getstatic burp/Zzk3.OFF : Lburp/Zzk3;
    //   378: putfield ZZ : Lburp/Zzk3;
    //   381: invokestatic Zwu : ()[Lburp/Zbqc;
    //   384: ifnonnull -> 394
    //   387: iinc #2, 1
    //   390: iload_2
    //   391: invokestatic ZW : (I)V
    //   394: return
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Zh(a(25752, 13802), this.Zv);
    paramZg4j.ZD(a(25729, -12737), this.ZE.ZQ);
    int i = Zg();
    paramZg4j.Za(a(25739, -16926), this.ZE.Zj.json);
    if (this.ZE.Zf != null)
      paramZg4j.Za(a(25728, 20991), this.ZE.Zf); 
    paramZg4j.Zh(a(25758, 11159), this.ZI);
    Zzqw zzqw = paramZg4j.ZP(a(25757, -13450));
    for (Zgt zgt : this.Zy) {
      Zzqp zzqp = new Zzqp();
      zzqp.Zj(a(25731, 15766), zgt.ZE);
      zzqp.Zm(a(25742, -28476), zgt.Zi);
      zzqp.Zm(a(25737, -13239), zgt.Zb);
      if (zgt.ZL != null)
        zzqp.Zp(a(25751, -21325), zgt.ZL.longValue()); 
      zzqw.Zx(zzqp);
      if (i == 0)
        break; 
    } 
  }
  
  public Zzk3 ZA() {
    return this.ZZ;
  }
  
  public String Zu() {
    return this.Zo;
  }
  
  public boolean ZV() {
    return this.ZX;
  }
  
  public boolean ZR() {
    return this.ZI;
  }
  
  public List<Zgt> Zs() {
    return this.Zy;
  }
  
  public Zzqi ZF() {
    return this.ZE;
  }
  
  public boolean Zo() {
    return this.Zv;
  }
  
  public void Zw(boolean paramBoolean) {
    this.Zv = paramBoolean;
  }
  
  public void Zd(boolean paramBoolean) {
    this.ZI = paramBoolean;
  }
  
  public void ZG(Zzqi paramZzqi) {
    this.ZE = paramZzqi;
  }
  
  private static Zgt lambda$loadBurpConfiguration$0(Set<String> paramSet, Zvt paramZvt) throws Zzam {
    Long long_ = Long.valueOf(paramZvt.ZR(a(25745, -20618), -1L));
    if (long_.longValue() <= 0L)
      long_ = null; 
    String str = paramZvt.ZC(a(25744, 10301));
    try {
      if (paramSet.contains(str))
        throw new Zzam(a(25738, -9471) + a(25738, -9471)); 
    } catch (Zzam zzam) {
      throw a(null);
    } 
    paramSet.add(str);
    return new Zgt(paramZvt.Zc(a(25736, 12343), false), str, paramZvt.ZC(a(25759, -32421)), long_);
  }
  
  public static void ZW(int paramInt) {
    Zg = paramInt;
  }
  
  public static int Zb() {
    return Zg;
  }
  
  public static int Zg() {
    int i = Zb();
    return (i == 0) ? 78 : 0;
  }
  
  private static Zzam a(Zzam paramZzam) {
    return paramZzam;
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_0
    //   10: ldc 'Änî!sû#LÍ@¸@Ý}ùv#6¿I9#)!SÈÄÆd/ý¸ÞÃû§DD¢ÙÝ??(Àæ0|uc ³üîmtdÄrM¡b4P×C¼µAÀÄ¶G*4¾/ä¤\\f$×æ#)XÜ¦èP\\nci²ül:#'¤xüÐcíà\\nÕ@òÁ/¬´ÞÛo4^XìèµÂàuð ÁüÏî¤t]ãr©¡b§P¥CòÜ©UCFÆ$õÿ6ãÿ0Ts)ù(6éhâñ«O(@Ì\\tÑ¢ï»M!¾8@#JÉ:½¨çcÂÝ¤LåÔS£"÷tG¹qª´fPæW5 k¨·,s!È5¨ù^à7ë [ÍjñÎë6Í®ÛùR\\fçvíAK µ­¯2vó¨à<iÊS1ü!ddú`ñÓÂ)ìTÂÝí7¡·z¼^?_pCO|\\b ÜÍ\\b !Û+\\rî*ÒóÊl÷bNÞ_¥¥k@Áà5Ã÷ÄÊ·Wë3 mLË*^ò¡^ý=;ó\\n¶¿p·Xò¼é«±7/!X3cüÚT!UúUG¬C-@E~DaWÐkþÄ°ù i13q5R ÂôþÌªpþWÃ­j>æ)öþp ò÷/£L½ÿ*½õá© dSßVÜÚÓÜbÌø$ï¥-Î\\fGáª%'@Tä$Cx~®fÍË:¬¨%C³t'Ï¦Í,É`¡ëÙ¬+Ö¿ÔÆ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #26
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZW : (I)V
    //   27: bipush #21
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
    //   72: ldc 'Zà¡o6Ìì5Ò·cdãá÷ö?RhÛ_hø¹´åÂrÎÍ.,AÜ£Qµ¦(Nr¶|4'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #26
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #11
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
    //   133: putstatic burp/Zgdu.a : [Ljava/lang/String;
    //   136: bipush #28
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zgdu.b : [Ljava/lang/String;
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
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #25
    //   218: goto -> 247
    //   221: bipush #48
    //   223: goto -> 247
    //   226: bipush #92
    //   228: goto -> 247
    //   231: bipush #50
    //   233: goto -> 247
    //   236: iconst_4
    //   237: goto -> 247
    //   240: bipush #125
    //   242: goto -> 247
    //   245: bipush #15
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x649B) & 0xFFFF;
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
      char c = 'ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */