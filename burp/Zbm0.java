package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import javax.swing.BorderFactory;

public class Zbm0 extends Zbv5 implements Zt3u {
  private final Zlfb ZB;
  
  private final Zzkr Zh;
  
  private final List<Zlk6> ZF;
  
  private final Predicate<String> Zn;
  
  private final Set<String> Zr;
  
  private final Zbws Zg;
  
  private final Ztn3 Zw;
  
  private Ze01 Zu;
  
  private Ze01 ZD;
  
  private Ze01 Zv;
  
  private Zmyw ZH;
  
  private Zbup Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbm0(Zlfb paramZlfb, Zzkr paramZzkr, Zlli<Zt1s> paramZlli) {
    this.ZB = paramZlfb;
    this.Zh = paramZzkr;
    this.ZF = new ArrayList<>();
    this.Zn = this::lambda$new$0;
    this.Zr = Set.of(Zjd());
    Zj();
    setName(a(-6434, -30337));
    this.Zw = new Ztn3(paramZzkr, this.ZF);
    this.Zg = new Zbws(this.Zw);
    this.Zg.Zc(this::lambda$new$1);
    this.Zt.setViewportView(this.Zg);
    this.Zg.getSelectionModel().setSelectionInterval(0, 0);
    paramZlli.ZE(Zt1s.ZX, this::lambda$new$2);
    paramZlli.ZE(Zt1s.Zr, this::lambda$new$2);
  }
  
  public String Zjd() {
    return a(-6439, 32694);
  }
  
  public String ZjS() {
    return a(-6435, -5352);
  }
  
  public Component ZjY() {
    Zm2o zm2o = new Zm2o();
    zm2o.Zi(Zk97.DESKTOP_DASHBOARD_TASK_EXECUTION_SETTINGS);
    zm2o.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
    return zm2o;
  }
  
  public Collection<String> ZjD() {
    return this.Zr;
  }
  
  public void Zt2() {
    this.ZF.clear();
    Objects.requireNonNull(this.ZF);
    this.Zh.Zk().stream().map(Zbm0::lambda$configChanged$4).forEach(this.ZF::add);
    this.Zw.fireTableDataChanged();
  }
  
  private void Zq() {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool = Zlfb.ZB();
    if (this.Zg.getSelectedRowCount() != 1)
      bool1 = false; 
    int[] arrayOfInt1 = this.Zg.getSelectedRows();
    int[] arrayOfInt2 = arrayOfInt1;
    int i = arrayOfInt2.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt2[b];
      boolean bool3 = (j < this.Zh.Zc()) ? true : false;
      if (bool3 && this.Zh.ZE(this.Zg.convertRowIndexToModel(j)).ZJ())
        bool2 = false; 
      b++;
      if (bool)
        break; 
    } 
    this.ZD.setEnabled(bool1);
    this.Zu.setEnabled(bool2);
  }
  
  private void Zj() {
    this.Zv = new Ze01();
    this.ZD = new Ze01();
    this.Zu = new Ze01();
    this.ZH = new Zmyw();
    this.Zt = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zv.setText(a(-6440, -20769));
    this.Zv.addActionListener(new Zrj4(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zv, gridBagConstraints);
    this.ZD.setText(a(-6437, 14089));
    this.ZD.setEnabled(false);
    this.ZD.addActionListener(new Ztox(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZD, gridBagConstraints);
    this.Zu.setText(a(-6433, -3945));
    this.Zu.setEnabled(false);
    this.Zu.addActionListener(new Zsc8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zu, gridBagConstraints);
    this.ZH.setLeftComponent(this.Zt);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZH, gridBagConstraints);
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    Zrha zrha = Zrha.ZH(Zt2m.ZF(this), (new Zlk6()).Zq(true).ZA(10).Zj(500).Zw(true).ZA(true), this.Zn);
    if (zrha.ZJ) {
      int i = this.ZF.size();
      Zlk6 zlk6 = zrha.ZP;
      this.ZF.add(zlk6);
      this.Zw.fireTableRowsInserted(i, i);
      this.ZB.ZX(zlk6.Zi());
    } 
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    int i = this.Zg.convertRowIndexToModel(this.Zg.getSelectedRow());
    Zlk6 zlk6 = this.ZF.get(i);
    Zrha zrha = Zrha.ZD(Zt2m.ZF(this), zlk6, this.Zn);
    if (zrha.ZJ) {
      boolean bool = (i < this.Zh.Zc()) ? true : false;
      if (bool) {
        Zr5_ zr5_ = this.Zh.ZE(i);
        this.ZB.Z_(zr5_.Z_(), zlk6.Zi());
      } 
      this.Zw.fireTableRowsUpdated(i, i);
    } 
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    boolean bool = false;
    ArrayList<Zlk6> arrayList = new ArrayList();
    ArrayList<Integer> arrayList1 = new ArrayList();
    int[] arrayOfInt = this.Zg.getSelectedRows();
    int i = arrayOfInt.length;
    boolean bool1 = Zlfb.ZB();
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt[b];
      int k = this.Zg.convertRowIndexToModel(j);
      Zlk6 zlk6 = this.ZF.get(k);
      arrayList.add(zlk6);
      boolean bool3 = (k < this.Zh.Zc()) ? true : false;
      if (bool3) {
        Zr5_ zr5_ = this.Zh.ZE(k);
        if (zr5_.Zz())
          bool = true; 
        arrayList1.add(Integer.valueOf(zr5_.Z_()));
      } 
      b++;
      if (bool1)
        break; 
    } 
    boolean bool2 = true;
    if (bool)
      bool2 = Zx6o.ZY(this, a(-6438, 12584)); 
    if (bool2) {
      this.ZF.removeAll(arrayList);
      this.Zw.fireTableDataChanged();
      this.ZB.Zl(arrayList1);
    } 
  }
  
  private static Zlk6 lambda$configChanged$4(Zr5_ paramZr5_) {
    return new Zlk6(paramZr5_.ZO());
  }
  
  private void lambda$new$2(Zxr8 paramZxr8) {
    Zt2();
  }
  
  private void lambda$new$1(int paramInt1, int paramInt2) {
    Zq();
  }
  
  private boolean lambda$new$0(String paramString) {
    boolean bool = Zlfb.ZN();
    for (Zlk6 zlk6 : this.ZF) {
      if (Objects.equals(zlk6.Zv(), paramString))
        return true; 
      if (!bool)
        break; 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'r©KcËß#&5i¬gaîý>~3Ñ\\bÝïøùhÅ*I ¢MGð[I-c%·Õ¦qõêH rmG·[`ý w÷dÊ%Õ°WKïÊ%ÚhL Ý¢ÅDñ;¨q3"øj)¼èx´ì¦â;Áä}U±\xì}'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #60
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
    //   67: ldc '"W¡ö`þÖ¤¾îU£%Ñ¨=óÿíýÔ8[¢*É¬V$qæJ&Øv`4¢ËîÖLýÖPßêç½CY½L#¾æG²¬T_íÀ9lfx´è»"ÿÚ+õCüoR¢"Ç0w¥?n_JßÖ¦¥I_mÅéJb¦Ó:!éâÃÉæFÝ~I½­çð>Ìô6õ¯Z;ÏÖ2 Qó¼Fåíøï´\\r|{D\\f¹S(ç²ç*\\r*Ñ:Ce¥'z1DâÞóå#{ó\·,éª¤[]\\tñ#CÆ{[¦èJÏ9Ý±¤}¥mDá¬¢$)·®ÚëÈæÞ\NéZcÉ$0Rrî¯ÙÇ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #24
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #28
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
    //   128: putstatic burp/Zbm0.a : [Ljava/lang/String;
    //   131: bipush #7
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbm0.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #119
    //   214: goto -> 243
    //   217: bipush #91
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #50
    //   228: goto -> 243
    //   231: bipush #41
    //   233: goto -> 243
    //   236: bipush #35
    //   238: goto -> 243
    //   241: bipush #16
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
    int i = (paramInt1 ^ 0xFFFFE6DB) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */