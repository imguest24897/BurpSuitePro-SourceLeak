package net.portswigger;

class Zmc implements Zak {
  private int ZR;
  
  private final StringBuilder Zj = new StringBuilder(a(-7803, 31964));
  
  private final Ztj ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmc(Ztj paramZtj) {
    this.ZZ = paramZtj;
  }
  
  public void ZJ(Zkr paramZkr) {
    String str = Ziv.Zw();
    if (paramZkr.Zm)
      return; 
    this.Zj.append('"').append(Zv3.Zj(paramZkr.ZI)).append('"').append(a(-7801, 8759)).append('"').append(a(-7795, -11511)).append('"').append(":").append('"').append(a(-7805, 18894)).append('"');
    if (paramZkr.ZF.length > 0) {
      this.Zj.append(',');
      this.Zj.append('"').append(a(-7800, -8810)).append(a(-7806, -27058)).append(Zv3.Zj(paramZkr.ZQ)).append('"');
      this.Zj.append(',');
      this.Zj.append('"').append(a(-7796, -20746)).append('"').append(a(-7791, 21642));
      byte b1 = 0;
      Class<?>[] arrayOfClass = paramZkr.ZF;
      int i = arrayOfClass.length;
      byte b2 = 0;
      while (b2 < i) {
        Class<?> clazz = arrayOfClass[b2];
        Zrmx zrmx = (Zrmx)this.ZZ.Zk(clazz);
        if (!zrmx.ZF || str == null) {
          b1++;
          this.Zj.append('"').append(Zv3.Zj(zrmx.Za())).append('"').append(',');
        } 
        b2++;
        if (str == null)
          break; 
      } 
      if (b1 > 0)
        this.Zj.setLength(this.Zj.length() - 1); 
      this.Zj.append(']');
      this.ZR++;
    } 
    this.Zj.append(a(-7798, -7710));
  }
  
  public void ZT(Zrmx paramZrmx) {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: getfield ZF : Z
    //   8: ifeq -> 12
    //   11: return
    //   12: aload_1
    //   13: invokevirtual Zo : ()Ljava/lang/reflect/Type;
    //   16: checkcast java/lang/Class
    //   19: astore_3
    //   20: aload_3
    //   21: invokevirtual isEnum : ()Z
    //   24: istore #4
    //   26: aload_1
    //   27: getfield ZP : Ljava/util/List;
    //   30: invokeinterface isEmpty : ()Z
    //   35: ifeq -> 39
    //   38: return
    //   39: aload_0
    //   40: dup
    //   41: getfield ZR : I
    //   44: iconst_1
    //   45: iadd
    //   46: putfield ZR : I
    //   49: aload_0
    //   50: getfield Zj : Ljava/lang/StringBuilder;
    //   53: bipush #34
    //   55: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   58: aload_1
    //   59: getfield Zk : Ljava/lang/String;
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: bipush #34
    //   67: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   70: sipush #-7790
    //   73: sipush #31396
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: bipush #34
    //   84: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   87: sipush #-7802
    //   90: sipush #27125
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: bipush #34
    //   101: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   104: ldc ':'
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: bipush #34
    //   111: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   114: iload #4
    //   116: ifeq -> 131
    //   119: sipush #-7793
    //   122: sipush #20158
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: goto -> 140
    //   131: sipush #-7804
    //   134: sipush #26109
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: bipush #34
    //   145: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   148: bipush #44
    //   150: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: iload #4
    //   156: ifeq -> 401
    //   159: aload_0
    //   160: getfield Zj : Ljava/lang/StringBuilder;
    //   163: bipush #34
    //   165: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   168: sipush #-7799
    //   171: sipush #31079
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: bipush #34
    //   182: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   185: sipush #-7794
    //   188: sipush #9543
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload_1
    //   199: getfield ZP : Ljava/util/List;
    //   202: invokeinterface iterator : ()Ljava/util/Iterator;
    //   207: astore #5
    //   209: aload #5
    //   211: invokeinterface hasNext : ()Z
    //   216: ifeq -> 371
    //   219: aload #5
    //   221: invokeinterface next : ()Ljava/lang/Object;
    //   226: checkcast net/portswigger/Zmx
    //   229: astore #6
    //   231: aload_0
    //   232: getfield Zj : Ljava/lang/StringBuilder;
    //   235: bipush #123
    //   237: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   240: bipush #34
    //   242: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   245: sipush #-7807
    //   248: sipush #27642
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: bipush #34
    //   259: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   262: bipush #58
    //   264: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   267: bipush #34
    //   269: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   272: aload #6
    //   274: getfield ZV : Ljava/lang/String;
    //   277: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: bipush #34
    //   282: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload #6
    //   288: getfield Za : Ljava/lang/String;
    //   291: ifnull -> 352
    //   294: aload_0
    //   295: getfield Zj : Ljava/lang/StringBuilder;
    //   298: bipush #44
    //   300: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   303: bipush #34
    //   305: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   308: sipush #-7789
    //   311: sipush #-4175
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: bipush #34
    //   322: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   325: bipush #58
    //   327: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   330: bipush #34
    //   332: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   335: aload #6
    //   337: getfield Za : Ljava/lang/String;
    //   340: invokestatic Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: bipush #34
    //   348: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   351: pop
    //   352: aload_0
    //   353: getfield Zj : Ljava/lang/StringBuilder;
    //   356: bipush #125
    //   358: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   361: bipush #44
    //   363: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   366: pop
    //   367: aload_2
    //   368: ifnonnull -> 209
    //   371: aload_0
    //   372: getfield Zj : Ljava/lang/StringBuilder;
    //   375: aload_0
    //   376: getfield Zj : Ljava/lang/StringBuilder;
    //   379: invokevirtual length : ()I
    //   382: iconst_1
    //   383: isub
    //   384: invokevirtual setLength : (I)V
    //   387: aload_0
    //   388: getfield Zj : Ljava/lang/StringBuilder;
    //   391: bipush #93
    //   393: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload_2
    //   398: ifnonnull -> 593
    //   401: aload_0
    //   402: getfield Zj : Ljava/lang/StringBuilder;
    //   405: bipush #34
    //   407: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   410: sipush #-7797
    //   413: sipush #-23941
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: bipush #34
    //   424: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   427: sipush #-7791
    //   430: sipush #21642
    //   433: invokestatic a : (II)Ljava/lang/String;
    //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: pop
    //   440: aload_1
    //   441: getfield ZP : Ljava/util/List;
    //   444: invokeinterface iterator : ()Ljava/util/Iterator;
    //   449: astore #5
    //   451: aload #5
    //   453: invokeinterface hasNext : ()Z
    //   458: ifeq -> 567
    //   461: aload #5
    //   463: invokeinterface next : ()Ljava/lang/Object;
    //   468: checkcast net/portswigger/Zmx
    //   471: astore #6
    //   473: aload_1
    //   474: getfield Zc : Lnet/portswigger/Znu;
    //   477: getfield ZW : Lnet/portswigger/Zrx_;
    //   480: aload #6
    //   482: getfield ZV : Ljava/lang/String;
    //   485: invokevirtual ZW : (Ljava/lang/String;)Lnet/portswigger/Zm7;
    //   488: getfield ZH : Z
    //   491: ifeq -> 498
    //   494: aload_2
    //   495: ifnonnull -> 451
    //   498: aload_0
    //   499: getfield ZZ : Lnet/portswigger/Ztj;
    //   502: aload_0
    //   503: getfield Zj : Ljava/lang/StringBuilder;
    //   506: aload #6
    //   508: getfield ZV : Ljava/lang/String;
    //   511: aload #6
    //   513: getfield Ze : Ljava/lang/reflect/Type;
    //   516: aload #6
    //   518: getfield Za : Ljava/lang/String;
    //   521: aload_1
    //   522: getfield Zc : Lnet/portswigger/Znu;
    //   525: ifnonnull -> 532
    //   528: aconst_null
    //   529: goto -> 550
    //   532: aload_1
    //   533: getfield Zc : Lnet/portswigger/Znu;
    //   536: getfield ZW : Lnet/portswigger/Zrx_;
    //   539: aload #6
    //   541: getfield ZV : Ljava/lang/String;
    //   544: invokevirtual ZW : (Ljava/lang/String;)Lnet/portswigger/Zm7;
    //   547: getfield ZN : Ljava/lang/String;
    //   550: invokestatic ZD : (Lnet/portswigger/Ztj;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/String;)V
    //   553: aload_0
    //   554: getfield Zj : Ljava/lang/StringBuilder;
    //   557: bipush #44
    //   559: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   562: pop
    //   563: aload_2
    //   564: ifnonnull -> 451
    //   567: aload_0
    //   568: getfield Zj : Ljava/lang/StringBuilder;
    //   571: aload_0
    //   572: getfield Zj : Ljava/lang/StringBuilder;
    //   575: invokevirtual length : ()I
    //   578: iconst_1
    //   579: isub
    //   580: invokevirtual setLength : (I)V
    //   583: aload_0
    //   584: getfield Zj : Ljava/lang/StringBuilder;
    //   587: bipush #93
    //   589: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   592: pop
    //   593: aload_0
    //   594: getfield Zj : Ljava/lang/StringBuilder;
    //   597: sipush #-7792
    //   600: sipush #220
    //   603: invokestatic a : (II)Ljava/lang/String;
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: pop
    //   610: return
  }
  
  public String toString() {
    if (this.ZR > 0)
      this.Zj.setLength(this.Zj.length() - 1); 
    return this.Zj.append(a(-7808, -31171)).toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ',õÇq2G?¯ÕGñÅ}¿1ì¼xo1³Ö+yu¡£f/ÅÛ7õO"%2]?îÐ¢a¹ÝFeÉ):èÐÜ\\rÁÄ÷ÓÕ\\fºð°~\\fþ3:Ýcç²ÿÖYº·è2aÐ|U[ÚÜ,'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #31
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
    //   68: ldc 'Ö"4B'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #94
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
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/Zmc.a : [Ljava/lang/String;
    //   131: bipush #20
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zmc.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #60
    //   214: goto -> 244
    //   217: bipush #127
    //   219: goto -> 244
    //   222: bipush #47
    //   224: goto -> 244
    //   227: bipush #35
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #105
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE183) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmc.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */