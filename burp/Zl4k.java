package burp;

import java.util.Collection;
import java.util.Enumeration;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;

class Zl4k {
  private static final String[] a;
  
  private static final String[] b;
  
  static TreeModel Z_(Collection<Ztro> paramCollection) {
    // Byte code:
    //   0: new javax/swing/tree/DefaultMutableTreeNode
    //   3: dup
    //   4: ldc ''
    //   6: invokespecial <init> : (Ljava/lang/Object;)V
    //   9: astore_2
    //   10: invokestatic Zc : ()I
    //   13: aload_0
    //   14: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   19: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   24: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   29: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   34: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   39: invokeinterface findFirst : ()Ljava/util/Optional;
    //   44: invokevirtual orElseThrow : ()Ljava/lang/Object;
    //   47: checkcast java/lang/String
    //   50: astore_3
    //   51: aload_0
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore #4
    //   59: istore_1
    //   60: aload #4
    //   62: invokeinterface hasNext : ()Z
    //   67: ifeq -> 190
    //   70: aload #4
    //   72: invokeinterface next : ()Ljava/lang/Object;
    //   77: checkcast burp/Ztro
    //   80: astore #5
    //   82: aload #5
    //   84: invokeinterface ZJ : ()Ljava/lang/String;
    //   89: aload_3
    //   90: ldc ''
    //   92: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   95: astore #6
    //   97: aload #6
    //   99: ldc '/'
    //   101: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   104: astore #7
    //   106: aload_2
    //   107: astore #8
    //   109: aload #7
    //   111: astore #9
    //   113: aload #9
    //   115: arraylength
    //   116: istore #10
    //   118: iconst_0
    //   119: istore #11
    //   121: iload #11
    //   123: iload #10
    //   125: if_icmpge -> 186
    //   128: aload #9
    //   130: iload #11
    //   132: aaload
    //   133: astore #12
    //   135: aload #12
    //   137: sipush #-6011
    //   140: sipush #-2266
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   149: ifeq -> 170
    //   152: aload #8
    //   154: new javax/swing/tree/DefaultMutableTreeNode
    //   157: dup
    //   158: aload #5
    //   160: invokespecial <init> : (Ljava/lang/Object;)V
    //   163: invokevirtual add : (Ljavax/swing/tree/MutableTreeNode;)V
    //   166: iload_1
    //   167: ifeq -> 179
    //   170: aload #8
    //   172: aload #12
    //   174: invokestatic Zv : (Ljavax/swing/tree/DefaultMutableTreeNode;Ljava/lang/String;)Ljavax/swing/tree/DefaultMutableTreeNode;
    //   177: astore #8
    //   179: iinc #11, 1
    //   182: iload_1
    //   183: ifeq -> 121
    //   186: iload_1
    //   187: ifeq -> 60
    //   190: new javax/swing/tree/DefaultTreeModel
    //   193: dup
    //   194: aload_2
    //   195: invokespecial <init> : (Ljavax/swing/tree/TreeNode;)V
    //   198: areturn
  }
  
  private static DefaultMutableTreeNode Zv(DefaultMutableTreeNode paramDefaultMutableTreeNode, String paramString) {
    int i = Zbm2.Zc();
    Enumeration<TreeNode> enumeration = paramDefaultMutableTreeNode.children();
    while (enumeration.hasMoreElements()) {
      DefaultMutableTreeNode defaultMutableTreeNode1 = (DefaultMutableTreeNode)enumeration.nextElement();
      Object object = defaultMutableTreeNode1.getUserObject();
      if (object instanceof String) {
        String str = (String)defaultMutableTreeNode1.getUserObject();
        if (paramString.equals(str))
          return defaultMutableTreeNode1; 
      } 
      if (i != 0)
        break; 
    } 
    DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(paramString);
    paramDefaultMutableTreeNode.add(defaultMutableTreeNode);
    return defaultMutableTreeNode;
  }
  
  private static String lambda$from$1(Ztro paramZtro) {
    return paramZtro.ZJ().replace(a(-6009, -15097), "");
  }
  
  private static boolean lambda$from$0(Ztro paramZtro) {
    return paramZtro.ZO().equals(a(-6010, 31217));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'î_õí©BåüûD:Ûµ\\r:¦Å¡¾#(´2ÖR×q<ª÷Ú­'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #17
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zl4k.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zl4k.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 176
    //   152: bipush #29
    //   154: goto -> 183
    //   157: bipush #62
    //   159: goto -> 183
    //   162: bipush #106
    //   164: goto -> 183
    //   167: bipush #42
    //   169: goto -> 183
    //   172: iconst_1
    //   173: goto -> 183
    //   176: bipush #103
    //   178: goto -> 183
    //   181: bipush #117
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE887) & 0xFFFF;
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
      byte b1 = 14;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */