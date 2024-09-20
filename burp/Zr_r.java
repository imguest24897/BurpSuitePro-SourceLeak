package burp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.function.Function;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zr_r {
  private final Function<Path, Zb6_> Ze;
  
  private static final String a;
  
  public Zr_r(Function<Path, Zb6_> paramFunction) {
    this.Ze = paramFunction;
  }
  
  public int Zv(Zryx paramZryx, File paramFile) {
    try {
      if (paramZryx != null)
        try {
          if (paramFile != null)
            try {
              if (!paramFile.isDirectory()) {
                Path path = Path.of(Zs6n.Zc(paramFile.getPath(), a), new String[0]);
                try {
                  Files.writeString(path, paramZryx.Zs(), new OpenOption[] { StandardOpenOption.CREATE });
                } catch (IOException iOException) {
                  Zah.Zl(iOException, Zk_.UNEXPECTED);
                  throw new Ze4p(iOException.getMessage());
                } 
                return 1;
              } 
              return 0;
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 0;
  }
  
  public int Zj(Collection<Zryx> paramCollection, File paramFile) {
    int i = Zryx.Zx();
    try {
      if (paramCollection != null)
        try {
          if (!paramCollection.isEmpty())
            try {
              if (paramFile != null)
                try {
                  if (paramFile.isDirectory()) {
                    boolean bool = false;
                    byte b = 0;
                    for (Zryx zryx : paramCollection) {
                      Path path1 = zryx.Ze().getFileName();
                      Path path2 = Path.of(paramFile.getPath(), new String[0]).resolve(path1);
                      try {
                        if (!bool && Files.exists(path2, new java.nio.file.LinkOption[0])) {
                          Zb6_ zb6_ = this.Ze.apply(path1);
                          switch (zb6_.ordinal()) {
                            case 0:
                              bool = true;
                            case 2:
                              if (i == 0)
                                break; 
                              continue;
                          } 
                        } 
                      } catch (IOException iOException) {
                        throw a(null);
                      } 
                      try {
                        Files.writeString(path2, zryx.Zs(), new OpenOption[] { StandardOpenOption.CREATE });
                        b++;
                      } catch (IOException iOException) {
                        Zah.Zl(iOException, Zk_.UNEXPECTED);
                        throw new Ze4p(iOException.getMessage());
                      } 
                      continue;
                      if (i == 0)
                        break; 
                    } 
                    return b;
                  } 
                  return 0;
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: ldc '7e(fty'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr_r.a : Ljava/lang/String;
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
    //   80: bipush #6
    //   82: goto -> 112
    //   85: bipush #107
    //   87: goto -> 112
    //   90: bipush #25
    //   92: goto -> 112
    //   95: bipush #95
    //   97: goto -> 112
    //   100: bipush #28
    //   102: goto -> 112
    //   105: bipush #8
    //   107: goto -> 112
    //   110: bipush #13
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */