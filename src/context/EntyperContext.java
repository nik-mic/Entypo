package context;

import lombok.AllArgsConstructor;
import source.SourceType;
import string.CalculationMethod;

@AllArgsConstructor
public abstract class EntyperContext {
    private final EntypoModule module;
    private final SourceType source;
    private final CalculationMethod method;
}
