package MyTestingProject;

import MyTestingProject.Modelo.MyRandom;

public class MyRandomMock extends MyRandom {
	
	private boolean random;
	
	public MyRandomMock() {
		this.random = false;
	}
	
	@Override
	public boolean getRandom() {
		return this.random;
	}
	
	public int[][] getMatrix(int c) {
		switch(c) {
		case 0:
			// matrix to test cases of the scenario 1 and 2
			return new int[][] {{0, 1, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 1},
								{0, 1, 1, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 1, 0},
								{0, 0, 0, 0, 1, 0, 1, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 1, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 1, 0, 0, 1, 0}};
		case 1:
			// matrix to test cases of the scenario 2
			return new int[][] {{1, 1, 1, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 1, 1, 1, 0, 0, 0, 0},
								{0, 1, 0, 1, 0, 0, 0, 0},
								{0, 1, 1, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0}};
		case 2:
			// matrix to test cases of the scenario 2
			return new int[][] {{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 1, 1, 1, 0, 0, 0, 0},
								{0, 1, 0, 1, 0, 0, 0, 0},
								{0, 1, 1, 1, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 0, 0},
								{0, 0, 0, 0, 0, 0, 1, 1}};

		case 3:
			return new int[][] {{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9}};
		default:
			return new int[][] {{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9},
								{9, 9, 9, 9, 9, 9, 9, 9}};
		}
	}
}
