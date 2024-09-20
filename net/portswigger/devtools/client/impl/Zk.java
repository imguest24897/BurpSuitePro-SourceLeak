package net.portswigger.devtools.client.impl;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.devtools.protocol.types.accessibility.AXNode;

class Zk {
  Map<String, AXNode> Zi;
  
  Map<Integer, AXNode> Zq;
  
  private Zk(Map<String, AXNode> paramMap, Map<Integer, AXNode> paramMap1) {
    this.Zi = paramMap;
    this.Zq = paramMap1;
  }
  
  static Zk ZF(List<AXNode> paramList) {
    Map<String, AXNode> map = (Map)paramList.stream().collect(Collectors.toMap(Zk::lambda$buildAXTree$0, Zk::lambda$buildAXTree$1, Zk::lambda$buildAXTree$2, java.util.LinkedHashMap::new));
    Map<Integer, AXNode> map1 = (Map)paramList.stream().collect(Collectors.toMap(Zk::lambda$buildAXTree$3, Zk::lambda$buildAXTree$4, Zk::lambda$buildAXTree$5, java.util.LinkedHashMap::new));
    return new Zk(map, map1);
  }
  
  List<AXNode> Zn(AXNode paramAXNode) {
    Objects.requireNonNull(this.Zi);
    return paramAXNode.childIds.stream().map(this.Zi::get).toList();
  }
  
  AXNode ZA(Integer paramInteger) {
    return this.Zq.get(paramInteger);
  }
  
  private static AXNode lambda$buildAXTree$5(AXNode paramAXNode1, AXNode paramAXNode2) {
    return paramAXNode1;
  }
  
  private static AXNode lambda$buildAXTree$4(AXNode paramAXNode) {
    return paramAXNode;
  }
  
  private static Integer lambda$buildAXTree$3(AXNode paramAXNode) {
    return paramAXNode.backendDOMNodeId;
  }
  
  private static AXNode lambda$buildAXTree$2(AXNode paramAXNode1, AXNode paramAXNode2) {
    return paramAXNode1;
  }
  
  private static AXNode lambda$buildAXTree$1(AXNode paramAXNode) {
    return paramAXNode;
  }
  
  private static String lambda$buildAXTree$0(AXNode paramAXNode) {
    return paramAXNode.nodeId;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */