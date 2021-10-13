package com.sean.jvmtest.bytecodetest.asmtest;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * @Author: sean
 * @Date: 2021/9/10 17:49
 */
public class AddSecurityCheckMethodAdapter extends MethodVisitor {
    public AddSecurityCheckMethodAdapter(MethodVisitor mv) {
        super(Opcodes.ASM5, mv);
    }

    @Override
    public void visitCode() {
        Label continueLabel = new Label();
        visitMethodInsn(Opcodes.INVOKEDYNAMIC, "com/sean/jvmtest/bytecodetest/asmtest/SecurityChecker", "checkSecurity", "()Z", true);
        visitJumpInsn(Opcodes.IFNE, continueLabel);
        visitInsn(Opcodes.RETURN);
        visitLabel(continueLabel);
        super.visitCode();
    }
}
