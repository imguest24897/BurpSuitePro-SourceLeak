package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zfg;
import net.portswigger.Ztl;

class Zrwh implements Zrn {
  private final List<Zlgo> Zh;
  
  private final List<Zlm> ZR;
  
  private final Socket Zm;
  
  private final Socket ZP;
  
  private final Ztwv Zp;
  
  private final Runnable Zk;
  
  private final Zfg ZW;
  
  private final Zfg ZU;
  
  private final AtomicBoolean Zq;
  
  Zrwh(Socket paramSocket1, Socket paramSocket2, Ztwv paramZtwv, Runnable paramRunnable) {
    this.Zm = paramSocket1;
    this.ZP = paramSocket2;
    this.Zp = paramZtwv;
    this.Zk = paramRunnable;
    this.Zh = new CopyOnWriteArrayList<>();
    this.ZR = new CopyOnWriteArrayList<>();
    this.ZW = new Zlw1(this);
    this.ZU = new Zblu(this);
    this.Zq = new AtomicBoolean();
  }
  
  public void Zi() throws IOException {
    try {
      if (this.Zq.compareAndSet(false, true)) {
        try {
          if (this.Zm != null)
            this.Zp.Zx((Runnable)new Ztl(this.Zm.getInputStream(), this.ZW)); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.Zp.Zx((Runnable)new Ztl(this.ZP.getInputStream(), this.ZU));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void Zr(Zlgo paramZlgo) {
    this.Zh.add(paramZlgo);
  }
  
  public void Zb(Zlgo paramZlgo) {
    this.Zh.remove(paramZlgo);
  }
  
  public void ZE(Zlm paramZlm) {
    this.ZR.add(paramZlm);
  }
  
  public Zl36 ZQ(Zl36 paramZl36, Ze3o paramZe3o, Zeew paramZeew) {
    // Byte code:
    //   0: invokestatic Zh : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_2
    //   6: getstatic burp/Ze3o.CLIENT_TO_SERVER : Lburp/Ze3o;
    //   9: if_acmpne -> 172
    //   12: aload_0
    //   13: getfield ZR : Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore #5
    //   23: aload #5
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 64
    //   33: aload #5
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast burp/Zlm
    //   43: astore #6
    //   45: aload_1
    //   46: ifnull -> 59
    //   49: aload #6
    //   51: aload_1
    //   52: aload_3
    //   53: invokeinterface Zt : (Lburp/Zl36;Lburp/Zeew;)Lburp/Zl36;
    //   58: astore_1
    //   59: aload #4
    //   61: ifnull -> 23
    //   64: aload_0
    //   65: getfield ZR : Ljava/util/List;
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore #5
    //   75: aload #5
    //   77: invokeinterface hasNext : ()Z
    //   82: ifeq -> 115
    //   85: aload #5
    //   87: invokeinterface next : ()Ljava/lang/Object;
    //   92: checkcast burp/Zlm
    //   95: astore #6
    //   97: aload_1
    //   98: ifnull -> 110
    //   101: aload #6
    //   103: aload_1
    //   104: aload_3
    //   105: invokeinterface Zx : (Lburp/Zl36;Lburp/Zeew;)V
    //   110: aload #4
    //   112: ifnull -> 75
    //   115: aload_0
    //   116: getfield Zh : Ljava/util/List;
    //   119: invokeinterface iterator : ()Ljava/util/Iterator;
    //   124: astore #5
    //   126: aload #5
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 167
    //   136: aload #5
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: checkcast burp/Zlgo
    //   146: astore #6
    //   148: aload_1
    //   149: ifnull -> 162
    //   152: aload #6
    //   154: aload_1
    //   155: aload_3
    //   156: invokeinterface Zl : (Lburp/Zl36;Lburp/Zeew;)Lburp/Zl36;
    //   161: astore_1
    //   162: aload #4
    //   164: ifnull -> 126
    //   167: aload #4
    //   169: ifnull -> 224
    //   172: aload_0
    //   173: getfield ZR : Ljava/util/List;
    //   176: invokeinterface iterator : ()Ljava/util/Iterator;
    //   181: astore #5
    //   183: aload #5
    //   185: invokeinterface hasNext : ()Z
    //   190: ifeq -> 224
    //   193: aload #5
    //   195: invokeinterface next : ()Ljava/lang/Object;
    //   200: checkcast burp/Zlm
    //   203: astore #6
    //   205: aload_1
    //   206: ifnull -> 219
    //   209: aload #6
    //   211: aload_1
    //   212: aload_3
    //   213: invokeinterface Zs : (Lburp/Zl36;Lburp/Zeew;)Lburp/Zl36;
    //   218: astore_1
    //   219: aload #4
    //   221: ifnull -> 183
    //   224: aload_1
    //   225: areturn
  }
  
  public void Zz(Zl36 paramZl36, Ze3o paramZe3o, Zeew paramZeew) {
    // Byte code:
    //   0: invokestatic Zh : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_2
    //   6: getstatic burp/Ze3o.CLIENT_TO_SERVER : Lburp/Ze3o;
    //   9: if_acmpne -> 33
    //   12: aload_0
    //   13: getfield Zh : Ljava/util/List;
    //   16: aload_1
    //   17: aload_3
    //   18: <illegal opcode> accept : (Lburp/Zl36;Lburp/Zeew;)Ljava/util/function/Consumer;
    //   23: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   28: aload #4
    //   30: ifnull -> 49
    //   33: aload_0
    //   34: getfield ZR : Ljava/util/List;
    //   37: aload_1
    //   38: aload_3
    //   39: <illegal opcode> accept : (Lburp/Zl36;Lburp/Zeew;)Ljava/util/function/Consumer;
    //   44: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   49: return
  }
  
  private static void lambda$messageSent$1(Zl36 paramZl36, Zeew paramZeew, Zlm paramZlm) {
    paramZlm.ZH(paramZl36, paramZeew);
  }
  
  private static void lambda$messageSent$0(Zl36 paramZl36, Zeew paramZeew, Zlgo paramZlgo) {
    paramZlgo.Zp(paramZl36, paramZeew);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrwh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */