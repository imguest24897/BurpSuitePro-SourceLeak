package burp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Ze5d implements Zria {
  private static final String ZP;
  
  private final boolean ZE;
  
  private final Zzka<Zto7> ZQ;
  
  private BufferedWriter ZF;
  
  private boolean ZR;
  
  private static final String a;
  
  public Ze5d(boolean paramBoolean, Zg2g paramZg2g) {
    this.ZE = paramBoolean;
    this.ZQ = new Zzka<>(new Zgne(paramZg2g));
  }
  
  public void Zl(Path paramPath) throws IOException {
    try {
      this.ZF = Files.newBufferedWriter(paramPath, new java.nio.file.OpenOption[0]);
      if (this.ZE)
        Zh(this.ZQ.Zq()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zh(Iterable<String> paramIterable) throws IOException {
    int[] arrayOfInt = Zt9n.Zn();
    try {
      Objects.requireNonNull(this.ZF, a);
      if (this.ZR)
        this.ZF.write(ZP); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = false;
    for (String str : paramIterable) {
      try {
        if (bool)
          this.ZF.write(44); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.ZF.write(Zgt8.ZM(str));
      bool = true;
      if (arrayOfInt != null)
        break; 
    } 
    this.ZR = true;
  }
  
  public void ZT(Zto7 paramZto7) throws IOException {
    Zh(this.ZQ.ZE(paramZto7));
  }
  
  public void close() throws IOException {
    try {
      if (this.ZF != null)
        this.ZF.close(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc 'z q:`&`\\t:qpc-9`12`bir-{rd.'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Ze5d.a : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #14
    //   82: goto -> 111
    //   85: bipush #127
    //   87: goto -> 111
    //   90: bipush #74
    //   92: goto -> 111
    //   95: bipush #6
    //   97: goto -> 111
    //   100: bipush #92
    //   102: goto -> 111
    //   105: bipush #17
    //   107: goto -> 111
    //   110: iconst_5
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 7
    //   153: invokestatic lineSeparator : ()Ljava/lang/String;
    //   156: putstatic burp/Ze5d.ZP : Ljava/lang/String;
    //   159: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */