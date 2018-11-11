package statix.support.lottie.model.animatable;

import statix.support.lottie.value.Keyframe;
import statix.support.lottie.animation.keyframe.TextKeyframeAnimation;
import statix.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
