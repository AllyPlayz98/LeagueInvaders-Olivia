import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship r;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	Alien a;
	long enemyTimer = 0;
	int enemySpawnTime = 3000;
	int score = 0;

	public ObjectManager(Rocketship r) {
		this.r = r;
		this.score = score;
	}

	void update() {
		r.update();
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		for (int j = 0; j < aliens.size(); j++) {
			aliens.get(j).update();
		}
	}

	void draw(Graphics g) {
		r.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
		for (int j = 0; j < aliens.size(); j++) {
			aliens.get(j).draw(g);
		}
	}

	void addProjectile(Projectile p) {
		projectiles.add(p);
	}

	void addAlien(Alien a) {
		aliens.add(a);
	}

	void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	void purgeObjects() {
		for (int i = 0; i < projectiles.size(); i++) {
			if (projectiles.get(i).isAlive == false) {
				projectiles.remove(i);
			}
		}
		for (int j = 0; j < aliens.size(); j++) {
			if (aliens.get(j).isAlive == false) {
				aliens.remove(j);
				score++;
				getScore();
			}

		}
	}

	void checkCollision() {
		for (Alien a : aliens) {

			if (r.collisionBox.intersects(a.collisionBox)) {

				r.isAlive = false;
				break;
			}

			for (Projectile p : projectiles) {
				if (a.collisionBox.intersects(p.collisionBox)) {
					a.isAlive = false;
				}
			}
		}

	}

	public int getScore() {
		return score;
	}

}
