package burp;

import java.util.List;
import javax.swing.RowSorter;
import net.portswigger.Zm2;
import net.portswigger.Zo;
import net.portswigger.Zsy;
import net.portswigger.Zto;

public class Zg0i extends Zg01<Zzh2> {
  private final Object Zw = new Object();
  
  private final Zbp5 Zl;
  
  private final Zze3<Zzh2> Ze;
  
  private final Zsy Zz;
  
  private final Zrgd ZI;
  
  private final Zswv<Zzh2> ZO;
  
  private final Zm6x ZR;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zg0i(Zlod paramZlod, Zekl paramZekl, Zzxf paramZzxf, Zbp5 paramZbp5, Zze3<Zzh2> paramZze3, Zbnt paramZbnt, Zr_4 paramZr_4, Ze6o paramZe6o, Zsy paramZsy, Zrgd paramZrgd, Zswv<Zzh2> paramZswv, Zm6x paramZm6x) {
    super(a(-28876, 531), paramZlod, paramZekl, paramZzxf, paramZswv, paramZbnt, paramZr_4, paramZe6o);
    this.Zl = paramZbp5;
    this.Ze = paramZze3;
    this.Zz = paramZsy;
    this.ZI = paramZrgd;
    this.ZO = paramZswv;
    this.ZR = paramZm6x;
  }
  
  public Zzh2 ZN(int paramInt1, Zlit paramZlit, byte[] paramArrayOfbyte, boolean paramBoolean, byte paramByte1, Zo paramZo, int paramInt2, String paramString, byte paramByte2) {
    boolean bool = Zs2p.ZT();
    if (this.ZG.ZE(paramZlit)) {
      Zm2.Zo(Zze0.PROXY_HISTORY_WEBSOCKETS_ITEM_ADDED);
      Zzh2 zzh2 = ZC(this.Zy, paramInt1, paramArrayOfbyte, paramBoolean, paramByte1, paramZo, paramInt2);
      zzh2.Zxg(paramString);
      zzh2.ZB(paramByte2);
      add(zzh2);
      return bool ? ZC(this.Zn, paramInt1, paramArrayOfbyte, paramBoolean, paramByte1, paramZo, paramInt2) : zzh2;
    } 
    return ZC(this.Zn, paramInt1, paramArrayOfbyte, paramBoolean, paramByte1, paramZo, paramInt2);
  }
  
  private Zzh2 ZC(Zr_4 paramZr_4, int paramInt1, byte[] paramArrayOfbyte, boolean paramBoolean, byte paramByte, Zo paramZo, int paramInt2) {
    Zstu zstu = paramZr_4.ZZ(paramArrayOfbyte);
    return paramZr_4.<Zzh2>ZH(new Zeh2(paramInt1, zstu, null, paramBoolean, paramByte, paramZo, this.ZI.ZX(), paramInt2));
  }
  
  public void ZC(Zzh2 paramZzh2, byte[] paramArrayOfbyte) {
    boolean bool = this.ZG.ZE(this.Ze.ZR(paramZzh2));
    Zr_4 zr_4 = bool ? this.Zy : this.Zn;
    paramZzh2.ZO(zr_4.ZZ(paramArrayOfbyte));
    if (bool)
      Zb(paramZzh2); 
  }
  
  public void ZF(Zzh2 paramZzh2, byte[] paramArrayOfbyte) {
    boolean bool = this.ZG.ZE(this.Ze.ZR(paramZzh2));
    Zr_4 zr_4 = bool ? this.Zy : this.Zn;
    paramZzh2.ZW(zr_4.ZZ(paramArrayOfbyte));
    if (bool)
      Zb(paramZzh2); 
  }
  
  public List<Zzh2> Zn() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/lang/Object;
    //   4: dup
    //   5: astore_1
    //   6: monitorenter
    //   7: new java/util/ArrayList
    //   10: dup
    //   11: aload_0
    //   12: getfield ZO : Lburp/Zswv;
    //   15: invokevirtual size : ()I
    //   18: invokespecial <init> : (I)V
    //   21: astore_2
    //   22: aload_0
    //   23: getfield ZO : Lburp/Zswv;
    //   26: aload_0
    //   27: aload_2
    //   28: <illegal opcode> accept : (Lburp/Zg0i;Ljava/util/List;)Ljava/util/function/Consumer;
    //   33: invokevirtual forEach : (Ljava/util/function/Consumer;)V
    //   36: aload_2
    //   37: aload_1
    //   38: monitorexit
    //   39: areturn
    //   40: astore_3
    //   41: aload_1
    //   42: monitorexit
    //   43: aload_3
    //   44: athrow
    // Exception table:
    //   from	to	target	type
    //   7	39	40	finally
    //   40	43	40	finally
  }
  
  protected int ZY() {
    synchronized (this.Zw) {
      return this.ZF.ZGK();
    } 
  }
  
  protected int Zf() {
    synchronized (this.Zw) {
      int i = ZY() + 1;
      ZK(i);
      return i;
    } 
  }
  
  protected void ZK(int paramInt) {
    synchronized (this.Zw) {
      this.ZF.ZG6(paramInt);
    } 
  }
  
  public RowSorter.SortKey ZB() {
    return new RowSorter.SortKey(this.Zi.ZlE(), this.Zi.Zl4());
  }
  
  protected Zto<List<Zzh2>, Integer> Zk(Zr_4 paramZr_4, Zzir paramZzir, Zefg<Zzh2> paramZefg, Ztg8 paramZtg8, Zeom paramZeom, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #10
    //   9: invokestatic Za : ()Z
    //   12: new java/util/ArrayList
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #11
    //   21: istore #9
    //   23: iconst_0
    //   24: istore #12
    //   26: aload_2
    //   27: invokeinterface Zvx : ()Lburp/Zefg;
    //   32: astore #13
    //   34: new burp/Zzzt
    //   37: dup
    //   38: aload #13
    //   40: aload_0
    //   41: getfield Zz : Lnet/portswigger/Zsy;
    //   44: aload_1
    //   45: new burp/Zey9
    //   48: dup
    //   49: aload_0
    //   50: getfield Zg : Lburp/Zbnt;
    //   53: invokespecial <init> : (Lburp/Zbnt;)V
    //   56: invokespecial <init> : (Lburp/Zefg;Lnet/portswigger/Zsy;Lburp/Zr_4;Lburp/Zey9;)V
    //   59: astore #14
    //   61: new burp/Zbp5
    //   64: dup
    //   65: aload #14
    //   67: aload_1
    //   68: invokespecial <init> : (Lburp/Zzzt;Lburp/Zr_4;)V
    //   71: astore #15
    //   73: aload_3
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #16
    //   81: aload #16
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 317
    //   91: aload #16
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast burp/Zzh2
    //   101: astore #17
    //   103: aload #4
    //   105: aload #17
    //   107: invokeinterface Zw : (Lburp/Zgpi;)Lburp/Zgpi;
    //   112: checkcast burp/Zzh2
    //   115: astore #18
    //   117: aload #18
    //   119: invokeinterface ZGx : ()I
    //   124: ifne -> 173
    //   127: aload #15
    //   129: aload #17
    //   131: invokevirtual ZZ : (Lburp/Zzh2;)Lburp/Zlit;
    //   134: astore #20
    //   136: aload #10
    //   138: aload #20
    //   140: aload_0
    //   141: aload #4
    //   143: <illegal opcode> apply : (Lburp/Zg0i;Lburp/Ztg8;)Ljava/util/function/Function;
    //   148: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   153: checkcast java/lang/Integer
    //   156: invokevirtual intValue : ()I
    //   159: istore #19
    //   161: iload #9
    //   163: ifne -> 248
    //   166: iconst_5
    //   167: anewarray burp/Zbqc
    //   170: invokestatic Zr : ([Lburp/Zbqc;)V
    //   173: aload #17
    //   175: invokeinterface ZGx : ()I
    //   180: istore #20
    //   182: aload #5
    //   184: iload #20
    //   186: invokevirtual Zt : (I)I
    //   189: istore #19
    //   191: iload #19
    //   193: ifne -> 248
    //   196: aload #14
    //   198: iload #20
    //   200: invokevirtual Zy : (I)Lburp/Zmo7;
    //   203: astore #21
    //   205: aload_0
    //   206: getfield Zl : Lburp/Zbp5;
    //   209: aload #4
    //   211: aload #21
    //   213: invokevirtual Zk : ()Lburp/Zlit;
    //   216: invokeinterface Zw : (Lburp/Zgpi;)Lburp/Zgpi;
    //   221: checkcast burp/Zlit
    //   224: aload #21
    //   226: invokevirtual ZL : ()[B
    //   229: aload #21
    //   231: invokevirtual Zr : ()Lburp/Zxym;
    //   234: invokevirtual ZD : (Lburp/Zlit;[BLburp/Zxym;)I
    //   237: istore #19
    //   239: aload #5
    //   241: iload #20
    //   243: iload #19
    //   245: invokevirtual Zq : (II)V
    //   248: aload #18
    //   250: iload #19
    //   252: invokeinterface ZSp : (I)V
    //   257: aload #11
    //   259: aload #18
    //   261: invokeinterface add : (Ljava/lang/Object;)Z
    //   266: pop
    //   267: iload #12
    //   269: aload #18
    //   271: invokeinterface ZEK : ()I
    //   276: invokestatic max : (II)I
    //   279: istore #12
    //   281: fload #7
    //   283: fload #8
    //   285: fadd
    //   286: fstore #7
    //   288: aload #6
    //   290: fload #7
    //   292: sipush #-28875
    //   295: sipush #-7878
    //   298: invokestatic a : (II)Ljava/lang/String;
    //   301: invokeinterface Zq : (FLjava/lang/String;)Z
    //   306: ifne -> 312
    //   309: goto -> 317
    //   312: iload #9
    //   314: ifne -> 81
    //   317: aload #11
    //   319: iload #12
    //   321: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   324: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   327: areturn
  }
  
  private Integer lambda$importHistoryItems$1(Ztg8 paramZtg8, Zlit paramZlit) {
    return Integer.valueOf(this.Zl.ZF(paramZtg8.<Zlit>Zw(paramZlit)));
  }
  
  private void lambda$getHistoryItems$0(List<Zeve> paramList, Zzh2 paramZzh2) {
    paramList.add(new Zeve(paramZzh2, this.ZR));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '^\\n;Ì3ÔÃV£©5FU'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #13
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #51
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
    //   69: putstatic burp/Zg0i.b : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zg0i.c : [Ljava/lang/String;
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
    //   152: bipush #106
    //   154: goto -> 184
    //   157: bipush #21
    //   159: goto -> 184
    //   162: bipush #57
    //   164: goto -> 184
    //   167: bipush #14
    //   169: goto -> 184
    //   172: bipush #20
    //   174: goto -> 184
    //   177: bipush #66
    //   179: goto -> 184
    //   182: bipush #23
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8F34) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = '®';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */