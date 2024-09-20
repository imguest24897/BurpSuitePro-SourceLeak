package burp;

import java.awt.Container;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.swing.ToolTipManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import net.portswigger.Zdo;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;

class Zoy extends Zot {
  private final DefaultTreeModel ZR = (DefaultTreeModel)getModel();
  
  private final DefaultMutableTreeNode ZJ = (DefaultMutableTreeNode)this.ZR.getRoot();
  
  private final Map<Zecx, Ze9n> Zt;
  
  private final DefaultMutableTreeNode Zb = new DefaultMutableTreeNode(c(32064, 10262));
  
  private final DefaultMutableTreeNode ZL = new DefaultMutableTreeNode(c(32074, 27252));
  
  private final DefaultMutableTreeNode Zy = new DefaultMutableTreeNode(c(32065, -26332));
  
  private String Zo;
  
  private boolean Zs;
  
  private boolean Zi;
  
  private boolean ZI;
  
  private static final String[] e;
  
  private static final String[] f;
  
  Zoy(Container paramContainer) {
    super(new DefaultTreeModel(new DefaultMutableTreeNode(c(32068, 4837))));
    Zb78 zb78 = new Zb78(this, paramContainer);
    setModel(this.ZR);
    Z_(Zlkk.PANEL_BACKGROUND);
    Zh(true);
    ZX(true);
    setToggleClickCount(2);
    setCellRenderer(zb78);
    getSelectionModel().setSelectionMode(1);
    putClientProperty(c(32069, 9042), Boolean.TRUE);
    setName(c(32066, -23009));
    setScrollsOnExpand(false);
    ToolTipManager.sharedInstance().registerComponent(this);
    this.Zt = new HashMap<>();
    Arrays.<Zecx>stream(Zecx.values()).forEach(this::lambda$new$0);
    addTreeExpansionListener(new Zxdm(this));
  }
  
  protected void Zr() {
    setRowHeight((int)(Zrt.Zx() * 1.7F));
  }
  
  public boolean getScrollableTracksViewportWidth() {
    return true;
  }
  
  public void Zs(byte[] paramArrayOfbyte, List<Zsj0> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic Zv : ([B)Ljava/lang/String;
    //   5: putfield Zo : Ljava/lang/String;
    //   8: aload_0
    //   9: getfield Zb : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   12: invokevirtual removeAllChildren : ()V
    //   15: aload_0
    //   16: getfield ZL : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   19: invokevirtual removeAllChildren : ()V
    //   22: invokestatic ZY : ()[I
    //   25: aload_0
    //   26: getfield Zy : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   29: invokevirtual removeAllChildren : ()V
    //   32: astore_3
    //   33: aload_0
    //   34: getfield ZJ : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   37: invokevirtual removeAllChildren : ()V
    //   40: aload_2
    //   41: ifnull -> 53
    //   44: aload_2
    //   45: invokeinterface isEmpty : ()Z
    //   50: ifeq -> 70
    //   53: aload_0
    //   54: getfield ZR : Ljavax/swing/tree/DefaultTreeModel;
    //   57: aload_0
    //   58: getfield ZJ : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   61: invokevirtual nodeStructureChanged : (Ljavax/swing/tree/TreeNode;)V
    //   64: aload_0
    //   65: iconst_1
    //   66: invokevirtual setRootVisible : (Z)V
    //   69: return
    //   70: aload_0
    //   71: iconst_0
    //   72: invokevirtual setRootVisible : (Z)V
    //   75: aload_0
    //   76: getfield ZJ : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   79: aload_0
    //   80: getfield Zb : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   83: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   86: new java/util/HashMap
    //   89: dup
    //   90: invokespecial <init> : ()V
    //   93: astore #4
    //   95: new java/util/HashMap
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: astore #5
    //   104: aload_2
    //   105: invokeinterface iterator : ()Ljava/util/Iterator;
    //   110: astore #6
    //   112: aload #6
    //   114: invokeinterface hasNext : ()Z
    //   119: ifeq -> 406
    //   122: aload #6
    //   124: invokeinterface next : ()Ljava/lang/Object;
    //   129: checkcast burp/Zsj0
    //   132: astore #7
    //   134: aload #7
    //   136: invokevirtual ZhH : ()Lburp/Zgh_;
    //   139: astore #8
    //   141: aload #8
    //   143: instanceof burp/Zt4_
    //   146: ifeq -> 215
    //   149: aload #8
    //   151: checkcast burp/Zt4_
    //   154: astore #9
    //   156: new javax/swing/tree/DefaultMutableTreeNode
    //   159: dup
    //   160: aload #7
    //   162: invokespecial <init> : (Ljava/lang/Object;)V
    //   165: astore #10
    //   167: aload #4
    //   169: aload #9
    //   171: invokevirtual ZM : ()Lburp/Zro0;
    //   174: aload #10
    //   176: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   181: pop
    //   182: aload #9
    //   184: invokevirtual Zq : ()Lburp/Zgh_;
    //   187: astore #11
    //   189: aload #4
    //   191: aload #11
    //   193: invokeinterface ZM : ()Lburp/Zro0;
    //   198: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   203: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   206: aload #10
    //   208: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   211: aload_3
    //   212: ifnull -> 402
    //   215: aload #8
    //   217: invokeinterface ZG : ()Lburp/Zs66;
    //   222: aload #8
    //   224: invokeinterface ZX : ()Lburp/Zs66;
    //   229: if_acmpeq -> 302
    //   232: aload #5
    //   234: aload #7
    //   236: invokevirtual Zh4 : ()Lburp/Zro0;
    //   239: invokeinterface ZEp : ()I
    //   244: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   247: aload_0
    //   248: aload #8
    //   250: <illegal opcode> apply : (Lburp/Zoy;Lburp/Zgh_;)Ljava/util/function/Function;
    //   255: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   260: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   263: astore #10
    //   265: new javax/swing/tree/DefaultMutableTreeNode
    //   268: dup
    //   269: aload #7
    //   271: invokespecial <init> : (Ljava/lang/Object;)V
    //   274: astore #11
    //   276: aload #10
    //   278: aload #11
    //   280: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   283: aload #4
    //   285: aload #7
    //   287: invokevirtual Zh4 : ()Lburp/Zro0;
    //   290: aload #11
    //   292: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   297: pop
    //   298: aload_3
    //   299: ifnull -> 402
    //   302: getstatic burp/Zs66.SYNTHETIC_TYPES : Ljava/util/List;
    //   305: aload #8
    //   307: invokeinterface ZG : ()Lburp/Zs66;
    //   312: invokeinterface contains : (Ljava/lang/Object;)Z
    //   317: ifeq -> 359
    //   320: new javax/swing/tree/DefaultMutableTreeNode
    //   323: dup
    //   324: aload #7
    //   326: invokespecial <init> : (Ljava/lang/Object;)V
    //   329: astore #10
    //   331: aload #4
    //   333: aload #7
    //   335: invokevirtual Zh4 : ()Lburp/Zro0;
    //   338: aload #10
    //   340: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   345: pop
    //   346: aload_0
    //   347: getfield Zy : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   350: aload #10
    //   352: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   355: aload_3
    //   356: ifnull -> 402
    //   359: aload #8
    //   361: instanceof burp/Zshh
    //   364: ifeq -> 402
    //   367: new javax/swing/tree/DefaultMutableTreeNode
    //   370: dup
    //   371: aload #7
    //   373: invokespecial <init> : (Ljava/lang/Object;)V
    //   376: astore #10
    //   378: aload #4
    //   380: aload #7
    //   382: invokevirtual Zh4 : ()Lburp/Zro0;
    //   385: aload #10
    //   387: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   392: pop
    //   393: aload_0
    //   394: getfield Zb : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   397: aload #10
    //   399: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   402: aload_3
    //   403: ifnull -> 112
    //   406: aload #5
    //   408: invokeinterface values : ()Ljava/util/Collection;
    //   413: invokeinterface isEmpty : ()Z
    //   418: ifne -> 432
    //   421: aload_0
    //   422: getfield ZJ : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   425: aload_0
    //   426: getfield ZL : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   429: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   432: aload_0
    //   433: getfield Zy : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   436: invokevirtual getChildCount : ()I
    //   439: ifle -> 453
    //   442: aload_0
    //   443: getfield ZJ : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   446: aload_0
    //   447: getfield Zy : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   450: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   453: aload_0
    //   454: getfield ZR : Ljavax/swing/tree/DefaultTreeModel;
    //   457: aload_0
    //   458: getfield ZJ : Ljavax/swing/tree/DefaultMutableTreeNode;
    //   461: invokevirtual nodeStructureChanged : (Ljavax/swing/tree/TreeNode;)V
    //   464: aload_0
    //   465: invokevirtual ZL : ()V
    //   468: return
  }
  
  private void ZL() {
    setExpandedState(new TreePath((Object[])this.Zb.getPath()), this.Zs);
    setExpandedState(new TreePath((Object[])this.ZL.getPath()), this.Zi);
    setExpandedState(new TreePath((Object[])this.Zy.getPath()), this.ZI);
  }
  
  public void Zt(Zro0 paramZro0) {
    TreeNode treeNode = Zs(this.ZJ, paramZro0);
    this.ZR.nodeChanged(treeNode);
  }
  
  private TreeNode Zs(TreeNode paramTreeNode, Zro0 paramZro0) {
    int[] arrayOfInt = Zbht.ZY();
    if (paramTreeNode instanceof DefaultMutableTreeNode) {
      DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)paramTreeNode;
      Object object = defaultMutableTreeNode.getUserObject();
      if (object instanceof Zsj0) {
        Zsj0 zsj0 = (Zsj0)object;
        if (paramZro0.equals(zsj0.Zh4()))
          return paramTreeNode; 
      } 
    } 
    Iterator<? extends TreeNode> iterator = paramTreeNode.children().asIterator();
    while (iterator.hasNext()) {
      TreeNode treeNode1 = iterator.next();
      TreeNode treeNode2 = Zs(treeNode1, paramZro0);
      if (treeNode2 != null)
        return treeNode2; 
      if (arrayOfInt != null)
        break; 
    } 
    return null;
  }
  
  private static String Zd(Zgh_ paramZgh_, String paramString) {
    if (paramZgh_.ZG() != paramZgh_.ZX()) {
      String str = Zv(paramZgh_.ZK());
      if (!Objects.equals(str, paramString))
        return c(32067, -281).formatted(new Object[] { (paramZgh_.ZG()).description, paramZgh_.Z_(), paramString, str }); 
    } 
    return Zs66.SYNTHETIC_TYPES.contains(paramZgh_.ZG()) ? (paramZgh_.ZG()).description : ((paramZgh_.ZG()).description + (paramZgh_.ZG()).description + c(32071, -22133) + paramZgh_.Z_());
  }
  
  private static String Zv(byte[] paramArrayOfbyte) {
    String str = null;
    int i = Zli.ZR(paramArrayOfbyte, Zdo.Zn);
    if (i >= 0) {
      Zm0u zm0u = Ztr9.ZG(Zkb.ZG(Zmw.Zz(paramArrayOfbyte, 0, i)));
      str = zm0u.Zt;
    } 
    return str;
  }
  
  private DefaultMutableTreeNode lambda$setInsertionPoints$1(Zgh_ paramZgh_, Integer paramInteger) {
    DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode((paramZgh_.ZX()).description + (paramZgh_.ZX()).description + c(32070, 4848));
    this.ZL.add(defaultMutableTreeNode);
    return defaultMutableTreeNode;
  }
  
  private void lambda$new$0(Zecx paramZecx) {
    Ze9n ze9n = Ze3m.ZC(paramZecx.icon, Zlkk.ACTION_NORMAL).Zc(Zlkk.INFO_LABEL_SELECTED_FOREGROUND).Z_();
    this.Zt.put(paramZecx, ze9n);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ý mPY÷ÎñH#ÖB¹~Î u\\tK×9²rÛ´!Jøv?æ1N1¦á,õn¸Po5®yåîO↫uk­Ì³Ú8ª,mâÜ&36N>H\\rL¸gc'^,üsðaÿÎr\\fFbòd÷ó¹­¿Ï!6qºÄr69Ð­\\rgJä^ù!ù¼* '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #34
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #64
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
    //   68: ldc 'xz# 9.Î²lzÍ£5ä¤.~97Ëãnêì'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #120
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
    //   129: putstatic burp/Zoy.e : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zoy.f : [Ljava/lang/String;
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
    //   212: bipush #95
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #88
    //   224: goto -> 244
    //   227: bipush #77
    //   229: goto -> 244
    //   232: bipush #43
    //   234: goto -> 244
    //   237: bipush #119
    //   239: goto -> 244
    //   242: bipush #127
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
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7D42) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      char c = 'í';
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zoy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */