package statix.support.lottie.model.content;

import android.graphics.Path;
import android.support.annotation.Nullable;

import statix.support.lottie.LottieDrawable;
import statix.support.lottie.animation.content.Content;
import statix.support.lottie.animation.content.GradientFillContent;
import statix.support.lottie.model.animatable.AnimatableFloatValue;
import statix.support.lottie.model.animatable.AnimatableGradientColorValue;
import statix.support.lottie.model.animatable.AnimatableIntegerValue;
import statix.support.lottie.model.animatable.AnimatablePointValue;
import statix.support.lottie.model.layer.BaseLayer;

public class GradientFill implements ContentModel {

  private final GradientType gradientType;
  private final Path.FillType fillType;
  private final AnimatableGradientColorValue gradientColor;
  private final AnimatableIntegerValue opacity;
  private final AnimatablePointValue startPoint;
  private final AnimatablePointValue endPoint;
  private final String name;
  @Nullable private final AnimatableFloatValue highlightLength;
  @Nullable private final AnimatableFloatValue highlightAngle;

  public GradientFill(String name, GradientType gradientType, Path.FillType fillType,
      AnimatableGradientColorValue gradientColor,
      AnimatableIntegerValue opacity, AnimatablePointValue startPoint,
      AnimatablePointValue endPoint, AnimatableFloatValue highlightLength,
      AnimatableFloatValue highlightAngle) {
    this.gradientType = gradientType;
    this.fillType = fillType;
    this.gradientColor = gradientColor;
    this.opacity = opacity;
    this.startPoint = startPoint;
    this.endPoint = endPoint;
    this.name = name;
    this.highlightLength = highlightLength;
    this.highlightAngle = highlightAngle;
  }

  public String getName() {
    return name;
  }

  public GradientType getGradientType() {
    return gradientType;
  }

  public Path.FillType getFillType() {
    return fillType;
  }

  public AnimatableGradientColorValue getGradientColor() {
    return gradientColor;
  }

  public AnimatableIntegerValue getOpacity() {
    return opacity;
  }

  public AnimatablePointValue getStartPoint() {
    return startPoint;
  }

  public AnimatablePointValue getEndPoint() {
    return endPoint;
  }

  @Nullable AnimatableFloatValue getHighlightLength() {
    return highlightLength;
  }

  @Nullable AnimatableFloatValue getHighlightAngle() {
    return highlightAngle;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new GradientFillContent(drawable, layer, this);
  }

}