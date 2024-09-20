package burp;

import net.portswigger.Zl0;

public class Zm8s implements Zkh {
  private final Zxei ZN;
  
  private final Zl0 ZO;
  
  private final boolean ZC;
  
  private final String ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zm8s(Zxei paramZxei, Zkvo paramZkvo, Zl0 paramZl0, boolean paramBoolean) {
    this.ZN = paramZxei;
    this.ZO = paramZl0;
    this.ZC = paramBoolean;
    this.ZY = ZI(paramZkvo);
  }
  
  public boolean ZM() {
    if (Zb12.ZG())
      return true; 
    Zr77 zr77 = new Zr77(this.ZY);
    Zbsv.Zb(zr77::lambda$shouldAdoptCollaboratorInteractions$0);
    return zr77.ZD.isSelected();
  }
  
  public boolean ZN(boolean paramBoolean) {
    if (Zb12.ZG()) {
      System.out.println(Zrgs.NEWER_PROJECT_FILE_HEADLESS_MESSAGE.ZN(new Object[0]));
      return false;
    } 
    Zr7v zr7v = new Zr7v(this.ZY, paramBoolean);
    Zbsv.Zb(zr7v::lambda$shouldUseNewerProjectFile$1);
    return zr7v.ZA;
  }
  
  public boolean ZP() {
    if (Zb12.ZG()) {
      System.out.println(Zrgs.PROJECT_FILE_NOT_TRUSTED.ZN(new Object[0]));
      return true;
    } 
    Zr7m zr7m = new Zr7m(this.ZY);
    Zbsv.Zb(zr7m::lambda$promptUserToEnableSafeMode$2);
    return zr7m.Zk();
  }
  
  public void Zd(Zk8l paramZk8l, Ztg4 paramZtg4, String paramString) {
    System.out.println(a(-10133, 22504));
    this.ZN.Zj(paramZtg4);
  }
  
  public void Zo(Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, String paramString) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #6
    //   5: invokestatic ZG : ()Z
    //   8: ifeq -> 92
    //   11: aload_0
    //   12: getfield ZC : Z
    //   15: ifeq -> 59
    //   18: new burp/Zsng
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: aload_1
    //   26: aload_2
    //   27: aload #4
    //   29: aload_0
    //   30: getfield ZO : Lnet/portswigger/Zl0;
    //   33: aload #5
    //   35: invokevirtual Zp : (Lburp/Zkit;Lburp/Zk8l;Lburp/Ztg4;Lnet/portswigger/Zl0;Ljava/lang/String;)V
    //   38: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   41: getstatic burp/Zrgs.RESTART_AFTER_REPAIR : Lburp/Zrgs;
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   51: invokevirtual println : (Ljava/lang/String;)V
    //   54: iload #6
    //   56: ifeq -> 121
    //   59: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   62: getstatic burp/Zrgs.RESTART_TO_REPAIR : Lburp/Zrgs;
    //   65: iconst_1
    //   66: anewarray java/lang/Object
    //   69: dup
    //   70: iconst_0
    //   71: sipush #-10134
    //   74: sipush #-10661
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: aastore
    //   81: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   84: invokevirtual println : (Ljava/lang/String;)V
    //   87: iload #6
    //   89: ifeq -> 121
    //   92: aload_0
    //   93: getfield ZN : Lburp/Zxei;
    //   96: aload_1
    //   97: aload_2
    //   98: aload_3
    //   99: aload #4
    //   101: aload_0
    //   102: getfield ZO : Lnet/portswigger/Zl0;
    //   105: aload #5
    //   107: aload_0
    //   108: getfield ZY : Ljava/lang/String;
    //   111: invokestatic Zn : (Lburp/Zxei;Lburp/Zkit;Lburp/Zk8l;Lburp/Zgbj;Lburp/Ztg4;Lnet/portswigger/Zl0;Ljava/lang/String;Ljava/lang/String;)Lburp/Zxtz;
    //   114: astore #7
    //   116: aload #7
    //   118: invokevirtual ZF : ()V
    //   121: return
  }
  
  public void ZP(Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, String paramString, Zl04 paramZl04) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #7
    //   5: invokestatic ZG : ()Z
    //   8: ifeq -> 108
    //   11: aload_0
    //   12: getfield ZC : Z
    //   15: ifeq -> 59
    //   18: new burp/Zsng
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: aload_1
    //   26: aload_2
    //   27: aload #4
    //   29: aload_0
    //   30: getfield ZO : Lnet/portswigger/Zl0;
    //   33: aload #5
    //   35: invokevirtual Zp : (Lburp/Zkit;Lburp/Zk8l;Lburp/Ztg4;Lnet/portswigger/Zl0;Ljava/lang/String;)V
    //   38: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   41: getstatic burp/Zrgs.CONTINUING_WITH_CORRUPT_PROJECT_AFTER_REPAIR : Lburp/Zrgs;
    //   44: iconst_0
    //   45: anewarray java/lang/Object
    //   48: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   51: invokevirtual println : (Ljava/lang/String;)V
    //   54: iload #7
    //   56: ifeq -> 160
    //   59: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   62: getstatic burp/Zrgs.RESTART_TO_REPAIR : Lburp/Zrgs;
    //   65: iconst_1
    //   66: anewarray java/lang/Object
    //   69: dup
    //   70: iconst_0
    //   71: sipush #-10132
    //   74: sipush #-18061
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: aastore
    //   81: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   84: invokevirtual println : (Ljava/lang/String;)V
    //   87: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   90: getstatic burp/Zrgs.CONTINUING_WITH_CORRUPT_PROJECT : Lburp/Zrgs;
    //   93: iconst_0
    //   94: anewarray java/lang/Object
    //   97: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   100: invokevirtual println : (Ljava/lang/String;)V
    //   103: iload #7
    //   105: ifeq -> 160
    //   108: aload_0
    //   109: aload_1
    //   110: aload_2
    //   111: aload_3
    //   112: aload #4
    //   114: aload #5
    //   116: aload #6
    //   118: <illegal opcode> run : (Lburp/Zm8s;Lburp/Zkit;Lburp/Zk8l;Lburp/Zgbj;Lburp/Ztg4;Ljava/lang/String;Lburp/Zl04;)Ljava/lang/Runnable;
    //   123: astore #8
    //   125: aload_3
    //   126: ifnull -> 142
    //   129: aload_3
    //   130: aload #8
    //   132: invokeinterface Zy : (Ljava/lang/Runnable;)V
    //   137: iload #7
    //   139: ifeq -> 160
    //   142: iconst_0
    //   143: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   146: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   149: aload_0
    //   150: getfield ZN : Lburp/Zxei;
    //   153: aload #8
    //   155: invokeinterface ZY : (Ljava/lang/Runnable;)V
    //   160: return
  }
  
  private String ZI(Zkvo paramZkvo) {
    null = a(-10129, 6608);
    return String.format(a(-10130, 2382), new Object[] { null, paramZkvo.ZE() });
  }
  
  private void lambda$repairDataStore$3(Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, String paramString, Zl04 paramZl04) {
    new Zxtz(this.ZN, paramZkit, paramZk8l, paramZgbj, paramZtg4, this.ZO, paramString, paramZl04, a(-10131, -30241));
  }
  
  private static void lambda$promptUserToEnableSafeMode$2(Zr7m paramZr7m) {
    paramZr7m.setVisible(true);
  }
  
  private static void lambda$shouldUseNewerProjectFile$1(Zr7v paramZr7v) {
    paramZr7v.setVisible(true);
  }
  
  private static void lambda$shouldAdoptCollaboratorInteractions$0(Zr77 paramZr77) {
    paramZr77.setVisible(true);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'É2y7N%ìtþ)fäJÛÎ4U¯ÊH²§O¾hxÌÝ;pÿôEªXxË?Ïé\\r«@ïgmñÍøz'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #12
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
    //   68: ldc 'ûsëåTÝßýãJd7Þ4³BÌ5w`SÔÔÉñr,\\t¡½ãdR^-QBTþ²ª©ó;N78ÏUEPi±ôª:ÞµÌ?A¬N]\\r)·\­ãGg'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #80
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #55
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
    //   129: putstatic burp/Zm8s.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm8s.b : [Ljava/lang/String;
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
    //   212: bipush #111
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #32
    //   234: goto -> 244
    //   237: bipush #114
    //   239: goto -> 244
    //   242: bipush #36
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
    int i = (paramInt1 ^ 0xFFFFD86F) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm8s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */