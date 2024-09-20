package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzkm implements Zg4j, Zmf_ {
  private final List<Ze0j> Zi = new ArrayList<>();
  
  private int ZB;
  
  private Zlal ZG = Zlal.Zf;
  
  private static String[] Zb;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public boolean ZC(String paramString, boolean paramBoolean) {
    Zlwx zlwx = Zp(paramString);
    Boolean bool = ZX(zlwx);
    if (bool == null)
      return paramBoolean; 
    if (bool.booleanValue() != paramBoolean)
      this.ZB++; 
    return bool.booleanValue();
  }
  
  private Boolean ZX(Zlwx paramZlwx) {
    if (paramZlwx.ZW())
      return Boolean.valueOf(paramZlwx.ZH()); 
    if (paramZlwx.Zi()) {
      String str = paramZlwx.ZG().toLowerCase();
      if (str.equals(a(-14360, -29394)))
        return Boolean.valueOf(true); 
      if (str.equals(a(-14358, 20582)))
        return Boolean.valueOf(false); 
    } 
    return null;
  }
  
  public boolean Zb(String paramString1, String paramString2, String paramString3, boolean paramBoolean) throws Zzam {
    Zlwx zlwx = Zp(paramString1);
    try {
      if (zlwx != null)
        try {
          if (zlwx.Zi()) {
            try {
              if (!paramString2.equalsIgnoreCase(zlwx.ZG()))
                try {
                  if (!paramString3.equalsIgnoreCase(zlwx.ZG())) {
                    a(-14356, 13465);
                    throw new Zzam(a(-14356, 13465) + a(-14356, 13465) + paramString2 + a(-14359, 652) + paramString3);
                  } 
                } catch (Zzam zzam) {
                  throw a(null);
                }  
            } catch (Zzam zzam) {
              throw a(null);
            } 
            return paramString2.equalsIgnoreCase(zlwx.ZG());
          } 
          return paramBoolean;
        } catch (Zzam zzam) {
          throw a(null);
        }  
    } catch (Zzam zzam) {
      throw a(null);
    } 
    return paramBoolean;
  }
  
  public void Za(String paramString, Zlwx paramZlwx) {
    this.Zi.add(new Ze0j(paramString, paramZlwx));
  }
  
  public void Z_(String paramString, Zlwx paramZlwx) {
    Ze0j ze0j = new Ze0j(paramString, paramZlwx);
    int i = this.Zi.indexOf(ze0j);
    String[] arrayOfString = Zq();
    if (i != -1) {
      ((Ze0j)this.Zi.get(i)).Zl = paramZlwx;
      if (arrayOfString != null) {
        this.Zi.add(ze0j);
        return;
      } 
      return;
    } 
    this.Zi.add(ze0j);
  }
  
  public void ZH(String paramString) {
    this.Zi.remove(new Ze0j(paramString, null));
  }
  
  public Zzqw ZP(String paramString) {
    Zzqw zzqw = new Zzqw();
    this.Zi.add(new Ze0j(paramString, zzqw));
    return zzqw;
  }
  
  public String Zn(String paramString1, String paramString2) {
    return Zh(paramString1, paramString2, paramString2::lambda$getStringIgnoringEmpty$0);
  }
  
  public String Zm(String paramString1, String paramString2) {
    return Zh(paramString1, paramString2, Zzkm::lambda$getString$1);
  }
  
  private String Zh(String paramString1, String paramString2, Zz0k paramZz0k) {
    Zlwx zlwx = Zp(paramString1);
    if (zlwx.Zi()) {
      String str = zlwx.ZG();
      if (str.isEmpty())
        str = paramZz0k.Zt(); 
      if (!Zsw8.Zn(str, paramString2))
        this.ZB++; 
      return str;
    } 
    return paramString2;
  }
  
  public int ZA(String paramString, int paramInt) {
    Zlwx zlwx = Zp(paramString);
    if (zlwx.ZR()) {
      int i = zlwx.Ze();
      if (i != paramInt)
        this.ZB++; 
      return i;
    } 
    return paramInt;
  }
  
  public int Zo(String paramString, int paramInt) {
    Zlwx zlwx = Zp(paramString);
    if (zlwx.ZR() && zlwx.Ze() > 0) {
      int i = zlwx.Ze();
      if (i != paramInt)
        this.ZB++; 
      return i;
    } 
    return paramInt;
  }
  
  public int ZM(String paramString, List<String> paramList, int paramInt) {
    // Byte code:
    //   0: invokestatic Zq : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual Zp : (Ljava/lang/String;)Lburp/Zlwx;
    //   10: astore #5
    //   12: aload #5
    //   14: invokeinterface Zi : ()Z
    //   19: ifeq -> 113
    //   22: aload #5
    //   24: invokeinterface ZG : ()Ljava/lang/String;
    //   29: astore #6
    //   31: iconst_m1
    //   32: istore #7
    //   34: iconst_0
    //   35: istore #8
    //   37: iload #8
    //   39: aload_2
    //   40: invokeinterface size : ()I
    //   45: if_icmpge -> 88
    //   48: aload_2
    //   49: iload #8
    //   51: invokeinterface get : (I)Ljava/lang/Object;
    //   56: checkcast java/lang/String
    //   59: astore #9
    //   61: aload #9
    //   63: aload #6
    //   65: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   68: ifeq -> 80
    //   71: iload #8
    //   73: istore #7
    //   75: aload #4
    //   77: ifnull -> 88
    //   80: iinc #8, 1
    //   83: aload #4
    //   85: ifnull -> 37
    //   88: iload #7
    //   90: iconst_m1
    //   91: if_icmpeq -> 113
    //   94: iload #7
    //   96: iload_3
    //   97: if_icmpeq -> 113
    //   100: aload_0
    //   101: dup
    //   102: getfield ZB : I
    //   105: iconst_1
    //   106: iadd
    //   107: putfield ZB : I
    //   110: iload #7
    //   112: ireturn
    //   113: iload_3
    //   114: ireturn
  }
  
  public int ZW(String paramString, Map<Byte, String> paramMap, int paramInt) {
    byte b = (byte)paramInt;
    Zlwx zlwx = Zp(paramString);
    String[] arrayOfString = Zq();
    if (zlwx.Zi()) {
      String str = zlwx.ZG();
      for (Map.Entry<Byte, String> entry : paramMap.entrySet()) {
        if (((String)entry.getValue()).equalsIgnoreCase(str)) {
          byte b1 = ((Byte)entry.getKey()).byteValue();
          if (b1 != b) {
            this.ZB++;
            return b1;
          } 
        } 
        if (arrayOfString != null)
          break; 
      } 
    } 
    return paramInt;
  }
  
  public <T> List<T> Zs(String paramString, Zsh4<T> paramZsh4) {
    String[] arrayOfString = Zq();
    Zlwx zlwx = Zp(paramString);
    if (zlwx.ZN()) {
      this.ZB++;
      ArrayList<T> arrayList = new ArrayList();
      List<Zlwx> list = zlwx.ZO();
      for (Zlwx zlwx1 : list) {
        if (zlwx1.Zq())
          try {
            Zvt zvt = zlwx1.Zf();
            try {
              if (zvt != null)
                arrayList.add(paramZsh4.Zu(zvt)); 
            } catch (Exception exception) {
              throw a(null);
            } 
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.USER_ERROR);
          }  
        if (arrayOfString != null)
          break; 
      } 
      return arrayList;
    } 
    return null;
  }
  
  public List<String> Ze(String paramString) {
    String[] arrayOfString = Zq();
    Zlwx zlwx = Zp(paramString);
    if (zlwx.ZN()) {
      ArrayList<String> arrayList = new ArrayList();
      List<Zlwx> list = zlwx.ZO();
      for (Zlwx zlwx1 : list) {
        if (zlwx1.Zi())
          arrayList.add(zlwx1.ZG()); 
        if (arrayOfString != null)
          break; 
      } 
      return arrayList;
    } 
    return null;
  }
  
  public byte[] Zr(String paramString, byte[] paramArrayOfbyte) {
    Zlwx zlwx = Zp(paramString);
    if (zlwx.ZF()) {
      byte[] arrayOfByte = zlwx.Za();
      if (arrayOfByte.length > 0) {
        if (!Arrays.equals(arrayOfByte, paramArrayOfbyte))
          this.ZB++; 
        return arrayOfByte;
      } 
    } 
    return paramArrayOfbyte;
  }
  
  public String ZX(String paramString1, String paramString2, String paramString3, String paramString4, char[] paramArrayOfchar) {
    String str = new String(paramArrayOfchar);
    Zlwx zlwx = Zp(paramString1);
    if (zlwx.Zi()) {
      String str1 = zlwx.ZG();
      String str2 = this.ZG.ZI(str1, paramString2, paramString3, paramString4);
      if (!str.equals(str2))
        this.ZB++; 
      return str2;
    } 
    return str;
  }
  
  public static String Zx(String... paramVarArgs) {
    return Zsw8.Zg(paramVarArgs, ".");
  }
  
  public Zlwx Zp(String paramString) {
    String[] arrayOfString = Zq();
    for (Ze0j ze0j : this.Zi) {
      if (ze0j.Za.equals(paramString))
        return ze0j.Zl; 
      if (arrayOfString != null)
        break; 
    } 
    return Zlwx.Zn;
  }
  
  public Zgba ZR() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zi : Ljava/util/List;
    //   4: invokestatic sort : (Ljava/util/List;)V
    //   7: invokestatic Zq : ()[Ljava/lang/String;
    //   10: new burp/Zgba
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_2
    //   18: astore_1
    //   19: aload_0
    //   20: getfield Zi : Ljava/util/List;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 163
    //   38: aload_3
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast burp/Ze0j
    //   47: astore #4
    //   49: aload #4
    //   51: getfield Za : Ljava/lang/String;
    //   54: sipush #-14357
    //   57: sipush #2999
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   66: astore #5
    //   68: aload_2
    //   69: astore #6
    //   71: aload #5
    //   73: astore #7
    //   75: aload #7
    //   77: arraylength
    //   78: istore #8
    //   80: iconst_0
    //   81: istore #9
    //   83: iload #9
    //   85: iload #8
    //   87: if_icmpge -> 149
    //   90: aload #7
    //   92: iload #9
    //   94: aaload
    //   95: astore #10
    //   97: aload #6
    //   99: aload #10
    //   101: invokevirtual Zp : (Ljava/lang/String;)Z
    //   104: ifeq -> 120
    //   107: aload #6
    //   109: aload #10
    //   111: invokevirtual ZX : (Ljava/lang/String;)Lburp/Zgba;
    //   114: astore #6
    //   116: aload_1
    //   117: ifnull -> 142
    //   120: new burp/Zgba
    //   123: dup
    //   124: aload #10
    //   126: invokespecial <init> : (Ljava/lang/String;)V
    //   129: astore #11
    //   131: aload #6
    //   133: aload #11
    //   135: invokevirtual ZV : (Lburp/Zgba;)V
    //   138: aload #11
    //   140: astore #6
    //   142: iinc #9, 1
    //   145: aload_1
    //   146: ifnull -> 83
    //   149: aload #6
    //   151: aload #4
    //   153: getfield Zl : Lburp/Zlwx;
    //   156: invokevirtual ZR : (Lburp/Zlwx;)V
    //   159: aload_1
    //   160: ifnull -> 29
    //   163: aload_2
    //   164: areturn
  }
  
  public void Zh(String paramString, boolean paramBoolean) {
    Za(paramString, new Zzqn(paramBoolean));
  }
  
  public void Zj(String paramString, boolean paramBoolean) {
    Z_(paramString, new Zzqn(paramBoolean));
  }
  
  public void Zx(String paramString1, boolean paramBoolean, String paramString2, String paramString3) {
    Za(paramString1, new Zzqs(paramBoolean ? paramString2 : paramString3));
  }
  
  public void ZD(String paramString, int paramInt) {
    Za(paramString, new Zzq0(paramInt));
  }
  
  public void Zp(String paramString, int paramInt) {
    Z_(paramString, new Zzq0(paramInt));
  }
  
  public void Za(String paramString1, String paramString2) {
    Za(paramString1, new Zzqs(paramString2));
  }
  
  public void Zr(String paramString1, String paramString2) {
    Z_(paramString1, new Zzqs(paramString2));
  }
  
  public void Zr(String paramString, List<String> paramList, int paramInt) {
    Za(paramString, new Zzqs(paramList.get(paramInt)));
  }
  
  public void ZC(String paramString, Map<Byte, String> paramMap, int paramInt) {
    Za(paramString, new Zzqs(paramMap.get(Byte.valueOf((byte)paramInt))));
  }
  
  public void Zk(String paramString, byte[] paramArrayOfbyte) {
    Za(paramString, new Zzq_(paramArrayOfbyte));
  }
  
  public void ZK() {
    this.ZB = 0;
  }
  
  public boolean Zb() {
    return (this.ZB > 0);
  }
  
  public boolean Zh(String paramString) {
    return (Zp(paramString) != Zlwx.Zn);
  }
  
  public Zmf_ ZT() {
    return ZV(new String[0]);
  }
  
  public Zmf_ ZV(String... paramVarArgs) {
    // Byte code:
    //   0: new burp/Zzkm
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic Zq : ()[Ljava/lang/String;
    //   11: aload_3
    //   12: aload_0
    //   13: getfield ZG : Lburp/Zlal;
    //   16: invokevirtual Zg : (Lburp/Zlal;)V
    //   19: astore_2
    //   20: aload_1
    //   21: ifnull -> 29
    //   24: aload_1
    //   25: arraylength
    //   26: ifne -> 84
    //   29: aload_0
    //   30: getfield Zi : Ljava/util/List;
    //   33: invokeinterface iterator : ()Ljava/util/Iterator;
    //   38: astore #4
    //   40: aload #4
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 80
    //   50: aload #4
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: checkcast burp/Ze0j
    //   60: astore #5
    //   62: aload_3
    //   63: aload #5
    //   65: getfield Za : Ljava/lang/String;
    //   68: aload #5
    //   70: getfield Zl : Lburp/Zlwx;
    //   73: invokevirtual Za : (Ljava/lang/String;Lburp/Zlwx;)V
    //   76: aload_2
    //   77: ifnull -> 40
    //   80: aload_2
    //   81: ifnull -> 184
    //   84: aload_0
    //   85: getfield Zi : Ljava/util/List;
    //   88: invokeinterface iterator : ()Ljava/util/Iterator;
    //   93: astore #4
    //   95: aload #4
    //   97: invokeinterface hasNext : ()Z
    //   102: ifeq -> 184
    //   105: aload #4
    //   107: invokeinterface next : ()Ljava/lang/Object;
    //   112: checkcast burp/Ze0j
    //   115: astore #5
    //   117: aload_1
    //   118: astore #6
    //   120: aload #6
    //   122: arraylength
    //   123: istore #7
    //   125: iconst_0
    //   126: istore #8
    //   128: iload #8
    //   130: iload #7
    //   132: if_icmpge -> 180
    //   135: aload #6
    //   137: iload #8
    //   139: aaload
    //   140: astore #9
    //   142: aload #5
    //   144: getfield Za : Ljava/lang/String;
    //   147: aload #9
    //   149: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   152: ifeq -> 173
    //   155: aload_3
    //   156: aload #5
    //   158: getfield Za : Ljava/lang/String;
    //   161: aload #5
    //   163: getfield Zl : Lburp/Zlwx;
    //   166: invokevirtual Za : (Ljava/lang/String;Lburp/Zlwx;)V
    //   169: aload_2
    //   170: ifnull -> 180
    //   173: iinc #8, 1
    //   176: aload_2
    //   177: ifnull -> 128
    //   180: aload_2
    //   181: ifnull -> 95
    //   184: aload_3
    //   185: areturn
  }
  
  public Zmf_ ZE(String... paramVarArgs) {
    Zzkm zzkm = new Zzkm();
    Iterator<Ze0j> iterator = this.Zi.iterator();
    String[] arrayOfString = Zq();
    while (iterator.hasNext()) {
      Ze0j ze0j = iterator.next();
      Objects.requireNonNull(ze0j.Za);
      boolean bool = Arrays.<String>stream(paramVarArgs).filter(Zzkm::lambda$exclude$2).noneMatch(ze0j.Za::contains);
      if (bool)
        zzkm.Za(ze0j.Za, ze0j.Zl); 
      if (arrayOfString != null)
        break; 
    } 
    return zzkm;
  }
  
  public void Zg(Zlal paramZlal) {
    this.ZG = paramZlal;
  }
  
  public Zlal Zc() {
    return this.ZG;
  }
  
  public void ZM(Zmf_ paramZmf_) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: aload_0
    //   5: getfield Zi : Ljava/util/List;
    //   8: invokeinterface size : ()I
    //   13: invokespecial <init> : (I)V
    //   16: astore_3
    //   17: invokestatic Zq : ()[Ljava/lang/String;
    //   20: iconst_0
    //   21: istore #4
    //   23: astore_2
    //   24: iload #4
    //   26: aload_0
    //   27: getfield Zi : Ljava/util/List;
    //   30: invokeinterface size : ()I
    //   35: if_icmpge -> 74
    //   38: aload_3
    //   39: aload_0
    //   40: getfield Zi : Ljava/util/List;
    //   43: iload #4
    //   45: invokeinterface get : (I)Ljava/lang/Object;
    //   50: checkcast burp/Ze0j
    //   53: getfield Za : Ljava/lang/String;
    //   56: iload #4
    //   58: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   61: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: iinc #4, 1
    //   70: aload_2
    //   71: ifnull -> 24
    //   74: aload_1
    //   75: invokeinterface iterator : ()Ljava/util/Iterator;
    //   80: astore #4
    //   82: aload #4
    //   84: invokeinterface hasNext : ()Z
    //   89: ifeq -> 162
    //   92: aload #4
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: checkcast burp/Ze0j
    //   102: astore #5
    //   104: aload_3
    //   105: aload #5
    //   107: getfield Za : Ljava/lang/String;
    //   110: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   115: checkcast java/lang/Integer
    //   118: astore #6
    //   120: aload #6
    //   122: ifnull -> 146
    //   125: aload_0
    //   126: getfield Zi : Ljava/util/List;
    //   129: aload #6
    //   131: invokevirtual intValue : ()I
    //   134: aload #5
    //   136: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   141: pop
    //   142: aload_2
    //   143: ifnull -> 158
    //   146: aload_0
    //   147: getfield Zi : Ljava/util/List;
    //   150: aload #5
    //   152: invokeinterface add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: aload_2
    //   159: ifnull -> 82
    //   162: return
  }
  
  public String ZH() {
    return this.Zi.isEmpty() ? null : ((Ze0j)this.Zi.get(0)).Za;
  }
  
  public Iterator<Ze0j> iterator() {
    return this.Zi.iterator();
  }
  
  private static boolean lambda$exclude$2(String paramString) {
    return (paramString != null && !paramString.isEmpty());
  }
  
  private static String lambda$getString$1() {
    return "";
  }
  
  private static String lambda$getStringIgnoringEmpty$0(String paramString) {
    return paramString;
  }
  
  public static void Zv(String[] paramArrayOfString) {
    Zb = paramArrayOfString;
  }
  
  public static String[] Zq() {
    return Zb;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¹9øªØ{:F­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: invokestatic Zv : ([Ljava/lang/String;)V
    //   21: iconst_4
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: bipush #113
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 143
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 25
    //   70: ldc 'Ðë¿Êª lÑEr\\né'[P\\bf££Ð'
    //   72: dup
    //   73: astore_2
    //   74: invokevirtual length : ()I
    //   77: istore #4
    //   79: iconst_2
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #11
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 143
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zzkm.b : [Ljava/lang/String;
    //   133: iconst_5
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzkm.c : [Ljava/lang/String;
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
    //   212: bipush #10
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #94
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #95
    //   234: goto -> 244
    //   237: bipush #35
    //   239: goto -> 244
    //   242: bipush #110
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
    //   283: tableswitch default -> 42, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC7E8) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzkm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */