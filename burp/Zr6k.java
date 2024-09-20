package burp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zr6k implements Runnable {
  private final Zt4u Zz;
  
  private final Zskh Zf;
  
  private final Zl04 Zm;
  
  private final Zez3[] ZT;
  
  private final List<Zez3> Zh;
  
  private final List<Zxkf> Zk;
  
  private final int ZR;
  
  private final Set<String> Zj;
  
  private static String Zu;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr6k(Zt4u paramZt4u, Zskh paramZskh, Zl04 paramZl04, Zez3[] paramArrayOfZez3, List<Zez3> paramList, List<Zxkf> paramList1, int paramInt, Set<String> paramSet) {
    this.Zz = paramZt4u;
    this.Zf = paramZskh;
    String str = Zw();
    this.Zm = paramZl04;
    this.ZT = paramArrayOfZez3;
    this.Zh = paramList;
    this.Zk = paramList1;
    this.ZR = paramInt;
    this.Zj = paramSet;
    if (str != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void run() {
    String str = Zw();
    File file = Zs6n.Zp(Zg1m.DATA, this.Zz, this.Zm, 1, a(20828, -25030));
    try {
      if (file == null)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);
      try {
        fileWriter.write(a(20803, 26951));
        fileWriter.write(a(20801, 3319) + a(20801, 3319) + (new Date()).toString());
      } catch (Exception exception) {
        throw a(null);
      } 
      boolean bool = (this.ZT.length == 1) ? true : false;
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      fileWriter.write(bool ? a(20815, -14238) : a(20823, 9692));
      fileWriter.write(a(20807, -3430));
      byte b = 0;
      while (b < this.ZT.length) {
        try {
          fileWriter.write(a(20831, 226));
          String str1 = this.ZT[b].ZlL().toString();
          ZN(fileWriter, str1, 0, str1.length());
          fileWriter.write(a(20824, 19431));
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        } 
        b++;
        if (str != null)
          break; 
      } 
      fileWriter.write(a(20800, 22686));
      fileWriter.write(a(20825, -20064));
      fileWriter.write(a(20822, -24426) + a(20822, -24426) + Integer.toString(this.Zk.size()));
      fileWriter.write(a(20810, -23201) + a(20810, -23201) + Integer.toString(this.Zh.size()));
      fileWriter.write(a(20829, 1674) + a(20829, 1674) + Integer.toString(this.ZR));
      fileWriter.write(a(20804, -8000) + a(20804, -8000) + Integer.toString(this.Zj.size()));
      fileWriter.write(a(20814, 30457));
      if (this.Zk.size() > 0) {
        fileWriter.write(a(20826, 7823));
        b = 0;
        while (b < this.Zk.size()) {
          try {
            Zxkf zxkf = this.Zk.get(b);
            fileWriter.write(a(20806, 10203));
            String str1 = zxkf.Zy.ZlL().toString();
            ZN(fileWriter, str1, 0, str1.length());
            fileWriter.write(a(20809, -16460));
            ArrayList<Comparable> arrayList = new ArrayList();
            arrayList.addAll(zxkf.ZE.keySet());
            Collections.sort(arrayList);
            for (String str2 : arrayList) {
              fileWriter.write(a(20806, 10203));
              ZN(fileWriter, str2, 0, str2.length());
              fileWriter.write("=");
              String str3 = ((Zt8g)zxkf.ZE.get(str2)).Zbn();
              ZN(fileWriter, str3, 0, str3.length());
              fileWriter.write(a(20802, 21249));
              if (str != null)
                break; 
            } 
            fileWriter.write(a(20814, 30457));
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          } 
          b++;
          if (str != null)
            break; 
        } 
        fileWriter.write(a(20814, 30457));
      } 
      if (this.Zh.size() > 0) {
        fileWriter.write(a(20808, 17128));
        b = 0;
        while (b < this.Zh.size()) {
          try {
            Zez3 zez3 = this.Zh.get(b);
            fileWriter.write(a(20806, 10203));
            String str1 = zez3.ZlL().toString();
            ZN(fileWriter, str1, 0, str1.length());
            fileWriter.write(a(20802, 21249));
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
          } 
          b++;
          if (str != null)
            break; 
        } 
        fileWriter.write(a(20814, 30457));
      } 
      if (this.Zj.size() > 0) {
        fileWriter.write(a(20827, 18424));
        Iterator<String> iterator = this.Zj.iterator();
        while (iterator.hasNext()) {
          try {
            fileWriter.write(a(20806, 10203));
            String str1 = iterator.next();
            ZN(fileWriter, str1, 0, str1.length());
            fileWriter.write(a(20802, 21249));
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.UNEXPECTED);
            if (str != null)
              break; 
          } 
        } 
        fileWriter.write(a(20814, 30457));
      } 
      fileWriter.write(a(20813, 8049));
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zmgc.ERROR_WRITING_TO_FILE.ZV(this.Zf, new Object[] { file.getAbsolutePath() });
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } finally {
      try {
        fileWriter.flush();
        fileWriter.close();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      } 
    } 
  }
  
  private static void ZN(FileWriter paramFileWriter, String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic Zw : ()Ljava/lang/String;
    //   3: astore #4
    //   5: iload_2
    //   6: iload_3
    //   7: if_icmpge -> 194
    //   10: aload_1
    //   11: iload_2
    //   12: invokevirtual charAt : (I)C
    //   15: istore #5
    //   17: bipush #60
    //   19: iload #5
    //   21: if_icmpne -> 49
    //   24: aload_0
    //   25: sipush #20812
    //   28: sipush #-24442
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual write : (Ljava/lang/String;)V
    //   37: aload #4
    //   39: ifnull -> 186
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: bipush #62
    //   51: iload #5
    //   53: if_icmpne -> 88
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: sipush #20830
    //   67: sipush #-18746
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: invokevirtual write : (Ljava/lang/String;)V
    //   76: aload #4
    //   78: ifnull -> 186
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: bipush #38
    //   90: iload #5
    //   92: if_icmpne -> 127
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: sipush #20811
    //   106: sipush #27830
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual write : (Ljava/lang/String;)V
    //   115: aload #4
    //   117: ifnull -> 186
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: iload #5
    //   129: bipush #32
    //   131: if_icmplt -> 155
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: iload #5
    //   143: bipush #127
    //   145: if_icmple -> 173
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: bipush #46
    //   158: invokevirtual write : (I)V
    //   161: aload #4
    //   163: ifnull -> 186
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: iload #5
    //   176: invokevirtual write : (I)V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: iinc #2, 1
    //   189: aload #4
    //   191: ifnull -> 5
    //   194: return
    // Exception table:
    //   from	to	target	type
    //   17	42	45	java/io/IOException
    //   24	56	59	java/io/IOException
    //   49	81	84	java/io/IOException
    //   63	95	98	java/io/IOException
    //   88	120	123	java/io/IOException
    //   102	134	137	java/io/IOException
    //   127	148	151	java/io/IOException
    //   141	166	169	java/io/IOException
    //   155	179	182	java/io/IOException
  }
  
  public static void Zn(String paramString) {
    Zu = paramString;
  }
  
  public static String Zw() {
    return Zu;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zn : (Ljava/lang/String;)V
    //   13: ldc 'Éet±[?·[ÍØY\\b\\nñ34uïb\\n^ÊÑ$NøæX"YØÊx"^ÝÚDF¡ùÍjRîeÛ}s\\bNõ¾ÝÞ\\tp%M~¨9Éj$hç«¡W\\r°àö©t`¯5@¼FQ\\n<ÊÏ¼hÏ¾k%&÷Ùè¢âIuêÅ ¢¥ÂK«ª²<>¸Q?Á.I<Ȣ2MÊÞG0´Æ}^êõ¼RN`ÅWnBPñ4KÐ$êPõIöd¹DêAioÏu¸­`®._ÿ-KÌVöoöï\\fµÜDCðSY³ÕÛ>X·å\ë¼â;ekìf3mDI.¯·§7ÝGêÿçM)ík\ÝTj~¡a3ÜÐ£$Lm0?ÑÍ<Z(L¯<$¬Ë^§MÄ 4WÎ&ÓÒ%IÚ@2IôU(/~%~¬råñ£ªxõÐüpåòrp×`n\ï°Rm È[¸Âèàðù7j-ñU%R§U¾12Ãd<EÜ¤Â M¯!KP#Á|Yâ}!4¸lÍ\\f%Ù¨M­·WÉisvÓò_c¾OYÎ¶Ët\\f\\b7\\f×æ·:DÑÑ"Þí^n7ëÚÓøë/ÓàÝ¨ic§³$Ä*8°(múJR×sÅ8s¡EÂJ-"-\\butKìÃu5YÉÑ:TÛ*æÊØJPB@CÂL.¥-\\rên-hïús½:ÍèëìmÖç àVûÀ(MÕmOïÛ½ù.QQz\\bt®õÓª%ô\\r¢ß =Ëò²â¦ä[hÜG \\råè ÁÝMçDÅùZk'Íjò¸^<Ì\\bÂm&sô^&ÜôâF¡z}nn'í,)LO³L'Ì\\b%uÄÈD[YN¬Ð9úÞ8àC=iûcÂ ð·Nï(íðv)<UQýU§-¼uéMÄÎ.tÿëä¸BÃ%V;öûl®nÃS}fÏ~aÆ¿Ï°·áÁ*¡\\bSIû?æÁ*ûbçãZ¯*Ub:èþj\\tG_¨#ßWpc¼êeõ1:êÎFø7¸óÔöz'(#j3 {ÔiÏJNôJ<u¸·=Þ`Ñb|(~¬µ\\n¸8Q!cq?áªpµë'¶QÃÞ\\fýè'/êöþ¢¹*ñX©Ç°$þ]K'£Æ ¦ÇÒ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #15
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #13
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '\U?ÖGñ°kg(ÇuççCÌ>-GÏfÈÊ#\\ny7Ä>\\nÛÌ`PgÍ»'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #16
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #33
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zr6k.a : [Ljava/lang/String;
    //   136: bipush #26
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zr6k.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #89
    //   218: goto -> 248
    //   221: bipush #7
    //   223: goto -> 248
    //   226: bipush #67
    //   228: goto -> 248
    //   231: bipush #10
    //   233: goto -> 248
    //   236: bipush #49
    //   238: goto -> 248
    //   241: bipush #124
    //   243: goto -> 248
    //   246: bipush #73
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x514F) & 0xFFFF;
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
      byte b1 = 17;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */