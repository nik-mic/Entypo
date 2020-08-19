package context;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class EntypoModule implements Writer, Reader {
    private final String ADDRESS;

    public abstract void entypo();
}
