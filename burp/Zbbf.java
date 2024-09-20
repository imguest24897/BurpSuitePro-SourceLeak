package burp;

abstract class Zbbf extends Zbv5 implements Zrk3 {
  private final Zr_4 Zb;
  
  protected final Zbkk Zy;
  
  protected final Zzdy Zr;
  
  protected final Zzdy Zf;
  
  protected final Zzdy ZN;
  
  protected final Zzdy Zh;
  
  protected final Zl8w ZI;
  
  protected final Zbkc ZE;
  
  protected final Zm99 Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbbf(Zr_4 paramZr_4) {
    this.Zb = paramZr_4;
    this.Zr = new Zzdy();
    this.ZN = new Zzdy();
    this.Zf = new Zzdy();
    this.Zh = new Zzdy();
    this.ZI = new Zl8w();
    this.ZE = new Zbkc();
    String[] arrayOfString = Zbbl.ZC();
    this.Zy = new Zbkk();
    this.Z_ = new Zm99();
    this.Zy.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_OPTIONS_GREP_PAYLOADS, this, a(26199, -8458));
    ZB();
    if (Zbqc.Zwu() == null)
      Zbbl.ZI(new String[4]); 
  }
  
  protected void Zu() {
    ZB();
  }
  
  private void ZB() {
    boolean bool = this.Zr.isSelected();
    this.ZN.setEnabled(bool);
    this.Zf.setEnabled(bool);
    this.Zh.setEnabled(bool);
  }
  
  public void Zr(Zsh8 paramZsh8) {
    if (paramZsh8.ZP_() == null || !paramZsh8.ZP_().ZvO())
      return; 
    this.Zr.setSelected(true);
    this.ZN.setSelected(paramZsh8.ZP_().Zvp());
    this.Zf.setSelected(paramZsh8.ZP_().Zva());
    this.Zh.setSelected(paramZsh8.ZP_().ZvF());
    ZB();
  }
  
  public void ZX(Zsh8 paramZsh8) {
    Zz4g zz4g = paramZsh8.ZP_();
    if (zz4g == null)
      zz4g = this.Zb.<Zz4g>ZH(new Zrrq()); 
    zz4g.ZVx(this.Zr.isSelected());
    zz4g.ZV5(this.ZN.isSelected());
    zz4g.ZVG(this.Zf.isSelected());
    zz4g.ZVa(this.Zh.isSelected());
    paramZsh8.ZK(zz4g);
  }
  
  public void ZP(Zb_j paramZb_j) {
    paramZb_j.ZR(Zeew.INTRUDER, a(26192, -1489), this.Zr.isSelected() ? a(26200, -25046) : a(26202, -5792));
    paramZb_j.ZR(Zeew.INTRUDER, a(26206, 21038), this.ZN.isSelected() ? a(26200, -25046) : a(26201, -672));
    paramZb_j.ZR(Zeew.INTRUDER, a(26204, 23969), this.Zf.isSelected() ? a(26200, -25046) : a(26201, -672));
    paramZb_j.ZR(Zeew.INTRUDER, a(26205, -4279), this.Zh.isSelected() ? a(26200, -25046) : a(26201, -672));
  }
  
  public void Zs(Zb_j paramZb_j) {
    // Byte code:
    //   0: invokestatic ZC : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   8: sipush #26203
    //   11: sipush #18934
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull -> 46
    //   27: aload_0
    //   28: getfield Zr : Lburp/Zzdy;
    //   31: iconst_0
    //   32: invokevirtual setSelected : (Z)V
    //   35: aload_2
    //   36: ifnull -> 66
    //   39: iconst_4
    //   40: anewarray burp/Zbqc
    //   43: invokestatic Zr : ([Lburp/Zbqc;)V
    //   46: aload_0
    //   47: getfield Zr : Lburp/Zzdy;
    //   50: aload_3
    //   51: sipush #26197
    //   54: sipush #19687
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokevirtual equals : (Ljava/lang/Object;)Z
    //   63: invokevirtual setSelected : (Z)V
    //   66: aload_1
    //   67: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   70: sipush #26198
    //   73: sipush #22953
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   84: astore_3
    //   85: aload_3
    //   86: ifnonnull -> 101
    //   89: aload_0
    //   90: getfield ZN : Lburp/Zzdy;
    //   93: iconst_0
    //   94: invokevirtual setSelected : (Z)V
    //   97: aload_2
    //   98: ifnull -> 121
    //   101: aload_0
    //   102: getfield ZN : Lburp/Zzdy;
    //   105: aload_3
    //   106: sipush #26200
    //   109: sipush #-25046
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   118: invokevirtual setSelected : (Z)V
    //   121: aload_1
    //   122: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   125: sipush #26196
    //   128: sipush #3053
    //   131: invokestatic a : (II)Ljava/lang/String;
    //   134: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   139: astore_3
    //   140: aload_3
    //   141: ifnonnull -> 156
    //   144: aload_0
    //   145: getfield Zf : Lburp/Zzdy;
    //   148: iconst_0
    //   149: invokevirtual setSelected : (Z)V
    //   152: aload_2
    //   153: ifnull -> 176
    //   156: aload_0
    //   157: getfield Zf : Lburp/Zzdy;
    //   160: aload_3
    //   161: sipush #26200
    //   164: sipush #-25046
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   173: invokevirtual setSelected : (Z)V
    //   176: aload_1
    //   177: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   180: sipush #26207
    //   183: sipush #-21314
    //   186: invokestatic a : (II)Ljava/lang/String;
    //   189: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   194: astore_3
    //   195: aload_3
    //   196: ifnonnull -> 211
    //   199: aload_0
    //   200: getfield Zh : Lburp/Zzdy;
    //   203: iconst_1
    //   204: invokevirtual setSelected : (Z)V
    //   207: aload_2
    //   208: ifnull -> 231
    //   211: aload_0
    //   212: getfield Zh : Lburp/Zzdy;
    //   215: aload_3
    //   216: sipush #26200
    //   219: sipush #-25046
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: invokevirtual setSelected : (Z)V
    //   231: aload_0
    //   232: invokevirtual ZB : ()V
    //   235: return
  }
  
  public void ZNH() {
    this.Zr.setSelected(false);
    this.ZN.setSelected(false);
    this.Zf.setSelected(false);
    this.Zh.setSelected(true);
    ZB();
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÃeyTö(xñe5ñ\\nfão.+Vé[×·³ZkL¸OÎK¸å¢Fèo{ÂùrÚgñë¤"2°,Þ/ÖP­ö@?q$\\f$FBê©ú>\\nr}\'ÒÏ&/îû÷gJøÚ²ÞN³¤DäNEk«8)¼"[°3R{MºoOw¨Í¹¡0òÒ#hØ[|ÏÓ`g9§þVy>EÌó,%¸;ëCo'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
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
    //   68: ldc 'ÚÁ³ÊVjæÝT>}8àkîMîãPãôÕÐH#\\bû'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #93
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
    //   129: putstatic burp/Zbbf.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbbf.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 240, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #43
    //   214: goto -> 242
    //   217: bipush #57
    //   219: goto -> 242
    //   222: bipush #124
    //   224: goto -> 242
    //   227: iconst_2
    //   228: goto -> 242
    //   231: bipush #96
    //   233: goto -> 242
    //   236: iconst_5
    //   237: goto -> 242
    //   240: bipush #48
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x665C) & 0xFFFF;
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
      char c = '¶';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbbf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */