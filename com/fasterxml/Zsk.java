package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.net.InetAddress;

public class Zsk extends Zzg<InetAddress> implements Zi {
  protected final boolean ZZ;
  
  public Zsk() {
    this(false);
  }
  
  public Zsk(boolean paramBoolean) {
    super(InetAddress.class);
    this.ZZ = paramBoolean;
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    boolean bool = false;
    if (zgy != null) {
      Zqi zqi = zgy.ZI();
      try {
        if (zqi.Zp() || zqi == Zqi.ARRAY)
          bool = true; 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    try {
      if (bool != this.ZZ)
        return new Zsk(bool); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this;
  }
  
  public void ZU(InetAddress paramInetAddress, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZZ : Z
    //   9: ifeq -> 23
    //   12: aload_1
    //   13: invokevirtual getHostAddress : ()Ljava/lang/String;
    //   16: astore #5
    //   18: aload #4
    //   20: ifnull -> 81
    //   23: aload_1
    //   24: invokevirtual toString : ()Ljava/lang/String;
    //   27: invokevirtual trim : ()Ljava/lang/String;
    //   30: astore #5
    //   32: aload #5
    //   34: bipush #47
    //   36: invokevirtual indexOf : (I)I
    //   39: istore #6
    //   41: iload #6
    //   43: iflt -> 81
    //   46: iload #6
    //   48: ifne -> 71
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   57: athrow
    //   58: aload #5
    //   60: iconst_1
    //   61: invokevirtual substring : (I)Ljava/lang/String;
    //   64: astore #5
    //   66: aload #4
    //   68: ifnull -> 81
    //   71: aload #5
    //   73: iconst_0
    //   74: iload #6
    //   76: invokevirtual substring : (II)Ljava/lang/String;
    //   79: astore #5
    //   81: aload_2
    //   82: aload #5
    //   84: invokevirtual ZD : (Ljava/lang/String;)V
    //   87: return
    // Exception table:
    //   from	to	target	type
    //   41	51	54	java/io/IOException
  }
  
  public void Zs(InetAddress paramInetAddress, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Ze(paramInetAddress, InetAddress.class, Zl.VALUE_STRING));
    ZU(paramInetAddress, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */