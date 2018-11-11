package statix.support.lottie.model.content;


import android.support.annotation.Nullable;

import statix.support.lottie.LottieDrawable;
import statix.support.lottie.animation.content.Content;
import statix.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
