package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zm2;

public class Zbdd extends Zbqc implements Zl2p {
  private final Ztp8 ZQ;
  
  private final Zbps ZL;
  
  private final Zbqc Zj;
  
  private final Zbd7 ZY;
  
  private Zbcw Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbdd(Ztp8 paramZtp8, Zbps paramZbps, Zbd7 paramZbd7) {
    this.ZQ = paramZtp8;
    this.ZL = paramZbps;
    this.ZY = paramZbd7;
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    setLayout(new BorderLayout(0, 20));
    this.Zj = Zt();
    add(this.Zj, a(18663, -4718));
    add(paramZbd7, a(18660, 24047));
  }
  
  private Zbqc Zt() {
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 20, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    Zbqc zbqc = new Zbqc(gridBagLayout);
    zbqc.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    Zm99 zm99 = new Zm99(a(18669, -7371));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    zbqc.add(zm99, gridBagConstraints);
    Zbcm zbcm1 = Zgbp.ZW(a(18668, -18228), this::lambda$buildProtocolSection$0, this::Zg);
    zbcm1.setName(a(18662, 20221));
    zbcm1.setFocusable(true);
    Zbcm zbcm2 = Zgbp.Zq(a(18656, 22062), this::lambda$buildProtocolSection$1);
    zbcm2.setName(a(18659, -4179));
    zbcm2.setFocusable(true);
    List<Zbcm> list = List.of(zbcm1, zbcm2);
    this.Zw = new Zbcw();
    this.Zw.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.Zw.Zi(list, true, -1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    zbqc.add(this.Zw, gridBagConstraints);
    return zbqc;
  }
  
  private void ZR(Zgsq paramZgsq) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zbdd;Lburp/Zgsq;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private boolean Zg() {
    return (!this.ZQ.get().ZC() || ZH());
  }
  
  private boolean ZH() {
    Objects.requireNonNull(this.ZL);
    return (this.ZL.Zp() || Zx6o.Z_(Zt2m.ZF(this), a(18658, -22220), new Zbdo(this.ZL::ZT), new String[] { a(18661, 24936), a(18657, -15423) }0) == 0);
  }
  
  public Component ZB() {
    return this;
  }
  
  public int Zl() {
    return this.ZY.Zl();
  }
  
  public void ZN() {
    this.Zw.Zu(this.ZQ.get().ZD());
    this.Zj.setVisible((this.ZQ.get().Zu() != Zgsq.HIDDEN));
    ZS(this.ZQ.get().Zu());
    this.ZY.ZN();
  }
  
  public void Z_() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_EXPAND_REQUEST_ATTRIBUTES);
  }
  
  public void Zo() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_COLLAPSE_REQUEST_ATTRIBUTES);
  }
  
  public void Zc(Zo4 paramZo4) {
    this.ZY.Zc(paramZo4);
  }
  
  public Ztcw ZI() {
    return this.ZY.ZI();
  }
  
  public void ZU() {
    this.ZY.ZU();
  }
  
  private void ZS(Zgsq paramZgsq) {
    // Byte code:
    //   0: invokestatic Zy : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iconst_m1
    //   5: istore_3
    //   6: aload_1
    //   7: getstatic burp/Zgsq.HTTP1 : Lburp/Zgsq;
    //   10: if_acmpne -> 19
    //   13: iconst_0
    //   14: istore_3
    //   15: aload_2
    //   16: ifnull -> 28
    //   19: aload_1
    //   20: getstatic burp/Zgsq.HTTP2 : Lburp/Zgsq;
    //   23: if_acmpne -> 28
    //   26: iconst_1
    //   27: istore_3
    //   28: aload_0
    //   29: getfield Zw : Lburp/Zbcw;
    //   32: iload_3
    //   33: invokevirtual ZF : (I)V
    //   36: return
  }
  
  private void lambda$selectMessageProtocolLater$2(Zgsq paramZgsq) {
    this.ZQ.get().Zs(paramZgsq);
  }
  
  private void lambda$buildProtocolSection$1() {
    ZR(Zgsq.HTTP2);
  }
  
  private void lambda$buildProtocolSection$0() {
    ZR(Zgsq.HTTP1);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'K!YxkÂ= ÁòÈØÛ%)àò=Ä:ïÔ­Ö¨W¨úgü"À ®Ì WXKØZ¼1_û¼%¦\\næâ2±Ü«ì ´ëÚ`N7§p:Q5@èÀhÕA-¦-¼ÎØÑù?;'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #115
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
    //   67: ldc '_ªeÓi­Y ®`\\f)'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #110
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
    //   128: putstatic burp/Zbdd.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbdd.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #104
    //   214: goto -> 243
    //   217: iconst_1
    //   218: goto -> 243
    //   221: bipush #21
    //   223: goto -> 243
    //   226: bipush #77
    //   228: goto -> 243
    //   231: bipush #41
    //   233: goto -> 243
    //   236: bipush #68
    //   238: goto -> 243
    //   241: bipush #31
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x48E5) & 0xFFFF;
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
      byte b1 = 9;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */