import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship r;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();

	public ObjectManager(Rocketship r) {
		this.r = r;
	}

	void update() {
		r.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
	}

	void draw(Graphics g) {
		r.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}
}
