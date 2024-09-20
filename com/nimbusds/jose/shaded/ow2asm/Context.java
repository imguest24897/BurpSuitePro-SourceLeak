package com.nimbusds.jose.shaded.ow2asm;

final class Context {
  Attribute[] attributePrototypes;
  
  int parsingOptions;
  
  char[] charBuffer;
  
  int currentMethodAccessFlags;
  
  String currentMethodName;
  
  String currentMethodDescriptor;
  
  Label[] currentMethodLabels;
  
  int currentTypeAnnotationTarget;
  
  TypePath currentTypeAnnotationTargetPath;
  
  Label[] currentLocalVariableAnnotationRangeStarts;
  
  Label[] currentLocalVariableAnnotationRangeEnds;
  
  int[] currentLocalVariableAnnotationRangeIndices;
  
  int currentFrameOffset;
  
  int currentFrameType;
  
  int currentFrameLocalCount;
  
  int currentFrameLocalCountDelta;
  
  Object[] currentFrameLocalTypes;
  
  int currentFrameStackCount;
  
  Object[] currentFrameStackTypes;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\ow2asm\Context.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */