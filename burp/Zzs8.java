package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Zzs8 extends Zzpg {
  private static final String[] c;
  
  private static final String[] d;
  
  public Zzs8(Zk5 paramZk5, Zb3t paramZb3t) {
    super(paramZk5, paramZb3t);
  }
  
  public List<Zb3t> ZH(List<Zb3t> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Lburp/Zb3t;
    //   4: invokeinterface ZC : ()Ljava/util/List;
    //   9: invokeinterface size : ()I
    //   14: istore_3
    //   15: invokestatic Zr : ()Ljava/lang/String;
    //   18: bipush #6
    //   20: istore #4
    //   22: astore_2
    //   23: bipush #8
    //   25: istore #5
    //   27: iconst_1
    //   28: istore #6
    //   30: iload_3
    //   31: bipush #7
    //   33: if_icmpne -> 46
    //   36: iinc #5, -2
    //   39: iconst_0
    //   40: istore #6
    //   42: aload_2
    //   43: ifnull -> 103
    //   46: iload_3
    //   47: bipush #8
    //   49: if_icmpne -> 89
    //   52: aload_0
    //   53: getfield ZC : Lburp/Zb3t;
    //   56: invokeinterface ZC : ()Ljava/util/List;
    //   61: iconst_4
    //   62: invokeinterface get : (I)Ljava/lang/Object;
    //   67: checkcast burp/Zesp
    //   70: invokestatic ZR : (Lburp/Zesp;)Z
    //   73: ifne -> 82
    //   76: iconst_0
    //   77: istore #6
    //   79: iinc #4, -1
    //   82: iinc #5, -1
    //   85: aload_2
    //   86: ifnull -> 103
    //   89: iload_3
    //   90: iconst_5
    //   91: if_icmpne -> 103
    //   94: iconst_1
    //   95: istore #6
    //   97: iconst_4
    //   98: istore #5
    //   100: iconst_4
    //   101: istore #4
    //   103: aload_0
    //   104: getfield ZC : Lburp/Zb3t;
    //   107: invokeinterface ZC : ()Ljava/util/List;
    //   112: iconst_2
    //   113: invokeinterface get : (I)Ljava/lang/Object;
    //   118: checkcast burp/Zb3t
    //   121: astore #7
    //   123: aload_0
    //   124: getfield ZC : Lburp/Zb3t;
    //   127: invokeinterface ZC : ()Ljava/util/List;
    //   132: iconst_4
    //   133: invokeinterface get : (I)Ljava/lang/Object;
    //   138: checkcast burp/Zb3t
    //   141: astore #8
    //   143: aload_0
    //   144: getfield ZC : Lburp/Zb3t;
    //   147: invokeinterface ZC : ()Ljava/util/List;
    //   152: iload #4
    //   154: invokeinterface get : (I)Ljava/lang/Object;
    //   159: checkcast burp/Zb3t
    //   162: astore #9
    //   164: aload_0
    //   165: getfield ZC : Lburp/Zb3t;
    //   168: invokeinterface ZC : ()Ljava/util/List;
    //   173: iload #5
    //   175: invokeinterface get : (I)Ljava/lang/Object;
    //   180: checkcast burp/Zb3t
    //   183: astore #10
    //   185: aload_0
    //   186: getfield Zy : Lburp/Zk5;
    //   189: aload_1
    //   190: aload #7
    //   192: invokevirtual Zf : (Ljava/util/List;Lburp/Zb3t;)Ljava/util/List;
    //   195: pop
    //   196: iload_3
    //   197: tableswitch default -> 290, 5 -> 278, 6 -> 290, 7 -> 266, 8 -> 248, 9 -> 232
    //   232: aload_0
    //   233: aload #7
    //   235: aload #8
    //   237: aload #9
    //   239: aload #10
    //   241: invokevirtual Zg : (Lburp/Zb3t;Lburp/Zb3t;Lburp/Zb3t;Lburp/Zb3t;)V
    //   244: aload_2
    //   245: ifnull -> 322
    //   248: aload_0
    //   249: aload #7
    //   251: aload #8
    //   253: aload #9
    //   255: aload #10
    //   257: iload #6
    //   259: invokevirtual ZE : (Lburp/Zb3t;Lburp/Zb3t;Lburp/Zb3t;Lburp/Zb3t;Z)V
    //   262: aload_2
    //   263: ifnull -> 322
    //   266: aload_0
    //   267: aload #7
    //   269: aload #10
    //   271: invokevirtual Zn : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   274: aload_2
    //   275: ifnull -> 322
    //   278: aload_0
    //   279: aload #7
    //   281: aload #10
    //   283: invokevirtual ZZ : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   286: aload_2
    //   287: ifnull -> 322
    //   290: iconst_0
    //   291: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   294: iload_3
    //   295: sipush #-21618
    //   298: sipush #-16739
    //   301: invokestatic b : (II)Ljava/lang/String;
    //   304: swap
    //   305: sipush #-21617
    //   308: sipush #16636
    //   311: invokestatic b : (II)Ljava/lang/String;
    //   314: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   319: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   322: aload_0
    //   323: invokevirtual ZQ : ()V
    //   326: aload_0
    //   327: getfield ZR : Ljava/util/List;
    //   330: invokestatic Zwu : ()[Lburp/Zbqc;
    //   333: ifnonnull -> 341
    //   336: ldc 'sSBtYb'
    //   338: invokestatic ZS : (Ljava/lang/String;)V
    //   341: areturn
  }
  
  private void Zg(Zb3t paramZb3t1, Zb3t paramZb3t2, Zb3t paramZb3t3, Zb3t paramZb3t4) {
    this.Zy.Zv(paramZb3t1, paramZb3t2);
    this.Zy.Zv(paramZb3t3, paramZb3t2);
    this.ZR.addAll(this.Zy.Zf(Collections.singletonList(paramZb3t2), paramZb3t4));
    Iterator<Zb3t> iterator = this.ZR.iterator();
    String str = Zzpg.Zr();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      this.Zy.Zv(zb3t, paramZb3t3);
      if (str != null)
        break; 
    } 
    this.ZR.clear();
    this.ZR.add(paramZb3t2);
  }
  
  private void ZE(Zb3t paramZb3t1, Zb3t paramZb3t2, Zb3t paramZb3t3, Zb3t paramZb3t4, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: astore #6
    //   5: iload #5
    //   7: ifeq -> 115
    //   10: aload_0
    //   11: getfield Zy : Lburp/Zk5;
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual Zv : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   19: aload_0
    //   20: getfield ZR : Ljava/util/List;
    //   23: aload_0
    //   24: getfield Zy : Lburp/Zk5;
    //   27: aload_2
    //   28: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   31: aload #4
    //   33: invokevirtual Zf : (Ljava/util/List;Lburp/Zb3t;)Ljava/util/List;
    //   36: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   41: pop
    //   42: aload_0
    //   43: getfield ZR : Ljava/util/List;
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #7
    //   53: aload #7
    //   55: invokeinterface hasNext : ()Z
    //   60: ifeq -> 90
    //   63: aload #7
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: checkcast burp/Zb3t
    //   73: astore #8
    //   75: aload_0
    //   76: getfield Zy : Lburp/Zk5;
    //   79: aload #8
    //   81: aload_2
    //   82: invokevirtual Zv : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   85: aload #6
    //   87: ifnull -> 53
    //   90: aload_0
    //   91: getfield ZR : Ljava/util/List;
    //   94: invokeinterface clear : ()V
    //   99: aload_0
    //   100: getfield ZR : Ljava/util/List;
    //   103: aload_2
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload #6
    //   112: ifnull -> 233
    //   115: aload_0
    //   116: getfield ZR : Ljava/util/List;
    //   119: aload_0
    //   120: getfield Zy : Lburp/Zk5;
    //   123: aload_1
    //   124: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   127: aload #4
    //   129: invokevirtual Zf : (Ljava/util/List;Lburp/Zb3t;)Ljava/util/List;
    //   132: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   137: pop
    //   138: aload_1
    //   139: getstatic burp/Zxc6.ExecutionHops : Lburp/Zxc6;
    //   142: invokeinterface ZO : (Lburp/Zxc6;)Ljava/lang/Object;
    //   147: checkcast java/util/List
    //   150: astore #7
    //   152: aload #7
    //   154: ifnull -> 224
    //   157: aload_0
    //   158: getfield Zy : Lburp/Zk5;
    //   161: aload_3
    //   162: aload #7
    //   164: iconst_0
    //   165: invokeinterface get : (I)Ljava/lang/Object;
    //   170: checkcast burp/Zb3t
    //   173: invokevirtual Zv : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   176: aload_0
    //   177: getfield ZR : Ljava/util/List;
    //   180: invokeinterface iterator : ()Ljava/util/Iterator;
    //   185: astore #8
    //   187: aload #8
    //   189: invokeinterface hasNext : ()Z
    //   194: ifeq -> 224
    //   197: aload #8
    //   199: invokeinterface next : ()Ljava/lang/Object;
    //   204: checkcast burp/Zb3t
    //   207: astore #9
    //   209: aload_0
    //   210: getfield Zy : Lburp/Zk5;
    //   213: aload #9
    //   215: aload_3
    //   216: invokevirtual Zv : (Lburp/Zb3t;Lburp/Zb3t;)V
    //   219: aload #6
    //   221: ifnull -> 187
    //   224: aload_0
    //   225: getfield ZR : Ljava/util/List;
    //   228: invokeinterface clear : ()V
    //   233: return
  }
  
  private void Zn(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    this.ZR.addAll(this.Zy.Zf(Collections.singletonList(paramZb3t1), paramZb3t2));
    List<Zb3t> list = paramZb3t1.<List>ZO(Zxc6.ExecutionHops);
    String str = Zzpg.Zr();
    if (list != null)
      for (Zb3t zb3t : this.ZR) {
        this.Zy.Zv(zb3t, list.get(0));
        if (str != null)
          break; 
      }  
    this.ZR.clear();
  }
  
  private void ZZ(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    this.ZR.addAll(this.Zy.Zf(Collections.singletonList(paramZb3t1), paramZb3t2));
    Iterator<Zb3t> iterator = this.ZR.iterator();
    String str = Zzpg.Zr();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      this.Zy.Zv(zb3t, paramZb3t1);
      if (str != null)
        break; 
    } 
    this.ZR.clear();
    this.ZR.add(paramZb3t1);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÝM<¢â¢(î\\tWÖ4"¥nR¹'k%¯Ïì÷óH'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #85
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
    //   69: putstatic burp/Zzs8.c : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zzs8.d : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #65
    //   154: goto -> 184
    //   157: bipush #86
    //   159: goto -> 184
    //   162: bipush #28
    //   164: goto -> 184
    //   167: bipush #88
    //   169: goto -> 184
    //   172: bipush #16
    //   174: goto -> 184
    //   177: bipush #34
    //   179: goto -> 184
    //   182: bipush #103
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAB8F) & 0xFFFF;
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
      byte b1 = 107;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzs8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */