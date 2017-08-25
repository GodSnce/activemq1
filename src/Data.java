import java.io.Serializable;

/**
 * Created by lishanglai on 2017/8/23.
 */
public class Data implements Serializable {

    private String name;
    private String idfa;
    private String media;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
