package source;

public interface Sourceable {
    boolean contains(SourceEntity content);
    SourceEntity get(int index);
    SourceEntity getCorrection(SourceEntity wrong);
}
