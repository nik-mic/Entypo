package active;

import context.EntyperContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Entyper {
    private final EntyperContext TARGET;

    private void clean(){

    }
}
