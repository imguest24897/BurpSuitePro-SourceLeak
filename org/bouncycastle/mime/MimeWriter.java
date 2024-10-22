package org.bouncycastle.mime;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class MimeWriter {
  protected final Headers headers;
  
  protected MimeWriter(Headers paramHeaders) {
    this.headers = paramHeaders;
  }
  
  public Headers getHeaders() {
    return this.headers;
  }
  
  public abstract OutputStream getContentStream() throws IOException;
  
  protected static List<String> mapToLines(Map<String, String> paramMap) {
    ArrayList<String> arrayList = new ArrayList(paramMap.size());
    for (String str : paramMap.keySet())
      arrayList.add(str + ": " + (String)paramMap.get(str)); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\MimeWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */