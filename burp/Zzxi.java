package burp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzxi {
  public static final Zzxi Zi;
  
  private final String[] Zl;
  
  private Zs0a ZF;
  
  private String ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzxi(List<String> paramList) {
    this(paramList.<String>toArray(new String[0]));
  }
  
  public Zzxi(String[] paramArrayOfString) {
    Zmkz zmkz = (new Zmkz()).ZU(new Zlss(a(743, 23049), a(646, -11507))).ZU(new Zlss(a(698, -23285), a(659, -12911))).ZU(new Zlsi(new Zlss(a(645, 20752), a(643, 28797)))).ZU(new Zlsi(new Zlss(a(694, -10198), a(738, 11663)))).ZU(new Zls3(a(697, 28981), a(641, -19467), a(656, -28821))).ZU(new Zls3(a(670, 19684), a(683, 14293), a(685, 10395))).ZU(new Zls3(a(668, -14253), a(741, 19535), a(661, -3256))).ZU(new Zlss(a(701, 29220), a(742, 6392))).ZU(new Zlsu(a(664, 26949), a(675, -6506))).ZU(new Zlsu(a(658, -10821), a(695, 21427))).ZU(new Zlsu(a(740, -9611), a(684, 25512))).ZU(new Zlsu(a(671, 32334), a(739, -19919))).ZU(new Zls1(a(653, 14454), a(647, -8023))).ZU(new Zls1(a(691, 8457), a(693, 13517))).ZU(new Zlss(a(651, 16364), a(737, -11385))).ZU(new Zlss(a(674, 22077), a(746, -16998))).ZU(new Zlss(a(666, -26898), a(654, 30582))).ZU(new Zlsi(new Zlss(a(660, -28646), a(665, -14008)))).ZU(new Zlsi(new Zlss(a(690, 11100), a(669, -6512)))).ZU(new Zlsi(new Zlsu(a(747, -7762), a(689, 16154)))).ZU(new Zlsi(new Zlsu(a(682, 7771), a(696, 27250)))).ZU(new Zlsi(new Zlss(a(686, 32149), a(681, -23197))));
    Zbp0 zbp0 = zmkz.Zk();
    this.Zl = paramArrayOfString;
    try {
      this.ZF = zbp0.Zm(paramArrayOfString);
    } catch (Zl00 zl00) {
      Zah.Zl(zl00, Zk_.USER_ERROR);
      System.err.println(zl00.getMessage());
      System.err.println(zbp0.Zi());
      System.exit(-1);
    } 
    try {
      if (this.ZF.Zs(a(687, 23406))) {
        System.out.println(zbp0.Zi());
        System.exit(0);
      } 
    } catch (Zl00 zl00) {
      throw a(null);
    } 
    if (this.ZF.Zs(a(648, 4201))) {
      boolean bool = Zmja.ZL();
      try {
        (new Object[3])[0] = Zgkt.ZQ();
        (new Object[3])[1] = a(657, 10243);
      } catch (Zl00 zl00) {
        throw a(null);
      } 
      System.out.printf(a(688, -24232), new Object[] { null, null, bool ? a(699, 18282) : "" });
      System.exit(0);
    } 
    try {
      if (this.ZF.Zs(a(700, 26685))) {
        System.out.println(8);
        System.exit(0);
      } 
    } catch (Zl00 zl00) {
      throw a(null);
    } 
    if (this.ZF.Zs(a(663, -23272))) {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(a(649, -10469))));
      System.out.println(bufferedReader.lines().collect(Collectors.joining("\n")));
      System.exit(0);
    } 
    if (this.ZF.Zs(a(652, -13292)))
      try {
        String str = this.ZF.ZO(a(652, -13292));
        File file = new File(str);
        try {
          if (file.exists())
            try {
              if (!file.canWrite())
                throw new RuntimeException(a(679, 3486) + a(679, 3486)); 
            } catch (Zl00 zl00) {
              throw a(null);
            }  
        } catch (Zl00 zl00) {
          throw a(null);
        } 
        try {
          if (file.exists())
            try {
              if (!file.isDirectory())
                throw new RuntimeException(str + str); 
            } catch (Zl00 zl00) {
              throw a(null);
            }  
        } catch (Zl00 zl00) {
          throw a(null);
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.USER_ERROR);
        System.err.println(exception.getMessage());
        System.err.println(zbp0.Zi());
        System.exit(-1);
      }  
    Zq();
    for (String str : this.ZF.Ze) {
      System.out.println(Zmgc.UNRECOGNISED_CLI_ARG.ZB(new Object[] { str }));
    } 
  }
  
  private void Zq() {
    if (!this.ZF.Zs(a(662, 870)))
      for (String str : this.ZF.ZL) {
        try {
          DataInputStream dataInputStream = new DataInputStream(new FileInputStream(str));
          try {
            int i = dataInputStream.readInt();
            dataInputStream.readInt();
            int j = dataInputStream.readInt();
            try {
              if (i == 1720025728)
                try {
                  if (j == -2142078604)
                    this.ZC = str; 
                } catch (Throwable throwable) {
                  throw a(null);
                }  
            } catch (Throwable throwable) {
              throw a(null);
            } 
            dataInputStream.close();
          } catch (Throwable throwable) {
            try {
              dataInputStream.close();
            } catch (Throwable throwable1) {
              throwable.addSuppressed(throwable1);
            } 
            throw throwable;
          } 
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.IGNORED);
        } 
      }  
  }
  
  public boolean Zl() {
    return this.ZF.Zs(a(677, 25613));
  }
  
  public String ZX() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.ZF.Zs(a(672, -3926)) ? this.ZF.ZO(a(672, -3926)) : null;
  }
  
  public boolean ZR() {
    return this.ZF.Zs(a(683, 14293));
  }
  
  public boolean ZU() {
    return this.ZF.Zs(a(736, 5730));
  }
  
  public boolean Zu() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !this.ZF.Zs(a(667, -25417));
  }
  
  public List<String> ZL() {
    return this.ZF.Zz(a(650, -25341));
  }
  
  public List<String> ZA() {
    return this.ZF.Zz(a(644, -19769));
  }
  
  public String[] Z_() {
    return Arrays.<String>copyOf(this.Zl, this.Zl.length);
  }
  
  public String[] Zt() {
    return this.ZF.ZL.<String>toArray(new String[0]);
  }
  
  public boolean ZJ() {
    try {
      if (!this.ZF.Zs(a(662, 870))) {
        try {
          if (this.ZC != null);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String Zw() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.ZF.Zs(a(662, 870)) ? this.ZF.ZO(a(662, 870)) : this.ZC;
  }
  
  public File Ze() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.ZF.Zs(a(652, -13292)) ? new File(this.ZF.ZO(a(652, -13292))) : null;
  }
  
  public boolean ZZ() {
    try {
      if (this.ZF.Zs(a(662, 870)))
        try {
          if (this.ZF.Zs(a(680, 16747)));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean ZG() {
    return this.ZF.Zs(a(676, -31653));
  }
  
  public boolean Za() {
    return this.ZF.Zs(a(703, 10278));
  }
  
  public boolean ZN() {
    return this.ZF.Zs(a(692, 21228));
  }
  
  public boolean Zm() {
    return this.ZF.Zs(a(673, 30627));
  }
  
  public String ZB() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.ZF.Zs(a(655, 16085)) ? this.ZF.ZO(a(655, 16085)) : null;
  }
  
  public Zra1 ZM() {
    return Zra1.ZV(this.ZF.ZO(a(702, 22101)));
  }
  
  public boolean ZW() {
    return this.ZF.Zs(a(678, 16713));
  }
  
  public List<String> ZQ() {
    return this.ZF.Ze;
  }
  
  public String ZO() {
    return this.ZF.ZO(a(642, -16052));
  }
  
  static {
    // Byte code:
    //   0: bipush #74
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÞZ<{.Ý®%ÉC¥Îñ6f£çà{4R!òf\\tèÌ4øþ)Xõ²b£QRY±× óØ)]¬­à|qÊNÐDgIAWø^ãéçjõçÒÁå»R*NÂNÒ ÂëB-Öcýå\FVJx8C´²,·F¦p]Ç¥9\\bÿÂvÇÉÃi"ð÷d~^,ÖÍî»]ÝÆý±¹Pþ´üõI8, ïÝ~w¥;F¾uXµ§n7Dy¡q;¯Ô/O@Ë.{6ÃûÇüÂÆß_5ðte\\bÃÒvp6ûW¸È\\r8·a2µRU¤V+øgíj¸J}!vX¿¼Îí&lï&Îõ[§¼TÌàcqïÜ\\fÍï¶k;¢åÍbUc´!$°(±Ó°ÿ33±-;*à¡ò4Öùã Ç>Â_VÓH¥B÷vq¾ÈN4@a«Ûû~È¾R\\rÔÕZv8¸âK5Ý5QÑS7Ï9¾c>aaÖ y^`ñ­óUëØwÔQbZÅõÅ¬à\\rTsy¹Í­O^Á°î(Áoã(PâQÜqOm+«2¦à%Ø äZô=Ä}xÂÅ\\f86zü¾\\rSb:ôÎW×Ê³¾F~½×Zj¤ß{]Ò²­·\\t¨@¿êóe\\rùFa4Qìì·´lä9à\\fwBðßÛÉ¹?r÷ça­\\r~ÅOÑÌ#à'­zÁBØÉiàñNLô°3hìÙ.oÄúÈÃgÖåe·ÂX¬®J»°©yçg¯@U@ú'>wt¯|¨¸ f úKÄê¬c3på:2 âb|DùµQ3ø!Tôé}g5Í×}4-ñºLñWÿ×+\\nX,{øÐôì.ìRÁ$7\\f,ø«ÄLá@;ðSIÎpgS×Ø¶¡§´K\\f\\b¼ÄêhÔãNöåµ¥åìØ{ì\\r­¯àâÙ\\n£àOÝ¿þ´ öëPç<¬Ñ\\rq00Uý[ënlûÑwLÓçÑç|è2ÖE\\fb æfåyÛ¸%2JþUrPÇÿ¯ÂúÙìQöæªm?³p³,¾ÄW8¸ª»Tü¶ÿxµ`Æ½oNÒïæ ýe\\rØPcqZV«ïô $°©ßAwÂç)£Ç%{yF<ñèò´Å$20¬h>ÒÒÎ÷oß\\rÛf\\t'bötÐU¿Xdùz `eúZ^2ºGÒæÄ¨õ6Í°\JâýoÁ²g±(Ù¾ÀH *ª¥ÁuÜ ;O\\röË²Ç½Ú½®ùÇ¡ÞËÌK-]%ìTjm\\bÂßfiC¤âwÏ7¸nhô5y)n³¹Ã2+ò*|¢Q«¡½¾Ý?»â5±åôºÉ&Ù¤ÊPøpàO\! ?¸õÃÒ¢£¾þ¢¼åfÞc¯¹*Ýp\\b½xÖl¾Î®æ*Sî¾s¦ùQSnáX\\bùÌlL«£¯l<ê'79hàq,z@¨\\f'Ð}Ö]'.þý-îTiPäÉMu#ü\\b»P#ÔQ^×RÃÂaÉÉ8A|\\bcóKûóBl\\bÿ«ØtÅ»|¬VvßÿÈíJà\\f]ÕÉ-DËý(sÚê<øMMÕYÄÚ;W¼<cþ¶~ùXüe:"#z¨:|Cëë\\f¨Bß¤ÉV?Hç\\f´n<¶iµÈØ1cÔ\#y:¸°KH¦eN.PD¨i?á înýÅÉWó89\\b4åüæ¤U\\rÏe7{M ½$¿òÊ0ò³¹þ¨rÔßF×õÚ¶-ëËÖbX.ÀîTl« ÔrKMîz¤ù½¹¦V·ÐqRô»®n"¶Ä`'Ô'{eTüy®¡¯´'Éýø^:JóçþCé"\\n·HVÓy¬.¼Ö®µ¸Ú\\bi²et¶%©crï8ø¦wq¸¦þúÌlÇ§Énu~t×A\\n¬Åè1Ô(­C°<³ûíWf%àý.\\rÇuþ§QÅÀÿBÂ 06Ç7á\\r~?\\tã³_Ð¡«ShÖãÜ°qù( ¦üÁ!-e×£öòÊøVìÃì'¾Z&a¿¼}ÊhHÆ(HÉàÜbççTrD_í3l<Û}JÏ~áu\\t¾.ýémpFiTóØÜ!Øu÷í\\fJW£«NÂ\>ÿ+Nni~ÍKÊ¼¿þCìÑ·Ol>èg@>\\b=ìJsüaÚ¯;vÝl©Ç÷Ûðâ¯´/CG3îïÒ\\fÇúýB¹Èøu,+vû|ë¢ðÆ__¡k«jN:¬Æ+²Cl%NQ½ \\fK9l:)¶½¹5¬\\fùaW\²M8B/'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #79
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
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
    //   68: ldc '|=ÃÝ¥Ç}Ú25$4&Dôõ7:e\\t¯Ù®Ä¼Hôm(RNuÇÏâÁWE<<,çâ@¸ì×l[öw=++Àn»ÐsoázàI"P±ö'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
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
    //   129: putstatic burp/Zzxi.a : [Ljava/lang/String;
    //   132: bipush #74
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzxi.b : [Ljava/lang/String;
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
    //   212: bipush #83
    //   214: goto -> 244
    //   217: bipush #36
    //   219: goto -> 244
    //   222: bipush #12
    //   224: goto -> 244
    //   227: bipush #116
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #79
    //   239: goto -> 244
    //   242: bipush #82
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
    //   300: new burp/Zzxi
    //   303: dup
    //   304: iconst_0
    //   305: anewarray java/lang/String
    //   308: invokespecial <init> : ([Ljava/lang/String;)V
    //   311: putstatic burp/Zzxi.Zi : Lburp/Zzxi;
    //   314: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2A3) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzxi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */