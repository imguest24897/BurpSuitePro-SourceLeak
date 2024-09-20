package com.nimbusds.jose;

import java.util.Map;

public interface JSONSerializable {
  Map<String, Object> toGeneralJSONObject();
  
  Map<String, Object> toFlattenedJSONObject();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JSONSerializable.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */