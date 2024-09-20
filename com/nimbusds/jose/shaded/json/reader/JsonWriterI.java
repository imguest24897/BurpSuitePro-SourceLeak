package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import java.io.IOException;

public interface JsonWriterI<T> {
  <E extends T> void writeJSONString(E paramE, Appendable paramAppendable, JSONStyle paramJSONStyle) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\json\reader\JsonWriterI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */