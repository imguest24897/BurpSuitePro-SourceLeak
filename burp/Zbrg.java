package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Collection;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbrg extends Zbg2 implements Zz38 {
  private final Zkeg Zb;
  
  private final Zbiw Zv;
  
  private final Zbre ZD;
  
  private final Zbra ZG;
  
  private final Zbrk ZO;
  
  private final Zbrc Zw;
  
  private final Zbrd Zm;
  
  private final Zbnt Zk;
  
  private final Ztwv ZL;
  
  private final Zey9 Zo;
  
  private final Zz38 Zt;
  
  private Zsh9 ZS;
  
  private byte Zl;
  
  private Zm99 ZJ;
  
  private Zm99 ZU;
  
  private Zexh ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbrg(Zkeg paramZkeg, Zbiw paramZbiw, Zbre paramZbre, Zbra paramZbra, Zbrk paramZbrk, Zbrc paramZbrc, Zbrd paramZbrd, Zbnt paramZbnt, Ztwv paramZtwv, Zey9 paramZey9) {
    this.Zb = paramZkeg;
    this.Zv = paramZbiw;
    this.ZD = paramZbre;
    this.ZG = paramZbra;
    this.ZO = paramZbrk;
    this.Zw = paramZbrc;
    this.Zm = paramZbrd;
    this.Zk = paramZbnt;
    this.ZL = paramZtwv;
    this.Zo = paramZey9;
    this.Zl = 0;
    this.Zt = this;
    Zf();
    this.ZB = new String[] { a(-20741, 4978) };
    this.ZA = new boolean[] { true };
  }
  
  public void ZC() {
    this.Zl = 1;
    this.ZL.Zx(this::lambda$panelLoaded$0);
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        switch (this.Zl) {
          case 0:
            return this;
          case 1:
            return Zx6o.ZY(this.Zv.Zu(), a(-20740, -6906)) ? null : this;
          case 2:
          case 3:
          case 4:
            return null;
        } 
        Zuh.Zv(false, Zqf.Zr, this.Zl);
        return this;
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  public void Zc() {
    if (this.Zl == 1)
      this.Zl = 2; 
  }
  
  public boolean ZB(int paramInt) {
    // Byte code:
    //   0: invokestatic ZX : ()Z
    //   3: istore_2
    //   4: iload_1
    //   5: ifge -> 53
    //   8: aload_0
    //   9: iconst_4
    //   10: putfield Zl : B
    //   13: aload_0
    //   14: getfield ZU : Lburp/Zm99;
    //   17: sipush #-20738
    //   20: sipush #-28184
    //   23: invokestatic a : (II)Ljava/lang/String;
    //   26: invokevirtual setText : (Ljava/lang/String;)V
    //   29: aload_0
    //   30: getfield Zv : Lburp/Zbiw;
    //   33: iconst_0
    //   34: sipush #-20743
    //   37: sipush #29733
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: iconst_1
    //   44: invokeinterface Zx : (ILjava/lang/String;Z)V
    //   49: iload_2
    //   50: ifne -> 153
    //   53: iload_1
    //   54: bipush #100
    //   56: if_icmpne -> 113
    //   59: aload_0
    //   60: iconst_3
    //   61: putfield Zl : B
    //   64: aload_0
    //   65: getfield ZU : Lburp/Zm99;
    //   68: sipush #-20739
    //   71: sipush #18619
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual setText : (Ljava/lang/String;)V
    //   80: aload_0
    //   81: getfield ZX : Lburp/Zexh;
    //   84: bipush #100
    //   86: invokevirtual setValue : (I)V
    //   89: aload_0
    //   90: getfield Zv : Lburp/Zbiw;
    //   93: iconst_0
    //   94: sipush #-20744
    //   97: sipush #-16550
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: iconst_1
    //   104: invokeinterface Zx : (ILjava/lang/String;Z)V
    //   109: iload_2
    //   110: ifne -> 153
    //   113: aload_0
    //   114: getfield ZU : Lburp/Zm99;
    //   117: iload_1
    //   118: sipush #-20742
    //   121: sipush #-25273
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: swap
    //   128: sipush #-20747
    //   131: sipush #7840
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   142: invokevirtual setText : (Ljava/lang/String;)V
    //   145: aload_0
    //   146: getfield ZX : Lburp/Zexh;
    //   149: iload_1
    //   150: invokevirtual setValue : (I)V
    //   153: aload_0
    //   154: getfield ZJ : Lburp/Zm99;
    //   157: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   160: aload_0
    //   161: getfield ZS : Lburp/Zsh9;
    //   164: getfield Zi : Lburp/Zep;
    //   167: invokevirtual ZK : ()J
    //   170: invokevirtual format : (J)Ljava/lang/String;
    //   173: sipush #-20737
    //   176: sipush #24348
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: swap
    //   183: sipush #-20748
    //   186: sipush #7974
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   197: invokevirtual setText : (Ljava/lang/String;)V
    //   200: aload_0
    //   201: getfield Zl : B
    //   204: iconst_2
    //   205: if_icmpeq -> 212
    //   208: iconst_1
    //   209: goto -> 213
    //   212: iconst_0
    //   213: ireturn
  }
  
  private void Zf() {
    this.ZX = new Zexh();
    this.ZJ = new Zm99();
    this.ZU = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.ipadx = 200;
    gridBagConstraints.anchor = 18;
    add(this.ZX, gridBagConstraints);
    this.ZJ.setHorizontalAlignment(0);
    this.ZJ.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZJ, gridBagConstraints);
    this.ZU.setHorizontalAlignment(0);
    this.ZU.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZU, gridBagConstraints);
  }
  
  private void lambda$panelLoaded$0() {
    this.ZS = new Zsh9();
    this.ZS.Zq = this.ZD.Zv();
    this.ZS.Zu = this.ZD.Za();
    this.ZS.Za = this.ZG.Zs();
    this.ZS.Zf = this.ZG.Zn();
    this.ZS.Zj = this.ZG.Zb();
    this.ZS.Zg = this.ZG.Zk();
    this.ZS.ZL = this.ZG.ZO();
    this.ZS.ZR = this.ZG.ZG();
    boolean bool = Zsh9.ZX();
    this.ZS.Zk = this.ZO.Zi();
    this.ZS.ZH = this.ZO.Zf();
    this.ZS.Zs = this.ZO.Zh();
    this.ZS.Zz = this.ZO.Zu();
    this.ZS.Zi = this.Zm.ZZ();
    this.ZS.ZX = this.Zm.Zm();
    this.ZS.ZQ = this.Zm.Zu();
    this.ZS.Ze = this.Zm.Zv();
    this.ZS.ZM = this.Zm.ZU();
    this.ZS.ZT = this.Zm.Za();
    this.ZS.Zx = this.Zm.ZY();
    this.ZS.Zh = this.Zm.ZS();
    this.ZS.Zc = this.Zm.Zt();
    Collection<Zrdb> collection = this.Zw.ZK();
    if (this.ZS.Zq == Zxtk.XML) {
      (new Zb06(Zrf1.Za, this.ZS, collection, this.Zt, this.Zb.ZC().ZY4(), this.Zk, this.Zo)).run();
      if (!bool) {
        (new Zb0l(Zrf1.Za, this.ZS, this.Zm.Zk(), collection, this.Zt, this.Zb.ZC().ZY4(), this.Zk, this.Zo)).run();
        return;
      } 
      return;
    } 
    (new Zb0l(Zrf1.Za, this.ZS, this.Zm.Zk(), collection, this.Zt, this.Zb.ZC().ZY4(), this.Zk, this.Zo)).run();
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¨L¿=©Rí5C²Û*á7+ÚS²bµ"ñ$Ý,t#.ãæ+OíñY¶³3pxª`\\rlá\\b_äT=éÜYÖá4/<ÉärÅ,\\f0Ý¿R·Ô©4¥Æ*ÂRh]Æ9¦ât5Ã_ªzðßþ\\tÕC'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #33
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
    //   68: ldc 'õFuúL70@@°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #123
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
    //   129: putstatic burp/Zbrg.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbrg.b : [Ljava/lang/String;
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
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #71
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #8
    //   239: goto -> 244
    //   242: bipush #70
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
    int i = (paramInt1 ^ 0xFFFFAEFD) & 0xFFFF;
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
      char c = 'ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbrg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */