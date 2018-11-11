package statix.support.lottie.model.animatable;

import android.graphics.Path;

import statix.support.lottie.value.Keyframe;
import statix.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import statix.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import statix.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
