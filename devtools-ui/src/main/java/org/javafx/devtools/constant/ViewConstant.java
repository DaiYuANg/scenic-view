package org.javafx.devtools.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ViewConstant {

  MAIN_LAYOUT("MainLayout"),

  ATTACH_DIALOG("dialog/Attach"),

  ABOUT_DIALOG("dialog/About");

  private final String viewName;
}