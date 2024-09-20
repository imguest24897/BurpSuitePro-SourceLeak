package net.portswigger.devtools.protocol.types.filesystem;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.filesystem.BucketFileSystemLocator")
public class BucketFileSystemLocator {
  @Zvd(Zp = "storageKey")
  public final String storageKey;
  
  @Zvd(Zp = "bucketName")
  @Zj
  public final String bucketName;
  
  @Zvd(Zp = "pathComponents")
  public final List<String> pathComponents;
  
  @Zox
  public BucketFileSystemLocator(@Zc5(Ze = "storageKey") String paramString1, @Zc5(Ze = "bucketName", ZS = "null") String paramString2, @Zc5(Ze = "pathComponents") List<String> paramList) {
    this.storageKey = paramString1;
    this.bucketName = paramString2;
    this.pathComponents = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\filesystem\BucketFileSystemLocator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */