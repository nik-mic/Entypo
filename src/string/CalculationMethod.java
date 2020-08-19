package string;

import info.debatty.java.stringsimilarity.interfaces.StringSimilarity;
import lombok.Data;

@Data
public abstract class CalculationMethod{
    double compareValue;
    StringSimilarity algorithm;
}

