// Generated code from Butter Knife. Do not modify!
package com.vomont.lz_zhangxun.video;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ShowPicActivity$$ViewBinder<T extends com.vomont.lz_zhangxun.video.ShowPicActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296437, "field 'viewpager'");
    target.viewpager = finder.castView(view, 2131296437, "field 'viewpager'");
    view = finder.findRequiredView(source, 2131296353, "field 'top_back'");
    target.top_back = finder.castView(view, 2131296353, "field 'top_back'");
    view = finder.findRequiredView(source, 2131296354, "field 'top_name'");
    target.top_name = finder.castView(view, 2131296354, "field 'top_name'");
  }

  @Override public void unbind(T target) {
    target.viewpager = null;
    target.top_back = null;
    target.top_name = null;
  }
}
