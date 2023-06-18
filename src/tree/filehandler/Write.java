package tree.filehandler;

import java.io.Serializable;

public interface Write {
    boolean writeSomething(Serializable serializable, String path);

    Object loadSomething(String path);

}
