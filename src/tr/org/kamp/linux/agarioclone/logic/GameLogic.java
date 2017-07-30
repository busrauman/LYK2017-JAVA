package tr.org.kamp.linux.agarioclone.logic;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import tr.org.kamp.linux.agarioclone.model.Chip;
import tr.org.kamp.linux.agarioclone.model.GameObject;
import tr.org.kamp.linux.agarioclone.model.Player;
import tr.org.kamp.linux.agarioclone.view.GameFrame;
import tr.org.kamp.linux.agarioclone.view.GamePanel;

public class GameLogic {
	
	private boolean isGameRunning;
	private int xTarget;
	private int yTarget;
	
	private Player player;
	private ArrayList<GameObject> gameObjects;
	
	private GameFrame gameFrame;
	private GamePanel gamePanel;
	
	private Random random;
	
	public GameLogic() {
		player = new Player(10, 10, 20, 3, Color.BLUE);
		gameObjects = new ArrayList<GameObject>();
		gameObjects.add(player);
		
		gameFrame = new GameFrame();
		gamePanel = new GamePanel(gameObjects);
		
		random = new Random();
		
		fillChips(10);
		
		addMouseEvents();
	}
	
	private void checkCollisions() {
		
		ArrayList<GameObject> objectsToRemove = new ArrayList<GameObject>();
		
		for (GameObject gameObject : gameObjects) {
			if(player.getRectangle().intersects(gameObject.getRectangle())) {
				if(gameObject instanceof Chip) {
					player.setRadius(player.getRadius() + gameObject.getRadius());
//					gameObjects.remove(gameObject);
					objectsToRemove.add(gameObject);
				}
			}
		}
		
		// Loop is complete, remove objects from the list
		gameObjects.removeAll(objectsToRemove);
		fillChips(objectsToRemove.size());
	}
	
	private void movePlayer() {
		if(xTarget > player.getX()) {
			player.setX(player.getX() + player.getSpeed());
		} else if(xTarget < player.getX()) {
			player.setX(player.getX() - player.getSpeed());
		}
		
		if(yTarget > player.getY()) {
			player.setY(player.getY() + player.getSpeed());
		} else if(yTarget < player.getY()) {
			player.setY(player.getY() - player.getSpeed());
		}
	}
	
	private void fillChips(int n) {
		for(int i = 0; i < n; i++) {
			gameObjects.add(new Chip(random.nextInt(1000),
					random.nextInt(1000), 10, Color.ORANGE));
		} 
	}
	
	private void startGame() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(isGameRunning) {
					movePlayer();
					checkCollisions();
					gamePanel.repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	public void startApplication() {
		gameFrame.setContentPane(gamePanel);
		gameFrame.setVisible(true);
		isGameRunning = true;
		startGame();
	}
	
	private void addMouseEvents() {
		gameFrame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		gamePanel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				xTarget = e.getX();
				yTarget = e.getY();
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				
			}
		});
	}

}
