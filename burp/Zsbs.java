package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsbs implements Zt8e {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkqp ZX(String paramString) {
    try {
      if (Ze(paramString))
        return new Zkqp((byte)1, (byte)2); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return null;
  }
  
  private boolean Ze(String paramString) {
    boolean bool = Zzjp.ZI();
    int i = 0;
    while (i < paramString.length()) {
      int j;
      switch (paramString.charAt(i)) {
        case 'i':
          j = Ze(paramString, i);
          try {
            if (j != -1) {
              try {
                if (!Zc(paramString.substring(i, j)))
                  return false; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              break;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        case 'N':
          j = Ze(paramString, i);
          try {
            if (j != -1) {
              try {
                if (!ZO(paramString.substring(i, j)))
                  return false; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              break;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        case 'b':
          j = Ze(paramString, i);
          try {
            if (j != -1) {
              try {
                if (!ZR(paramString.substring(i, j)))
                  return false; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              break;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        case 's':
          j = Zd(paramString, i);
          try {
            if (j != -1) {
              try {
                if (!ZD(paramString.substring(i, j)))
                  return false; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              break;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        case 'a':
          j = Zf(paramString, i);
          try {
            if (j != -1) {
              try {
                if (!Zd(paramString.substring(i, j)))
                  return false; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              break;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        case 'O':
          j = Zf(paramString, i);
          try {
            if (j != -1) {
              try {
                if (!Zz(paramString.substring(i, j)))
                  return false; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
              break;
            } 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return false;
        default:
          return false;
      } 
      i = j;
      if (bool)
        break; 
    } 
    return true;
  }
  
  private boolean ZO(String paramString) {
    return a(-8988, -22246).equals(paramString);
  }
  
  private boolean Zc(String paramString) {
    if (paramString.length() > 3)
      try {
        Integer.parseInt(ZZ(paramString));
        return true;
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.IGNORED);
      }  
    return false;
  }
  
  private boolean ZR(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual length : ()I
    //   4: iconst_4
    //   5: if_icmpne -> 56
    //   8: ldc '1'
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   15: invokevirtual equals : (Ljava/lang/Object;)Z
    //   18: ifne -> 48
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   27: athrow
    //   28: ldc '0'
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual ZZ : (Ljava/lang/String;)Ljava/lang/String;
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   47: athrow
    //   48: iconst_1
    //   49: goto -> 57
    //   52: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   55: athrow
    //   56: iconst_0
    //   57: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	21	24	java/lang/NumberFormatException
    //   8	41	44	java/lang/NumberFormatException
    //   28	52	52	java/lang/NumberFormatException
  }
  
  private boolean ZD(String paramString) {
    int i;
    try {
      if (paramString.length() < 7)
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    int j = paramString.indexOf(":", 2);
    try {
      i = Integer.parseInt(paramString.substring(2, j));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return false;
    } 
    String str = paramString.substring(j + 1, paramString.length() - 1);
    try {
      if (!ZE(str))
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (i + 2 == str.length());
  }
  
  private boolean ZE(String paramString) {
    try {
      if (paramString.length() >= 2)
        try {
          if (paramString.startsWith("\""))
            try {
              if (paramString.endsWith("\""));
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zd(String paramString) {
    try {
      if (paramString.length() >= 5)
        try {
          if (paramString.matches(a(-8991, 1324))) {
            try {
              Integer.parseInt(paramString.substring(2, paramString.indexOf(":", 2)));
            } catch (NumberFormatException numberFormatException) {
              Zah.Zl(numberFormatException, Zk_.IGNORED);
              return false;
            } 
            return Ze(paramString.substring(paramString.indexOf("{") + 1, paramString.length() - 1));
          } 
          return false;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zz(String paramString) {
    try {
      if (paramString.length() >= 11)
        try {
          if (paramString.matches(a(-8986, 24690))) {
            int i = paramString.indexOf("\"", paramString.indexOf("\"") + 1) + 2;
            try {
              if (i == -1)
                return false; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            try {
              if (!ZD(paramString.substring(0, i)))
                return false; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return Ze(a(-8989, -26990) + a(-8989, -26990));
          } 
          return false;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private int Zf(String paramString, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: invokestatic Zg : ()Z
    //   6: aload_1
    //   7: ldc '{'
    //   9: iload_2
    //   10: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   13: iconst_1
    //   14: iadd
    //   15: istore #5
    //   17: istore_3
    //   18: iload #5
    //   20: iconst_m1
    //   21: if_icmpne -> 30
    //   24: iconst_m1
    //   25: ireturn
    //   26: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   29: athrow
    //   30: iload #5
    //   32: aload_1
    //   33: invokevirtual length : ()I
    //   36: if_icmpge -> 248
    //   39: aload_1
    //   40: invokevirtual length : ()I
    //   43: iload #5
    //   45: sipush #-8990
    //   48: sipush #1536
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: invokevirtual length : ()I
    //   57: iadd
    //   58: if_icmplt -> 139
    //   61: sipush #-8982
    //   64: sipush #28117
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: aload_1
    //   71: iload #5
    //   73: iload #5
    //   75: sipush #-8982
    //   78: sipush #28117
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokevirtual length : ()I
    //   87: iadd
    //   88: invokevirtual substring : (II)Ljava/lang/String;
    //   91: invokevirtual equals : (Ljava/lang/Object;)Z
    //   94: ifeq -> 139
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   103: athrow
    //   104: aload_0
    //   105: aload_1
    //   106: iload #5
    //   108: invokevirtual substring : (I)Ljava/lang/String;
    //   111: iconst_0
    //   112: invokevirtual Zd : (Ljava/lang/String;I)I
    //   115: istore #6
    //   117: iload #6
    //   119: ifgt -> 128
    //   122: iconst_m1
    //   123: ireturn
    //   124: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   127: athrow
    //   128: iload #5
    //   130: iload #6
    //   132: iadd
    //   133: istore #5
    //   135: iload_3
    //   136: ifne -> 30
    //   139: aload_1
    //   140: iload #5
    //   142: invokevirtual charAt : (I)C
    //   145: bipush #34
    //   147: if_icmpne -> 174
    //   150: aload_1
    //   151: ldc '"'
    //   153: iload #5
    //   155: iconst_1
    //   156: iadd
    //   157: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   160: istore #5
    //   162: iload #5
    //   164: iconst_m1
    //   165: if_icmpne -> 241
    //   168: iconst_m1
    //   169: ireturn
    //   170: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   173: athrow
    //   174: aload_1
    //   175: iload #5
    //   177: invokevirtual charAt : (I)C
    //   180: bipush #125
    //   182: if_icmpne -> 213
    //   185: iload #4
    //   187: ifne -> 206
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   196: athrow
    //   197: iload #5
    //   199: iconst_1
    //   200: iadd
    //   201: ireturn
    //   202: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   205: athrow
    //   206: iinc #4, -1
    //   209: iload_3
    //   210: ifne -> 241
    //   213: aload_1
    //   214: iload #5
    //   216: invokevirtual charAt : (I)C
    //   219: bipush #123
    //   221: if_icmpne -> 241
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   230: athrow
    //   231: iinc #4, 1
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   240: athrow
    //   241: iinc #5, 1
    //   244: iload_3
    //   245: ifne -> 30
    //   248: iconst_m1
    //   249: ireturn
    // Exception table:
    //   from	to	target	type
    //   18	26	26	java/lang/NumberFormatException
    //   39	97	100	java/lang/NumberFormatException
    //   117	124	124	java/lang/NumberFormatException
    //   162	170	170	java/lang/NumberFormatException
    //   174	190	193	java/lang/NumberFormatException
    //   185	202	202	java/lang/NumberFormatException
    //   206	224	227	java/lang/NumberFormatException
    //   213	234	237	java/lang/NumberFormatException
  }
  
  private int Ze(String paramString, int paramInt) {
    int i = paramString.indexOf(';', paramInt);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (i == -1) ? -1 : (i + 1);
  }
  
  private int Zd(String paramString, int paramInt) {
    try {
      if (paramString.length() >= paramInt)
        try {
          if (paramString.substring(paramInt).matches(a(-8992, 3389))) {
            try {
              String str = paramString.substring(paramInt + a(-8982, 28117).length(), paramString.indexOf(":", paramInt + a(-8982, 28117).length() + 1));
              int i = 1;
              if (0 != Integer.parseInt(str))
                i = str.length(); 
              int j = 6 + i + Integer.parseInt(str);
              try {
                if (j <= paramString.length() && a(-8985, -4374).equals(paramString.substring(paramInt + j - a(-8987, 22996).length(), paramInt + j)))
                  return paramInt + j; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              } 
            } catch (NumberFormatException numberFormatException) {
              Zah.Zl(numberFormatException, Zk_.IGNORED);
            } 
            return -1;
          } 
          return -1;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return -1;
  }
  
  private String ZZ(String paramString) {
    return paramString.substring(2, paramString.length() - 1);
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '59O]sx¥Î£Eõ\\f½-ÁnùÚ?,K)GrÐ§\°¹ÒÇáEg£Q´.éÇf2ÂTqÙÄ²H§i.¨7i;''
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #9
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
    //   67: ldc 'LX¶'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #73
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
    //   127: putstatic burp/Zsbs.a : [Ljava/lang/String;
    //   130: bipush #9
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsbs.b : [Ljava/lang/String;
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
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #52
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #124
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #98
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
    int i = (paramInt1 ^ 0xFFFFDCE2) & 0xFFFF;
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
      char c = 'ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsbs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */