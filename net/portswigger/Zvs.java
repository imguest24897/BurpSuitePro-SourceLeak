package net.portswigger;

import burp.Zbqc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;

class Zvs implements Zuo {
  private final Stack<Zn1> Zs = new Stack<>();
  
  private final Map<String, Zv0> Zm = new LinkedHashMap<>();
  
  private final Zrma Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zvs(Zrma paramZrma) {
    this.Zy = paramZrma;
  }
  
  private Zv0 ZL() {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zs : Ljava/util/Stack;
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifne -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   22: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   25: aload_0
    //   26: invokevirtual ZZ : ()Ljava/lang/String;
    //   29: astore_2
    //   30: aload_0
    //   31: getfield Zs : Ljava/util/Stack;
    //   34: invokevirtual size : ()I
    //   37: iconst_1
    //   38: isub
    //   39: istore_3
    //   40: iload_3
    //   41: ifle -> 72
    //   44: aload_0
    //   45: getfield Zs : Ljava/util/Stack;
    //   48: iload_3
    //   49: invokevirtual get : (I)Ljava/lang/Object;
    //   52: checkcast net/portswigger/Zn1
    //   55: invokevirtual Zk : ()Z
    //   58: ifeq -> 65
    //   61: iload_1
    //   62: ifne -> 72
    //   65: iinc #3, -1
    //   68: iload_1
    //   69: ifne -> 40
    //   72: aload_0
    //   73: getfield Zm : Ljava/util/Map;
    //   76: aload_2
    //   77: aload_0
    //   78: aload_2
    //   79: <illegal opcode> apply : (Lnet/portswigger/Zvs;Ljava/lang/String;)Ljava/util/function/Function;
    //   84: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   89: checkcast net/portswigger/Zv0
    //   92: areturn
  }
  
  private String ZT(Zrma paramZrma, String paramString) {
    return paramZrma.name() + "[" + paramZrma.name() + "]";
  }
  
  private Optional<Zv0> Z_() {
    Zuh.Zb(!this.Zs.isEmpty(), Zqf.Zr);
    String str = ZZ();
    return Optional.ofNullable(this.Zm.get(str));
  }
  
  private String ZZ() {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_2
    //   11: istore_1
    //   12: aload_0
    //   13: getfield Zs : Ljava/util/Stack;
    //   16: invokevirtual iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 143
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: checkcast net/portswigger/Zn1
    //   38: astore #4
    //   40: aload #4
    //   42: invokevirtual Zw : ()Z
    //   45: ifeq -> 81
    //   48: aload_2
    //   49: invokevirtual isEmpty : ()Z
    //   52: ifeq -> 139
    //   55: aload_2
    //   56: sipush #21017
    //   59: sipush #19267
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: aload #4
    //   70: invokevirtual Zp : ()Ljava/lang/String;
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: iload_1
    //   78: ifeq -> 139
    //   81: aload #4
    //   83: invokevirtual Zk : ()Z
    //   86: ifeq -> 129
    //   89: aload_2
    //   90: invokevirtual isEmpty : ()Z
    //   93: ifeq -> 110
    //   96: aload_2
    //   97: aload #4
    //   99: invokevirtual Zp : ()Ljava/lang/String;
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: iload_1
    //   107: ifeq -> 139
    //   110: aload_2
    //   111: ldc '.'
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload #4
    //   118: invokevirtual Zp : ()Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: iload_1
    //   126: ifeq -> 139
    //   129: aload_2
    //   130: aload #4
    //   132: invokevirtual Zp : ()Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: iload_1
    //   140: ifeq -> 20
    //   143: aload_2
    //   144: invokevirtual toString : ()Ljava/lang/String;
    //   147: areturn
  }
  
  public void Zp(Zu3 paramZu3) {
    paramZu3.Zqi().forEach(this::lambda$visitKeyValues$1);
    paramZu3.ZqA().forEach(this::lambda$visitKeyValues$2);
  }
  
  public void Zt(Zv7 paramZv7) {
    Zms zms = paramZv7.ZrU();
    boolean bool = Z_j.Zt();
    if (zms instanceof Zrm7) {
      String str = ((Zrm7)zms).ZgH();
      this.Zs.push(Zn1.ZI(str));
      paramZv7.Zrf().ZF(this);
      this.Zs.pop();
      if (!bool) {
        Zuh.Zb(false, Zqf.Zk);
        return;
      } 
      return;
    } 
    Zuh.Zb(false, Zqf.Zk);
  }
  
  public void Zv(Zkm paramZkm) {
    paramZkm.Zxi().forEach(this::lambda$visitMultipart$3);
  }
  
  public void Zg(Zhw paramZhw) {
    this.Zs.push(Zn1.ZI(paramZhw.Zx_()));
    paramZhw.Zxc().ZF(this);
    this.Zs.pop();
  }
  
  public void ZX(Zl2 paramZl2) {
    this.Zs.push(Zn1.ZI(paramZl2.Z_r()));
    ZL().Zg(Zt3.FILE);
    this.Zs.pop();
  }
  
  public void ZY(Zsj paramZsj) {
    if (!paramZsj.ZYQ().isEmpty())
      ((Zms)paramZsj.ZYQ().get(0)).ZF(this); 
  }
  
  public void ZL(Zz5 paramZz5) {}
  
  public void ZF(Zrmd paramZrmd) {}
  
  public void Zg(Zlw paramZlw) {
    this.Zs.push(Zn1.ZI(paramZlw.Zf8()));
    paramZlw.Zfk().ZF(this);
    boolean bool = Z_j.ZN();
    this.Zs.pop();
    this.Zs.push(Zn1.ZC(paramZlw.Zf8()));
    paramZlw.Zf5().ZF(this);
    this.Zs.pop();
    if (Zbqc.Zwu() == null)
      Z_j.Zl(!bool); 
  }
  
  public void ZV(Zt2 paramZt2) {
    paramZt2.ZEJ().forEach(this::lambda$visitXmlCollection$4);
  }
  
  public void Zm(Zlq paramZlq) {
    this.Zs.push(Zn1.Zu(0));
    Zv0 zv0 = ZL();
    Z_s z_s = new Z_s(zv0);
    paramZlq.ZF(z_s);
    paramZlq.ZDP().ZF(this);
    this.Zs.pop();
  }
  
  public void Zg(Zu9 paramZu9) {
    this.Zs.push(Zn1.ZI(paramZu9.ZZM()));
    paramZu9.ZZ9().ZF(this);
    this.Zs.pop();
  }
  
  public void ZI(Zoj paramZoj) {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZQK : ()Ljava/util/List;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifeq -> 17
    //   16: return
    //   17: aload_1
    //   18: invokevirtual ZQK : ()Ljava/util/List;
    //   21: invokeinterface size : ()I
    //   26: istore_3
    //   27: iconst_0
    //   28: istore #4
    //   30: iload #4
    //   32: iload_3
    //   33: if_icmpge -> 153
    //   36: aload_0
    //   37: getfield Zs : Ljava/util/Stack;
    //   40: iload #4
    //   42: invokestatic Zu : (I)Lnet/portswigger/Zn1;
    //   45: invokevirtual push : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: pop
    //   49: aload_1
    //   50: invokevirtual ZQK : ()Ljava/util/List;
    //   53: iload #4
    //   55: invokeinterface get : (I)Ljava/lang/Object;
    //   60: checkcast net/portswigger/Zms
    //   63: astore #5
    //   65: aload #5
    //   67: instanceof net/portswigger/Zoj
    //   70: ifeq -> 85
    //   73: aload #5
    //   75: aload_0
    //   76: invokeinterface ZF : (Lnet/portswigger/Zuo;)V
    //   81: iload_2
    //   82: ifne -> 138
    //   85: aload_0
    //   86: invokevirtual ZL : ()Lnet/portswigger/Zv0;
    //   89: astore #6
    //   91: aload #6
    //   93: iconst_1
    //   94: invokevirtual ZY : (Z)Lnet/portswigger/Zv0;
    //   97: pop
    //   98: new net/portswigger/Z_u
    //   101: dup
    //   102: aload #6
    //   104: invokespecial <init> : (Lnet/portswigger/Zv0;)V
    //   107: astore #7
    //   109: new net/portswigger/Z_s
    //   112: dup
    //   113: aload #6
    //   115: invokespecial <init> : (Lnet/portswigger/Zv0;)V
    //   118: astore #8
    //   120: aload #5
    //   122: aload #8
    //   124: invokeinterface ZF : (Lnet/portswigger/Zuo;)V
    //   129: aload #5
    //   131: aload #7
    //   133: invokeinterface ZF : (Lnet/portswigger/Zuo;)V
    //   138: aload_0
    //   139: getfield Zs : Ljava/util/Stack;
    //   142: invokevirtual pop : ()Ljava/lang/Object;
    //   145: pop
    //   146: iinc #4, 1
    //   149: iload_2
    //   150: ifne -> 30
    //   153: return
  }
  
  public void Zh(Zf6 paramZf6) {
    paramZf6.ZnW().forEach(this::lambda$visitJsonObject$5);
    paramZf6.Zn1().forEach(this::lambda$visitJsonObject$6);
  }
  
  public void ZI(Zh2 paramZh2) {
    byte b = 0;
    boolean bool = Z_j.Zt();
    while (b < paramZh2.ZhO().size()) {
      this.Zs.push(Zn1.Zu(b));
      ((Zms)paramZh2.ZhO().get(b)).ZF(this);
      this.Zs.pop();
      b++;
      if (!bool)
        break; 
    } 
  }
  
  public void ZY(Zs7 paramZs7) {
    ZE(paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    ZE(paramZrmr);
  }
  
  public void Zz(Zzz paramZzz) {
    ZE(paramZzz);
  }
  
  public void Zr(Zt0 paramZt0) {
    ZE(paramZt0);
  }
  
  private void ZE(Zms paramZms) {
    boolean bool = this.Zs.isEmpty();
    if (bool)
      this.Zs.push(Zn1.ZI(a(21019, -12287))); 
    Zv0 zv0 = ZL();
    paramZms.ZF(new Z_s(zv0));
    paramZms.ZF(new Z_u(zv0));
    if (bool)
      this.Zs.pop(); 
  }
  
  public void Zc(Zrm7 paramZrm7) {
    ZN(paramZrm7);
  }
  
  public void ZE(Zzx paramZzx) {
    ZN(paramZzx);
  }
  
  public void ZT(Zkv paramZkv) {
    ZN(paramZkv);
  }
  
  private void ZN(Zu7<?> paramZu7) {
    boolean bool = this.Zs.isEmpty();
    if (bool)
      this.Zs.push(Zn1.ZI(a(21018, 23888))); 
    Optional<Zv0> optional = Z_();
    optional.ifPresent(paramZu7::lambda$visitValue$7);
    if (bool)
      this.Zs.pop(); 
  }
  
  public Map<String, Zv0> Zx() {
    return this.Zm;
  }
  
  private static void lambda$visitValue$7(Zu7 paramZu7, Zv0 paramZv0) {
    paramZu7.ZF(new Z_u(paramZv0));
  }
  
  private void lambda$visitJsonObject$6(Zf6 paramZf6) {
    paramZf6.ZF(this);
  }
  
  private void lambda$visitJsonObject$5(String paramString, Zms paramZms) {
    this.Zs.push(Zn1.ZI(paramString));
    paramZms.ZF(this);
    this.Zs.pop();
  }
  
  private void lambda$visitXmlCollection$4(Zms paramZms) {
    paramZms.ZF(this);
  }
  
  private void lambda$visitMultipart$3(Zms paramZms) {
    paramZms.ZF(this);
  }
  
  private void lambda$visitKeyValues$2(Zu3 paramZu3) {
    paramZu3.ZF(this);
  }
  
  private void lambda$visitKeyValues$1(Zv7 paramZv7) {
    paramZv7.ZF(this);
  }
  
  private Zv0 lambda$getOrCreateParameterBuilder$0(String paramString1, String paramString2) {
    return (new Zv0()).Zq(ZT(this.Zy, paramString1)).ZM(paramString1).ZB(this.Zy);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ü,\\f|ö\\r6Ù±¬¡¯îëóÈzÐ0îñ&2'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #75
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic net/portswigger/Zvs.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic net/portswigger/Zvs.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #82
    //   154: goto -> 184
    //   157: bipush #100
    //   159: goto -> 184
    //   162: bipush #15
    //   164: goto -> 184
    //   167: bipush #111
    //   169: goto -> 184
    //   172: bipush #48
    //   174: goto -> 184
    //   177: bipush #97
    //   179: goto -> 184
    //   182: bipush #109
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x521B) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */