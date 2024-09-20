package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.util.List;
import java.util.Objects;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public abstract class Zbgl extends Zbqc implements TableCellRenderer {
  private static final Ze9n Z_;
  
  private Zkax ZH;
  
  private final Zm99 Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbgl() {
    setLayout(new BoxLayout(this, 0));
    add(Box.createHorizontalStrut(3));
    this.Zd = new Zm99();
    this.Zd.setHorizontalAlignment(2);
    this.Zd.setName(a(6231, 22752));
    add(this.Zd);
    setPreferredSize(new Dimension((getPreferredSize()).width, 25));
  }
  
  abstract int Zm();
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    JComponent jComponent = (JComponent)paramJTable.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    setBackground(jComponent.getBackground());
    setBorder(jComponent.getBorder());
    Objects.requireNonNull(paramJTable.getTableHeader());
    ZY(paramJTable.getTableHeader()::repaint, paramJTable.getRowSorter(), paramJTable.convertColumnIndexToModel(paramInt2));
    return this;
  }
  
  private void ZY(Runnable paramRunnable, RowSorter<? extends TableModel> paramRowSorter, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof burp/Zm48
    //   4: ifeq -> 25
    //   7: aload_2
    //   8: checkcast burp/Zm48
    //   11: astore #5
    //   13: aload #5
    //   15: invokevirtual ZT : ()Z
    //   18: ifeq -> 25
    //   21: iconst_1
    //   22: goto -> 26
    //   25: iconst_0
    //   26: istore #4
    //   28: iload #4
    //   30: ifeq -> 90
    //   33: aload_2
    //   34: invokevirtual getSortKeys : ()Ljava/util/List;
    //   37: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   42: iload_3
    //   43: <illegal opcode> test : (I)Ljava/util/function/Predicate;
    //   48: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   53: ifeq -> 90
    //   56: aload_0
    //   57: getfield ZH : Lburp/Zkax;
    //   60: ifnonnull -> 78
    //   63: aload_0
    //   64: new burp/Zkax
    //   67: dup
    //   68: getstatic burp/Zbgl.Z_ : Lburp/Ze9n;
    //   71: aload_1
    //   72: invokespecial <init> : (Ljavax/swing/Icon;Ljava/lang/Runnable;)V
    //   75: putfield ZH : Lburp/Zkax;
    //   78: aload_0
    //   79: getfield Zd : Lburp/Zm99;
    //   82: aload_0
    //   83: getfield ZH : Lburp/Zkax;
    //   86: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   89: return
    //   90: aload_0
    //   91: aload_2
    //   92: iload_3
    //   93: invokevirtual Zc : (Ljavax/swing/RowSorter;I)Ljavax/swing/SortOrder;
    //   96: astore #5
    //   98: getstatic burp/Zbv.Zk : [I
    //   101: aload #5
    //   103: invokevirtual ordinal : ()I
    //   106: iaload
    //   107: lookupswitch default -> 162, 1 -> 132, 2 -> 147
    //   132: sipush #6230
    //   135: sipush #29163
    //   138: invokestatic a : (II)Ljava/lang/String;
    //   141: invokestatic getIcon : (Ljava/lang/Object;)Ljavax/swing/Icon;
    //   144: goto -> 163
    //   147: sipush #6228
    //   150: sipush #-8852
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokestatic getIcon : (Ljava/lang/Object;)Ljavax/swing/Icon;
    //   159: goto -> 163
    //   162: aconst_null
    //   163: astore #6
    //   165: aload_0
    //   166: getfield ZH : Lburp/Zkax;
    //   169: ifnull -> 184
    //   172: aload_0
    //   173: getfield ZH : Lburp/Zkax;
    //   176: invokevirtual Zd : ()V
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield ZH : Lburp/Zkax;
    //   184: aload_0
    //   185: getfield Zd : Lburp/Zm99;
    //   188: aload #6
    //   190: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   193: return
  }
  
  private SortOrder Zc(RowSorter<? extends TableModel> paramRowSorter, int paramInt) {
    if (paramRowSorter != null) {
      List<? extends RowSorter.SortKey> list = paramRowSorter.getSortKeys();
      if (!list.isEmpty()) {
        RowSorter.SortKey sortKey = list.getFirst();
        if (sortKey.getColumn() == paramInt)
          return sortKey.getSortOrder(); 
      } 
    } 
    return SortOrder.UNSORTED;
  }
  
  protected int Zz(int paramInt) {
    int i = 0;
    Icon icon = this.Zd.getIcon();
    if (icon != null)
      i = icon.getIconWidth(); 
    return paramInt - this.Zd.getWidth() - i - 3 - Zm();
  }
  
  protected static String Zj(int paramInt, FontMetrics paramFontMetrics, String paramString) {
    int i = paramFontMetrics.stringWidth(paramString);
    String str = paramString;
    int[] arrayOfInt = Zgnm.Zz();
    if (i > paramInt) {
      int j = paramString.length() - 1;
      while (j >= 0) {
        str = paramString.substring(0, j) + paramString.substring(0, j);
        i = paramFontMetrics.stringWidth(str);
        if (i > paramInt || arrayOfInt != null) {
          j--;
          if (arrayOfInt != null)
            break; 
        } 
      } 
    } 
    return str;
  }
  
  private static boolean lambda$setIconForSort$0(int paramInt, RowSorter.SortKey paramSortKey) {
    return (paramSortKey.getColumn() == paramInt);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'm½\\bSÐ(oÙMÃ@åaøÔýF'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #24
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #35
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'Ö×÷7@XýjÊ³æ7÷¡ÆCWAP bÍ¡;a§zk\\r\\t¼¢/I}lÂ 4ÚPî\\fì×'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #35
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zbgl.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbgl.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #41
    //   214: goto -> 244
    //   217: bipush #91
    //   219: goto -> 244
    //   222: bipush #123
    //   224: goto -> 244
    //   227: bipush #56
    //   229: goto -> 244
    //   232: bipush #123
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #62
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: getstatic burp/Zeuf.SPINNER : Lburp/Zeuf;
    //   303: getstatic burp/Zlkk.TABLE_SORT_ICON_COLOR : Lburp/Zlkk;
    //   306: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   309: getstatic burp/Zmcx.SMALL_LINE_SIZE : Lburp/Zmcx;
    //   312: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   315: invokevirtual Z_ : ()Lburp/Ze9n;
    //   318: putstatic burp/Zbgl.Z_ : Lburp/Ze9n;
    //   321: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1854) & 0xFFFF;
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
      byte b1 = 48;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */