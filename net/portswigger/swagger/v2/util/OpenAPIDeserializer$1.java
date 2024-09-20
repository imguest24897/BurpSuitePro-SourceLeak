package net.portswigger.swagger.v2.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v3.parser.extensions.JsonSchemaParserExtension;

class OpenAPIDeserializer$1 extends LinkedHashMap<ClassLoader, List<JsonSchemaParserExtension>> {
  protected boolean removeEldestEntry(Map.Entry<ClassLoader, List<JsonSchemaParserExtension>> paramEntry) {
    return (size() > 20);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\OpenAPIDeserializer$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */