package burp;

import java.util.Iterator;
import java.util.Optional;

public class Ze7g implements Iterable<Zska> {
  private Zska Zv;
  
  private Zska Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Ze7g ZD(Zska paramZska1, Zska paramZska2) {
    return new Ze7g(paramZska1, paramZska2);
  }
  
  public Ze7g() {
    this.Zv = null;
    this.Z_ = null;
  }
  
  public Ze7g(Zska... paramVarArgs) {
    Zska[] arrayOfZska = paramVarArgs;
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    int i = arrayOfZska.length;
    byte b = 0;
    while (b < i) {
      Zska zska = arrayOfZska[b];
      Zy(zska);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private Ze7g(Zska paramZska1, Zska paramZska2) {
    this.Zv = paramZska1;
    this.Z_ = paramZska2;
  }
  
  private void Zp(Zska paramZska) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual Zo : ()Z
    //   8: ifeq -> 27
    //   11: aload_0
    //   12: aload_1
    //   13: putfield Z_ : Lburp/Zska;
    //   16: aload_2
    //   17: ifnull -> 50
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   26: athrow
    //   27: aload_1
    //   28: aload_0
    //   29: getfield Zv : Lburp/Zska;
    //   32: putfield Zo : Lburp/Zska;
    //   35: aload_0
    //   36: getfield Zv : Lburp/Zska;
    //   39: aload_1
    //   40: putfield ZO : Lburp/Zska;
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: putfield Zv : Lburp/Zska;
    //   55: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/NullPointerException
    //   11	43	46	java/lang/NullPointerException
  }
  
  private void Zy(Zska paramZska) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: invokevirtual Zo : ()Z
    //   8: ifeq -> 27
    //   11: aload_0
    //   12: aload_1
    //   13: putfield Zv : Lburp/Zska;
    //   16: aload_2
    //   17: ifnull -> 50
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   26: athrow
    //   27: aload_0
    //   28: getfield Z_ : Lburp/Zska;
    //   31: aload_1
    //   32: putfield Zo : Lburp/Zska;
    //   35: aload_1
    //   36: aload_0
    //   37: getfield Z_ : Lburp/Zska;
    //   40: putfield ZO : Lburp/Zska;
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: putfield Z_ : Lburp/Zska;
    //   55: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/NullPointerException
    //   11	43	46	java/lang/NullPointerException
  }
  
  private void ZT(Zska paramZska1, Zska paramZska2) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: aload_0
    //   6: getfield Zv : Lburp/Zska;
    //   9: if_acmpeq -> 26
    //   12: aload_0
    //   13: invokevirtual Zo : ()Z
    //   16: ifeq -> 42
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   25: athrow
    //   26: aload_0
    //   27: aload_2
    //   28: invokevirtual Zp : (Lburp/Zska;)V
    //   31: aload_3
    //   32: ifnull -> 67
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   41: athrow
    //   42: aload_1
    //   43: getfield ZO : Lburp/Zska;
    //   46: aload_2
    //   47: putfield Zo : Lburp/Zska;
    //   50: aload_2
    //   51: aload_1
    //   52: putfield Zo : Lburp/Zska;
    //   55: aload_1
    //   56: aload_2
    //   57: putfield ZO : Lburp/Zska;
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   66: athrow
    //   67: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/NullPointerException
    //   12	35	38	java/lang/NullPointerException
    //   26	60	63	java/lang/NullPointerException
  }
  
  public void ZH(Zska paramZska) {
    try {
      if (paramZska != null)
        Zy(paramZska); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public void ZX(Zska paramZska) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 20
    //   8: new java/lang/NullPointerException
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: athrow
    //   16: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   19: athrow
    //   20: aload_0
    //   21: getfield Z_ : Lburp/Zska;
    //   24: ifnull -> 44
    //   27: aload_0
    //   28: getfield Z_ : Lburp/Zska;
    //   31: invokevirtual ZG : ()Z
    //   34: ifeq -> 60
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   43: athrow
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual Zy : (Lburp/Zska;)V
    //   49: aload_2
    //   50: ifnull -> 138
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   59: athrow
    //   60: aload_0
    //   61: getfield Zv : Lburp/Zska;
    //   64: ifnull -> 91
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Zv : Lburp/Zska;
    //   78: invokevirtual ZG : ()Z
    //   81: ifne -> 107
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   90: athrow
    //   91: aload_0
    //   92: aload_1
    //   93: invokevirtual Zp : (Lburp/Zska;)V
    //   96: aload_2
    //   97: ifnull -> 138
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   106: athrow
    //   107: aload_0
    //   108: getfield Zv : Lburp/Zska;
    //   111: astore_3
    //   112: aload_3
    //   113: ifnull -> 132
    //   116: aload_3
    //   117: invokevirtual ZG : ()Z
    //   120: ifeq -> 132
    //   123: aload_3
    //   124: getfield Zo : Lburp/Zska;
    //   127: astore_3
    //   128: aload_2
    //   129: ifnull -> 112
    //   132: aload_0
    //   133: aload_3
    //   134: aload_1
    //   135: invokevirtual ZT : (Lburp/Zska;Lburp/Zska;)V
    //   138: return
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/NullPointerException
    //   20	37	40	java/lang/NullPointerException
    //   27	53	56	java/lang/NullPointerException
    //   44	67	70	java/lang/NullPointerException
    //   60	84	87	java/lang/NullPointerException
    //   74	100	103	java/lang/NullPointerException
  }
  
  public Optional<Zska> Zs(Zska paramZska) {
    while (paramZska.Zo != null) {
      paramZska = paramZska.Zo;
      if (!paramZska.ZE())
        return Optional.of(paramZska); 
    } 
    return Optional.empty();
  }
  
  public Zska ZA() {
    return this.Z_;
  }
  
  public Zska Zs() {
    return this.Zv;
  }
  
  public boolean Zo() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.Zv == null);
  }
  
  public Zska ZQ() {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Zska zska = this.Z_;
    while (zska != null) {
      try {
        if (zska.ZG())
          try {
            if (!zska.ZE())
              try {
                if (!zska.ZD())
                  return zska; 
              } catch (NullPointerException nullPointerException) {
                throw a(null);
              }  
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          }  
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      zska = zska.ZO;
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  public Ze7g ZW(int paramInt) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zv : Lburp/Zska;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnull -> 102
    //   13: aload_3
    //   14: invokevirtual ZG : ()Z
    //   17: ifne -> 40
    //   20: new burp/Ze7g
    //   23: dup
    //   24: iconst_1
    //   25: anewarray burp/Zska
    //   28: dup
    //   29: iconst_0
    //   30: aload_3
    //   31: aastore
    //   32: invokespecial <init> : ([Lburp/Zska;)V
    //   35: areturn
    //   36: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   39: athrow
    //   40: aload_3
    //   41: iload_1
    //   42: invokevirtual Zc : (I)Z
    //   45: ifne -> 57
    //   48: aload_3
    //   49: getfield Zo : Lburp/Zska;
    //   52: astore_3
    //   53: aload_2
    //   54: ifnull -> 9
    //   57: aload_3
    //   58: astore #4
    //   60: aload_3
    //   61: invokevirtual ZJ : ()I
    //   64: iload_1
    //   65: if_icmpeq -> 75
    //   68: aload_3
    //   69: iload_1
    //   70: invokevirtual ZX : (I)Lburp/Zska;
    //   73: astore #4
    //   75: new burp/Ze7g
    //   78: dup
    //   79: aload_3
    //   80: getfield Zo : Lburp/Zska;
    //   83: aload_0
    //   84: getfield Z_ : Lburp/Zska;
    //   87: invokespecial <init> : (Lburp/Zska;Lburp/Zska;)V
    //   90: astore #5
    //   92: aload #5
    //   94: aload #4
    //   96: invokevirtual Zp : (Lburp/Zska;)V
    //   99: aload #5
    //   101: areturn
    //   102: new burp/Ze7g
    //   105: dup
    //   106: iconst_1
    //   107: anewarray burp/Zska
    //   110: dup
    //   111: iconst_0
    //   112: invokestatic ZK : ()Lburp/Zska;
    //   115: aastore
    //   116: invokespecial <init> : ([Lburp/Zska;)V
    //   119: areturn
    // Exception table:
    //   from	to	target	type
    //   13	36	36	java/lang/NullPointerException
  }
  
  public Iterator<Zska> iterator() {
    return new Zzp_(this.Zv);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(31057, -20205));
    Iterator<Zska> iterator = iterator();
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    while (iterator.hasNext()) {
      Zska zska = iterator.next();
      stringBuilder.append(a(31058, 6313)).append(zska.toString()).append(",");
      if (arrayOfZbqc != null)
        break; 
    } 
    stringBuilder.append(a(31059, 965));
    return stringBuilder.toString();
  }
  
  public Zska Zb() {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Zska zska = this.Z_;
    while (zska != null && !zska.ZG()) {
      zska = zska.ZO;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zska;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'T d}ç$\°b'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #121
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
    //   68: putstatic burp/Ze7g.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Ze7g.b : [Ljava/lang/String;
    //   78: goto -> 226
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
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #88
    //   154: goto -> 183
    //   157: bipush #57
    //   159: goto -> 183
    //   162: bipush #91
    //   164: goto -> 183
    //   167: bipush #64
    //   169: goto -> 183
    //   172: bipush #93
    //   174: goto -> 183
    //   177: iconst_3
    //   178: goto -> 183
    //   181: bipush #81
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
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
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7953) & 0xFFFF;
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
      char c = 'Ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */