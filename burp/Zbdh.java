package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.SwingUtilities;

public class Zbdh extends Zbqc implements Zkgx {
  private final List<Zbdu> Zz;
  
  private final Zb0h Zb;
  
  private Zkhl ZE;
  
  private Zlus ZQ;
  
  private Zbds ZW;
  
  private Ze01 Zf;
  
  private Ze01 Zu;
  
  private String ZV;
  
  private static int[] ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbdh(Zb0h paramZb0h) {
    super(new GridBagLayout());
    this.Zb = paramZb0h;
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.Zz = new ArrayList<>();
  }
  
  void ZP(Zkhl paramZkhl, String paramString, List<Ztkm> paramList) {
    this.ZE = paramZkhl;
    this.ZV = paramString;
    int[] arrayOfInt = Zu();
    removeAll();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    byte b = 0;
    if (this.ZW == null || this.ZW.ZH() != paramZkhl.ZJ()) {
      this.ZW = paramZkhl.ZJ() ? new Zbd3(this.Zb, this::ZC, this::ZG) : new Zbd1(this.Zb);
      this.ZW.setName(a(30213, 14040));
    } 
    this.ZW.Zs(this.ZV);
    Zbd4 zbd4 = new Zbd4(a(30212, -19566), this.ZW);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = b++;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(zbd4, gridBagConstraints);
    Zbqc zbqc = new Zbqc(new GridBagLayout());
    zbqc.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZQ = Zx(paramZkhl.ZJ(), zbqc);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = b++;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    add(zbqc, gridBagConstraints);
    Zp(paramList);
    if (paramZkhl.ZJ()) {
      Zbqc zbqc1 = Zc();
      gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = b;
      gridBagConstraints.anchor = 21;
      gridBagConstraints.fill = 2;
      add(zbqc1, gridBagConstraints);
    } 
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private Zbqc Zc() {
    this.Zf = new Ze01(a(30214, -24354));
    this.Zf.addActionListener(this::Zv);
    this.Zu = new Ze0q(a(30209, 25251));
    this.Zu.addActionListener(this::ZG);
    this.Zf.setName(a(30210, 20424));
    this.Zu.setName(a(30215, 18124));
    ZS(false);
    Zbqc zbqc1 = new Zbqc(new GridLayout(1, 0, 10, 0));
    zbqc1.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc1.add(this.Zf);
    zbqc1.add(this.Zu);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc2.add(zbqc1, a(30211, 19591));
    return zbqc2;
  }
  
  private void Zp(List<Ztkm> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zz : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore_3
    //   10: aload_1
    //   11: invokeinterface size : ()I
    //   16: istore #4
    //   18: invokestatic Zu : ()[I
    //   21: iconst_0
    //   22: istore #5
    //   24: astore_2
    //   25: iload #5
    //   27: iload #4
    //   29: if_icmpge -> 174
    //   32: aload_1
    //   33: iload #5
    //   35: invokeinterface get : (I)Ljava/lang/Object;
    //   40: checkcast burp/Ztkm
    //   43: astore #6
    //   45: iload #5
    //   47: iload_3
    //   48: if_icmpge -> 108
    //   51: aload_0
    //   52: getfield Zz : Ljava/util/List;
    //   55: iload #5
    //   57: invokeinterface get : (I)Ljava/lang/Object;
    //   62: checkcast burp/Zbdu
    //   65: astore #7
    //   67: aload #7
    //   69: invokevirtual ZQ : ()Lburp/Zlus;
    //   72: invokevirtual Zc : ()Z
    //   75: aload_0
    //   76: getfield ZQ : Lburp/Zlus;
    //   79: invokevirtual Zc : ()Z
    //   82: if_icmpne -> 108
    //   85: aload #7
    //   87: aload_0
    //   88: getfield ZQ : Lburp/Zlus;
    //   91: aload #6
    //   93: invokevirtual ZDM : ()Lburp/Zre8;
    //   96: aload #6
    //   98: invokevirtual ZDZ : ()Ljava/lang/String;
    //   101: invokevirtual ZV : (Lburp/Zlus;Lburp/Zre8;Ljava/lang/String;)V
    //   104: aload_2
    //   105: ifnonnull -> 167
    //   108: aload_0
    //   109: getfield Zb : Lburp/Zb0h;
    //   112: aload_0
    //   113: getfield ZQ : Lburp/Zlus;
    //   116: aload #6
    //   118: invokevirtual ZDM : ()Lburp/Zre8;
    //   121: aload #6
    //   123: invokevirtual ZDZ : ()Ljava/lang/String;
    //   126: invokestatic ZV : (Lburp/Zb0h;Lburp/Zlus;Lburp/Zre8;Ljava/lang/String;)Lburp/Zbdu;
    //   129: astore #7
    //   131: iload #5
    //   133: iload_3
    //   134: if_icmpge -> 155
    //   137: aload_0
    //   138: getfield Zz : Ljava/util/List;
    //   141: iload #5
    //   143: aload #7
    //   145: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   150: pop
    //   151: aload_2
    //   152: ifnonnull -> 167
    //   155: aload_0
    //   156: getfield Zz : Ljava/util/List;
    //   159: aload #7
    //   161: invokeinterface add : (Ljava/lang/Object;)Z
    //   166: pop
    //   167: iinc #5, 1
    //   170: aload_2
    //   171: ifnonnull -> 25
    //   174: aload_0
    //   175: getfield Zz : Ljava/util/List;
    //   178: invokeinterface size : ()I
    //   183: iload #4
    //   185: if_icmple -> 202
    //   188: aload_0
    //   189: getfield Zz : Ljava/util/List;
    //   192: invokeinterface removeLast : ()Ljava/lang/Object;
    //   197: pop
    //   198: aload_2
    //   199: ifnonnull -> 174
    //   202: aload_0
    //   203: getfield ZQ : Lburp/Zlus;
    //   206: invokevirtual ZE : ()V
    //   209: return
  }
  
  private Zlus Zx(boolean paramBoolean, Zbqc paramZbqc) {
    Zzz6 zzz6 = new Zzz6(this);
    Objects.requireNonNull(this.ZE);
    return new Zlus(this.Zb, zzz6, this.Zz, paramBoolean, paramZbqc, this.ZE::Zs, this::ZC);
  }
  
  private void ZG() {
    this.ZQ.Zd();
    SwingUtilities.invokeLater(this::ZF);
  }
  
  private void ZF() {
    boolean bool = !this.ZW.Zw().equals(this.ZV) ? true : false;
    ZS(bool);
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    ZC();
  }
  
  private void ZC() {
    if (this.Zu.isEnabled()) {
      this.ZV = this.ZW.Zw();
      this.ZE.Zi(this.ZV);
      ZS(false);
    } 
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    this.ZW.Zs(this.ZV);
    ZG();
  }
  
  private void ZS(boolean paramBoolean) {
    if (this.ZE.ZJ()) {
      this.Zf.setEnabled(paramBoolean);
      this.Zu.setEnabled(paramBoolean);
    } 
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Lburp/Zkhl;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull -> 13
    //   9: getstatic burp/Zbdh.Zi : Lburp/Ztcw;
    //   12: areturn
    //   13: aload_0
    //   14: getfield ZW : Lburp/Zbds;
    //   17: invokevirtual Zw : ()Ljava/lang/String;
    //   20: astore_2
    //   21: aload_0
    //   22: getfield ZV : Ljava/lang/String;
    //   25: astore_3
    //   26: aload_0
    //   27: getfield Zz : Ljava/util/List;
    //   30: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   35: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   40: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   45: invokeinterface toList : ()Ljava/util/List;
    //   50: astore #4
    //   52: aload_0
    //   53: aload_1
    //   54: aload_3
    //   55: aload #4
    //   57: aload_2
    //   58: <illegal opcode> Zg : (Lburp/Zbdh;Lburp/Zkhl;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lburp/Ztcw;
    //   63: areturn
  }
  
  public void ZU() {
    this.ZE = null;
    this.ZV = null;
  }
  
  private void lambda$checkpoint$0(Zkhl paramZkhl, String paramString1, List<Ztkm> paramList, String paramString2) {
    ZP(paramZkhl, paramString1, paramList);
    this.ZW.Zs(paramString2);
    ZF();
  }
  
  public static void Zu(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] Zu() {
    return ZX;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zu : ([I)V
    //   15: ldc '÷f!$ÚðÃ÷è|ëÊz[?[7Ó}êLc0ÄËÂw.ðjK¤ùó'1¯cò¸JlþÈË$Ê\\r\\t5Si4àYÁT÷ÔðÁt'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #30
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #68
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc ')¹wþÿ¯87DÚã4¥SÂð@#!éÂËÛä\\rI7UîÄÛ@ë#TÍµ'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #31
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #100
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zbdh.a : [Ljava/lang/String;
    //   138: bipush #7
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zbdh.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #28
    //   222: goto -> 252
    //   225: bipush #12
    //   227: goto -> 252
    //   230: bipush #14
    //   232: goto -> 252
    //   235: bipush #115
    //   237: goto -> 252
    //   240: bipush #64
    //   242: goto -> 252
    //   245: bipush #65
    //   247: goto -> 252
    //   250: bipush #13
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7607) & 0xFFFF;
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
      byte b1 = 16;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbdh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */