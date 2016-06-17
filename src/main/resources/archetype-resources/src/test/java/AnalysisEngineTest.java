package org.apache.uima;

import static org.apache.uima.fit.pipeline.SimplePipeline.runPipeline;

import java.io.IOException;

import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.junit.Test;

public class AnalysisEngineTest {

    @Test
    public void test() throws IOException, UIMAException {
    	JCas jCas = JCasFactory.createJCas();
    	jCas.setDocumentText("This is an example document.");
    	runPipeline(jCas, AnalysisEngineFactory.createEngineDescription(AnalysisEngine.class));
    }
    
}