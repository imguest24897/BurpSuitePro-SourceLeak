package burp;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class Zsuj implements Ze6i {
  private static final byte[] Zc = new byte[0];
  
  private final Zbip Zd;
  
  public Zsuj(Zbip paramZbip) {
    this.Zd = paramZbip;
  }
  
  public List<Zsp> Zm(int paramInt, Zefx paramZefx, boolean paramBoolean) {
    Zbl_ zbl_ = new Zbl_(paramBoolean);
    paramZefx.Zi(zbl_);
    int i = Zztf.ZJ();
    boolean bool = zbl_.ZY();
    LinkedList<Zsu> linkedList = new LinkedList();
    linkedList.add(new Zsu(paramInt, Zz0x.Zx(new byte[] { 4 }, ), zbl_.Zp));
    if (bool) {
      ZO((List)linkedList, paramInt, zbl_.Zu);
      if (i != 0) {
        linkedList.add(new Zs3(paramInt, Zz0x.Zx(new byte[] { 1 }, ), Zc));
        return (List)linkedList;
      } 
      return (List)linkedList;
    } 
    linkedList.add(new Zs3(paramInt, Zz0x.Zx(new byte[] { 1 }, ), Zc));
    return (List)linkedList;
  }
  
  private void ZO(List<Zsp> paramList, int paramInt, ByteBuffer paramByteBuffer) {
    // Byte code:
    //   0: invokestatic Zg : ()I
    //   3: istore #4
    //   5: aload_3
    //   6: invokevirtual remaining : ()I
    //   9: ifle -> 111
    //   12: aload_3
    //   13: invokevirtual remaining : ()I
    //   16: aload_0
    //   17: getfield Zd : Lburp/Zbip;
    //   20: invokevirtual Zw : ()I
    //   23: invokestatic min : (II)I
    //   26: istore #5
    //   28: iload #5
    //   30: aload_3
    //   31: invokevirtual remaining : ()I
    //   34: if_icmpne -> 41
    //   37: iconst_1
    //   38: goto -> 42
    //   41: iconst_0
    //   42: istore #6
    //   44: iload #6
    //   46: ifeq -> 91
    //   49: iload #5
    //   51: iconst_1
    //   52: if_icmple -> 72
    //   55: aload_1
    //   56: iload_2
    //   57: aload_3
    //   58: iload #5
    //   60: iconst_1
    //   61: isub
    //   62: iconst_0
    //   63: invokestatic Zc : (ILjava/nio/ByteBuffer;IZ)Lburp/Zs3;
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_1
    //   73: iload_2
    //   74: aload_3
    //   75: iconst_1
    //   76: iconst_1
    //   77: invokestatic Zc : (ILjava/nio/ByteBuffer;IZ)Lburp/Zs3;
    //   80: invokeinterface add : (Ljava/lang/Object;)Z
    //   85: pop
    //   86: iload #4
    //   88: ifne -> 106
    //   91: aload_1
    //   92: iload_2
    //   93: aload_3
    //   94: iload #5
    //   96: iconst_0
    //   97: invokestatic Zc : (ILjava/nio/ByteBuffer;IZ)Lburp/Zs3;
    //   100: invokeinterface add : (Ljava/lang/Object;)Z
    //   105: pop
    //   106: iload #4
    //   108: ifne -> 5
    //   111: return
  }
  
  private static Zs3 Zc(int paramInt1, ByteBuffer paramByteBuffer, int paramInt2, boolean paramBoolean) {
    byte[] arrayOfByte = new byte[paramInt2];
    paramByteBuffer.get(arrayOfByte);
    Zz0x zz0x = paramBoolean ? Zz0x.Zx(new byte[] { 1 }) : Zz0x.Zh;
    return new Zs3(paramInt1, zz0x, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsuj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */