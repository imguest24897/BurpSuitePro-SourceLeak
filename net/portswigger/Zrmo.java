package net.portswigger;

class Zrmo {
  private final Zlg Zi = new Zlg(30);
  
  private final char[] Zo;
  
  private final char[] Zj;
  
  private Zk2 ZM = null;
  
  private final Zk2 ZB = new Zk2(0, 1, 1);
  
  private final Zk2 Zw = new Zk2(0, 1, 1);
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrmo(char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    this.Zo = paramArrayOfchar1;
    this.Zj = paramArrayOfchar2;
  }
  
  public char ZY() {
    try {
      if (this.Zw.Zb >= this.Zo.length)
        Zt(); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return this.Zo[this.Zw.Zb];
  }
  
  public Zrmo Zx() {
    return ZY(this.Zj);
  }
  
  public Zrmo ZY(char[] paramArrayOfchar) {
    while (!Ze()) {
      char c = ZY();
      for (char c1 : paramArrayOfchar) {
        try {
          if (c == c1) {
            ZX();
            continue;
          } 
        } catch (Zlh zlh) {
          throw a(null);
        } 
      } 
    } 
    return this;
  }
  
  public boolean Ze() {
    try {
    
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return (this.Zw.Zb == this.Zo.length);
  }
  
  public Zrmo ZX() {
    this.ZB.Zb = this.Zw.Zb;
    this.ZB.Za = this.Zw.Za;
    this.ZB.Zt = this.Zw.Zt;
    char c = ZY();
    try {
      this.Zi.Zv(c);
      switch (c) {
        case '\n':
          this.Zw.Zt++;
          this.Zw.Za = 1;
          this.Zw.Zb++;
          return this;
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    this.Zw.Za++;
    this.Zw.Zb++;
    return this;
  }
  
  public Zrmo Zf() {
    try {
      if (this.ZM != null) {
        this.ZM.Zb = this.Zw.Zb;
        this.ZM.Za = this.Zw.Za;
        this.ZM.Zt = this.Zw.Zt;
      } else {
        this.ZM = ZR();
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return this;
  }
  
  private Zk2 ZR() {
    return new Zk2(this.Zw.Zb, this.Zw.Zt, this.Zw.Za);
  }
  
  public void Zt() {
    Zy(null);
  }
  
  public void Zy(String paramString) {
    Zt(ZR(), paramString);
  }
  
  public void Zd() {
    Zt(this.ZM, null);
  }
  
  public void Zn(String paramString) {
    Zt(this.ZM, paramString);
  }
  
  private void Zt(Zk2 paramZk2, String paramString) {
    Zk2 zk2 = ZR();
    try {
    
    } catch (Zlh zlh) {
      throw a(null);
    } 
    Zii zii = new Zii(paramZk2, (Ze() && this.ZB.Zb >= paramZk2.Zb) ? this.ZB : zk2);
    throw new Zlh(String.format(a(28043, 12370), new Object[] { ZC(this.Zo, zii) }), zii, paramString, Zi(zii));
  }
  
  private Zmu Zi(Zii paramZii) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Ze : ()Z
    //   4: ifeq -> 39
    //   7: aload_1
    //   8: getfield ZD : Lnet/portswigger/Zk2;
    //   11: getfield Zb : I
    //   14: aload_1
    //   15: getfield ZP : Lnet/portswigger/Zk2;
    //   18: getfield Zb : I
    //   21: if_icmpne -> 39
    //   24: goto -> 31
    //   27: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   30: athrow
    //   31: iconst_0
    //   32: goto -> 66
    //   35: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   38: athrow
    //   39: aload_1
    //   40: getfield ZD : Lnet/portswigger/Zk2;
    //   43: getfield Zb : I
    //   46: aload_1
    //   47: getfield ZP : Lnet/portswigger/Zk2;
    //   50: getfield Zb : I
    //   53: isub
    //   54: iconst_1
    //   55: iadd
    //   56: aload_0
    //   57: getfield Zi : Lnet/portswigger/Zlg;
    //   60: invokevirtual ZC : ()I
    //   63: invokestatic min : (II)I
    //   66: newarray char
    //   68: astore_2
    //   69: new java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore_3
    //   77: aload_2
    //   78: arraylength
    //   79: istore #4
    //   81: iload #4
    //   83: ifle -> 278
    //   86: aload_0
    //   87: invokevirtual Ze : ()Z
    //   90: ifne -> 193
    //   93: goto -> 100
    //   96: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Zw : Lnet/portswigger/Zk2;
    //   104: getfield Zb : I
    //   107: aload_1
    //   108: getfield ZD : Lnet/portswigger/Zk2;
    //   111: getfield Zb : I
    //   114: if_icmpne -> 150
    //   117: goto -> 124
    //   120: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   123: athrow
    //   124: aload_2
    //   125: iinc #4, -1
    //   128: iload #4
    //   130: aload_0
    //   131: getfield Zo : [C
    //   134: aload_0
    //   135: getfield Zw : Lnet/portswigger/Zk2;
    //   138: getfield Zb : I
    //   141: caload
    //   142: castore
    //   143: goto -> 150
    //   146: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   149: athrow
    //   150: aload_0
    //   151: getfield Zw : Lnet/portswigger/Zk2;
    //   154: getfield Zb : I
    //   157: aload_1
    //   158: getfield ZD : Lnet/portswigger/Zk2;
    //   161: getfield Zb : I
    //   164: iconst_1
    //   165: iadd
    //   166: if_icmpne -> 193
    //   169: aload_3
    //   170: aload_0
    //   171: getfield Zo : [C
    //   174: aload_0
    //   175: getfield Zw : Lnet/portswigger/Zk2;
    //   178: getfield Zb : I
    //   181: caload
    //   182: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: goto -> 193
    //   189: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   192: athrow
    //   193: aload_0
    //   194: getfield Zw : Lnet/portswigger/Zk2;
    //   197: getfield Zb : I
    //   200: iconst_1
    //   201: isub
    //   202: istore #5
    //   204: iload #5
    //   206: aload_1
    //   207: getfield ZP : Lnet/portswigger/Zk2;
    //   210: getfield Zb : I
    //   213: if_icmplt -> 278
    //   216: iload #4
    //   218: ifle -> 278
    //   221: goto -> 228
    //   224: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   227: athrow
    //   228: aload_0
    //   229: getfield Zi : Lnet/portswigger/Zlg;
    //   232: invokevirtual Zx : ()C
    //   235: istore #6
    //   237: iload #5
    //   239: aload_1
    //   240: getfield ZD : Lnet/portswigger/Zk2;
    //   243: getfield Zb : I
    //   246: if_icmpgt -> 265
    //   249: aload_2
    //   250: iinc #4, -1
    //   253: iload #4
    //   255: iload #6
    //   257: castore
    //   258: goto -> 272
    //   261: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   264: athrow
    //   265: aload_3
    //   266: iload #6
    //   268: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   271: pop
    //   272: iinc #5, -1
    //   275: goto -> 204
    //   278: new java/lang/String
    //   281: dup
    //   282: aload_0
    //   283: getfield Zi : Lnet/portswigger/Zlg;
    //   286: invokevirtual ZU : ()[C
    //   289: invokespecial <init> : ([C)V
    //   292: astore #5
    //   294: aload_0
    //   295: invokevirtual Ze : ()Z
    //   298: ifne -> 313
    //   301: aload_0
    //   302: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   305: pop
    //   306: goto -> 313
    //   309: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   312: athrow
    //   313: aload_0
    //   314: getfield Zw : Lnet/portswigger/Zk2;
    //   317: getfield Zb : I
    //   320: bipush #10
    //   322: iadd
    //   323: istore #6
    //   325: aload_0
    //   326: invokevirtual Ze : ()Z
    //   329: ifne -> 372
    //   332: aload_0
    //   333: getfield Zw : Lnet/portswigger/Zk2;
    //   336: getfield Zb : I
    //   339: iload #6
    //   341: if_icmpge -> 372
    //   344: goto -> 351
    //   347: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   350: athrow
    //   351: aload_3
    //   352: aload_0
    //   353: invokevirtual ZY : ()C
    //   356: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   359: pop
    //   360: aload_0
    //   361: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   364: pop
    //   365: goto -> 325
    //   368: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   371: athrow
    //   372: new net/portswigger/Zmu
    //   375: dup
    //   376: aload #5
    //   378: new java/lang/String
    //   381: dup
    //   382: aload_2
    //   383: invokespecial <init> : ([C)V
    //   386: aload_3
    //   387: invokevirtual toString : ()Ljava/lang/String;
    //   390: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   393: areturn
    // Exception table:
    //   from	to	target	type
    //   0	24	27	net/portswigger/Zlh
    //   7	35	35	net/portswigger/Zlh
    //   81	93	96	net/portswigger/Zlh
    //   86	117	120	net/portswigger/Zlh
    //   100	143	146	net/portswigger/Zlh
    //   150	186	189	net/portswigger/Zlh
    //   204	221	224	net/portswigger/Zlh
    //   237	261	261	net/portswigger/Zlh
    //   294	306	309	net/portswigger/Zlh
    //   325	344	347	net/portswigger/Zlh
    //   332	368	368	net/portswigger/Zlh
  }
  
  private static String ZC(char[] paramArrayOfchar, Zii paramZii) {
    try {
      if (paramZii.ZP.Zb < paramArrayOfchar.length)
        try {
          if (paramZii.ZD.Zb <= paramArrayOfchar.length) {
            char[] arrayOfChar = new char[Math.min(30, Math.min(paramZii.ZD.Zb - paramZii.ZP.Zb + 1, paramArrayOfchar.length))];
            try {
              System.arraycopy(paramArrayOfchar, paramZii.ZP.Zb, arrayOfChar, 0, arrayOfChar.length);
            } catch (Zlh zlh) {
              throw a(null);
            } 
            byte b = (paramZii.ZD.Zb - paramZii.ZP.Zb == 0) ? 39 : 34;
            return String.format(a(28044, -26276), new Object[] { Character.valueOf(b), ZT(arrayOfChar), Character.valueOf(b) });
          } 
          return a(28041, 7594);
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return a(28041, 7594);
  }
  
  private static String ZT(char[] paramArrayOfchar) {
    StringBuilder stringBuilder = new StringBuilder();
    for (char c : paramArrayOfchar) {
      try {
        if (c >= ' ')
          try {
            if (c <= '~') {
              stringBuilder.append(c);
              continue;
            } 
          } catch (Zlh zlh) {
            throw a(null);
          }  
      } catch (Zlh zlh) {
        throw a(null);
      } 
      try {
        if (c == '\n') {
          stringBuilder.append(a(28040, -5701));
        } else {
          try {
            if (c == '\r') {
              stringBuilder.append(a(28046, -13038));
            } else {
              try {
                if (c == '\f') {
                  stringBuilder.append(a(28045, 27555));
                } else {
                  try {
                    if (c == '\b') {
                      stringBuilder.append(a(28037, 12082));
                    } else {
                      try {
                        if (c == '\t') {
                          stringBuilder.append(a(28047, -3062));
                        } else {
                          stringBuilder.append('[').append(String.format(a(28042, 15717), new Object[] { Integer.valueOf(c) })).append(']');
                        } 
                      } catch (Zlh zlh) {
                        throw a(null);
                      } 
                    } 
                  } catch (Zlh zlh) {
                    throw a(null);
                  } 
                } 
              } catch (Zlh zlh) {
                throw a(null);
              } 
            } 
          } catch (Zlh zlh) {
            throw a(null);
          } 
        } 
      } catch (Zlh zlh) {
        throw a(null);
      } 
      continue;
    } 
    return stringBuilder.toString();
  }
  
  public Zrmo ZR(char paramChar) {
    return Zl(ZR(), paramChar);
  }
  
  public Zrmo ZU(char paramChar) {
    return Zl(this.ZM, paramChar);
  }
  
  public Zrmo Zl(Zk2 paramZk2, char paramChar) {
    Zii zii = new Zii(paramZk2, paramZk2);
    try {
      if (paramZk2.Zb < this.Zo.length)
        try {
          if (this.Zo[paramZk2.Zb] == paramChar)
            return this; 
          throw new Zlh(String.format(a(28036, -14362), new Object[] { Character.valueOf(paramChar), ZC(this.Zo, zii) }), zii, null, Zi(zii));
        } catch (Zlh zlh) {
          throw a(null);
        }  
    } catch (Zlh zlh) {
      throw a(null);
    } 
    throw new Zlh(String.format(a(28036, -14362), new Object[] { Character.valueOf(paramChar), ZC(this.Zo, zii) }), zii, null, Zi(zii));
  }
  
  public Zrmo ZY(String paramString) {
    try {
      if (!Za0.Za(ZY()))
        Zn(paramString); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    return this;
  }
  
  private static Zlh a(Zlh paramZlh) {
    return paramZlh;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼lÒËUsc&Eòi^«\\r¨$:@¨´è£gÄtßCg¦m'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #30
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'ÔÍj~Fª¿6§æ,°èé]Ø*\¸Æî'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #63
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/Zrmo.a : [Ljava/lang/String;
    //   130: bipush #10
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zrmo.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #95
    //   224: goto -> 244
    //   227: bipush #35
    //   229: goto -> 244
    //   232: bipush #75
    //   234: goto -> 244
    //   237: bipush #118
    //   239: goto -> 244
    //   242: bipush #9
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6D8D) & 0xFFFF;
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */