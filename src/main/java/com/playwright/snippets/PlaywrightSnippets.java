package com.playwright.snippets;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class PlaywrightSnippets extends TemplateContextType {

    protected PlaywrightSnippets() {
        super("PS", "PlaywrightSnippets");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String name = templateActionContext.getFile().getName();
        return name.endsWith(".js") || name.endsWith(".ts");
    }
    
}
