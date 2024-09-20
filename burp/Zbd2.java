package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbd2 extends Zbqc implements Zkgx {
  private final Ztz9 Zy;
  
  private final Ztp8 Zj;
  
  private final List<Zt37> ZP;
  
  private final Zbup Zc;
  
  private final Zbqc ZU;
  
  private final Zr4 Zv;
  
  private final Zbde Z_;
  
  private final List<Zmk3> ZY;
  
  private static Zbqc[] ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbd2(Ztz9 paramZtz9, Ztp8 paramZtp8, Zb0h paramZb0h, Zbps paramZbps, Zliz paramZliz, List<Zt37> paramList, Zb3j paramZb3j) {
    super(new BorderLayout());
    this.Zy = paramZtz9;
    this.Zj = paramZtp8;
    this.ZP = paramList;
    Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.Zc = new Zbup();
    this.Zc.Zh(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.Zc.setBorder(Zxt_.Zb);
    this.Zc.setHorizontalScrollBarPolicy(31);
    this.Zc.setVerticalScrollBarPolicy(20);
    this.ZU = new Zbdp(new GridBagLayout(), this.Zc);
    this.ZU.Zl(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.Zc.setViewportView(this.ZU);
    add(this.Zc, a(18157, -24253));
    this.Zv = new Zr4(paramZb0h);
    this.Z_ = new Zbde(Zmjk.SELECTION.displayName, this.Zv);
    this.Z_.Zi(true);
    Zmk3 zmk31 = paramZb3j.Zw(paramZbps);
    Zmk3 zmk32 = paramZb3j.Zw(Zmjk.REQUEST_QUERY_PARAMETERS);
    Zmk3 zmk33 = paramZb3j.Zw(Zmjk.REQUEST_BODY_PARAMETERS);
    Zmk3 zmk34 = paramZb3j.Zw(Zmjk.REQUEST_COOKIES);
    Zmk3 zmk35 = paramZb3j.Zw(Zmjk.REQUEST_HEADERS);
    Zmk3 zmk36 = paramZb3j.Zw(Zmjk.RESPONSE_HEADERS);
    this.ZY = List.of(zmk31, zmk32, zmk33, zmk34, zmk35, zmk36);
    ZJ(paramZliz);
    this.ZU.setName(a(18147, 7352));
    this.Z_.setName(a(18155, 32079));
    zmk31.ZJ(a(18153, -32691));
    zmk32.ZJ(a(18154, 20820));
    zmk33.ZJ(a(18158, 26013));
    zmk34.ZJ(a(18152, 21054));
    zmk35.ZJ(a(18159, -10006));
    Zbqc[] arrayOfZbqc = ZA();
    zmk36.ZJ(a(18156, 8065));
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZY != null)
      this.ZY.stream().map(Zmk3::ZP).filter(Zbd2::lambda$updateUI$0).forEach(SwingUtilities::updateComponentTreeUI); 
  }
  
  public void ZK() {
    this.ZY.forEach(Zmk3::Zo);
  }
  
  public void ZB() {
    this.ZY.forEach(Zmk3::Zt);
  }
  
  public void ZJ(Zliz paramZliz) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> get : (Lburp/Zbd2;Lburp/Zliz;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zc : (Ljava/util/function/Supplier;)V
    //   11: return
  }
  
  public void Zy(Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> get : (Lburp/Zbd2;Ljava/util/function/Supplier;)Ljava/util/function/Supplier;
    //   8: invokevirtual Zc : (Ljava/util/function/Supplier;)V
    //   11: return
  }
  
  private void Zc(Supplier<Boolean> paramSupplier) {
    int i = this.Zc.getVerticalScrollBar().getValue();
    boolean bool = ((Boolean)paramSupplier.get()).booleanValue();
    if (bool) {
      this.Zc.getVerticalScrollBar().setValue(i);
      Zu();
    } 
  }
  
  private boolean Zz(Zliz paramZliz) {
    this.ZY.forEach(paramZliz::lambda$doUpdateWidgetConfigs$3);
    List<Zmk3> list = (List)this.ZY.stream().filter(paramZliz::lambda$doUpdateWidgetConfigs$4).sorted(paramZliz.ZV()).collect(Collectors.toList());
    Zx(list);
    return true;
  }
  
  private void Zx(List<Zmk3> paramList) {
    this.ZU.removeAll();
    byte b = 0;
    ZR(b++, this.Z_);
    Iterator<Zmk3> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = ZA();
    while (iterator.hasNext()) {
      Zmk3 zmk3 = iterator.next();
      ZR(b++, zmk3.ZP());
      if (arrayOfZbqc == null)
        break; 
    } 
    ZN(b);
  }
  
  private boolean ZF(Supplier<Boolean> paramSupplier) {
    Zbqc[] arrayOfZbqc = ZA();
    for (Zt37 zt37 : this.ZP) {
      if (((Boolean)paramSupplier.get()).booleanValue())
        return false; 
      zt37.Zl();
      if (arrayOfZbqc == null)
        break; 
    } 
    for (Zmk3 zmk3 : this.ZY) {
      if (((Boolean)paramSupplier.get()).booleanValue())
        return false; 
      zmk3.ZB();
      if (arrayOfZbqc == null)
        break; 
    } 
    return true;
  }
  
  public void ZS(int paramInt1, int paramInt2, String paramString) {
    Zuh.Zb(true, Zqf.ZF);
    this.Zv.Ze(new Zer3(this.Zy, this.Zj, paramInt1, paramInt2), paramString);
    this.Z_.ZR();
    this.Z_.setVisible(true);
  }
  
  public void Zs(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    Zuh.Zb(true, Zqf.ZF);
    this.Zv.Zu(new Zer3(this.Zy, this.Zj, paramInt1, paramInt2), paramString, paramList);
    this.Z_.ZR();
    this.Z_.setVisible(true);
  }
  
  public void ZU(int paramInt1, int paramInt2, String paramString) {
    Zuh.Zb(true, Zqf.ZF);
    this.Zv.Ze(new Zt66(this.Zy, this.Zj, paramInt1, paramInt2), paramString);
    this.Z_.ZR();
    this.Z_.setVisible(true);
  }
  
  public void Zh(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    Zuh.Zb(true, Zqf.ZF);
    this.Zv.Zu(new Zt66(this.Zy, this.Zj, paramInt1, paramInt2), paramString, paramList);
    this.Z_.ZR();
    this.Z_.setVisible(true);
  }
  
  public void ZF(int paramInt1, int paramInt2, String paramString) {
    Zuh.Zb(true, Zqf.ZF);
    this.Zv.Ze(new Zg7x(this.Zy, this.Zj, paramInt1, paramInt2), paramString);
    this.Z_.ZR();
    this.Z_.setVisible(true);
  }
  
  public void ZC(int paramInt1, int paramInt2, String paramString, List<Ztkm> paramList) {
    Zuh.Zb(true, Zqf.ZF);
    this.Zv.Zu(new Zg7x(this.Zy, this.Zj, paramInt1, paramInt2), paramString, paramList);
    this.Z_.ZR();
    this.Z_.setVisible(true);
  }
  
  public void ZG() {
    Zuh.Zb(true, Zqf.ZF);
    this.Z_.setVisible(false);
  }
  
  private void ZR(int paramInt, Component paramComponent) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = paramInt;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 2;
    this.ZU.add(paramComponent, gridBagConstraints);
  }
  
  private void ZN(int paramInt) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = paramInt;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZU.add(new Zm99(""), gridBagConstraints);
  }
  
  private void Zu() {
    SwingUtilities.invokeLater(this::lambda$triggerSwingRefresh$5);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z_ : Lburp/Zbde;
    //   4: invokevirtual ZH : ()Z
    //   7: istore_2
    //   8: aload_0
    //   9: getfield Z_ : Lburp/Zbde;
    //   12: invokevirtual isVisible : ()Z
    //   15: istore_3
    //   16: invokestatic ZA : ()[Lburp/Zbqc;
    //   19: aload_0
    //   20: getfield ZY : Ljava/util/List;
    //   23: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   28: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   33: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   38: invokestatic toList : ()Ljava/util/stream/Collector;
    //   41: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   46: checkcast java/util/List
    //   49: astore #4
    //   51: aload #4
    //   53: aload_0
    //   54: iload_3
    //   55: iload_2
    //   56: <illegal opcode> Zg : (Lburp/Zbd2;ZZ)Lburp/Ztcw;
    //   61: invokeinterface add : (Ljava/lang/Object;)Z
    //   66: pop
    //   67: astore_1
    //   68: aload #4
    //   70: aload_0
    //   71: getfield Zv : Lburp/Zr4;
    //   74: invokevirtual ZI : ()Lburp/Ztcw;
    //   77: invokeinterface add : (Ljava/lang/Object;)Z
    //   82: pop
    //   83: aload #4
    //   85: invokestatic ZQ : (Ljava/util/List;)Lburp/Ztcw;
    //   88: invokestatic Zwu : ()[Lburp/Zbqc;
    //   91: ifnonnull -> 101
    //   94: iconst_3
    //   95: anewarray burp/Zbqc
    //   98: invokestatic ZB : ([Lburp/Zbqc;)V
    //   101: areturn
  }
  
  public void ZU() {
    this.Z_.Zi(true);
    this.Z_.setVisible(false);
    this.Zv.ZU();
    this.ZY.forEach(Zkgx::ZU);
  }
  
  private void lambda$checkpoint$6(boolean paramBoolean1, boolean paramBoolean2) {
    this.Z_.setVisible(paramBoolean1);
    this.Z_.Zi(paramBoolean2);
  }
  
  private void lambda$triggerSwingRefresh$5() {
    Zmse.ZF(this.Zc);
  }
  
  private static boolean lambda$doUpdateWidgetConfigs$4(Zliz paramZliz, Zmk3 paramZmk3) {
    return paramZliz.Zx(paramZmk3.ZK()).ZO();
  }
  
  private static void lambda$doUpdateWidgetConfigs$3(Zliz paramZliz, Zmk3 paramZmk3) {
    paramZmk3.ZU(paramZliz);
  }
  
  private Boolean lambda$rebuildFromModel$2(Supplier<Boolean> paramSupplier) {
    return Boolean.valueOf(ZF(paramSupplier));
  }
  
  private Boolean lambda$updateWidgetConfigs$1(Zliz paramZliz) {
    return Boolean.valueOf(Zz(paramZliz));
  }
  
  private static boolean lambda$updateUI$0(Component paramComponent) {
    return (paramComponent.getParent() == null);
  }
  
  public static void ZB(Zbqc[] paramArrayOfZbqc) {
    ZF = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZA() {
    return ZF;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_3
    //   10: anewarray burp/Zbqc
    //   13: ldc '¯æ LT¹Q£òn#LmwÚ¢hj$&a}ù?o×6ÃOJó\\bï]\\f/.ÓA¬£iTfX9|¿ø, Ì!öÚË1Iý60ÜG\\n´°*¨ ´ñ<ð0 ¼$A`WÙzk¶Ö_èñ\¯×F<ëðÚ(#>WÂ&s(%Ð4J¶ïÛÏa¸½KFÕfçL²JíÄê@]Ä±rãÞ,ë^DBªXÝ¼Õ¾tÅ\\rÃüuMWNO'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic ZB : ([Lburp/Zbqc;)V
    //   25: bipush #25
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #99
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc '\¡¡[¤WRvL¥bC\\bÂ5ÖÂ} ù$ÿïÈ!Þ´nYéíKm¹ëÿØK±'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #31
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #54
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zbd2.a : [Ljava/lang/String;
    //   139: bipush #9
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zbd2.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 267
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #54
    //   222: goto -> 251
    //   225: bipush #42
    //   227: goto -> 251
    //   230: bipush #43
    //   232: goto -> 251
    //   235: bipush #9
    //   237: goto -> 251
    //   240: bipush #66
    //   242: goto -> 251
    //   245: iconst_3
    //   246: goto -> 251
    //   249: bipush #33
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 173
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 169
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x46EB) & 0xFFFF;
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
      byte b1 = 72;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */