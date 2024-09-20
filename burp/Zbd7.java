package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import net.portswigger.Zip;
import net.portswigger.Zm2;

public class Zbd7 extends Zbqc implements Zeq, Zl5p {
  static final Border ZA;
  
  private final Zgkx ZX;
  
  private final Zlns Z_;
  
  private final Zbws ZI;
  
  private final Zbdv ZH;
  
  private final Zbdm ZL;
  
  private final Zbdb ZK;
  
  private final Zbc9 ZZ;
  
  private final Ztnb ZY;
  
  private final List<Integer> ZE;
  
  private final Zm8o ZJ;
  
  private final Zeo ZG;
  
  private final Ze9n ZO;
  
  private final Zip Zs;
  
  private final Zip ZF;
  
  private final AtomicInteger ZB = new AtomicInteger(0);
  
  private JSeparator Zn;
  
  private boolean Zo;
  
  private static String Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbd7(Zb0h paramZb0h, Zgkx paramZgkx, Zgtm paramZgtm, Zip paramZip1, Zip paramZip2) {
    super(new GridBagLayout());
    this.ZX = paramZgkx;
    this.Zs = paramZip1;
    this.ZF = paramZip2;
    this.Z_ = Zlns.Zf();
    this.ZI = new Zbws();
    this.ZH = new Zbdv(new Zg0_(this));
    this.ZL = new Zbdm(paramZb0h, new Ztjn(this));
    this.ZK = new Zbdb(this::Zc, paramZgkx.ZS());
    this.ZZ = new Zbc9(new Component[] { this.ZH, this.ZL, this.ZK });
    this.ZE = new ArrayList<>();
    this.ZG = new Zeo();
    this.ZO = Ze3m.ZC(Zeuf.LINE_WRAP, Zlkk.INSPECTOR_TABLE_HEADER_TOGGLE_BUTTON_INACTIVE).ZG(Zlkk.INSPECTOR_TABLE_HEADER_TOGGLE_BUTTON_HOVER).Zc(Zlkk.INSPECTOR_TABLE_HEADER_TOGGLE_BUTTON_ACTIVE).Zr(Zlkk.INSPECTOR_TABLE_HEADER_TOGGLE_BUTTON_ACTIVE_HOVER).ZU(Zmcx.LINE_SIZE).Z_();
    Zsa5 zsa5 = new Zsa5(this.ZI, paramZgkx, this.Z_);
    Objects.requireNonNull(zsa5);
    Objects.requireNonNull(this.ZG);
    this.ZY = new Ztnb(paramZgkx, paramZgtm, zsa5::ZJ, this.Z_, this.ZG::Zr);
    this.ZI.setName(a(-7323, 31715));
    this.ZI.ZL(this.ZY);
    this.ZI.ZN(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    this.ZI.Za(Zlkk.INSPECTOR_TABLE_ROW_HIGHLIGHT_BACKGROUND);
    this.ZI.ZN((Border)null);
    this.ZI.ZH((Zlkk)null);
    this.ZI.Zc(this);
    this.ZI.setShowGrid(false);
    this.ZI.ZP(new Ze8q(this));
    this.ZI.putClientProperty(a(-7324, -1656), Boolean.valueOf(true));
    this.Z_.Zn(this.ZI);
    this.ZJ = new Zm8o(this);
    this.ZJ.Zz(Zt00.BOLD_FONT);
    this.ZJ.ZF(Zlkk.INSPECTOR_TABLE_HEADING_BACKGROUND);
    this.ZJ.ZE(2);
    this.ZI.setTableHeader(this.ZJ);
    this.ZZ.Zl(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    Zd();
    ZF();
    ZM();
    Zf();
    String str = ZE();
    ZD();
    if (Zbqc.Zwu() == null)
      ZI("Ek4kcb"); 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZI != null)
      SwingUtilities.invokeLater(this::lambda$updateUI$0); 
  }
  
  public void ZN() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZY : Lburp/Ztnb;
    //   4: invokevirtual ZY : ()V
    //   7: invokestatic ZE : ()Ljava/lang/String;
    //   10: aload_0
    //   11: invokevirtual ZD : ()V
    //   14: astore_1
    //   15: aload_0
    //   16: getfield ZX : Lburp/Zgkx;
    //   19: invokeinterface ZS : ()Z
    //   24: istore_2
    //   25: aload_0
    //   26: getfield ZK : Lburp/Zbdb;
    //   29: iload_2
    //   30: invokevirtual ZB : (Z)V
    //   33: aload_0
    //   34: getfield ZY : Lburp/Ztnb;
    //   37: invokevirtual getRowCount : ()I
    //   40: ifne -> 66
    //   43: aload_0
    //   44: getfield ZZ : Lburp/Zbc9;
    //   47: aload_0
    //   48: getfield ZK : Lburp/Zbdb;
    //   51: invokevirtual ZP : (Ljava/awt/Component;)V
    //   54: aload_0
    //   55: getfield ZZ : Lburp/Zbc9;
    //   58: iconst_1
    //   59: invokevirtual setVisible : (Z)V
    //   62: aload_1
    //   63: ifnull -> 99
    //   66: aload_0
    //   67: getfield ZZ : Lburp/Zbc9;
    //   70: aload_0
    //   71: getfield ZK : Lburp/Zbdb;
    //   74: invokevirtual ZR : (Ljava/awt/Component;)Z
    //   77: ifeq -> 91
    //   80: aload_0
    //   81: getfield ZZ : Lburp/Zbc9;
    //   84: aload_0
    //   85: getfield ZH : Lburp/Zbdv;
    //   88: invokevirtual ZP : (Ljava/awt/Component;)V
    //   91: aload_0
    //   92: getfield ZZ : Lburp/Zbc9;
    //   95: iload_2
    //   96: invokevirtual setVisible : (Z)V
    //   99: aload_0
    //   100: getfield ZY : Lburp/Ztnb;
    //   103: invokevirtual getRowCount : ()I
    //   106: istore_3
    //   107: aload_0
    //   108: getfield ZE : Ljava/util/List;
    //   111: iload_3
    //   112: <illegal opcode> test : (I)Ljava/util/function/Predicate;
    //   117: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   122: pop
    //   123: aload_0
    //   124: getfield ZE : Ljava/util/List;
    //   127: invokeinterface isEmpty : ()Z
    //   132: ifeq -> 163
    //   135: aload_0
    //   136: getfield ZH : Lburp/Zbdv;
    //   139: iconst_0
    //   140: invokevirtual Z_ : (Z)V
    //   143: aload_0
    //   144: getfield ZH : Lburp/Zbdv;
    //   147: iconst_0
    //   148: invokevirtual ZK : (Z)V
    //   151: aload_0
    //   152: getfield ZH : Lburp/Zbdv;
    //   155: iconst_0
    //   156: invokevirtual ZM : (Z)V
    //   159: aload_1
    //   160: ifnull -> 172
    //   163: aload_0
    //   164: <illegal opcode> run : (Lburp/Zbd7;)Ljava/lang/Runnable;
    //   169: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   172: return
  }
  
  public void Zc(Zo4 paramZo4) {
    this.ZB.incrementAndGet();
    boolean bool1 = this.ZG.Zr();
    boolean bool2 = paramZo4.Zn();
    this.Zo = bool2;
    this.ZG.ZF(bool2);
    if (bool2 != bool1)
      ZY(); 
  }
  
  private void ZY() {
    this.ZJ.repaint();
    if (this.ZI.isEditing())
      this.ZI.getCellEditor().stopCellEditing(); 
    Zx();
  }
  
  private void Zx() {
    SwingUtilities.invokeLater(this::lambda$adjustTableRowHeights$3);
  }
  
  private void ZM() {
    this.Z_.Zf(this.ZI, 2, ZS());
  }
  
  private void Zf() {
    this.ZI.setRowHeight(this.ZI.getRowHeight() + 6);
  }
  
  private int ZS() {
    return (int)Math.ceil(this.ZO.getIconWidth() * 1.2D + 10.0D);
  }
  
  private void ZD() {
    boolean bool = (this.ZY.getRowCount() > 0) ? true : false;
    this.ZI.getTableHeader().setVisible(bool);
    this.ZI.setVisible(bool);
    this.Zn.setVisible((bool && this.ZX.ZS()));
  }
  
  private void Zd() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    add(this.ZI.getTableHeader(), gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    add(this.ZI, gridBagConstraints);
  }
  
  private void ZF() {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zn = new JSeparator();
    add(this.Zn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    add(this.ZZ, gridBagConstraints);
  }
  
  void Zc() {
    this.ZZ.ZP(this.ZL);
    this.ZL.Zs();
  }
  
  public synchronized void ZK(int paramInt1, int paramInt2) {
    this.ZE.clear();
    Objects.requireNonNull(this.ZE);
    Arrays.stream(this.ZI.getSelectedRows()).boxed().forEach(this.ZE::add);
    String str = ZE();
    if (!this.ZE.isEmpty()) {
      this.ZH.Z_(true);
      this.ZH.ZK((this.ZE.size() == 1 && ((Integer)this.ZE.getFirst()).intValue() > 0));
      this.ZH.ZM((this.ZE.size() == 1 && ((Integer)this.ZE.getFirst()).intValue() < this.ZY.getRowCount() - 1));
      if (str != null) {
        this.ZH.Z_(false);
        this.ZH.ZK(false);
        this.ZH.ZM(false);
        return;
      } 
      return;
    } 
    this.ZH.Z_(false);
    this.ZH.ZK(false);
    this.ZH.ZM(false);
  }
  
  private void Zw() {
    if (!this.ZE.isEmpty()) {
      int i = ((Integer)this.ZE.getFirst()).intValue();
      ArrayList<Integer> arrayList = new ArrayList<>(this.ZE);
      this.ZE.clear();
      int j = this.ZY.getRowCount() - arrayList.size();
      this.ZE.add(Integer.valueOf((i < j) ? i : (i - 1)));
      this.ZX.Zl(arrayList);
    } 
  }
  
  public Component ZB() {
    return this;
  }
  
  public int Zl() {
    return this.ZY.getRowCount();
  }
  
  public void Zd(String paramString1, String paramString2) {
    this.ZX.ZT(paramString1, paramString2);
  }
  
  public void ZZ() {
    this.ZL.Zz();
  }
  
  public void Z_() {
    Zm2.ZC(this.Zs);
  }
  
  public void Zo() {
    Zm2.ZC(this.ZF);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZE : Ljava/util/List;
    //   4: invokestatic copyOf : (Ljava/util/Collection;)Ljava/util/List;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield ZB : Ljava/util/concurrent/atomic/AtomicInteger;
    //   12: invokevirtual get : ()I
    //   15: istore_2
    //   16: aload_0
    //   17: getfield ZG : Lburp/Zeo;
    //   20: invokevirtual Zr : ()Z
    //   23: istore_3
    //   24: aload_0
    //   25: aload_1
    //   26: iload_2
    //   27: iload_3
    //   28: <illegal opcode> Zg : (Lburp/Zbd7;Ljava/util/List;IZ)Lburp/Ztcw;
    //   33: areturn
  }
  
  public void ZU() {
    this.ZL.Zi();
    this.ZI.clearSelection();
    this.ZE.clear();
    if (this.ZG.Zr() != this.Zo) {
      this.ZG.ZF(this.Zo);
      ZY();
    } 
  }
  
  private void lambda$checkpoint$5(List<? extends Integer> paramList, int paramInt, boolean paramBoolean) {
    this.ZL.Zi();
    this.ZI.clearSelection();
    paramList.forEach(this::lambda$checkpoint$4);
    this.ZE.clear();
    this.ZE.addAll(paramList);
    boolean bool = (paramInt < this.ZB.get()) ? true : false;
    boolean bool1 = bool ? this.Zo : paramBoolean;
    if (bool1 != this.ZG.Zr()) {
      this.ZG.ZF(bool1);
      ZY();
    } 
  }
  
  private void lambda$checkpoint$4(Integer paramInteger) {
    this.ZI.addRowSelectionInterval(paramInteger.intValue(), paramInteger.intValue());
  }
  
  private void lambda$adjustTableRowHeights$3() {
    String str = ZE();
    if (!this.ZG.Zr()) {
      int i = this.ZI.getRowHeight();
      byte b = 0;
      while (b < this.ZI.getRowCount()) {
        this.ZI.setRowHeight(b, i);
        b++;
        if (str != null)
          break; 
      } 
    } 
    this.ZI.revalidate();
    this.ZI.repaint();
  }
  
  private void lambda$refreshFromModel$2() {
    ArrayList<Integer> arrayList = new ArrayList<>(this.ZE);
    this.ZI.changeSelection(((Integer)arrayList.getFirst()).intValue(), -1, false, false);
    String str = ZE();
    byte b = 1;
    while (b < arrayList.size()) {
      this.ZI.changeSelection(((Integer)arrayList.get(b)).intValue(), -1, true, false);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static boolean lambda$refreshFromModel$1(int paramInt, Integer paramInteger) {
    return (paramInteger.intValue() >= paramInt);
  }
  
  private void lambda$updateUI$0() {
    ZM();
    Zf();
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'jóÿÅqÏùl·Uïm|~õ¸ÞÏá<>ÏÚÃý3£'2'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic ZI : (Ljava/lang/String;)V
    //   21: bipush #14
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #85
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic burp/Zbd7.a : [Ljava/lang/String;
    //   76: iconst_2
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Zbd7.b : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #64
    //   158: goto -> 188
    //   161: bipush #102
    //   163: goto -> 188
    //   166: bipush #114
    //   168: goto -> 188
    //   171: bipush #91
    //   173: goto -> 188
    //   176: bipush #55
    //   178: goto -> 188
    //   181: bipush #64
    //   183: goto -> 188
    //   186: bipush #75
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 43
    //   231: new javax/swing/border/EmptyBorder
    //   234: dup
    //   235: iconst_4
    //   236: iconst_3
    //   237: iconst_4
    //   238: iconst_3
    //   239: invokespecial <init> : (IIII)V
    //   242: putstatic burp/Zbd7.ZA : Ljavax/swing/border/Border;
    //   245: return
  }
  
  public static void ZI(String paramString) {
    Zh = paramString;
  }
  
  public static String ZE() {
    return Zh;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE365) & 0xFFFF;
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
      byte b1 = 58;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */