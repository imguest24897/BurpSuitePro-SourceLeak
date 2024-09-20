package burp;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import net.portswigger.Zm2;

public class Zt0c implements Zx8i {
  private static final String[] a;
  
  private static final String[] b;
  
  public List<JMenuItem> ZI(Zbws paramZbws, int paramInt) {
    ArrayList<Zepe> arrayList = new ArrayList();
    TableModel tableModel = paramZbws.getModel();
    String str = Zg2b.ZC();
    if (tableModel instanceof Zmub) {
      Zmub zmub = (Zmub)tableModel;
      if (zmub.ZU(paramInt)) {
        int i = paramZbws.convertColumnIndexToView(paramInt);
        if (i != -1) {
          Zepe zepe = ZI(i, paramZbws);
          arrayList.add(zepe);
        } 
      } 
      if (zmub.Zr(paramInt) && paramZbws.getRowSorter() != null) {
        Zztv zztv = Zh(paramInt, paramZbws);
        arrayList.add(zztv);
      } 
    } 
    if (Zbqc.Zwu() == null)
      Zg2b.ZG("TNnkLc"); 
    return (List)arrayList;
  }
  
  private static Zepe ZI(int paramInt, Zbws paramZbws) {
    // Byte code:
    //   0: new burp/Zepe
    //   3: dup
    //   4: sipush #22019
    //   7: sipush #-25674
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: sipush #22023
    //   21: sipush #-27860
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: invokevirtual setName : (Ljava/lang/String;)V
    //   30: aload_2
    //   31: aload_1
    //   32: iload_0
    //   33: <illegal opcode> actionPerformed : (Lburp/Zbws;I)Ljava/awt/event/ActionListener;
    //   38: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   41: aload_2
    //   42: areturn
  }
  
  private static Zztv Zh(int paramInt, Zbws paramZbws) {
    // Byte code:
    //   0: new burp/Zztv
    //   3: dup
    //   4: sipush #22016
    //   7: sipush #-28528
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: sipush #22027
    //   21: sipush #10908
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: invokevirtual setName : (Ljava/lang/String;)V
    //   30: new burp/Zepe
    //   33: dup
    //   34: sipush #22022
    //   37: sipush #18635
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: invokespecial <init> : (Ljava/lang/String;)V
    //   46: astore_3
    //   47: aload_3
    //   48: sipush #22017
    //   51: sipush #24805
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: invokevirtual setName : (Ljava/lang/String;)V
    //   60: aload_3
    //   61: iload_0
    //   62: aload_1
    //   63: <illegal opcode> actionPerformed : (ILburp/Zbws;)Ljava/awt/event/ActionListener;
    //   68: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   71: aload_2
    //   72: aload_3
    //   73: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   76: pop
    //   77: new burp/Zepe
    //   80: dup
    //   81: sipush #22018
    //   84: sipush #-16081
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: astore #4
    //   95: aload #4
    //   97: sipush #22026
    //   100: sipush #-11486
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual setName : (Ljava/lang/String;)V
    //   109: aload #4
    //   111: iload_0
    //   112: aload_1
    //   113: <illegal opcode> actionPerformed : (ILburp/Zbws;)Ljava/awt/event/ActionListener;
    //   118: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   121: aload_2
    //   122: aload #4
    //   124: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   127: pop
    //   128: aload_1
    //   129: invokevirtual getRowSorter : ()Ljavax/swing/RowSorter;
    //   132: invokevirtual getSortKeys : ()Ljava/util/List;
    //   135: iload_0
    //   136: invokestatic Zi : (Ljava/util/List;I)Z
    //   139: ifeq -> 193
    //   142: new burp/Zepe
    //   145: dup
    //   146: sipush #22021
    //   149: sipush #-21690
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: astore #5
    //   160: aload #5
    //   162: sipush #22020
    //   165: sipush #5862
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: invokevirtual setName : (Ljava/lang/String;)V
    //   174: aload #5
    //   176: iload_0
    //   177: aload_1
    //   178: <illegal opcode> actionPerformed : (ILburp/Zbws;)Ljava/awt/event/ActionListener;
    //   183: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   186: aload_2
    //   187: aload #5
    //   189: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   192: pop
    //   193: aload_2
    //   194: areturn
  }
  
  private static boolean Zi(List<? extends RowSorter.SortKey> paramList, int paramInt) {
    return paramList.isEmpty() ? false : paramList.stream().map(RowSorter.SortKey::getColumn).anyMatch(paramInt::lambda$isSortedByColumn$4);
  }
  
  private static void Zp(int paramInt, Zbws paramZbws, SortOrder paramSortOrder) {
    Zr(paramInt, paramZbws, paramSortOrder);
    Zm48.ZY(paramZbws.getRowSorter(), paramInt, paramSortOrder);
  }
  
  private static void Zr(int paramInt, Zbws paramZbws, SortOrder paramSortOrder) {
    String str = paramZbws.getName();
    if (str != null) {
      TableColumn tableColumn = paramZbws.getColumnModel().getColumn(paramZbws.convertColumnIndexToView(paramInt));
      String str1 = tableColumn.getHeaderValue().toString();
      long l = System.currentTimeMillis();
      paramZbws.getRowSorter().addRowSorterListener(new Zxwp(paramZbws, str, str1, paramSortOrder, l));
    } 
  }
  
  private static boolean lambda$isSortedByColumn$4(int paramInt, Integer paramInteger) {
    return (paramInteger.intValue() == paramInt);
  }
  
  private static void lambda$createSortMenu$3(int paramInt, Zbws paramZbws, ActionEvent paramActionEvent) {
    Zp(paramInt, paramZbws, SortOrder.UNSORTED);
  }
  
  private static void lambda$createSortMenu$2(int paramInt, Zbws paramZbws, ActionEvent paramActionEvent) {
    Zp(paramInt, paramZbws, SortOrder.DESCENDING);
  }
  
  private static void lambda$createSortMenu$1(int paramInt, Zbws paramZbws, ActionEvent paramActionEvent) {
    Zp(paramInt, paramZbws, SortOrder.ASCENDING);
  }
  
  private static void lambda$createHideColumnMenuItem$0(Zbws paramZbws, int paramInt, ActionEvent paramActionEvent) {
    Zm2.ZB(Zee4.TABLE_COLUMN_HIDDEN_HEADER_CONTEXT_MENU, paramZbws.getName() + "." + paramZbws.getName());
    paramZbws.Zv(paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¸8;¥½gõ\%VÜ0¾Ä®ÊCent\\f#|Ûma\\tKíÒjÞ7÷x~ÌEp¿\\tÍ1 ÔêØ÷\\t/¥|ûT]É7{xÃnqëG­SZßWó`þÜ%0>\\bç>¼ i;&q5\\b;¼Ü:«¹âÜÆä!±!{:ÅùékA'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #27
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
    //   68: ldc 'âàZáÙ±@:À)c~|i²ñ÷/ÂnÝWqÓR&«d4~ÍBÿÙm¶ÖÚÀÜsà5\\f ¼70RviK·ËgÌ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #36
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #14
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
    //   129: putstatic burp/Zt0c.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt0c.b : [Ljava/lang/String;
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
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #110
    //   224: goto -> 244
    //   227: bipush #44
    //   229: goto -> 244
    //   232: bipush #15
    //   234: goto -> 244
    //   237: bipush #114
    //   239: goto -> 244
    //   242: bipush #16
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
    int i = (paramInt1 ^ 0x5602) & 0xFFFF;
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
      byte b1 = 122;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt0c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */