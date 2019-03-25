import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship r;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	Alien a;
	//enemyTimer = 0;

	public ObjectManager(Rocketship r) {
		this.r = r;
	}

	void update() {
		r.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
			a.update();
		}
	}

	void draw(Graphics g) {
		r.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
			a.draw(g);
		}
	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	void addAlien(Alien a) {
		aliens.add(a);
	}

	void manageEnemies() {
	//	if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
	//		addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));
//
	//		enemyTimer = System.currentTimeMillis();
		}
	}
//}
