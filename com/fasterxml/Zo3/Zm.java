package com.fasterxml.Zo3;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zs.Zu8;
import com.fasterxml.Zyc;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Zm extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zz ZI;
  
  protected final Zk Za;
  
  protected final Zo ZU;
  
  protected final Zk ZN;
  
  protected final String ZH;
  
  protected final boolean Z_;
  
  protected final Map<String, Zyo<Object>> Zg;
  
  protected Zyo<Object> Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zm(Zk paramZk1, Zz paramZz, String paramString, boolean paramBoolean, Zk paramZk2) {
    this.Za = paramZk1;
    this.ZI = paramZz;
    this.ZH = Zx.ZH(paramString);
    this.Z_ = paramBoolean;
    this.Zg = new ConcurrentHashMap<>(16, 0.75F, 2);
    this.ZN = paramZk2;
    this.ZU = null;
  }
  
  protected Zm(Zm paramZm, Zo paramZo) {
    this.Za = paramZm.Za;
    this.ZI = paramZm.ZI;
    this.ZH = paramZm.ZH;
    this.Z_ = paramZm.Z_;
    this.Zg = paramZm.Zg;
    this.ZN = paramZm.ZN;
    this.Zt = paramZm.Zt;
    this.ZU = paramZo;
  }
  
  public abstract Zt Zf(Zo paramZo);
  
  public abstract Zyc Zz();
  
  public String ZV() {
    return this.Za.Zf().getName();
  }
  
  public final String ZF() {
    return this.ZH;
  }
  
  public Zz ZC() {
    return this.ZI;
  }
  
  public Class<?> Zx() {
    return Zx.ZB(this.ZN);
  }
  
  public boolean Ze() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (this.ZN != null);
  }
  
  public Zk Zc() {
    return this.Za;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('[').append(getClass().getName());
    stringBuilder.append(a(-9822, 28909)).append(this.Za);
    stringBuilder.append(a(-9824, -27289)).append(this.ZI);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  protected final Zyo<Object> ZU(Zyg paramZyg, String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zg : Ljava/util/Map;
    //   7: aload_2
    //   8: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast com/fasterxml/Zor/Zyo
    //   16: astore #4
    //   18: astore_3
    //   19: aload #4
    //   21: ifnonnull -> 202
    //   24: aload_0
    //   25: getfield ZI : Lcom/fasterxml/Zp/Zz;
    //   28: aload_1
    //   29: aload_2
    //   30: invokeinterface Zn : (Lcom/fasterxml/Zor/Zyw;Ljava/lang/String;)Lcom/fasterxml/Zor/Zk;
    //   35: astore #5
    //   37: aload #5
    //   39: ifnonnull -> 91
    //   42: aload_0
    //   43: aload_1
    //   44: invokevirtual ZT : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zyo;
    //   47: astore #4
    //   49: aload #4
    //   51: ifnonnull -> 189
    //   54: aload_0
    //   55: aload_1
    //   56: aload_2
    //   57: invokevirtual ZG : (Lcom/fasterxml/Zor/Zyg;Ljava/lang/String;)Lcom/fasterxml/Zor/Zk;
    //   60: astore #6
    //   62: aload #6
    //   64: ifnonnull -> 75
    //   67: getstatic com/fasterxml/Zs/Zu8.Za : Lcom/fasterxml/Zs/Zu8;
    //   70: areturn
    //   71: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_1
    //   76: aload #6
    //   78: aload_0
    //   79: getfield ZU : Lcom/fasterxml/Zor/Zo;
    //   82: invokevirtual ZC : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   85: astore #4
    //   87: aload_3
    //   88: ifnull -> 189
    //   91: aload_0
    //   92: getfield Za : Lcom/fasterxml/Zor/Zk;
    //   95: ifnull -> 177
    //   98: goto -> 105
    //   101: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: getfield Za : Lcom/fasterxml/Zor/Zk;
    //   109: invokevirtual getClass : ()Ljava/lang/Class;
    //   112: aload #5
    //   114: invokevirtual getClass : ()Ljava/lang/Class;
    //   117: if_acmpne -> 177
    //   120: goto -> 127
    //   123: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload #5
    //   129: invokevirtual Zk : ()Z
    //   132: ifne -> 177
    //   135: goto -> 142
    //   138: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: aload_1
    //   143: aload_0
    //   144: getfield Za : Lcom/fasterxml/Zor/Zk;
    //   147: aload #5
    //   149: invokevirtual Zf : ()Ljava/lang/Class;
    //   152: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   155: astore #5
    //   157: goto -> 177
    //   160: astore #6
    //   162: aload_1
    //   163: aload_0
    //   164: getfield Za : Lcom/fasterxml/Zor/Zk;
    //   167: aload_2
    //   168: aload #6
    //   170: invokevirtual getMessage : ()Ljava/lang/String;
    //   173: invokevirtual ZU : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/Zor/Zy_;
    //   176: athrow
    //   177: aload_1
    //   178: aload #5
    //   180: aload_0
    //   181: getfield ZU : Lcom/fasterxml/Zor/Zo;
    //   184: invokevirtual ZC : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyo;
    //   187: astore #4
    //   189: aload_0
    //   190: getfield Zg : Ljava/util/Map;
    //   193: aload_2
    //   194: aload #4
    //   196: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   201: pop
    //   202: aload #4
    //   204: areturn
    // Exception table:
    //   from	to	target	type
    //   62	71	71	java/lang/IllegalArgumentException
    //   87	98	101	java/lang/IllegalArgumentException
    //   91	120	123	java/lang/IllegalArgumentException
    //   105	135	138	java/lang/IllegalArgumentException
    //   142	157	160	java/lang/IllegalArgumentException
  }
  
  protected final Zyo<Object> ZT(Zyg paramZyg) throws IOException {
    try {
      if (this.ZN == null) {
        try {
          if (!paramZyg.Zg(Zyp.FAIL_ON_INVALID_SUBTYPE))
            return (Zyo<Object>)Zu8.Za; 
        } catch (IOException iOException) {
          throw b(null);
        } 
        return null;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Class clazz = this.ZN.Zf();
    try {
      if (Zx.Zu(clazz))
        return (Zyo<Object>)Zu8.Za; 
    } catch (IOException iOException) {
      throw b(null);
    } 
    synchronized (this.ZN) {
      if (this.Zt == null)
        this.Zt = paramZyg.ZC(this.ZN, this.ZU); 
      return this.Zt;
    } 
  }
  
  protected Object ZG(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    Zyo<Object> zyo;
    if (paramObject == null) {
      zyo = ZT(paramZyg);
      try {
        if (zyo == null)
          return paramZyg.Z_(Zc(), a(-9817, -3066), new Object[0]); 
      } catch (IOException iOException) {
        throw b(null);
      } 
    } else {
      try {
      
      } catch (IOException iOException) {
        throw b(null);
      } 
      String str = (paramObject instanceof String) ? (String)paramObject : String.valueOf(paramObject);
      zyo = ZU(paramZyg, str);
    } 
    return zyo.deserialize(paramZg, paramZyg);
  }
  
  protected Zk ZG(Zyg paramZyg, String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic Zs : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZI : Lcom/fasterxml/Zp/Zz;
    //   7: invokeinterface ZK : ()Ljava/lang/String;
    //   12: astore #4
    //   14: astore_3
    //   15: aload #4
    //   17: ifnonnull -> 35
    //   20: sipush #-9818
    //   23: sipush #-830
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: astore #4
    //   31: aload_3
    //   32: ifnull -> 64
    //   35: new java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: sipush #-9823
    //   45: sipush #-23942
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload #4
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual toString : ()Ljava/lang/String;
    //   62: astore #4
    //   64: aload_0
    //   65: getfield ZU : Lcom/fasterxml/Zor/Zo;
    //   68: ifnull -> 106
    //   71: sipush #-9821
    //   74: sipush #22453
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: iconst_2
    //   81: anewarray java/lang/Object
    //   84: dup
    //   85: iconst_0
    //   86: aload #4
    //   88: aastore
    //   89: dup
    //   90: iconst_1
    //   91: aload_0
    //   92: getfield ZU : Lcom/fasterxml/Zor/Zo;
    //   95: invokeinterface ZT : ()Ljava/lang/String;
    //   100: aastore
    //   101: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   104: astore #4
    //   106: aload_1
    //   107: aload_0
    //   108: getfield Za : Lcom/fasterxml/Zor/Zk;
    //   111: aload_2
    //   112: aload_0
    //   113: getfield ZI : Lcom/fasterxml/Zp/Zz;
    //   116: aload #4
    //   118: invokevirtual Za : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;Lcom/fasterxml/Zp/Zz;Ljava/lang/String;)Lcom/fasterxml/Zor/Zk;
    //   121: areturn
  }
  
  protected Zk ZB(Zyg paramZyg, String paramString) throws IOException {
    return paramZyg.Zb(this.Za, this.ZI, paramString);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñEÈ´-Q,âÔ-©Q.× AâÈ¤³ûD\\f\âLÈ§,ÅXîã¼Y([=ÃÄÞ²v SZÊ×Ð!<ÊÊ\\rË'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #96
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'ä,($[ë,% ªTKÈNnýÊ¿Mb"(óÀÉØ©ã³­ãìãéLd_Hµpw\\tî2>lýÿx\\rÄg+ÓêUíÌÑÉÁ_A!øóìy$§Mª7MÒZì ¥P³e$ðÓØÊS/ëõµ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic com/fasterxml/Zo3/Zm.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zo3/Zm.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #41
    //   214: goto -> 243
    //   217: bipush #105
    //   219: goto -> 243
    //   222: bipush #30
    //   224: goto -> 243
    //   227: bipush #91
    //   229: goto -> 243
    //   232: bipush #102
    //   234: goto -> 243
    //   237: iconst_1
    //   238: goto -> 243
    //   241: bipush #7
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD9A3) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */