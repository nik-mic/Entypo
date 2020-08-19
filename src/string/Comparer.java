package string;

import info.debatty.java.stringsimilarity.interfaces.NormalizedStringSimilarity;
import info.debatty.java.stringsimilarity.interfaces.StringSimilarity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Comparer {
    CalculationMethod method;
    String decide(String oldContent, String newContent){
        return method.getAlgorithm().similarity(oldContent, newContent)>=method.getCompareValue() ? oldContent : newContent;
    }
}
