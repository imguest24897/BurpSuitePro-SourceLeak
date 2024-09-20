package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

class Zthy extends Zthr {
  private final Zt7b ZI;
  
  private final Zgb6 Zy;
  
  private final Zbc5 ZZ;
  
  private final Zmdw ZV;
  
  private final Zbw2 ZS;
  
  private final Zbup Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zthy(Zbdf paramZbdf, boolean paramBoolean, Zb0h paramZb0h, Zt7b paramZt7b, Zgtp paramZgtp, Zgb6 paramZgb6, Zlul paramZlul, Zey9 paramZey9) {
    super(paramZey9);
    this.ZI = paramZt7b;
    this.Zy = paramZgb6;
    this.ZE = Zrri.HEX;
    this.Zn = paramBoolean;
    Zz4e zz4e = new Zz4e(paramZt7b);
    this.ZV = new Zmdw(paramZgtp);
    this.ZS = new Zbw2(paramZbdf::lambda$new$0, paramBoolean, false, true, null, zz4e, paramZb0h);
    this.ZS.Zl(this.ZV);
    this.ZS.addMouseListener(paramZbdf);
    ZV();
    Zbqc zbqc1 = new Zbqc(new BorderLayout());
    zbqc1.Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    zbqc1.add(this.ZS, a(21571, -75));
    zbqc1.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    Ztse ztse = new Ztse(this);
    this.Zq = new Zbuu(this, paramZgb6, ztse);
    this.Zq.setBorder(BorderFactory.createEmptyBorder());
    this.Zq.setViewportView(zbqc1);
    this.ZZ = paramZlul.Za();
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.setName(a(21575, -20125));
    zbqc2.add(this.ZZ, a(21570, 20153));
    zbqc2.add(this.Zq, a(21569, 1999));
    this.ZM = zbqc2;
  }
  
  private void ZV() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lburp/Zgb6;
    //   4: invokeinterface ZfF : ()I
    //   9: istore_1
    //   10: iload_1
    //   11: ifle -> 43
    //   14: new java/awt/Font
    //   17: dup
    //   18: sipush #21574
    //   21: sipush #-3651
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: iconst_0
    //   28: iload_1
    //   29: invokespecial <init> : (Ljava/lang/String;II)V
    //   32: astore_2
    //   33: aload_0
    //   34: aload_2
    //   35: <illegal opcode> run : (Lburp/Zthy;Ljava/awt/Font;)Ljava/lang/Runnable;
    //   40: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   43: return
  }
  
  public boolean ZR() {
    return this.ZS.Zb();
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    this.Z_ = (paramZgu3 != Zgu3.HTTP_RESPONSE || (paramZs68 != null && paramZs68.Zs > 0 && !paramBoolean));
    return this.Z_;
  }
  
  public boolean ZD(Zefx paramZefx) {
    this.Z_ = true;
    return true;
  }
  
  public Zsmh Zb() {
    if (this.ZS.Zb())
      Ze(this.ZS.Zg()); 
    return this.Zg;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {
    ZE(paramZefx, Zgu3.HTTP_REQUEST, true);
    paramZefx.Zi(this.ZZ);
  }
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    ZE(paramZefx, Zgu3.HTTP_REQUEST, paramBoolean1);
    paramZefx.Zi(this.ZZ);
  }
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    this.ZZ.setVisible(false);
    ZE(paramZsmh, Zgu3.HTTP_RESPONSE, true);
  }
  
  public int[] Zg() {
    return new int[] { this.ZS.Zl(), this.ZS.ZC() };
  }
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    this.ZZ.setVisible(false);
    ZE(paramZsmh, Zgu3.HTTP_RESPONSE, paramBoolean);
  }
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {
    ZE(paramZsmh, Zgu3.WS_MESSAGE, true);
  }
  
  public void Zx() {
    this.Zg = Zsmh.Zy;
    this.ZV.ZW();
    this.ZV.Zp(null);
    this.ZS.Zn((byte[])null);
    this.ZI.ZU();
  }
  
  private void ZE(Zsmh paramZsmh, Zgu3 paramZgu3, boolean paramBoolean) {
    Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_VIEW_HEX_TAB);
    this.Zg = paramZsmh;
    this.ZV.ZW();
    this.ZV.Zp(paramZgu3);
    this.ZS.Zn(Zt6s.Zh(paramZsmh));
    if (paramBoolean)
      this.ZI.Zj(paramZgu3); 
  }
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    this.ZS.Ze(paramInt1, paramInt2, paramArrayOfbyte);
  }
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {
    ZN(paramInt1, paramInt2, Zkb.Zy(paramString));
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return this.ZS.Zh();
  }
  
  public boolean ZQ() {
    return this.ZS.ZM();
  }
  
  public String Zk() {
    int[] arrayOfInt = Zbdf.ZM();
    byte[] arrayOfByte1 = this.ZS.ZA();
    if (arrayOfByte1 == null || arrayOfByte1.length == 0)
      return ""; 
    StringBuilder stringBuilder = new StringBuilder();
    byte[] arrayOfByte2 = arrayOfByte1;
    int i = arrayOfByte2.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte2[b];
      stringBuilder.append(String.format(a(21568, -22815), new Object[] { Byte.valueOf(b1) }));
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }
  
  public byte[] Zw() {
    return this.ZS.ZA();
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    return Zkcm.Zh(paramBoolean);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zq : Lburp/Zbup;
    //   4: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   7: invokevirtual getViewPosition : ()Ljava/awt/Point;
    //   10: astore_1
    //   11: iconst_4
    //   12: anewarray burp/Ztcw
    //   15: dup
    //   16: iconst_0
    //   17: aload_0
    //   18: invokespecial ZI : ()Lburp/Ztcw;
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: aload_0
    //   25: getfield ZS : Lburp/Zbw2;
    //   28: invokevirtual ZI : ()Lburp/Ztcw;
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: aload_0
    //   35: aload_1
    //   36: <illegal opcode> Zg : (Lburp/Zthy;Ljava/awt/Point;)Lburp/Ztcw;
    //   41: aastore
    //   42: dup
    //   43: iconst_3
    //   44: aload_0
    //   45: getfield ZZ : Lburp/Zbc5;
    //   48: invokevirtual ZI : ()Lburp/Ztcw;
    //   51: aastore
    //   52: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   55: areturn
  }
  
  public void ZU() {
    super.ZU();
    this.ZS.ZU();
    this.Zq.getViewport().setViewPosition(new Point(0, 0));
    this.ZZ.ZU();
  }
  
  private void lambda$checkpoint$2(Point paramPoint) {
    this.Zq.getViewport().setViewPosition(paramPoint);
  }
  
  private void lambda$updateTableFont$1(Font paramFont) {
    this.ZS.setFont(paramFont);
  }
  
  private static Component lambda$new$0(Zbdf paramZbdf) {
    return paramZbdf;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ']ÓÛNÊH²B)k»[ÛÚ%IdV¯U'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'Mï½9í©¯Jþ^s`d¬Ìz'£q'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #10
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #29
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zthy.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zthy.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #67
    //   214: goto -> 244
    //   217: bipush #65
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #117
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #38
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
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    int i = (paramInt1 ^ 0x5442) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zthy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */