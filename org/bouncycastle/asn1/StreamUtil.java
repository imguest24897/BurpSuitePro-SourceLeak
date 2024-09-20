package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

class StreamUtil {
  static int findLimit(InputStream paramInputStream) {
    if (paramInputStream instanceof LimitedInputStream)
      return ((LimitedInputStream)paramInputStream).getLimit(); 
    if (paramInputStream instanceof ASN1InputStream)
      return ((ASN1InputStream)paramInputStream).getLimit(); 
    if (paramInputStream instanceof ByteArrayInputStream)
      return ((ByteArrayInputStream)paramInputStream).available(); 
    if (paramInputStream instanceof FileInputStream)
      try {
        FileChannel fileChannel = ((FileInputStream)paramInputStream).getChannel();
        long l1 = (fileChannel != null) ? fileChannel.size() : 2147483647L;
        if (l1 < 2147483647L)
          return (int)l1; 
      } catch (IOException iOException) {} 
    long l = Runtime.getRuntime().maxMemory();
    return (l > 2147483647L) ? Integer.MAX_VALUE : (int)l;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\StreamUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */