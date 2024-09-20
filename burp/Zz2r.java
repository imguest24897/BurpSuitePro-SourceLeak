package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;

class Zz2r {
  private Zstu ZB;
  
  private Zstu Zp;
  
  private Zlc8 Zh;
  
  private List<Ztsm> Za = new ArrayList<>();
  
  private Ztsm ZM;
  
  private TreeMap<Integer, Integer> ZF = new TreeMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zz2r(Zstu paramZstu1, Zstu paramZstu2, Zlc8 paramZlc8) {
    this.ZB = paramZstu1;
    this.Zp = paramZstu2;
    this.Zh = paramZlc8;
  }
  
  List<Ztsm> ZM() {
    ZA();
    if (!this.Zh.Zq(90.0F, a(17826, -22663)))
      return this.Za; 
    if (this.ZM != null)
      this.Za.add(this.ZM); 
    return this.Za;
  }
  
  private void ZA() {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zh : Lburp/Zlc8;
    //   8: fconst_0
    //   9: sipush #17826
    //   12: sipush #-22663
    //   15: invokestatic a : (II)Ljava/lang/String;
    //   18: invokeinterface Zq : (FLjava/lang/String;)Z
    //   23: ifne -> 27
    //   26: return
    //   27: aload_0
    //   28: invokevirtual ZH : ()[Ljava/lang/Integer;
    //   31: astore_2
    //   32: aload_0
    //   33: getfield Zh : Lburp/Zlc8;
    //   36: ldc 80.0
    //   38: sipush #17826
    //   41: sipush #-22663
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokeinterface Zq : (FLjava/lang/String;)Z
    //   52: ifne -> 56
    //   55: return
    //   56: aload_0
    //   57: getfield ZB : Lburp/Zstu;
    //   60: invokeinterface Zpu : ()I
    //   65: iconst_1
    //   66: isub
    //   67: istore_3
    //   68: aload_0
    //   69: getfield Zp : Lburp/Zstu;
    //   72: invokeinterface Zpu : ()I
    //   77: iconst_1
    //   78: isub
    //   79: istore #4
    //   81: iconst_0
    //   82: istore #5
    //   84: aload_2
    //   85: arraylength
    //   86: iconst_1
    //   87: isub
    //   88: istore #7
    //   90: iconst_0
    //   91: istore #6
    //   93: iload #6
    //   95: iload #7
    //   97: if_icmpgt -> 162
    //   100: aload_2
    //   101: iload #6
    //   103: aaload
    //   104: astore #8
    //   106: aload #8
    //   108: ifnonnull -> 123
    //   111: aload_0
    //   112: iload #6
    //   114: iload #5
    //   116: invokevirtual ZZ : (II)V
    //   119: iload_1
    //   120: ifne -> 155
    //   123: iload #5
    //   125: aload #8
    //   127: invokevirtual intValue : ()I
    //   130: if_icmpge -> 148
    //   133: aload_0
    //   134: iload #6
    //   136: iload #5
    //   138: iinc #5, 1
    //   141: invokevirtual ZR : (II)V
    //   144: iload_1
    //   145: ifne -> 123
    //   148: aload_0
    //   149: invokevirtual Zy : ()V
    //   152: iinc #5, 1
    //   155: iinc #6, 1
    //   158: iload_1
    //   159: ifne -> 93
    //   162: aload_0
    //   163: getfield Zh : Lburp/Zlc8;
    //   166: ldc 85.0
    //   168: sipush #17826
    //   171: sipush #-22663
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokeinterface Zq : (FLjava/lang/String;)Z
    //   182: ifne -> 186
    //   185: return
    //   186: iload #6
    //   188: iload_3
    //   189: if_icmple -> 199
    //   192: iload #5
    //   194: iload #4
    //   196: if_icmpgt -> 311
    //   199: iload #6
    //   201: iload_3
    //   202: iconst_1
    //   203: iadd
    //   204: if_icmpne -> 214
    //   207: iload #5
    //   209: iload #4
    //   211: if_icmple -> 236
    //   214: iload #5
    //   216: iload #4
    //   218: if_icmpgt -> 236
    //   221: aload_0
    //   222: iload #6
    //   224: iload #5
    //   226: iinc #5, 1
    //   229: invokevirtual ZR : (II)V
    //   232: iload_1
    //   233: ifne -> 214
    //   236: iload #5
    //   238: iload #4
    //   240: iconst_1
    //   241: iadd
    //   242: if_icmpne -> 251
    //   245: iload #6
    //   247: iload_3
    //   248: if_icmple -> 272
    //   251: iload #6
    //   253: iload_3
    //   254: if_icmpgt -> 272
    //   257: aload_0
    //   258: iload #6
    //   260: iinc #6, 1
    //   263: iload #5
    //   265: invokevirtual ZZ : (II)V
    //   268: iload_1
    //   269: ifne -> 251
    //   272: iload #6
    //   274: iload_3
    //   275: if_icmpgt -> 289
    //   278: aload_0
    //   279: iload #6
    //   281: iinc #6, 1
    //   284: iload #5
    //   286: invokevirtual ZZ : (II)V
    //   289: iload #5
    //   291: iload #4
    //   293: if_icmpgt -> 186
    //   296: aload_0
    //   297: iload #6
    //   299: iload #5
    //   301: iinc #5, 1
    //   304: invokevirtual ZR : (II)V
    //   307: iload_1
    //   308: ifne -> 186
    //   311: return
  }
  
  private void ZZ(int paramInt1, int paramInt2) {
    int i = Zrtd.Zj();
    if (this.ZM == null) {
      this.ZM = new Ztsm((byte)1, paramInt1, paramInt1 + 1, paramInt2, -1);
      if (i != 0) {
        this.ZM.ZT(paramInt1 + 1);
        return;
      } 
      return;
    } 
    this.ZM.ZT(paramInt1 + 1);
  }
  
  private void ZR(int paramInt1, int paramInt2) {
    int i = Zrtd.ZH();
    if (this.ZM == null) {
      this.ZM = new Ztsm((byte)2, paramInt1, -1, paramInt2, paramInt2 + 1);
      if (i == 0) {
        this.ZM.Zj(paramInt2 + 1);
        return;
      } 
      return;
    } 
    this.ZM.Zj(paramInt2 + 1);
  }
  
  private void Zy() {
    if (this.ZM != null) {
      this.Za.add(this.ZM);
      this.ZM = null;
    } 
  }
  
  private Integer[] ZH() {
    byte b1 = 0;
    int j = this.ZB.Zpu() - 1;
    byte b2 = 0;
    int k = this.Zp.Zpu() - 1;
    int i = Zrtd.Zj();
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    while (b1 <= j && b2 <= k && this.ZB.Zp(b1) == this.Zp.Zp(b2)) {
      treeMap.put(Integer.valueOf(b1++), Integer.valueOf(b2++));
      if (i != 0)
        break; 
    } 
    while (b1 <= j && b2 <= k && this.ZB.Zp(j) == this.Zp.Zp(k)) {
      treeMap.put(Integer.valueOf(j--), Integer.valueOf(k--));
      if (i != 0)
        break; 
    } 
    ArrayList[] arrayOfArrayList = new ArrayList[256];
    byte b3 = b2;
    while (b3 <= k) {
      int n = 0xFF & this.Zp.Zp(b3);
      ArrayList<Integer> arrayList = arrayOfArrayList[n];
      if (arrayList == null) {
        arrayList = new ArrayList();
        arrayOfArrayList[n] = arrayList;
      } 
      arrayList.add(Integer.valueOf(b3));
      b3++;
      if (i != 0)
        break; 
    } 
    HashMap<Object, Object> hashMap = new HashMap<>();
    float f = 80.0F / j;
    int m = Math.max(100, Math.min(500, j / 10));
    byte b4 = b1;
    while (b4 <= j) {
      if (b4 % m == 1 && !this.Zh.Zq((int)(f * b4), a(17827, -19652)))
        return null; 
      ArrayList arrayList = arrayOfArrayList[0xFF & this.ZB.Zp(b4)];
      if (arrayList != null) {
        Integer integer = Integer.valueOf(0);
        ListIterator<Integer> listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
          Integer integer1 = listIterator.previous();
          integer = Zx(integer1, integer);
          if (integer != null) {
            V v = (integer.intValue() > 0) ? (V)hashMap.get(Integer.valueOf(integer.intValue() - 1)) : null;
            hashMap.put(integer, new Object[] { v, Integer.valueOf(b4), integer1 });
          } 
          if (i != 0)
            break; 
        } 
      } 
      b4++;
      if (i != 0)
        break; 
    } 
    if (this.ZF.size() > 0) {
      Integer integer = this.ZF.lastKey();
      Object[] arrayOfObject = (Object[])hashMap.get(integer);
      while (arrayOfObject != null) {
        Integer integer1 = (Integer)arrayOfObject[1];
        Integer integer2 = (Integer)arrayOfObject[2];
        treeMap.put(integer1, integer2);
        arrayOfObject = (Object[])arrayOfObject[0];
        if (i != 0)
          break; 
      } 
    } 
    return Ze((TreeMap)treeMap);
  }
  
  protected static Integer[] Ze(TreeMap<Integer, Integer> paramTreeMap) {
    int i = Zrtd.Zj();
    boolean bool = (paramTreeMap.size() == 0) ? false : (1 + ((Integer)paramTreeMap.lastKey()).intValue());
    Integer[] arrayOfInteger = new Integer[bool];
    for (Integer integer1 : paramTreeMap.keySet()) {
      Integer integer2 = paramTreeMap.get(integer1);
      arrayOfInteger[integer1.intValue()] = integer2;
      if (i != 0)
        break; 
    } 
    return arrayOfInteger;
  }
  
  private boolean ZO(Integer paramInteger) {
    return (paramInteger != null && paramInteger.intValue() != 0);
  }
  
  private boolean ZA(Integer paramInteger1, Integer paramInteger2) {
    Integer integer = this.ZF.get(paramInteger1);
    return (integer != null && paramInteger2 != null && integer.compareTo(paramInteger2) > 0);
  }
  
  private boolean Zj(Integer paramInteger1, Integer paramInteger2) {
    Integer integer = this.ZF.get(paramInteger1);
    return (integer != null && (paramInteger2 == null || integer.compareTo(paramInteger2) < 0));
  }
  
  private Integer ZQ() {
    return this.ZF.get(this.ZF.lastKey());
  }
  
  protected void Ze(Integer paramInteger) {
    Integer integer = null;
    if (this.ZF.size() == 0) {
      integer = Integer.valueOf(0);
    } else {
      Integer integer1 = this.ZF.lastKey();
      integer = Integer.valueOf(integer1.intValue() + 1);
    } 
    this.ZF.put(integer, paramInteger);
  }
  
  protected Integer Zx(Integer paramInteger1, Integer paramInteger2) {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: aload_2
    //   6: invokevirtual ZO : (Ljava/lang/Integer;)Z
    //   9: ifeq -> 52
    //   12: aload_0
    //   13: aload_2
    //   14: aload_1
    //   15: invokevirtual ZA : (Ljava/lang/Integer;Ljava/lang/Integer;)Z
    //   18: ifeq -> 52
    //   21: aload_0
    //   22: aload_2
    //   23: invokevirtual intValue : ()I
    //   26: iconst_1
    //   27: isub
    //   28: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   31: aload_1
    //   32: invokevirtual Zj : (Ljava/lang/Integer;Ljava/lang/Integer;)Z
    //   35: ifeq -> 52
    //   38: aload_0
    //   39: getfield ZF : Ljava/util/TreeMap;
    //   42: aload_2
    //   43: aload_1
    //   44: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: pop
    //   48: iload_3
    //   49: ifne -> 228
    //   52: iconst_m1
    //   53: istore #4
    //   55: aload_0
    //   56: aload_2
    //   57: invokevirtual ZO : (Ljava/lang/Integer;)Z
    //   60: ifeq -> 73
    //   63: aload_2
    //   64: invokevirtual intValue : ()I
    //   67: istore #4
    //   69: iload_3
    //   70: ifne -> 98
    //   73: aload_0
    //   74: getfield ZF : Ljava/util/TreeMap;
    //   77: invokevirtual size : ()I
    //   80: ifle -> 98
    //   83: aload_0
    //   84: getfield ZF : Ljava/util/TreeMap;
    //   87: invokevirtual lastKey : ()Ljava/lang/Object;
    //   90: checkcast java/lang/Integer
    //   93: invokevirtual intValue : ()I
    //   96: istore #4
    //   98: iload #4
    //   100: iconst_m1
    //   101: if_icmpeq -> 115
    //   104: aload_1
    //   105: aload_0
    //   106: invokevirtual ZQ : ()Ljava/lang/Integer;
    //   109: invokevirtual compareTo : (Ljava/lang/Integer;)I
    //   112: ifle -> 132
    //   115: aload_0
    //   116: aload_1
    //   117: invokevirtual Ze : (Ljava/lang/Integer;)V
    //   120: iload #4
    //   122: iconst_1
    //   123: iadd
    //   124: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   127: astore_2
    //   128: iload_3
    //   129: ifne -> 228
    //   132: iconst_0
    //   133: istore #5
    //   135: iload #5
    //   137: iload #4
    //   139: if_icmpgt -> 208
    //   142: iload #4
    //   144: iload #5
    //   146: iadd
    //   147: iconst_2
    //   148: idiv
    //   149: istore #6
    //   151: aload_0
    //   152: getfield ZF : Ljava/util/TreeMap;
    //   155: iload #6
    //   157: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   160: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   163: checkcast java/lang/Integer
    //   166: astore #7
    //   168: aload_1
    //   169: aload #7
    //   171: invokevirtual compareTo : (Ljava/lang/Integer;)I
    //   174: istore #8
    //   176: iload #8
    //   178: ifne -> 183
    //   181: aconst_null
    //   182: areturn
    //   183: iload #8
    //   185: ifle -> 198
    //   188: iload #6
    //   190: iconst_1
    //   191: iadd
    //   192: istore #5
    //   194: iload_3
    //   195: ifne -> 204
    //   198: iload #6
    //   200: iconst_1
    //   201: isub
    //   202: istore #4
    //   204: iload_3
    //   205: ifne -> 135
    //   208: aload_0
    //   209: getfield ZF : Ljava/util/TreeMap;
    //   212: iload #5
    //   214: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   217: aload_1
    //   218: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   221: pop
    //   222: iload #5
    //   224: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   227: astore_2
    //   228: aload_2
    //   229: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ëëG´ÔràÄaÕ÷!W¾ï%iÐFM«®ÁîuqÉ£î/'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #21
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #68
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
    //   69: putstatic burp/Zz2r.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zz2r.b : [Ljava/lang/String;
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
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #60
    //   154: goto -> 183
    //   157: bipush #123
    //   159: goto -> 183
    //   162: bipush #102
    //   164: goto -> 183
    //   167: bipush #88
    //   169: goto -> 183
    //   172: bipush #48
    //   174: goto -> 183
    //   177: iconst_4
    //   178: goto -> 183
    //   181: bipush #68
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
    int i = (paramInt1 ^ 0x45A3) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */