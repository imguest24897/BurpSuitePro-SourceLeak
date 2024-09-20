package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Strings;

public class Headers implements Iterable<String> {
  private final Map<String, List> headers = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
  
  private final List<String> headersAsPresented;
  
  private final String contentTransferEncoding;
  
  private String boundary;
  
  private boolean multipart;
  
  private String contentType;
  
  private Map<String, String> contentTypeParameters;
  
  private static List<String> parseHeaders(InputStream paramInputStream) throws IOException {
    ArrayList<String> arrayList = new ArrayList();
    LineReader lineReader = new LineReader(paramInputStream);
    String str;
    while ((str = lineReader.readLine()) != null && str.length() != 0)
      arrayList.add(str); 
    return arrayList;
  }
  
  public Headers(String paramString1, String paramString2) {
    String str1 = "Content-Type: " + paramString1;
    this.headersAsPresented = new ArrayList<>();
    this.headersAsPresented.add(str1);
    put("Content-Type", paramString1);
    String str2 = (getValues("Content-Type") == null) ? "text/plain" : getValues("Content-Type")[0];
    int i = str2.indexOf(';');
    if (i < 0) {
      paramString1 = str2;
      this.contentTypeParameters = Collections.EMPTY_MAP;
    } else {
      paramString1 = str2.substring(0, i);
      this.contentTypeParameters = createContentTypeParameters(str2.substring(i + 1).trim());
    } 
    this.contentTransferEncoding = (getValues("Content-Transfer-Encoding") == null) ? paramString2 : getValues("Content-Transfer-Encoding")[0];
    if (paramString1.indexOf("multipart") >= 0) {
      this.multipart = true;
      String str = this.contentTypeParameters.get("boundary");
      if (str.startsWith("\"") && str.endsWith("\"")) {
        this.boundary = str.substring(1, str.length() - 1);
      } else {
        this.boundary = str;
      } 
    } else {
      this.boundary = null;
      this.multipart = false;
    } 
  }
  
  public Headers(InputStream paramInputStream, String paramString) throws IOException {
    this(parseHeaders(paramInputStream), paramString);
  }
  
  public Headers(List<String> paramList, String paramString) {
    this.headersAsPresented = paramList;
    String str1 = "";
    for (String str : paramList) {
      if (str.startsWith(" ") || str.startsWith("\t")) {
        str1 = str1 + str.trim();
        continue;
      } 
      if (str1.length() != 0)
        put(str1.substring(0, str1.indexOf(':')).trim(), str1.substring(str1.indexOf(':') + 1).trim()); 
      str1 = str;
    } 
    if (str1.trim().length() != 0)
      put(str1.substring(0, str1.indexOf(':')).trim(), str1.substring(str1.indexOf(':') + 1).trim()); 
    String str2 = (getValues("Content-Type") == null) ? "text/plain" : getValues("Content-Type")[0];
    int i = str2.indexOf(';');
    if (i < 0) {
      this.contentType = str2;
      this.contentTypeParameters = Collections.EMPTY_MAP;
    } else {
      this.contentType = str2.substring(0, i);
      this.contentTypeParameters = createContentTypeParameters(str2.substring(i + 1).trim());
    } 
    this.contentTransferEncoding = (getValues("Content-Transfer-Encoding") == null) ? paramString : getValues("Content-Transfer-Encoding")[0];
    if (this.contentType.indexOf("multipart") >= 0) {
      this.multipart = true;
      String str = this.contentTypeParameters.get("boundary");
      this.boundary = str.substring(1, str.length() - 1);
    } else {
      this.boundary = null;
      this.multipart = false;
    } 
  }
  
  public Map<String, String> getContentTypeAttributes() {
    return this.contentTypeParameters;
  }
  
  private Map<String, String> createContentTypeParameters(String paramString) {
    String[] arrayOfString = paramString.split(";");
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (byte b = 0; b != arrayOfString.length; b++) {
      String str = arrayOfString[b];
      int i = str.indexOf('=');
      if (i < 0)
        throw new IllegalArgumentException("malformed Content-Type header"); 
      linkedHashMap.put(str.substring(0, i).trim(), str.substring(i + 1).trim());
    } 
    return (Map)Collections.unmodifiableMap(linkedHashMap);
  }
  
  public boolean isMultipart() {
    return this.multipart;
  }
  
  public String getBoundary() {
    return this.boundary;
  }
  
  public String getContentType() {
    return this.contentType;
  }
  
  public String getContentTransferEncoding() {
    return this.contentTransferEncoding;
  }
  
  private void put(String paramString1, String paramString2) {
    synchronized (this) {
      KV kV = new KV(paramString1, paramString2);
      List<KV> list = this.headers.get(paramString1);
      if (list == null) {
        list = new ArrayList();
        this.headers.put(paramString1, list);
      } 
      list.add(kV);
    } 
  }
  
  public Iterator<String> getNames() {
    return this.headers.keySet().iterator();
  }
  
  public String[] getValues(String paramString) {
    synchronized (this) {
      List list = this.headers.get(paramString);
      if (list == null)
        return null; 
      String[] arrayOfString = new String[list.size()];
      for (byte b = 0; b < list.size(); b++)
        arrayOfString[b] = ((KV)list.get(b)).value; 
      return arrayOfString;
    } 
  }
  
  public boolean isEmpty() {
    synchronized (this) {
      return this.headers.isEmpty();
    } 
  }
  
  public boolean containsKey(String paramString) {
    return this.headers.containsKey(paramString);
  }
  
  public Iterator<String> iterator() {
    return this.headers.keySet().iterator();
  }
  
  public void dumpHeaders(OutputStream paramOutputStream) throws IOException {
    Iterator<String> iterator = this.headersAsPresented.iterator();
    while (iterator.hasNext()) {
      paramOutputStream.write(Strings.toUTF8ByteArray(iterator.next().toString()));
      paramOutputStream.write(13);
      paramOutputStream.write(10);
    } 
  }
  
  private static class KV {
    public final String key;
    
    public final String value;
    
    public KV(String param1String1, String param1String2) {
      this.key = param1String1;
      this.value = param1String2;
    }
    
    public KV(KV param1KV) {
      this.key = param1KV.key;
      this.value = param1KV.value;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\Headers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */