package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PakListener implements KeyListener {
	private PakRobot pak;
	private boolean walking;
	
	public PakListener(PakRobot pak) {
		this.pak = pak;
		walking = false;
	}
	
	/**
	 * Method called by the javax API when we pressed a key. It will change the speed/direction of our robot (aka Player).
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyChar() == 'z') {
			if (!walking) {
				pak.updateSpeed(2.5);
				walking = true;
			}
			pak.changeDirection(Math.PI);
		} else if (e.getKeyChar() == 's') {
			pak.changeDirection(Math.PI);
		} else if (e.getKeyChar() == 'q') {
			pak.changeDirection(Math.PI / 2);
		} else if (e.getKeyChar() == 'd') {
			pak.changeDirection(-(Math.PI / 2));
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}