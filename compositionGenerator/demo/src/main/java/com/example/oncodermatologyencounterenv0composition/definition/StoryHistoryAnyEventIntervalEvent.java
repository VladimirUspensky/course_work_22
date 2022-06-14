package com.example.oncodermatologyencounterenv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Long;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-05-21T16:47:30.349572+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.20.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class StoryHistoryAnyEventIntervalEvent implements IntervalEventEntity, StoryHistoryAnyEventChoice {
  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/Do you have a history of psoriasis?
   * Description: Narrative description of the story or clinical history for the subject of care.
   */
  @Path("/data[at0003]/items[at0004 and name/value='Do you have a history of psoriasis?']")
  private List<StoryHistoryDoYouHaveAHistoryOfPsoriasisElement> doYouHaveAHistoryOfPsoriasis;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/When did the lesion appear?
   * Description: Narrative description of the story or clinical history for the subject of care.
   */
  @Path("/data[at0003]/items[at0004 and name/value='When did the lesion appear?']")
  private List<StoryHistoryWhenDidTheLesionAppearElement> whenDidTheLesionAppear;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/Structured detail
   * Description: Structured detail about the individual's story or patient's history.
   * Comment: For example: a specific symptom such as nausea or pain; an event such as a fall off a bicycle; or an issue such as a desire to quit using tobacco.
   */
  @Path("/data[at0003]/items[at0006]")
  private List<Cluster> structuredDetail;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: Onco-dermatology encounter.v0/Anamnesis/Story/History/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setDoYouHaveAHistoryOfPsoriasis(
      List<StoryHistoryDoYouHaveAHistoryOfPsoriasisElement> doYouHaveAHistoryOfPsoriasis) {
     this.doYouHaveAHistoryOfPsoriasis = doYouHaveAHistoryOfPsoriasis;
  }

  public List<StoryHistoryDoYouHaveAHistoryOfPsoriasisElement> getDoYouHaveAHistoryOfPsoriasis() {
     return this.doYouHaveAHistoryOfPsoriasis ;
  }

  public void setWhenDidTheLesionAppear(
      List<StoryHistoryWhenDidTheLesionAppearElement> whenDidTheLesionAppear) {
     this.whenDidTheLesionAppear = whenDidTheLesionAppear;
  }

  public List<StoryHistoryWhenDidTheLesionAppearElement> getWhenDidTheLesionAppear() {
     return this.whenDidTheLesionAppear ;
  }

  public void setStructuredDetail(List<Cluster> structuredDetail) {
     this.structuredDetail = structuredDetail;
  }

  public List<Cluster> getStructuredDetail() {
     return this.structuredDetail ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
