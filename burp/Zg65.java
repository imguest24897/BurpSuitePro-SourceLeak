package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zrmq;
import net.portswigger.Zrxz;
import net.portswigger.Ztu;
import net.portswigger.Zuh;
import net.portswigger.Zvy;

class Zg65 {
  private Zb25 ZO;
  
  private int Zj;
  
  private Zrmq Zg;
  
  private long Zc = -1L;
  
  private String ZS = "";
  
  private String Zz;
  
  private String Ze;
  
  private int ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zer0 Zx(Zrmq paramZrmq) {
    int i = Zlp9.Zr();
    try {
      Zs(paramZrmq);
    } catch (Zrr zrr) {
      Zah.Zl(zrr, Zk_.UNEXPECTED);
      return null;
    } 
    try {
      if (!Zrxz.Zu(this.Zj))
        return null; 
    } catch (Zrr zrr) {
      throw a(null);
    } 
    try {
      if (this.ZO != null) {
        try {
          if (this.Zg != null) {
            try {
              if (!this.Zg.ZK()) {
                try {
                  if (this.Zz != null) {
                    try {
                      if (this.Ze != null) {
                        try {
                          if (this.Zc != -1L) {
                            try {
                              if (this.ZT >= 0) {
                                try {
                                  if (this.ZT > 65535)
                                    return null; 
                                } catch (Zrr zrr) {
                                  throw a(null);
                                } 
                              } else {
                                return null;
                              } 
                            } catch (Zrr zrr) {
                              throw a(null);
                            } 
                          } else {
                            return null;
                          } 
                        } catch (Zrr zrr) {
                          throw a(null);
                        } 
                      } else {
                        return null;
                      } 
                    } catch (Zrr zrr) {
                      throw a(null);
                    } 
                  } else {
                    return null;
                  } 
                } catch (Zrr zrr) {
                  throw a(null);
                } 
              } else {
                return null;
              } 
            } catch (Zrr zrr) {
              throw a(null);
            } 
          } else {
            return null;
          } 
        } catch (Zrr zrr) {
          throw a(null);
        } 
      } else {
        return null;
      } 
    } catch (Zrr zrr) {
      throw a(null);
    } 
    try {
      ArrayList<byte[]> arrayList;
      Zrmq zrmq;
      switch (Zgqm.ZU[this.ZO.ordinal()]) {
        case 1:
        case 2:
          try {
            if (!Zz())
              return null; 
          } catch (Zrr zrr) {
            throw a(null);
          } 
          return new Zxyt(this.ZO, this.Zj, this.Zz, this.ZS, Ztu.Zx(Zkb.Zy(this.Zg.Zo(a(15025, 1276)).ZW())), Ztu.Zx(Zkb.Zy(this.Zg.Zo(a(15028, -23609)).ZW())), this.Zc, this.Ze, this.ZT);
        case 3:
        case 4:
          try {
            if (!Zy())
              return null; 
          } catch (Zrr zrr) {
            throw a(null);
          } 
          arrayList = new ArrayList();
          zrmq = this.Zg.Zo(a(15024, -1441));
          for (Zrmq zrmq3 : zrmq.ZO()) {
            arrayList.add(Ztu.Zx(zrmq3.ZW().getBytes()));
            if (i != 0)
              break; 
          } 
          return new Zxyy(this.ZO, this.Zj, this.Zz, this.ZS, Ztu.Zx(this.Zg.Zo(a(15036, 18087)).ZW().getBytes()), (List<byte[]>)arrayList, Ztu.Zx(this.Zg.Zo(a(15027, -18244)).ZW().getBytes()), Ztu.Zx(this.Zg.Zo(a(15030, 27935)).ZW().getBytes()), this.Zc, this.Ze, this.ZT);
        default:
          Zuh.ZT(false, Zqf.Zk, this.ZO.toString());
          break;
        case 5:
          break;
      } 
    } catch (Zrr zrr) {
      throw a(null);
    } 
    Zrmq zrmq1 = this.Zg.Zo(a(15035, 4085));
    Zrmq zrmq2 = this.Zg.Zo(a(15029, -22654));
    try {
      if (!zrmq1.ZK())
        try {
          if (!zrmq2.ZK()) {
            byte[] arrayOfByte = Zvy.Zt(Zkb.Zy(zrmq1.ZW()));
            return new Zxyr(this.Zj, this.ZS, this.Zz, this.Zg.Zo(a(15012, -15885)).ZW(), zrmq2.Zk().intValue(), arrayOfByte, this.Zc, this.Ze, this.ZT);
          } 
          return null;
        } catch (Zrr zrr) {
          throw a(null);
        }  
    } catch (Zrr zrr) {
      throw a(null);
    } 
    return null;
  }
  
  private boolean Zz() {
    try {
      if (this.Zg.Zo(a(15033, 224)).Zr())
        try {
          if (this.Zg.Zo(a(15038, -15149)).Zr());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Zy() {
    try {
      if (this.Zg.Zo(a(15031, 20170)).Zw())
        try {
          if (!this.Zg.Zo(a(15037, 2309)).ZK())
            try {
              if (!this.Zg.Zo(a(15026, -6625)).ZK())
                try {
                  if (!this.Zg.Zo(a(15032, -28034)).ZK());
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                }  
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
  
  private void Zs(Zrmq paramZrmq) throws Zrr {
    int i = Zlp9.ZT();
    if (paramZrmq.Za())
      for (Map.Entry entry : paramZrmq.ZX()) {
        try {
          if (((Zrmq)entry.getValue()).Zr())
            ZQ((String)entry.getKey(), ((Zrmq)entry.getValue()).ZW()); 
        } catch (Zrr zrr) {
          throw a(null);
        } 
        try {
          if (((String)entry.getKey()).equals(a(15039, 12990)))
            try {
              if (((Zrmq)entry.getValue()).Za())
                this.Zg = (Zrmq)entry.getValue(); 
            } catch (Zrr zrr) {
              throw a(null);
            }  
        } catch (Zrr zrr) {
          throw a(null);
        } 
        if (i == 0)
          break; 
      }  
  }
  
  private void ZQ(String paramString1, String paramString2) throws Zrr {
    // Byte code:
    //   0: invokestatic Zr : ()I
    //   3: istore_3
    //   4: sipush #15011
    //   7: sipush #-15100
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: aload_1
    //   14: invokevirtual equals : (Ljava/lang/Object;)Z
    //   17: ifeq -> 60
    //   20: aload_0
    //   21: aload_2
    //   22: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   25: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   28: invokestatic ZL : (Ljava/lang/String;)Lburp/Zb25;
    //   31: putfield ZO : Lburp/Zb25;
    //   34: aload_0
    //   35: getfield ZO : Lburp/Zb25;
    //   38: ifnonnull -> 313
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: new burp/Zrr
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: athrow
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: sipush #15013
    //   63: sipush #-5674
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: aload_1
    //   70: invokevirtual equals : (Ljava/lang/Object;)Z
    //   73: ifeq -> 109
    //   76: aload_0
    //   77: aload_2
    //   78: invokestatic parseInt : (Ljava/lang/String;)I
    //   81: putfield Zj : I
    //   84: goto -> 313
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: astore #4
    //   93: aload #4
    //   95: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   98: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   101: new burp/Zrr
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: athrow
    //   109: sipush #15008
    //   112: sipush #18692
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: aload_1
    //   119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   122: ifeq -> 141
    //   125: aload_0
    //   126: aload_2
    //   127: putfield Zz : Ljava/lang/String;
    //   130: iload_3
    //   131: ifeq -> 313
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: sipush #15014
    //   144: sipush #13814
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: aload_1
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: ifeq -> 180
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_0
    //   165: aload_2
    //   166: putfield ZS : Ljava/lang/String;
    //   169: iload_3
    //   170: ifeq -> 313
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: sipush #15010
    //   183: sipush #-29420
    //   186: invokestatic a : (II)Ljava/lang/String;
    //   189: aload_1
    //   190: invokevirtual equals : (Ljava/lang/Object;)Z
    //   193: ifeq -> 236
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload_0
    //   204: aload_2
    //   205: invokestatic parseInt : (Ljava/lang/String;)I
    //   208: putfield ZT : I
    //   211: goto -> 313
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: astore #4
    //   220: aload #4
    //   222: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   225: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   228: new burp/Zrr
    //   231: dup
    //   232: invokespecial <init> : ()V
    //   235: athrow
    //   236: sipush #15034
    //   239: sipush #-27105
    //   242: invokestatic a : (II)Ljava/lang/String;
    //   245: aload_1
    //   246: invokevirtual equals : (Ljava/lang/Object;)Z
    //   249: ifeq -> 285
    //   252: aload_0
    //   253: aload_2
    //   254: invokestatic parseLong : (Ljava/lang/String;)J
    //   257: putfield Zc : J
    //   260: goto -> 313
    //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   266: athrow
    //   267: astore #4
    //   269: aload #4
    //   271: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   274: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   277: new burp/Zrr
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: athrow
    //   285: sipush #15009
    //   288: sipush #-10270
    //   291: invokestatic a : (II)Ljava/lang/String;
    //   294: aload_1
    //   295: invokevirtual equals : (Ljava/lang/Object;)Z
    //   298: ifeq -> 313
    //   301: aload_0
    //   302: aload_2
    //   303: putfield Ze : Ljava/lang/String;
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   312: athrow
    //   313: return
    // Exception table:
    //   from	to	target	type
    //   4	41	44	java/lang/NumberFormatException
    //   20	56	56	java/lang/NumberFormatException
    //   60	87	87	burp/Zrr
    //   76	84	91	java/lang/NumberFormatException
    //   109	134	137	java/lang/NumberFormatException
    //   125	157	160	java/lang/NumberFormatException
    //   141	173	176	java/lang/NumberFormatException
    //   164	196	199	java/lang/NumberFormatException
    //   180	214	214	burp/Zrr
    //   203	211	218	java/lang/NumberFormatException
    //   236	263	263	burp/Zrr
    //   252	260	267	java/lang/NumberFormatException
    //   285	306	309	java/lang/NumberFormatException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'cÂò³jÍ5µ·Å÷4).¸Øu\\tÜðuQ&<õrP\\bÊ×@-1JQr\\fÐQ~OÕæb9²\\nßaeçAää~\\fÃÞØDOwóá¦Ù*\\bNTGX\\b.PQ9Dm\\nnºG#8Ìoù£²åù{¼ÝQï<õÉ#$<MÀR¥»m¾R¼Ãò;¼Vr(®rÜö\\nËµZË¦\\býoQá\\t}dxñ}='
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #83
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
    //   68: ldc 'ÚYÛ\\fS\\nÌ­Ä Úfòÿ=ý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #39
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
    //   129: putstatic burp/Zg65.a : [Ljava/lang/String;
    //   132: bipush #23
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg65.b : [Ljava/lang/String;
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
    //   212: bipush #38
    //   214: goto -> 244
    //   217: bipush #11
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #51
    //   229: goto -> 244
    //   232: bipush #44
    //   234: goto -> 244
    //   237: bipush #106
    //   239: goto -> 244
    //   242: bipush #28
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
    int i = (paramInt1 ^ 0x3AB0) & 0xFFFF;
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
      char c = 'Þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg65.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */