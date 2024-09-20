package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

public class Zbm8 extends Zbv5 implements Zt3u {
  private static final Set<Zmln> ZV;
  
  private final Zl4w Zk;
  
  private final Zb5 Zq;
  
  private final Zz8a ZN;
  
  private final Zg_3 Zr;
  
  private final Ze4k Zv;
  
  private final Zie Zs;
  
  private final Zt3q Zc;
  
  private final Ztns Zn;
  
  private final Zbws Zg;
  
  private Zqt Zb;
  
  private String ZT = "";
  
  private Ze01 Zt;
  
  private Ze01 Zj;
  
  private Ze01 ZO;
  
  private Ze01 Zf;
  
  private Ze01 Za;
  
  private Ze01 ZF;
  
  private Zbkd ZQ;
  
  private Zbqc ZM;
  
  private Zbup Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbm8(Zl4w paramZl4w, Zb5 paramZb5, Zrq8 paramZrq8, Zxts paramZxts, Zl0 paramZl0, Zz8a paramZz8a) {
    this.Zk = paramZl4w;
    this.Zq = paramZb5;
    this.ZN = paramZz8a;
    this.Zr = new Zg_3();
    this.Zv = new Ze4k();
    this.Zs = new Zie(paramZrq8, paramZxts, paramZl0);
    this.Zc = new Zt3q(paramZrq8);
    ZQ();
    int[] arrayOfInt = Zmln.Za();
    setName(a(-20360, -3322));
    this.ZQ.ZX(new Zmhy(this), (Zx08<Zrn3>[])new Zx08[] { Zx08.Zz(new Zqt[] { Zqt.BUILT_IN_ONLY, Zqt.CUSTOM_ONLY }) });
    this.Zn = new Ztns();
    this.Zg = new Zbw1(this, this.Zn);
    this.Zd.setViewportView(this.Zg);
    ZD();
    this.Zg.Zk(new Zecq(this));
    setVisible(true);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  private void ZE() {
    // Byte code:
    //   0: invokestatic Za : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zbws;
    //   8: invokevirtual getSelectedRows : ()[I
    //   11: astore_2
    //   12: aload_2
    //   13: arraylength
    //   14: ifne -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: istore_3
    //   23: aload_2
    //   24: arraylength
    //   25: iconst_1
    //   26: if_icmple -> 33
    //   29: iconst_1
    //   30: goto -> 34
    //   33: iconst_0
    //   34: istore #4
    //   36: iconst_0
    //   37: istore #5
    //   39: aload_2
    //   40: astore #6
    //   42: aload #6
    //   44: arraylength
    //   45: istore #7
    //   47: iconst_0
    //   48: istore #8
    //   50: iload #8
    //   52: iload #7
    //   54: if_icmpge -> 104
    //   57: aload #6
    //   59: iload #8
    //   61: iaload
    //   62: istore #9
    //   64: aload_0
    //   65: getfield Zn : Lburp/Ztns;
    //   68: aload_0
    //   69: getfield Zg : Lburp/Zbws;
    //   72: iload #9
    //   74: invokevirtual convertRowIndexToModel : (I)I
    //   77: iconst_2
    //   78: invokevirtual getValueAt : (II)Ljava/lang/Object;
    //   81: checkcast java/lang/Boolean
    //   84: invokevirtual booleanValue : ()Z
    //   87: ifeq -> 97
    //   90: iconst_1
    //   91: istore #5
    //   93: aload_1
    //   94: ifnull -> 104
    //   97: iinc #8, 1
    //   100: aload_1
    //   101: ifnull -> 50
    //   104: aload_0
    //   105: getfield ZO : Lburp/Ze01;
    //   108: iload_3
    //   109: ifne -> 131
    //   112: iload #4
    //   114: ifne -> 131
    //   117: aload_0
    //   118: aload_2
    //   119: iconst_0
    //   120: iaload
    //   121: invokevirtual Zt : (I)Z
    //   124: ifeq -> 131
    //   127: iconst_1
    //   128: goto -> 132
    //   131: iconst_0
    //   132: invokevirtual setEnabled : (Z)V
    //   135: aload_0
    //   136: getfield Zj : Lburp/Ze01;
    //   139: iload_3
    //   140: ifne -> 152
    //   143: iload #4
    //   145: ifne -> 152
    //   148: iconst_1
    //   149: goto -> 153
    //   152: iconst_0
    //   153: invokevirtual setEnabled : (Z)V
    //   156: aload_0
    //   157: getfield Zt : Lburp/Ze01;
    //   160: iload_3
    //   161: ifne -> 173
    //   164: iload #5
    //   166: ifne -> 173
    //   169: iconst_1
    //   170: goto -> 174
    //   173: iconst_0
    //   174: invokevirtual setEnabled : (Z)V
    //   177: aload_0
    //   178: getfield Zf : Lburp/Ze01;
    //   181: iload_3
    //   182: ifne -> 189
    //   185: iconst_1
    //   186: goto -> 190
    //   189: iconst_0
    //   190: invokevirtual setEnabled : (Z)V
    //   193: return
  }
  
  private boolean Zt(int paramInt) {
    Zrve zrve = this.Zn.ZB(this.Zg.convertRowIndexToModel(paramInt));
    return ZV.containsAll(zrve.Zw());
  }
  
  private void ZD() {
    this.ZN.ZR();
    Zd();
  }
  
  private void Zd() {
    List<Zrve> list1 = ZX();
    Zdb zdb = (new Zls5()).Zq(this.Zb).Zq(this.ZT).Zl();
    int[] arrayOfInt = Zmln.Za();
    List<Zrve> list2 = this.ZN.Zg(zdb);
    this.Zn.ZS(list2);
    if (!list1.isEmpty()) {
      byte b = 0;
      while (b < list2.size()) {
        if (list1.contains(list2.get(b)))
          this.Zg.changeSelection(this.Zg.convertRowIndexToView(b), -1, true, false); 
        b++;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    ZE();
  }
  
  public String Zjd() {
    return a(-20358, -18199);
  }
  
  public String ZjS() {
    return a(-20368, 3805);
  }
  
  public Component ZjY() {
    Zm2o zm2o = new Zm2o();
    zm2o.Zi(Zk97.DESKTOP_GETTING_STARTED_CONFIGURATION);
    return zm2o;
  }
  
  public Collection<String> ZjD() {
    return Collections.emptySet();
  }
  
  public void Zt2() {}
  
  private Zrve ZO() {
    int i = this.Zg.convertRowIndexToModel(this.Zg.getSelectedRow());
    return this.Zn.ZB(i);
  }
  
  private List<Zrve> ZX() {
    ArrayList<Zrve> arrayList = new ArrayList();
    int[] arrayOfInt2 = this.Zg.getSelectedRows();
    int[] arrayOfInt1 = Zmln.Za();
    int i = arrayOfInt2.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt2[b];
      Zrve zrve = this.Zn.ZB(this.Zg.convertRowIndexToModel(j));
      if (zrve != null)
        arrayList.add(zrve); 
      b++;
      if (arrayOfInt1 != null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZV() {
    int[] arrayOfInt = Zmln.Za();
    try {
      Zrve zrve = ZO();
      try {
        if (zrve.ZU()) {
          try {
            this.Zq.ZW(Zt2m.ZF(this), zrve, new Zzjq(this));
            if (arrayOfInt != null)
              this.Zq.Zw(Zt2m.ZF(this), zrve, new Zzjq(this)); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.Zq.Zw(Zt2m.ZF(this), zrve, new Zzjq(this));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZQ() {
    this.ZM = new Zbqc();
    this.ZQ = new Zbkd();
    this.Zd = new Zbup();
    this.ZF = new Ze01();
    this.ZO = new Ze01();
    this.Zj = new Ze01();
    this.Zt = new Ze01();
    this.Za = new Ze01();
    this.Zf = new Ze01();
    setLayout(new BoxLayout(this, 2));
    this.ZM.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    this.ZM.setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 11;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZM.add(this.Zd, gridBagConstraints);
    this.ZF.setText(a(-20356, -19741));
    this.ZF.addActionListener(new Zmxg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.ZF, gridBagConstraints);
    this.ZO.setText(a(-20354, -8638));
    this.ZO.addActionListener(new Zb24(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.ZO, gridBagConstraints);
    this.Zj.setText(a(-20357, -2509));
    this.Zj.addActionListener(new Zgla(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.Zj, gridBagConstraints);
    this.Zt.setText(a(-20355, -24023));
    this.Zt.addActionListener(new Ztu_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.Zt, gridBagConstraints);
    this.Za.setText(a(-20359, -20918));
    this.Za.addActionListener(new Zlqo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.Za, gridBagConstraints);
    this.Zf.setText(a(-20353, 23123));
    this.Zf.addActionListener(new Zm7k(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZM.add(this.Zf, gridBagConstraints);
    add(this.ZM);
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    Zkj2 zkj2 = new Zkj2(Arrays.asList(new Zmln[] { Zmln.CRAWLING, Zmln.AUDITING, Zmln.SCOPE, Zmln.APPLICATION_LOGIN, Zmln.LIVE_PASSIVE_CRAWLING }, ), this::lambda$btnNewActionPerformed$0);
    zkj2.show(this.ZF, this.ZF.getWidth(), 0);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    ZV();
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    if (this.Zr.Zt(ZO(), this.Zk))
      ZD(); 
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    if (this.Zv.Zb(ZX(), this.Zk))
      ZD(); 
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    if (this.Zs.ZO(this.Zk))
      ZD(); 
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.Zc.ZZ(ZX(), this.Zk);
  }
  
  private void lambda$btnNewActionPerformed$0(Zmln paramZmln) {
    this.Zq.ZS(Zt2m.ZF(this), paramZmln, new Zzjq(this));
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Íº%ÒòÈ5»Ñ¢BCrÄÇ¨¨pð9rñeÊå^±ZT¦DD!\\tú¤\\toqÇz6\¸ÜÄÓ\\tyËn¯F(69ä^úOI^Ê6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #31
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #41
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
    //   68: ldc 'þºí_Ė×â÷39%Àfc×BT4­)ë=$±EÎ¶ø7T]Ä7¯p@Cnñ½ò*V]3ÓèfqS1Û¤HJð{ïcrí¼6Z§DBðN<¢§íof^lÙàöiqÕ.Æ:ÐÌ\[Å§w·àkûµØSw5Xî2ÖÍêtú»ì\\f¸ïhúnâ¾V;æô£EÞAº¬(8¯bnÃ] dþP¡ ¿#dÊº½ÑÉSJÓM%QÿÏ9ó]ÿLd­ÇÛ3]ñãjH\\b¡I=ä¸6t_»àT :ð°]|,/¥=©ä©Rî\\f{¹Éqè¦B¯òEÿçí`fV'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #35
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
    //   129: putstatic burp/Zbm8.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbm8.b : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #105
    //   219: goto -> 244
    //   222: bipush #20
    //   224: goto -> 244
    //   227: bipush #64
    //   229: goto -> 244
    //   232: bipush #18
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #49
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
    //   300: getstatic burp/Zmln.CRAWLING : Lburp/Zmln;
    //   303: getstatic burp/Zmln.AUDITING : Lburp/Zmln;
    //   306: getstatic burp/Zmln.SCOPE : Lburp/Zmln;
    //   309: getstatic burp/Zmln.APPLICATION_LOGIN : Lburp/Zmln;
    //   312: getstatic burp/Zmln.LIVE_PASSIVE_CRAWLING : Lburp/Zmln;
    //   315: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   318: putstatic burp/Zbm8.ZV : Ljava/util/Set;
    //   321: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB078) & 0xFFFF;
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
      byte b1 = 66;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */