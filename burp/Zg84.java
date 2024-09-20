package burp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class Zg84 extends Zbqc {
  private final DefaultTreeModel ZO;
  
  private final boolean Zr;
  
  private final Ztwv ZR;
  
  private final Zr8q ZX;
  
  private final Zor Zv;
  
  private final Zkct Zu;
  
  private final Zliv Zn;
  
  private final Zltk Zy;
  
  private Zble Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zg84(Ztdi paramZtdi, DefaultTreeModel paramDefaultTreeModel, Ztzy paramZtzy, boolean paramBoolean, Ztwv paramZtwv, Zr8q paramZr8q, Zs0g paramZs0g) {
    this.ZO = paramDefaultTreeModel;
    this.Zr = paramBoolean;
    this.ZR = paramZtwv;
    this.ZX = paramZr8q;
    this.Zv = Zi();
    this.Zu = new Zkct(paramDefaultTreeModel, paramBoolean, paramZtzy);
    this.Zn = new Zliv(this);
    this.Zy = new Zltk();
    Zbup zbup = new Zbup();
    zbup.setViewportView(this.Zv);
    zbup.setBorder(BorderFactory.createEmptyBorder());
    setLayout(new BorderLayout());
    setBorder(BorderFactory.createEmptyBorder());
    add(ZZ(), a(-31942, 26722));
    add(zbup, a(-31944, -23488));
    this.Zv.setName(a(-31943, 19609));
    this.Zv.addTreeSelectionListener(this::Zk);
    this.Zv.Zu(new Zn1(paramZtdi, paramZs0g, paramZtwv, this.Zv, this.Zy, this::Zw));
    this.Zv.addMouseListener(new Zehd(paramZtdi, paramZs0g, paramZtwv, this.Zv, this.Zy, paramBoolean));
  }
  
  private void Zk(TreeSelectionEvent paramTreeSelectionEvent) {
    TreePath treePath = paramTreeSelectionEvent.getNewLeadSelectionPath();
    this.Zd = (treePath == null) ? null : (Zble)treePath.getLastPathComponent();
    this.Zy.Zk(this.Zd);
  }
  
  private TreePath Zw() {
    return (this.Zd != null) ? new TreePath((Object[])this.Zd.getPath()) : null;
  }
  
  private Zor Zi() {
    Zno zno = new Zno(this, null);
    zno.Zh(true);
    zno.ZX(true);
    zno.setBorder(new EmptyBorder(5, 5, 5, 5));
    zno.Z_(Zlkk.PANEL_BACKGROUND);
    zno.setCellRenderer(new Zetp(this.Zr));
    return zno;
  }
  
  private Zbqc ZZ() {
    Zbqc zbqc1 = new Zbqc(new BorderLayout(20, 0));
    zbqc1.setBorder(new EmptyBorder(10, 10, 10, 10));
    zbqc1.Zl(Zlkk.TABLE_HEADER_BACKGROUND);
    Ze9n ze9n1 = Ze3m.ZC(Zeuf.EXPAND_ALL, Zlkk.ACTION_NORMAL).ZU(Zmcx.LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_();
    Ze9n ze9n2 = Ze3m.ZC(Zeuf.COLLAPSE_ALL, Zlkk.ACTION_NORMAL).ZU(Zmcx.LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_();
    Zm9t zm9t1 = new Zm9t();
    Zm9t zm9t2 = new Zm9t();
    zm9t1.ZO(Zlkk.TABLE_HEADER_BACKGROUND);
    zm9t1.ZD(Zlkk.TABLE_HEADER_BACKGROUND);
    zm9t2.ZO(Zlkk.TABLE_HEADER_BACKGROUND);
    zm9t2.ZD(Zlkk.TABLE_HEADER_BACKGROUND);
    zm9t1.Zv(ze9n1, a(-31938, -25068), this::ZL);
    zm9t2.Zv(ze9n2, a(-31937, 30029), this::ZD);
    Zbqc zbqc2 = new Zbqc(new GridLayout(1, 2, 10, 0));
    zbqc2.Zl(Zlkk.TABLE_HEADER_BACKGROUND);
    zbqc2.add(zm9t1);
    zbqc2.add(zm9t2);
    Zm99 zm99 = new Zm99(a(-31941, 12837));
    Zm2o zm2o = new Zm2o();
    zm2o.Zi(Zk97.DESKTOP_SCANNING_CRAWL_PATHS);
    zm2o.ZO(Zlkk.TABLE_HEADER_BACKGROUND);
    zm2o.ZD(Zlkk.TABLE_HEADER_BACKGROUND);
    zbqc1.add(zbqc2, a(-31939, 2248));
    zbqc1.add(zm99, a(-31946, -2265));
    zbqc1.add(zm2o, a(-31940, -11303));
    return zbqc1;
  }
  
  private void ZL() {
    (new Zta6(this.Zv, this.Zy, this.ZR)).ZG(ZR());
  }
  
  private void ZD() {
    (new Zta6(this.Zv, this.Zy, this.ZR)).Zl(ZR());
  }
  
  private List<Zble> ZR() {
    TreeNode treeNode = (TreeNode)this.ZO.getRoot();
    ArrayList<Zble> arrayList = new ArrayList(treeNode.getChildCount());
    byte b = 0;
    int[] arrayOfInt = Ztpr.ZJx();
    while (b < treeNode.getChildCount()) {
      arrayList.add((Zble)treeNode.getChildAt(b));
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList;
  }
  
  void ZQ(Zzqt paramZzqt) {
    this.Zy.ZO(paramZzqt);
  }
  
  void Zc() {
    this.Zv.setModel(this.ZO);
    this.ZO.addTreeModelListener(this.Zn);
    SwingUtilities.invokeLater(this::lambda$connect$0);
    ToolTipManager.sharedInstance().registerComponent(this.Zv);
  }
  
  void ZH() {
    ToolTipManager.sharedInstance().unregisterComponent(this.Zv);
    this.ZO.removeTreeModelListener(this.Zn);
    this.Zv.setModel((TreeModel)null);
  }
  
  void ZW(Zble paramZble) {
    this.ZO.nodeChanged(paramZble);
    this.Zu.Zk(paramZble);
  }
  
  private void lambda$connect$0() {
    if (this.Zv.getRowCount() != 0) {
      this.Zv.expandRow(0);
      this.Zv.setSelectionRow(0);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'LÇTÏNo+b\\f)"}ìW{µõ®¦uO u´Û#¬ähÿcá%úÉ_TÅÎöCî÷¸À ª§Ëz¿-ò9L'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #102
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
    //   68: ldc '^ô¢³æGËý+12ÚÒa'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic burp/Zg84.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg84.b : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #28
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #8
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #52
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF833E) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg84.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */