import java.awt.Color;
import java.awt.Graphics;

public class ObjectManager {
	Rocketship r;

	public ObjectManager(Rocketship r) {
		this.r = r;
	}

	void update() {
		r.update();
	}

	void draw(Graphics g) {
		r.draw(g);
	}
}