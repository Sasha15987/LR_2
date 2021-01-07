import java.io.Serializable;
import com.badlogic.gdx.graphics.Texture;


public final class Tile implements Comparable, Serializable {
    private String name;
    private float x;
    private float y;
    private Texture texture;

    public Tile(String name, float x, float y, Texture texture) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Texture getTexture() {
        return texture;
    }

    public boolean equals(Tile tile) {
        return (this == tile);
    }

    public Tile clone(Tile tile) {
        return new Tile(tile.name, tile.x, tile.y, tile.texture);
    }

    @Override
    public int hashCode() {
        int seed = 72;
        return seed * seed * name.hashCode() + x + y + texture.hashCode();
    }

    @Override
    public String toString() {
        return name + " " + x + " " + y + " " + texture.hashCode ();
    }

    @Override
    public int compareTo(Object comparable) {
        Tile tile = (Tile) comparable;
        if(tile.equals(this)) return 1;
        return 0;
    }
}
