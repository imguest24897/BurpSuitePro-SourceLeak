package net.portswigger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class Zd2 {
  public final Zgg ZC;
  
  private final Zvw ZO;
  
  public Integer ZF = null;
  
  public String ZI = null;
  
  private Zd2(Zgg paramZgg, Zvw paramZvw) {
    this.ZC = paramZgg;
    this.ZO = paramZvw;
  }
  
  public static Zd2 ZN(Zvw paramZvw) {
    return new Zd2(Zgg.REQUESTING, paramZvw);
  }
  
  public static Zd2 ZE(InputStream paramInputStream, Zus paramZus) throws IOException, Zib {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: aload_1
    //   4: aload_0
    //   5: invokevirtual Zp : (Ljava/io/InputStream;)Lnet/portswigger/Zom;
    //   8: astore_3
    //   9: aload_1
    //   10: aload_0
    //   11: invokevirtual Zn : (Ljava/io/InputStream;)Lnet/portswigger/Zvw;
    //   14: astore #4
    //   16: istore_2
    //   17: aload_3
    //   18: getfield Zi : I
    //   21: bipush #101
    //   23: if_icmpne -> 44
    //   26: new net/portswigger/Zd2
    //   29: dup
    //   30: getstatic net/portswigger/Zgg.GOOD : Lnet/portswigger/Zgg;
    //   33: aload #4
    //   35: invokespecial <init> : (Lnet/portswigger/Zgg;Lnet/portswigger/Zvw;)V
    //   38: astore #5
    //   40: iload_2
    //   41: ifne -> 70
    //   44: new net/portswigger/Zd2
    //   47: dup
    //   48: getstatic net/portswigger/Zgg.BAD : Lnet/portswigger/Zgg;
    //   51: aload #4
    //   53: invokespecial <init> : (Lnet/portswigger/Zgg;Lnet/portswigger/Zvw;)V
    //   56: astore #5
    //   58: aload #5
    //   60: aload_3
    //   61: getfield Zi : I
    //   64: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   67: putfield ZF : Ljava/lang/Integer;
    //   70: aload_3
    //   71: getfield Zi : I
    //   74: bipush #101
    //   76: if_icmpeq -> 118
    //   79: aconst_null
    //   80: astore #6
    //   82: aload_1
    //   83: aload #4
    //   85: aload_0
    //   86: invokevirtual ZO : (Lnet/portswigger/Zvw;Ljava/io/InputStream;)[B
    //   89: astore #6
    //   91: goto -> 96
    //   94: astore #7
    //   96: aload #6
    //   98: ifnull -> 118
    //   101: aload #5
    //   103: aload #6
    //   105: invokestatic ZX : ([B)Ljava/lang/String;
    //   108: putfield ZI : Ljava/lang/String;
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   117: athrow
    //   118: aload #5
    //   120: areturn
    // Exception table:
    //   from	to	target	type
    //   82	91	94	java/io/IOException
    //   82	91	94	net/portswigger/Zib
    //   96	111	114	java/io/IOException
  }
  
  public static Zd2 Zd(Zvw paramZvw) {
    return new Zd2(Zgg.RECEIVED, paramZvw);
  }
  
  public Zd2 Zb(Zd2 paramZd2) {
    Zvw zvw = Zvw.Zm(this.ZO, paramZd2.ZO);
    return new Zd2(this.ZC, zvw);
  }
  
  public Optional<String> Zk(String paramString) {
    return this.ZO.Zk(paramString);
  }
  
  public boolean ZW(String paramString1, String paramString2) {
    Optional<String> optional = this.ZO.Zk(paramString1);
    if (!optional.isPresent())
      optional = this.ZO.Zk(paramString1.toLowerCase()); 
    return ((Boolean)optional.<Boolean>map(paramString2::lambda$hasCaseInsensitiveHeaderValue$0).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  public Zvw ZV() {
    return this.ZO;
  }
  
  public byte[] ZA(Zrxu paramZrxu, String paramString1, String paramString2) {
    return Znp.ZY(paramZrxu, paramString2, paramString1, this.ZO, null, null);
  }
  
  private static Boolean lambda$hasCaseInsensitiveHeaderValue$0(String paramString1, String paramString2) {
    return Boolean.valueOf(paramString2.toLowerCase().equals(paramString1.toLowerCase()));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zd2.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */