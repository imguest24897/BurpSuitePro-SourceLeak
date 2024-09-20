package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.JMenuItem;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zbha extends Zbhh {
  private final Zm99 ZU;
  
  private final Zexh ZV;
  
  private final Zttp ZM;
  
  private final Zt4u ZO;
  
  private final Zerg Zq;
  
  private final Supplier<Zbiv> ZC;
  
  private final Zkl6 Zs;
  
  private final Ztyg ZR;
  
  private final Zb_j Zn;
  
  private final Zsh8 ZS;
  
  private final Zbyn ZH;
  
  private final Zldc Zo;
  
  private final Zzm6 Zj;
  
  private final Zmuy Zx;
  
  private final Zx_d Zg;
  
  private final Supplier<Zlvv> ZI;
  
  private final Zzyg Zy;
  
  private final Zeg4 Zi;
  
  private final Zxco Zr;
  
  private final Zmyz ZL;
  
  private final Zbws Zv;
  
  private Zef1 Z_;
  
  private Zepe Zt;
  
  private Zepe ZA;
  
  private Zbk5 Zk;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zbha(Zt4u paramZt4u, Zerg paramZerg, Supplier<Zbiv> paramSupplier, Zkl6 paramZkl6, Ztyg paramZtyg, Zb_j paramZb_j, Ztwv paramZtwv, Zsh8 paramZsh8, Zbyn paramZbyn, Ze5c paramZe5c, Zldc paramZldc, Zzm6 paramZzm6, Zmuy paramZmuy, Zg7v paramZg7v, Zx_d paramZx_d, Supplier<Zlvv> paramSupplier1, Zzyg paramZzyg, Zeg4 paramZeg4, Zeaw paramZeaw, Zxco paramZxco, Ztj1 paramZtj1, Zlfb paramZlfb, Zbws paramZbws, Zm6x paramZm6x) {
    super(paramZtj1, paramZlfb, paramZm6x);
    this.ZO = paramZt4u;
    this.Zq = paramZerg;
    this.ZC = paramSupplier;
    this.Zs = paramZkl6;
    this.ZR = paramZtyg;
    this.Zn = paramZb_j;
    this.ZS = paramZsh8;
    this.ZH = paramZbyn;
    this.Zo = paramZldc;
    this.Zj = paramZzm6;
    this.Zx = paramZmuy;
    this.Zg = paramZx_d;
    this.ZI = paramSupplier1;
    this.Zy = paramZzyg;
    this.Zi = paramZeg4;
    this.Zr = paramZxco;
    this.Zv = paramZbws;
    this.ZU = new Zm99();
    this.ZV = new Zexh();
    this.ZL = new Zmyz(0);
    this.ZM = Zttp.Zo();
    this.ZV.setPreferredSize(new Dimension(0, 6));
    this.ZV.Zx(Zlkk.TASK_PROGRESS_BAR_BACKGROUND);
    this.ZV.ZX(Zlkk.TASK_PROGRESS_BAR_FOREGROUND);
    setName(b(15275, 31582));
    Zbqc zbqc = Zl(paramZb_j, paramZtwv, paramZe5c, paramZldc);
    ZH(b(15264, -27196), zbqc);
    Zm0o[] arrayOfZm0o1 = paramZbyn.Zv();
    Zm0o[] arrayOfZm0o2 = arrayOfZm0o1;
    int i = arrayOfZm0o2.length;
    String str = Zbhr.ZQ();
    byte b = 0;
    while (b < i) {
      Zm0o zm0o = arrayOfZm0o2[b];
      ZH(zm0o.Zq(), zm0o.Z_());
      b++;
      if (str != null) {
        Zbqc.Zr(new Zbqc[3]);
        break;
      } 
    } 
    this.ZA.setEnabled(paramZeaw.Zz());
    ZR();
    Zr(paramZg7v);
  }
  
  private Zbqc Zl(Zb_j paramZb_j, Ztwv paramZtwv, Ze5c paramZe5c, Zldc paramZldc) {
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setLayout(new GridBagLayout());
    Zbup zbup = new Zbup();
    zbup.setViewportView(this.Zv);
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.add(zbup, b(15272, 24011));
    zbqc2.setBorder(new EmptyBorder(0, 20, 0, 20));
    Zvoc zvoc = new Zvoc(paramZe5c.ZHJ());
    Zllv zllv = new Zllv(paramZtwv, this.Zx);
    Zbta zbta = new Zbta(zvoc, zllv::lambda$buildResultsPanel$2);
    Zez6 zez6 = new Zez6(zbta);
    this.Zk = (new Zxwe(zvoc, zllv, zez6)).ZU();
    Zbkd zbkd = new Zbkd();
    zbkd.Zn(this.Zk);
    zbkd.setBorder(new EmptyBorder(10, 0, 10, 0));
    Zm2j zm2j = new Zm2j(this.Zv);
    zbkd.Zh(zm2j);
    zbqc2.add(zbkd, b(15278, -28880));
    this.ZL.setTopComponent(zbqc2);
    this.ZL.setBottomComponent(paramZldc.Zx());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    zbqc1.add(this.ZL, gridBagConstraints);
    this.ZU.setName(b(15279, 1315));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new Insets(0, 5, 5, 0);
    zbqc1.add(this.ZU, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(0, 10, 5, 5);
    zbqc1.add(this.ZV, gridBagConstraints);
    Zz(paramZb_j, zbup);
    return zbqc1;
  }
  
  private void Zz(Zb_j paramZb_j, Zbup paramZbup) {
    int i = 35;
    try {
      Zmse.Zf(this, 120, 40);
      Zmse.Zf(paramZbup, 100, 20);
      i = Integer.parseInt(paramZb_j.Zn(b(15267, 31610)));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    this.ZL.Za(Math.max(i, 8));
  }
  
  private void ZR() {
    Objects.requireNonNull(this.Zo);
    Zllm zllm = new Zllm(this::Zc, this.Zo::ZE);
    this.Zv.Zc(zllm);
    Zku4 zku4 = new Zku4(this);
    this.Zv.Zk(zku4);
  }
  
  private void Zr(Zg7v paramZg7v) {
    Zm_r zm_r = paramZg7v.Zl(null, this::ZQ);
    this.Zv.ZP(zm_r);
    Zkl6 zkl6 = this.ZO.Ze();
    Zgso zgso = new Zgso(zkl6.ZB(), zkl6, this.Zq, Zeew.INTRUDER, new Zsai(), this.ZK);
    Objects.requireNonNull(zgso);
    this.Z_ = new Zef1(this.ZC.get(), this.Zq, zm_r, this::Zk, zgso::ZU);
  }
  
  private List<Zgxp> ZQ() {
    return Zk((Point)null);
  }
  
  private List<Zgxp> Zk(Point paramPoint) {
    return ZF(this.Zv.ZS(paramPoint));
  }
  
  private List<Zgxp> ZF(int[] paramArrayOfint) {
    return (List<Zgxp>)Arrays.stream(paramArrayOfint).mapToObj(this::Zc).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zgxp Zc(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zx.getRowCount()) {
            int i = this.Zv.convertRowIndexToModel(paramInt);
            return this.Zx.ZW(i);
          } 
          return null;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return null;
  }
  
  public void ZI() {
    try {
      super.ZI();
      if (this.Zt != null)
        this.Zt.setText(b(15270, 8361)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void ZD() {
    try {
      super.ZD();
      if (this.Zt != null)
        this.Zt.setText(b(15265, 4395)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void Ze() {
    try {
      super.Ze();
      if (this.Zt != null)
        this.Zt.setEnabled(false); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void Zu(Zlj9 paramZlj9) {
    Objects.requireNonNull(this.ZU);
    paramZlj9.Zu().ifPresent(this.ZU::setText);
    this.ZM.ZV();
  }
  
  public void ZE(Zlj9 paramZlj9) {
    Objects.requireNonNull(this.ZV);
    paramZlj9.Zk().ifPresent(this.ZV::setValue);
    this.ZV.setIndeterminate(paramZlj9.ZW());
    this.ZM.ZV();
  }
  
  protected List<Zsm8> ZE() {
    ArrayList<Zsm8> arrayList = new ArrayList();
    this.Zt = new Zepe(b(15269, 5724));
    this.Zt.addActionListener(this::lambda$createTaskMenus$3);
    Zepe zepe1 = new Zepe(b(15273, 24302));
    zepe1.addActionListener(this::lambda$createTaskMenus$4);
    arrayList.add(new Zsm8(b(15268, 2466), new JMenuItem[] { this.Zt, zepe1 }));
    Zepe zepe2 = new Zepe(b(15271, -9599));
    zepe2.addActionListener(this::lambda$createTaskMenus$5);
    zepe2.setEnabled(true);
    Zepe zepe3 = new Zepe(b(15276, -16128));
    zepe3.addActionListener(this::lambda$createTaskMenus$6);
    String str = Zbhr.ZQ();
    zepe3.setEnabled(true);
    Zepe zepe4 = new Zepe(b(15274, -25823));
    try {
      zepe4.addActionListener(this::lambda$createTaskMenus$7);
      zepe4.setEnabled(true);
      this.ZA = new Zepe(b(15277, 28354));
      this.ZA.addActionListener(this::lambda$createTaskMenus$8);
      arrayList.add(new Zsm8(b(15266, -14759), new JMenuItem[] { zepe2, zepe3, zepe4, this.ZA }));
      if (Zbqc.Zwu() == null)
        Zbhr.ZS("MXsHPb"); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  protected boolean Zi() {
    return false;
  }
  
  protected Zk97 Zb() {
    return Zk97.DESKTOP_TOOLS_INTRUDER_ATTACKS_ATTACK_RESULTS;
  }
  
  public void Zr() {
    this.ZH.Zn();
  }
  
  public void Zj() {
    this.ZH.Zu();
  }
  
  public void ZC() {
    this.Zn.ZV(b(15287, 22453), Integer.toString(this.ZL.Ze()));
    this.Zx.ZO(this.Zj);
    this.Zx.ZW();
    Zj();
  }
  
  public void ZK() {
    ZC();
    this.Zk.Zd();
  }
  
  private void ZW() {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_SAVE_RESPONSES);
    this.Zg.ZM(this);
  }
  
  private void ZM() {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_SAVE_RESULTS);
    this.Zg.Zg(this);
  }
  
  private void ZY() {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_REPEAT);
    ((Zlvv)this.ZI.get()).Zv();
  }
  
  private void Zp() {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_SAVE_CONFIGURATION);
    this.Zg.ZY(this);
  }
  
  private void Z_() {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_PAUSE);
    Zlvv zlvv = this.ZI.get();
    String str = Zbhr.ZQ();
    try {
      if (this.Zy.Zyq() == Zev0.PAUSED) {
        try {
          zlvv.Zj();
          if (str != null) {
            zlvv.Zo();
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    zlvv.Zo();
  }
  
  private void ZO() {
    Zm2.ZC(Zrrh.INTRUDER_ATTACK_SAVE_TO_PROJECT_FILE);
    this.Zi.ZM(Zeg4.Zp, Zssw.CLOSE_AND_REOPEN);
  }
  
  protected Border ZB() {
    return null;
  }
  
  private void lambda$createTaskMenus$8(ActionEvent paramActionEvent) {
    ZO();
  }
  
  private void lambda$createTaskMenus$7(ActionEvent paramActionEvent) {
    Zp();
  }
  
  private void lambda$createTaskMenus$6(ActionEvent paramActionEvent) {
    ZW();
  }
  
  private void lambda$createTaskMenus$5(ActionEvent paramActionEvent) {
    ZM();
  }
  
  private void lambda$createTaskMenus$4(ActionEvent paramActionEvent) {
    ZY();
  }
  
  private void lambda$createTaskMenus$3(ActionEvent paramActionEvent) {
    Z_();
  }
  
  private static void lambda$buildResultsPanel$2(Zllv paramZllv) {
    paramZllv.Zc(Zbha::lambda$buildResultsPanel$0, Zbha::lambda$buildResultsPanel$1);
  }
  
  private static void lambda$buildResultsPanel$1() {}
  
  private static boolean lambda$buildResultsPanel$0() {
    return false;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '}\\nü·Ö³j03Ú¢¼oÄRe7Ø¥\\rtpê§0+þ³\\bñìSmºþ5/3Ï¥KéµWÔt¤àp¦û|^eW¤qæù!Ï­ÊW&GáBU~ðh6ïAÈ\\f¦ËÙe!gÚ©÷@VÔmÞÅýEùÌSlBA@³z¡²ÄÎè{Ç\\nÛ%¬¿@NÚìùøS1[\SùùOÜ>?ã·a'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
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
    //   68: ldc '~1½ÞÓpÎ\\tM\qyÑ½XHÔU÷UdÎoÈq2'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #66
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
    //   129: putstatic burp/Zbha.c : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbha.d : [Ljava/lang/String;
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
    //   212: bipush #11
    //   214: goto -> 244
    //   217: bipush #16
    //   219: goto -> 244
    //   222: bipush #92
    //   224: goto -> 244
    //   227: bipush #77
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #35
    //   239: goto -> 244
    //   242: bipush #40
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
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3BA7) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 5;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbha.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */