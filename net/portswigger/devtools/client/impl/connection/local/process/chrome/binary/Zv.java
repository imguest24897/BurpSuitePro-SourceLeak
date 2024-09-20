package net.portswigger.devtools.client.impl.connection.local.process.chrome.binary;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Zv {
  private final Path Zo;
  
  private final Path ZU;
  
  private final Path ZQ;
  
  private static final String a;
  
  public Zv(Path paramPath1, Path paramPath2, Path paramPath3) {
    this.Zo = Zp(paramPath1);
    this.ZU = Objects.<Path>requireNonNull(paramPath2);
    this.ZQ = Objects.<Path>requireNonNull(paramPath3);
  }
  
  private Path Zp(Path paramPath) {
    try {
      Objects.requireNonNull(paramPath);
      if (Files.exists(paramPath, new java.nio.file.LinkOption[0]))
        try {
          if (Files.isDirectory(paramPath, new java.nio.file.LinkOption[0]))
            return paramPath; 
          throw new IllegalArgumentException(String.valueOf(paramPath) + String.valueOf(paramPath));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(String.valueOf(paramPath) + String.valueOf(paramPath));
  }
  
  public Path ZZ() {
    return this.Zo.toAbsolutePath();
  }
  
  public Path ZG() {
    return this.Zo.resolve(this.ZU).toAbsolutePath();
  }
  
  public Path Zs() {
    return this.Zo.resolve(this.ZQ).toAbsolutePath();
  }
  
  public String toString() {
    return ZZ().toString();
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc '[ksv6Flv7;AU[Ra"?\\bE"b$8_Bp'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/binary/Zv.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #68
    //   82: goto -> 112
    //   85: bipush #61
    //   87: goto -> 112
    //   90: bipush #63
    //   92: goto -> 112
    //   95: bipush #105
    //   97: goto -> 112
    //   100: bipush #104
    //   102: goto -> 112
    //   105: bipush #23
    //   107: goto -> 112
    //   110: bipush #14
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\binary\Zv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */