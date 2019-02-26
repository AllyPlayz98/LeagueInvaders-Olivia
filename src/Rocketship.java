import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 5;
	}

	void update() {

	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(x, y, width, height);
	}

}
