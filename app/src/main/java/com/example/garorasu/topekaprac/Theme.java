package com.example.garorasu.topekaprac;

/**
 * Created by garorasu on 1/12/16.
 */

import android.support.annotation.ColorRes;
import android.support.annotation.StyleRes;

/**
 * A way to make simple changes to the application's appearance at runtime in correlation to its
 * {@link com.example.garorasu.topekaprac.CategorySelection.Category}.
 *
 * Usually this should be done via attributes and {@link android.view.ContextThemeWrapper}s.
 * In one case in Topeka it is more performant to work like this.
 * This case involves a trade-off between statically loading these themes versus inflation
 * in an adapter backed view without recycling.
 */
public enum Theme {
    topeka(R.color.topeka_primary, R.color.topeka_primary_dark,
            R.color.theme_blue_background, R.color.theme_blue_text,
            R.color.topeka_accent, R.style.Topeka),
    blue(R.color.theme_blue_primary, R.color.theme_blue_primary_dark,
            R.color.theme_blue_background, R.color.theme_blue_text,
            R.color.theme_blue_accent, R.style.Topeka_Blue),
    green(R.color.theme_green_primary, R.color.theme_green_primary_dark,
            R.color.theme_green_background, R.color.theme_green_text,
            R.color.theme_green_accent, R.style.Topeka_Green),
    purple(R.color.theme_purple_primary, R.color.theme_purple_primary_dark,
            R.color.theme_purple_background, R.color.theme_purple_text,
            R.color.theme_purple_accent, R.style.Topeka_Purple),
    red(R.color.theme_red_primary, R.color.theme_red_primary_dark,
            R.color.theme_red_background, R.color.theme_red_text,
            R.color.theme_red_accent, R.style.Topeka_Red),
    yellow(R.color.theme_yellow_primary, R.color.theme_yellow_primary_dark,
            R.color.theme_yellow_background, R.color.theme_yellow_text,
            R.color.theme_yellow_accent, R.style.Topeka_Yellow);

    private final int mColorPrimaryId;
    private final int mWindowBackgroundColorId;
    private final int mColorPrimaryDarkId;
    private final int mTextColorPrimaryId;
    private final int mAccentColorId;
    private final int mStyleId;

    Theme(final int colorPrimaryId, final int colorPrimaryDarkId,
          final int windowBackgroundColorId, final int textColorPrimaryId,
          final int accentColorId, final int styleId) {
        mColorPrimaryId = colorPrimaryId;
        mWindowBackgroundColorId = windowBackgroundColorId;
        mColorPrimaryDarkId = colorPrimaryDarkId;
        mTextColorPrimaryId = textColorPrimaryId;
        mAccentColorId = accentColorId;
        mStyleId = styleId;
    }

    @ColorRes
    public int getTextPrimaryColor() {
        return mTextColorPrimaryId;
    }

    @ColorRes
    public int getWindowBackgroundColor() {
        return mWindowBackgroundColorId;
    }

    @ColorRes
    public int getPrimaryColor() {
        return mColorPrimaryId;
    }

    @ColorRes
    public int getAccentColor() {
        return mAccentColorId;
    }

    @ColorRes
    public int getPrimaryDarkColor() {
        return mColorPrimaryDarkId;
    }

    @StyleRes
    public int getStyleId() {
        return mStyleId;
    }
}
