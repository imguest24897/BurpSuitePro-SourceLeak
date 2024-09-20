package burp;

public class Zrad implements Zbu2 {
  private final Zeun ZM = new Zeun();
  
  public void ZW(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: getfield Zs : I
    //   8: aload_2
    //   9: getfield Zk : I
    //   12: isub
    //   13: istore #4
    //   15: iload #4
    //   17: sipush #2048
    //   20: if_icmpge -> 44
    //   23: aload_0
    //   24: getfield ZM : Lburp/Zeun;
    //   27: getfield ZM : Ljava/util/zip/CRC32;
    //   30: aload_1
    //   31: aload_2
    //   32: getfield Zk : I
    //   35: iload #4
    //   37: invokevirtual update : ([BII)V
    //   40: aload_3
    //   41: ifnull -> 84
    //   44: aload_0
    //   45: getfield ZM : Lburp/Zeun;
    //   48: getfield ZM : Ljava/util/zip/CRC32;
    //   51: aload_1
    //   52: aload_2
    //   53: getfield Zk : I
    //   56: sipush #1024
    //   59: invokevirtual update : ([BII)V
    //   62: aload_0
    //   63: getfield ZM : Lburp/Zeun;
    //   66: getfield ZM : Ljava/util/zip/CRC32;
    //   69: aload_1
    //   70: aload_2
    //   71: getfield Zs : I
    //   74: sipush #1024
    //   77: isub
    //   78: sipush #1024
    //   81: invokevirtual update : ([BII)V
    //   84: invokestatic Zwu : ()[Lburp/Zbqc;
    //   87: ifnonnull -> 97
    //   90: iconst_1
    //   91: anewarray java/lang/String
    //   94: invokestatic ZZ : ([Ljava/lang/String;)V
    //   97: return
  }
  
  public void ZB(Zt82 paramZt82) {
    this.ZM.Zv(paramZt82, ZV());
  }
  
  public Zlug ZV() {
    return Zlug.LIMITED_BODY_CONTENT;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrad.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */