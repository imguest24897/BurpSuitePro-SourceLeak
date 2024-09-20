package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ztzo {
  private static final Pattern ZE;
  
  private static final Zzrd[][] ZX;
  
  private final Zbnt Zq;
  
  private boolean[][] ZT;
  
  public Ztzo(Zstu paramZstu, Zbnt paramZbnt) {
    this.Zq = paramZbnt;
    Zq(paramZstu, paramZbnt);
  }
  
  public List<int[]> ZH(Zstu paramZstu, byte paramByte) {
    ArrayList<int[]> arrayList = new ArrayList();
    byte b = 0;
    boolean bool = Ze7p.ZJ();
    while (b < (ZX[paramByte]).length) {
      if (!this.ZT[paramByte][b]) {
        Zbu4 zbu4 = ZX[paramByte][b].ZG(paramZstu);
        if (zbu4.ZP() && !Zmhb.Zl(paramZstu, zbu4.ZR(), this.Zq))
          arrayList.add(zbu4.Z_()); 
      } 
      b++;
      if (!bool) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    return (List<int[]>)arrayList;
  }
  
  public List<int[]> ZO(Zstu paramZstu, byte paramByte) {
    boolean bool = Ze7p.ZV();
    ArrayList<int[]> arrayList = new ArrayList();
    if (paramByte == 1) {
      Matcher matcher = ZE.matcher(Zruv.Zl(paramZstu));
      if (matcher.find())
        do {
          arrayList.add(new int[] { matcher.start(1), matcher.end(1) });
        } while (matcher.find()); 
    } 
    if (Zbqc.Zwu() == null)
      Ze7p.Zf(!bool); 
    return (List<int[]>)arrayList;
  }
  
  private void Zq(Zstu paramZstu, Zbnt paramZbnt) {
    this.ZT = new boolean[ZX.length][];
    byte b = 0;
    boolean bool = Ze7p.ZJ();
    while (b < ZX.length) {
      this.ZT[b] = new boolean[(ZX[b]).length];
      byte b1 = 0;
      while (b1 < (this.ZT[b]).length) {
        Zbu4 zbu4 = ZX[b][b1].ZG(paramZstu);
        if (zbu4.ZP() && !Zmhb.Zl(paramZstu, zbu4.ZR(), paramZbnt))
          this.ZT[b][b1] = true; 
        b1++;
        if (!bool)
          break; 
      } 
      b++;
      if (!bool)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'E:?1E8E18eSj9",Ymp3>!O_l3%\\fE9\\t% Xw3"|5k!@tYnD\\nq(\\r?*T\\nz%\\r3,XL$/\\rk'p\\fx'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #7
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #50
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'K43.K6+r09Z&6?\\n`"_,>H '
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #7
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #60
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 247
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 229, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #44
    //   202: goto -> 231
    //   205: bipush #110
    //   207: goto -> 231
    //   210: bipush #67
    //   212: goto -> 231
    //   215: bipush #99
    //   217: goto -> 231
    //   220: bipush #119
    //   222: goto -> 231
    //   225: iconst_4
    //   226: goto -> 231
    //   229: bipush #87
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 153
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 149
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 40, 0 -> 99
    //   288: aload_0
    //   289: bipush #6
    //   291: aaload
    //   292: bipush #8
    //   294: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   297: putstatic burp/Ztzo.ZE : Ljava/util/regex/Pattern;
    //   300: iconst_2
    //   301: anewarray [Lburp/Zzrd;
    //   304: dup
    //   305: iconst_0
    //   306: iconst_5
    //   307: anewarray burp/Zzrd
    //   310: dup
    //   311: iconst_0
    //   312: aload_0
    //   313: bipush #8
    //   315: aaload
    //   316: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: aload_0
    //   323: iconst_0
    //   324: aaload
    //   325: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: aload_0
    //   332: iconst_4
    //   333: aaload
    //   334: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   337: aastore
    //   338: dup
    //   339: iconst_3
    //   340: aload_0
    //   341: iconst_1
    //   342: aaload
    //   343: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   346: aastore
    //   347: dup
    //   348: iconst_4
    //   349: aload_0
    //   350: bipush #7
    //   352: aaload
    //   353: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   356: aastore
    //   357: aastore
    //   358: dup
    //   359: iconst_1
    //   360: iconst_3
    //   361: anewarray burp/Zzrd
    //   364: dup
    //   365: iconst_0
    //   366: aload_0
    //   367: iconst_3
    //   368: aaload
    //   369: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: aload_0
    //   376: iconst_5
    //   377: aaload
    //   378: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   381: aastore
    //   382: dup
    //   383: iconst_2
    //   384: aload_0
    //   385: iconst_2
    //   386: aaload
    //   387: invokestatic Za : (Ljava/lang/String;)Lburp/Zzrd;
    //   390: aastore
    //   391: aastore
    //   392: putstatic burp/Ztzo.ZX : [[Lburp/Zzrd;
    //   395: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */