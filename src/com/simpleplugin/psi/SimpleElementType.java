package com.simpleplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.simpleplugin.SimpleLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by menuka on 3/24/17.
 */
public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}
