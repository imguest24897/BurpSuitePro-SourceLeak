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
import java.util.function.Supplier;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;

public class Zbd9 extends Zbqc implements Zlxd {
  private final Zb0h Zj;
  
  private final Ztz9 ZA;
  
  private final Supplier<List<Zb6u>> Zu;
  
  private final Zgtm ZS;
  
  private final List<Zbdu> ZR;
  
  private final boolean Zt;
  
  private final Zbqc ZK;
  
  private final Zbds Zl;
  
  private final Zbds Zm;
  
  private Zbdi Zw;
  
  private Zm99 Zi;
  
  private Zbqc ZW;
  
  private String Zz;
  
  private String Zr;
  
  private Ze01 ZZ;
  
  private Ze01 ZQ;
  
  private Zbqc ZD;
  
  private Zlus ZT;
  
  private int Zc;
  
  private int ZG;
  
  private List<Zb6u> ZM;
  
  private static String Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbd9(Zb0h paramZb0h, Ztz9 paramZtz9, Supplier<List<Zb6u>> paramSupplier, int paramInt, Zgtm paramZgtm) {
    super(new BorderLayout());
    this.Zj = paramZb0h;
    this.ZA = paramZtz9;
    this.Zu = paramSupplier;
    this.ZG = paramInt;
    this.ZS = paramZgtm;
    this.ZR = new ArrayList<>();
    this.Zt = paramZgtm.ZS();
    Zbup zbup = new Zbup();
    zbup.setBorder(Zxt_.Zb);
    zbup.setHorizontalScrollBarPolicy(31);
    zbup.setVerticalScrollBarPolicy(20);
    this.ZK = new Zbdp(new GridBagLayout(), zbup);
    zbup.setViewportView(this.ZK);
    String str = Zl();
    add(zbup, a(6978, 20666));
    this.Zl = this.Zt ? new Zbd3(paramZb0h, this::ZZ, this::ZB) : new Zbd1(paramZb0h);
    this.Zm = this.Zt ? new Zbd3(paramZb0h, this::ZZ, this::ZR) : new Zbd1(paramZb0h);
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZK.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbup.Zh(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZM = paramSupplier.get();
    Zc();
    ZM();
    Za();
    Zy();
    if (this.Zt)
      Zz(); 
    Zh();
    ZS();
    if (Zbqc.Zwu() == null)
      ZU("HcOJib"); 
  }
  
  private void Zc() {
    this.Zw = new Zbdi(this);
    add(this.Zw, a(6982, -1919));
  }
  
  private void ZM() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zc++;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 10, 0, 10);
    this.Zi = new Zm99();
    this.ZK.add(this.Zi, gridBagConstraints);
  }
  
  private void Za() {
    this.ZW = new Zbd4(a(6980, 17693), this.Zl);
    Zbd4 zbd4 = new Zbd4(a(6976, 20717), this.Zm);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zc++;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    this.ZK.add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zc++;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    this.ZK.add(zbd4, gridBagConstraints);
  }
  
  private void Zy() {
    this.ZD = new Zbqc(new GridBagLayout());
    this.ZD.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zc++;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 10, 0, 10);
    this.ZK.add(this.ZD, gridBagConstraints);
  }
  
  private void Zz() {
    this.ZZ = new Ze01(a(6983, 8713));
    this.ZZ.addActionListener(this::Zz);
    this.ZQ = new Ze0q(a(6977, 24850));
    this.ZQ.addActionListener(this::Zc);
    Zl(false);
    Zbqc zbqc1 = new Zbqc(new GridLayout(1, 0, 10, 0));
    zbqc1.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc1.add(this.ZZ);
    zbqc1.add(this.ZQ);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    zbqc2.add(zbqc1, a(6981, 6357));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zc++;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(5, 10, 10, 10);
    this.ZK.add(zbqc2, gridBagConstraints);
  }
  
  private void Zh() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zc++;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZK.add(new Zm99(""), gridBagConstraints);
  }
  
  public void ZE() {
    this.ZA.ZV();
  }
  
  public void Z_() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_DETAILS_PREVIOUS_NEXT);
    this.ZG = Math.max(this.ZG - 1, 0);
    ZS();
  }
  
  public void Zt() {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_DETAILS_PREVIOUS_NEXT);
    this.ZG = Math.min(this.ZG + 1, this.ZM.size() - 1);
    ZS();
  }
  
  public void ZD() {
    this.ZM = this.Zu.get();
    if (this.ZM.isEmpty()) {
      ZE();
      return;
    } 
    if (this.ZG >= this.ZM.size())
      this.ZG = this.ZM.size() - 1; 
    ZS();
    Zl(false);
  }
  
  private void ZS() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zk : ()Lburp/Zb6u;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield Zw : Lburp/Zbdi;
    //   9: aload_0
    //   10: getfield ZG : I
    //   13: ifle -> 20
    //   16: iconst_1
    //   17: goto -> 21
    //   20: iconst_0
    //   21: invokevirtual Zb : (Z)V
    //   24: aload_0
    //   25: getfield Zw : Lburp/Zbdi;
    //   28: aload_0
    //   29: getfield ZG : I
    //   32: aload_0
    //   33: getfield ZM : Ljava/util/List;
    //   36: invokeinterface size : ()I
    //   41: iconst_1
    //   42: isub
    //   43: if_icmpge -> 50
    //   46: iconst_1
    //   47: goto -> 51
    //   50: iconst_0
    //   51: invokevirtual ZD : (Z)V
    //   54: aload_0
    //   55: aload_1
    //   56: <illegal opcode> run : (Lburp/Zbd9;Lburp/Zb6u;)Ljava/lang/Runnable;
    //   61: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   64: return
  }
  
  private void ZX() {
    this.ZR.clear();
    this.ZT = ZW();
    List<Ztkm> list = Zk().ZY(this.Zt);
    Objects.requireNonNull(this.ZR);
    list.stream().map(this::lambda$showDecoderPanels$1).forEach(this.ZR::add);
    this.ZT.ZE();
  }
  
  private Zlus ZW() {
    Zmcl zmcl = new Zmcl(this);
    Objects.requireNonNull(this.ZA);
    return new Zlus(this.Zj, zmcl, this.ZR, this.Zt, this.ZD, this.ZA::Zu, this::ZZ);
  }
  
  private void ZB() {
    Zf();
  }
  
  private void ZR() {
    this.ZT.Zd();
    Zf();
  }
  
  private void Zf() {
    SwingUtilities.invokeLater(this::lambda$showActionButtonsIfTextModified$2);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    ZZ();
  }
  
  private void ZZ() {
    if (this.ZQ.isEnabled()) {
      this.Zz = this.Zl.Zw();
      this.Zr = this.Zm.Zw();
      this.ZM.set(this.ZG, Zk().ZV(this.Zz, this.Zr));
      this.ZS.Zr(this.ZG, this.Zz, this.Zr);
      Zl(false);
    } 
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    this.Zl.Zs(this.Zz);
    this.Zm.Zs(this.Zr);
    ZR();
  }
  
  private Zb6u Zk() {
    return this.ZM.get(this.ZG);
  }
  
  private void Zl(boolean paramBoolean) {
    if (this.Zt) {
      this.ZZ.setEnabled(paramBoolean);
      this.ZQ.setEnabled(paramBoolean);
    } 
  }
  
  private void lambda$showActionButtonsIfTextModified$2() {
    boolean bool = (!this.Zl.Zw().equals(this.Zz) || !this.Zm.Zw().equals(this.Zr)) ? true : false;
    Zl(bool);
    if (this.Zl.Zw().isEmpty())
      this.ZQ.setEnabled(false); 
  }
  
  private Zbdu lambda$showDecoderPanels$1(Ztkm paramZtkm) {
    return Zbdu.ZV(this.Zj, this.ZT, paramZtkm.ZDM(), paramZtkm.ZDZ());
  }
  
  private void lambda$showItem$0(Zb6u paramZb6u) {
    ZX();
    this.Zi.setText(paramZb6u.Zv.description);
    this.Zz = paramZb6u.ZQ;
    this.Zr = paramZb6u.ZI;
    this.Zl.Zs(paramZb6u.ZQ);
    this.Zm.Zs(paramZb6u.ZI);
    this.ZW.setVisible(paramZb6u.ZJ);
  }
  
  public static void ZU(String paramString) {
    Zd = paramString;
  }
  
  public static String Zl() {
    return Zd;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ''Ú#..ßy£¡QûrB¹`(ÈE'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: ldc 'wpFRpb'
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZU : (Ljava/lang/String;)V
    //   27: bipush #110
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
    //   72: ldc 'ùò'édSh/BÙÌ9'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #13
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #110
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
    //   133: putstatic burp/Zbd9.a : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zbd9.b : [Ljava/lang/String;
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
    //   216: bipush #41
    //   218: goto -> 248
    //   221: bipush #69
    //   223: goto -> 248
    //   226: bipush #82
    //   228: goto -> 248
    //   231: bipush #40
    //   233: goto -> 248
    //   236: bipush #45
    //   238: goto -> 248
    //   241: bipush #50
    //   243: goto -> 248
    //   246: bipush #105
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
    int i = (paramInt1 ^ 0x1B44) & 0xFFFF;
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
      char c = '¬';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */