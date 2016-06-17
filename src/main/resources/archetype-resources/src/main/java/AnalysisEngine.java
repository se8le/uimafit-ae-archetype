package org.apache.uima;

import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.util.Level;

public class AnalysisEngine extends JCasAnnotator_ImplBase {

  @ConfigurationParameter(name = "exampleParameter", defaultValue = "foobar")
  private String exampleParameter;

  @Override
  public void process(JCas jCas) throws AnalysisEngineProcessException {
	this.getContext().getLogger().log(Level.INFO, "Hi, I'm the annotator!");
    Annotation annotation = new Annotation(jCas);
    annotation.setBegin(0);
    annotation.setEnd(jCas.getDocumentText().length());
    jCas.addFsToIndexes(annotation);
  }

}