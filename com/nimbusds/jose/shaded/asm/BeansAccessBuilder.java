/*     */ package com.nimbusds.jose.shaded.asm;
/*     */ 
/*     */ import com.nimbusds.jose.shaded.ow2asm.ClassWriter;
/*     */ import com.nimbusds.jose.shaded.ow2asm.Label;
/*     */ import com.nimbusds.jose.shaded.ow2asm.MethodVisitor;
/*     */ import com.nimbusds.jose.shaded.ow2asm.Type;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.HashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BeansAccessBuilder
/*     */ {
/*  42 */   private static String METHOD_ACCESS_NAME = Type.getInternalName(BeansAccess.class);
/*     */   
/*     */   final Class<?> type;
/*     */   final Accessor[] accs;
/*     */   final DynamicClassLoader loader;
/*     */   final String className;
/*     */   final String accessClassName;
/*     */   final String accessClassNameInternal;
/*     */   final String classNameInternal;
/*  51 */   final HashMap<Class<?>, Method> convMtds = new HashMap<>();
/*     */   
/*  53 */   Class<? extends Exception> exceptionClass = (Class)NoSuchFieldException.class;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BeansAccessBuilder(Class<?> type, Accessor[] accs, DynamicClassLoader loader) {
/*  66 */     this.type = type;
/*  67 */     this.accs = accs;
/*  68 */     this.loader = loader;
/*     */     
/*  70 */     this.className = type.getName();
/*  71 */     if (this.className.startsWith("java.")) {
/*  72 */       this.accessClassName = "com.nimbusds.jose.shaded.asm." + this.className + "AccAccess";
/*     */     } else {
/*  74 */       this.accessClassName = this.className.concat("AccAccess");
/*     */     } 
/*  76 */     this.accessClassNameInternal = this.accessClassName.replace('.', '/');
/*  77 */     this.classNameInternal = this.className.replace('.', '/');
/*     */   }
/*     */   
/*     */   public void addConversion(Iterable<Class<?>> conv) {
/*  81 */     if (conv == null)
/*     */       return; 
/*  83 */     for (Class<?> c : conv)
/*  84 */       addConversion(c); 
/*     */   }
/*     */   
/*     */   public void addConversion(Class<?> conv) {
/*  88 */     if (conv == null)
/*     */       return; 
/*  90 */     for (Method mtd : conv.getMethods()) {
/*  91 */       if ((mtd.getModifiers() & 0x8) != 0) {
/*     */         
/*  93 */         Class<?>[] param = mtd.getParameterTypes();
/*  94 */         if (param.length == 1)
/*     */         {
/*  96 */           if (param[0].equals(Object.class)) {
/*     */             
/*  98 */             Class<?> rType = mtd.getReturnType();
/*  99 */             if (!rType.equals(void.class))
/*     */             {
/* 101 */               this.convMtds.put(rType, mtd); } 
/*     */           }  } 
/*     */       } 
/*     */     } 
/*     */   } public Class<?> bulid() {
/* 106 */     ClassWriter cw = new ClassWriter(1);
/*     */ 
/*     */     
/* 109 */     boolean USE_HASH = (this.accs.length > 10);
/* 110 */     int HASH_LIMIT = 14;
/*     */     
/* 112 */     String signature = "Lnet/minidev/asm/BeansAccess<L" + this.classNameInternal + ";>;";
/*     */     
/* 114 */     cw.visit(50, 33, this.accessClassNameInternal, signature, METHOD_ACCESS_NAME, null);
/*     */ 
/*     */     
/* 117 */     MethodVisitor mv = cw.visitMethod(1, "<init>", "()V", null, null);
/* 118 */     mv.visitCode();
/* 119 */     mv.visitVarInsn(25, 0);
/* 120 */     mv.visitMethodInsn(183, METHOD_ACCESS_NAME, "<init>", "()V", false);
/* 121 */     mv.visitInsn(177);
/* 122 */     mv.visitMaxs(1, 1);
/* 123 */     mv.visitEnd();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 131 */     mv = cw.visitMethod(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
/* 132 */     mv.visitCode();
/*     */     
/* 134 */     if (this.accs.length != 0)
/*     */     {
/*     */       
/* 137 */       if (this.accs.length > HASH_LIMIT) {
/*     */         
/* 139 */         mv.visitVarInsn(21, 2);
/* 140 */         Label[] labels = ASMUtil.newLabels(this.accs.length);
/* 141 */         Label defaultLabel = new Label();
/*     */         
/* 143 */         mv.visitTableSwitchInsn(0, labels.length - 1, defaultLabel, labels);
/* 144 */         int i = 0;
/* 145 */         for (Accessor acc : this.accs) {
/* 146 */           mv.visitLabel(labels[i++]);
/* 147 */           if (!acc.isWritable()) {
/* 148 */             mv.visitInsn(177);
/*     */           } else {
/*     */             
/* 151 */             internalSetFiled(mv, acc);
/*     */           } 
/* 153 */         }  mv.visitLabel(defaultLabel);
/*     */       } else {
/* 155 */         Label[] labels = ASMUtil.newLabels(this.accs.length);
/* 156 */         int i = 0;
/* 157 */         for (Accessor acc : this.accs) {
/* 158 */           ifNotEqJmp(mv, 2, i, labels[i]);
/* 159 */           internalSetFiled(mv, acc);
/* 160 */           mv.visitLabel(labels[i]);
/* 161 */           mv.visitFrame(3, 0, null, 0, null);
/* 162 */           i++;
/*     */         } 
/*     */       }  } 
/* 165 */     if (this.exceptionClass != null) {
/* 166 */       throwExIntParam(mv, this.exceptionClass);
/*     */     } else {
/* 168 */       mv.visitInsn(177);
/* 169 */     }  mv.visitMaxs(0, 0);
/* 170 */     mv.visitEnd();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     mv = cw.visitMethod(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
/* 177 */     mv.visitCode();
/* 178 */     if (this.accs.length == 0) {
/* 179 */       mv.visitFrame(3, 0, null, 0, null);
/* 180 */     } else if (this.accs.length > HASH_LIMIT) {
/* 181 */       mv.visitVarInsn(21, 2);
/* 182 */       Label[] labels = ASMUtil.newLabels(this.accs.length);
/* 183 */       Label defaultLabel = new Label();
/* 184 */       mv.visitTableSwitchInsn(0, labels.length - 1, defaultLabel, labels);
/* 185 */       int i = 0;
/* 186 */       for (Accessor acc : this.accs) {
/* 187 */         mv.visitLabel(labels[i++]);
/* 188 */         mv.visitFrame(3, 0, null, 0, null);
/* 189 */         if (!acc.isReadable()) {
/* 190 */           mv.visitInsn(1);
/* 191 */           mv.visitInsn(176);
/*     */         } else {
/*     */           
/* 194 */           mv.visitVarInsn(25, 1);
/* 195 */           mv.visitTypeInsn(192, this.classNameInternal);
/* 196 */           Type fieldType = Type.getType(acc.getType());
/* 197 */           if (acc.isPublic() || acc.getter == null) {
/* 198 */             mv.visitFieldInsn(180, this.classNameInternal, acc.getName(), fieldType.getDescriptor());
/*     */           } else {
/* 200 */             String sig = Type.getMethodDescriptor(acc.getter);
/* 201 */             mv.visitMethodInsn(182, this.classNameInternal, acc.getter.getName(), sig, false);
/*     */           } 
/* 203 */           ASMUtil.autoBoxing(mv, fieldType);
/* 204 */           mv.visitInsn(176);
/*     */         } 
/* 206 */       }  mv.visitLabel(defaultLabel);
/* 207 */       mv.visitFrame(3, 0, null, 0, null);
/*     */     } else {
/* 209 */       Label[] labels = ASMUtil.newLabels(this.accs.length);
/* 210 */       int i = 0;
/* 211 */       for (Accessor acc : this.accs) {
/* 212 */         ifNotEqJmp(mv, 2, i, labels[i]);
/* 213 */         mv.visitVarInsn(25, 1);
/* 214 */         mv.visitTypeInsn(192, this.classNameInternal);
/* 215 */         Type fieldType = Type.getType(acc.getType());
/* 216 */         if (acc.isPublic() || acc.getter == null) {
/* 217 */           mv.visitFieldInsn(180, this.classNameInternal, acc.getName(), fieldType.getDescriptor());
/*     */         } else {
/* 219 */           if (acc.getter == null)
/* 220 */             throw new RuntimeException("no Getter for field " + acc.getName() + " in class " + this.className); 
/* 221 */           String sig = Type.getMethodDescriptor(acc.getter);
/* 222 */           mv.visitMethodInsn(182, this.classNameInternal, acc.getter.getName(), sig, false);
/*     */         } 
/* 224 */         ASMUtil.autoBoxing(mv, fieldType);
/* 225 */         mv.visitInsn(176);
/*     */         
/* 227 */         mv.visitLabel(labels[i]);
/* 228 */         mv.visitFrame(3, 0, null, 0, null);
/* 229 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 233 */     if (this.exceptionClass != null) {
/* 234 */       throwExIntParam(mv, this.exceptionClass);
/*     */     } else {
/* 236 */       mv.visitInsn(1);
/* 237 */       mv.visitInsn(176);
/*     */     } 
/* 239 */     mv.visitMaxs(0, 0);
/* 240 */     mv.visitEnd();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 247 */     if (!USE_HASH) {
/* 248 */       mv = cw.visitMethod(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
/* 249 */       mv.visitCode();
/*     */       
/* 251 */       Label[] labels = ASMUtil.newLabels(this.accs.length);
/*     */       
/* 253 */       int i = 0;
/* 254 */       for (Accessor acc : this.accs) {
/* 255 */         mv.visitVarInsn(25, 2);
/* 256 */         mv.visitLdcInsn(acc.fieldName);
/* 257 */         mv.visitMethodInsn(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
/* 258 */         mv.visitJumpInsn(153, labels[i]);
/* 259 */         internalSetFiled(mv, acc);
/* 260 */         mv.visitLabel(labels[i]);
/* 261 */         mv.visitFrame(3, 0, null, 0, null);
/* 262 */         i++;
/*     */       } 
/* 264 */       if (this.exceptionClass != null) {
/* 265 */         throwExStrParam(mv, this.exceptionClass);
/*     */       } else {
/* 267 */         mv.visitInsn(177);
/* 268 */       }  mv.visitMaxs(0, 0);
/* 269 */       mv.visitEnd();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 276 */     if (!USE_HASH) {
/* 277 */       mv = cw.visitMethod(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
/* 278 */       mv.visitCode();
/*     */       
/* 280 */       Label[] labels = ASMUtil.newLabels(this.accs.length);
/*     */       
/* 282 */       int i = 0;
/* 283 */       for (Accessor acc : this.accs) {
/* 284 */         mv.visitVarInsn(25, 2);
/* 285 */         mv.visitLdcInsn(acc.fieldName);
/* 286 */         mv.visitMethodInsn(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
/* 287 */         mv.visitJumpInsn(153, labels[i]);
/* 288 */         mv.visitVarInsn(25, 1);
/* 289 */         mv.visitTypeInsn(192, this.classNameInternal);
/* 290 */         Type fieldType = Type.getType(acc.getType());
/* 291 */         if (acc.isPublic() || acc.getter == null) {
/* 292 */           mv.visitFieldInsn(180, this.classNameInternal, acc.getName(), fieldType.getDescriptor());
/*     */         } else {
/* 294 */           String sig = Type.getMethodDescriptor(acc.getter);
/* 295 */           mv.visitMethodInsn(182, this.classNameInternal, acc.getter.getName(), sig, false);
/*     */         } 
/* 297 */         ASMUtil.autoBoxing(mv, fieldType);
/* 298 */         mv.visitInsn(176);
/* 299 */         mv.visitLabel(labels[i]);
/* 300 */         mv.visitFrame(3, 0, null, 0, null);
/* 301 */         i++;
/*     */       } 
/* 303 */       if (this.exceptionClass != null) {
/* 304 */         throwExStrParam(mv, this.exceptionClass);
/*     */       } else {
/* 306 */         mv.visitInsn(1);
/* 307 */         mv.visitInsn(176);
/*     */       } 
/* 309 */       mv.visitMaxs(0, 0);
/* 310 */       mv.visitEnd();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 318 */     mv = cw.visitMethod(1, "newInstance", "()Ljava/lang/Object;", null, null);
/* 319 */     mv.visitCode();
/* 320 */     mv.visitTypeInsn(187, this.classNameInternal);
/* 321 */     mv.visitInsn(89);
/* 322 */     mv.visitMethodInsn(183, this.classNameInternal, "<init>", "()V", false);
/* 323 */     mv.visitInsn(176);
/* 324 */     mv.visitMaxs(2, 1);
/* 325 */     mv.visitEnd();
/*     */     
/* 327 */     cw.visitEnd();
/* 328 */     byte[] data = cw.toByteArray();
/*     */     
/* 330 */     return this.loader.defineClass(this.accessClassName, data);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void dumpDebug(byte[] data, String destFile) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void internalSetFiled(MethodVisitor mv, Accessor acc) {
/* 365 */     mv.visitVarInsn(25, 1);
/* 366 */     mv.visitTypeInsn(192, this.classNameInternal);
/*     */     
/* 368 */     mv.visitVarInsn(25, 3);
/* 369 */     Type fieldType = Type.getType(acc.getType());
/* 370 */     Class<?> type = acc.getType();
/* 371 */     String destClsName = Type.getInternalName(type);
/*     */     
/* 373 */     Method conMtd = this.convMtds.get(type);
/* 374 */     if (conMtd != null) {
/*     */       
/* 376 */       String clsSig = Type.getInternalName(conMtd.getDeclaringClass());
/* 377 */       String mtdName = conMtd.getName();
/* 378 */       String mtdSig = Type.getMethodDescriptor(conMtd);
/* 379 */       mv.visitMethodInsn(184, clsSig, mtdName, mtdSig, false);
/* 380 */     } else if (acc.isEnum()) {
/*     */       
/* 382 */       Label isNull = new Label();
/* 383 */       mv.visitJumpInsn(198, isNull);
/* 384 */       mv.visitVarInsn(25, 3);
/*     */       
/* 386 */       mv.visitMethodInsn(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
/* 387 */       mv.visitMethodInsn(184, destClsName, "valueOf", "(Ljava/lang/String;)L" + destClsName + ";", false);
/* 388 */       mv.visitVarInsn(58, 3);
/* 389 */       mv.visitLabel(isNull);
/* 390 */       mv.visitFrame(3, 0, null, 0, null);
/* 391 */       mv.visitVarInsn(25, 1);
/* 392 */       mv.visitTypeInsn(192, this.classNameInternal);
/* 393 */       mv.visitVarInsn(25, 3);
/* 394 */       mv.visitTypeInsn(192, destClsName);
/* 395 */     } else if (type.equals(String.class)) {
/*     */       
/* 397 */       Label isNull = new Label();
/* 398 */       mv.visitJumpInsn(198, isNull);
/* 399 */       mv.visitVarInsn(25, 3);
/* 400 */       mv.visitMethodInsn(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
/* 401 */       mv.visitVarInsn(58, 3);
/* 402 */       mv.visitLabel(isNull);
/* 403 */       mv.visitFrame(3, 0, null, 0, null);
/* 404 */       mv.visitVarInsn(25, 1);
/* 405 */       mv.visitTypeInsn(192, this.classNameInternal);
/* 406 */       mv.visitVarInsn(25, 3);
/* 407 */       mv.visitTypeInsn(192, destClsName);
/*     */     } else {
/*     */       
/* 410 */       mv.visitTypeInsn(192, destClsName);
/*     */     } 
/* 412 */     if (acc.isPublic() || acc.setter == null) {
/* 413 */       mv.visitFieldInsn(181, this.classNameInternal, acc.getName(), fieldType.getDescriptor());
/*     */     } else {
/* 415 */       String sig = Type.getMethodDescriptor(acc.setter);
/* 416 */       mv.visitMethodInsn(182, this.classNameInternal, acc.setter.getName(), sig, false);
/*     */     } 
/* 418 */     mv.visitInsn(177);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void throwExIntParam(MethodVisitor mv, Class<?> exCls) {
/* 425 */     String exSig = Type.getInternalName(exCls);
/* 426 */     mv.visitTypeInsn(187, exSig);
/* 427 */     mv.visitInsn(89);
/* 428 */     mv.visitLdcInsn("mapping " + this.className + " failed to map field:");
/* 429 */     mv.visitVarInsn(21, 2);
/* 430 */     mv.visitMethodInsn(184, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
/* 431 */     mv.visitMethodInsn(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
/* 432 */     mv.visitMethodInsn(183, exSig, "<init>", "(Ljava/lang/String;)V", false);
/* 433 */     mv.visitInsn(191);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void throwExStrParam(MethodVisitor mv, Class<?> exCls) {
/* 440 */     String exSig = Type.getInternalName(exCls);
/* 441 */     mv.visitTypeInsn(187, exSig);
/* 442 */     mv.visitInsn(89);
/* 443 */     mv.visitLdcInsn("mapping " + this.className + " failed to map field:");
/* 444 */     mv.visitVarInsn(25, 2);
/* 445 */     mv.visitMethodInsn(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
/* 446 */     mv.visitMethodInsn(183, exSig, "<init>", "(Ljava/lang/String;)V", false);
/* 447 */     mv.visitInsn(191);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void ifNotEqJmp(MethodVisitor mv, int param, int value, Label label) {
/* 454 */     mv.visitVarInsn(21, param);
/* 455 */     if (value == 0) {
/*     */       
/* 457 */       mv.visitJumpInsn(154, label);
/* 458 */     } else if (value == 1) {
/* 459 */       mv.visitInsn(4);
/* 460 */       mv.visitJumpInsn(160, label);
/* 461 */     } else if (value == 2) {
/* 462 */       mv.visitInsn(5);
/* 463 */       mv.visitJumpInsn(160, label);
/* 464 */     } else if (value == 3) {
/* 465 */       mv.visitInsn(6);
/* 466 */       mv.visitJumpInsn(160, label);
/* 467 */     } else if (value == 4) {
/* 468 */       mv.visitInsn(7);
/* 469 */       mv.visitJumpInsn(160, label);
/* 470 */     } else if (value == 5) {
/* 471 */       mv.visitInsn(8);
/* 472 */       mv.visitJumpInsn(160, label);
/* 473 */     } else if (value >= 6) {
/* 474 */       mv.visitIntInsn(16, value);
/* 475 */       mv.visitJumpInsn(160, label);
/*     */     } else {
/* 477 */       throw new RuntimeException("non supported negative values");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\BeansAccessBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */