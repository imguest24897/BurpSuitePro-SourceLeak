/*      */ package com.nimbusds.jose.shaded.ow2asm;
/*      */ 
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ClassReader
/*      */ {
/*      */   public static final int SKIP_CODE = 1;
/*      */   public static final int SKIP_DEBUG = 2;
/*      */   public static final int SKIP_FRAMES = 4;
/*      */   public static final int EXPAND_FRAMES = 8;
/*      */   static final int EXPAND_ASM_INSNS = 256;
/*      */   private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
/*      */   @Deprecated
/*      */   public final byte[] b;
/*      */   public final int header;
/*      */   final byte[] classFileBuffer;
/*      */   private final int[] cpInfoOffsets;
/*      */   private final String[] constantUtf8Values;
/*      */   private final ConstantDynamic[] constantDynamicValues;
/*      */   private final int[] bootstrapMethodOffsets;
/*      */   private final int maxStringLength;
/*      */   
/*      */   public ClassReader(byte[] classFile) {
/*  163 */     this(classFile, 0, classFile.length);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassReader(byte[] classFileBuffer, int classFileOffset, int classFileLength) {
/*  177 */     this(classFileBuffer, classFileOffset, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   ClassReader(byte[] classFileBuffer, int classFileOffset, boolean checkClassVersion) {
/*  190 */     this.classFileBuffer = classFileBuffer;
/*  191 */     this.b = classFileBuffer;
/*      */ 
/*      */     
/*  194 */     if (checkClassVersion && readShort(classFileOffset + 6) > 61) {
/*  195 */       throw new IllegalArgumentException("Unsupported class file major version " + 
/*  196 */           readShort(classFileOffset + 6));
/*      */     }
/*      */ 
/*      */     
/*  200 */     int constantPoolCount = readUnsignedShort(classFileOffset + 8);
/*  201 */     this.cpInfoOffsets = new int[constantPoolCount];
/*  202 */     this.constantUtf8Values = new String[constantPoolCount];
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  207 */     int currentCpInfoIndex = 1;
/*  208 */     int currentCpInfoOffset = classFileOffset + 10;
/*  209 */     int currentMaxStringLength = 0;
/*  210 */     boolean hasBootstrapMethods = false;
/*  211 */     boolean hasConstantDynamic = false;
/*      */     
/*  213 */     while (currentCpInfoIndex < constantPoolCount) {
/*  214 */       int cpInfoSize; this.cpInfoOffsets[currentCpInfoIndex++] = currentCpInfoOffset + 1;
/*      */       
/*  216 */       switch (classFileBuffer[currentCpInfoOffset]) {
/*      */         case 3:
/*      */         case 4:
/*      */         case 9:
/*      */         case 10:
/*      */         case 11:
/*      */         case 12:
/*  223 */           cpInfoSize = 5;
/*      */           break;
/*      */         case 17:
/*  226 */           cpInfoSize = 5;
/*  227 */           hasBootstrapMethods = true;
/*  228 */           hasConstantDynamic = true;
/*      */           break;
/*      */         case 18:
/*  231 */           cpInfoSize = 5;
/*  232 */           hasBootstrapMethods = true;
/*      */           break;
/*      */         case 5:
/*      */         case 6:
/*  236 */           cpInfoSize = 9;
/*  237 */           currentCpInfoIndex++;
/*      */           break;
/*      */         case 1:
/*  240 */           cpInfoSize = 3 + readUnsignedShort(currentCpInfoOffset + 1);
/*  241 */           if (cpInfoSize > currentMaxStringLength)
/*      */           {
/*      */ 
/*      */             
/*  245 */             currentMaxStringLength = cpInfoSize;
/*      */           }
/*      */           break;
/*      */         case 15:
/*  249 */           cpInfoSize = 4;
/*      */           break;
/*      */         case 7:
/*      */         case 8:
/*      */         case 16:
/*      */         case 19:
/*      */         case 20:
/*  256 */           cpInfoSize = 3;
/*      */           break;
/*      */         default:
/*  259 */           throw new IllegalArgumentException();
/*      */       } 
/*  261 */       currentCpInfoOffset += cpInfoSize;
/*      */     } 
/*  263 */     this.maxStringLength = currentMaxStringLength;
/*      */     
/*  265 */     this.header = currentCpInfoOffset;
/*      */ 
/*      */     
/*  268 */     this.constantDynamicValues = hasConstantDynamic ? new ConstantDynamic[constantPoolCount] : null;
/*      */ 
/*      */     
/*  271 */     this
/*  272 */       .bootstrapMethodOffsets = hasBootstrapMethods ? readBootstrapMethodsAttribute(currentMaxStringLength) : null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassReader(InputStream inputStream) throws IOException {
/*  284 */     this(readStream(inputStream, false));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassReader(String className) throws IOException {
/*  295 */     this(
/*  296 */         readStream(
/*  297 */           ClassLoader.getSystemResourceAsStream(className.replace('.', '/') + ".class"), true));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static byte[] readStream(InputStream inputStream, boolean close) throws IOException {
/*  310 */     if (inputStream == null)
/*  311 */       throw new IOException("Class not found"); 
/*      */     try {
/*  313 */       ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     finally {
/*      */ 
/*      */ 
/*      */       
/*  322 */       if (close) {
/*  323 */         inputStream.close();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getAccess() {
/*  340 */     return readUnsignedShort(this.header);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getClassName() {
/*  351 */     return readClass(this.header + 2, new char[this.maxStringLength]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSuperName() {
/*  363 */     return readClass(this.header + 4, new char[this.maxStringLength]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String[] getInterfaces() {
/*  375 */     int currentOffset = this.header + 6;
/*  376 */     int interfacesCount = readUnsignedShort(currentOffset);
/*  377 */     String[] interfaces = new String[interfacesCount];
/*  378 */     if (interfacesCount > 0) {
/*  379 */       char[] charBuffer = new char[this.maxStringLength];
/*  380 */       for (int i = 0; i < interfacesCount; i++) {
/*  381 */         currentOffset += 2;
/*  382 */         interfaces[i] = readClass(currentOffset, charBuffer);
/*      */       } 
/*      */     } 
/*  385 */     return interfaces;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void accept(ClassVisitor classVisitor, int parsingOptions) {
/*  401 */     accept(classVisitor, new Attribute[0], parsingOptions);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void accept(ClassVisitor classVisitor, Attribute[] attributePrototypes, int parsingOptions) {
/*  422 */     Context context = new Context();
/*  423 */     context.attributePrototypes = attributePrototypes;
/*  424 */     context.parsingOptions = parsingOptions;
/*  425 */     context.charBuffer = new char[this.maxStringLength];
/*      */ 
/*      */     
/*  428 */     char[] charBuffer = context.charBuffer;
/*  429 */     int currentOffset = this.header;
/*  430 */     int accessFlags = readUnsignedShort(currentOffset);
/*  431 */     String thisClass = readClass(currentOffset + 2, charBuffer);
/*  432 */     String superClass = readClass(currentOffset + 4, charBuffer);
/*  433 */     String[] interfaces = new String[readUnsignedShort(currentOffset + 6)];
/*  434 */     currentOffset += 8;
/*  435 */     for (int i = 0; i < interfaces.length; i++) {
/*  436 */       interfaces[i] = readClass(currentOffset, charBuffer);
/*  437 */       currentOffset += 2;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  443 */     int innerClassesOffset = 0;
/*      */     
/*  445 */     int enclosingMethodOffset = 0;
/*      */     
/*  447 */     String signature = null;
/*      */     
/*  449 */     String sourceFile = null;
/*      */     
/*  451 */     String sourceDebugExtension = null;
/*      */     
/*  453 */     int runtimeVisibleAnnotationsOffset = 0;
/*      */     
/*  455 */     int runtimeInvisibleAnnotationsOffset = 0;
/*      */     
/*  457 */     int runtimeVisibleTypeAnnotationsOffset = 0;
/*      */     
/*  459 */     int runtimeInvisibleTypeAnnotationsOffset = 0;
/*      */     
/*  461 */     int moduleOffset = 0;
/*      */     
/*  463 */     int modulePackagesOffset = 0;
/*      */     
/*  465 */     String moduleMainClass = null;
/*      */     
/*  467 */     String nestHostClass = null;
/*      */     
/*  469 */     int nestMembersOffset = 0;
/*      */     
/*  471 */     int permittedSubclassesOffset = 0;
/*      */     
/*  473 */     int recordOffset = 0;
/*      */ 
/*      */     
/*  476 */     Attribute attributes = null;
/*      */     
/*  478 */     int currentAttributeOffset = getFirstAttributeOffset();
/*  479 */     for (int j = readUnsignedShort(currentAttributeOffset - 2); j > 0; j--) {
/*      */       
/*  481 */       String attributeName = readUTF8(currentAttributeOffset, charBuffer);
/*  482 */       int attributeLength = readInt(currentAttributeOffset + 2);
/*  483 */       currentAttributeOffset += 6;
/*      */ 
/*      */       
/*  486 */       if ("SourceFile".equals(attributeName)) {
/*  487 */         sourceFile = readUTF8(currentAttributeOffset, charBuffer);
/*  488 */       } else if ("InnerClasses".equals(attributeName)) {
/*  489 */         innerClassesOffset = currentAttributeOffset;
/*  490 */       } else if ("EnclosingMethod".equals(attributeName)) {
/*  491 */         enclosingMethodOffset = currentAttributeOffset;
/*  492 */       } else if ("NestHost".equals(attributeName)) {
/*  493 */         nestHostClass = readClass(currentAttributeOffset, charBuffer);
/*  494 */       } else if ("NestMembers".equals(attributeName)) {
/*  495 */         nestMembersOffset = currentAttributeOffset;
/*  496 */       } else if ("PermittedSubclasses".equals(attributeName)) {
/*  497 */         permittedSubclassesOffset = currentAttributeOffset;
/*  498 */       } else if ("Signature".equals(attributeName)) {
/*  499 */         signature = readUTF8(currentAttributeOffset, charBuffer);
/*  500 */       } else if ("RuntimeVisibleAnnotations".equals(attributeName)) {
/*  501 */         runtimeVisibleAnnotationsOffset = currentAttributeOffset;
/*  502 */       } else if ("RuntimeVisibleTypeAnnotations".equals(attributeName)) {
/*  503 */         runtimeVisibleTypeAnnotationsOffset = currentAttributeOffset;
/*  504 */       } else if ("Deprecated".equals(attributeName)) {
/*  505 */         accessFlags |= 0x20000;
/*  506 */       } else if ("Synthetic".equals(attributeName)) {
/*  507 */         accessFlags |= 0x1000;
/*  508 */       } else if ("SourceDebugExtension".equals(attributeName)) {
/*  509 */         if (attributeLength > this.classFileBuffer.length - currentAttributeOffset) {
/*  510 */           throw new IllegalArgumentException();
/*      */         }
/*      */         
/*  513 */         sourceDebugExtension = readUtf(currentAttributeOffset, attributeLength, new char[attributeLength]);
/*  514 */       } else if ("RuntimeInvisibleAnnotations".equals(attributeName)) {
/*  515 */         runtimeInvisibleAnnotationsOffset = currentAttributeOffset;
/*  516 */       } else if ("RuntimeInvisibleTypeAnnotations".equals(attributeName)) {
/*  517 */         runtimeInvisibleTypeAnnotationsOffset = currentAttributeOffset;
/*  518 */       } else if ("Record".equals(attributeName)) {
/*  519 */         recordOffset = currentAttributeOffset;
/*  520 */         accessFlags |= 0x10000;
/*  521 */       } else if ("Module".equals(attributeName)) {
/*  522 */         moduleOffset = currentAttributeOffset;
/*  523 */       } else if ("ModuleMainClass".equals(attributeName)) {
/*  524 */         moduleMainClass = readClass(currentAttributeOffset, charBuffer);
/*  525 */       } else if ("ModulePackages".equals(attributeName)) {
/*  526 */         modulePackagesOffset = currentAttributeOffset;
/*  527 */       } else if (!"BootstrapMethods".equals(attributeName)) {
/*      */ 
/*      */         
/*  530 */         Attribute attribute = readAttribute(attributePrototypes, attributeName, currentAttributeOffset, attributeLength, charBuffer, -1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  538 */         attribute.nextAttribute = attributes;
/*  539 */         attributes = attribute;
/*      */       } 
/*  541 */       currentAttributeOffset += attributeLength;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  546 */     classVisitor.visit(
/*  547 */         readInt(this.cpInfoOffsets[1] - 7), accessFlags, thisClass, signature, superClass, interfaces);
/*      */ 
/*      */     
/*  550 */     if ((parsingOptions & 0x2) == 0 && (sourceFile != null || sourceDebugExtension != null))
/*      */     {
/*  552 */       classVisitor.visitSource(sourceFile, sourceDebugExtension);
/*      */     }
/*      */ 
/*      */     
/*  556 */     if (moduleOffset != 0) {
/*  557 */       readModuleAttributes(classVisitor, context, moduleOffset, modulePackagesOffset, moduleMainClass);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  562 */     if (nestHostClass != null) {
/*  563 */       classVisitor.visitNestHost(nestHostClass);
/*      */     }
/*      */ 
/*      */     
/*  567 */     if (enclosingMethodOffset != 0) {
/*  568 */       String className = readClass(enclosingMethodOffset, charBuffer);
/*  569 */       int methodIndex = readUnsignedShort(enclosingMethodOffset + 2);
/*  570 */       String name = (methodIndex == 0) ? null : readUTF8(this.cpInfoOffsets[methodIndex], charBuffer);
/*  571 */       String type = (methodIndex == 0) ? null : readUTF8(this.cpInfoOffsets[methodIndex] + 2, charBuffer);
/*  572 */       classVisitor.visitOuterClass(className, name, type);
/*      */     } 
/*      */ 
/*      */     
/*  576 */     if (runtimeVisibleAnnotationsOffset != 0) {
/*  577 */       int numAnnotations = readUnsignedShort(runtimeVisibleAnnotationsOffset);
/*  578 */       int currentAnnotationOffset = runtimeVisibleAnnotationsOffset + 2;
/*  579 */       while (numAnnotations-- > 0) {
/*      */         
/*  581 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  582 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  585 */         currentAnnotationOffset = readElementValues(classVisitor
/*  586 */             .visitAnnotation(annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  594 */     if (runtimeInvisibleAnnotationsOffset != 0) {
/*  595 */       int numAnnotations = readUnsignedShort(runtimeInvisibleAnnotationsOffset);
/*  596 */       int currentAnnotationOffset = runtimeInvisibleAnnotationsOffset + 2;
/*  597 */       while (numAnnotations-- > 0) {
/*      */         
/*  599 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  600 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  603 */         currentAnnotationOffset = readElementValues(classVisitor
/*  604 */             .visitAnnotation(annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  612 */     if (runtimeVisibleTypeAnnotationsOffset != 0) {
/*  613 */       int numAnnotations = readUnsignedShort(runtimeVisibleTypeAnnotationsOffset);
/*  614 */       int currentAnnotationOffset = runtimeVisibleTypeAnnotationsOffset + 2;
/*  615 */       while (numAnnotations-- > 0) {
/*      */         
/*  617 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/*  619 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  620 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  623 */         currentAnnotationOffset = readElementValues(classVisitor
/*  624 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  636 */     if (runtimeInvisibleTypeAnnotationsOffset != 0) {
/*  637 */       int numAnnotations = readUnsignedShort(runtimeInvisibleTypeAnnotationsOffset);
/*  638 */       int currentAnnotationOffset = runtimeInvisibleTypeAnnotationsOffset + 2;
/*  639 */       while (numAnnotations-- > 0) {
/*      */         
/*  641 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/*  643 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  644 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  647 */         currentAnnotationOffset = readElementValues(classVisitor
/*  648 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  660 */     while (attributes != null) {
/*      */       
/*  662 */       Attribute nextAttribute = attributes.nextAttribute;
/*  663 */       attributes.nextAttribute = null;
/*  664 */       classVisitor.visitAttribute(attributes);
/*  665 */       attributes = nextAttribute;
/*      */     } 
/*      */ 
/*      */     
/*  669 */     if (nestMembersOffset != 0) {
/*  670 */       int numberOfNestMembers = readUnsignedShort(nestMembersOffset);
/*  671 */       int currentNestMemberOffset = nestMembersOffset + 2;
/*  672 */       while (numberOfNestMembers-- > 0) {
/*  673 */         classVisitor.visitNestMember(readClass(currentNestMemberOffset, charBuffer));
/*  674 */         currentNestMemberOffset += 2;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  679 */     if (permittedSubclassesOffset != 0) {
/*  680 */       int numberOfPermittedSubclasses = readUnsignedShort(permittedSubclassesOffset);
/*  681 */       int currentPermittedSubclassesOffset = permittedSubclassesOffset + 2;
/*  682 */       while (numberOfPermittedSubclasses-- > 0) {
/*  683 */         classVisitor.visitPermittedSubclass(
/*  684 */             readClass(currentPermittedSubclassesOffset, charBuffer));
/*  685 */         currentPermittedSubclassesOffset += 2;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  690 */     if (innerClassesOffset != 0) {
/*  691 */       int numberOfClasses = readUnsignedShort(innerClassesOffset);
/*  692 */       int currentClassesOffset = innerClassesOffset + 2;
/*  693 */       while (numberOfClasses-- > 0) {
/*  694 */         classVisitor.visitInnerClass(
/*  695 */             readClass(currentClassesOffset, charBuffer), 
/*  696 */             readClass(currentClassesOffset + 2, charBuffer), 
/*  697 */             readUTF8(currentClassesOffset + 4, charBuffer), 
/*  698 */             readUnsignedShort(currentClassesOffset + 6));
/*  699 */         currentClassesOffset += 8;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  704 */     if (recordOffset != 0) {
/*  705 */       int recordComponentsCount = readUnsignedShort(recordOffset);
/*  706 */       recordOffset += 2;
/*  707 */       while (recordComponentsCount-- > 0) {
/*  708 */         recordOffset = readRecordComponent(classVisitor, context, recordOffset);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  713 */     int fieldsCount = readUnsignedShort(currentOffset);
/*  714 */     currentOffset += 2;
/*  715 */     while (fieldsCount-- > 0) {
/*  716 */       currentOffset = readField(classVisitor, context, currentOffset);
/*      */     }
/*  718 */     int methodsCount = readUnsignedShort(currentOffset);
/*  719 */     currentOffset += 2;
/*  720 */     while (methodsCount-- > 0) {
/*  721 */       currentOffset = readMethod(classVisitor, context, currentOffset);
/*      */     }
/*      */ 
/*      */     
/*  725 */     classVisitor.visitEnd();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void readModuleAttributes(ClassVisitor classVisitor, Context context, int moduleOffset, int modulePackagesOffset, String moduleMainClass) {
/*  750 */     char[] buffer = context.charBuffer;
/*      */ 
/*      */     
/*  753 */     int currentOffset = moduleOffset;
/*  754 */     String moduleName = readModule(currentOffset, buffer);
/*  755 */     int moduleFlags = readUnsignedShort(currentOffset + 2);
/*  756 */     String moduleVersion = readUTF8(currentOffset + 4, buffer);
/*  757 */     currentOffset += 6;
/*  758 */     ModuleVisitor moduleVisitor = classVisitor.visitModule(moduleName, moduleFlags, moduleVersion);
/*  759 */     if (moduleVisitor == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  764 */     if (moduleMainClass != null) {
/*  765 */       moduleVisitor.visitMainClass(moduleMainClass);
/*      */     }
/*      */ 
/*      */     
/*  769 */     if (modulePackagesOffset != 0) {
/*  770 */       int packageCount = readUnsignedShort(modulePackagesOffset);
/*  771 */       int currentPackageOffset = modulePackagesOffset + 2;
/*  772 */       while (packageCount-- > 0) {
/*  773 */         moduleVisitor.visitPackage(readPackage(currentPackageOffset, buffer));
/*  774 */         currentPackageOffset += 2;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  779 */     int requiresCount = readUnsignedShort(currentOffset);
/*  780 */     currentOffset += 2;
/*  781 */     while (requiresCount-- > 0) {
/*      */       
/*  783 */       String requires = readModule(currentOffset, buffer);
/*  784 */       int requiresFlags = readUnsignedShort(currentOffset + 2);
/*  785 */       String requiresVersion = readUTF8(currentOffset + 4, buffer);
/*  786 */       currentOffset += 6;
/*  787 */       moduleVisitor.visitRequire(requires, requiresFlags, requiresVersion);
/*      */     } 
/*      */ 
/*      */     
/*  791 */     int exportsCount = readUnsignedShort(currentOffset);
/*  792 */     currentOffset += 2;
/*  793 */     while (exportsCount-- > 0) {
/*      */ 
/*      */       
/*  796 */       String exports = readPackage(currentOffset, buffer);
/*  797 */       int exportsFlags = readUnsignedShort(currentOffset + 2);
/*  798 */       int exportsToCount = readUnsignedShort(currentOffset + 4);
/*  799 */       currentOffset += 6;
/*  800 */       String[] exportsTo = null;
/*  801 */       if (exportsToCount != 0) {
/*  802 */         exportsTo = new String[exportsToCount];
/*  803 */         for (int i = 0; i < exportsToCount; i++) {
/*  804 */           exportsTo[i] = readModule(currentOffset, buffer);
/*  805 */           currentOffset += 2;
/*      */         } 
/*      */       } 
/*  808 */       moduleVisitor.visitExport(exports, exportsFlags, exportsTo);
/*      */     } 
/*      */ 
/*      */     
/*  812 */     int opensCount = readUnsignedShort(currentOffset);
/*  813 */     currentOffset += 2;
/*  814 */     while (opensCount-- > 0) {
/*      */       
/*  816 */       String opens = readPackage(currentOffset, buffer);
/*  817 */       int opensFlags = readUnsignedShort(currentOffset + 2);
/*  818 */       int opensToCount = readUnsignedShort(currentOffset + 4);
/*  819 */       currentOffset += 6;
/*  820 */       String[] opensTo = null;
/*  821 */       if (opensToCount != 0) {
/*  822 */         opensTo = new String[opensToCount];
/*  823 */         for (int i = 0; i < opensToCount; i++) {
/*  824 */           opensTo[i] = readModule(currentOffset, buffer);
/*  825 */           currentOffset += 2;
/*      */         } 
/*      */       } 
/*  828 */       moduleVisitor.visitOpen(opens, opensFlags, opensTo);
/*      */     } 
/*      */ 
/*      */     
/*  832 */     int usesCount = readUnsignedShort(currentOffset);
/*  833 */     currentOffset += 2;
/*  834 */     while (usesCount-- > 0) {
/*  835 */       moduleVisitor.visitUse(readClass(currentOffset, buffer));
/*  836 */       currentOffset += 2;
/*      */     } 
/*      */ 
/*      */     
/*  840 */     int providesCount = readUnsignedShort(currentOffset);
/*  841 */     currentOffset += 2;
/*  842 */     while (providesCount-- > 0) {
/*      */       
/*  844 */       String provides = readClass(currentOffset, buffer);
/*  845 */       int providesWithCount = readUnsignedShort(currentOffset + 2);
/*  846 */       currentOffset += 4;
/*  847 */       String[] providesWith = new String[providesWithCount];
/*  848 */       for (int i = 0; i < providesWithCount; i++) {
/*  849 */         providesWith[i] = readClass(currentOffset, buffer);
/*  850 */         currentOffset += 2;
/*      */       } 
/*  852 */       moduleVisitor.visitProvide(provides, providesWith);
/*      */     } 
/*      */ 
/*      */     
/*  856 */     moduleVisitor.visitEnd();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readRecordComponent(ClassVisitor classVisitor, Context context, int recordComponentOffset) {
/*  869 */     char[] charBuffer = context.charBuffer;
/*      */     
/*  871 */     int currentOffset = recordComponentOffset;
/*  872 */     String name = readUTF8(currentOffset, charBuffer);
/*  873 */     String descriptor = readUTF8(currentOffset + 2, charBuffer);
/*  874 */     currentOffset += 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  881 */     String signature = null;
/*      */     
/*  883 */     int runtimeVisibleAnnotationsOffset = 0;
/*      */     
/*  885 */     int runtimeInvisibleAnnotationsOffset = 0;
/*      */     
/*  887 */     int runtimeVisibleTypeAnnotationsOffset = 0;
/*      */     
/*  889 */     int runtimeInvisibleTypeAnnotationsOffset = 0;
/*      */ 
/*      */     
/*  892 */     Attribute attributes = null;
/*      */     
/*  894 */     int attributesCount = readUnsignedShort(currentOffset);
/*  895 */     currentOffset += 2;
/*  896 */     while (attributesCount-- > 0) {
/*      */       
/*  898 */       String attributeName = readUTF8(currentOffset, charBuffer);
/*  899 */       int attributeLength = readInt(currentOffset + 2);
/*  900 */       currentOffset += 6;
/*      */ 
/*      */       
/*  903 */       if ("Signature".equals(attributeName)) {
/*  904 */         signature = readUTF8(currentOffset, charBuffer);
/*  905 */       } else if ("RuntimeVisibleAnnotations".equals(attributeName)) {
/*  906 */         runtimeVisibleAnnotationsOffset = currentOffset;
/*  907 */       } else if ("RuntimeVisibleTypeAnnotations".equals(attributeName)) {
/*  908 */         runtimeVisibleTypeAnnotationsOffset = currentOffset;
/*  909 */       } else if ("RuntimeInvisibleAnnotations".equals(attributeName)) {
/*  910 */         runtimeInvisibleAnnotationsOffset = currentOffset;
/*  911 */       } else if ("RuntimeInvisibleTypeAnnotations".equals(attributeName)) {
/*  912 */         runtimeInvisibleTypeAnnotationsOffset = currentOffset;
/*      */       } else {
/*      */         
/*  915 */         Attribute attribute = readAttribute(context.attributePrototypes, attributeName, currentOffset, attributeLength, charBuffer, -1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  923 */         attribute.nextAttribute = attributes;
/*  924 */         attributes = attribute;
/*      */       } 
/*  926 */       currentOffset += attributeLength;
/*      */     } 
/*      */ 
/*      */     
/*  930 */     RecordComponentVisitor recordComponentVisitor = classVisitor.visitRecordComponent(name, descriptor, signature);
/*  931 */     if (recordComponentVisitor == null) {
/*  932 */       return currentOffset;
/*      */     }
/*      */ 
/*      */     
/*  936 */     if (runtimeVisibleAnnotationsOffset != 0) {
/*  937 */       int numAnnotations = readUnsignedShort(runtimeVisibleAnnotationsOffset);
/*  938 */       int currentAnnotationOffset = runtimeVisibleAnnotationsOffset + 2;
/*  939 */       while (numAnnotations-- > 0) {
/*      */         
/*  941 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  942 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  945 */         currentAnnotationOffset = readElementValues(recordComponentVisitor
/*  946 */             .visitAnnotation(annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  954 */     if (runtimeInvisibleAnnotationsOffset != 0) {
/*  955 */       int numAnnotations = readUnsignedShort(runtimeInvisibleAnnotationsOffset);
/*  956 */       int currentAnnotationOffset = runtimeInvisibleAnnotationsOffset + 2;
/*  957 */       while (numAnnotations-- > 0) {
/*      */         
/*  959 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  960 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  963 */         currentAnnotationOffset = readElementValues(recordComponentVisitor
/*  964 */             .visitAnnotation(annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  972 */     if (runtimeVisibleTypeAnnotationsOffset != 0) {
/*  973 */       int numAnnotations = readUnsignedShort(runtimeVisibleTypeAnnotationsOffset);
/*  974 */       int currentAnnotationOffset = runtimeVisibleTypeAnnotationsOffset + 2;
/*  975 */       while (numAnnotations-- > 0) {
/*      */         
/*  977 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/*  979 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/*  980 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/*  983 */         currentAnnotationOffset = readElementValues(recordComponentVisitor
/*  984 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  996 */     if (runtimeInvisibleTypeAnnotationsOffset != 0) {
/*  997 */       int numAnnotations = readUnsignedShort(runtimeInvisibleTypeAnnotationsOffset);
/*  998 */       int currentAnnotationOffset = runtimeInvisibleTypeAnnotationsOffset + 2;
/*  999 */       while (numAnnotations-- > 0) {
/*      */         
/* 1001 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/* 1003 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1004 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1007 */         currentAnnotationOffset = readElementValues(recordComponentVisitor
/* 1008 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1020 */     while (attributes != null) {
/*      */       
/* 1022 */       Attribute nextAttribute = attributes.nextAttribute;
/* 1023 */       attributes.nextAttribute = null;
/* 1024 */       recordComponentVisitor.visitAttribute(attributes);
/* 1025 */       attributes = nextAttribute;
/*      */     } 
/*      */ 
/*      */     
/* 1029 */     recordComponentVisitor.visitEnd();
/* 1030 */     return currentOffset;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readField(ClassVisitor classVisitor, Context context, int fieldInfoOffset) {
/* 1043 */     char[] charBuffer = context.charBuffer;
/*      */ 
/*      */     
/* 1046 */     int currentOffset = fieldInfoOffset;
/* 1047 */     int accessFlags = readUnsignedShort(currentOffset);
/* 1048 */     String name = readUTF8(currentOffset + 2, charBuffer);
/* 1049 */     String descriptor = readUTF8(currentOffset + 4, charBuffer);
/* 1050 */     currentOffset += 6;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1055 */     Object constantValue = null;
/*      */     
/* 1057 */     String signature = null;
/*      */     
/* 1059 */     int runtimeVisibleAnnotationsOffset = 0;
/*      */     
/* 1061 */     int runtimeInvisibleAnnotationsOffset = 0;
/*      */     
/* 1063 */     int runtimeVisibleTypeAnnotationsOffset = 0;
/*      */     
/* 1065 */     int runtimeInvisibleTypeAnnotationsOffset = 0;
/*      */ 
/*      */     
/* 1068 */     Attribute attributes = null;
/*      */     
/* 1070 */     int attributesCount = readUnsignedShort(currentOffset);
/* 1071 */     currentOffset += 2;
/* 1072 */     while (attributesCount-- > 0) {
/*      */       
/* 1074 */       String attributeName = readUTF8(currentOffset, charBuffer);
/* 1075 */       int attributeLength = readInt(currentOffset + 2);
/* 1076 */       currentOffset += 6;
/*      */ 
/*      */       
/* 1079 */       if ("ConstantValue".equals(attributeName)) {
/* 1080 */         int constantvalueIndex = readUnsignedShort(currentOffset);
/* 1081 */         constantValue = (constantvalueIndex == 0) ? null : readConst(constantvalueIndex, charBuffer);
/* 1082 */       } else if ("Signature".equals(attributeName)) {
/* 1083 */         signature = readUTF8(currentOffset, charBuffer);
/* 1084 */       } else if ("Deprecated".equals(attributeName)) {
/* 1085 */         accessFlags |= 0x20000;
/* 1086 */       } else if ("Synthetic".equals(attributeName)) {
/* 1087 */         accessFlags |= 0x1000;
/* 1088 */       } else if ("RuntimeVisibleAnnotations".equals(attributeName)) {
/* 1089 */         runtimeVisibleAnnotationsOffset = currentOffset;
/* 1090 */       } else if ("RuntimeVisibleTypeAnnotations".equals(attributeName)) {
/* 1091 */         runtimeVisibleTypeAnnotationsOffset = currentOffset;
/* 1092 */       } else if ("RuntimeInvisibleAnnotations".equals(attributeName)) {
/* 1093 */         runtimeInvisibleAnnotationsOffset = currentOffset;
/* 1094 */       } else if ("RuntimeInvisibleTypeAnnotations".equals(attributeName)) {
/* 1095 */         runtimeInvisibleTypeAnnotationsOffset = currentOffset;
/*      */       } else {
/*      */         
/* 1098 */         Attribute attribute = readAttribute(context.attributePrototypes, attributeName, currentOffset, attributeLength, charBuffer, -1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1106 */         attribute.nextAttribute = attributes;
/* 1107 */         attributes = attribute;
/*      */       } 
/* 1109 */       currentOffset += attributeLength;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1114 */     FieldVisitor fieldVisitor = classVisitor.visitField(accessFlags, name, descriptor, signature, constantValue);
/* 1115 */     if (fieldVisitor == null) {
/* 1116 */       return currentOffset;
/*      */     }
/*      */ 
/*      */     
/* 1120 */     if (runtimeVisibleAnnotationsOffset != 0) {
/* 1121 */       int numAnnotations = readUnsignedShort(runtimeVisibleAnnotationsOffset);
/* 1122 */       int currentAnnotationOffset = runtimeVisibleAnnotationsOffset + 2;
/* 1123 */       while (numAnnotations-- > 0) {
/*      */         
/* 1125 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1126 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1129 */         currentAnnotationOffset = readElementValues(fieldVisitor
/* 1130 */             .visitAnnotation(annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1138 */     if (runtimeInvisibleAnnotationsOffset != 0) {
/* 1139 */       int numAnnotations = readUnsignedShort(runtimeInvisibleAnnotationsOffset);
/* 1140 */       int currentAnnotationOffset = runtimeInvisibleAnnotationsOffset + 2;
/* 1141 */       while (numAnnotations-- > 0) {
/*      */         
/* 1143 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1144 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1147 */         currentAnnotationOffset = readElementValues(fieldVisitor
/* 1148 */             .visitAnnotation(annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1156 */     if (runtimeVisibleTypeAnnotationsOffset != 0) {
/* 1157 */       int numAnnotations = readUnsignedShort(runtimeVisibleTypeAnnotationsOffset);
/* 1158 */       int currentAnnotationOffset = runtimeVisibleTypeAnnotationsOffset + 2;
/* 1159 */       while (numAnnotations-- > 0) {
/*      */         
/* 1161 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/* 1163 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1164 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1167 */         currentAnnotationOffset = readElementValues(fieldVisitor
/* 1168 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1180 */     if (runtimeInvisibleTypeAnnotationsOffset != 0) {
/* 1181 */       int numAnnotations = readUnsignedShort(runtimeInvisibleTypeAnnotationsOffset);
/* 1182 */       int currentAnnotationOffset = runtimeInvisibleTypeAnnotationsOffset + 2;
/* 1183 */       while (numAnnotations-- > 0) {
/*      */         
/* 1185 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/* 1187 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1188 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1191 */         currentAnnotationOffset = readElementValues(fieldVisitor
/* 1192 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1204 */     while (attributes != null) {
/*      */       
/* 1206 */       Attribute nextAttribute = attributes.nextAttribute;
/* 1207 */       attributes.nextAttribute = null;
/* 1208 */       fieldVisitor.visitAttribute(attributes);
/* 1209 */       attributes = nextAttribute;
/*      */     } 
/*      */ 
/*      */     
/* 1213 */     fieldVisitor.visitEnd();
/* 1214 */     return currentOffset;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readMethod(ClassVisitor classVisitor, Context context, int methodInfoOffset) {
/* 1227 */     char[] charBuffer = context.charBuffer;
/*      */ 
/*      */     
/* 1230 */     int currentOffset = methodInfoOffset;
/* 1231 */     context.currentMethodAccessFlags = readUnsignedShort(currentOffset);
/* 1232 */     context.currentMethodName = readUTF8(currentOffset + 2, charBuffer);
/* 1233 */     context.currentMethodDescriptor = readUTF8(currentOffset + 4, charBuffer);
/* 1234 */     currentOffset += 6;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1239 */     int codeOffset = 0;
/*      */     
/* 1241 */     int exceptionsOffset = 0;
/*      */     
/* 1243 */     String[] exceptions = null;
/*      */     
/* 1245 */     boolean synthetic = false;
/*      */     
/* 1247 */     int signatureIndex = 0;
/*      */     
/* 1249 */     int runtimeVisibleAnnotationsOffset = 0;
/*      */     
/* 1251 */     int runtimeInvisibleAnnotationsOffset = 0;
/*      */     
/* 1253 */     int runtimeVisibleParameterAnnotationsOffset = 0;
/*      */     
/* 1255 */     int runtimeInvisibleParameterAnnotationsOffset = 0;
/*      */     
/* 1257 */     int runtimeVisibleTypeAnnotationsOffset = 0;
/*      */     
/* 1259 */     int runtimeInvisibleTypeAnnotationsOffset = 0;
/*      */     
/* 1261 */     int annotationDefaultOffset = 0;
/*      */     
/* 1263 */     int methodParametersOffset = 0;
/*      */ 
/*      */     
/* 1266 */     Attribute attributes = null;
/*      */     
/* 1268 */     int attributesCount = readUnsignedShort(currentOffset);
/* 1269 */     currentOffset += 2;
/* 1270 */     while (attributesCount-- > 0) {
/*      */       
/* 1272 */       String attributeName = readUTF8(currentOffset, charBuffer);
/* 1273 */       int attributeLength = readInt(currentOffset + 2);
/* 1274 */       currentOffset += 6;
/*      */ 
/*      */       
/* 1277 */       if ("Code".equals(attributeName)) {
/* 1278 */         if ((context.parsingOptions & 0x1) == 0) {
/* 1279 */           codeOffset = currentOffset;
/*      */         }
/* 1281 */       } else if ("Exceptions".equals(attributeName)) {
/* 1282 */         exceptionsOffset = currentOffset;
/* 1283 */         exceptions = new String[readUnsignedShort(exceptionsOffset)];
/* 1284 */         int currentExceptionOffset = exceptionsOffset + 2;
/* 1285 */         for (int i = 0; i < exceptions.length; i++) {
/* 1286 */           exceptions[i] = readClass(currentExceptionOffset, charBuffer);
/* 1287 */           currentExceptionOffset += 2;
/*      */         } 
/* 1289 */       } else if ("Signature".equals(attributeName)) {
/* 1290 */         signatureIndex = readUnsignedShort(currentOffset);
/* 1291 */       } else if ("Deprecated".equals(attributeName)) {
/* 1292 */         context.currentMethodAccessFlags |= 0x20000;
/* 1293 */       } else if ("RuntimeVisibleAnnotations".equals(attributeName)) {
/* 1294 */         runtimeVisibleAnnotationsOffset = currentOffset;
/* 1295 */       } else if ("RuntimeVisibleTypeAnnotations".equals(attributeName)) {
/* 1296 */         runtimeVisibleTypeAnnotationsOffset = currentOffset;
/* 1297 */       } else if ("AnnotationDefault".equals(attributeName)) {
/* 1298 */         annotationDefaultOffset = currentOffset;
/* 1299 */       } else if ("Synthetic".equals(attributeName)) {
/* 1300 */         synthetic = true;
/* 1301 */         context.currentMethodAccessFlags |= 0x1000;
/* 1302 */       } else if ("RuntimeInvisibleAnnotations".equals(attributeName)) {
/* 1303 */         runtimeInvisibleAnnotationsOffset = currentOffset;
/* 1304 */       } else if ("RuntimeInvisibleTypeAnnotations".equals(attributeName)) {
/* 1305 */         runtimeInvisibleTypeAnnotationsOffset = currentOffset;
/* 1306 */       } else if ("RuntimeVisibleParameterAnnotations".equals(attributeName)) {
/* 1307 */         runtimeVisibleParameterAnnotationsOffset = currentOffset;
/* 1308 */       } else if ("RuntimeInvisibleParameterAnnotations".equals(attributeName)) {
/* 1309 */         runtimeInvisibleParameterAnnotationsOffset = currentOffset;
/* 1310 */       } else if ("MethodParameters".equals(attributeName)) {
/* 1311 */         methodParametersOffset = currentOffset;
/*      */       } else {
/*      */         
/* 1314 */         Attribute attribute = readAttribute(context.attributePrototypes, attributeName, currentOffset, attributeLength, charBuffer, -1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1322 */         attribute.nextAttribute = attributes;
/* 1323 */         attributes = attribute;
/*      */       } 
/* 1325 */       currentOffset += attributeLength;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1330 */     MethodVisitor methodVisitor = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, 
/*      */ 
/*      */ 
/*      */         
/* 1334 */         (signatureIndex == 0) ? null : readUtf(signatureIndex, charBuffer), exceptions);
/*      */     
/* 1336 */     if (methodVisitor == null) {
/* 1337 */       return currentOffset;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1344 */     if (methodVisitor instanceof MethodWriter) {
/* 1345 */       MethodWriter methodWriter = (MethodWriter)methodVisitor;
/* 1346 */       if (methodWriter.canCopyMethodAttributes(this, synthetic, ((context.currentMethodAccessFlags & 0x20000) != 0), 
/*      */ 
/*      */ 
/*      */           
/* 1350 */           readUnsignedShort(methodInfoOffset + 4), signatureIndex, exceptionsOffset)) {
/*      */ 
/*      */         
/* 1353 */         methodWriter.setMethodAttributesSource(methodInfoOffset, currentOffset - methodInfoOffset);
/* 1354 */         return currentOffset;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1359 */     if (methodParametersOffset != 0 && (context.parsingOptions & 0x2) == 0) {
/* 1360 */       int parametersCount = readByte(methodParametersOffset);
/* 1361 */       int currentParameterOffset = methodParametersOffset + 1;
/* 1362 */       while (parametersCount-- > 0) {
/*      */         
/* 1364 */         methodVisitor.visitParameter(
/* 1365 */             readUTF8(currentParameterOffset, charBuffer), 
/* 1366 */             readUnsignedShort(currentParameterOffset + 2));
/* 1367 */         currentParameterOffset += 4;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1372 */     if (annotationDefaultOffset != 0) {
/* 1373 */       AnnotationVisitor annotationVisitor = methodVisitor.visitAnnotationDefault();
/* 1374 */       readElementValue(annotationVisitor, annotationDefaultOffset, null, charBuffer);
/* 1375 */       if (annotationVisitor != null) {
/* 1376 */         annotationVisitor.visitEnd();
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1381 */     if (runtimeVisibleAnnotationsOffset != 0) {
/* 1382 */       int numAnnotations = readUnsignedShort(runtimeVisibleAnnotationsOffset);
/* 1383 */       int currentAnnotationOffset = runtimeVisibleAnnotationsOffset + 2;
/* 1384 */       while (numAnnotations-- > 0) {
/*      */         
/* 1386 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1387 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1390 */         currentAnnotationOffset = readElementValues(methodVisitor
/* 1391 */             .visitAnnotation(annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1399 */     if (runtimeInvisibleAnnotationsOffset != 0) {
/* 1400 */       int numAnnotations = readUnsignedShort(runtimeInvisibleAnnotationsOffset);
/* 1401 */       int currentAnnotationOffset = runtimeInvisibleAnnotationsOffset + 2;
/* 1402 */       while (numAnnotations-- > 0) {
/*      */         
/* 1404 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1405 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1408 */         currentAnnotationOffset = readElementValues(methodVisitor
/* 1409 */             .visitAnnotation(annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1417 */     if (runtimeVisibleTypeAnnotationsOffset != 0) {
/* 1418 */       int numAnnotations = readUnsignedShort(runtimeVisibleTypeAnnotationsOffset);
/* 1419 */       int currentAnnotationOffset = runtimeVisibleTypeAnnotationsOffset + 2;
/* 1420 */       while (numAnnotations-- > 0) {
/*      */         
/* 1422 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/* 1424 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1425 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1428 */         currentAnnotationOffset = readElementValues(methodVisitor
/* 1429 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1441 */     if (runtimeInvisibleTypeAnnotationsOffset != 0) {
/* 1442 */       int numAnnotations = readUnsignedShort(runtimeInvisibleTypeAnnotationsOffset);
/* 1443 */       int currentAnnotationOffset = runtimeInvisibleTypeAnnotationsOffset + 2;
/* 1444 */       while (numAnnotations-- > 0) {
/*      */         
/* 1446 */         currentAnnotationOffset = readTypeAnnotationTarget(context, currentAnnotationOffset);
/*      */         
/* 1448 */         String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 1449 */         currentAnnotationOffset += 2;
/*      */ 
/*      */         
/* 1452 */         currentAnnotationOffset = readElementValues(methodVisitor
/* 1453 */             .visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1465 */     if (runtimeVisibleParameterAnnotationsOffset != 0) {
/* 1466 */       readParameterAnnotations(methodVisitor, context, runtimeVisibleParameterAnnotationsOffset, true);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1471 */     if (runtimeInvisibleParameterAnnotationsOffset != 0) {
/* 1472 */       readParameterAnnotations(methodVisitor, context, runtimeInvisibleParameterAnnotationsOffset, false);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1480 */     while (attributes != null) {
/*      */       
/* 1482 */       Attribute nextAttribute = attributes.nextAttribute;
/* 1483 */       attributes.nextAttribute = null;
/* 1484 */       methodVisitor.visitAttribute(attributes);
/* 1485 */       attributes = nextAttribute;
/*      */     } 
/*      */ 
/*      */     
/* 1489 */     if (codeOffset != 0) {
/* 1490 */       methodVisitor.visitCode();
/* 1491 */       readCode(methodVisitor, context, codeOffset);
/*      */     } 
/*      */ 
/*      */     
/* 1495 */     methodVisitor.visitEnd();
/* 1496 */     return currentOffset;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void readCode(MethodVisitor methodVisitor, Context context, int codeOffset) {
/* 1513 */     int currentOffset = codeOffset;
/*      */ 
/*      */     
/* 1516 */     byte[] classBuffer = this.classFileBuffer;
/* 1517 */     char[] charBuffer = context.charBuffer;
/* 1518 */     int maxStack = readUnsignedShort(currentOffset);
/* 1519 */     int maxLocals = readUnsignedShort(currentOffset + 2);
/* 1520 */     int codeLength = readInt(currentOffset + 4);
/* 1521 */     currentOffset += 8;
/* 1522 */     if (codeLength > this.classFileBuffer.length - currentOffset) {
/* 1523 */       throw new IllegalArgumentException();
/*      */     }
/*      */ 
/*      */     
/* 1527 */     int bytecodeStartOffset = currentOffset;
/* 1528 */     int bytecodeEndOffset = currentOffset + codeLength;
/* 1529 */     Label[] labels = context.currentMethodLabels = new Label[codeLength + 1];
/* 1530 */     while (currentOffset < bytecodeEndOffset) {
/* 1531 */       int numTableEntries, numSwitchCases, bytecodeOffset = currentOffset - bytecodeStartOffset;
/* 1532 */       int opcode = classBuffer[currentOffset] & 0xFF;
/* 1533 */       switch (opcode) {
/*      */         case 0:
/*      */         case 1:
/*      */         case 2:
/*      */         case 3:
/*      */         case 4:
/*      */         case 5:
/*      */         case 6:
/*      */         case 7:
/*      */         case 8:
/*      */         case 9:
/*      */         case 10:
/*      */         case 11:
/*      */         case 12:
/*      */         case 13:
/*      */         case 14:
/*      */         case 15:
/*      */         case 26:
/*      */         case 27:
/*      */         case 28:
/*      */         case 29:
/*      */         case 30:
/*      */         case 31:
/*      */         case 32:
/*      */         case 33:
/*      */         case 34:
/*      */         case 35:
/*      */         case 36:
/*      */         case 37:
/*      */         case 38:
/*      */         case 39:
/*      */         case 40:
/*      */         case 41:
/*      */         case 42:
/*      */         case 43:
/*      */         case 44:
/*      */         case 45:
/*      */         case 46:
/*      */         case 47:
/*      */         case 48:
/*      */         case 49:
/*      */         case 50:
/*      */         case 51:
/*      */         case 52:
/*      */         case 53:
/*      */         case 59:
/*      */         case 60:
/*      */         case 61:
/*      */         case 62:
/*      */         case 63:
/*      */         case 64:
/*      */         case 65:
/*      */         case 66:
/*      */         case 67:
/*      */         case 68:
/*      */         case 69:
/*      */         case 70:
/*      */         case 71:
/*      */         case 72:
/*      */         case 73:
/*      */         case 74:
/*      */         case 75:
/*      */         case 76:
/*      */         case 77:
/*      */         case 78:
/*      */         case 79:
/*      */         case 80:
/*      */         case 81:
/*      */         case 82:
/*      */         case 83:
/*      */         case 84:
/*      */         case 85:
/*      */         case 86:
/*      */         case 87:
/*      */         case 88:
/*      */         case 89:
/*      */         case 90:
/*      */         case 91:
/*      */         case 92:
/*      */         case 93:
/*      */         case 94:
/*      */         case 95:
/*      */         case 96:
/*      */         case 97:
/*      */         case 98:
/*      */         case 99:
/*      */         case 100:
/*      */         case 101:
/*      */         case 102:
/*      */         case 103:
/*      */         case 104:
/*      */         case 105:
/*      */         case 106:
/*      */         case 107:
/*      */         case 108:
/*      */         case 109:
/*      */         case 110:
/*      */         case 111:
/*      */         case 112:
/*      */         case 113:
/*      */         case 114:
/*      */         case 115:
/*      */         case 116:
/*      */         case 117:
/*      */         case 118:
/*      */         case 119:
/*      */         case 120:
/*      */         case 121:
/*      */         case 122:
/*      */         case 123:
/*      */         case 124:
/*      */         case 125:
/*      */         case 126:
/*      */         case 127:
/*      */         case 128:
/*      */         case 129:
/*      */         case 130:
/*      */         case 131:
/*      */         case 133:
/*      */         case 134:
/*      */         case 135:
/*      */         case 136:
/*      */         case 137:
/*      */         case 138:
/*      */         case 139:
/*      */         case 140:
/*      */         case 141:
/*      */         case 142:
/*      */         case 143:
/*      */         case 144:
/*      */         case 145:
/*      */         case 146:
/*      */         case 147:
/*      */         case 148:
/*      */         case 149:
/*      */         case 150:
/*      */         case 151:
/*      */         case 152:
/*      */         case 172:
/*      */         case 173:
/*      */         case 174:
/*      */         case 175:
/*      */         case 176:
/*      */         case 177:
/*      */         case 190:
/*      */         case 191:
/*      */         case 194:
/*      */         case 195:
/* 1681 */           currentOffset++;
/*      */           continue;
/*      */         case 153:
/*      */         case 154:
/*      */         case 155:
/*      */         case 156:
/*      */         case 157:
/*      */         case 158:
/*      */         case 159:
/*      */         case 160:
/*      */         case 161:
/*      */         case 162:
/*      */         case 163:
/*      */         case 164:
/*      */         case 165:
/*      */         case 166:
/*      */         case 167:
/*      */         case 168:
/*      */         case 198:
/*      */         case 199:
/* 1701 */           createLabel(bytecodeOffset + readShort(currentOffset + 1), labels);
/* 1702 */           currentOffset += 3;
/*      */           continue;
/*      */         case 202:
/*      */         case 203:
/*      */         case 204:
/*      */         case 205:
/*      */         case 206:
/*      */         case 207:
/*      */         case 208:
/*      */         case 209:
/*      */         case 210:
/*      */         case 211:
/*      */         case 212:
/*      */         case 213:
/*      */         case 214:
/*      */         case 215:
/*      */         case 216:
/*      */         case 217:
/*      */         case 218:
/*      */         case 219:
/* 1722 */           createLabel(bytecodeOffset + readUnsignedShort(currentOffset + 1), labels);
/* 1723 */           currentOffset += 3;
/*      */           continue;
/*      */         case 200:
/*      */         case 201:
/*      */         case 220:
/* 1728 */           createLabel(bytecodeOffset + readInt(currentOffset + 1), labels);
/* 1729 */           currentOffset += 5;
/*      */           continue;
/*      */         case 196:
/* 1732 */           switch (classBuffer[currentOffset + 1] & 0xFF) {
/*      */             case 21:
/*      */             case 22:
/*      */             case 23:
/*      */             case 24:
/*      */             case 25:
/*      */             case 54:
/*      */             case 55:
/*      */             case 56:
/*      */             case 57:
/*      */             case 58:
/*      */             case 169:
/* 1744 */               currentOffset += 4;
/*      */               continue;
/*      */             case 132:
/* 1747 */               currentOffset += 6;
/*      */               continue;
/*      */           } 
/* 1750 */           throw new IllegalArgumentException();
/*      */ 
/*      */ 
/*      */         
/*      */         case 170:
/* 1755 */           currentOffset += 4 - (bytecodeOffset & 0x3);
/*      */           
/* 1757 */           createLabel(bytecodeOffset + readInt(currentOffset), labels);
/* 1758 */           numTableEntries = readInt(currentOffset + 8) - readInt(currentOffset + 4) + 1;
/* 1759 */           currentOffset += 12;
/*      */           
/* 1761 */           while (numTableEntries-- > 0) {
/* 1762 */             createLabel(bytecodeOffset + readInt(currentOffset), labels);
/* 1763 */             currentOffset += 4;
/*      */           } 
/*      */           continue;
/*      */         
/*      */         case 171:
/* 1768 */           currentOffset += 4 - (bytecodeOffset & 0x3);
/*      */           
/* 1770 */           createLabel(bytecodeOffset + readInt(currentOffset), labels);
/* 1771 */           numSwitchCases = readInt(currentOffset + 4);
/* 1772 */           currentOffset += 8;
/*      */           
/* 1774 */           while (numSwitchCases-- > 0) {
/* 1775 */             createLabel(bytecodeOffset + readInt(currentOffset + 4), labels);
/* 1776 */             currentOffset += 8;
/*      */           } 
/*      */           continue;
/*      */         case 16:
/*      */         case 18:
/*      */         case 21:
/*      */         case 22:
/*      */         case 23:
/*      */         case 24:
/*      */         case 25:
/*      */         case 54:
/*      */         case 55:
/*      */         case 56:
/*      */         case 57:
/*      */         case 58:
/*      */         case 169:
/*      */         case 188:
/* 1793 */           currentOffset += 2;
/*      */           continue;
/*      */         case 17:
/*      */         case 19:
/*      */         case 20:
/*      */         case 132:
/*      */         case 178:
/*      */         case 179:
/*      */         case 180:
/*      */         case 181:
/*      */         case 182:
/*      */         case 183:
/*      */         case 184:
/*      */         case 187:
/*      */         case 189:
/*      */         case 192:
/*      */         case 193:
/* 1810 */           currentOffset += 3;
/*      */           continue;
/*      */         case 185:
/*      */         case 186:
/* 1814 */           currentOffset += 5;
/*      */           continue;
/*      */         case 197:
/* 1817 */           currentOffset += 4;
/*      */           continue;
/*      */       } 
/* 1820 */       throw new IllegalArgumentException();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1826 */     int exceptionTableLength = readUnsignedShort(currentOffset);
/* 1827 */     currentOffset += 2;
/* 1828 */     while (exceptionTableLength-- > 0) {
/* 1829 */       Label start = createLabel(readUnsignedShort(currentOffset), labels);
/* 1830 */       Label end = createLabel(readUnsignedShort(currentOffset + 2), labels);
/* 1831 */       Label handler = createLabel(readUnsignedShort(currentOffset + 4), labels);
/* 1832 */       String catchType = readUTF8(this.cpInfoOffsets[readUnsignedShort(currentOffset + 6)], charBuffer);
/* 1833 */       currentOffset += 8;
/* 1834 */       methodVisitor.visitTryCatchBlock(start, end, handler, catchType);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1843 */     int stackMapFrameOffset = 0;
/*      */     
/* 1845 */     int stackMapTableEndOffset = 0;
/*      */     
/* 1847 */     boolean compressedFrames = true;
/*      */     
/* 1849 */     int localVariableTableOffset = 0;
/*      */     
/* 1851 */     int localVariableTypeTableOffset = 0;
/*      */ 
/*      */     
/* 1854 */     int[] visibleTypeAnnotationOffsets = null;
/*      */ 
/*      */     
/* 1857 */     int[] invisibleTypeAnnotationOffsets = null;
/*      */ 
/*      */     
/* 1860 */     Attribute attributes = null;
/*      */     
/* 1862 */     int attributesCount = readUnsignedShort(currentOffset);
/* 1863 */     currentOffset += 2;
/* 1864 */     while (attributesCount-- > 0) {
/*      */       
/* 1866 */       String attributeName = readUTF8(currentOffset, charBuffer);
/* 1867 */       int attributeLength = readInt(currentOffset + 2);
/* 1868 */       currentOffset += 6;
/* 1869 */       if ("LocalVariableTable".equals(attributeName)) {
/* 1870 */         if ((context.parsingOptions & 0x2) == 0) {
/* 1871 */           localVariableTableOffset = currentOffset;
/*      */           
/* 1873 */           int currentLocalVariableTableOffset = currentOffset;
/* 1874 */           int localVariableTableLength = readUnsignedShort(currentLocalVariableTableOffset);
/* 1875 */           currentLocalVariableTableOffset += 2;
/* 1876 */           while (localVariableTableLength-- > 0) {
/* 1877 */             int startPc = readUnsignedShort(currentLocalVariableTableOffset);
/* 1878 */             createDebugLabel(startPc, labels);
/* 1879 */             int length = readUnsignedShort(currentLocalVariableTableOffset + 2);
/* 1880 */             createDebugLabel(startPc + length, labels);
/*      */             
/* 1882 */             currentLocalVariableTableOffset += 10;
/*      */           } 
/*      */         } 
/* 1885 */       } else if ("LocalVariableTypeTable".equals(attributeName)) {
/* 1886 */         localVariableTypeTableOffset = currentOffset;
/*      */       
/*      */       }
/* 1889 */       else if ("LineNumberTable".equals(attributeName)) {
/* 1890 */         if ((context.parsingOptions & 0x2) == 0) {
/*      */           
/* 1892 */           int currentLineNumberTableOffset = currentOffset;
/* 1893 */           int lineNumberTableLength = readUnsignedShort(currentLineNumberTableOffset);
/* 1894 */           currentLineNumberTableOffset += 2;
/* 1895 */           while (lineNumberTableLength-- > 0) {
/* 1896 */             int startPc = readUnsignedShort(currentLineNumberTableOffset);
/* 1897 */             int lineNumber = readUnsignedShort(currentLineNumberTableOffset + 2);
/* 1898 */             currentLineNumberTableOffset += 4;
/* 1899 */             createDebugLabel(startPc, labels);
/* 1900 */             labels[startPc].addLineNumber(lineNumber);
/*      */           } 
/*      */         } 
/* 1903 */       } else if ("RuntimeVisibleTypeAnnotations".equals(attributeName)) {
/*      */         
/* 1905 */         visibleTypeAnnotationOffsets = readTypeAnnotations(methodVisitor, context, currentOffset, true);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 1912 */       else if ("RuntimeInvisibleTypeAnnotations".equals(attributeName)) {
/*      */         
/* 1914 */         invisibleTypeAnnotationOffsets = readTypeAnnotations(methodVisitor, context, currentOffset, false);
/*      */       }
/* 1916 */       else if ("StackMapTable".equals(attributeName)) {
/* 1917 */         if ((context.parsingOptions & 0x4) == 0) {
/* 1918 */           stackMapFrameOffset = currentOffset + 2;
/* 1919 */           stackMapTableEndOffset = currentOffset + attributeLength;
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 1930 */       else if ("StackMap".equals(attributeName)) {
/* 1931 */         if ((context.parsingOptions & 0x4) == 0) {
/* 1932 */           stackMapFrameOffset = currentOffset + 2;
/* 1933 */           stackMapTableEndOffset = currentOffset + attributeLength;
/* 1934 */           compressedFrames = false;
/*      */         
/*      */         }
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 1942 */         Attribute attribute = readAttribute(context.attributePrototypes, attributeName, currentOffset, attributeLength, charBuffer, codeOffset, labels);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1950 */         attribute.nextAttribute = attributes;
/* 1951 */         attributes = attribute;
/*      */       } 
/* 1953 */       currentOffset += attributeLength;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1958 */     boolean expandFrames = ((context.parsingOptions & 0x8) != 0);
/* 1959 */     if (stackMapFrameOffset != 0) {
/*      */ 
/*      */ 
/*      */       
/* 1963 */       context.currentFrameOffset = -1;
/* 1964 */       context.currentFrameType = 0;
/* 1965 */       context.currentFrameLocalCount = 0;
/* 1966 */       context.currentFrameLocalCountDelta = 0;
/* 1967 */       context.currentFrameLocalTypes = new Object[maxLocals];
/* 1968 */       context.currentFrameStackCount = 0;
/* 1969 */       context.currentFrameStackTypes = new Object[maxStack];
/* 1970 */       if (expandFrames) {
/* 1971 */         computeImplicitFrame(context);
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1980 */       for (int offset = stackMapFrameOffset; offset < stackMapTableEndOffset - 2; offset++) {
/* 1981 */         if (classBuffer[offset] == 8) {
/* 1982 */           int potentialBytecodeOffset = readUnsignedShort(offset + 1);
/* 1983 */           if (potentialBytecodeOffset >= 0 && potentialBytecodeOffset < codeLength && (classBuffer[bytecodeStartOffset + potentialBytecodeOffset] & 0xFF) == 187)
/*      */           {
/*      */ 
/*      */             
/* 1987 */             createLabel(potentialBytecodeOffset, labels);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/* 1992 */     if (expandFrames && (context.parsingOptions & 0x100) != 0)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1999 */       methodVisitor.visitFrame(-1, maxLocals, null, 0, null);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2007 */     int currentVisibleTypeAnnotationIndex = 0;
/*      */ 
/*      */     
/* 2010 */     int currentVisibleTypeAnnotationBytecodeOffset = getTypeAnnotationBytecodeOffset(visibleTypeAnnotationOffsets, 0);
/*      */ 
/*      */     
/* 2013 */     int currentInvisibleTypeAnnotationIndex = 0;
/*      */ 
/*      */     
/* 2016 */     int currentInvisibleTypeAnnotationBytecodeOffset = getTypeAnnotationBytecodeOffset(invisibleTypeAnnotationOffsets, 0);
/*      */ 
/*      */     
/* 2019 */     boolean insertFrame = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2025 */     int wideJumpOpcodeDelta = ((context.parsingOptions & 0x100) == 0) ? 33 : 0;
/*      */     
/* 2027 */     currentOffset = bytecodeStartOffset;
/* 2028 */     while (currentOffset < bytecodeEndOffset) {
/* 2029 */       Label target, defaultLabel; int cpInfoOffset, low, numPairs, nameAndTypeCpInfoOffset, high, keys[]; String owner, name; Label[] table, values; String str1, descriptor; int i; String str2; int bootstrapMethodOffset; Handle handle; Object[] bootstrapMethodArguments; int j, currentBytecodeOffset = currentOffset - bytecodeStartOffset;
/*      */ 
/*      */       
/* 2032 */       Label currentLabel = labels[currentBytecodeOffset];
/* 2033 */       if (currentLabel != null) {
/* 2034 */         currentLabel.accept(methodVisitor, ((context.parsingOptions & 0x2) == 0));
/*      */       }
/*      */ 
/*      */       
/* 2038 */       while (stackMapFrameOffset != 0 && (context.currentFrameOffset == currentBytecodeOffset || context.currentFrameOffset == -1)) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2043 */         if (context.currentFrameOffset != -1) {
/* 2044 */           if (!compressedFrames || expandFrames) {
/* 2045 */             methodVisitor.visitFrame(-1, context.currentFrameLocalCount, context.currentFrameLocalTypes, context.currentFrameStackCount, context.currentFrameStackTypes);
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */             
/* 2052 */             methodVisitor.visitFrame(context.currentFrameType, context.currentFrameLocalCountDelta, context.currentFrameLocalTypes, context.currentFrameStackCount, context.currentFrameStackTypes);
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 2061 */           insertFrame = false;
/*      */         } 
/* 2063 */         if (stackMapFrameOffset < stackMapTableEndOffset) {
/*      */           
/* 2065 */           stackMapFrameOffset = readStackMapFrame(stackMapFrameOffset, compressedFrames, expandFrames, context); continue;
/*      */         } 
/* 2067 */         stackMapFrameOffset = 0;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2073 */       if (insertFrame) {
/* 2074 */         if ((context.parsingOptions & 0x8) != 0) {
/* 2075 */           methodVisitor.visitFrame(256, 0, null, 0, null);
/*      */         }
/* 2077 */         insertFrame = false;
/*      */       } 
/*      */ 
/*      */       
/* 2081 */       int opcode = classBuffer[currentOffset] & 0xFF;
/* 2082 */       switch (opcode) {
/*      */         case 0:
/*      */         case 1:
/*      */         case 2:
/*      */         case 3:
/*      */         case 4:
/*      */         case 5:
/*      */         case 6:
/*      */         case 7:
/*      */         case 8:
/*      */         case 9:
/*      */         case 10:
/*      */         case 11:
/*      */         case 12:
/*      */         case 13:
/*      */         case 14:
/*      */         case 15:
/*      */         case 46:
/*      */         case 47:
/*      */         case 48:
/*      */         case 49:
/*      */         case 50:
/*      */         case 51:
/*      */         case 52:
/*      */         case 53:
/*      */         case 79:
/*      */         case 80:
/*      */         case 81:
/*      */         case 82:
/*      */         case 83:
/*      */         case 84:
/*      */         case 85:
/*      */         case 86:
/*      */         case 87:
/*      */         case 88:
/*      */         case 89:
/*      */         case 90:
/*      */         case 91:
/*      */         case 92:
/*      */         case 93:
/*      */         case 94:
/*      */         case 95:
/*      */         case 96:
/*      */         case 97:
/*      */         case 98:
/*      */         case 99:
/*      */         case 100:
/*      */         case 101:
/*      */         case 102:
/*      */         case 103:
/*      */         case 104:
/*      */         case 105:
/*      */         case 106:
/*      */         case 107:
/*      */         case 108:
/*      */         case 109:
/*      */         case 110:
/*      */         case 111:
/*      */         case 112:
/*      */         case 113:
/*      */         case 114:
/*      */         case 115:
/*      */         case 116:
/*      */         case 117:
/*      */         case 118:
/*      */         case 119:
/*      */         case 120:
/*      */         case 121:
/*      */         case 122:
/*      */         case 123:
/*      */         case 124:
/*      */         case 125:
/*      */         case 126:
/*      */         case 127:
/*      */         case 128:
/*      */         case 129:
/*      */         case 130:
/*      */         case 131:
/*      */         case 133:
/*      */         case 134:
/*      */         case 135:
/*      */         case 136:
/*      */         case 137:
/*      */         case 138:
/*      */         case 139:
/*      */         case 140:
/*      */         case 141:
/*      */         case 142:
/*      */         case 143:
/*      */         case 144:
/*      */         case 145:
/*      */         case 146:
/*      */         case 147:
/*      */         case 148:
/*      */         case 149:
/*      */         case 150:
/*      */         case 151:
/*      */         case 152:
/*      */         case 172:
/*      */         case 173:
/*      */         case 174:
/*      */         case 175:
/*      */         case 176:
/*      */         case 177:
/*      */         case 190:
/*      */         case 191:
/*      */         case 194:
/*      */         case 195:
/* 2190 */           methodVisitor.visitInsn(opcode);
/* 2191 */           currentOffset++;
/*      */           break;
/*      */         case 26:
/*      */         case 27:
/*      */         case 28:
/*      */         case 29:
/*      */         case 30:
/*      */         case 31:
/*      */         case 32:
/*      */         case 33:
/*      */         case 34:
/*      */         case 35:
/*      */         case 36:
/*      */         case 37:
/*      */         case 38:
/*      */         case 39:
/*      */         case 40:
/*      */         case 41:
/*      */         case 42:
/*      */         case 43:
/*      */         case 44:
/*      */         case 45:
/* 2213 */           opcode -= 26;
/* 2214 */           methodVisitor.visitVarInsn(21 + (opcode >> 2), opcode & 0x3);
/* 2215 */           currentOffset++;
/*      */           break;
/*      */         case 59:
/*      */         case 60:
/*      */         case 61:
/*      */         case 62:
/*      */         case 63:
/*      */         case 64:
/*      */         case 65:
/*      */         case 66:
/*      */         case 67:
/*      */         case 68:
/*      */         case 69:
/*      */         case 70:
/*      */         case 71:
/*      */         case 72:
/*      */         case 73:
/*      */         case 74:
/*      */         case 75:
/*      */         case 76:
/*      */         case 77:
/*      */         case 78:
/* 2237 */           opcode -= 59;
/* 2238 */           methodVisitor.visitVarInsn(54 + (opcode >> 2), opcode & 0x3);
/* 2239 */           currentOffset++;
/*      */           break;
/*      */         case 153:
/*      */         case 154:
/*      */         case 155:
/*      */         case 156:
/*      */         case 157:
/*      */         case 158:
/*      */         case 159:
/*      */         case 160:
/*      */         case 161:
/*      */         case 162:
/*      */         case 163:
/*      */         case 164:
/*      */         case 165:
/*      */         case 166:
/*      */         case 167:
/*      */         case 168:
/*      */         case 198:
/*      */         case 199:
/* 2259 */           methodVisitor.visitJumpInsn(opcode, labels[currentBytecodeOffset + 
/* 2260 */                 readShort(currentOffset + 1)]);
/* 2261 */           currentOffset += 3;
/*      */           break;
/*      */         case 200:
/*      */         case 201:
/* 2265 */           methodVisitor.visitJumpInsn(opcode - wideJumpOpcodeDelta, labels[currentBytecodeOffset + 
/*      */                 
/* 2267 */                 readInt(currentOffset + 1)]);
/* 2268 */           currentOffset += 5;
/*      */           break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         case 202:
/*      */         case 203:
/*      */         case 204:
/*      */         case 205:
/*      */         case 206:
/*      */         case 207:
/*      */         case 208:
/*      */         case 209:
/*      */         case 210:
/*      */         case 211:
/*      */         case 212:
/*      */         case 213:
/*      */         case 214:
/*      */         case 215:
/*      */         case 216:
/*      */         case 217:
/*      */         case 218:
/*      */         case 219:
/* 2298 */           opcode = (opcode < 218) ? (opcode - 49) : (opcode - 20);
/* 2299 */           target = labels[currentBytecodeOffset + readUnsignedShort(currentOffset + 1)];
/* 2300 */           if (opcode == 167 || opcode == 168) {
/*      */             
/* 2302 */             methodVisitor.visitJumpInsn(opcode + 33, target);
/*      */           
/*      */           }
/*      */           else {
/*      */             
/* 2307 */             opcode = (opcode < 167) ? ((opcode + 1 ^ 0x1) - 1) : (opcode ^ 0x1);
/* 2308 */             Label endif = createLabel(currentBytecodeOffset + 3, labels);
/* 2309 */             methodVisitor.visitJumpInsn(opcode, endif);
/* 2310 */             methodVisitor.visitJumpInsn(200, target);
/*      */ 
/*      */             
/* 2313 */             insertFrame = true;
/*      */           } 
/* 2315 */           currentOffset += 3;
/*      */           break;
/*      */ 
/*      */         
/*      */         case 220:
/* 2320 */           methodVisitor.visitJumpInsn(200, labels[currentBytecodeOffset + 
/* 2321 */                 readInt(currentOffset + 1)]);
/*      */ 
/*      */ 
/*      */           
/* 2325 */           insertFrame = true;
/* 2326 */           currentOffset += 5;
/*      */           break;
/*      */         case 196:
/* 2329 */           opcode = classBuffer[currentOffset + 1] & 0xFF;
/* 2330 */           if (opcode == 132) {
/* 2331 */             methodVisitor.visitIincInsn(
/* 2332 */                 readUnsignedShort(currentOffset + 2), readShort(currentOffset + 4));
/* 2333 */             currentOffset += 6; break;
/*      */           } 
/* 2335 */           methodVisitor.visitVarInsn(opcode, readUnsignedShort(currentOffset + 2));
/* 2336 */           currentOffset += 4;
/*      */           break;
/*      */ 
/*      */ 
/*      */         
/*      */         case 170:
/* 2342 */           currentOffset += 4 - (currentBytecodeOffset & 0x3);
/*      */           
/* 2344 */           defaultLabel = labels[currentBytecodeOffset + readInt(currentOffset)];
/* 2345 */           low = readInt(currentOffset + 4);
/* 2346 */           high = readInt(currentOffset + 8);
/* 2347 */           currentOffset += 12;
/* 2348 */           table = new Label[high - low + 1];
/* 2349 */           for (i = 0; i < table.length; i++) {
/* 2350 */             table[i] = labels[currentBytecodeOffset + readInt(currentOffset)];
/* 2351 */             currentOffset += 4;
/*      */           } 
/* 2353 */           methodVisitor.visitTableSwitchInsn(low, high, defaultLabel, table);
/*      */           break;
/*      */ 
/*      */ 
/*      */         
/*      */         case 171:
/* 2359 */           currentOffset += 4 - (currentBytecodeOffset & 0x3);
/*      */           
/* 2361 */           defaultLabel = labels[currentBytecodeOffset + readInt(currentOffset)];
/* 2362 */           numPairs = readInt(currentOffset + 4);
/* 2363 */           currentOffset += 8;
/* 2364 */           keys = new int[numPairs];
/* 2365 */           values = new Label[numPairs];
/* 2366 */           for (i = 0; i < numPairs; i++) {
/* 2367 */             keys[i] = readInt(currentOffset);
/* 2368 */             values[i] = labels[currentBytecodeOffset + readInt(currentOffset + 4)];
/* 2369 */             currentOffset += 8;
/*      */           } 
/* 2371 */           methodVisitor.visitLookupSwitchInsn(defaultLabel, keys, values);
/*      */           break;
/*      */         
/*      */         case 21:
/*      */         case 22:
/*      */         case 23:
/*      */         case 24:
/*      */         case 25:
/*      */         case 54:
/*      */         case 55:
/*      */         case 56:
/*      */         case 57:
/*      */         case 58:
/*      */         case 169:
/* 2385 */           methodVisitor.visitVarInsn(opcode, classBuffer[currentOffset + 1] & 0xFF);
/* 2386 */           currentOffset += 2;
/*      */           break;
/*      */         case 16:
/*      */         case 188:
/* 2390 */           methodVisitor.visitIntInsn(opcode, classBuffer[currentOffset + 1]);
/* 2391 */           currentOffset += 2;
/*      */           break;
/*      */         case 17:
/* 2394 */           methodVisitor.visitIntInsn(opcode, readShort(currentOffset + 1));
/* 2395 */           currentOffset += 3;
/*      */           break;
/*      */         case 18:
/* 2398 */           methodVisitor.visitLdcInsn(readConst(classBuffer[currentOffset + 1] & 0xFF, charBuffer));
/* 2399 */           currentOffset += 2;
/*      */           break;
/*      */         case 19:
/*      */         case 20:
/* 2403 */           methodVisitor.visitLdcInsn(readConst(readUnsignedShort(currentOffset + 1), charBuffer));
/* 2404 */           currentOffset += 3;
/*      */           break;
/*      */         
/*      */         case 178:
/*      */         case 179:
/*      */         case 180:
/*      */         case 181:
/*      */         case 182:
/*      */         case 183:
/*      */         case 184:
/*      */         case 185:
/* 2415 */           cpInfoOffset = this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)];
/* 2416 */           nameAndTypeCpInfoOffset = this.cpInfoOffsets[readUnsignedShort(cpInfoOffset + 2)];
/* 2417 */           owner = readClass(cpInfoOffset, charBuffer);
/* 2418 */           str1 = readUTF8(nameAndTypeCpInfoOffset, charBuffer);
/* 2419 */           str2 = readUTF8(nameAndTypeCpInfoOffset + 2, charBuffer);
/* 2420 */           if (opcode < 182) {
/* 2421 */             methodVisitor.visitFieldInsn(opcode, owner, str1, str2);
/*      */           } else {
/* 2423 */             boolean isInterface = (classBuffer[cpInfoOffset - 1] == 11);
/*      */             
/* 2425 */             methodVisitor.visitMethodInsn(opcode, owner, str1, str2, isInterface);
/*      */           } 
/* 2427 */           if (opcode == 185) {
/* 2428 */             currentOffset += 5; break;
/*      */           } 
/* 2430 */           currentOffset += 3;
/*      */           break;
/*      */ 
/*      */ 
/*      */         
/*      */         case 186:
/* 2436 */           cpInfoOffset = this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)];
/* 2437 */           nameAndTypeCpInfoOffset = this.cpInfoOffsets[readUnsignedShort(cpInfoOffset + 2)];
/* 2438 */           name = readUTF8(nameAndTypeCpInfoOffset, charBuffer);
/* 2439 */           descriptor = readUTF8(nameAndTypeCpInfoOffset + 2, charBuffer);
/* 2440 */           bootstrapMethodOffset = this.bootstrapMethodOffsets[readUnsignedShort(cpInfoOffset)];
/*      */           
/* 2442 */           handle = (Handle)readConst(readUnsignedShort(bootstrapMethodOffset), charBuffer);
/*      */           
/* 2444 */           bootstrapMethodArguments = new Object[readUnsignedShort(bootstrapMethodOffset + 2)];
/* 2445 */           bootstrapMethodOffset += 4;
/* 2446 */           for (j = 0; j < bootstrapMethodArguments.length; j++) {
/* 2447 */             bootstrapMethodArguments[j] = 
/* 2448 */               readConst(readUnsignedShort(bootstrapMethodOffset), charBuffer);
/* 2449 */             bootstrapMethodOffset += 2;
/*      */           } 
/* 2451 */           methodVisitor.visitInvokeDynamicInsn(name, descriptor, handle, bootstrapMethodArguments);
/*      */           
/* 2453 */           currentOffset += 5;
/*      */           break;
/*      */         
/*      */         case 187:
/*      */         case 189:
/*      */         case 192:
/*      */         case 193:
/* 2460 */           methodVisitor.visitTypeInsn(opcode, readClass(currentOffset + 1, charBuffer));
/* 2461 */           currentOffset += 3;
/*      */           break;
/*      */         case 132:
/* 2464 */           methodVisitor.visitIincInsn(classBuffer[currentOffset + 1] & 0xFF, classBuffer[currentOffset + 2]);
/*      */           
/* 2466 */           currentOffset += 3;
/*      */           break;
/*      */         case 197:
/* 2469 */           methodVisitor.visitMultiANewArrayInsn(
/* 2470 */               readClass(currentOffset + 1, charBuffer), classBuffer[currentOffset + 3] & 0xFF);
/* 2471 */           currentOffset += 4;
/*      */           break;
/*      */         default:
/* 2474 */           throw new AssertionError();
/*      */       } 
/*      */ 
/*      */       
/* 2478 */       while (visibleTypeAnnotationOffsets != null && currentVisibleTypeAnnotationIndex < visibleTypeAnnotationOffsets.length && currentVisibleTypeAnnotationBytecodeOffset <= currentBytecodeOffset) {
/*      */ 
/*      */         
/* 2481 */         if (currentVisibleTypeAnnotationBytecodeOffset == currentBytecodeOffset) {
/*      */ 
/*      */           
/* 2484 */           int currentAnnotationOffset = readTypeAnnotationTarget(context, visibleTypeAnnotationOffsets[currentVisibleTypeAnnotationIndex]);
/*      */ 
/*      */           
/* 2487 */           String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 2488 */           currentAnnotationOffset += 2;
/*      */           
/* 2490 */           readElementValues(methodVisitor
/* 2491 */               .visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, true), currentAnnotationOffset, true, charBuffer);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2501 */         currentVisibleTypeAnnotationBytecodeOffset = getTypeAnnotationBytecodeOffset(visibleTypeAnnotationOffsets, ++currentVisibleTypeAnnotationIndex);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 2506 */       while (invisibleTypeAnnotationOffsets != null && currentInvisibleTypeAnnotationIndex < invisibleTypeAnnotationOffsets.length && currentInvisibleTypeAnnotationBytecodeOffset <= currentBytecodeOffset) {
/*      */ 
/*      */         
/* 2509 */         if (currentInvisibleTypeAnnotationBytecodeOffset == currentBytecodeOffset) {
/*      */ 
/*      */           
/* 2512 */           int currentAnnotationOffset = readTypeAnnotationTarget(context, invisibleTypeAnnotationOffsets[currentInvisibleTypeAnnotationIndex]);
/*      */ 
/*      */           
/* 2515 */           String annotationDescriptor = readUTF8(currentAnnotationOffset, charBuffer);
/* 2516 */           currentAnnotationOffset += 2;
/*      */           
/* 2518 */           readElementValues(methodVisitor
/* 2519 */               .visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, annotationDescriptor, false), currentAnnotationOffset, true, charBuffer);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2529 */         currentInvisibleTypeAnnotationBytecodeOffset = getTypeAnnotationBytecodeOffset(invisibleTypeAnnotationOffsets, ++currentInvisibleTypeAnnotationIndex);
/*      */       } 
/*      */     } 
/*      */     
/* 2533 */     if (labels[codeLength] != null) {
/* 2534 */       methodVisitor.visitLabel(labels[codeLength]);
/*      */     }
/*      */ 
/*      */     
/* 2538 */     if (localVariableTableOffset != 0 && (context.parsingOptions & 0x2) == 0) {
/*      */       
/* 2540 */       int[] typeTable = null;
/* 2541 */       if (localVariableTypeTableOffset != 0) {
/* 2542 */         typeTable = new int[readUnsignedShort(localVariableTypeTableOffset) * 3];
/* 2543 */         currentOffset = localVariableTypeTableOffset + 2;
/* 2544 */         int typeTableIndex = typeTable.length;
/* 2545 */         while (typeTableIndex > 0) {
/*      */           
/* 2547 */           typeTable[--typeTableIndex] = currentOffset + 6;
/* 2548 */           typeTable[--typeTableIndex] = readUnsignedShort(currentOffset + 8);
/* 2549 */           typeTable[--typeTableIndex] = readUnsignedShort(currentOffset);
/* 2550 */           currentOffset += 10;
/*      */         } 
/*      */       } 
/* 2553 */       int localVariableTableLength = readUnsignedShort(localVariableTableOffset);
/* 2554 */       currentOffset = localVariableTableOffset + 2;
/* 2555 */       while (localVariableTableLength-- > 0) {
/* 2556 */         int startPc = readUnsignedShort(currentOffset);
/* 2557 */         int length = readUnsignedShort(currentOffset + 2);
/* 2558 */         String name = readUTF8(currentOffset + 4, charBuffer);
/* 2559 */         String descriptor = readUTF8(currentOffset + 6, charBuffer);
/* 2560 */         int index = readUnsignedShort(currentOffset + 8);
/* 2561 */         currentOffset += 10;
/* 2562 */         String signature = null;
/* 2563 */         if (typeTable != null) {
/* 2564 */           for (int i = 0; i < typeTable.length; i += 3) {
/* 2565 */             if (typeTable[i] == startPc && typeTable[i + 1] == index) {
/* 2566 */               signature = readUTF8(typeTable[i + 2], charBuffer);
/*      */               break;
/*      */             } 
/*      */           } 
/*      */         }
/* 2571 */         methodVisitor.visitLocalVariable(name, descriptor, signature, labels[startPc], labels[startPc + length], index);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2577 */     if (visibleTypeAnnotationOffsets != null) {
/* 2578 */       for (int typeAnnotationOffset : visibleTypeAnnotationOffsets) {
/* 2579 */         int targetType = readByte(typeAnnotationOffset);
/* 2580 */         if (targetType == 64 || targetType == 65) {
/*      */ 
/*      */           
/* 2583 */           currentOffset = readTypeAnnotationTarget(context, typeAnnotationOffset);
/*      */           
/* 2585 */           String annotationDescriptor = readUTF8(currentOffset, charBuffer);
/* 2586 */           currentOffset += 2;
/*      */           
/* 2588 */           readElementValues(methodVisitor
/* 2589 */               .visitLocalVariableAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, context.currentLocalVariableAnnotationRangeStarts, context.currentLocalVariableAnnotationRangeEnds, context.currentLocalVariableAnnotationRangeIndices, annotationDescriptor, true), currentOffset, true, charBuffer);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2605 */     if (invisibleTypeAnnotationOffsets != null) {
/* 2606 */       for (int typeAnnotationOffset : invisibleTypeAnnotationOffsets) {
/* 2607 */         int targetType = readByte(typeAnnotationOffset);
/* 2608 */         if (targetType == 64 || targetType == 65) {
/*      */ 
/*      */           
/* 2611 */           currentOffset = readTypeAnnotationTarget(context, typeAnnotationOffset);
/*      */           
/* 2613 */           String annotationDescriptor = readUTF8(currentOffset, charBuffer);
/* 2614 */           currentOffset += 2;
/*      */           
/* 2616 */           readElementValues(methodVisitor
/* 2617 */               .visitLocalVariableAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, context.currentLocalVariableAnnotationRangeStarts, context.currentLocalVariableAnnotationRangeEnds, context.currentLocalVariableAnnotationRangeIndices, annotationDescriptor, false), currentOffset, true, charBuffer);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2633 */     while (attributes != null) {
/*      */       
/* 2635 */       Attribute nextAttribute = attributes.nextAttribute;
/* 2636 */       attributes.nextAttribute = null;
/* 2637 */       methodVisitor.visitAttribute(attributes);
/* 2638 */       attributes = nextAttribute;
/*      */     } 
/*      */ 
/*      */     
/* 2642 */     methodVisitor.visitMaxs(maxStack, maxLocals);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Label readLabel(int bytecodeOffset, Label[] labels) {
/* 2656 */     if (labels[bytecodeOffset] == null) {
/* 2657 */       labels[bytecodeOffset] = new Label();
/*      */     }
/* 2659 */     return labels[bytecodeOffset];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Label createLabel(int bytecodeOffset, Label[] labels) {
/* 2672 */     Label label = readLabel(bytecodeOffset, labels);
/* 2673 */     label.flags = (short)(label.flags & 0xFFFFFFFE);
/* 2674 */     return label;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void createDebugLabel(int bytecodeOffset, Label[] labels) {
/* 2686 */     if (labels[bytecodeOffset] == null) {
/* 2687 */       (readLabel(bytecodeOffset, labels)).flags = (short)((readLabel(bytecodeOffset, labels)).flags | 0x1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int[] readTypeAnnotations(MethodVisitor methodVisitor, Context context, int runtimeTypeAnnotationsOffset, boolean visible) {
/* 2714 */     char[] charBuffer = context.charBuffer;
/* 2715 */     int currentOffset = runtimeTypeAnnotationsOffset;
/*      */     
/* 2717 */     int[] typeAnnotationsOffsets = new int[readUnsignedShort(currentOffset)];
/* 2718 */     currentOffset += 2;
/*      */     
/* 2720 */     for (int i = 0; i < typeAnnotationsOffsets.length; i++) {
/* 2721 */       int tableLength; typeAnnotationsOffsets[i] = currentOffset;
/*      */ 
/*      */       
/* 2724 */       int targetType = readInt(currentOffset);
/* 2725 */       switch (targetType >>> 24) {
/*      */ 
/*      */         
/*      */         case 64:
/*      */         case 65:
/* 2730 */           tableLength = readUnsignedShort(currentOffset + 1);
/* 2731 */           currentOffset += 3;
/* 2732 */           while (tableLength-- > 0) {
/* 2733 */             int startPc = readUnsignedShort(currentOffset);
/* 2734 */             int length = readUnsignedShort(currentOffset + 2);
/*      */             
/* 2736 */             currentOffset += 6;
/* 2737 */             createLabel(startPc, context.currentMethodLabels);
/* 2738 */             createLabel(startPc + length, context.currentMethodLabels);
/*      */           } 
/*      */           break;
/*      */         case 71:
/*      */         case 72:
/*      */         case 73:
/*      */         case 74:
/*      */         case 75:
/* 2746 */           currentOffset += 4;
/*      */           break;
/*      */         case 16:
/*      */         case 17:
/*      */         case 18:
/*      */         case 23:
/*      */         case 66:
/*      */         case 67:
/*      */         case 68:
/*      */         case 69:
/*      */         case 70:
/* 2757 */           currentOffset += 3;
/*      */           break;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         default:
/* 2767 */           throw new IllegalArgumentException();
/*      */       } 
/*      */ 
/*      */       
/* 2771 */       int pathLength = readByte(currentOffset);
/* 2772 */       if (targetType >>> 24 == 66) {
/*      */         
/* 2774 */         TypePath path = (pathLength == 0) ? null : new TypePath(this.classFileBuffer, currentOffset);
/* 2775 */         currentOffset += 1 + 2 * pathLength;
/*      */         
/* 2777 */         String annotationDescriptor = readUTF8(currentOffset, charBuffer);
/* 2778 */         currentOffset += 2;
/*      */ 
/*      */         
/* 2781 */         currentOffset = readElementValues(methodVisitor
/* 2782 */             .visitTryCatchAnnotation(targetType & 0xFFFFFF00, path, annotationDescriptor, visible), currentOffset, true, charBuffer);
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */ 
/*      */         
/* 2791 */         currentOffset += 3 + 2 * pathLength;
/*      */ 
/*      */ 
/*      */         
/* 2795 */         currentOffset = readElementValues(null, currentOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */     
/* 2799 */     return typeAnnotationsOffsets;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int getTypeAnnotationBytecodeOffset(int[] typeAnnotationOffsets, int typeAnnotationIndex) {
/* 2814 */     if (typeAnnotationOffsets == null || typeAnnotationIndex >= typeAnnotationOffsets.length || 
/*      */       
/* 2816 */       readByte(typeAnnotationOffsets[typeAnnotationIndex]) < 67) {
/* 2817 */       return -1;
/*      */     }
/* 2819 */     return readUnsignedShort(typeAnnotationOffsets[typeAnnotationIndex] + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readTypeAnnotationTarget(Context context, int typeAnnotationOffset) {
/* 2833 */     int tableLength, i, currentOffset = typeAnnotationOffset;
/*      */     
/* 2835 */     int targetType = readInt(typeAnnotationOffset);
/* 2836 */     switch (targetType >>> 24) {
/*      */       case 0:
/*      */       case 1:
/*      */       case 22:
/* 2840 */         targetType &= 0xFFFF0000;
/* 2841 */         currentOffset += 2;
/*      */         break;
/*      */       case 19:
/*      */       case 20:
/*      */       case 21:
/* 2846 */         targetType &= 0xFF000000;
/* 2847 */         currentOffset++;
/*      */         break;
/*      */       case 64:
/*      */       case 65:
/* 2851 */         targetType &= 0xFF000000;
/* 2852 */         tableLength = readUnsignedShort(currentOffset + 1);
/* 2853 */         currentOffset += 3;
/* 2854 */         context.currentLocalVariableAnnotationRangeStarts = new Label[tableLength];
/* 2855 */         context.currentLocalVariableAnnotationRangeEnds = new Label[tableLength];
/* 2856 */         context.currentLocalVariableAnnotationRangeIndices = new int[tableLength];
/* 2857 */         for (i = 0; i < tableLength; i++) {
/* 2858 */           int startPc = readUnsignedShort(currentOffset);
/* 2859 */           int length = readUnsignedShort(currentOffset + 2);
/* 2860 */           int index = readUnsignedShort(currentOffset + 4);
/* 2861 */           currentOffset += 6;
/* 2862 */           context.currentLocalVariableAnnotationRangeStarts[i] = 
/* 2863 */             createLabel(startPc, context.currentMethodLabels);
/* 2864 */           context.currentLocalVariableAnnotationRangeEnds[i] = 
/* 2865 */             createLabel(startPc + length, context.currentMethodLabels);
/* 2866 */           context.currentLocalVariableAnnotationRangeIndices[i] = index;
/*      */         } 
/*      */         break;
/*      */       case 71:
/*      */       case 72:
/*      */       case 73:
/*      */       case 74:
/*      */       case 75:
/* 2874 */         targetType &= 0xFF0000FF;
/* 2875 */         currentOffset += 4;
/*      */         break;
/*      */       case 16:
/*      */       case 17:
/*      */       case 18:
/*      */       case 23:
/*      */       case 66:
/* 2882 */         targetType &= 0xFFFFFF00;
/* 2883 */         currentOffset += 3;
/*      */         break;
/*      */       case 67:
/*      */       case 68:
/*      */       case 69:
/*      */       case 70:
/* 2889 */         targetType &= 0xFF000000;
/* 2890 */         currentOffset += 3;
/*      */         break;
/*      */       default:
/* 2893 */         throw new IllegalArgumentException();
/*      */     } 
/* 2895 */     context.currentTypeAnnotationTarget = targetType;
/*      */     
/* 2897 */     int pathLength = readByte(currentOffset);
/* 2898 */     context
/* 2899 */       .currentTypeAnnotationTargetPath = (pathLength == 0) ? null : new TypePath(this.classFileBuffer, currentOffset);
/*      */     
/* 2901 */     return currentOffset + 1 + 2 * pathLength;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int runtimeParameterAnnotationsOffset, boolean visible) {
/* 2920 */     int currentOffset = runtimeParameterAnnotationsOffset;
/* 2921 */     int numParameters = this.classFileBuffer[currentOffset++] & 0xFF;
/* 2922 */     methodVisitor.visitAnnotableParameterCount(numParameters, visible);
/* 2923 */     char[] charBuffer = context.charBuffer;
/* 2924 */     for (int i = 0; i < numParameters; i++) {
/* 2925 */       int numAnnotations = readUnsignedShort(currentOffset);
/* 2926 */       currentOffset += 2;
/* 2927 */       while (numAnnotations-- > 0) {
/*      */         
/* 2929 */         String annotationDescriptor = readUTF8(currentOffset, charBuffer);
/* 2930 */         currentOffset += 2;
/*      */ 
/*      */         
/* 2933 */         currentOffset = readElementValues(methodVisitor
/* 2934 */             .visitParameterAnnotation(i, annotationDescriptor, visible), currentOffset, true, charBuffer);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readElementValues(AnnotationVisitor annotationVisitor, int annotationOffset, boolean named, char[] charBuffer) {
/* 2961 */     int currentOffset = annotationOffset;
/*      */     
/* 2963 */     int numElementValuePairs = readUnsignedShort(currentOffset);
/* 2964 */     currentOffset += 2;
/* 2965 */     if (named) {
/*      */       
/* 2967 */       while (numElementValuePairs-- > 0) {
/* 2968 */         String elementName = readUTF8(currentOffset, charBuffer);
/*      */         
/* 2970 */         currentOffset = readElementValue(annotationVisitor, currentOffset + 2, elementName, charBuffer);
/*      */       } 
/*      */     } else {
/*      */       
/* 2974 */       while (numElementValuePairs-- > 0)
/*      */       {
/* 2976 */         currentOffset = readElementValue(annotationVisitor, currentOffset, null, charBuffer);
/*      */       }
/*      */     } 
/* 2979 */     if (annotationVisitor != null) {
/* 2980 */       annotationVisitor.visitEnd();
/*      */     }
/* 2982 */     return currentOffset;
/*      */   }
/*      */   
/*      */   private int readElementValue(AnnotationVisitor annotationVisitor, int elementValueOffset, String elementName, char[] charBuffer) {
/*      */     int numValues;
/*      */     byte[] byteValues;
/*      */     int i;
/*      */     boolean[] booleanValues;
/*      */     int j;
/*      */     short[] shortValues;
/*      */     int k;
/*      */     char[] charValues;
/*      */     int m, intValues[], n;
/*      */     long[] longValues;
/*      */     int i1;
/*      */     float[] floatValues;
/*      */     int i2;
/*      */     double[] doubleValues;
/* 3000 */     int i3, currentOffset = elementValueOffset;
/* 3001 */     if (annotationVisitor == null) {
/* 3002 */       switch (this.classFileBuffer[currentOffset] & 0xFF) {
/*      */         case 101:
/* 3004 */           return currentOffset + 5;
/*      */         case 64:
/* 3006 */           return readElementValues(null, currentOffset + 3, true, charBuffer);
/*      */         case 91:
/* 3008 */           return readElementValues(null, currentOffset + 1, false, charBuffer);
/*      */       } 
/* 3010 */       return currentOffset + 3;
/*      */     } 
/*      */     
/* 3013 */     switch (this.classFileBuffer[currentOffset++] & 0xFF) {
/*      */       case 66:
/* 3015 */         annotationVisitor.visit(elementName, 
/* 3016 */             Byte.valueOf((byte)readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset)])));
/* 3017 */         currentOffset += 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3161 */         return currentOffset;case 67: annotationVisitor.visit(elementName, Character.valueOf((char)readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset)]))); currentOffset += 2; return currentOffset;case 68: case 70: case 73: case 74: annotationVisitor.visit(elementName, readConst(readUnsignedShort(currentOffset), charBuffer)); currentOffset += 2; return currentOffset;case 83: annotationVisitor.visit(elementName, Short.valueOf((short)readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset)]))); currentOffset += 2; return currentOffset;case 90: annotationVisitor.visit(elementName, (readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset)]) == 0) ? Boolean.FALSE : Boolean.TRUE); currentOffset += 2; return currentOffset;case 115: annotationVisitor.visit(elementName, readUTF8(currentOffset, charBuffer)); currentOffset += 2; return currentOffset;case 101: annotationVisitor.visitEnum(elementName, readUTF8(currentOffset, charBuffer), readUTF8(currentOffset + 2, charBuffer)); currentOffset += 4; return currentOffset;case 99: annotationVisitor.visit(elementName, Type.getType(readUTF8(currentOffset, charBuffer))); currentOffset += 2; return currentOffset;case 64: currentOffset = readElementValues(annotationVisitor.visitAnnotation(elementName, readUTF8(currentOffset, charBuffer)), currentOffset + 2, true, charBuffer); return currentOffset;case 91: numValues = readUnsignedShort(currentOffset); currentOffset += 2; if (numValues == 0) return readElementValues(annotationVisitor.visitArray(elementName), currentOffset - 2, false, charBuffer);  switch (this.classFileBuffer[currentOffset] & 0xFF) { case 66: byteValues = new byte[numValues]; for (i = 0; i < numValues; i++) { byteValues[i] = (byte)readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)]); currentOffset += 3; }  annotationVisitor.visit(elementName, byteValues); return currentOffset;case 90: booleanValues = new boolean[numValues]; for (j = 0; j < numValues; j++) { booleanValues[j] = (readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)]) != 0); currentOffset += 3; }  annotationVisitor.visit(elementName, booleanValues); return currentOffset;case 83: shortValues = new short[numValues]; for (k = 0; k < numValues; k++) { shortValues[k] = (short)readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)]); currentOffset += 3; }  annotationVisitor.visit(elementName, shortValues); return currentOffset;case 67: charValues = new char[numValues]; for (m = 0; m < numValues; m++) { charValues[m] = (char)readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)]); currentOffset += 3; }  annotationVisitor.visit(elementName, charValues); return currentOffset;case 73: intValues = new int[numValues]; for (n = 0; n < numValues; n++) { intValues[n] = readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)]); currentOffset += 3; }  annotationVisitor.visit(elementName, intValues); return currentOffset;case 74: longValues = new long[numValues]; for (i1 = 0; i1 < numValues; i1++) { longValues[i1] = readLong(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)]); currentOffset += 3; }  annotationVisitor.visit(elementName, longValues); return currentOffset;case 70: floatValues = new float[numValues]; for (i2 = 0; i2 < numValues; i2++) { floatValues[i2] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)])); currentOffset += 3; }  annotationVisitor.visit(elementName, floatValues); return currentOffset;case 68: doubleValues = new double[numValues]; for (i3 = 0; i3 < numValues; i3++) { doubleValues[i3] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(currentOffset + 1)])); currentOffset += 3; }  annotationVisitor.visit(elementName, doubleValues); return currentOffset; }  currentOffset = readElementValues(annotationVisitor.visitArray(elementName), currentOffset - 2, false, charBuffer); return currentOffset;
/*      */     } 
/*      */     throw new IllegalArgumentException();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void computeImplicitFrame(Context context) {
/* 3175 */     String methodDescriptor = context.currentMethodDescriptor;
/* 3176 */     Object[] locals = context.currentFrameLocalTypes;
/* 3177 */     int numLocal = 0;
/* 3178 */     if ((context.currentMethodAccessFlags & 0x8) == 0) {
/* 3179 */       if ("<init>".equals(context.currentMethodName)) {
/* 3180 */         locals[numLocal++] = Opcodes.UNINITIALIZED_THIS;
/*      */       } else {
/* 3182 */         locals[numLocal++] = readClass(this.header + 2, context.charBuffer);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 3187 */     int currentMethodDescritorOffset = 1;
/*      */     while (true) {
/* 3189 */       int currentArgumentDescriptorStartOffset = currentMethodDescritorOffset;
/* 3190 */       switch (methodDescriptor.charAt(currentMethodDescritorOffset++)) {
/*      */         case 'B':
/*      */         case 'C':
/*      */         case 'I':
/*      */         case 'S':
/*      */         case 'Z':
/* 3196 */           locals[numLocal++] = Opcodes.INTEGER;
/*      */           continue;
/*      */         case 'F':
/* 3199 */           locals[numLocal++] = Opcodes.FLOAT;
/*      */           continue;
/*      */         case 'J':
/* 3202 */           locals[numLocal++] = Opcodes.LONG;
/*      */           continue;
/*      */         case 'D':
/* 3205 */           locals[numLocal++] = Opcodes.DOUBLE;
/*      */           continue;
/*      */         case '[':
/* 3208 */           while (methodDescriptor.charAt(currentMethodDescritorOffset) == '[') {
/* 3209 */             currentMethodDescritorOffset++;
/*      */           }
/* 3211 */           if (methodDescriptor.charAt(currentMethodDescritorOffset) == 'L') {
/* 3212 */             currentMethodDescritorOffset++;
/* 3213 */             while (methodDescriptor.charAt(currentMethodDescritorOffset) != ';') {
/* 3214 */               currentMethodDescritorOffset++;
/*      */             }
/*      */           } 
/* 3217 */           locals[numLocal++] = methodDescriptor
/* 3218 */             .substring(currentArgumentDescriptorStartOffset, ++currentMethodDescritorOffset);
/*      */           continue;
/*      */         
/*      */         case 'L':
/* 3222 */           while (methodDescriptor.charAt(currentMethodDescritorOffset) != ';') {
/* 3223 */             currentMethodDescritorOffset++;
/*      */           }
/* 3225 */           locals[numLocal++] = methodDescriptor
/* 3226 */             .substring(currentArgumentDescriptorStartOffset + 1, currentMethodDescritorOffset++); continue;
/*      */       } 
/*      */       break;
/*      */     } 
/* 3230 */     context.currentFrameLocalCount = numLocal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readStackMapFrame(int stackMapFrameOffset, boolean compressed, boolean expand, Context context) {
/* 3255 */     int frameType, offsetDelta, currentOffset = stackMapFrameOffset;
/* 3256 */     char[] charBuffer = context.charBuffer;
/* 3257 */     Label[] labels = context.currentMethodLabels;
/*      */     
/* 3259 */     if (compressed) {
/*      */       
/* 3261 */       frameType = this.classFileBuffer[currentOffset++] & 0xFF;
/*      */     } else {
/* 3263 */       frameType = 255;
/* 3264 */       context.currentFrameOffset = -1;
/*      */     } 
/*      */     
/* 3267 */     context.currentFrameLocalCountDelta = 0;
/* 3268 */     if (frameType < 64) {
/* 3269 */       offsetDelta = frameType;
/* 3270 */       context.currentFrameType = 3;
/* 3271 */       context.currentFrameStackCount = 0;
/* 3272 */     } else if (frameType < 128) {
/* 3273 */       offsetDelta = frameType - 64;
/*      */       
/* 3275 */       currentOffset = readVerificationTypeInfo(currentOffset, context.currentFrameStackTypes, 0, charBuffer, labels);
/*      */       
/* 3277 */       context.currentFrameType = 4;
/* 3278 */       context.currentFrameStackCount = 1;
/* 3279 */     } else if (frameType >= 247) {
/* 3280 */       offsetDelta = readUnsignedShort(currentOffset);
/* 3281 */       currentOffset += 2;
/* 3282 */       if (frameType == 247) {
/*      */         
/* 3284 */         currentOffset = readVerificationTypeInfo(currentOffset, context.currentFrameStackTypes, 0, charBuffer, labels);
/*      */         
/* 3286 */         context.currentFrameType = 4;
/* 3287 */         context.currentFrameStackCount = 1;
/* 3288 */       } else if (frameType >= 248 && frameType < 251) {
/* 3289 */         context.currentFrameType = 2;
/* 3290 */         context.currentFrameLocalCountDelta = 251 - frameType;
/* 3291 */         context.currentFrameLocalCount -= context.currentFrameLocalCountDelta;
/* 3292 */         context.currentFrameStackCount = 0;
/* 3293 */       } else if (frameType == 251) {
/* 3294 */         context.currentFrameType = 3;
/* 3295 */         context.currentFrameStackCount = 0;
/* 3296 */       } else if (frameType < 255) {
/* 3297 */         int local = expand ? context.currentFrameLocalCount : 0;
/* 3298 */         for (int k = frameType - 251; k > 0; k--)
/*      */         {
/* 3300 */           currentOffset = readVerificationTypeInfo(currentOffset, context.currentFrameLocalTypes, local++, charBuffer, labels);
/*      */         }
/*      */         
/* 3303 */         context.currentFrameType = 1;
/* 3304 */         context.currentFrameLocalCountDelta = frameType - 251;
/* 3305 */         context.currentFrameLocalCount += context.currentFrameLocalCountDelta;
/* 3306 */         context.currentFrameStackCount = 0;
/*      */       } else {
/* 3308 */         int numberOfLocals = readUnsignedShort(currentOffset);
/* 3309 */         currentOffset += 2;
/* 3310 */         context.currentFrameType = 0;
/* 3311 */         context.currentFrameLocalCountDelta = numberOfLocals;
/* 3312 */         context.currentFrameLocalCount = numberOfLocals;
/* 3313 */         for (int local = 0; local < numberOfLocals; local++)
/*      */         {
/* 3315 */           currentOffset = readVerificationTypeInfo(currentOffset, context.currentFrameLocalTypes, local, charBuffer, labels);
/*      */         }
/*      */         
/* 3318 */         int numberOfStackItems = readUnsignedShort(currentOffset);
/* 3319 */         currentOffset += 2;
/* 3320 */         context.currentFrameStackCount = numberOfStackItems;
/* 3321 */         for (int stack = 0; stack < numberOfStackItems; stack++)
/*      */         {
/* 3323 */           currentOffset = readVerificationTypeInfo(currentOffset, context.currentFrameStackTypes, stack, charBuffer, labels);
/*      */         }
/*      */       } 
/*      */     } else {
/*      */       
/* 3328 */       throw new IllegalArgumentException();
/*      */     } 
/* 3330 */     context.currentFrameOffset += offsetDelta + 1;
/* 3331 */     createLabel(context.currentFrameOffset, labels);
/* 3332 */     return currentOffset;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int readVerificationTypeInfo(int verificationTypeInfoOffset, Object[] frame, int index, char[] charBuffer, Label[] labels) {
/* 3355 */     int currentOffset = verificationTypeInfoOffset;
/* 3356 */     int tag = this.classFileBuffer[currentOffset++] & 0xFF;
/* 3357 */     switch (tag) {
/*      */       case 0:
/* 3359 */         frame[index] = Opcodes.TOP;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3390 */         return currentOffset;case 1: frame[index] = Opcodes.INTEGER; return currentOffset;case 2: frame[index] = Opcodes.FLOAT; return currentOffset;case 3: frame[index] = Opcodes.DOUBLE; return currentOffset;case 4: frame[index] = Opcodes.LONG; return currentOffset;case 5: frame[index] = Opcodes.NULL; return currentOffset;case 6: frame[index] = Opcodes.UNINITIALIZED_THIS; return currentOffset;case 7: frame[index] = readClass(currentOffset, charBuffer); currentOffset += 2; return currentOffset;case 8: frame[index] = createLabel(readUnsignedShort(currentOffset), labels); currentOffset += 2; return currentOffset;
/*      */     } 
/*      */     throw new IllegalArgumentException();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final int getFirstAttributeOffset() {
/* 3407 */     int currentOffset = this.header + 8 + readUnsignedShort(this.header + 6) * 2;
/*      */ 
/*      */     
/* 3410 */     int fieldsCount = readUnsignedShort(currentOffset);
/* 3411 */     currentOffset += 2;
/*      */     
/* 3413 */     while (fieldsCount-- > 0) {
/*      */ 
/*      */ 
/*      */       
/* 3417 */       int attributesCount = readUnsignedShort(currentOffset + 6);
/* 3418 */       currentOffset += 8;
/*      */       
/* 3420 */       while (attributesCount-- > 0)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 3425 */         currentOffset += 6 + readInt(currentOffset + 2);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 3430 */     int methodsCount = readUnsignedShort(currentOffset);
/* 3431 */     currentOffset += 2;
/* 3432 */     while (methodsCount-- > 0) {
/* 3433 */       int attributesCount = readUnsignedShort(currentOffset + 6);
/* 3434 */       currentOffset += 8;
/* 3435 */       while (attributesCount-- > 0) {
/* 3436 */         currentOffset += 6 + readInt(currentOffset + 2);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 3441 */     return currentOffset + 2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int[] readBootstrapMethodsAttribute(int maxStringLength) {
/* 3452 */     char[] charBuffer = new char[maxStringLength];
/* 3453 */     int currentAttributeOffset = getFirstAttributeOffset();
/* 3454 */     for (int i = readUnsignedShort(currentAttributeOffset - 2); i > 0; i--) {
/*      */       
/* 3456 */       String attributeName = readUTF8(currentAttributeOffset, charBuffer);
/* 3457 */       int attributeLength = readInt(currentAttributeOffset + 2);
/* 3458 */       currentAttributeOffset += 6;
/* 3459 */       if ("BootstrapMethods".equals(attributeName)) {
/*      */         
/* 3461 */         int[] result = new int[readUnsignedShort(currentAttributeOffset)];
/*      */         
/* 3463 */         int currentBootstrapMethodOffset = currentAttributeOffset + 2;
/* 3464 */         for (int j = 0; j < result.length; j++) {
/* 3465 */           result[j] = currentBootstrapMethodOffset;
/*      */ 
/*      */           
/* 3468 */           currentBootstrapMethodOffset += 4 + 
/* 3469 */             readUnsignedShort(currentBootstrapMethodOffset + 2) * 2;
/*      */         } 
/* 3471 */         return result;
/*      */       } 
/* 3473 */       currentAttributeOffset += attributeLength;
/*      */     } 
/* 3475 */     throw new IllegalArgumentException();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Attribute readAttribute(Attribute[] attributePrototypes, String type, int offset, int length, char[] charBuffer, int codeAttributeOffset, Label[] labels) {
/* 3506 */     for (Attribute attributePrototype : attributePrototypes) {
/* 3507 */       if (attributePrototype.type.equals(type)) {
/* 3508 */         return attributePrototype.read(this, offset, length, charBuffer, codeAttributeOffset, labels);
/*      */       }
/*      */     } 
/*      */     
/* 3512 */     return (new Attribute(type)).read(this, offset, length, null, -1, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getItemCount() {
/* 3525 */     return this.cpInfoOffsets.length;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getItem(int constantPoolEntryIndex) {
/* 3539 */     return this.cpInfoOffsets[constantPoolEntryIndex];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMaxStringLength() {
/* 3550 */     return this.maxStringLength;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int readByte(int offset) {
/* 3561 */     return this.classFileBuffer[offset] & 0xFF;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int readUnsignedShort(int offset) {
/* 3572 */     byte[] classBuffer = this.classFileBuffer;
/* 3573 */     return (classBuffer[offset] & 0xFF) << 8 | classBuffer[offset + 1] & 0xFF;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public short readShort(int offset) {
/* 3584 */     byte[] classBuffer = this.classFileBuffer;
/* 3585 */     return (short)((classBuffer[offset] & 0xFF) << 8 | classBuffer[offset + 1] & 0xFF);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int readInt(int offset) {
/* 3596 */     byte[] classBuffer = this.classFileBuffer;
/* 3597 */     return (classBuffer[offset] & 0xFF) << 24 | (classBuffer[offset + 1] & 0xFF) << 16 | (classBuffer[offset + 2] & 0xFF) << 8 | classBuffer[offset + 3] & 0xFF;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long readLong(int offset) {
/* 3611 */     long l1 = readInt(offset);
/* 3612 */     long l0 = readInt(offset + 4) & 0xFFFFFFFFL;
/* 3613 */     return l1 << 32L | l0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String readUTF8(int offset, char[] charBuffer) {
/* 3629 */     int constantPoolEntryIndex = readUnsignedShort(offset);
/* 3630 */     if (offset == 0 || constantPoolEntryIndex == 0) {
/* 3631 */       return null;
/*      */     }
/* 3633 */     return readUtf(constantPoolEntryIndex, charBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final String readUtf(int constantPoolEntryIndex, char[] charBuffer) {
/* 3646 */     String value = this.constantUtf8Values[constantPoolEntryIndex];
/* 3647 */     if (value != null) {
/* 3648 */       return value;
/*      */     }
/* 3650 */     int cpInfoOffset = this.cpInfoOffsets[constantPoolEntryIndex];
/* 3651 */     this.constantUtf8Values[constantPoolEntryIndex] = 
/* 3652 */       readUtf(cpInfoOffset + 2, readUnsignedShort(cpInfoOffset), charBuffer); return readUtf(cpInfoOffset + 2, readUnsignedShort(cpInfoOffset), charBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String readUtf(int utfOffset, int utfLength, char[] charBuffer) {
/* 3665 */     int currentOffset = utfOffset;
/* 3666 */     int endOffset = currentOffset + utfLength;
/* 3667 */     int strLength = 0;
/* 3668 */     byte[] classBuffer = this.classFileBuffer;
/* 3669 */     while (currentOffset < endOffset) {
/* 3670 */       int currentByte = classBuffer[currentOffset++];
/* 3671 */       if ((currentByte & 0x80) == 0) {
/* 3672 */         charBuffer[strLength++] = (char)(currentByte & 0x7F); continue;
/* 3673 */       }  if ((currentByte & 0xE0) == 192) {
/* 3674 */         charBuffer[strLength++] = (char)(((currentByte & 0x1F) << 6) + (classBuffer[currentOffset++] & 0x3F));
/*      */         continue;
/*      */       } 
/* 3677 */       charBuffer[strLength++] = (char)(((currentByte & 0xF) << 12) + ((classBuffer[currentOffset++] & 0x3F) << 6) + (classBuffer[currentOffset++] & 0x3F));
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 3684 */     return new String(charBuffer, 0, strLength);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String readStringish(int offset, char[] charBuffer) {
/* 3703 */     return readUTF8(this.cpInfoOffsets[readUnsignedShort(offset)], charBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String readClass(int offset, char[] charBuffer) {
/* 3718 */     return readStringish(offset, charBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String readModule(int offset, char[] charBuffer) {
/* 3733 */     return readStringish(offset, charBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String readPackage(int offset, char[] charBuffer) {
/* 3748 */     return readStringish(offset, charBuffer);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private ConstantDynamic readConstantDynamic(int constantPoolEntryIndex, char[] charBuffer) {
/* 3762 */     ConstantDynamic constantDynamic = this.constantDynamicValues[constantPoolEntryIndex];
/* 3763 */     if (constantDynamic != null) {
/* 3764 */       return constantDynamic;
/*      */     }
/* 3766 */     int cpInfoOffset = this.cpInfoOffsets[constantPoolEntryIndex];
/* 3767 */     int nameAndTypeCpInfoOffset = this.cpInfoOffsets[readUnsignedShort(cpInfoOffset + 2)];
/* 3768 */     String name = readUTF8(nameAndTypeCpInfoOffset, charBuffer);
/* 3769 */     String descriptor = readUTF8(nameAndTypeCpInfoOffset + 2, charBuffer);
/* 3770 */     int bootstrapMethodOffset = this.bootstrapMethodOffsets[readUnsignedShort(cpInfoOffset)];
/* 3771 */     Handle handle = (Handle)readConst(readUnsignedShort(bootstrapMethodOffset), charBuffer);
/* 3772 */     Object[] bootstrapMethodArguments = new Object[readUnsignedShort(bootstrapMethodOffset + 2)];
/* 3773 */     bootstrapMethodOffset += 4;
/* 3774 */     for (int i = 0; i < bootstrapMethodArguments.length; i++) {
/* 3775 */       bootstrapMethodArguments[i] = readConst(readUnsignedShort(bootstrapMethodOffset), charBuffer);
/* 3776 */       bootstrapMethodOffset += 2;
/*      */     } 
/* 3778 */     this.constantDynamicValues[constantPoolEntryIndex] = new ConstantDynamic(name, descriptor, handle, bootstrapMethodArguments); return new ConstantDynamic(name, descriptor, handle, bootstrapMethodArguments);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object readConst(int constantPoolEntryIndex, char[] charBuffer) {
/*      */     int referenceKind, referenceCpInfoOffset, nameAndTypeCpInfoOffset;
/*      */     String owner, name, descriptor;
/*      */     boolean isInterface;
/* 3797 */     int cpInfoOffset = this.cpInfoOffsets[constantPoolEntryIndex];
/* 3798 */     switch (this.classFileBuffer[cpInfoOffset - 1]) {
/*      */       case 3:
/* 3800 */         return Integer.valueOf(readInt(cpInfoOffset));
/*      */       case 4:
/* 3802 */         return Float.valueOf(Float.intBitsToFloat(readInt(cpInfoOffset)));
/*      */       case 5:
/* 3804 */         return Long.valueOf(readLong(cpInfoOffset));
/*      */       case 6:
/* 3806 */         return Double.valueOf(Double.longBitsToDouble(readLong(cpInfoOffset)));
/*      */       case 7:
/* 3808 */         return Type.getObjectType(readUTF8(cpInfoOffset, charBuffer));
/*      */       case 8:
/* 3810 */         return readUTF8(cpInfoOffset, charBuffer);
/*      */       case 16:
/* 3812 */         return Type.getMethodType(readUTF8(cpInfoOffset, charBuffer));
/*      */       case 15:
/* 3814 */         referenceKind = readByte(cpInfoOffset);
/* 3815 */         referenceCpInfoOffset = this.cpInfoOffsets[readUnsignedShort(cpInfoOffset + 1)];
/* 3816 */         nameAndTypeCpInfoOffset = this.cpInfoOffsets[readUnsignedShort(referenceCpInfoOffset + 2)];
/* 3817 */         owner = readClass(referenceCpInfoOffset, charBuffer);
/* 3818 */         name = readUTF8(nameAndTypeCpInfoOffset, charBuffer);
/* 3819 */         descriptor = readUTF8(nameAndTypeCpInfoOffset + 2, charBuffer);
/* 3820 */         isInterface = (this.classFileBuffer[referenceCpInfoOffset - 1] == 11);
/*      */         
/* 3822 */         return new Handle(referenceKind, owner, name, descriptor, isInterface);
/*      */       case 17:
/* 3824 */         return readConstantDynamic(constantPoolEntryIndex, charBuffer);
/*      */     } 
/* 3826 */     throw new IllegalArgumentException();
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\ow2asm\ClassReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */