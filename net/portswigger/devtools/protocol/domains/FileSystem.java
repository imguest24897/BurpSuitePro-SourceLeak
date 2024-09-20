package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.filesystem.BucketFileSystemLocator;
import net.portswigger.devtools.protocol.types.filesystem.Directory;

@Zy
public interface FileSystem {
  @Zr("directory")
  CompletableFuture<Zf<Directory>> getDirectory(@Zu("bucketFileSystemLocator") BucketFileSystemLocator paramBucketFileSystemLocator);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\FileSystem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */