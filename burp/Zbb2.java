package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.swing.ButtonGroup;

public class Zbb2 extends Zbv5 implements Zt3u {
  private final Zgdq Zm;
  
  private final Zrgm ZF;
  
  private final Collection<String> Zg;
  
  private ButtonGroup ZP;
  
  private ButtonGroup ZH;
  
  private Zm99 Zl;
  
  private Zm99 ZD;
  
  private Zmg2 ZW;
  
  private Zmg2 ZQ;
  
  private Zmg2 Zc;
  
  private Zmg2 Zf;
  
  private Zmg2 Zv;
  
  private Zmg2 Zw;
  
  private Zmg2 ZI;
  
  private static String Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbb2(Zkve paramZkve) {
    this.Zm = paramZkve;
    this.ZF = paramZkve;
    String str = Zd();
    this.Zg = Set.of(new String[] { 
          Zjd(), a(21248, -29314), a(21266, 22390), a(21278, -21364), a(21264, -22392), a(21257, 8927), a(21265, 12909), a(21279, 13235), a(21256, -32670), a(21267, 9948), 
          a(21270, -6412), a(21253, 23084) });
    ZE();
    ZT();
    Zt2();
    setName(a(21271, -8452));
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  private void ZT() {
    this.ZI.setName(a(21261, 28660));
    this.Zv.setName(a(21260, 2242));
    this.ZQ.setName(a(21251, 11719));
    this.ZW.setName(a(21269, -28335));
  }
  
  public String Zjd() {
    return a(21252, 4499);
  }
  
  public String ZjS() {
    return a(21268, -6710);
  }
  
  public Component ZjY() {
    Zbkk zbkk = new Zbkk();
    zbkk.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_BEHAVIOUR_WHEN_CLOSING_ATTACKS, this.Zm, Zjd().toLowerCase(Locale.ENGLISH));
    return zbkk;
  }
  
  public Collection<String> ZjD() {
    return this.Zg;
  }
  
  public void Zt2() {
    ZR();
    Zn();
  }
  
  private void ZR() {
    // Byte code:
    //   0: invokestatic Zd : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zrgm;
    //   8: invokeinterface ZS : ()Lburp/Zgui;
    //   13: astore_2
    //   14: getstatic burp/Zl5w.ZE : [I
    //   17: aload_2
    //   18: invokevirtual ordinal : ()I
    //   21: iaload
    //   22: tableswitch default -> 96, 1 -> 52, 2 -> 64, 3 -> 76, 4 -> 88
    //   52: aload_0
    //   53: getfield Zf : Lburp/Zmg2;
    //   56: iconst_1
    //   57: invokevirtual setSelected : (Z)V
    //   60: aload_1
    //   61: ifnonnull -> 96
    //   64: aload_0
    //   65: getfield Zc : Lburp/Zmg2;
    //   68: iconst_1
    //   69: invokevirtual setSelected : (Z)V
    //   72: aload_1
    //   73: ifnonnull -> 96
    //   76: aload_0
    //   77: getfield ZQ : Lburp/Zmg2;
    //   80: iconst_1
    //   81: invokevirtual setSelected : (Z)V
    //   84: aload_1
    //   85: ifnonnull -> 96
    //   88: aload_0
    //   89: getfield ZW : Lburp/Zmg2;
    //   92: iconst_1
    //   93: invokevirtual setSelected : (Z)V
    //   96: return
  }
  
  private void Zn() {
    // Byte code:
    //   0: invokestatic Zd : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zrgm;
    //   8: invokeinterface ZH : ()Lburp/Zmc;
    //   13: astore_2
    //   14: getstatic burp/Zl5w.Zm : [I
    //   17: aload_2
    //   18: invokevirtual ordinal : ()I
    //   21: iaload
    //   22: tableswitch default -> 80, 1 -> 48, 2 -> 60, 3 -> 72
    //   48: aload_0
    //   49: getfield Zw : Lburp/Zmg2;
    //   52: iconst_1
    //   53: invokevirtual setSelected : (Z)V
    //   56: aload_1
    //   57: ifnonnull -> 80
    //   60: aload_0
    //   61: getfield ZI : Lburp/Zmg2;
    //   64: iconst_1
    //   65: invokevirtual setSelected : (Z)V
    //   68: aload_1
    //   69: ifnonnull -> 80
    //   72: aload_0
    //   73: getfield Zv : Lburp/Zmg2;
    //   76: iconst_1
    //   77: invokevirtual setSelected : (Z)V
    //   80: return
  }
  
  private void ZE() {
    this.ZH = new ButtonGroup();
    this.ZP = new ButtonGroup();
    this.ZD = new Zm99();
    this.Zw = new Zmg2();
    this.ZI = new Zmg2();
    this.Zv = new Zmg2();
    this.Zl = new Zm99();
    this.Zf = new Zmg2();
    this.Zc = new Zmg2();
    this.ZQ = new Zmg2();
    this.ZW = new Zmg2();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZD.setText(a(21254, 654));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 10, 0);
    add(this.ZD, gridBagConstraints);
    this.ZH.add(this.Zw);
    this.Zw.setText(a(21255, 26937));
    this.Zw.setIconTextGap(10);
    this.Zw.addActionListener(new Zt8w(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.Zw, gridBagConstraints);
    this.ZH.add(this.ZI);
    this.ZI.setText(a(21258, -16753));
    this.ZI.setIconTextGap(10);
    this.ZI.addActionListener(new Zkad(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.ZI, gridBagConstraints);
    this.ZH.add(this.Zv);
    this.Zv.setText(a(21259, -30033));
    this.Zv.setIconTextGap(10);
    this.Zv.addActionListener(new Zmxy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.Zv, gridBagConstraints);
    this.Zl.setText(a(21249, -13424));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(20, 0, 10, 0);
    add(this.Zl, gridBagConstraints);
    this.ZP.add(this.Zf);
    this.Zf.setText(a(21263, -21676));
    this.Zf.setIconTextGap(10);
    this.Zf.addActionListener(new Zrqr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.Zf, gridBagConstraints);
    this.ZP.add(this.Zc);
    this.Zc.setText(a(21250, 5236));
    this.Zc.setIconTextGap(10);
    this.Zc.addActionListener(new Zlu9(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.Zc, gridBagConstraints);
    this.ZP.add(this.ZQ);
    this.ZQ.setText(a(21262, 1799));
    this.ZQ.setIconTextGap(10);
    this.ZQ.addActionListener(new Zl__(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.ZQ, gridBagConstraints);
    this.ZP.add(this.ZW);
    this.ZW.setText(a(21277, -26124));
    this.ZW.setIconTextGap(10);
    this.ZW.addActionListener(new Zgvy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    add(this.ZW, gridBagConstraints);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    this.ZF.Zo(Zgui.SAVE_ATTACK_PROJECT_FILE);
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    this.ZF.ZY(Zmc.CONTINUE_ATTACK_IN_BACKGROUND);
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    this.ZF.ZY(Zmc.DELETE_ATTACK);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    this.ZF.ZY(Zmc.ASK);
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.ZF.Zo(Zgui.KEEP_IN_MEMORY);
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    this.ZF.Zo(Zgui.DELETE_ATTACK);
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    this.ZF.Zo(Zgui.ASK);
  }
  
  public static void Zc(String paramString) {
    Zt = paramString;
  }
  
  public static String Zd() {
    return Zt;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'Dpxvi'
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic Zc : (Ljava/lang/String;)V
    //   14: ldc 'LYDY0³#îHCò8§Ý\\fªdaÏM&õr¿à²üá`I*.Z@ìéÌ ),ÁÆb\\nqZ¡Á+±ÊÌz0¶ù$üÍËd÷F3#ó1ùöc6>$29-/æ\\t²âÙ»W7ÉÍÑèÊ\\tÓAàáu¢@<\\t,>jÕÙ,ÉiäªvÐUxªPSöZc¦Ñ¬égM.L\\fç<)Õç4 !õ§OYÊÏWOÞms§,j³/éº\\t[&¥¯¼¶é®"HÎhZÎ¿Ú£ð/)#æ}16ØÉN¹$iÈ9ú´¶þ¼Q\YÌñVuèÖûpÇl¼î°å*î·Î{Ì$á~G*/@Ç"êVÉõ.Ç&"7´#éwD©¨Ê»ÔÿüèãÒZM²{ æéYþ #&g Ù·p\\t&NJ:yÛZ%yÞjR¾%YoXª5=Rì¯ø°"ipÆE`üÔeRÌ\\b*Çã"¢RÎ<Á.\\f+hBÜâ&U\\n~Ú'æÖ0\\n{ÀèñÖ¥=xñVQýzwÞF6¹NÌ)`½¸ÏíW\\f9j]¿Ó 9ÂPqx²×B!Ü}å&9_Eë÷{_ÆMN²ðÈ(ìÊ( _\\nÿ1\\bLÂ°ÚÕùWÖpêëÆÊ\\rUw\\bË!©üñ·úÉO·]±J^\\rá»°¼|_çÒÏ¹.Ï­Oê\\n¶Â¡ùÌ.|ñÜjom_wi6eóÛé>Y/z\\rà#ªâorµÌ÷!­\$ZwÓËâYÏ\\tenKD8'{ÂLÞß:ÄÀY7£8Úù+,~ª¿Òßðì<A±}ºé'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: bipush #36
    //   25: istore_1
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #33
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'ìô±^f£\\tã(V\\r+´¡n'º c¸Â+D;=wàáÂôN¨³öµg3ãDúMûÜL`ÞCíÔÔäæ*'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #36
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #23
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zbb2.a : [Ljava/lang/String;
    //   137: bipush #27
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zbb2.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #38
    //   218: goto -> 248
    //   221: bipush #47
    //   223: goto -> 248
    //   226: bipush #73
    //   228: goto -> 248
    //   231: bipush #35
    //   233: goto -> 248
    //   236: bipush #55
    //   238: goto -> 248
    //   241: bipush #6
    //   243: goto -> 248
    //   246: bipush #74
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5307) & 0xFFFF;
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
      char c = 'Ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbb2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */